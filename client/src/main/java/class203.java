import java.io.File;

public class class203 {
	public static int field1364;
	static File field1363;
	public final Object field1361;
	public final Object field1362;

	public class203(Object var1, Object var2) {
		this.field1361 = var1;
		this.field1362 = var2;
	}

	@Override
	public String toString() {
		return this.field1361 + ", " + this.field1362;
	}

	@Override
	public boolean equals(Object var1) {
		if (null != var1 && var1 instanceof class203) {
			class203 var2 = (class203)var1;
			if (null == this.field1361) {
				if (null != var2.field1361) {
					return false;
				}
			} else if (!this.field1361.equals(var2.field1361)) {
				return false;
			}

			if (this.field1362 == null) {
				if (null != var2.field1362) {
					return false;
				}
			} else if (!this.field1362.equals(var2.field1362)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int var1 = 0;
		if (null != this.field1361) {
			var1 += this.field1361.hashCode();
		}

		if (this.field1362 != null) {
			var1 += 31 * this.field1362.hashCode();
		}

		return var1;
	}
}
