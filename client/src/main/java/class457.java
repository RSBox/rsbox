public class class457 {
	static int field3043;
	boolean field3030;
	boolean field3037;
	class64 field3035;
	class64 field3036;
	class64 field3038;
	class64[] field3032;
	class64[] field3034;
	float[][] field3039;
	float[][] field3040;
	float[][] field3041;
	float[][] field3042;
	final class64[] field3033;
	public class457 field3031;
	public final int field3044;

	public class457(int var1, Buffer var2, boolean var3) {
		this.field3035 = new class64();
		this.field3030 = true;
		this.field3036 = new class64();
		this.field3037 = true;
		this.field3038 = new class64();
		this.field3044 = var2.readShort();
		this.field3033 = new class64[var1];
		this.field3034 = new class64[this.field3033.length];
		this.field3032 = new class64[this.field3033.length];
		this.field3042 = new float[this.field3033.length][3];

		for (int var4 = 0; var4 < this.field3033.length; ++var4) {
			this.field3033[var4] = new class64(var2, var3);
			this.field3042[var4][0] = var2.method2474();
			this.field3042[var4][1] = var2.method2474();
			this.field3042[var4][2] = var2.method2474();
		}

		this.method2133();
	}

	void method2133() {
		this.field3039 = new float[this.field3033.length][3];
		this.field3040 = new float[this.field3033.length][3];
		this.field3041 = new float[this.field3033.length][3];
		class64 var2 = class64.method287();

		for (int var3 = 0; var3 < this.field3033.length; ++var3) {
			class64 var4 = this.method2134(var3);
			var2.method275(var4);
			var2.method280();
			this.field3039[var3] = var2.method272();
			this.field3040[var3][0] = var4.field326[12];
			this.field3040[var3][1] = var4.field326[13];
			this.field3040[var3][2] = var4.field326[14];
			this.field3041[var3] = var4.method270();
		}

		var2.method284();
	}

	class64 method2134(int var1) {
		return this.field3033[var1];
	}

	class64 method2135(int var1) {
		if (null == this.field3034[var1]) {
			this.field3034[var1] = new class64(this.method2134(var1));
			if (null != this.field3031) {
				this.field3034[var1].method277(this.field3031.method2135(var1));
			} else {
				this.field3034[var1].method277(class64.field323);
			}
		}

		return this.field3034[var1];
	}

	class64 method2140(int var1) {
		if (this.field3032[var1] == null) {
			this.field3032[var1] = new class64(this.method2135(var1));
			this.field3032[var1].method280();
		}

		return this.field3032[var1];
	}

	void method2142(class64 var1) {
		this.field3035.method275(var1);
		this.field3030 = true;
		this.field3037 = true;
	}

	class64 method2136() {
		return this.field3035;
	}

	class64 method2137() {
		if (this.field3030) {
			this.field3036.method275(this.method2136());
			if (this.field3031 != null) {
				this.field3036.method277(this.field3031.method2137());
			}

			this.field3030 = false;
		}

		return this.field3036;
	}

	public class64 method2132(int var1) {
		if (this.field3037) {
			this.field3038.method275(this.method2140(var1));
			this.field3038.method277(this.method2137());
			this.field3037 = false;
		}

		return this.field3038;
	}

	float[] method2138(int var1) {
		return this.field3039[var1];
	}

	float[] method2141(int var1) {
		return this.field3040[var1];
	}

	float[] method2139(int var1) {
		return this.field3041[var1];
	}
}
