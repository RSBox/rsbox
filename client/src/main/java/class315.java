public class class315 implements class1 {
	static class5 field2299;
	static int[] field2300;
	static long field2298;

	static final void method1571(int var0, int var1) {
		if (Client.field1979 >= 2 || Client.field1892 != 0 || Client.field1997) {
			if (Client.field2027) {
				int var3 = Client.method1345();
				String var4;
				if (Client.field1892 == 1 && Client.field1979 < 2) {
					var4 = class513.field3913 + class513.field3914 + Client.field2084 + " " + class274.field1823;
				} else if (Client.field1997 && Client.field1979 < 2) {
					var4 = Client.field2063 + class513.field3914 + Client.field2001 + " " + class274.field1823;
				} else {
					var4 = Client.method1381(var3);
				}

				if (Client.field1979 > 2) {
					var4 = var4 + class274.method1266(16777215) + " " + '/' + " " + (Client.field1979 - 2) + class513.field4043;
				}

				class209.field1388.method1047(var4, var0 + 4, var1 + 15, 16777215, 0, Client.field1846 / 1000);
			}
		}
	}
}
