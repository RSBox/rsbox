import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class class440 {
	static boolean field2962;
	static boolean field2963;
	static class398 field2957;
	static class464[] field2951;
	static int field2956;
	static int field2958;
	static int field2959;
	static int[] field2952;
	static int[] field2953;
	static int[] field2955;
	static int[][] field2954;
	static String[] field2965;
	static ArrayList field2966;
	static Calendar field2960;
	static final double field2964;
	static final String[] field2961;

	static {
		field2953 = new int[5];
		field2954 = new int[5][5000];
		field2955 = new int[1000];
		field2965 = new String[1000];
		field2958 = 0;
		field2951 = new class464[50];
		field2960 = Calendar.getInstance();
		field2961 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field2962 = false;
		field2963 = false;
		field2966 = new ArrayList();
		field2959 = 0;
		field2964 = Math.log(2.0D);
	}

	public static void method2027(class376 var0) {
		class471.method2187(var0, 500000, 475000);
	}

	static void method2060(class376 var0, class83 var1, int var2, int var3) {
		Object[] var5 = var0.field2594;
		field2956 = 0;
		class176.field1224 = 0;
		int var6 = -1;
		int[] var7 = var1.field564;
		int[] var8 = var1.field558;
		byte var9 = -1;
		field2958 = 0;
		field2962 = false;
		boolean var10 = false;
		int var11 = 0;
		boolean var23 = false;

		label835: {
			label836: {
				try {
					int var14;
					try {
						var23 = true;
						field2952 = new int[var1.field561];
						int var12 = 0;
						class396.field2682 = new String[var1.field555];
						int var28 = 0;

						int var15;
						String var38;
						for (var14 = 1; var14 < var5.length; ++var14) {
							if (var5[var14] instanceof Integer) {
								var15 = (Integer)var5[var14];
								if (var15 == -2147483647) {
									var15 = var0.field2588;
								}

								if (var15 == -2147483646) {
									var15 = var0.field2593;
								}

								if (var15 == -2147483645) {
									var15 = var0.field2595 != null ? -749799993 * var0.field2595.interfaceId * 41171959 : -1;
								}

								if (var15 == -2147483644) {
									var15 = var0.field2589;
								}

								if (var15 == -2147483643) {
									var15 = var0.field2595 != null ? var0.field2595.field3603 : -1;
								}

								if (var15 == -2147483642) {
									var15 = var0.field2590 != null ? var0.field2590.interfaceId : -1;
								}

								if (var15 == -2147483641) {
									var15 = var0.field2590 != null ? var0.field2590.field3603 : -1;
								}

								if (var15 == -2147483640) {
									var15 = var0.field2587;
								}

								if (var15 == -2147483639) {
									var15 = var0.field2592;
								}

								field2952[var12++] = var15;
							} else if (var5[var14] instanceof String) {
								var38 = (String)var5[var14];
								if (var38.equals("event_opbase")) {
									var38 = var0.field2584;
								}

								class396.field2682[var28++] = var38;
							}
						}

						field2959 = var0.field2586;

						label822:
						while (true) {
							++var11;
							if (var11 > var2) {
								throw new RuntimeException();
							}

							++var6;
							int var26 = var7[var6];
							if (var26 >= 100) {
								boolean var37;
								if (var1.field558[var6] == 1) {
									var37 = true;
								} else {
									var37 = false;
								}

								var15 = method2068(var26, var1, var37);
								switch(var15) {
								case 0:
									var23 = false;
									break label822;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var26 == 0) {
								field2955[++field2956 - 1] = var8[var6];
							} else if (var26 == 1) {
								var14 = var8[var6];
								field2955[++field2956 - 1] = class119.field786[var14];
							} else if (var26 == 2) {
								var14 = var8[var6];
								class119.field786[var14] = field2955[--field2956];
								Client.method1329(var14);
							} else if (var26 == 3) {
								field2965[++class176.field1224 - 1] = var1.field565[var6];
							} else if (var26 == 6) {
								var6 += var8[var6];
							} else if (var26 == 7) {
								field2956 -= 2;
								if (field2955[field2956] != field2955[1 + field2956]) {
									var6 += var8[var6];
								}
							} else if (var26 == 8) {
								field2956 -= 2;
								if (field2955[field2956 + 1] == field2955[field2956]) {
									var6 += var8[var6];
								}
							} else if (var26 == 9) {
								field2956 -= 2;
								if (field2955[field2956] < field2955[1 + field2956]) {
									var6 += var8[var6];
								}
							} else if (var26 == 10) {
								field2956 -= 2;
								if (field2955[field2956] > field2955[1 + field2956]) {
									var6 += var8[var6];
								}
							} else if (var26 == 21) {
								if (field2958 == 0) {
									var23 = false;
									break label836;
								}

								class464 var36 = field2951[--field2958];
								var1 = var36.field3290;
								var7 = var1.field564;
								var8 = var1.field558;
								var6 = var36.field3292;
								field2952 = var36.field3291;
								class396.field2682 = var36.field3289;
							} else if (var26 == 25) {
								var14 = var8[var6];
								field2955[++field2956 - 1] = class119.method580(var14);
							} else if (var26 == 27) {
								var14 = var8[var6];
								class119.method581(var14, field2955[--field2956]);
							} else if (var26 == 31) {
								field2956 -= 2;
								if (field2955[field2956] <= field2955[1 + field2956]) {
									var6 += var8[var6];
								}
							} else if (var26 == 32) {
								field2956 -= 2;
								if (field2955[field2956] >= field2955[field2956 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 33) {
								field2955[++field2956 - 1] = field2952[var8[var6]];
							} else if (var26 == 34) {
								field2952[var8[var6]] = field2955[--field2956];
							} else if (var26 == 35) {
								field2965[++class176.field1224 - 1] = class396.field2682[var8[var6]];
							} else if (var26 == 36) {
								class396.field2682[var8[var6]] = field2965[--class176.field1224];
							} else if (var26 == 37) {
								var14 = var8[var6];
								class176.field1224 -= var14;
								var38 = class325.method1586(field2965, class176.field1224, var14);
								field2965[++class176.field1224 - 1] = var38;
							} else if (var26 == 38) {
								--field2956;
							} else if (var26 == 39) {
								--class176.field1224;
							} else {
								int var18;
								if (var26 != 40) {
									if (var26 == 42) {
										field2955[++field2956 - 1] = class208.field1384.method1907(var8[var6]);
									} else if (var26 == 43) {
										class208.field1384.method1918(var8[var6], field2955[--field2956]);
									} else if (var26 == 44) {
										var14 = var8[var6] >> 16;
										var15 = var8[var6] & 65535;
										int var29 = field2955[--field2956];
										if (var29 < 0 || var29 > 5000) {
											throw new RuntimeException();
										}

										field2953[var14] = var29;
										byte var32 = -1;
										if (var15 == 105) {
											var32 = 0;
										}

										for (var18 = 0; var18 < var29; ++var18) {
											field2954[var14][var18] = var32;
										}
									} else if (var26 == 45) {
										var14 = var8[var6];
										var15 = field2955[--field2956];
										if (var15 < 0 || var15 >= field2953[var14]) {
											throw new RuntimeException();
										}

										field2955[++field2956 - 1] = field2954[var14][var15];
									} else if (var26 == 46) {
										var14 = var8[var6];
										field2956 -= 2;
										var15 = field2955[field2956];
										if (var15 < 0 || var15 >= field2953[var14]) {
											throw new RuntimeException();
										}

										field2954[var14][var15] = field2955[field2956 + 1];
									} else {
										String var30;
										if (var26 == 47) {
											var30 = class208.field1384.method1911(var8[var6]);
											if (null == var30) {
												var30 = class513.field3757;
											}

											field2965[++class176.field1224 - 1] = var30;
										} else if (var26 == 48) {
											class208.field1384.method1910(var8[var6], field2965[--class176.field1224]);
										} else if (var26 == 49) {
											var30 = class208.field1384.method1909(var8[var6]);
											field2965[++class176.field1224 - 1] = var30;
										} else if (var26 == 50) {
											class208.field1384.method1908(var8[var6], field2965[--class176.field1224]);
										} else if (var26 == 60) {
											class301 var33 = var1.field559[var8[var6]];
											class252 var41 = (class252)var33.method1533((long)field2955[--field2956]);
											if (var41 != null) {
												var6 += var41.field1721;
											}
										} else {
											Integer var34;
											if (var26 == 74) {
												var34 = class361.field2479.method2413(var8[var6]);
												if (var34 == null) {
													field2955[++field2956 - 1] = -1;
												} else {
													field2955[++field2956 - 1] = var34;
												}
											} else {
												if (var26 != 76) {
													throw new IllegalStateException();
												}

												var34 = class116.field724.method918(var8[var6]);
												if (var34 == null) {
													field2955[++field2956 - 1] = -1;
												} else {
													field2955[++field2956 - 1] = var34;
												}
											}
										}
									}
								} else {
									var14 = var8[var6];
									class83 var40 = class83.method400(var14);
									int[] var16 = new int[var40.field561];
									String[] var17 = new String[var40.field555];

									for (var18 = 0; var18 < var40.field562; ++var18) {
										var16[var18] = field2955[var18 + (field2956 - var40.field562)];
									}

									for (var18 = 0; var18 < var40.field563; ++var18) {
										var17[var18] = field2965[class176.field1224 - var40.field563 + var18];
									}

									field2956 -= var40.field562;
									class176.field1224 -= var40.field563;
									class464 var35 = new class464();
									var35.field3290 = var1;
									var35.field3292 = var6;
									var35.field3291 = field2952;
									var35.field3289 = class396.field2682;
									field2951[++field2958 - 1] = var35;
									var1 = var40;
									var7 = var40.field564;
									var8 = var40.field558;
									var6 = -1;
									field2952 = var16;
									class396.field2682 = var17;
								}
							}
						}
					} catch (Exception var24) {
						var10 = true;
						StringBuilder var13 = new StringBuilder(30);
						var13.append("").append(var1.field2472).append(" ");

						for (var14 = field2958 - 1; var14 >= 0; --var14) {
							var13.append("").append(field2951[var14].field3290.field2472).append(" ");
						}

						var13.append("").append(var9);
						class2.method1(var13.toString(), var24);
						var23 = false;
						break label835;
					}
				} finally {
					if (var23) {
						while (field2966.size() > 0) {
							class510 var20 = (class510)field2966.remove(0);
							Client.method1411(var20.method2404(), var20.method2403(), var20.method2405(), var20.method2402(), "");
						}

						if (field2962) {
							field2962 = false;
							Client.method1321();
						}

						if (!var10 && var3 > 0 && var11 >= var3) {
							class2.method1("Warning: Script " + var1.field556 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (field2966.size() > 0) {
					class510 var31 = (class510)field2966.remove(0);
					Client.method1411(var31.method2404(), var31.method2403(), var31.method2405(), var31.method2402(), "");
				}

				if (field2962) {
					field2962 = false;
					Client.method1321();
				}

				if (var3 > 0 && var11 >= var3) {
					class2.method1("Warning: Script " + var1.field556 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (field2966.size() > 0) {
				class510 var39 = (class510)field2966.remove(0);
				Client.method1411(var39.method2404(), var39.method2403(), var39.method2405(), var39.method2402(), "");
			}

			if (field2962) {
				field2962 = false;
				Client.method1321();
			}

			if (var3 > 0 && var11 >= var3) {
				class2.method1("Warning: Script " + var1.field556 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (field2966.size() > 0) {
			class510 var27 = (class510)field2966.remove(0);
			Client.method1411(var27.method2404(), var27.method2403(), var27.method2405(), var27.method2402(), "");
		}

		if (field2962) {
			field2962 = false;
			Client.method1321();
		}

	}

	static int method2068(int var0, class83 var1, boolean var2) {
		if (var0 < 1000) {
			return class172.method910(var0, var1, var2);
		} else if (var0 < 1100) {
			return method2053(var0, var1, var2);
		} else if (var0 < 1200) {
			return method2033(var0, var1, var2);
		} else if (var0 < 1300) {
			return method2043(var0, var1, var2);
		} else if (var0 < 1400) {
			return method2030(var0, var1, var2);
		} else if (var0 < 1500) {
			return class467.method2169(var0, var1, var2, (byte)121);
		} else if (var0 < 1600) {
			return method2048(var0, var1, var2);
		} else if (var0 < 1700) {
			return method2058(var0, var1, var2);
		} else if (var0 < 1800) {
			return method2064(var0, var1, var2);
		} else if (var0 < 1900) {
			return method2036(var0, var1, var2);
		} else if (var0 < 2000) {
			return method2035(var0, var1, var2);
		} else if (var0 < 2100) {
			return method2053(var0, var1, var2);
		} else if (var0 < 2200) {
			return method2033(var0, var1, var2);
		} else if (var0 < 2300) {
			return method2043(var0, var1, var2);
		} else if (var0 < 2400) {
			return method2030(var0, var1, var2);
		} else if (var0 < 2500) {
			return class467.method2169(var0, var1, var2, (byte)100);
		} else if (var0 < 2600) {
			return method2039(var0, var1, var2);
		} else if (var0 < 2700) {
			return method2038(var0, var1, var2);
		} else if (var0 < 2800) {
			return method2072(var0, var1, var2);
		} else if (var0 < 2900) {
			return ClientPacket.method2146(var0, var1, var2);
		} else if (var0 < 3000) {
			return method2035(var0, var1, var2);
		} else if (var0 < 3200) {
			return method2069(var0, var1, var2);
		} else if (var0 < 3300) {
			return method2059(var0, var1, var2);
		} else if (var0 < 3400) {
			return method2067(var0, var1, var2);
		} else if (var0 < 3500) {
			return method2078(var0, var1, var2);
		} else if (var0 < 3600) {
			return method2062(var0, var1, var2);
		} else if (var0 < 3700) {
			return method2041(var0, var1, var2);
		} else if (var0 < 3800) {
			return method2080(var0, var1, var2);
		} else if (var0 < 3900) {
			return method2037(var0, var1, var2);
		} else if (var0 < 4000) {
			return method2046(var0, var1, var2);
		} else if (var0 < 4100) {
			return method2065(var0, var1, var2);
		} else if (var0 < 4200) {
			return class110.method507(var0, var1, var2);
		} else if (var0 < 4300) {
			return method2029(var0, var1, var2);
		} else if (var0 < 5100) {
			return method2051(var0, var1, var2);
		} else if (var0 < 5400) {
			return method2075(var0, var1, var2);
		} else if (var0 < 5600) {
			return method2042(var0, var1, var2);
		} else if (var0 < 5700) {
			return method2050(var0, var1, var2);
		} else if (var0 < 6300) {
			return method2071(var0, var1, var2);
		} else if (var0 < 6600) {
			return method2074(var0, var1, var2);
		} else if (var0 < 6700) {
			return method2076(var0, var1, var2);
		} else if (var0 < 6800) {
			return method2073(var0, var1, var2);
		} else if (var0 < 6900) {
			return method2061(var0, var1, var2);
		} else if (var0 < 7000) {
			return method2054(var0, var1, var2);
		} else if (var0 < 7100) {
			return method2066(var0, var1, var2);
		} else if (var0 < 7200) {
			return method2034(var0, var1, var2);
		} else if (var0 < 7300) {
			return method2040(var0, var1, var2);
		} else if (var0 < 7500) {
			return method2079(var0, var1, var2);
		} else if (var0 < 7600) {
			return method2052(var0, var1, var2);
		} else if (var0 < 7700) {
			return method2057(var0, var1, var2);
		} else {
			return var0 < 8100 ? method2031(var0, var1, var2) : 2;
		}
	}

	static int method2053(int var0, class83 var1, boolean var2) {
		int var4 = -1;
		class496 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = field2955[--field2956];
			var5 = class208.interfaceConfigs.method345(var4);
		} else {
			var5 = var2 ? class506.field3704 : class107.field682;
		}

		if (var0 == 1000) {
			field2956 -= 4;
			var5.field3534 = field2955[field2956];
			var5.field3535 = field2955[1 + field2956];
			var5.field3647 = field2955[field2956 + 2];
			var5.field3531 = field2955[field2956 + 3];
			Client.method1363(var5);
			class190.field1287.method1288(var5);
			if (var4 != -1 && var5.field3527 == 0) {
				class145.method788(class208.interfaceConfigs.components[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1001) {
			field2956 -= 4;
			var5.field3536 = field2955[field2956];
			var5.field3537 = field2955[field2956 + 1];
			var5.field3532 = field2955[2 + field2956];
			var5.field3621 = field2955[3 + field2956];
			Client.method1363(var5);
			class190.field1287.method1288(var5);
			if (var4 != -1 && var5.field3527 == 0) {
				class145.method788(class208.interfaceConfigs.components[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1003) {
			boolean var6 = field2955[--field2956] == 1;
			if (var5.field3545 != var6) {
				var5.field3545 = var6;
				Client.method1363(var5);
			}

			return 1;
		} else if (var0 == 1005) {
			var5.field3668 = field2955[--field2956] == 1;
			return 1;
		} else if (var0 == 1006) {
			var5.field3552 = field2955[--field2956] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	static int method2033(int var0, class83 var1, boolean var2) {
		int var5 = -1;
		class496 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = field2955[--field2956];
			var4 = class208.interfaceConfigs.method345(var5);
		} else {
			var4 = var2 ? class506.field3704 : class107.field682;
		}

		int var15;
		if (var0 == 1100) {
			field2956 -= 2;
			var15 = field2955[field2956];
			int var12 = field2955[1 + field2956];
			if (var4.field3527 == 12) {
				class135 var8 = var4.method2323((byte)54);
				if (var8 != null && var8.method628(var15, var12)) {
					Client.method1363(var4);
				}
			} else {
				var4.field3560 = var15;
				if (var4.field3560 > var4.field3590 - var4.field3540) {
					var4.field3560 = var4.field3590 - var4.field3540;
				}

				if (var4.field3560 < 0) {
					var4.field3560 = 0;
				}

				var4.field3547 = var12;
				if (var4.field3547 > var4.field3622 - var4.field3541) {
					var4.field3547 = var4.field3622 - var4.field3541;
				}

				if (var4.field3547 < 0) {
					var4.field3547 = 0;
				}

				Client.method1363(var4);
			}

			return 1;
		} else if (var0 == 1101) {
			var4.field3550 = field2955[--field2956];
			Client.method1363(var4);
			return 1;
		} else if (var0 == 1102) {
			var4.field3554 = field2955[--field2956] == 1;
			Client.method1363(var4);
			return 1;
		} else if (var0 == 1103) {
			var4.field3556 = field2955[--field2956];
			Client.method1363(var4);
			return 1;
		} else if (var0 == 1104) {
			var4.field3563 = field2955[--field2956];
			Client.method1363(var4);
			return 1;
		} else if (var0 == 1105) {
			var4.field3653 = field2955[--field2956];
			Client.method1363(var4);
			return 1;
		} else if (var0 == 1106) {
			var4.field3562 = field2955[--field2956];
			Client.method1363(var4);
			return 1;
		} else if (var0 == 1107) {
			var4.field3663 = field2955[--field2956] == 1;
			Client.method1363(var4);
			return 1;
		} else if (var0 == 1108) {
			var4.field3568 = 1;
			var4.field3521 = field2955[--field2956];
			Client.method1363(var4);
			return 1;
		} else if (var0 == 1109) {
			field2956 -= 6;
			var4.field3577 = field2955[field2956];
			var4.field3574 = field2955[field2956 + 1];
			var4.field3575 = field2955[2 + field2956];
			var4.field3522 = field2955[3 + field2956];
			var4.field3611 = field2955[field2956 + 4];
			var4.field3570 = field2955[field2956 + 5];
			Client.method1363(var4);
			return 1;
		} else if (var0 == 1110) {
			var15 = field2955[--field2956];
			if (var15 != var4.field3610) {
				var4.field3610 = var15;
				var4.field3657 = 0;
				var4.field3658 = 0;
				Client.method1363(var4);
			}

			return 1;
		} else if (var0 == 1111) {
			var4.field3582 = field2955[--field2956] == 1;
			Client.method1363(var4);
			return 1;
		} else {
			class135 var7;
			if (var0 != 1112) {
				class135 var10;
				if (var0 == 1113) {
					var4.field3585 = field2955[--field2956];
					if (var4.field3527 == 12) {
						var10 = var4.method2323((byte)35);
						if (var10 != null) {
							var10.method688();
						}
					}

					Client.method1363(var4);
					return 1;
				} else if (var0 == 1114) {
					field2956 -= 3;
					if (var4.field3527 == 12) {
						var10 = var4.method2323((byte)37);
						if (var10 != null) {
							var10.method694(field2955[field2956], field2955[field2956 + 1]);
							var10.method630(field2955[field2956 + 2]);
						}
					} else {
						var4.field3601 = field2955[field2956];
						var4.field3533 = field2955[field2956 + 1];
						var4.field3588 = field2955[2 + field2956];
					}

					Client.method1363(var4);
					return 1;
				} else if (var0 == 1115) {
					var4.field3591 = field2955[--field2956] == 1;
					Client.method1363(var4);
					return 1;
				} else if (var0 == 1116) {
					var4.field3608 = field2955[--field2956];
					Client.method1363(var4);
					return 1;
				} else if (var0 == 1117) {
					var4.field3607 = field2955[--field2956];
					Client.method1363(var4);
					return 1;
				} else if (var0 == 1118) {
					var4.field3604 = field2955[--field2956] == 1;
					Client.method1363(var4);
					return 1;
				} else if (var0 == 1119) {
					var4.field3567 = field2955[--field2956] == 1;
					Client.method1363(var4);
					return 1;
				} else if (var0 == 1120) {
					field2956 -= 2;
					var4.field3590 = field2955[field2956];
					var4.field3622 = field2955[field2956 + 1];
					Client.method1363(var4);
					if (var5 != -1 && var4.field3527 == 0) {
						class145.method788(class208.interfaceConfigs.components[var5 >> 16], var4, false);
					}

					return 1;
				} else if (var0 == 1121) {
					Client.method1372(var4.interfaceId, var4.field3603);
					Client.field1936 = var4;
					Client.method1363(var4);
					return 1;
				} else if (var0 == 1122) {
					var4.field3571 = field2955[--field2956];
					Client.method1363(var4);
					return 1;
				} else if (var0 == 1123) {
					var4.field3551 = field2955[--field2956];
					Client.method1363(var4);
					return 1;
				} else if (var0 == 1124) {
					var4.field3595 = field2955[--field2956];
					Client.method1363(var4);
					return 1;
				} else if (var0 == 1125) {
					var15 = field2955[--field2956];
					class296 var11 = (class296)class26.method87(class296.method1528(), var15);
					if (var11 != null) {
						var4.field3555 = var11;
						Client.method1363(var4);
					}

					return 1;
				} else {
					boolean var13;
					if (var0 == 1126) {
						var13 = field2955[--field2956] == 1;
						var4.field3549 = var13;
						return 1;
					} else if (var0 == 1127) {
						var13 = field2955[--field2956] == 1;
						var4.field3583 = var13;
						return 1;
					} else if (var0 == 1129) {
						var4.field3561 = field2965[--class176.field1224];
						Client.method1363(var4);
						return 1;
					} else if (var0 == 1130) {
						var4.method2338(field2965[--class176.field1224], class283.field2153, Client.method1425());
						return 1;
					} else if (var0 == 1131) {
						field2956 -= 2;
						var4.method2315(field2955[field2956], field2955[1 + field2956]);
						return 1;
					} else if (var0 == 1132) {
						var4.method2316(field2965[--class176.field1224], field2955[--field2956]);
						return 1;
					} else {
						class74 var14;
						if (var0 == 1133) {
							--field2956;
							var14 = var4.method2324();
							if (null != var14) {
								var14.field523 = field2955[field2956];
								Client.method1363(var4);
							}

							return 1;
						} else if (var0 == 1134) {
							--field2956;
							var14 = var4.method2324();
							if (var14 != null) {
								var14.field524 = field2955[field2956];
								Client.method1363(var4);
							}

							return 1;
						} else if (var0 == 1135) {
							--class176.field1224;
							var10 = var4.method2323((byte)26);
							if (null != var10) {
								var4.field3655 = field2965[class176.field1224];
							}

							return 1;
						} else if (var0 == 1136) {
							--field2956;
							var14 = var4.method2324();
							if (var14 != null) {
								var14.field525 = field2955[field2956];
								Client.method1363(var4);
							}

							return 1;
						} else if (var0 == 1137) {
							--field2956;
							var10 = var4.method2323((byte)30);
							if (null != var10 && var10.method636(field2955[field2956])) {
								Client.method1363(var4);
							}

							return 1;
						} else if (var0 == 1138) {
							--field2956;
							var10 = var4.method2323((byte)22);
							if (var10 != null && var10.method627(field2955[field2956])) {
								Client.method1363(var4);
							}

							return 1;
						} else if (var0 == 1139) {
							--field2956;
							var10 = var4.method2323((byte)48);
							if (null != var10 && var10.method683(field2955[field2956])) {
								Client.method1363(var4);
							}

							return 1;
						} else if (var0 == 1140) {
							var13 = field2955[--field2956] == 1;
							Client.field2068.method1735();
							var7 = var4.method2323((byte)107);
							if (var7 != null && var7.method622(var13)) {
								if (var13) {
									Client.field2068.method1732(var4);
								}

								Client.method1363(var4);
							}

							return 1;
						} else if (var0 == 1141) {
							var13 = field2955[--field2956] == 1;
							if (!var13 && Client.field2068.method1733() == var4) {
								Client.field2068.method1735();
								Client.method1363(var4);
							}

							var7 = var4.method2323((byte)4);
							if (null != var7) {
								var7.method623(var13);
							}

							return 1;
						} else if (var0 == 1142) {
							field2956 -= 2;
							var10 = var4.method2323((byte)90);
							if (var10 != null && var10.method629(field2955[field2956], field2955[field2956 + 1])) {
								Client.method1363(var4);
							}

							return 1;
						} else if (var0 == 1143) {
							--field2956;
							var10 = var4.method2323((byte)44);
							if (null != var10 && var10.method629(field2955[field2956], field2955[field2956])) {
								Client.method1363(var4);
							}

							return 1;
						} else if (var0 == 1144) {
							--field2956;
							var10 = var4.method2323((byte)79);
							if (var10 != null) {
								var10.method632(field2955[field2956]);
								Client.method1363(var4);
							}

							return 1;
						} else if (var0 == 1145) {
							--field2956;
							var10 = var4.method2323((byte)115);
							if (null != var10) {
								var10.method631(field2955[field2956]);
							}

							return 1;
						} else if (var0 == 1146) {
							--field2956;
							var10 = var4.method2323((byte)21);
							if (var10 != null) {
								var10.method634(field2955[field2956]);
							}

							return 1;
						} else if (var0 == 1147) {
							--field2956;
							var10 = var4.method2323((byte)63);
							if (var10 != null) {
								var10.method633(field2955[field2956]);
								Client.method1363(var4);
							}

							return 1;
						} else {
							class408 var9;
							if (var0 == 1148) {
								field2956 -= 2;
								var9 = var4.method2308();
								if (var9 != null) {
									var9.method1868(field2955[field2956], field2955[field2956 + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								field2956 -= 2;
								var9 = var4.method2308();
								if (null != var9) {
									var9.method1869((char)field2955[field2956], field2955[1 + field2956]);
								}

								return 1;
							} else if (var0 == 1150) {
								var4.method2335(field2965[--class176.field1224], class283.field2153);
								return 1;
							} else {
								return 2;
							}
						}
					}
				}
			} else {
				String var6 = field2965[--class176.field1224];
				if (!var6.equals(var4.field3586)) {
					if (var4.field3527 == 12) {
						var7 = var4.method2323((byte)8);
						if (var7 != null && var7.method664()) {
							var7.method624(var6);
						} else {
							var4.field3586 = var6;
						}
					} else {
						var4.field3586 = var6;
					}

					Client.method1363(var4);
				}

				return 1;
			}
		}
	}

	static int method2043(int var0, class83 var1, boolean var2) {
		class496 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class208.interfaceConfigs.method345(field2955[--field2956]);
		} else {
			var4 = var2 ? class506.field3704 : class107.field682;
		}

		Client.method1363(var4);
		int var5;
		int var6;
		if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
			if (var0 == 1201) {
				var4.field3568 = 2;
				var4.field3521 = field2955[--field2956];
				return 1;
			} else if (var0 == 1202) {
				var4.field3568 = 3;
				var4.field3521 = class114.field720.field2989.method907();
				return 1;
			} else if (var0 == 1207) {
				boolean var8 = field2955[--field2956] == 1;
				class496.method2345(var4, class114.field720.field2989, var8);
				return 1;
			} else if (var0 == 1208) {
				var5 = field2955[--field2956];
				if (var4.field3581 == null) {
					throw new RuntimeException("");
				} else {
					class496.method2344(var4, var5);
					return 1;
				}
			} else if (var0 == 1209) {
				field2956 -= 2;
				var5 = field2955[field2956];
				var6 = field2955[1 + field2956];
				if (var4.field3581 == null) {
					throw new RuntimeException("");
				} else {
					class496.method2341(var4, var5, var6);
					return 1;
				}
			} else if (var0 == 1210) {
				var5 = field2955[--field2956];
				if (var4.field3581 == null) {
					throw new RuntimeException("");
				} else {
					class496.method2340(var4, class114.field720.field2989.field1201, var5);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			field2956 -= 2;
			var5 = field2955[field2956];
			var6 = field2955[field2956 + 1];
			var4.field3602 = var5;
			var4.field3656 = var6;
			class158 var7 = class158.method857(var5);
			var4.field3575 = var7.field1117;
			var4.field3522 = var7.field1088;
			var4.field3611 = var7.field1102;
			var4.field3577 = var7.field1103;
			var4.field3574 = var7.field1125;
			var4.field3570 = var7.field1113;
			if (var0 == 1205) {
				var4.field3584 = 0;
			} else if (var0 == 1212 | var7.field1105 == 1) {
				var4.field3584 = 1;
			} else {
				var4.field3584 = 2;
			}

			if (var4.field3579 > 0) {
				var4.field3570 = var4.field3570 * 32 / var4.field3579;
			} else if (var4.field3536 > 0) {
				var4.field3570 = var4.field3570 * 32 / var4.field3536;
			}

			return 1;
		}
	}

	static int method2030(int var0, class83 var1, boolean var2) {
		boolean var4 = true;
		class496 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = class208.interfaceConfigs.method345(field2955[--field2956]);
			var4 = false;
		} else {
			var5 = var2 ? class506.field3704 : class107.field682;
		}

		int var10;
		if (var0 == 1300) {
			var10 = field2955[--field2956] - 1;
			if (var10 >= 0 && var10 <= 9) {
				var5.method2311(var10, field2965[--class176.field1224]);
				return 1;
			} else {
				--class176.field1224;
				return 1;
			}
		} else {
			int var11;
			if (var0 == 1301) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var11 = field2955[field2956 + 1];
				var5.field3566 = class208.interfaceConfigs.method346(var10, var11);
				return 1;
			} else if (var0 == 1302) {
				var5.field3609 = field2955[--field2956] == 1;
				return 1;
			} else if (var0 == 1303) {
				var5.field3606 = field2955[--field2956];
				return 1;
			} else if (var0 == 1304) {
				var5.field3559 = field2955[--field2956];
				return 1;
			} else if (var0 == 1305) {
				var5.field3564 = field2965[--class176.field1224];
				return 1;
			} else if (var0 == 1306) {
				var5.field3618 = field2965[--class176.field1224];
				return 1;
			} else if (var0 == 1307) {
				var5.field3605 = null;
				return 1;
			} else if (var0 == 1308) {
				var5.field3670 = field2955[--field2956] == 1;
				return 1;
			} else if (var0 == 1309) {
				--field2956;
				return 1;
			} else {
				byte[] var7;
				int var8;
				if (var0 != 1350) {
					boolean var9;
					if (var0 == 1351) {
						field2956 -= 2;
						var9 = true;
						var7 = new byte[]{(byte)field2955[field2956]};
						byte[] var12 = new byte[]{(byte)field2955[1 + field2956]};
						method2047(var5, 10, var7, var12);
						return 1;
					} else if (var0 == 1352) {
						field2956 -= 3;
						var10 = field2955[field2956] - 1;
						var11 = field2955[field2956 + 1];
						var8 = field2955[2 + field2956];
						if (var10 >= 0 && var10 <= 9) {
							method2045(var5, var10, var11, var8);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1353) {
						var9 = true;
						var11 = field2955[--field2956];
						var8 = field2955[--field2956];
						method2045(var5, 10, var11, var8);
						return 1;
					} else if (var0 == 1354) {
						--field2956;
						var10 = field2955[field2956] - 1;
						if (var10 >= 0 && var10 <= 9) {
							method2028(var5, var10);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1355) {
						var9 = true;
						method2028(var5, 10);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var6 = null;
					var7 = null;
					if (var4) {
						field2956 -= 10;

						for (var8 = 0; var8 < 10 && field2955[field2956 + var8] >= 0; var8 += 2) {
						}

						if (var8 > 0) {
							var6 = new byte[var8 / 2];
							var7 = new byte[var8 / 2];

							for (var8 -= 2; var8 >= 0; var8 -= 2) {
								var6[var8 / 2] = (byte)field2955[var8 + field2956];
								var7[var8 / 2] = (byte)field2955[1 + var8 + field2956];
							}
						}
					} else {
						field2956 -= 2;
						var6 = new byte[]{(byte)field2955[field2956]};
						var7 = new byte[]{(byte)field2955[field2956 + 1]};
					}

					var8 = field2955[--field2956] - 1;
					if (var8 >= 0 && var8 <= 9) {
						method2047(var5, var8, var6, var7);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	static final void method2047(class496 var0, int var1, byte[] var2, byte[] var3) {
		if (null == var0.field3599) {
			if (null == var2) {
				return;
			}

			var0.field3599 = new byte[11][];
			var0.field3626 = new byte[11][];
			var0.field3617 = new int[11];
			var0.field3645 = new int[11];
		}

		var0.field3599[var1] = var2;
		if (null != var2) {
			var0.field3598 = true;
		} else {
			var0.field3598 = false;

			for (int var5 = 0; var5 < var0.field3599.length; ++var5) {
				if (var0.field3599[var5] != null) {
					var0.field3598 = true;
					break;
				}
			}
		}

		var0.field3626[var1] = var3;
	}

	static final void method2045(class496 var0, int var1, int var2, int var3) {
		if (var0.field3617 == null) {
			throw new RuntimeException();
		} else {
			var0.field3617[var1] = var2;
			var0.field3645[var1] = var3;
		}
	}

	static final void method2028(class496 var0, int var1) {
		if (var0.field3599 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3538 == null) {
				var0.field3538 = new int[var0.field3599.length];
			}

			var0.field3538[var1] = Integer.MAX_VALUE;
		}
	}

	static int method2048(int var0, class83 var1, boolean var2) {
		class496 var4 = var2 ? class506.field3704 : class107.field682;
		if (var0 == 1500) {
			field2955[++field2956 - 1] = var4.field3520;
			return 1;
		} else if (var0 == 1501) {
			field2955[++field2956 - 1] = var4.field3539;
			return 1;
		} else if (var0 == 1502) {
			field2955[++field2956 - 1] = var4.field3540;
			return 1;
		} else if (var0 == 1503) {
			field2955[++field2956 - 1] = var4.field3541;
			return 1;
		} else if (var0 == 1504) {
			field2955[++field2956 - 1] = var4.field3545 ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			field2955[++field2956 - 1] = var4.field3544;
			return 1;
		} else {
			return 2;
		}
	}

	static int method2058(int var0, class83 var1, boolean var2) {
		class496 var4 = var2 ? class506.field3704 : class107.field682;
		if (var0 == 1600) {
			field2955[++field2956 - 1] = var4.field3560;
			return 1;
		} else if (var0 == 1601) {
			field2955[++field2956 - 1] = var4.field3547;
			return 1;
		} else {
			class135 var8;
			if (var0 == 1602) {
				if (var4.field3527 == 12) {
					var8 = var4.method2323((byte)88);
					if (var8 != null) {
						field2965[++class176.field1224 - 1] = var8.method693().method113();
						return 1;
					}
				}

				field2965[++class176.field1224 - 1] = var4.field3586;
				return 1;
			} else if (var0 == 1603) {
				field2955[++field2956 - 1] = var4.field3590;
				return 1;
			} else if (var0 == 1604) {
				field2955[++field2956 - 1] = var4.field3622;
				return 1;
			} else if (var0 == 1605) {
				field2955[++field2956 - 1] = var4.field3570;
				return 1;
			} else if (var0 == 1606) {
				field2955[++field2956 - 1] = var4.field3575;
				return 1;
			} else if (var0 == 1607) {
				field2955[++field2956 - 1] = var4.field3611;
				return 1;
			} else if (var0 == 1608) {
				field2955[++field2956 - 1] = var4.field3522;
				return 1;
			} else if (var0 == 1609) {
				field2955[++field2956 - 1] = var4.field3556;
				return 1;
			} else if (var0 == 1610) {
				field2955[++field2956 - 1] = var4.field3595;
				return 1;
			} else if (var0 == 1611) {
				field2955[++field2956 - 1] = var4.field3550;
				return 1;
			} else if (var0 == 1612) {
				field2955[++field2956 - 1] = var4.field3551;
				return 1;
			} else if (var0 == 1613) {
				field2955[++field2956 - 1] = var4.field3555.getId();
				return 1;
			} else if (var0 == 1614) {
				field2955[++field2956 - 1] = var4.field3583 ? 1 : 0;
				return 1;
			} else {
				class74 var5;
				if (var0 == 1617) {
					var5 = var4.method2324();
					field2955[++field2956 - 1] = var5 != null ? var5.field523 : 0;
				}

				if (var0 == 1618) {
					var5 = var4.method2324();
					field2955[++field2956 - 1] = null != var5 ? var5.field524 : 0;
					return 1;
				} else if (var0 == 1619) {
					var8 = var4.method2323((byte)43);
					field2965[++class176.field1224 - 1] = null != var8 ? var8.method657().method113() : "";
					return 1;
				} else if (var0 == 1620) {
					var5 = var4.method2324();
					field2955[++field2956 - 1] = var5 != null ? var5.field525 : 0;
					return 1;
				} else if (var0 == 1621) {
					var8 = var4.method2323((byte)71);
					field2955[++field2956 - 1] = null != var8 ? var8.method692() : 0;
					return 1;
				} else if (var0 == 1622) {
					var8 = var4.method2323((byte)25);
					field2955[++field2956 - 1] = var8 != null ? var8.method667() : 0;
					return 1;
				} else if (var0 == 1623) {
					var8 = var4.method2323((byte)59);
					field2955[++field2956 - 1] = var8 != null ? var8.method668() : 0;
					return 1;
				} else if (var0 == 1624) {
					var8 = var4.method2323((byte)65);
					field2955[++field2956 - 1] = var8 != null && var8.method659() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var8 = var4.method2323((byte)51);
						field2965[++class176.field1224 - 1] = null != var8 ? var8.method658().method2395() : "";
						return 1;
					} else if (var0 == 1627) {
						var8 = var4.method2323((byte)20);
						int var6 = null != var8 ? var8.method663() : 0;
						int var7 = var8 != null ? var8.method662() : 0;
						field2955[++field2956 - 1] = Math.min(var6, var7);
						field2955[++field2956 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 1628) {
						var8 = var4.method2323((byte)109);
						field2955[++field2956 - 1] = var8 != null ? var8.method662() : 0;
						return 1;
					} else if (var0 == 1629) {
						var8 = var4.method2323((byte)64);
						field2955[++field2956 - 1] = null != var8 ? var8.method669() : 0;
						return 1;
					} else if (var0 == 1630) {
						var8 = var4.method2323((byte)71);
						field2955[++field2956 - 1] = var8 != null ? var8.method620() : 0;
						return 1;
					} else if (var0 == 1631) {
						var8 = var4.method2323((byte)38);
						field2955[++field2956 - 1] = null != var8 ? var8.method670() : 0;
						return 1;
					} else if (var0 == 1632) {
						var8 = var4.method2323((byte)97);
						field2955[++field2956 - 1] = var8 != null ? var8.method672() : 0;
						return 1;
					} else {
						class408 var9;
						if (var0 == 1633) {
							var9 = var4.method2308();
							field2955[field2956 - 1] = null != var9 ? var9.method1870(field2955[field2956 - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var9 = var4.method2308();
							field2955[field2956 - 1] = var9 != null ? var9.method1877((char)field2955[field2956 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method2323((byte)124);
					field2955[++field2956 - 1] = null != var8 && var8.method660() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	static int method2064(int var0, class83 var1, boolean var2) {
		class496 var4 = var2 ? class506.field3704 : class107.field682;
		if (var0 == 1700) {
			field2955[++field2956 - 1] = var4.field3602;
			return 1;
		} else if (var0 == 1701) {
			if (var4.field3602 != -1) {
				field2955[++field2956 - 1] = var4.field3656;
			} else {
				field2955[++field2956 - 1] = 0;
			}

			return 1;
		} else if (var0 == 1702) {
			field2955[++field2956 - 1] = var4.field3603;
			return 1;
		} else if (var0 == 1707) {
			field2955[++field2956 - 1] = var4.method2317() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return method2056(var4);
		} else {
			return var0 == 1709 ? method2032(var4) : 2;
		}
	}

	static int method2056(class496 var0) {
		if (var0.field3527 != 11) {
			--class176.field1224;
			field2955[++field2956 - 1] = -1;
			return 1;
		} else {
			String var2 = field2965[--class176.field1224];
			field2955[++field2956 - 1] = var0.method2331(var2);
			return 1;
		}
	}

	static int method2032(class496 var0) {
		if (var0.field3527 != 11) {
			field2965[class176.field1224 - 1] = "";
			return 1;
		} else {
			String var2 = field2965[--class176.field1224];
			field2965[++class176.field1224 - 1] = var0.method2318(var2);
			return 1;
		}
	}

	static int method2036(int var0, class83 var1, boolean var2) {
		class496 var4 = var2 ? class506.field3704 : class107.field682;
		if (var0 == 1800) {
			field2955[++field2956 - 1] = class134.method618(Client.method1335(var4));
			return 1;
		} else if (var0 != 1801) {
			if (var0 == 1802) {
				if (var4.field3564 == null) {
					field2965[++class176.field1224 - 1] = "";
				} else {
					field2965[++class176.field1224 - 1] = var4.field3564;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = field2955[--field2956];
			--var5;
			if (var4.field3605 != null && var5 < var4.field3605.length && var4.field3605[var5] != null) {
				field2965[++class176.field1224 - 1] = var4.field3605[var5];
			} else {
				field2965[++class176.field1224 - 1] = "";
			}

			return 1;
		}
	}

	static int method2035(int var0, class83 var1, boolean var2) {
		class496 var4;
		if (var0 != 1927 && var0 != 2927) {
			int var9;
			if (var0 == 1928) {
				var4 = var2 ? class506.field3704 : class107.field682;
				var9 = field2955[--field2956];
				if (var9 >= 1 && var9 <= 10) {
					class510 var10 = new class510(var9, var4.interfaceId, var4.field3603, var4.field3602);
					field2966.add(var10);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				field2956 -= 3;
				int var8 = field2955[field2956];
				var9 = field2955[1 + field2956];
				int var6 = field2955[2 + field2956];
				if (var6 >= 1 && var6 <= 10) {
					class510 var7 = new class510(var6, var8, var9, class208.interfaceConfigs.method345(var8).field3602);
					field2966.add(var7);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (field2959 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var4 = class208.interfaceConfigs.method345(field2955[--field2956]);
			} else {
				var4 = var2 ? class506.field3704 : class107.field682;
			}

			if (var4.field3643 == null) {
				return 0;
			} else {
				class376 var5 = new class376();
				var5.field2595 = var4;
				var5.field2594 = var4.field3643;
				var5.field2586 = 1 + field2959;
				Client.field2019.method323(var5);
				return 1;
			}
		}
	}

	static int method2039(int var0, class83 var1, boolean var2) {
		class496 var4 = class208.interfaceConfigs.method345(field2955[--field2956]);
		if (var0 == 2500) {
			field2955[++field2956 - 1] = var4.field3520;
			return 1;
		} else if (var0 == 2501) {
			field2955[++field2956 - 1] = var4.field3539;
			return 1;
		} else if (var0 == 2502) {
			field2955[++field2956 - 1] = var4.field3540;
			return 1;
		} else if (var0 == 2503) {
			field2955[++field2956 - 1] = var4.field3541;
			return 1;
		} else if (var0 == 2504) {
			field2955[++field2956 - 1] = var4.field3545 ? 1 : 0;
			return 1;
		} else if (var0 == 2505) {
			field2955[++field2956 - 1] = var4.field3544;
			return 1;
		} else {
			return 2;
		}
	}

	static int method2038(int var0, class83 var1, boolean var2) {
		class496 var4 = class208.interfaceConfigs.method345(field2955[--field2956]);
		if (var0 == 2600) {
			field2955[++field2956 - 1] = var4.field3560;
			return 1;
		} else if (var0 == 2601) {
			field2955[++field2956 - 1] = var4.field3547;
			return 1;
		} else if (var0 == 2602) {
			field2965[++class176.field1224 - 1] = var4.field3586;
			return 1;
		} else if (var0 == 2603) {
			field2955[++field2956 - 1] = var4.field3590;
			return 1;
		} else if (var0 == 2604) {
			field2955[++field2956 - 1] = var4.field3622;
			return 1;
		} else if (var0 == 2605) {
			field2955[++field2956 - 1] = var4.field3570;
			return 1;
		} else if (var0 == 2606) {
			field2955[++field2956 - 1] = var4.field3575;
			return 1;
		} else if (var0 == 2607) {
			field2955[++field2956 - 1] = var4.field3611;
			return 1;
		} else if (var0 == 2608) {
			field2955[++field2956 - 1] = var4.field3522;
			return 1;
		} else if (var0 == 2609) {
			field2955[++field2956 - 1] = var4.field3556;
			return 1;
		} else if (var0 == 2610) {
			field2955[++field2956 - 1] = var4.field3595;
			return 1;
		} else if (var0 == 2611) {
			field2955[++field2956 - 1] = var4.field3550;
			return 1;
		} else if (var0 == 2612) {
			field2955[++field2956 - 1] = var4.field3551;
			return 1;
		} else if (var0 == 2613) {
			field2955[++field2956 - 1] = var4.field3555.getId();
			return 1;
		} else if (var0 == 2614) {
			field2955[++field2956 - 1] = var4.field3583 ? 1 : 0;
			return 1;
		} else {
			class74 var5;
			if (var0 == 2617) {
				var5 = var4.method2324();
				field2955[++field2956 - 1] = var5 != null ? var5.field523 : 0;
			}

			if (var0 == 2618) {
				var5 = var4.method2324();
				field2955[++field2956 - 1] = null != var5 ? var5.field524 : 0;
				return 1;
			} else {
				class135 var8;
				if (var0 == 2619) {
					var8 = var4.method2323((byte)52);
					field2965[++class176.field1224 - 1] = var8 != null ? var8.method657().method113() : "";
					return 1;
				} else if (var0 == 2620) {
					var5 = var4.method2324();
					field2955[++field2956 - 1] = var5 != null ? var5.field525 : 0;
					return 1;
				} else if (var0 == 2621) {
					var8 = var4.method2323((byte)8);
					field2955[++field2956 - 1] = var8 != null ? var8.method692() : 0;
					return 1;
				} else if (var0 == 2622) {
					var8 = var4.method2323((byte)101);
					field2955[++field2956 - 1] = null != var8 ? var8.method667() : 0;
					return 1;
				} else if (var0 == 2623) {
					var8 = var4.method2323((byte)116);
					field2955[++field2956 - 1] = null != var8 ? var8.method668() : 0;
					return 1;
				} else if (var0 == 2624) {
					var8 = var4.method2323((byte)83);
					field2955[++field2956 - 1] = var8 != null && var8.method659() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var8 = var4.method2323((byte)81);
						field2965[++class176.field1224 - 1] = var8 != null ? var8.method658().method2395() : "";
						return 1;
					} else if (var0 == 2627) {
						var8 = var4.method2323((byte)92);
						int var6 = null != var8 ? var8.method663() : 0;
						int var7 = var8 != null ? var8.method662() : 0;
						field2955[++field2956 - 1] = Math.min(var6, var7);
						field2955[++field2956 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 2628) {
						var8 = var4.method2323((byte)69);
						field2955[++field2956 - 1] = null != var8 ? var8.method662() : 0;
						return 1;
					} else if (var0 == 2629) {
						var8 = var4.method2323((byte)97);
						field2955[++field2956 - 1] = null != var8 ? var8.method669() : 0;
						return 1;
					} else if (var0 == 2630) {
						var8 = var4.method2323((byte)44);
						field2955[++field2956 - 1] = null != var8 ? var8.method620() : 0;
						return 1;
					} else if (var0 == 2631) {
						var8 = var4.method2323((byte)126);
						field2955[++field2956 - 1] = var8 != null ? var8.method670() : 0;
						return 1;
					} else if (var0 == 2632) {
						var8 = var4.method2323((byte)28);
						field2955[++field2956 - 1] = null != var8 ? var8.method672() : 0;
						return 1;
					} else {
						class408 var9;
						if (var0 == 2633) {
							var9 = var4.method2308();
							field2955[field2956 - 1] = var9 != null ? var9.method1870(field2955[field2956 - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var9 = var4.method2308();
							field2955[field2956 - 1] = var9 != null ? var9.method1877((char)field2955[field2956 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method2323((byte)39);
					field2955[++field2956 - 1] = var8 != null && var8.method660() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	static int method2072(int var0, class83 var1, boolean var2) {
		class496 var4;
		if (var0 == 2700) {
			var4 = class208.interfaceConfigs.method345(field2955[--field2956]);
			field2955[++field2956 - 1] = var4.field3602;
			return 1;
		} else if (var0 == 2701) {
			var4 = class208.interfaceConfigs.method345(field2955[--field2956]);
			if (var4.field3602 != -1) {
				field2955[++field2956 - 1] = var4.field3656;
			} else {
				field2955[++field2956 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2702) {
			int var6 = field2955[--field2956];
			InterfaceComponent var5 = (InterfaceComponent)Client.interfaceComponents.get((long)var6);
			if (var5 != null) {
				field2955[++field2956 - 1] = 1;
			} else {
				field2955[++field2956 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2706) {
			field2955[++field2956 - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var4 = class208.interfaceConfigs.method345(field2955[--field2956]);
			field2955[++field2956 - 1] = var4.method2317() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var4 = class208.interfaceConfigs.method345(field2955[--field2956]);
			return method2056(var4);
		} else if (var0 == 2709) {
			var4 = class208.interfaceConfigs.method345(field2955[--field2956]);
			return method2032(var4);
		} else {
			return 2;
		}
	}

	static int method2069(int var0, class83 var1, boolean var2) {
		String var12;
		if (var0 == 3100) {
			var12 = field2965[--class176.field1224];
			class346.method1672(0, "", var12);
			return 1;
		} else if (var0 == 3101) {
			field2956 -= 2;
			class102.method468(class114.field720, field2955[field2956], field2955[1 + field2956]);
			return 1;
		} else if (var0 == 3103) {
			if (!field2963) {
				field2962 = true;
			}

			return 1;
		} else {
			int var11;
			if (var0 == 3104) {
				var12 = field2965[--class176.field1224];
				var11 = 0;
				if (class385.method1812(var12)) {
					var11 = class385.method1807(var12);
				}

				class341 var15 = class341.createClientPacket(ClientPacket.field3101, Client.field1891.field4219);
				var15.buffer.writeInt(var11);
				Client.field1891.method2612(var15);
				return 1;
			} else {
				class341 var9;
				if (var0 == 3105) {
					var12 = field2965[--class176.field1224];
					var9 = class341.createClientPacket(ClientPacket.field3102, Client.field1891.field4219);
					var9.buffer.writeByte(var12.length() + 1);
					var9.buffer.writeString(var12);
					Client.field1891.method2612(var9);
					return 1;
				} else if (var0 == 3106) {
					var12 = field2965[--class176.field1224];
					var9 = class341.createClientPacket(ClientPacket.field3061, Client.field1891.field4219);
					var9.buffer.writeByte(var12.length() + 1);
					var9.buffer.writeString(var12);
					Client.field1891.method2612(var9);
					return 1;
				} else {
					int var4;
					String var5;
					if (var0 == 3107) {
						var4 = field2955[--field2956];
						var5 = field2965[--class176.field1224];
						Client.method1439(var4, var5);
						return 1;
					} else if (var0 == 3108) {
						field2956 -= 3;
						var4 = field2955[field2956];
						var11 = field2955[field2956 + 1];
						int var14 = field2955[2 + field2956];
						class496 var16 = class208.interfaceConfigs.method345(var14);
						Client.method1380(var16, var4, var11);
						return 1;
					} else if (var0 == 3109) {
						field2956 -= 2;
						var4 = field2955[field2956];
						var11 = field2955[field2956 + 1];
						class496 var13 = var2 ? class506.field3704 : class107.field682;
						Client.method1380(var13, var4, var11);
						return 1;
					} else if (var0 == 3110) {
						class108.field685 = field2955[--field2956] == 1;
						return 1;
					} else if (var0 == 3111) {
						field2955[++field2956 - 1] = class109.field693.method437() ? 1 : 0;
						return 1;
					} else if (var0 == 3112) {
						class109.field693.method458(field2955[--field2956] == 1);
						return 1;
					} else if (var0 == 3113) {
						var12 = field2965[--class176.field1224];
						boolean var10 = field2955[--field2956] == 1;
						class467.method2170(var12, var10, false);
						return 1;
					} else if (var0 == 3115) {
						var4 = field2955[--field2956];
						var9 = class341.createClientPacket(ClientPacket.field3097, Client.field1891.field4219);
						var9.buffer.writeShort(var4);
						Client.field1891.method2612(var9);
						return 1;
					} else if (var0 == 3116) {
						var4 = field2955[--field2956];
						class176.field1224 -= 2;
						var5 = field2965[class176.field1224];
						String var6 = field2965[1 + class176.field1224];
						if (var5.length() > 500) {
							return 1;
						} else if (var6.length() > 500) {
							return 1;
						} else {
							class341 var7 = class341.createClientPacket(ClientPacket.field3104, Client.field1891.field4219);
							var7.buffer.writeShort(1 + Buffer.method2535(var5) + Buffer.method2535(var6));
							var7.buffer.writeString(var5);
							var7.buffer.writeString(var6);
							var7.buffer.writeByteNEG(var4);
							Client.field1891.method2612(var7);
							return 1;
						}
					} else if (var0 == 3117) {
						--field2956;
						return 1;
					} else if (var0 == 3118) {
						Client.field2027 = field2955[--field2956] == 1;
						return 1;
					} else if (var0 == 3119) {
						Client.field1961 = field2955[--field2956] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (field2955[--field2956] == 1) {
							Client.field2134 |= 1;
						} else {
							Client.field2134 &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (field2955[--field2956] == 1) {
							Client.field2134 |= 2;
						} else {
							Client.field2134 &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (field2955[--field2956] == 1) {
							Client.field2134 |= 4;
						} else {
							Client.field2134 &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (field2955[--field2956] == 1) {
							Client.field2134 |= 8;
						} else {
							Client.field2134 &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.field2134 = 0;
						return 1;
					} else if (var0 == 3125) {
						Client.field1954 = field2955[--field2956] == 1;
						return 1;
					} else if (var0 == 3126) {
						Client.field2125 = field2955[--field2956] == 1;
						return 1;
					} else if (var0 == 3127) {
						Client.method1362(field2955[--field2956] == 1);
						return 1;
					} else if (var0 == 3128) {
						field2955[++field2956 - 1] = Client.method1316() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						field2956 -= 2;
						Client.field2121 = field2955[field2956];
						Client.field1929 = field2955[field2956 + 1];
						return 1;
					} else if (var0 == 3130) {
						field2956 -= 2;
						return 1;
					} else if (var0 == 3131) {
						--field2956;
						return 1;
					} else if (var0 == 3132) {
						field2955[++field2956 - 1] = class164.field1170;
						field2955[++field2956 - 1] = class92.field595;
						return 1;
					} else if (var0 == 3133) {
						--field2956;
						return 1;
					} else if (var0 == 3134) {
						return 1;
					} else if (var0 == 3135) {
						field2956 -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field2004 = 3;
						Client.field2005 = field2955[--field2956];
						return 1;
					} else if (var0 == 3137) {
						Client.field2004 = 2;
						Client.field2005 = field2955[--field2956];
						return 1;
					} else if (var0 == 3138) {
						Client.field2004 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field2004 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field2004 = 3;
						Client.field2005 = var2 ? class506.field3704.interfaceId : class107.field682.interfaceId;
						return 1;
					} else {
						boolean var8;
						if (var0 == 3141) {
							var8 = field2955[--field2956] == 1;
							class109.field693.method457(var8);
							return 1;
						} else if (var0 == 3142) {
							field2955[++field2956 - 1] = class109.field693.method439() ? 1 : 0;
							return 1;
						} else if (var0 == 3143) {
							var8 = field2955[--field2956] == 1;
							Client.field1885 = var8;
							if (!var8) {
								class109.field693.method450("");
							}

							return 1;
						} else if (var0 == 3144) {
							field2955[++field2956 - 1] = Client.field1885 ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == 3146) {
							var8 = field2955[--field2956] == 1;
							class109.field693.method440(!var8);
							return 1;
						} else if (var0 == 3147) {
							field2955[++field2956 - 1] = class109.field693.method438() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							field2955[++field2956 - 1] = class410.field2817;
							return 1;
						} else if (var0 == 3154) {
							field2955[++field2956 - 1] = Client.method1354();
							return 1;
						} else if (var0 == 3155) {
							--class176.field1224;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							field2956 -= 2;
							return 1;
						} else if (var0 == 3158) {
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--field2956;
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--field2956;
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class176.field1224;
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--field2956;
							field2965[++class176.field1224 - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--field2956;
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							field2956 -= 2;
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							field2956 -= 2;
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							field2956 -= 2;
							field2965[++class176.field1224 - 1] = "";
							field2965[++class176.field1224 - 1] = "";
							field2965[++class176.field1224 - 1] = "";
							field2965[++class176.field1224 - 1] = "";
							field2965[++class176.field1224 - 1] = "";
							field2965[++class176.field1224 - 1] = "";
							field2965[++class176.field1224 - 1] = "";
							field2965[++class176.field1224 - 1] = "";
							field2965[++class176.field1224 - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--field2956;
							return 1;
						} else if (var0 == 3173) {
							--field2956;
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--field2956;
							return 1;
						} else if (var0 == 3175) {
							field2955[++field2956 - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class176.field1224;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class176.field1224;
							return 1;
						} else if (var0 == 3181) {
							Client.method1465(field2955[--field2956]);
							return 1;
						} else if (var0 == 3182) {
							field2955[++field2956 - 1] = Client.method1412();
							return 1;
						} else if (var0 == 3189) {
							var4 = field2955[--field2956];
							Client.method1454(var4);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	static int method2059(int var0, class83 var1, boolean var2) {
		if (var0 == 3200) {
			field2956 -= 3;
			Client.method1456(field2955[field2956], field2955[field2956 + 1], field2955[field2956 + 2]);
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			int var13;
			int var16;
			if (var0 == 3201) {
				field2956 -= 5;
				var13 = field2955[field2956];
				var16 = field2955[1 + field2956];
				var6 = field2955[field2956 + 2];
				var7 = field2955[3 + field2956];
				var8 = field2955[4 + field2956];
				ArrayList var15 = new ArrayList();
				var15.add(var13);
				Client.method1393(var15, var16, var6, var7, var8);
				return 1;
			} else if (var0 == 3202) {
				field2956 -= 2;
				Client.method1450(field2955[field2956], field2955[1 + field2956]);
				return 1;
			} else {
				class358 var4;
				class109 var5;
				String var12;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var11;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var13 = field2955[--field2956];
							var16 = 0;
							class358 var19 = (class358)class26.method87(class358.method1718(), var13);
							if (var19 != null) {
								var16 = class358.field2465 != var19 ? 1 : 0;
							}

							field2955[++field2956 - 1] = var16;
							return 1;
						} else if (var0 == 3218) {
							var13 = field2955[--field2956];
							var16 = 0;
							class109 var18 = (class109)class26.method87(class109.method505(), var13);
							if (null != var18) {
								var16 = class109.field694 != var18 ? 1 : 0;
							}

							field2955[++field2956 - 1] = var16;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								field2956 -= 2;
								var13 = field2955[field2956];
								var16 = field2955[1 + field2956];
								class483.method2223(var13, var16);
								return 1;
							} else if (var0 == 3221) {
								field2956 -= 6;
								var13 = field2955[field2956];
								var16 = field2955[1 + field2956];
								var6 = field2955[2 + field2956];
								var7 = field2955[3 + field2956];
								var8 = field2955[4 + field2956];
								int var9 = field2955[5 + field2956];
								ArrayList var10 = new ArrayList();
								var10.add(var13);
								var10.add(var16);
								Client.method1393(var10, var6, var7, var8, var9);
								return 1;
							} else if (var0 == 3222) {
								field2956 -= 4;
								var13 = field2955[field2956];
								var16 = field2955[field2956 + 1];
								var6 = field2955[field2956 + 2];
								var7 = field2955[field2956 + 3];
								class483.method2222(var13, var16, var6, var7);
								return 1;
							} else {
								return 2;
							}
						} else {
							var4 = class358.field2465;
							var5 = class109.field694;
							var11 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var8 = field2955[--field2956];
								var4 = (class358)class26.method87(class358.method1718(), var8);
								if (null == var4) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var8));
								}
							}

							if (var0 == 3219) {
								var8 = field2955[--field2956];
								var5 = (class109)class26.method87(class109.method505(), var8);
								if (null == var5) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var8));
								}
							}

							String var14;
							if (class109.field694 == var5) {
								switch(var4.field2468) {
								case 1:
								case 2:
								case 3:
									var11 = false;
									var7 = 1;
									break;
								case 4:
									var11 = false;
									var7 = Integer.MAX_VALUE;
									break;
								case 5:
									var11 = false;
									var7 = 100;
									break;
								default:
									var14 = String.format("Unkown device option: %s.", var4.toString());
									throw new RuntimeException(var14);
								}
							} else {
								switch(var5.field689) {
								case 1:
									var11 = false;
									var7 = 1;
									break;
								case 2:
								case 3:
								case 4:
									var11 = false;
									var7 = 100;
									break;
								default:
									var14 = String.format("Unkown game option: %s.", var5.toString());
									throw new RuntimeException(var14);
								}
							}

							field2955[++field2956 - 1] = 0;
							field2955[++field2956 - 1] = var7;
							return 1;
						}
					} else {
						var4 = class358.field2465;
						var5 = class109.field694;
						var11 = false;
						if (var0 == 3214) {
							var7 = field2955[--field2956];
							var4 = (class358)class26.method87(class358.method1718(), var7);
							if (var4 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var7));
							}
						}

						if (var0 == 3215) {
							var7 = field2955[--field2956];
							var5 = (class109)class26.method87(class109.method505(), var7);
							if (null == var5) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var7));
							}
						}

						if (var0 == 3210) {
							var7 = field2955[--field2956];
							var4 = (class358)class26.method87(class358.method1718(), var7);
							if (var4 == null) {
								var5 = (class109)class26.method87(class109.method505(), var7);
								if (var5 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var7));
								}
							}
						} else if (var0 == 3182) {
							var4 = class358.field2467;
						} else if (var0 == 3204) {
							var5 = class109.field688;
						} else if (var0 == 3206) {
							var5 = class109.field690;
						} else if (var0 == 3208) {
							var5 = class109.field695;
						}

						if (var5 == class109.field694) {
							switch(var4.field2468) {
							case 1:
								var6 = class109.field693.method439() ? 1 : 0;
								break;
							case 2:
								var6 = class109.field693.method438() ? 1 : 0;
								break;
							case 3:
								var6 = class109.field693.method452() ? 1 : 0;
								break;
							case 4:
								var6 = class109.field693.method460();
								break;
							case 5:
								var6 = Client.method1412();
								break;
							default:
								var12 = String.format("Unkown device option: %s.", var4.toString());
								throw new RuntimeException(var12);
							}
						} else {
							switch(var5.field689) {
							case 1:
								var6 = class109.field693.method437() ? 1 : 0;
								break;
							case 2:
								var7 = class109.field693.method446();
								var6 = Math.round((float)(var7 * 100) / 255.0F);
								break;
							case 3:
								var7 = class109.field693.method448();
								var6 = Math.round((float)(var7 * 100) / 127.0F);
								break;
							case 4:
								var7 = class109.field693.method464();
								var6 = Math.round((float)(var7 * 100) / 127.0F);
								break;
							default:
								var12 = String.format("Unkown game option: %s.", var5.toString());
								throw new RuntimeException(var12);
							}
						}

						field2955[++field2956 - 1] = var6;
						return 1;
					}
				} else {
					var4 = class358.field2465;
					var5 = class109.field694;
					var6 = field2955[--field2956];
					if (var0 == 3212) {
						var7 = field2955[--field2956];
						var4 = (class358)class26.method87(class358.method1718(), var7);
						if (null == var4) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var7));
						}
					}

					if (var0 == 3213) {
						var7 = field2955[--field2956];
						var5 = (class109)class26.method87(class109.method505(), var7);
						if (var5 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var7));
						}
					}

					if (var0 == 3209) {
						var7 = field2955[--field2956];
						var4 = (class358)class26.method87(class358.method1718(), var7);
						if (null == var4) {
							var5 = (class109)class26.method87(class109.method505(), var7);
							if (var5 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var7));
							}
						}
					} else if (var0 == 3181) {
						var4 = class358.field2467;
					} else if (var0 == 3203) {
						var5 = class109.field688;
					} else if (var0 == 3205) {
						var5 = class109.field690;
					} else if (var0 == 3207) {
						var5 = class109.field695;
					}

					if (class109.field694 == var5) {
						switch(var4.field2468) {
						case 1:
							class109.field693.method457(var6 == 1);
							break;
						case 2:
							class109.field693.method440(var6 == 1);
							break;
						case 3:
							class109.field693.method461(var6 == 1);
							break;
						case 4:
							if (var6 < 0) {
								var6 = 0;
							}

							class109.field693.method447(var6);
							break;
						case 5:
							Client.method1465(var6);
							break;
						default:
							var12 = String.format("Unkown device option: %s.", var4.toString());
							throw new RuntimeException(var12);
						}
					} else {
						switch(var5.field689) {
						case 1:
							class109.field693.method458(var6 == 1);
							break;
						case 2:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 255) / 100.0F);
							Client.method1379(var7);
							break;
						case 3:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 127) / 100.0F);
							Client.method1402(var7);
							break;
						case 4:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 127) / 100.0F);
							Client.method1383(var7);
							break;
						default:
							var12 = String.format("Unkown game option: %s.", var5.toString());
							throw new RuntimeException(var12);
						}
					}

					return 1;
				}
			}
		}
	}

	static int method2067(int var0, class83 var1, boolean var2) {
		if (var0 == 3300) {
			field2955[++field2956 - 1] = Client.field1846;
			return 1;
		} else {
			int var4;
			int var5;
			if (var0 == 3301) {
				field2956 -= 2;
				var4 = field2955[field2956];
				var5 = field2955[field2956 + 1];
				field2955[++field2956 - 1] = class482.method2214(var4, var5);
				return 1;
			} else if (var0 == 3302) {
				field2956 -= 2;
				var4 = field2955[field2956];
				var5 = field2955[field2956 + 1];
				field2955[++field2956 - 1] = class482.method2209(var4, var5);
				return 1;
			} else if (var0 == 3303) {
				field2956 -= 2;
				var4 = field2955[field2956];
				var5 = field2955[1 + field2956];
				field2955[++field2956 - 1] = class482.method2212(var4, var5);
				return 1;
			} else if (var0 == 3304) {
				var4 = field2955[--field2956];
				field2955[++field2956 - 1] = class35.method105(var4).field175;
				return 1;
			} else if (var0 == 3305) {
				var4 = field2955[--field2956];
				field2955[++field2956 - 1] = Client.field1877[var4];
				return 1;
			} else if (var0 == 3306) {
				var4 = field2955[--field2956];
				field2955[++field2956 - 1] = Client.field1970[var4];
				return 1;
			} else if (var0 == 3307) {
				var4 = field2955[--field2956];
				field2955[++field2956 - 1] = Client.field1976[var4];
				return 1;
			} else {
				int var6;
				if (var0 == 3308) {
					var4 = class212.field1393;
					var5 = class80.selectedTileX + (class114.field720.field368 >> 7);
					var6 = (class114.field720.field329 >> 7) + class425.selectedTileXYIdk;
					field2955[++field2956 - 1] = var6 + (var4 << 28) + (var5 << 14);
					return 1;
				} else if (var0 == 3309) {
					var4 = field2955[--field2956];
					field2955[++field2956 - 1] = var4 >> 14 & 16383;
					return 1;
				} else if (var0 == 3310) {
					var4 = field2955[--field2956];
					field2955[++field2956 - 1] = var4 >> 28;
					return 1;
				} else if (var0 == 3311) {
					var4 = field2955[--field2956];
					field2955[++field2956 - 1] = var4 & 16383;
					return 1;
				} else if (var0 == 3312) {
					field2955[++field2956 - 1] = Client.field1835 ? 1 : 0;
					return 1;
				} else if (var0 == 3313) {
					field2956 -= 2;
					var4 = 32768 + field2955[field2956];
					var5 = field2955[1 + field2956];
					field2955[++field2956 - 1] = class482.method2214(var4, var5);
					return 1;
				} else if (var0 == 3314) {
					field2956 -= 2;
					var4 = field2955[field2956] + 32768;
					var5 = field2955[1 + field2956];
					field2955[++field2956 - 1] = class482.method2209(var4, var5);
					return 1;
				} else if (var0 == 3315) {
					field2956 -= 2;
					var4 = field2955[field2956] + 32768;
					var5 = field2955[field2956 + 1];
					field2955[++field2956 - 1] = class482.method2212(var4, var5);
					return 1;
				} else if (var0 == 3316) {
					if (Client.field2087 >= 2) {
						field2955[++field2956 - 1] = Client.field2087;
					} else {
						field2955[++field2956 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3317) {
					field2955[++field2956 - 1] = Client.field1952;
					return 1;
				} else if (var0 == 3318) {
					field2955[++field2956 - 1] = Client.field1832;
					return 1;
				} else if (var0 == 3321) {
					field2955[++field2956 - 1] = Client.field2008 / 100;
					return 1;
				} else if (var0 == 3322) {
					field2955[++field2956 - 1] = Client.field2009;
					return 1;
				} else if (var0 == 3323) {
					if (Client.field2012) {
						field2955[++field2956 - 1] = 1;
					} else {
						field2955[++field2956 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3324) {
					field2955[++field2956 - 1] = Client.field1833;
					return 1;
				} else if (var0 == 3325) {
					field2956 -= 4;
					var4 = field2955[field2956];
					var5 = field2955[1 + field2956];
					var6 = field2955[2 + field2956];
					int var7 = field2955[3 + field2956];
					var4 += var5 << 14;
					var4 += var6 << 28;
					var4 += var7;
					field2955[++field2956 - 1] = var4;
					return 1;
				} else if (var0 == 3326) {
					field2955[++field2956 - 1] = Client.field1965;
					return 1;
				} else if (var0 == 3327) {
					field2955[++field2956 - 1] = Client.field1910;
					return 1;
				} else if (var0 == 3331) {
					field2955[++field2956 - 1] = Client.field2008;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	static int method2078(int var0, class83 var1, boolean var2) {
		int var4;
		int var5;
		int var7;
		if (var0 == 3400) {
			field2956 -= 2;
			var4 = field2955[field2956];
			var5 = field2955[field2956 + 1];
			class500 var11 = class500.method2365(var4);
			if (var11.field3684 != 's') {
			}

			for (var7 = 0; var7 < var11.field3687; ++var7) {
				if (var5 == var11.field3688[var7]) {
					field2965[++class176.field1224 - 1] = var11.field3683[var7];
					var11 = null;
					break;
				}
			}

			if (var11 != null) {
				field2965[++class176.field1224 - 1] = var11.field3681;
			}

			return 1;
		} else if (var0 != 3408) {
			if (var0 == 3411) {
				var4 = field2955[--field2956];
				class500 var10 = class500.method2365(var4);
				field2955[++field2956 - 1] = var10.method2363();
				return 1;
			} else {
				return 2;
			}
		} else {
			field2956 -= 4;
			var4 = field2955[field2956];
			var5 = field2955[1 + field2956];
			int var6 = field2955[field2956 + 2];
			var7 = field2955[field2956 + 3];
			class500 var8 = class500.method2365(var6);
			if (var8.field3685 == var4 && var8.field3684 == var5) {
				for (int var9 = 0; var9 < var8.field3687; ++var9) {
					if (var7 == var8.field3688[var9]) {
						if (var5 == 115) {
							field2965[++class176.field1224 - 1] = var8.field3683[var9];
						} else {
							field2955[++field2956 - 1] = var8.field3689[var9];
						}

						var8 = null;
						break;
					}
				}

				if (null != var8) {
					if (var5 == 115) {
						field2965[++class176.field1224 - 1] = var8.field3681;
					} else {
						field2955[++field2956 - 1] = var8.field3686;
					}
				}

				return 1;
			} else {
				if (var5 == 115) {
					field2965[++class176.field1224 - 1] = class513.field3757;
				} else {
					field2955[++field2956 - 1] = 0;
				}

				return 1;
			}
		}
	}

	static int method2062(int var0, class83 var1, boolean var2) {
		int var4;
		if (var0 == 3500) {
			var4 = field2955[--field2956];
			field2955[++field2956 - 1] = Client.field2067.method1798(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var4 = field2955[--field2956];
			field2955[++field2956 - 1] = Client.field2067.method1797(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var4 = field2955[--field2956];
			field2955[++field2956 - 1] = Client.field2067.method1796(var4) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	static int method2041(int var0, class83 var1, boolean var2) {
		if (var0 == 3600) {
			if (class35.field176.field545 == 0) {
				field2955[++field2956 - 1] = -2;
			} else if (class35.field176.field545 == 1) {
				field2955[++field2956 - 1] = -1;
			} else {
				field2955[++field2956 - 1] = class35.field176.field546.method2250();
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3601) {
				var4 = field2955[--field2956];
				if (class35.field176.method376() && var4 >= 0 && var4 < class35.field176.field546.method2250()) {
					class268 var9 = (class268)class35.field176.field546.method2237(var4);
					field2965[++class176.field1224 - 1] = var9.method1494();
					field2965[++class176.field1224 - 1] = var9.method1491();
				} else {
					field2965[++class176.field1224 - 1] = "";
					field2965[++class176.field1224 - 1] = "";
				}

				return 1;
			} else if (var0 == 3602) {
				var4 = field2955[--field2956];
				if (class35.field176.method376() && var4 >= 0 && var4 < class35.field176.field546.method2250()) {
					field2955[++field2956 - 1] = ((class111)class35.field176.field546.method2237(var4)).field704;
				} else {
					field2955[++field2956 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3603) {
				var4 = field2955[--field2956];
				if (class35.field176.method376() && var4 >= 0 && var4 < class35.field176.field546.method2250()) {
					field2955[++field2956 - 1] = ((class111)class35.field176.field546.method2237(var4)).field705;
				} else {
					field2955[++field2956 - 1] = 0;
				}

				return 1;
			} else {
				String var10;
				if (var0 == 3604) {
					var10 = field2965[--class176.field1224];
					int var8 = field2955[--field2956];
					class14.method64(var10, var8);
					return 1;
				} else if (var0 == 3605) {
					var10 = field2965[--class176.field1224];
					class35.field176.method384(var10);
					return 1;
				} else if (var0 == 3606) {
					var10 = field2965[--class176.field1224];
					class35.field176.method379(var10);
					return 1;
				} else if (var0 == 3607) {
					var10 = field2965[--class176.field1224];
					class35.field176.method373(var10);
					return 1;
				} else if (var0 == 3608) {
					var10 = field2965[--class176.field1224];
					boolean var7 = true;
					class35.field176.method380(var10, true);
					return 1;
				} else if (var0 == 3609) {
					var10 = field2965[--class176.field1224];
					var10 = Client.method1327(var10);
					field2955[++field2956 - 1] = class35.field176.method374(new class509(var10, class474.field3325), false) ? 1 : 0;
					return 1;
				} else if (var0 == 3611) {
					if (null != class257.field1749) {
						field2965[++class176.field1224 - 1] = class257.field1749.field4210;
					} else {
						field2965[++class176.field1224 - 1] = "";
					}

					return 1;
				} else if (var0 == 3612) {
					if (class257.field1749 != null) {
						field2955[++field2956 - 1] = class257.field1749.method2250();
					} else {
						field2955[++field2956 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3613) {
					var4 = field2955[--field2956];
					if (null != class257.field1749 && var4 < class257.field1749.method2250()) {
						field2965[++class176.field1224 - 1] = class257.field1749.method2237(var4).method1490().method2398();
					} else {
						field2965[++class176.field1224 - 1] = "";
					}

					return 1;
				} else if (var0 == 3614) {
					var4 = field2955[--field2956];
					if (class257.field1749 != null && var4 < class257.field1749.method2250()) {
						field2955[++field2956 - 1] = ((class111)class257.field1749.method2237(var4)).method510();
					} else {
						field2955[++field2956 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3615) {
					var4 = field2955[--field2956];
					if (null != class257.field1749 && var4 < class257.field1749.method2250()) {
						field2955[++field2956 - 1] = ((class111)class257.field1749.method2237(var4)).field705;
					} else {
						field2955[++field2956 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3616) {
					field2955[++field2956 - 1] = null != class257.field1749 ? class257.field1749.field4207 : 0;
					return 1;
				} else if (var0 == 3617) {
					var10 = field2965[--class176.field1224];
					Client.method1310(var10);
					return 1;
				} else if (var0 == 3618) {
					field2955[++field2956 - 1] = null != class257.field1749 ? class257.field1749.field4208 : 0;
					return 1;
				} else if (var0 == 3619) {
					var10 = field2965[--class176.field1224];
					Client.method1405(var10);
					return 1;
				} else if (var0 == 3620) {
					Client.method1421();
					return 1;
				} else if (var0 == 3621) {
					if (!class35.field176.method376()) {
						field2955[++field2956 - 1] = -1;
					} else {
						field2955[++field2956 - 1] = class35.field176.field544.method2250();
					}

					return 1;
				} else if (var0 == 3622) {
					var4 = field2955[--field2956];
					if (class35.field176.method376() && var4 >= 0 && var4 < class35.field176.field544.method2250()) {
						class181 var5 = (class181)class35.field176.field544.method2237(var4);
						field2965[++class176.field1224 - 1] = var5.method1494();
						field2965[++class176.field1224 - 1] = var5.method1491();
					} else {
						field2965[++class176.field1224 - 1] = "";
						field2965[++class176.field1224 - 1] = "";
					}

					return 1;
				} else if (var0 == 3623) {
					var10 = field2965[--class176.field1224];
					var10 = Client.method1327(var10);
					field2955[++field2956 - 1] = class35.field176.method375(new class509(var10, class474.field3325)) ? 1 : 0;
					return 1;
				} else if (var0 == 3624) {
					var4 = field2955[--field2956];
					if (null != class257.field1749 && var4 < class257.field1749.method2250() && class257.field1749.method2237(var4).method1490().equals(class114.field720.field3005)) {
						field2955[++field2956 - 1] = 1;
					} else {
						field2955[++field2956 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3625) {
					if (null != class257.field1749 && class257.field1749.field4211 != null) {
						field2965[++class176.field1224 - 1] = class257.field1749.field4211;
					} else {
						field2965[++class176.field1224 - 1] = "";
					}

					return 1;
				} else if (var0 == 3626) {
					var4 = field2955[--field2956];
					if (class257.field1749 != null && var4 < class257.field1749.method2250() && ((class173)class257.field1749.method2237(var4)).method914()) {
						field2955[++field2956 - 1] = 1;
					} else {
						field2955[++field2956 - 1] = 0;
					}

					return 1;
				} else if (var0 != 3627) {
					if (var0 == 3628) {
						class35.field176.field546.method2245();
						return 1;
					} else {
						boolean var6;
						if (var0 == 3629) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field546.method2249(new class36(var6));
							return 1;
						} else if (var0 == 3630) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field546.method2249(new class167(var6));
							return 1;
						} else if (var0 == 3631) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field546.method2249(new class233(var6));
							return 1;
						} else if (var0 == 3632) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field546.method2249(new class472(var6));
							return 1;
						} else if (var0 == 3633) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field546.method2249(new class91(var6));
							return 1;
						} else if (var0 == 3634) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field546.method2249(new class331(var6));
							return 1;
						} else if (var0 == 3635) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field546.method2249(new class448(var6));
							return 1;
						} else if (var0 == 3636) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field546.method2249(new class108(var6));
							return 1;
						} else if (var0 == 3637) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field546.method2249(new class387(var6));
							return 1;
						} else if (var0 == 3638) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field546.method2249(new class523(var6));
							return 1;
						} else if (var0 == 3639) {
							class35.field176.field546.method2238();
							return 1;
						} else if (var0 == 3640) {
							class35.field176.field544.method2245();
							return 1;
						} else if (var0 == 3641) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field544.method2249(new class36(var6));
							return 1;
						} else if (var0 == 3642) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field544.method2249(new class167(var6));
							return 1;
						} else if (var0 == 3643) {
							class35.field176.field544.method2238();
							return 1;
						} else if (var0 == 3644) {
							if (class257.field1749 != null) {
								class257.field1749.method2245();
							}

							return 1;
						} else if (var0 == 3645) {
							var6 = field2955[--field2956] == 1;
							if (class257.field1749 != null) {
								class257.field1749.method2249(new class36(var6));
							}

							return 1;
						} else if (var0 == 3646) {
							var6 = field2955[--field2956] == 1;
							if (null != class257.field1749) {
								class257.field1749.method2249(new class167(var6));
							}

							return 1;
						} else if (var0 == 3647) {
							var6 = field2955[--field2956] == 1;
							if (class257.field1749 != null) {
								class257.field1749.method2249(new class233(var6));
							}

							return 1;
						} else if (var0 == 3648) {
							var6 = field2955[--field2956] == 1;
							if (null != class257.field1749) {
								class257.field1749.method2249(new class472(var6));
							}

							return 1;
						} else if (var0 == 3649) {
							var6 = field2955[--field2956] == 1;
							if (null != class257.field1749) {
								class257.field1749.method2249(new class91(var6));
							}

							return 1;
						} else if (var0 == 3650) {
							var6 = field2955[--field2956] == 1;
							if (class257.field1749 != null) {
								class257.field1749.method2249(new class331(var6));
							}

							return 1;
						} else if (var0 == 3651) {
							var6 = field2955[--field2956] == 1;
							if (null != class257.field1749) {
								class257.field1749.method2249(new class448(var6));
							}

							return 1;
						} else if (var0 == 3652) {
							var6 = field2955[--field2956] == 1;
							if (class257.field1749 != null) {
								class257.field1749.method2249(new class108(var6));
							}

							return 1;
						} else if (var0 == 3653) {
							var6 = field2955[--field2956] == 1;
							if (class257.field1749 != null) {
								class257.field1749.method2249(new class387(var6));
							}

							return 1;
						} else if (var0 == 3654) {
							var6 = field2955[--field2956] == 1;
							if (null != class257.field1749) {
								class257.field1749.method2249(new class523(var6));
							}

							return 1;
						} else if (var0 == 3655) {
							if (class257.field1749 != null) {
								class257.field1749.method2238();
							}

							return 1;
						} else if (var0 == 3656) {
							var6 = field2955[--field2956] == 1;
							class35.field176.field546.method2249(new class90(var6));
							return 1;
						} else if (var0 == 3657) {
							var6 = field2955[--field2956] == 1;
							if (null != class257.field1749) {
								class257.field1749.method2249(new class90(var6));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = field2955[--field2956];
					if (null != class257.field1749 && var4 < class257.field1749.method2250() && ((class173)class257.field1749.method2237(var4)).method916()) {
						field2955[++field2956 - 1] = 1;
					} else {
						field2955[++field2956 - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	static int method2080(int var0, class83 var1, boolean var2) {
		return 2;
	}

	static int method2037(int var0, class83 var1, boolean var2) {
		if (var0 == 3800) {
			if (null != class465.field3294) {
				field2955[++field2956 - 1] = 1;
				class361.field2479 = class465.field3294;
			} else {
				field2955[++field2956 - 1] = 0;
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3801) {
				var4 = field2955[--field2956];
				if (Client.field1919[var4] != null) {
					field2955[++field2956 - 1] = 1;
					class361.field2479 = Client.field1919[var4];
				} else {
					field2955[++field2956 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3802) {
				field2965[++class176.field1224 - 1] = class361.field2479.field3724;
				return 1;
			} else if (var0 == 3803) {
				field2955[++field2956 - 1] = class361.field2479.field3726 ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				field2955[++field2956 - 1] = class361.field2479.field3728;
				return 1;
			} else if (var0 == 3805) {
				field2955[++field2956 - 1] = class361.field2479.field3741;
				return 1;
			} else if (var0 == 3806) {
				field2955[++field2956 - 1] = class361.field2479.field3729;
				return 1;
			} else if (var0 == 3807) {
				field2955[++field2956 - 1] = class361.field2479.field3719;
				return 1;
			} else if (var0 == 3809) {
				field2955[++field2956 - 1] = class361.field2479.field3731;
				return 1;
			} else if (var0 == 3810) {
				var4 = field2955[--field2956];
				field2965[++class176.field1224 - 1] = class361.field2479.field3727[var4];
				return 1;
			} else if (var0 == 3811) {
				var4 = field2955[--field2956];
				field2955[++field2956 - 1] = class361.field2479.field3740[var4];
				return 1;
			} else if (var0 == 3812) {
				field2955[++field2956 - 1] = class361.field2479.field3730;
				return 1;
			} else if (var0 == 3813) {
				var4 = field2955[--field2956];
				field2965[++class176.field1224 - 1] = class361.field2479.field3742[var4];
				return 1;
			} else {
				int var6;
				int var7;
				if (var0 == 3814) {
					field2956 -= 3;
					var4 = field2955[field2956];
					var7 = field2955[1 + field2956];
					var6 = field2955[2 + field2956];
					field2955[++field2956 - 1] = class361.field2479.method2412(var4, var7, var6);
					return 1;
				} else if (var0 == 3815) {
					field2955[++field2956 - 1] = class361.field2479.field3737;
					return 1;
				} else if (var0 == 3816) {
					field2955[++field2956 - 1] = class361.field2479.field3738;
					return 1;
				} else if (var0 == 3817) {
					field2955[++field2956 - 1] = class361.field2479.method2408(field2965[--class176.field1224]);
					return 1;
				} else if (var0 == 3818) {
					field2955[field2956 - 1] = class361.field2479.method2414()[field2955[field2956 - 1]];
					return 1;
				} else if (var0 == 3819) {
					field2956 -= 2;
					var4 = field2955[field2956];
					var7 = field2955[1 + field2956];
					class9.method42(var7, var4);
					return 1;
				} else if (var0 == 3820) {
					var4 = field2955[--field2956];
					field2955[++field2956 - 1] = class361.field2479.field3735[var4];
					return 1;
				} else {
					if (var0 == 3821) {
						field2956 -= 3;
						var4 = field2955[field2956];
						boolean var5 = field2955[1 + field2956] == 1;
						var6 = field2955[2 + field2956];
						Client.method1336(var6, var4, var5);
					}

					if (var0 == 3822) {
						var4 = field2955[--field2956];
						field2955[++field2956 - 1] = class361.field2479.field3736[var4] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (null != class455.field3020) {
							field2955[++field2956 - 1] = 1;
							field2957 = class455.field3020;
						} else {
							field2955[++field2956 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3851) {
						var4 = field2955[--field2956];
						if (Client.field2074[var4] != null) {
							field2955[++field2956 - 1] = 1;
							field2957 = Client.field2074[var4];
							class241.field1617 = var4;
						} else {
							field2955[++field2956 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3852) {
						field2965[++class176.field1224 - 1] = field2957.field2741;
						return 1;
					} else if (var0 == 3853) {
						field2955[++field2956 - 1] = field2957.field2745;
						return 1;
					} else if (var0 == 3854) {
						field2955[++field2956 - 1] = field2957.field2744;
						return 1;
					} else if (var0 == 3855) {
						field2955[++field2956 - 1] = field2957.method1854();
						return 1;
					} else if (var0 == 3856) {
						var4 = field2955[--field2956];
						field2965[++class176.field1224 - 1] = ((class455)field2957.field2738.get(var4)).field3021.method2398();
						return 1;
					} else if (var0 == 3857) {
						var4 = field2955[--field2956];
						field2955[++field2956 - 1] = ((class455)field2957.field2738.get(var4)).field3018;
						return 1;
					} else if (var0 == 3858) {
						var4 = field2955[--field2956];
						field2955[++field2956 - 1] = ((class455)field2957.field2738.get(var4)).field3019;
						return 1;
					} else if (var0 == 3859) {
						var4 = field2955[--field2956];
						Client.method1458(class241.field1617, var4);
						return 1;
					} else if (var0 == 3860) {
						field2955[++field2956 - 1] = field2957.method1855(field2965[--class176.field1224]);
						return 1;
					} else if (var0 == 3861) {
						field2955[field2956 - 1] = field2957.method1851()[field2955[field2956 - 1]];
						return 1;
					} else if (var0 == 3890) {
						field2955[++field2956 - 1] = class116.field724 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	static int method2046(int var0, class83 var1, boolean var2) {
		int var4;
		if (var0 == 3903) {
			var4 = field2955[--field2956];
			field2955[++field2956 - 1] = Client.field2026[var4].method2208();
			return 1;
		} else if (var0 == 3904) {
			var4 = field2955[--field2956];
			field2955[++field2956 - 1] = Client.field2026[var4].field3373;
			return 1;
		} else if (var0 == 3905) {
			var4 = field2955[--field2956];
			field2955[++field2956 - 1] = Client.field2026[var4].field3374;
			return 1;
		} else if (var0 == 3906) {
			var4 = field2955[--field2956];
			field2955[++field2956 - 1] = Client.field2026[var4].field3372;
			return 1;
		} else if (var0 == 3907) {
			var4 = field2955[--field2956];
			field2955[++field2956 - 1] = Client.field2026[var4].field3376;
			return 1;
		} else if (var0 == 3908) {
			var4 = field2955[--field2956];
			field2955[++field2956 - 1] = Client.field2026[var4].field3377;
			return 1;
		} else {
			int var14;
			if (var0 == 3910) {
				var4 = field2955[--field2956];
				var14 = Client.field2026[var4].method2205();
				field2955[++field2956 - 1] = var14 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == 3911) {
				var4 = field2955[--field2956];
				var14 = Client.field2026[var4].method2205();
				field2955[++field2956 - 1] = var14 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == 3912) {
				var4 = field2955[--field2956];
				var14 = Client.field2026[var4].method2205();
				field2955[++field2956 - 1] = var14 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == 3913) {
				var4 = field2955[--field2956];
				var14 = Client.field2026[var4].method2205();
				field2955[++field2956 - 1] = var14 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == 3914) {
					var12 = field2955[--field2956] == 1;
					if (class119.field787 != null) {
						class119.field787.method930(class183.field1276, var12);
					}

					return 1;
				} else if (var0 == 3915) {
					var12 = field2955[--field2956] == 1;
					if (class119.field787 != null) {
						class119.field787.method930(class183.field1273, var12);
					}

					return 1;
				} else if (var0 == 3916) {
					field2956 -= 2;
					var12 = field2955[field2956] == 1;
					boolean var13 = field2955[1 + field2956] == 1;
					if (class119.field787 != null) {
						Client.field1994.field540 = var13;
						class119.field787.method930(Client.field1994, var12);
					}

					return 1;
				} else if (var0 == 3917) {
					var12 = field2955[--field2956] == 1;
					if (class119.field787 != null) {
						class119.field787.method930(class183.field1274, var12);
					}

					return 1;
				} else if (var0 == 3918) {
					var12 = field2955[--field2956] == 1;
					if (class119.field787 != null) {
						class119.field787.method930(class183.field1277, var12);
					}

					return 1;
				} else if (var0 == 3919) {
					field2955[++field2956 - 1] = null == class119.field787 ? 0 : class119.field787.field1275.size();
					return 1;
				} else {
					class70 var5;
					if (var0 == 3920) {
						var4 = field2955[--field2956];
						var5 = (class70)class119.field787.field1275.get(var4);
						field2955[++field2956 - 1] = var5.field446;
						return 1;
					} else if (var0 == 3921) {
						var4 = field2955[--field2956];
						var5 = (class70)class119.field787.field1275.get(var4);
						field2965[++class176.field1224 - 1] = var5.method334();
						return 1;
					} else if (var0 == 3922) {
						var4 = field2955[--field2956];
						var5 = (class70)class119.field787.field1275.get(var4);
						field2965[++class176.field1224 - 1] = var5.method335();
						return 1;
					} else if (var0 == 3923) {
						var4 = field2955[--field2956];
						var5 = (class70)class119.field787.field1275.get(var4);
						long var6 = class38.method108() - class101.field660 - var5.field442;
						int var8 = (int)(var6 / 3600000L);
						int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
						int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * 60000)) / 1000L);
						String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
						field2965[++class176.field1224 - 1] = var11;
						return 1;
					} else if (var0 == 3924) {
						var4 = field2955[--field2956];
						var5 = (class70)class119.field787.field1275.get(var4);
						field2955[++field2956 - 1] = var5.field443.field3372;
						return 1;
					} else if (var0 == 3925) {
						var4 = field2955[--field2956];
						var5 = (class70)class119.field787.field1275.get(var4);
						field2955[++field2956 - 1] = var5.field443.field3374;
						return 1;
					} else if (var0 == 3926) {
						var4 = field2955[--field2956];
						var5 = (class70)class119.field787.field1275.get(var4);
						field2955[++field2956 - 1] = var5.field443.field3373;
						return 1;
					} else if (var0 == 3939) {
						var4 = field2955[--field2956];
						field2955[++field2956 - 1] = class158.method857(var4).field1137 ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	static int method2065(int var0, class83 var1, boolean var2) {
		int var5;
		int var10;
		if (var0 == 4000) {
			field2956 -= 2;
			var10 = field2955[field2956];
			var5 = field2955[field2956 + 1];
			field2955[++field2956 - 1] = var5 + var10;
			return 1;
		} else if (var0 == 4001) {
			field2956 -= 2;
			var10 = field2955[field2956];
			var5 = field2955[field2956 + 1];
			field2955[++field2956 - 1] = var10 - var5;
			return 1;
		} else if (var0 == 4002) {
			field2956 -= 2;
			var10 = field2955[field2956];
			var5 = field2955[field2956 + 1];
			field2955[++field2956 - 1] = var10 * var5;
			return 1;
		} else if (var0 == 4003) {
			field2956 -= 2;
			var10 = field2955[field2956];
			var5 = field2955[field2956 + 1];
			field2955[++field2956 - 1] = var10 / var5;
			return 1;
		} else if (var0 == 4004) {
			var10 = field2955[--field2956];
			field2955[++field2956 - 1] = (int)(Math.random() * (double)var10);
			return 1;
		} else if (var0 == 4005) {
			var10 = field2955[--field2956];
			field2955[++field2956 - 1] = (int)(Math.random() * (double)(var10 + 1));
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			if (var0 == 4006) {
				field2956 -= 5;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				var6 = field2955[2 + field2956];
				var7 = field2955[3 + field2956];
				var8 = field2955[field2956 + 4];
				field2955[++field2956 - 1] = (var5 - var10) * (var8 - var6) / (var7 - var6) + var10;
				return 1;
			} else if (var0 == 4007) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[field2956 + 1];
				field2955[++field2956 - 1] = var10 * var5 / 100 + var10;
				return 1;
			} else if (var0 == 4008) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				field2955[++field2956 - 1] = var10 | 1 << var5;
				return 1;
			} else if (var0 == 4009) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[field2956 + 1];
				field2955[++field2956 - 1] = var10 & -1 - (1 << var5);
				return 1;
			} else if (var0 == 4010) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				field2955[++field2956 - 1] = (var10 & 1 << var5) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == 4011) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[field2956 + 1];
				field2955[++field2956 - 1] = var10 % var5;
				return 1;
			} else if (var0 == 4012) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				if (var10 == 0) {
					field2955[++field2956 - 1] = 0;
				} else {
					field2955[++field2956 - 1] = (int)Math.pow((double)var10, (double)var5);
				}

				return 1;
			} else if (var0 == 4013) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[field2956 + 1];
				if (var10 == 0) {
					field2955[++field2956 - 1] = 0;
					return 1;
				} else {
					switch(var5) {
					case 0:
						field2955[++field2956 - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						field2955[++field2956 - 1] = var10;
						break;
					case 2:
						field2955[++field2956 - 1] = (int)Math.sqrt((double)var10);
						break;
					case 3:
						field2955[++field2956 - 1] = (int)Math.cbrt((double)var10);
						break;
					case 4:
						field2955[++field2956 - 1] = (int)Math.sqrt(Math.sqrt((double)var10));
						break;
					default:
						field2955[++field2956 - 1] = (int)Math.pow((double)var10, 1.0D / (double)var5);
					}

					return 1;
				}
			} else if (var0 == 4014) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				field2955[++field2956 - 1] = var10 & var5;
				return 1;
			} else if (var0 == 4015) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				field2955[++field2956 - 1] = var10 | var5;
				return 1;
			} else if (var0 == 4016) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				field2955[++field2956 - 1] = var10 < var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4017) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				field2955[++field2956 - 1] = var10 > var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4018) {
				field2956 -= 3;
				long var11 = (long)field2955[field2956];
				long var12 = (long)field2955[field2956 + 1];
				long var13 = (long)field2955[field2956 + 2];
				field2955[++field2956 - 1] = (int)(var13 * var11 / var12);
				return 1;
			} else if (var0 == 4025) {
				var10 = class254.method1216(field2955[--field2956]);
				field2955[++field2956 - 1] = var10;
				return 1;
			} else if (var0 == 4026) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				field2955[++field2956 - 1] = var10 ^ 1 << var5;
				return 1;
			} else if (var0 == 4027) {
				field2956 -= 3;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				var6 = field2955[2 + field2956];
				field2955[++field2956 - 1] = class254.method1217(var10, var5, var6);
				return 1;
			} else if (var0 == 4028) {
				field2956 -= 3;
				var10 = field2955[field2956];
				var5 = field2955[field2956 + 1];
				var6 = field2955[2 + field2956];
				field2955[++field2956 - 1] = class254.method1211(var10, var5, var6);
				return 1;
			} else if (var0 == 4029) {
				field2956 -= 3;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				var6 = field2955[2 + field2956];
				var7 = 31 - var6;
				field2955[++field2956 - 1] = var10 << var7 >>> var7 + var5;
				return 1;
			} else if (var0 == 4030) {
				field2956 -= 4;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				var6 = field2955[field2956 + 2];
				var7 = field2955[field2956 + 3];
				var10 = class254.method1211(var10, var6, var7);
				var8 = class254.method1210(var7 - var6 + 1);
				if (var5 > var8) {
					var5 = var8;
				}

				field2955[++field2956 - 1] = var10 | var5 << var6;
				return 1;
			} else if (var0 == 4032) {
				field2955[field2956 - 1] = class163.method878(field2955[field2956 - 1]);
				return 1;
			} else if (var0 == 4033) {
				field2955[field2956 - 1] = class163.method877(field2955[field2956 - 1]);
				return 1;
			} else if (var0 == 4034) {
				field2956 -= 2;
				var10 = field2955[field2956];
				var5 = field2955[1 + field2956];
				var6 = class163.method875(var10, var5);
				field2955[++field2956 - 1] = var6;
				return 1;
			} else if (var0 == 4035) {
				field2955[field2956 - 1] = Math.abs(field2955[field2956 - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var4 = field2965[--class176.field1224];
				var5 = -1;
				if (class385.method1812(var4)) {
					var5 = class385.method1807(var4);
				}

				field2955[++field2956 - 1] = var5;
				return 1;
			} else {
				return 2;
			}
		}
	}

	static int method2029(int var0, class83 var1, boolean var2) {
		int var4;
		if (var0 == 4200) {
			var4 = field2955[--field2956];
			field2965[++class176.field1224 - 1] = class158.method857(var4).field1095;
			return 1;
		} else {
			class158 var6;
			int var7;
			if (var0 == 4201) {
				field2956 -= 2;
				var4 = field2955[field2956];
				var7 = field2955[1 + field2956];
				var6 = class158.method857(var4);
				if (var7 >= 1 && var7 <= 5 && var6.field1111[var7 - 1] != null) {
					field2965[++class176.field1224 - 1] = var6.field1111[var7 - 1];
				} else {
					field2965[++class176.field1224 - 1] = "";
				}

				return 1;
			} else if (var0 == 4202) {
				field2956 -= 2;
				var4 = field2955[field2956];
				var7 = field2955[field2956 + 1];
				var6 = class158.method857(var4);
				if (var7 >= 1 && var7 <= 5 && var6.field1112[var7 - 1] != null) {
					field2965[++class176.field1224 - 1] = var6.field1112[var7 - 1];
				} else {
					field2965[++class176.field1224 - 1] = "";
				}

				return 1;
			} else if (var0 == 4203) {
				var4 = field2955[--field2956];
				field2955[++field2956 - 1] = class158.method857(var4).field1101;
				return 1;
			} else if (var0 == 4204) {
				var4 = field2955[--field2956];
				field2955[++field2956 - 1] = class158.method857(var4).field1105 == 1 ? 1 : 0;
				return 1;
			} else {
				class158 var5;
				if (var0 == 4205) {
					var4 = field2955[--field2956];
					var5 = class158.method857(var4);
					if (var5.field1133 == -1 && var5.field1128 >= 0) {
						field2955[++field2956 - 1] = var5.field1128;
					} else {
						field2955[++field2956 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4206) {
					var4 = field2955[--field2956];
					var5 = class158.method857(var4);
					if (var5.field1133 >= 0 && var5.field1128 >= 0) {
						field2955[++field2956 - 1] = var5.field1128;
					} else {
						field2955[++field2956 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4207) {
					var4 = field2955[--field2956];
					field2955[++field2956 - 1] = class158.method857(var4).field1110 ? 1 : 0;
					return 1;
				} else if (var0 == 4208) {
					var4 = field2955[--field2956];
					var5 = class158.method857(var4);
					if (var5.field1141 == -1 && var5.field1140 >= 0) {
						field2955[++field2956 - 1] = var5.field1140;
					} else {
						field2955[++field2956 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4209) {
					var4 = field2955[--field2956];
					var5 = class158.method857(var4);
					if (var5.field1141 >= 0 && var5.field1140 >= 0) {
						field2955[++field2956 - 1] = var5.field1140;
					} else {
						field2955[++field2956 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4210) {
					String var8 = field2965[--class176.field1224];
					var7 = field2955[--field2956];
					Client.method1367(var8, var7 == 1);
					field2955[++field2956 - 1] = class323.field2340;
					return 1;
				} else if (var0 != 4211) {
					if (var0 == 4212) {
						class254.field1723 = 0;
						return 1;
					} else if (var0 == 4213) {
						var4 = field2955[--field2956];
						var7 = class158.method857(var4).method854();
						if (var7 == -1) {
							field2955[++field2956 - 1] = var7;
						} else {
							field2955[++field2956 - 1] = var7 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var4 = field2955[--field2956];
						field2955[++field2956 - 1] = class158.method857(var4).field1107;
						return 1;
					} else if (var0 == 4215) {
						var4 = field2955[--field2956];
						field2955[++field2956 - 1] = class158.method857(var4).field1108;
						return 1;
					} else if (var0 == 4216) {
						var4 = field2955[--field2956];
						field2955[++field2956 - 1] = class158.method857(var4).field1126;
						return 1;
					} else if (var0 == 4217) {
						var4 = field2955[--field2956];
						var5 = class158.method857(var4);
						field2955[++field2956 - 1] = var5.field1135;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (null != class524.field4110 && class254.field1723 < class323.field2340) {
						field2955[++field2956 - 1] = class524.field4110[++class254.field1723 - 1] & '\uffff';
					} else {
						field2955[++field2956 - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	static int method2051(int var0, class83 var1, boolean var2) {
		if (var0 == 5000) {
			field2955[++field2956 - 1] = Client.field2040;
			return 1;
		} else if (var0 == 5001) {
			field2956 -= 3;
			Client.field2040 = field2955[field2956];
			class41.field203 = class192.method945(field2955[1 + field2956]);
			if (class41.field203 == null) {
				class41.field203 = class192.field1325;
			}

			Client.field2120 = field2955[field2956 + 2];
			class341 var14 = class341.createClientPacket(ClientPacket.field3117, Client.field1891.field4219);
			var14.buffer.writeByte(Client.field2040);
			var14.buffer.writeByte(class41.field203.field1322);
			var14.buffer.writeByte(Client.field2120);
			Client.field1891.method2612(var14);
			return 1;
		} else {
			String var4;
			class341 var7;
			int var9;
			int var11;
			if (var0 == 5002) {
				var4 = field2965[--class176.field1224];
				field2956 -= 2;
				var9 = field2955[field2956];
				var11 = field2955[1 + field2956];
				var7 = class341.createClientPacket(ClientPacket.field3069, Client.field1891.field4219);
				var7.buffer.writeByte(Buffer.method2535(var4) + 2);
				var7.buffer.writeString(var4);
				var7.buffer.writeByte(var9 - 1);
				var7.buffer.writeByte(var11);
				Client.field1891.method2612(var7);
				return 1;
			} else {
				class56 var6;
				int var8;
				if (var0 == 5003) {
					field2956 -= 2;
					var8 = field2955[field2956];
					var9 = field2955[field2956 + 1];
					var6 = class346.method1666(var8, var9);
					if (var6 != null) {
						field2955[++field2956 - 1] = var6.field260;
						field2955[++field2956 - 1] = var6.field254;
						field2965[++class176.field1224 - 1] = null != var6.field256 ? var6.field256 : "";
						field2965[++class176.field1224 - 1] = null != var6.field259 ? var6.field259 : "";
						field2965[++class176.field1224 - 1] = var6.field262 != null ? var6.field262 : "";
						field2955[++field2956 - 1] = var6.method228() ? 1 : (var6.method229() ? 2 : 0);
					} else {
						field2955[++field2956 - 1] = -1;
						field2955[++field2956 - 1] = 0;
						field2965[++class176.field1224 - 1] = "";
						field2965[++class176.field1224 - 1] = "";
						field2965[++class176.field1224 - 1] = "";
						field2955[++field2956 - 1] = 0;
					}

					return 1;
				} else {
					class56 var5;
					if (var0 == 5004) {
						var8 = field2955[--field2956];
						var5 = class346.method1670(var8);
						if (var5 != null) {
							field2955[++field2956 - 1] = var5.field255;
							field2955[++field2956 - 1] = var5.field254;
							field2965[++class176.field1224 - 1] = var5.field256 != null ? var5.field256 : "";
							field2965[++class176.field1224 - 1] = var5.field259 != null ? var5.field259 : "";
							field2965[++class176.field1224 - 1] = null != var5.field262 ? var5.field262 : "";
							field2955[++field2956 - 1] = var5.method228() ? 1 : (var5.method229() ? 2 : 0);
						} else {
							field2955[++field2956 - 1] = -1;
							field2955[++field2956 - 1] = 0;
							field2965[++class176.field1224 - 1] = "";
							field2965[++class176.field1224 - 1] = "";
							field2965[++class176.field1224 - 1] = "";
							field2955[++field2956 - 1] = 0;
						}

						return 1;
					} else if (var0 == 5005) {
						if (class41.field203 == null) {
							field2955[++field2956 - 1] = -1;
						} else {
							field2955[++field2956 - 1] = class41.field203.field1322;
						}

						return 1;
					} else {
						class341 var12;
						if (var0 == 5008) {
							var4 = field2965[--class176.field1224];
							var9 = field2955[--field2956];
							var12 = class450.method2109(var9, var4, class13.field75, -1);
							Client.field1891.method2612(var12);
							return 1;
						} else if (var0 == 5009) {
							class176.field1224 -= 2;
							var4 = field2965[class176.field1224];
							String var10 = field2965[1 + class176.field1224];
							var12 = class341.createClientPacket(ClientPacket.field3065, Client.field1891.field4219);
							var12.buffer.writeShort(0);
							int var13 = var12.buffer.offset;
							var12.buffer.writeString(var4);
							class380.method1791(var12.buffer, var10);
							var12.buffer.writeLengthShort(var12.buffer.offset - var13);
							Client.field1891.method2612(var12);
							return 1;
						} else if (var0 == 5010) {
							var4 = field2965[--class176.field1224];
							field2956 -= 2;
							var9 = field2955[field2956];
							var11 = field2955[field2956 + 1];
							var7 = class450.method2109(var9, var4, class13.field75, var11);
							Client.field1891.method2612(var7);
							return 1;
						} else if (var0 != 5015) {
							if (var0 == 5016) {
								field2955[++field2956 - 1] = Client.field2120;
								return 1;
							} else if (var0 == 5017) {
								var8 = field2955[--field2956];
								field2955[++field2956 - 1] = class346.method1671(var8);
								return 1;
							} else if (var0 == 5018) {
								var8 = field2955[--field2956];
								field2955[++field2956 - 1] = class394.method1833(var8);
								return 1;
							} else if (var0 == 5019) {
								var8 = field2955[--field2956];
								field2955[++field2956 - 1] = class346.method1667(var8);
								return 1;
							} else if (var0 == 5020) {
								var4 = field2965[--class176.field1224];
								Client.method1370(var4);
								return 1;
							} else if (var0 == 5021) {
								Client.field2064 = field2965[--class176.field1224].toLowerCase().trim();
								return 1;
							} else if (var0 == 5022) {
								field2965[++class176.field1224 - 1] = Client.field2064;
								return 1;
							} else if (var0 == 5023) {
								var4 = field2965[--class176.field1224];
								System.out.println(var4);
								return 1;
							} else if (var0 == 5030) {
								field2956 -= 2;
								var8 = field2955[field2956];
								var9 = field2955[field2956 + 1];
								var6 = class346.method1666(var8, var9);
								if (var6 != null) {
									field2955[++field2956 - 1] = var6.field260;
									field2955[++field2956 - 1] = var6.field254;
									field2965[++class176.field1224 - 1] = var6.field256 != null ? var6.field256 : "";
									field2965[++class176.field1224 - 1] = null != var6.field259 ? var6.field259 : "";
									field2965[++class176.field1224 - 1] = null != var6.field262 ? var6.field262 : "";
									field2955[++field2956 - 1] = var6.method228() ? 1 : (var6.method229() ? 2 : 0);
									field2965[++class176.field1224 - 1] = "";
									field2955[++field2956 - 1] = 0;
								} else {
									field2955[++field2956 - 1] = -1;
									field2955[++field2956 - 1] = 0;
									field2965[++class176.field1224 - 1] = "";
									field2965[++class176.field1224 - 1] = "";
									field2965[++class176.field1224 - 1] = "";
									field2955[++field2956 - 1] = 0;
									field2965[++class176.field1224 - 1] = "";
									field2955[++field2956 - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var8 = field2955[--field2956];
								var5 = class346.method1670(var8);
								if (null != var5) {
									field2955[++field2956 - 1] = var5.field255;
									field2955[++field2956 - 1] = var5.field254;
									field2965[++class176.field1224 - 1] = null != var5.field256 ? var5.field256 : "";
									field2965[++class176.field1224 - 1] = null != var5.field259 ? var5.field259 : "";
									field2965[++class176.field1224 - 1] = null != var5.field262 ? var5.field262 : "";
									field2955[++field2956 - 1] = var5.method228() ? 1 : (var5.method229() ? 2 : 0);
									field2965[++class176.field1224 - 1] = "";
									field2955[++field2956 - 1] = 0;
								} else {
									field2955[++field2956 - 1] = -1;
									field2955[++field2956 - 1] = 0;
									field2965[++class176.field1224 - 1] = "";
									field2965[++class176.field1224 - 1] = "";
									field2965[++class176.field1224 - 1] = "";
									field2955[++field2956 - 1] = 0;
									field2965[++class176.field1224 - 1] = "";
									field2955[++field2956 - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class114.field720 != null && null != class114.field720.field3005) {
								var4 = class114.field720.field3005.method2398();
							} else {
								var4 = "";
							}

							field2965[++class176.field1224 - 1] = var4;
							return 1;
						}
					}
				}
			}
		}
	}

	static int method2075(int var0, class83 var1, boolean var2) {
		if (var0 == 5306) {
			field2955[++field2956 - 1] = Client.method1368();
			return 1;
		} else {
			int var4;
			if (var0 == 5307) {
				var4 = field2955[--field2956];
				if (var4 == 1 || var4 == 2) {
					Client.method1391(var4);
				}

				return 1;
			} else if (var0 == 5308) {
				field2955[++field2956 - 1] = class109.field693.method454();
				return 1;
			} else if (var0 != 5309) {
				if (var0 == 5310) {
					--field2956;
					return 1;
				} else {
					return 2;
				}
			} else {
				var4 = field2955[--field2956];
				if (var4 == 1 || var4 == 2) {
					class109.field693.method453(var4);
				}

				return 1;
			}
		}
	}

	static int method2042(int var0, class83 var1, boolean var2) {
		int var4;
		if (var0 == 5504) {
			field2956 -= 2;
			var4 = field2955[field2956];
			int var5 = field2955[field2956 + 1];
			if (!Client.field2080) {
				Client.field1917 = var4;
				Client.field1962 = var5;
			}

			return 1;
		} else if (var0 == 5505) {
			field2955[++field2956 - 1] = Client.field1917;
			return 1;
		} else if (var0 == 5506) {
			field2955[++field2956 - 1] = Client.field1962;
			return 1;
		} else if (var0 == 5530) {
			var4 = field2955[--field2956];
			if (var4 < 0) {
				var4 = 0;
			}

			Client.field1924 = var4;
			return 1;
		} else if (var0 == 5531) {
			field2955[++field2956 - 1] = Client.field1924;
			return 1;
		} else {
			return 2;
		}
	}

	static int method2050(int var0, class83 var1, boolean var2) {
		if (var0 == 5630) {
			Client.field1897 = 250;
			return 1;
		} else {
			return 2;
		}
	}

	static int method2070(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}

	static int method2077(int var0) {
		return (int)((Math.log((double)var0) / field2964 - 7.0D) * 256.0D);
	}

	static int method2071(int var0, class83 var1, boolean var2) {
		if (var0 == 6200) {
			field2956 -= 2;
			Client.field2103 = (short)method2070(field2955[field2956]);
			if (Client.field2103 <= 0) {
				Client.field2103 = 256;
			}

			Client.field2104 = (short)method2070(field2955[1 + field2956]);
			if (Client.field2104 <= 0) {
				Client.field2104 = 256;
			}

			return 1;
		} else if (var0 == 6201) {
			field2956 -= 2;
			Client.field2105 = (short)field2955[field2956];
			if (Client.field2105 <= 0) {
				Client.field2105 = 256;
			}

			Client.field2106 = (short)field2955[1 + field2956];
			if (Client.field2106 <= 0) {
				Client.field2106 = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			field2956 -= 4;
			Client.field2107 = (short)field2955[field2956];
			if (Client.field2107 <= 0) {
				Client.field2107 = 1;
			}

			Client.field1975 = (short)field2955[1 + field2956];
			if (Client.field1975 <= 0) {
				Client.field1975 = 32767;
			} else if (Client.field1975 < Client.field2107) {
				Client.field1975 = Client.field2107;
			}

			Client.field1907 = (short)field2955[2 + field2956];
			if (Client.field1907 <= 0) {
				Client.field1907 = 1;
			}

			Client.field2110 = (short)field2955[field2956 + 3];
			if (Client.field2110 <= 0) {
				Client.field2110 = 32767;
			} else if (Client.field2110 < Client.field1907) {
				Client.field2110 = Client.field1907;
			}

			return 1;
		} else if (var0 == 6203) {
			if (Client.field1860 != null) {
				Client.method1322(0, 0, Client.field1860.field3540, Client.field1860.field3541, false);
				field2955[++field2956 - 1] = Client.field1836;
				field2955[++field2956 - 1] = Client.field2114;
			} else {
				field2955[++field2956 - 1] = -1;
				field2955[++field2956 - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			field2955[++field2956 - 1] = Client.field2105;
			field2955[++field2956 - 1] = Client.field2106;
			return 1;
		} else if (var0 == 6205) {
			field2955[++field2956 - 1] = method2077(Client.field2103);
			field2955[++field2956 - 1] = method2077(Client.field2104);
			return 1;
		} else if (var0 == 6220) {
			field2955[++field2956 - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			field2955[++field2956 - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			field2955[++field2956 - 1] = class164.field1170;
			return 1;
		} else if (var0 == 6223) {
			field2955[++field2956 - 1] = class92.field595;
			return 1;
		} else {
			return 2;
		}
	}

	static int method2074(int var0, class83 var1, boolean var2) {
		if (var0 == 6500) {
			field2955[++field2956 - 1] = class426.method1938() ? 1 : 0;
			return 1;
		} else {
			class426 var9;
			if (var0 == 6501) {
				var9 = class426.method1943();
				if (null != var9) {
					field2955[++field2956 - 1] = var9.field2870;
					field2955[++field2956 - 1] = var9.field2869;
					field2965[++class176.field1224 - 1] = var9.field2873;
					field2955[++field2956 - 1] = var9.field2874;
					field2955[++field2956 - 1] = var9.field2875;
					field2965[++class176.field1224 - 1] = var9.field2865;
				} else {
					field2955[++field2956 - 1] = -1;
					field2955[++field2956 - 1] = 0;
					field2965[++class176.field1224 - 1] = "";
					field2955[++field2956 - 1] = 0;
					field2955[++field2956 - 1] = 0;
					field2965[++class176.field1224 - 1] = "";
				}

				return 1;
			} else if (var0 == 6502) {
				var9 = class426.method1940();
				if (null != var9) {
					field2955[++field2956 - 1] = var9.field2870;
					field2955[++field2956 - 1] = var9.field2869;
					field2965[++class176.field1224 - 1] = var9.field2873;
					field2955[++field2956 - 1] = var9.field2874;
					field2955[++field2956 - 1] = var9.field2875;
					field2965[++class176.field1224 - 1] = var9.field2865;
				} else {
					field2955[++field2956 - 1] = -1;
					field2955[++field2956 - 1] = 0;
					field2965[++class176.field1224 - 1] = "";
					field2955[++field2956 - 1] = 0;
					field2955[++field2956 - 1] = 0;
					field2965[++class176.field1224 - 1] = "";
				}

				return 1;
			} else {
				int var4;
				class426 var5;
				int var11;
				if (var0 == 6506) {
					var4 = field2955[--field2956];
					var5 = null;

					for (var11 = 0; var11 < class426.field2866; ++var11) {
						if (class233.field1534[var11].field2870 == var4) {
							var5 = class233.field1534[var11];
							break;
						}
					}

					if (var5 != null) {
						field2955[++field2956 - 1] = var5.field2870;
						field2955[++field2956 - 1] = var5.field2869;
						field2965[++class176.field1224 - 1] = var5.field2873;
						field2955[++field2956 - 1] = var5.field2874;
						field2955[++field2956 - 1] = var5.field2875;
						field2965[++class176.field1224 - 1] = var5.field2865;
					} else {
						field2955[++field2956 - 1] = -1;
						field2955[++field2956 - 1] = 0;
						field2965[++class176.field1224 - 1] = "";
						field2955[++field2956 - 1] = 0;
						field2955[++field2956 - 1] = 0;
						field2965[++class176.field1224 - 1] = "";
					}

					return 1;
				} else if (var0 == 6507) {
					field2956 -= 4;
					var4 = field2955[field2956];
					boolean var10 = field2955[field2956 + 1] == 1;
					var11 = field2955[field2956 + 2];
					boolean var7 = field2955[field2956 + 3] == 1;
					class426.method1944(var4, var10, var11, var7);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == 6512) {
						Client.field1988 = field2955[--field2956] == 1;
						return 1;
					} else {
						class47 var6;
						int var8;
						if (var0 == 6513) {
							field2956 -= 2;
							var4 = field2955[field2956];
							var8 = field2955[field2956 + 1];
							var6 = class47.method197(var8);
							if (var6.method192()) {
								field2965[++class176.field1224 - 1] = class73.method366(var4).method364(var8, var6.field232);
							} else {
								field2955[++field2956 - 1] = class73.method366(var4).method357(var8, var6.field227);
							}

							return 1;
						} else if (var0 == 6514) {
							field2956 -= 2;
							var4 = field2955[field2956];
							var8 = field2955[1 + field2956];
							var6 = class47.method197(var8);
							if (var6.method192()) {
								field2965[++class176.field1224 - 1] = class109.method504(var4).method1846(var8, var6.field232);
							} else {
								field2955[++field2956 - 1] = class109.method504(var4).method1848(var8, var6.field227);
							}

							return 1;
						} else if (var0 == 6515) {
							field2956 -= 2;
							var4 = field2955[field2956];
							var8 = field2955[field2956 + 1];
							var6 = class47.method197(var8);
							if (var6.method192()) {
								field2965[++class176.field1224 - 1] = class158.method857(var4).method851(var8, var6.field232);
							} else {
								field2955[++field2956 - 1] = class158.method857(var4).method839(var8, var6.field227);
							}

							return 1;
						} else if (var0 == 6516) {
							field2956 -= 2;
							var4 = field2955[field2956];
							var8 = field2955[1 + field2956];
							var6 = class47.method197(var8);
							if (var6.method192()) {
								field2965[++class176.field1224 - 1] = class492.method2298(var4).method2296(var8, var6.field232);
							} else {
								field2955[++field2956 - 1] = class492.method2298(var4).method2295(var8, var6.field227);
							}

							return 1;
						} else if (var0 == 6518) {
							field2955[++field2956 - 1] = Client.field2086 ? 1 : 0;
							return 1;
						} else if (var0 == 6519) {
							field2955[++field2956 - 1] = Client.field1838;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == 6521) {
							return 1;
						} else if (var0 == 6522) {
							--class176.field1224;
							--field2956;
							return 1;
						} else if (var0 == 6523) {
							--class176.field1224;
							--field2956;
							return 1;
						} else if (var0 == 6524) {
							field2955[++field2956 - 1] = -1;
							return 1;
						} else if (var0 == 6525) {
							field2955[++field2956 - 1] = 1;
							return 1;
						} else if (var0 == 6526) {
							field2955[++field2956 - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							field2955[++field2956 - 1] = Client.field1839;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = field2955[--field2956];
					if (var4 >= 0 && var4 < class426.field2866) {
						var5 = class233.field1534[var4];
						field2955[++field2956 - 1] = var5.field2870;
						field2955[++field2956 - 1] = var5.field2869;
						field2965[++class176.field1224 - 1] = var5.field2873;
						field2955[++field2956 - 1] = var5.field2874;
						field2955[++field2956 - 1] = var5.field2875;
						field2965[++class176.field1224 - 1] = var5.field2865;
					} else {
						field2955[++field2956 - 1] = -1;
						field2955[++field2956 - 1] = 0;
						field2965[++class176.field1224 - 1] = "";
						field2955[++field2956 - 1] = 0;
						field2955[++field2956 - 1] = 0;
						field2965[++class176.field1224 - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	static int method2076(int var0, class83 var1, boolean var2) {
		int var4;
		if (var0 == 6600) {
			var4 = class212.field1393;
			int var17 = class80.selectedTileX + (class114.field720.field368 >> 7);
			int var13 = class425.selectedTileXYIdk + (class114.field720.field329 >> 7);
			Client.method1357().method1153(var4, var17, var13, true);
			return 1;
		} else {
			class353 var8;
			if (var0 == 6601) {
				var4 = field2955[--field2956];
				String var16 = "";
				var8 = Client.method1357().method1167(var4);
				if (var8 != null) {
					var16 = var8.method1687();
				}

				field2965[++class176.field1224 - 1] = var16;
				return 1;
			} else if (var0 == 6602) {
				var4 = field2955[--field2956];
				Client.method1357().method1154(var4);
				return 1;
			} else if (var0 == 6603) {
				field2955[++field2956 - 1] = Client.method1357().method1197();
				return 1;
			} else if (var0 == 6604) {
				var4 = field2955[--field2956];
				Client.method1357().method1162(var4);
				return 1;
			} else if (var0 == 6605) {
				field2955[++field2956 - 1] = Client.method1357().method1192() ? 1 : 0;
				return 1;
			} else {
				class370 var15;
				if (var0 == 6606) {
					var15 = new class370(field2955[--field2956]);
					Client.method1357().method1168(var15.field2561, var15.field2559);
					return 1;
				} else if (var0 == 6607) {
					var15 = new class370(field2955[--field2956]);
					Client.method1357().method1169(var15.field2561, var15.field2559);
					return 1;
				} else if (var0 == 6608) {
					var15 = new class370(field2955[--field2956]);
					Client.method1357().method1170(var15.field2560, var15.field2561, var15.field2559);
					return 1;
				} else if (var0 == 6609) {
					var15 = new class370(field2955[--field2956]);
					Client.method1357().method1171(var15.field2560, var15.field2561, var15.field2559);
					return 1;
				} else if (var0 == 6610) {
					field2955[++field2956 - 1] = Client.method1357().method1172();
					field2955[++field2956 - 1] = Client.method1357().method1166();
					return 1;
				} else {
					class353 var12;
					if (var0 == 6611) {
						var4 = field2955[--field2956];
						var12 = Client.method1357().method1167(var4);
						if (null == var12) {
							field2955[++field2956 - 1] = 0;
						} else {
							field2955[++field2956 - 1] = var12.method1697().method1737();
						}

						return 1;
					} else if (var0 == 6612) {
						var4 = field2955[--field2956];
						var12 = Client.method1357().method1167(var4);
						if (var12 == null) {
							field2955[++field2956 - 1] = 0;
							field2955[++field2956 - 1] = 0;
						} else {
							field2955[++field2956 - 1] = (var12.method1695() - var12.method1690() + 1) * 64;
							field2955[++field2956 - 1] = (var12.method1702() - var12.method1691() + 1) * 64;
						}

						return 1;
					} else if (var0 == 6613) {
						var4 = field2955[--field2956];
						var12 = Client.method1357().method1167(var4);
						if (null == var12) {
							field2955[++field2956 - 1] = 0;
							field2955[++field2956 - 1] = 0;
							field2955[++field2956 - 1] = 0;
							field2955[++field2956 - 1] = 0;
						} else {
							field2955[++field2956 - 1] = var12.method1690() * 64;
							field2955[++field2956 - 1] = var12.method1691() * 64;
							field2955[++field2956 - 1] = var12.method1695() * 64 + 64 - 1;
							field2955[++field2956 - 1] = var12.method1702() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == 6614) {
						var4 = field2955[--field2956];
						var12 = Client.method1357().method1167(var4);
						if (null == var12) {
							field2955[++field2956 - 1] = -1;
						} else {
							field2955[++field2956 - 1] = var12.method1689();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = Client.method1357().method1173();
						if (null == var15) {
							field2955[++field2956 - 1] = -1;
							field2955[++field2956 - 1] = -1;
						} else {
							field2955[++field2956 - 1] = var15.field2561;
							field2955[++field2956 - 1] = var15.field2559;
						}

						return 1;
					} else if (var0 == 6616) {
						field2955[++field2956 - 1] = Client.method1357().method1155();
						return 1;
					} else if (var0 == 6617) {
						var15 = new class370(field2955[--field2956]);
						var12 = Client.method1357().method1156();
						if (null == var12) {
							field2955[++field2956 - 1] = -1;
							field2955[++field2956 - 1] = -1;
							return 1;
						} else {
							int[] var11 = var12.method1683(var15.field2560, var15.field2561, var15.field2559);
							if (null == var11) {
								field2955[++field2956 - 1] = -1;
								field2955[++field2956 - 1] = -1;
							} else {
								field2955[++field2956 - 1] = var11[0];
								field2955[++field2956 - 1] = var11[1];
							}

							return 1;
						}
					} else {
						class370 var6;
						if (var0 == 6618) {
							var15 = new class370(field2955[--field2956]);
							var12 = Client.method1357().method1156();
							if (null == var12) {
								field2955[++field2956 - 1] = -1;
								field2955[++field2956 - 1] = -1;
								return 1;
							} else {
								var6 = var12.method1700(var15.field2561, var15.field2559);
								if (null == var6) {
									field2955[++field2956 - 1] = -1;
								} else {
									field2955[++field2956 - 1] = var6.method1737();
								}

								return 1;
							}
						} else {
							class370 var9;
							if (var0 == 6619) {
								field2956 -= 2;
								var4 = field2955[field2956];
								var9 = new class370(field2955[1 + field2956]);
								method2055(var4, var9, false);
								return 1;
							} else if (var0 == 6620) {
								field2956 -= 2;
								var4 = field2955[field2956];
								var9 = new class370(field2955[field2956 + 1]);
								method2055(var4, var9, true);
								return 1;
							} else if (var0 == 6621) {
								field2956 -= 2;
								var4 = field2955[field2956];
								var9 = new class370(field2955[field2956 + 1]);
								var8 = Client.method1357().method1167(var4);
								if (var8 == null) {
									field2955[++field2956 - 1] = 0;
									return 1;
								} else {
									field2955[++field2956 - 1] = var8.method1699(var9.field2560, var9.field2561, var9.field2559) ? 1 : 0;
									return 1;
								}
							} else if (var0 == 6622) {
								field2955[++field2956 - 1] = Client.method1357().method1150();
								field2955[++field2956 - 1] = Client.method1357().method1199();
								return 1;
							} else if (var0 == 6623) {
								var15 = new class370(field2955[--field2956]);
								var12 = Client.method1357().method1152(var15.field2560, var15.field2561, var15.field2559);
								if (null == var12) {
									field2955[++field2956 - 1] = -1;
								} else {
									field2955[++field2956 - 1] = var12.method1684();
								}

								return 1;
							} else if (var0 == 6624) {
								Client.method1357().method1194(field2955[--field2956]);
								return 1;
							} else if (var0 == 6625) {
								Client.method1357().method1187();
								return 1;
							} else if (var0 == 6626) {
								Client.method1357().method1160(field2955[--field2956]);
								return 1;
							} else if (var0 == 6627) {
								Client.method1357().method1188();
								return 1;
							} else {
								boolean var14;
								if (var0 == 6628) {
									var14 = field2955[--field2956] == 1;
									Client.method1357().method1175(var14);
									return 1;
								} else if (var0 == 6629) {
									var4 = field2955[--field2956];
									Client.method1357().method1176(var4);
									return 1;
								} else if (var0 == 6630) {
									var4 = field2955[--field2956];
									Client.method1357().method1177(var4);
									return 1;
								} else if (var0 == 6631) {
									Client.method1357().method1178();
									return 1;
								} else if (var0 == 6632) {
									var14 = field2955[--field2956] == 1;
									Client.method1357().method1179(var14);
									return 1;
								} else {
									boolean var10;
									if (var0 == 6633) {
										field2956 -= 2;
										var4 = field2955[field2956];
										var10 = field2955[field2956 + 1] == 1;
										Client.method1357().method1198(var4, var10);
										return 1;
									} else if (var0 == 6634) {
										field2956 -= 2;
										var4 = field2955[field2956];
										var10 = field2955[1 + field2956] == 1;
										Client.method1357().method1180(var4, var10);
										return 1;
									} else if (var0 == 6635) {
										field2955[++field2956 - 1] = Client.method1357().method1181() ? 1 : 0;
										return 1;
									} else if (var0 == 6636) {
										var4 = field2955[--field2956];
										field2955[++field2956 - 1] = Client.method1357().method1182(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6637) {
										var4 = field2955[--field2956];
										field2955[++field2956 - 1] = Client.method1357().method1183(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										field2956 -= 2;
										var4 = field2955[field2956];
										var9 = new class370(field2955[field2956 + 1]);
										var6 = Client.method1357().method1184(var4, var9);
										if (var6 == null) {
											field2955[++field2956 - 1] = -1;
										} else {
											field2955[++field2956 - 1] = var6.method1737();
										}

										return 1;
									} else {
										class283 var7;
										if (var0 == 6639) {
											var7 = Client.method1357().method1143();
											if (null == var7) {
												field2955[++field2956 - 1] = -1;
												field2955[++field2956 - 1] = -1;
											} else {
												field2955[++field2956 - 1] = var7.method1483();
												field2955[++field2956 - 1] = var7.field2150.method1737();
											}

											return 1;
										} else if (var0 == 6640) {
											var7 = Client.method1357().method1200();
											if (var7 == null) {
												field2955[++field2956 - 1] = -1;
												field2955[++field2956 - 1] = -1;
											} else {
												field2955[++field2956 - 1] = var7.method1483();
												field2955[++field2956 - 1] = var7.field2150.method1737();
											}

											return 1;
										} else {
											class63 var5;
											if (var0 == 6693) {
												var4 = field2955[--field2956];
												var5 = class63.method269(var4);
												if (null == var5.field304) {
													field2965[++class176.field1224 - 1] = "";
												} else {
													field2965[++class176.field1224 - 1] = var5.field304;
												}

												return 1;
											} else if (var0 == 6694) {
												var4 = field2955[--field2956];
												var5 = class63.method269(var4);
												field2955[++field2956 - 1] = var5.field306;
												return 1;
											} else if (var0 == 6695) {
												var4 = field2955[--field2956];
												var5 = class63.method269(var4);
												if (var5 == null) {
													field2955[++field2956 - 1] = -1;
												} else {
													field2955[++field2956 - 1] = var5.field302;
												}

												return 1;
											} else if (var0 == 6696) {
												var4 = field2955[--field2956];
												var5 = class63.method269(var4);
												if (var5 == null) {
													field2955[++field2956 - 1] = -1;
												} else {
													field2955[++field2956 - 1] = var5.field303;
												}

												return 1;
											} else if (var0 == 6697) {
												field2955[++field2956 - 1] = class265.field1779.field663;
												return 1;
											} else if (var0 == 6698) {
												field2955[++field2956 - 1] = class265.field1779.field661.method1737();
												return 1;
											} else if (var0 == 6699) {
												field2955[++field2956 - 1] = class265.field1779.field662.method1737();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static int method2073(int var0, class83 var1, boolean var2) {
		if (var0 == 6754) {
			int var6 = field2955[--field2956];
			class73 var7 = class73.method366(var6);
			field2965[++class176.field1224 - 1] = var7 != null ? var7.field516 : "";
			return 1;
		} else {
			class73 var4;
			if (var0 == 6764) {
				field2956 -= 2;
				var4 = class73.method366(field2955[field2956]);
				int var5 = field2955[1 + field2956];
				field2955[++field2956 - 1] = var4.method360(var5);
				field2955[++field2956 - 1] = var4.method361(var5);
				return 1;
			} else if (var0 == 6765) {
				var4 = class73.method366(field2955[--field2956]);
				field2955[++field2956 - 1] = null != var4 ? var4.field507 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	static int method2061(int var0, class83 var1, boolean var2) {
		if (var0 == 6809) {
			int var4 = field2955[--field2956];
			class397 var5 = class109.method504(var4);
			field2965[++class176.field1224 - 1] = null != var5 ? var5.field2696 : "";
			return 1;
		} else {
			return 2;
		}
	}

	static int method2054(int var0, class83 var1, boolean var2) {
		return 2;
	}

	static int method2066(int var0, class83 var1, boolean var2) {
		return 2;
	}

	static int method2034(int var0, class83 var1, boolean var2) {
		if (var0 == 7108) {
			field2955[++field2956 - 1] = Client.method1384() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	static int method2040(int var0, class83 var1, boolean var2) {
		return 2;
	}

	static int method2079(int var0, class83 var1, boolean var2) {
		if (var0 == 7463) {
			boolean var4 = field2955[--field2956] == 1;
			Client.method1428(var4);
			return 1;
		} else {
			return 2;
		}
	}

	static int method2052(int var0, class83 var1, boolean var2) {
		int var4;
		Object var5;
		int var6;
		class308 var7;
		int var8;
		if (var0 != 7500 && var0 != 7508) {
			if (var0 != 7501) {
				int var21;
				int var23;
				if (var0 == 7502) {
					field2956 -= 3;
					var4 = field2955[field2956];
					var21 = field2955[1 + field2956];
					var6 = field2955[field2956 + 2];
					var23 = class427.method1947(var21);
					var8 = class451.method2112(var21);
					int var25 = class451.method2111(var21);
					class196 var26 = class196.method953(var4);
					class293 var27 = class293.method1522(var23);
					int[] var28 = var27.field2180[var8];
					int var13 = 0;
					int var14 = var28.length;
					if (var25 >= 0) {
						if (var25 >= var14) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
						}

						var13 = var25;
						var14 = var25 + 1;
					}

					Object[] var15 = var26.method949(var8);
					if (var15 == null && null != var27.field2179) {
						var15 = var27.field2179[var8];
					}

					int var16;
					int var17;
					if (var15 == null) {
						for (var16 = var13; var16 < var14; ++var16) {
							var17 = var28[var16];
							class499 var29 = class419.method1920(var17);
							if (class499.field3674 == var29) {
								field2965[++class176.field1224 - 1] = "";
							} else {
								field2955[++field2956 - 1] = class419.method1921(var17);
							}
						}

						return 1;
					} else {
						var16 = var15.length / var28.length;
						if (var6 >= 0 && var6 < var16) {
							for (var17 = var13; var17 < var14; ++var17) {
								int var18 = var6 * var28.length + var17;
								class499 var19 = class419.method1920(var28[var17]);
								if (class499.field3674 == var19) {
									field2965[++class176.field1224 - 1] = (String)var15[var18];
								} else {
									field2955[++field2956 - 1] = (Integer)var15[var18];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == 7503) {
					field2956 -= 2;
					var4 = field2955[field2956];
					var21 = field2955[1 + field2956];
					var6 = 0;
					var23 = class427.method1947(var21);
					var8 = class451.method2112(var21);
					class196 var24 = class196.method953(var4);
					class293 var10 = class293.method1522(var23);
					int[] var11 = var10.field2180[var8];
					Object[] var12 = var24.method949(var8);
					if (null == var12 && null != var10.field2179) {
						var12 = var10.field2179[var8];
					}

					if (var12 != null) {
						var6 = var12.length / var11.length;
					}

					field2955[++field2956 - 1] = var6;
					return 1;
				} else if (var0 != 7504 && var0 != 7510) {
					if (var0 == 7505) {
						var4 = field2955[--field2956];
						class196 var22 = class196.method953(var4);
						field2955[++field2956 - 1] = var22.field1329;
						return 1;
					} else if (var0 == 7506) {
						var4 = field2955[--field2956];
						var21 = -1;
						if (null != class166.field1181 && var4 >= 0 && var4 < class166.field1181.size()) {
							var21 = (Integer)class166.field1181.get(var4);
						}

						field2955[++field2956 - 1] = var21;
						return 1;
					} else if (var0 != 7507 && var0 != 7509) {
						return 2;
					} else {
						var4 = field2955[--field2956];
						var5 = method2044(var4);
						var6 = field2955[--field2956];
						var7 = Client.method1317(var6);
						if (null == var7) {
							throw new RuntimeException();
						} else if (class427.method1947(var6) != Client.field1900) {
							throw new RuntimeException();
						} else if (class166.field1181 == null && class166.field1181.isEmpty()) {
							throw new RuntimeException();
						} else {
							var8 = class451.method2111(var6);
							List var9 = var7.method1567(var5, var8);
							class166.field1181 = new LinkedList(class166.field1181);
							if (var9 != null) {
								class166.field1181.retainAll(var9);
							} else {
								class166.field1181.clear();
							}

							class549.field4268 = class166.field1181.iterator();
							if (var0 == 7507) {
								field2955[++field2956 - 1] = class166.field1181.size();
							}

							return 1;
						}
					}
				} else {
					--field2956;
					var4 = field2955[field2956];
					class308 var20 = Client.method1399(var4);
					if (null == var20) {
						throw new RuntimeException();
					} else {
						class166.field1181 = var20.method1567(0, 0);
						var6 = 0;
						if (null != class166.field1181) {
							Client.field1900 = var4;
							class549.field4268 = class166.field1181.iterator();
							var6 = class166.field1181.size();
						}

						if (var0 == 7504) {
							field2955[++field2956 - 1] = var6;
						}

						return 1;
					}
				}
			} else {
				if (null != class549.field4268 && class549.field4268.hasNext()) {
					field2955[++field2956 - 1] = (Integer)class549.field4268.next();
				} else {
					field2955[++field2956 - 1] = -1;
				}

				return 1;
			}
		} else {
			var4 = field2955[--field2956];
			var5 = method2044(var4);
			var6 = field2955[--field2956];
			var7 = Client.method1317(var6);
			if (null == var7) {
				throw new RuntimeException();
			} else {
				var8 = class451.method2111(var6);
				class166.field1181 = var7.method1567(var5, var8);
				if (class166.field1181 != null) {
					Client.field1900 = class427.method1947(var6);
					class549.field4268 = class166.field1181.iterator();
					if (var0 == 7500) {
						field2955[++field2956 - 1] = class166.field1181.size();
					}
				} else {
					Client.field1900 = -1;
					class549.field4268 = null;
					if (var0 == 7500) {
						field2955[++field2956 - 1] = 0;
					}
				}

				return 1;
			}
		}
	}

	static int method2057(int var0, class83 var1, boolean var2) {
		return 2;
	}

	static int method2031(int var0, class83 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 8000) {
			--field2956;
			var4 = field2955[field2956];
			var5 = field2953[var4];
			class556.method2642(field2954[var4], new int[var5], 0, var5 - 1);
			return 1;
		} else if (var0 == 8001) {
			field2956 -= 3;
			var4 = field2955[field2956];
			var5 = field2955[1 + field2956];
			int var6 = field2955[field2956 + 2];
			int var7 = field2953[var4];
			if (var7 <= 1) {
				return 1;
			} else {
				class96.method428(field2954[var4], var7, var5, var6);
				return 1;
			}
		} else {
			return 2;
		}
	}

	static void method2063(int var0) {
		if (var0 != -1) {
			if (class208.interfaceConfigs.method347(var0)) {
				class496[] var2 = class208.interfaceConfigs.components[var0];

				for (int var3 = 0; var3 < var2.length; ++var3) {
					class496 var4 = var2[var3];
					if (var4.field3612 != null) {
						class376 var5 = new class376();
						var5.field2595 = var4;
						var5.field2594 = var4.field3612;
						class471.method2187(var5, 5000000, 0);
					}
				}

			}
		}
	}

	static void method2055(int var0, class370 var1, boolean var2) {
		class353 var4 = Client.method1357().method1167(var0);
		int var5 = class114.field720.field3009;
		int var6 = class80.selectedTileX + (class114.field720.field368 >> 7);
		int var7 = (class114.field720.field329 >> 7) + class425.selectedTileXYIdk;
		class370 var8 = new class370(var5, var6, var7);
		Client.method1357().method1158(var4, var8, var1, var2);
	}

	static Object method2049(class499 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field3677) {
			case 0:
				return field2965[--class176.field1224];
			case 2:
				return field2955[--field2956];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	static Object method2044(int var0) {
		return method2049((class499)class26.method87(class499.method2361(), var0));
	}
}
