import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class class410 {
	static boolean field2808;
	static boolean field2826;
	static boolean field2831;
	static boolean field2833;
	static boolean field2836;
	static class230 field2812;
	static class230 field2814;
	static class230 field2823;
	static class230[] field2815;
	static class230[] field2830;
	static class42 field2832;
	static int field2810;
	static int field2816;
	static int field2817;
	static int field2819;
	static int field2820;
	static int field2825;
	static int field2828;
	static int field2834;
	static int field2838;
	static int field2840;
	static int field2845;
	static String field2809;
	static String field2811;
	static String field2813;
	static String field2818;
	static String field2822;
	static String field2824;
	static String field2827;
	static String field2835;
	static String field2839;
	static String field2842;
	static String[] field2821;
	static String[] field2829;
	static String[] field2843;
	static String[] field2844;
	static long field2837;
	static long field2841;

	static {
		field2810 = 0;
		field2816 = 202 + field2810;
		field2817 = 10;
		field2818 = "";
		field2819 = -1;
		field2820 = 1;
		field2825 = 0;
		field2822 = "";
		field2813 = "";
		field2824 = "";
		field2839 = "";
		field2842 = "";
		field2827 = "";
		field2828 = 0;
		field2829 = new String[8];
		field2811 = "";
		field2831 = false;
		field2808 = false;
		field2833 = true;
		field2834 = 0;
		field2835 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		field2809 = "1234567890";
		field2836 = false;
		field2838 = -1;
		field2845 = 0;
		field2840 = 0;
		new DecimalFormat("##0.00");
		new class315();
		field2841 = -1L;
		field2837 = -1L;
		field2821 = new String[]{"title.jpg"};
		field2844 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field2843 = new String[]{"logo_speedrunning"};
	}

	static int method1896(class5 var0, class5 var1) {
		int var3 = 0;
		String[] var4 = field2821;

		int var5;
		String var6;
		for (var5 = 0; var5 < var4.length; ++var5) {
			var6 = var4[var5];
			if (var0.method30(var6, "")) {
				++var3;
			}
		}

		var4 = field2844;

		for (var5 = 0; var5 < var4.length; ++var5) {
			var6 = var4[var5];
			if (var1.method30(var6, "")) {
				++var3;
			}
		}

		var4 = field2843;

		for (var5 = 0; var5 < var4.length; ++var5) {
			var6 = var4[var5];
			if (var1.method28(var6) != -1 && var1.method30(var6, "")) {
				++var3;
			}
		}

		return var3;
	}

	static class230 method1886(boolean var0, boolean var1) {
		return var0 ? (var1 ? class398.field2746 : class544.field4240) : (var1 ? class484.field3399 : class206.field1377);
	}

	static void method1888() {
		if (field2842 == null || field2842.length() <= 0) {
			if (class109.field693.method462() != null) {
				field2842 = class109.field693.method462();
				Client.field1885 = true;
			} else {
				Client.field1885 = false;
			}

		}
	}

	static void method1890(class535 var0, class282 var1, class282 var2) {
		int var6;
		boolean var11;
		int var28;
		int var29;
		boolean var32;
		boolean var33;
		if (field2836) {
			class381 var27 = Client.method1420();

			while (true) {
				if (!var27.method1795()) {
					if (class316.field2316 != 1 && (class108.field685 || class316.field2316 != 4)) {
						break;
					}

					int var5 = 280 + field2810;
					if (class316.field2318 >= var5 && class316.field2318 <= var5 + 14 && class316.field2320 >= 4 && class316.field2320 <= 18) {
						class426.method1941(0, 0);
						break;
					}

					if (class316.field2318 >= var5 + 15 && class316.field2318 <= var5 + 80 && class316.field2320 >= 4 && class316.field2320 <= 18) {
						class426.method1941(0, 1);
						break;
					}

					var6 = field2810 + 390;
					if (class316.field2318 >= var6 && class316.field2318 <= var6 + 14 && class316.field2320 >= 4 && class316.field2320 <= 18) {
						class426.method1941(1, 0);
						break;
					}

					if (class316.field2318 >= var6 + 15 && class316.field2318 <= var6 + 80 && class316.field2320 >= 4 && class316.field2320 <= 18) {
						class426.method1941(1, 1);
						break;
					}

					var28 = 500 + field2810;
					if (class316.field2318 >= var28 && class316.field2318 <= var28 + 14 && class316.field2320 >= 4 && class316.field2320 <= 18) {
						class426.method1941(2, 0);
						break;
					}

					if (class316.field2318 >= var28 + 15 && class316.field2318 <= var28 + 80 && class316.field2320 >= 4 && class316.field2320 <= 18) {
						class426.method1941(2, 1);
						break;
					}

					var29 = 610 + field2810;
					if (class316.field2318 >= var29 && class316.field2318 <= var29 + 14 && class316.field2320 >= 4 && class316.field2320 <= 18) {
						class426.method1941(3, 0);
						break;
					}

					if (class316.field2318 >= var29 + 15 && class316.field2318 <= var29 + 80 && class316.field2320 >= 4 && class316.field2320 <= 18) {
						class426.method1941(3, 1);
						break;
					}

					if (class316.field2318 >= 708 + field2810 && class316.field2320 >= 4 && class316.field2318 <= 708 + field2810 + 50 && class316.field2320 <= 20) {
						field2836 = false;
						class67.field435.method157(field2810, 0);
						field2832.method157(382 + field2810, 0);
						field2814.method1065(field2810 + 382 - field2814.field1503 / 2, 18);
						break;
					}

					if (field2838 != -1) {
						class426 var31 = class233.field1534[field2838];
						if (var31.method1929()) {
							var31.field2871 = "beta";
						}

						var32 = false;
						if (Client.field1833 != var31.field2869) {
							var11 = (Client.field1833 & class550.field4289.getId()) != 0;
							var33 = var31.method1929();
							if (var11 && !var33 || !var11 && var33) {
								var32 = true;
							}
						}

						method1894(var31);
						field2836 = false;
						class67.field435.method157(field2810, 0);
						field2832.method157(field2810 + 382, 0);
						field2814.method1065(field2810 + 382 - field2814.field1503 / 2, 18);
						if (var32) {
							Client.method1365();
						}
					} else {
						if (field2845 > 0 && class205.field1372 != null && class316.field2318 >= 0 && class316.field2318 <= class205.field1372.field1503 && class316.field2320 >= class92.field595 / 2 - 50 && class316.field2320 <= 50 + class92.field595 / 2) {
							--field2845;
						}

						if (field2845 < field2840 && null != class265.field1782 && class316.field2318 >= class164.field1170 - class265.field1782.field1503 - 5 && class316.field2318 <= class164.field1170 && class316.field2320 >= class92.field595 / 2 - 50 && class316.field2320 <= class92.field595 / 2 + 50) {
							++field2845;
						}
					}
					break;
				}

				if (var27.field2637 == 13) {
					field2836 = false;
					class67.field435.method157(field2810, 0);
					field2832.method157(382 + field2810, 0);
					field2814.method1065(382 + field2810 - field2814.field1503 / 2, 18);
					break;
				}

				if (var27.field2637 == 96) {
					if (field2845 > 0 && null != class205.field1372) {
						--field2845;
					}
				} else if (var27.field2637 == 97 && field2845 < field2840 && class265.field1782 != null) {
					++field2845;
				}
			}

		} else {
			if ((class316.field2316 == 1 || !class108.field685 && class316.field2316 == 4) && class316.field2318 >= 765 + field2810 - 50 && class316.field2320 >= 453) {
				class109.field693.method440(!class109.field693.method438());
				if (!class109.field693.method438()) {
					ArrayList var4 = new ArrayList();
					var4.add(new class407(class151.field1049, "scape main", "", 255, false));
					class14.method61(var4, 0, 0, 0, 100, false);
				} else {
					class483.method2223(0, 0);
				}

				class483.method2229();
			}

			if (Client.field1843 != 5) {
				if (field2841 == -1L) {
					field2841 = class38.method108() + 1000L;
				}

				long var26 = class38.method108();
				if (Client.method1319() && field2837 == -1L) {
					field2837 = var26;
					if (field2837 > field2841) {
						field2841 = field2837;
					}
				}

				if (Client.field1843 == 10 || Client.field1843 == 11) {
					if (class13.field75 == class66.field419) {
						if (class316.field2316 == 1 || !class108.field685 && class316.field2316 == 4) {
							var6 = 5 + field2810;
							boolean var7 = true;
							boolean var8 = true;
							boolean var9 = true;
							if (class316.field2318 >= var6 && class316.field2318 <= var6 + 100 && class316.field2320 >= 463 && class316.field2320 <= 498) {
								if (class426.method1938()) {
									field2836 = true;
									field2845 = 0;
									field2840 = 0;
								}

								return;
							}
						}

						if (null != class109.field691 && class426.method1938()) {
							field2836 = true;
							field2845 = 0;
							field2840 = 0;
						}
					}

					var6 = class316.field2316;
					var28 = class316.field2318;
					var29 = class316.field2320;
					if (var6 == 0) {
						var28 = class316.field2309;
						var29 = class316.field2315;
					}

					if (!class108.field685 && var6 == 4) {
						var6 = 1;
					}

					class381 var30 = Client.method1420();
					int var34;
					if (field2825 == 0) {
						var32 = false;

						while (var30.method1795()) {
							if (var30.field2637 == 84) {
								var32 = true;
							}
						}

						var34 = class469.field3303 - 80;
						var33 = true;
						if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 271 && var29 <= 311) {
							class467.method2170(Client.method1330("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var34 = 80 + class469.field3303;
						if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 271 && var29 <= 311 || var32) {
							if ((Client.field1833 & class550.field4297.getId()) != 0) {
								field2822 = "";
								field2813 = class513.field3962;
								field2824 = class513.field3973;
								field2839 = class513.field3836;
								method1883(1);
								if (Client.field1885 && null != field2842 && field2842.length() > 0) {
									field2834 = 1;
								} else {
									field2834 = 0;
								}
							} else if ((Client.field1833 & class550.field4273.getId()) != 0) {
								if ((Client.field1833 & class550.field4282.getId()) != 0) {
									field2813 = class513.field3842;
									field2824 = class513.field3970;
									field2839 = class513.field3971;
								} else {
									field2813 = class513.field3963;
									field2824 = class513.field3964;
									field2839 = class513.field3996;
								}

								field2822 = class513.field3824;
								method1883(1);
								if (Client.field1885 && field2842 != null && field2842.length() > 0) {
									field2834 = 1;
								} else {
									field2834 = 0;
								}
							} else if ((Client.field1833 & class550.field4282.getId()) != 0) {
								field2813 = class513.field3966;
								field2824 = class513.field3979;
								field2839 = class513.field3968;
								field2822 = class513.field3824;
								method1883(1);
								if (Client.field1885 && field2842 != null && field2842.length() > 0) {
									field2834 = 1;
								} else {
									field2834 = 0;
								}
							} else {
								method1898(false);
							}
						}
					} else {
						int var10;
						if (field2825 == 1) {
							while (true) {
								if (!var30.method1795()) {
									var10 = class469.field3303 - 80;
									var11 = true;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
										method1898(false);
									}

									var10 = class469.field3303 + 80;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
										method1883(0);
									}
									break;
								}

								if (var30.field2637 == 84) {
									method1898(false);
								} else if (var30.field2637 == 13) {
									method1883(0);
								}
							}
						} else {
							int var14;
							int var16;
							boolean var36;
							int var39;
							boolean var42;
							if (field2825 == 2) {
								short var56 = 201;
								var10 = var56 + 52;
								if (var6 == 1 && var29 >= 241 && var29 < 255) {
									field2834 = 0;
								}

								var10 += 15;
								if (var6 == 1 && var29 >= 256 && var29 < 270) {
									field2834 = 1;
								}

								var10 += 15;
								var32 = true;
								if (null != class549.field4270) {
									var34 = class549.field4270.field1146 / 2;
									if (var6 == 1 && var28 >= class549.field4270.field1147 - var34 && var28 <= class549.field4270.field1147 + var34 && var29 >= 346 && var29 < 361) {
										switch(field2820) {
										case 1:
											class467.method2170(class513.field4059, true, false);
											return;
										case 2:
											class467.method2170("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var34 = class469.field3303 - 80;
								var33 = true;
								if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 301 && var29 <= 341) {
									method1885();
									return;
								}

								var34 = 180 + field2816 + 80;
								if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 301 && var29 <= 341) {
									method1883(0);
									field2842 = "";
									field2827 = "";
									class98.field635 = 0;
									class333.field2361 = "";
									field2833 = true;
								}

								var34 = -117 + class469.field3303;
								var33 = true;
								field2831 = var28 >= var34 && var28 < var34 + class386.field2656 && var29 >= 277 && var29 < class136.field881 + 277;
								if (var6 == 1 && field2831) {
									Client.field1885 = !Client.field1885;
									if (!Client.field1885 && class109.field693.method462() != null) {
										class109.field693.method450((String)null);
									}
								}

								var34 = 24 + class469.field3303;
								var33 = true;
								field2808 = var28 >= var34 && var28 < class386.field2656 + var34 && var29 >= 277 && var29 < 277 + class136.field881;
								if (var6 == 1 && field2808) {
									class109.field693.method457(!class109.field693.method439());
									if (!class109.field693.method439()) {
										field2842 = "";
										class109.field693.method450((String)null);
										if (Client.field1885 && null != field2842 && field2842.length() > 0) {
											field2834 = 1;
										} else {
											field2834 = 0;
										}
									}
								}

								label1341:
								while (true) {
									Transferable var55;
									do {
										while (true) {
											label1257:
											do {
												while (true) {
													while (var30.method1795()) {
														if (var30.field2637 != 13) {
															if (field2834 != 0) {
																continue label1257;
															}

															char var41 = var30.field2626;

															for (var14 = 0; var14 < field2835.length() && var41 != field2835.charAt(var14); ++var14) {
															}

															if (var30.field2637 == 85 && field2842.length() > 0) {
																field2842 = field2842.substring(0, field2842.length() - 1);
															}

															if (var30.field2637 == 84 || var30.field2637 == 80) {
																field2834 = 1;
															}

															char var46 = var30.field2626;
															boolean var52 = field2835.indexOf(var46) != -1;
															if (var52 && field2842.length() < 320) {
																field2842 = field2842 + var30.field2626;
															}
														} else {
															method1883(0);
															field2842 = "";
															field2827 = "";
															class98.field635 = 0;
															class333.field2361 = "";
															field2833 = true;
														}
													}

													return;
												}
											} while(field2834 != 1);

											if (var30.field2637 == 85 && field2827.length() > 0) {
												field2827 = field2827.substring(0, field2827.length() - 1);
											} else if (var30.field2637 == 84 || var30.field2637 == 80) {
												field2834 = 0;
												if (var30.field2637 == 84) {
													field2842 = field2842.trim();
													if (field2842.length() == 0) {
														method1891(class513.field3870, class513.field3767, class513.field3872);
														return;
													}

													if (field2827.length() == 0) {
														method1891(class513.field3873, class513.field3874, class513.field3823);
														return;
													}

													method1891(class513.field3976, class513.field3818, class513.field3912);
													Client.method1350(false);
													class432.method1954(20);
													return;
												}
											}

											if ((var30.method1798(82) || var30.method1798(87)) && var30.field2637 == 67) {
												Clipboard var50 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var55 = var50.getContents(class190.field1287);
												var39 = 20 - field2827.length();
												break;
											}

											char var54 = var30.field2626;
											if ((var54 < ' ' || var54 >= 127) && (var54 <= 127 || var54 >= 160) && (var54 <= 160 || var54 > 255)) {
												label1493: {
													if (var54 != 0) {
														char[] var49 = class88.field582;

														for (var16 = 0; var16 < var49.length; ++var16) {
															char var17 = var49[var16];
															if (var17 == var54) {
																var36 = true;
																break label1493;
															}
														}
													}

													var36 = false;
												}
											} else {
												var36 = true;
											}

											if (var36) {
												char var51 = var30.field2626;
												var42 = field2835.indexOf(var51) != -1;
												if (var42 && field2827.length() < 20) {
													field2827 = field2827 + var30.field2626;
												}
											}
										}
									} while(var39 <= 0);

									try {
										String var53 = (String)var55.getTransferData(DataFlavor.stringFlavor);
										int var48 = Math.min(var39, var53.length());
										int var18 = 0;

										while (true) {
											if (var18 >= var48) {
												field2827 = field2827 + var53.substring(0, var48);
												continue label1341;
											}

											char var20 = var53.charAt(var18);
											boolean var19;
											if (var20 >= ' ' && var20 < 127 || var20 > 127 && var20 < 160 || var20 > 160 && var20 <= 255) {
												var19 = true;
											} else {
												label1514: {
													if (var20 != 0) {
														char[] var21 = class88.field582;

														for (int var22 = 0; var22 < var21.length; ++var22) {
															char var23 = var21[var22];
															if (var20 == var23) {
																var19 = true;
																break label1514;
															}
														}
													}

													var19 = false;
												}
											}

											if (!var19) {
												break;
											}

											char var58 = var53.charAt(var18);
											boolean var57 = field2835.indexOf(var58) != -1;
											if (!var57) {
												break;
											}

											++var18;
										}

										method1883(3);
										return;
									} catch (UnsupportedFlavorException var24) {
									} catch (IOException var25) {
									}
								}
							} else {
								class160 var12;
								if (field2825 == 3) {
									var10 = field2816 + 180;
									var11 = true;
									var12 = var1.method1050(25, class513.field3939.length() - 34, class513.field3939, var10, 241);
									if (var6 == 1 && var12.method867(var28, var29)) {
										class467.method2170(class513.field3800, true, false);
									}

									var10 = 180 + field2816;
									var11 = true;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 256 && var29 <= 296) {
										class33.method100(false);
									}

									var10 = field2816 + 180;
									var11 = true;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 306 && var29 <= 346) {
										class467.method2170(class513.field4059, true, false);
										return;
									}
								} else {
									int var13;
									if (field2825 == 4) {
										var10 = 180 + field2816 - 80;
										var11 = true;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
											class333.field2361.trim();
											if (class333.field2361.length() != 6) {
												method1891(class513.field3789, class513.field3768, class513.field4026);
												return;
											}

											class98.field635 = Integer.parseInt(class333.field2361);
											class333.field2361 = "";
											Client.method1350(true);
											method1891(class513.field3976, class513.field3818, class513.field3912);
											class432.method1954(20);
											return;
										}

										if (var6 == 1 && var28 >= 180 + field2816 - 9 && var28 <= 130 + field2816 + 180 && var29 >= 263 && var29 <= 296) {
											field2833 = !field2833;
										}

										if (var6 == 1 && var28 >= 180 + field2816 - 34 && var28 <= 180 + field2816 + 34 && var29 >= 351 && var29 <= 363) {
											class467.method2170(class513.field4059, true, false);
										}

										var10 = field2816 + 180 + 80;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
											method1883(0);
											field2842 = "";
											field2827 = "";
											class98.field635 = 0;
											class333.field2361 = "";
										}

										while (var30.method1795()) {
											var33 = false;

											for (var13 = 0; var13 < field2809.length(); ++var13) {
												if (var30.field2626 == field2809.charAt(var13)) {
													var33 = true;
													break;
												}
											}

											if (var30.field2637 == 13) {
												method1883(0);
												field2842 = "";
												field2827 = "";
												class98.field635 = 0;
												class333.field2361 = "";
											} else {
												if (var30.field2637 == 85 && class333.field2361.length() > 0) {
													class333.field2361 = class333.field2361.substring(0, class333.field2361.length() - 1);
												}

												if (var30.field2637 == 84) {
													class333.field2361.trim();
													if (class333.field2361.length() != 6) {
														method1891(class513.field3789, class513.field3768, class513.field4026);
														return;
													}

													class98.field635 = Integer.parseInt(class333.field2361);
													class333.field2361 = "";
													Client.method1350(true);
													method1891(class513.field3976, class513.field3818, class513.field3912);
													class432.method1954(20);
													return;
												}

												if (var33 && class333.field2361.length() < 6) {
													class333.field2361 = class333.field2361 + var30.field2626;
												}
											}
										}
									} else if (field2825 == 5) {
										var10 = 180 + field2816 - 80;
										var11 = true;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
											field2842 = field2842.trim();
											if (field2842.length() == 0) {
												method1891(class513.field3927, class513.field4011, class513.field4012);
											} else {
												long var38 = class134.method616();
												int var35;
												if (0L == var38) {
													var35 = 5;
												} else {
													var35 = class134.method617(var38, field2842);
												}

												switch(var35) {
												case 2:
													method1891(class513.field3990, class513.field3826, class513.field4015);
													method1883(6);
													break;
												case 3:
													method1891(class513.field4016, class513.field4017, class513.field3863);
													break;
												case 4:
													method1891(class513.field3958, class513.field4020, class513.field3827);
													break;
												case 5:
													method1891(class513.field3830, class513.field4023, class513.field4024);
													break;
												case 6:
													method1891(class513.field4025, class513.field3974, class513.field4027);
													break;
												case 7:
													method1891(class513.field3922, class513.field3840, class513.field4030);
												}
											}

											return;
										}

										var10 = 180 + field2816 + 80;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
											method1898(true);
										}

										var33 = true;
										if (null != class56.field261) {
											var13 = class56.field261.field1146 / 2;
											if (var6 == 1 && var28 >= class56.field261.field1147 - var13 && var28 <= var13 + class56.field261.field1147 && var29 >= 346 && var29 < 361) {
												class467.method2170(Client.method1330("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var30.method1795()) {
											var36 = false;

											for (var14 = 0; var14 < field2835.length(); ++var14) {
												if (var30.field2626 == field2835.charAt(var14)) {
													var36 = true;
													break;
												}
											}

											if (var30.field2637 == 13) {
												method1898(true);
											} else {
												if (var30.field2637 == 85 && field2842.length() > 0) {
													field2842 = field2842.substring(0, field2842.length() - 1);
												}

												if (var30.field2637 == 84) {
													field2842 = field2842.trim();
													if (field2842.length() == 0) {
														method1891(class513.field3927, class513.field4011, class513.field4012);
													} else {
														long var15 = class134.method616();
														if (0L == var15) {
															var14 = 5;
														} else {
															var14 = class134.method617(var15, field2842);
														}

														switch(var14) {
														case 2:
															method1891(class513.field3990, class513.field3826, class513.field4015);
															method1883(6);
															break;
														case 3:
															method1891(class513.field4016, class513.field4017, class513.field3863);
															break;
														case 4:
															method1891(class513.field3958, class513.field4020, class513.field3827);
															break;
														case 5:
															method1891(class513.field3830, class513.field4023, class513.field4024);
															break;
														case 6:
															method1891(class513.field4025, class513.field3974, class513.field4027);
															break;
														case 7:
															method1891(class513.field3922, class513.field3840, class513.field4030);
														}
													}

													return;
												}

												if (var36 && field2842.length() < 320) {
													field2842 = field2842 + var30.field2626;
												}
											}
										}
									} else if (field2825 != 6) {
										if (field2825 == 7) {
											if (class33.field173 && !Client.field2086) {
												var10 = class469.field3303 - 150;
												var34 = 40 + var10 + 240 + 25;
												var33 = true;
												var36 = true;
												if (var6 == 1 && var28 >= var10 && var28 <= var34 && var29 >= 231 && var29 <= 271) {
													var39 = var10;
													var16 = 0;

													while (true) {
														if (var16 >= 8) {
															var14 = 0;
															break;
														}

														if (var28 <= var39 + 30) {
															var14 = var16;
															break;
														}

														var39 += 30;
														var39 += var16 != 1 && var16 != 3 ? 5 : 20;
														++var16;
													}

													field2828 = var14;
												}

												var14 = field2816 + 180 - 80;
												var42 = true;
												boolean var44;
												if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= 301 && var29 <= 341) {
													var44 = method1887();
													if (var44) {
														class432.method1954(50);
														return;
													}
												}

												var14 = 80 + 180 + field2816;
												if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= 301 && var29 <= 341) {
													field2829 = new String[8];
													method1898(true);
												}

												while (var30.method1795()) {
													if (var30.field2637 == 101) {
														field2829[field2828] = null;
													}

													if (var30.field2637 == 85) {
														if (field2829[field2828] == null && field2828 > 0) {
															--field2828;
														}

														field2829[field2828] = null;
													}

													if (var30.field2626 >= '0' && var30.field2626 <= '9') {
														field2829[field2828] = "" + var30.field2626;
														if (field2828 < 7) {
															++field2828;
														}
													}

													if (var30.field2637 == 84) {
														var44 = method1887();
														if (var44) {
															class432.method1954(50);
														}

														return;
													}
												}
											} else {
												var10 = 180 + field2816 - 80;
												var11 = true;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
													class467.method2170(Client.method1330("secure", true) + "m=dob/set_dob.ws", true, false);
													method1891(class513.field3967, class513.field4008, class513.field4009);
													method1883(6);
													return;
												}

												var10 = 80 + field2816 + 180;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
													method1898(true);
												}
											}
										} else if (field2825 == 8) {
											var10 = field2816 + 180 - 80;
											var11 = true;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
												class467.method2170("https://www.jagex.com/terms/privacy", true, false);
												method1891(class513.field3967, class513.field4008, class513.field4009);
												method1883(6);
												return;
											}

											var10 = 80 + 180 + field2816;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
												method1898(true);
											}
										} else if (field2825 == 9) {
											var10 = field2816 + 180;
											var11 = true;
											if (var30.field2637 == 84 || var30.field2637 == 13 || var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 291 && var29 <= 331) {
												class33.method100(false);
											}
										} else if (field2825 == 10) {
											var10 = field2816 + 180;
											var11 = true;
											if (var30.field2637 == 84 || var6 == 1 && var28 >= var10 - 109 && var28 <= var10 + 109 && var29 >= 209 && var29 <= 277) {
												method1891(class513.field3976, class513.field3818, class513.field3912);
												Client.field1872 = class544.field4234;
												Client.method1350(false);
												class432.method1954(20);
											}
										} else if (field2825 == 12) {
											var10 = class469.field3303;
											short var37 = 233;
											var12 = var2.method1050(0, 30, class513.field4039, var10, 233);
											class160 var40 = var2.method1050(32, 32, class513.field4039, var10, 233);
											class160 var47 = var2.method1050(70, 34, class513.field4039, var10, 233);
											var34 = var37 + 17;
											class160 var45 = var2.method1050(0, 34, class513.field4040, var10, 250);
											if (var6 == 1) {
												if (var12.method867(var28, var29)) {
													class467.method2170("https://www.jagex.com/terms", true, false);
												} else if (var40.method867(var28, var29)) {
													class467.method2170("https://www.jagex.com/terms/privacy", true, false);
												} else if (var47.method867(var28, var29) || var45.method867(var28, var29)) {
													class467.method2170("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var10 = class469.field3303 - 80;
											var11 = true;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 291 && var29 <= 331) {
												Client.method1410();
												class33.method100(true);
											}

											var10 = class469.field3303 + 80;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 291 && var29 <= 331) {
												field2825 = 13;
											}
										} else if (field2825 == 13) {
											var10 = class469.field3303;
											var11 = true;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
												class33.method100(true);
											}
										} else if (field2825 == 14) {
											String var43 = "";
											switch(field2819) {
											case 0:
												var43 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var43 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var43 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												method1898(false);
											}

											var34 = 180 + field2816;
											var33 = true;
											if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 256 && var29 <= 296) {
												class467.method2170(var43, true, false);
												method1891(class513.field3967, class513.field4008, class513.field4009);
												method1883(6);
												return;
											}

											var34 = field2816 + 180;
											var33 = true;
											if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 306 && var29 <= 346) {
												method1898(false);
											}
										} else if (field2825 == 24) {
											var10 = field2816 + 180;
											var11 = true;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 281 && var29 <= 321) {
												class33.method100(false);
											}
										} else if (field2825 == 32) {
											var10 = 180 + field2816 - 80;
											var11 = true;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
												class467.method2170(Client.method1330("secure", true) + "m=dob/set_dob.ws", true, false);
												method1891(class513.field3967, class513.field4008, class513.field4009);
												method1883(6);
												return;
											}

											var10 = field2816 + 180 + 80;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
												method1898(true);
											}
										} else if (field2825 == 33) {
											var10 = 180 + field2816;
											var11 = true;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 256 && var29 <= 296) {
												class467.method2170(class513.field3800, true, false);
											}

											var10 = field2816 + 180;
											var11 = true;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 306 && var29 <= 346) {
												method1898(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var30.method1795()) {
													var32 = true;
													if (var6 == 1 && var29 >= 301 && var29 <= 341) {
														method1898(true);
													}

													return;
												}
											} while(var30.field2637 != 84 && var30.field2637 != 13);

											method1898(true);
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

	static void method1885() {
		field2842 = field2842.trim();
		if (field2842.length() == 0) {
			method1891(class513.field3870, class513.field3767, class513.field3872);
		} else if (field2827.length() == 0) {
			method1891(class513.field3873, class513.field3874, class513.field3823);
		} else {
			method1891(class513.field3976, class513.field3818, class513.field3912);
			Client.method1350(false);
			class432.method1954(20);
		}
	}

	static boolean method1887() {
		Date var1;
		try {
			var1 = method1882();
		} catch (ParseException var5) {
			method1881("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var1 == null) {
			return false;
		} else {
			Calendar var3 = Calendar.getInstance();
			var3.set(1, var3.get(1) - 13);
			var3.set(5, var3.get(5) + 1);
			var3.set(11, 0);
			var3.set(12, 0);
			var3.set(13, 0);
			var3.set(14, 0);
			Date var4 = var3.getTime();
			boolean var2 = var1.before(var4);
			boolean var6 = method1889(var1);
			if (!var6) {
				method1881("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var2) {
					class446.field2981 = 8388607;
				} else {
					class446.field2981 = (int)(var1.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	static boolean method1889(Date var0) {
		Date var2 = method1892();
		return var0.after(var2);
	}

	static Date method1892() {
		Calendar var1 = Calendar.getInstance();
		var1.set(2, 0);
		var1.set(5, 1);
		var1.set(1, 1900);
		return var1.getTime();
	}

	static void method1881(String var0, String var1, String var2) {
		method1883(7);
		method1891(var0, var1, var2);
	}

	static Date method1882() throws ParseException {
		SimpleDateFormat var1 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var1.setLenient(false);
		StringBuilder var2 = new StringBuilder();
		String[] var3 = field2829;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			String var5 = var3[var4];
			if (null == var5) {
				method1881("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var2.append(var5);
		}

		var2.append("12");
		return var1.parse(var2.toString());
	}

	static void method1898(boolean var0) {
		if (!class190.field1287.method1301() && !class190.field1287.method1274() && !class190.field1287.method1273()) {
			field2813 = class513.field3959;
			field2824 = class513.field4047;
			field2839 = class513.field3809;
			method1883(2);
			if (var0) {
				field2827 = "";
			}

			method1888();
			if (Client.field1885 && null != field2842 && field2842.length() > 0) {
				field2834 = 1;
			} else {
				field2834 = 0;
			}

		} else {
			method1883(10);
		}
	}

	static void method1897(class282 var0, class282 var1, class282 var2) {
		field2810 = (class164.field1170 - 765) / 2;
		field2816 = 202 + field2810;
		class469.field3303 = field2816 + 180;
		if (field2836) {
			method1895(var0, var1);
		} else {
			class67.field435.method157(field2810, 0);
			field2832.method157(382 + field2810, 0);
			field2814.method1065(field2810 + 382 - field2814.field1503 / 2, 18);
			boolean var4;
			boolean var5;
			if (Client.field1843 == 0 || Client.field1843 == 5) {
				var4 = true;
				var0.method1045(class513.field3904, 180 + field2816, 225, 16777215, -1);
				var5 = true;
				class433.method1978(field2816 + 180 - 152, 233, 304, 34, 9179409);
				class433.method1978(180 + field2816 - 151, 234, 302, 32, 0);
				class433.method1977(180 + field2816 - 150, 235, field2817 * 3, 30, 9179409);
				class433.method1977(180 + field2816 - 150 + field2817 * 3, 235, 300 - field2817 * 3, 30, 0);
				var0.method1045(field2818, field2816 + 180, 256, 16777215, -1);
			}

			String var7;
			String var8;
			String var9;
			String var10;
			short var15;
			int var16;
			if (Client.field1843 == 20) {
				field2823.method1065(180 + field2816 - field2823.field1503 / 2, 271 - field2823.field1501 / 2);
				var15 = 201;
				var0.method1045(field2813, field2816 + 180, 201, 16776960, 0);
				var16 = var15 + 15;
				var0.method1045(field2824, 180 + field2816, 216, 16776960, 0);
				var16 += 15;
				var0.method1045(field2839, 180 + field2816, 231, 16776960, 0);
				var16 += 15;
				var16 += 7;
				if (field2825 != 4 && field2825 != 10) {
					var0.method1037(class513.field3985, field2816 + 180 - 110, 253, 16777215, 0);
					var5 = true;
					if (class109.field693.method439()) {
						var9 = field2842;
						var8 = class385.method1809('*', var9.length());
						var7 = var8;
					} else {
						var7 = field2842;
					}

					for (var7 = var7; var0.method1033(var7) > 200; var7 = var7.substring(0, var7.length() - 1)) {
					}

					var0.method1037(class229.method1036(var7), field2816 + 180 - 70, 253, 16777215, 0);
					var16 += 15;
					var9 = field2827;
					var8 = class385.method1809('*', var9.length());

					for (var10 = var8; var0.method1033(var10) > 200; var10 = var10.substring(1)) {
					}

					var0.method1037(class513.field3776 + var10, field2816 + 180 - 108, 268, 16777215, 0);
					var16 += 15;
				}
			}

			boolean var6;
			boolean var26;
			if (Client.field1843 == 10 || Client.field1843 == 11 || Client.field1843 == 50) {
				field2823.method1065(field2816, 171);
				int var17;
				if (field2825 == 0) {
					var15 = 251;
					var0.method1045(class513.field3988, 180 + field2816, 251, 16776960, 0);
					var16 = var15 + 30;
					var17 = field2816 + 180 - 80;
					var6 = true;
					class241.field1619.method1065(var17 - 73, 271);
					var0.method1040(class513.field4014, var17 - 73, 271, 144, 40, 16777215, 0, 1, 1, 0);
					var17 = 80 + field2816 + 180;
					class241.field1619.method1065(var17 - 73, 271);
					var0.method1040(class513.field4029, var17 - 73, 271, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (field2825 == 1) {
					var0.method1045(field2822, field2816 + 180, 201, 16776960, 0);
					var15 = 236;
					var0.method1045(field2813, field2816 + 180, 236, 16777215, 0);
					var16 = var15 + 15;
					var0.method1045(field2824, field2816 + 180, 251, 16777215, 0);
					var16 += 15;
					var0.method1045(field2839, 180 + field2816, 266, 16777215, 0);
					var16 += 15;
					var17 = field2816 + 180 - 80;
					var6 = true;
					class241.field1619.method1065(var17 - 73, 301);
					var0.method1045(class513.field3755, var17, 326, 16777215, 0);
					var17 = 80 + field2816 + 180;
					class241.field1619.method1065(var17 - 73, 301);
					var0.method1045(class513.field3992, var17, 326, 16777215, 0);
				} else if (field2825 == 2) {
					var15 = 201;
					var0.method1045(field2813, class469.field3303, 201, 16776960, 0);
					var16 = var15 + 15;
					var0.method1045(field2824, class469.field3303, 216, 16776960, 0);
					var16 += 15;
					var0.method1045(field2839, class469.field3303, 231, 16776960, 0);
					var16 += 15;
					var16 += 7;
					var0.method1037(class513.field3985, class469.field3303 - 110, 253, 16777215, 0);
					var5 = true;
					if (class109.field693.method439()) {
						var9 = field2842;
						var8 = class385.method1809('*', var9.length());
						var7 = var8;
					} else {
						var7 = field2842;
					}

					for (var7 = var7; var0.method1033(var7) > 200; var7 = var7.substring(1)) {
					}

					var0.method1037(class229.method1036(var7) + (field2834 == 0 & Client.field1846 % 40 < 20 ? class274.method1266(16776960) + class274.field1820 : ""), class469.field3303 - 70, 253, 16777215, 0);
					var16 += 15;
					var9 = field2827;
					var8 = class385.method1809('*', var9.length());

					for (var10 = var8; var0.method1033(var10) > 200; var10 = var10.substring(1)) {
					}

					var0.method1037(class513.field3776 + var10 + (field2834 == 1 & Client.field1846 % 40 < 20 ? class274.method1266(16776960) + class274.field1820 : ""), class469.field3303 - 108, 268, 16777215, 0);
					var16 += 15;
					var15 = 277;
					int var11 = class469.field3303 + -117;
					class230 var12 = method1886(Client.field1885, field2831);
					var12.method1065(var11, 277);
					var11 += var12.field1503 + 5;
					var1.method1037(class513.field3993, var11, 290, 16776960, 0);
					var11 = class469.field3303 + 24;
					var12 = method1886(class109.field693.method439(), field2808);
					var12.method1065(var11, 277);
					var11 += var12.field1503 + 5;
					var1.method1037(class513.field3794, var11, 290, 16776960, 0);
					var16 = var15 + 15;
					int var13 = class469.field3303 - 80;
					boolean var14 = true;
					class241.field1619.method1065(var13 - 73, 301);
					var0.method1045(class513.field3991, var13, 326, 16777215, 0);
					var13 = 80 + class469.field3303;
					class241.field1619.method1065(var13 - 73, 301);
					var0.method1045(class513.field3992, var13, 326, 16777215, 0);
					var4 = true;
					switch(field2820) {
					case 2:
						class93.field599 = class513.field3792;
						break;
					default:
						class93.field599 = class513.field4004;
					}

					class549.field4270 = new class160(class469.field3303, 357, var1.method1033(class93.field599), 11);
					class56.field261 = new class160(class469.field3303, 357, var1.method1033(class513.field4005), 11);
					var1.method1045(class93.field599, class469.field3303, 357, 16777215, 0);
				} else if (field2825 == 3) {
					var15 = 201;
					var0.method1045(class513.field3749, 180 + field2816, 201, 16776960, 0);
					var16 = var15 + 20;
					var1.method1045(class513.field3938, 180 + field2816, 221, 16776960, 0);
					var16 += 20;
					var1.method1045(class513.field3939, field2816 + 180, 241, 16776960, 0);
					var16 += 15;
					var17 = field2816 + 180;
					var6 = true;
					class241.field1619.method1065(var17 - 73, 256);
					var2.method1045(class513.field3998, var17, 281, 16777215, 0);
					var17 = 180 + field2816;
					var6 = true;
					class241.field1619.method1065(var17 - 73, 306);
					var2.method1045(class513.field3999, var17, 331, 16777215, 0);
				} else {
					String var18;
					if (field2825 == 4) {
						var0.method1045(class513.field3781, field2816 + 180, 201, 16776960, 0);
						var15 = 236;
						var0.method1045(field2813, field2816 + 180, 236, 16777215, 0);
						var16 = var15 + 15;
						var0.method1045(field2824, 180 + field2816, 251, 16777215, 0);
						var16 += 15;
						var0.method1045(field2839, field2816 + 180, 266, 16777215, 0);
						var16 += 15;
						var18 = class513.field3987;
						var8 = class333.field2361;
						var7 = class385.method1809('*', var8.length());
						var0.method1037(var18 + var7 + (Client.field1846 % 40 < 20 ? class274.method1266(16776960) + class274.field1820 : ""), 180 + field2816 - 108, 281, 16777215, 0);
						var16 -= 8;
						var0.method1037(class513.field3923, 180 + field2816 - 9, 273, 16776960, 0);
						var16 += 15;
						var0.method1037(class513.field3759, 180 + field2816 - 9, 288, 16776960, 0);
						int var21 = 180 + field2816 - 9 + var0.method1033(class513.field3759) + 15;
						int var23 = 288 - var0.field1483;
						class230 var25;
						if (field2833) {
							var25 = class544.field4240;
						} else {
							var25 = class206.field1377;
						}

						var25.method1065(var21, var23);
						var16 += 15;
						int var27 = field2816 + 180 - 80;
						boolean var28 = true;
						class241.field1619.method1065(var27 - 73, 301);
						var0.method1045(class513.field3755, var27, 326, 16777215, 0);
						var27 = field2816 + 180 + 80;
						class241.field1619.method1065(var27 - 73, 301);
						var0.method1045(class513.field3992, var27, 326, 16777215, 0);
						var1.method1045(class513.field4004, field2816 + 180, 357, 16777215, 0);
					} else {
						int var20;
						boolean var22;
						if (field2825 == 5) {
							var0.method1045(class513.field4000, 180 + field2816, 201, 16776960, 0);
							var15 = 221;
							var2.method1045(field2813, field2816 + 180, 221, 16776960, 0);
							var16 = var15 + 15;
							var2.method1045(field2824, 180 + field2816, 236, 16776960, 0);
							var16 += 15;
							var2.method1045(field2839, field2816 + 180, 251, 16776960, 0);
							var16 += 15;
							var16 += 14;
							var0.method1037(class513.field4001, 180 + field2816 - 145, 280, 16777215, 0);
							var5 = true;
							if (class109.field693.method439()) {
								var9 = field2842;
								var8 = class385.method1809('*', var9.length());
								var7 = var8;
							} else {
								var7 = field2842;
							}

							for (var7 = var7; var0.method1033(var7) > 174; var7 = var7.substring(1)) {
							}

							var0.method1037(class229.method1036(var7) + (Client.field1846 % 40 < 20 ? class274.method1266(16776960) + class274.field1820 : ""), 180 + field2816 - 34, 280, 16777215, 0);
							var16 += 15;
							var20 = field2816 + 180 - 80;
							var22 = true;
							class241.field1619.method1065(var20 - 73, 301);
							var0.method1045(class513.field4002, var20, 326, 16777215, 0);
							var20 = field2816 + 180 + 80;
							class241.field1619.method1065(var20 - 73, 301);
							var0.method1045(class513.field4003, var20, 326, 16777215, 0);
							var22 = true;
							var1.method1045(class513.field4005, class469.field3303, 356, 268435455, 0);
						} else if (field2825 == 6) {
							var15 = 201;
							var0.method1045(field2813, field2816 + 180, 201, 16776960, 0);
							var16 = var15 + 15;
							var0.method1045(field2824, field2816 + 180, 216, 16776960, 0);
							var16 += 15;
							var0.method1045(field2839, 180 + field2816, 231, 16776960, 0);
							var16 += 15;
							var17 = 180 + field2816;
							var6 = true;
							class241.field1619.method1065(var17 - 73, 301);
							var0.method1045(class513.field4003, var17, 326, 16777215, 0);
						} else if (field2825 == 7) {
							if (class33.field173 && !Client.field2086) {
								var15 = 201;
								var0.method1045(field2813, class469.field3303, 201, 16776960, 0);
								var16 = var15 + 15;
								var0.method1045(field2824, class469.field3303, 216, 16776960, 0);
								var16 += 15;
								var0.method1045(field2839, class469.field3303, 231, 16776960, 0);
								var17 = class469.field3303 - 150;
								var16 += 10;

								int var19;
								for (var19 = 0; var19 < 8; ++var19) {
									class241.field1619.method1070(var17, 241, 30, 40);
									var26 = var19 == field2828 & Client.field1846 % 40 < 20;
									var0.method1037((field2829[var19] == null ? "" : field2829[var19]) + (var26 ? class274.method1266(16776960) + class274.field1820 : ""), var17 + 10, 268, 16777215, 0);
									if (var19 != 1 && var19 != 3) {
										var17 += 35;
									} else {
										var17 += 50;
										var0.method1037(class229.method1036("/"), var17 - 13, 268, 16777215, 0);
									}
								}

								var19 = class469.field3303 - 80;
								var26 = true;
								class241.field1619.method1065(var19 - 73, 301);
								var0.method1045("Submit", var19, 326, 16777215, 0);
								var19 = 80 + class469.field3303;
								class241.field1619.method1065(var19 - 73, 301);
								var0.method1045(class513.field3992, var19, 326, 16777215, 0);
							} else {
								var15 = 216;
								var0.method1045(class513.field4031, field2816 + 180, 216, 16776960, 0);
								var16 = var15 + 15;
								var2.method1045(class513.field4032, 180 + field2816, 231, 16776960, 0);
								var16 += 15;
								var2.method1045(class513.field4033, 180 + field2816, 246, 16776960, 0);
								var16 += 15;
								var17 = field2816 + 180 - 80;
								var6 = true;
								class241.field1619.method1065(var17 - 73, 301);
								var0.method1045(class513.field4034, var17, 326, 16777215, 0);
								var17 = field2816 + 180 + 80;
								class241.field1619.method1065(var17 - 73, 301);
								var0.method1045(class513.field4003, var17, 326, 16777215, 0);
							}
						} else if (field2825 == 8) {
							var15 = 216;
							var0.method1045(class513.field3871, field2816 + 180, 216, 16776960, 0);
							var16 = var15 + 15;
							var2.method1045(class513.field3889, field2816 + 180, 231, 16776960, 0);
							var16 += 15;
							var2.method1045(class513.field4028, field2816 + 180, 246, 16776960, 0);
							var16 += 15;
							var17 = 180 + field2816 - 80;
							var6 = true;
							class241.field1619.method1065(var17 - 73, 301);
							var0.method1045(class513.field3891, var17, 326, 16777215, 0);
							var17 = 80 + 180 + field2816;
							class241.field1619.method1065(var17 - 73, 301);
							var0.method1045(class513.field4003, var17, 326, 16777215, 0);
						} else if (field2825 == 9) {
							var15 = 221;
							var0.method1045(field2813, field2816 + 180, 221, 16776960, 0);
							var16 = var15 + 25;
							var0.method1045(field2824, 180 + field2816, 246, 16776960, 0);
							var16 += 25;
							var0.method1045(field2839, 180 + field2816, 271, 16776960, 0);
							var17 = 180 + field2816;
							var6 = true;
							class241.field1619.method1065(var17 - 73, 291);
							var0.method1045(class513.field3998, var17, 316, 16777215, 0);
						} else {
							short var24;
							if (field2825 == 10) {
								var16 = field2816 + 180;
								var24 = 209;
								var0.method1045(class513.field3988, field2816 + 180, 209, 16776960, 0);
								var17 = var24 + 20;
								field2812.method1065(var16 - 109, 229);
								if (field2811.isEmpty()) {
									class411.field2846.method1065(var16 - 48, 247);
								} else {
									class411.field2846.method1065(var16 - 48, 234);
									var0.method1045(field2811, var16, 282, 16776960, 0);
								}
							} else if (field2825 == 12) {
								var16 = class469.field3303;
								var24 = 216;
								var2.method1045(class513.field4038, var16, 216, 16777215, 0);
								var17 = var24 + 17;
								var2.method1045(class513.field4039, var16, 233, 16777215, 0);
								var17 += 17;
								var2.method1045(class513.field4040, var16, 250, 16777215, 0);
								var17 += 17;
								var2.method1045(class513.field4041, var16, 267, 16777215, 0);
								var16 = class469.field3303 - 80;
								var5 = true;
								class241.field1619.method1065(var16 - 73, 291);
								var0.method1045(class513.field3951, var16, 316, 16777215, 0);
								var16 = class469.field3303 + 80;
								class241.field1619.method1065(var16 - 73, 291);
								var0.method1045(class513.field4045, var16, 316, 16777215, 0);
							} else if (field2825 == 13) {
								var15 = 231;
								var2.method1045(class513.field4042, field2816 + 180, 231, 16777215, 0);
								var16 = var15 + 20;
								var2.method1045(class513.field3995, 180 + field2816, 251, 16777215, 0);
								var17 = 180 + field2816;
								var4 = true;
								class241.field1619.method1065(var17 - 73, 291);
								var0.method1045(class513.field4003, var17, 316, 16777215, 0);
							} else if (field2825 == 14) {
								var15 = 201;
								String var29 = "";
								var18 = "";
								var7 = "";
								switch(field2819) {
								case 0:
									var29 = class513.field3908;
									var18 = class513.field3782;
									var7 = class513.field3806;
									break;
								case 1:
									var29 = class513.field3843;
									var18 = class513.field3989;
									var7 = class513.field3845;
									break;
								case 2:
									var29 = class513.field3844;
									var18 = class513.field3880;
									var7 = class513.field3802;
									break;
								default:
									method1898(false);
								}

								var0.method1045(var29, 180 + field2816, 201, 16776960, 0);
								var16 = var15 + 20;
								var0.method1045(var18, field2816 + 180, 221, 16776960, 0);
								var16 += 20;
								var0.method1045(var7, 180 + field2816, 241, 16776960, 0);
								var20 = field2816 + 180;
								var22 = true;
								class241.field1619.method1065(var20 - 73, 256);
								if (field2819 == 1) {
									var0.method1045(class513.field3788, var20, 281, 16777215, 0);
								} else {
									var0.method1045(class513.field3787, var20, 281, 16777215, 0);
								}

								var20 = field2816 + 180;
								var22 = true;
								class241.field1619.method1065(var20 - 73, 306);
								var0.method1045(class513.field4003, var20, 331, 16777215, 0);
							} else if (field2825 == 24) {
								var15 = 221;
								var0.method1045(field2813, 180 + field2816, 221, 16777215, 0);
								var16 = var15 + 15;
								var0.method1045(field2824, 180 + field2816, 236, 16777215, 0);
								var16 += 15;
								var0.method1045(field2839, field2816 + 180, 251, 16777215, 0);
								var16 += 15;
								var17 = 180 + field2816;
								var6 = true;
								class241.field1619.method1065(var17 - 73, 281);
								var0.method1045(class513.field3753, var17, 306, 16777215, 0);
							} else if (field2825 == 32) {
								var15 = 216;
								var0.method1045(class513.field4031, field2816 + 180, 216, 16776960, 0);
								var16 = var15 + 15;
								var2.method1045(class513.field4032, field2816 + 180, 231, 16776960, 0);
								var16 += 15;
								var2.method1045(class513.field4033, 180 + field2816, 246, 16776960, 0);
								var16 += 15;
								var17 = field2816 + 180 - 80;
								var6 = true;
								class241.field1619.method1065(var17 - 73, 301);
								var0.method1045(class513.field4034, var17, 326, 16777215, 0);
								var17 = 80 + 180 + field2816;
								class241.field1619.method1065(var17 - 73, 301);
								var0.method1045(class513.field4003, var17, 326, 16777215, 0);
							} else if (field2825 == 33) {
								var15 = 201;
								var0.method1045(field2813, field2816 + 180, 201, 16776960, 0);
								var16 = var15 + 20;
								var1.method1045(field2824, field2816 + 180, 221, 16776960, 0);
								var16 += 20;
								var1.method1045(field2839, 180 + field2816, 241, 16776960, 0);
								var16 += 15;
								var17 = field2816 + 180;
								var6 = true;
								class241.field1619.method1065(var17 - 73, 256);
								var2.method1045(class513.field4057, var17, 281, 16777215, 0);
								var17 = 180 + field2816;
								var6 = true;
								class241.field1619.method1065(var17 - 73, 306);
								var2.method1045(class513.field4003, var17, 331, 16777215, 0);
							}
						}
					}
				}
			}

			if (Client.field1843 >= 10) {
				int[] var30 = new int[4];
				class433.method1960(var30);
				class433.method1958(field2810, 0, field2810 + 765, class92.field595);
				class168.field1183.method344(field2810 - 22, Client.field1846);
				class168.field1183.method344(field2810 + 765 + 22 - 128, Client.field1846);
				class433.method1961(var30);
			}

			field2815[class109.field693.method438() ? 1 : 0].method1065(field2810 + 765 - 40, 463);
			if (Client.field1843 > 5 && class66.field419 == class13.field75) {
				if (null != class417.field2850) {
					var16 = 5 + field2810;
					var5 = true;
					var6 = true;
					var26 = true;
					class417.field2850.method1065(var16, 463);
					var0.method1045(class513.field3928 + " " + Client.field1832, 50 + var16, 478, 16777215, 0);
					if (null != class109.field691) {
						var1.method1045(class513.field3790, var16 + 50, 492, 16777215, 0);
					} else {
						var1.method1045(class513.field4021, 50 + var16, 492, 16777215, 0);
					}
				} else {
					class417.field2850 = class61.method260(class514.field4064, "sl_button", "");
				}
			}

		}
	}

	static void method1891(String var0, String var1, String var2) {
		field2813 = var0;
		field2824 = var1;
		field2839 = var2;
	}

	static void method1895(class282 var0, class282 var1) {
		if (class250.field1719 == null) {
			class250.field1719 = class168.method886(class514.field4064, "sl_back", "");
		}

		if (null == class145.field1016) {
			class145.field1016 = class35.method104(class514.field4064, "sl_flags", "");
		}

		if (null == class442.field2970) {
			class442.field2970 = class35.method104(class514.field4064, "sl_arrows", "");
		}

		if (null == class430.field2886) {
			class430.field2886 = class35.method104(class514.field4064, "sl_stars", "");
		}

		if (class205.field1372 == null) {
			class205.field1372 = class61.method260(class514.field4064, "leftarrow", "");
		}

		if (class265.field1782 == null) {
			class265.field1782 = class61.method260(class514.field4064, "rightarrow", "");
		}

		class433.method1977(field2810, 23, 765, 480, 0);
		class433.method1979(field2810, 0, 125, 23, 12425273, 9135624);
		class433.method1979(field2810 + 125, 0, 640, 23, 5197647, 2697513);
		var0.method1045(class513.field4046, field2810 + 62, 15, 0, -1);
		if (null != class430.field2886) {
			class430.field2886[1].method1065(140 + field2810, 1);
			var1.method1037(class513.field3760, field2810 + 152, 10, 16777215, -1);
			class430.field2886[0].method1065(140 + field2810, 12);
			var1.method1037(class513.field4048, field2810 + 152, 21, 16777215, -1);
		}

		int var5;
		int var6;
		if (class442.field2970 != null) {
			int var3 = 280 + field2810;
			if (class426.field2872[0] == 0 && class426.field2868[0] == 0) {
				class442.field2970[2].method1065(var3, 4);
			} else {
				class442.field2970[0].method1065(var3, 4);
			}

			if (class426.field2872[0] == 0 && class426.field2868[0] == 1) {
				class442.field2970[3].method1065(var3 + 15, 4);
			} else {
				class442.field2970[1].method1065(var3 + 15, 4);
			}

			var0.method1037(class513.field3885, var3 + 32, 17, 16777215, -1);
			int var4 = field2810 + 390;
			if (class426.field2872[0] == 1 && class426.field2868[0] == 0) {
				class442.field2970[2].method1065(var4, 4);
			} else {
				class442.field2970[0].method1065(var4, 4);
			}

			if (class426.field2872[0] == 1 && class426.field2868[0] == 1) {
				class442.field2970[3].method1065(var4 + 15, 4);
			} else {
				class442.field2970[1].method1065(var4 + 15, 4);
			}

			var0.method1037(class513.field4050, var4 + 32, 17, 16777215, -1);
			var5 = 500 + field2810;
			if (class426.field2872[0] == 2 && class426.field2868[0] == 0) {
				class442.field2970[2].method1065(var5, 4);
			} else {
				class442.field2970[0].method1065(var5, 4);
			}

			if (class426.field2872[0] == 2 && class426.field2868[0] == 1) {
				class442.field2970[3].method1065(var5 + 15, 4);
			} else {
				class442.field2970[1].method1065(var5 + 15, 4);
			}

			var0.method1037(class513.field4051, var5 + 32, 17, 16777215, -1);
			var6 = field2810 + 610;
			if (class426.field2872[0] == 3 && class426.field2868[0] == 0) {
				class442.field2970[2].method1065(var6, 4);
			} else {
				class442.field2970[0].method1065(var6, 4);
			}

			if (class426.field2872[0] == 3 && class426.field2868[0] == 1) {
				class442.field2970[3].method1065(var6 + 15, 4);
			} else {
				class442.field2970[1].method1065(var6 + 15, 4);
			}

			var0.method1037(class513.field4052, var6 + 32, 17, 16777215, -1);
		}

		class433.method1977(708 + field2810, 4, 50, 16, 0);
		var1.method1045(class513.field3992, 25 + field2810 + 708, 16, 16777215, -1);
		field2838 = -1;
		if (null != class250.field1719) {
			boolean var23 = true;
			boolean var24 = true;
			var5 = 7;
			var6 = 24;

			int var7;
			int var8;
			do {
				var7 = var6;
				var8 = var5;
				if ((var5 - 1) * var6 >= class426.field2866) {
					--var5;
				}

				if ((var6 - 1) * var5 >= class426.field2866) {
					--var6;
				}

				if (var5 * (var6 - 1) >= class426.field2866) {
					--var6;
				}
			} while(var7 != var6 || var8 != var5);

			var7 = (765 - 88 * var5) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			var8 = (480 - var6 * 19) / (var6 + 1);
			if (var8 > 5) {
				var8 = 5;
			}

			int var9 = (765 - 88 * var5 - var7 * (var5 - 1)) / 2;
			int var10 = (480 - 19 * var6 - (var6 - 1) * var8) / 2;
			int var11 = (var6 + class426.field2866 - 1) / var6;
			field2840 = var11 - var5;
			if (null != class205.field1372 && field2845 > 0) {
				class205.field1372.method1065(8, class92.field595 / 2 - class205.field1372.field1501 / 2);
			}

			if (class265.field1782 != null && field2845 < field2840) {
				class265.field1782.method1065(class164.field1170 - class265.field1782.field1503 - 8, class92.field595 / 2 - class265.field1782.field1501 / 2);
			}

			int var12 = var10 + 23;
			int var13 = field2810 + var9;
			int var14 = 0;
			boolean var15 = false;
			int var16 = field2845;

			int var17;
			for (var17 = var6 * var16; var17 < class426.field2866 && var16 - field2845 < var5; ++var17) {
				class426 var18 = class233.field1534[var17];
				boolean var19 = true;
				String var20 = Integer.toString(var18.field2875);
				if (var18.field2875 == -1) {
					var20 = class513.field4053;
					var19 = false;
				} else if (var18.field2875 > 1980) {
					var20 = class513.field4054;
					var19 = false;
				}

				class364 var21 = null;
				int var22 = 0;
				if (var18.method1927()) {
					var21 = var18.method1928() ? class364.field2518 : class364.field2517;
				} else if (var18.method1929()) {
					var21 = var18.method1928() ? class364.field2514 : class364.field2527;
				} else if (var18.method1932()) {
					var22 = 16711680;
					var21 = var18.method1928() ? class364.field2511 : class364.field2512;
				} else if (var18.method1933()) {
					var21 = var18.method1928() ? class364.field2515 : class364.field2519;
				} else if (var18.method1936()) {
					var21 = var18.method1928() ? class364.field2526 : class364.field2513;
				} else if (var18.method1934()) {
					var21 = var18.method1928() ? class364.field2521 : class364.field2520;
				} else if (var18.method1935()) {
					var21 = var18.method1928() ? class364.field2523 : class364.field2522;
				}

				if (var21 == null || var21.field2516 >= class250.field1719.length) {
					var21 = var18.method1928() ? class364.field2525 : class364.field2524;
				}

				if (class316.field2309 >= var13 && class316.field2315 >= var12 && class316.field2309 < var13 + 88 && class316.field2315 < var12 + 19 && var19) {
					field2838 = var17;
					class250.field1719[var21.field2516].method163(var13, var12, 128, 16777215);
					var15 = true;
				} else {
					class250.field1719[var21.field2516].method157(var13, var12);
				}

				if (null != class145.field1016) {
					class145.field1016[(var18.method1928() ? 8 : 0) + var18.field2874].method1065(var13 + 29, var12);
				}

				var0.method1045(Integer.toString(var18.field2870), var13 + 15, var12 + 9 + 5, var22, -1);
				var1.method1045(var20, var13 + 60, var12 + 9 + 5, 268435455, -1);
				var12 += 19 + var8;
				++var14;
				if (var14 >= var6) {
					var12 = var10 + 23;
					var13 += 88 + var7;
					var14 = 0;
					++var16;
				}
			}

			if (var15) {
				var17 = var1.method1033(class233.field1534[field2838].field2873) + 6;
				int var25 = var1.field1483 + 8;
				int var26 = 25 + class316.field2315;
				if (var26 + var25 > 480) {
					var26 = class316.field2315 - 25 - var25;
				}

				class433.method1977(class316.field2309 - var17 / 2, var26, var17, var25, 16777120);
				class433.method1978(class316.field2309 - var17 / 2, var26, var17, var25, 0);
				var1.method1045(class233.field1534[field2838].field2873, class316.field2309, var26 + var1.field1483 + 4, 0, -1);
			}
		}

	}

	static void method1894(class426 var0) {
		if (var0.method1928() != Client.field1835) {
			Client.field1835 = var0.method1928();
			class158.method859(var0.method1928());
		}

		if (Client.field1833 != var0.field2869) {
			class114.method525(class514.field4064, var0.field2869);
		}

		class316.field2317 = var0.field2865;
		Client.field1832 = var0.field2870;
		Client.field1833 = var0.field2869;
		class233.field1535 = var0.field2871;
		class397.field2719 = Client.field1842 == 0 ? 43594 : 40000 + var0.field2870;
		class367.field2542 = Client.field1842 == 0 ? 443 : var0.field2870 + 50000;
		class290.field2175 = class397.field2719;
	}

	static void method1884(int var0) {
		method1883(14);
		field2819 = var0;
	}

	static void method1893() {
		method1883(24);
		method1891(class513.field4013, class513.field3980, class513.field3981);
	}

	static void method1883(int var0) {
		if (field2825 != var0) {
			field2825 = var0;
		}
	}
}
