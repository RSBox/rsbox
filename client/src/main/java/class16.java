import java.util.concurrent.Callable;

public class class16 implements Callable {
	static int field86;
	final class10 field84;
	// $FF: synthetic field
	final class19 this$0;
	final class23 field83;
	final class234 field85;
	final int field87;

	class16(class19 var1, class234 var2, class10 var3, class23 var4, int var5) {
		this.this$0 = var1;
		this.field85 = var2;
		this.field84 = var3;
		this.field83 = var4;
		this.field87 = var5;
	}

	@Override
	public Object call() {
		this.field85.method1080();
		class234[][] var1;
		if (class10.field50 == this.field84) {
			var1 = this.this$0.field99;
		} else {
			var1 = this.this$0.field92;
		}

		var1[this.field87][this.field83.method84()] = this.field85;
		return null;
	}
}
