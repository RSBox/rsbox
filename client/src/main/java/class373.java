public class class373 {
	int field2575;
	int field2576;
	int[] field2574;
	int[] field2577;

	class373() {
		class275 var1 = class191.field1308;
		var1.method1268(16);
		this.field2576 = var1.method1269() != 0 ? var1.method1268(4) + 1 : 1;
		if (var1.method1269() != 0) {
			var1.method1268(8);
		}

		var1.method1268(2);
		if (this.field2576 > 1) {
			this.field2575 = var1.method1268(4);
		}

		this.field2577 = new int[this.field2576];
		this.field2574 = new int[this.field2576];

		for (int var2 = 0; var2 < this.field2576; ++var2) {
			var1.method1268(8);
			this.field2577[var2] = var1.method1268(8);
			this.field2574[var2] = var1.method1268(8);
		}

	}
}
