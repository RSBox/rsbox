import java.util.Collection;
import java.util.Iterator;

public class class444 implements Iterable, Collection {
	class359 field2973;
	class359 field2974;

	public class444() {
		this.field2974 = new class359();
		this.field2974.field2471 = this.field2974;
		this.field2974.field2473 = this.field2974;
	}

	public void method2092() {
		while (this.field2974.field2471 != this.field2974) {
			this.field2974.field2471.method1719();
		}

	}

	public void method2095(class359 var1) {
		if (var1.field2473 != null) {
			var1.method1719();
		}

		var1.field2473 = this.field2974.field2473;
		var1.field2471 = this.field2974;
		var1.field2473.field2471 = var1;
		var1.field2471.field2473 = var1;
	}

	public void method2094(class359 var1) {
		if (var1.field2473 != null) {
			var1.method1719();
		}

		var1.field2473 = this.field2974;
		var1.field2471 = this.field2974.field2471;
		var1.field2473.field2471 = var1;
		var1.field2471.field2473 = var1;
	}

	public class359 method2088() {
		return this.method2089((class359)null);
	}

	class359 method2089(class359 var1) {
		class359 var2;
		if (var1 == null) {
			var2 = this.field2974.field2471;
		} else {
			var2 = var1;
		}

		if (var2 == this.field2974) {
			this.field2973 = null;
			return null;
		} else {
			this.field2973 = var2.field2471;
			return var2;
		}
	}

	public class359 method2097() {
		class359 var1 = this.field2973;
		if (var1 == this.field2974) {
			this.field2973 = null;
			return null;
		} else {
			this.field2973 = var1.field2471;
			return var1;
		}
	}

	int method2091() {
		int var1 = 0;

		for (class359 var2 = this.field2974.field2471; var2 != this.field2974; var2 = var2.field2471) {
			++var1;
		}

		return var1;
	}

	public boolean method2090() {
		return this.field2974.field2471 == this.field2974;
	}

	class359[] method2093() {
		class359[] var1 = new class359[this.method2091()];
		int var2 = 0;

		for (class359 var3 = this.field2974.field2471; var3 != this.field2974; var3 = var3.field2471) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@Override
	public Iterator iterator() {
		return new class103(this);
	}

	@Override
	public int size() {
		return this.method2091();
	}

	@Override
	public boolean isEmpty() {
		return this.method2090();
	}

	@Override
	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	@Override
	public Object[] toArray() {
		return this.method2093();
	}

	@Override
	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (class359 var3 = this.field2974.field2471; var3 != this.field2974; var3 = var3.field2471) {
			var1[var2++] = var3;
		}

		return var1;
	}

	boolean method2096(class359 var1) {
		this.method2095(var1);
		return true;
	}

	@Override
	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	@Override
	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	@Override
	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	@Override
	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	@Override
	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	@Override
	public void clear() {
		this.method2092();
	}

	@Override
	public boolean add(Object var1) {
		return this.method2096((class359)var1);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public static void method2087(class359 var0, class359 var1) {
		if (var0.field2473 != null) {
			var0.method1719();
		}

		var0.field2473 = var1;
		var0.field2471 = var1.field2471;
		var0.field2473.field2471 = var0;
		var0.field2471.field2473 = var0;
	}
}
