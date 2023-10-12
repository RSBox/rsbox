import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class356 {
	RandomAccessFile field2458;
	long field2456;
	final long field2457;

	public class356(File var1, String var2, long var3) throws IOException {
		if (-1L == var3) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.field2458 = new RandomAccessFile(var1, var2);
		this.field2457 = var3;
		this.field2456 = 0L;
		int var5 = this.field2458.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.field2458.seek(0L);
			this.field2458.write(var5);
		}

		this.field2458.seek(0L);
	}

	final void method1706(long var1) throws IOException {
		this.field2458.seek(var1);
		this.field2456 = var1;
	}

	public final void method1707(byte[] var1, int var2, int var3) throws IOException {
		if ((long)var3 + this.field2456 > this.field2457) {
			this.field2458.seek(this.field2457);
			this.field2458.write(1);
			throw new EOFException();
		} else {
			this.field2458.write(var1, var2, var3);
			this.field2456 += (long)var3;
		}
	}

	public final void method1708() throws IOException {
		this.method1709(false);
	}

	public final void method1709(boolean var1) throws IOException {
		if (null != this.field2458) {
			if (var1) {
				try {
					this.field2458.getFD().sync();
				} catch (SyncFailedException var4) {
				}
			}

			this.field2458.close();
			this.field2458 = null;
		}

	}

	public final long method1710() throws IOException {
		return this.field2458.length();
	}

	public final int method1711(byte[] var1, int var2, int var3) throws IOException {
		int var5 = this.field2458.read(var1, var2, var3);
		if (var5 > 0) {
			this.field2456 += (long)var5;
		}

		return var5;
	}

	@Override
	protected void finalize() throws Throwable {
		if (this.field2458 != null) {
			System.out.println("");
			this.method1708();
		}

	}
}
