public class class499 implements class501 {
	public static final class499 field3674;
	public static final class499 field3675;
	public static final class499 field3676;
	public final class350 field3680;
	public final int field3677;
	public final int field3678;
	public final Class field3679;

	static {
		field3676 = new class499(2, 0, Integer.class, new class547());
		field3675 = new class499(1, 1, Long.class, new class537());
		field3674 = new class499(0, 2, String.class, new class17());
	}

	class499(int var1, int var2, Class var3, class350 var4) {
		this.field3677 = var1;
		this.field3678 = var2;
		this.field3679 = var3;
		this.field3680 = var4;
	}

	@Override
	public int getId() {
		return this.field3678;
	}

	public Object method2360(Buffer var1) {
		return this.field3680.method1676(var1);
	}

	public static class499[] method2361() {
		return new class499[]{field3674, field3676, field3675};
	}

	public static class499 method2358(Class var0) {
		class499[] var2 = method2361();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class499 var4 = var2[var3];
			if (var0 == var4.field3679) {
				return var4;
			}
		}

		return null;
	}
}
