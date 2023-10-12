public class class265 {
	static class102 field1779;
	static class230 field1782;
	int field1776;
	int field1780;
	final int field1774;
	final int[] field1778;
	final int[] field1781;
	final int[][] field1775;
	final int[][] field1777;

	class265(int var1, int var2) {
		this.field1777 = new int[var1][var2];
		this.field1775 = new int[var1][var2];
		int var3 = var1 * var2;
		int var4 = class254.method1215(var3 / 4);
		this.field1778 = new int[var4];
		this.field1781 = new int[var4];
		this.field1774 = var4 - 1;
	}

	void method1240() {
		for (int var2 = 0; var2 < this.field1777.length; ++var2) {
			for (int var3 = 0; var3 < this.field1777[var2].length; ++var3) {
				this.field1777[var2][var3] = 0;
				this.field1775[var2][var3] = 99999999;
			}
		}

	}

	void method1241(int var1, int var2) {
		this.field1776 = var1;
		this.field1780 = var2;
	}

	int method1242() {
		return this.field1776;
	}

	int method1243() {
		return this.field1780;
	}

	int method1251() {
		return this.field1777.length;
	}

	int method1245() {
		return this.field1777[0].length;
	}

	int[][] method1246() {
		return this.field1777;
	}

	int[][] method1247() {
		return this.field1775;
	}

	int[] method1248() {
		return this.field1778;
	}

	int[] method1249() {
		return this.field1781;
	}

	int method1250() {
		return this.field1774;
	}

	public static int method1244(CharSequence var0, int var1, boolean var2) {
		boolean var4 = false;
		boolean var5 = false;
		int var6 = 0;
		int var7 = var0.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			char var9 = var0.charAt(var8);
			if (var8 == 0) {
				if (var9 == '-') {
					var4 = true;
					continue;
				}

				if (var9 == '+') {
					continue;
				}
			}

			int var11;
			if (var9 >= '0' && var9 <= '9') {
				var11 = var9 - '0';
			} else if (var9 >= 'A' && var9 <= 'Z') {
				var11 = var9 - '7';
			} else {
				if (var9 < 'a' || var9 > 'z') {
					throw new NumberFormatException();
				}

				var11 = var9 - 'W';
			}

			if (var11 >= var1) {
				throw new NumberFormatException();
			}

			if (var4) {
				var11 = -var11;
			}

			int var10 = var11 + var6 * var1;
			if (var6 != var10 / var1) {
				throw new NumberFormatException();
			}

			var6 = var10;
			var5 = true;
		}

		if (!var5) {
			throw new NumberFormatException();
		} else {
			return var6;
		}
	}
}
