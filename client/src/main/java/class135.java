import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class class135 {
	boolean field864;
	boolean field866;
	boolean field876;
	class291 field878;
	class291 field879;
	class39 field861;
	class39 field880;
	int field860;
	int field862;
	int field863;
	int field865;
	int field867;
	int field868;
	int field869;
	int field870;
	int field871;
	int field872;
	int field873;
	int field874;
	int field875;
	int field877;

	class135() {
		this.field861 = new class39();
		this.field880 = new class39();
		this.field876 = false;
		this.field864 = true;
		this.field860 = 0;
		this.field866 = false;
		this.field867 = 0;
		this.field871 = 0;
		this.field863 = 0;
		this.field869 = 0;
		this.field870 = 0;
		this.field868 = 0;
		this.field872 = 0;
		this.field873 = Integer.MAX_VALUE;
		this.field874 = Integer.MAX_VALUE;
		this.field875 = 0;
		this.field862 = 0;
		this.field865 = 0;
		this.field877 = 0;
		this.field861.method117(1);
		this.field880.method117(1);
	}

	void method681() {
		this.field860 = (1 + this.field860) % 60;
		if (this.field872 > 0) {
			--this.field872;
		}

	}

	public boolean method622(boolean var1) {
		var1 = var1 && this.field864;
		boolean var3 = var1 != this.field876;
		this.field876 = var1;
		if (!this.field876) {
			this.method629(this.field869, this.field869);
		}

		return var3;
	}

	public void method623(boolean var1) {
		this.field864 = var1;
		this.field876 = var1 && this.field876;
	}

	public boolean method624(String var1) {
		String var3 = this.field861.method113();
		if (!var3.equals(var1)) {
			var1 = this.method695(var1);
			this.field861.method144(var1);
			this.method629(this.field870, this.field869);
			this.method628(this.field865, this.field877);
			this.method675();
			this.method699();
			return true;
		} else {
			return false;
		}
	}

	boolean method625(String var1) {
		this.field880.method144(var1);
		return true;
	}

	boolean method626(class229 var1) {
		boolean var3 = !this.field866;
		this.field861.method116(var1);
		this.field880.method116(var1);
		this.field866 = true;
		var3 |= this.method628(this.field865, this.field877);
		var3 |= this.method629(this.field870, this.field869);
		if (this.method675()) {
			this.method699();
			var3 = true;
		}

		return var3;
	}

	public boolean method690(int var1, int var2) {
		boolean var4 = var1 != this.field875 || var2 != this.field862;
		this.field875 = var1;
		this.field862 = var2;
		var4 |= this.method628(this.field865, this.field877);
		return var4;
	}

	public boolean method636(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var3 = var1 == this.field861.method120();
		this.field861.method142(var1);
		this.field880.method142(var1);
		if (this.method675()) {
			this.method699();
			var3 = true;
		}

		return var3;
	}

	public boolean method627(int var1) {
		this.field861.method114(var1);
		if (this.method675()) {
			this.method699();
			return true;
		} else {
			return false;
		}
	}

	public boolean method683(int var1) {
		this.field874 = var1;
		if (this.method675()) {
			this.method699();
			return true;
		} else {
			return false;
		}
	}

	public boolean method628(int var1, int var2) {
		if (!this.method664()) {
			this.field865 = var1;
			this.field877 = var2;
			return false;
		} else {
			int var4 = this.field865;
			int var5 = this.field877;
			int var6 = Math.max(0, this.field861.method129() - this.field875 + 2);
			int var7 = Math.max(0, this.field861.method130() - this.field862 + 1);
			this.field865 = Math.max(0, Math.min(var6, var1));
			this.field877 = Math.max(0, Math.min(var7, var2));
			return var4 != this.field865 || var5 != this.field877;
		}
	}

	public boolean method694(int var1, int var2) {
		boolean var4 = true;
		if (var1 < 0 || var1 > 2) {
			var4 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var4 = false;
		}

		return var4 ? this.field861.method118(var1, var2) : false;
	}

	public void method630(int var1) {
		this.field861.method119(var1);
	}

	public void method631(int var1) {
		this.field867 = var1;
	}

	public void method632(int var1) {
		this.field861.method117(var1);
	}

	public void method633(int var1) {
		this.field861.method115(var1);
	}

	public boolean method634(int var1) {
		this.field863 = var1;
		String var3 = this.field861.method113();
		int var4 = var3.length();
		var3 = this.method695(var3);
		if (var3.length() != var4) {
			this.field861.method144(var3);
			this.method628(this.field865, this.field877);
			this.method675();
			this.method699();
			return true;
		} else {
			return false;
		}
	}

	public void method688() {
		this.field866 = false;
	}

	public boolean method643(int var1) {
		if (this.method680(var1)) {
			this.method638();
			class555 var3 = this.field861.method147((char)var1, this.field869, this.field873);
			this.method629(var3.method2640(), var3.method2640());
			this.method675();
			this.method699();
		}

		return true;
	}

	public void method637() {
		if (!this.method638() && this.field869 > 0) {
			int var2 = this.field861.method125(this.field869 - 1);
			this.method699();
			this.method629(var2, var2);
		}

	}

	public void method689() {
		if (!this.method638() && this.field869 < this.field861.method112()) {
			int var2 = this.field861.method125(this.field869);
			this.method699();
			this.method629(var2, var2);
		}

	}

	public void method686() {
		if (!this.method638() && this.field869 > 0) {
			class203 var2 = this.method673(this.field869 - 1);
			int var3 = this.field861.method126((Integer)var2.field1361, this.field869);
			this.method699();
			this.method629(var3, var3);
		}

	}

	public void method697() {
		if (!this.method638() && this.field869 < this.field861.method112()) {
			class203 var2 = this.method673(this.field869);
			int var3 = this.field861.method126(this.field869, (Integer)var2.field1362);
			this.method699();
			this.method629(var3, var3);
		}

	}

	boolean method638() {
		if (!this.method698()) {
			return false;
		} else {
			int var2 = this.field861.method126(this.field870, this.field869);
			this.method699();
			this.method629(var2, var2);
			return true;
		}
	}

	public void method639() {
		this.method629(0, this.field861.method112());
	}

	public boolean method629(int var1, int var2) {
		if (!this.method664()) {
			this.field870 = var1;
			this.field869 = var2;
			return false;
		} else {
			if (var1 > this.field861.method112()) {
				var1 = this.field861.method112();
			}

			if (var2 > this.field861.method112()) {
				var2 = this.field861.method112();
			}

			boolean var4 = var1 != this.field870 || this.field869 != var2;
			this.field870 = var1;
			if (this.field869 != var2) {
				this.field869 = var2;
				this.field860 = 0;
				this.method678();
			}

			if (var4 && null != this.field879) {
				this.field879.method1516();
			}

			return var4;
		}
	}

	public void method687(boolean var1) {
		class203 var3 = this.method674(this.field869);
		this.method676((Integer)var3.field1361, var1);
	}

	public void method640(boolean var1) {
		class203 var3 = this.method674(this.field869);
		this.method676((Integer)var3.field1362, var1);
	}

	public void method641(boolean var1) {
		this.method676(0, var1);
	}

	public void method642(boolean var1) {
		this.method676(this.field861.method112(), var1);
	}

	public void method684(boolean var1) {
		if (this.method698() && !var1) {
			this.method676(Math.min(this.field870, this.field869), var1);
		} else if (this.field869 > 0) {
			this.method676(this.field869 - 1, var1);
		}

	}

	public void method644(boolean var1) {
		if (this.method698() && !var1) {
			this.method676(Math.max(this.field870, this.field869), var1);
		} else if (this.field869 < this.field861.method112()) {
			this.method676(this.field869 + 1, var1);
		}

	}

	public void method645(boolean var1) {
		if (this.field869 > 0) {
			class203 var3 = this.method673(this.field869 - 1);
			this.method676((Integer)var3.field1361, var1);
		}

	}

	public void method646(boolean var1) {
		if (this.field869 < this.field861.method112()) {
			class203 var3 = this.method673(1 + this.field869);
			this.method676((Integer)var3.field1362, var1);
		}

	}

	public void method647(boolean var1) {
		if (this.field869 > 0) {
			this.method676(this.field861.method128(this.field869, -1), var1);
		}

	}

	public void method648(boolean var1) {
		if (this.field869 < this.field861.method112()) {
			this.method676(this.field861.method128(this.field869, 1), var1);
		}

	}

	public void method649(boolean var1) {
		if (this.field869 > 0) {
			int var3 = this.method677();
			this.method676(this.field861.method128(this.field869, -var3), var1);
		}

	}

	public void method650(boolean var1) {
		if (this.field869 < this.field861.method112()) {
			int var3 = this.method677();
			this.method676(this.field861.method128(this.field869, var3), var1);
		}

	}

	public void method651(boolean var1) {
		class508 var3 = this.field861.method143(0, this.field869);
		class203 var4 = var3.method2393();
		this.method676(this.field861.method127((Integer)var4.field1361, this.field877), var1);
	}

	public void method652(boolean var1) {
		class508 var3 = this.field861.method143(0, this.field869);
		class203 var4 = var3.method2393();
		this.method676(this.field861.method127((Integer)var4.field1361, this.field862 + this.field877), var1);
	}

	public void method653(int var1, int var2, boolean var3, boolean var4) {
		boolean var6 = false;
		class203 var7;
		int var9;
		if (!this.field866) {
			var9 = 0;
		} else {
			var1 += this.field865;
			var2 += this.field877;
			var7 = this.method700();
			var9 = this.field861.method127(var1 - (Integer)var7.field1361, var2 - (Integer)var7.field1362);
		}

		if (var3 && var4) {
			this.field871 = 1;
			var7 = this.method673(var9);
			class203 var8 = this.method673(this.field868);
			this.method621(var8, var7);
		} else if (var3) {
			this.field871 = 1;
			var7 = this.method673(var9);
			this.method629((Integer)var7.field1361, (Integer)var7.field1362);
			this.field868 = (Integer)var7.field1361;
		} else if (var4) {
			this.method629(this.field868, var9);
		} else {
			if (this.field872 > 0 && var9 == this.field868) {
				if (this.field869 == this.field870) {
					this.field871 = 1;
					var7 = this.method673(var9);
					this.method629((Integer)var7.field1361, (Integer)var7.field1362);
				} else {
					this.field871 = 2;
					var7 = this.method674(var9);
					this.method629((Integer)var7.field1361, (Integer)var7.field1362);
				}
			} else {
				this.field871 = 0;
				this.method629(var9, var9);
				this.field868 = var9;
			}

			this.field872 = 25;
		}

	}

	public void method696(int var1, int var2) {
		if (this.field866 && this.method659()) {
			var1 += this.field865;
			var2 += this.field877;
			class203 var4 = this.method700();
			int var5 = this.field861.method127(var1 - (Integer)var4.field1361, var2 - (Integer)var4.field1362);
			class203 var6;
			class203 var7;
			switch(this.field871) {
			case 0:
				this.method629(this.field870, var5);
				break;
			case 1:
				var6 = this.method673(this.field868);
				var7 = this.method673(var5);
				this.method621(var6, var7);
				break;
			case 2:
				var6 = this.method674(this.field868);
				var7 = this.method674(var5);
				this.method621(var6, var7);
			}
		}

	}

	public void method654(Clipboard var1) {
		class508 var3 = this.field861.method143(this.field870, this.field869);
		if (!var3.method2391()) {
			String var4 = var3.method2395();
			if (!var4.isEmpty()) {
				var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
			}
		}

	}

	public void method685(Clipboard var1) {
		if (this.method698()) {
			this.method654(var1);
			this.method638();
		}

	}

	public void method691(Clipboard var1) {
		Transferable var3 = var1.getContents((Object)null);
		if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var4 = this.method695((String)var3.getTransferData(DataFlavor.stringFlavor));
				this.method638();
				class555 var5 = this.field861.method122(var4, this.field869, this.field873);
				this.method629(var5.method2640(), var5.method2640());
				this.method675();
				this.method699();
			} catch (Exception var6) {
			}
		}

	}

	public void method682() {
		this.field877 = Math.max(0, this.field877 - this.field861.method131());
	}

	public void method635() {
		int var2 = Math.max(0, this.field861.method130() - this.field862);
		this.field877 = Math.min(var2, this.field877 + this.field861.method131());
	}

	public void method656(class291 var1) {
		this.field878 = var1;
	}

	public void method655(class291 var1) {
		this.field879 = var1;
	}

	public class39 method693() {
		return this.field861;
	}

	public class39 method657() {
		return this.field880;
	}

	public class508 method658() {
		return this.field861.method143(this.field870, this.field869);
	}

	public boolean method659() {
		return this.field876;
	}

	public boolean method660() {
		return this.field864;
	}

	public boolean method661() {
		return this.method659() && this.field860 % 60 < 30;
	}

	public int method662() {
		return this.field869;
	}

	public int method663() {
		return this.field870;
	}

	public boolean method664() {
		return this.field866;
	}

	public int method665() {
		return this.field865;
	}

	public int method666() {
		return this.field877;
	}

	public int method692() {
		return this.field861.method120();
	}

	public int method667() {
		return this.field861.method141();
	}

	public int method668() {
		return this.field874;
	}

	public int method620() {
		return this.field867;
	}

	public int method669() {
		return this.field861.method133();
	}

	public int method670() {
		return this.field863;
	}

	public int method672() {
		return this.field861.method134();
	}

	public boolean method671() {
		return this.method667() > 1;
	}

	boolean method698() {
		return this.field869 != this.field870;
	}

	String method695(String var1) {
		StringBuilder var3 = new StringBuilder(var1.length());

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			char var5 = var1.charAt(var4);
			if (this.method680(var5)) {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

	void method621(class203 var1, class203 var2) {
		if ((Integer)var2.field1361 < (Integer)var1.field1361) {
			this.method629((Integer)var1.field1362, (Integer)var2.field1361);
		} else {
			this.method629((Integer)var1.field1361, (Integer)var2.field1362);
		}

	}

	class203 method673(int var1) {
		int var3 = this.field861.method112();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.method679(this.field861.method109(var6 - 1).field657)) {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.method679(this.field861.method109(var6).field657)) {
				var5 = var6;
				break;
			}
		}

		return new class203(var4, var5);
	}

	class203 method674(int var1) {
		int var3 = this.field861.method112();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.field861.method109(var6 - 1).field657 == '\n') {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.field861.method109(var6).field657 == '\n') {
				var5 = var6;
				break;
			}
		}

		return new class203(var4, var5);
	}

	boolean method675() {
		if (!this.method664()) {
			return false;
		} else {
			boolean var2 = false;
			if (this.field861.method112() > this.field874) {
				this.field861.method126(this.field874, this.field861.method112());
				var2 = true;
			}

			int var3 = this.method667();
			int var4;
			if (this.field861.method132() > var3) {
				var4 = this.field861.method128(0, var3) - 1;
				this.field861.method126(var4, this.field861.method112());
				var2 = true;
			}

			if (var2) {
				var4 = this.field869;
				int var5 = this.field870;
				int var6 = this.field861.method112();
				if (this.field869 > var6) {
					var4 = var6;
				}

				if (this.field870 > var6) {
					var5 = var6;
				}

				this.method629(var5, var4);
			}

			return var2;
		}
	}

	void method676(int var1, boolean var2) {
		if (var2) {
			this.method629(this.field870, var1);
		} else {
			this.method629(var1, var1);
		}

	}

	int method677() {
		return this.field862 / this.field861.method131();
	}

	void method678() {
		class508 var2 = this.field861.method143(0, this.field869);
		class203 var3 = var2.method2393();
		int var4 = this.field861.method131();
		int var5 = (Integer)var3.field1361 - 10;
		int var6 = var5 + 20;
		int var7 = (Integer)var3.field1362 - 3;
		int var8 = var7 + 6 + var4;
		int var9 = this.field865;
		int var10 = this.field875 + var9;
		int var11 = this.field877;
		int var12 = this.field862 + var11;
		int var13 = this.field865;
		int var14 = this.field877;
		if (var5 < var9) {
			var13 = var5;
		} else if (var6 > var10) {
			var13 = var6 - this.field875;
		}

		if (var7 < var11) {
			var14 = var7;
		} else if (var8 > var12) {
			var14 = var8 - this.field862;
		}

		this.method628(var13, var14);
	}

	boolean method679(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	void method699() {
		if (null != this.field878) {
			this.field878.method1516();
		}

	}

	boolean method680(int var1) {
		switch(this.field863) {
		case 1:
			return class385.method1808((char)var1);
		case 2:
			return class385.method1815((char)var1);
		case 3:
			return class385.method1820((char)var1);
		case 4:
			char var3 = (char)var1;
			if (class385.method1820(var3)) {
				return true;
			} else {
				if (var3 != 'k' && var3 != 'K' && var3 != 'm' && var3 != 'M' && var3 != 'b' && var3 != 'B') {
					return false;
				}

				return true;
			}
		default:
			return true;
		}
	}

	class203 method700() {
		int var2 = this.field861.method135(this.field875);
		int var3 = this.field861.method148(this.field862);
		return new class203(var2, var3);
	}
}
