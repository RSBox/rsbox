import java.awt.Font;
import java.awt.FontMetrics;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class434 {
	static class282 field2908;
	static int field2905;
	static Font field2906;
	static FontMetrics field2907;
	final int field2903;
	final String field2909;
	final ThreadFactory field2902;
	final ThreadPoolExecutor field2904;

	public class434(String var1, int var2, int var3) {
		this.field2909 = var1;
		this.field2903 = var2;
		this.field2902 = new class93(this);
		this.field2904 = this.method1983(var3);
	}

	final ThreadPoolExecutor method1983(int var1) {
		return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field2903), this.field2902);
	}

	public class3 method1981(class141 var1) {
		if (this.field2904.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field2904.getCorePoolSize() + " Queue capacity " + this.field2903);
			return new class3("Queue full");
		} else {
			class3 var3 = new class3(this.field2904.submit(new class425(this, var1)));
			return var3;
		}
	}

	public final void method1982() {
		try {
			this.field2904.shutdown();
		} catch (Exception var3) {
			System.err.println("Error shutting down RestRequestService\r\n" + var3);
		}

	}
}
