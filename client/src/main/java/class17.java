final class class17 implements class350 {
	void method70(String var1, Buffer var2) {
		var2.writeString(var1);
	}

	@Override
	public Object method1676(Buffer var1) {
		return var1.readStringOrNull();
	}

	@Override
	public void method1675(Object var1, Buffer var2) {
		this.method70((String)var1, var2);
	}
}
