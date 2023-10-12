import java.net.URL;

public class class394 {
	static int field2674;
	static int field2677;
	final URL field2675;
	volatile byte[] field2673;
	volatile int field2676;

	static {
		field2674 = -1;
		field2677 = -2;
	}

	class394(URL var1) {
		this.field2676 = field2674;
		this.field2675 = var1;
	}

	public boolean method1831() {
		return this.field2676 != field2674;
	}

	public byte[] method1830() {
		return this.field2673;
	}

	public String method1832() {
		return this.field2675.toString();
	}

	static int method1833(int var0) {
		class56 var2 = (class56)class346.field2427.method1533((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var2.field2176 == class346.field2424.field4142 ? -1 : ((class56)var2.field2176).field260;
		}
	}
}
