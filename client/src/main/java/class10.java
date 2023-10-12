public class class10 implements class501 {
	static class32 field49;
	static final class10 field44;
	static final class10 field45;
	static final class10 field46;
	static final class10 field47;
	static final class10 field50;
	static final class10 field51;
	final int field42;
	final int field43;
	final int field48;

	static {
		field51 = new class10(0, 0, (String)null, 0);
		field50 = new class10(1, 1, (String)null, 9);
		field44 = new class10(2, 2, (String)null, 3);
		field45 = new class10(3, 3, (String)null, 6);
		field46 = new class10(4, 4, (String)null, 1);
		field47 = new class10(5, 5, (String)null, 3);
	}

	class10(int var1, int var2, String var3, int var4) {
		this.field48 = var1;
		this.field43 = var2;
		this.field42 = var4;
	}

	int method46() {
		return this.field42;
	}

	@Override
	public int getId() {
		return this.field43;
	}

	static class10 method48(int var0) {
		class10[] var2 = new class10[]{field51, field50, field44, field45, field46, field47};
		class10 var3 = (class10)class26.method87(var2, var0);
		if (var3 == null) {
			var3 = field51;
		}

		return var3;
	}
}
