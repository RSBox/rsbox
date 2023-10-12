public class class251 extends class415 {
	int field1720;
	// $FF: synthetic field
	final class14 this$0;

	class251(class14 var1) {
		this.this$0 = var1;
		this.field1720 = -1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field1720 = var1.readUnsignedShort();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2416(this.field1720);
	}
}
