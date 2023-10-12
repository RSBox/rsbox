import java.io.IOException;
import java.io.OutputStream;

public class class224 implements Runnable {
	boolean field1471;
	byte[] field1464;
	int field1466;
	int field1467;
	int field1468;
	IOException field1470;
	OutputStream field1469;
	Thread field1465;

	class224(OutputStream var1, int var2) {
		this.field1466 = 0;
		this.field1468 = 0;
		this.field1469 = var1;
		this.field1467 = var2 + 1;
		this.field1464 = new byte[this.field1467];
		this.field1465 = new Thread(this);
		this.field1465.setDaemon(true);
		this.field1465.start();
	}

	boolean method1023() {
		if (this.field1471) {
			try {
				this.field1469.close();
				if (null == this.field1470) {
					this.field1470 = new IOException("");
				}
			} catch (IOException var3) {
				if (this.field1470 == null) {
					this.field1470 = new IOException(var3);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@Override
	public void run() {
		do {
			int var1;
			synchronized(this) {
				while (true) {
					if (null != this.field1470) {
						return;
					}

					if (this.field1466 <= this.field1468) {
						var1 = this.field1468 - this.field1466;
					} else {
						var1 = this.field1467 - this.field1466 + this.field1468;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.field1469.flush();
					} catch (IOException var10) {
						this.field1470 = var10;
						return;
					}

					if (this.method1023()) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}

			try {
				if (var1 + this.field1466 <= this.field1467) {
					this.field1469.write(this.field1464, this.field1466, var1);
				} else {
					int var13 = this.field1467 - this.field1466;
					this.field1469.write(this.field1464, this.field1466, var13);
					this.field1469.write(this.field1464, 0, var1 - var13);
				}
			} catch (IOException var9) {
				IOException var2 = var9;
				synchronized(this) {
					this.field1470 = var2;
					return;
				}
			}

			synchronized(this) {
				this.field1466 = (var1 + this.field1466) % this.field1467;
			}
		} while(!this.method1023());

	}

	void method1024(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var3 + 0 <= var1.length) {
			synchronized(this) {
				if (null != this.field1470) {
					throw new IOException(this.field1470.toString());
				} else {
					int var6;
					if (this.field1466 <= this.field1468) {
						var6 = this.field1467 - this.field1468 + this.field1466 - 1;
					} else {
						var6 = this.field1466 - this.field1468 - 1;
					}

					if (var6 < var3) {
						throw new IOException("");
					} else {
						if (var3 + this.field1468 <= this.field1467) {
							System.arraycopy(var1, 0, this.field1464, this.field1468, var3);
						} else {
							int var7 = this.field1467 - this.field1468;
							System.arraycopy(var1, 0, this.field1464, this.field1468, var7);
							System.arraycopy(var1, var7 + 0, this.field1464, 0, var3 - var7);
						}

						this.field1468 = (this.field1468 + var3) % this.field1467;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	void method1022() {
		synchronized(this) {
			this.field1471 = true;
			this.notifyAll();
		}

		try {
			this.field1465.join();
		} catch (InterruptedException var4) {
		}

	}
}
