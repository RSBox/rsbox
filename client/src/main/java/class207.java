public class class207 extends class415 {
	static String field1379;
	int field1380;
	String field1378;
	// $FF: synthetic field
	final class14 this$0;

	class207(class14 var1) {
		this.this$0 = var1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field1380 = var1.readInt();
		this.field1378 = var1.readStringOrNull();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2424(this.field1380, this.field1378);
	}
}
