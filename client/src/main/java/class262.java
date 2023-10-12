import java.util.Iterator;

public class class262 extends class4 {
	public class262(class4 var1) {
		super(var1);
		super.field8 = "StartSongTask";
	}

	@Override
	public boolean method8() {
		Iterator var2 = class483.field3389.iterator();

		while (var2.hasNext()) {
			class407 var3 = (class407)var2.next();
			if (null != var3 && !var3.field2796 && null != var3.field2789) {
				try {
					var3.field2789.method545();
					var3.field2789.method542(0);
					if (var3.field2799 != null) {
						var3.field2789.method577(var3.field2799, var3.field2794);
					}

					var3.field2799 = null;
					var3.field2800 = null;
					var3.field2795 = null;
					var3.field2796 = true;
				} catch (Exception var5) {
					class2.method1((String)null, var5);
					this.method12(var5.getMessage());
					return true;
				}
			}
		}

		super.field9 = true;
		return true;
	}
}
