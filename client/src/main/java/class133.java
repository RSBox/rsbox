public class class133 extends class415 {
	int field856;
	int field857;
	// $FF: synthetic field
	final class14 this$0;

	class133(class14 var1) {
		this.this$0 = var1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field857 = var1.readInt();
		this.field856 = var1.readInt();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2426(this.field857, this.field856);
	}
}
