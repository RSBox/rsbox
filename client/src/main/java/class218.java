public final class class218 extends class359 {
	static class69 field1421;
	class335 field1422;
	class335 field1425;
	class397 field1430;
	int field1416;
	int field1417;
	int field1418;
	int field1419;
	int field1420;
	int field1423;
	int field1424;
	int field1426;
	int field1428;
	int field1429;
	int[] field1427;

	static {
		field1421 = new class69();
	}

	class218() {
	}

	void method1004() {
		int var2 = this.field1429;
		class397 var3 = this.field1430.method1845();
		if (var3 != null) {
			this.field1429 = var3.field2706;
			this.field1417 = var3.field2731 * 128;
			this.field1424 = var3.field2734;
			this.field1426 = var3.field2733;
			this.field1427 = var3.field2704;
		} else {
			this.field1429 = -1;
			this.field1417 = 0;
			this.field1424 = 0;
			this.field1426 = 0;
			this.field1427 = null;
		}

		if (var2 != this.field1429 && null != this.field1422) {
			class244.field1632.method1131(this.field1422);
			this.field1422 = null;
		}

	}

	static void method1005() {
		for (class218 var1 = (class218)field1421.method327(); null != var1; var1 = (class218)field1421.method331()) {
			if (var1.field1422 != null) {
				class244.field1632.method1131(var1.field1422);
				var1.field1422 = null;
			}

			if (var1.field1425 != null) {
				class244.field1632.method1131(var1.field1425);
				var1.field1425 = null;
			}
		}

		field1421.method329();
	}

	static void method1007() {
		for (class218 var1 = (class218)field1421.method327(); var1 != null; var1 = (class218)field1421.method331()) {
			if (null != var1.field1430) {
				var1.method1004();
			}
		}

	}

	static void method1006(int var0, int var1, int var2, class397 var3, int var4) {
		class218 var6 = new class218();
		var6.field1416 = var0;
		var6.field1418 = var1 * 128;
		var6.field1419 = var2 * 128;
		int var7 = var3.field2701;
		int var8 = var3.field2702;
		if (var4 == 1 || var4 == 3) {
			var7 = var3.field2702;
			var8 = var3.field2701;
		}

		var6.field1420 = 128 * (var7 + var1);
		var6.field1423 = (var8 + var2) * 128;
		var6.field1429 = var3.field2706;
		var6.field1417 = var3.field2731 * 128;
		var6.field1424 = var3.field2734;
		var6.field1426 = var3.field2733;
		var6.field1427 = var3.field2704;
		if (var3.field2727 != null) {
			var6.field1430 = var3;
			var6.method1004();
		}

		field1421.method323(var6);
		if (var6.field1427 != null) {
			var6.field1428 = var6.field1424 + (int)(Math.random() * (double)(var6.field1426 - var6.field1424));
		}

	}
}
