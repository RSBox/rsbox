public class class264 {
	static byte[] field1767;
	static MovementType[] movementTypesCached;
	static Buffer field1762;
	static Buffer[] cachedPlayerAppearances;
	static int field1764;
	static int field1766;
	static int field1771;
	static int[] field1765;
	static int[] field1768;
	static int[] field1769;
	static int[] field1770;
	static int[] field1772;
	static int[] field1773;

	static {
		field1767 = new byte[2048];
		movementTypesCached = new MovementType[2048];
		cachedPlayerAppearances = new Buffer[2048];
		field1764 = 0;
		field1765 = new int[2048];
		field1766 = 0;
		field1772 = new int[2048];
		field1768 = new int[2048];
		field1769 = new int[2048];
		field1770 = new int[2048];
		field1771 = 0;
		field1773 = new int[2048];
		field1762 = new Buffer(new byte[5000]);
	}

	static final void readPlayerUpdates(PacketBuffer var0, int var1) {
		int var3 = var0.offset;
		field1771 = 0;
		method1239(var0);

		for (int var4 = 0; var4 < field1771; ++var4) {
			int var5 = field1773[var4];
			Player player = Client.field2037[var5];
			int var7 = var0.readUnsignedByte();
			if ((var7 & 0x1) != 0) {
				var7 += var0.readUnsignedByte() << 8;
			}

			if ((var7 & 0x1000) != 0) {
				var7 += var0.readUnsignedByte() << 16;
			}

			// : 1
			byte movementType = MovementType.NONE.id;
			int appBufLength;
			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			int var16;
			if ((var7 & 128) != 0) {
				appBufLength = var0.readUnsignedByteADD();
				if (appBufLength > 0) {
					for (var10 = 0; var10 < appBufLength; ++var10) {
						var12 = -1;
						var13 = -1;
						var14 = -1;
						var11 = var0.method2522();
						if (var11 == 32767) {
							var11 = var0.method2522();
							var13 = var0.method2522();
							var12 = var0.method2522();
							var14 = var0.method2522();
						} else if (var11 != 32766) {
							var13 = var0.method2522();
						} else {
							var11 = -1;
						}

						var15 = var0.method2522();
						player.method297(var11, var13, var12, var14, Client.field1846, var15);
					}
				}

				var10 = var0.readUnsignedByte();
				if (var10 > 0) {
					for (var11 = 0; var11 < var10; ++var11) {
						var12 = var0.method2522();
						var13 = var0.method2522();
						if (var13 != 32767) {
							var14 = var0.method2522();
							var15 = var0.readUnsignedByte();
							var16 = var13 > 0 ? var0.readUnsignedByteNEG() : var15;
							player.method290(var12, Client.field1846, var13, var14, var15, var16);
						} else {
							player.method293(var12);
						}
					}
				}
			}

			// : 2
			if ((var7 & 65536) != 0) {
				appBufLength = var0.readUnsignedByteADD();

				for (var10 = 0; var10 < appBufLength; ++var10) {
					var11 = var0.readUnsignedByte();
					var12 = var0.readUnsignedShortLE();
					var13 = var0.readUnsignedIntLE();
					player.method292(var11, var12, var13 >> 16, var13 & 65535);
				}
			}

			// : 3
			if ((var7 & 16) != 0) {
				player.field363 = var0.readUnsignedShortADD();
				player.field363 += var0.readUnsignedByteNEG() << 16;
				appBufLength = 16777215;
				if (player.field363 == 16777215) {
					player.field363 = -1;
				}
			}

			// : 4
			if ((var7 & 1024) != 0) {
				MovementType[] var24 = movementTypesCached;
				MovementType[] var29 = new MovementType[]{MovementType.CRAWL, MovementType.NONE, MovementType.WALK, MovementType.run};
				var24[var5] = (MovementType)class26.method87(var29, var0.readByte());
			}

			// : 5
			if ((var7 & 256) != 0) {
				player.field389 = Client.field1846 + var0.readUnsignedShortLE();
				player.field390 = Client.field1846 + var0.readUnsignedShortADD();
				player.field391 = var0.readByteNEG();
				player.field392 = var0.readByteADD();
				player.field393 = var0.readByteSUB();
				player.field394 = (byte)var0.readUnsignedByteNEG();
			}

			// : 6
			if ((var7 & 2) != 0) {
				player.field356 = var0.readStringOrNull();
				if (player.field356.charAt(0) == '~') {
					player.field356 = player.field356.substring(1);
					class346.method1672(2, player.field3005.method2398(), player.field356);
				} else if (class114.field720 == player) {
					class346.method1672(2, player.field3005.method2398(), player.field356);
				}

				player.field350 = false;
				player.field397 = 0;
				player.field354 = 0;
				player.field352 = 150;
			}

			// : 7
			if ((var7 & 16384) != 0) {
				player.field380 = var0.readByteADD();
				player.field328 = var0.readByteSUB();
				player.field381 = var0.readByte();
				player.field347 = var0.readByteADD();
				player.field384 = var0.readUnsignedShortLE() + Client.field1846;
				player.field385 = var0.readUnsignedShort() + Client.field1846;
				player.field396 = var0.readUnsignedShortADD();
				if (player.teleporting) {
					player.field380 += player.field3010;
					player.field328 += player.field3016;
					player.field381 += player.field3010;
					player.field347 += player.field3016;
					player.field360 = 0;
				} else {
					player.field380 += player.field399[0];
					player.field328 += player.field400[0];
					player.field381 += player.field399[0];
					player.field347 += player.field400[0];
					player.field360 = 1;
				}

				player.field403 = 0;
			}

			// : 8
			if ((var7 & 4) != 0) {
				appBufLength = var0.readUnsignedShortADD();
				if (appBufLength == 65535) {
					appBufLength = -1;
				}

				var10 = var0.readUnsignedByteADD();
				class102.method468(player, appBufLength, var10);
			}

			// : 9
			if ((var7 & 2048) != 0) {
				for (appBufLength = 0; appBufLength < 3; ++appBufLength) {
					player.field2992[appBufLength] = var0.readStringOrNull();
				}
			}

			// : 10
			if ((var7 & 32) != 0) {
				player.field365 = var0.readUnsignedShortLEADD();
				if (player.field360 == 0) {
					player.field351 = player.field365;
					player.method294();
				}
			}

			// : 11
			if ((var7 & 8) != 0) {
				appBufLength = var0.readUnsignedShortLEADD();
				class435 var25 = (class435)class26.method87(class435.method1985(), var0.readUnsignedByte());
				boolean var30 = var0.readUnsignedByteSUB() == 1;
				var12 = var0.readUnsignedByteNEG();
				var13 = var0.offset;
				if (player.field3005 != null && null != player.field2989) {
					boolean var33 = false;
					if (var25.field2916 && class35.field176.method375(player.field3005)) {
						var33 = true;
					}

					if (!var33 && Client.field2102 == 0 && !player.field3008) {
						field1762.offset = 0;
						var0.readBytesADD(field1762.data, 0, var12);
						field1762.offset = 0;
						String var35 = class229.method1036(class385.method1810(class380.method1792(field1762)));
						player.field356 = var35.trim();
						player.field397 = appBufLength >> 8;
						player.field354 = appBufLength & 255;
						player.field352 = 150;
						player.field337 = null;
						player.field350 = var30;
						player.field388 = class114.field720 != player && var25.field2916 && !Client.field2064.isEmpty() && var35.toLowerCase().indexOf(Client.field2064) == -1;
						if (var25.field2929) {
							var16 = var30 ? 91 : 1;
						} else {
							var16 = var30 ? 90 : 2;
						}

						if (var25.field2928 != -1) {
							class346.method1672(var16, class274.method1267(var25.field2928) + player.field3005.method2398(), var35);
						} else {
							class346.method1672(var16, player.field3005.method2398(), var35);
						}
					}
				}

				var0.offset = var12 + var13;
			}

			// : 12
			if ((var7 & 512) != 0) {
				appBufLength = var0.readUnsignedShortADD();
				var10 = appBufLength >> 8;
				var11 = var10 >= 13 && var10 <= 20 ? var10 - 12 : 0;
				class435 var31 = (class435)class26.method87(class435.method1985(), var0.readUnsignedByte());
				boolean var34 = var0.readUnsignedByteSUB() == 1;
				var14 = var0.readUnsignedByte();
				var15 = var0.offset;
				if (player.field3005 != null && player.field2989 != null) {
					boolean var36 = false;
					if (var31.field2916 && class35.field176.method375(player.field3005)) {
						var36 = true;
					}

					if (!var36 && Client.field2102 == 0 && !player.field3008) {
						field1762.offset = 0;
						var0.readBytes(field1762.data, 0, var14);
						field1762.offset = 0;
						String var17 = class229.method1036(class385.method1810(class380.method1792(field1762)));
						player.field356 = var17.trim();
						player.field397 = appBufLength >> 8;
						player.field354 = appBufLength & 255;
						player.field352 = 150;
						byte[] var18 = null;
						if (var11 > 0 && var11 <= 8) {
							var18 = new byte[var11];

							for (int var19 = 0; var19 < var11; ++var19) {
								var18[var19] = var0.readByteADD();
							}
						}

						byte[] var21 = var18;
						int[] var20;
						if (null != var18 && var18.length != 0 && var18.length <= 8) {
							int[] var22 = new int[var18.length];
							int var23 = 0;

							while (true) {
								if (var23 >= var21.length) {
									var20 = var22;
									break;
								}

								if (var21[var23] < 0 || var21[var23] > class450.field2985.length) {
									var20 = null;
									break;
								}

								var22[var23] = class450.field2985[var21[var23]];
								++var23;
							}
						} else {
							var20 = null;
						}

						player.field337 = var20;
						player.field350 = var34;
						player.field388 = class114.field720 != player && var31.field2916 && !Client.field2064.isEmpty() && var17.toLowerCase().indexOf(Client.field2064) == -1;
						int var37;
						if (var31.field2929) {
							var37 = var34 ? 91 : 1;
						} else {
							var37 = var34 ? 90 : 2;
						}

						if (var31.field2928 != -1) {
							class346.method1672(var37, class274.method1267(var31.field2928) + player.field3005.method2398(), var17);
						} else {
							class346.method1672(var37, player.field3005.method2398(), var17);
						}
					}
				}

				var0.offset = var14 + var15 + var11;
			}

			// APPEARANCE ; 13
			if ((var7 & 0x40) != 0) {
				appBufLength = var0.readUnsignedByteNEG();
				byte[] var26 = new byte[appBufLength];
				Buffer appBuf = new Buffer(var26);
				var0.readBytesReversed(var26, 0, appBufLength);
				cachedPlayerAppearances[var5] = appBuf;
				player.decode(appBuf);
			}

			// MOVEMENT : 14
			if ((var7 & 0x2000) != 0) {
				movementType = var0.readByte();
			}

			if (player.teleporting) {
				if (movementType == 127) {
					player.teleport(player.field3010, player.field3016);
				} else {
					MovementType cachedMoveType;
					if (MovementType.NONE.id != movementType) {
						MovementType[] movementTypes = new MovementType[]{MovementType.CRAWL, MovementType.NONE, MovementType.WALK, MovementType.run};
						cachedMoveType = (MovementType)class26.method87(movementTypes, movementType);
					} else {
						cachedMoveType = movementTypesCached[var5];
					}

					player.moveTo(player.field3010, player.field3016, cachedMoveType);
				}
			}
		}

		if (var0.offset - var3 != var1) {
			throw new RuntimeException(var0.offset - var3 + " " + var1);
		}
	}

	static final void method1239(PacketBuffer var0) {
		int var2 = 0;
		var0.method1497();

		byte[] var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < field1764; ++var3) {
			var4 = field1765[var3];
			if ((field1767[var4] & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = field1767;
					var10000[var4] = (byte)(var10000[var4] | 2);
				} else {
					var5 = var0.method1501(1);
					if (var5 == 0) {
						var2 = method1237(var0);
						var10000 = field1767;
						var10000[var4] = (byte)(var10000[var4] | 2);
					} else {
						class200.method967(var0, var4);
					}
				}
			}
		}

		var0.method1504();
		if (var2 != 0) {
			throw new RuntimeException();
		} else {
			var0.method1497();

			for (var3 = 0; var3 < field1764; ++var3) {
				var4 = field1765[var3];
				if ((field1767[var4] & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = field1767;
						var10000[var4] = (byte)(var10000[var4] | 2);
					} else {
						var5 = var0.method1501(1);
						if (var5 == 0) {
							var2 = method1237(var0);
							var10000 = field1767;
							var10000[var4] = (byte)(var10000[var4] | 2);
						} else {
							class200.method967(var0, var4);
						}
					}
				}
			}

			var0.method1504();
			if (var2 != 0) {
				throw new RuntimeException();
			} else {
				var0.method1497();

				for (var3 = 0; var3 < field1766; ++var3) {
					var4 = field1772[var3];
					if ((field1767[var4] & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = field1767;
							var10000[var4] = (byte)(var10000[var4] | 2);
						} else {
							var5 = var0.method1501(1);
							if (var5 == 0) {
								var2 = method1237(var0);
								var10000 = field1767;
								var10000[var4] = (byte)(var10000[var4] | 2);
							} else if (method1238(var0, var4)) {
								var10000 = field1767;
								var10000[var4] = (byte)(var10000[var4] | 2);
							}
						}
					}
				}

				var0.method1504();
				if (var2 != 0) {
					throw new RuntimeException();
				} else {
					var0.method1497();

					for (var3 = 0; var3 < field1766; ++var3) {
						var4 = field1772[var3];
						if ((field1767[var4] & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = field1767;
								var10000[var4] = (byte)(var10000[var4] | 2);
							} else {
								var5 = var0.method1501(1);
								if (var5 == 0) {
									var2 = method1237(var0);
									var10000 = field1767;
									var10000[var4] = (byte)(var10000[var4] | 2);
								} else if (method1238(var0, var4)) {
									var10000 = field1767;
									var10000[var4] = (byte)(var10000[var4] | 2);
								}
							}
						}
					}

					var0.method1504();
					if (var2 != 0) {
						throw new RuntimeException();
					} else {
						field1764 = 0;
						field1766 = 0;

						for (var3 = 1; var3 < 2048; ++var3) {
							var10000 = field1767;
							var10000[var3] = (byte)(var10000[var3] >> 1);
							Player var6 = Client.field2037[var3];
							if (var6 != null) {
								field1765[++field1764 - 1] = var3;
							} else {
								field1772[++field1766 - 1] = var3;
							}
						}

					}
				}
			}
		}
	}

	static int method1237(PacketBuffer var0) {
		int var2 = var0.method1501(2);
		int var3;
		if (var2 == 0) {
			var3 = 0;
		} else if (var2 == 1) {
			var3 = var0.method1501(5);
		} else if (var2 == 2) {
			var3 = var0.method1501(8);
		} else {
			var3 = var0.method1501(11);
		}

		return var3;
	}

	static boolean method1238(PacketBuffer var0, int var1) {
		int var3 = var0.method1501(2);
		int var4;
		int var5;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var3 == 0) {
			if (var0.method1501(1) != 0) {
				method1238(var0, var1);
			}

			var4 = var0.method1501(13);
			var5 = var0.method1501(13);
			boolean var12 = var0.method1501(1) == 1;
			if (var12) {
				field1773[++field1771 - 1] = var1;
			}

			if (Client.field2037[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var13 = Client.field2037[var1] = new Player();
				var13.field3001 = var1;
				if (cachedPlayerAppearances[var1] != null) {
					var13.decode(cachedPlayerAppearances[var1]);
				}

				var13.field351 = field1769[var1];
				var13.field363 = field1770[var1];
				var8 = field1768[var1];
				var9 = var8 >> 28;
				var10 = var8 >> 14 & 255;
				var11 = var8 & 255;
				var13.field342[0] = movementTypesCached[var1];
				var13.field3009 = (byte)var9;
				var13.teleport((var10 << 13) + var4 - class80.selectedTileX, var5 + (var11 << 13) - class425.selectedTileXYIdk);
				var13.teleporting = false;
				return true;
			}
		} else if (var3 == 1) {
			var4 = var0.method1501(2);
			var5 = field1768[var1];
			field1768[var1] = (var5 & 268435455) + (((var5 >> 28) + var4 & 3) << 28);
			return false;
		} else {
			int var6;
			int var7;
			if (var3 == 2) {
				var4 = var0.method1501(5);
				var5 = var4 >> 3;
				var6 = var4 & 7;
				var7 = field1768[var1];
				var8 = var5 + (var7 >> 28) & 3;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				if (var6 == 0) {
					--var9;
					--var10;
				}

				if (var6 == 1) {
					--var10;
				}

				if (var6 == 2) {
					++var9;
					--var10;
				}

				if (var6 == 3) {
					--var9;
				}

				if (var6 == 4) {
					++var9;
				}

				if (var6 == 5) {
					--var9;
					++var10;
				}

				if (var6 == 6) {
					++var10;
				}

				if (var6 == 7) {
					++var9;
					++var10;
				}

				field1768[var1] = (var9 << 14) + (var8 << 28) + var10;
				return false;
			} else {
				var4 = var0.method1501(18);
				var5 = var4 >> 16;
				var6 = var4 >> 8 & 255;
				var7 = var4 & 255;
				var8 = field1768[var1];
				var9 = var5 + (var8 >> 28) & 3;
				var10 = var6 + (var8 >> 14) & 255;
				var11 = var7 + var8 & 255;
				field1768[var1] = var11 + (var10 << 14) + (var9 << 28);
				return false;
			}
		}
	}

	static void method1235() {
		field1764 = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			cachedPlayerAppearances[var1] = null;
			movementTypesCached[var1] = MovementType.WALK;
		}

	}
}
