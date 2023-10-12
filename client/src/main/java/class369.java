public class class369 {
	static int[] field2548;
	static int[] field2549;
	static int[] field2550;
	static int[] field2557;
	boolean field2555;
	class307 field2551;
	int field2552;
	int[] field2547;
	int[] field2553;
	int[] field2554;
	int[] field2556;

	static {
		field2557 = new int[500];
		field2548 = new int[500];
		field2549 = new int[500];
		field2550 = new int[500];
	}

	class369(byte[] var1, class307 var2) {
		this.field2551 = null;
		this.field2552 = -1;
		this.field2555 = false;
		this.field2551 = var2;
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		var3.offset = 2;
		int var5 = var3.readUnsignedByte();
		int var6 = -1;
		int var7 = 0;
		var4.offset = var3.offset + var5;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.readUnsignedByte();
			if (var9 > 0) {
				if (this.field2551.field2230[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.field2551.field2230[var10] == 0) {
							field2557[var7] = var10;
							field2548[var7] = 0;
							field2549[var7] = 0;
							field2550[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field2557[var7] = var8;
				short var11 = 0;
				if (this.field2551.field2230[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field2548[var7] = var4.method2517();
				} else {
					field2548[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field2549[var7] = var4.method2517();
				} else {
					field2549[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field2550[var7] = var4.method2517();
				} else {
					field2550[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.field2551.field2230[var8] == 5) {
					this.field2555 = true;
				}
			}
		}

		if (var4.offset != var1.length) {
		}

		this.field2552 = var7;
		this.field2553 = new int[var7];
		this.field2547 = new int[var7];
		this.field2554 = new int[var7];
		this.field2556 = new int[var7];

		for (var8 = 0; var8 < var7; ++var8) {
			this.field2553[var8] = field2557[var8];
			this.field2547[var8] = field2548[var8];
			this.field2554[var8] = field2549[var8];
			this.field2556[var8] = field2550[var8];
		}

	}
}
