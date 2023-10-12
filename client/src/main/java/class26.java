import java.util.HashMap;

public class class26 {
	static {
		new HashMap();
	}

	public static class501 method87(class501[] var0, int var1) {
		class501[] var3 = var0;

		for (int i = 0; i < var3.length; ++i) {
			class501 var5 = var3[i];
			if (var1 == var5.getId()) {
				return var5;
			}
		}

		return null;
	}
}
