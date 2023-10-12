import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class57 {
	class394 field265;
	float[] field267;
	int field264;
	String field266;
	String field272;
	ArrayList field268;
	ArrayList field269;
	ArrayList field270;
	Map field263;
	Map field271;

	public class57() {
		this.field264 = -1;
		this.field272 = null;
		this.field267 = new float[4];
		this.field268 = new ArrayList();
		this.field269 = new ArrayList();
		this.field270 = new ArrayList();
		this.field271 = new HashMap();
		this.field263 = new HashMap();
	}

	public boolean method234(String var1, class138 var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 == null) {
				return false;
			} else {
				this.method242();

				try {
					this.field266 = var1;
					this.field265 = var2.method709(new URL(this.field266));
					this.field264 = 0;
					return true;
				} catch (MalformedURLException var5) {
					this.method242();
					this.field264 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	public void method235(class138 var1) {
		switch(this.field264) {
		case 0:
			this.method252(var1);
			break;
		case 1:
			this.method244();
			break;
		default:
			return;
		}

	}

	public int method249() {
		return this.field264;
	}

	public int method236(String var1) {
		return this.field271.containsKey(var1) ? (Integer)this.field271.get(var1) : -1;
	}

	public String method248(String var1) {
		return (String)((String)(this.field263.containsKey(var1) ? this.field263.get(var1) : null));
	}

	public ArrayList method238() {
		return this.field269;
	}

	public ArrayList method239() {
		return this.field270;
	}

	public String method240() {
		return this.field272;
	}

	public float[] method250() {
		return this.field267;
	}

	public ArrayList method241() {
		return this.field268;
	}

	void method242() {
		this.field265 = null;
		this.field272 = null;
		this.field267[0] = 0.0F;
		this.field267[1] = 0.0F;
		this.field267[2] = 1.0F;
		this.field267[3] = 1.0F;
		this.field268.clear();
		this.field269.clear();
		this.field270.clear();
		this.field271.clear();
		this.field263.clear();
	}

	void method252(class138 var1) {
		if (this.field265 != null && this.field265.method1831()) {
			byte[] var3 = this.field265.method1830();
			if (var3 == null) {
				this.method242();
				this.field264 = 100;
			} else {
				try {
					this.method247(new class374(var3), var1);
				} catch (UnsupportedEncodingException var5) {
					this.method242();
					this.field264 = 102;
					return;
				}

				this.field264 = this.field269.size() > 0 ? 1 : 2;
				this.field265 = null;
			}
		}
	}

	void method244() {
		Iterator var2 = this.field269.iterator();

		class94 var3;
		do {
			if (!var2.hasNext()) {
				var2 = this.field269.iterator();

				while (var2.hasNext()) {
					var3 = (class94)var2.next();
					if (var3.field604 != null) {
						byte[] var4 = var3.field604.method1830();
						if (var4 != null && var4.length > 0) {
							this.field264 = 2;
							return;
						}
					}
				}

				this.method242();
				this.field264 = 101;
				return;
			}

			var3 = (class94)var2.next();
		} while(var3.field604 == null || var3.field604.method1831());

	}

	void method245(JSONArray var1, class138 var2) throws JSONException {
		if (null != var1) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				try {
					JSONObject var5 = var1.getJSONObject(var4);
					class94 var6 = new class94(this);
					var6.field604 = var2.method709(new URL(var5.getString("src")));
					var6.field603 = method253(var5, "placement");
					this.field269.add(var6);
				} catch (MalformedURLException var7) {
				}
			}

		}
	}

	void method243(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				JSONObject var4 = var1.getJSONObject(var3);
				class400 var5 = new class400(this);
				var5.field2752 = var4.getString("text");
				String var8 = var4.getString("align_x");
				byte var7;
				if (var8.equals("centre")) {
					var7 = 1;
				} else if (!var8.equals("bottom") && !var8.equals("right")) {
					var7 = 0;
				} else {
					var7 = 2;
				}

				var5.field2754 = var7;
				String var11 = var4.getString("align_y");
				byte var10;
				if (var11.equals("centre")) {
					var10 = 1;
				} else if (!var11.equals("bottom") && !var11.equals("right")) {
					var10 = 0;
				} else {
					var10 = 2;
				}

				var5.field2755 = var10;
				var5.field2756 = var4.getInt("font");
				var5.field2753 = method253(var4, "placement");
				this.field270.add(var5);
			}

		}
	}

	void method246(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field267 = method253(var1, "clickbounds");
			this.field272 = var1.getString("endpoint");
			String[] var3 = JSONObject.getNames(var1);

			for (int var4 = 0; var4 < var1.length(); ++var4) {
				if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
					try {
						int var5 = var1.getInt(var3[var4]);
						this.field268.add(new class176(this, var3[var4], var5));
					} catch (Exception var8) {
						try {
							String var6 = var1.getString(var3[var4]);
							if (var6.equals("true")) {
								this.field268.add(new class176(this, var3[var4], 1));
							} else if (var6.equals("false")) {
								this.field268.add(new class176(this, var3[var4], 0));
							} else {
								this.field268.add(new class197(this, var3[var4], var6));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	void method237(JSONObject var1) throws JSONException {
		String[] var3 = JSONObject.getNames(var1);

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			try {
				int var5 = var1.getInt(var3[var4]);
				this.field271.put(var3[var4], var5);
			} catch (Exception var8) {
				try {
					String var6 = var1.getString(var3[var4]);
					if (var6.equals("true")) {
						this.field271.put(var3[var4], 1);
					} else if (var6.equals("false")) {
						this.field271.put(var3[var4], 0);
					} else {
						this.field263.put(var3[var4], var6);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	void method247(class374 var1, class138 var2) {
		JSONObject var4;
		try {
			var4 = var1.method1751();
			var4 = var4.getJSONObject("message");
		} catch (Exception var10) {
			this.method242();
			this.field264 = 102;
			return;
		}

		try {
			this.method245(var4.getJSONArray("images"), var2);
		} catch (Exception var9) {
			this.field269.clear();
		}

		try {
			this.method243(var4.getJSONArray("labels"));
		} catch (Exception var8) {
			this.field270.clear();
		}

		try {
			this.method246(var4.getJSONObject("behaviour"));
		} catch (Exception var7) {
			this.field272 = null;
			this.field267[0] = 0.0F;
			this.field267[1] = 0.0F;
			this.field267[2] = 1.0F;
			this.field267[3] = 1.0F;
			this.field268.clear();
		}

		try {
			this.method237(var4.getJSONObject("meta"));
		} catch (Exception var6) {
			this.field271.clear();
			this.field263.clear();
		}

	}

	public boolean method251(String var1, class138 var2) {
		try {
			this.method247(new class374(var1.getBytes()), var2);
			this.field264 = this.field269.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var5) {
			this.field264 = 102;
		}

		return this.field264 < 100;
	}

	static float[] method253(JSONObject var0, String var1) throws JSONException {
		float[] var3 = new float[4];

		try {
			JSONArray var4 = var0.getJSONArray(var1);
			var3[0] = (float)var4.optDouble(0, 0.0D);
			var3[1] = (float)var4.optDouble(1, 0.0D);
			var3[2] = (float)var4.optDouble(2, 1.0D);
			var3[3] = (float)var4.optDouble(3, 1.0D);
		} catch (JSONException var5) {
			var3[0] = 0.0F;
			var3[1] = 0.0F;
			var3[2] = 1.0F;
			var3[3] = 1.0F;
		}

		return var3;
	}
}
