import java.util.Arrays;

public class class298 {
	static final class298 field2192;
	static final class298 field2193;
	static final class298 field2195;
	static final class298 field2196;
	static final class298 field2197;
	static final class298 field2198;
	static final class298 field2202;
	static final class298[] field2201;
	final int field2194;
	final int field2199;
	final int field2200;

	static {
		field2195 = new class298(5, 8, 8);
		field2193 = new class298(0, 16, 16);
		field2202 = new class298(1, 32, 32);
		field2192 = new class298(6, 48, 48);
		field2196 = new class298(4, 64, 64);
		field2197 = new class298(2, 96, 96);
		field2198 = new class298(3, 128, 128);
		class298[] var0 = new class298[]{field2193, field2202, field2197, field2198, field2196, field2195, field2192};
		field2201 = var0;
		Arrays.sort(field2201, new class127());
	}

	class298(int var1, int var2, int var3) {
		this.field2199 = var1;
		this.field2200 = var2;
		this.field2194 = var3;
	}

	int method1531() {
		return this.field2194 * this.field2200;
	}
}
