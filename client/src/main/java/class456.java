public class class456 implements class501 {
	public static final class456 field3024;
	static final class456 field3022;
	static final class456 field3023;
	static final class456 field3025;
	static final class456 field3026;
	static final class456 field3029;
	final int field3028;
	public final String field3027;

	static {
		field3025 = new class456("runescape", "RuneScape", 0);
		field3022 = new class456("stellardawn", "Stellar Dawn", 1);
		field3023 = new class456("game3", "Game 3", 2);
		field3026 = new class456("game4", "Game 4", 3);
		field3029 = new class456("game5", "Game 5", 4);
		field3024 = new class456("oldscape", "RuneScape 2007", 5);
	}

	class456(String var1, String var2, int var3) {
		this.field3027 = var1;
		this.field3028 = var3;
	}

	@Override
	public int getId() {
		return this.field3028;
	}

	public static class456[] method2131() {
		return new class456[]{field3023, field3029, field3025, field3022, field3024, field3026};
	}
}
