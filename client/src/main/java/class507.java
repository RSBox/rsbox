import java.util.Iterator;

public class class507 extends class476 implements class115 {
	final class45 field3706;
	final class5 field3708;
	final int field3707;

	public class507(class456 var1, int var2, class66 var3, class5 var4) {
		super(var1, var3, var4 != null ? var4.method23(var2) : 0);
		this.field3706 = new class45(64);
		this.field3708 = var4;
		this.field3707 = var2;
	}

	@Override
	protected class54 method2192(int var1) {
		synchronized(this.field3706) {
			class528 var3 = (class528)this.field3706.method186((long)var1);
			if (var3 == null) {
				var3 = this.method2388(var1);
				this.field3706.method191(var3, (long)var1);
			}

			return var3;
		}
	}

	class528 method2388(int var1) {
		byte[] var3 = this.field3708.method39(this.field3707, var1);
		class528 var4 = new class528(var1);
		if (null != var3) {
			var4.method221(new Buffer(var3));
		}

		return var4;
	}

	public void method2389() {
		synchronized(this.field3706) {
			this.field3706.method190();
		}
	}

	@Override
	public Iterator iterator() {
		return new class383(this);
	}
}
