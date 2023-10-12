public class class61 extends class415 {
	String field280;
	long field279;
	// $FF: synthetic field
	final class14 this$0;

	class61(class14 var1) {
		this.this$0 = var1;
		this.field279 = -1L;
		this.field280 = null;
	}

	@Override
	void method1905(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field279 = var1.readLong();
		}

		this.field280 = var1.readString();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2422(this.field279, this.field280);
	}

	public static class230 method260(class5 var0, String var1, String var2) {
		if (!var0.method33(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method28(var1);
			int var5 = var0.method17(var4, var2);
			class230 var6;
			if (!class168.method887(var0, var4, var5)) {
				var6 = null;
			} else {
				var6 = class168.method889();
			}

			return var6;
		}
	}
}
