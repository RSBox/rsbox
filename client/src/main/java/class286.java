import java.util.HashMap;

public class class286 {
	static int[] field2160;
	class160 field2163;
	int field2162;
	int[] field2159;
	int[] field2161;
	final HashMap field2164;

	public class286() {
		this.field2164 = new HashMap();
		this.field2163 = new class160(0, 0);
		this.field2159 = new int[2048];
		this.field2161 = new int[2048];
		this.field2162 = 0;
		field2160 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = class55.method225((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var1 * 0.425F / 16.0F));
			field2160[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < field2160.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = class55.method225((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < field2160.length; ++var1) {
				field2160[var1] = var5;
			}
		}

	}

	void method1506(int var1) {
		int var3 = 1 + var1 * 2;
		double var5 = (double)((float)var1 / 3.0F);
		int var7 = 1 + var1 * 2;
		double[] var8 = new double[var7];
		int var9 = -var1;

		for (int var10 = 0; var9 <= var1; ++var10) {
			double var17 = (double)(var9 - 0) / var5;
			double var15 = Math.exp(var17 * -var17 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var13 = var15 / var5;
			var8[var10] = var13;
			++var9;
		}

		double[] var19 = var8;
		double var20 = var8[var1] * var8[var1];
		int[] var21 = new int[var3 * var3];
		boolean var11 = false;

		for (int var12 = 0; var12 < var3; ++var12) {
			for (int var23 = 0; var23 < var3; ++var23) {
				int var14 = var21[var23 + var12 * var3] = (int)(var19[var12] * var19[var23] / var20 * 256.0D);
				if (!var11 && var14 > 0) {
					var11 = true;
				}
			}
		}

		class42 var22 = new class42(var21, var3, var3);
		this.field2164.put(var1, var22);
	}

	class42 method1511(int var1) {
		if (!this.field2164.containsKey(var1)) {
			this.method1506(var1);
		}

		return (class42)this.field2164.get(var1);
	}

	public final void method1507(int var1, int var2) {
		if (this.field2162 < this.field2159.length) {
			this.field2159[this.field2162] = var1;
			this.field2161[this.field2162] = var2;
			++this.field2162;
		}
	}

	public final void method1508() {
		this.field2162 = 0;
	}

	public final void method1509(int var1, int var2, class42 var3, float var4) {
		int var6 = (int)(var4 * 18.0F);
		class42 var7 = this.method1511(var6);
		int var8 = var6 * 2 + 1;
		class160 var9 = new class160(0, 0, var3.field207, var3.field209);
		class160 var10 = new class160(0, 0);
		this.field2163.method863(var8, var8);
		System.nanoTime();

		int var11;
		int var12;
		int var13;
		for (var11 = 0; var11 < this.field2162; ++var11) {
			var12 = this.field2159[var11];
			var13 = this.field2161[var11];
			int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
			int var15 = (int)((float)var3.field209 - (float)(var13 - var2) * var4) - var6;
			this.field2163.method862(var14, var15);
			this.field2163.method869(var9, var10);
			this.method1510(var7, var3, var10);
		}

		System.nanoTime();
		System.nanoTime();

		for (var11 = 0; var11 < var3.field205.length; ++var11) {
			if (var3.field205[var11] == 0) {
				var3.field205[var11] = -16777216;
			} else {
				var12 = (var3.field205[var11] + 64 - 1) / 256;
				if (var12 <= 0) {
					var3.field205[var11] = -16777216;
				} else {
					if (var12 > field2160.length) {
						var12 = field2160.length;
					}

					var13 = field2160[var12 - 1];
					var3.field205[var11] = -16777216 | var13;
				}
			}
		}

		System.nanoTime();
	}

	void method1510(class42 var1, class42 var2, class160 var3) {
		if (var3.field1146 != 0 && var3.field1148 != 0) {
			int var5 = 0;
			int var6 = 0;
			if (var3.field1147 == 0) {
				var5 = var1.field207 - var3.field1146;
			}

			if (var3.field1149 == 0) {
				var6 = var1.field209 - var3.field1148;
			}

			int var7 = var5 + var1.field207 * var6;
			int var8 = var2.field207 * var3.field1149 + var3.field1147;

			for (int var9 = 0; var9 < var3.field1148; ++var9) {
				for (int var10 = 0; var10 < var3.field1146; ++var10) {
					int[] var10000 = var2.field205;
					int var10001 = var8++;
					var10000[var10001] += var1.field205[var7++];
				}

				var7 += var1.field207 - var3.field1146;
				var8 += var2.field207 - var3.field1146;
			}

		}
	}
}
