public abstract class class54 implements class324 {
	class499 field250;

	class54(int var1) {
	}

	abstract void method224(Buffer var1, int var2);

	public void method221(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			class123 var4 = (class123)class26.method87(class123.method583(), var3);
			if (var4 != null) {
				switch(var4.field798) {
				case 0:
					int var6 = var1.readUnsignedByte();
					this.field250 = class419.method1920(var6);
					if (this.field250 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
				case 1:
					var1.readJagexString();
					break;
				case 2:
					class532[] var5 = new class532[]{class532.field4148, class532.field4145, class532.field4146, class532.field4144};
					class26.method87(var5, var1.readUnsignedByte());
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				}
			} else {
				this.method224(var1, var3);
			}
		}
	}

	boolean method222() {
		return this.field250 != null;
	}

	Object method223() {
		if (this.field250 == class499.field3676) {
			return 0;
		} else if (this.field250 == class499.field3675) {
			return -1L;
		} else {
			return class499.field3674 == this.field250 ? "" : null;
		}
	}
}
