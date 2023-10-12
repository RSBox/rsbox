public class class509 implements Comparable {
	String field3712;
	String field3713;

	public class509(String var1) {
		this.field3712 = var1;
		this.field3713 = class502.method2370(var1, class126.field822);
	}

	public class509(String var1, class126 var2) {
		this.field3712 = var1;
		this.field3713 = class502.method2370(var1, var2);
	}

	public String method2398() {
		return this.field3712;
	}

	public String method2399() {
		return this.field3713;
	}

	public boolean method2401() {
		return this.field3713 != null;
	}

	@Override
	public boolean equals(Object var1) {
		if (var1 instanceof class509) {
			class509 var2 = (class509)var1;
			if (this.field3713 == null) {
				return null == var2.field3713;
			} else if (var2.field3713 == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.field3713.equals(var2.field3713);
			}
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return null == this.field3713 ? 0 : this.field3713.hashCode();
	}

	@Override
	public String toString() {
		return this.method2398();
	}

	public int method2400(class509 var1) {
		if (this.field3713 == null) {
			return null == var1.field3713 ? 0 : 1;
		} else {
			return var1.field3713 == null ? -1 : this.field3713.compareTo(var1.field3713);
		}
	}

	@Override
	public int compareTo(Object var1) {
		return this.method2400((class509)var1);
	}
}
