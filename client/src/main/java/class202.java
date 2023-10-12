public class class202 extends class415 {
	static class282 field1360;
	int field1356;
	int field1357;
	int field1358;
	int field1359;
	// $FF: synthetic field
	final class14 this$0;

	class202(class14 var1) {
		this.this$0 = var1;
		this.field1359 = -1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field1359 = var1.readUnsignedShort();
		this.field1356 = var1.readInt();
		this.field1357 = var1.readUnsignedByte();
		this.field1358 = var1.readUnsignedByte();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2421(this.field1359, this.field1356, this.field1357, this.field1358);
	}

	public static void method971(class5 var0) {
		class492.field3504 = var0;
	}
}
