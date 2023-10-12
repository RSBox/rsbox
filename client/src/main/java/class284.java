public class class284 implements Comparable {
	class509 field2154;
	class509 field2155;

	class284() {
	}

	public class509 method1490() {
		return this.field2154;
	}

	public String method1494() {
		return this.field2154 == null ? "" : this.field2154.method2398();
	}

	public String method1491() {
		return null == this.field2155 ? "" : this.field2155.method2398();
	}

	void method1493(class509 var1, class509 var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.field2154 = var1;
			this.field2155 = var2;
		}
	}

	public int method1492(class284 var1) {
		return this.field2154.method2400(var1.field2154);
	}

	@Override
	public int compareTo(Object var1) {
		return this.method1492((class284)var1);
	}
}
