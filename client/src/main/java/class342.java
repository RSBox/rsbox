public class class342 extends class551 {
	static int[][] field2398;
	byte field2394;
	int field2395;
	int field2396;
	String field2397;
	// $FF: synthetic field
	final class328 this$0;

	class342(class328 var1) {
		this.this$0 = var1;
		this.field2395 = -1;
	}

	@Override
	void method2632(Buffer var1) {
		var1.readUnsignedByte();
		this.field2395 = var1.readUnsignedShort();
		this.field2394 = var1.readByte();
		this.field2396 = var1.readUnsignedShort();
		var1.readLong();
		this.field2397 = var1.readStringOrNull();
		var1.readUnsignedByte();
	}

	@Override
	void method2633(class398 var1) {
		class455 var3 = (class455)var1.field2738.get(this.field2395);
		var3.field3018 = this.field2394;
		var3.field3019 = this.field2396;
		var3.field3021 = new class509(this.field2397);
	}
}
