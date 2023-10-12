import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class430 implements Runnable {
	public static String field2881;
	public static String field2885;
	static class230[] field2886;
	boolean field2887;
	class436 field2882;
	class436 field2883;
	Thread field2884;

	public class430() {
		this.field2882 = null;
		this.field2883 = null;
		this.field2887 = false;
		field2885 = "Unknown";
		field2881 = "1.6";

		try {
			field2885 = System.getProperty("java.vendor");
			field2881 = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.field2887 = false;
		this.field2884 = new Thread(this);
		this.field2884.setPriority(10);
		this.field2884.setDaemon(true);
		this.field2884.start();
	}

	public final void method1953() {
		synchronized(this) {
			this.field2887 = true;
			this.notifyAll();
		}

		try {
			this.field2884.join();
		} catch (InterruptedException var4) {
		}

	}

	@Override
	public final void run() {
		while (true) {
			class436 var1;
			synchronized(this) {
				while (true) {
					if (this.field2887) {
						return;
					}

					if (this.field2882 != null) {
						var1 = this.field2882;
						this.field2882 = this.field2882.field2935;
						if (this.field2882 == null) {
							this.field2883 = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var7) {
					}
				}
			}

			try {
				int var2 = var1.field2931;
				if (var2 == 1) {
					var1.field2933 = new Socket(InetAddress.getByName((String)var1.field2936), var1.field2934);
				} else if (var2 == 2) {
					Thread var3 = new Thread((Runnable)var1.field2936);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.field2934);
					var1.field2933 = var3;
				} else if (var2 == 4) {
					var1.field2933 = new DataInputStream(((URL)var1.field2936).openStream());
				}

				var1.field2932 = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var1.field2932 = 2;
			}
		}
	}

	final class436 method1951(int var1, int var2, int var3, Object var4) {
		class436 var6 = new class436();
		var6.field2931 = var1;
		var6.field2934 = var2;
		var6.field2936 = var4;
		synchronized(this) {
			if (null != this.field2883) {
				this.field2883.field2935 = var6;
				this.field2883 = var6;
			} else {
				this.field2883 = this.field2882 = var6;
			}

			this.notify();
			return var6;
		}
	}

	public final class436 method1952(String var1, int var2) {
		return this.method1951(1, var2, 0, var1);
	}

	public final class436 method1950(Runnable var1, int var2) {
		return this.method1951(2, var2, 0, var1);
	}
}
