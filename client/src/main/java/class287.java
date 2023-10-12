import java.util.Iterator;

public class class287 implements Iterator {
	class301 field2168;
	class359 field2165;
	class359 field2167;
	int field2166;

	public class287(class301 var1) {
		this.field2167 = null;
		this.field2168 = var1;
		this.method1512();
	}

	void method1512() {
		this.field2165 = this.field2168.field2208[0].field2471;
		this.field2166 = 1;
		this.field2167 = null;
	}

	public class359 method1513() {
		this.method1512();
		return (class359)this.next();
	}

	@Override
	public Object next() {
		class359 var1;
		if (this.field2165 != this.field2168.field2208[this.field2166 - 1]) {
			var1 = this.field2165;
			this.field2165 = var1.field2471;
			this.field2167 = var1;
			return var1;
		} else {
			do {
				if (this.field2166 >= this.field2168.field2211) {
					return null;
				}

				var1 = this.field2168.field2208[this.field2166++].field2471;
			} while(var1 == this.field2168.field2208[this.field2166 - 1]);

			this.field2165 = var1.field2471;
			this.field2167 = var1;
			return var1;
		}
	}

	@Override
	public boolean hasNext() {
		if (this.field2165 != this.field2168.field2208[this.field2166 - 1]) {
			return true;
		} else {
			while (this.field2166 < this.field2168.field2211) {
				if (this.field2168.field2208[this.field2166++].field2471 != this.field2168.field2208[this.field2166 - 1]) {
					this.field2165 = this.field2168.field2208[this.field2166 - 1].field2471;
					return true;
				}

				this.field2165 = this.field2168.field2208[this.field2166 - 1];
			}

			return false;
		}
	}

	@Override
	public void remove() {
		if (this.field2167 == null) {
			throw new IllegalStateException();
		} else {
			this.field2167.method1719();
			this.field2167 = null;
		}
	}
}
