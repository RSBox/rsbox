import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class98 {
	static int field635;
	boolean field634;
	boolean field636;
	boolean field637;
	boolean field646;
	double field639;
	int field638;
	int field640;
	int field641;
	int field642;
	int field644;
	int field647;
	String field643;
	final Map field645;

	class98() {
		this.field646 = false;
		this.field637 = false;
		this.field639 = 0.8D;
		this.field640 = 127;
		this.field642 = 127;
		this.field641 = 127;
		this.field638 = -1;
		this.field643 = null;
		this.field644 = 1;
		this.field645 = new LinkedHashMap();
		this.method435(true);
	}

	class98(Buffer var1) {
		this.field646 = false;
		this.field637 = false;
		this.field639 = 0.8D;
		this.field640 = 127;
		this.field642 = 127;
		this.field641 = 127;
		this.field638 = -1;
		this.field643 = null;
		this.field644 = 1;
		this.field645 = new LinkedHashMap();
		if (var1 != null && var1.data != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= 10) {
				if (var1.readUnsignedByte() == 1) {
					this.field634 = true;
				}

				if (var2 > 1) {
					this.field636 = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.field644 = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.field645.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.field643 = var1.readString();
				}

				if (var2 > 5) {
					this.field646 = var1.readBoolean();
				}

				if (var2 > 6) {
					this.field639 = (double)var1.readUnsignedByte() / 100.0D;
					this.field640 = var1.readUnsignedByte();
					this.field642 = var1.readUnsignedByte();
					this.field641 = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field638 = var1.readUnsignedByte();
				}

				if (var2 > 8) {
					this.field637 = var1.readUnsignedByte() == 1;
				}

				if (var2 > 9) {
					this.field647 = var1.readInt();
				}
			} else {
				this.method435(true);
			}
		} else {
			this.method435(true);
		}

	}

	void method435(boolean var1) {
	}

	Buffer method436() {
		Buffer var2 = new Buffer(417, true);
		var2.writeByte(10);
		var2.writeByte(this.field634 ? 1 : 0);
		var2.writeByte(this.field636 ? 1 : 0);
		var2.writeByte(this.field644);
		var2.writeByte(this.field645.size());
		Iterator var3 = this.field645.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var2.writeInt((Integer)var4.getKey());
			var2.writeInt((Integer)var4.getValue());
		}

		var2.writeString(this.field643 != null ? this.field643 : "");
		var2.writeBoolean(this.field646);
		var2.writeByte((int)(this.field639 * 100.0D));
		var2.writeByte(this.field640);
		var2.writeByte(this.field642);
		var2.writeByte(this.field641);
		var2.writeByte(this.field638);
		var2.writeByte(this.field637 ? 1 : 0);
		var2.writeInt(this.field647);
		return var2;
	}

	void method458(boolean var1) {
		this.field634 = var1;
		method466();
	}

	boolean method437() {
		return this.field634;
	}

	void method457(boolean var1) {
		this.field646 = var1;
		method466();
	}

	boolean method439() {
		return this.field646;
	}

	void method440(boolean var1) {
		this.field636 = var1;
		method466();
	}

	boolean method438() {
		return this.field636;
	}

	void method461(boolean var1) {
		this.field637 = var1;
		method466();
	}

	void method442() {
		this.method461(!this.field637);
	}

	boolean method452() {
		return this.field637;
	}

	void method447(int var1) {
		this.field647 = var1;
		method466();
	}

	int method460() {
		return this.field647;
	}

	void method441(double var1) {
		this.field639 = var1;
		method466();
	}

	double method444() {
		return this.field639;
	}

	void method445(int var1) {
		this.field640 = var1;
		method466();
	}

	int method446() {
		return this.field640;
	}

	void method465(int var1) {
		this.field642 = var1;
		method466();
	}

	int method448() {
		return this.field642;
	}

	void method449(int var1) {
		this.field641 = var1;
		method466();
	}

	int method464() {
		return this.field641;
	}

	void method450(String var1) {
		this.field643 = var1;
		method466();
	}

	String method462() {
		return this.field643;
	}

	void method451(int var1) {
		this.field638 = var1;
		method466();
	}

	int method459() {
		return this.field638;
	}

	void method453(int var1) {
		this.field644 = var1;
		method466();
	}

	int method454() {
		return this.field644;
	}

	void method463(String var1, int var2) {
		int var4 = this.method456(var1);
		if (this.field645.size() >= 10 && !this.field645.containsKey(var4)) {
			Iterator var5 = this.field645.entrySet().iterator();
			var5.next();
			var5.remove();
		}

		this.field645.put(var4, var2);
		method466();
	}

	boolean method455(String var1) {
		int var3 = this.method456(var1);
		return this.field645.containsKey(var3);
	}

	int method443(String var1) {
		int var3 = this.method456(var1);
		return !this.field645.containsKey(var3) ? 0 : (Integer)this.field645.get(var3);
	}

	int method456(String var1) {
		return class385.method1813(var1.toLowerCase());
	}

	static class98 method467() {
		class356 var1 = null;
		class98 var2 = new class98();

		try {
			var1 = class258.method1223("", class138.field900.field3027, false);
			byte[] var3 = new byte[(int)var1.method1710()];

			int var5;
			for (int var4 = 0; var4 < var3.length; var4 += var5) {
				var5 = var1.method1711(var3, var4, var3.length - var4);
				if (var5 == -1) {
					throw new IOException();
				}
			}

			var2 = new class98(new Buffer(var3));
		} catch (Exception var7) {
		}

		try {
			if (var1 != null) {
				var1.method1708();
			}
		} catch (Exception var6) {
		}

		return var2;
	}

	static void method466() {
		class356 var1 = null;

		try {
			var1 = class258.method1223("", class138.field900.field3027, true);
			Buffer var2 = class109.field693.method436();
			var1.method1707(var2.data, 0, var2.offset);
		} catch (Exception var4) {
		}

		try {
			if (null != var1) {
				var1.method1709(true);
			}
		} catch (Exception var3) {
		}

	}
}
