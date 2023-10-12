import java.util.HashMap;

public class class199 {
	class5 field1347;
	class5 field1349;
	HashMap field1348;

	public class199(class5 var1, class5 var2) {
		this.field1347 = var1;
		this.field1349 = var2;
		this.field1348 = new HashMap();
	}

	public HashMap method966(class43[] var1) {
		HashMap var3 = new HashMap();
		class43[] var4 = var1;

		for (int var5 = 0; var5 < var4.length; ++var5) {
			class43 var6 = var4[var5];
			if (this.field1348.containsKey(var6)) {
				var3.put(var6, this.field1348.get(var6));
			} else {
				class5 var8 = this.field1347;
				class5 var9 = this.field1349;
				String var10 = var6.field214;
				class282 var7;
				if (!var8.method33(var10, "")) {
					var7 = null;
				} else {
					int var11 = var8.method28(var10);
					int var12 = var8.method17(var11, "");
					class282 var13;
					if (!class168.method887(var8, var11, var12)) {
						var13 = null;
					} else {
						byte[] var15 = var9.method39(var11, var12);
						class282 var14;
						if (null == var15) {
							var14 = null;
						} else {
							class282 var16 = new class282(var15, class498.field3673, class442.field2971, class28.field136, class168.field1184, class205.field1376, class299.field2203);
							class345.method1664();
							var14 = var16;
						}

						var13 = var14;
					}

					var7 = var13;
				}

				if (null != var7) {
					this.field1348.put(var6, var7);
					var3.put(var6, var7);
				}
			}
		}

		return var3;
	}
}
