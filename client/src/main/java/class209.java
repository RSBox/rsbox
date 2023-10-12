import java.util.concurrent.ThreadPoolExecutor;

public class class209 {
	public static ThreadPoolExecutor field1389;
	static class282 field1388;
	class375 field1387;
	class5 field1386;
	class5 field1390;

	public class209(class5 var1, class5 var2) {
		new class375(256);
		this.field1387 = new class375(256);
		this.field1390 = var1;
		this.field1386 = var2;
	}

	class7 method983(int var1, int var2, int[] var3) {
		long var5 = this.method984(var1, var2, false);
		class214 var7 = (class214)this.field1387.get(var5);
		if (var7 != null) {
			return var7.method993();
		} else if (null != var3 && var3[0] <= 0) {
			return null;
		} else {
			class357 var8 = class357.method1715(this.field1390, var1, var2);
			if (null == var8) {
				return null;
			} else {
				class7 var9 = var8.method1712();
				this.field1387.put(new class214(var9), var5);
				if (null != var3) {
					var3[0] -= var9.field35.length;
				}

				return var9;
			}
		}
	}

	class214 method979(int var1, int var2) {
		long var4 = this.method984(var1, var2, true);
		class214 var6 = (class214)this.field1387.get(var4);
		if (var6 != null) {
			return var6;
		} else {
			class191 var7 = class191.method941(this.field1386, var1, var2);
			if (null == var7) {
				return new class214();
			} else {
				class214 var8 = new class214(var7);
				this.field1387.put(var8, var4);
				return var8;
			}
		}
	}

	class7 method980(int var1, int[] var2) {
		if (this.field1390.method24() == 1) {
			return this.method983(0, var1, var2);
		} else if (this.field1390.method23(var1) == 1) {
			return this.method983(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	public class214 method981(int var1) {
		if (this.field1386.method24() == 1) {
			return this.method979(0, var1);
		} else if (this.field1386.method23(var1) == 1) {
			return this.method979(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public class7 method982(int var1) {
		return this.method980(var1, (int[])null);
	}

	long method984(int var1, int var2, boolean var3) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var5 |= var1 << 16;
		return var3 ? (long)var5 ^ 4294967296L : (long)var5;
	}
}
