import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class354 {
	static byte[][][] field2451;
	static int[] field2454;
	static int[] field2455;
	ExecutorService field2453;
	Future field2452;

	class354() {
		this.field2453 = Executors.newSingleThreadExecutor();
		this.field2452 = this.field2453.submit(new class250());
	}

	void method1703() {
		this.field2453.shutdown();
		this.field2453 = null;
	}

	boolean method1704() {
		return this.field2452.isDone();
	}

	SecureRandom method1705() {
		try {
			return (SecureRandom)this.field2452.get();
		} catch (Exception var5) {
			SecureRandom var4 = new SecureRandom();
			var4.nextInt();
			return var4;
		}
	}
}
