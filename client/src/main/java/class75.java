public class class75 extends class485 {
	final class126 field526;

	public class75(class126 var1) {
		super(400);
		this.field526 = var1;
	}

	@Override
	class284 method2243() {
		return new class181();
	}

	@Override
	class284[] method2244(int var1) {
		return new class181[var1];
	}

	public void method368(Buffer var1, int var2) {
		while (var1.offset < var2) {
			int var4 = var1.readUnsignedByte();
			if (var4 == 4) {
				class509 var10 = new class509(var1.readStringOrNull(), this.field526);
				if (!var10.method2401()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				class35.field176.method380(var10.method2398(), false);
			} else {
				boolean var5 = (var4 & 1) != 0;
				class509 var6 = new class509(var1.readStringOrNull(), this.field526);
				class509 var7 = new class509(var1.readStringOrNull(), this.field526);
				var1.readStringOrNull();
				if (!var6.method2401()) {
					throw new IllegalStateException();
				}

				class181 var8 = (class181)this.method2241(var6);
				if (var5) {
					class181 var9 = (class181)this.method2241(var7);
					if (null != var9 && var8 != var9) {
						if (null != var8) {
							this.method2231(var9);
						} else {
							var8 = var9;
						}
					}
				}

				if (null != var8) {
					this.method2239(var8, var6, var7);
				} else if (this.method2250() < 400) {
					int var12 = this.method2250();
					var8 = (class181)this.method2230(var6, var7);
					var8.field1271 = var12;
				}
			}
		}

	}
}
