public class class329 extends class415 {
	int field2347;
	int field2348;
	int field2349;
	int field2350;
	// $FF: synthetic field
	final class14 this$0;

	class329(class14 var1) {
		this.this$0 = var1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field2350 = var1.readInt();
		this.field2349 = var1.readInt();
		this.field2347 = var1.readUnsignedByte();
		this.field2348 = var1.readUnsignedByte();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2423(this.field2350, this.field2349, this.field2347, this.field2348);
	}
}
