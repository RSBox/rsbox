import java.util.concurrent.ThreadFactory;

final class class489 implements ThreadFactory {
	@Override
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	static final void method2254() {
		for (int var1 = 0; var1 < Client.field1957; ++var1) {
			int var10002 = Client.field1913[var1]--;
			if (Client.field1913[var1] >= -10) {
				class357 var10 = Client.field2089[var1];
				if (null == var10) {
					class357 var10000 = (class357)null;
					var10 = class357.method1715(class174.field1221, Client.field2124[var1], 0);
					if (null == var10) {
						continue;
					}

					int[] var13 = Client.field1913;
					var13[var1] += var10.method1713();
					Client.field2089[var1] = var10;
				}

				if (Client.field1913[var1] < 0) {
					int var3;
					if (Client.field2088[var1] != 0) {
						int var4 = 128 * (Client.field2088[var1] & 255);
						int var5 = Client.field2088[var1] >> 16 & 255;
						int var6 = var5 * 128 + 64 - class114.field720.field368;
						if (var6 < 0) {
							var6 = -var6;
						}

						int var7 = Client.field2088[var1] >> 8 & 255;
						int var8 = var7 * 128 + 64 - class114.field720.field329;
						if (var8 < 0) {
							var8 = -var8;
						}

						int var9 = var6 + var8 - 128;
						if (var9 > var4) {
							Client.field1913[var1] = -100;
							continue;
						}

						if (var9 < 0) {
							var9 = 0;
						}

						var3 = (var4 - var9) * class109.field693.method464() / var4;
					} else {
						var3 = class109.field693.method448();
					}

					if (var3 > 0) {
						class7 var11 = var10.method1712().method41(class276.field1830);
						class335 var12 = class335.method1633(var11, 100, var3);
						var12.method1623(Client.field1887[var1] - 1);
						class244.field1632.method1140(var12);
					}

					Client.field1913[var1] = -100;
				}
			} else {
				--Client.field1957;

				for (int var2 = var1; var2 < Client.field1957; ++var2) {
					Client.field2124[var2] = Client.field2124[var2 + 1];
					Client.field2089[var2] = Client.field2089[var2 + 1];
					Client.field1887[var2] = Client.field1887[var2 + 1];
					Client.field1913[var2] = Client.field1913[var2 + 1];
					Client.field2088[var2] = Client.field2088[var2 + 1];
				}

				--var1;
			}
		}

		if (Client.field2083 && !class483.method2227()) {
			if (class109.field693.method446() != 0 && class483.method2218()) {
				class483.method2221(class151.field1049, class109.field693.method446());
			}

			Client.field2083 = false;
		}

	}
}
