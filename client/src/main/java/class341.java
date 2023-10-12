public class class341 extends class359 {
	static class341[] field2391;
	static int field2390;
	ClientPacket field2392;
	int field2388;
	public PacketBuffer buffer;
	public int field2393;

	static {
		field2391 = new class341[300];
		field2390 = 0;
	}

	class341() {
	}

	public void method1654() {
		if (field2390 < field2391.length) {
			field2391[++field2390 - 1] = this;
		}
	}

	static class341 method1657() {
		return field2390 == 0 ? new class341() : field2391[--field2390];
	}

	public static class341 createClientPacket(ClientPacket var0, class534 var1) {
		class341 var3 = method1657();
		var3.field2392 = var0;
		var3.field2388 = var0.field3144;
		if (var3.field2388 == -1) {
			var3.buffer = new PacketBuffer(260);
		} else if (var3.field2388 == -2) {
			var3.buffer = new PacketBuffer(10000);
		} else if (var3.field2388 <= 18) {
			var3.buffer = new PacketBuffer(20);
		} else if (var3.field2388 <= 98) {
			var3.buffer = new PacketBuffer(100);
		} else {
			var3.buffer = new PacketBuffer(260);
		}

		var3.buffer.method1503(var1);
		var3.buffer.method1502(var3.field2392.field3143);
		var3.field2393 = 0;
		return var3;
	}

	public static class341 method1655() {
		class341 var1 = method1657();
		var1.field2392 = null;
		var1.field2388 = 0;
		var1.buffer = new PacketBuffer(5000);
		return var1;
	}
}
