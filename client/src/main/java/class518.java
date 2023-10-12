import java.util.HashSet;
import java.util.Set;

public class class518 implements class501 {
	static final class518 field4087;
	static final class518 field4088;
	static final class518 field4089;
	static final class518 field4090;
	static final class518 field4091;
	static final class518 field4092;
	static final class518 field4093;
	static final class518 field4094;
	static final class518 field4095;
	static final class518 field4096;
	static final class518 field4097;
	static final class518 field4098;
	static final class518 field4101;
	final int field4099;
	final Set field4100;

	static {
		field4094 = new class518("", 0, new class235[]{class235.field1563, class235.field1560});
		field4101 = new class518("", 1, new class235[]{class235.field1562, class235.field1563, class235.field1560});
		field4088 = new class518("", 2, new class235[]{class235.field1562, class235.field1561, class235.field1563});
		field4089 = new class518("", 3, new class235[]{class235.field1562});
		field4092 = new class518("", 4);
		field4090 = new class518("", 5, new class235[]{class235.field1562, class235.field1563});
		field4096 = new class518("", 6, new class235[]{class235.field1563});
		field4093 = new class518("", 8, new class235[]{class235.field1562, class235.field1563});
		field4097 = new class518("", 9, new class235[]{class235.field1562, class235.field1561});
		field4095 = new class518("", 10, new class235[]{class235.field1562});
		field4091 = new class518("", 11, new class235[]{class235.field1562});
		field4087 = new class518("", 12, new class235[]{class235.field1562, class235.field1563});
		field4098 = new class518("", 13, new class235[]{class235.field1562});
		method2436();
	}

	class518(String var1, int var2) {
		this.field4100 = new HashSet();
		this.field4099 = var2;
	}

	class518(String var1, int var2, class235[] var3) {
		this.field4100 = new HashSet();
		this.field4099 = var2;
		class235[] var4 = var3;

		for (int var5 = 0; var5 < var4.length; ++var5) {
			class235 var6 = var4[var5];
			this.field4100.add(var6);
		}

	}

	@Override
	public int getId() {
		return this.field4099;
	}

	static class518[] method2436() {
		return new class518[]{field4087, field4093, field4101, field4092, field4088, field4097, field4089, field4091, field4095, field4096, field4098, field4094, field4090};
	}
}
