import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class class9 {
	public static class444 field40;
	static class230[] field41;

	static {
		field40 = new class444();
	}

	public static void method44(PacketBuffer var0) {
		class37 var2 = (class37)field40.method2088();
		if (null != var2) {
			int var3 = var0.offset;
			var0.writeInt(var2.field183);

			for (int var4 = 0; var4 < var2.field179; ++var4) {
				if (var2.field185[var4] != 0) {
					var0.writeByte(var2.field185[var4]);
				} else {
					try {
						int var5 = var2.field180[var4];
						Field var6;
						int var7;
						if (var5 == 0) {
							var6 = var2.field182[var4];
							var7 = var6.getInt((Object)null);
							var0.writeByte(0);
							var0.writeInt(var7);
						} else if (var5 == 1) {
							var6 = var2.field182[var4];
							var6.setInt((Object)null, var2.field186[var4]);
							var0.writeByte(0);
						} else if (var5 == 2) {
							var6 = var2.field182[var4];
							var7 = var6.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var7);
						}

						Method var23;
						if (var5 != 3) {
							if (var5 == 4) {
								var23 = var2.field184[var4];
								var7 = var23.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var7);
							}
						} else {
							var23 = var2.field184[var4];
							byte[][] var24 = var2.field181[var4];
							Object[] var8 = new Object[var24.length];

							for (int var9 = 0; var9 < var24.length; ++var9) {
								ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
								var8[var9] = var10.readObject();
							}

							Object var25 = var23.invoke((Object)null, var8);
							if (var25 == null) {
								var0.writeByte(0);
							} else if (var25 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number)var25).longValue());
							} else if (var25 instanceof String) {
								var0.writeByte(2);
								var0.writeString((String)var25);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var11) {
						var0.writeByte(-10);
					} catch (InvalidClassException var12) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var13) {
						var0.writeByte(-12);
					} catch (OptionalDataException var14) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var15) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var16) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var17) {
						var0.writeByte(-16);
					} catch (SecurityException var18) {
						var0.writeByte(-17);
					} catch (IOException var19) {
						var0.writeByte(-18);
					} catch (NullPointerException var20) {
						var0.writeByte(-19);
					} catch (Exception var21) {
						var0.writeByte(-20);
					} catch (Throwable var22) {
						var0.writeByte(-21);
					}
				}
			}

			var0.writeCrc(var3);
			var2.method1719();
		}
	}

	public static void method45(Buffer var0, int var1) {
		class37 var3 = new class37();
		var3.field179 = var0.readUnsignedByte();
		var3.field183 = var0.readInt();
		var3.field180 = new int[var3.field179];
		var3.field185 = new int[var3.field179];
		var3.field182 = new Field[var3.field179];
		var3.field186 = new int[var3.field179];
		var3.field184 = new Method[var3.field179];
		var3.field181 = new byte[var3.field179][][];

		for (int var4 = 0; var4 < var3.field179; ++var4) {
			try {
				int var5 = var0.readUnsignedByte();
				String var6;
				String var7;
				int var8;
				if (var5 != 0 && var5 != 1 && var5 != 2) {
					if (var5 == 3 || var5 == 4) {
						var6 = var0.readStringOrNull();
						var7 = var0.readStringOrNull();
						var8 = var0.readUnsignedByte();
						String[] var9 = new String[var8];

						for (int var10 = 0; var10 < var8; ++var10) {
							var9[var10] = var0.readStringOrNull();
						}

						String var26 = var0.readStringOrNull();
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; ++var12) {
								var13 = var0.readInt();
								var11[var12] = new byte[var13];
								var0.readBytes(var11[var12], 0, var13);
							}
						}

						var3.field180[var4] = var5;
						Class[] var27 = new Class[var8];

						for (var13 = 0; var13 < var8; ++var13) {
							var27[var13] = method43(var9[var13]);
						}

						Class var28 = method43(var26);
						if (method43(var6).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = method43(var6).getDeclaredMethods();
						Method[] var15 = var14;

						for (int var16 = 0; var16 < var15.length; ++var16) {
							Method var17 = var15[var16];
							if (var17.getName().equals(var7)) {
								Class[] var18 = var17.getParameterTypes();
								if (var27.length == var18.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var27.length; ++var20) {
										if (var18[var20] != var27[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && var28 == var17.getReturnType()) {
										var3.field184[var4] = var17;
									}
								}
							}
						}

						var3.field181[var4] = var11;
					}
				} else {
					var6 = var0.readStringOrNull();
					var7 = var0.readStringOrNull();
					var8 = 0;
					if (var5 == 1) {
						var8 = var0.readInt();
					}

					var3.field180[var4] = var5;
					var3.field186[var4] = var8;
					if (method43(var6).getClassLoader() == null) {
						throw new SecurityException();
					}

					var3.field182[var4] = method43(var6).getDeclaredField(var7);
				}
			} catch (ClassNotFoundException var21) {
				var3.field185[var4] = -1;
			} catch (SecurityException var22) {
				var3.field185[var4] = -2;
			} catch (NullPointerException var23) {
				var3.field185[var4] = -3;
			} catch (Exception var24) {
				var3.field185[var4] = -4;
			} catch (Throwable var25) {
				var3.field185[var4] = -5;
			}
		}

		field40.method2095(var3);
	}

	static Class method43(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Class.forName(var0);
		}
	}

	static final void method42(int var0, int var1) {
		if (Client.field2074[var0] != null) {
			if (var1 >= 0 && var1 < Client.field2074[var0].method1854()) {
				class455 var3 = (class455)Client.field2074[var0].field2738.get(var1);
				if (var3.field3018 == -1) {
					class341 var4 = class341.createClientPacket(ClientPacket.field3121, Client.field1891.field4219);
					var4.buffer.writeByte(3 + Buffer.method2535(var3.field3021.method2398()));
					var4.buffer.writeByte(var0);
					var4.buffer.writeShort(var1);
					var4.buffer.writeString(var3.field3021.method2398());
					Client.field1891.method2612(var4);
				}
			}
		}
	}
}
