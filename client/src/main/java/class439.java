public class class439 extends class4 {
	public class439(class4 var1) {
		super(var1);
		super.field8 = "SwapSongTask";
	}

	@Override
	public boolean method8() {
		if (class483.field3389.size() > 1 && class483.field3389.get(0) != null && ((class407)class483.field3389.get(0)).field2789.method547() && class483.field3389.get(1) != null && ((class407)class483.field3389.get(1)).field2789.method547()) {
			class407 var2 = (class407)class483.field3389.get(0);
			class483.field3389.set(0, class483.field3389.get(1));
			class483.field3389.set(1, var2);
		}

		return true;
	}
}
