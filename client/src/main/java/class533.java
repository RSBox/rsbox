import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class class533 {
	static boolean field4152;
	static int field4151;
	static File field4150;
	static Hashtable field4149;

	static {
		field4152 = false;
		field4149 = new Hashtable(16);
	}

	static File method2551(String var0) {
		if (!field4152) {
			throw new RuntimeException("");
		} else {
			File var2 = (File)field4149.get(var0);
			if (null != var2) {
				return var2;
			} else {
				File var3 = new File(field4150, var0);
				RandomAccessFile var4 = null;

				try {
					File var5 = new File(var3.getParent());
					if (!var5.exists()) {
						throw new RuntimeException("");
					} else {
						var4 = new RandomAccessFile(var3, "rw");
						int var6 = var4.read();
						var4.seek(0L);
						var4.write(var6);
						var4.seek(0L);
						var4.close();
						field4149.put(var0, var3);
						return var3;
					}
				} catch (Exception var8) {
					try {
						if (null != var4) {
							var4.close();
							var4 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	public static void method2550() {
		field4149.clear();
	}
}
