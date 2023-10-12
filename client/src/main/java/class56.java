public class class56 extends class292 {
	static class160 field261;
	class188 field257;
	class188 field258;
	class509 field253;
	int field254;
	int field255;
	int field260;
	String field256;
	String field259;
	String field262;

	class56(int var1, String var2, String var3, String var4) {
		this.field258 = class188.field1281;
		this.field257 = class188.field1281;
		this.method227(var1, var2, var3, var4);
	}

	void method227(int var1, String var2, String var3, String var4) {
		int var6 = ++class346.field2426 - 1;
		this.field260 = var6;
		this.field254 = Client.field1846;
		this.field255 = var1;
		this.field256 = var2;
		this.method231();
		this.field259 = var3;
		this.field262 = var4;
		this.method226();
		this.method230();
	}

	void method226() {
		this.field258 = class188.field1281;
	}

	final boolean method228() {
		if (class188.field1281 == this.field258) {
			this.method232();
		}

		return class188.field1284 == this.field258;
	}

	void method232() {
		this.field258 = class35.field176.field546.method2232(this.field253) ? class188.field1284 : class188.field1282;
	}

	void method230() {
		this.field257 = class188.field1281;
	}

	final boolean method229() {
		if (class188.field1281 == this.field257) {
			this.method233();
		}

		return this.field257 == class188.field1284;
	}

	void method233() {
		this.field257 = class35.field176.field544.method2232(this.field253) ? class188.field1284 : class188.field1282;
	}

	final void method231() {
		if (this.field256 != null) {
			this.field253 = new class509(Client.method1327(this.field256), class474.field3325);
		} else {
			this.field253 = null;
		}

	}
}
