import java.util.List;

public class class166 implements class501 {
	static List field1181;
	static final class166 field1174;
	static final class166 field1175;
	static final class166 field1176;
	static final class166 field1177;
	static final class166 field1178;
	final int field1179;
	final int field1180;

	static {
		field1176 = new class166(0, 0);
		field1175 = new class166(1, 1);
		field1177 = new class166(2, 2);
		field1178 = new class166(3, 3);
		field1174 = new class166(4, 4);
	}

	class166(int var1, int var2) {
		this.field1179 = var1;
		this.field1180 = var2;
	}

	@Override
	public int getId() {
		return this.field1180;
	}

	static class166[] method882() {
		return new class166[]{field1176, field1175, field1177, field1178, field1174};
	}
}
