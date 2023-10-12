public class class402 implements class295 {
	@Override
	public Buffer method1526(Buffer var1) {
		Buffer var2 = new Buffer(100);
		this.method1859(var1, var2);
		return var2;
	}

	void method1859(Buffer var1, Buffer var2) {
		class294 var3 = new class294(var1);
		class541 var4 = new class541(var3);

		long var5;
		for (var5 = 0L; !var4.method2614(var3.method1525(), var3.method1524(), var5); ++var5) {
		}

		var2.writeLong(var5);
	}
}
