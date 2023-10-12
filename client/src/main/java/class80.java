import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class class80 {
	static int selectedTileX;
	final int field550;
	final String field548;
	final Map field547;

	class80(HttpURLConnection var1) throws IOException {
		this.field550 = var1.getResponseCode();
		var1.getResponseMessage();
		this.field547 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field550 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field548 = var2.toString();
	}

	class80(String var1) {
		this.field550 = 400;
		this.field547 = null;
		this.field548 = "";
	}

	public int method394() {
		return this.field550;
	}

	public Map method395() {
		return this.field547;
	}

	public String method396() {
		return this.field548;
	}
}
