public class class539 extends class485 {
	static int field4214;
	int field4212;
	final class126 field4213;
	final class48 field4209;
	public byte field4207;
	public int field4208;
	public String field4210;
	public String field4211;

	public class539(class126 var1, class48 var2) {
		super(500);
		this.field4210 = null;
		this.field4211 = null;
		this.field4212 = 1;
		this.field4213 = var1;
		this.field4209 = var2;
	}

	@Override
	class284 method2243() {
		return new class173();
	}

	@Override
	class284[] method2244(int var1) {
		return new class173[var1];
	}

	final void method2601(String var1) {
		long var6 = 0L;
		int var8 = var1.length();

		for (int var9 = 0; var9 < var8; ++var9) {
			var6 *= 37L;
			char var10 = var1.charAt(var9);
			if (var10 >= 'A' && var10 <= 'Z') {
				var6 += (long)(var10 + 1 - 65);
			} else if (var10 >= 'a' && var10 <= 'z') {
				var6 += (long)(var10 + 1 - 97);
			} else if (var10 >= '0' && var10 <= '9') {
				var6 += (long)(var10 + 27 - 48);
			}

			if (var6 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var6 % 37L && var6 != 0L) {
			var6 /= 37L;
		}

		String var11 = class132.method612(var6);
		if (var11 == null) {
			var11 = "";
		}

		this.field4210 = var11;
	}

	final void method2602(String var1) {
		long var6 = 0L;
		int var8 = var1.length();

		for (int var9 = 0; var9 < var8; ++var9) {
			var6 *= 37L;
			char var10 = var1.charAt(var9);
			if (var10 >= 'A' && var10 <= 'Z') {
				var6 += (long)(var10 + 1 - 65);
			} else if (var10 >= 'a' && var10 <= 'z') {
				var6 += (long)(var10 + 1 - 97);
			} else if (var10 >= '0' && var10 <= '9') {
				var6 += (long)(var10 + 27 - 48);
			}

			if (var6 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var6 % 37L && var6 != 0L) {
			var6 /= 37L;
		}

		String var11 = class132.method612(var6);
		if (var11 == null) {
			var11 = "";
		}

		this.field4211 = var11;
	}

	public final void method2606(Buffer var1, int var2) {
		this.method2602(var1.readStringOrNull());
		long var4 = var1.readLong();
		this.method2601(class132.method613(var4));
		this.field4207 = var1.readByte();
		int var6;
		short var7;
		if (var2 == 1) {
			var6 = var1.readUnsignedByte();
			var7 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var6 = var1.method2480();
			var7 = -1;
		}

		if (var6 != var7) {
			int var8 = var6;
			this.method2251();

			for (int var9 = 0; var9 < var8; ++var9) {
				class173 var10 = (class173)this.method2236(new class509(var1.readStringOrNull(), this.field4213));
				int var11 = var1.readUnsignedShort();
				var10.method509(var11, ++this.field4212 - 1);
				var10.field705 = var1.readByte();
				var1.readStringOrNull();
				this.method2605(var10);
			}

		}
	}

	public final void method2600(Buffer var1) {
		class509 var3 = new class509(var1.readStringOrNull(), this.field4213);
		int var4 = var1.readUnsignedShort();
		byte var5 = var1.readByte();
		boolean var6 = false;
		if (var5 == -128) {
			var6 = true;
		}

		class173 var7;
		if (var6) {
			if (this.method2250() == 0) {
				return;
			}

			var7 = (class173)this.method2241(var3);
			if (null != var7 && var7.method510() == var4) {
				this.method2231(var7);
			}
		} else {
			var1.readStringOrNull();
			var7 = (class173)this.method2241(var3);
			if (var7 == null) {
				if (this.method2250() > super.field3404) {
					return;
				}

				var7 = (class173)this.method2236(var3);
			}

			var7.method509(var4, ++this.field4212 - 1);
			var7.field705 = var5;
			this.method2605(var7);
		}

	}

	public final void method2603() {
		for (int var2 = 0; var2 < this.method2250(); ++var2) {
			((class173)this.method2237(var2)).method913();
		}

	}

	public final void method2604() {
		for (int var2 = 0; var2 < this.method2250(); ++var2) {
			((class173)this.method2237(var2)).method915();
		}

	}

	final void method2605(class173 var1) {
		if (var1.method1490().equals(this.field4209.method199())) {
			this.field4208 = var1.field705;
		}

	}
}
