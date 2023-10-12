public class class275 {
	byte[] field1829;
	int field1827;
	int field1828;

	class275() {
		this.field1829 = null;
		this.field1828 = 0;
		this.field1827 = 0;
	}

	int method1268(int var1) {
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var1 >= 8 - this.field1827; var1 -= var5) {
			var5 = 8 - this.field1827;
			int var6 = (1 << var5) - 1;
			var3 += (this.field1829[this.field1828] >> this.field1827 & var6) << var4;
			this.field1827 = 0;
			++this.field1828;
			var4 += var5;
		}

		if (var1 > 0) {
			var5 = (1 << var1) - 1;
			var3 += (this.field1829[this.field1828] >> this.field1827 & var5) << var4;
			this.field1827 += var1;
		}

		return var3;
	}

	int method1269() {
		int var2 = this.field1829[this.field1828] >> this.field1827 & 1;
		++this.field1827;
		this.field1828 += this.field1827 >> 3;
		this.field1827 &= 7;
		return var2;
	}

	void method1270(byte[] var1, int var2) {
		this.field1829 = var1;
		this.field1828 = 0;
		this.field1827 = 0;
	}
}
