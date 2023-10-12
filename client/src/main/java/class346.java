import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class346 {
	static int field2426;
	static final class301 field2427;
	static final class530 field2424;
	static final Map field2425;

	static {
		field2425 = new HashMap();
		field2427 = new class301(1024);
		field2424 = new class530();
		field2426 = 0;
	}

	static void method1672(int var0, String var1, String var2) {
		method1668(var0, var1, var2, (String)null);
	}

	static void method1668(int var0, String var1, String var2, String var3) {
		class89 var5 = (class89)field2425.get(var0);
		if (var5 == null) {
			var5 = new class89();
			field2425.put(var0, var5);
		}

		class56 var6 = var5.method414(var0, var1, var2, var3);
		field2427.method1534(var6, (long)var6.field260);
		field2424.method2542(var6);
		Client.field2034 = Client.field1977;
	}

	static class56 method1666(int var0, int var1) {
		class89 var3 = (class89)field2425.get(var0);
		return var3.method415(var1);
	}

	static class56 method1670(int var0) {
		return (class56)field2427.method1533((long)var0);
	}

	static int method1671(int var0) {
		class89 var2 = (class89)field2425.get(var0);
		return var2 == null ? 0 : var2.method416();
	}

	static int method1667(int var0) {
		class56 var2 = (class56)field2427.method1533((long)var0);
		if (null == var2) {
			return -1;
		} else {
			return field2424.field4142 == var2.field2178 ? -1 : ((class56)var2.field2178).field260;
		}
	}

	static String method1669() {
		StringBuilder var1 = new StringBuilder();

		class56 var3;
		for (Iterator var2 = field2427.iterator(); var2.hasNext(); var1.append(var3.field262).append('\n')) {
			var3 = (class56)var2.next();
			if (var3.field256 != null && !var3.field256.isEmpty()) {
				var1.append(var3.field256).append(':');
			}
		}

		return var1.toString();
	}
}
