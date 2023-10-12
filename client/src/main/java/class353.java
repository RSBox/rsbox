import java.util.Iterator;
import java.util.LinkedList;

public class class353 {
	static int field2437;
	boolean field2448;
	class370 field2443;
	int field2439;
	int field2440;
	int field2441;
	int field2442;
	int field2444;
	int field2445;
	int field2447;
	int field2450;
	String field2438;
	String field2446;
	LinkedList field2449;

	public class353() {
		this.field2439 = -1;
		this.field2440 = -1;
		this.field2441 = -16777216;
		this.field2445 = -1;
		this.field2443 = null;
		this.field2442 = Integer.MAX_VALUE;
		this.field2444 = 0;
		this.field2450 = Integer.MAX_VALUE;
		this.field2447 = 0;
		this.field2448 = false;
	}

	public void method1681(Buffer var1, int var2, boolean var3) {
		this.field2439 = var2;
		this.field2438 = var1.readStringOrNull();
		this.field2446 = var1.readStringOrNull();
		this.field2443 = new class370(var1.readInt());
		this.field2440 = var1.readInt();
		if (var3) {
			this.field2441 = var1.readInt();
		}

		var1.readUnsignedByte();
		this.field2448 = var1.readUnsignedByte() == 1;
		this.field2445 = var1.readUnsignedByte();
		int var5 = var1.readUnsignedByte();
		this.field2449 = new LinkedList();

		for (int var6 = 0; var6 < var5; ++var6) {
			this.field2449.add(this.method1682(var1));
		}

		this.method1698();
	}

	class281 method1682(Buffer var1) {
		int var3 = var1.readUnsignedByte();
		class200[] var4 = new class200[]{class200.field1351, class200.field1352, class200.field1353, class200.field1350};
		class200 var5 = (class200)class26.method87(var4, var3);
		Object var6 = null;
		switch(var5.field1355) {
		case 0:
			var6 = new class311();
			break;
		case 1:
			var6 = new class475();
			break;
		case 2:
			var6 = new class51();
			break;
		case 3:
			var6 = new class386();
			break;
		default:
			throw new IllegalStateException("");
		}

		((class281)var6).method1479(var1);
		return (class281)var6;
	}

	public boolean method1699(int var1, int var2, int var3) {
		Iterator var5 = this.field2449.iterator();

		class281 var6;
		do {
			if (!var5.hasNext()) {
				return false;
			}

			var6 = (class281)var5.next();
		} while(!var6.method1476(var1, var2, var3));

		return true;
	}

	public boolean method1696(int var1, int var2) {
		int var4 = var1 / 64;
		int var5 = var2 / 64;
		if (var4 >= this.field2442 && var4 <= this.field2444) {
			if (var5 >= this.field2450 && var5 <= this.field2447) {
				Iterator var6 = this.field2449.iterator();

				class281 var7;
				do {
					if (!var6.hasNext()) {
						return false;
					}

					var7 = (class281)var6.next();
				} while(!var7.method1477(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int[] method1683(int var1, int var2, int var3) {
		Iterator var5 = this.field2449.iterator();

		class281 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (class281)var5.next();
		} while(!var6.method1476(var1, var2, var3));

		return var6.method1478(var1, var2, var3);
	}

	public class370 method1700(int var1, int var2) {
		Iterator var4 = this.field2449.iterator();

		class281 var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (class281)var4.next();
		} while(!var5.method1477(var1, var2));

		return var5.method1480(var1, var2);
	}

	void method1698() {
		Iterator var2 = this.field2449.iterator();

		while (var2.hasNext()) {
			class281 var3 = (class281)var2.next();
			var3.method1481(this);
		}

	}

	public int method1684() {
		return this.field2439;
	}

	public boolean method1685() {
		return this.field2448;
	}

	public String method1686() {
		return this.field2438;
	}

	public String method1687() {
		return this.field2446;
	}

	int method1701() {
		return this.field2440;
	}

	int method1688() {
		return this.field2441;
	}

	public int method1689() {
		return this.field2445;
	}

	public int method1690() {
		return this.field2442;
	}

	public int method1695() {
		return this.field2444;
	}

	public int method1691() {
		return this.field2450;
	}

	public int method1702() {
		return this.field2447;
	}

	public int method1692() {
		return this.field2443.field2561;
	}

	public int method1693() {
		return this.field2443.field2560;
	}

	public int method1694() {
		return this.field2443.field2559;
	}

	public class370 method1697() {
		return new class370(this.field2443);
	}
}
