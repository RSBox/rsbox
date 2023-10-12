public class MovementType implements class501 {
	public static final MovementType CRAWL;
	public static final MovementType run;
	public static final MovementType WALK;
	public static final MovementType NONE;
	public byte id;

	static {
		NONE = new MovementType((byte)-1);
		CRAWL = new MovementType((byte)0);
		WALK = new MovementType((byte)1);
		run = new MovementType((byte)2);
	}

	MovementType(byte id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return this.id;
	}
}
