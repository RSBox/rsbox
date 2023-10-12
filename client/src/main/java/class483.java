import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class483 {
	public static ArrayList field3387;
	public static ArrayList field3389;
	public static ArrayList field3396;
	public static LinkedList field3384;
	public static final List field3390;
	static class198 field3397;
	static class5 field3385;
	static class5 field3388;
	static class5 field3395;
	static int field3386;
	static int field3392;
	static int field3393;
	static int field3394;
	static Image field3398;
	static ArrayList field3391;

	static {
		field3387 = null;
		field3384 = new LinkedList();
		field3389 = new ArrayList(3);
		field3396 = new ArrayList(3);
		field3391 = new ArrayList();
		field3390 = new ArrayList();
		field3393 = 0;
		field3394 = 0;
		field3392 = 0;
		field3386 = 0;
	}

	public static boolean method2216(class5 var0, class5 var1, class5 var2, ArrayList var3) {
		field3395 = var0;
		field3385 = var1;
		field3388 = var2;
		field3387 = var3;
		return true;
	}

	public static void method2224(class424 var0) {
		if (!field3390.contains(var0)) {
			field3390.add(var0);
		}

	}

	public static void method2226(int var0, int var1) {
		Iterator var3 = field3390.iterator();

		while (var3.hasNext()) {
			class424 var4 = (class424)var3.next();
			var4.method1925(var0, var1);
		}

	}

	public static void method2223(int var0, int var1) {
		method2217(var0, var1, 0, 0);
		field3396.clear();
		field3391.clear();
		if (field3389.isEmpty() || var0 == 0 && var1 == 0) {
			method2219();
		} else {
			field3391.add(new class395((class4)null, field3393));
			field3391.add(new class189((class4)null, 0, false, field3394));
			ArrayList var4 = new ArrayList();
			Iterator var5 = field3389.iterator();

			while (var5.hasNext()) {
				class407 var6 = (class407)var5.next();
				var4.add(var6);
			}

			field3391.add(new class506((class4)null, var4));
		}

	}

	public static boolean method2227() {
		if (!field3391.isEmpty()) {
			return true;
		} else {
			return !field3389.isEmpty() && field3389.get(0) != null && ((class407)field3389.get(0)).field2789 != null ? ((class407)field3389.get(0)).field2789.method547() : false;
		}
	}

	public static void method2222(int var0, int var1, int var2, int var3) {
		if (field3389.size() > 1 && field3389.get(0) != null && ((class407)field3389.get(0)).field2789.method547() && field3389.get(1) != null && ((class407)field3389.get(1)).field2789.method547()) {
			method2217(var0, var1, var2, var3);
			field3391.add(new class439((class4)null));
			ArrayList var5 = new ArrayList();
			var5.add(new class395(new class99((class4)null, 1, false, field3386), field3392));
			var5.add(new class395(new class189((class4)null, 0, false, field3394), field3393));
			field3391.add(new class390((class4)null, var5));
			if (field3396.get(0) != null && field3396.get(1) != null) {
				class407 var6 = (class407)field3396.get(0);
				field3396.set(0, field3389.get(1));
				field3396.set(1, var6);
			}
		}

	}

	public static boolean method2218() {
		return !field3396.isEmpty();
	}

	public static void method2229() {
		field3396.clear();
	}

	public static void method2221(class5 var0, int var1) {
		if (!field3396.isEmpty()) {
			ArrayList var3 = new ArrayList();
			Iterator var4 = field3396.iterator();

			while (var4.hasNext()) {
				class407 var5 = (class407)var4.next();
				var5.field2796 = false;
				var5.field2798 = false;
				var5.field2797 = false;
				var5.field2801 = false;
				var5.field2795 = var0;
				var5.field2792 = var1;
				var5.field2793 = 0.0F;
				var3.add(var5);
			}

			class14.method61(var3, field3393, field3394, field3392, field3386, false);
		}
	}

	static void method2228(ArrayList var0, boolean var1) {
		if (!var1) {
			field3396.clear();
		}

		Iterator var3 = var0.iterator();

		while (var3.hasNext()) {
			class407 var4 = (class407)var3.next();
			if (var4.field2790 != -1 && var4.field2791 != -1) {
				if (!var1) {
					field3396.add(var4);
				}

				field3384.add(var4);
			}
		}

	}

	static void method2217(int var0, int var1, int var2, int var3) {
		field3393 = var0;
		field3394 = var1;
		field3392 = var2;
		field3386 = var3;
	}

	public static void method2225(ArrayList var0, int var1, int var2, int var3, int var4) {
		field3396.clear();
		field3396.addAll(var0);
		method2217(var1, var2, var3, var4);
	}

	static void method2219() {
		Iterator var1 = field3389.iterator();

		while (var1.hasNext()) {
			class407 var2 = (class407)var1.next();
			if (var2 != null) {
				var2.field2789.method546();
				var2.field2789.method572();
				var2.field2789.method542(0);
				var2.field2789.field759 = 0;
				method2226(var2.field2790, var2.field2791);
			}
		}

		field3389.clear();
	}

	static void method2220(boolean var0) {
		if (var0) {
			method2219();
		} else {
			for (int var2 = 0; var2 < field3389.size(); ++var2) {
				class407 var3 = (class407)field3389.get(var2);
				if (var3 == null) {
					field3389.remove(var2);
					--var2;
				} else if (var3.field2801) {
					if (var3.field2789.field759 > 0) {
						--var3.field2789.field759;
					}

					var3.field2789.method546();
					var3.field2789.method572();
					var3.field2789.method542(0);
					field3389.remove(var2);
					--var2;
				} else {
					var3.field2801 = true;
				}
			}
		}

	}
}
