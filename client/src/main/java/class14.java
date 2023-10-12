import java.util.ArrayList;
import java.util.Iterator;

public class class14 {
	static int field78;
	class444 field77;
	long field79;
	public int field76;

	public class14(Buffer var1) {
		this.field76 = -1;
		this.field77 = new class444();
		this.method63(var1);
	}

	void method63(Buffer var1) {
		this.field79 = var1.readLong();
		this.field76 = var1.readInt();

		for (int var3 = var1.readUnsignedByte(); var3 != 0; var3 = var1.readUnsignedByte()) {
			Object var4;
			if (var3 == 3) {
				var4 = new class61(this);
			} else if (var3 == 1) {
				var4 = new class237(this);
			} else if (var3 == 13) {
				var4 = new class396(this);
			} else if (var3 == 4) {
				var4 = new class529(this);
			} else if (var3 == 6) {
				var4 = new class190(this);
			} else if (var3 == 5) {
				var4 = new class251(this);
			} else if (var3 == 2) {
				var4 = new class409(this);
			} else if (var3 == 7) {
				var4 = new class202(this);
			} else if (var3 == 14) {
				var4 = new class347(this);
			} else if (var3 == 8) {
				var4 = new class133(this);
			} else if (var3 == 9) {
				var4 = new class155(this);
			} else if (var3 == 10) {
				var4 = new class207(this);
			} else if (var3 == 11) {
				var4 = new class329(this);
			} else if (var3 == 12) {
				var4 = new class226(this);
			} else {
				if (var3 != 15) {
					throw new RuntimeException("");
				}

				var4 = new class290(this);
			}

			((class415)var4).method1905(var1);
			this.field77.method2095((class359)var4);
		}

	}

	public void method62(class511 var1) {
		if (this.field79 == var1.field3722 && this.field76 == var1.field3723) {
			for (class415 var3 = (class415)this.field77.method2088(); var3 != null; var3 = (class415)this.field77.method2097()) {
				var3.method1906(var1);
			}

			++var1.field3723;
		} else {
			throw new RuntimeException("");
		}
	}

	public static void method61(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class483.field3384.clear();
			class483.field3391.clear();
			class483.method2220(var5);
			class483.method2228(var0, var5);
			if (!class483.field3384.isEmpty()) {
				class483.method2217(var1, var2, var3, var4);
				class483.field3391.add(new class299((class4)null));
				class483.field3391.add(new class495((class4)null, class483.field3395, class483.field3385, class483.field3388));
				ArrayList var7 = new ArrayList();
				var7.add(new class262(new class99((class4)null, 0, true, class483.field3386)));
				if (!class483.field3389.isEmpty()) {
					ArrayList var8 = new ArrayList();
					var8.add(new class395(new class390((class4)null, var7), class483.field3392));
					ArrayList var10 = new ArrayList();
					Iterator var11 = class483.field3389.iterator();

					while (var11.hasNext()) {
						class407 var12 = (class407)var11.next();
						var10.add(var12);
					}

					var8.add(new class395(new class189(new class506((class4)null, var10), 0, false, class483.field3394), class483.field3393));
					class483.field3391.add(new class390((class4)null, var8));
				} else {
					class483.field3391.add(new class395((class4)null, class483.field3392));
					class483.field3391.add(new class390((class4)null, var7));
				}

			}
		}
	}

	static final void method64(String var0, int var1) {
		class341 var3 = class341.createClientPacket(ClientPacket.field3048, Client.field1891.field4219);
		var3.buffer.writeByte(Buffer.method2535(var0) + 1);
		var3.buffer.writeString(var0);
		var3.buffer.writeByteNEG(var1);
		Client.field1891.method2612(var3);
	}
}
