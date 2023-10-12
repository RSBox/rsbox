import java.util.ArrayList;

public class class390 extends class4 {
	ArrayList field2662;

	public class390(class4 var1, ArrayList var2) {
		super(var1);
		this.field2662 = var2;
		super.field8 = "ConcurrentMidiTask";
	}

	@Override
	public boolean method8() {
		for (int var2 = 0; var2 < this.field2662.size(); ++var2) {
			class4 var3 = (class4)this.field2662.get(var2);
			if (null == var3) {
				this.field2662.remove(var2);
				--var2;
			} else if (var3.method8()) {
				if (var3.method7()) {
					this.method12(var3.method10());
					this.field2662.clear();
					return true;
				}

				if (var3.method11() != null) {
					this.field2662.add(var3.method11());
				}

				super.field9 = var3.field9;
				this.field2662.remove(var2);
				--var2;
			}
		}

		if (this.field2662.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
