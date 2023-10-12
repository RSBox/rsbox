public class class244 implements class501 {
	static class247 field1632;
	static final class244 field1621;
	static final class244 field1622;
	static final class244 field1623;
	static final class244 field1624;
	static final class244 field1625;
	static final class244 field1626;
	static final class244 field1627;
	static final class244 field1628;
	static final class244 field1629;
	final int field1630;
	final int field1631;

	static {
		field1629 = new class244(0, 0);
		field1625 = new class244(1, 1);
		field1624 = new class244(2, 2);
		field1621 = new class244(3, 3);
		field1622 = new class244(4, 4);
		field1626 = new class244(5, 5);
		field1627 = new class244(6, 6);
		field1628 = new class244(7, 7);
		field1623 = new class244(8, 8);
	}

	class244(int var1, int var2) {
		this.field1630 = var1;
		this.field1631 = var2;
	}

	@Override
	public int getId() {
		return this.field1631;
	}

	static class244 method1128(int var0) {
		class244[] var2 = new class244[]{field1629, field1625, field1624, field1621, field1622, field1626, field1627, field1628, field1623};
		class244 var3 = (class244)class26.method87(var2, var0);
		if (var3 == null) {
			var3 = field1623;
		}

		return var3;
	}
}
