import java.util.Iterator;

public class class299 extends class4 {
	public static byte[][] field2203;

	public class299(class4 var1) {
		super(var1);
		super.field8 = "AddRequestTask";
	}

	@Override
	public boolean method8() {
		while (!class483.field3384.isEmpty()) {
			class407 var2 = (class407)class483.field3384.peek();
			if (var2 == null) {
				class483.field3384.pop();
			} else {
				var2.field2789 = this.method1532();
				class483.field3389.add(var2);
				class483.field3384.pop();
			}
		}

		return true;
	}

	class118 method1532() {
		class118 var2 = null;
		Iterator var3 = class483.field3387.iterator();

		while (true) {
			class118 var4;
			do {
				do {
					if (!var3.hasNext()) {
						if (null != var2) {
							++var2.field759;
							if (var2.method543() == 0 && var2.method547()) {
								var2.method546();
								var2.method572();
								var2.method542(0);
							}
						}

						return var2;
					}

					var4 = (class118)var3.next();
				} while(var4 == null);
			} while(var2 != null && var2.field759 <= var4.field759 && (var4.method543() != 0 || !var4.method547()));

			var2 = var4;
		}
	}
}
