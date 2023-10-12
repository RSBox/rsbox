public class class189 extends class4 {
	class407 field1286;
	int field1285;

	public class189(class4 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field1286 = null;
		this.field1285 = 0;
		super.field8 = "FadeOutTask";
		if (var2 < class483.field3389.size()) {
			this.field1286 = (class407)class483.field3389.get(var2);
		}

		this.field1285 = var4;
	}

	@Override
	public boolean method8() {
		if (this.field1286 != null && this.field1286.field2789 != null) {
			this.field1286.field2797 = true;

			try {
				if (this.field1286.field2793 > 0.0F && this.field1286.field2789.method547()) {
					float var2 = this.field1285 == 0 ? (float)this.field1285 : (float)this.field1286.field2792 / (float)this.field1285;
					class407 var10000 = this.field1286;
					var10000.field2793 -= var2 == 0.0F ? (float)this.field1286.field2792 : var2;
					if (this.field1286.field2793 < 0.0F) {
						this.field1286.field2793 = 0.0F;
					}

					this.field1286.field2789.method542((int)this.field1286.field2793);
					return false;
				}
			} catch (Exception var3) {
				this.method12(var3.getMessage());
				return true;
			}

			this.field1286.field2797 = false;
			return true;
		} else {
			return true;
		}
	}
}
