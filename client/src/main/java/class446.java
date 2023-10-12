public class class446 extends class551 {
	static int field2981;
	int field2980;
	// $FF: synthetic field
	final class328 this$0;

	class446(class328 var1) {
		this.this$0 = var1;
		this.field2980 = -1;
	}

	@Override
	void method2632(Buffer var1) {
		this.field2980 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@Override
	void method2633(class398 var1) {
		var1.method1853(this.field2980);
	}
}
