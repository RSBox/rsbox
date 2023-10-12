import java.util.concurrent.ThreadFactory;

class class429 implements ThreadFactory {
	static class496 field2880;
	// $FF: synthetic field
	final Client this$0;

	class429(Client var1) {
		this.this$0 = var1;
	}

	@Override
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}
}
