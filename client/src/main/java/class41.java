import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class class41 extends Canvas {
	static class192 field203;
	Component field202;

	class41(Component var1) {
		this.field202 = var1;
	}

	@Override
	public final void update(Graphics var1) {
		this.field202.update(var1);
	}

	@Override
	public final void paint(Graphics var1) {
		this.field202.paint(var1);
	}
}
