import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class308 extends class292 {
	class499[] field2235;
	List field2234;

	public class308(class5 var1, int var2, int var3) {
		byte[] var4 = var1.method39(var2, var3 + 1);
		this.method1566(new Buffer(var4));
	}

	public class308(class5 var1, int var2) {
		byte[] var3 = var1.method39(var2, 0);
		this.method1566(new Buffer(var3));
	}

	void method1566(Buffer var1) {
		int var3 = var1.method2483((byte)-57);
		this.field2235 = new class499[var3];
		this.field2234 = new ArrayList(var3);

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field2235[var4] = (class499)class26.method87(class499.method2361(), var1.readUnsignedByte());
			int var5 = var1.method2483((byte)-114);
			HashMap var6 = new HashMap(var5);

			while (var5-- > 0) {
				Object var7 = this.field2235[var4].method2360(var1);
				int var8 = var1.method2483((byte)-8);
				ArrayList var9 = new ArrayList();

				while (var8-- > 0) {
					int var10 = var1.method2483((byte)-68);
					var9.add(var10);
				}

				var6.put(var7, var9);
			}

			this.field2234.add(var4, var6);
		}

	}

	public List method1567(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var4 = (Map)this.field2234.get(var2);
		return (List)var4.get(var1);
	}
}
