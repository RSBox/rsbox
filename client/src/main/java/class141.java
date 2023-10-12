import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class class141 {
	static class142 field937;
	static int field933;
	boolean field930;
	boolean field934;
	class531 field931;
	int field936;
	final class520 field935;
	final class548 field932;
	final HttpsURLConnection field938;

	public class141(URL var1, class548 var2, boolean var3) throws IOException {
		this(var1, var2, new class520(), var3);
	}

	public class141(URL var1, class548 var2, class520 var3, boolean var4) throws IOException {
		this.field934 = false;
		this.field930 = false;
		this.field936 = 300000;
		if (!var2.method2628()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method2629());
		} else {
			this.field938 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				HttpsURLConnection var5 = this.field938;
				if (null == class30.field149) {
					class30.field149 = new class30();
				}

				class30 var6 = class30.field149;
				var5.setSSLSocketFactory(var6);
			}

			this.field932 = var2;
			this.field935 = null != var3 ? var3 : new class520();
		}
	}

	public class520 method728() {
		return this.field935;
	}

	public void method724(class531 var1) {
		if (!this.field934) {
			if (var1 == null) {
				this.field935.method2438("Content-Type");
				this.field931 = null;
			} else {
				this.field931 = var1;
				if (this.field931.method2549() != null) {
					this.field935.method2440(this.field931.method2549());
				} else {
					this.field935.method2441();
				}

			}
		}
	}

	void method725() throws ProtocolException {
		if (!this.field934) {
			this.field938.setRequestMethod(this.field932.method2629());
			this.field935.method2437(this.field938);
			if (this.field932.method2627() && this.field931 != null) {
				this.field938.setDoOutput(true);
				ByteArrayOutputStream var2 = new ByteArrayOutputStream();

				try {
					var2.write(this.field931.method2548());
					var2.writeTo(this.field938.getOutputStream());
				} catch (IOException var12) {
					var12.printStackTrace();
				} finally {
					try {
						var2.close();
					} catch (IOException var11) {
						var11.printStackTrace();
					}

				}
			}

			this.field938.setConnectTimeout(this.field936);
			this.field938.setInstanceFollowRedirects(this.field930);
			this.field934 = true;
		}
	}

	boolean method726() throws IOException {
		if (!this.field934) {
			this.method725();
		}

		this.field938.connect();
		return this.field938.getResponseCode() == -1;
	}

	class80 method727() {
		try {
			if (!this.field934 || this.field938.getResponseCode() == -1) {
				return new class80("No REST response has been received yet.");
			}
		} catch (IOException var11) {
			this.field938.disconnect();
			return new class80("Error decoding REST response code: " + var11.getMessage());
		}

		class80 var4;
		try {
			class80 var2 = new class80(this.field938);
			return var2;
		} catch (IOException var9) {
			var4 = new class80("Error decoding REST response: " + var9.getMessage());
		} finally {
			this.field938.disconnect();
		}

		return var4;
	}
}
