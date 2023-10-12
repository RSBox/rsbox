public class class502 {
	public static String method2370(CharSequence var0, class126 var1) {
		if (var0 == null) {
			return null;
		} else {
			int var3 = 0;

			int var4;
			for (var4 = var0.length(); var3 < var4 && class170.method895(var0.charAt(var3)); ++var3) {
			}

			while (var4 > var3 && class170.method895(var0.charAt(var4 - 1))) {
				--var4;
			}

			int var5 = var4 - var3;
			if (var5 >= 1) {
				byte var7;
				if (null == var1) {
					var7 = 12;
				} else {
					switch(var1.field829) {
					case 8:
						var7 = 20;
						break;
					default:
						var7 = 12;
					}
				}

				if (var5 <= var7) {
					StringBuilder var6 = new StringBuilder(var5);

					for (int var11 = var3; var11 < var4; ++var11) {
						char var8 = var0.charAt(var11);
						if (class170.method896(var8)) {
							char var9;
							switch(var8) {
							case ' ':
							case '-':
							case '_':
							case '\u00a0':
								var9 = '_';
								break;
							case '#':
							case '[':
							case ']':
								var9 = var8;
								break;
							case '\u00c0':
							case '\u00c1':
							case '\u00c2':
							case '\u00c3':
							case '\u00c4':
							case '\u00e0':
							case '\u00e1':
							case '\u00e2':
							case '\u00e3':
							case '\u00e4':
								var9 = 'a';
								break;
							case '\u00c7':
							case '\u00e7':
								var9 = 'c';
								break;
							case '\u00c8':
							case '\u00c9':
							case '\u00ca':
							case '\u00cb':
							case '\u00e8':
							case '\u00e9':
							case '\u00ea':
							case '\u00eb':
								var9 = 'e';
								break;
							case '\u00cd':
							case '\u00ce':
							case '\u00cf':
							case '\u00ed':
							case '\u00ee':
							case '\u00ef':
								var9 = 'i';
								break;
							case '\u00d1':
							case '\u00f1':
								var9 = 'n';
								break;
							case '\u00d2':
							case '\u00d3':
							case '\u00d4':
							case '\u00d5':
							case '\u00d6':
							case '\u00f2':
							case '\u00f3':
							case '\u00f4':
							case '\u00f5':
							case '\u00f6':
								var9 = 'o';
								break;
							case '\u00d9':
							case '\u00da':
							case '\u00db':
							case '\u00dc':
							case '\u00f9':
							case '\u00fa':
							case '\u00fb':
							case '\u00fc':
								var9 = 'u';
								break;
							case '\u00df':
								var9 = 'b';
								break;
							case '\u00ff':
							case '\u0178':
								var9 = 'y';
								break;
							default:
								var9 = Character.toLowerCase(var8);
							}

							if (var9 != 0) {
								var6.append(var9);
							}
						}
					}

					if (var6.length() == 0) {
						return null;
					}

					return var6.toString();
				}
			}

			return null;
		}
	}

	static final int method2368(int var0, int var1, int var2) {
		int var4 = var0 / var2;
		int var5 = var0 & var2 - 1;
		int var6 = var1 / var2;
		int var7 = var1 & var2 - 1;
		int var8 = class129.method597(var4, var6);
		int var9 = class129.method597(var4 + 1, var6);
		int var10 = class129.method597(var4, var6 + 1);
		int var11 = class129.method597(var4 + 1, var6 + 1);
		int var13 = 65536 - class105.field671[var5 * 1024 / var2] >> 1;
		int var12 = (var9 * var13 >> 16) + (var8 * (65536 - var13) >> 16);
		int var15 = 65536 - class105.field671[var5 * 1024 / var2] >> 1;
		int var14 = ((65536 - var15) * var10 >> 16) + (var15 * var11 >> 16);
		int var17 = 65536 - class105.field671[var7 * 1024 / var2] >> 1;
		int var16 = ((65536 - var17) * var12 >> 16) + (var17 * var14 >> 16);
		return var16;
	}

	static final void method2369(int var0, int var1, int var2, int var3) {
		++Client.field1947;
		if (Client.field1840 == class114.field720.field368 >> 7 && class114.field720.field329 >> 7 == Client.field2081) {
			Client.field1840 = 0;
		}

		if (Client.field1961) {
			Client.method1390(class114.field720, false);
		}

		if (Client.field1969 >= 0 && Client.field2037[Client.field1969] != null) {
			Client.method1390(Client.field2037[Client.field1969], false);
		}

		Client.method1344(true);
		Client.method1463();
		Client.method1344(false);
		Client.method1462();

		for (class473 var5 = (class473)Client.field1973.method327(); null != var5; var5 = (class473)Client.field1973.method331()) {
			if (class212.field1393 == var5.field3323 && !var5.field3324) {
				if (Client.field1846 >= var5.field3314) {
					var5.method2189(Client.field2022);
					if (var5.field3324) {
						var5.method1719();
					} else {
						class141.field937.method780(var5.field3323, var5.field3316, var5.field3319, var5.field3318, 60, var5, 0, -1L, false);
					}
				}
			} else {
				var5.method1719();
			}
		}

		Client.method1322(var0, var1, var2, var3, true);
		var0 = Client.field2111;
		var1 = Client.field2112;
		var2 = Client.field1836;
		var3 = Client.field2114;
		class433.method1958(var0, var1, var0 + var2, var3 + var1);
		class105.method488();
		class433.method1964();
		int var38 = Client.field1917;
		if (Client.field1934 / 256 > var38) {
			var38 = Client.field1934 / 256;
		}

		if (Client.field2098[4] && Client.field1993[4] + 128 > var38) {
			var38 = 128 + Client.field1993[4];
		}

		int var6 = Client.field1962 & 2047;
		int var7 = class89.field585;
		int var8 = class159.field1145;
		int var9 = class124.field814;
		int var10 = var38 * 3 + 600;
		int var13 = var3 - 334;
		if (var13 < 0) {
			var13 = 0;
		} else if (var13 > 100) {
			var13 = 100;
		}

		int var14 = Client.field2105 + (Client.field2106 - Client.field2105) * var13 / 100;
		int var12 = var14 * var10 / 256;
		var13 = 2048 - var38 & 2047;
		var14 = 2048 - var6 & 2047;
		int var15 = 0;
		int var16 = 0;
		int var17 = var12;
		int var18;
		int var19;
		int var20;
		if (var13 != 0) {
			var18 = class105.field670[var13];
			var19 = class105.field671[var13];
			var20 = var19 * 0 - var18 * var12 >> 16;
			var17 = var19 * var12 + 0 * var18 >> 16;
			var16 = var20;
		}

		if (var14 != 0) {
			var18 = class105.field670[var14];
			var19 = class105.field671[var14];
			var20 = var18 * var17 + 0 * var19 >> 16;
			var17 = var19 * var17 - 0 * var18 >> 16;
			var15 = var20;
		}

		if (Client.field2080) {
			class147.field1026 = var7 - var15;
			class188.field1283 = var8 - var16;
			class258.field1756 = var9 - var17;
			class434.field2905 = var38;
			class77.field542 = var6;
		} else {
			Client.field2135 = var7 - var15;
			class122.field794 = var8 - var16;
			class353.field2437 = var9 - var17;
			class130.field849 = var38;
			class76.field537 = var6;
		}

		if (Client.field1923 == 1 && Client.field2087 >= 2 && Client.field1846 % 50 == 0 && (class114.field720.field368 >> 7 != class89.field585 >> 7 || class114.field720.field329 >> 7 != class124.field814 >> 7)) {
			var18 = class114.field720.field3009;
			var19 = (class89.field585 >> 7) + class80.selectedTileX;
			var20 = (class124.field814 >> 7) + class425.selectedTileXYIdk;
			class341 var21 = class341.createClientPacket(ClientPacket.field3067, Client.field1891.field4219);
			var21.buffer.writeShortADD(var19);
			var21.buffer.writeShortLE(var20);
			var21.buffer.writeInt(Client.field1861);
			var21.buffer.writeByteADD(var18);
			Client.field1891.method2612(var21);
		}

		if (!Client.field2080) {
			var12 = Client.method1356();
		} else {
			var12 = class447.method2106();
		}

		var13 = Client.field2135;
		var14 = class122.field794;
		var15 = class353.field2437;
		var16 = class130.field849;
		var17 = class76.field537;

		for (var18 = 0; var18 < 5; ++var18) {
			if (Client.field2098[var18]) {
				var19 = (int)(Math.random() * (double)(2 * Client.field2099[var18] + 1) - (double)Client.field2099[var18] + Math.sin((double)Client.field2020[var18] * ((double)Client.field2101[var18] / 100.0D)) * (double)Client.field1993[var18]);
				if (var18 == 0) {
					Client.field2135 += var19;
				}

				if (var18 == 1) {
					class122.field794 += var19;
				}

				if (var18 == 2) {
					class353.field2437 += var19;
				}

				if (var18 == 3) {
					class76.field537 = class76.field537 + var19 & 2047;
				}

				if (var18 == 4) {
					class130.field849 += var19;
					if (class130.field849 < 128) {
						class130.field849 = 128;
					}

					if (class130.field849 > 383) {
						class130.field849 = 383;
					}
				}
			}
		}

		var18 = class316.field2309;
		var19 = class316.field2315;
		if (class316.field2316 != 0) {
			var18 = class316.field2318;
			var19 = class316.field2320;
		}

		if (var18 >= var0 && var18 < var2 + var0 && var19 >= var1 && var19 < var3 + var1) {
			class503.method2372(var18 - var0, var19 - var1);
		} else {
			class503.method2381();
		}

		class253.method1209();
		class433.method1977(var0, var1, var2, var3, 0);
		class253.method1209();
		var20 = class105.method482();
		class105.method473(class190.field1287.field4160);
		class105.field668.field1727 = Client.field1905;
		class141.field937.method763(Client.field2135, class122.field794, class353.field2437, class130.field849, class76.field537, var12);
		class105.method473(false);
		if (Client.field1862) {
			class433.method1957();
		}

		class105.field668.field1727 = var20;
		class253.method1209();
		class141.field937.method770();
		Client.field1930 = 0;
		boolean var39 = false;
		int var22 = -1;
		int var23 = -1;
		int var24 = class264.field1764;
		int[] var25 = class264.field1765;

		int var26;
		for (var26 = 0; var26 < var24 + Client.field1980; ++var26) {
			Object var27;
			if (var26 < var24) {
				var27 = Client.field2037[var25[var26]];
				if (Client.field1969 == var25[var26]) {
					var39 = true;
					var22 = var26;
					continue;
				}

				if (class114.field720 == var27) {
					var23 = var26;
					continue;
				}
			} else {
				var27 = Client.field2017[Client.field1893[var26 - var24]];
			}

			Client.method1394((class65)var27, var26, var0, var1, var2, var3);
		}

		if (Client.field1961 && var23 != -1) {
			Client.method1394(class114.field720, var23, var0, var1, var2, var3);
		}

		if (var39) {
			Client.method1394(Client.field2037[Client.field1969], var22, var0, var1, var2, var3);
		}

		for (var26 = 0; var26 < Client.field1930; ++var26) {
			int var40 = Client.field1937[var26];
			int var28 = Client.field1938[var26];
			int var29 = Client.field1940[var26];
			int var30 = Client.field1939[var26];
			boolean var31 = true;

			while (var31) {
				var31 = false;

				for (int var32 = 0; var32 < var26; ++var32) {
					if (var28 + 2 > Client.field1938[var32] - Client.field1939[var32] && var28 - var30 < Client.field1938[var32] + 2 && var40 - var29 < Client.field1940[var32] + Client.field1937[var32] && var29 + var40 > Client.field1937[var32] - Client.field1940[var32] && Client.field1938[var32] - Client.field1939[var32] < var28) {
						var28 = Client.field1938[var32] - Client.field1939[var32];
						var31 = true;
					}
				}
			}

			Client.field1948 = Client.field1937[var26];
			Client.field1966 = Client.field1938[var26] = var28;
			String var41 = Client.field1945[var26];
			if (Client.field2006 == 0) {
				int var33 = 16776960;
				if (Client.field1941[var26] < 6) {
					var33 = Client.field2061[Client.field1941[var26]];
				}

				if (Client.field1941[var26] == 6) {
					var33 = Client.field1947 % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field1941[var26] == 7) {
					var33 = Client.field1947 % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field1941[var26] == 8) {
					var33 = Client.field1947 % 20 < 10 ? '\ub000' : 8454016;
				}

				int var34;
				if (Client.field1941[var26] == 9) {
					var34 = 150 - Client.field2045[var26];
					if (var34 < 50) {
						var33 = 16711680 + var34 * 1280;
					} else if (var34 < 100) {
						var33 = 16776960 - (var34 - 50) * 327680;
					} else if (var34 < 150) {
						var33 = (var34 - 100) * 5 + 65280;
					}
				}

				if (Client.field1941[var26] == 10) {
					var34 = 150 - Client.field2045[var26];
					if (var34 < 50) {
						var33 = var34 * 5 + 16711680;
					} else if (var34 < 100) {
						var33 = 16711935 - 327680 * (var34 - 50);
					} else if (var34 < 150) {
						var33 = 327680 * (var34 - 100) + 255 - (var34 - 100) * 5;
					}
				}

				if (Client.field1941[var26] == 11) {
					var34 = 150 - Client.field2045[var26];
					if (var34 < 50) {
						var33 = 16777215 - var34 * 327685;
					} else if (var34 < 100) {
						var33 = 65280 + 327685 * (var34 - 50);
					} else if (var34 < 150) {
						var33 = 16777215 - (var34 - 100) * 327680;
					}
				}

				int var35;
				if (Client.field1941[var26] == 12 && null == Client.field1943[var26]) {
					var34 = var41.length();
					Client.field1943[var26] = new int[var34];

					for (var35 = 0; var35 < var34; ++var35) {
						int var36 = (int)(64.0F * ((float)var35 / (float)var34));
						int var37 = var36 << 10 | 896 | 64;
						Client.field1943[var26][var35] = class549.field4269[var37];
					}
				}

				if (Client.field2136[var26] == 0) {
					class209.field1388.method1042(var41, var0 + Client.field1948, var1 + Client.field1966, var33, 0, Client.field1943[var26]);
				}

				if (Client.field2136[var26] == 1) {
					class209.field1388.method1039(var41, Client.field1948 + var0, Client.field1966 + var1, var33, 0, Client.field1947, Client.field1943[var26]);
				}

				if (Client.field2136[var26] == 2) {
					class209.field1388.method1043(var41, var0 + Client.field1948, Client.field1966 + var1, var33, 0, Client.field1947, Client.field1943[var26]);
				}

				if (Client.field2136[var26] == 3) {
					class209.field1388.method1044(var41, var0 + Client.field1948, var1 + Client.field1966, var33, 0, Client.field1947, 150 - Client.field2045[var26], Client.field1943[var26]);
				}

				if (Client.field2136[var26] == 4) {
					var34 = (150 - Client.field2045[var26]) * (class209.field1388.method1033(var41) + 100) / 150;
					class433.method1959(Client.field1948 + var0 - 50, var1, 50 + var0 + Client.field1948, var1 + var3);
					class209.field1388.method1058(var41, 50 + Client.field1948 + var0 - var34, Client.field1966 + var1, var33, 0, Client.field1943[var26]);
					class433.method1958(var0, var1, var2 + var0, var3 + var1);
				}

				if (Client.field2136[var26] == 5) {
					var34 = 150 - Client.field2045[var26];
					var35 = 0;
					if (var34 < 25) {
						var35 = var34 - 25;
					} else if (var34 > 125) {
						var35 = var34 - 125;
					}

					class433.method1959(var0, Client.field1966 + var1 - class209.field1388.field1483 - 1, var2 + var0, Client.field1966 + var1 + 5);
					class209.field1388.method1042(var41, Client.field1948 + var0, var35 + var1 + Client.field1966, var33, 0, Client.field1943[var26]);
					class433.method1958(var0, var1, var2 + var0, var1 + var3);
				}
			} else {
				class209.field1388.method1045(var41, var0 + Client.field1948, Client.field1966 + var1, 16776960, 0);
			}
		}

		class161.method870(var0, var1);
		((class114)class105.field668.field1730).method524(Client.field2022);
		Client.method1453();
		Client.field2135 = var13;
		class122.field794 = var14;
		class353.field2437 = var15;
		class130.field849 = var16;
		class76.field537 = var17;
		if (Client.field1845 && class28.field143.method721(true, false) == 0) {
			Client.field1845 = false;
		}

		if (Client.field1845) {
			class433.method1977(var0, var1, var2, var3, 0);
			Client.method1452(class513.field3797, false);
		}

	}
}
