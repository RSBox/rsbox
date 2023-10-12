public class class461 extends class551 {
	byte field3158;
	int field3157;
	int field3159;
	String field3160;
	// $FF: synthetic field
	final class328 this$0;

	class461(class328 var1) {
		this.this$0 = var1;
		this.field3157 = -1;
	}

	@Override
	void method2632(Buffer var1) {
		this.field3157 = var1.readUnsignedShort();
		this.field3158 = var1.readByte();
		this.field3159 = var1.readUnsignedShort();
		var1.readLong();
		this.field3160 = var1.readStringOrNull();
	}

	@Override
	void method2633(class398 var1) {
		class455 var3 = (class455)var1.field2738.get(this.field3157);
		var3.field3018 = this.field3158;
		var3.field3019 = this.field3159;
		var3.field3021 = new class509(this.field3160);
	}
}
