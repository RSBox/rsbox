public abstract class class4 {
	static class198 field13;
	boolean field12;
	boolean field9;
	class4 field11;
	String field10;
	String field8;

	class4(class4 var1) {
		this.field11 = var1;
	}

	public abstract boolean method8();

	public boolean method7() {
		return this.field12;
	}

	public boolean method9() {
		return this.field9;
	}

	public String method10() {
		return "Error in task: " + this.field8 + ", Error message: " + this.field10;
	}

	public class4 method11() {
		return this.field11;
	}

	void method12(String var1) {
		this.field12 = true;
		this.field10 = var1;
	}
}
