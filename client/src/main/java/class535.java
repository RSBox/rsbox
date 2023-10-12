import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

public abstract class class535 extends Applet implements Runnable, FocusListener, WindowListener {
	protected static class430 field4187;
	protected static int field4167;
	static boolean field4163;
	static class249 field4191;
	static class535 field4185;
	static int field4159;
	static int field4161;
	static int field4165;
	static int field4166;
	static int field4183;
	static long field4162;
	static long field4186;
	static long field4192;
	static long[] field4170;
	static long[] field4173;
	static volatile boolean field4190;
	boolean field4164;
	boolean field4184;
	class236 field4178;
	int field4171;
	int field4174;
	int field4175;
	int field4177;
	int field4179;
	int field4193;
	Canvas field4181;
	Frame field4180;
	Clipboard field4188;
	final EventQueue field4189;
	protected boolean field4160;
	protected int field4168;
	protected int field4176;
	volatile boolean field4172;
	volatile boolean field4182;
	volatile long field4169;

	static {
		field4185 = null;
		field4161 = 0;
		field4162 = 0L;
		field4163 = false;
		field4165 = 20;
		field4166 = 1;
		field4167 = 0;
		field4173 = new long[32];
		field4170 = new long[32];
		field4159 = 500;
		field4190 = true;
		field4191 = new class249();
		field4192 = -1L;
		field4186 = -1L;
	}

	protected class535() {
		this.field4164 = false;
		this.field4193 = 0;
		this.field4174 = 0;
		this.field4160 = false;
		this.field4182 = true;
		this.field4184 = false;
		this.field4172 = false;
		this.field4169 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.field4189 = var1;
		class67.method321(new class340());
	}

	protected abstract void method2560();

	protected abstract void method2563();

	protected abstract void method2573();

	protected abstract void method2579();

	protected abstract void method2586();

	protected abstract void method2587(boolean var1);

	@Override
	public abstract void init();

	protected final void method2556(int var1, int var2) {
		if (var1 != this.field4177 || this.field4171 != var2) {
			this.method2570();
		}

		this.field4177 = var1;
		this.field4171 = var2;
	}

	final void method2557(Object var1) {
		if (this.field4189 != null) {
			for (int var3 = 0; var3 < 50 && this.field4189.peekEvent() != null; ++var3) {
				class325.method1587(1L);
			}

			if (null != var1) {
				this.field4189.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	protected class104 method2572() {
		if (this.field4178 == null) {
			this.field4178 = new class236();
			this.field4178.method1086(this.field4181);
		}

		return this.field4178;
	}

	protected void method2558() {
		this.field4188 = this.getToolkit().getSystemClipboard();
	}

	protected void method2585(String var1) {
		this.field4188.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	public Clipboard method2559() {
		return this.field4188;
	}

	protected final void method2589() {
		class263.method1234();
		field4191.method1201(this.field4181);
	}

	protected final void method2582() {
		field4191.method1204();
	}

	protected void method2561(class305 var1, int var2) {
		field4191.method1203(var1, var2);
	}

	protected final void method2583() {
		class316.method1573(this.field4181);
	}

	final void method2562() {
		Container var2 = this.method2577();
		if (null != var2) {
			class160 var3 = this.method2578();
			this.field4176 = Math.max(var3.field1146, this.field4175);
			this.field4168 = Math.max(var3.field1148, this.field4179);
			if (this.field4176 <= 0) {
				this.field4176 = 1;
			}

			if (this.field4168 <= 0) {
				this.field4168 = 1;
			}

			class164.field1170 = Math.min(this.field4176, this.field4177);
			class92.field595 = Math.min(this.field4168, this.field4171);
			this.field4193 = (this.field4176 - class164.field1170) / 2;
			this.field4174 = 0;
			this.field4181.setSize(class164.field1170, class92.field595);
			class246.field1638 = new class148(class164.field1170, class92.field595, this.field4181, this.field4160);
			if (var2 == this.field4180) {
				Insets var4 = this.field4180.getInsets();
				this.field4181.setLocation(var4.left + this.field4193, var4.top + this.field4174);
			} else {
				this.field4181.setLocation(this.field4193, this.field4174);
			}

			this.field4182 = true;
			this.method2563();
		}
	}

	void method2564() {
		int var2 = this.field4193;
		int var3 = this.field4174;
		int var4 = this.field4176 - class164.field1170 - var2;
		int var5 = this.field4168 - class92.field595 - var3;
		if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
			try {
				Container var6 = this.method2577();
				int var7 = 0;
				int var8 = 0;
				if (var6 == this.field4180) {
					Insets var9 = this.field4180.getInsets();
					var7 = var9.left;
					var8 = var9.top;
				}

				Graphics var11 = var6.getGraphics();
				var11.setColor(Color.black);
				if (var2 > 0) {
					var11.fillRect(var7, var8, var2, this.field4168);
				}

				if (var3 > 0) {
					var11.fillRect(var7, var8, this.field4176, var3);
				}

				if (var4 > 0) {
					var11.fillRect(var7 + this.field4176 - var4, var8, var4, this.field4168);
				}

				if (var5 > 0) {
					var11.fillRect(var7, this.field4168 + var8 - var5, this.field4176, var5);
				}
			} catch (Exception var10) {
			}
		}

	}

	final void method2565() {
		field4191.method1205(this.field4181);
		Canvas var2 = this.field4181;
		var2.removeMouseListener(class316.field2302);
		var2.removeMouseMotionListener(class316.field2302);
		var2.removeFocusListener(class316.field2302);
		class316.field2304 = 0;
		if (null != this.field4178) {
			this.field4178.method1087(this.field4181);
		}

		this.method2571();
		field4191.method1201(this.field4181);
		class316.method1573(this.field4181);
		if (this.field4178 != null) {
			this.field4178.method1086(this.field4181);
		}

		this.method2570();
	}

	protected final void method2566(int var1, int var2, int var3, int var4) {
		try {
			if (field4185 != null) {
				++field4161;
				if (field4161 >= 3) {
					this.method2576("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			field4185 = this;
			class164.field1170 = 765;
			class92.field595 = 503;
			class2.field2 = 217;
			class2.field3 = 1;
			class6.field31 = this;
			if (field4187 == null) {
				field4187 = new class430();
			}

			field4187.method1950(this, 1);
		} catch (Exception var7) {
			class2.method1((String)null, var7);
			this.method2576("crash");
		}

	}

	final synchronized void method2571() {
		Container var2 = this.method2577();
		if (null != this.field4181) {
			this.field4181.removeFocusListener(this);
			var2.remove(this.field4181);
		}

		class164.field1170 = Math.max(var2.getWidth(), this.field4175);
		class92.field595 = Math.max(var2.getHeight(), this.field4179);
		Insets var3;
		if (null != this.field4180) {
			var3 = this.field4180.getInsets();
			class164.field1170 -= var3.right + var3.left;
			class92.field595 -= var3.top + var3.bottom;
		}

		this.field4181 = new class41(this);
		var2.setBackground(Color.BLACK);
		var2.setLayout((LayoutManager)null);
		var2.add(this.field4181);
		this.field4181.setSize(class164.field1170, class92.field595);
		this.field4181.setVisible(true);
		this.field4181.setBackground(Color.BLACK);
		if (this.field4180 == var2) {
			var3 = this.field4180.getInsets();
			this.field4181.setLocation(this.field4193 + var3.left, this.field4174 + var3.top);
		} else {
			this.field4181.setLocation(this.field4193, this.field4174);
		}

		this.field4181.addFocusListener(this);
		this.field4181.requestFocus();
		this.field4182 = true;
		if (class246.field1638 != null && class246.field1638.field4306 == class164.field1170 && class92.field595 == class246.field1638.field4309) {
			((class148)class246.field1638).method793(this.field4181);
			class246.field1638.method2638(0, 0);
		} else {
			class246.field1638 = new class148(class164.field1170, class92.field595, this.field4181, this.field4160);
		}

		this.field4172 = false;
		this.field4169 = class38.method108();
	}

	protected void method2567(boolean var1) {
		if (var1 != this.field4160) {
			this.field4160 = var1;
			class246.field1638.method2637(var1);
			class246.field1638.method2635();
		}

	}

	protected final boolean method2580() {
		String var2 = this.getDocumentBase().getHost().toLowerCase();
		if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
			if (!var2.equals(ClientLauncher.SERVER_IP) && !var2.endsWith(".runescape.com")) {
				if (var2.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
						var2 = var2.substring(0, var2.length() - 1);
					}

					if (var2.endsWith("192.168.1.")) {
						return true;
					} else {
						this.method2576("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@Override
	public void run() {
		try {
			if (null != class430.field2885) {
				String var1 = class430.field2885.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = class430.field2881;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.method2576("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class385.method1820(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class385.method1812(var4) && class385.method1807(var4) < 10) {
							this.method2576("wrongjava");
							return;
						}
					}

					field4166 = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.method2571();
			this.method2573();
			class210.field1391 = class458.method2145();

			while (0L == field4162 || class38.method108() < field4162) {
				class396.field2684 = class210.field1391.method2144(field4165, field4166);

				for (int var6 = 0; var6 < class396.field2684; ++var6) {
					this.method2568();
				}

				this.method2569();
				this.method2557(this.field4181);
			}
		} catch (Exception var5) {
			class2.method1((String)null, var5);
			this.method2576("crash");
		}

		this.method2574();
	}

	void method2568() {
		long var2 = class38.method108();
		long var4 = field4170[class94.field601];
		field4170[class94.field601] = var2;
		class94.field601 = class94.field601 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
		}

		synchronized(this) {
			class249.field1717 = field4190;
		}

		this.method2586();
	}

	protected final void method2588() {
		this.field4182 = true;
	}

	void method2569() {
		Container var2 = this.method2577();
		long var3 = class38.method108();
		long var5 = field4173[field4183];
		field4173[field4183] = var3;
		field4183 = field4183 + 1 & 31;
		if (var5 != 0L && var3 > var5) {
			int var7 = (int)(var3 - var5);
			field4167 = (32000 + (var7 >> 1)) / var7;
		}

		if (++field4159 - 1 > 50) {
			field4159 -= 50;
			this.field4182 = true;
			this.field4181.setSize(class164.field1170, class92.field595);
			this.field4181.setVisible(true);
			if (var2 == this.field4180) {
				Insets var8 = this.field4180.getInsets();
				this.field4181.setLocation(this.field4193 + var8.left, this.field4174 + var8.top);
			} else {
				this.field4181.setLocation(this.field4193, this.field4174);
			}
		}

		if (this.field4172) {
			this.method2565();
		}

		this.method2584();
		this.method2587(this.field4182);
		if (this.field4182) {
			this.method2564();
		}

		this.field4182 = false;
	}

	final void method2584() {
		class160 var2 = this.method2578();
		if (var2.field1146 != this.field4176 || var2.field1148 != this.field4168 || this.field4184) {
			this.method2562();
			this.field4184 = false;
		}

	}

	final void method2570() {
		this.field4184 = true;
	}

	final synchronized void method2574() {
		if (!field4163) {
			field4163 = true;

			try {
				this.field4181.removeFocusListener(this);
			} catch (Exception var6) {
			}

			try {
				this.method2560();
			} catch (Exception var5) {
			}

			if (null != this.field4180) {
				try {
					System.exit(0);
				} catch (Throwable var4) {
				}
			}

			if (null != field4187) {
				try {
					field4187.method1953();
				} catch (Exception var3) {
				}
			}

			this.method2579();
		}
	}

	@Override
	public final void start() {
		if (field4185 == this && !field4163) {
			field4162 = 0L;
		}
	}

	@Override
	public final void stop() {
		if (field4185 == this && !field4163) {
			field4162 = class38.method108() + 4000L;
		}
	}

	@Override
	public final void destroy() {
		if (this == field4185 && !field4163) {
			field4162 = class38.method108();
			class325.method1587(5000L);
			this.method2574();
		}
	}

	@Override
	public final void update(Graphics var1) {
		this.paint(var1);
	}

	@Override
	public final synchronized void paint(Graphics var1) {
		if (field4185 == this && !field4163) {
			this.field4182 = true;
			if (class38.method108() - this.field4169 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class164.field1170 && var2.height >= class92.field595) {
					this.field4172 = true;
				}
			}

		}
	}

	@Override
	public final void focusGained(FocusEvent var1) {
		field4190 = true;
		this.field4182 = true;
	}

	@Override
	public final void focusLost(FocusEvent var1) {
		field4190 = false;
	}

	@Override
	public final void windowActivated(WindowEvent var1) {
	}

	@Override
	public final void windowClosed(WindowEvent var1) {
	}

	@Override
	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	@Override
	public final void windowDeactivated(WindowEvent var1) {
	}

	@Override
	public final void windowDeiconified(WindowEvent var1) {
	}

	@Override
	public final void windowIconified(WindowEvent var1) {
	}

	@Override
	public final void windowOpened(WindowEvent var1) {
	}

	protected final void method2590(int var1, String var2, boolean var3) {
		try {
			Graphics var5 = this.field4181.getGraphics();
			if (null == class434.field2906) {
				class434.field2906 = new Font("Helvetica", 1, 13);
				class434.field2907 = this.field4181.getFontMetrics(class434.field2906);
			}

			if (var3) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, class164.field1170, class92.field595);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (null == class483.field3398) {
					class483.field3398 = this.field4181.createImage(304, 34);
				}

				Graphics var7 = class483.field3398.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(class434.field2906);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class434.field2907.stringWidth(var2)) / 2, 22);
				var5.drawImage(class483.field3398, class164.field1170 / 2 - 152, class92.field595 / 2 - 18, (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = class164.field1170 / 2 - 152;
				int var9 = class92.field595 / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + 2 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(class434.field2906);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class434.field2907.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.field4181.repaint();
		}

	}

	protected final void method2575() {
		class483.field3398 = null;
		class434.field2906 = null;
		class434.field2907 = null;
	}

	protected void method2576(String var1) {
		if (!this.field4164) {
			this.field4164 = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var4) {
			}

		}
	}

	Container method2577() {
		return (Container)(null != this.field4180 ? this.field4180 : this);
	}

	class160 method2578() {
		Container var2 = this.method2577();
		int var3 = Math.max(var2.getWidth(), this.field4175);
		int var4 = Math.max(var2.getHeight(), this.field4179);
		if (this.field4180 != null) {
			Insets var5 = this.field4180.getInsets();
			var3 -= var5.right + var5.left;
			var4 -= var5.bottom + var5.top;
		}

		return new class160(var3, var4);
	}

	protected final boolean method2581() {
		return this.field4180 != null;
	}

	protected static final int method2593() {
		return field4191.method1202();
	}

	protected static final void method2591() {
		class210.field1391.method2143();

		int var1;
		for (var1 = 0; var1 < 32; ++var1) {
			field4173[var1] = 0L;
		}

		for (var1 = 0; var1 < 32; ++var1) {
			field4170[var1] = 0L;
		}

		class396.field2684 = 0;
	}

	protected static int method2592() {
		int var1 = 0;
		if (class178.field1229 == null || !class178.field1229.isValid()) {
			try {
				Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var2.hasNext()) {
					GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
					if (var3.isValid()) {
						class178.field1229 = var3;
						field4186 = -1L;
						field4192 = -1L;
					}
				}
			} catch (Throwable var10) {
			}
		}

		if (null != class178.field1229) {
			long var11 = class38.method108();
			long var4 = class178.field1229.getCollectionTime();
			if (field4192 != -1L) {
				long var6 = var4 - field4192;
				long var8 = var11 - field4186;
				if (0L != var8) {
					var1 = (int)(var6 * 100L / var8);
				}
			}

			field4192 = var4;
			field4186 = var11;
		}

		return var1;
	}
}
