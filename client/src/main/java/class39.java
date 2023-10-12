import java.util.ArrayList;

public class class39 {
	boolean field194;
	class229 field190;
	int field188;
	int field189;
	int field191;
	int field192;
	int field193;
	int field196;
	int field197;
	ArrayList field195;

	public class39() {
		this.field188 = Integer.MAX_VALUE;
		this.field191 = Integer.MAX_VALUE;
		this.field189 = 0;
		this.field192 = 0;
		this.field193 = 0;
		this.field194 = true;
		this.field195 = new ArrayList();
		this.field196 = 0;
		this.field197 = 0;
	}

	public class101 method109(int var1) {
		return (class101)this.field195.get(var1);
	}

	class101 method149() {
		return this.field195.size() == 0 ? null : (class101)this.field195.get(this.field195.size() - 1);
	}

	public boolean method121() {
		return this.field195.size() == 0;
	}

	boolean method111() {
		return this.field191 > 1;
	}

	public int method112() {
		return this.field195.size();
	}

	public String method113() {
		if (this.method121()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method112());

			for (int var3 = 0; var3 < this.method112(); ++var3) {
				class101 var4 = this.method109(var3);
				var2.append(var4.field657);
			}

			return var2.toString();
		}
	}

	public void method142(int var1) {
		if (this.field190 != null && var1 < 2 * this.field190.field1483) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field188 != var1) {
			this.field188 = var1;
			this.method136();
		}

	}

	public void method114(int var1) {
		if (this.field191 != var1) {
			this.field191 = var1;
			this.method136();
		}

	}

	public void method115(int var1) {
		if (this.field197 != var1) {
			this.field197 = var1;
			this.method136();
		}

	}

	public void method116(class229 var1) {
		if (var1 != this.field190) {
			this.field190 = var1;
			if (this.field190 != null) {
				if (this.field193 == 0) {
					this.field193 = this.field190.field1483;
				}

				if (!this.method121()) {
					this.method136();
				}
			}
		}

	}

	public void method117(int var1) {
		if (var1 != this.field196) {
			this.field196 = var1;
			this.method136();
		}

	}

	public boolean method118(int var1, int var2) {
		if (var1 != this.field189 || this.field192 != var2) {
			this.field189 = var1;
			this.field192 = var2;
			this.method136();
		}

		return true;
	}

	public void method119(int var1) {
		if (var1 != this.field193) {
			this.field193 = var1;
			this.method136();
		}

	}

	public class508 method143(int var1, int var2) {
		if (var1 == var2) {
			return new class508(this, 0, 0);
		} else if (var1 <= this.field195.size() && var2 <= this.field195.size()) {
			return var2 < var1 ? new class508(this, var2, var1) : new class508(this, var1, var2);
		} else {
			return new class508(this, 0, 0);
		}
	}

	public class555 method147(char var1, int var2, int var3) {
		return this.method122(Character.toString(var1), var2, var3);
	}

	public class555 method122(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var5 = var2;
		if (this.field195.size() >= var3) {
			this.method137(var2, var2);
			return new class555(var2, true);
		} else {
			this.field195.ensureCapacity(this.field195.size() + var1.length());

			for (int var6 = 0; var6 < var1.length() && this.field195.size() < var3; ++var6) {
				class101 var7 = new class101();
				var7.field657 = var1.charAt(var6);
				this.field195.add(var5, var7);
				++var5;
			}

			this.method137(var2, var5);
			if (this.field191 != 0 && this.method132() > this.field191) {
				while (var2 != var5) {
					--var5;
					this.method125(var5);
					if (this.method132() <= this.field191) {
						break;
					}
				}

				return new class555(var5, true);
			} else {
				return new class555(var5, false);
			}
		}
	}

	class555 method123(String var1, int var2) {
		return this.method122(var1, this.field195.size(), 0);
	}

	public class555 method144(String var1) {
		this.method124();
		return this.method123(var1, 0);
	}

	void method124() {
		this.field195.clear();
	}

	public int method125(int var1) {
		return this.method126(var1, var1 + 1);
	}

	public int method126(int var1, int var2) {
		int var4;
		if (var2 < var1) {
			var4 = var2;
			var2 = var1;
			var1 = var4;
		}

		this.field195.subList(var1, var2).clear();
		var4 = var1;
		if (this.method111() && this.field196 == 1) {
			while (var4 > 0) {
				--var4;
				char var5 = ((class101)this.field195.get(var4)).field657;
				if (var5 == ' ' || var5 == '\t') {
					break;
				}
			}
		}

		this.method137(var4, var2);
		return var1;
	}

	public int method127(int var1, int var2) {
		if (this.field190 == null) {
			return 0;
		} else if (this.method111() && var1 > this.field188) {
			return this.field195.size();
		} else {
			if (!this.field195.isEmpty()) {
				for (int var4 = 0; var4 < this.field195.size(); ++var4) {
					class101 var5 = (class101)this.field195.get(var4);
					if (var2 <= var5.field659 + this.method131()) {
						if (var2 < var5.field659) {
							break;
						}

						if (var1 < var5.field658) {
							return var4 > 0 ? var4 - 1 : 0;
						}

						if (var4 + 1 != this.field195.size() && ((class101)this.field195.get(var4 + 1)).field659 != var5.field659) {
							int var6 = this.method145((class101)this.field195.get(var4), false);
							if (var1 < var6 + var5.field658) {
								return var4;
							}

							if (var2 <= var5.field659 + this.method131()) {
								return var4 + 1;
							}
						}
					}
				}

				class101 var7 = (class101)this.field195.get(this.field195.size() - 1);
				if (var1 >= var7.field658 && var1 <= var7.field658 + this.method146() && var2 >= var7.field659 && var2 <= var7.field659 + this.method131()) {
					return this.field195.size() - 1;
				}
			}

			return this.field195.size();
		}
	}

	public int method128(int var1, int var2) {
		if (this.field190 != null && !this.method121() && var1 <= this.field195.size()) {
			byte var4;
			if (var2 > 0) {
				var4 = 1;
			} else {
				var4 = -1;
				var2 = -var2;
			}

			int var5 = 0;
			int var6 = 0;
			if (var1 > 0) {
				class101 var7 = (class101)this.field195.get(var1 - 1);
				var5 = var7.field658 + this.method110(var1 - 1);
				var6 = var7.field659;
			} else if (var4 == -1 && var1 == 0) {
				return 0;
			}

			int var15 = 16777215;
			int var8 = 0;
			int var9 = var1;
			int var10 = 16777215;
			int var11 = var4 == 1 ? this.field195.size() + 1 : 0;

			for (int var12 = var4 + var1; var11 != var12; var12 += var4) {
				class101 var13 = (class101)this.field195.get(var12 - 1);
				if (var6 != var13.field659) {
					++var8;
					var6 = var13.field659;
					if (var8 > var2) {
						return var9;
					}
				}

				if (var8 == var2) {
					int var14 = Math.abs(var13.field658 + this.method110(var12 - 1) - var5);
					if (var14 >= var10) {
						return var9;
					}

					var9 = var12;
					var10 = var14;
				}
			}

			if (var4 == 1) {
				return this.field195.size();
			} else {
				if (var6 != 0) {
					++var8;
				}

				return var10 != 16777215 && (var2 != var8 || var5 >= var10) ? var9 : 0;
			}
		} else {
			return 0;
		}
	}

	public int method129() {
		if (!this.field195.isEmpty() && this.method132() == 1) {
			return this.field195.isEmpty() ? 0 : ((class101)this.field195.get(this.field195.size() - 1)).field658 + this.method146();
		} else {
			int var2 = -1;
			int var3 = 0;

			for (int var4 = this.field195.size() - 1; var4 >= 0; --var4) {
				class101 var5 = (class101)this.field195.get(var4);
				if (var5.field659 != var2) {
					int var6 = this.method145(var5, false) + var5.field658;
					var3 = Math.max(var6, var3);
					var2 = var5.field659;
				}
			}

			return var3;
		}
	}

	public int method130() {
		return this.method121() ? 0 : this.field190.field1483 + ((class101)this.field195.get(this.field195.size() - 1)).field659;
	}

	public int method131() {
		return this.field193;
	}

	public int method132() {
		return this.method130() / this.field190.field1483;
	}

	int method146() {
		return this.method121() ? 0 : this.method145((class101)this.field195.get(this.field195.size() - 1), false);
	}

	public int method120() {
		return this.field188;
	}

	public int method141() {
		return this.field191;
	}

	public int method133() {
		return this.field196;
	}

	public int method134() {
		return this.field197;
	}

	public int method135(int var1) {
		switch(this.field189) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	public int method148(int var1) {
		switch(this.field192) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	void method136() {
		this.method137(0, this.field195.size());
	}

	void method137(int var1, int var2) {
		if (!this.method121() && this.field190 != null) {
			class203 var4 = this.method138(var1, var2);
			boolean var5 = (Integer)var4.field1361 == 0 && (Integer)var4.field1362 == this.field195.size();
			int var6 = (Integer)var4.field1361;
			int var7 = 0;
			int var8 = var5 ? 0 : ((class101)this.field195.get((Integer)var4.field1361)).field659;
			int var9 = 0;

			int var10;
			for (var10 = (Integer)var4.field1361; var10 <= (Integer)var4.field1362; ++var10) {
				boolean var11 = var10 >= this.field195.size();
				class101 var12 = (class101)this.field195.get(!var11 ? var10 : this.field195.size() - 1);
				int var13 = !var11 ? this.method145(var12, false) : 0;
				boolean var14 = !var11 && var12.field657 == '\n';
				boolean var15 = !var11 && this.method111() && var13 + var7 > this.field188;
				if (var14 || var15 || var11) {
					int var16 = var10;
					int var17 = 0;
					int var18;
					int var19;
					class101 var20;
					if (var15) {
						var18 = 0;
						if (this.field196 == 1) {
							for (var19 = var10; var19 > var6; --var19) {
								var20 = (class101)this.field195.get(var19);
								var18 += var19 < var16 ? this.method145(var20, false) : 0;
								if (var20.field657 == ' ' || var20.field657 == '\n') {
									var16 = var19;
									var7 -= var18;
									var17 = var18;
									break;
								}
							}
						}
					}

					var18 = -this.method135(var7);

					for (var19 = var6; var19 < var16; ++var19) {
						var20 = (class101)this.field195.get(var19);
						int var21 = this.method145(var20, false);
						var20.field658 = var18;
						var20.field659 = var8;
						var18 += var21;
					}

					var6 = var16;
					var7 = var17;
					var8 += this.method131();
					++var9;
				}

				var7 += !var11 ? var13 : 0;
			}

			if (this.field192 != 0 && var5) {
				var10 = var9 * this.method131();
				int var22 = this.method148(var10);

				for (int var23 = 0; var23 < this.field195.size(); ++var23) {
					class101 var24 = (class101)this.field195.get(var23);
					var24.field659 -= var22;
				}
			}

		}
	}

	int method110(int var1) {
		return var1 < this.field195.size() ? this.method145((class101)this.field195.get(var1), false) : 0;
	}

	int method145(class101 var1, boolean var2) {
		if (var1.field657 == '\n') {
			return 0;
		} else if (this.field197 == 0) {
			int var4 = this.field190.field1480[var1.field657];
			if (var4 == 0) {
				return var1.field657 == '\t' ? this.field190.field1480[32] * 3 : this.field190.field1480[32];
			} else {
				return var4;
			}
		} else {
			return this.field190.field1480[42];
		}
	}

	class203 method138(int var1, int var2) {
		int var4 = Math.min(var1, var2);
		int var5 = Math.max(var1, var2);
		int var6 = this.field195.size();
		if (var4 == 0 && var5 == var6) {
			return new class203(0, var6);
		} else {
			int var7 = this.method139(var4, false);
			int var8 = this.method140(var5, false);
			int var9;
			switch(this.field192) {
			case 0:
				if (this.field189 == 0) {
					return new class203(var7, var6);
				}

				var9 = this.method139(var4, true);
				return new class203(var9, var6);
			case 1:
				return new class203(0, var6);
			case 2:
				if (this.field189 == 2) {
					return new class203(0, var8);
				}

				var9 = this.method140(var5, true);
				return new class203(0, var9);
			default:
				return new class203(0, var6);
			}
		}
	}

	int method139(int var1, boolean var2) {
		if (var1 < this.field195.size()) {
			int var4 = ((class101)this.field195.get(var1)).field659;

			for (int var5 = var1; var5 > 0; --var5) {
				if (((class101)this.field195.get(var5 - 1)).field659 < var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((class101)this.field195.get(var5 - 1)).field659;
				}
			}
		}

		return 0;
	}

	int method140(int var1, boolean var2) {
		if (var1 < this.field195.size()) {
			int var4 = ((class101)this.field195.get(var1)).field659;

			for (int var5 = var1; var5 < this.field195.size() - 1; ++var5) {
				if (((class101)this.field195.get(var5 + 1)).field659 > var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((class101)this.field195.get(var5 + 1)).field659;
				}
			}
		}

		return this.field195.size();
	}
}
