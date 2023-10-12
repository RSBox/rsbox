public class class290 extends class415 {
	static int field2175;
	int field2174;
	// $FF: synthetic field
	final class14 this$0;

	class290(class14 var1) {
		this.this$0 = var1;
		this.field2174 = -1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field2174 = var1.readUnsignedShort();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2419(this.field2174);
	}
}
