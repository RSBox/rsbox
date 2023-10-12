public class class109 implements class501 {
	static class394 field691;
	static class98 field693;
	static final class109 field687;
	static final class109 field688;
	static final class109 field690;
	static final class109 field694;
	static final class109 field695;
	final int field689;
	final int field692;

	static {
		field694 = new class109(0, -1);
		field687 = new class109(1, 1);
		field688 = new class109(2, 7);
		field690 = new class109(3, 8);
		field695 = new class109(4, 9);
	}

	class109(int var1, int var2) {
		this.field689 = var1;
		this.field692 = var2;
	}

	@Override
	public int getId() {
		return this.field692;
	}

	static class109[] method505() {
		return new class109[]{field695, field688, field690, field687, field694};
	}

	public static class397 method504(int var0) {
		class397 var2 = (class397)class397.field2688.method1678((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class397.field2695.method39(6, var0);
			var2 = new class397();
			var2.field2693 = var0;
			if (var3 != null) {
				var2.method1837(new Buffer(var3));
			}

			var2.method1836();
			if (var2.field2725) {
				var2.field2703 = 0;
				var2.field2729 = false;
			}

			class397.field2688.method1680(var2, (long)var0);
			return var2;
		}
	}
}
