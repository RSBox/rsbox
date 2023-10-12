public class class181 extends class284 {
	int field1271;

	class181() {
	}

	int method928(class181 var1) {
		return this.field1271 - var1.field1271;
	}

	@Override
	public int method1492(class284 var1) {
		return this.method928((class181)var1);
	}

	@Override
	public int compareTo(Object var1) {
		return this.method928((class181)var1);
	}
}
