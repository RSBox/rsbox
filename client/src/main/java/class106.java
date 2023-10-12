public class class106 implements Runnable {
	static boolean field680;
	static class69 field677;
	static int field678;
	static Object field676;
	static final class69 field679;

	static {
		field679 = new class69();
		field677 = new class69();
		field678 = 0;
		field680 = false;
		field676 = new Object();
	}

	class106() {
	}

	@Override
	public void run() {
		try {
			while (true) {
				class87 var1;
				synchronized(field679) {
					var1 = (class87)field679.method327();
				}

				if (var1 != null) {
					if (var1.field577 == 0) {
						var1.field578.method2186((int)var1.field2472, var1.field580, var1.field580.length);
						synchronized(field679) {
							var1.method1719();
						}
					} else if (var1.field577 == 1) {
						var1.field580 = var1.field578.method2185((int)var1.field2472);
						synchronized(field679) {
							field677.method323(var1);
						}
					}

					synchronized(field676) {
						if ((field680 || field678 <= 1) && field679.method333()) {
							field678 = 0;
							field676.notifyAll();
							return;
						}

						field678 = 600;
					}
				} else {
					class325.method1587(100L);
					synchronized(field676) {
						if ((field680 || field678 <= 1) && field679.method333()) {
							field678 = 0;
							field676.notifyAll();
							return;
						}

						--field678;
					}
				}
			}
		} catch (Exception var13) {
			class2.method1((String)null, var13);
		}
	}

	static void method499(int var0, byte[] var1, class471 var2) {
		class87 var4 = new class87();
		var4.field577 = 0;
		var4.field2472 = (long)var0;
		var4.field580 = var1;
		var4.field578 = var2;
		synchronized(field679) {
			field679.method323(var4);
		}

		method497();
	}

	static void method498(int var0, class471 var1, class198 var2) {
		class87 var4 = new class87();
		var4.field577 = 1;
		var4.field2472 = (long)var0;
		var4.field578 = var1;
		var4.field579 = var2;
		synchronized(field679) {
			field679.method323(var4);
		}

		method497();
	}

	public static void method501() {
		while (true) {
			class87 var1;
			synchronized(field679) {
				var1 = (class87)field677.method326();
			}

			if (var1 == null) {
				return;
			}

			var1.field579.method963(var1.field578, (int)var1.field2472, var1.field580, false);
		}
	}

	static void method497() {
		synchronized(field676) {
			if (field678 == 0) {
				class233.field1536 = new Thread(new class106());
				class233.field1536.setDaemon(true);
				class233.field1536.start();
				class233.field1536.setPriority(5);
			}

			field678 = 600;
			field680 = false;
		}
	}

	public static void method500() {
		synchronized(field676) {
			if (field678 != 0) {
				field678 = 1;
				field680 = true;

				try {
					field676.wait();
				} catch (InterruptedException var4) {
				}
			}

		}
	}
}
