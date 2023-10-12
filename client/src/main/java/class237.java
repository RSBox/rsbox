public class class237 extends class415 {
	String field1565;
	long field1566;
	// $FF: synthetic field
	final class14 this$0;

	class237(class14 var1) {
		this.this$0 = var1;
		this.field1566 = -1L;
		this.field1565 = null;
	}

	@Override
	void method1905(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1566 = var1.readLong();
		}

		this.field1565 = var1.readString();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2415(this.field1566, this.field1565, 0);
	}
}
