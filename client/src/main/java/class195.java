import java.util.concurrent.ThreadFactory;

class class195 implements ThreadFactory {
	// $FF: synthetic field
	final class118 this$0;

	class195(class118 var1) {
		this.this$0 = var1;
	}

	@Override
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
