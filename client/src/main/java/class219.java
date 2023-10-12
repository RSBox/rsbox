import java.io.EOFException;
import java.io.IOException;

public class class219 {
	byte[] field1433;
	byte[] field1435;
	class356 field1432;
	int field1431;
	int field1434;
	long field1436;
	long field1437;
	long field1438;
	long field1439;
	long field1440;
	long field1441;

	public class219(class356 var1, int var2, int var3) throws IOException {
		this.field1441 = -1L;
		this.field1436 = -1L;
		this.field1431 = 0;
		this.field1432 = var1;
		this.field1439 = this.field1437 = var1.method1710();
		this.field1433 = new byte[var2];
		this.field1435 = new byte[var3];
		this.field1438 = 0L;
	}

	public void method1009() throws IOException {
		this.method1014();
		this.field1432.method1708();
	}

	public void method1010(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			this.field1438 = var1;
		}
	}

	public long method1011() {
		return this.field1439;
	}

	public void method1012(byte[] var1) throws IOException {
		this.method1015(var1, 0, var1.length);
	}

	public void method1015(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var3 + 0 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var3 + 0 - var1.length);
			}

			if (this.field1436 != -1L && this.field1438 >= this.field1436 && this.field1438 + (long)var3 <= this.field1436 + (long)this.field1431) {
				System.arraycopy(this.field1435, (int)(this.field1438 - this.field1436), var1, 0, var3);
				this.field1438 += (long)var3;
				return;
			}

			long var5 = this.field1438;
			boolean var7 = false;
			int var8 = var3;
			int var9;
			if (this.field1438 >= this.field1441 && this.field1438 < this.field1441 + (long)this.field1434) {
				var9 = (int)((long)this.field1434 - (this.field1438 - this.field1441));
				if (var9 > var3) {
					var9 = var3;
				}

				System.arraycopy(this.field1433, (int)(this.field1438 - this.field1441), var1, 0, var9);
				this.field1438 += (long)var9;
				var2 = 0 + var9;
				var3 -= var9;
			}

			if (var3 > this.field1433.length) {
				this.field1432.method1706(this.field1438);

				for (this.field1440 = this.field1438; var3 > 0; var3 -= var9) {
					var9 = this.field1432.method1711(var1, var2, var3);
					if (var9 == -1) {
						break;
					}

					this.field1440 += (long)var9;
					this.field1438 += (long)var9;
					var2 += var9;
				}
			} else if (var3 > 0) {
				this.method1008();
				var9 = var3;
				if (var3 > this.field1434) {
					var9 = this.field1434;
				}

				System.arraycopy(this.field1433, 0, var1, var2, var9);
				var2 += var9;
				var3 -= var9;
				this.field1438 += (long)var9;
			}

			if (-1L != this.field1436) {
				if (this.field1436 > this.field1438 && var3 > 0) {
					var9 = (int)(this.field1436 - this.field1438) + var2;
					if (var9 > var3 + var2) {
						var9 = var2 + var3;
					}

					while (var2 < var9) {
						var1[var2++] = 0;
						--var3;
						++this.field1438;
					}
				}

				long var15 = -1L;
				long var11 = -1L;
				if (this.field1436 >= var5 && this.field1436 < var5 + (long)var8) {
					var15 = this.field1436;
				} else if (var5 >= this.field1436 && var5 < this.field1436 + (long)this.field1431) {
					var15 = var5;
				}

				if (this.field1436 + (long)this.field1431 > var5 && this.field1436 + (long)this.field1431 <= var5 + (long)var8) {
					var11 = (long)this.field1431 + this.field1436;
				} else if ((long)var8 + var5 > this.field1436 && var5 + (long)var8 <= this.field1436 + (long)this.field1431) {
					var11 = var5 + (long)var8;
				}

				if (var15 > -1L && var11 > var15) {
					int var13 = (int)(var11 - var15);
					System.arraycopy(this.field1435, (int)(var15 - this.field1436), var1, 0 + (int)(var15 - var5), var13);
					if (var11 > this.field1438) {
						var3 = (int)((long)var3 - (var11 - this.field1438));
						this.field1438 = var11;
					}
				}
			}
		} catch (IOException var14) {
			this.field1440 = -1L;
			throw var14;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	void method1008() throws IOException {
		this.field1434 = 0;
		if (this.field1440 != this.field1438) {
			this.field1432.method1706(this.field1438);
			this.field1440 = this.field1438;
		}

		int var3;
		for (this.field1441 = this.field1438; this.field1434 < this.field1433.length; this.field1434 += var3) {
			int var2 = this.field1433.length - this.field1434;
			if (var2 > 200000000) {
				var2 = 200000000;
			}

			var3 = this.field1432.method1711(this.field1433, this.field1434, var2);
			if (var3 == -1) {
				break;
			}

			this.field1440 += (long)var3;
		}

	}

	public void method1013(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (this.field1438 + (long)var3 > this.field1439) {
				this.field1439 = (long)var3 + this.field1438;
			}

			if (this.field1436 != -1L && (this.field1438 < this.field1436 || this.field1438 > this.field1436 + (long)this.field1431)) {
				this.method1014();
			}

			if (this.field1436 != -1L && (long)var3 + this.field1438 > this.field1436 + (long)this.field1435.length) {
				int var5 = (int)((long)this.field1435.length - (this.field1438 - this.field1436));
				System.arraycopy(var1, var2, this.field1435, (int)(this.field1438 - this.field1436), var5);
				this.field1438 += (long)var5;
				var2 += var5;
				var3 -= var5;
				this.field1431 = this.field1435.length;
				this.method1014();
			}

			if (var3 <= this.field1435.length) {
				if (var3 > 0) {
					if (-1L == this.field1436) {
						this.field1436 = this.field1438;
					}

					System.arraycopy(var1, var2, this.field1435, (int)(this.field1438 - this.field1436), var3);
					this.field1438 += (long)var3;
					if (this.field1438 - this.field1436 > (long)this.field1431) {
						this.field1431 = (int)(this.field1438 - this.field1436);
					}

				}
			} else {
				if (this.field1440 != this.field1438) {
					this.field1432.method1706(this.field1438);
					this.field1440 = this.field1438;
				}

				this.field1432.method1707(var1, var2, var3);
				this.field1440 += (long)var3;
				if (this.field1440 > this.field1437) {
					this.field1437 = this.field1440;
				}

				long var11 = -1L;
				long var7 = -1L;
				if (this.field1438 >= this.field1441 && this.field1438 < this.field1441 + (long)this.field1434) {
					var11 = this.field1438;
				} else if (this.field1441 >= this.field1438 && this.field1441 < (long)var3 + this.field1438) {
					var11 = this.field1441;
				}

				if (this.field1438 + (long)var3 > this.field1441 && (long)var3 + this.field1438 <= (long)this.field1434 + this.field1441) {
					var7 = this.field1438 + (long)var3;
				} else if ((long)this.field1434 + this.field1441 > this.field1438 && this.field1441 + (long)this.field1434 <= this.field1438 + (long)var3) {
					var7 = this.field1441 + (long)this.field1434;
				}

				if (var11 > -1L && var7 > var11) {
					int var9 = (int)(var7 - var11);
					System.arraycopy(var1, (int)(var11 + (long)var2 - this.field1438), this.field1433, (int)(var11 - this.field1441), var9);
				}

				this.field1438 += (long)var3;
			}
		} catch (IOException var10) {
			this.field1440 = -1L;
			throw var10;
		}
	}

	void method1014() throws IOException {
		if (-1L != this.field1436) {
			if (this.field1436 != this.field1440) {
				this.field1432.method1706(this.field1436);
				this.field1440 = this.field1436;
			}

			this.field1432.method1707(this.field1435, 0, this.field1431);
			this.field1440 += (long)this.field1431;
			if (this.field1440 > this.field1437) {
				this.field1437 = this.field1440;
			}

			long var2 = -1L;
			long var4 = -1L;
			if (this.field1436 >= this.field1441 && this.field1436 < (long)this.field1434 + this.field1441) {
				var2 = this.field1436;
			} else if (this.field1441 >= this.field1436 && this.field1441 < this.field1436 + (long)this.field1431) {
				var2 = this.field1441;
			}

			if ((long)this.field1431 + this.field1436 > this.field1441 && (long)this.field1431 + this.field1436 <= (long)this.field1434 + this.field1441) {
				var4 = this.field1436 + (long)this.field1431;
			} else if (this.field1441 + (long)this.field1434 > this.field1436 && this.field1441 + (long)this.field1434 <= this.field1436 + (long)this.field1431) {
				var4 = this.field1441 + (long)this.field1434;
			}

			if (var2 > -1L && var4 > var2) {
				int var6 = (int)(var4 - var2);
				System.arraycopy(this.field1435, (int)(var2 - this.field1436), this.field1433, (int)(var2 - this.field1441), var6);
			}

			this.field1436 = -1L;
			this.field1431 = 0;
		}

	}
}
