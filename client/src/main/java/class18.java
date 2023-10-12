public class class18 extends class485 {
	static String[] field88;
	int field89;
	final class126 field91;
	public class403 field90;

	public class18(class126 var1) {
		super(400);
		this.field89 = 1;
		this.field90 = new class403();
		this.field91 = var1;
	}

	@Override
	class284 method2243() {
		return new class268();
	}

	@Override
	class284[] method2244(int var1) {
		return new class268[var1];
	}

	public boolean method72(class509 var1, boolean var2) {
		class268 var4 = (class268)this.method2233(var1);
		return null != var4;
	}

	public void method73(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) {
				boolean var4 = var1.readUnsignedByte() == 1;
				class509 var5 = new class509(var1.readStringOrNull(), this.field91);
				class509 var6 = new class509(var1.readStringOrNull(), this.field91);
				int var7 = var1.readUnsignedShort();
				int var8 = var1.readUnsignedByte();
				int var9 = var1.readUnsignedByte();
				boolean var10 = (var9 & 2) != 0;
				boolean var11 = (var9 & 1) != 0;
				if (var7 > 0) {
					var1.readStringOrNull();
					var1.readUnsignedByte();
					var1.readInt();
				}

				var1.readStringOrNull();
				if (null != var5 && var5.method2401()) {
					class268 var12 = (class268)this.method2241(var5);
					if (var4) {
						class268 var13 = (class268)this.method2241(var6);
						if (var13 != null && var12 != var13) {
							if (var12 != null) {
								this.method2231(var13);
							} else {
								var12 = var13;
							}
						}
					}

					if (null != var12) {
						this.method2239(var12, var5, var6);
						if (var7 != var12.field704) {
							boolean var15 = true;

							for (class8 var14 = (class8)this.field90.method1861(); null != var14; var14 = (class8)this.field90.method1862()) {
								if (var14.field37.equals(var5)) {
									if (var7 != 0 && var14.field39 == 0) {
										var14.method1129();
										var15 = false;
									} else if (var7 == 0 && var14.field39 != 0) {
										var14.method1129();
										var15 = false;
									}
								}
							}

							if (var15) {
								this.field90.method1860(new class8(var5, var7));
							}
						}
					} else {
						if (this.method2250() >= 400) {
							continue;
						}

						var12 = (class268)this.method2230(var5, var6);
					}

					if (var12.field704 != var7) {
						var12.field703 = ++this.field89 - 1;
						if (var12.field704 == -1 && var7 == 0) {
							var12.field703 = -(var12.field703 * 1199192167) * 885089111;
						}

						var12.field704 = var7;
					}

					var12.field705 = var8;
					var12.field1785 = var10;
					var12.field1784 = var11;
					continue;
				}

				throw new IllegalStateException();
			}

			this.method2238();
			return;
		}
	}
}
