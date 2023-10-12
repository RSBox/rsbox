import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class82 implements Iterator {
	class345 field554;
	int field552;
	int field553;

	class82(class345 var1) {
		this.field553 = 0;
		this.field552 = this.field554.field2419;
		this.field554 = var1;
	}

	@Override
	public boolean hasNext() {
		return this.field553 < this.field554.field2421;
	}

	@Override
	public Object next() {
		if (this.field554.field2419 != this.field552) {
			throw new ConcurrentModificationException();
		} else if (this.field553 < this.field554.field2421) {
			Object var1 = this.field554.field2423[this.field553].field3421;
			++this.field553;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
