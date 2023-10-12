import java.util.concurrent.Callable;

public class class20 implements Callable {
	// $FF: synthetic field
	final class152 this$0;
	final class295 field100;
	final Buffer field101;

	class20(class152 var1, Buffer var2, class295 var3) {
		this.this$0 = var1;
		this.field101 = var2;
		this.field100 = var3;
	}

	@Override
	public Object call() {
		return this.field100.method1526(this.field101);
	}
}
