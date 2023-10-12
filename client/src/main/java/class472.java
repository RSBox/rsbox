import java.util.Comparator;

public class class472 implements Comparator {
	public static class323 field3312;
	static class42[] field3311;
	final boolean field3310;

	public class472(boolean var1) {
		this.field3310 = var1;
	}

	int method2188(class111 var1, class111 var2) {
		return this.field3310 ? var1.field703 - var2.field703 : var2.field703 - var1.field703;
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method2188((class111)var1, (class111)var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
