public class class363 extends class359 {
	boolean field2491;
	boolean field2498;
	int field2485;
	int field2487;
	int field2489;
	int field2490;
	int field2492;
	int field2493;
	int field2494;
	int field2495;
	int field2497;
	int field2499;
	int field2502;
	int field2503;
	int field2504;
	int field2506;
	int field2508;
	int[] field2507;
	String field2486;
	String field2488;
	String field2496;
	String field2500;
	String field2501;
	String field2505;
	String field2509;
	String field2510;

	class363(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field2507 = new int[3];
		this.field2490 = var1;
		this.field2498 = var2;
		this.field2492 = var3;
		this.field2493 = var4;
		this.field2494 = var5;
		this.field2495 = var6;
		this.field2506 = var7;
		this.field2491 = var8;
		this.field2497 = var9;
		this.field2485 = var10;
		this.field2487 = var11;
		this.field2499 = var12;
		this.field2500 = var13;
		this.field2501 = var14;
		this.field2496 = var15;
		this.field2488 = var16;
		this.field2489 = var17;
		this.field2503 = var18;
		this.field2504 = var19;
		this.field2502 = var20;
		this.field2505 = var21;
		this.field2486 = var22;
		this.field2507 = var23;
		this.field2508 = var24;
		this.field2509 = var25;
		this.field2510 = var26;
	}

	public void method1729(Buffer var1) {
		var1.writeByte(9);
		var1.writeByte(this.field2490);
		var1.writeByte(this.field2498 ? 1 : 0);
		var1.writeShort(this.field2492);
		var1.writeByte(this.field2493);
		var1.writeByte(this.field2494);
		var1.writeByte(this.field2495);
		var1.writeByte(this.field2506);
		var1.writeByte(this.field2491 ? 1 : 0);
		var1.writeShort(this.field2497);
		var1.writeByte(this.field2485);
		var1.writeMedium(this.field2487);
		var1.writeShort(this.field2499);
		var1.writeJagexString(this.field2500);
		var1.writeJagexString(this.field2501);
		var1.writeJagexString(this.field2496);
		var1.writeJagexString(this.field2488);
		var1.writeByte(this.field2503);
		var1.writeShort(this.field2489);
		var1.writeJagexString(this.field2505);
		var1.writeJagexString(this.field2486);
		var1.writeByte(this.field2504);
		var1.writeByte(this.field2502);

		for (int var3 = 0; var3 < this.field2507.length; ++var3) {
			var1.writeInt(this.field2507[var3]);
		}

		var1.writeInt(this.field2508);
		var1.writeJagexString(this.field2509);
		var1.writeJagexString(this.field2510);
	}

	public int method1730() {
		boolean var2 = true;
		boolean var3 = true;
		String var5 = this.field2500;
		int var4 = var5.length() + 2;
		int var27 = 39 + var4;
		String var8 = this.field2501;
		int var7 = var8.length() + 2;
		var27 += var7;
		String var11 = this.field2496;
		int var10 = var11.length() + 2;
		var27 += var10;
		String var14 = this.field2488;
		int var13 = var14.length() + 2;
		var27 += var13;
		String var17 = this.field2505;
		int var16 = var17.length() + 2;
		var27 += var16;
		String var20 = this.field2486;
		int var19 = var20.length() + 2;
		var27 += var19;
		String var23 = this.field2509;
		int var22 = var23.length() + 2;
		var27 += var22;
		String var26 = this.field2510;
		int var25 = var26.length() + 2;
		var27 += var25;
		return var27;
	}
}
