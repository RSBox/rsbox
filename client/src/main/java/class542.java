public class class542 {
	int field4230;
	final class198 field4231;
	final int field4232;

	class542(class198 var1, String var2) {
		this.field4230 = 0;
		this.field4231 = var1;
		this.field4232 = var1.method24();
	}

	boolean method2619() {
		this.field4230 = 0;

		for (int var2 = 0; var2 < this.field4232; ++var2) {
			if (!this.field4231.method961(var2) || this.field4231.method960(var2)) {
				++this.field4230;
			}
		}

		return this.field4230 >= this.field4232;
	}
}
