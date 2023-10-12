public class class193 {
	static int field1326;

	static final String method946(int var0) {
		String var2 = Integer.toString(var0);

		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + class274.field1825 + var2.substring(var3);
		}

		if (var2.length() > 9) {
			return " " + class274.method1266(65408) + var2.substring(0, var2.length() - 8) + class513.field3924 + " " + class274.field1821 + var2 + class274.field1822 + class274.field1818;
		} else {
			return var2.length() > 6 ? " " + class274.method1266(16777215) + var2.substring(0, var2.length() - 4) + class513.field3926 + " " + class274.field1821 + var2 + class274.field1822 + class274.field1818 : " " + class274.method1266(16776960) + var2 + class274.field1818;
		}
	}
}
