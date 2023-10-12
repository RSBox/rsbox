import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class345 extends AbstractQueue {
	class487[] field2423;
	int field2419;
	int field2421;
	Map field2420;
	final Comparator field2422;

	public class345(int var1) {
		this(var1, (Comparator)null);
	}

	public class345(int var1, Comparator var2) {
		this.field2419 = 0;
		this.field2423 = new class487[var1];
		this.field2420 = new HashMap();
		this.field2422 = var2;
	}

	void method1662() {
		int var2 = 1 + (this.field2423.length << 1);
		this.field2423 = (class487[])((class487[])Arrays.copyOf(this.field2423, var2));
	}

	@Override
	public int size() {
		return this.field2421;
	}

	@Override
	public boolean offer(Object var1) {
		if (this.field2420.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field2419;
			int var2 = this.field2421;
			if (var2 >= this.field2423.length) {
				this.method1662();
			}

			++this.field2421;
			if (var2 == 0) {
				this.field2423[0] = new class487(var1, 0);
				this.field2420.put(var1, this.field2423[0]);
			} else {
				this.field2423[var2] = new class487(var1, var2);
				this.field2420.put(var1, this.field2423[var2]);
				this.method1665(var2);
			}

			return true;
		}
	}

	@Override
	public Object peek() {
		return this.field2421 == 0 ? null : this.field2423[0].field3421;
	}

	@Override
	public Object poll() {
		if (this.field2421 == 0) {
			return null;
		} else {
			++this.field2419;
			Object var1 = this.field2423[0].field3421;
			this.field2420.remove(var1);
			--this.field2421;
			if (this.field2421 == 0) {
				this.field2423[this.field2421] = null;
			} else {
				this.field2423[0] = this.field2423[this.field2421];
				this.field2423[0].field3422 = 0;
				this.field2423[this.field2421] = null;
				this.method1663(0);
			}

			return var1;
		}
	}

	@Override
	public boolean remove(Object var1) {
		class487 var2 = (class487)this.field2420.remove(var1);
		if (null == var2) {
			return false;
		} else {
			++this.field2419;
			--this.field2421;
			if (this.field2421 == var2.field3422) {
				this.field2423[this.field2421] = null;
				return true;
			} else {
				class487 var3 = this.field2423[this.field2421];
				this.field2423[this.field2421] = null;
				this.field2423[var2.field3422] = var3;
				this.field2423[var2.field3422].field3422 = var2.field3422;
				this.method1663(var2.field3422);
				if (this.field2423[var2.field3422] == var3) {
					this.method1665(var2.field3422);
				}

				return true;
			}
		}
	}

	void method1665(int var1) {
		class487 var3;
		int var4;
		for (var3 = this.field2423[var1]; var1 > 0; var1 = var4) {
			var4 = var1 - 1 >>> 1;
			class487 var5 = this.field2423[var4];
			if (this.field2422 != null) {
				if (this.field2422.compare(var3.field3421, var5.field3421) >= 0) {
					break;
				}
			} else if (((Comparable)var3.field3421).compareTo(var5.field3421) >= 0) {
				break;
			}

			this.field2423[var1] = var5;
			this.field2423[var1].field3422 = var1;
		}

		this.field2423[var1] = var3;
		this.field2423[var1].field3422 = var1;
	}

	void method1663(int var1) {
		class487 var3 = this.field2423[var1];

		int var9;
		for (int var4 = this.field2421 >>> 1; var1 < var4; var1 = var9) {
			int var5 = 1 + (var1 << 1);
			class487 var6 = this.field2423[var5];
			int var7 = 2 + (var1 << 1);
			class487 var8 = this.field2423[var7];
			if (this.field2422 != null) {
				if (var7 < this.field2421 && this.field2422.compare(var6.field3421, var8.field3421) > 0) {
					var9 = var7;
				} else {
					var9 = var5;
				}
			} else if (var7 < this.field2421 && ((Comparable)var6.field3421).compareTo(var8.field3421) > 0) {
				var9 = var7;
			} else {
				var9 = var5;
			}

			if (this.field2422 != null) {
				if (this.field2422.compare(var3.field3421, this.field2423[var9].field3421) <= 0) {
					break;
				}
			} else if (((Comparable)var3.field3421).compareTo(this.field2423[var9].field3421) <= 0) {
				break;
			}

			this.field2423[var1] = this.field2423[var9];
			this.field2423[var1].field3422 = var1;
		}

		this.field2423[var1] = var3;
		this.field2423[var1].field3422 = var1;
	}

	@Override
	public boolean contains(Object var1) {
		return this.field2420.containsKey(var1);
	}

	@Override
	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (null != this.field2422) {
			Arrays.sort(var1, this.field2422);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	@Override
	public Iterator iterator() {
		return new class82(this);
	}

	public static void method1664() {
		class498.field3673 = null;
		class442.field2971 = null;
		class28.field136 = null;
		class168.field1184 = null;
		class205.field1376 = null;
		class299.field2203 = (byte[][])null;
	}
}
