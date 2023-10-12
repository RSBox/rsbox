import java.util.concurrent.Callable;

class class276 implements Callable {
	static class388 field1830;
	// $FF: synthetic field
	final class19 this$0;
	// $FF: synthetic field
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	class276(class19 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	@Override
	public Object call() {
		this.this$0.method81(this.val$p, this.val$version);
		return null;
	}
}
