public class class522 {
	static class198 field4107;

	static final class301 method2453(Buffer var0, class301 var1) {
		int var3 = var0.readUnsignedByte();
		int var4;
		if (null == var1) {
			var4 = class254.method1215(var3);
			var1 = new class301(var4);
		}

		for (var4 = 0; var4 < var3; ++var4) {
			boolean var5 = var0.readUnsignedByte() == 1;
			int var6 = var0.readUnsignedMedium();
			Object var7;
			if (var5) {
				var7 = new class519(var0.readStringOrNull());
			} else {
				var7 = new class252(var0.readInt());
			}

			var1.method1534((class359)var7, (long)var6);
		}

		return var1;
	}

	static int method2452(class301 var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			class252 var4 = (class252)var0.method1533((long)var1);
			return var4 == null ? var2 : var4.field1721;
		}
	}

	static String method2451(class301 var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			class519 var4 = (class519)var0.method1533((long)var1);
			return null == var4 ? var2 : (String)var4.field4102;
		}
	}
}
