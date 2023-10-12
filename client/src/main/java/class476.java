public abstract class class476 extends class361 implements class414 {
	protected class476(class456 var1, class66 var2, int var3) {
		super(var1, var2, var3);
	}

	protected abstract class54 method2192(int var1);

	public int method2193() {
		return super.field2480;
	}

	@Override
	public Object method1904(int var1) {
		class54 var3 = this.method2192(var1);
		return var3 != null && var3.method222() ? var3.method223() : null;
	}

	public class55 method2194(Buffer var1) {
		int var3 = var1.readUnsignedShort();
		class54 var4 = this.method2192(var3);
		class55 var5 = new class55(var3);
		Class var6 = var4.field250.field3679;
		if (var6 == Integer.class) {
			var5.field251 = var1.readInt();
		} else if (var6 == Long.class) {
			var5.field251 = var1.readLong();
		} else if (var6 == String.class) {
			var5.field251 = var1.readJagexString();
		} else {
			if (!class175.class.isAssignableFrom(var6)) {
				throw new IllegalStateException();
			}

			try {
				class175 var7 = (class175)var6.newInstance();
				var7.method919(var1);
				var5.field251 = var7;
			} catch (InstantiationException var8) {
			} catch (IllegalAccessException var9) {
			}
		}

		return var5;
	}
}
