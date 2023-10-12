public class class395 extends class4 {
	int field2679;
	long field2678;

	public class395(class4 var1, int var2) {
		super(var1);
		this.field2679 = var2;
		super.field8 = "DelayFadeTask";
	}

	@Override
	public boolean method8() {
		if (this.field2678 < (long)this.field2679) {
			++this.field2678;
			return false;
		} else {
			return true;
		}
	}
}
