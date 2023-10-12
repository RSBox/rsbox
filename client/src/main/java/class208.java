public class class208 {
	public static short[][] field1385;
	static class417 field1384;
	static class72 interfaceConfigs;
	int field1381;
	int field1382;

	class208(int var1, int var2) {
		this.field1381 = var1;
		this.field1382 = var2;
	}

	boolean method977(class305 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field1381) {
			case 1:
				return var1.method1558(this.field1382);
			case 2:
				return var1.method1555(this.field1382);
			case 3:
				return var1.method1557((char)this.field1382, (byte)19);
			case 4:
				return var1.method1556(this.field1382 == 1);
			default:
				return false;
			}
		}
	}

	static final void method978(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		class341 var10;
		if (var2 == 16) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3137, Client.field1891.field4219);
			var10.buffer.writeShortLEADD(class65.field405);
			var10.buffer.writeShortLE(var3);
			var10.buffer.writeIntME(class406.field2788);
			var10.buffer.writeShortLEADD(var0 + class80.selectedTileX);
			var10.buffer.writeShort(class457.field3043);
			var10.buffer.writeByteSUB(Client.field2067.method1798(82) ? 1 : 0);
			var10.buffer.writeShortLE(class425.selectedTileXYIdk + var1);
			Client.field1891.method2612(var10);
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
			class520.field4103.method1185(var2, var3, new class370(var0), new class370(var1));
		}

		class496 var11;
		int var12;
		if (var2 == 28) {
			var10 = class341.createClientPacket(ClientPacket.field3080, Client.field1891.field4219);
			var10.buffer.writeInt(var1);
			Client.field1891.method2612(var10);
			var11 = interfaceConfigs.method345(var1);
			if (var11 != null && null != var11.field3576 && var11.field3576[0][0] == 5) {
				var12 = var11.field3576[0][1];
				class119.field786[var12] = 1 - class119.field786[var12];
				Client.method1329(var12);
			}
		}

		if (var2 == 4) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3116, Client.field1891.field4219);
			var10.buffer.writeShortLEADD(var3);
			var10.buffer.writeByteNEG(Client.field2067.method1798(82) ? 1 : 0);
			var10.buffer.writeShortLEADD(class80.selectedTileX + var0);
			var10.buffer.writeShortLE(var1 + class425.selectedTileXYIdk);
			Client.field1891.method2612(var10);
		}

		if (var2 == 1) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3066, Client.field1891.field4219);
			var10.buffer.writeIntIME(class406.field2788);
			var10.buffer.writeShortLE(var0 + class80.selectedTileX);
			var10.buffer.writeShort(class65.field405);
			var10.buffer.writeShortLEADD(class457.field3043);
			var10.buffer.writeShort(var3);
			var10.buffer.writeByteNEG(Client.field2067.method1798(82) ? 1 : 0);
			var10.buffer.writeShortADD(var1 + class425.selectedTileXYIdk);
			Client.field1891.method2612(var10);
		}

		if (var2 == 20) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3134, Client.field1891.field4219);
			var10.buffer.writeShortLE(class425.selectedTileXYIdk + var1);
			var10.buffer.writeShortADD(var3);
			var10.buffer.writeShortADD(var0 + class80.selectedTileX);
			var10.buffer.writeByteADD(Client.field2067.method1798(82) ? 1 : 0);
			Client.field1891.method2612(var10);
		}

		class341 var13;
		class378 var14;
		if (var2 == 7) {
			var14 = Client.field2017[var3];
			if (var14 != null) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3073, Client.field1891.field4219);
				var13.buffer.writeShortLEADD(class65.field405);
				var13.buffer.writeByteSUB(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeInt(class406.field2788);
				var13.buffer.writeShortLE(var3);
				var13.buffer.writeShortADD(class457.field3043);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 6) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3124, Client.field1891.field4219);
			var10.buffer.writeShortLE(var1 + class425.selectedTileXYIdk);
			var10.buffer.writeShortADD(var3);
			var10.buffer.writeShortADD(var0 + class80.selectedTileX);
			var10.buffer.writeByteSUB(Client.field2067.method1798(82) ? 1 : 0);
			Client.field1891.method2612(var10);
		}

		Player var15;
		if (var2 == 14) {
			var15 = Client.field2037[var3];
			if (var15 != null) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3058, Client.field1891.field4219);
				var13.buffer.writeIntME(class406.field2788);
				var13.buffer.writeShortLEADD(class65.field405);
				var13.buffer.writeByte(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeShortLEADD(var3);
				var13.buffer.writeShortADD(class457.field3043);
				Client.field1891.method2612(var13);
			}
		}

		class496 var17;
		if (var2 == 57 || var2 == 1007) {
			var17 = interfaceConfigs.method346(var1, var0);
			if (var17 != null) {
				Client.method1411(var3, var1, var0, var4, var6);
			}
		}

		if (var2 == 48) {
			var15 = Client.field2037[var3];
			if (null != var15) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3130, Client.field1891.field4219);
				var13.buffer.writeByteNEG(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeShortLE(var3);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 50) {
			var15 = Client.field2037[var3];
			if (var15 != null) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3122, Client.field1891.field4219);
				var13.buffer.writeByte(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeShort(var3);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 23) {
			if (Client.field1978) {
				class141.field937.method760();
			} else {
				class141.field937.method759(class212.field1393, var0, var1, true);
			}
		}

		if (var2 == 13) {
			var14 = Client.field2017[var3];
			if (var14 != null) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3107, Client.field1891.field4219);
				var13.buffer.writeByte(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeShortLE(var3);
				Client.field1891.method2612(var13);
			}
		}

		class341 var16;
		if (var2 == 1003) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			var14 = Client.field2017[var3];
			if (var14 != null) {
				class73 var18 = var14.field2605;
				if (null != var18.field477) {
					var18 = var18.method363();
				}

				if (null != var18) {
					var16 = class341.createClientPacket(ClientPacket.field3112, Client.field1891.field4219);
					var16.buffer.writeShortADD(var18.field517);
					Client.field1891.method2612(var16);
				}
			}
		}

		if (var2 == 21) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3079, Client.field1891.field4219);
			var10.buffer.writeShortLEADD(var3);
			var10.buffer.writeShort(var0 + class80.selectedTileX);
			var10.buffer.writeShort(var1 + class425.selectedTileXYIdk);
			var10.buffer.writeByteSUB(Client.field2067.method1798(82) ? 1 : 0);
			Client.field1891.method2612(var10);
		}

		if (var2 == 44) {
			var15 = Client.field2037[var3];
			if (null != var15) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3055, Client.field1891.field4219);
				var13.buffer.writeByteADD(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeShortADD(var3);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 11) {
			var14 = Client.field2017[var3];
			if (null != var14) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3090, Client.field1891.field4219);
				var13.buffer.writeByteADD(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeShortADD(var3);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 5) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3118, Client.field1891.field4219);
			var10.buffer.writeShortADD(class425.selectedTileXYIdk + var1);
			var10.buffer.writeShort(var3);
			var10.buffer.writeShortLE(class80.selectedTileX + var0);
			var10.buffer.writeByteNEG(Client.field2067.method1798(82) ? 1 : 0);
			Client.field1891.method2612(var10);
		}

		if (var2 == 15) {
			var15 = Client.field2037[var3];
			if (var15 != null) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3086, Client.field1891.field4219);
				var13.buffer.writeShort(Client.field1999);
				var13.buffer.writeShortLEADD(Client.field1898);
				var13.buffer.writeIntLE(class258.field1755);
				var13.buffer.writeShortLE(var3);
				var13.buffer.writeByteADD(Client.field2067.method1798(82) ? 1 : 0);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 51) {
			var15 = Client.field2037[var3];
			if (var15 != null) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3084, Client.field1891.field4219);
				var13.buffer.writeByte(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeShortLE(var3);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 22) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3060, Client.field1891.field4219);
			var10.buffer.writeByteSUB(Client.field2067.method1798(82) ? 1 : 0);
			var10.buffer.writeShort(var1 + class425.selectedTileXYIdk);
			var10.buffer.writeShortLE(var0 + class80.selectedTileX);
			var10.buffer.writeShortADD(var3);
			Client.field1891.method2612(var10);
		}

		if (var2 == 24) {
			var17 = interfaceConfigs.method345(var1);
			if (var17 != null) {
				boolean var19 = true;
				if (var17.field3529 > 0) {
					var19 = Client.method1388(var17);
				}

				if (var19) {
					var16 = class341.createClientPacket(ClientPacket.field3080, Client.field1891.field4219);
					var16.buffer.writeInt(var1);
					Client.field1891.method2612(var16);
				}
			}
		}

		if (var2 == 2) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3135, Client.field1891.field4219);
			var10.buffer.writeByteNEG(Client.field2067.method1798(82) ? 1 : 0);
			var10.buffer.writeShortADD(Client.field1898);
			var10.buffer.writeShort(var0 + class80.selectedTileX);
			var10.buffer.writeIntIME(class258.field1755);
			var10.buffer.writeShortLE(var3);
			var10.buffer.writeShortLE(var1 + class425.selectedTileXYIdk);
			var10.buffer.writeShortLEADD(Client.field1999);
			Client.field1891.method2612(var10);
		}

		if (var2 == 30 && null == Client.field1936) {
			Client.method1372(var1, var0);
			Client.field1936 = interfaceConfigs.method346(var1, var0);
			Client.method1363(Client.field1936);
		}

		if (var2 == 12) {
			var14 = Client.field2017[var3];
			if (var14 != null) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3114, Client.field1891.field4219);
				var13.buffer.writeByteNEG(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeShort(var3);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 9) {
			var14 = Client.field2017[var3];
			if (var14 != null) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3115, Client.field1891.field4219);
				var13.buffer.writeShortLEADD(var3);
				var13.buffer.writeByte(Client.field2067.method1798(82) ? 1 : 0);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 49) {
			var15 = Client.field2037[var3];
			if (var15 != null) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3094, Client.field1891.field4219);
				var13.buffer.writeByteNEG(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeShortLE(var3);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 19) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3096, Client.field1891.field4219);
			var10.buffer.writeShortADD(var0 + class80.selectedTileX);
			var10.buffer.writeShort(var1 + class425.selectedTileXYIdk);
			var10.buffer.writeByteSUB(Client.field2067.method1798(82) ? 1 : 0);
			var10.buffer.writeShortLEADD(var3);
			Client.field1891.method2612(var10);
		}

		if (var2 == 1002) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			var10 = class341.createClientPacket(ClientPacket.field3077, Client.field1891.field4219);
			var10.buffer.writeShortLEADD(var3);
			Client.field1891.method2612(var10);
		}

		if (var2 == 17) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3140, Client.field1891.field4219);
			var10.buffer.writeShortLEADD(var3);
			var10.buffer.writeByteADD(Client.field2067.method1798(82) ? 1 : 0);
			var10.buffer.writeInt(class258.field1755);
			var10.buffer.writeShort(Client.field1999);
			var10.buffer.writeShortADD(var1 + class425.selectedTileXYIdk);
			var10.buffer.writeShortADD(class80.selectedTileX + var0);
			var10.buffer.writeShortLE(Client.field1898);
			Client.field1891.method2612(var10);
		}

		if (var2 == 46) {
			var15 = Client.field2037[var3];
			if (null != var15) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3072, Client.field1891.field4219);
				var13.buffer.writeShortLEADD(var3);
				var13.buffer.writeByte(Client.field2067.method1798(82) ? 1 : 0);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 3) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3064, Client.field1891.field4219);
			var10.buffer.writeShortLEADD(class80.selectedTileX + var0);
			var10.buffer.writeShortADD(var1 + class425.selectedTileXYIdk);
			var10.buffer.writeShortADD(var3);
			var10.buffer.writeByte(Client.field2067.method1798(82) ? 1 : 0);
			Client.field1891.method2612(var10);
		}

		if (var2 == 45) {
			var15 = Client.field2037[var3];
			if (null != var15) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3098, Client.field1891.field4219);
				var13.buffer.writeByteSUB(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeShort(var3);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 10) {
			var14 = Client.field2017[var3];
			if (null != var14) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3057, Client.field1891.field4219);
				var13.buffer.writeByteADD(Client.field2067.method1798(82) ? 1 : 0);
				var13.buffer.writeShortLEADD(var3);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 1004) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			var10 = class341.createClientPacket(ClientPacket.field3076, Client.field1891.field4219);
			var10.buffer.writeShort(class425.selectedTileXYIdk + var1);
			var10.buffer.writeShort(class80.selectedTileX + var0);
			var10.buffer.writeShortLEADD(var3);
			Client.field1891.method2612(var10);
		}

		if (var2 == 58) {
			var17 = interfaceConfigs.method346(var1, var0);
			if (null != var17) {
				if (null != var17.field3632) {
					class376 var20 = new class376();
					var20.field2595 = var17;
					var20.field2589 = var3;
					var20.field2584 = var6;
					var20.field2594 = var17.field3632;
					class440.method2027(var20);
				}

				var13 = class341.createClientPacket(ClientPacket.field3082, Client.field1891.field4219);
				var13.buffer.writeShortADD(Client.field1898);
				var13.buffer.writeInt(var1);
				var13.buffer.writeShortLEADD(var4);
				var13.buffer.writeIntIME(class258.field1755);
				var13.buffer.writeShortADD(Client.field1999);
				var13.buffer.writeShortADD(var0);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 18) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3075, Client.field1891.field4219);
			var10.buffer.writeShortLEADD(class425.selectedTileXYIdk + var1);
			var10.buffer.writeByteSUB(Client.field2067.method1798(82) ? 1 : 0);
			var10.buffer.writeShortLEADD(class80.selectedTileX + var0);
			var10.buffer.writeShort(var3);
			Client.field1891.method2612(var10);
		}

		if (var2 == 1001) {
			Client.field1849 = var7;
			Client.field1951 = var8;
			Client.field1953 = 2;
			Client.field2073 = 0;
			Client.field1840 = var0;
			Client.field2081 = var1;
			var10 = class341.createClientPacket(ClientPacket.field3070, Client.field1891.field4219);
			var10.buffer.writeShort(var3);
			var10.buffer.writeShortLEADD(var1 + class425.selectedTileXYIdk);
			var10.buffer.writeShortLEADD(var0 + class80.selectedTileX);
			var10.buffer.writeByteNEG(Client.field2067.method1798(82) ? 1 : 0);
			Client.field1891.method2612(var10);
		}

		if (var2 == 29) {
			var10 = class341.createClientPacket(ClientPacket.field3080, Client.field1891.field4219);
			var10.buffer.writeInt(var1);
			Client.field1891.method2612(var10);
			var11 = interfaceConfigs.method345(var1);
			if (var11 != null && null != var11.field3576 && var11.field3576[0][0] == 5) {
				var12 = var11.field3576[0][1];
				if (class119.field786[var12] != var11.field3649[0]) {
					class119.field786[var12] = var11.field3649[0];
					Client.method1329(var12);
				}
			}
		}

		if (var2 == 47) {
			var15 = Client.field2037[var3];
			if (null != var15) {
				Client.field1849 = var7;
				Client.field1951 = var8;
				Client.field1953 = 2;
				Client.field2073 = 0;
				Client.field1840 = var0;
				Client.field2081 = var1;
				var13 = class341.createClientPacket(ClientPacket.field3111, Client.field1891.field4219);
				var13.buffer.writeShortADD(var3);
				var13.buffer.writeByteNEG(Client.field2067.method1798(82) ? 1 : 0);
				Client.field1891.method2612(var13);
			}
		}

		if (var2 == 26) {
			Client.method1321();
		}

		if (var2 == 25) {
			var17 = interfaceConfigs.method346(var1, var0);
			if (null != var17) {
				Client.method1423();
				Client.method1461(var1, var0, class134.method618(Client.method1335(var17)), var4);
				Client.field1892 = 0;
				Client.field2063 = Client.method1364(var17);
				if (Client.field2063 == null) {
					Client.field2063 = class513.field3757;
				}

				if (var17.field3523) {
					Client.field2001 = var17.field3564 + class274.method1266(16777215);
				} else {
					Client.field2001 = class274.method1266(65280) + var17.field3651 + class274.method1266(16777215);
				}
			}

		} else {
			if (var2 == 8) {
				var14 = Client.field2017[var3];
				if (null != var14) {
					Client.field1849 = var7;
					Client.field1951 = var8;
					Client.field1953 = 2;
					Client.field2073 = 0;
					Client.field1840 = var0;
					Client.field2081 = var1;
					var13 = class341.createClientPacket(ClientPacket.field3141, Client.field1891.field4219);
					var13.buffer.writeIntIME(class258.field1755);
					var13.buffer.writeShortLEADD(Client.field1999);
					var13.buffer.writeByteADD(Client.field2067.method1798(82) ? 1 : 0);
					var13.buffer.writeShortLE(Client.field1898);
					var13.buffer.writeShortADD(var3);
					Client.field1891.method2612(var13);
				}
			}

			if (Client.field1892 != 0) {
				Client.field1892 = 0;
				Client.method1363(interfaceConfigs.method345(class406.field2788));
			}

			if (Client.field1997) {
				Client.method1423();
			}

		}
	}
}
