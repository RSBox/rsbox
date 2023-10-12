import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class468 implements class531 {
	final Map field3302;

	public class468(Map var1) {
		this.field3302 = var1;
	}

	@Override
	public class125 method2549() {
		return null;
	}

	@Override
	public byte[] method2548() throws UnsupportedEncodingException {
		return this.method2174().getBytes("UTF-8");
	}

	public String method2174() throws UnsupportedEncodingException {
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = this.field3302.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			String var5 = URLEncoder.encode((String)var4.getKey(), "UTF-8");
			String var6 = URLEncoder.encode((String)var4.getValue(), "UTF-8");
			var2.append(var5).append("=").append(var6).append("&");
		}

		if (var2.length() == 0) {
			return "";
		} else {
			var2.deleteCharAt(var2.length() - 1);
			var2.insert(0, "?");
			return var2.toString();
		}
	}
}
