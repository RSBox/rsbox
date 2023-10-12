import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class249 implements KeyListener, FocusListener {
	protected static boolean field1717;
	boolean[] field1715;
	class305[] field1714;
	Collection field1713;
	Collection field1716;
	volatile int field1712;

	class249() {
		this.field1714 = new class305[3];
		this.field1715 = new boolean[112];
		this.field1712 = 0;
		this.field1713 = new ArrayList(100);
		this.field1716 = new ArrayList(100);
	}

	void method1203(class305 var1, int var2) {
		this.field1714[var2] = var1;
	}

	int method1202() {
		return this.field1712;
	}

	void method1201(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	synchronized void method1205(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field1713.add(new class208(4, 0));
		}
	}

	void method1204() {
		++this.field1712;
		this.method1206();
		Iterator var2 = this.field1716.iterator();

		while (var2.hasNext()) {
			class208 var3 = (class208)var2.next();

			for (int var4 = 0; var4 < this.field1714.length && !var3.method977(this.field1714[var4]); ++var4) {
			}
		}

		this.field1716.clear();
	}

	@Override
	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label23: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class263.field1758.length;
				if (var2 < var4) {
					var2 = class263.method1233(var2);
					boolean var5 = (var2 & 128) != 0;
					if (var5) {
						var2 = -1;
					}
					break label23;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field1715[var2] = true;
			this.field1713.add(new class208(1, var2));
			this.field1712 = 0;
		}

		var1.consume();
	}

	@Override
	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label16: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class263.field1758.length;
				if (var2 < var4) {
					var2 = class263.method1233(var2) & -129;
					break label16;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field1715[var2] = false;
			this.field1713.add(new class208(2, var2));
		}

		var1.consume();
	}

	@Override
	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff') {
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
				label47: {
					if (var2 != 0) {
						char[] var4 = class88.field582;

						for (int var5 = 0; var5 < var4.length; ++var5) {
							char var6 = var4[var5];
							if (var2 == var6) {
								var3 = true;
								break label47;
							}
						}
					}

					var3 = false;
				}
			} else {
				var3 = true;
			}

			if (var3) {
				this.field1713.add(new class208(3, var2));
			}
		}

		var1.consume();
	}

	synchronized void method1206() {
		Collection var2 = this.field1716;
		this.field1716 = this.field1713;
		this.field1713 = var2;
	}

	@Override
	public final synchronized void focusGained(FocusEvent var1) {
		this.field1713.add(new class208(4, 1));
	}

	@Override
	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.field1715[var2]) {
				this.field1715[var2] = false;
				this.field1713.add(new class208(2, var2));
			}
		}

		this.field1713.add(new class208(4, 0));
	}
}
