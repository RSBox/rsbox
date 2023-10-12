import java.util.Comparator;
import java.util.Map.Entry;

class class488 implements Comparator {
	// $FF: synthetic field
	final class520 this$0;

	class488(class520 var1) {
		this.this$0 = var1;
	}

	int method2253(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method2253((Entry)var1, (Entry)var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
