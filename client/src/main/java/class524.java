import java.util.concurrent.Callable;

class class524 implements Callable {
	static short[] field4110;
	// $FF: synthetic field
	final class16[] val$curveLoadJobs;
	// $FF: synthetic field
	final class19 this$0;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	final int val$workStart;

	class524(class19 var1, int var2, int var3, class16[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	@Override
	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}
}
