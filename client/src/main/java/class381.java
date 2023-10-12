import java.util.Arrays;

public class class381 implements class305 {
	boolean[] field2633;
	boolean[] field2634;
	boolean[] field2635;
	char[] field2625;
	int field2629;
	int field2631;
	int field2632;
	int field2636;
	int[] field2628;
	int[] field2630;
	public char field2626;
	public int field2627;
	public int field2637;
	public int[] field2624;

	public class381() {
		this.field2625 = new char[128];
		this.field2630 = new int[128];
		this.field2624 = new int[128];
		this.field2627 = 0;
		this.field2628 = new int[128];
		this.field2629 = 0;
		this.field2636 = 0;
		this.field2631 = 0;
		this.field2632 = 0;
		this.field2633 = new boolean[112];
		this.field2634 = new boolean[112];
		this.field2635 = new boolean[112];
	}

	@Override
	public boolean method1558(int var1) {
		this.method1794(var1);
		this.field2633[var1] = true;
		this.field2634[var1] = true;
		this.field2635[var1] = false;
		this.field2624[++this.field2627 - 1] = var1;
		return true;
	}

	@Override
	public boolean method1555(int var1) {
		this.field2633[var1] = false;
		this.field2634[var1] = false;
		this.field2635[var1] = true;
		this.field2628[++this.field2629 - 1] = var1;
		return true;
	}

	@Override
	public boolean method1557(char var1, byte var2) {
		int var3 = 1 + this.field2631 & 127;
		if (var3 != this.field2636) {
			this.field2630[this.field2631] = -1;
			this.field2625[this.field2631] = var1;
			this.field2631 = var3;
		}

		return false;
	}

	void method1794(int var1) {
		int var3 = 1 + this.field2631 & 127;
		if (this.field2636 != var3) {
			this.field2630[this.field2631] = var1;
			this.field2625[this.field2631] = 0;
			this.field2631 = var3;
		}

	}

	@Override
	public boolean method1556(boolean var1) {
		return false;
	}

	public void method1793() {
		this.field2636 = this.field2632;
		this.field2632 = this.field2631;
		this.field2627 = 0;
		this.field2629 = 0;
		Arrays.fill(this.field2634, false);
		Arrays.fill(this.field2635, false);
	}

	public final boolean method1795() {
		if (this.field2636 == this.field2632) {
			return false;
		} else {
			this.field2637 = this.field2630[this.field2636];
			this.field2626 = this.field2625[this.field2636];
			this.field2636 = 1 + this.field2636 & 127;
			return true;
		}
	}

	public boolean method1797(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2634[var1] : false;
	}

	public boolean method1798(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2633[var1] : false;
	}

	public boolean method1796(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2635[var1] : false;
	}

	public int[] method1800() {
		int[] var2 = new int[this.field2627];

		for (int var3 = 0; var3 < this.field2627; ++var3) {
			var2[var3] = this.field2624[var3];
		}

		return var2;
	}

	public int[] method1799() {
		int[] var2 = new int[this.field2629];

		for (int var3 = 0; var3 < this.field2629; ++var3) {
			var2[var3] = this.field2628[var3];
		}

		return var2;
	}
}
