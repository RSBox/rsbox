public final class class360 implements Comparable {
	Object field2475;
	Object field2477;
	long field2474;
	long field2476;

	class360(Object var1, Object var2) {
		this.field2477 = var1;
		this.field2475 = var2;
	}

	int method1721(class360 var1) {
		if (this.field2474 < var1.field2474) {
			return -1;
		} else {
			return this.field2474 > var1.field2474 ? 1 : 0;
		}
	}

	@Override
	public boolean equals(Object var1) {
		if (var1 instanceof class360) {
			return this.field2475.equals(((class360)var1).field2475);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public int hashCode() {
		return this.field2475.hashCode();
	}

	@Override
	public int compareTo(Object var1) {
		return this.method1721((class360)var1);
	}
}
