import java.util.Comparator;

public class class77 implements Comparator {
	static class198 field541;
	static int field542;
	boolean field540;

	class77() {
	}

	int method370(class70 var1, class70 var2) {
		if (var1.field446 == var2.field446) {
			return 0;
		} else {
			if (this.field540) {
				if (Client.field1832 == var1.field446) {
					return -1;
				}

				if (Client.field1832 == var2.field446) {
					return 1;
				}
			}

			return var1.field446 < var2.field446 ? -1 : 1;
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method370((class70)var1, (class70)var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
