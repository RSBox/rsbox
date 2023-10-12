import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class485 {
	class284[] field3403;
	int field3402;
	Comparator field3406;
	HashMap field3401;
	HashMap field3405;
	final int field3404;

	class485(int var1) {
		this.field3402 = 0;
		this.field3406 = null;
		this.field3404 = var1;
		this.field3403 = this.method2244(var1);
		this.field3405 = new HashMap(var1 / 8);
		this.field3401 = new HashMap(var1 / 8);
	}

	abstract class284 method2243();

	abstract class284[] method2244(int var1);

	public void method2251() {
		this.field3402 = 0;
		Arrays.fill(this.field3403, (Object)null);
		this.field3405.clear();
		this.field3401.clear();
	}

	public int method2250() {
		return this.field3402;
	}

	public boolean method2252() {
		return this.field3404 == this.field3402;
	}

	public boolean method2232(class509 var1) {
		if (!var1.method2401()) {
			return false;
		} else {
			return this.field3405.containsKey(var1) ? true : this.field3401.containsKey(var1);
		}
	}

	public class284 method2233(class509 var1) {
		class284 var3 = this.method2241(var1);
		return null != var3 ? var3 : this.method2246(var1);
	}

	class284 method2241(class509 var1) {
		return !var1.method2401() ? null : (class284)this.field3405.get(var1);
	}

	class284 method2246(class509 var1) {
		return !var1.method2401() ? null : (class284)this.field3401.get(var1);
	}

	public final boolean method2235(class509 var1) {
		class284 var3 = this.method2241(var1);
		if (null == var3) {
			return false;
		} else {
			this.method2231(var3);
			return true;
		}
	}

	final void method2231(class284 var1) {
		int var3 = this.method2240(var1);
		if (var3 != -1) {
			this.method2234(var3);
			this.method2247(var1, (byte)53);
		}
	}

	class284 method2236(class509 var1) {
		return this.method2230(var1, (class509)null);
	}

	class284 method2230(class509 var1, class509 var2) {
		if (this.method2241(var1) != null) {
			throw new IllegalStateException();
		} else {
			class284 var4 = this.method2243();
			var4.method1493(var1, var2);
			this.method2242(var4);
			this.method2248(var4);
			return var4;
		}
	}

	public final class284 method2237(int var1) {
		if (var1 >= 0 && var1 < this.field3402) {
			return this.field3403[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	public final void method2238() {
		if (this.field3406 == null) {
			Arrays.sort(this.field3403, 0, this.field3402);
		} else {
			Arrays.sort(this.field3403, 0, this.field3402, this.field3406);
		}

	}

	final void method2239(class284 var1, class509 var2, class509 var3) {
		this.method2247(var1, (byte)28);
		var1.method1493(var2, var3);
		this.method2248(var1);
	}

	final int method2240(class284 var1) {
		for (int var3 = 0; var3 < this.field3402; ++var3) {
			if (var1 == this.field3403[var3]) {
				return var3;
			}
		}

		return -1;
	}

	final void method2247(class284 var1, byte var2) {
		if (this.field3405.remove(var1.field2154) == null) {
			throw new IllegalStateException();
		} else {
			if (null != var1.field2155) {
				this.field3401.remove(var1.field2155);
			}

		}
	}

	final void method2242(class284 var1) {
		this.field3403[++this.field3402 - 1] = var1;
	}

	final void method2248(class284 var1) {
		this.field3405.put(var1.field2154, var1);
		if (var1.field2155 != null) {
			class284 var3 = (class284)this.field3401.put(var1.field2155, var1);
			if (null != var3 && var1 != var3) {
				var3.field2155 = null;
			}
		}

	}

	final void method2234(int var1) {
		--this.field3402;
		if (var1 < this.field3402) {
			System.arraycopy(this.field3403, var1 + 1, this.field3403, var1, this.field3402 - var1);
		}

	}

	public final void method2245() {
		this.field3406 = null;
	}

	public final void method2249(Comparator var1) {
		if (this.field3406 == null) {
			this.field3406 = var1;
		} else if (this.field3406 instanceof class147) {
			((class147)this.field3406).method791(var1);
		}

	}
}
