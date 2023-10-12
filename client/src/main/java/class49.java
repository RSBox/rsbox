public class class49 extends class551 {
	static class42[] field236;
	byte field235;
	int field234;
	String field237;
	// $FF: synthetic field
	final class328 this$0;

	class49(class328 var1) {
		this.this$0 = var1;
		this.field237 = null;
	}

	@Override
	void method2632(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field237 = var1.readString();
		this.field234 = var1.readUnsignedShort();
		this.field235 = var1.readByte();
		var1.readLong();
	}

	@Override
	void method2633(class398 var1) {
		class455 var3 = new class455();
		var3.field3021 = new class509(this.field237);
		var3.field3019 = this.field234;
		var3.field3018 = this.field235;
		var1.method1852(var3);
	}
}
