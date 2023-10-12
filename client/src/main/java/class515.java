public class class515 {
	int field4065;
	int field4067;
	int field4068;
	int field4069;
	int field4070;
	int field4071;
	int[] field4066;

	class515() {
		class275 var1 = class191.field1308;
		this.field4068 = var1.method1268(16);
		this.field4067 = var1.method1268(24);
		this.field4065 = var1.method1268(24);
		this.field4071 = var1.method1268(24) + 1;
		this.field4069 = var1.method1268(6) + 1;
		this.field4070 = var1.method1268(8);
		int[] var2 = new int[this.field4069];

		int var3;
		for (var3 = 0; var3 < this.field4069; ++var3) {
			int var4 = 0;
			int var5 = var1.method1268(3);
			boolean var6 = var1.method1269() != 0;
			if (var6) {
				var4 = var1.method1268(5);
			}

			var2[var3] = var4 << 3 | var5;
		}

		this.field4066 = new int[this.field4069 * 8];

		for (var3 = 0; var3 < this.field4069 * 8; ++var3) {
			this.field4066[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1268(8) : -1;
		}

	}

	void method2429(float[] var1, int var2, boolean var3, class275 var4) {
		int var5;
		for (var5 = 0; var5 < var2; ++var5) {
			var1[var5] = 0.0F;
		}

		if (!var3) {
			var5 = class191.field1299[this.field4070].field711;
			int var6 = this.field4065 - this.field4067;
			int var7 = var6 / this.field4071;
			int[] var8 = new int[var7];

			for (int var9 = 0; var9 < 8; ++var9) {
				int var10 = 0;

				while (var10 < var7) {
					int var11;
					int var12;
					if (var9 == 0) {
						var11 = class191.field1299[this.field4070].method513(var4);

						for (var12 = var5 - 1; var12 >= 0; --var12) {
							if (var10 + var12 < var7) {
								var8[var10 + var12] = var11 % this.field4069;
							}

							var11 /= this.field4069;
						}
					}

					for (var11 = 0; var11 < var5; ++var11) {
						var12 = var8[var10];
						int var13 = this.field4066[var12 * 8 + var9];
						if (var13 >= 0) {
							int var14 = this.field4067 + var10 * this.field4071;
							class113 var15 = class191.field1299[var13];
							int var16;
							if (this.field4068 == 0) {
								var16 = this.field4071 / var15.field711;

								for (int var20 = 0; var20 < var16; ++var20) {
									float[] var21 = var15.method515(var4);

									for (int var19 = 0; var19 < var15.field711; ++var19) {
										var1[var14 + var20 + var19 * var16] += var21[var19];
									}
								}
							} else {
								var16 = 0;

								while (var16 < this.field4071) {
									float[] var17 = var15.method515(var4);

									for (int var18 = 0; var18 < var15.field711; ++var18) {
										var1[var14 + var16] += var17[var18];
										++var16;
									}
								}
							}
						}

						++var10;
						if (var10 >= var7) {
							break;
						}
					}
				}
			}

		}
	}
}
