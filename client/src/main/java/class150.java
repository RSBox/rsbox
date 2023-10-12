import java.util.ArrayList;
import java.util.HashMap;

public class class150 {
	public static int[] field1037;
	public static ArrayList field1033;
	static byte[][] field1034;
	static byte[][] field1041;
	static byte[][] field1043;
	static byte[][] field1044;
	static int field1035;
	static int field1036;
	static int field1038;
	static int field1039;
	static int field1040;
	static int field1042;
	static int field1045;
	static int field1046;

	static {
		field1038 = 0;
		field1046 = 0;
		field1036 = 0;
		field1035 = 0;
		field1045 = 1000;
		field1039 = 250;
		field1040 = 100;
		field1042 = 50;
		field1041 = new byte[1000][];
		field1034 = new byte[250][];
		field1043 = new byte[100][];
		field1044 = new byte[50][];
		field1033 = new ArrayList();
		field1033.clear();
		field1033.add(100);
		field1033.add(5000);
		field1033.add(10000);
		field1033.add(30000);
		new HashMap();
	}

	public static synchronized byte[] method798(int var0, boolean var1) {
		byte[] var5;
		if ((var0 == 100 || var0 < 100 && var1) && field1038 > 0) {
			var5 = field1041[--field1038];
			field1041[field1038] = null;
			return var5;
		} else if ((var0 == 5000 || var0 < 5000 && var1) && field1046 > 0) {
			var5 = field1034[--field1046];
			field1034[field1046] = null;
			return var5;
		} else if ((var0 == 10000 || var0 < 10000 && var1) && field1036 > 0) {
			var5 = field1043[--field1036];
			field1043[field1036] = null;
			return var5;
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field1035 > 0) {
			var5 = field1044[--field1035];
			field1044[field1035] = null;
			return var5;
		} else {
			int var3;
			if (class263.field1760 != null) {
				for (var3 = 0; var3 < field1037.length; ++var3) {
					if ((field1037[var3] == var0 || var0 < field1037[var3] && var1) && class288.field2173[var3] > 0) {
						byte[] var4 = class263.field1760[var3][--class288.field2173[var3]];
						class263.field1760[var3][class288.field2173[var3]] = null;
						return var4;
					}
				}
			}

			if (var1 && field1037 != null) {
				for (var3 = 0; var3 < field1037.length; ++var3) {
					if (var0 <= field1037[var3] && class288.field2173[var3] < class263.field1760[var3].length) {
						return new byte[field1037[var3]];
					}
				}
			}

			return new byte[var0];
		}
	}

	public static synchronized byte[] alloc(int var0) {
		return method798(var0, false);
	}

	public static synchronized void method799(byte[] var0) {
		if (var0.length == 100 && field1038 < field1045) {
			field1041[++field1038 - 1] = var0;
		} else if (var0.length == 5000 && field1046 < field1039) {
			field1034[++field1046 - 1] = var0;
		} else if (var0.length == 10000 && field1036 < field1040) {
			field1043[++field1036 - 1] = var0;
		} else if (var0.length == 30000 && field1035 < field1042) {
			field1044[++field1035 - 1] = var0;
		} else {
			if (null != class263.field1760) {
				for (int var2 = 0; var2 < field1037.length; ++var2) {
					if (var0.length == field1037[var2] && class288.field2173[var2] < class263.field1760[var2].length) {
						class263.field1760[var2][class288.field2173[var2]++] = var0;
						return;
					}
				}
			}

		}
	}
}
