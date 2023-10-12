public class class497 {
	byte[][][] field3671;
	int field3672;

	class497(int var1) {
		this.field3672 = var1;
	}

	void method2357(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.field3672 != 0 && null != this.field3671) {
			var8 = this.method2346(var8, var7);
			var7 = this.method2348(var7);
			class433.method1967(var1, var2, var5, var6, var3, var4, this.field3671[var7 - 1][var8], this.field3672, true);
		}
	}

	int method2346(int var1, int var2) {
		if (var2 == 9) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) {
			var1 = var1 + 3 & 3;
		}

		return var1;
	}

	int method2348(int var1) {
		if (var1 != 9 && var1 != 10) {
			return var1 == 11 ? 8 : var1;
		} else {
			return 1;
		}
	}

	void method2347() {
		if (null == this.field3671) {
			this.field3671 = new byte[8][4][];
			this.method2356();
			this.method2353();
			this.method2354();
			this.method2349();
			this.method2350();
			this.method2351();
			this.method2355();
			this.method2352();
		}
	}

	void method2356() {
		byte[] var2 = new byte[this.field3672 * this.field3672];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[0][0] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[0][1] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[0][2] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[0][3] = var2;
	}

	void method2353() {
		byte[] var2 = new byte[this.field3672 * this.field3672];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[1][0] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var3 >= 0 && var3 < var2.length) {
					if (var5 >= var4 << 1) {
						var2[var3] = -1;
					}

					++var3;
				} else {
					++var3;
				}
			}
		}

		this.field3671[1][1] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[1][2] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[1][3] = var2;
	}

	void method2354() {
		byte[] var2 = new byte[this.field3672 * this.field3672];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[2][0] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[2][1] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[2][2] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[2][3] = var2;
	}

	void method2349() {
		byte[] var2 = new byte[this.field3672 * this.field3672];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[3][0] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[3][1] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[3][2] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[3][3] = var2;
	}

	void method2350() {
		byte[] var2 = new byte[this.field3672 * this.field3672];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[4][0] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[4][1] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[4][2] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var3 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3671[4][3] = var2;
	}

	void method2351() {
		byte[] var2 = new byte[this.field3672 * this.field3672];
		boolean var3 = false;
		var2 = new byte[this.field3672 * this.field3672];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 <= this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[5][0] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var6 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var4 <= this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[5][1] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var6 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 >= this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[5][2] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var6 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var4 >= this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[5][3] = var2;
	}

	void method2355() {
		byte[] var2 = new byte[this.field3672 * this.field3672];
		boolean var3 = false;
		var2 = new byte[this.field3672 * this.field3672];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 <= var4 - this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[6][0] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var6 = 0;

		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 <= var4 - this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[6][1] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var6 = 0;

		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[6][2] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var6 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[6][3] = var2;
	}

	void method2352() {
		byte[] var2 = new byte[this.field3672 * this.field3672];
		boolean var3 = false;
		var2 = new byte[this.field3672 * this.field3672];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 >= var4 - this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[7][0] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var6 = 0;

		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3672; ++var5) {
				if (var5 >= var4 - this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[7][1] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var6 = 0;

		for (var4 = this.field3672 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[7][2] = var2;
		var2 = new byte[this.field3672 * this.field3672];
		var6 = 0;

		for (var4 = 0; var4 < this.field3672; ++var4) {
			for (var5 = this.field3672 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field3672 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3671[7][3] = var2;
	}
}
