import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class338
public final class class210 {
	static class458 field1391;
	static final HashMap field1392;

	static {
		field1392 = new HashMap();
		Calendar.getInstance(method985("Europe/London"));
	}

	static TimeZone method985(String var0) {
		synchronized(field1392) {
			TimeZone var3 = (TimeZone)field1392.get(var0);
			if (null == var3) {
				var3 = TimeZone.getTimeZone(var0);
				field1392.put(var0, var3);
			}

			return var3;
		}
	}
}
