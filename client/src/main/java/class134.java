import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class class134 {
	static final BigInteger field858;
	static final BigInteger field859;

	static {
		field858 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field859 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	public static int method618(int var0) {
		return var0 >> 11 & 63;
	}

	static long method616() {
		try {
			URL var1 = new URL(Client.method1330("services", false) + "m=accountappeal/login.ws");
			URLConnection var2 = var1.openConnection();
			var2.setRequestProperty("connection", "close");
			var2.setDoInput(true);
			var2.setDoOutput(true);
			var2.setConnectTimeout(5000);
			OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
			var3.write("data1=req");
			var3.flush();
			InputStream var4 = var2.getInputStream();
			Buffer var5 = new Buffer(new byte[1000]);

			do {
				int var6 = var4.read(var5.data, var5.offset, 1000 - var5.offset);
				if (var6 == -1) {
					var5.offset = 0;
					long var9 = var5.readLong();
					return var9;
				}

				var5.offset += var6;
			} while(var5.offset < 1000);

			return 0L;
		} catch (Exception var8) {
			return 0L;
		}
	}

	static final int method617(long var0, String var2) {
		Random var4 = new Random();
		Buffer var5 = new Buffer(128);
		Buffer var6 = new Buffer(128);
		int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
		var5.writeByte(10);

		int var8;
		for (var8 = 0; var8 < 4; ++var8) {
			var5.writeInt(var4.nextInt());
		}

		var5.writeInt(var7[0]);
		var5.writeInt(var7[1]);
		var5.writeLong(var0);
		var5.writeLong(0L);

		for (var8 = 0; var8 < 4; ++var8) {
			var5.writeInt(var4.nextInt());
		}

		var5.encryptRsa(field858, field859);
		var6.writeByte(10);

		for (var8 = 0; var8 < 3; ++var8) {
			var6.writeInt(var4.nextInt());
		}

		var6.writeLong(var4.nextLong());
		var6.write48BitLong(var4.nextLong());
		if (null != Client.field2132) {
			var6.writeBytes(Client.field2132, 0, Client.field2132.length);
		} else {
			byte[] var18 = class258.method1227();
			var6.writeBytes(var18, 0, var18.length);
		}

		var6.writeLong(var4.nextLong());
		var6.encryptRsa(field858, field859);
		var8 = Buffer.method2535(var2);
		if (var8 % 8 != 0) {
			var8 += 8 - var8 % 8;
		}

		Buffer var9 = new Buffer(var8);
		var9.writeString(var2);
		var9.offset = var8;
		var9.encryptXteaAll(var7);
		Buffer var10 = new Buffer(var6.offset + 5 + var5.offset + var9.offset);
		var10.writeByte(2);
		var10.writeByte(var5.offset);
		var10.writeBytes(var5.data, 0, var5.offset);
		var10.writeByte(var6.offset);
		var10.writeBytes(var6.data, 0, var6.offset);
		var10.writeShort(var9.offset);
		var10.writeBytes(var9.data, 0, var9.offset);
		String var11 = class278.method1472(var10.data);

		try {
			URL var12 = new URL(Client.method1330("services", false) + "m=accountappeal/login.ws");
			URLConnection var13 = var12.openConnection();
			var13.setDoInput(true);
			var13.setDoOutput(true);
			var13.setConnectTimeout(5000);
			OutputStreamWriter var14 = new OutputStreamWriter(var13.getOutputStream());
			var14.write("data2=" + class261.method1232(var11) + "&dest=" + class261.method1232("passwordchoice.ws"));
			var14.flush();
			InputStream var15 = var13.getInputStream();
			var10 = new Buffer(new byte[1000]);

			do {
				int var16 = var15.read(var10.data, var10.offset, 1000 - var10.offset);
				if (var16 == -1) {
					var14.close();
					var15.close();
					String var19 = new String(var10.data);
					if (var19.startsWith("OFFLINE")) {
						return 4;
					} else if (var19.startsWith("WRONG")) {
						return 7;
					} else if (var19.startsWith("RELOAD")) {
						return 3;
					} else if (var19.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var10.decryptXteaAll(var7);

						while (var10.offset > 0 && var10.data[var10.offset - 1] == 0) {
							--var10.offset;
						}

						var19 = new String(var10.data, 0, var10.offset);
						if (method619(var19)) {
							class467.method2170(var19, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var10.offset += var16;
			} while(var10.offset < 1000);

			return 5;
		} catch (Throwable var17) {
			var17.printStackTrace();
			return 5;
		}
	}

	static boolean method619(String var0) {
		if (null == var0) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var3) {
				return false;
			}
		}
	}
}
