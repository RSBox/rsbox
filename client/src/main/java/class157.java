import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class class157 {
	final class345 field1083;
	final class345 field1084;
	final class481 field1087;
	final int field1086;
	final Comparator field1081;
	final Map field1082;
	final long field1085;

	public class157(int var1, class481 var2) {
		this(-1L, var1, var2);
	}

	class157(long var1, int var3, class481 var4) {
		this.field1081 = new class271(this);
		this.field1085 = var1;
		this.field1086 = var3;
		this.field1087 = var4;
		if (this.field1086 == -1) {
			this.field1082 = new HashMap(64);
			this.field1083 = new class345(64, this.field1081);
			this.field1084 = null;
		} else {
			if (null == this.field1087) {
				throw new IllegalArgumentException("");
			}

			this.field1082 = new HashMap(this.field1086);
			this.field1083 = new class345(this.field1086, this.field1081);
			this.field1084 = new class345(this.field1086);
		}

	}

	boolean method831() {
		return this.field1086 != -1;
	}

	public Object method835(Object var1) {
		synchronized(this) {
			if (this.field1085 != -1L) {
				this.method833();
			}

			class360 var4 = (class360)this.field1082.get(var1);
			if (null == var4) {
				return null;
			} else {
				this.method836(var4, false);
				return var4.field2477;
			}
		}
	}

	public Object method832(Object var1, Object var2) {
		synchronized(this) {
			if (this.field1085 != -1L) {
				this.method833();
			}

			class360 var5 = (class360)this.field1082.get(var1);
			if (var5 != null) {
				Object var9 = var5.field2477;
				var5.field2477 = var2;
				this.method836(var5, false);
				return var9;
			} else {
				class360 var6;
				if (this.method831() && this.field1082.size() == this.field1086) {
					var6 = (class360)this.field1084.remove();
					this.field1082.remove(var6.field2475);
					this.field1083.remove(var6);
				}

				var6 = new class360(var2, var1);
				this.field1082.put(var1, var6);
				this.method836(var6, true);
				return null;
			}
		}
	}

	void method836(class360 var1, boolean var2) {
		if (!var2) {
			this.field1083.remove(var1);
			if (this.method831() && !this.field1084.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field2476 = System.currentTimeMillis();
		if (this.method831()) {
			switch(this.field1087.field3378) {
			case 0:
				++var1.field2474;
				break;
			case 1:
				var1.field2474 = var1.field2476;
			}

			this.field1084.add(var1);
		}

		this.field1083.add(var1);
	}

	void method833() {
		if (this.field1085 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var2 = System.currentTimeMillis() - this.field1085;

			while (!this.field1083.isEmpty()) {
				class360 var4 = (class360)this.field1083.peek();
				if (var4.field2476 >= var2) {
					return;
				}

				this.field1082.remove(var4.field2475);
				this.field1083.remove(var4);
				if (this.method831()) {
					this.field1084.remove(var4);
				}
			}

		}
	}

	public void method834() {
		synchronized(this) {
			this.field1082.clear();
			this.field1083.clear();
			if (this.method831()) {
				this.field1084.clear();
			}

		}
	}
}
