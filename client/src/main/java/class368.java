import java.awt.datatransfer.Clipboard;
import java.security.SecureRandom;

public class class368 implements class305 {
	static SecureRandom field2545;
	boolean field2543;
	boolean field2544;
	class496 field2546;

	public class368() {
		this.field2546 = null;
		this.field2543 = false;
		this.field2544 = false;
	}

	public void method1732(class496 var1) {
		this.method1735();
		if (null != var1) {
			this.field2546 = var1;
			class100 var3 = var1.method2325();
			if (var3 != null) {
				var3.field652.method622(true);
				if (var3.field654 != null) {
					class376 var4 = new class376();
					var4.method1757(var1);
					var4.method1758(var3.field654);
					Client.method1304().method323(var4);
				}
			}
		}

	}

	public class496 method1733() {
		return this.field2546;
	}

	public void method1735() {
		if (this.field2546 != null) {
			class100 var2 = this.field2546.method2325();
			class496 var3 = this.field2546;
			this.field2546 = null;
			if (var2 != null) {
				var2.field652.method622(false);
				if (null != var2.field654) {
					class376 var4 = new class376();
					var4.method1757(var3);
					var4.method1758(var2.field654);
					Client.method1304().method323(var4);
				}

			}
		}
	}

	@Override
	public boolean method1558(int var1) {
		if (this.field2546 == null) {
			return false;
		} else {
			class408 var3 = this.field2546.method2308();
			if (var3 == null) {
				return false;
			} else {
				if (var3.method1876(var1)) {
					switch(var1) {
					case 81:
						this.field2544 = true;
						break;
					case 82:
						this.field2543 = true;
						break;
					default:
						if (this.method1734(var1)) {
							Client.method1363(this.field2546);
						}
					}
				}

				return var3.method1871(var1);
			}
		}
	}

	@Override
	public boolean method1555(int var1) {
		switch(var1) {
		case 81:
			this.field2544 = false;
			return false;
		case 82:
			this.field2543 = false;
			return false;
		default:
			return false;
		}
	}

	@Override
	public boolean method1557(char var1, byte var2) {
		if (null == this.field2546) {
			return false;
		} else {
			boolean var3;
			if ((var1 < ' ' || var1 >= 127) && (var1 <= 127 || var1 >= 160) && (var1 <= 160 || var1 > 255)) {
				label89: {
					if (var1 != 0) {
						char[] var4 = class88.field582;

						for (int var5 = 0; var5 < var4.length; ++var5) {
							char var6 = var4[var5];
							if (var6 == var1) {
								var3 = true;
								break label89;
							}
						}
					}

					var3 = false;
				}
			} else {
				var3 = true;
			}

			if (!var3) {
				return false;
			} else {
				class135 var7 = this.field2546.method2323((byte)79);
				if (var7 != null && var7.method664()) {
					class408 var8 = this.field2546.method2308();
					if (var8 == null) {
						return false;
					} else {
						if (var8.method1873(var1) && var7.method643(var1)) {
							Client.method1363(this.field2546);
						}

						return var8.method1872(var1);
					}
				} else {
					return false;
				}
			}
		}
	}

	@Override
	public boolean method1556(boolean var1) {
		return false;
	}

	boolean method1734(int var1) {
		if (null == this.field2546) {
			return false;
		} else {
			class135 var3 = this.field2546.method2323((byte)110);
			if (var3 != null && var3.method664()) {
				Clipboard var6;
				switch(var1) {
				case 13:
					this.method1735();
					return true;
				case 48:
					if (this.field2543) {
						var3.method639();
					}

					return true;
				case 65:
					if (this.field2543) {
						var6 = class190.field1287.method2559();
						var3.method685(var6);
					}

					return true;
				case 66:
					if (this.field2543) {
						var6 = class190.field1287.method2559();
						var3.method654(var6);
					}

					return true;
				case 67:
					if (this.field2543) {
						var6 = class190.field1287.method2559();
						var3.method691(var6);
					}

					return true;
				case 84:
					if (var3.method620() == 0) {
						var3.method643(10);
					} else if (this.field2544 && var3.method671()) {
						var3.method643(10);
					} else {
						class100 var4 = this.field2546.method2325();
						class376 var5 = new class376();
						var5.method1757(this.field2546);
						var5.method1758(var4.field656);
						Client.method1304().method323(var5);
						this.method1735();
					}

					return true;
				case 85:
					if (this.field2543) {
						var3.method686();
					} else {
						var3.method637();
					}

					return true;
				case 96:
					if (this.field2543) {
						var3.method645(this.field2544);
					} else {
						var3.method684(this.field2544);
					}

					return true;
				case 97:
					if (this.field2543) {
						var3.method646(this.field2544);
					} else {
						var3.method644(this.field2544);
					}

					return true;
				case 98:
					if (this.field2543) {
						var3.method682();
					} else {
						var3.method647(this.field2544);
					}

					return true;
				case 99:
					if (this.field2543) {
						var3.method635();
					} else {
						var3.method648(this.field2544);
					}

					return true;
				case 101:
					if (this.field2543) {
						var3.method697();
					} else {
						var3.method689();
					}

					return true;
				case 102:
					if (this.field2543) {
						var3.method641(this.field2544);
					} else {
						var3.method687(this.field2544);
					}

					return true;
				case 103:
					if (this.field2543) {
						var3.method642(this.field2544);
					} else {
						var3.method640(this.field2544);
					}

					return true;
				case 104:
					if (this.field2543) {
						var3.method651(this.field2544);
					} else {
						var3.method649(this.field2544);
					}

					return true;
				case 105:
					if (this.field2543) {
						var3.method652(this.field2544);
					} else {
						var3.method650(this.field2544);
					}

					return true;
				default:
					return false;
				}
			} else {
				return false;
			}
		}
	}
}
