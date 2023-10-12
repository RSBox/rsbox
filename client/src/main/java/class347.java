public class class347 extends class415 {
	boolean field2429;
	int field2428;
	// $FF: synthetic field
	final class14 this$0;

	class347(class14 var1) {
		this.this$0 = var1;
		this.field2428 = -1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field2428 = var1.readUnsignedShort();
		this.field2429 = var1.readUnsignedByte() == 1;
	}

	@Override
	void method1906(class511 var1) {
		var1.method2420(this.field2428, this.field2429);
	}
}
