public class class500 extends class292 {
	public static class352 field3682;
	static class42[] field3691;
	static class5 field3690;
	public char field3684;
	public char field3685;
	public int field3686;
	public int field3687;
	public int[] field3688;
	public int[] field3689;
	public String field3681;
	public String[] field3683;

	static {
		field3682 = new class352(64);
	}

	class500() {
		this.field3681 = class513.field3757;
		this.field3687 = 0;
	}

	void method2364(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method2362(var1, var3);
		}
	}

	void method2362(Buffer var1, int var2) {
		if (var2 == 1) {
			this.field3685 = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.field3684 = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.field3681 = var1.readStringOrNull();
		} else if (var2 == 4) {
			this.field3686 = var1.readInt();
		} else {
			int var4;
			if (var2 == 5) {
				this.field3687 = var1.readUnsignedShort();
				this.field3688 = new int[this.field3687];
				this.field3683 = new String[this.field3687];

				for (var4 = 0; var4 < this.field3687; ++var4) {
					this.field3688[var4] = var1.readInt();
					this.field3683[var4] = var1.readStringOrNull();
				}
			} else if (var2 == 6) {
				this.field3687 = var1.readUnsignedShort();
				this.field3688 = new int[this.field3687];
				this.field3689 = new int[this.field3687];

				for (var4 = 0; var4 < this.field3687; ++var4) {
					this.field3688[var4] = var1.readInt();
					this.field3689[var4] = var1.readInt();
				}
			}
		}

	}

	public int method2363() {
		return this.field3687;
	}

	public static void method2366(class5 var0) {
		field3690 = var0;
	}

	public static class500 method2365(int var0) {
		class500 var2 = (class500)field3682.method1678((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field3690.method39(8, var0);
			var2 = new class500();
			if (null != var3) {
				var2.method2364(new Buffer(var3));
			}

			field3682.method1680(var2, (long)var0);
			return var2;
		}
	}
}
