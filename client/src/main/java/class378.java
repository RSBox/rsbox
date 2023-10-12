public final class class378 extends class65 {
	static int field2602;
	static int field2604;
	class120 field2601;
	class120 field2603;
	class306 field2600;
	class73 field2605;
	int field2598;
	String field2599;

	static {
		field2602 = 1;
		field2604 = 1;
	}

	class378() {
		this.field2599 = "";
		this.field2598 = 31;
	}

	void method1762(String var1) {
		this.field2599 = null == var1 ? "" : var1;
	}

	void method1763(int var1) {
		this.field2598 = var1;
	}

	boolean method1764(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field2598 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	final String method1777() {
		if (!this.field2599.isEmpty()) {
			return this.field2599;
		} else {
			class73 var2 = this.field2605;
			if (null != var2.field477) {
				var2 = var2.method363();
				if (var2 == null) {
					var2 = this.field2605;
				}
			}

			return var2.field516;
		}
	}

	final void method1765(int var1, MovementType var2, byte var3) {
		int var4 = super.field399[0];
		int var5 = super.field400[0];
		if (var1 == 0) {
			--var4;
			++var5;
		}

		if (var1 == 1) {
			++var5;
		}

		if (var1 == 2) {
			++var4;
			++var5;
		}

		if (var1 == 3) {
			--var4;
		}

		if (var1 == 4) {
			++var4;
		}

		if (var1 == 5) {
			--var4;
			--var5;
		}

		if (var1 == 6) {
			--var5;
		}

		if (var1 == 7) {
			++var4;
			--var5;
		}

		if (super.field373 != -1 && class116.method539(super.field373).field746 == 1) {
			super.field373 = -1;
		}

		if (super.field360 < 9) {
			++super.field360;
		}

		for (int var6 = super.field360; var6 > 0; --var6) {
			super.field399[var6] = super.field399[var6 - 1];
			super.field400[var6] = super.field400[var6 - 1];
			super.field342[var6] = super.field342[var6 - 1];
		}

		super.field399[0] = var4;
		super.field400[0] = var5;
		super.field342[0] = var2;
	}

	final void method1778(int var1, int var2, boolean var3) {
		if (super.field373 != -1 && class116.method539(super.field373).field746 == 1) {
			super.field373 = -1;
		}

		if (!var3) {
			int var5 = var1 - super.field399[0];
			int var6 = var2 - super.field400[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (super.field360 < 9) {
					++super.field360;
				}

				for (int var7 = super.field360; var7 > 0; --var7) {
					super.field399[var7] = super.field399[var7 - 1];
					super.field400[var7] = super.field400[var7 - 1];
					super.field342[var7] = super.field342[var7 - 1];
				}

				super.field399[0] = var1;
				super.field400[0] = var2;
				super.field342[0] = MovementType.WALK;
				return;
			}
		}

		super.field360 = 0;
		super.field403 = 0;
		super.field375 = 0;
		super.field399[0] = var1;
		super.field400[0] = var2;
		super.field368 = 128 * super.field399[0] + super.field332 * 64;
		super.field329 = 128 * super.field400[0] + super.field332 * 64;
	}

	@Override
	protected final class490 method2152() {
		if (null == this.field2605) {
			return null;
		} else {
			class116 var2 = super.field373 != -1 && super.field376 == 0 ? class116.method539(super.field373) : null;
			class116 var3 = super.field369 != -1 && (super.field369 != super.field383 || null == var2) ? class116.method539(super.field369) : null;
			class490 var4 = null;
			if (null != this.field2601 && this.field2601.field790) {
				var4 = class114.field720.field2989.method906(var2, super.field334, var3, super.field370);
			} else {
				var4 = this.field2605.method353(var2, super.field334, var3, super.field370, this.field2601);
			}

			if (null == var4) {
				return null;
			} else {
				var4.method2261();
				super.field353 = var4.field3161;
				int var5 = var4.field3448;
				var4 = this.method296(var4);
				if (this.field2605.field484 == 1) {
					var4.field3454 = true;
				}

				if (super.field394 != 0 && Client.field1846 >= super.field389 && Client.field1846 < super.field390) {
					var4.field3490 = super.field391;
					var4.field3467 = super.field392;
					var4.field3492 = super.field393;
					var4.field3493 = super.field394;
					var4.field3494 = (short)var5;
				} else {
					var4.field3493 = 0;
				}

				return var4;
			}
		}
	}

	@Override
	final boolean method289() {
		return null != this.field2605;
	}

	int[] method1767() {
		return null != this.field2600 ? this.field2600.method1559() : this.field2605.method359();
	}

	short[] method1770() {
		return null != this.field2600 ? this.field2600.method1560() : this.field2605.method362();
	}

	void method1776(int var1, int var2, short var3) {
		if (null == this.field2600) {
			this.field2600 = new class306(this.field2605);
		}

		this.field2600.method1561(var1, var2, var3);
	}

	void method1775(int[] var1, short[] var2) {
		if (this.field2600 == null) {
			this.field2600 = new class306(this.field2605);
		}

		this.field2600.method1562(var1, var2);
	}

	void method1768() {
		this.field2600 = null;
	}

	void method1769(class120 var1) {
		this.field2603 = var1;
	}

	class120 method1774() {
		return this.field2603;
	}

	void method1771(class120 var1) {
		this.field2601 = var1;
	}

	void method1772() {
		this.field2603 = null;
	}

	void method1773() {
		this.field2601 = null;
	}
}
