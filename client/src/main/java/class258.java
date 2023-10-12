import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class258 {
	public static class219 field1753;
	public static class219 field1754;
	static class219 field1752;
	static int field1755;
	static int field1756;
	static File field1751;

	static {
		field1752 = null;
		field1753 = null;
		field1754 = null;
	}

	public static void method1228(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (null != var1 && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		class138.field902 = 23;
		class533.field4151 = 0;

		try {
			class428.field2879 = System.getProperty("os.name");
		} catch (Exception var18) {
			class428.field2879 = "Unknown";
		}

		class246.field1643 = class428.field2879.toLowerCase();
		class340.field2386 = null;

		try {
			class340.field2386 = System.getProperty("jagex.userhome");
		} catch (Exception var17) {
		}

		if (class340.field2386 == null) {
			try {
				class340.field2386 = System.getProperty("user.home");
			} catch (Exception var16) {
			}
		}

		if (class340.field2386 != null) {
			class340.field2386 = class340.field2386 + "/";
		}

		try {
			if (class246.field1643.startsWith("win")) {
				if (null == class340.field2386) {
					class340.field2386 = System.getenv("USERPROFILE");
				}
			} else if (class340.field2386 == null) {
				class340.field2386 = System.getenv("HOME");
			}

			if (null != class340.field2386) {
				class340.field2386 = class340.field2386 + "/";
			}
		} catch (Exception var15) {
		}

		if (null == class340.field2386) {
			class340.field2386 = "~/";
		}

		class18.field88 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class340.field2386, "/tmp/", ""};
		class408.field2803 = new String[]{".jagex_cache_" + class533.field4151, ".file_store_" + class533.field4151};
		int var6 = 0;

		label107:
		while (var6 < 4) {
			class203.field1363 = method1229(var0, var2, var6);
			if (!class203.field1363.exists()) {
				class203.field1363.mkdirs();
			}

			File[] var7 = class203.field1363.listFiles();
			if (var7 == null) {
				break;
			}

			File[] var8 = var7;
			int var9 = 0;

			while (true) {
				if (var9 >= var8.length) {
					break label107;
				}

				File var10 = var8[var9];

				boolean var11;
				try {
					RandomAccessFile var12 = new RandomAccessFile(var10, "rw");
					int var13 = var12.read();
					var12.seek(0L);
					var12.write(var13);
					var12.seek(0L);
					var12.close();
					var11 = true;
				} catch (Exception var14) {
					var11 = false;
				}

				if (!var11) {
					++var6;
					break;
				}

				++var9;
			}
		}

		File var19 = class203.field1363;
		class533.field4150 = var19;
		if (!class533.field4150.exists()) {
			throw new RuntimeException("");
		} else {
			class533.field4152 = true;
			method1226();
			field1753 = new class219(new class356(class533.method2551("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			field1754 = new class219(new class356(class533.method2551("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			class108.field684 = new class219[class138.field902];

			for (int var20 = 0; var20 < class138.field902; ++var20) {
				class108.field684[var20] = new class219(new class356(class533.method2551("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
			}

		}
	}

	static File method1229(String var0, String var1, int var2) {
		String var4 = var2 == 0 ? "" : "" + var2;
		field1751 = new File(class340.field2386, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
		String var5 = null;
		String var6 = null;
		boolean var7 = false;
		Buffer var9;
		int var12;
		File var23;
		if (field1751.exists()) {
			try {
				class356 var8 = new class356(field1751, "rw", 10000L);

				int var10;
				for (var9 = new Buffer((int)var8.method1710()); var9.offset < var9.data.length; var9.offset += var10) {
					var10 = var8.method1711(var9.data, var9.offset, var9.data.length - var9.offset);
					if (var10 == -1) {
						throw new IOException();
					}
				}

				var9.offset = 0;
				var10 = var9.readUnsignedByte();
				if (var10 < 1 || var10 > 3) {
					throw new IOException("" + var10);
				}

				int var11 = 0;
				if (var10 > 1) {
					var11 = var9.readUnsignedByte();
				}

				if (var10 <= 2) {
					var5 = var9.readJagexString();
					if (var11 == 1) {
						var6 = var9.readJagexString();
					}
				} else {
					var5 = var9.method2478();
					if (var11 == 1) {
						var6 = var9.method2478();
					}
				}

				var8.method1708();
			} catch (IOException var20) {
				var20.printStackTrace();
			}

			if (null != var5) {
				var23 = new File(var5);
				if (!var23.exists()) {
					var5 = null;
				}
			}

			if (var5 != null) {
				var23 = new File(var5, "test.dat");

				boolean var25;
				try {
					RandomAccessFile var28 = new RandomAccessFile(var23, "rw");
					var12 = var28.read();
					var28.seek(0L);
					var28.write(var12);
					var28.seek(0L);
					var28.close();
					var23.delete();
					var25 = true;
				} catch (Exception var18) {
					var25 = false;
				}

				if (!var25) {
					var5 = null;
				}
			}
		}

		if (null == var5 && var2 == 0) {
			label134:
			for (int var21 = 0; var21 < class408.field2803.length; ++var21) {
				for (int var24 = 0; var24 < class18.field88.length; ++var24) {
					File var26 = new File(class18.field88[var24] + class408.field2803[var21] + File.separatorChar + var0 + File.separatorChar);
					if (var26.exists()) {
						File var29 = new File(var26, "test.dat");

						boolean var31;
						try {
							RandomAccessFile var13 = new RandomAccessFile(var29, "rw");
							int var14 = var13.read();
							var13.seek(0L);
							var13.write(var14);
							var13.seek(0L);
							var13.close();
							var29.delete();
							var31 = true;
						} catch (Exception var17) {
							var31 = false;
						}

						if (var31) {
							var5 = var26.toString();
							var7 = true;
							break label134;
						}
					}
				}
			}
		}

		if (var5 == null) {
			var5 = class340.field2386 + File.separatorChar + ClientLauncher.CACHE_DIR + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var7 = true;
		}

		File var22;
		if (var6 != null) {
			var22 = new File(var6);
			var23 = new File(var5);

			try {
				File[] var27 = var22.listFiles();
				File[] var33 = var27;

				for (var12 = 0; var12 < var33.length; ++var12) {
					File var32 = var33[var12];
					File var35 = new File(var23, var32.getName());
					boolean var15 = var32.renameTo(var35);
					if (!var15) {
						throw new IOException();
					}
				}
			} catch (Exception var19) {
				var19.printStackTrace();
			}

			var7 = true;
		}

		if (var7) {
			var22 = new File(var5);
			var9 = null;

			try {
				class356 var30 = new class356(field1751, "rw", 10000L);
				Buffer var34 = new Buffer(500);
				var34.writeByte(3);
				var34.writeByte(null != var9 ? 1 : 0);
				var34.writeStringCESU8(var22.getPath());
				if (var9 != null) {
					var34.writeStringCESU8("");
				}

				var30.method1707(var34.data, 0, var34.offset);
				var30.method1708();
			} catch (IOException var16) {
				var16.printStackTrace();
			}
		}

		return new File(var5);
	}

	public static class356 method1223(String var0, String var1, boolean var2) {
		File var4 = new File(class203.field1363, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				class356 var11 = new class356(var4, "rw", 10000L);
				return var11;
			} catch (IOException var10) {
			}
		}

		String var5 = "";
		if (class533.field4151 == 33) {
			var5 = "_rc";
		} else if (class533.field4151 == 34) {
			var5 = "_wip";
		}

		File var6 = new File(class340.field2386, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		class356 var7;
		if (!var2 && var6.exists()) {
			try {
				var7 = new class356(var6, "rw", 10000L);
				return var7;
			} catch (IOException var9) {
			}
		}

		try {
			var7 = new class356(var4, "rw", 10000L);
			return var7;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

	static void method1226() {
		try {
			File var1 = new File(class340.field2386, "random.dat");
			int var3;
			if (var1.exists()) {
				field1752 = new class219(new class356(var1, "rw", 25L), 24, 0);
			} else {
				label34:
				for (int var2 = 0; var2 < class408.field2803.length; ++var2) {
					for (var3 = 0; var3 < class18.field88.length; ++var3) {
						File var4 = new File(class18.field88[var3] + class408.field2803[var2] + File.separatorChar + "random.dat");
						if (var4.exists()) {
							field1752 = new class219(new class356(var4, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}

			if (null == field1752) {
				RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
				var3 = var6.read();
				var6.seek(0L);
				var6.write(var3);
				var6.seek(0L);
				var6.close();
				field1752 = new class219(new class356(var1, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	public static byte[] method1227() {
		byte[] var1 = new byte[24];

		try {
			field1752.method1010(0L);
			field1752.method1012(var1);

			int var2;
			for (var2 = 0; var2 < 24 && var1[var2] == 0; ++var2) {
			}

			if (var2 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var3 = 0; var3 < 24; ++var3) {
				var1[var3] = -1;
			}
		}

		return var1;
	}

	public static void method1224(Buffer var0, int var1) {
		if (null != field1752) {
			try {
				field1752.method1010(0L);
				field1752.method1013(var0.data, var1, 24);
			} catch (Exception var4) {
			}
		}

	}

	public static void method1225() {
		try {
			field1753.method1009();

			for (int var1 = 0; var1 < class138.field902; ++var1) {
				class108.field684[var1].method1009();
			}

			field1754.method1009();
			field1752.method1009();
		} catch (Exception var2) {
		}

	}
}
