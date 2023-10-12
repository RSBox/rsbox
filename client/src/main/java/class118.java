import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class class118 extends class362 {
	static ThreadPoolExecutor field763;
	static AtomicBoolean field781;
	boolean field771;
	class217 field772;
	class273[][] field770;
	class273[][] field773;
	class303 field761;
	class375 field777;
	int field754;
	int field755;
	int field774;
	int field776;
	int[] field753;
	int[] field756;
	int[] field757;
	int[] field758;
	int[] field760;
	int[] field762;
	int[] field764;
	int[] field765;
	int[] field766;
	int[] field767;
	int[] field768;
	int[] field769;
	int[] field775;
	int[] field782;
	int[] field783;
	PriorityQueue field780;
	long field778;
	long field779;
	public int field759;

	static {
		field781 = null;
		field763 = null;
	}

	public class118() {
		this.field754 = 256;
		this.field755 = 1000000;
		this.field756 = new int[16];
		this.field757 = new int[16];
		this.field758 = new int[16];
		this.field766 = new int[16];
		this.field760 = new int[16];
		this.field753 = new int[16];
		this.field762 = new int[16];
		this.field782 = new int[16];
		this.field764 = new int[16];
		this.field765 = new int[16];
		this.field775 = new int[16];
		this.field767 = new int[16];
		this.field768 = new int[16];
		this.field769 = new int[16];
		this.field783 = new int[16];
		this.field773 = new class273[16][128];
		this.field770 = new class273[16][128];
		this.field761 = new class303();
		this.field772 = new class217(this);
		this.field780 = new PriorityQueue(5, new class449());
		this.field759 = 0;
		this.field777 = new class375(128);
		this.method559();
	}

	public synchronized void method542(int var1) {
		this.field754 = var1;
	}

	public int method543() {
		return this.field754;
	}

	public synchronized boolean method544(class44 var1, class5 var2, class209 var3) {
		boolean var5 = true;
		synchronized(this.field780) {
			this.field780.clear();
		}

		for (class377 var6 = (class377)var1.field219.method1753(); var6 != null; var6 = (class377)var1.field219.method1754()) {
			int var7 = (int)var6.field2472;
			class27 var8 = (class27)this.field777.get((long)var7);
			if (var8 == null) {
				var8 = class27.method91(var2, var7);
				if (var8 == null) {
					var5 = false;
					continue;
				}

				this.field777.put(var8, (long)var7);
			}

			if (!var8.method89(var3, var6.field2596)) {
				var5 = false;
			} else if (this.field780 != null) {
				synchronized(this.field780) {
					Iterator var10 = var8.field134.iterator();

					while (var10.hasNext()) {
						class214 var11 = (class214)var10.next();
						this.field780.add(new class46(var6.field2597, var11));
					}
				}
			}
		}

		return var5;
	}

	public void method548() {
		if (this.field780 != null) {
			if (field781 != null) {
				field781.set(true);
			}

			field781 = new AtomicBoolean(false);
			AtomicBoolean var2 = field781;
			if (null == field763) {
				int var3 = Runtime.getRuntime().availableProcessors();
				field763 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class195(this));
			}

			field763.submit(new class498(this, var2));
		}
	}

	public synchronized void method545() {
		for (class27 var2 = (class27)this.field777.method1753(); null != var2; var2 = (class27)this.field777.method1754()) {
			var2.method88();
		}

	}

	public synchronized void method572() {
		for (class27 var2 = (class27)this.field777.method1753(); var2 != null; var2 = (class27)this.field777.method1754()) {
			var2.method1719();
		}

	}

	public synchronized void method577(class44 var1, boolean var2) {
		this.method546();
		this.field761.method1539(var1.field218);
		this.field771 = var2;
		this.field779 = 0L;
		int var4 = this.field761.method1550();

		for (int var5 = 0; var5 < var4; ++var5) {
			this.field761.method1541(var5);
			this.field761.method1544(var5);
			this.field761.method1542(var5);
		}

		this.field774 = this.field761.method1543();
		this.field776 = this.field761.field2217[this.field774];
		this.field778 = this.field761.method1551(this.field776);
	}

	public synchronized void method546() {
		this.field761.method1540();
		this.method559();
	}

	public synchronized boolean method547() {
		return this.field761.method1553();
	}

	public synchronized boolean method575() {
		return this.field777.method1752() > 0;
	}

	public synchronized void method549(int var1, int var2) {
		this.method550(9, 128);
	}

	void method550(int var1, int var2) {
		this.field766[9] = 128;
		this.field753[9] = 128;
		this.method551(9, 128);
	}

	void method551(int var1, int var2) {
		if (var2 != this.field760[var1]) {
			this.field760[var1] = var2;

			for (int var4 = 0; var4 < 128; ++var4) {
				this.field770[var1][var4] = null;
			}
		}

	}

	void method578(int var1, int var2, int var3) {
		this.method553(var1, var2, 64);
		if ((this.field765[var1] & 2) != 0) {
			for (class273 var5 = (class273)this.field772.field1413.method324(); null != var5; var5 = (class273)this.field772.field1413.method325()) {
				if (var5.field1798 == var1 && var5.field1806 < 0) {
					this.field773[var1][var5.field1802] = null;
					this.field773[var1][var2] = var5;
					int var6 = (var5.field1807 * var5.field1811 >> 12) + var5.field1799;
					var5.field1799 += var2 - var5.field1802 << 8;
					var5.field1811 = var6 - var5.field1799;
					var5.field1807 = 4096;
					var5.field1802 = var2;
					return;
				}
			}
		}

		class27 var9 = (class27)this.field777.get((long)this.field760[var1]);
		if (null != var9) {
			if (null != var9.field128[var2]) {
				class7 var10 = var9.field128[var2].method993();
				if (var10 != null) {
					class273 var7 = new class273();
					var7.field1798 = var1;
					var7.field1814 = var9;
					var7.field1797 = var10;
					var7.field1800 = var9.field132[var2];
					var7.field1801 = var9.field127[var2];
					var7.field1802 = var2;
					var7.field1803 = var9.field130[var2] * var3 * var3 * var9.field131 + 1024 >> 11;
					var7.field1804 = var9.field133[var2] & 255;
					var7.field1799 = (var2 << 8) - (var9.field129[var2] & 32767);
					var7.field1808 = 0;
					var7.field1809 = 0;
					var7.field1810 = 0;
					var7.field1806 = -1;
					var7.field1812 = 0;
					if (this.field768[var1] == 0) {
						var7.field1805 = class335.method1638(var10, this.method570(var7), this.method561(var7), this.method562(var7));
					} else {
						var7.field1805 = class335.method1638(var10, this.method570(var7), 0, this.method562(var7));
						this.method552(var7, var9.field129[var2] < 0);
					}

					if (var9.field129[var2] < 0) {
						var7.field1805.method1623(-1);
					}

					if (var7.field1801 >= 0) {
						class273 var8 = this.field770[var1][var7.field1801];
						if (var8 != null && var8.field1806 < 0) {
							this.field773[var1][var8.field1802] = null;
							var8.field1806 = 0;
						}

						this.field770[var1][var7.field1801] = var7;
					}

					this.field772.field1413.method323(var7);
					this.field773[var1][var2] = var7;
				}
			}
		}
	}

	void method552(class273 var1, boolean var2) {
		int var4 = var1.field1797.field35.length;
		int var5;
		if (var2 && var1.field1797.field36) {
			int var6 = var4 + var4 - var1.field1797.field33;
			var5 = (int)((long)this.field768[var1.field1798] * (long)var6 >> 6);
			var4 <<= 8;
			if (var5 >= var4) {
				var5 = var4 + var4 - 1 - var5;
				var1.field1805.method1612(true);
			}
		} else {
			var5 = (int)((long)var4 * (long)this.field768[var1.field1798] >> 6);
		}

		var1.field1805.method1611(var5);
	}

	void method553(int var1, int var2, int var3) {
		class273 var5 = this.field773[var1][var2];
		if (null != var5) {
			this.field773[var1][var2] = null;
			if ((this.field765[var1] & 2) != 0) {
				for (class273 var6 = (class273)this.field772.field1413.method327(); var6 != null; var6 = (class273)this.field772.field1413.method331()) {
					if (var6.field1798 == var5.field1798 && var6.field1806 < 0 && var6 != var5) {
						var5.field1806 = 0;
						break;
					}
				}
			} else {
				var5.field1806 = 0;
			}

		}
	}

	void method576(int var1, int var2, int var3) {
	}

	void method554(int var1, int var2) {
	}

	void method555(int var1, int var2) {
		this.field762[var1] = var2;
	}

	void method556(int var1) {
		for (class273 var3 = (class273)this.field772.field1413.method327(); var3 != null; var3 = (class273)this.field772.field1413.method331()) {
			if (var1 < 0 || var3.field1798 == var1) {
				if (var3.field1805 != null) {
					var3.field1805.method1615(class67.field437 / 100);
					if (var3.field1805.method1626()) {
						this.field772.field1415.method1140(var3.field1805);
					}

					var3.method1265();
				}

				if (var3.field1806 < 0) {
					this.field773[var3.field1798][var3.field1802] = null;
				}

				var3.method1719();
			}
		}

	}

	void method557(int var1) {
		if (var1 >= 0) {
			this.field756[var1] = 12800;
			this.field757[var1] = 8192;
			this.field758[var1] = 16383;
			this.field762[var1] = 8192;
			this.field782[var1] = 0;
			this.field764[var1] = 8192;
			this.method563(var1);
			this.method579(var1);
			this.field765[var1] = 0;
			this.field775[var1] = 32767;
			this.field767[var1] = 256;
			this.field768[var1] = 0;
			this.method566(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method557(var1);
			}

		}
	}

	void method558(int var1) {
		for (class273 var3 = (class273)this.field772.field1413.method327(); null != var3; var3 = (class273)this.field772.field1413.method331()) {
			if ((var1 < 0 || var3.field1798 == var1) && var3.field1806 < 0) {
				this.field773[var3.field1798][var3.field1802] = null;
				var3.field1806 = 0;
			}
		}

	}

	void method559() {
		this.method556(-1);
		this.method557(-1);

		int var2;
		for (var2 = 0; var2 < 16; ++var2) {
			this.field760[var2] = this.field766[var2];
		}

		for (var2 = 0; var2 < 16; ++var2) {
			this.field753[var2] = this.field766[var2] & -128;
		}

	}

	void method563(int var1) {
		if ((this.field765[var1] & 2) != 0) {
			for (class273 var3 = (class273)this.field772.field1413.method327(); null != var3; var3 = (class273)this.field772.field1413.method331()) {
				if (var3.field1798 == var1 && this.field773[var1][var3.field1802] == null && var3.field1806 < 0) {
					var3.field1806 = 0;
				}
			}
		}

	}

	void method579(int var1) {
		if ((this.field765[var1] & 4) != 0) {
			for (class273 var3 = (class273)this.field772.field1413.method327(); var3 != null; var3 = (class273)this.field772.field1413.method331()) {
				if (var3.field1798 == var1) {
					var3.field1816 = 0;
				}
			}
		}

	}

	void method560(int var1) {
		int var3 = var1 & 240;
		int var4;
		int var5;
		int var6;
		if (var3 == 128) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method553(var4, var5, var6);
		} else if (var3 == 144) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var6 > 0) {
				this.method578(var4, var5, var6);
			} else {
				this.method553(var4, var5, 64);
			}

		} else if (var3 == 160) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method576(var4, var5, var6);
		} else if (var3 == 176) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var5 == 0) {
				this.field753[var4] = (var6 << 14) + (this.field753[var4] & -2080769);
			}

			if (var5 == 32) {
				this.field753[var4] = (var6 << 7) + (this.field753[var4] & -16257);
			}

			if (var5 == 1) {
				this.field782[var4] = (var6 << 7) + (this.field782[var4] & -16257);
			}

			if (var5 == 33) {
				this.field782[var4] = var6 + (this.field782[var4] & -128);
			}

			if (var5 == 5) {
				this.field764[var4] = (this.field764[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 37) {
				this.field764[var4] = var6 + (this.field764[var4] & -128);
			}

			if (var5 == 7) {
				this.field756[var4] = (var6 << 7) + (this.field756[var4] & -16257);
			}

			if (var5 == 39) {
				this.field756[var4] = (this.field756[var4] & -128) + var6;
			}

			if (var5 == 10) {
				this.field757[var4] = (var6 << 7) + (this.field757[var4] & -16257);
			}

			if (var5 == 42) {
				this.field757[var4] = var6 + (this.field757[var4] & -128);
			}

			if (var5 == 11) {
				this.field758[var4] = (var6 << 7) + (this.field758[var4] & -16257);
			}

			if (var5 == 43) {
				this.field758[var4] = var6 + (this.field758[var4] & -128);
			}

			int[] var10000;
			if (var5 == 64) {
				if (var6 >= 64) {
					var10000 = this.field765;
					var10000[var4] |= 1;
				} else {
					var10000 = this.field765;
					var10000[var4] &= -2;
				}
			}

			if (var5 == 65) {
				if (var6 >= 64) {
					var10000 = this.field765;
					var10000[var4] |= 2;
				} else {
					this.method563(var4);
					var10000 = this.field765;
					var10000[var4] &= -3;
				}
			}

			if (var5 == 99) {
				this.field775[var4] = (this.field775[var4] & 127) + (var6 << 7);
			}

			if (var5 == 98) {
				this.field775[var4] = var6 + (this.field775[var4] & 16256);
			}

			if (var5 == 101) {
				this.field775[var4] = (this.field775[var4] & 127) + 16384 + (var6 << 7);
			}

			if (var5 == 100) {
				this.field775[var4] = var6 + (this.field775[var4] & 16256) + 16384;
			}

			if (var5 == 120) {
				this.method556(var4);
			}

			if (var5 == 121) {
				this.method557(var4);
			}

			if (var5 == 123) {
				this.method558(var4);
			}

			int var7;
			if (var5 == 6) {
				var7 = this.field775[var4];
				if (var7 == 16384) {
					this.field767[var4] = (this.field767[var4] & -16257) + (var6 << 7);
				}
			}

			if (var5 == 38) {
				var7 = this.field775[var4];
				if (var7 == 16384) {
					this.field767[var4] = var6 + (this.field767[var4] & -128);
				}
			}

			if (var5 == 16) {
				this.field768[var4] = (this.field768[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 48) {
				this.field768[var4] = var6 + (this.field768[var4] & -128);
			}

			if (var5 == 81) {
				if (var6 >= 64) {
					var10000 = this.field765;
					var10000[var4] |= 4;
				} else {
					this.method579(var4);
					var10000 = this.field765;
					var10000[var4] &= -5;
				}
			}

			if (var5 == 17) {
				this.method566(var4, (var6 << 7) + (this.field769[var4] & -16257));
			}

			if (var5 == 49) {
				this.method566(var4, var6 + (this.field769[var4] & -128));
			}

		} else if (var3 == 192) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method551(var4, var5 + this.field753[var4]);
		} else if (var3 == 208) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method554(var4, var5);
		} else if (var3 == 224) {
			var4 = var1 & 15;
			var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method555(var4, var5);
		} else {
			var3 = var1 & 255;
			if (var3 == 255) {
				this.method559();
			}
		}
	}

	void method566(int var1, int var2) {
		this.field769[var1] = var2;
		this.field783[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	int method570(class273 var1) {
		int var3 = var1.field1799 + (var1.field1811 * var1.field1807 >> 12);
		var3 += (this.field762[var1.field1798] - 8192) * this.field767[var1.field1798] >> 12;
		class33 var4 = var1.field1800;
		int var5;
		if (var4.field170 > 0 && (var4.field169 > 0 || this.field782[var1.field1798] > 0)) {
			var5 = var4.field169 << 2;
			int var6 = var4.field172 << 1;
			if (var1.field1813 < var6) {
				var5 = var1.field1813 * var5 / var6;
			}

			var5 += this.field782[var1.field1798] >> 7;
			double var7 = Math.sin((double)(var1.field1815 & 511) * 0.01227184630308513D);
			var3 += (int)((double)var5 * var7);
		}

		var5 = (int)((double)(256 * var1.field1797.field34) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var3) / (double)class67.field437 + 0.5D);
		return var5 < 1 ? 1 : var5;
	}

	int method561(class273 var1) {
		class33 var3 = var1.field1800;
		int var4 = this.field758[var1.field1798] * this.field756[var1.field1798] + 4096 >> 13;
		var4 = 16384 + var4 * var4 >> 15;
		var4 = var4 * var1.field1803 + 16384 >> 15;
		var4 = var4 * this.field754 + 128 >> 8;
		if (var3.field166 > 0) {
			var4 = (int)((double)var4 * Math.pow(0.5D, (double)var3.field166 * (double)var1.field1808 * 1.953125E-5D) + 0.5D);
		}

		int var5;
		int var6;
		int var7;
		int var8;
		if (null != var3.field167) {
			var5 = var1.field1809;
			var6 = var3.field167[1 + var1.field1810];
			if (var1.field1810 < var3.field167.length - 2) {
				var7 = (var3.field167[var1.field1810] & 255) << 8;
				var8 = (var3.field167[var1.field1810 + 2] & 255) << 8;
				var6 += (var3.field167[var1.field1810 + 3] - var6) * (var5 - var7) / (var8 - var7);
			}

			var4 = var6 * var4 + 32 >> 6;
		}

		if (var1.field1806 > 0 && var3.field165 != null) {
			var5 = var1.field1806;
			var6 = var3.field165[var1.field1812 + 1];
			if (var1.field1812 < var3.field165.length - 2) {
				var7 = (var3.field165[var1.field1812] & 255) << 8;
				var8 = (var3.field165[var1.field1812 + 2] & 255) << 8;
				var6 += (var3.field165[3 + var1.field1812] - var6) * (var5 - var7) / (var8 - var7);
			}

			var4 = 32 + var6 * var4 >> 6;
		}

		return var4;
	}

	int method562(class273 var1) {
		int var3 = this.field757[var1.field1798];
		return var3 < 8192 ? var3 * var1.field1804 + 32 >> 6 : 16384 - (32 + (16384 - var3) * (128 - var1.field1804) >> 6);
	}

	@Override
	protected synchronized class362 method1727() {
		return this.field772;
	}

	@Override
	protected synchronized class362 method1728() {
		return null;
	}

	@Override
	protected synchronized int method1723() {
		return 0;
	}

	@Override
	protected synchronized void method1725(int[] var1, int var2, int var3) {
		if (this.field761.method1553()) {
			int var4 = this.field761.field2220 * this.field755 / class67.field437;

			do {
				long var5 = this.field779 + (long)var3 * (long)var4;
				if (this.field778 - var5 >= 0L) {
					this.field779 = var5;
					break;
				}

				int var7 = (int)((this.field778 - this.field779 + (long)var4 - 1L) / (long)var4);
				this.field779 += (long)var7 * (long)var4;
				this.field772.method1725(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method567();
			} while(this.field761.method1553());
		}

		this.field772.method1725(var1, var2, var3);
	}

	@Override
	protected synchronized void method1726(int var1) {
		if (this.field761.method1553()) {
			int var2 = this.field761.field2220 * this.field755 / class67.field437;

			do {
				long var3 = this.field779 + (long)var1 * (long)var2;
				if (this.field778 - var3 >= 0L) {
					this.field779 = var3;
					break;
				}

				int var5 = (int)((this.field778 - this.field779 + (long)var2 - 1L) / (long)var2);
				this.field779 += (long)var5 * (long)var2;
				this.field772.method1726(var5);
				var1 -= var5;
				this.method567();
			} while(this.field761.method1553());
		}

		this.field772.method1726(var1);
	}

	void method567() {
		int var2 = this.field774;
		int var3 = this.field776;

		long var4;
		for (var4 = this.field778; var3 == this.field776; var4 = this.field761.method1551(var3)) {
			while (this.field761.field2217[var2] == var3) {
				this.field761.method1541(var2);
				int var6 = this.field761.method1545(var2);
				if (var6 == 1) {
					this.field761.method1552();
					this.field761.method1542(var2);
					if (this.field761.method1548()) {
						if (!this.field771 || var3 == 0) {
							this.method559();
							this.field761.method1540();
							return;
						}

						this.field761.method1549(var4);
					}
					break;
				}

				if ((var6 & 128) != 0) {
					this.method560(var6);
				}

				this.field761.method1544(var2);
				this.field761.method1542(var2);
			}

			var2 = this.field761.method1543();
			var3 = this.field761.field2217[var2];
		}

		this.field774 = var2;
		this.field776 = var3;
		this.field778 = var4;
	}

	boolean method573(class273 var1) {
		if (null == var1.field1805) {
			if (var1.field1806 >= 0) {
				var1.method1719();
				if (var1.field1801 > 0 && var1 == this.field770[var1.field1798][var1.field1801]) {
					this.field770[var1.field1798][var1.field1801] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	boolean method568(class273 var1, int[] var2, int var3, int var4) {
		var1.field1817 = class67.field437 / 100;
		if (var1.field1806 < 0 || var1.field1805 != null && !var1.field1805.method1618()) {
			int var6 = var1.field1807;
			if (var6 > 0) {
				var6 -= (int)(16.0D * Math.pow(2.0D, (double)this.field764[var1.field1798] * 4.921259842519685E-4D) + 0.5D);
				if (var6 < 0) {
					var6 = 0;
				}

				var1.field1807 = var6;
			}

			var1.field1805.method1616(this.method570(var1));
			class33 var7 = var1.field1800;
			boolean var8 = false;
			++var1.field1813;
			var1.field1815 += var7.field170;
			double var9 = (double)((var1.field1811 * var1.field1807 >> 12) + (var1.field1802 - 60 << 8)) * 5.086263020833333E-6D;
			if (var7.field166 > 0) {
				if (var7.field168 > 0) {
					var1.field1808 += (int)(128.0D * Math.pow(2.0D, (double)var7.field168 * var9) + 0.5D);
				} else {
					var1.field1808 += 128;
				}
			}

			if (var7.field167 != null) {
				if (var7.field171 > 0) {
					var1.field1809 += (int)(128.0D * Math.pow(2.0D, (double)var7.field171 * var9) + 0.5D);
				} else {
					var1.field1809 += 128;
				}

				while (var1.field1810 < var7.field167.length - 2 && var1.field1809 > (var7.field167[var1.field1810 + 2] & 255) << 8) {
					var1.field1810 += 2;
				}

				if (var1.field1810 == var7.field167.length - 2 && var7.field167[1 + var1.field1810] == 0) {
					var8 = true;
				}
			}

			if (var1.field1806 >= 0 && null != var7.field165 && (this.field765[var1.field1798] & 1) == 0 && (var1.field1801 < 0 || this.field770[var1.field1798][var1.field1801] != var1)) {
				if (var7.field164 > 0) {
					var1.field1806 += (int)(128.0D * Math.pow(2.0D, (double)var7.field164 * var9) + 0.5D);
				} else {
					var1.field1806 += 128;
				}

				while (var1.field1812 < var7.field165.length - 2 && var1.field1806 > (var7.field165[2 + var1.field1812] & 255) << 8) {
					var1.field1812 += 2;
				}

				if (var1.field1812 == var7.field165.length - 2) {
					var8 = true;
				}
			}

			if (var8) {
				var1.field1805.method1615(var1.field1817);
				if (null != var2) {
					var1.field1805.method1725(var2, var3, var4);
				} else {
					var1.field1805.method1726(var4);
				}

				if (var1.field1805.method1626()) {
					this.field772.field1415.method1140(var1.field1805);
				}

				var1.method1265();
				if (var1.field1806 >= 0) {
					var1.method1719();
					if (var1.field1801 > 0 && this.field770[var1.field1798][var1.field1801] == var1) {
						this.field770[var1.field1798][var1.field1801] = null;
					}
				}

				return true;
			} else {
				var1.field1805.method1614(var1.field1817, this.method561(var1), this.method562(var1));
				return false;
			}
		} else {
			var1.method1265();
			var1.method1719();
			if (var1.field1801 > 0 && var1 == this.field770[var1.field1798][var1.field1801]) {
				this.field770[var1.field1798][var1.field1801] = null;
			}

			return true;
		}
	}
}
