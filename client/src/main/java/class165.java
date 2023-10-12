import java.util.Iterator;

public class class165 implements Iterator {
	class292 field1171;
	class292 field1173;
	class530 field1172;

	class165(class530 var1) {
		this.field1171 = null;
		this.field1172 = var1;
		this.field1173 = this.field1172.field4142.field2176;
		this.field1171 = null;
	}

	@Override
	public Object next() {
		class292 var1 = this.field1173;
		if (var1 == this.field1172.field4142) {
			var1 = null;
			this.field1173 = null;
		} else {
			this.field1173 = var1.field2176;
		}

		this.field1171 = var1;
		return var1;
	}

	@Override
	public boolean hasNext() {
		return this.field1173 != this.field1172.field4142;
	}

	@Override
	public void remove() {
		if (this.field1171 == null) {
			throw new IllegalStateException();
		} else {
			this.field1171.method1517();
			this.field1171 = null;
		}
	}
}
