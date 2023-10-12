public class class239 extends class462 {
	static int field1612;
	static int[] field1595;
	static int[] field1610;
	static int[] field1613;
	static int[] field1614;
	boolean field1591;
	byte field1583;
	byte[] field1584;
	byte[] field1585;
	byte[] field1589;
	byte[] field1597;
	byte[] field1611;
	class215[] field1573;
	class215[] field1600;
	class279[] field1599;
	int field1575;
	int field1587;
	int field1588;
	int field1601;
	int field1605;
	int field1606;
	int field1607;
	int field1608;
	int[] field1576;
	int[] field1577;
	int[] field1578;
	int[] field1580;
	int[] field1581;
	int[] field1582;
	int[] field1594;
	int[] field1604;
	int[][] field1579;
	int[][] field1596;
	int[][] field1598;
	int[][] field1609;
	short[] field1574;
	short[] field1586;
	short[] field1590;
	short[] field1592;
	short[] field1593;
	public short field1602;
	public short field1603;

	static {
		field1610 = new int[10000];
		field1595 = new int[10000];
		field1612 = 0;
		field1613 = class105.field670;
		field1614 = class105.field671;
	}

	class239() {
		this.field1575 = 0;
		this.field1601 = 0;
		this.field1583 = 0;
		this.field1591 = false;
	}

	class239(byte[] var1) {
		this.field1575 = 0;
		this.field1601 = 0;
		this.field1583 = 0;
		this.field1591 = false;
		Buffer var2 = new Buffer(10);
		var2.writeShort(-2);
		if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
			this.method1093(var1);
		} else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
			this.method1094(var1);
		} else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.method1115(var1);
		} else {
			this.method1095(var1);
		}

	}

	public class239(class239[] var1, int var2) {
		this.field1575 = 0;
		this.field1601 = 0;
		this.field1583 = 0;
		this.field1591 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		this.field1575 = 0;
		this.field1601 = 0;
		this.field1588 = 0;
		this.field1583 = -1;

		int var10;
		class239 var11;
		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				this.field1575 += var11.field1575;
				this.field1601 += var11.field1601;
				this.field1588 += var11.field1588;
				if (var11.field1597 != null) {
					var4 = true;
				} else {
					if (this.field1583 == -1) {
						this.field1583 = var11.field1583;
					}

					if (this.field1583 != var11.field1583) {
						var4 = true;
					}
				}

				var3 |= var11.field1611 != null;
				var5 |= var11.field1584 != null;
				var6 |= var11.field1594 != null;
				var7 |= var11.field1586 != null;
				var8 |= var11.field1585 != null;
				var9 |= var11.field1609 != null;
			}
		}

		this.field1576 = new int[this.field1575];
		this.field1577 = new int[this.field1575];
		this.field1578 = new int[this.field1575];
		this.field1581 = new int[this.field1575];
		this.field1580 = new int[this.field1601];
		this.field1604 = new int[this.field1601];
		this.field1582 = new int[this.field1601];
		if (var3) {
			this.field1611 = new byte[this.field1601];
		}

		if (var4) {
			this.field1597 = new byte[this.field1601];
		}

		if (var5) {
			this.field1584 = new byte[this.field1601];
		}

		if (var6) {
			this.field1594 = new int[this.field1601];
		}

		if (var7) {
			this.field1586 = new short[this.field1601];
		}

		if (var8) {
			this.field1585 = new byte[this.field1601];
		}

		if (var9) {
			this.field1609 = new int[this.field1575][];
			this.field1598 = new int[this.field1575][];
		}

		this.field1574 = new short[this.field1601];
		if (this.field1588 > 0) {
			this.field1589 = new byte[this.field1588];
			this.field1590 = new short[this.field1588];
			this.field1593 = new short[this.field1588];
			this.field1592 = new short[this.field1588];
		}

		this.field1575 = 0;
		this.field1601 = 0;
		this.field1588 = 0;

		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				int var12;
				for (var12 = 0; var12 < var11.field1601; ++var12) {
					if (var3 && var11.field1611 != null) {
						this.field1611[this.field1601] = var11.field1611[var12];
					}

					if (var4) {
						if (var11.field1597 != null) {
							this.field1597[this.field1601] = var11.field1597[var12];
						} else {
							this.field1597[this.field1601] = var11.field1583;
						}
					}

					if (var5 && var11.field1584 != null) {
						this.field1584[this.field1601] = var11.field1584[var12];
					}

					if (var6 && var11.field1594 != null) {
						this.field1594[this.field1601] = var11.field1594[var12];
					}

					if (var7) {
						if (var11.field1586 != null) {
							this.field1586[this.field1601] = var11.field1586[var12];
						} else {
							this.field1586[this.field1601] = -1;
						}
					}

					if (var8) {
						if (var11.field1585 != null && var11.field1585[var12] != -1) {
							this.field1585[this.field1601] = (byte)(var11.field1585[var12] + this.field1588);
						} else {
							this.field1585[this.field1601] = -1;
						}
					}

					this.field1574[this.field1601] = var11.field1574[var12];
					this.field1580[this.field1601] = this.method1113(var11, var11.field1580[var12]);
					this.field1604[this.field1601] = this.method1113(var11, var11.field1604[var12]);
					this.field1582[this.field1601] = this.method1113(var11, var11.field1582[var12]);
					++this.field1601;
				}

				for (var12 = 0; var12 < var11.field1588; ++var12) {
					byte var13 = this.field1589[this.field1588] = var11.field1589[var12];
					if (var13 == 0) {
						this.field1590[this.field1588] = (short)this.method1113(var11, var11.field1590[var12]);
						this.field1593[this.field1588] = (short)this.method1113(var11, var11.field1593[var12]);
						this.field1592[this.field1588] = (short)this.method1113(var11, var11.field1592[var12]);
					}

					++this.field1588;
				}
			}
		}

	}

	public class239(class239 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.field1575 = 0;
		this.field1601 = 0;
		this.field1583 = 0;
		this.field1591 = false;
		this.field1575 = var1.field1575;
		this.field1601 = var1.field1601;
		this.field1588 = var1.field1588;
		int var6;
		if (var2) {
			this.field1576 = var1.field1576;
			this.field1577 = var1.field1577;
			this.field1578 = var1.field1578;
		} else {
			this.field1576 = new int[this.field1575];
			this.field1577 = new int[this.field1575];
			this.field1578 = new int[this.field1575];

			for (var6 = 0; var6 < this.field1575; ++var6) {
				this.field1576[var6] = var1.field1576[var6];
				this.field1577[var6] = var1.field1577[var6];
				this.field1578[var6] = var1.field1578[var6];
			}
		}

		if (var3) {
			this.field1574 = var1.field1574;
		} else {
			this.field1574 = new short[this.field1601];

			for (var6 = 0; var6 < this.field1601; ++var6) {
				this.field1574[var6] = var1.field1574[var6];
			}
		}

		if (!var4 && var1.field1586 != null) {
			this.field1586 = new short[this.field1601];

			for (var6 = 0; var6 < this.field1601; ++var6) {
				this.field1586[var6] = var1.field1586[var6];
			}
		} else {
			this.field1586 = var1.field1586;
		}

		this.field1584 = var1.field1584;
		this.field1580 = var1.field1580;
		this.field1604 = var1.field1604;
		this.field1582 = var1.field1582;
		this.field1611 = var1.field1611;
		this.field1597 = var1.field1597;
		this.field1585 = var1.field1585;
		this.field1583 = var1.field1583;
		this.field1589 = var1.field1589;
		this.field1590 = var1.field1590;
		this.field1593 = var1.field1593;
		this.field1592 = var1.field1592;
		this.field1581 = var1.field1581;
		this.field1594 = var1.field1594;
		this.field1579 = var1.field1579;
		this.field1596 = var1.field1596;
		this.field1600 = var1.field1600;
		this.field1599 = var1.field1599;
		this.field1573 = var1.field1573;
		this.field1609 = var1.field1609;
		this.field1598 = var1.field1598;
		this.field1602 = var1.field1602;
		this.field1603 = var1.field1603;
	}

	void method1093(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var2.offset = var1.length - 26;
		int var9 = var2.readUnsignedShort();
		int var10 = var2.readUnsignedShort();
		int var11 = var2.readUnsignedByte();
		int var12 = var2.readUnsignedByte();
		int var13 = var2.readUnsignedByte();
		int var14 = var2.readUnsignedByte();
		int var15 = var2.readUnsignedByte();
		int var16 = var2.readUnsignedByte();
		int var17 = var2.readUnsignedByte();
		int var18 = var2.readUnsignedByte();
		int var19 = var2.readUnsignedShort();
		int var20 = var2.readUnsignedShort();
		int var21 = var2.readUnsignedShort();
		int var22 = var2.readUnsignedShort();
		int var23 = var2.readUnsignedShort();
		int var24 = var2.readUnsignedShort();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28;
		if (var11 > 0) {
			this.field1589 = new byte[var11];
			var2.offset = 0;

			for (var28 = 0; var28 < var11; ++var28) {
				byte var29 = this.field1589[var28] = var2.readByte();
				if (var29 == 0) {
					++var25;
				}

				if (var29 >= 1 && var29 <= 3) {
					++var26;
				}

				if (var29 == 2) {
					++var27;
				}
			}
		}

		var28 = var11 + var9;
		int var30 = var28;
		if (var12 == 1) {
			var28 += var10;
		}

		int var31 = var28;
		var28 += var10;
		int var32 = var28;
		if (var13 == 255) {
			var28 += var10;
		}

		int var33 = var28;
		if (var15 == 1) {
			var28 += var10;
		}

		int var34 = var28;
		var28 += var24;
		int var35 = var28;
		if (var14 == 1) {
			var28 += var10;
		}

		int var36 = var28;
		var28 += var22;
		int var37 = var28;
		if (var16 == 1) {
			var28 += var10 * 2;
		}

		int var38 = var28;
		var28 += var23;
		int var39 = var28;
		var28 += var10 * 2;
		int var40 = var28;
		var28 += var19;
		int var41 = var28;
		var28 += var20;
		int var42 = var28;
		var28 += var21;
		int var43 = var28;
		var28 += var25 * 6;
		int var44 = var28;
		var28 += var26 * 6;
		int var45 = var28;
		var28 += var26 * 6;
		int var46 = var28;
		var28 += var26 * 2;
		int var47 = var28;
		var28 += var26;
		int var48 = var28;
		var28 += var26 * 2 + var27 * 2;
		this.field1575 = var9;
		this.field1601 = var10;
		this.field1588 = var11;
		this.field1576 = new int[var9];
		this.field1577 = new int[var9];
		this.field1578 = new int[var9];
		this.field1580 = new int[var10];
		this.field1604 = new int[var10];
		this.field1582 = new int[var10];
		if (var17 == 1) {
			this.field1581 = new int[var9];
		}

		if (var12 == 1) {
			this.field1611 = new byte[var10];
		}

		if (var13 == 255) {
			this.field1597 = new byte[var10];
		} else {
			this.field1583 = (byte)var13;
		}

		if (var14 == 1) {
			this.field1584 = new byte[var10];
		}

		if (var15 == 1) {
			this.field1594 = new int[var10];
		}

		if (var16 == 1) {
			this.field1586 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field1585 = new byte[var10];
		}

		if (var18 == 1) {
			this.field1609 = new int[var9][];
			this.field1598 = new int[var9][];
		}

		this.field1574 = new short[var10];
		if (var11 > 0) {
			this.field1590 = new short[var11];
			this.field1593 = new short[var11];
			this.field1592 = new short[var11];
		}

		var2.offset = var11;
		var3.offset = var40;
		var4.offset = var41;
		var5.offset = var42;
		var6.offset = var34;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;

		int var53;
		int var54;
		int var55;
		int var56;
		int var57;
		for (var53 = 0; var53 < var9; ++var53) {
			var54 = var2.readUnsignedByte();
			var55 = 0;
			if ((var54 & 1) != 0) {
				var55 = var3.method2517();
			}

			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.method2517();
			}

			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.method2517();
			}

			this.field1576[var53] = var50 + var55;
			this.field1577[var53] = var51 + var56;
			this.field1578[var53] = var52 + var57;
			var50 = this.field1576[var53];
			var51 = this.field1577[var53];
			var52 = this.field1578[var53];
			if (var17 == 1) {
				this.field1581[var53] = var6.readUnsignedByte();
			}
		}

		if (var18 == 1) {
			for (var53 = 0; var53 < var9; ++var53) {
				var54 = var6.readUnsignedByte();
				this.field1609[var53] = new int[var54];
				this.field1598[var53] = new int[var54];

				for (var55 = 0; var55 < var54; ++var55) {
					this.field1609[var53][var55] = var6.readUnsignedByte();
					this.field1598[var53][var55] = var6.readUnsignedByte();
				}
			}
		}

		var2.offset = var39;
		var3.offset = var30;
		var4.offset = var32;
		var5.offset = var35;
		var6.offset = var33;
		var7.offset = var37;
		var8.offset = var38;

		for (var53 = 0; var53 < var10; ++var53) {
			this.field1574[var53] = (short)var2.readUnsignedShort();
			if (var12 == 1) {
				this.field1611[var53] = var3.readByte();
			}

			if (var13 == 255) {
				this.field1597[var53] = var4.readByte();
			}

			if (var14 == 1) {
				this.field1584[var53] = var5.readByte();
			}

			if (var15 == 1) {
				this.field1594[var53] = var6.readUnsignedByte();
			}

			if (var16 == 1) {
				this.field1586[var53] = (short)(var7.readUnsignedShort() - 1);
			}

			if (this.field1585 != null && this.field1586[var53] != -1) {
				this.field1585[var53] = (byte)(var8.readUnsignedByte() - 1);
			}
		}

		var2.offset = var36;
		var3.offset = var31;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;

		int var58;
		for (var57 = 0; var57 < var10; ++var57) {
			var58 = var3.readUnsignedByte();
			if (var58 == 1) {
				var53 = var2.method2517() + var56;
				var54 = var2.method2517() + var53;
				var55 = var2.method2517() + var54;
				var56 = var55;
				this.field1580[var57] = var53;
				this.field1604[var57] = var54;
				this.field1582[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.method2517() + var56;
				var56 = var55;
				this.field1580[var57] = var53;
				this.field1604[var57] = var54;
				this.field1582[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.method2517() + var56;
				var56 = var55;
				this.field1580[var57] = var53;
				this.field1604[var57] = var54;
				this.field1582[var57] = var55;
			}

			if (var58 == 4) {
				int var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.method2517() + var56;
				var56 = var55;
				this.field1580[var57] = var53;
				this.field1604[var57] = var59;
				this.field1582[var57] = var55;
			}
		}

		var2.offset = var43;
		var3.offset = var44;
		var4.offset = var45;
		var5.offset = var46;
		var6.offset = var47;
		var7.offset = var48;

		for (var57 = 0; var57 < var11; ++var57) {
			var58 = this.field1589[var57] & 255;
			if (var58 == 0) {
				this.field1590[var57] = (short)var2.readUnsignedShort();
				this.field1593[var57] = (short)var2.readUnsignedShort();
				this.field1592[var57] = (short)var2.readUnsignedShort();
			}
		}

		var2.offset = var28;
		var57 = var2.readUnsignedByte();
		if (var57 != 0) {
			new class442();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readInt();
		}

	}

	void method1094(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var4.offset = var1.length - 23;
		int var9 = var4.readUnsignedShort();
		int var10 = var4.readUnsignedShort();
		int var11 = var4.readUnsignedByte();
		int var12 = var4.readUnsignedByte();
		int var13 = var4.readUnsignedByte();
		int var14 = var4.readUnsignedByte();
		int var15 = var4.readUnsignedByte();
		int var16 = var4.readUnsignedByte();
		int var17 = var4.readUnsignedByte();
		int var18 = var4.readUnsignedShort();
		int var19 = var4.readUnsignedShort();
		int var20 = var4.readUnsignedShort();
		int var21 = var4.readUnsignedShort();
		int var22 = var4.readUnsignedShort();
		boolean var23 = false;
		boolean var24 = false;
		int var47 = 0 + var9;
		int var25 = var47;
		var47 += var10;
		int var26 = var47;
		if (var13 == 255) {
			var47 += var10;
		}

		int var27 = var47;
		if (var15 == 1) {
			var47 += var10;
		}

		int var28 = var47;
		if (var12 == 1) {
			var47 += var10;
		}

		int var29 = var47;
		var47 += var22;
		int var30 = var47;
		if (var14 == 1) {
			var47 += var10;
		}

		int var31 = var47;
		var47 += var21;
		int var32 = var47;
		var47 += var10 * 2;
		int var33 = var47;
		var47 += var11 * 6;
		int var34 = var47;
		var47 += var18;
		int var35 = var47;
		var47 += var19;
		int var10000 = var47 + var20;
		this.field1575 = var9;
		this.field1601 = var10;
		this.field1588 = var11;
		this.field1576 = new int[var9];
		this.field1577 = new int[var9];
		this.field1578 = new int[var9];
		this.field1580 = new int[var10];
		this.field1604 = new int[var10];
		this.field1582 = new int[var10];
		if (var11 > 0) {
			this.field1589 = new byte[var11];
			this.field1590 = new short[var11];
			this.field1593 = new short[var11];
			this.field1592 = new short[var11];
		}

		if (var16 == 1) {
			this.field1581 = new int[var9];
		}

		if (var12 == 1) {
			this.field1611 = new byte[var10];
			this.field1585 = new byte[var10];
			this.field1586 = new short[var10];
		}

		if (var13 == 255) {
			this.field1597 = new byte[var10];
		} else {
			this.field1583 = (byte)var13;
		}

		if (var14 == 1) {
			this.field1584 = new byte[var10];
		}

		if (var15 == 1) {
			this.field1594 = new int[var10];
		}

		if (var17 == 1) {
			this.field1609 = new int[var9][];
			this.field1598 = new int[var9][];
		}

		this.field1574 = new short[var10];
		var4.offset = 0;
		var5.offset = var34;
		var6.offset = var35;
		var7.offset = var47;
		var8.offset = var29;
		int var37 = 0;
		int var38 = 0;
		int var39 = 0;

		int var40;
		int var41;
		int var42;
		int var43;
		int var44;
		for (var40 = 0; var40 < var9; ++var40) {
			var41 = var4.readUnsignedByte();
			var42 = 0;
			if ((var41 & 1) != 0) {
				var42 = var5.method2517();
			}

			var43 = 0;
			if ((var41 & 2) != 0) {
				var43 = var6.method2517();
			}

			var44 = 0;
			if ((var41 & 4) != 0) {
				var44 = var7.method2517();
			}

			this.field1576[var40] = var37 + var42;
			this.field1577[var40] = var38 + var43;
			this.field1578[var40] = var39 + var44;
			var37 = this.field1576[var40];
			var38 = this.field1577[var40];
			var39 = this.field1578[var40];
			if (var16 == 1) {
				this.field1581[var40] = var8.readUnsignedByte();
			}
		}

		if (var17 == 1) {
			for (var40 = 0; var40 < var9; ++var40) {
				var41 = var8.readUnsignedByte();
				this.field1609[var40] = new int[var41];
				this.field1598[var40] = new int[var41];

				for (var42 = 0; var42 < var41; ++var42) {
					this.field1609[var40][var42] = var8.readUnsignedByte();
					this.field1598[var40][var42] = var8.readUnsignedByte();
				}
			}
		}

		var4.offset = var32;
		var5.offset = var28;
		var6.offset = var26;
		var7.offset = var30;
		var8.offset = var27;

		for (var40 = 0; var40 < var10; ++var40) {
			this.field1574[var40] = (short)var4.readUnsignedShort();
			if (var12 == 1) {
				var41 = var5.readUnsignedByte();
				if ((var41 & 1) == 1) {
					this.field1611[var40] = 1;
					var2 = true;
				} else {
					this.field1611[var40] = 0;
				}

				if ((var41 & 2) == 2) {
					this.field1585[var40] = (byte)(var41 >> 2);
					this.field1586[var40] = this.field1574[var40];
					this.field1574[var40] = 127;
					if (this.field1586[var40] != -1) {
						var3 = true;
					}
				} else {
					this.field1585[var40] = -1;
					this.field1586[var40] = -1;
				}
			}

			if (var13 == 255) {
				this.field1597[var40] = var6.readByte();
			}

			if (var14 == 1) {
				this.field1584[var40] = var7.readByte();
			}

			if (var15 == 1) {
				this.field1594[var40] = var8.readUnsignedByte();
			}
		}

		var4.offset = var31;
		var5.offset = var25;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		var43 = 0;

		int var45;
		int var46;
		for (var44 = 0; var44 < var10; ++var44) {
			var45 = var5.readUnsignedByte();
			if (var45 == 1) {
				var40 = var4.method2517() + var43;
				var41 = var4.method2517() + var40;
				var42 = var4.method2517() + var41;
				var43 = var42;
				this.field1580[var44] = var40;
				this.field1604[var44] = var41;
				this.field1582[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.method2517() + var43;
				var43 = var42;
				this.field1580[var44] = var40;
				this.field1604[var44] = var41;
				this.field1582[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.method2517() + var43;
				var43 = var42;
				this.field1580[var44] = var40;
				this.field1604[var44] = var41;
				this.field1582[var44] = var42;
			}

			if (var45 == 4) {
				var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.method2517() + var43;
				var43 = var42;
				this.field1580[var44] = var40;
				this.field1604[var44] = var46;
				this.field1582[var44] = var42;
			}
		}

		var4.offset = var33;

		for (var44 = 0; var44 < var11; ++var44) {
			this.field1589[var44] = 0;
			this.field1590[var44] = (short)var4.readUnsignedShort();
			this.field1593[var44] = (short)var4.readUnsignedShort();
			this.field1592[var44] = (short)var4.readUnsignedShort();
		}

		if (this.field1585 != null) {
			boolean var48 = false;

			for (var45 = 0; var45 < var10; ++var45) {
				var46 = this.field1585[var45] & 255;
				if (var46 != 255) {
					if ((this.field1590[var46] & '\uffff') == this.field1580[var45] && (this.field1593[var46] & '\uffff') == this.field1604[var45] && (this.field1592[var46] & '\uffff') == this.field1582[var45]) {
						this.field1585[var45] = -1;
					} else {
						var48 = true;
					}
				}
			}

			if (!var48) {
				this.field1585 = null;
			}
		}

		if (!var3) {
			this.field1586 = null;
		}

		if (!var2) {
			this.field1611 = null;
		}

	}

	void method1115(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var2.offset = var1.length - 23;
		int var9 = var2.readUnsignedShort();
		int var10 = var2.readUnsignedShort();
		int var11 = var2.readUnsignedByte();
		int var12 = var2.readUnsignedByte();
		int var13 = var2.readUnsignedByte();
		int var14 = var2.readUnsignedByte();
		int var15 = var2.readUnsignedByte();
		int var16 = var2.readUnsignedByte();
		int var17 = var2.readUnsignedByte();
		int var18 = var2.readUnsignedShort();
		int var19 = var2.readUnsignedShort();
		int var20 = var2.readUnsignedShort();
		int var21 = var2.readUnsignedShort();
		int var22 = var2.readUnsignedShort();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.field1589 = new byte[var11];
			var2.offset = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.field1589[var26] = var2.readByte();
				if (var27 == 0) {
					++var23;
				}

				if (var27 >= 1 && var27 <= 3) {
					++var24;
				}

				if (var27 == 2) {
					++var25;
				}
			}
		}

		var26 = var11 + var9;
		int var28 = var26;
		if (var12 == 1) {
			var26 += var10;
		}

		int var29 = var26;
		var26 += var10;
		int var30 = var26;
		if (var13 == 255) {
			var26 += var10;
		}

		int var31 = var26;
		if (var15 == 1) {
			var26 += var10;
		}

		int var32 = var26;
		if (var17 == 1) {
			var26 += var9;
		}

		int var33 = var26;
		if (var14 == 1) {
			var26 += var10;
		}

		int var34 = var26;
		var26 += var21;
		int var35 = var26;
		if (var16 == 1) {
			var26 += var10 * 2;
		}

		int var36 = var26;
		var26 += var22;
		int var37 = var26;
		var26 += var10 * 2;
		int var38 = var26;
		var26 += var18;
		int var39 = var26;
		var26 += var19;
		int var40 = var26;
		var26 += var20;
		int var41 = var26;
		var26 += var23 * 6;
		int var42 = var26;
		var26 += var24 * 6;
		int var43 = var26;
		var26 += var24 * 6;
		int var44 = var26;
		var26 += var24 * 2;
		int var45 = var26;
		var26 += var24;
		int var46 = var26;
		var26 += var24 * 2 + var25 * 2;
		this.field1575 = var9;
		this.field1601 = var10;
		this.field1588 = var11;
		this.field1576 = new int[var9];
		this.field1577 = new int[var9];
		this.field1578 = new int[var9];
		this.field1580 = new int[var10];
		this.field1604 = new int[var10];
		this.field1582 = new int[var10];
		if (var17 == 1) {
			this.field1581 = new int[var9];
		}

		if (var12 == 1) {
			this.field1611 = new byte[var10];
		}

		if (var13 == 255) {
			this.field1597 = new byte[var10];
		} else {
			this.field1583 = (byte)var13;
		}

		if (var14 == 1) {
			this.field1584 = new byte[var10];
		}

		if (var15 == 1) {
			this.field1594 = new int[var10];
		}

		if (var16 == 1) {
			this.field1586 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field1585 = new byte[var10];
		}

		this.field1574 = new short[var10];
		if (var11 > 0) {
			this.field1590 = new short[var11];
			this.field1593 = new short[var11];
			this.field1592 = new short[var11];
		}

		var2.offset = var11;
		var3.offset = var38;
		var4.offset = var39;
		var5.offset = var40;
		var6.offset = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.readUnsignedByte();
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.method2517();
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.method2517();
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.method2517();
			}

			this.field1576[var51] = var48 + var53;
			this.field1577[var51] = var49 + var54;
			this.field1578[var51] = var50 + var55;
			var48 = this.field1576[var51];
			var49 = this.field1577[var51];
			var50 = this.field1578[var51];
			if (var17 == 1) {
				this.field1581[var51] = var6.readUnsignedByte();
			}
		}

		var2.offset = var37;
		var3.offset = var28;
		var4.offset = var30;
		var5.offset = var33;
		var6.offset = var31;
		var7.offset = var35;
		var8.offset = var36;

		for (var51 = 0; var51 < var10; ++var51) {
			this.field1574[var51] = (short)var2.readUnsignedShort();
			if (var12 == 1) {
				this.field1611[var51] = var3.readByte();
			}

			if (var13 == 255) {
				this.field1597[var51] = var4.readByte();
			}

			if (var14 == 1) {
				this.field1584[var51] = var5.readByte();
			}

			if (var15 == 1) {
				this.field1594[var51] = var6.readUnsignedByte();
			}

			if (var16 == 1) {
				this.field1586[var51] = (short)(var7.readUnsignedShort() - 1);
			}

			if (this.field1585 != null && this.field1586[var51] != -1) {
				this.field1585[var51] = (byte)(var8.readUnsignedByte() - 1);
			}
		}

		var2.offset = var34;
		var3.offset = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.readUnsignedByte();
			if (var56 == 1) {
				var51 = var2.method2517() + var54;
				var52 = var2.method2517() + var51;
				var53 = var2.method2517() + var52;
				var54 = var53;
				this.field1580[var55] = var51;
				this.field1604[var55] = var52;
				this.field1582[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.method2517() + var54;
				var54 = var53;
				this.field1580[var55] = var51;
				this.field1604[var55] = var52;
				this.field1582[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.method2517() + var54;
				var54 = var53;
				this.field1580[var55] = var51;
				this.field1604[var55] = var52;
				this.field1582[var55] = var53;
			}

			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.method2517() + var54;
				var54 = var53;
				this.field1580[var55] = var51;
				this.field1604[var55] = var57;
				this.field1582[var55] = var53;
			}
		}

		var2.offset = var41;
		var3.offset = var42;
		var4.offset = var43;
		var5.offset = var44;
		var6.offset = var45;
		var7.offset = var46;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.field1589[var55] & 255;
			if (var56 == 0) {
				this.field1590[var55] = (short)var2.readUnsignedShort();
				this.field1593[var55] = (short)var2.readUnsignedShort();
				this.field1592[var55] = (short)var2.readUnsignedShort();
			}
		}

		var2.offset = var26;
		var55 = var2.readUnsignedByte();
		if (var55 != 0) {
			new class442();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readInt();
		}

	}

	void method1095(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var4.offset = var1.length - 18;
		int var9 = var4.readUnsignedShort();
		int var10 = var4.readUnsignedShort();
		int var11 = var4.readUnsignedByte();
		int var12 = var4.readUnsignedByte();
		int var13 = var4.readUnsignedByte();
		int var14 = var4.readUnsignedByte();
		int var15 = var4.readUnsignedByte();
		int var16 = var4.readUnsignedByte();
		int var17 = var4.readUnsignedShort();
		int var18 = var4.readUnsignedShort();
		int var19 = var4.readUnsignedShort();
		int var20 = var4.readUnsignedShort();
		boolean var21 = false;
		boolean var22 = false;
		int var45 = 0 + var9;
		int var23 = var45;
		var45 += var10;
		int var24 = var45;
		if (var13 == 255) {
			var45 += var10;
		}

		int var25 = var45;
		if (var15 == 1) {
			var45 += var10;
		}

		int var26 = var45;
		if (var12 == 1) {
			var45 += var10;
		}

		int var27 = var45;
		if (var16 == 1) {
			var45 += var9;
		}

		int var28 = var45;
		if (var14 == 1) {
			var45 += var10;
		}

		int var29 = var45;
		var45 += var20;
		int var30 = var45;
		var45 += var10 * 2;
		int var31 = var45;
		var45 += var11 * 6;
		int var32 = var45;
		var45 += var17;
		int var33 = var45;
		var45 += var18;
		int var10000 = var45 + var19;
		this.field1575 = var9;
		this.field1601 = var10;
		this.field1588 = var11;
		this.field1576 = new int[var9];
		this.field1577 = new int[var9];
		this.field1578 = new int[var9];
		this.field1580 = new int[var10];
		this.field1604 = new int[var10];
		this.field1582 = new int[var10];
		if (var11 > 0) {
			this.field1589 = new byte[var11];
			this.field1590 = new short[var11];
			this.field1593 = new short[var11];
			this.field1592 = new short[var11];
		}

		if (var16 == 1) {
			this.field1581 = new int[var9];
		}

		if (var12 == 1) {
			this.field1611 = new byte[var10];
			this.field1585 = new byte[var10];
			this.field1586 = new short[var10];
		}

		if (var13 == 255) {
			this.field1597 = new byte[var10];
		} else {
			this.field1583 = (byte)var13;
		}

		if (var14 == 1) {
			this.field1584 = new byte[var10];
		}

		if (var15 == 1) {
			this.field1594 = new int[var10];
		}

		this.field1574 = new short[var10];
		var4.offset = 0;
		var5.offset = var32;
		var6.offset = var33;
		var7.offset = var45;
		var8.offset = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.readUnsignedByte();
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.method2517();
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.method2517();
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.method2517();
			}

			this.field1576[var38] = var35 + var40;
			this.field1577[var38] = var36 + var41;
			this.field1578[var38] = var37 + var42;
			var35 = this.field1576[var38];
			var36 = this.field1577[var38];
			var37 = this.field1578[var38];
			if (var16 == 1) {
				this.field1581[var38] = var8.readUnsignedByte();
			}
		}

		var4.offset = var30;
		var5.offset = var26;
		var6.offset = var24;
		var7.offset = var28;
		var8.offset = var25;

		for (var38 = 0; var38 < var10; ++var38) {
			this.field1574[var38] = (short)var4.readUnsignedShort();
			if (var12 == 1) {
				var39 = var5.readUnsignedByte();
				if ((var39 & 1) == 1) {
					this.field1611[var38] = 1;
					var2 = true;
				} else {
					this.field1611[var38] = 0;
				}

				if ((var39 & 2) == 2) {
					this.field1585[var38] = (byte)(var39 >> 2);
					this.field1586[var38] = this.field1574[var38];
					this.field1574[var38] = 127;
					if (this.field1586[var38] != -1) {
						var3 = true;
					}
				} else {
					this.field1585[var38] = -1;
					this.field1586[var38] = -1;
				}
			}

			if (var13 == 255) {
				this.field1597[var38] = var6.readByte();
			}

			if (var14 == 1) {
				this.field1584[var38] = var7.readByte();
			}

			if (var15 == 1) {
				this.field1594[var38] = var8.readUnsignedByte();
			}
		}

		var4.offset = var29;
		var5.offset = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.readUnsignedByte();
			if (var43 == 1) {
				var38 = var4.method2517() + var41;
				var39 = var4.method2517() + var38;
				var40 = var4.method2517() + var39;
				var41 = var40;
				this.field1580[var42] = var38;
				this.field1604[var42] = var39;
				this.field1582[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.method2517() + var41;
				var41 = var40;
				this.field1580[var42] = var38;
				this.field1604[var42] = var39;
				this.field1582[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.method2517() + var41;
				var41 = var40;
				this.field1580[var42] = var38;
				this.field1604[var42] = var39;
				this.field1582[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.method2517() + var41;
				var41 = var40;
				this.field1580[var42] = var38;
				this.field1604[var42] = var44;
				this.field1582[var42] = var40;
			}
		}

		var4.offset = var31;

		for (var42 = 0; var42 < var11; ++var42) {
			this.field1589[var42] = 0;
			this.field1590[var42] = (short)var4.readUnsignedShort();
			this.field1593[var42] = (short)var4.readUnsignedShort();
			this.field1592[var42] = (short)var4.readUnsignedShort();
		}

		if (this.field1585 != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.field1585[var43] & 255;
				if (var44 != 255) {
					if ((this.field1590[var44] & '\uffff') == this.field1580[var43] && (this.field1593[var44] & '\uffff') == this.field1604[var43] && (this.field1592[var44] & '\uffff') == this.field1582[var43]) {
						this.field1585[var43] = -1;
					} else {
						var46 = true;
					}
				}
			}

			if (!var46) {
				this.field1585 = null;
			}
		}

		if (!var3) {
			this.field1586 = null;
		}

		if (!var2) {
			this.field1611 = null;
		}

	}

	final int method1113(class239 var1, int var2) {
		int var3 = -1;
		int var4 = var1.field1576[var2];
		int var5 = var1.field1577[var2];
		int var6 = var1.field1578[var2];

		for (int var7 = 0; var7 < this.field1575; ++var7) {
			if (var4 == this.field1576[var7] && var5 == this.field1577[var7] && var6 == this.field1578[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.field1576[this.field1575] = var4;
			this.field1577[this.field1575] = var5;
			this.field1578[this.field1575] = var6;
			if (var1.field1581 != null) {
				this.field1581[this.field1575] = var1.field1581[var2];
			}

			if (var1.field1609 != null) {
				this.field1609[this.field1575] = var1.field1609[var2];
				this.field1598[this.field1575] = var1.field1598[var2];
			}

			var3 = this.field1575++;
		}

		return var3;
	}

	public class239 method1097() {
		class239 var1 = new class239();
		if (this.field1611 != null) {
			var1.field1611 = new byte[this.field1601];

			for (int var2 = 0; var2 < this.field1601; ++var2) {
				var1.field1611[var2] = this.field1611[var2];
			}
		}

		var1.field1575 = this.field1575;
		var1.field1601 = this.field1601;
		var1.field1588 = this.field1588;
		var1.field1576 = this.field1576;
		var1.field1577 = this.field1577;
		var1.field1578 = this.field1578;
		var1.field1580 = this.field1580;
		var1.field1604 = this.field1604;
		var1.field1582 = this.field1582;
		var1.field1597 = this.field1597;
		var1.field1584 = this.field1584;
		var1.field1585 = this.field1585;
		var1.field1574 = this.field1574;
		var1.field1586 = this.field1586;
		var1.field1583 = this.field1583;
		var1.field1589 = this.field1589;
		var1.field1590 = this.field1590;
		var1.field1593 = this.field1593;
		var1.field1592 = this.field1592;
		var1.field1581 = this.field1581;
		var1.field1594 = this.field1594;
		var1.field1579 = this.field1579;
		var1.field1596 = this.field1596;
		var1.field1600 = this.field1600;
		var1.field1599 = this.field1599;
		var1.field1602 = this.field1602;
		var1.field1603 = this.field1603;
		return var1;
	}

	public class239 method1109(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method1105();
		int var7 = var2 + this.field1606;
		int var8 = var2 + this.field1607;
		int var9 = var4 + this.field1587;
		int var10 = var4 + this.field1608;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class239 var11 = new class239();
				var11.field1575 = this.field1575;
				var11.field1601 = this.field1601;
				var11.field1588 = this.field1588;
				var11.field1576 = this.field1576;
				var11.field1578 = this.field1578;
				var11.field1580 = this.field1580;
				var11.field1604 = this.field1604;
				var11.field1582 = this.field1582;
				var11.field1611 = this.field1611;
				var11.field1597 = this.field1597;
				var11.field1584 = this.field1584;
				var11.field1585 = this.field1585;
				var11.field1574 = this.field1574;
				var11.field1586 = this.field1586;
				var11.field1583 = this.field1583;
				var11.field1589 = this.field1589;
				var11.field1590 = this.field1590;
				var11.field1593 = this.field1593;
				var11.field1592 = this.field1592;
				var11.field1581 = this.field1581;
				var11.field1594 = this.field1594;
				var11.field1579 = this.field1579;
				var11.field1596 = this.field1596;
				var11.field1602 = this.field1602;
				var11.field1603 = this.field1603;
				var11.field1577 = new int[var11.field1575];
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.field1575; ++var12) {
						var13 = this.field1576[var12] + var2;
						var14 = this.field1578[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field1577[var12] = this.field1577[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field1575; ++var12) {
						var13 = (-this.field1577[var12] << 16) / super.field3161;
						if (var13 < var6) {
							var14 = this.field1576[var12] + var2;
							var15 = this.field1578[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field1577[var12] = this.field1577[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method1104();
				return var11;
			}
		} else {
			return this;
		}
	}

	void method1098() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.field1581 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field1575; ++var3) {
				var4 = this.field1581[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field1579 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field1579[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field1575; this.field1579[var4][var1[var4]++] = var3++) {
				var4 = this.field1581[var3];
			}

			this.field1581 = null;
		}

		if (this.field1594 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field1601; ++var3) {
				var4 = this.field1594[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field1596 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field1596[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field1601; this.field1596[var4][var1[var4]++] = var3++) {
				var4 = this.field1594[var3];
			}

			this.field1594 = null;
		}

	}

	public void method1099() {
		for (int var1 = 0; var1 < this.field1575; ++var1) {
			int var2 = this.field1576[var1];
			this.field1576[var1] = this.field1578[var1];
			this.field1578[var1] = -var2;
		}

		this.method1104();
	}

	public void method1103() {
		for (int var1 = 0; var1 < this.field1575; ++var1) {
			this.field1576[var1] = -this.field1576[var1];
			this.field1578[var1] = -this.field1578[var1];
		}

		this.method1104();
	}

	public void method1110() {
		for (int var1 = 0; var1 < this.field1575; ++var1) {
			int var2 = this.field1578[var1];
			this.field1578[var1] = this.field1576[var1];
			this.field1576[var1] = -var2;
		}

		this.method1104();
	}

	public void method1100(int var1) {
		int var2 = field1613[256];
		int var3 = field1614[256];

		for (int var4 = 0; var4 < this.field1575; ++var4) {
			int var5 = this.field1578[var4] * var2 + this.field1576[var4] * var3 >> 16;
			this.field1578[var4] = this.field1578[var4] * var3 - this.field1576[var4] * var2 >> 16;
			this.field1576[var4] = var5;
		}

		this.method1104();
	}

	public void method1111(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field1575; ++var4) {
			int[] var10000 = this.field1576;
			var10000[var4] += var1;
			var10000 = this.field1577;
			var10000[var4] += var2;
			var10000 = this.field1578;
			var10000[var4] += var3;
		}

		this.method1104();
	}

	public void method1116(short var1, short var2) {
		for (int var3 = 0; var3 < this.field1601; ++var3) {
			if (this.field1574[var3] == var1) {
				this.field1574[var3] = var2;
			}
		}

	}

	public void method1101(short var1, short var2) {
		if (this.field1586 != null) {
			for (int var3 = 0; var3 < this.field1601; ++var3) {
				if (this.field1586[var3] == var1) {
					this.field1586[var3] = var2;
				}
			}

		}
	}

	public void method1102() {
		int var1;
		for (var1 = 0; var1 < this.field1575; ++var1) {
			this.field1578[var1] = -this.field1578[var1];
		}

		for (var1 = 0; var1 < this.field1601; ++var1) {
			int var2 = this.field1580[var1];
			this.field1580[var1] = this.field1582[var1];
			this.field1582[var1] = var2;
		}

		this.method1104();
	}

	public void method1112(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field1575; ++var4) {
			this.field1576[var4] = this.field1576[var4] * var1 / 128;
			this.field1577[var4] = this.field1577[var4] * var2 / 128;
			this.field1578[var4] = this.field1578[var4] * var3 / 128;
		}

		this.method1104();
	}

	public void method1096() {
		if (this.field1600 == null) {
			this.field1600 = new class215[this.field1575];

			int var1;
			for (var1 = 0; var1 < this.field1575; ++var1) {
				this.field1600[var1] = new class215();
			}

			for (var1 = 0; var1 < this.field1601; ++var1) {
				int var2 = this.field1580[var1];
				int var3 = this.field1604[var1];
				int var4 = this.field1582[var1];
				int var5 = this.field1576[var3] - this.field1576[var2];
				int var6 = this.field1577[var3] - this.field1577[var2];
				int var7 = this.field1578[var3] - this.field1578[var2];
				int var8 = this.field1576[var4] - this.field1576[var2];
				int var9 = this.field1577[var4] - this.field1577[var2];
				int var10 = this.field1578[var4] - this.field1578[var2];
				int var11 = var6 * var10 - var9 * var7;
				int var12 = var7 * var8 - var10 * var5;

				int var13;
				for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
					var11 >>= 1;
					var12 >>= 1;
				}

				int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
				if (var14 <= 0) {
					var14 = 1;
				}

				var11 = var11 * 256 / var14;
				var12 = var12 * 256 / var14;
				var13 = var13 * 256 / var14;
				byte var15;
				if (this.field1611 == null) {
					var15 = 0;
				} else {
					var15 = this.field1611[var1];
				}

				if (var15 == 0) {
					class215 var16 = this.field1600[var2];
					var16.field1404 += var11;
					var16.field1406 += var12;
					var16.field1405 += var13;
					++var16.field1403;
					var16 = this.field1600[var3];
					var16.field1404 += var11;
					var16.field1406 += var12;
					var16.field1405 += var13;
					++var16.field1403;
					var16 = this.field1600[var4];
					var16.field1404 += var11;
					var16.field1406 += var12;
					var16.field1405 += var13;
					++var16.field1403;
				} else if (var15 == 1) {
					if (this.field1599 == null) {
						this.field1599 = new class279[this.field1601];
					}

					class279 var17 = this.field1599[var1] = new class279();
					var17.field2144 = var11;
					var17.field2142 = var12;
					var17.field2143 = var13;
				}
			}

		}
	}

	void method1104() {
		this.field1600 = null;
		this.field1573 = null;
		this.field1599 = null;
		this.field1591 = false;
	}

	void method1105() {
		if (!this.field1591) {
			super.field3161 = 0;
			this.field1605 = 0;
			this.field1606 = 999999;
			this.field1607 = -999999;
			this.field1608 = -99999;
			this.field1587 = 99999;

			for (int var1 = 0; var1 < this.field1575; ++var1) {
				int var2 = this.field1576[var1];
				int var3 = this.field1577[var1];
				int var4 = this.field1578[var1];
				if (var2 < this.field1606) {
					this.field1606 = var2;
				}

				if (var2 > this.field1607) {
					this.field1607 = var2;
				}

				if (var4 < this.field1587) {
					this.field1587 = var4;
				}

				if (var4 > this.field1608) {
					this.field1608 = var4;
				}

				if (-var3 > super.field3161) {
					super.field3161 = -var3;
				}

				if (var3 > this.field1605) {
					this.field1605 = var3;
				}
			}

			this.field1591 = true;
		}
	}

	public final class490 method1107(int var1, int var2, int var3, int var4, int var5) {
		this.method1096();
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
		int var7 = var2 * var6 >> 8;
		class490 var8 = new class490();
		var8.field3485 = new int[this.field1601];
		var8.field3439 = new int[this.field1601];
		var8.field3440 = new int[this.field1601];
		if (this.field1588 > 0 && this.field1585 != null) {
			int[] var9 = new int[this.field1588];

			int var10;
			for (var10 = 0; var10 < this.field1601; ++var10) {
				if (this.field1585[var10] != -1) {
					++var9[this.field1585[var10] & 255];
				}
			}

			var8.field3446 = 0;

			for (var10 = 0; var10 < this.field1588; ++var10) {
				if (var9[var10] > 0 && this.field1589[var10] == 0) {
					++var8.field3446;
				}
			}

			var8.field3447 = new int[var8.field3446];
			var8.field3441 = new int[var8.field3446];
			var8.field3449 = new int[var8.field3446];
			var10 = 0;

			int var11;
			for (var11 = 0; var11 < this.field1588; ++var11) {
				if (var9[var11] > 0 && this.field1589[var11] == 0) {
					var8.field3447[var10] = this.field1590[var11] & '\uffff';
					var8.field3441[var10] = this.field1593[var11] & '\uffff';
					var8.field3449[var10] = this.field1592[var11] & '\uffff';
					var9[var11] = var10++;
				} else {
					var9[var11] = -1;
				}
			}

			var8.field3443 = new byte[this.field1601];

			for (var11 = 0; var11 < this.field1601; ++var11) {
				if (this.field1585[var11] != -1) {
					var8.field3443[var11] = (byte)var9[this.field1585[var11] & 255];
				} else {
					var8.field3443[var11] = -1;
				}
			}
		}

		for (int var16 = 0; var16 < this.field1601; ++var16) {
			byte var17;
			if (this.field1611 == null) {
				var17 = 0;
			} else {
				var17 = this.field1611[var16];
			}

			byte var18;
			if (this.field1584 == null) {
				var18 = 0;
			} else {
				var18 = this.field1584[var16];
			}

			short var12;
			if (this.field1586 == null) {
				var12 = -1;
			} else {
				var12 = this.field1586[var16];
			}

			if (var18 == -2) {
				var17 = 3;
			}

			if (var18 == -1) {
				var17 = 2;
			}

			class215 var13;
			int var14;
			class279 var19;
			if (var12 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = this.field1599[var16];
						var14 = var1 + (var3 * var19.field2144 + var4 * var19.field2142 + var5 * var19.field2143) / (var7 + var7 / 2);
						var8.field3485[var16] = method1114(this.field1574[var16] & '\uffff', var14);
						var8.field3440[var16] = -1;
					} else if (var17 == 3) {
						var8.field3485[var16] = 128;
						var8.field3440[var16] = -1;
					} else {
						var8.field3440[var16] = -2;
					}
				} else {
					int var15 = this.field1574[var16] & '\uffff';
					if (this.field1573 != null && this.field1573[this.field1580[var16]] != null) {
						var13 = this.field1573[this.field1580[var16]];
					} else {
						var13 = this.field1600[this.field1580[var16]];
					}

					var14 = var1 + (var3 * var13.field1404 + var4 * var13.field1406 + var5 * var13.field1405) / (var7 * var13.field1403);
					var8.field3485[var16] = method1114(var15, var14);
					if (this.field1573 != null && this.field1573[this.field1604[var16]] != null) {
						var13 = this.field1573[this.field1604[var16]];
					} else {
						var13 = this.field1600[this.field1604[var16]];
					}

					var14 = var1 + (var3 * var13.field1404 + var4 * var13.field1406 + var5 * var13.field1405) / (var7 * var13.field1403);
					var8.field3439[var16] = method1114(var15, var14);
					if (this.field1573 != null && this.field1573[this.field1582[var16]] != null) {
						var13 = this.field1573[this.field1582[var16]];
					} else {
						var13 = this.field1600[this.field1582[var16]];
					}

					var14 = var1 + (var3 * var13.field1404 + var4 * var13.field1406 + var5 * var13.field1405) / (var7 * var13.field1403);
					var8.field3440[var16] = method1114(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = this.field1599[var16];
					var14 = var1 + (var3 * var19.field2144 + var4 * var19.field2142 + var5 * var19.field2143) / (var7 + var7 / 2);
					var8.field3485[var16] = method1108(var14);
					var8.field3440[var16] = -1;
				} else {
					var8.field3440[var16] = -2;
				}
			} else {
				if (this.field1573 != null && this.field1573[this.field1580[var16]] != null) {
					var13 = this.field1573[this.field1580[var16]];
				} else {
					var13 = this.field1600[this.field1580[var16]];
				}

				var14 = var1 + (var3 * var13.field1404 + var4 * var13.field1406 + var5 * var13.field1405) / (var7 * var13.field1403);
				var8.field3485[var16] = method1108(var14);
				if (this.field1573 != null && this.field1573[this.field1604[var16]] != null) {
					var13 = this.field1573[this.field1604[var16]];
				} else {
					var13 = this.field1600[this.field1604[var16]];
				}

				var14 = var1 + (var3 * var13.field1404 + var4 * var13.field1406 + var5 * var13.field1405) / (var7 * var13.field1403);
				var8.field3439[var16] = method1108(var14);
				if (this.field1573 != null && this.field1573[this.field1582[var16]] != null) {
					var13 = this.field1573[this.field1582[var16]];
				} else {
					var13 = this.field1600[this.field1582[var16]];
				}

				var14 = var1 + (var3 * var13.field1404 + var4 * var13.field1406 + var5 * var13.field1405) / (var7 * var13.field1403);
				var8.field3440[var16] = method1108(var14);
			}
		}

		this.method1098();
		var8.field3491 = this.field1575;
		var8.field3469 = this.field1576;
		var8.field3434 = this.field1577;
		var8.field3444 = this.field1578;
		var8.field3448 = this.field1601;
		var8.field3472 = this.field1580;
		var8.field3436 = this.field1604;
		var8.field3437 = this.field1582;
		var8.field3435 = this.field1597;
		var8.field3442 = this.field1584;
		var8.field3445 = this.field1583;
		var8.field3450 = this.field1579;
		var8.field3451 = this.field1596;
		var8.field3430 = this.field1586;
		var8.field3452 = this.field1609;
		var8.field3453 = this.field1598;
		return var8;
	}

	public static class239 method1092(class5 var0, int var1, int var2) {
		byte[] var3 = var0.method39(var1, 0);
		return var3 == null ? null : new class239(var3);
	}

	static void method1106(class239 var0, class239 var1, int var2, int var3, int var4, boolean var5) {
		var0.method1105();
		var0.method1096();
		var1.method1105();
		var1.method1096();
		++field1612;
		int var6 = 0;
		int[] var7 = var1.field1576;
		int var8 = var1.field1575;

		int var9;
		for (var9 = 0; var9 < var0.field1575; ++var9) {
			class215 var10 = var0.field1600[var9];
			if (var10.field1403 != 0) {
				int var11 = var0.field1577[var9] - var3;
				if (var11 <= var1.field1605) {
					int var12 = var0.field1576[var9] - var2;
					if (var12 >= var1.field1606 && var12 <= var1.field1607) {
						int var13 = var0.field1578[var9] - var4;
						if (var13 >= var1.field1587 && var13 <= var1.field1608) {
							for (int var14 = 0; var14 < var8; ++var14) {
								class215 var15 = var1.field1600[var14];
								if (var12 == var7[var14] && var13 == var1.field1578[var14] && var11 == var1.field1577[var14] && var15.field1403 != 0) {
									if (var0.field1573 == null) {
										var0.field1573 = new class215[var0.field1575];
									}

									if (var1.field1573 == null) {
										var1.field1573 = new class215[var8];
									}

									class215 var16 = var0.field1573[var9];
									if (var16 == null) {
										var16 = var0.field1573[var9] = new class215(var10);
									}

									class215 var17 = var1.field1573[var14];
									if (var17 == null) {
										var17 = var1.field1573[var14] = new class215(var15);
									}

									var16.field1404 += var15.field1404;
									var16.field1406 += var15.field1406;
									var16.field1405 += var15.field1405;
									var16.field1403 += var15.field1403;
									var17.field1404 += var10.field1404;
									var17.field1406 += var10.field1406;
									var17.field1405 += var10.field1405;
									var17.field1403 += var10.field1403;
									++var6;
									field1610[var9] = field1612;
									field1595[var14] = field1612;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (var9 = 0; var9 < var0.field1601; ++var9) {
				if (field1610[var0.field1580[var9]] == field1612 && field1610[var0.field1604[var9]] == field1612 && field1610[var0.field1582[var9]] == field1612) {
					if (var0.field1611 == null) {
						var0.field1611 = new byte[var0.field1601];
					}

					var0.field1611[var9] = 2;
				}
			}

			for (var9 = 0; var9 < var1.field1601; ++var9) {
				if (field1595[var1.field1580[var9]] == field1612 && field1595[var1.field1604[var9]] == field1612 && field1595[var1.field1582[var9]] == field1612) {
					if (var1.field1611 == null) {
						var1.field1611 = new byte[var1.field1601];
					}

					var1.field1611[var9] = 2;
				}
			}

		}
	}

	static final int method1114(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	static final int method1108(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}
}
