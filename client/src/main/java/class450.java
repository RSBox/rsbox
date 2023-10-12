public class class450 {
	public static final int[] field2985;

	static {
		field2985 = new int[]{16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472};
	}

	public static class341 method2109(int var0, String var1, class66 var2, int var3) {
		class341 var5 = class341.createClientPacket(ClientPacket.field3136, Client.field1891.field4219);
		var5.buffer.writeByte(0);
		int var6 = var5.buffer.offset;
		var5.buffer.writeByte(var0);
		String var7 = var1.toLowerCase();
		int var8 = 0;
		byte[] var9 = null;
		if (var7.startsWith(class513.field3804)) {
			var8 = 0;
			var1 = var1.substring(class513.field3804.length());
		} else if (var7.startsWith(class513.field3940)) {
			var8 = 1;
			var1 = var1.substring(class513.field3940.length());
		} else if (var7.startsWith(class513.field3941)) {
			var8 = 2;
			var1 = var1.substring(class513.field3941.length());
		} else if (var7.startsWith(class513.field3957)) {
			var8 = 3;
			var1 = var1.substring(class513.field3957.length());
		} else if (var7.startsWith(class513.field3943)) {
			var8 = 4;
			var1 = var1.substring(class513.field3943.length());
		} else if (var7.startsWith(class513.field3944)) {
			var8 = 5;
			var1 = var1.substring(class513.field3944.length());
		} else if (var7.startsWith(class513.field3945)) {
			var8 = 6;
			var1 = var1.substring(class513.field3945.length());
		} else if (var7.startsWith(class513.field3798)) {
			var8 = 7;
			var1 = var1.substring(class513.field3798.length());
		} else if (var7.startsWith(class513.field3947)) {
			var8 = 8;
			var1 = var1.substring(class513.field3947.length());
		} else if (var7.startsWith(class513.field3948)) {
			var8 = 9;
			var1 = var1.substring(class513.field3948.length());
		} else if (var7.startsWith(class513.field3949)) {
			var8 = 10;
			var1 = var1.substring(class513.field3949.length());
		} else if (var7.startsWith(class513.field3950)) {
			var8 = 11;
			var1 = var1.substring(class513.field3950.length());
		} else if (var7.startsWith(class513.field3961)) {
			var8 = 12;
			var1 = var1.substring(class513.field3961.length());
		} else if (var7.startsWith(class513.field3952)) {
			var9 = method2110(var7);
			if (null != var9) {
				var8 = 12 + var9.length;
				var1 = var1.substring(class513.field3952.length() + var9.length + 1);
			}
		}

		var7 = var1.toLowerCase();
		byte var10 = 0;
		if (var7.startsWith(class513.field3953)) {
			var10 = 1;
			var1 = var1.substring(class513.field3953.length());
		} else if (var7.startsWith(class513.field3954)) {
			var10 = 2;
			var1 = var1.substring(class513.field3954.length());
		} else if (var7.startsWith(class513.field3955)) {
			var10 = 3;
			var1 = var1.substring(class513.field3955.length());
		} else if (var7.startsWith(class513.field3758)) {
			var10 = 4;
			var1 = var1.substring(class513.field3758.length());
		} else if (var7.startsWith(class513.field3942)) {
			var10 = 5;
			var1 = var1.substring(class513.field3942.length());
		}

		var5.buffer.writeByte(var8);
		var5.buffer.writeByte(var10);
		if (var9 != null && Client.field1841 >= 214) {
			for (int var11 = 0; var11 < var9.length; ++var11) {
				var5.buffer.writeByte(var9[var11]);
			}
		}

		class380.method1791(var5.buffer, var1);
		if (var0 == class391.field2665.getId()) {
			var5.buffer.writeByte(var3);
		}

		var5.buffer.writeLengthBytes(var5.buffer.offset - var6);
		return var5;
	}

	static byte[] method2110(String var0) {
		boolean var2 = true;
		boolean var3 = true;
		int var4 = class513.field3952.length();
		int var5 = 0;
		byte[] var6 = new byte[8];

		while (true) {
			int var7 = var4 + var5;
			if (var7 >= var0.length()) {
				return null;
			}

			char var8 = var0.charAt(var7);
			if (var8 == ':') {
				if (var5 == 0) {
					return null;
				}

				byte[] var9 = new byte[var5];
				System.arraycopy(var6, 0, var9, 0, var5);
				return var9;
			}

			if (var5 == var6.length) {
				return null;
			}

			if (var8 >= '0' && var8 <= '9') {
				var8 = (char)(var8 - '0');
			} else {
				if (var8 < 'a' || var8 > 'z') {
					return null;
				}

				var8 = (char)(var8 - 'W');
			}

			var6[var5++] = (byte)var8;
		}
	}
}
