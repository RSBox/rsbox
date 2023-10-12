import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class class138 implements Runnable {
	static class456 field900;
	static int field902;
	int field901;
	Queue field899;
	final Thread field904;
	volatile boolean field903;

	class138(int var1) {
		this.field899 = new LinkedList();
		this.field904 = new Thread(this);
		this.field904.setPriority(1);
		this.field904.start();
		this.field901 = var1;
	}

	abstract void method708(class394 var1) throws IOException;

	@Override
	public void run() {
		while (!this.field903) {
			try {
				class394 var1;
				synchronized(this) {
					var1 = (class394)this.field899.poll();
					if (null == var1) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.method708(var1);
			} catch (Exception var7) {
				class2.method1((String)null, var7);
			}
		}

	}

	int method711(URLConnection var1) {
		int var3 = class394.field2677;
		if (null != var1) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var3 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var5) {
			}
		}

		return var3;
	}

	void method713(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field901);
	}

	void method710(URLConnection var1, class394 var2) {
		DataInputStream var4 = null;

		try {
			int var6 = var1.getContentLength();
			var4 = new DataInputStream(var1.getInputStream());
			byte[] var5;
			if (var6 >= 0) {
				var5 = new byte[var6];
				var4.readFully(var5);
			} else {
				var5 = new byte[0];
				byte[] var7 = class150.alloc(5000);

				for (int var8 = var4.read(var7); var8 > -1; var8 = var4.read(var7)) {
					byte[] var9 = new byte[var8 + var5.length];
					System.arraycopy(var5, 0, var9, 0, var5.length);
					System.arraycopy(var7, 0, var9, var5.length, var8);
					var5 = var9;
				}

				class150.method799(var7);
			}

			var2.field2673 = var5;
		} catch (IOException var15) {
			var2.field2673 = null;
		} finally {
			var2.field2676 = this.method711(var1);
		}

		if (var4 != null) {
			try {
				var4.close();
			} catch (IOException var14) {
			}
		}

	}

	public class394 method709(URL var1) {
		class394 var3 = new class394(var1);
		synchronized(this) {
			this.field899.add(var3);
			this.notify();
			return var3;
		}
	}

	public void method712() {
		this.field903 = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.field904.join();
		} catch (InterruptedException var5) {
		}

	}
}
