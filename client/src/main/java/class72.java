import java.util.HashMap;
import java.util.Map;

public class class72 {
	class157 field464;
	class157 field476;
	class352 field470;
	class352 field471;
	class352 field472;
	class352 field475;
	class5 field465;
	class5 field466;
	class5 field467;
	class5 field468;
	class5 field469;
	Map field474;
	public class496[][] components;

	public class72(class5 var1, class5 var2, class5 var3, class5 var4, class5 var5) {
		this.field474 = new HashMap();
		this.field471 = new class352(200);
		this.field475 = new class352(50);
		this.field472 = new class352(20);
		this.field470 = new class352(8);
		this.field464 = new class157(10, class481.field3379);
		this.field476 = new class157(10, class481.field3379);
		int var6 = 0;
		if (var1 != null) {
			this.field469 = var1;
			this.field466 = var2;
			this.field467 = var3;
			this.field468 = var4;
			this.field465 = var5;
			var6 = this.field469.method24();
		}

		this.components = new class496[var6][];
		class147.field1024 = new boolean[var6];
	}

	public class496 method345(int var1) {
		int var3 = var1 >> 16;
		int var4 = var1 & 65535;
		if (this.components[var3] == null || null == this.components[var3][var4]) {
			boolean var5 = this.method347(var3);
			if (!var5) {
				return null;
			}
		}

		return this.components[var3][var4];
	}

	public class496 method346(int var1, int var2) {
		class496 var4 = this.method345(var1);
		if (var2 == -1) {
			return var4;
		} else {
			return var4 != null && null != var4.field3659 && var2 < var4.field3659.length ? var4.field3659[var2] : null;
		}
	}

	public boolean method347(int var1) {
		if (class147.field1024[var1]) {
			return true;
		} else if (!this.field469.method40(var1)) {
			return false;
		} else {
			int var3 = this.field469.method23(var1);
			if (var3 == 0) {
				class147.field1024[var1] = true;
				return true;
			} else {
				if (null == this.components[var1]) {
					this.components[var1] = new class496[var3];
				}

				for (int var4 = 0; var4 < var3; ++var4) {
					if (null == this.components[var1][var4]) {
						byte[] var5 = this.field469.method39(var1, var4);
						if (var5 != null) {
							this.components[var1][var4] = new class496();
							this.components[var1][var4].interfaceId = (var1 << 16) + var4;
							if (var5[0] == -1) {
								this.components[var1][var4].method2303(new Buffer(var5));
							} else {
								this.components[var1][var4].method2302(new Buffer(var5));
							}

							if (null != this.field465) {
								byte[] var6 = this.field465.method39(var1, var4);
								if (var6 != null && var6.length > 0) {
									this.components[var1][var4].method2333(new Buffer(var6));
									this.field474.put(this.components[var1][var4].field3526, var1);
								}
							}
						}
					}
				}

				class147.field1024[var1] = true;
				return true;
			}
		}
	}

	public void method348(int var1) {
		if (var1 != -1) {
			if (class147.field1024[var1]) {
				this.field469.method25(var1);
				if (null != this.components[var1]) {
					for (int var3 = 0; var3 < this.components[var1].length; ++var3) {
						if (this.components[var1][var3] != null) {
							this.components[var1][var3] = null;
						}
					}

					this.components[var1] = null;
					class147.field1024[var1] = false;
				}
			}
		}
	}

	public void method349() {
		this.field471.method1679();
		this.field475.method1679();
		this.field472.method1679();
		this.field470.method1679();
	}
}
