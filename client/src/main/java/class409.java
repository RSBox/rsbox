public class class409 extends class415 {
	byte field2807;
	int field2806;
	// $FF: synthetic field
	final class14 this$0;

	class409(class14 var1) {
		this.this$0 = var1;
		this.field2806 = -1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field2806 = var1.readUnsignedShort();
		this.field2807 = var1.readByte();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2427(this.field2806, this.field2807);
	}
}
