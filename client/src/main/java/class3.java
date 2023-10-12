import java.util.concurrent.Future;

public class class3 {
	String field7;
	Future field6;

	class3(Future var1) {
		this.field6 = var1;
	}

	class3(String var1) {
		this.method2(var1);
	}

	void method2(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field7 = var1;
		if (null != this.field6) {
			this.field6.cancel(true);
			this.field6 = null;
		}

	}

	public final String method3() {
		return this.field7;
	}

	public boolean method4() {
		return null != this.field7 || this.field6 == null;
	}

	public final boolean method6() {
		return this.method4() ? true : this.field6.isDone();
	}

	public final class80 method5() {
		if (this.method4()) {
			return new class80(this.field7);
		} else if (!this.method6()) {
			return null;
		} else {
			try {
				return (class80)this.field6.get();
			} catch (Exception var4) {
				String var3 = "Error retrieving REST request reply";
				System.err.println(var3 + "\r\n" + var4);
				this.method2(var3);
				return new class80(var3);
			}
		}
	}
}
