public class class70 {
	static int field441;
	String field444;
	String field445;
	public final class480 field443;
	public final int field446;
	public final long field442;

	class70(Buffer var1, byte var2, int var3) {
		this.field444 = var1.readStringOrNull();
		this.field445 = var1.readStringOrNull();
		this.field446 = var1.readUnsignedShort();
		this.field442 = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.field443 = new class480();
		this.field443.method2206(2);
		this.field443.method2207(var2);
		this.field443.field3374 = var4;
		this.field443.field3372 = var5;
		this.field443.field3376 = 0;
		this.field443.field3377 = 0;
		this.field443.field3373 = var3;
	}

	public String method334() {
		return this.field444;
	}

	public String method335() {
		return this.field445;
	}
}
