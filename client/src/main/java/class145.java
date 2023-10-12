public final class class145 extends class359 {
	static class230[] field1016;
	int field1002;
	int field1003;
	int field1004;
	int field1005;
	int field1006;
	int field1007;
	int field1008;
	int field1009;
	int field1010;
	int field1011;
	int field1012;
	int field1013;
	int field1014;
	int field1015;

	class145() {
		this.field1013 = 31;
		this.field1014 = 0;
		this.field1015 = -1;
	}

	void method787(int var1) {
		this.field1013 = var1;
	}

	boolean method789(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1013 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	static final void method790(String var0) {
		class78.method388(var0 + class513.field4058);
	}

	static void method788(class496[] var0, class496 var1, boolean var2) {
		int var4 = var1.field3590 != 0 ? var1.field3590 : var1.field3540;
		int var5 = var1.field3622 != 0 ? var1.field3622 : var1.field3541;
		Client.method1436(var0, var1.interfaceId, var4, var5, var2);
		if (null != var1.field3659) {
			Client.method1436(var1.field3659, var1.interfaceId, var4, var5, var2);
		}

		InterfaceComponent var6 = (InterfaceComponent)Client.interfaceComponents.get((long)var1.interfaceId);
		if (null != var6) {
			int var7 = var6.group;
			if (class208.interfaceConfigs.method347(var7)) {
				Client.method1436(class208.interfaceConfigs.components[var7], -1, var4, var5, var2);
			}
		}

		if (var1.field3529 == 1337) {
		}

	}
}
