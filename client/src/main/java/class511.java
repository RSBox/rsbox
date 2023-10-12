public class class511 {
	boolean field3721;
	boolean field3739;
	class301 field3734;
	int field3725;
	int[] field3733;
	int[] field3743;
	long field3722;
	long[] field3720;
	long[] field3732;
	public boolean field3726;
	public boolean[] field3736;
	public byte field3719;
	public byte field3728;
	public byte field3729;
	public byte field3741;
	public byte[] field3740;
	public int field3723;
	public int field3730;
	public int field3731;
	public int field3737;
	public int field3738;
	public int[] field3735;
	public String field3724;
	public String[] field3727;
	public String[] field3742;

	public class511(Buffer var1) {
		this.field3723 = 0;
		this.field3724 = null;
		this.field3725 = 0;
		this.field3737 = -1;
		this.field3738 = -1;
		this.method2425(var1);
	}

	void method2409(int var1) {
		if (this.field3739) {
			if (this.field3720 != null) {
				System.arraycopy(this.field3720, 0, this.field3720 = new long[var1], 0, this.field3731);
			} else {
				this.field3720 = new long[var1];
			}
		}

		if (this.field3721) {
			if (null != this.field3727) {
				System.arraycopy(this.field3727, 0, this.field3727 = new String[var1], 0, this.field3731);
			} else {
				this.field3727 = new String[var1];
			}
		}

		if (null != this.field3740) {
			System.arraycopy(this.field3740, 0, this.field3740 = new byte[var1], 0, this.field3731);
		} else {
			this.field3740 = new byte[var1];
		}

		if (null != this.field3743) {
			System.arraycopy(this.field3743, 0, this.field3743 = new int[var1], 0, this.field3731);
		} else {
			this.field3743 = new int[var1];
		}

		if (null != this.field3735) {
			System.arraycopy(this.field3735, 0, this.field3735 = new int[var1], 0, this.field3731);
		} else {
			this.field3735 = new int[var1];
		}

		if (this.field3736 != null) {
			System.arraycopy(this.field3736, 0, this.field3736 = new boolean[var1], 0, this.field3731);
		} else {
			this.field3736 = new boolean[var1];
		}

	}

	void method2411(int var1) {
		if (this.field3739) {
			if (this.field3732 != null) {
				System.arraycopy(this.field3732, 0, this.field3732 = new long[var1], 0, this.field3730);
			} else {
				this.field3732 = new long[var1];
			}
		}

		if (this.field3721) {
			if (null != this.field3742) {
				System.arraycopy(this.field3742, 0, this.field3742 = new String[var1], 0, this.field3730);
			} else {
				this.field3742 = new String[var1];
			}
		}

	}

	public int method2408(String var1) {
		if (null != var1 && var1.length() != 0) {
			for (int var3 = 0; var3 < this.field3731; ++var3) {
				if (this.field3727[var3].equals(var1)) {
					return var3;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	public int method2412(int var1, int var2, int var3) {
		int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field3743[var1] & var5) >>> var2;
	}

	public Integer method2413(int var1) {
		if (this.field3734 == null) {
			return null;
		} else {
			class359 var3 = this.field3734.method1533((long)var1);
			return var3 != null && var3 instanceof class252 ? new Integer(((class252)var3).field1721) : null;
		}
	}

	public int[] method2414() {
		if (null == this.field3733) {
			String[] var2 = new String[this.field3731];
			this.field3733 = new int[this.field3731];

			for (int var3 = 0; var3 < this.field3731; this.field3733[var3] = var3++) {
				var2[var3] = this.field3727[var3];
				if (var2[var3] != null) {
					var2[var3] = var2[var3].toLowerCase();
				}
			}

			int[] var4 = this.field3733;
			class551.method2634(var2, var4, 0, var2.length - 1);
		}

		return this.field3733;
	}

	void method2415(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.field3739) {
			throw new RuntimeException("");
		} else if (this.field3721 != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (null == this.field3720 || this.field3731 >= this.field3720.length) || var3 != null && (this.field3727 == null || this.field3731 >= this.field3727.length)) {
				this.method2409(5 + this.field3731);
			}

			if (null != this.field3720) {
				this.field3720[this.field3731] = var1;
			}

			if (null != this.field3727) {
				this.field3727[this.field3731] = var3;
			}

			if (this.field3737 == -1) {
				this.field3737 = this.field3731;
				this.field3740[this.field3731] = 126;
			} else {
				this.field3740[this.field3731] = 0;
			}

			this.field3743[this.field3731] = 0;
			this.field3735[this.field3731] = var4;
			this.field3736[this.field3731] = false;
			++this.field3731;
			this.field3733 = null;
		}
	}

	void method2416(int var1) {
		if (var1 >= 0 && var1 < this.field3731) {
			--this.field3731;
			this.field3733 = null;
			if (this.field3731 == 0) {
				this.field3720 = null;
				this.field3727 = null;
				this.field3740 = null;
				this.field3743 = null;
				this.field3735 = null;
				this.field3736 = null;
				this.field3737 = -1;
				this.field3738 = -1;
			} else {
				System.arraycopy(this.field3740, var1 + 1, this.field3740, var1, this.field3731 - var1);
				System.arraycopy(this.field3743, var1 + 1, this.field3743, var1, this.field3731 - var1);
				System.arraycopy(this.field3735, var1 + 1, this.field3735, var1, this.field3731 - var1);
				System.arraycopy(this.field3736, var1 + 1, this.field3736, var1, this.field3731 - var1);
				if (null != this.field3720) {
					System.arraycopy(this.field3720, var1 + 1, this.field3720, var1, this.field3731 - var1);
				}

				if (this.field3727 != null) {
					System.arraycopy(this.field3727, var1 + 1, this.field3727, var1, this.field3731 - var1);
				}

				this.method2417();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	void method2417() {
		if (this.field3731 == 0) {
			this.field3737 = -1;
			this.field3738 = -1;
		} else {
			this.field3737 = -1;
			this.field3738 = -1;
			int var2 = 0;
			byte var3 = this.field3740[0];

			for (int var4 = 1; var4 < this.field3731; ++var4) {
				if (this.field3740[var4] > var3) {
					if (var3 == 125) {
						this.field3738 = var2;
					}

					var2 = var4;
					var3 = this.field3740[var4];
				} else if (this.field3738 == -1 && this.field3740[var4] == 125) {
					this.field3738 = var4;
				}
			}

			this.field3737 = var2;
			if (this.field3737 != -1) {
				this.field3740[this.field3737] = 126;
			}

		}
	}

	void method2422(long var1, String var3) {
		if (null != var3 && var3.length() == 0) {
			var3 = null;
		}

		if (this.field3739 != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.field3721 != (null != var3)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (null == this.field3732 || this.field3730 >= this.field3732.length) || var3 != null && (this.field3742 == null || this.field3730 >= this.field3742.length)) {
				this.method2411(this.field3730 + 5);
			}

			if (this.field3732 != null) {
				this.field3732[this.field3730] = var1;
			}

			if (null != this.field3742) {
				this.field3742[this.field3730] = var3;
			}

			++this.field3730;
		}
	}

	void method2418(int var1) {
		--this.field3730;
		if (this.field3730 == 0) {
			this.field3732 = null;
			this.field3742 = null;
		} else {
			if (this.field3732 != null) {
				System.arraycopy(this.field3732, var1 + 1, this.field3732, var1, this.field3730 - var1);
			}

			if (null != this.field3742) {
				System.arraycopy(this.field3742, var1 + 1, this.field3742, var1, this.field3730 - var1);
			}
		}

	}

	int method2427(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (var1 != this.field3737 || this.field3738 != -1 && this.field3740[this.field3738] >= 125) {
				if (this.field3740[var1] == var2) {
					return -1;
				} else {
					this.field3740[var1] = var2;
					this.method2417();
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	boolean method2419(int var1) {
		if (this.field3737 != var1 && this.field3740[var1] != 126) {
			this.field3740[this.field3737] = 125;
			this.field3738 = this.field3737;
			this.field3740[var1] = 126;
			this.field3737 = var1;
			return true;
		} else {
			return false;
		}
	}

	int method2420(int var1, boolean var2) {
		if (var2 == this.field3736[var1]) {
			return -1;
		} else {
			this.field3736[var1] = var2;
			return var1;
		}
	}

	int method2421(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		int var9 = this.field3743[var1];
		if (var2 == (var9 & var8)) {
			return -1;
		} else {
			var9 &= ~var8;
			this.field3743[var1] = var9 | var2;
			return var1;
		}
	}

	boolean method2426(int var1, int var2) {
		if (this.field3734 != null) {
			class359 var4 = this.field3734.method1533((long)var1);
			if (null != var4) {
				if (var4 instanceof class252) {
					class252 var5 = (class252)var4;
					if (var5.field1721 == var2) {
						return false;
					}

					var5.field1721 = var2;
					return true;
				}

				var4.method1719();
			}
		} else {
			this.field3734 = new class301(4);
		}

		this.field3734.method1534(new class252(var2), (long)var1);
		return true;
	}

	boolean method2423(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		if (this.field3734 != null) {
			class359 var9 = this.field3734.method1533((long)var1);
			if (var9 != null) {
				if (var9 instanceof class252) {
					class252 var10 = (class252)var9;
					if (var2 == (var10.field1721 & var8)) {
						return false;
					}

					var10.field1721 &= ~var8;
					var10.field1721 |= var2;
					return true;
				}

				var9.method1719();
			}
		} else {
			this.field3734 = new class301(4);
		}

		this.field3734.method1534(new class252(var2), (long)var1);
		return true;
	}

	boolean method2410(int var1, long var2) {
		if (null != this.field3734) {
			class359 var4 = this.field3734.method1533((long)var1);
			if (null != var4) {
				if (var4 instanceof class454) {
					class454 var5 = (class454)var4;
					if (var5.field3017 == var2) {
						return false;
					}

					var5.field3017 = var2;
					return true;
				}

				var4.method1719();
			}
		} else {
			this.field3734 = new class301(4);
		}

		this.field3734.method1534(new class454(var2), (long)var1);
		return true;
	}

	boolean method2424(int var1, String var2) {
		if (null == var2) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (null != this.field3734) {
			class359 var4 = this.field3734.method1533((long)var1);
			if (null != var4) {
				if (var4 instanceof class519) {
					class519 var5 = (class519)var4;
					if (var5.field4102 instanceof String) {
						if (var2.equals(var5.field4102)) {
							return false;
						}

						var5.method1719();
						this.field3734.method1534(new class519(var2), var5.field2472);
						return true;
					}
				}

				var4.method1719();
			}
		} else {
			this.field3734 = new class301(4);
		}

		this.field3734.method1534(new class519(var2), (long)var1);
		return true;
	}

	void method2425(Buffer var1) {
		int var3 = var1.readUnsignedByte();
		if (var3 >= 1 && var3 <= 6) {
			int var4 = var1.readUnsignedByte();
			if ((var4 & 1) != 0) {
				this.field3739 = true;
			}

			if ((var4 & 2) != 0) {
				this.field3721 = true;
			}

			if (!this.field3739) {
				this.field3720 = null;
				this.field3732 = null;
			}

			if (!this.field3721) {
				this.field3727 = null;
				this.field3742 = null;
			}

			this.field3723 = var1.readInt();
			this.field3725 = var1.readInt();
			if (var3 <= 3 && this.field3725 != 0) {
				this.field3725 += 16912800;
			}

			this.field3731 = var1.readUnsignedShort();
			this.field3730 = var1.readUnsignedByte();
			this.field3724 = var1.readStringOrNull();
			if (var3 >= 4) {
				var1.readInt();
			}

			this.field3726 = var1.readUnsignedByte() == 1;
			this.field3728 = var1.readByte();
			this.field3741 = var1.readByte();
			this.field3729 = var1.readByte();
			this.field3719 = var1.readByte();
			int var5;
			if (this.field3731 > 0) {
				if (this.field3739 && (this.field3720 == null || this.field3720.length < this.field3731)) {
					this.field3720 = new long[this.field3731];
				}

				if (this.field3721 && (null == this.field3727 || this.field3727.length < this.field3731)) {
					this.field3727 = new String[this.field3731];
				}

				if (this.field3740 == null || this.field3740.length < this.field3731) {
					this.field3740 = new byte[this.field3731];
				}

				if (this.field3743 == null || this.field3743.length < this.field3731) {
					this.field3743 = new int[this.field3731];
				}

				if (null == this.field3735 || this.field3735.length < this.field3731) {
					this.field3735 = new int[this.field3731];
				}

				if (null == this.field3736 || this.field3736.length < this.field3731) {
					this.field3736 = new boolean[this.field3731];
				}

				for (var5 = 0; var5 < this.field3731; ++var5) {
					if (this.field3739) {
						this.field3720[var5] = var1.readLong();
					}

					if (this.field3721) {
						this.field3727[var5] = var1.readString();
					}

					this.field3740[var5] = var1.readByte();
					if (var3 >= 2) {
						this.field3743[var5] = var1.readInt();
					}

					if (var3 >= 5) {
						this.field3735[var5] = var1.readUnsignedShort();
					} else {
						this.field3735[var5] = 0;
					}

					if (var3 >= 6) {
						this.field3736[var5] = var1.readUnsignedByte() == 1;
					} else {
						this.field3736[var5] = false;
					}
				}

				this.method2417();
			}

			if (this.field3730 > 0) {
				if (this.field3739 && (this.field3732 == null || this.field3732.length < this.field3730)) {
					this.field3732 = new long[this.field3730];
				}

				if (this.field3721 && (this.field3742 == null || this.field3742.length < this.field3730)) {
					this.field3742 = new String[this.field3730];
				}

				for (var5 = 0; var5 < this.field3730; ++var5) {
					if (this.field3739) {
						this.field3732[var5] = var1.readLong();
					}

					if (this.field3721) {
						this.field3742[var5] = var1.readString();
					}
				}
			}

			if (var3 >= 3) {
				var5 = var1.readUnsignedShort();
				if (var5 > 0) {
					this.field3734 = new class301(var5 < 16 ? class254.method1215(var5) : 16);

					while (var5-- > 0) {
						int var6 = var1.readInt();
						int var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = var1.readInt();
							this.field3734.method1534(new class252(var9), (long)var7);
						} else if (var8 == 1) {
							long var11 = var1.readLong();
							this.field3734.method1534(new class454(var11), (long)var7);
						} else if (var8 == 2) {
							String var12 = var1.readStringOrNull();
							this.field3734.method1534(new class519(var12), (long)var7);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var3);
		}
	}
}
