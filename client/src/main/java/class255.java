public class class255 {
	boolean field1731;
	int field1729;
	int field1732;
	int field1733;
	int field1734;
	int field1735;
	int field1736;
	int field1738;
	int field1739;
	int field1740;
	int[] field1737;
	public boolean field1728;
	public class543 field1730;
	public int field1727;

	class255() {
		this.field1731 = false;
		this.field1728 = true;
		this.field1729 = 0;
		this.field1727 = 512;
		this.field1737 = new int[1024];
	}

	void method1220() {
		this.field1738 = this.field1732 / 2;
		this.field1733 = this.field1735 / 2;
		this.field1736 = -this.field1738;
		this.field1740 = this.field1732 - this.field1738;
		this.field1734 = -this.field1733;
		this.field1739 = this.field1735 - this.field1733;
	}

	void method1219(int var1, int var2, int var3, int var4) {
		this.field1738 = var1 - var2;
		this.field1733 = var3 - var4;
		this.field1736 = -this.field1738;
		this.field1740 = this.field1732 - this.field1738;
		this.field1734 = -this.field1733;
		this.field1739 = this.field1735 - this.field1733;
	}

	void method1221(int var1, int var2, int var3) {
		this.field1731 = var1 < 0 || var1 > this.field1732 || var2 < 0 || var2 > this.field1732 || var3 < 0 || var3 > this.field1732;
	}
}
