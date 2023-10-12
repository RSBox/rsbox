import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class316 implements MouseListener, MouseMotionListener, FocusListener {
	public static class316 field2302;
	public static int field2308;
	public static int field2309;
	public static int field2315;
	public static int field2316;
	public static int field2318;
	public static int field2320;
	public static long field2311;
	public static long field2319;
	public static volatile int field2303;
	public static volatile int field2304;
	public static volatile int field2305;
	public static volatile int field2306;
	public static volatile int field2312;
	public static volatile int field2313;
	public static volatile int field2314;
	public static volatile long field2307;
	public static volatile long field2310;
	static class436 field2321;
	static int field2301;
	static String field2317;

	static {
		field2302 = new class316();
		field2305 = 0;
		field2304 = 0;
		field2303 = -1;
		field2306 = -1;
		field2310 = -1L;
		field2308 = 0;
		field2309 = 0;
		field2315 = 0;
		field2311 = 0L;
		field2312 = 0;
		field2313 = 0;
		field2314 = 0;
		field2307 = 0L;
		field2316 = 0;
		field2318 = 0;
		field2320 = 0;
		field2319 = 0L;
	}

	class316() {
	}

	final int method1572(MouseEvent var1) {
		int var3 = var1.getButton();
		if (!var1.isAltDown() && var3 != 2) {
			return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	@Override
	public final synchronized void mousePressed(MouseEvent var1) {
		if (null != field2302) {
			field2305 = 0;
			field2313 = var1.getX();
			field2314 = var1.getY();
			field2307 = class38.method108();
			field2312 = this.method1572(var1);
			if (field2312 != 0) {
				field2304 = field2312;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@Override
	public final synchronized void mouseReleased(MouseEvent var1) {
		if (field2302 != null) {
			field2305 = 0;
			field2304 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@Override
	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@Override
	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@Override
	public final synchronized void mouseExited(MouseEvent var1) {
		if (null != field2302) {
			field2305 = 0;
			field2303 = -1;
			field2306 = -1;
			field2310 = var1.getWhen();
		}

	}

	@Override
	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@Override
	public final synchronized void mouseMoved(MouseEvent var1) {
		if (field2302 != null) {
			field2305 = 0;
			field2303 = var1.getX();
			field2306 = var1.getY();
			field2310 = var1.getWhen();
		}

	}

	@Override
	public final void focusGained(FocusEvent var1) {
	}

	@Override
	public final synchronized void focusLost(FocusEvent var1) {
		if (null != field2302) {
			field2304 = 0;
		}

	}

	static void method1573(Component var0) {
		var0.addMouseListener(field2302);
		var0.addMouseMotionListener(field2302);
		var0.addFocusListener(field2302);
	}

	public static void method1575() {
		if (null != field2302) {
			synchronized(field2302) {
				field2302 = null;
			}
		}

	}

	public static void method1574(int var0) {
		field2305 = var0;
	}
}
