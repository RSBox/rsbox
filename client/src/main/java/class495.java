import java.util.Iterator;

public class class495 extends class4 {
	class5 field3515;
	class5 field3516;
	class5 field3517;

	public class495(class4 var1, class5 var2, class5 var3, class5 var4) {
		super(var1);
		this.field3516 = var2;
		this.field3517 = var3;
		this.field3515 = var4;
		super.field8 = "LoadSongTask";
	}

	@Override
	public boolean method8() {
		int var2 = 0;
		Iterator var3 = class483.field3389.iterator();

		while (true) {
			while (var3.hasNext()) {
				class407 var4 = (class407)var3.next();
				if (var4 != null && var4.field2789.field759 > 1 && var4.field2789.method575()) {
					this.method12("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var4 != null && !var4.field2798) {
					try {
						if (null != var4.field2795 && var4.field2790 != -1 && var4.field2791 != -1) {
							if (null == var4.field2799) {
								var4.field2799 = class44.method184(var4.field2795, var4.field2790, var4.field2791);
								if (var4.field2799 == null) {
									continue;
								}
							}

							if (var4.field2800 == null) {
								var4.field2800 = new class209(this.field3515, this.field3517);
							}

							if (var4.field2789.method544(var4.field2799, this.field3516, var4.field2800)) {
								++var2;
								var4.field2798 = true;
								var4.field2789.method548();
							}
						} else {
							++var2;
						}
					} catch (Exception var6) {
						class2.method1((String)null, var6);
						this.method12(var6.getMessage());
						return true;
					}
				} else {
					++var2;
				}
			}

			if (var2 == class483.field3389.size()) {
				return true;
			}

			return false;
		}
	}
}
