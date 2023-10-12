import java.nio.ByteBuffer;

public class class443 extends class494 {
	ByteBuffer field2972;

	@Override
	byte[] method2299() {
		byte[] var2 = new byte[this.field2972.capacity()];
		this.field2972.position(0);
		this.field2972.get(var2);
		return var2;
	}

	@Override
	public void method2300(byte[] var1) {
		this.field2972 = ByteBuffer.allocateDirect(var1.length);
		this.field2972.position(0);
		this.field2972.put(var1);
	}
}
