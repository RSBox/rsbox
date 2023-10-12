public class class190 extends class415 {
	public static Client field1287;
	public static int field1289;
	int field1288;
	// $FF: synthetic field
	final class14 this$0;

	class190(class14 var1) {
		this.this$0 = var1;
		this.field1288 = -1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field1288 = var1.readUnsignedShort();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2418(this.field1288);
	}
}
