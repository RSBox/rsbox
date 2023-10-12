public class class200 implements class501 {
	static final class200 field1350;
	static final class200 field1351;
	static final class200 field1352;
	static final class200 field1353;
	final byte field1354;
	final int field1355;

	static {
		field1353 = new class200(0, (byte)0);
		field1350 = new class200(2, (byte)1);
		field1351 = new class200(1, (byte)2);
		field1352 = new class200(3, (byte)3);
	}

	class200(int var1, byte var2) {
		this.field1355 = var1;
		this.field1354 = var2;
	}

	@Override
	public int getId() {
		return this.field1354;
	}

	static void method967(PacketBuffer var0, int var1) {
		boolean var3 = var0.method1501(1) == 1;
		if (var3) {
			class264.field1773[++class264.field1771 - 1] = var1;
		}

		int var4 = var0.method1501(2);
		Player var5 = Client.field2037[var1];
		if (var4 == 0) {
			if (var3) {
				var5.teleporting = false;
			} else if (var1 == Client.field1958) {
				throw new RuntimeException();
			} else {
				class264.field1768[var1] = (var5.field399[0] + class80.selectedTileX >> 13 << 14) + (var5.field3009 << 28) + (class425.selectedTileXYIdk + var5.field400[0] >> 13);
				if (var5.field365 != -1) {
					class264.field1769[var1] = var5.field365;
				} else {
					class264.field1769[var1] = var5.field351;
				}

				class264.field1770[var1] = var5.field363;
				Client.field2037[var1] = null;
				if (var0.method1501(1) != 0) {
					class264.method1238(var0, var1);
				}

			}
		} else {
			int var6;
			int var7;
			int var8;
			if (var4 == 1) {
				var6 = var0.method1501(3);
				var7 = var5.field399[0];
				var8 = var5.field400[0];
				if (var6 == 0) {
					--var7;
					--var8;
				} else if (var6 == 1) {
					--var8;
				} else if (var6 == 2) {
					++var7;
					--var8;
				} else if (var6 == 3) {
					--var7;
				} else if (var6 == 4) {
					++var7;
				} else if (var6 == 5) {
					--var7;
					++var8;
				} else if (var6 == 6) {
					++var8;
				} else if (var6 == 7) {
					++var7;
					++var8;
				}

				if (var1 == Client.field1958 && (var5.field368 < 1536 || var5.field329 < 1536 || var5.field368 >= 11776 || var5.field329 >= 11776)) {
					var5.teleport(var7, var8);
					var5.teleporting = false;
				} else if (var3) {
					var5.teleporting = true;
					var5.field3010 = var7;
					var5.field3016 = var8;
				} else {
					var5.teleporting = false;
					var5.moveTo(var7, var8, class264.movementTypesCached[var1]);
				}

			} else if (var4 == 2) {
				var6 = var0.method1501(4);
				var7 = var5.field399[0];
				var8 = var5.field400[0];
				if (var6 == 0) {
					var7 -= 2;
					var8 -= 2;
				} else if (var6 == 1) {
					--var7;
					var8 -= 2;
				} else if (var6 == 2) {
					var8 -= 2;
				} else if (var6 == 3) {
					++var7;
					var8 -= 2;
				} else if (var6 == 4) {
					var7 += 2;
					var8 -= 2;
				} else if (var6 == 5) {
					var7 -= 2;
					--var8;
				} else if (var6 == 6) {
					var7 += 2;
					--var8;
				} else if (var6 == 7) {
					var7 -= 2;
				} else if (var6 == 8) {
					var7 += 2;
				} else if (var6 == 9) {
					var7 -= 2;
					++var8;
				} else if (var6 == 10) {
					var7 += 2;
					++var8;
				} else if (var6 == 11) {
					var7 -= 2;
					var8 += 2;
				} else if (var6 == 12) {
					--var7;
					var8 += 2;
				} else if (var6 == 13) {
					var8 += 2;
				} else if (var6 == 14) {
					++var7;
					var8 += 2;
				} else if (var6 == 15) {
					var7 += 2;
					var8 += 2;
				}

				if (var1 != Client.field1958 || var5.field368 >= 1536 && var5.field329 >= 1536 && var5.field368 < 11776 && var5.field329 < 11776) {
					if (var3) {
						var5.teleporting = true;
						var5.field3010 = var7;
						var5.field3016 = var8;
					} else {
						var5.teleporting = false;
						var5.moveTo(var7, var8, class264.movementTypesCached[var1]);
					}
				} else {
					var5.teleport(var7, var8);
					var5.teleporting = false;
				}

			} else {
				var6 = var0.method1501(1);
				int var9;
				int var10;
				int var11;
				int var12;
				if (var6 == 0) {
					var7 = var0.method1501(12);
					var8 = var7 >> 10;
					var9 = var7 >> 5 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var7 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}

					var11 = var5.field399[0] + var9;
					var12 = var10 + var5.field400[0];
					if (var1 != Client.field1958 || var5.field368 >= 1536 && var5.field329 >= 1536 && var5.field368 < 11776 && var5.field329 < 11776) {
						if (var3) {
							var5.teleporting = true;
							var5.field3010 = var11;
							var5.field3016 = var12;
						} else {
							var5.teleporting = false;
							var5.moveTo(var11, var12, class264.movementTypesCached[var1]);
						}
					} else {
						var5.teleport(var11, var12);
						var5.teleporting = false;
					}

					var5.field3009 = (byte)(var8 + var5.field3009 & 3);
					if (var1 == Client.field1958) {
						class212.field1393 = var5.field3009;
					}

				} else {
					var7 = var0.method1501(30);
					var8 = var7 >> 28;
					var9 = var7 >> 14 & 16383;
					var10 = var7 & 16383;
					var11 = (var5.field399[0] + class80.selectedTileX + var9 & 16383) - class80.selectedTileX;
					var12 = (class425.selectedTileXYIdk + var5.field400[0] + var10 & 16383) - class425.selectedTileXYIdk;
					if (Client.field1958 == var1 && (var5.field368 < 1536 || var5.field329 < 1536 || var5.field368 >= 11776 || var5.field329 >= 11776)) {
						var5.teleport(var11, var12);
						var5.teleporting = false;
					} else if (var3) {
						var5.teleporting = true;
						var5.field3010 = var11;
						var5.field3016 = var12;
					} else {
						var5.teleporting = false;
						var5.moveTo(var11, var12, class264.movementTypesCached[var1]);
					}

					var5.field3009 = (byte)(var5.field3009 + var8 & 3);
					if (var1 == Client.field1958) {
						class212.field1393 = var5.field3009;
					}

				}
			}
		}
	}
}
