import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class398 extends class359 {
	static class230 field2746;
	boolean field2739;
	boolean field2740;
	int[] field2743;
	public byte field2744;
	public byte field2745;
	public String field2741;
	public List field2738;
	public long field2742;

	static {
		new BitSet(65536);
	}

	public class398(Buffer var1) {
		this.field2739 = true;
		this.field2741 = null;
		this.method1856(var1);
	}

	public int[] method1851() {
		if (null == this.field2743) {
			String[] var2 = new String[this.field2738.size()];
			this.field2743 = new int[this.field2738.size()];

			for (int var3 = 0; var3 < this.field2738.size(); this.field2743[var3] = var3++) {
				var2[var3] = ((class455)this.field2738.get(var3)).field3021.method2399();
			}

			int[] var4 = this.field2743;
			class551.method2634(var2, var4, 0, var2.length - 1);
		}

		return this.field2743;
	}

	void method1852(class455 var1) {
		this.field2738.add(var1);
		this.field2743 = null;
	}

	void method1853(int var1) {
		this.field2738.remove(var1);
		this.field2743 = null;
	}

	public int method1854() {
		return this.field2738.size();
	}

	public int method1855(String var1) {
		if (!this.field2739) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var3 = 0; var3 < this.field2738.size(); ++var3) {
				if (((class455)this.field2738.get(var3)).field3021.method2398().equalsIgnoreCase(var1)) {
					return var3;
				}
			}

			return -1;
		}
	}

	void method1856(Buffer var1) {
		int var3 = var1.readUnsignedByte();
		if ((var3 & 1) != 0) {
			this.field2740 = true;
		}

		if ((var3 & 2) != 0) {
			this.field2739 = true;
		}

		int var4 = 2;
		if ((var3 & 4) != 0) {
			var4 = var1.readUnsignedByte();
		}

		super.field2472 = var1.readLong();
		this.field2742 = var1.readLong();
		this.field2741 = var1.readStringOrNull();
		var1.readBoolean();
		this.field2745 = var1.readByte();
		this.field2744 = var1.readByte();
		int var5 = var1.readUnsignedShort();
		if (var5 > 0) {
			this.field2738 = new ArrayList(var5);

			for (int var6 = 0; var6 < var5; ++var6) {
				class455 var7 = new class455();
				if (this.field2740) {
					var1.readLong();
				}

				if (this.field2739) {
					var7.field3021 = new class509(var1.readStringOrNull());
				}

				var7.field3018 = var1.readByte();
				var7.field3019 = var1.readUnsignedShort();
				if (var4 >= 3) {
					var1.readBoolean();
				}

				this.field2738.add(var6, var7);
			}
		}

	}

	static final InterfaceComponent method1857(int var0, int var1, int var2) {
		InterfaceComponent var4 = new InterfaceComponent();
		var4.group = var1;
		var4.field2204 = var2;
		Client.interfaceComponents.put(var4, (long)var0);
		Client.method1434(var1);
		class496 var5 = class208.interfaceConfigs.method345(var0);
		Client.method1363(var5);
		if (null != Client.field1936) {
			Client.method1363(Client.field1936);
			Client.field1936 = null;
		}

		class145.method788(class208.interfaceConfigs.components[var0 >> 16], var5, false);
		class440.method2063(var1);
		if (Client.rootInterface != -1) {
			Client.runInterfaceListeners(Client.rootInterface, 1);
		}

		return var4;
	}
}
