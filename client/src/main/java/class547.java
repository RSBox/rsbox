final class class547 implements class350 {
	void method2626(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@Override
	public Object method1676(Buffer var1) {
		return var1.readInt();
	}

	@Override
	public void method1675(Object var1, Buffer var2) {
		this.method2626((Integer)var1, var2);
	}
}
