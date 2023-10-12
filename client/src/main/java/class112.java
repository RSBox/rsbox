import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class112 implements class154 {
	Map field707;
	final class414 field706;

	public class112(class414 var1) {
		this.field706 = var1;
	}

	@Override
	public int method816(int var1) {
		if (this.field707 != null) {
			class55 var3 = (class55)this.field707.get(var1);
			if (var3 != null) {
				return (Integer)var3.field251;
			}
		}

		return (Integer)this.field706.method1904(var1);
	}

	@Override
	public void method817(int var1, Object var2) {
		if (null == this.field707) {
			this.field707 = new HashMap();
			this.field707.put(var1, new class55(var1, var2));
		} else {
			class55 var4 = (class55)this.field707.get(var1);
			if (var4 == null) {
				this.field707.put(var1, new class55(var1, var2));
			} else {
				var4.field251 = var2;
			}
		}

	}

	@Override
	public Iterator iterator() {
		return null == this.field707 ? Collections.emptyList().iterator() : this.field707.values().iterator();
	}
}
