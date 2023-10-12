import java.util.Iterator;

public class class103 implements Iterator {
	class359 field664;
	class359 field665;
	class444 field666;

	class103(class444 var1) {
		this.field664 = null;
		this.method469(var1);
	}

	void method469(class444 var1) {
		this.field666 = var1;
		this.method470();
	}

	void method470() {
		this.field665 = this.field666 != null ? this.field666.field2974.field2471 : null;
		this.field664 = null;
	}

	@Override
	public Object next() {
		class359 var1 = this.field665;
		if (var1 == this.field666.field2974) {
			var1 = null;
			this.field665 = null;
		} else {
			this.field665 = var1.field2471;
		}

		this.field664 = var1;
		return var1;
	}

	@Override
	public boolean hasNext() {
		return this.field665 != this.field666.field2974 && this.field665 != null;
	}

	@Override
	public void remove() {
		if (this.field664 == null) {
			throw new IllegalStateException();
		} else {
			this.field664.method1719();
			this.field664 = null;
		}
	}
}
