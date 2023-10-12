public class class78 {
	int field545;
	final class126 field543;
	public final class18 field546;
	public final class75 field544;

	class78(class126 var1) {
		this.field545 = 0;
		this.field543 = var1;
		this.field546 = new class18(var1);
		this.field544 = new class75(var1);
	}

	boolean method376() {
		return this.field545 == 2;
	}

	final void method371() {
		this.field545 = 1;
	}

	final void method383(Buffer var1, int var2) {
		this.field546.method73(var1, var2);
		this.field545 = 2;
		Client.method1387();
	}

	final void method372() {
		for (class8 var2 = (class8)this.field546.field90.method1861(); null != var2; var2 = (class8)this.field546.field90.method1862()) {
			if ((long)var2.field38 < class38.method108() / 1000L - 5L) {
				if (var2.field39 > 0) {
					class346.method1672(5, "", var2.field37 + class513.field3910);
				}

				if (var2.field39 == 0) {
					class346.method1672(5, "", var2.field37 + class513.field3911);
				}

				var2.method1129();
			}
		}

	}

	final void method382() {
		this.field545 = 0;
		this.field546.method2251();
		this.field544.method2251();
	}

	final boolean method374(class509 var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class114.field720.field3005)) {
			return true;
		} else {
			return this.field546.method72(var1, false);
		}
	}

	final boolean method375(class509 var1) {
		if (null == var1) {
			return false;
		} else {
			return this.field544.method2232(var1);
		}
	}

	final void method384(String var1) {
		if (null != var1) {
			class509 var3 = new class509(var1, this.field543);
			if (var3.method2401()) {
				if (this.method377()) {
					method388(class513.field3812);
				} else if (class114.field720.field3005.equals(var3)) {
					method388(class513.field3933);
				} else if (this.method374(var3, false)) {
					class145.method790(var1);
				} else if (this.method375(var3)) {
					method388(class513.field3935 + var1 + class513.field3936);
				} else {
					class341 var4 = class341.createClientPacket(ClientPacket.field3126, Client.field1891.field4219);
					var4.buffer.writeByte(Buffer.method2535(var1));
					var4.buffer.writeString(var1);
					Client.field1891.method2612(var4);
				}
			}
		}
	}

	final boolean method377() {
		return this.field546.method2252() || this.field546.method2250() >= 200 && Client.field1959 != 1;
	}

	final void method373(String var1) {
		if (var1 != null) {
			class509 var3 = new class509(var1, this.field543);
			if (var3.method2401()) {
				if (this.method378()) {
					method387();
				} else if (class114.field720.field3005.equals(var3)) {
					method386();
				} else if (this.method375(var3)) {
					method388(var1 + class513.field3932);
				} else if (this.method374(var3, false)) {
					method388(class513.field3892 + var1 + class513.field3982);
				} else {
					method385(var1);
				}
			}
		}
	}

	final boolean method378() {
		return this.field544.method2252() || this.field544.method2250() >= 100 && Client.field1959 != 1;
	}

	final void method379(String var1) {
		if (var1 != null) {
			class509 var3 = new class509(var1, this.field543);
			if (var3.method2401()) {
				if (this.field546.method2235(var3)) {
					Client.field2035 = Client.field1977;
					class341 var4 = class341.createClientPacket(ClientPacket.field3059, Client.field1891.field4219);
					var4.buffer.writeByte(Buffer.method2535(var1));
					var4.buffer.writeString(var1);
					Client.field1891.method2612(var4);
				}

				Client.method1387();
			}
		}
	}

	public final void method380(String var1, boolean var2) {
		if (null != var1) {
			class509 var4 = new class509(var1, this.field543);
			if (var4.method2401()) {
				if (this.field544.method2235(var4)) {
					Client.field2035 = Client.field1977;
					if (var2) {
						class341 var5 = class341.createClientPacket(ClientPacket.field3113, Client.field1891.field4219);
						var5.buffer.writeByte(Buffer.method2535(var1));
						var5.buffer.writeString(var1);
						Client.field1891.method2612(var5);
					}
				}

				Client.method1460();
			}
		}
	}

	final boolean method381(class509 var1) {
		class268 var3 = (class268)this.field546.method2233(var1);
		return var3 != null && var3.method508();
	}

	static final void method388(String var0) {
		class346.method1672(30, "", var0);
	}

	static final void method387() {
		method388(class513.field3931);
	}

	static final void method386() {
		method388(class513.field3934);
	}

	static final void method385(String var0) {
		class341 var2 = class341.createClientPacket(ClientPacket.field3142, Client.field1891.field4219);
		var2.buffer.writeByte(Buffer.method2535(var0));
		var2.buffer.writeString(var0);
		Client.field1891.method2612(var2);
	}
}
