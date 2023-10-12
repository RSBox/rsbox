import java.util.concurrent.ThreadFactory;

final class class333 implements ThreadFactory {
	static String field2361;

	@Override
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}
}
