public class class432 {
	static final class432 field2892;
	final int field2893;

	static {
		field2892 = new class432(3);
	}

	class432(int var1) {
		this.field2893 = var1;
	}

	public static class161 method1955(int var0, byte var1) {
		class161 var2 = (class161)class161.field1152.method1678((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class161.field1153.method39(33, var0);
			var2 = new class161();
			var2.field1154 = var0;
			if (null != var3) {
				var2.method874(new Buffer(var3));
			}

			class161.field1152.method1680(var2, (long)var0);
			return var2;
		}
	}

	static void method1954(int var0) {
		if (Client.field1843 != var0) {
			if (Client.field1843 == 30) {
				Client.field2068.method1735();
			}

			if (Client.field1843 == 0) {
				class190.field1287.method2575();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				Client.method1448(0);
				Client.field1868 = 0;
				Client.field2044 = 0;
				Client.field1899.method1742(var0);
				if (var0 != 20) {
					Client.method1350(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class228.field1475 != null) {
				class228.field1475.method406();
				class228.field1475 = null;
			}

			if (Client.field1843 == 25) {
				Client.field1859 = 0;
				Client.field1901 = 0;
				Client.field1902 = 1;
				Client.field1903 = 0;
				Client.field1904 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var4 = Client.field1843 == 11 ? 4 : 0;
					class376.method1760(class179.field1232, class514.field4064, false, var4);
				} else if (var0 == 11) {
					class376.method1760(class179.field1232, class514.field4064, false, 4);
				} else if (var0 == 50) {
					class410.method1891("", "Updating date of birth...", "");
					class376.method1760(class179.field1232, class514.field4064, false, 7);
				} else if (class410.field2826) {
					class410.field2823 = null;
					class241.field1619 = null;
					class410.field2830 = null;
					class67.field435 = null;
					class410.field2832 = null;
					class410.field2814 = null;
					class410.field2815 = null;
					class206.field1377 = null;
					class544.field4240 = null;
					class250.field1719 = null;
					class145.field1016 = null;
					class442.field2970 = null;
					class430.field2886 = null;
					class417.field2850 = null;
					class168.field1183.method336();
					class483.method2223(0, 100);
					Client.method1312().method715(true);
					class410.field2826 = false;
				}
			} else {
				boolean var2 = class109.field693.method459() >= Client.field2029;
				int var3 = var2 ? 0 : 12;
				class376.method1760(class179.field1232, class514.field4064, true, var3);
			}

			Client.field1843 = var0;
		}
	}
}
