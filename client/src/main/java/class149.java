import java.io.IOException;
import java.net.Socket;

public class class149 extends class86 {
	static int field1030;
	class224 field1031;
	class334 field1029;
	Socket field1032;

	class149(Socket var1, int var2, int var3) throws IOException {
		this.field1032 = var1;
		this.field1032.setSoTimeout(30000);
		this.field1032.setTcpNoDelay(true);
		this.field1032.setReceiveBufferSize(65536);
		this.field1032.setSendBufferSize(65536);
		this.field1029 = new class334(this.field1032.getInputStream(), var2);
		this.field1031 = new class224(this.field1032.getOutputStream(), var3);
	}

	@Override
	public boolean method404(int var1) throws IOException {
		return this.field1029.method1599(var1);
	}

	@Override
	public int method408() throws IOException {
		return this.field1029.method1602();
	}

	@Override
	public int method405() throws IOException {
		return this.field1029.method1603();
	}

	@Override
	public int method407(byte[] var1, int var2, int var3) throws IOException {
		return this.field1029.method1601(var1, var2, var3);
	}

	@Override
	public void method403(byte[] var1, int var2, int var3) throws IOException {
		this.field1031.method1024(var1, 0, var3);
	}

	@Override
	public void method406() {
		this.field1031.method1022();

		try {
			this.field1032.close();
		} catch (IOException var3) {
		}

		this.field1029.method1600();
	}

	@Override
	protected void finalize() {
		this.method406();
	}
}
