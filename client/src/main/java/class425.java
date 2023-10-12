import java.io.IOException;
import java.util.concurrent.Callable;

public class class425 implements Callable {
	static int selectedTileXYIdk;
	final class141 field2863;
	// $FF: synthetic field
	final class434 this$0;

	class425(class434 var1, class141 var2) {
		this.this$0 = var1;
		this.field2863 = var2;
	}

	@Override
	public Object call() throws Exception {
		try {
			while (this.field2863.method726()) {
				class325.method1587(10L);
			}
		} catch (IOException var2) {
			return new class80("Error servicing REST query: " + var2.getMessage());
		}

		return this.field2863.method727();
	}

	static final void method1926(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		class145 var11 = null;

		for (class145 var12 = (class145)Client.field1971.method327(); null != var12; var12 = (class145)Client.field1971.method331()) {
			if (var12.field1006 == var0 && var12.field1007 == var1 && var2 == var12.field1004 && var12.field1003 == var3) {
				var11 = var12;
				break;
			}
		}

		if (null == var11) {
			var11 = new class145();
			var11.field1006 = var0;
			var11.field1003 = var3;
			var11.field1007 = var1;
			var11.field1004 = var2;
			var11.field1012 = -1;
			Client.method1320(var11);
			Client.field1971.method323(var11);
		}

		var11.field1009 = var4;
		var11.field1005 = var5;
		var11.field1002 = var6;
		var11.field1014 = var8;
		var11.field1015 = var9;
		var11.method787(var7);
	}
}
