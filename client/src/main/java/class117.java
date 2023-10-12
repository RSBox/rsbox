import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class class117 extends class67 {
	byte[] field752;
	int field751;
	AudioFormat field749;
	SourceDataLine field750;

	class117() {
	}

	@Override
	public void method312() {
		this.field749 = new AudioFormat((float)class67.field437, 16, class107.field681 ? 2 : 1, true, false);
		this.field752 = new byte[256 << (class107.field681 ? 2 : 1)];
	}

	@Override
	public void method308(int var1) throws LineUnavailableException {
		try {
			Info var3 = new Info(SourceDataLine.class, this.field749, var1 << (class107.field681 ? 2 : 1));
			this.field750 = (SourceDataLine)AudioSystem.getLine(var3);
			this.field750.open();
			this.field750.start();
			this.field751 = var1;
		} catch (LineUnavailableException var4) {
			if (class254.method1216(var1) != 1) {
				this.method308(class254.method1215(var1));
			} else {
				this.field750 = null;
				throw var4;
			}
		}
	}

	@Override
	protected int method313() {
		return this.field751 - (this.field750.available() >> (class107.field681 ? 2 : 1));
	}

	@Override
	protected void method309() {
		short var1 = 256;
		if (class107.field681) {
			var1 = 512;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.field426[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.field752[var2 * 2] = (byte)(var3 >> 8);
			this.field752[var2 * 2 + 1] = (byte)(var3 >> 16);
		}

		this.field750.write(this.field752, 0, var1 << 1);
	}

	@Override
	protected void method311() {
		if (this.field750 != null) {
			this.field750.close();
			this.field750 = null;
		}

	}

	@Override
	protected void method310() {
		this.field750.flush();
	}
}
