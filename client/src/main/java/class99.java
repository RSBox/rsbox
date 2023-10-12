public class class99 extends class4 {
	class407 field649;
	int field648;

	public class99(class4 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field649 = null;
		this.field648 = 0;
		super.field8 = "FadeInTask";
		if (var3 && var2 < class483.field3384.size()) {
			this.field649 = (class407)class483.field3384.get(var2);
		} else if (!var3 && var2 < class483.field3389.size()) {
			this.field649 = (class407)class483.field3389.get(var2);
		}

		this.field648 = var4;
	}

	@Override
	public boolean method8() {
		if (null != this.field649 && this.field649.field2789 != null) {
			this.field649.field2797 = true;

			try {
				if (this.field649.field2793 < (float)this.field649.field2792 && this.field649.field2789.method547()) {
					float var2 = this.field648 == 0 ? (float)this.field648 : (float)this.field649.field2792 / (float)this.field648;
					class407 var10000 = this.field649;
					var10000.field2793 += 0.0F == var2 ? (float)this.field649.field2792 : var2;
					if (this.field649.field2793 > (float)this.field649.field2792) {
						this.field649.field2793 = (float)this.field649.field2792;
					}

					this.field649.field2789.method542((int)this.field649.field2793);
					return false;
				}
			} catch (Exception var3) {
				this.method12(var3.getMessage());
				return true;
			}

			this.field649.field2797 = false;
			return true;
		} else {
			return true;
		}
	}
}
