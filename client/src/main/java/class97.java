public class class97 {
	static class198 field630;
	static class545 field632;
	class457[] field633;
	int field631;

	class97(Buffer var1, int var2) {
		this.field633 = new class457[var2];
		this.field631 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field633.length; ++var3) {
			class457 var4 = new class457(this.field631, var1, false);
			this.field633[var3] = var4;
		}

		this.method429();
	}

	void method429() {
		class457[] var2 = this.field633;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class457 var4 = var2[var3];
			if (var4.field3044 >= 0) {
				var4.field3031 = this.field633[var4.field3044];
			}
		}

	}

	public int method430() {
		return this.field633.length;
	}

	class457 method433(int var1) {
		return var1 >= this.method430() ? null : this.field633[var1];
	}

	class457[] method431() {
		return this.field633;
	}

	void method434(class19 var1, int var2) {
		this.method432(var1, var2, (boolean[])null, false);
	}

	void method432(class19 var1, int var2, boolean[] var3, boolean var4) {
		int var6 = var1.method82();
		int var7 = 0;
		class457[] var8 = this.method431();

		for (int var9 = 0; var9 < var8.length; ++var9) {
			class457 var10 = var8[var9];
			if (null == var3 || var3[var7] == var4) {
				var1.method77(var2, var10, var7, var6);
			}

			++var7;
		}

	}
}
