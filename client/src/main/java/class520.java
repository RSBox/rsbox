import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

public class class520 {
	static class248 field4103;
	final DecimalFormat field4106;
	final Map field4104;
	final Map field4105;

	public class520() {
		this.field4104 = new HashMap();
		this.field4105 = new HashMap();
		this.field4106 = new DecimalFormat();
		this.field4106.setMaximumFractionDigits(2);
	}

	public void method2437(HttpsURLConnection var1) {
		Iterator var3 = this.field4104.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
		}

	}

	public Map method2449() {
		return this.field4104;
	}

	public void method2448(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4104.put(var1, null != var2 ? var2 : "");
		}

	}

	public void method2438(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			this.field4104.remove(var1);
		}

	}

	void method2447(class159 var1, String var2) {
		String var4 = String.format("%s %s", var1.method861(), var2);
		this.method2448("Authorization", var4);
	}

	public void method2439(String var1) {
		this.method2447(class159.field1144, var1);
	}

	public void method2446(String var1) {
		this.method2447(class159.field1143, var1);
	}

	public void method2440(class125 var1) {
		this.field4104.put("Content-Type", var1.method593());
	}

	public void method2441() {
		this.field4104.remove("Content-Type");
	}

	public void method2442(class125 var1) {
		this.method2443(var1, 1.0F);
	}

	void method2443(class125 var1, float var2) {
		this.field4105.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method2444();
	}

	void method2444() {
		this.field4104.remove("Accept");
		if (!this.field4105.isEmpty()) {
			this.field4104.put("Accept", this.method2445());
		}

	}

	String method2445() {
		ArrayList var2 = new ArrayList(this.field4105.entrySet());
		Collections.sort(var2, new class488(this));
		StringBuilder var3 = new StringBuilder();
		Iterator var4 = var2.iterator();

		while (var4.hasNext()) {
			Entry var5 = (Entry)var4.next();
			if (var3.length() > 0) {
				var3.append(",");
			}

			var3.append(((class125)var5.getKey()).method593());
			float var6 = (Float)var5.getValue();
			if (var6 < 1.0F) {
				String var7 = this.field4106.format((double)var6);
				var3.append(";q=").append(var7);
			}
		}

		return var3.toString();
	}
}
