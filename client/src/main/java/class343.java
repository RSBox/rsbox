import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class343 extends class353 {
	HashSet field2400;
	HashSet field2401;
	List field2399;

	class343() {
	}

	void method1661(Buffer var1, Buffer var2, int var3, boolean var4, boolean var5) {
		this.method1681(var1, var3, var5);
		int var7 = var2.readUnsignedShort();
		this.field2401 = new HashSet(var7);

		int var8;
		for (var8 = 0; var8 < var7; ++var8) {
			class60 var9 = new class60();

			try {
				var9.method256(var2);
			} catch (IllegalStateException var13) {
				continue;
			}

			this.field2401.add(var9);
		}

		var8 = var2.readUnsignedShort();
		this.field2400 = new HashSet(var8);

		for (int var14 = 0; var14 < var8; ++var14) {
			class232 var10 = new class232();

			try {
				var10.method1071(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field2400.add(var10);
		}

		this.method1660(var2, var4);
	}

	void method1660(Buffer var1, boolean var2) {
		this.field2399 = new LinkedList();
		int var4 = var1.readUnsignedShort();

		for (int var5 = 0; var5 < var4; ++var5) {
			int var6 = var1.method2482();
			class370 var7 = new class370(var1.readInt());
			boolean var8 = var1.readUnsignedByte() == 1;
			if (var2 || !var8) {
				this.field2399.add(new class512((class370)null, var7, var6, (class40)null));
			}
		}

	}
}
