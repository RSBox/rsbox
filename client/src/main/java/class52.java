import java.util.zip.Inflater;

public class class52 {
	Inflater field245;

	public class52() {
		this(-1, 1000000, 1000000);
	}

	class52(int var1, int var2, int var3) {
	}

	public void method211(Buffer var1, byte[] var2) {
		if (var1.data[var1.offset] == 31 && var1.data[1 + var1.offset] == -117) {
			if (this.field245 == null) {
				this.field245 = new Inflater(true);
			}

			try {
				this.field245.setInput(var1.data, 10 + var1.offset, var1.data.length - (8 + 10 + var1.offset));
				this.field245.inflate(var2);
			} catch (Exception var5) {
				this.field245.reset();
				throw new RuntimeException("");
			}

			this.field245.reset();
		} else {
			throw new RuntimeException("");
		}
	}
}
