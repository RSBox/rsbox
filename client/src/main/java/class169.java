public class class169 {
	boolean field1195;
	int field1186;
	int field1187;
	int field1188;
	int field1189;
	int field1190;
	int field1191;
	int field1192;
	int field1193;
	int field1194;
	int field1196;
	int field1197;
	int field1198;

	public class169() {
		this.field1196 = 0;
		this.field1194 = 0;
	}

	public void method892(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field1193 = var1;
		this.field1186 = var2;
		this.field1197 = var3;
		this.field1190 = var4;
		this.field1191 = var5;
		this.field1192 = var6;
		this.field1196 = var7;
		this.field1194 = var8;
		this.field1195 = var9;
	}

	public void method894(int var1, int var2, int var3, int var4) {
		this.field1188 = var1;
		this.field1189 = var2;
		this.field1187 = var3;
		this.field1198 = var4;
	}

	public void method893(class39 var1, class282 var2) {
		if (var2 != null) {
			int var4 = var2.field1483;
			int var5 = Math.min(this.field1190, (int)(0.9F * (float)var4));
			int var6 = var1.method135(this.field1197);
			int var7 = var1.method148(this.field1190);
			int var8 = var6 + (this.field1193 - this.field1191);
			int var9 = this.field1186 - this.field1192 + var7 + var4;
			class433.method1958(this.field1193, this.field1186, this.field1197 + this.field1193, this.field1190 + this.field1186);
			int var10 = this.field1194;
			int var11 = this.field1196;
			if (var10 > var11) {
				int var12 = var10;
				var10 = var11;
				var11 = var12;
			}

			class508 var22 = var1.method143(0, var10);
			class508 var13 = var1.method143(var10, var11);
			class508 var14 = var1.method143(var11, var1.method112());
			class508 var15 = var1.method143(0, this.field1196);
			int var17;
			int var19;
			if (!var13.method2391()) {
				int var16 = var2.field1484 + var2.field1490;

				for (var17 = 0; var17 < var13.method2392(); ++var17) {
					class101 var18 = var13.method2394(var17);
					var19 = var8 + var18.field658;
					int var20 = var2.method1032(var18.field657);
					int var21 = var18.field659 + var9 - var4;
					class433.method1977(var19, var21, var20, var16, this.field1198);
				}
			}

			if (!var22.method2391()) {
				var2.method1064(var22, var8, var9, this.field1188, this.field1189, -1);
			}

			if (!var13.method2391()) {
				var2.method1064(var13, var8, var9, this.field1187, this.field1189, -1);
			}

			if (!var14.method2391()) {
				var2.method1064(var14, var8, var9, this.field1188, this.field1189, -1);
			}

			if (this.field1195) {
				class203 var23 = var15.method2393();
				var17 = var8 + (Integer)var23.field1361;
				int var24 = var9 + (Integer)var23.field1362;
				var19 = var24 - var5;
				class433.method1972(var17, var24, var17, var19, this.field1188);
				if (this.field1189 != -1) {
					class433.method1972(var17 + 1, var24 + 1, var17 + 1, var19 + 1, this.field1189);
				}
			}

		}
	}
}
