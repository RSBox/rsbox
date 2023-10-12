import java.util.Date;

public class class110 implements class501 {
	public static final class110 field697;
	public static final class110 field698;
	public static final class110 field699;
	public static final class110 field701;
	public static final class110 field702;
	final int field700;
	public final int field696;

	static {
		field702 = new class110(2, 0);
		field697 = new class110(3, 1);
		field699 = new class110(1, 2);
		field698 = new class110(4, 3);
		field701 = new class110(0, 4);
	}

	class110(int var1, int var2) {
		this.field696 = var1;
		this.field700 = var2;
	}

	@Override
	public int getId() {
		return this.field700;
	}

	static int method507(int var0, class83 var1, boolean var2) {
		String var4;
		int var10;
		if (var0 == 4100) {
			var4 = class440.field2965[--class176.field1224];
			var10 = class440.field2955[--class440.field2956];
			class440.field2965[++class176.field1224 - 1] = var4 + var10;
			return 1;
		} else {
			String var5;
			if (var0 == 4101) {
				class176.field1224 -= 2;
				var4 = class440.field2965[class176.field1224];
				var5 = class440.field2965[class176.field1224 + 1];
				class440.field2965[++class176.field1224 - 1] = var4 + var5;
				return 1;
			} else if (var0 == 4102) {
				var4 = class440.field2965[--class176.field1224];
				var10 = class440.field2955[--class440.field2956];
				class440.field2965[++class176.field1224 - 1] = var4 + class385.method1819(var10, true);
				return 1;
			} else if (var0 == 4103) {
				var4 = class440.field2965[--class176.field1224];
				class440.field2965[++class176.field1224 - 1] = var4.toLowerCase();
				return 1;
			} else {
				int var7;
				int var13;
				if (var0 == 4104) {
					var13 = class440.field2955[--class440.field2956];
					long var16 = (11745L + (long)var13) * 86400000L;
					class440.field2960.setTime(new Date(var16));
					var7 = class440.field2960.get(5);
					int var18 = class440.field2960.get(2);
					int var9 = class440.field2960.get(1);
					class440.field2965[++class176.field1224 - 1] = var7 + "-" + class440.field2961[var18] + "-" + var9;
					return 1;
				} else if (var0 != 4105) {
					if (var0 == 4106) {
						var13 = class440.field2955[--class440.field2956];
						class440.field2965[++class176.field1224 - 1] = Integer.toString(var13);
						return 1;
					} else if (var0 == 4107) {
						class176.field1224 -= 2;
						class440.field2955[++class440.field2956 - 1] = class385.method1818(class242.method1123(class440.field2965[class176.field1224], class440.field2965[1 + class176.field1224], class13.field75));
						return 1;
					} else {
						int var12;
						byte[] var15;
						class282 var17;
						if (var0 == 4108) {
							var4 = class440.field2965[--class176.field1224];
							class440.field2956 -= 2;
							var10 = class440.field2955[class440.field2956];
							var12 = class440.field2955[class440.field2956 + 1];
							var15 = class408.field2805.method39(var12, 0);
							var17 = new class282(var15);
							class440.field2955[++class440.field2956 - 1] = var17.method1059(var4, var10);
							return 1;
						} else if (var0 == 4109) {
							var4 = class440.field2965[--class176.field1224];
							class440.field2956 -= 2;
							var10 = class440.field2955[class440.field2956];
							var12 = class440.field2955[1 + class440.field2956];
							var15 = class408.field2805.method39(var12, 0);
							var17 = new class282(var15);
							class440.field2955[++class440.field2956 - 1] = var17.method1035(var4, var10);
							return 1;
						} else if (var0 == 4110) {
							class176.field1224 -= 2;
							var4 = class440.field2965[class176.field1224];
							var5 = class440.field2965[1 + class176.field1224];
							if (class440.field2955[--class440.field2956] == 1) {
								class440.field2965[++class176.field1224 - 1] = var4;
							} else {
								class440.field2965[++class176.field1224 - 1] = var5;
							}

							return 1;
						} else if (var0 == 4111) {
							var4 = class440.field2965[--class176.field1224];
							class440.field2965[++class176.field1224 - 1] = class229.method1036(var4);
							return 1;
						} else if (var0 == 4112) {
							var4 = class440.field2965[--class176.field1224];
							var10 = class440.field2955[--class440.field2956];
							class440.field2965[++class176.field1224 - 1] = var4 + (char)var10;
							return 1;
						} else if (var0 == 4113) {
							var13 = class440.field2955[--class440.field2956];
							class440.field2955[++class440.field2956 - 1] = class385.method1817((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4114) {
							var13 = class440.field2955[--class440.field2956];
							class440.field2955[++class440.field2956 - 1] = class385.method1808((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4115) {
							var13 = class440.field2955[--class440.field2956];
							class440.field2955[++class440.field2956 - 1] = class385.method1815((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4116) {
							var13 = class440.field2955[--class440.field2956];
							class440.field2955[++class440.field2956 - 1] = class385.method1820((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4117) {
							var4 = class440.field2965[--class176.field1224];
							if (var4 != null) {
								class440.field2955[++class440.field2956 - 1] = var4.length();
							} else {
								class440.field2955[++class440.field2956 - 1] = 0;
							}

							return 1;
						} else if (var0 == 4118) {
							var4 = class440.field2965[--class176.field1224];
							class440.field2956 -= 2;
							var10 = class440.field2955[class440.field2956];
							var12 = class440.field2955[class440.field2956 + 1];
							class440.field2965[++class176.field1224 - 1] = var4.substring(var10, var12);
							return 1;
						} else if (var0 == 4119) {
							var4 = class440.field2965[--class176.field1224];
							StringBuilder var11 = new StringBuilder(var4.length());
							boolean var14 = false;

							for (var7 = 0; var7 < var4.length(); ++var7) {
								char var8 = var4.charAt(var7);
								if (var8 == '<') {
									var14 = true;
								} else if (var8 == '>') {
									var14 = false;
								} else if (!var14) {
									var11.append(var8);
								}
							}

							class440.field2965[++class176.field1224 - 1] = var11.toString();
							return 1;
						} else if (var0 == 4120) {
							var4 = class440.field2965[--class176.field1224];
							var10 = class440.field2955[--class440.field2956];
							class440.field2955[++class440.field2956 - 1] = var4.indexOf(var10);
							return 1;
						} else if (var0 == 4121) {
							class176.field1224 -= 2;
							var4 = class440.field2965[class176.field1224];
							var5 = class440.field2965[class176.field1224 + 1];
							var12 = class440.field2955[--class440.field2956];
							class440.field2955[++class440.field2956 - 1] = var4.indexOf(var5, var12);
							return 1;
						} else if (var0 == 4122) {
							var4 = class440.field2965[--class176.field1224];
							class440.field2965[++class176.field1224 - 1] = var4.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class176.field1224 -= 3;
							var4 = class440.field2965[class176.field1224];
							var5 = class440.field2965[class176.field1224 + 1];
							String var6 = class440.field2965[class176.field1224 + 2];
							if (null == class114.field720.field2989) {
								class440.field2965[++class176.field1224 - 1] = var6;
								return 1;
							} else {
								switch(class114.field720.field2989.field1204) {
								case 0:
									class440.field2965[++class176.field1224 - 1] = var4;
									break;
								case 1:
									class440.field2965[++class176.field1224 - 1] = var5;
									break;
								case 2:
								default:
									class440.field2965[++class176.field1224 - 1] = var6;
								}

								return 1;
							}
						} else {
							return 2;
						}
					}
				} else {
					class176.field1224 -= 2;
					var4 = class440.field2965[class176.field1224];
					var5 = class440.field2965[1 + class176.field1224];
					if (null != class114.field720.field2989 && class114.field720.field2989.field1201 != 0) {
						class440.field2965[++class176.field1224 - 1] = var5;
					} else {
						class440.field2965[++class176.field1224 - 1] = var4;
					}

					return 1;
				}
			}
		}
	}
}
