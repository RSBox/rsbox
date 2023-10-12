import java.util.ArrayList;
import java.util.Iterator;

public class class506 extends class4 {
	static class496 field3704;
	ArrayList field3705;

	public class506(class4 var1, ArrayList var2) {
		super(var1);
		super.field8 = "ClearRequestTask";
		this.field3705 = var2;
	}

	@Override
	public boolean method8() {
		if (this.field3705.isEmpty()) {
			return true;
		} else {
			Iterator var2 = this.field3705.iterator();

			while (var2.hasNext()) {
				class407 var3 = (class407)var2.next();

				try {
					if (class483.field3389.contains(var3)) {
						if (var3 == null) {
							class483.field3389.remove(var3);
						} else {
							if (var3.field2789.field759 > 0) {
								--var3.field2789.field759;
							}

							if (var3.field2789.field759 == 0) {
								var3.field2789.method546();
								var3.field2789.method572();
								var3.field2789.method542(0);
							}

							class483.method2226(var3.field2790, var3.field2791);
							class483.field3389.remove(var3);
						}
					}
				} catch (Exception var5) {
					class2.method1((String)null, var5);
					this.method12(var5.getMessage());
					class483.field3389.clear();
					return true;
				}
			}

			return true;
		}
	}
}
