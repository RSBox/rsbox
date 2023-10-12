public class class102 {
	public class370 field661;
	public class370 field662;
	public int field663;

	public class102(int var1, class370 var2, class370 var3) {
		this.field663 = var1;
		this.field661 = var2;
		this.field662 = var3;
	}

	static void method468(Player var0, int var1, int var2) {
		if (var1 == var0.field373 && var1 != -1) {
			int var4 = class116.method539(var1).field747;
			if (var4 == 1) {
				var0.field334 = 0;
				var0.field395 = 0;
				var0.field376 = var2;
				var0.field377 = 0;
			}

			if (var4 == 2) {
				var0.field377 = 0;
			}
		} else if (var1 == -1 || var0.field373 == -1 || class116.method539(var1).field741 >= class116.method539(var0.field373).field741) {
			var0.field373 = var1;
			var0.field334 = 0;
			var0.field395 = 0;
			var0.field376 = var2;
			var0.field377 = 0;
			var0.field403 = var0.field360;
		}

	}
}
