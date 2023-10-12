import java.util.LinkedList;

public abstract class class124 {
	static int field814;
	boolean field801;
	boolean field813;
	byte[][][] field809;
	byte[][][] field810;
	class222[][][][] field811;
	int field802;
	int field803;
	int field804;
	int field805;
	int field806;
	int field807;
	int field812;
	int field816;
	short[][][] field808;
	short[][][] field815;

	class124() {
		this.field807 = -1;
		this.field812 = -1;
		new LinkedList();
		this.field801 = false;
		this.field813 = false;
	}

	abstract void method589(Buffer var1);

	boolean method591() {
		return this.field801 && this.field813;
	}

	void method584(class5 var1) {
		if (!this.method591()) {
			byte[] var3 = var1.method39(this.field807, this.field812);
			if (null != var3) {
				this.method589(new Buffer(var3));
				this.field801 = true;
				this.field813 = true;
			}

		}
	}

	void method592() {
		this.field808 = (short[][][])null;
		this.field815 = (short[][][])null;
		this.field809 = (byte[][][])null;
		this.field810 = (byte[][][])null;
		this.field811 = (class222[][][][])null;
		this.field801 = false;
		this.field813 = false;
	}

	void method586(int var1, int var2, Buffer var3) {
		int var5 = var3.readUnsignedByte();
		if (var5 != 0) {
			if ((var5 & 1) != 0) {
				this.method587(var1, var2, var3, var5);
			} else {
				this.method588(var1, var2, var3, var5);
			}

		}
	}

	void method587(int var1, int var2, Buffer var3, int var4) {
		boolean var6 = (var4 & 2) != 0;
		if (var6) {
			this.field815[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.field808[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	void method588(int var1, int var2, Buffer var3, int var4) {
		int var6 = ((var4 & 24) >> 3) + 1;
		boolean var7 = (var4 & 2) != 0;
		boolean var8 = (var4 & 4) != 0;
		this.field808[0][var1][var2] = (short)var3.readUnsignedShort();
		int var9;
		int var10;
		int var12;
		if (var7) {
			var9 = var3.readUnsignedByte();

			for (var10 = 0; var10 < var9; ++var10) {
				int var11 = var3.readUnsignedShort();
				if (var11 != 0) {
					this.field815[var10][var1][var2] = (short)var11;
					var12 = var3.readUnsignedByte();
					this.field809[var10][var1][var2] = (byte)(var12 >> 2);
					this.field810[var10][var1][var2] = (byte)(var12 & 3);
				}
			}
		}

		if (var8) {
			for (var9 = 0; var9 < var6; ++var9) {
				var10 = var3.readUnsignedByte();
				if (var10 != 0) {
					class222[] var15 = this.field811[var9][var1][var2] = new class222[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						int var13 = var3.method2482();
						int var14 = var3.readUnsignedByte();
						var15[var12] = new class222(var13, var14 >> 2, var14 & 3);
					}
				}
			}
		}

	}

	int method585() {
		return this.field803;
	}

	int method590() {
		return this.field816;
	}
}
