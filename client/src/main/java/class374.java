import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class374 implements class531 {
	JSONObject field2578;

	public class374(JSONObject var1) {
		this.field2578 = var1;
	}

	public class374(String var1) throws UnsupportedEncodingException {
		this.method1750(var1);
	}

	public class374(byte[] var1) throws UnsupportedEncodingException {
		this.method1749(var1);
	}

	@Override
	public class125 method2549() {
		return class125.field818;
	}

	void method1749(byte[] var1) throws UnsupportedEncodingException {
		String var3 = new String(var1, "UTF-8");
		this.method1750(var3);
	}

	void method1750(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field2578 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var3 = new JSONArray(var1);
				this.field2578 = new JSONObject();
				this.field2578.put("arrayValues", var3);
			}

		} catch (JSONException var4) {
			throw new UnsupportedEncodingException(var4.getMessage());
		}
	}

	public JSONObject method1751() {
		return this.field2578;
	}

	@Override
	public byte[] method2548() throws UnsupportedEncodingException {
		return null == this.field2578 ? new byte[0] : this.field2578.toString().getBytes("UTF-8");
	}
}
