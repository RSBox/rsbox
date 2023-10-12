import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class93 implements ThreadFactory {
	public static class554 field596;
	static String field599;
	// $FF: synthetic field
	final class434 this$0;
	final ThreadGroup field597;
	final AtomicInteger field598;

	class93(class434 var1) {
		this.this$0 = var1;
		this.field598 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field597 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	@Override
	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field597, var1, this.this$0.field2909 + "-rest-request-" + this.field598.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	static final void method422(class378 var0, int var1, int var2, int var3) {
		class73 var5 = var0.field2605;
		if (Client.field1979 < 400) {
			if (null != var5.field477) {
				var5 = var5.method363();
			}

			if (var5 != null) {
				if (var5.field492) {
					if (!var5.field514 || Client.field2011 == var1) {
						String var6 = var0.method1777();
						int var7;
						if (var5.field507 != 0 && var0.field404 != 0) {
							var7 = var0.field404 != -1 ? var0.field404 : var5.field507;
							var6 = var6 + Client.method1437(var7, class114.field720.field2993) + " " + class274.field1821 + class513.field3919 + var7 + class274.field1822;
						}

						if (var5.field514 && Client.field1988) {
							Client.method1359(class513.field3997, class274.method1266(16776960) + var6, 1003, var1, var2, var3);
						}

						if (Client.field1892 == 1) {
							Client.method1359(class513.field3913, Client.field2084 + " " + class274.field1823 + " " + class274.method1266(16776960) + var6, 7, var1, var2, var3);
						} else if (Client.field1997) {
							if ((class467.field3301 & 2) == 2) {
								Client.method1359(Client.field2063, Client.field2001 + " " + class274.field1823 + " " + class274.method1266(16776960) + var6, 8, var1, var2, var3);
							}
						} else {
							var7 = var5.field514 && Client.field1988 ? 2000 : 0;
							String[] var8 = var5.field489;
							int var9;
							int var10;
							if (null != var8) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method1764(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(class513.field3930)) {
										var10 = 0;
										if (var9 == 0) {
											var10 = var7 + 9;
										}

										if (var9 == 1) {
											var10 = var7 + 10;
										}

										if (var9 == 2) {
											var10 = var7 + 11;
										}

										if (var9 == 3) {
											var10 = var7 + 12;
										}

										if (var9 == 4) {
											var10 = var7 + 13;
										}

										Client.method1359(var8[var9], class274.method1266(16776960) + var6, var10, var1, var2, var3);
									}
								}
							}

							if (null != var8) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method1764(var9) && null != var8[var9] && var8[var9].equalsIgnoreCase(class513.field3930)) {
										short var11 = 0;
										if (class491.field3495 != Client.field2115) {
											if (Client.field2115 == class491.field3496 || Client.field2115 == class491.field3499 && var5.field507 > class114.field720.field2993) {
												var11 = 2000;
											}

											var10 = 0;
											if (var9 == 0) {
												var10 = var11 + 9;
											}

											if (var9 == 1) {
												var10 = var11 + 10;
											}

											if (var9 == 2) {
												var10 = var11 + 11;
											}

											if (var9 == 3) {
												var10 = var11 + 12;
											}

											if (var9 == 4) {
												var10 = var11 + 13;
											}

											Client.method1359(var8[var9], class274.method1266(16776960) + var6, var10, var1, var2, var3);
										}
									}
								}
							}

							if (!var5.field514 || !Client.field1988) {
								Client.method1359(class513.field3997, class274.method1266(16776960) + var6, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
