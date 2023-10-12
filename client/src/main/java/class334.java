import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class334 implements Runnable {
	byte[] field2365;
	int field2363;
	int field2366;
	int field2367;
	IOException field2362;
	InputStream field2364;
	Thread field2368;

	class334(InputStream var1, int var2) {
		this.field2363 = 0;
		this.field2367 = 0;
		this.field2364 = var1;
		this.field2366 = var2 + 1;
		this.field2365 = new byte[this.field2366];
		this.field2368 = new Thread(this);
		this.field2368.setDaemon(true);
		this.field2368.start();
	}

	@Override
	public void run() {
		while (true) {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.field2362 != null) {
						return;
					}

					if (this.field2363 == 0) {
						var1 = this.field2366 - this.field2367 - 1;
					} else if (this.field2363 <= this.field2367) {
						var1 = this.field2366 - this.field2367;
					} else {
						var1 = this.field2363 - this.field2367 - 1;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var9) {
					}
				}
			}

			int var2;
			try {
				var2 = this.field2364.read(this.field2365, this.field2367, var1);
				if (var2 == -1) {
					throw new EOFException();
				}
			} catch (IOException var10) {
				IOException var3 = var10;
				synchronized(this) {
					this.field2362 = var3;
					return;
				}
			}

			synchronized(this) {
				this.field2367 = (var2 + this.field2367) % this.field2366;
			}
		}
	}

	boolean method1599(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.field2366) {
			synchronized(this) {
				int var4;
				if (this.field2363 <= this.field2367) {
					var4 = this.field2367 - this.field2363;
				} else {
					var4 = this.field2367 + (this.field2366 - this.field2363);
				}

				if (var4 < var1) {
					if (this.field2362 != null) {
						throw new IOException(this.field2362.toString());
					} else {
						this.notifyAll();
						return false;
					}
				} else {
					return true;
				}
			}
		} else {
			throw new IOException();
		}
	}

	int method1602() throws IOException {
		synchronized(this) {
			int var3;
			if (this.field2363 <= this.field2367) {
				var3 = this.field2367 - this.field2363;
			} else {
				var3 = this.field2366 - this.field2363 + this.field2367;
			}

			if (var3 <= 0 && null != this.field2362) {
				throw new IOException(this.field2362.toString());
			} else {
				this.notifyAll();
				return var3;
			}
		}
	}

	int method1603() throws IOException {
		synchronized(this) {
			if (this.field2363 == this.field2367) {
				if (this.field2362 != null) {
					throw new IOException(this.field2362.toString());
				} else {
					return -1;
				}
			} else {
				int var3 = this.field2365[this.field2363] & 255;
				this.field2363 = (this.field2363 + 1) % this.field2366;
				this.notifyAll();
				return var3;
			}
		}
	}

	int method1601(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				int var6;
				if (this.field2363 <= this.field2367) {
					var6 = this.field2367 - this.field2363;
				} else {
					var6 = this.field2367 + (this.field2366 - this.field2363);
				}

				if (var3 > var6) {
					var3 = var6;
				}

				if (var3 == 0 && this.field2362 != null) {
					throw new IOException(this.field2362.toString());
				} else {
					if (var3 + this.field2363 <= this.field2366) {
						System.arraycopy(this.field2365, this.field2363, var1, var2, var3);
					} else {
						int var7 = this.field2366 - this.field2363;
						System.arraycopy(this.field2365, this.field2363, var1, var2, var7);
						System.arraycopy(this.field2365, 0, var1, var2 + var7, var3 - var7);
					}

					this.field2363 = (this.field2363 + var3) % this.field2366;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	void method1600() {
		synchronized(this) {
			if (null == this.field2362) {
				this.field2362 = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.field2368.join();
		} catch (InterruptedException var4) {
		}

	}
}
