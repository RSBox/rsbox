import java.util.Locale;

@class187
@class338
public class class66 implements class501 {
	public static final class66 field408;
	public static final class66 field416;
	public static final class66 field419;
	static class198 field417;
	static int field407;
	static final class66 field409;
	static final class66 field410;
	static final class66 field411;
	static final class66 field412;
	static final class66[] field418;
	final int field415;
	final String field413;
	final String field414;

	static {
		field419 = new class66("EN", "en", "English", class518.field4094, 0, "GB");
		field411 = new class66("DE", "de", "German", class518.field4094, 1, "DE");
		field408 = new class66("FR", "fr", "French", class518.field4094, 2, "FR");
		field409 = new class66("PT", "pt", "Portuguese", class518.field4094, 3, "BR");
		field410 = new class66("NL", "nl", "Dutch", class518.field4089, 4, "NL");
		field416 = new class66("ES", "es", "Spanish", class518.field4089, 5, "ES");
		field412 = new class66("ES_MX", "es-mx", "Spanish (Latin American)", class518.field4094, 6, "MX");
		class66[] var0 = method300();
		field418 = new class66[var0.length];
		class66[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class66 var3 = var1[var2];
			if (null != field418[var3.field415]) {
				throw new IllegalStateException();
			}

			field418[var3.field415] = var3;
		}

	}

	class66(String var1, String var2, String var3, class518 var4, int var5, String var6) {
		this.field413 = var1;
		this.field414 = var2;
		this.field415 = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	String method299() {
		return this.field414;
	}

	@Override
	public int getId() {
		return this.field415;
	}

	@Override
	public String toString() {
		return this.method299().toLowerCase(Locale.ENGLISH);
	}

	public static void method301() {
		class393.field2671.method1679();
	}

	static class66[] method300() {
		return new class66[]{field416, field409, field408, field410, field419, field411, field412};
	}

	public static class66 method302(int var0) {
		return var0 >= 0 && var0 < field418.length ? field418[var0] : null;
	}
}
