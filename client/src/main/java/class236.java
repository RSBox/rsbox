import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class236 implements class104, MouseWheelListener {
	int field1564;

	class236() {
		this.field1564 = 0;
	}

	void method1086(Component var1) {
		var1.addMouseWheelListener(this);
	}

	void method1087(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@Override
	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.field1564 += var1.getWheelRotation();
	}

	@Override
	public synchronized int method471() {
		int var2 = this.field1564;
		this.field1564 = 0;
		return var2;
	}
}
