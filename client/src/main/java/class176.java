public class class176 extends class227 {
	static int field1223;
	static int field1224;
	int field1225;
	// $FF: synthetic field
	final class57 this$0;

	class176(class57 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1225 = var3;
	}

	@Override
	public int method1029() {
		return 0;
	}

	@Override
	public int method1027() {
		return this.field1225;
	}

	static final void decodeGPI(PacketBuffer var0) {
		var0.method1497();
		int var2 = Client.field1958;
		Player var3 = class114.field720 = Client.field2037[var2] = new Player();
		var3.field3001 = var2;
		int var4 = var0.method1501(30);
		byte var5 = (byte)(var4 >> 28);
		int var6 = var4 >> 14 & 16383;
		int var7 = var4 & 16383;
		var3.field399[0] = var6 - class80.selectedTileX;
		var3.field368 = (var3.field399[0] << 7) + (var3.method2120() << 6);
		var3.field400[0] = var7 - class425.selectedTileXYIdk;
		var3.field329 = (var3.field400[0] << 7) + (var3.method2120() << 6);
		class212.field1393 = var3.field3009 = var5;
		if (null != class264.cachedPlayerAppearances[var2]) {
			var3.decode(class264.cachedPlayerAppearances[var2]);
		}

		class264.field1764 = 0;
		class264.field1765[++class264.field1764 - 1] = var2;
		class264.field1767[var2] = 0;
		class264.field1766 = 0;

		for (int var8 = 1; var8 < 2048; ++var8) {
			if (var2 != var8) {
				int var9 = var0.method1501(18);
				int var10 = var9 >> 16;
				int var11 = var9 >> 8 & 597;
				int var12 = var9 & 597;
				class264.field1768[var8] = var12 + (var11 << 14) + (var10 << 28);
				class264.field1769[var8] = 0;
				class264.field1770[var8] = -1;
				class264.field1772[++class264.field1766 - 1] = var8;
				class264.field1767[var8] = 0;
			}
		}

		var0.method1504();
	}

	static void method923(int var0) {
		Client.field1923 = var0;
	}
}
