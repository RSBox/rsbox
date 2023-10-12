public class class205 extends class292 {
	public static int[] field1376;
	static class230 field1372;
	byte field1374;
	class198 field1373;
	int field1375;

	class205() {
	}

	static final byte[] method972(byte[] var0) {
		Buffer var2 = new Buffer(var0);
		int var3 = var2.readUnsignedByte();
		int var4 = var2.readInt();
		if (var4 >= 0 && (class5.field30 == 0 || var4 <= class5.field30)) {
			if (var3 == 0) {
				byte[] var7 = new byte[var4];
				var2.readBytes(var7, 0, var4);
				return var7;
			} else {
				int var5 = var2.readInt();
				if (var5 < 0 || class5.field30 != 0 && var5 > class5.field30) {
					throw new RuntimeException();
				} else {
					byte[] var6 = new byte[var5];
					if (var3 == 1) {
						class470.method2183(var6, var5, var0, var4, 9);
					} else {
						class5.field26.method211(var2, var6);
					}

					return var6;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}
}
