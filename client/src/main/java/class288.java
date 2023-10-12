public class class288 {
	public static int[] field2173;
	int field2169;
	int field2170;
	int field2171;
	int field2172;

	@Override
	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field2172).length();
		int var3 = 10 - Integer.toString(this.field2171).length();
		int var4 = 10 - Integer.toString(this.field2170).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field2172 + var5 + "Created: " + this.field2170 + var7 + "Total used: " + this.field2171 + var6 + "Max-In-Use: " + this.field2169;
	}
}
