import java.net.MalformedURLException;
import java.net.URL;

public class class382 {
	static int field2640;
	class394 field2639;
	class42 field2638;

	class382(String var1, class138 var2) {
		try {
			this.field2639 = var2.method709(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field2639 = null;
		}

	}

	class382(class394 var1) {
		this.field2639 = var1;
	}

	class42 method1801() {
		if (null == this.field2638 && null != this.field2639 && this.field2639.method1831()) {
			if (this.field2639.method1830() != null) {
				this.field2638 = class412.method1902(this.field2639.method1830());
			}

			this.field2639 = null;
		}

		return this.field2638;
	}
}
