import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class183 {
	public static Comparator field1273;
	public static Comparator field1274;
	public static Comparator field1276;
	public static Comparator field1277;
	public final List field1275;

	static {
		field1274 = new class418();
		new class322();
		field1273 = new class521();
		field1276 = new class428();
		field1277 = new class178();
	}

	public class183(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort();
		boolean var4 = var1.readUnsignedByte() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.readUnsignedShort();
		this.field1275 = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.field1275.add(new class70(var1, var5, var3));
		}

	}

	public void method930(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.field1275, var1);
		} else {
			Collections.sort(this.field1275, Collections.reverseOrder(var1));
		}

	}
}
