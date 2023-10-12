public class class151 {
	static class198 field1049;
	int field1047;
	int field1048;
	int field1050;
	int field1051;
	public int[][] field1052;

	public class151(int var1, int var2) {
		this.field1050 = 0;
		this.field1047 = 0;
		this.field1048 = var1;
		this.field1051 = var2;
		this.field1052 = new int[this.field1048][this.field1051];
		this.method801();
	}

	public void method801() {
		for (int var2 = 0; var2 < this.field1048; ++var2) {
			for (int var3 = 0; var3 < this.field1051; ++var3) {
				if (var2 != 0 && var3 != 0 && var2 < this.field1048 - 5 && var3 < this.field1051 - 5) {
					this.field1052[var2][var3] = 16777216;
				} else {
					this.field1052[var2][var3] = 16777215;
				}
			}
		}

	}

	public void method810(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field1050;
		var2 -= this.field1047;
		if (var3 == 0) {
			if (var4 == 0) {
				this.method805(var1, var2, 128);
				this.method805(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.method805(var1, var2, 2);
				this.method805(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.method805(var1, var2, 8);
				this.method805(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.method805(var1, var2, 32);
				this.method805(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.method805(var1, var2, 1);
				this.method805(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.method805(var1, var2, 4);
				this.method805(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.method805(var1, var2, 16);
				this.method805(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.method805(var1, var2, 64);
				this.method805(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.method805(var1, var2, 130);
				this.method805(var1 - 1, var2, 8);
				this.method805(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.method805(var1, var2, 10);
				this.method805(var1, var2 + 1, 32);
				this.method805(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.method805(var1, var2, 40);
				this.method805(var1 + 1, var2, 128);
				this.method805(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.method805(var1, var2, 160);
				this.method805(var1, var2 - 1, 2);
				this.method805(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.method805(var1, var2, 65536);
					this.method805(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.method805(var1, var2, 1024);
					this.method805(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.method805(var1, var2, 4096);
					this.method805(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.method805(var1, var2, 16384);
					this.method805(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.method805(var1, var2, 512);
					this.method805(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.method805(var1, var2, 2048);
					this.method805(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.method805(var1, var2, 8192);
					this.method805(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.method805(var1, var2, 32768);
					this.method805(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.method805(var1, var2, 66560);
					this.method805(var1 - 1, var2, 4096);
					this.method805(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.method805(var1, var2, 5120);
					this.method805(var1, var2 + 1, 16384);
					this.method805(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.method805(var1, var2, 20480);
					this.method805(var1 + 1, var2, 65536);
					this.method805(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.method805(var1, var2, 81920);
					this.method805(var1, var2 - 1, 1024);
					this.method805(var1 - 1, var2, 4096);
				}
			}
		}

	}

	public void method802(int var1, int var2, int var3, int var4, boolean var5) {
		int var7 = 256;
		if (var5) {
			var7 = 131328;
		}

		var1 -= this.field1050;
		var2 -= this.field1047;

		for (int var8 = var1; var8 < var3 + var1; ++var8) {
			if (var8 >= 0 && var8 < this.field1048) {
				for (int var9 = var2; var9 < var4 + var2; ++var9) {
					if (var9 >= 0 && var9 < this.field1051) {
						this.method805(var8, var9, var7);
					}
				}
			}
		}

	}

	public void method803(int var1, int var2) {
		var1 -= this.field1050;
		var2 -= this.field1047;
		int[] var10000 = this.field1052[var1];
		var10000[var2] |= 2097152;
	}

	public void method804(int var1, int var2) {
		var1 -= this.field1050;
		var2 -= this.field1047;
		int[] var10000 = this.field1052[var1];
		var10000[var2] |= 262144;
	}

	void method805(int var1, int var2, int var3) {
		int[] var10000 = this.field1052[var1];
		var10000[var2] |= var3;
	}

	public void method811(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field1050;
		var2 -= this.field1047;
		if (var3 == 0) {
			if (var4 == 0) {
				this.method807(var1, var2, 128);
				this.method807(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.method807(var1, var2, 2);
				this.method807(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.method807(var1, var2, 8);
				this.method807(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.method807(var1, var2, 32);
				this.method807(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.method807(var1, var2, 1);
				this.method807(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.method807(var1, var2, 4);
				this.method807(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.method807(var1, var2, 16);
				this.method807(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.method807(var1, var2, 64);
				this.method807(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.method807(var1, var2, 130);
				this.method807(var1 - 1, var2, 8);
				this.method807(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.method807(var1, var2, 10);
				this.method807(var1, var2 + 1, 32);
				this.method807(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.method807(var1, var2, 40);
				this.method807(var1 + 1, var2, 128);
				this.method807(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.method807(var1, var2, 160);
				this.method807(var1, var2 - 1, 2);
				this.method807(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.method807(var1, var2, 65536);
					this.method807(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.method807(var1, var2, 1024);
					this.method807(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.method807(var1, var2, 4096);
					this.method807(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.method807(var1, var2, 16384);
					this.method807(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.method807(var1, var2, 512);
					this.method807(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.method807(var1, var2, 2048);
					this.method807(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.method807(var1, var2, 8192);
					this.method807(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.method807(var1, var2, 32768);
					this.method807(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.method807(var1, var2, 66560);
					this.method807(var1 - 1, var2, 4096);
					this.method807(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.method807(var1, var2, 5120);
					this.method807(var1, var2 + 1, 16384);
					this.method807(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.method807(var1, var2, 20480);
					this.method807(var1 + 1, var2, 65536);
					this.method807(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.method807(var1, var2, 81920);
					this.method807(var1, var2 - 1, 1024);
					this.method807(var1 - 1, var2, 4096);
				}
			}
		}

	}

	public void method806(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var8 = 256;
		if (var6) {
			var8 = 131328;
		}

		var1 -= this.field1050;
		var2 -= this.field1047;
		int var9;
		if (var5 == 1 || var5 == 3) {
			var9 = var3;
			var3 = var4;
			var4 = var9;
		}

		for (var9 = var1; var9 < var3 + var1; ++var9) {
			if (var9 >= 0 && var9 < this.field1048) {
				for (int var10 = var2; var10 < var4 + var2; ++var10) {
					if (var10 >= 0 && var10 < this.field1051) {
						this.method807(var9, var10, var8);
					}
				}
			}
		}

	}

	void method807(int var1, int var2, int var3) {
		int[] var10000 = this.field1052[var1];
		var10000[var2] &= ~var3;
	}

	public void method808(int var1, int var2) {
		var1 -= this.field1050;
		var2 -= this.field1047;
		int[] var10000 = this.field1052[var1];
		var10000[var2] &= -262145;
	}

	public static boolean method809() {
		boolean var1 = false;
		boolean var2 = false;
		if (!class483.field3391.isEmpty()) {
			class4 var3 = (class4)class483.field3391.get(0);
			if (var3 == null) {
				class483.field3391.remove(0);
			} else if (var3.method8()) {
				if (var3.method7()) {
					System.out.println("Error in midimanager.service: " + var3.method10());
					var1 = true;
				} else {
					if (var3.method11() != null) {
						class483.field3391.add(1, var3.method11());
					}

					var2 = var3.method9();
				}

				class483.field3391.remove(0);
			} else {
				var2 = var3.method9();
			}
		}

		if (var1) {
			class483.field3391.clear();
			class483.method2219();
		}

		return var2;
	}
}
