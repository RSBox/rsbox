import java.util.ArrayList;

public class class376 extends class359 {
	boolean field2585;
	class496 field2590;
	class496 field2595;
	int field2586;
	int field2587;
	int field2588;
	int field2589;
	int field2591;
	int field2592;
	int field2593;
	Object[] field2594;
	String field2584;

	public class376() {
		this.field2591 = 76;
	}

	public void method1758(Object[] var1) {
		this.field2594 = var1;
	}

	public void method1761(int var1) {
		this.field2591 = var1;
	}

	public void method1757(class496 var1) {
		this.field2595 = var1;
	}

	static int method1759(int var0, int var1) {
		class536 var3 = class406.method1866(var0);
		if (null == var3) {
			return var1;
		} else {
			int var4;
			int var5;
			boolean var6;
			int var8;
			if (var3.field4202 >= 0) {
				var4 = class337.method1652(var3.field4201, var3.field4195, var3.field4203);
				var6 = true;
				if (var4 == -2) {
					var5 = 12345678;
				} else if (var4 == -1) {
					var6 = true;
					var5 = 31;
				} else {
					var8 = (var4 & 127) * 96 / 128;
					if (var8 < 2) {
						var8 = 2;
					} else if (var8 > 126) {
						var8 = 126;
					}

					var5 = var8 + (var4 & 65408);
				}

				return class105.field672[var5] | -16777216;
			} else if (var3.field4198 >= 0) {
				var5 = class105.field668.field1730.method2620(var3.field4198);
				var6 = true;
				if (var5 == -2) {
					var4 = 12345678;
				} else if (var5 == -1) {
					var6 = true;
					var4 = 31;
				} else {
					var8 = (var5 & 127) * 96 / 128;
					if (var8 < 2) {
						var8 = 2;
					} else if (var8 > 126) {
						var8 = 126;
					}

					var4 = var8 + (var5 & 65408);
				}

				return class105.field672[var4] | -16777216;
			} else if (var3.field4194 == 16711935) {
				return var1;
			} else {
				var4 = class337.method1652(var3.field4199, var3.field4204, var3.field4200);
				var6 = true;
				if (var4 == -2) {
					var5 = 12345678;
				} else if (var4 == -1) {
					var6 = true;
					var5 = 31;
				} else {
					var8 = (var4 & 127) * 96 / 128;
					if (var8 < 2) {
						var8 = 2;
					} else if (var8 > 126) {
						var8 = 126;
					}

					var5 = var8 + (var4 & 65408);
				}

				return class105.field672[var5] | -16777216;
			}
		}
	}

	static void method1760(class5 var0, class5 var1, boolean var2, int var3) {
		if (class410.field2826) {
			if (var3 == 4) {
				class410.method1883(4);
			}

		} else {
			if (var3 == 0) {
				class33.method100(var2);
			} else {
				class410.method1883(var3);
			}

			class433.method1962();
			byte[] var5 = var0.method29("title.jpg", "");
			class67.field435 = class412.method1902(var5);
			class410.field2832 = class67.field435.method150();
			class114.method525(var1, Client.field1833);
			class410.field2823 = class61.method260(var1, "titlebox", "");
			class241.field1619 = class61.method260(var1, "titlebutton", "");
			class410.field2812 = class61.method260(var1, "titlebutton_large", "");
			class411.field2846 = class61.method260(var1, "play_now_text", "");
			class61.method260(var1, "titlebutton_wide42,1", "");
			class410.field2830 = class35.method104(var1, "runes", "");
			class410.field2815 = class35.method104(var1, "title_mute", "");
			class206.field1377 = class61.method260(var1, "options_radio_buttons,0", "");
			class484.field3399 = class61.method260(var1, "options_radio_buttons,4", "");
			class544.field4240 = class61.method260(var1, "options_radio_buttons,2", "");
			class398.field2746 = class61.method260(var1, "options_radio_buttons,6", "");
			class386.field2656 = class206.field1377.field1503;
			class136.field881 = class206.field1377.field1501;
			class168.field1183 = new class71(class410.field2830);
			if (var2) {
				class410.field2842 = "";
				class410.field2827 = "";
				class410.field2829 = new String[8];
				class410.field2828 = 0;
			}

			class98.field635 = 0;
			class333.field2361 = "";
			class410.field2833 = true;
			class410.field2836 = false;
			if (!class109.field693.method438()) {
				ArrayList var6 = new ArrayList();
				var6.add(new class407(class151.field1049, "scape main", "", 255, false));
				class14.method61(var6, 0, 0, 0, 100, false);
			} else {
				class483.method2223(0, 0);
			}

			class483.method2229();
			Client.method1312().method715(false);
			class410.field2826 = true;
			class410.field2810 = (class164.field1170 - 765) / 2;
			class410.field2816 = class410.field2810 + 202;
			class469.field3303 = class410.field2816 + 180;
			class67.field435.method157(class410.field2810, 0);
			class410.field2832.method157(382 + class410.field2810, 0);
			class410.field2814.method1065(class410.field2810 + 382 - class410.field2814.field1503 / 2, 18);
		}
	}
}
