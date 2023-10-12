import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

public class class467 {
	static int field3301;
	static Applet field3300;
	static String field3299;

	static {
		field3300 = null;
		field3299 = "";
	}

	public static void method2171(Applet var0, String var1) {
		field3300 = var0;
		if (var1 != null) {
			field3299 = var1;
		}

	}

	public static void method2170(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (field3299.startsWith("win")) {
				method2172(var0, 0, "openjs");
			} else if (field3299.startsWith("mac")) {
				method2172(var0, 1, "openjs");
			} else {
				method2172(var0, 2, "openjs");
			}
		} else {
			method2172(var0, 3, "openjs");
		}

	}

	static boolean method2172(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!field3299.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var15 = 0; var15 < var0.length(); ++var15) {
						if (var14.indexOf(var0.charAt(var15)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var5 = field3300;
				Object[] var6 = new Object[]{(new URL(field3300.getCodeBase(), var0)).toString()};
				Object var13 = JSObject.getWindow(var5).call(var2, var6);
				return null != var13;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				field3300.getAppletContext().showDocument(new URL(field3300.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var4 = field3300;
				JSObject.getWindow(var4).call("loggedout", (Object[])null);
			} catch (Throwable var12) {
			}

			try {
				field3300.getAppletContext().showDocument(new URL(field3300.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	static int method2169(int var0, class83 var1, boolean var2, byte var3) {
		class496 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class208.interfaceConfigs.method345(class440.field2955[--class440.field2956]);
		} else {
			var4 = var2 ? class506.field3704 : class107.field682;
		}

		String var5 = class440.field2965[--class176.field1224];
		int[] var6 = null;
		if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
			int var7 = class440.field2955[--class440.field2956];
			if (var7 > 0) {
				for (var6 = new int[var7]; var7-- > 0; var6[var7] = class440.field2955[--class440.field2956]) {
				}
			}

			var5 = var5.substring(0, var5.length() - 1);
		}

		Object[] var10 = new Object[var5.length() + 1];

		int var8;
		for (var8 = var10.length - 1; var8 >= 1; --var8) {
			if (var5.charAt(var8 - 1) == 's') {
				var10[var8] = class440.field2965[--class176.field1224];
			} else {
				var10[var8] = new Integer(class440.field2955[--class440.field2956]);
			}
		}

		var8 = class440.field2955[--class440.field2956];
		if (var8 != -1) {
			var10[0] = new Integer(var8);
		} else {
			var10 = null;
		}

		if (var0 == 1400) {
			var4.field3628 = var10;
		} else if (var0 == 1401) {
			var4.field3616 = var10;
		} else if (var0 == 1402) {
			var4.field3615 = var10;
		} else if (var0 == 1403) {
			var4.field3572 = var10;
		} else if (var0 == 1404) {
			var4.field3619 = var10;
		} else if (var0 == 1405) {
			var4.field3620 = var10;
		} else if (var0 == 1406) {
			var4.field3623 = var10;
		} else if (var0 == 1407) {
			var4.field3624 = var10;
			var4.field3625 = var6;
		} else if (var0 == 1408) {
			var4.field3630 = var10;
		} else if (var0 == 1409) {
			var4.field3631 = var10;
		} else if (var0 == 1410) {
			var4.field3558 = var10;
		} else if (var0 == 1411) {
			var4.field3614 = var10;
		} else if (var0 == 1412) {
			var4.field3613 = var10;
		} else if (var0 == 1414) {
			var4.field3569 = var10;
			var4.field3627 = var6;
		} else if (var0 == 1415) {
			var4.field3600 = var10;
			var4.field3629 = var6;
		} else if (var0 == 1416) {
			var4.field3589 = var10;
		} else if (var0 == 1417) {
			var4.field3548 = var10;
		} else if (var0 == 1418) {
			var4.field3634 = var10;
		} else if (var0 == 1419) {
			var4.field3635 = var10;
		} else if (var0 == 1420) {
			var4.field3669 = var10;
		} else if (var0 == 1421) {
			var4.field3638 = var10;
		} else if (var0 == 1422) {
			var4.field3641 = var10;
		} else if (var0 == 1423) {
			var4.field3642 = var10;
		} else if (var0 == 1424) {
			var4.field3565 = var10;
		} else if (var0 == 1425) {
			var4.field3644 = var10;
		} else if (var0 == 1426) {
			var4.field3557 = var10;
		} else if (var0 == 1427) {
			var4.field3643 = var10;
		} else if (var0 == 1428) {
			var4.field3639 = var10;
		} else if (var0 == 1429) {
			var4.field3640 = var10;
		} else if (var0 == 1430) {
			var4.field3636 = var10;
		} else if (var0 == 1431) {
			var4.field3637 = var10;
		} else if (var0 == 1434) {
			var4.field3646 = var10;
		} else if (var0 == 1435) {
			var4.field3632 = var10;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class100 var9 = var4.method2325();
			if (var9 != null) {
				if (var0 == 1436) {
					var9.field654 = var10;
				} else if (var0 == 1437) {
					var9.field655 = var10;
				} else if (var0 == 1438) {
					var9.field656 = var10;
				} else if (var0 == 1439) {
					var9.field653 = var10;
				}
			}
		}

		var4.field3587 = true;
		return 1;
	}
}
