public class class396 extends class415 {
	static int field2684;
	static String[] field2682;
	int field2681;
	String field2680;
	long field2683;
	// $FF: synthetic field
	final class14 this$0;

	class396(class14 var1) {
		this.this$0 = var1;
		this.field2683 = -1L;
		this.field2680 = null;
		this.field2681 = 0;
	}

	@Override
	void method1905(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field2683 = var1.readLong();
		}

		this.field2680 = var1.readString();
		this.field2681 = var1.readUnsignedShort();
	}

	@Override
	void method1906(class511 var1) {
		var1.method2415(this.field2683, this.field2680, this.field2681);
	}
}
