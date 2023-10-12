public class class226 extends class415 {
	String field1472;
	// $FF: synthetic field
	final class14 this$0;

	class226(class14 var1) {
		this.this$0 = var1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field1472 = var1.readStringOrNull();
		var1.readInt();
	}

	@Override
	void method1906(class511 var1) {
		var1.field3724 = this.field1472;
	}
}
