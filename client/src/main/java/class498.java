import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

class class498 implements Callable {
	public static int[] field3673;
	// $FF: synthetic field
	final class118 this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	class498(class118 var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	@Override
	public Object call() {
		PriorityQueue var1 = this.this$0.field780;

		while (true) {
			class46 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (class46)var1.remove();
			}

			var2.field225.method995();
		}
	}
}
