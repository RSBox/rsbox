public class class108 extends class147 {
	public static class219[] field684;
	static boolean field685;
	static class42[] field683;
	final boolean field686;

	public class108(boolean var1) {
		this.field686 = var1;
	}

	int method502(class111 var1, class111 var2) {
		if (var1.field704 == Client.field1832) {
			if (var2.field704 != Client.field1832) {
				return this.field686 ? -1 : 1;
			}
		} else if (var2.field704 == Client.field1832) {
			return this.field686 ? 1 : -1;
		}

		return this.method792(var1, var2);
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method502((class111)var1, (class111)var2);
	}
}
