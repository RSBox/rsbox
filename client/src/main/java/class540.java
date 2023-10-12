import java.io.IOException;

public class class540 {
	boolean field4227;
	PacketBuffer field4220;
	class444 field4223;
	ServerPacket field4215;
	ServerPacket serverPacket;
	ServerPacket field4226;
	ServerPacket field4228;
	Buffer field4218;
	class86 field4216;
	int field4217;
	int field4222;
	int field4224;
	int field4225;
	public class534 field4219;

	class540() {
		this.field4223 = new class444();
		this.field4217 = 0;
		this.field4218 = new Buffer(5000);
		this.field4220 = new PacketBuffer(40000);
		this.serverPacket = null;
		this.field4222 = 0;
		this.field4227 = true;
		this.field4224 = 0;
		this.field4225 = 0;
	}

	final void method2613() {
		this.field4223.method2092();
		this.field4217 = 0;
	}

	final void method2608() throws IOException {
		if (this.field4216 != null && this.field4217 > 0) {
			this.field4218.offset = 0;

			while (true) {
				class341 var2 = (class341)this.field4223.method2088();
				if (var2 == null || var2.field2393 > this.field4218.data.length - this.field4218.offset) {
					this.field4216.method403(this.field4218.data, 0, this.field4218.offset);
					this.field4225 = 0;
					break;
				}

				this.field4218.writeBytes(var2.buffer.data, 0, var2.field2393);
				this.field4217 -= var2.field2393;
				var2.method1719();
				var2.buffer.method2457();
				var2.method1654();
			}
		}

	}

	public final void method2612(class341 var1) {
		this.field4223.method2095(var1);
		var1.field2393 = var1.buffer.offset;
		var1.buffer.offset = 0;
		this.field4217 += var1.field2393;
	}

	void method2609(class86 var1) {
		this.field4216 = var1;
	}

	void method2610() {
		if (null != this.field4216) {
			this.field4216.method406();
			this.field4216 = null;
		}

	}

	void method2607() {
		this.field4216 = null;
	}

	class86 method2611() {
		return this.field4216;
	}
}
