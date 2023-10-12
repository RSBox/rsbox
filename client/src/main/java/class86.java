import java.io.IOException;
import java.net.Socket;

public abstract class class86 {
	class86() {
	}

	public abstract boolean method404(int var1) throws IOException;

	public abstract int method405() throws IOException;

	public abstract int method407(byte[] var1, int var2, int var3) throws IOException;

	public abstract int method408() throws IOException;

	public abstract void method403(byte[] var1, int var2, int var3) throws IOException;

	public abstract void method406();

	public static class86 method409(Socket var0, int var1, int var2) throws IOException {
		return new class149(var0, 40000, 5000);
	}
}
