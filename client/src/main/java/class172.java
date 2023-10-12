public class class172 extends class551 {
	byte field1216;
	byte field1217;
	String field1218;
	// $FF: synthetic field
	final class328 this$0;

	class172(class328 var1) {
		this.this$0 = var1;
	}

	@Override
	void method2632(Buffer var1) {
		this.field1218 = var1.readString();
		if (this.field1218 != null) {
			var1.readUnsignedByte();
			this.field1216 = var1.readByte();
			this.field1217 = var1.readByte();
		}

	}

	@Override
	void method2633(class398 var1) {
		var1.field2741 = this.field1218;
		if (this.field1218 != null) {
			var1.field2744 = this.field1216;
			var1.field2745 = this.field1217;
		}

	}

	static int method910(int var0, class83 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 100) {
			class440.field2956 -= 3;
			var4 = class440.field2955[class440.field2956];
			var5 = class440.field2955[1 + class440.field2956];
			int var12 = class440.field2955[class440.field2956 + 2];
			if (var5 == 0) {
				throw new RuntimeException();
			} else {
				class496 var7 = class208.interfaceConfigs.method345(var4);
				if (var7.field3659 == null) {
					var7.field3659 = new class496[var12 + 1];
				}

				if (var7.field3659.length <= var12) {
					class496[] var8 = new class496[var12 + 1];

					for (int var9 = 0; var9 < var7.field3659.length; ++var9) {
						var8[var9] = var7.field3659[var9];
					}

					var7.field3659 = var8;
				}

				if (var12 > 0 && var7.field3659[var12 - 1] == null) {
					throw new RuntimeException("" + (var12 - 1));
				} else {
					class496 var13 = new class496();
					var13.field3527 = var5;
					var13.field3544 = var13.interfaceId = var7.interfaceId;
					var13.field3603 = var12;
					var13.field3523 = true;
					if (var5 == 12) {
						var13.method2328();
						var13.method2323((byte)74).method655(new class416(var13));
						var13.method2323((byte)13).method656(new class327(var13));
					}

					var7.field3659[var12] = var13;
					if (var2) {
						class506.field3704 = var13;
					} else {
						class107.field682 = var13;
					}

					Client.method1363(var7);
					return 1;
				}
			}
		} else {
			class496 var10;
			if (var0 == 101) {
				var10 = var2 ? class506.field3704 : class107.field682;
				class496 var11 = class208.interfaceConfigs.method345(var10.interfaceId);
				var11.field3659[var10.field3603] = null;
				Client.method1363(var11);
				return 1;
			} else if (var0 == 102) {
				var10 = class208.interfaceConfigs.method345(class440.field2955[--class440.field2956]);
				var10.field3659 = null;
				Client.method1363(var10);
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var10 = class208.interfaceConfigs.method345(class440.field2955[--class440.field2956]);
					if (var10 != null) {
						class440.field2955[++class440.field2956 - 1] = 1;
						if (var2) {
							class506.field3704 = var10;
						} else {
							class107.field682 = var10;
						}
					} else {
						class440.field2955[++class440.field2956 - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				class440.field2956 -= 2;
				var4 = class440.field2955[class440.field2956];
				var5 = class440.field2955[1 + class440.field2956];
				class496 var6 = class208.interfaceConfigs.method346(var4, var5);
				if (var6 != null && var5 != -1) {
					class440.field2955[++class440.field2956 - 1] = 1;
					if (var2) {
						class506.field3704 = var6;
					} else {
						class107.field682 = var6;
					}
				} else {
					class440.field2955[++class440.field2956 - 1] = 0;
				}

				return 1;
			}
		}
	}
}
