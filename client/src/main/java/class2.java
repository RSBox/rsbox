import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class class2 extends RuntimeException {
	public static int field2;
	public static int field3;
	public static String field5;
	String field4;
	Throwable field1;

	class2(Throwable var1, String var2) {
		this.field4 = var2;
		this.field1 = var1;
	}

	public static void method1(String var0, Throwable var1) {
		try {
			String var3 = "";
			if (var1 != null) {
				Throwable var5 = var1;
				String var6;
				if (var1 instanceof class2) {
					class2 var7 = (class2)var1;
					var6 = var7.field4 + " | ";
					var5 = var7.field1;
				} else {
					var6 = "";
				}

				StringWriter var19 = new StringWriter();
				PrintWriter var8 = new PrintWriter(var19);
				var5.printStackTrace(var8);
				var8.close();
				String var9 = var19.toString();
				BufferedReader var10 = new BufferedReader(new StringReader(var9));
				String var11 = var10.readLine();

				while (true) {
					String var12 = var10.readLine();
					if (null == var12) {
						var6 = var6 + "| " + var11;
						var3 = var6;
						break;
					}

					int var13 = var12.indexOf(40);
					int var14 = var12.indexOf(41, var13 + 1);
					if (var13 >= 0 && var14 >= 0) {
						String var15 = var12.substring(var13 + 1, var14);
						int var16 = var15.indexOf(".java:");
						if (var16 >= 0) {
							var15 = var15.substring(0, var16) + var15.substring(var16 + 5);
							var6 = var6 + var15 + ' ';
							continue;
						}

						var12 = var12.substring(0, var13);
					}

					var12 = var12.trim();
					var12 = var12.substring(var12.lastIndexOf(32) + 1);
					var12 = var12.substring(var12.lastIndexOf(9) + 1);
					var6 = var6 + var12 + ' ';
				}
			}

			if (null != var0) {
				if (var1 != null) {
					var3 = var3 + " | ";
				}

				var3 = var3 + var0;
			}

			System.out.println("Error: " + var3);
			var3 = var3.replace(':', '.');
			var3 = var3.replace('@', '_');
			var3 = var3.replace('&', '_');
			var3 = var3.replace('#', '_');
			if (class6.field31 == null) {
				return;
			}

			URL var4 = new URL(class6.field31.getCodeBase(), "clienterror.ws?cv=" + field2 + "&cs=" + field3 + "&u=" + field5 + "&v1=" + class430.field2885 + "&v2=" + class430.field2881 + "&ct=" + class371.field2562 + "&e=" + var3);
			DataInputStream var18 = new DataInputStream(var4.openStream());
			var18.read();
			var18.close();
		} catch (Exception var17) {
		}

	}
}
