import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class class412 {
	static class5 field2847;

	static {
		ImageIO.setUseCache(false);
	}

	public static final class42 method1902(byte[] var0) {
		BufferedImage var2 = null;

		try {
			Class var3 = ImageIO.class;
			synchronized(ImageIO.class) {
				var2 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var10 = var2.getWidth();
			int var4 = var2.getHeight();
			int[] var5 = new int[var10 * var4];
			PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var10, var4, var5, 0, var10);
			var6.grabPixels();
			return new class42(var5, var10, var4);
		} catch (IOException var8) {
		} catch (InterruptedException var9) {
		}

		return new class42(0, 0);
	}
}
