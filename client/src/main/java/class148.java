import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class class148 extends class552 {
	Component field1028;
	Image field1027;

	class148(int var1, int var2, Component var3, boolean var4) {
		super.field4306 = var1;
		super.field4309 = var2;
		super.field4308 = new int[1 + var2 * var1];
		if (var4) {
			super.field4307 = new float[var1 * var2 + 1];
		}

		DataBufferInt var5 = new DataBufferInt(super.field4308, super.field4308.length);
		DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field4306, super.field4309), var5, (Point)null);
		this.field1027 = new BufferedImage(var6, var7, false, new Hashtable());
		this.method793(var3);
		this.method2635();
	}

	final void method793(Component var1) {
		this.field1028 = var1;
	}

	@Override
	public final void method2638(int var1, int var2) {
		this.method797(this.field1028.getGraphics(), 0, 0);
	}

	@Override
	public final void method2636(int var1, int var2, int var3, int var4) {
		this.method795(this.field1028.getGraphics(), var1, var2, var3, var4);
	}

	final void method797(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.field1027, 0, 0, this.field1028);
		} catch (Exception var6) {
			this.field1028.repaint();
		}

	}

	final void method795(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var7 = var1.getClip();
			var1.clipRect(var2, var3, var4, var5);
			var1.drawImage(this.field1027, 0, 0, this.field1028);
			var1.setClip(var7);
		} catch (Exception var8) {
			this.field1028.repaint();
		}

	}
}
