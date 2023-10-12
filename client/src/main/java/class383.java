import java.util.Iterator;

class class383 implements Iterator {
	int field2641;
	// $FF: synthetic field
	final class507 this$0;

	class383(class507 var1) {
		this.this$0 = var1;
	}

	@Override
	public boolean hasNext() {
		return this.field2641 < this.this$0.method2193();
	}

	@Override
	public Object next() {
		int var1 = ++this.field2641 - 1;
		class528 var2 = (class528)this.this$0.field3706.method186((long)var1);
		return var2 != null ? var2 : this.this$0.method2388(var1);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
