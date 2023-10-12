import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class248 {
	static final class43 field1661;
	static final class43 field1662;
	static final class43 field1677;
	boolean field1689;
	boolean field1694;
	boolean field1699;
	class230[] field1665;
	class282 field1698;
	class353 field1657;
	class353 field1668;
	class353 field1669;
	class370 field1705;
	class379 field1670;
	class42 field1667;
	class437 field1690;
	class5 field1659;
	class5 field1681;
	class5 field1701;
	float field1675;
	float field1676;
	int field1656;
	int field1658;
	int field1660;
	int field1663;
	int field1666;
	int field1671;
	int field1673;
	int field1674;
	int field1678;
	int field1679;
	int field1680;
	int field1682;
	int field1683;
	int field1685;
	int field1686;
	int field1687;
	int field1691;
	int field1692;
	int field1693;
	int field1697;
	int field1708;
	int field1709;
	int field1711;
	HashMap field1664;
	HashMap field1700;
	HashSet field1684;
	HashSet field1688;
	HashSet field1695;
	HashSet field1696;
	HashSet field1704;
	HashSet field1707;
	Iterator field1703;
	List field1702;
	long field1672;
	final int[] field1710;
	public boolean field1706;

	static {
		field1677 = class43.field216;
		field1661 = class43.field213;
		field1662 = class43.field215;
	}

	public class248() {
		this.field1673 = -1;
		this.field1674 = -1;
		this.field1666 = -1;
		this.field1678 = -1;
		this.field1709 = -1;
		this.field1680 = -1;
		this.field1711 = 3;
		this.field1682 = 50;
		this.field1689 = false;
		this.field1684 = null;
		this.field1685 = -1;
		this.field1686 = -1;
		this.field1687 = -1;
		this.field1658 = -1;
		this.field1660 = -1;
		this.field1656 = -1;
		this.field1694 = true;
		this.field1695 = new HashSet();
		this.field1696 = new HashSet();
		this.field1688 = new HashSet();
		this.field1707 = new HashSet();
		this.field1699 = false;
		this.field1683 = 0;
		this.field1710 = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field1704 = new HashSet();
		this.field1705 = null;
		this.field1706 = false;
		this.field1671 = -1;
		this.field1691 = -1;
		this.field1697 = -1;
	}

	public void method1142(class5 var1, class5 var2, class5 var3, class282 var4, HashMap var5, class230[] var6) {
		this.field1665 = var6;
		this.field1701 = var1;
		this.field1681 = var2;
		this.field1659 = var3;
		this.field1698 = var4;
		this.field1664 = new HashMap();
		this.field1664.put(class13.field74, var5.get(field1677));
		this.field1664.put(class13.field69, var5.get(field1661));
		this.field1664.put(class13.field70, var5.get(field1662));
		this.field1690 = new class437(var1);
		int var8 = this.field1701.method28(class31.field156.field153);
		int[] var9 = this.field1701.method22(var8);
		int var10 = null == var9 ? 0 : var9.length;
		this.field1700 = new HashMap(var10);

		for (int var11 = 0; var11 < var10; ++var11) {
			Buffer var12 = new Buffer(this.field1701.method39(var8, var9[var11]));
			class353 var13 = new class353();
			var13.method1681(var12, var9[var11], Client.field1841 >= 217);
			this.field1700.put(var13.method1686(), var13);
			if (var13.method1685()) {
				this.field1657 = var13;
			}
		}

		this.method1157(this.field1657);
		this.field1669 = null;
	}

	public void method1186() {
		class438.field2942.method189(5);
	}

	public void method1144(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.field1690.method1988()) {
			this.method1147();
			this.method1148();
			if (var3) {
				int var9 = (int)Math.ceil((double)((float)var6 / this.field1675));
				int var10 = (int)Math.ceil((double)((float)var7 / this.field1675));
				List var11 = this.field1670.method1782(this.field1663 - var9 / 2 - 1, this.field1679 - var10 / 2 - 1, 1 + var9 / 2 + this.field1663, 1 + this.field1679 + var10 / 2, var4, var5, var6, var7, var1, var2);
				HashSet var12 = new HashSet();

				Iterator var13;
				class283 var14;
				class376 var15;
				class102 var16;
				for (var13 = var11.iterator(); var13.hasNext(); class440.method2027(var15)) {
					var14 = (class283)var13.next();
					var12.add(var14);
					var15 = new class376();
					var16 = new class102(var14.method1483(), var14.field2149, var14.field2150);
					var15.method1758(new Object[]{var16, var1, var2});
					if (this.field1704.contains(var14)) {
						var15.method1761(17);
					} else {
						var15.method1761(15);
					}
				}

				var13 = this.field1704.iterator();

				while (var13.hasNext()) {
					var14 = (class283)var13.next();
					if (!var12.contains(var14)) {
						var15 = new class376();
						var16 = new class102(var14.method1483(), var14.field2149, var14.field2150);
						var15.method1758(new Object[]{var16, var1, var2});
						var15.method1761(16);
						class440.method2027(var15);
					}
				}

				this.field1704 = var12;
			}
		}
	}

	public void method1145(int var1, int var2, boolean var3, boolean var4) {
		long var6;
		label33: {
			var6 = class38.method108();
			this.method1146(var1, var2, var4, var6);
			if (!this.method1193() && (var4 || var3)) {
				boolean var8 = null != Client.field2014;
				if (!var8) {
					if (var4) {
						this.field1660 = var1;
						this.field1656 = var2;
						this.field1687 = this.field1663;
						this.field1658 = this.field1679;
					}

					if (this.field1687 != -1) {
						int var9 = var1 - this.field1660;
						int var10 = var2 - this.field1656;
						this.method1149(this.field1687 - (int)((float)var9 / this.field1676), (int)((float)var10 / this.field1676) + this.field1658, false);
					}
					break label33;
				}
			}

			this.method1191();
		}

		if (var4) {
			this.field1672 = var6;
			this.field1692 = var1;
			this.field1693 = var2;
		}

	}

	void method1146(int var1, int var2, boolean var3, long var4) {
		if (this.field1668 != null) {
			int var6 = (int)((float)this.field1663 + ((float)(var1 - this.field1709) - (float)this.method1150() * this.field1675 / 2.0F) / this.field1675);
			int var7 = (int)((float)this.field1679 - ((float)(var2 - this.field1680) - (float)this.method1199() * this.field1675 / 2.0F) / this.field1675);
			this.field1705 = this.field1668.method1700(var6 + this.field1668.method1690() * 64, var7 + this.field1668.method1691() * 64);
			if (this.field1705 != null && var3) {
				class381 var8 = Client.method1420();
				boolean var9 = Client.field2087 >= 2;
				int var11;
				int var12;
				if (var9 && var8.method1798(82) && var8.method1798(81)) {
					int var14 = this.field1705.field2561;
					var11 = this.field1705.field2559;
					var12 = this.field1705.field2560;
					class341 var13 = class341.createClientPacket(ClientPacket.field3067, Client.field1891.field4219);
					var13.buffer.writeShortADD(var14);
					var13.buffer.writeShortLE(var11);
					var13.buffer.writeInt(0);
					var13.buffer.writeByteADD(var12);
					Client.field1891.method2612(var13);
				} else {
					boolean var10 = true;
					if (this.field1694) {
						var11 = var1 - this.field1692;
						var12 = var2 - this.field1693;
						if (var4 - this.field1672 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						class341 var15 = class341.createClientPacket(ClientPacket.field3089, Client.field1891.field4219);
						var15.buffer.writeInt(this.field1705.method1737());
						Client.field1891.method2612(var15);
						this.field1672 = 0L;
					}
				}
			}
		} else {
			this.field1705 = null;
		}

	}

	void method1147() {
		if (null != class76.field535) {
			this.field1675 = this.field1676;
		} else {
			if (this.field1675 < this.field1676) {
				this.field1675 = Math.min(this.field1676, this.field1675 / 30.0F + this.field1675);
			}

			if (this.field1675 > this.field1676) {
				this.field1675 = Math.max(this.field1676, this.field1675 - this.field1675 / 30.0F);
			}

		}
	}

	void method1148() {
		if (this.method1193()) {
			int var2 = this.field1673 - this.field1663;
			int var3 = this.field1674 - this.field1679;
			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			if (var3 != 0) {
				var3 /= Math.min(8, Math.abs(var3));
			}

			this.method1149(this.field1663 + var2, var3 + this.field1679, true);
			if (this.field1673 == this.field1663 && this.field1679 == this.field1674) {
				this.field1673 = -1;
				this.field1674 = -1;
			}

		}
	}

	final void method1149(int var1, int var2, boolean var3) {
		this.field1663 = var1;
		this.field1679 = var2;
		class38.method108();
		if (var3) {
			this.method1191();
		}

	}

	final void method1191() {
		this.field1656 = -1;
		this.field1660 = -1;
		this.field1658 = -1;
		this.field1687 = -1;
	}

	boolean method1193() {
		return this.field1673 != -1 && this.field1674 != -1;
	}

	public class353 method1152(int var1, int var2, int var3) {
		Iterator var5 = this.field1700.values().iterator();

		class353 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (class353)var5.next();
		} while(!var6.method1699(var1, var2, var3));

		return var6;
	}

	public void method1153(int var1, int var2, int var3, boolean var4) {
		class353 var6 = this.method1152(var1, var2, var3);
		if (var6 == null) {
			if (!var4) {
				return;
			}

			var6 = this.field1657;
		}

		boolean var7 = false;
		if (var6 != this.field1669 || var4) {
			this.field1669 = var6;
			this.method1157(var6);
			var7 = true;
		}

		if (var7 || var4) {
			this.method1195(var1, var2, var3);
		}

	}

	public void method1154(int var1) {
		class353 var3 = this.method1167(var1);
		if (var3 != null) {
			this.method1157(var3);
		}

	}

	public int method1155() {
		return this.field1668 == null ? -1 : this.field1668.method1684();
	}

	public class353 method1156() {
		return this.field1668;
	}

	void method1157(class353 var1) {
		if (null == this.field1668 || var1 != this.field1668) {
			this.method1174(var1);
			this.method1195(-1, -1, -1);
		}
	}

	void method1174(class353 var1) {
		this.field1668 = var1;
		this.field1670 = new class379(this.field1665, this.field1664, this.field1681, this.field1659);
		this.field1690.method1989(this.field1668 == null ? null : this.field1668.method1686());
	}

	public void method1158(class353 var1, class370 var2, class370 var3, boolean var4) {
		if (null != var1) {
			if (null == this.field1668 || var1 != this.field1668) {
				this.method1174(var1);
			}

			if (!var4 && this.field1668.method1699(var2.field2560, var2.field2561, var2.field2559)) {
				this.method1195(var2.field2560, var2.field2561, var2.field2559);
			} else {
				this.method1195(var3.field2560, var3.field2561, var3.field2559);
			}

		}
	}

	void method1195(int var1, int var2, int var3) {
		if (null != this.field1668) {
			int[] var5 = this.field1668.method1683(var1, var2, var3);
			if (var5 == null) {
				var5 = this.field1668.method1683(this.field1668.method1693(), this.field1668.method1692(), this.field1668.method1694());
			}

			this.method1149(var5[0] - this.field1668.method1690() * 64, var5[1] - this.field1668.method1691() * 64, true);
			this.field1673 = -1;
			this.field1674 = -1;
			this.field1675 = this.method1164(this.field1668.method1689());
			this.field1676 = this.field1675;
			this.field1702 = null;
			this.field1703 = null;
			this.field1670.method1788();
		}
	}

	public void method1159(int var1, int var2, int var3, int var4, int var5) {
		int[] var7 = new int[4];
		class433.method1960(var7);
		class433.method1958(var1, var2, var1 + var3, var2 + var4);
		int var8 = this.field1690.method1987();
		if (var8 < 100) {
			this.method1163(var1, var2, var3, var4, var8);
		} else {
			if (!this.field1670.method1784()) {
				this.field1670.method1779(this.field1701, this.field1668.method1686(), Client.field1835, Client.field1841 >= 217);
				if (!this.field1670.method1784()) {
					return;
				}
			}

			class433.method1977(var1, var2, var3, var4, this.field1670.method1785());
			if (null != this.field1684) {
				++this.field1686;
				if (this.field1686 % this.field1682 == 0) {
					this.field1686 = 0;
					++this.field1685;
				}

				if (this.field1685 >= this.field1711 && !this.field1689) {
					this.field1684 = null;
				}
			}

			int var9 = (int)Math.ceil((double)((float)var3 / this.field1675));
			int var10 = (int)Math.ceil((double)((float)var4 / this.field1675));
			this.field1670.method1780(this.field1663 - var9 / 2, this.field1679 - var10 / 2, this.field1663 + var9 / 2, var10 / 2 + this.field1679, var1, var2, var1 + var3, var4 + var2);
			if (!this.field1699) {
				boolean var11 = false;
				if (var5 - this.field1683 > 100) {
					this.field1683 = var5;
					var11 = true;
				}

				this.field1670.method1781(this.field1663 - var9 / 2, this.field1679 - var10 / 2, this.field1663 + var9 / 2, this.field1679 + var10 / 2, var1, var2, var1 + var3, var2 + var4, this.field1707, this.field1684, this.field1686, this.field1682, var11);
			}

			this.method1190(var1, var2, var3, var4, var9, var10);
			if (class358.method1717((byte)-82) && this.field1706 && this.field1705 != null) {
				this.field1698.method1037("Coord: " + this.field1705, class433.field2900 + 10, class433.field2899 + 20, 16776960, -1);
			}

			this.field1666 = var9;
			this.field1678 = var10;
			this.field1709 = var1;
			this.field1680 = var2;
			class433.method1961(var7);
		}
	}

	boolean method1196(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (null == this.field1667) {
			return true;
		} else if (var1 == this.field1667.field207 && var2 == this.field1667.field209) {
			if (this.field1708 != this.field1670.field2617) {
				return true;
			} else if (this.field1697 != Client.field2126) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var3 + var1 < var5 || var2 + var4 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	void method1190(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (null != class76.field535) {
			int var8 = 512 / (this.field1670.field2617 * 2);
			int var9 = var3 + 512;
			int var10 = var4 + 512;
			float var11 = 1.0F;
			var9 = (int)((float)var9 / var11);
			var10 = (int)((float)var10 / var11);
			int var12 = this.method1172() - var5 / 2 - var8;
			int var13 = this.method1166() - var6 / 2 - var8;
			int var14 = var1 - this.field1670.field2617 * (var12 + var8 - this.field1671);
			int var15 = var2 - (var8 - (var13 - this.field1691)) * this.field1670.field2617;
			if (this.method1196(var9, var10, var14, var15, var3, var4)) {
				if (null != this.field1667 && this.field1667.field207 == var9 && var10 == this.field1667.field209) {
					Arrays.fill(this.field1667.field205, 0);
				} else {
					this.field1667 = new class42(var9, var10);
				}

				this.field1671 = this.method1172() - var5 / 2 - var8;
				this.field1691 = this.method1166() - var6 / 2 - var8;
				this.field1708 = this.field1670.field2617;
				class76.field535.method1509(this.field1671, this.field1691, this.field1667, (float)this.field1708 / var11);
				this.field1697 = Client.field2126;
				var14 = var1 - this.field1670.field2617 * (var8 + var12 - this.field1671);
				var15 = var2 - (var8 - (var13 - this.field1691)) * this.field1670.field2617;
			}

			class433.method1965(var1, var2, var3, var4, 0, 128);
			if (var11 == 1.0F) {
				this.field1667.method167(var14, var15, 192);
			} else {
				this.field1667.method177(var14, var15, (int)((float)var9 * var11), (int)((float)var10 * var11), 192);
			}
		}

	}

	public void method1161(int var1, int var2, int var3, int var4) {
		if (this.field1690.method1988()) {
			if (!this.field1670.method1784()) {
				this.field1670.method1779(this.field1701, this.field1668.method1686(), Client.field1835, Client.field1841 >= 217);
				if (!this.field1670.method1784()) {
					return;
				}
			}

			this.field1670.method1789(var1, var2, var3, var4, this.field1684, this.field1686, this.field1682, (byte)65);
		}
	}

	public void method1162(int var1) {
		this.field1676 = this.method1164(var1);
	}

	void method1163(int var1, int var2, int var3, int var4, int var5) {
		boolean var7 = true;
		int var8 = var3 / 2 + var1;
		int var9 = var4 / 2 + var2 - 18 - 20;
		class433.method1977(var1, var2, var3, var4, -16777216);
		class433.method1978(var8 - 152, var9, 304, 34, -65536);
		class433.method1977(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
		this.field1698.method1045(class513.field3790, var8, 20 + var9, -1, -1);
	}

	float method1164(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	public int method1197() {
		if (1.0D == (double)this.field1676) {
			return 25;
		} else if (1.5D == (double)this.field1676) {
			return 37;
		} else if (2.0D == (double)this.field1676) {
			return 50;
		} else if ((double)this.field1676 == 3.0D) {
			return 75;
		} else {
			return 4.0D == (double)this.field1676 ? 100 : 200;
		}
	}

	public void method1165() {
		this.field1690.method1986();
	}

	public boolean method1192() {
		return this.field1690.method1988();
	}

	public class353 method1167(int var1) {
		Iterator var3 = this.field1700.values().iterator();

		class353 var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (class353)var3.next();
		} while(var4.method1684() != var1);

		return var4;
	}

	public void method1168(int var1, int var2) {
		if (this.field1668 != null && this.field1668.method1696(var1, var2)) {
			this.field1673 = var1 - this.field1668.method1690() * 64;
			this.field1674 = var2 - this.field1668.method1691() * 64;
		}
	}

	public void method1169(int var1, int var2) {
		if (null != this.field1668) {
			this.method1149(var1 - this.field1668.method1690() * 64, var2 - this.field1668.method1691() * 64, true);
			this.field1673 = -1;
			this.field1674 = -1;
		}
	}

	public void method1170(int var1, int var2, int var3) {
		if (this.field1668 != null) {
			int[] var5 = this.field1668.method1683(var1, var2, var3);
			if (var5 != null) {
				this.method1168(var5[0], var5[1]);
			}

		}
	}

	public void method1171(int var1, int var2, int var3) {
		if (null != this.field1668) {
			int[] var5 = this.field1668.method1683(var1, var2, var3);
			if (var5 != null) {
				this.method1169(var5[0], var5[1]);
			}

		}
	}

	public int method1172() {
		return null == this.field1668 ? -1 : this.field1663 + this.field1668.method1690() * 64;
	}

	public int method1166() {
		return this.field1668 == null ? -1 : this.field1679 + this.field1668.method1691() * 64;
	}

	public class370 method1173() {
		return this.field1668 == null ? null : this.field1668.method1700(this.method1172(), this.method1166());
	}

	public int method1150() {
		return this.field1666;
	}

	public int method1199() {
		return this.field1678;
	}

	public void method1194(int var1) {
		if (var1 >= 1) {
			this.field1711 = var1;
		}

	}

	public void method1187() {
		this.field1711 = 3;
	}

	public void method1160(int var1) {
		if (var1 >= 1) {
			this.field1682 = var1;
		}

	}

	public void method1188() {
		this.field1682 = 50;
	}

	public void method1175(boolean var1) {
		this.field1689 = var1;
	}

	public void method1176(int var1) {
		this.field1684 = new HashSet();
		this.field1684.add(var1);
		this.field1685 = 0;
		this.field1686 = 0;
	}

	public void method1177(int var1) {
		this.field1684 = new HashSet();
		this.field1685 = 0;
		this.field1686 = 0;

		for (int var3 = 0; var3 < class340.field2387; ++var3) {
			if (class63.method269(var3) != null && class63.method269(var3).field302 == var1) {
				this.field1684.add(class63.method269(var3).field321);
			}
		}

	}

	public void method1178() {
		this.field1684 = null;
	}

	public void method1179(boolean var1) {
		this.field1699 = !var1;
	}

	public void method1198(int var1, boolean var2) {
		if (!var2) {
			this.field1695.add(var1);
		} else {
			this.field1695.remove(var1);
		}

		this.method1189();
	}

	public void method1180(int var1, boolean var2) {
		if (!var2) {
			this.field1696.add(var1);
		} else {
			this.field1696.remove(var1);
		}

		for (int var4 = 0; var4 < class340.field2387; ++var4) {
			if (class63.method269(var4) != null && class63.method269(var4).field302 == var1) {
				int var5 = class63.method269(var4).field321;
				if (!var2) {
					this.field1688.add(var5);
				} else {
					this.field1688.remove(var5);
				}
			}
		}

		this.method1189();
	}

	public boolean method1181() {
		return !this.field1699;
	}

	public boolean method1182(int var1) {
		return !this.field1695.contains(var1);
	}

	public boolean method1183(int var1) {
		return !this.field1696.contains(var1);
	}

	void method1189() {
		this.field1707.clear();
		this.field1707.addAll(this.field1695);
		this.field1707.addAll(this.field1688);
	}

	public void method1151(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.field1690.method1988()) {
			int var8 = (int)Math.ceil((double)((float)var3 / this.field1675));
			int var9 = (int)Math.ceil((double)((float)var4 / this.field1675));
			List var10 = this.field1670.method1782(this.field1663 - var8 / 2 - 1, this.field1679 - var9 / 2 - 1, 1 + var8 / 2 + this.field1663, this.field1679 + var9 / 2 + 1, var1, var2, var3, var4, var5, var6);
			if (!var10.isEmpty()) {
				Iterator var11 = var10.iterator();

				boolean var14;
				do {
					if (!var11.hasNext()) {
						return;
					}

					class283 var12 = (class283)var11.next();
					class63 var13 = class63.method269(var12.method1483());
					var14 = false;

					for (int var15 = this.field1710.length - 1; var15 >= 0; --var15) {
						if (var13.field309[var15] != null) {
							Client.method1359(var13.field309[var15], var13.field310, this.field1710[var15], var12.method1483(), var12.field2149.method1737(), var12.field2150.method1737());
							var14 = true;
						}
					}
				} while(!var14);

			}
		}
	}

	public class370 method1184(int var1, class370 var2) {
		if (!this.field1690.method1988()) {
			return null;
		} else if (!this.field1670.method1784()) {
			return null;
		} else if (!this.field1668.method1696(var2.field2561, var2.field2559)) {
			return null;
		} else {
			HashMap var4 = this.field1670.method1790();
			List var5 = (List)var4.get(var1);
			if (null != var5 && !var5.isEmpty()) {
				class283 var6 = null;
				int var7 = -1;
				Iterator var8 = var5.iterator();

				while (true) {
					class283 var9;
					int var12;
					do {
						if (!var8.hasNext()) {
							return var6.field2150;
						}

						var9 = (class283)var8.next();
						int var10 = var9.field2150.field2561 - var2.field2561;
						int var11 = var9.field2150.field2559 - var2.field2559;
						var12 = var11 * var11 + var10 * var10;
						if (var12 == 0) {
							return var9.field2150;
						}
					} while(var12 >= var7 && null != var6);

					var6 = var9;
					var7 = var12;
				}
			} else {
				return null;
			}
		}
	}

	public void method1185(int var1, int var2, class370 var3, class370 var4) {
		class376 var6 = new class376();
		class102 var7 = new class102(var2, var3, var4);
		var6.method1758(new Object[]{var7});
		switch(var1) {
		case 1008:
			var6.method1761(10);
			break;
		case 1009:
			var6.method1761(11);
			break;
		case 1010:
			var6.method1761(12);
			break;
		case 1011:
			var6.method1761(13);
			break;
		case 1012:
			var6.method1761(14);
		}

		class440.method2027(var6);
	}

	public class283 method1143() {
		if (!this.field1690.method1988()) {
			return null;
		} else if (!this.field1670.method1784()) {
			return null;
		} else {
			HashMap var2 = this.field1670.method1790();
			this.field1702 = new LinkedList();
			Iterator var3 = var2.values().iterator();

			while (var3.hasNext()) {
				List var4 = (List)var3.next();
				this.field1702.addAll(var4);
			}

			this.field1703 = this.field1702.iterator();
			return this.method1200();
		}
	}

	public class283 method1200() {
		if (this.field1703 == null) {
			return null;
		} else {
			class283 var2;
			do {
				if (!this.field1703.hasNext()) {
					return null;
				}

				var2 = (class283)this.field1703.next();
			} while(var2.method1483() == -1);

			return var2;
		}
	}
}
