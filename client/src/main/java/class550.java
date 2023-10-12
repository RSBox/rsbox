public class class550 implements class501 {
	public static final class550 field4273;
	public static final class550 field4278;
	public static final class550 field4280;
	public static final class550 field4282;
	public static final class550 field4288;
	public static final class550 field4289;
	public static final class550 field4292;
	public static final class550 field4295;
	public static final class550 field4297;
	public static final class550 field4301;
	public static final class550 field4302;
	static final class550 field4272;
	static final class550 field4274;
	static final class550 field4275;
	static final class550 field4276;
	static final class550 field4277;
	static final class550 field4279;
	static final class550 field4281;
	static final class550 field4283;
	static final class550 field4284;
	static final class550 field4285;
	static final class550 field4286;
	static final class550 field4287;
	static final class550 field4290;
	static final class550 field4291;
	static final class550 field4293;
	static final class550 field4294;
	static final class550 field4296;
	static final class550 field4298;
	static final class550 field4299;
	static final class550 field4300;
	static final class550 field4303;
	final int field4304;

	static {
		field4292 = new class550(1);
		field4288 = new class550(2);
		field4273 = new class550(4);
		field4295 = new class550(8);
		field4303 = new class550(16);
		field4277 = new class550(32);
		field4274 = new class550(64, true);
		field4276 = new class550(128);
		field4280 = new class550(256, true);
		field4275 = new class550(512);
		field4282 = new class550(1024);
		field4283 = new class550(2048);
		field4284 = new class550(4096);
		field4285 = new class550(8192);
		field4286 = new class550(16384);
		field4287 = new class550(32768);
		field4289 = new class550(65536);
		field4279 = new class550(131072);
		field4290 = new class550(262144);
		field4291 = new class550(524288);
		field4281 = new class550(1048576);
		field4293 = new class550(2097152);
		field4294 = new class550(4194304);
		field4272 = new class550(8388608);
		field4296 = new class550(16777216);
		field4297 = new class550(33554432);
		field4298 = new class550(67108864, true);
		field4278 = new class550(134217728);
		field4300 = new class550(268435456);
		field4301 = new class550(536870912, true);
		field4302 = new class550(1073741824, true);
		field4299 = new class550(Integer.MIN_VALUE);
	}

	class550(int var1, boolean var2) {
		this.field4304 = var1;
	}

	class550(int var1) {
		this(var1, false);
	}

	@Override
	public int getId() {
		return this.field4304;
	}
}
