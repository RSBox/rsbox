public class class529 extends class415 {
	static int[] field4140;
	boolean field4141;
	byte field4136;
	byte field4137;
	byte field4138;
	byte field4139;
	// $FF: synthetic field
	final class14 this$0;

	class529(class14 var1) {
		this.this$0 = var1;
	}

	@Override
	void method1905(Buffer var1) {
		this.field4141 = var1.readUnsignedByte() == 1;
		this.field4139 = var1.readByte();
		this.field4136 = var1.readByte();
		this.field4137 = var1.readByte();
		this.field4138 = var1.readByte();
	}

	@Override
	void method1906(class511 var1) {
		var1.field3726 = this.field4141;
		var1.field3728 = this.field4139;
		var1.field3741 = this.field4136;
		var1.field3729 = this.field4137;
		var1.field3719 = this.field4138;
	}
}
