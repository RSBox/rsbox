import java.util.Arrays;

public class class408 {
	static class198 field2805;
	static String[] field2803;
	int[] field2802;
	int[] field2804;

	public class408() {
		this.field2804 = new int[112];
		this.field2802 = new int[192];
		Arrays.fill(this.field2804, 3);
		Arrays.fill(this.field2802, 3);
	}

	public void method1868(int var1, int var2) {
		if (this.method1874(var1) && this.method1875(var2)) {
			this.field2804[var1] = var2;
		}

	}

	public void method1869(char var1, int var2) {
		if (this.method1878(var1) && this.method1875(var2)) {
			this.field2802[var1] = var2;
		}

	}

	public int method1870(int var1) {
		return this.method1874(var1) ? this.field2804[var1] : 0;
	}

	public int method1877(char var1) {
		return this.method1878(var1) ? this.field2802[var1] : 0;
	}

	public boolean method1871(int var1) {
		return this.method1874(var1) && (this.field2804[var1] == 1 || this.field2804[var1] == 3);
	}

	public boolean method1872(char var1) {
		return this.method1878(var1) && (this.field2802[var1] == 1 || this.field2802[var1] == 3);
	}

	public boolean method1876(int var1) {
		return this.method1874(var1) && (this.field2804[var1] == 2 || this.field2804[var1] == 3);
	}

	public boolean method1873(char var1) {
		return this.method1878(var1) && (this.field2802[var1] == 2 || this.field2802[var1] == 3);
	}

	boolean method1874(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	boolean method1878(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	boolean method1875(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}
}
