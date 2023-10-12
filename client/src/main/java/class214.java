public class class214 extends class359 {
	static class507 field1401;
	class312 field1402;

	public class214() {
		this.field1402 = null;
	}

	class214(class191 var1) {
		if (var1 != null) {
			this.field1402 = new class312(var1, (class7)null);
		}
	}

	public class214(class7 var1) {
		this.field1402 = new class312((class191)null, var1);
	}

	public boolean method994() {
		return null == this.field1402;
	}

	public class7 method995() {
		if (null != this.field1402 && this.field1402.field2269.tryLock()) {
			class7 var2;
			try {
				var2 = this.method996();
			} finally {
				this.field1402.field2269.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	public class7 method993() {
		if (this.field1402 != null) {
			this.field1402.field2269.lock();

			class7 var2;
			try {
				var2 = this.method996();
			} finally {
				this.field1402.field2269.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	class7 method996() {
		if (this.field1402.field2267 == null) {
			this.field1402.field2267 = this.field1402.field2268.method943((int[])null);
			this.field1402.field2268 = null;
		}

		return this.field1402.field2267;
	}
}
