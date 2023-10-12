public class class548 implements class501 {
	public static final class548 field4259;
	public static final class548 field4265;
	static class496[] field4262;
	static final class548 field4260;
	static final class548 field4261;
	static final class548 field4266;
	boolean field4258;
	boolean field4264;
	int field4263;
	String field4267;

	static {
		field4265 = new class548(0, "POST", true, true);
		field4259 = new class548(1, "GET", true, false);
		field4260 = new class548(2, "PUT", false, true);
		field4261 = new class548(3, "PATCH", false, true);
		field4266 = new class548(4, "DELETE", false, true);
	}

	class548(int var1, String var2, boolean var3, boolean var4) {
		this.field4263 = var1;
		this.field4267 = var2;
		this.field4258 = var3;
		this.field4264 = var4;
	}

	boolean method2628() {
		return this.field4258;
	}

	public String method2629() {
		return this.field4267;
	}

	boolean method2627() {
		return this.field4264;
	}

	@Override
	public int getId() {
		return this.field4263;
	}
}
