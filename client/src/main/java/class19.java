import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class class19 extends class292 {
	boolean field97;
	class234[][] field99;
	int field94;
	int field96;
	List field93;
	Future field98;
	public class234[][] field92;
	public class307 field95;

	public class19(class5 var1, class5 var2, int var3, boolean var4) {
		this.field92 = (class234[][])null;
		this.field99 = (class234[][])null;
		this.field96 = 0;
		this.field94 = var3;
		byte[] var5 = var1.method39(this.field94 >> 16 & 65535, this.field94 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9 = var2.method37(var8, 0);
		this.field95 = new class307(var8, var9);
		this.field93 = new ArrayList();
		this.field98 = class209.field1389.submit(new class276(this, var6, var7));
	}

	void method81(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field96 = var1.readUnsignedByte();
		int var4 = var1.readUnsignedShort();
		this.field99 = new class234[this.field95.method1565().method430()][];
		this.field92 = new class234[this.field95.method1564()][];
		class16[] var5 = new class16[var4];

		int var6;
		int var8;
		for (var6 = 0; var6 < var4; ++var6) {
			class10 var7 = class10.method48(var1.readUnsignedByte());
			var8 = var1.method2517();
			class23 var9 = class400.method1858(var1.readUnsignedByte());
			class234 var10 = new class234();
			var10.method1084(var1, var2);
			var5[var6] = new class16(this, var10, var7, var9, var8);
			int var11 = var7.method46();
			class234[][] var12;
			if (class10.field50 == var7) {
				var12 = this.field99;
			} else {
				var12 = this.field92;
			}

			if (null == var12[var8]) {
				var12[var8] = new class234[var11];
			}

			if (var7 == class10.field46) {
				this.field97 = true;
			}
		}

		var6 = var4 / class217.field1414;
		int var13 = var4 % class217.field1414;
		int var14 = 0;

		for (int var15 = 0; var15 < class217.field1414; ++var15) {
			var8 = var14;
			var14 += var6;
			if (var13 > 0) {
				++var14;
				--var13;
			}

			if (var14 == var8) {
				break;
			}

			this.field93.add(class209.field1389.submit(new class524(this, var8, var14, var5)));
		}

	}

	public boolean method79() {
		if (this.field98 == null && this.field93 == null) {
			return true;
		} else {
			if (null != this.field98) {
				if (!this.field98.isDone()) {
					return false;
				}

				this.field98 = null;
			}

			boolean var2 = true;

			for (int var3 = 0; var3 < this.field93.size(); ++var3) {
				if (!((Future)this.field93.get(var3)).isDone()) {
					var2 = false;
				} else {
					this.field93.remove(var3);
					--var3;
				}
			}

			if (!var2) {
				return false;
			} else {
				this.field93 = null;
				return true;
			}
		}
	}

	public int method82() {
		return this.field96;
	}

	public boolean method76() {
		return this.field97;
	}

	public void method77(int var1, class457 var2, int var3, int var4) {
		class64 var6 = class64.method287();
		this.method78(var6, var3, var2, var1);
		this.method75(var6, var3, var2, var1);
		this.method80(var6, var3, var2, var1);
		var2.method2142(var6);
		var6.method284();
	}

	void method78(class64 var1, int var2, class457 var3, int var4) {
		float[] var6 = var3.method2138(this.field96);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field99[var2] != null) {
			class234 var10 = this.field99[var2][0];
			class234 var11 = this.field99[var2][1];
			class234 var12 = this.field99[var2][2];
			if (var10 != null) {
				var7 = var10.method1081(var4);
			}

			if (var11 != null) {
				var8 = var11.method1081(var4);
			}

			if (null != var12) {
				var9 = var12.method1081(var4);
			}
		}

		class213 var15 = class213.method992();
		var15.method986(1.0F, 0.0F, 0.0F, var7);
		class213 var16 = class213.method992();
		var16.method986(0.0F, 1.0F, 0.0F, var8);
		class213 var17 = class213.method992();
		var17.method986(0.0F, 0.0F, 1.0F, var9);
		class213 var13 = class213.method992();
		var13.method989(var17);
		var13.method989(var15);
		var13.method989(var16);
		class64 var14 = class64.method287();
		var14.method281(var13);
		var1.method277(var14);
		var15.method990();
		var16.method990();
		var17.method990();
		var13.method990();
		var14.method284();
	}

	void method80(class64 var1, int var2, class457 var3, int var4) {
		float[] var6 = var3.method2141(this.field96);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.field99[var2]) {
			class234 var10 = this.field99[var2][3];
			class234 var11 = this.field99[var2][4];
			class234 var12 = this.field99[var2][5];
			if (var10 != null) {
				var7 = var10.method1081(var4);
			}

			if (null != var11) {
				var8 = var11.method1081(var4);
			}

			if (null != var12) {
				var9 = var12.method1081(var4);
			}
		}

		var1.field326[12] = var7;
		var1.field326[13] = var8;
		var1.field326[14] = var9;
	}

	void method75(class64 var1, int var2, class457 var3, int var4) {
		float[] var6 = var3.method2139(this.field96);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.field99[var2]) {
			class234 var10 = this.field99[var2][6];
			class234 var11 = this.field99[var2][7];
			class234 var12 = this.field99[var2][8];
			if (var10 != null) {
				var7 = var10.method1081(var4);
			}

			if (var11 != null) {
				var8 = var11.method1081(var4);
			}

			if (null != var12) {
				var9 = var12.method1081(var4);
			}
		}

		class64 var13 = class64.method287();
		var13.method282(var7, var8, var9);
		var1.method277(var13);
		var13.method284();
	}
}
