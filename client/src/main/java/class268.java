public class class268 extends class111 {
	boolean field1784;
	boolean field1785;

	class268() {
	}

	int method1253(class268 var1) {
		if (Client.field1832 == super.field704 && Client.field1832 != var1.field704) {
			return -1;
		} else if (Client.field1832 == var1.field704 && super.field704 != Client.field1832) {
			return 1;
		} else if (super.field704 != 0 && var1.field704 == 0) {
			return -1;
		} else if (var1.field704 != 0 && super.field704 == 0) {
			return 1;
		} else if (this.field1785 && !var1.field1785) {
			return -1;
		} else if (!this.field1785 && var1.field1785) {
			return 1;
		} else if (this.field1784 && !var1.field1784) {
			return -1;
		} else if (!this.field1784 && var1.field1784) {
			return 1;
		} else {
			return super.field704 != 0 ? super.field703 - var1.field703 : var1.field703 - super.field703;
		}
	}

	@Override
	public int method1492(class284 var1) {
		return this.method1253((class268)var1);
	}

	@Override
	public int compareTo(Object var1) {
		return this.method1253((class268)var1);
	}
}
