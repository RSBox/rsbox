public class class358 implements class501 {
	static class198 field2470;
	static final class358 field2462;
	static final class358 field2463;
	static final class358 field2464;
	static final class358 field2465;
	static final class358 field2466;
	static final class358 field2467;
	final int field2468;
	final int field2469;

	static {
		field2465 = new class358(0, -1);
		field2463 = new class358(1, 2);
		field2462 = new class358(2, 3);
		field2464 = new class358(3, 4);
		field2466 = new class358(4, 5);
		field2467 = new class358(5, 6);
	}

	class358(int var1, int var2) {
		this.field2468 = var1;
		this.field2469 = var2;
	}

	@Override
	public int getId() {
		return this.field2469;
	}

	static class358[] method1718() {
		return new class358[]{field2462, field2465, field2463, field2467, field2466, field2464};
	}

	public static boolean method1717(byte var0) {
		return Client.field2087 >= 2;
	}
}
