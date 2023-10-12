public class class545 {
	public int field4242;
	public int field4243;
	public int field4244;
	public int field4245;
	public int field4246;
	public int field4247;
	public int field4248;
	public int field4249;
	public int field4250;
	public int field4251;
	public int field4252;

	public class545() {
		this.field4251 = -1;
		this.field4243 = -1;
		this.field4245 = -1;
		this.field4242 = -1;
		this.field4246 = -1;
		this.field4247 = -1;
		this.field4248 = -1;
		this.field4249 = -1;
		this.field4250 = -1;
		this.field4244 = -1;
		this.field4252 = -1;
	}

	public void method2625(class5 var1) {
		byte[] var3 = var1.method19(class432.field2892.field2893);
		Buffer var4 = new Buffer(var3);

		while (true) {
			int var5 = var4.readUnsignedByte();
			if (var5 == 0) {
				return;
			}

			switch(var5) {
			case 1:
				var4.readUnsignedMedium();
				break;
			case 2:
				this.field4251 = var4.method2482();
				this.field4243 = var4.method2482();
				this.field4245 = var4.method2482();
				this.field4242 = var4.method2482();
				this.field4246 = var4.method2482();
				this.field4247 = var4.method2482();
				this.field4248 = var4.method2482();
				this.field4249 = var4.method2482();
				this.field4250 = var4.method2482();
				this.field4244 = var4.method2482();
				this.field4252 = var4.method2482();
			}
		}
	}
}
