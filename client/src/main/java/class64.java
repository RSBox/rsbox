import java.util.Arrays;

public final class class64 {
	public static final class64 field323;
	static class64[] field324;
	static int field322;
	static int field325;
	static int field327;
	public float[] field326;

	static {
		field324 = new class64[0];
		method286(100);
		field323 = new class64();
	}

	public class64() {
		this.field326 = new float[16];
		this.method273();
	}

	public class64(class64 var1) {
		this.field326 = new float[16];
		this.method275(var1);
	}

	public class64(Buffer var1, boolean var2) {
		this.field326 = new float[16];
		this.method271(var1, var2);
	}

	public void method284() {
		synchronized(field324) {
			if (field322 < field325 - 1) {
				field324[++field322 - 1] = this;
			}

		}
	}

	void method271(Buffer var1, boolean var2) {
		for (int var4 = 0; var4 < 16; ++var4) {
			this.field326[var4] = var1.method2474();
		}

	}

	float[] method285() {
		float[] var2 = new float[3];
		if ((double)this.field326[2] < 0.999D && (double)this.field326[2] > -0.999D) {
			var2[1] = (float)(-Math.asin((double)this.field326[2]));
			double var3 = Math.cos((double)var2[1]);
			var2[0] = (float)Math.atan2((double)this.field326[6] / var3, (double)this.field326[10] / var3);
			var2[2] = (float)Math.atan2((double)this.field326[1] / var3, (double)this.field326[0] / var3);
		} else {
			var2[0] = 0.0F;
			var2[1] = (float)Math.atan2((double)this.field326[2], 0.0D);
			var2[2] = (float)Math.atan2((double)(-this.field326[9]), (double)this.field326[5]);
		}

		return var2;
	}

	public float[] method272() {
		float[] var2 = new float[]{(float)(-Math.asin((double)this.field326[6])), 0.0F, 0.0F};
		double var3 = Math.cos((double)var2[0]);
		double var5;
		double var7;
		if (Math.abs(var3) > 0.005D) {
			var5 = (double)this.field326[2];
			var7 = (double)this.field326[10];
			double var9 = (double)this.field326[4];
			double var11 = (double)this.field326[5];
			var2[1] = (float)Math.atan2(var5, var7);
			var2[2] = (float)Math.atan2(var9, var11);
		} else {
			var5 = (double)this.field326[1];
			var7 = (double)this.field326[0];
			if (this.field326[6] < 0.0F) {
				var2[1] = (float)Math.atan2(var5, var7);
			} else {
				var2[1] = (float)(-Math.atan2(var5, var7));
			}

			var2[2] = 0.0F;
		}

		return var2;
	}

	void method273() {
		this.field326[0] = 1.0F;
		this.field326[1] = 0.0F;
		this.field326[2] = 0.0F;
		this.field326[3] = 0.0F;
		this.field326[4] = 0.0F;
		this.field326[5] = 1.0F;
		this.field326[6] = 0.0F;
		this.field326[7] = 0.0F;
		this.field326[8] = 0.0F;
		this.field326[9] = 0.0F;
		this.field326[10] = 1.0F;
		this.field326[11] = 0.0F;
		this.field326[12] = 0.0F;
		this.field326[13] = 0.0F;
		this.field326[14] = 0.0F;
		this.field326[15] = 1.0F;
	}

	public void method274() {
		this.field326[0] = 0.0F;
		this.field326[1] = 0.0F;
		this.field326[2] = 0.0F;
		this.field326[3] = 0.0F;
		this.field326[4] = 0.0F;
		this.field326[5] = 0.0F;
		this.field326[6] = 0.0F;
		this.field326[7] = 0.0F;
		this.field326[8] = 0.0F;
		this.field326[9] = 0.0F;
		this.field326[10] = 0.0F;
		this.field326[11] = 0.0F;
		this.field326[12] = 0.0F;
		this.field326[13] = 0.0F;
		this.field326[14] = 0.0F;
		this.field326[15] = 0.0F;
	}

	public void method275(class64 var1) {
		System.arraycopy(var1.field326, 0, this.field326, 0, 16);
	}

	public void method276(float var1) {
		this.method282(var1, var1, var1);
	}

	public void method282(float var1, float var2, float var3) {
		this.method273();
		this.field326[0] = var1;
		this.field326[5] = var2;
		this.field326[10] = var3;
	}

	public void method283(class64 var1) {
		for (int var3 = 0; var3 < this.field326.length; ++var3) {
			float[] var10000 = this.field326;
			var10000[var3] += var1.field326[var3];
		}

	}

	public void method277(class64 var1) {
		float var3 = var1.field326[0] * this.field326[0] + var1.field326[4] * this.field326[1] + this.field326[2] * var1.field326[8] + var1.field326[12] * this.field326[3];
		float var4 = this.field326[2] * var1.field326[9] + this.field326[1] * var1.field326[5] + var1.field326[1] * this.field326[0] + this.field326[3] * var1.field326[13];
		float var5 = var1.field326[14] * this.field326[3] + var1.field326[10] * this.field326[2] + var1.field326[6] * this.field326[1] + var1.field326[2] * this.field326[0];
		float var6 = var1.field326[15] * this.field326[3] + var1.field326[11] * this.field326[2] + this.field326[0] * var1.field326[3] + this.field326[1] * var1.field326[7];
		float var7 = var1.field326[12] * this.field326[7] + var1.field326[0] * this.field326[4] + var1.field326[4] * this.field326[5] + this.field326[6] * var1.field326[8];
		float var8 = this.field326[4] * var1.field326[1] + var1.field326[5] * this.field326[5] + this.field326[6] * var1.field326[9] + var1.field326[13] * this.field326[7];
		float var9 = var1.field326[10] * this.field326[6] + var1.field326[2] * this.field326[4] + var1.field326[6] * this.field326[5] + this.field326[7] * var1.field326[14];
		float var10 = var1.field326[11] * this.field326[6] + this.field326[5] * var1.field326[7] + this.field326[4] * var1.field326[3] + this.field326[7] * var1.field326[15];
		float var11 = var1.field326[0] * this.field326[8] + this.field326[9] * var1.field326[4] + var1.field326[8] * this.field326[10] + var1.field326[12] * this.field326[11];
		float var12 = this.field326[11] * var1.field326[13] + this.field326[10] * var1.field326[9] + this.field326[8] * var1.field326[1] + var1.field326[5] * this.field326[9];
		float var13 = this.field326[10] * var1.field326[10] + this.field326[9] * var1.field326[6] + this.field326[8] * var1.field326[2] + var1.field326[14] * this.field326[11];
		float var14 = var1.field326[3] * this.field326[8] + var1.field326[7] * this.field326[9] + var1.field326[11] * this.field326[10] + var1.field326[15] * this.field326[11];
		float var15 = this.field326[15] * var1.field326[12] + this.field326[14] * var1.field326[8] + this.field326[13] * var1.field326[4] + this.field326[12] * var1.field326[0];
		float var16 = var1.field326[13] * this.field326[15] + var1.field326[9] * this.field326[14] + this.field326[13] * var1.field326[5] + var1.field326[1] * this.field326[12];
		float var17 = var1.field326[14] * this.field326[15] + var1.field326[10] * this.field326[14] + var1.field326[6] * this.field326[13] + var1.field326[2] * this.field326[12];
		float var18 = var1.field326[11] * this.field326[14] + this.field326[12] * var1.field326[3] + var1.field326[7] * this.field326[13] + this.field326[15] * var1.field326[15];
		this.field326[0] = var3;
		this.field326[1] = var4;
		this.field326[2] = var5;
		this.field326[3] = var6;
		this.field326[4] = var7;
		this.field326[5] = var8;
		this.field326[6] = var9;
		this.field326[7] = var10;
		this.field326[8] = var11;
		this.field326[9] = var12;
		this.field326[10] = var13;
		this.field326[11] = var14;
		this.field326[12] = var15;
		this.field326[13] = var16;
		this.field326[14] = var17;
		this.field326[15] = var18;
	}

	public void method281(class213 var1) {
		float var3 = var1.field1400 * var1.field1400;
		float var4 = var1.field1400 * var1.field1397;
		float var5 = var1.field1400 * var1.field1398;
		float var6 = var1.field1400 * var1.field1399;
		float var7 = var1.field1397 * var1.field1397;
		float var8 = var1.field1398 * var1.field1397;
		float var9 = var1.field1397 * var1.field1399;
		float var10 = var1.field1398 * var1.field1398;
		float var11 = var1.field1399 * var1.field1398;
		float var12 = var1.field1399 * var1.field1399;
		this.field326[0] = var7 + var3 - var12 - var10;
		this.field326[1] = var8 + var8 + var6 + var6;
		this.field326[2] = var9 - var5 - var5 + var9;
		this.field326[4] = var8 - var6 - var6 + var8;
		this.field326[5] = var10 + var3 - var7 - var12;
		this.field326[6] = var11 + var4 + var11 + var4;
		this.field326[8] = var5 + var9 + var9 + var5;
		this.field326[9] = var11 + (var11 - var4 - var4);
		this.field326[10] = var12 + var3 - var10 - var7;
	}

	void method278(class527 var1) {
		this.field326[0] = var1.field4132;
		this.field326[1] = var1.field4125;
		this.field326[2] = var1.field4133;
		this.field326[3] = 0.0F;
		this.field326[4] = var1.field4127;
		this.field326[5] = var1.field4128;
		this.field326[6] = var1.field4124;
		this.field326[7] = 0.0F;
		this.field326[8] = var1.field4130;
		this.field326[9] = var1.field4131;
		this.field326[10] = var1.field4135;
		this.field326[11] = 0.0F;
		this.field326[12] = var1.field4129;
		this.field326[13] = var1.field4134;
		this.field326[14] = var1.field4126;
		this.field326[15] = 1.0F;
	}

	float method279() {
		return this.field326[6] * this.field326[3] * this.field326[9] * this.field326[12] + (this.field326[10] * this.field326[7] * this.field326[1] * this.field326[12] + (this.field326[11] * this.field326[4] * this.field326[1] * this.field326[14] + (this.field326[14] * this.field326[0] * this.field326[7] * this.field326[9] + this.field326[15] * this.field326[0] * this.field326[5] * this.field326[10] - this.field326[14] * this.field326[11] * this.field326[5] * this.field326[0] - this.field326[15] * this.field326[9] * this.field326[6] * this.field326[0] + this.field326[11] * this.field326[0] * this.field326[6] * this.field326[13] - this.field326[10] * this.field326[7] * this.field326[0] * this.field326[13] - this.field326[10] * this.field326[4] * this.field326[1] * this.field326[15]) + this.field326[8] * this.field326[6] * this.field326[1] * this.field326[15] - this.field326[11] * this.field326[6] * this.field326[1] * this.field326[12] - this.field326[8] * this.field326[7] * this.field326[1] * this.field326[14]) + this.field326[15] * this.field326[2] * this.field326[4] * this.field326[9] - this.field326[13] * this.field326[11] * this.field326[2] * this.field326[4] - this.field326[15] * this.field326[8] * this.field326[5] * this.field326[2] + this.field326[2] * this.field326[5] * this.field326[11] * this.field326[12] + this.field326[13] * this.field326[8] * this.field326[7] * this.field326[2] - this.field326[12] * this.field326[7] * this.field326[2] * this.field326[9] - this.field326[14] * this.field326[9] * this.field326[4] * this.field326[3] + this.field326[13] * this.field326[4] * this.field326[3] * this.field326[10] + this.field326[5] * this.field326[3] * this.field326[8] * this.field326[14] - this.field326[10] * this.field326[3] * this.field326[5] * this.field326[12] - this.field326[13] * this.field326[3] * this.field326[6] * this.field326[8]);
	}

	public void method280() {
		float var2 = 1.0F / this.method279();
		float var3 = var2 * (this.field326[13] * this.field326[6] * this.field326[11] + (this.field326[10] * this.field326[5] * this.field326[15] - this.field326[11] * this.field326[5] * this.field326[14] - this.field326[15] * this.field326[6] * this.field326[9]) + this.field326[7] * this.field326[9] * this.field326[14] - this.field326[10] * this.field326[7] * this.field326[13]);
		float var4 = (this.field326[14] * this.field326[1] * this.field326[11] + this.field326[15] * this.field326[10] * -this.field326[1] + this.field326[15] * this.field326[2] * this.field326[9] - this.field326[11] * this.field326[2] * this.field326[13] - this.field326[14] * this.field326[3] * this.field326[9] + this.field326[13] * this.field326[10] * this.field326[3]) * var2;
		float var5 = (this.field326[1] * this.field326[6] * this.field326[15] - this.field326[14] * this.field326[7] * this.field326[1] - this.field326[15] * this.field326[2] * this.field326[5] + this.field326[13] * this.field326[7] * this.field326[2] + this.field326[14] * this.field326[3] * this.field326[5] - this.field326[13] * this.field326[3] * this.field326[6]) * var2;
		float var6 = var2 * (this.field326[9] * this.field326[3] * this.field326[6] + (this.field326[11] * this.field326[2] * this.field326[5] + this.field326[6] * -this.field326[1] * this.field326[11] + this.field326[1] * this.field326[7] * this.field326[10] - this.field326[7] * this.field326[2] * this.field326[9] - this.field326[10] * this.field326[3] * this.field326[5]));
		float var7 = var2 * (this.field326[10] * this.field326[7] * this.field326[12] + (this.field326[14] * this.field326[11] * this.field326[4] + this.field326[15] * -this.field326[4] * this.field326[10] + this.field326[15] * this.field326[6] * this.field326[8] - this.field326[12] * this.field326[6] * this.field326[11] - this.field326[14] * this.field326[8] * this.field326[7]));
		float var8 = (this.field326[10] * this.field326[0] * this.field326[15] - this.field326[0] * this.field326[11] * this.field326[14] - this.field326[15] * this.field326[2] * this.field326[8] + this.field326[2] * this.field326[11] * this.field326[12] + this.field326[14] * this.field326[8] * this.field326[3] - this.field326[10] * this.field326[3] * this.field326[12]) * var2;
		float var9 = var2 * (this.field326[15] * this.field326[6] * -this.field326[0] + this.field326[14] * this.field326[7] * this.field326[0] + this.field326[2] * this.field326[4] * this.field326[15] - this.field326[12] * this.field326[7] * this.field326[2] - this.field326[14] * this.field326[3] * this.field326[4] + this.field326[12] * this.field326[3] * this.field326[6]);
		float var10 = (this.field326[10] * this.field326[3] * this.field326[4] + this.field326[7] * this.field326[2] * this.field326[8] + (this.field326[11] * this.field326[6] * this.field326[0] - this.field326[7] * this.field326[0] * this.field326[10] - this.field326[2] * this.field326[4] * this.field326[11]) - this.field326[8] * this.field326[3] * this.field326[6]) * var2;
		float var11 = (this.field326[15] * this.field326[4] * this.field326[9] - this.field326[4] * this.field326[11] * this.field326[13] - this.field326[5] * this.field326[8] * this.field326[15] + this.field326[12] * this.field326[5] * this.field326[11] + this.field326[13] * this.field326[8] * this.field326[7] - this.field326[12] * this.field326[7] * this.field326[9]) * var2;
		float var12 = var2 * (this.field326[12] * this.field326[9] * this.field326[3] + (this.field326[15] * this.field326[1] * this.field326[8] + this.field326[15] * -this.field326[0] * this.field326[9] + this.field326[0] * this.field326[11] * this.field326[13] - this.field326[11] * this.field326[1] * this.field326[12] - this.field326[3] * this.field326[8] * this.field326[13]));
		float var13 = (this.field326[13] * this.field326[4] * this.field326[3] + this.field326[7] * this.field326[1] * this.field326[12] + (this.field326[0] * this.field326[5] * this.field326[15] - this.field326[0] * this.field326[7] * this.field326[13] - this.field326[15] * this.field326[4] * this.field326[1]) - this.field326[5] * this.field326[3] * this.field326[12]) * var2;
		float var14 = (this.field326[9] * this.field326[7] * this.field326[0] + this.field326[5] * -this.field326[0] * this.field326[11] + this.field326[11] * this.field326[4] * this.field326[1] - this.field326[7] * this.field326[1] * this.field326[8] - this.field326[4] * this.field326[3] * this.field326[9] + this.field326[8] * this.field326[5] * this.field326[3]) * var2;
		float var15 = (this.field326[12] * this.field326[6] * this.field326[9] + (this.field326[13] * this.field326[4] * this.field326[10] + -this.field326[4] * this.field326[9] * this.field326[14] + this.field326[8] * this.field326[5] * this.field326[14] - this.field326[12] * this.field326[10] * this.field326[5] - this.field326[13] * this.field326[6] * this.field326[8])) * var2;
		float var16 = (this.field326[9] * this.field326[0] * this.field326[14] - this.field326[13] * this.field326[0] * this.field326[10] - this.field326[14] * this.field326[1] * this.field326[8] + this.field326[10] * this.field326[1] * this.field326[12] + this.field326[13] * this.field326[8] * this.field326[2] - this.field326[12] * this.field326[2] * this.field326[9]) * var2;
		float var17 = var2 * (this.field326[4] * this.field326[1] * this.field326[14] + this.field326[14] * this.field326[5] * -this.field326[0] + this.field326[0] * this.field326[6] * this.field326[13] - this.field326[1] * this.field326[6] * this.field326[12] - this.field326[2] * this.field326[4] * this.field326[13] + this.field326[5] * this.field326[2] * this.field326[12]);
		float var18 = var2 * (this.field326[4] * this.field326[2] * this.field326[9] + this.field326[5] * this.field326[0] * this.field326[10] - this.field326[9] * this.field326[0] * this.field326[6] - this.field326[10] * this.field326[4] * this.field326[1] + this.field326[8] * this.field326[1] * this.field326[6] - this.field326[5] * this.field326[2] * this.field326[8]);
		this.field326[0] = var3;
		this.field326[1] = var4;
		this.field326[2] = var5;
		this.field326[3] = var6;
		this.field326[4] = var7;
		this.field326[5] = var8;
		this.field326[6] = var9;
		this.field326[7] = var10;
		this.field326[8] = var11;
		this.field326[9] = var12;
		this.field326[10] = var13;
		this.field326[11] = var14;
		this.field326[12] = var15;
		this.field326[13] = var16;
		this.field326[14] = var17;
		this.field326[15] = var18;
	}

	@Override
	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method272();
		this.method285();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field326[var2 * 4 + var3];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	@Override
	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field326);
		return var3;
	}

	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof class64)) {
			return false;
		} else {
			class64 var2 = (class64)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field326[var3] != this.field326[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public float[] method270() {
		float[] var2 = new float[3];
		class24 var3 = new class24(this.field326[0], this.field326[1], this.field326[2]);
		class24 var4 = new class24(this.field326[4], this.field326[5], this.field326[6]);
		class24 var5 = new class24(this.field326[8], this.field326[9], this.field326[10]);
		var2[0] = var3.method85();
		var2[1] = var4.method85();
		var2[2] = var5.method85();
		return var2;
	}

	static void method286(int var0) {
		field325 = 100;
		field324 = new class64[100];
		field322 = 0;
	}

	public static class64 method287() {
		synchronized(field324) {
			if (field322 == 0) {
				return new class64();
			} else {
				field324[--field322].method273();
				return field324[field322];
			}
		}
	}
}
