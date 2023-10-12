public class class155 extends class415 {
	int field1059;
	long field1058;
	// $FF: synthetic field
	final class14 this$0;

	class155(class14 var1) {
		this.this$0 = var1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field1059 = var1.readInt();
		this.field1058 = var1.readLong();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2410(this.field1059, this.field1058);
	}
}
