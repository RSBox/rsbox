public class class357 {
	class95[] field2460;
	int field2459;
	int field2461;

	class357(Buffer var1) {
		this.field2460 = new class95[10];

		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 != 0) {
				--var1.offset;
				this.field2460[var2] = new class95();
				this.field2460[var2].method425(var1);
			}
		}

		this.field2461 = var1.readUnsignedShort();
		this.field2459 = var1.readUnsignedShort();
	}

	public class7 method1712() {
		byte[] var1 = this.method1714();
		return new class7(22050, var1, this.field2461 * 22050 / 1000, this.field2459 * 22050 / 1000);
	}

	public final int method1713() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field2460[var2] != null && this.field2460[var2].field619 / 20 < var1) {
				var1 = this.field2460[var2].field619 / 20;
			}
		}

		if (this.field2461 < this.field2459 && this.field2461 / 20 < var1) {
			var1 = this.field2461 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; ++var2) {
				if (this.field2460[var2] != null) {
					class95 var10000 = this.field2460[var2];
					var10000.field619 -= var1 * 20;
				}
			}

			if (this.field2461 < this.field2459) {
				this.field2461 -= var1 * 20;
				this.field2459 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	final byte[] method1714() {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field2460[var2] != null && this.field2460[var2].field620 + this.field2460[var2].field619 > var1) {
				var1 = this.field2460[var2].field620 + this.field2460[var2].field619;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000;
			byte[] var3 = new byte[var2];

			for (int var4 = 0; var4 < 10; ++var4) {
				if (this.field2460[var4] != null) {
					int var5 = this.field2460[var4].field620 * 22050 / 1000;
					int var6 = this.field2460[var4].field619 * 22050 / 1000;
					int[] var7 = this.field2460[var4].method423(var5, this.field2460[var4].field620);

					for (int var8 = 0; var8 < var5; ++var8) {
						int var9 = var3[var8 + var6] + (var7[var8] >> 8);
						if ((var9 + 128 & -256) != 0) {
							var9 = var9 >> 31 ^ 127;
						}

						var3[var8 + var6] = (byte)var9;
					}
				}
			}

			return var3;
		}
	}

	public static class357 method1715(class5 var0, int var1, int var2) {
		byte[] var3 = var0.method39(var1, var2);
		return var3 == null ? null : new class357(new Buffer(var3));
	}
}
