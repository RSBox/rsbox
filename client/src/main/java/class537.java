final class class537 implements class350 {
	void method2599(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@Override
	public Object method1676(Buffer var1) {
		return var1.readLong();
	}

	@Override
	public void method1675(Object var1, Buffer var2) {
		this.method2599((Long)var1, var2);
	}
}
