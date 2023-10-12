import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class class389 extends class138 {
	final boolean field2661;

	public class389(boolean var1, int var2) {
		super(var2);
		this.field2661 = var1;
	}

	@Override
	void method708(class394 var1) throws IOException {
		URLConnection var3 = null;
		boolean var10 = false;

		label124: {
			HttpURLConnection var13;
			label125: {
				try {
					var10 = true;
					String var4 = var1.field2675.getProtocol();
					if (var4.equals("http")) {
						var3 = this.method1828(var1);
					} else {
						if (!var4.equals("https")) {
							var1.field2676 = class394.field2677;
							var10 = false;
							break label124;
						}

						var3 = this.method1827(var1);
					}

					this.method710(var3, var1);
					var10 = false;
					break label125;
				} catch (IOException var11) {
					var1.field2676 = class394.field2677;
					var10 = false;
				} finally {
					if (var10) {
						if (null != var3 && var3 instanceof HttpURLConnection) {
							HttpURLConnection var7 = (HttpURLConnection)var3;
							var7.disconnect();
						}

					}
				}

				if (null != var3 && var3 instanceof HttpURLConnection) {
					var13 = (HttpURLConnection)var3;
					var13.disconnect();
				}

				return;
			}

			if (null != var3 && var3 instanceof HttpURLConnection) {
				var13 = (HttpURLConnection)var3;
				var13.disconnect();
			}

			return;
		}

		if (null != var3 && var3 instanceof HttpURLConnection) {
			HttpURLConnection var5 = (HttpURLConnection)var3;
			var5.disconnect();
		}

	}

	URLConnection method1828(class394 var1) throws IOException {
		URLConnection var3 = var1.field2675.openConnection();
		this.method713(var3);
		return var3;
	}

	URLConnection method1827(class394 var1) throws IOException {
		HttpsURLConnection var3 = (HttpsURLConnection)var1.field2675.openConnection();
		if (!this.field2661) {
			if (null == class30.field149) {
				class30.field149 = new class30();
			}

			class30 var5 = class30.field149;
			var3.setSSLSocketFactory(var5);
		}

		this.method713(var3);
		return var3;
	}
}
