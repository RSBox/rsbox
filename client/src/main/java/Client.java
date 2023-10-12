import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class Client extends class535 implements class48, OAuthApi, class424 {
	public static boolean field1835;
	public static class496 field2014;
	public static int field1832;
	public static int field1841;
	public static int field1861;
	public static int field2087;
	public static int field2126;
	public static final class540 field1891;
	static boolean field1845;
	static boolean field1850;
	static boolean field1851;
	static boolean field1862;
	static boolean field1863;
	static boolean field1885;
	static boolean field1895;
	static boolean field1928;
	static boolean field1931;
	static boolean field1933;
	static boolean field1954;
	static boolean field1960;
	static boolean field1961;
	static boolean field1978;
	static boolean field1988;
	static boolean field1996;
	static boolean field1997;
	static boolean field1998;
	static boolean field2012;
	static boolean field2025;
	static boolean field2027;
	static boolean field2036;
	static boolean field2038;
	static boolean isInstance;
	static boolean field2057;
	static boolean field2059;
	static boolean field2080;
	static boolean field2083;
	static boolean field2086;
	static boolean field2091;
	static boolean field2092;
	static boolean field2093;
	static boolean field2125;
	static boolean[] field1967;
	static boolean[] field1987;
	static boolean[] field1990;
	static boolean[] field2047;
	static boolean[] field2051;
	static boolean[] field2098;
	static byte[] field2132;
	static class110 field1871;
	static class151[] field1906;
	static class157 field2122;
	static class169 field2097;
	static class171 field2116;
	static class185 field2094;
	static class34 field2049;
	static class344 field1890;
	static class352 field2002;
	static class352 field2123;
	static class354 field1886;
	static class357[] field2089;
	static class368 field2068;
	static class372 field1899;
	static class375 interfaceComponents;
	static class375 field2048;
	static class378[] field2017;
	static class381 field2067;
	static class398[] field2074;
	static class42[] field2079;
	static Player[] field2037;
	static class480[] field2026;
	static class491 field2007;
	static class491 field2115;
	static class496 field1860;
	static class496 field1936;
	static class496 field2015;
	static class496 field2018;
	static class511[] field1919;
	static class544 field1872;
	static class69 field1848;
	static class69 field1856;
	static class69 field1971;
	static class69 field1972;
	static class69 field1973;
	static class69 field2019;
	static class69 field2046;
	static class69[][][] field2000;
	static class77 field1994;
	static class84 field2095;
	static class84 field2096;
	static int field1831;
	static int field1833;
	static int field1836;
	static int field1837;
	static int field1838;
	static int field1839;
	static int field1840;
	static int field1842;
	static int field1843;
	static int field1844;
	static int field1846;
	static int field1849;
	static int field1853;
	static int field1854;
	static int field1855;
	static int field1857;
	static int field1858;
	static int field1859;
	static int field1864;
	static int field1865;
	static int field1866;
	static int field1867;
	static int field1868;
	static int field1869;
	static int field1870;
	static int field1874;
	static int field1892;
	static int field1894;
	static int field1896;
	static int field1897;
	static int field1898;
	static int field1900;
	static int field1901;
	static int field1902;
	static int field1903;
	static int field1904;
	static int field1905;
	static int field1910;
	static int field1911;
	static int field1912;
	static int field1914;
	static int field1915;
	static int field1916;
	static int field1917;
	static int field1918;
	static int field1921;
	static int field1922;
	static int field1923;
	static int field1924;
	static int field1925;
	static int field1926;
	static int field1927;
	static int field1929;
	static int field1930;
	static int field1932;
	static int field1934;
	static int field1935;
	static int field1942;
	static int field1944;
	static int field1947;
	static int field1948;
	static int field1951;
	static int field1952;
	static int field1953;
	static int field1955;
	static int field1957;
	static int field1958;
	static int field1959;
	static int field1962;
	static int field1963;
	static int field1965;
	static int field1966;
	static int field1969;
	static int field1977;
	static int field1979;
	static int field1980;
	static int field1991;
	static int field1992;
	static int field1995;
	static int field1999;
	static int field2004;
	static int field2005;
	static int field2006;
	static int field2008;
	static int field2009;
	static int field2011;
	static int field2016;
	static int field2022;
	static int field2023;
	static int field2024;
	static int field2029;
	static int field2031;
	static int field2033;
	static int field2034;
	static int field2035;
	static int field2039;
	static int field2040;
	static int field2041;
	static int field2042;
	static int loginState;
	static int field2044;
	static int field2050;
	static int field2056;
	static int field2060;
	static int field2062;
	static int field2066;
	static int field2069;
	static int field2073;
	static int field2075;
	static int field2081;
	static int field2082;
	static int field2100;
	static int field2102;
	static int rootInterface;
	static int field2109;
	static int field2111;
	static int field2112;
	static int field2113;
	static int field2114;
	static int field2117;
	static int field2118;
	static int field2119;
	static int field2120;
	static int field2121;
	static int field2130;
	static int field2131;
	static int field2134;
	static int field2135;
	static int[] field1834;
	static int[] field1847;
	static int[] field1877;
	static int[] field1887;
	static int[] field1893;
	static int[] field1913;
	static int[] field1937;
	static int[] field1938;
	static int[] field1939;
	static int[] field1940;
	static int[] field1941;
	static int[] field1950;
	static int[] field1964;
	static int[] field1968;
	static int[] field1970;
	static int[] field1974;
	static int[] field1976;
	static int[] field1981;
	static int[] field1982;
	static int[] field1983;
	static int[] field1984;
	static int[] field1989;
	static int[] field1993;
	static int[] field2020;
	static int[] field2028;
	static int[] field2030;
	static int[] field2032;
	static int[] field2045;
	static int[] field2054;
	static int[] field2055;
	static int[] field2061;
	static int[] field2070;
	static int[] field2071;
	static int[] field2077;
	static int[] field2078;
	static int[] field2085;
	static int[] field2088;
	static int[] field2099;
	static int[] field2101;
	static int[] field2124;
	static int[] field2133;
	static int[] field2136;
	static int[][] field1943;
	static int[][] field1946;
	static int[][][] field1908;
	static String field2001;
	static String field2063;
	static String field2064;
	static String field2084;
	static String[] field1945;
	static String[] field1985;
	static String[] field1986;
	static String[] field2090;
	static ArrayList field2129;
	static HashMap field1949;
	static List field2127;
	static long field1852;
	static long field1882;
	static long field2013;
	static long field2021;
	static long field2072;
	static long[] field2065;
	static short field1907;
	static short field1975;
	static short field2103;
	static short field2104;
	static short field2105;
	static short field2106;
	static short field2107;
	static short field2110;
	static final class266 field1956;
	static final class447 field2128;
	static final int[] field1909;
	static final int[] field2058;
	static final String field1883;
	static final String field1884;
	boolean field1878;
	class152 field1888;
	class3 field1875;
	class3 field1880;
	class434 field2010;
	Buffer field2076;
	OtlTokenRequester field1876;
	RefreshAccessTokenRequester field1881;
	int field1879;
	String field1873;
	Future field1920;
	Future field2052;
	long field1889;

	static {
		field1850 = true;
		field1832 = 1;
		field1833 = 0;
		field1842 = 0;
		field1835 = false;
		field2059 = false;
		field2029 = -1;
		field1838 = -1;
		field1839 = -1;
		field2086 = false;
		field1841 = 217;
		field1843 = 0;
		field1928 = false;
		field1845 = true;
		field1846 = 0;
		field1882 = -1L;
		field1965 = -1;
		field1910 = -1;
		field2021 = -1L;
		field1851 = true;
		field1952 = 0;
		field1853 = 0;
		field1854 = 0;
		field1855 = 0;
		field1896 = 0;
		field1857 = 0;
		field1858 = 0;
		field1942 = 0;
		field2109 = 0;
		field2007 = class491.field3495;
		field2115 = class491.field3495;
		field1862 = false;
		field1890 = class344.field2415;
		field1864 = 0;
		field1865 = 0;
		field1866 = 0;
		loginState = 0;
		field1868 = 0;
		field2044 = 0;
		field1870 = 0;
		field1871 = class110.field699;
		field1872 = class544.field4241;
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		field1883 = class278.method1472(var2);
		field1884 = class278.method1472(class144.method786("com_jagex_auth_desktop_runelite:public"));
		field1885 = false;
		field1886 = new class354();
		field2132 = null;
		field2017 = new class378[65536];
		field1980 = 0;
		field1893 = new int[65536];
		field1894 = 0;
		field1847 = new int[250];
		field1891 = new class540();
		field1897 = 0;
		field2036 = false;
		field1899 = new class372();
		field1949 = new HashMap();
		field1901 = 0;
		field1902 = 1;
		field1903 = 0;
		field1904 = 1;
		field1859 = 0;
		field1906 = new class151[4];
		isInstance = false;
		field1908 = new int[4][13][13];
		field1909 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field2022 = 0;
		field1911 = 2301979;
		field2113 = 5063219;
		field1869 = 3353893;
		field1914 = 7759444;
		field1895 = false;
		field1916 = 0;
		field1917 = 128;
		field1962 = 0;
		field1991 = 0;
		field1995 = 0;
		field1921 = 0;
		field1922 = 0;
		field1923 = 0;
		field1924 = 50;
		field1925 = 0;
		field1926 = 0;
		field1927 = 0;
		field2121 = 12;
		field1929 = 6;
		field1861 = 0;
		field1931 = false;
		field1932 = 0;
		field1863 = false;
		field1934 = 0;
		field1930 = 0;
		field2119 = 50;
		field1937 = new int[field2119];
		field1938 = new int[field2119];
		field1939 = new int[field2119];
		field1940 = new int[field2119];
		field1941 = new int[field2119];
		field2136 = new int[field2119];
		field1943 = new int[field2119][];
		field2045 = new int[field2119];
		field1945 = new String[field2119];
		field1946 = new int[104][104];
		field1947 = 0;
		field1948 = -1;
		field1966 = -1;
		field1849 = 0;
		field1951 = 0;
		field2073 = 0;
		field1953 = 0;
		field1954 = true;
		field2102 = 0;
		field2125 = true;
		field2037 = new Player[2048];
		field1958 = -1;
		field1959 = 0;
		field1852 = -1L;
		field1961 = true;
		field2134 = 0;
		field1963 = 0;
		field1964 = new int[1000];
		field2058 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		field2090 = new String[8];
		field1967 = new boolean[8];
		field1968 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		field1969 = -1;
		field2000 = new class69[4][104][104];
		field1971 = new class69();
		field1972 = new class69();
		field1973 = new class69();
		field1877 = new int[25];
		field1970 = new int[25];
		field1976 = new int[25];
		field2057 = false;
		field1978 = false;
		field1979 = 0;
		field2070 = new int[500];
		field1981 = new int[500];
		field1982 = new int[500];
		field1983 = new int[500];
		field1984 = new int[500];
		field1985 = new String[500];
		field1986 = new String[500];
		field1987 = new boolean[500];
		field1988 = false;
		field1933 = false;
		field2027 = true;
		field1935 = -1;
		field1992 = -1;
		field2100 = 0;
		field1844 = 50;
		field1892 = 0;
		field2084 = null;
		field1997 = false;
		field1898 = -1;
		field1999 = -1;
		field2063 = null;
		field2001 = null;
		rootInterface = -1;
		interfaceComponents = new class375(8);
		field2004 = 0;
		field2005 = -1;
		field2006 = 0;
		field1936 = null;
		field2008 = 0;
		field2009 = 0;
		field2087 = 0;
		field2011 = -1;
		field2012 = false;
		field1860 = null;
		field2014 = null;
		field2015 = null;
		field2016 = 0;
		field1837 = 0;
		field2018 = null;
		field1960 = false;
		field2062 = -1;
		field2060 = -1;
		field1998 = false;
		field1867 = -1;
		field2024 = -1;
		field2025 = false;
		field1977 = 1;
		field2028 = new int[32];
		field1944 = 0;
		field1989 = new int[32];
		field1915 = 0;
		field2030 = new int[32];
		field1918 = 0;
		field2032 = new int[32];
		field2033 = 0;
		field2034 = 0;
		field2035 = 0;
		field2023 = 0;
		field1955 = 0;
		field1831 = 0;
		field2039 = 0;
		field2056 = 0;
		field2041 = 0;
		field2042 = 0;
		field2097 = new class169();
		field2019 = new class69();
		field1856 = new class69();
		field2046 = new class69();
		field1848 = new class69();
		field2048 = new class375(512);
		field1874 = 0;
		field2050 = -2;
		field2051 = new boolean[100];
		field2047 = new boolean[100];
		field1990 = new boolean[100];
		field2054 = new int[100];
		field2055 = new int[100];
		field1834 = new int[100];
		field2085 = new int[100];
		field2031 = 0;
		field2013 = 0L;
		field1996 = true;
		field2061 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		field2040 = 0;
		field2120 = 0;
		field2064 = "";
		field2065 = new long[100];
		field2066 = 0;
		field2067 = new class381();
		field2068 = new class368();
		field2069 = 0;
		field1974 = new int[128];
		field2071 = new int[128];
		field2072 = -1L;
		field1919 = new class511[4];
		field2074 = new class398[4];
		field2075 = -1;
		field1912 = 0;
		field2077 = new int[1000];
		field2078 = new int[1000];
		field2079 = new class42[1000];
		field1840 = 0;
		field2081 = 0;
		field2082 = 0;
		field2083 = false;
		field1957 = 0;
		field2124 = new int[50];
		field1887 = new int[50];
		field1913 = new int[50];
		field2088 = new int[50];
		field2089 = new class357[50];
		field2080 = false;
		field2091 = false;
		field2092 = false;
		field2093 = false;
		field2094 = null;
		field2095 = null;
		field2096 = null;
		field2038 = false;
		field2098 = new boolean[5];
		field2099 = new int[5];
		field1993 = new int[5];
		field2101 = new int[5];
		field2020 = new int[5];
		field2103 = 256;
		field2104 = 205;
		field2105 = 256;
		field2106 = 320;
		field2107 = 1;
		field1975 = 32767;
		field1907 = 1;
		field2110 = 32767;
		field2111 = 0;
		field2112 = 0;
		field1836 = 0;
		field2114 = 0;
		field1905 = 0;
		field2116 = new class171();
		field2117 = -1;
		field2118 = -1;
		field2049 = new class29();
		field2026 = new class480[8];
		field1994 = new class77();
		field2122 = new class157(8, class481.field3379);
		field2123 = new class352(64);
		field2002 = new class352(64);
		field1900 = -1;
		field2126 = -1;
		field2127 = new ArrayList();
		field2128 = new class447();
		field2129 = new ArrayList(10);
		field2130 = 0;
		field2131 = 0;
		field1956 = new class266();
		field2133 = new int[50];
		field1950 = new int[50];
	}

	public Client() {
		this.field1878 = false;
		this.field1879 = 0;
		this.field1889 = -1L;
	}

	@Override
	protected final void method2579() {
	}

	@Override
	public final void init() {
		if (this.method2580()) {
			for (int var1 = 0; var1 <= 28; ++var1) {
				String var2 = this.getParameter(Integer.toString(var1));
				if (var2 != null) {
					switch(var1) {
					case 3:
						if (var2.equalsIgnoreCase(class274.field1819)) {
							field1835 = true;
						} else {
							field1835 = false;
						}
						break;
					case 4:
						if (field1838 == -1) {
							field1838 = Integer.parseInt(var2);
						}
						break;
					case 5:
						field1833 = Integer.parseInt(var2);
						break;
					case 6:
						class13.field75 = class66.method302(Integer.parseInt(var2));
						break;
					case 7:
						class323.field2341 = class143.method785(Integer.parseInt(var2));
						break;
					case 8:
						if (var2.equalsIgnoreCase(class274.field1819)) {
						}
						break;
					case 9:
						class161.field1165 = var2;
						break;
					case 10:
						class138.field900 = (class456)class26.method87(class456.method2131(), Integer.parseInt(var2));
						if (class138.field900 == class456.field3024) {
							class474.field3325 = class126.field822;
						} else {
							class474.field3325 = class126.field825;
						}
						break;
					case 11:
						class28.field144 = var2;
						break;
					case 12:
						field1832 = Integer.parseInt(var2);
					case 13:
					case 16:
					case 18:
					case 19:
					case 20:
					case 23:
					case 24:
					default:
						break;
					case 14:
						class366.field2540 = Integer.parseInt(var2);
						break;
					case 15:
						field1842 = Integer.parseInt(var2);
						break;
					case 17:
						class28.field142 = var2;
						break;
					case 21:
						field2029 = Integer.parseInt(var2);
						break;
					case 22:
						class65.field406 = var2;
						break;
					case 25:
						int var3 = var2.indexOf(".");
						if (var3 == -1) {
							field1841 = Integer.parseInt(var2);
						} else {
							field1841 = Integer.parseInt(var2.substring(0, var3));
							Integer.parseInt(var2.substring(var3 + 1));
						}
					}
				}
			}

			method1446();
			class316.field2317 = this.getCodeBase().getHost();
			class28.field143 = new class140();
			String var5 = class323.field2341.field998;
			byte var6 = 0;
			if ((field1833 & class550.field4289.getId()) != 0) {
				class233.field1535 = "beta";
			}

			try {
				class258.method1228("oldschool", class233.field1535, var5, var6, 23);
			} catch (Exception var4) {
				class2.method1((String)null, var4);
			}

			class190.field1287 = this;
			class371.field2562 = field1838;
			method1397();
			if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
				this.field1878 = true;
			}

			if (field1839 == -1) {
				if (!this.method1301() && !this.method1273()) {
					field1839 = 0;
				} else {
					field1839 = 5;
				}
			}

			this.method2566(765, 503, 217, 1);
		}
	}

	@Override
	protected void finalize() throws Throwable {
		class483.field3390.remove(this);
		super.finalize();
	}

	boolean method1272() {
		return this.field1879 == 1;
	}

	@Override
	public void setClient(int var1) {
		this.field1879 = var1;
	}

	@Override
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field1876 = var1;
			class410.method1883(10);
		}
	}

	@Override
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (null != var1) {
			this.field1881 = var1;
		}
	}

	@Override
	public boolean isOnLoginScreen() {
		return field1843 == 10;
	}

	@Override
	public long getAccountHash() {
		return this.field1889;
	}

	boolean method1301() {
		return null != class177.field1228 && !class177.field1228.trim().isEmpty() && null != class393.field2670 && !class393.field2670.trim().isEmpty();
	}

	boolean method1273() {
		return null != class71.field456 && !class71.field456.trim().isEmpty() && class207.field1379 != null && !class207.field1379.trim().isEmpty();
	}

	boolean method1274() {
		return this.field1876 != null;
	}

	void method1275(String var1) throws IOException {
		HashMap var3 = new HashMap();
		var3.put("grant_type", "refresh_token");
		var3.put("scope", "gamesso.token.create");
		var3.put("refresh_token", var1);
		URL var4 = new URL(class28.field144 + "shield/oauth/token" + (new class468(var3)).method2174());
		class520 var5 = new class520();
		if (this.method1272()) {
			var5.method2439(field1884);
		} else {
			var5.method2439(field1883);
		}

		var5.method2448("Host", (new URL(class28.field144)).getHost());
		var5.method2442(class125.field818);
		class548 var6 = class548.field4265;
		RefreshAccessTokenRequester var7 = this.field1881;
		if (var7 != null) {
			this.field1920 = var7.request(var6.method2629(), var4, var5.method2449(), "");
		} else {
			class141 var8 = new class141(var4, var6, var5, this.field1878);
			this.field1880 = this.field2010.method1981(var8);
		}
	}

	void method1276(String var1) throws IOException {
		URL var3 = new URL(class28.field144 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class520 var4 = new class520();
		var4.method2446(var1);
		class548 var5 = class548.field4259;
		OtlTokenRequester var6 = this.field1876;
		if (null != var6) {
			this.field2052 = var6.request(var5.method2629(), var3, var4.method2449(), "");
		} else {
			class141 var7 = new class141(var3, var5, var4, this.field1878);
			this.field1875 = this.field2010.method1981(var7);
		}
	}

	void method1277(String var1, String var2) throws IOException, JSONException {
		URL var4 = new URL(class65.field406 + "game-session/v1/tokens");
		class141 var5 = new class141(var4, class548.field4265, this.field1878);
		var5.method728().method2446(var1);
		var5.method728().method2442(class125.field818);
		JSONObject var6 = new JSONObject();
		var6.put("accountId", var2);
		var5.method724(new class374(var6));
		this.field1875 = this.field2010.method1981(var5);
	}

	@Override
	protected final void method2573() {
		int[] var2 = new int[]{20, 260, 10000};
		int[] var3 = new int[]{1000, 100, 500};
		if (null != var2 && null != var3) {
			class150.field1037 = var2;
			class288.field2173 = new int[var2.length];
			class263.field1760 = new byte[var2.length][][];

			for (int var4 = 0; var4 < class150.field1037.length; ++var4) {
				class263.field1760[var4] = new byte[var3[var4]][];
				class150.field1033.add(var2[var4]);
			}

			Collections.sort(class150.field1033);
		} else {
			class150.field1037 = null;
			class288.field2173 = null;
			class263.field1760 = (byte[][][])null;
			class150.field1033.clear();
			class150.field1033.add(100);
			class150.field1033.add(5000);
			class150.field1033.add(10000);
			class150.field1033.add(30000);
		}

		class397.field2719 = field1842 == 0 ? 43594 : 40000 + field1832;
		class367.field2542 = field1842 == 0 ? 443 : 50000 + field1832;
		class290.field2175 = class397.field2719;
		class171.field1205 = class445.field2979;
		class510.field3717 = class445.field2976;
		class370.field2558 = class445.field2977;
		class208.field1385 = class445.field2978;
		class283.field2153 = new class389(this.field1878, 217);
		this.method2589();
		this.method2583();
		class84.field567 = this.method2572();
		this.method2561(field2068, 0);
		this.method2561(field2067, 1);
		this.method2558();
		class523.field4109 = new class471(255, class258.field1753, class258.field1754, 500000);
		class109.field693 = class98.method467();
		class467.method2171(this, class473.field3313);
		method1391(class109.field693.method454());
		class35.field176 = new class78(class474.field3325);
		this.field2010 = new class434("tokenRequest", 1, 1);
		class483.method2224(this);
		field2128.method2100();
	}

	@Override
	protected final void method2586() {
		++field1846;
		this.method1279();
		class106.method501();
		boolean var2 = class151.method809();
		if (var2 && field2083 && class197.field1332 != null) {
			class197.field1332.method306();
		}

		class253.method1209();
		field2067.method1793();
		this.method2582();
		synchronized(class316.field2302) {
			class316.field2308 = class316.field2304;
			class316.field2309 = class316.field2303;
			class316.field2315 = class316.field2306;
			class316.field2311 = class316.field2310;
			class316.field2316 = class316.field2312;
			class316.field2318 = class316.field2313;
			class316.field2320 = class316.field2314;
			class316.field2319 = class316.field2307;
			class316.field2312 = 0;
		}

		if (class84.field567 != null) {
			int var3 = class84.field567.method471();
			field2042 = var3;
		}

		if (field1843 == 0) {
			method1429();
			class535.method2591();
		} else if (field1843 == 5) {
			class410.method1890(this, class434.field2908, class331.field2352);
			method1429();
			class535.method2591();
		} else if (field1843 != 10 && field1843 != 11) {
			if (field1843 == 20) {
				class410.method1890(this, class434.field2908, class331.field2352);
				this.method1281();
			} else if (field1843 == 50) {
				class410.method1890(this, class434.field2908, class331.field2352);
				this.method1281();
			} else if (field1843 == 25) {
				class62.method261();
			}
		} else {
			class410.method1890(this, class434.field2908, class331.field2352);
		}

		if (field1843 == 30) {
			this.method1282();
		} else if (field1843 == 40 || field1843 == 45) {
			this.method1281();
		}

	}

	@Override
	protected final void method2587(boolean var1) {
		if ((field1843 == 10 || field1843 == 20 || field1843 == 30) && field2013 != 0L && class38.method108() > field2013) {
			method1391(method1368());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field2051[var3] = true;
			}
		}

		if (field1843 == 0) {
			this.method2590(class410.field2817, class410.field2818, var1);
		} else if (field1843 == 5) {
			class410.method1897(class209.field1388, class434.field2908, class331.field2352);
		} else if (field1843 != 10 && field1843 != 11) {
			if (field1843 == 20) {
				class410.method1897(class209.field1388, class434.field2908, class331.field2352);
			} else if (field1843 == 50) {
				class410.method1897(class209.field1388, class434.field2908, class331.field2352);
			} else if (field1843 == 25) {
				if (field1859 == 1) {
					if (field1901 > field1902) {
						field1902 = field1901;
					}

					var3 = (field1902 * 50 - field1901 * 50) / field1902;
					method1452(class513.field3797 + class274.field1824 + class274.field1821 + var3 + "%" + class274.field1822, false);
				} else if (field1859 == 2) {
					if (field1903 > field1904) {
						field1904 = field1903;
					}

					var3 = 50 + (field1904 * 50 - field1903 * 50) / field1904;
					method1452(class513.field3797 + class274.field1824 + class274.field1821 + var3 + "%" + class274.field1822, false);
				} else {
					method1452(class513.field3797, false);
				}
			} else if (field1843 == 30) {
				this.method1285();
			} else if (field1843 == 40) {
				method1452(class513.field3761 + class274.field1824 + class513.field3762, false);
			} else if (field1843 == 45) {
				method1452(class513.field3972, false);
			}
		} else {
			class410.method1897(class209.field1388, class434.field2908, class331.field2352);
		}

		if (field1843 == 30 && field2031 == 0 && !var1 && !field1996) {
			for (var3 = 0; var3 < field1874; ++var3) {
				if (field2047[var3]) {
					class246.field1638.method2636(field2054[var3], field2055[var3], field1834[var3], field2085[var3]);
					field2047[var3] = false;
				}
			}
		} else if (field1843 > 0) {
			class246.field1638.method2638(0, 0);

			for (var3 = 0; var3 < field1874; ++var3) {
				field2047[var3] = false;
			}
		}

	}

	@Override
	protected final void method2560() {
		if (class208.field1384.method1915()) {
			class208.field1384.method1913();
		}

		if (null != class127.field831) {
			class127.field831.field2360 = false;
		}

		class127.field831 = null;
		field1891.method2610();
		class316.method1575();
		class84.field567 = null;
		if (class197.field1332 != null) {
			class197.field1332.method307();
		}

		class28.field143.method722();
		class106.method500();
		if (class283.field2153 != null) {
			class283.field2153.method712();
			class283.field2153 = null;
		}

		class258.method1225();
		this.field2010.method1982();
	}

	void method1279() {
		if (field1843 != 1000) {
			boolean var2 = class28.field143.method723();
			if (!var2) {
				this.method1280();
			}

		}
	}

	void method1280() {
		if (class28.field143.field928 >= 4) {
			this.method2576("js5crc");
			class432.method1954(1000);
		} else {
			if (class28.field143.field921 >= 4) {
				if (field1843 <= 5) {
					this.method2576("js5io");
					class432.method1954(1000);
					return;
				}

				field1865 = 3000;
				class28.field143.field921 = 3;
			}

			if (--field1865 + 1 <= 0) {
				try {
					if (field1864 == 0) {
						class514.field4060 = class535.field4187.method1952(class316.field2317, class290.field2175);
						++field1864;
					}

					if (field1864 == 1) {
						if (class514.field4060.field2932 == 2) {
							this.method1299(-1);
							return;
						}

						if (class514.field4060.field2932 == 1) {
							++field1864;
						}
					}

					if (field1864 == 2) {
						class328.field2346 = class86.method409((Socket)class514.field4060.field2933, 40000, 5000);
						Buffer var2 = new Buffer(5);
						var2.writeByte(15);
						var2.writeInt(217);
						class328.field2346.method403(var2.data, 0, 5);
						++field1864;
						class553.field4316 = class38.method108();
					}

					if (field1864 == 3) {
						if (class328.field2346.method408() > 0) {
							int var4 = class328.field2346.method405();
							if (var4 != 0) {
								this.method1299(var4);
								return;
							}

							++field1864;
						} else if (class38.method108() - class553.field4316 > 30000L) {
							this.method1299(-2);
							return;
						}
					}

					if (field1864 == 4) {
						class28.field143.method716(class328.field2346, field1843 > 20);
						class514.field4060 = null;
						class328.field2346 = null;
						field1864 = 0;
						field1866 = 0;
					}
				} catch (IOException var3) {
					this.method1299(-3);
				}

			}
		}
	}

	void method1299(int var1) {
		class514.field4060 = null;
		class328.field2346 = null;
		field1864 = 0;
		if (class290.field2175 == class397.field2719) {
			class290.field2175 = class367.field2542;
		} else {
			class290.field2175 = class397.field2719;
		}

		++field1866;
		if (field1866 < 2 || var1 != 7 && var1 != 9) {
			if (field1866 >= 2 && var1 == 6) {
				this.method2576("js5connect_outofdate");
				class432.method1954(1000);
			} else if (field1866 >= 4) {
				if (field1843 <= 5) {
					this.method2576("js5connect");
					class432.method1954(1000);
				} else {
					field1865 = 3000;
				}
			}
		} else if (field1843 <= 5) {
			this.method2576("js5connect_full");
			class432.method1954(1000);
		} else {
			field1865 = 3000;
		}

	}

	final void method1281() {
		class86 var2 = field1891.method2611();
		PacketBuffer var3 = field1891.field4220;

		try {
			if (loginState == 0) {
				if (class368.field2545 == null && (field1886.method1704() || field1868 > 250)) {
					class368.field2545 = field1886.method1705();
					field1886.method1703();
					field1886 = null;
				}

				if (class368.field2545 != null) {
					if (var2 != null) {
						var2.method406();
						var2 = null;
					}

					class316.field2321 = null;
					field2036 = false;
					field1868 = 0;
					if (field1872.method2624()) {
						if (this.method1301()) {
							try {
								this.method1275(class393.field2670);
								method1448(21);
							} catch (Throwable var21) {
								class2.method1((String)null, var21);
								method1382(65);
								return;
							}
						} else {
							if (!this.method1273()) {
								method1382(65);
								return;
							}

							try {
								this.method1277(class71.field456, class207.field1379);
								method1448(20);
							} catch (Exception var20) {
								class2.method1((String)null, var20);
								method1382(65);
								return;
							}
						}
					} else {
						method1448(1);
					}
				}
			}

			class80 var23;
			if (loginState == 21) {
				if (this.field1920 != null) {
					if (!this.field1920.isDone()) {
						return;
					}

					if (this.field1920.isCancelled()) {
						method1382(65);
						this.field1920 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field1920.get();
						if (!var4.isSuccess()) {
							method1382(65);
							this.field1920 = null;
							return;
						}

						class177.field1228 = var4.getAccessToken();
						class393.field2670 = var4.getRefreshToken();
						this.field1920 = null;
					} catch (Exception var19) {
						class2.method1((String)null, var19);
						method1382(65);
						this.field1920 = null;
						return;
					}
				} else {
					if (this.field1880 == null) {
						method1382(65);
						return;
					}

					if (!this.field1880.method6()) {
						return;
					}

					if (this.field1880.method4()) {
						class2.method1(this.field1880.method3(), (Throwable)null);
						method1382(65);
						this.field1880 = null;
						return;
					}

					var23 = this.field1880.method5();
					if (var23.method394() != 200) {
						method1382(65);
						this.field1880 = null;
						return;
					}

					field1868 = 0;
					class374 var5 = new class374(var23.method396());

					try {
						class177.field1228 = var5.method1751().getString("access_token");
						class393.field2670 = var5.method1751().getString("refresh_token");
					} catch (Exception var18) {
						class2.method1("Error parsing tokens", var18);
						method1382(65);
						this.field1880 = null;
						return;
					}
				}

				this.method1276(class177.field1228);
				method1448(20);
			}

			if (loginState == 20) {
				if (this.field2052 != null) {
					if (!this.field2052.isDone()) {
						return;
					}

					if (this.field2052.isCancelled()) {
						method1382(65);
						this.field2052 = null;
						return;
					}

					try {
						OtlTokenResponse var24 = (OtlTokenResponse)this.field2052.get();
						if (!var24.isSuccess()) {
							method1382(65);
							this.field2052 = null;
							return;
						}

						this.field1873 = var24.getToken();
						this.field2052 = null;
					} catch (Exception var17) {
						class2.method1((String)null, var17);
						method1382(65);
						this.field2052 = null;
						return;
					}
				} else {
					if (null == this.field1875) {
						method1382(65);
						return;
					}

					if (!this.field1875.method6()) {
						return;
					}

					if (this.field1875.method4()) {
						class2.method1(this.field1875.method3(), (Throwable)null);
						method1382(65);
						this.field1875 = null;
						return;
					}

					var23 = this.field1875.method5();
					if (var23.method394() != 200) {
						class2.method1("Response code: " + var23.method394() + "Response body: " + var23.method396(), (Throwable)null);
						method1382(65);
						this.field1875 = null;
						return;
					}

					List var26 = (List)var23.method395().get("Content-Type");
					if (var26 != null && var26.contains(class125.field818.method593())) {
						try {
							JSONObject var6 = new JSONObject(var23.method396());
							this.field1873 = var6.getString("token");
						} catch (JSONException var16) {
							class2.method1((String)null, var16);
							method1382(65);
							this.field1875 = null;
							return;
						}
					} else {
						this.field1873 = var23.method396();
					}

					this.field1875 = null;
				}

				field1868 = 0;
				method1448(1);
			}

			if (loginState == 1) {
				if (class316.field2321 == null) {
					class316.field2321 = class535.field4187.method1952(class316.field2317, class290.field2175);
				}

				if (class316.field2321.field2932 == 2) {
					throw new IOException();
				}

				if (class316.field2321.field2932 == 1) {
					var2 = class86.method409((Socket)class316.field2321.field2933, 40000, 5000);
					field1891.method2609(var2);
					class316.field2321 = null;
					method1448(2);
				}
			}

			class341 var25;
			if (loginState == 2) {
				field1891.method2613();
				var25 = class341.method1655();
				var25.buffer.writeByte(class256.field1743.field1746);
				field1891.method2612(var25);
				field1891.method2608();
				var3.offset = 0;
				method1448(3);
			}

			int var27;
			if (loginState == 3) {
				if (null != class197.field1332) {
					class197.field1332.method305();
				}

				if (var2.method404(1)) {
					var27 = var2.method405();
					if (class197.field1332 != null) {
						class197.field1332.method305();
					}

					if (var27 != 0) {
						method1382(var27);
						return;
					}

					var3.offset = 0;
					method1448(4);
				}
			}

			if (loginState == 4) {
				if (var3.offset < 8) {
					var27 = var2.method408();
					if (var27 > 8 - var3.offset) {
						var27 = 8 - var3.offset;
					}

					if (var27 > 0) {
						var2.method407(var3.data, var3.offset, var27);
						var3.offset += var27;
					}
				}

				if (var3.offset == 8) {
					var3.offset = 0;
					class491.field3501 = var3.readLong();
					method1448(5);
				}
			}

			int var7;
			if (loginState == 5) {
				field1891.field4220.offset = 0;
				field1891.method2613();
				PacketBuffer var34 = new PacketBuffer(500);
				int[] var28 = new int[]{class368.field2545.nextInt(), class368.field2545.nextInt(), class368.field2545.nextInt(), class368.field2545.nextInt()};
				var34.offset = 0;
				var34.writeByte(1);
				var34.writeInt(var28[0]);
				var34.writeInt(var28[1]);
				var34.writeInt(var28[2]);
				var34.writeInt(var28[3]);
				var34.writeLong(class491.field3501);
				if (field1843 == 40) {
					var34.writeInt(class354.field2454[0]);
					var34.writeInt(class354.field2454[1]);
					var34.writeInt(class354.field2454[2]);
					var34.writeInt(class354.field2454[3]);
				} else {
					if (field1843 == 50) {
						var34.writeByte(class110.field701.getId());
						var34.writeInt(class446.field2981);
					} else {
						var34.writeByte(field1871.getId());
						switch(field1871.field696) {
						case 1:
							var34.offset += 4;
							break;
						case 2:
							var34.writeInt(class109.field693.method443(class410.field2842));
							break;
						case 3:
						case 4:
							var34.writeMedium(class98.field635);
							++var34.offset;
						}
					}

					if (field1872.method2624()) {
						var34.writeByte(class544.field4234.getId());
						var34.writeString(this.field1873);
					} else {
						var34.writeByte(class544.field4241.getId());
						var34.writeString(class410.field2827);
					}
				}

				var34.encryptRsa(class128.field832, class128.field833);
				class354.field2454 = var28;
				class341 var30 = class341.method1655();
				var30.buffer.offset = 0;
				if (field1843 == 40) {
					var30.buffer.writeByte(class256.field1747.field1746);
				} else {
					var30.buffer.writeByte(class256.field1742.field1746);
				}

				var30.buffer.writeShort(0);
				var7 = var30.buffer.offset;
				var30.buffer.writeInt(217);
				var30.buffer.writeInt(1);
				var30.buffer.writeByte(field1838);
				var30.buffer.writeByte(field1839);
				boolean var8 = false;
				var30.buffer.writeByte(0);
				var30.buffer.writeBytes(var34.data, 0, var34.offset);
				int var9 = var30.buffer.offset;
				var30.buffer.writeString(class410.field2842);
				var30.buffer.writeByte((field1996 ? 1 : 0) << 1 | (field2059 ? 1 : 0));
				var30.buffer.writeShort(class164.field1170);
				var30.buffer.writeShort(class92.field595);
				PacketBuffer var10 = var30.buffer;
				if (field2132 != null) {
					var10.writeBytes(field2132, 0, field2132.length);
				} else {
					byte[] var11 = class258.method1227();
					var10.writeBytes(var11, 0, var11.length);
				}

				var30.buffer.writeString(class161.field1165);
				var30.buffer.writeInt(class366.field2540);
				if (field1841 > 213) {
					var30.buffer.writeByte(0);
				}

				Buffer var42 = new Buffer(class307.field2233.method1730());
				class307.field2233.method1729(var42);
				var30.buffer.writeBytes(var42.data, 0, var42.data.length);
				var30.buffer.writeByte(field1838);
				var30.buffer.writeInt(0);
				var30.buffer.writeInt(class478.field3364.field14);
				var30.buffer.writeInt(class514.field4063.field14);
				var30.buffer.writeIntIME(class514.field4064.field14);
				var30.buffer.writeIntME(class97.field630.field14);
				var30.buffer.writeIntLE(class408.field2805.field14);
				var30.buffer.writeIntLE(class174.field1221.field14);
				var30.buffer.writeIntLE(class323.field2337.field14);
				var30.buffer.writeIntME(class179.field1232.field14);
				var30.buffer.writeIntIME(class516.field4073.field14);
				var30.buffer.writeIntME(class77.field541.field14);
				var30.buffer.writeInt(class257.field1750.field14);
				var30.buffer.writeIntME(class66.field417.field14);
				var30.buffer.writeIntME(0);
				var30.buffer.writeIntLE(class494.field3514.field14);
				var30.buffer.writeIntLE(class522.field4107.field14);
				var30.buffer.writeIntLE(class365.field2533.field14);
				var30.buffer.writeInt(class87.field581.field14);
				var30.buffer.writeIntLE(class151.field1049.field14);
				var30.buffer.writeInt(class4.field13.field14);
				var30.buffer.writeIntLE(class254.field1725.field14);
				var30.buffer.writeIntIME(class358.field2470.field14);
				var30.buffer.encryptXtea(var28, var9, var30.buffer.offset);
				var30.buffer.writeLengthShort(var30.buffer.offset - var7);
				field1891.method2612(var30);
				field1891.method2608();
				field1891.field4219 = new class534(var28);
				int[] var12 = new int[4];

				for (int var13 = 0; var13 < 4; ++var13) {
					var12[var13] = 50 + var28[var13];
				}

				var3.method1495(var12);
				method1448(6);
			}

			int var29;
			if (loginState == 6 && var2.method408() > 0) {
				var27 = var2.method405();
				if (var27 == 61) {
					var29 = var2.method408();
					class33.field173 = var29 == 1 && var2.method405() == 1;
					method1448(5);
				}

				if (var27 == 21 && field1843 == 20) {
					method1448(12);
				} else if (var27 == 2) {
					method1448(14);
				} else if (var27 == 15 && field1843 == 40) {
					field1891.field4222 = -1;
					method1448(19);
				} else if (var27 == 64) {
					method1448(10);
				} else if (var27 == 23 && field2044 < 1) {
					++field2044;
					method1448(0);
				} else if (var27 == 29) {
					method1448(17);
				} else {
					if (var27 != 69) {
						method1382(var27);
						return;
					}

					method1448(7);
				}
			}

			if (loginState == 7 && var2.method408() >= 2) {
				var2.method407(var3.data, 0, 2);
				var3.offset = 0;
				class318.field2322 = var3.readUnsignedShort();
				method1448(8);
			}

			if (loginState == 8 && var2.method408() >= class318.field2322) {
				var3.offset = 0;
				var2.method407(var3.data, var3.offset, class318.field2322);
				class184[] var37 = new class184[]{class184.field1279};
				class184 var31 = var37[var3.readUnsignedByte()];

				try {
					switch(var31.field1280) {
					case 0:
						class402 var32 = new class402();
						this.field1888 = new class152(var3, var32);
						method1448(9);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var15) {
					method1382(22);
					return;
				}
			}

			if (loginState == 9 && this.field1888.method812()) {
				this.field2076 = this.field1888.method814();
				this.field1888.method813();
				this.field1888 = null;
				if (this.field2076 == null) {
					method1382(22);
					return;
				}

				field1891.method2613();
				var25 = class341.method1655();
				var25.buffer.writeByte(class256.field1744.field1746);
				var25.buffer.writeShort(this.field2076.offset);
				var25.buffer.writeBuffer(this.field2076);
				field1891.method2612(var25);
				field1891.method2608();
				this.field2076 = null;
				method1448(6);
			}

			if (loginState == 10 && var2.method408() > 0) {
				class193.field1326 = var2.method405();
				method1448(11);
			}

			if (loginState == 11 && var2.method408() >= class193.field1326) {
				var2.method407(var3.data, 0, class193.field1326);
				var3.offset = 0;
				method1448(6);
			}

			if (loginState == 12 && var2.method408() > 0) {
				field1870 = (var2.method405() + 3) * 60;
				method1448(13);
			}

			if (loginState == 13) {
				field1868 = 0;
				class410.method1891(class513.field3909, class513.field3793, field1870 / 60 + class513.field3882);
				if (--field1870 <= 0) {
					method1448(0);
				}

			} else {
				if (loginState == 14 && var2.method408() >= 1) {
					class129.field842 = var2.method405();
					method1448(15);
				}

				if (loginState == 15 && var2.method408() >= class129.field842) {
					boolean var38 = var2.method405() == 1;
					var2.method407(var3.data, 0, 4);
					var3.offset = 0;
					boolean var33 = false;
					if (var38) {
						var29 = var3.method1505() << 24;
						var29 |= var3.method1505() << 16;
						var29 |= var3.method1505() << 8;
						var29 |= var3.method1505();
						class109.field693.method463(class410.field2842, var29);
					}

					if (field1885) {
						class109.field693.method450(class410.field2842);
					} else {
						class109.field693.method450((String)null);
					}

					class98.method466();
					field2087 = var2.method405();
					field2012 = var2.method405() == 1;
					field1958 = var2.method405();
					field1958 <<= 8;
					field1958 += var2.method405();
					field1959 = var2.method405();
					var2.method407(var3.data, 0, 8);
					var3.offset = 0;
					this.field1889 = var3.readLong();
					var2.method407(var3.data, 0, 8);
					var3.offset = 0;
					field1852 = var3.readLong();
					if (field1841 >= 214) {
						var2.method407(var3.data, 0, 8);
						var3.offset = 0;
						var3.readLong();
					}

					var2.method407(var3.data, 0, 1);
					var3.offset = 0;
					ServerPacket[] var35 = ServerPacket.values();
					var7 = var3.method1498();
					if (var7 < 0 || var7 >= var35.length) {
						throw new IOException(var7 + " " + var3.offset);
					}

					field1891.serverPacket = var35[var7];
					field1891.field4222 = field1891.serverPacket.length;
					var2.method407(var3.data, 0, 2);
					var3.offset = 0;
					field1891.field4222 = var3.readUnsignedShort();

					try {
						Client var40 = class190.field1287;
						JSObject.getWindow(var40).call("zap", (Object[])null);
					} catch (Throwable var14) {
					}

					method1448(16);
				}

				if (loginState == 16) {
					if (var2.method408() >= field1891.field4222) {
						var3.offset = 0;
						var2.method407(var3.data, 0, field1891.field4222);
						field1899.method1743();
						initGpi();
						class176.decodeGPI(var3);
						class344.field2404 = -1;
						rebuildRegionNormal(false, var3);
						field1891.serverPacket = null;
					}

				} else {
					if (loginState == 17 && var2.method408() >= 2) {
						var3.offset = 0;
						var2.method407(var3.data, 0, 2);
						var3.offset = 0;
						class266.field1783 = var3.readUnsignedShort();
						method1448(18);
					}

					if (loginState == 18 && var2.method408() >= class266.field1783) {
						var3.offset = 0;
						var2.method407(var3.data, 0, class266.field1783);
						var3.offset = 0;
						String var41 = var3.readStringOrNull();
						String var39 = var3.readStringOrNull();
						String var36 = var3.readStringOrNull();
						class410.method1891(var41, var39, var36);
						class432.method1954(10);
						if (field1872.method2624()) {
							class410.method1883(9);
						}
					}

					if (loginState == 19) {
						if (field1891.field4222 == -1) {
							if (var2.method408() < 2) {
								return;
							}

							var2.method407(var3.data, 0, 2);
							var3.offset = 0;
							field1891.field4222 = var3.readUnsignedShort();
						}

						if (var2.method408() >= field1891.field4222) {
							var2.method407(var3.data, 0, field1891.field4222);
							var3.offset = 0;
							var27 = field1891.field4222;
							field1899.method1746();
							method1318();
							class176.decodeGPI(var3);
							if (var27 != var3.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field1868;
						if (field1868 > 2000) {
							if (field2044 < 1) {
								if (class397.field2719 == class290.field2175) {
									class290.field2175 = class367.field2542;
								} else {
									class290.field2175 = class397.field2719;
								}

								++field2044;
								method1448(0);
							} else {
								method1382(-3);
							}
						}
					}
				}
			}
		} catch (IOException var22) {
			if (field2044 < 1) {
				if (class397.field2719 == class290.field2175) {
					class290.field2175 = class367.field2542;
				} else {
					class290.field2175 = class397.field2719;
				}

				++field2044;
				method1448(0);
			} else {
				method1382(-2);
			}
		}
	}

	final void method1282() {
		if (field1952 > 1) {
			--field1952;
		}

		if (field1897 > 0) {
			--field1897;
		}

		if (field2036) {
			field2036 = false;
			method1352();
		} else {
			if (!field1978) {
				method1435();
			}

			int var2;
			for (var2 = 0; var2 < 100 && this.method1287(field1891); ++var2) {
			}

			if (field1843 == 30) {
				while (true) {
					class37 var3 = (class37)class9.field40.method2088();
					boolean var24;
					if (var3 == null) {
						var24 = false;
					} else {
						var24 = true;
					}

					int var4;
					class341 var25;
					if (!var24) {
						class341 var26;
						int var27;
						if (field1899.field2572) {
							var26 = class341.createClientPacket(ClientPacket.field3123, field1891.field4219);
							var26.buffer.writeByte(0);
							var27 = var26.buffer.offset;
							field1899.method1740(var26.buffer);
							var26.buffer.writeLengthBytes(var26.buffer.offset - var27);
							field1891.method2612(var26);
							field1899.method1744();
						}

						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						int var13;
						synchronized(class127.field831.field2356) {
							if (!field1850) {
								class127.field831.field2358 = 0;
							} else if (class316.field2316 != 0 || class127.field831.field2358 >= 40) {
								var25 = null;
								var4 = 0;
								var5 = 0;
								var6 = 0;
								var7 = 0;

								for (var8 = 0; var8 < class127.field831.field2358 && (var25 == null || var25.buffer.offset - var4 < 246); ++var8) {
									var5 = var8;
									var9 = class127.field831.field2357[var8];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									var10 = class127.field831.field2355[var8];
									if (var10 < -1) {
										var10 = -1;
									} else if (var10 > 65534) {
										var10 = 65534;
									}

									if (var10 != field1965 || var9 != field1910) {
										if (var25 == null) {
											var25 = class341.createClientPacket(ClientPacket.field3100, field1891.field4219);
											var25.buffer.writeByte(0);
											var4 = var25.buffer.offset;
											PacketBuffer var10000 = var25.buffer;
											var10000.offset += 2;
											var6 = 0;
											var7 = 0;
										}

										if (-1L != field2021) {
											var11 = var10 - field1965;
											var12 = var9 - field1910;
											var13 = (int)((class127.field831.field2359[var8] - field2021) / 20L);
											var6 = (int)((long)var6 + (class127.field831.field2359[var8] - field2021) % 20L);
										} else {
											var11 = var10;
											var12 = var9;
											var13 = Integer.MAX_VALUE;
										}

										field1965 = var10;
										field1910 = var9;
										if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
											var11 += 32;
											var12 += 32;
											var25.buffer.writeShort(var12 + (var13 << 12) + (var11 << 6));
										} else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
											var11 += 128;
											var12 += 128;
											var25.buffer.writeByte(var13 + 128);
											var25.buffer.writeShort(var12 + (var11 << 8));
										} else if (var13 < 32) {
											var25.buffer.writeByte(var13 + 192);
											if (var10 != -1 && var9 != -1) {
												var25.buffer.writeInt(var10 | var9 << 16);
											} else {
												var25.buffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var25.buffer.writeShort((var13 & 8191) + 57344);
											if (var10 != -1 && var9 != -1) {
												var25.buffer.writeInt(var10 | var9 << 16);
											} else {
												var25.buffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var7;
										field2021 = class127.field831.field2359[var8];
									}
								}

								if (var25 != null) {
									var25.buffer.writeLengthBytes(var25.buffer.offset - var4);
									var8 = var25.buffer.offset;
									var25.buffer.offset = var4;
									var25.buffer.writeByte(var6 / var7);
									var25.buffer.writeByte(var6 % var7);
									var25.buffer.offset = var8;
									field1891.method2612(var25);
								}

								if (var5 >= class127.field831.field2358) {
									class127.field831.field2358 = 0;
								} else {
									class332 var56 = class127.field831;
									var56.field2358 -= var5;
									System.arraycopy(class127.field831.field2355, var5, class127.field831.field2355, 0, class127.field831.field2358);
									System.arraycopy(class127.field831.field2357, var5, class127.field831.field2357, 0, class127.field831.field2358);
									System.arraycopy(class127.field831.field2359, var5, class127.field831.field2359, 0, class127.field831.field2358);
								}
							}
						}

						class341 var37;
						if (class316.field2316 == 1 || !class108.field685 && class316.field2316 == 4 || class316.field2316 == 2) {
							long var28 = class316.field2319 - field1882;
							if (var28 > 32767L) {
								var28 = 32767L;
							}

							field1882 = class316.field2319;
							var4 = class316.field2320;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class92.field595) {
								var4 = class92.field595;
							}

							var5 = class316.field2318;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > class164.field1170) {
								var5 = class164.field1170;
							}

							var6 = (int)var28;
							var37 = class341.createClientPacket(ClientPacket.field3127, field1891.field4219);
							var37.buffer.writeShort((var6 << 1) + (class316.field2316 == 2 ? 1 : 0));
							var37.buffer.writeShort(var5);
							var37.buffer.writeShort(var4);
							field1891.method2612(var37);
						}

						if (field2042 != 0) {
							var26 = class341.createClientPacket(ClientPacket.field3062, field1891.field4219);
							var26.buffer.writeShort(field2042);
							field1891.method2612(var26);
						}

						if (field2067.field2627 > 0) {
							var26 = class341.createClientPacket(ClientPacket.field3106, field1891.field4219);
							var26.buffer.writeShort(0);
							var27 = var26.buffer.offset;
							long var29 = class38.method108();

							for (var6 = 0; var6 < field2067.field2627; ++var6) {
								long var40 = var29 - field2072;
								if (var40 > 16777215L) {
									var40 = 16777215L;
								}

								field2072 = var29;
								var26.buffer.writeByte(field2067.field2624[var6]);
								var26.buffer.method2525((int)var40);
							}

							var26.buffer.writeLengthShort(var26.buffer.offset - var27);
							field1891.method2612(var26);
						}

						if (field1932 > 0) {
							--field1932;
						}

						if (field2067.method1798(96) || field2067.method1798(97) || field2067.method1798(98) || field2067.method1798(99)) {
							field1863 = true;
						}

						if (field1863 && field1932 <= 0) {
							field1932 = 20;
							field1863 = false;
							var26 = class341.createClientPacket(ClientPacket.field3068, field1891.field4219);
							var26.buffer.writeShortLE(field1962);
							var26.buffer.writeShortADD(field1917);
							field1891.method2612(var26);
						}

						if (class249.field1717 && !field1851) {
							field1851 = true;
							var26 = class341.createClientPacket(ClientPacket.field3083, field1891.field4219);
							var26.buffer.writeByte(1);
							field1891.method2612(var26);
						}

						if (!class249.field1717 && field1851) {
							field1851 = false;
							var26 = class341.createClientPacket(ClientPacket.field3083, field1891.field4219);
							var26.buffer.writeByte(0);
							field1891.method2612(var26);
						}

						if (null != class520.field4103) {
							class520.field4103.method1186();
						}

						method1361();
						if (class67.field438) {
							for (var2 = 0; var2 < class264.field1764; ++var2) {
								Player var30 = field2037[class264.field1765[var2]];
								var30.method2125();
							}

							class67.field438 = false;
						}

						if (field2075 != class212.field1393) {
							field2075 = class212.field1393;
							method1328(class212.field1393);
						}

						if (field1843 != 30) {
							return;
						}

						method1349();
						class489.method2254();
						++field1891.field4224;
						if (field1891.field4224 > 750) {
							method1352();
							return;
						}

						method1355();

						for (var2 = 0; var2 < field1980; ++var2) {
							var27 = field1893[var2];
							class378 var31 = field2017[var27];
							if (var31 != null) {
								method1307(var31, var31.field2605.field484);
							}
						}

						int[] var35 = class264.field1765;

						for (var27 = 0; var27 < class264.field1764; ++var27) {
							Player var32 = field2037[var35[var27]];
							if (null != var32 && var32.field352 > 0) {
								--var32.field352;
								if (var32.field352 == 0) {
									var32.field356 = null;
								}
							}
						}

						for (var27 = 0; var27 < field1980; ++var27) {
							var4 = field1893[var27];
							class378 var33 = field2017[var4];
							if (var33 != null && var33.field352 > 0) {
								--var33.field352;
								if (var33.field352 == 0) {
									var33.field356 = null;
								}
							}
						}

						++field2022;
						if (field1953 != 0) {
							field2073 += 20;
							if (field2073 >= 400) {
								field1953 = 0;
							}
						}

						class496 var38 = class429.field2880;
						class496 var39 = class428.field2878;
						class429.field2880 = null;
						class428.field2878 = null;
						field2018 = null;
						field1998 = false;
						field1960 = false;
						field2069 = 0;

						while (field2067.method1795() && field2069 < 128) {
							if (field2087 >= 2 && field2067.method1798(82) && field2067.field2637 == 66) {
								String var34 = class346.method1669();
								class190.field1287.method2585(var34);
							} else if (field1923 != 1 || field2067.field2626 <= 0) {
								field2071[field2069] = field2067.field2637;
								field1974[field2069] = field2067.field2626;
								++field2069;
							}
						}

						boolean var36 = field2087 >= 2;
						class341 var43;
						if (var36 && field2067.method1798(82) && field2067.method1798(81) && field2042 != 0) {
							var5 = class114.field720.field3009 - field2042;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > 3) {
								var5 = 3;
							}

							if (class114.field720.field3009 != var5) {
								var6 = class80.selectedTileX + class114.field720.field399[0];
								var7 = class425.selectedTileXYIdk + class114.field720.field400[0];
								var43 = class341.createClientPacket(ClientPacket.field3067, field1891.field4219);
								var43.buffer.writeShortADD(var6);
								var43.buffer.writeShortLE(var7);
								var43.buffer.writeInt(0);
								var43.buffer.writeByteADD(var5);
								field1891.method2612(var43);
							}

							field2042 = 0;
						}

						if (class316.field2316 == 1) {
							field2068.method1735();
						}

						if (rootInterface != -1) {
							method1466(rootInterface, 0, 0, class164.field1170, class92.field595, 0, 0);
						}

						++field1977;

						while (true) {
							class376 var41;
							class496 var42;
							class496 var46;
							do {
								var41 = (class376)field1856.method326();
								if (null == var41) {
									while (true) {
										do {
											var41 = (class376)field2046.method326();
											if (null == var41) {
												while (true) {
													do {
														var41 = (class376)field2019.method326();
														if (null == var41) {
															while (true) {
																while (true) {
																	class399 var45;
																	do {
																		do {
																			do {
																				var45 = (class399)field1848.method326();
																				if (var45 == null) {
																					this.method1297((byte)33);
																					method1313();
																					if (null != field2014) {
																						this.method1289();
																					}

																					if (class142.method761()) {
																						var5 = class142.field969;
																						var6 = class142.field983;
																						var37 = class341.createClientPacket(ClientPacket.MOVE_GAMECLICK, field1891.field4219);
																						var37.buffer.writeByte(5);
																						var37.buffer.writeShortLEADD(class425.selectedTileXYIdk + var6);
																						var37.buffer.writeByte(field2067.method1798(82) ? (field2067.method1798(81) ? 2 : 1) : 0);
																						var37.buffer.writeShortLEADD(var5 + class80.selectedTileX);
																						field1891.method2612(var37);
																						class142.method775();
																						field1849 = class316.field2318;
																						field1951 = class316.field2320;
																						field1953 = 1;
																						field2073 = 0;
																						field1840 = var5;
																						field2081 = var6;
																					}

																					if (class429.field2880 != var38) {
																						if (null != var38) {
																							method1363(var38);
																						}

																						if (class429.field2880 != null) {
																							method1363(class429.field2880);
																						}
																					}

																					if (var39 != class428.field2878 && field2100 == field1844) {
																						if (null != var39) {
																							method1363(var39);
																						}

																						if (null != class428.field2878) {
																							method1363(class428.field2878);
																						}
																					}

																					if (null != class428.field2878) {
																						if (field2100 < field1844) {
																							++field2100;
																							if (field2100 == field1844) {
																								method1363(class428.field2878);
																							}
																						}
																					} else if (field2100 > 0) {
																						--field2100;
																					}

																					if (field1923 == 0) {
																						var5 = class114.field720.field368;
																						var6 = class114.field720.field329;
																						if (class89.field585 - var5 < -500 || class89.field585 - var5 > 500 || class124.field814 - var6 < -500 || class124.field814 - var6 > 500) {
																							class89.field585 = var5;
																							class124.field814 = var6;
																						}

																						if (var5 != class89.field585) {
																							class89.field585 += (var5 - class89.field585) / 16;
																						}

																						if (class124.field814 != var6) {
																							class124.field814 += (var6 - class124.field814) / 16;
																						}

																						var7 = class89.field585 >> 7;
																						var8 = class124.field814 >> 7;
																						var9 = method1347(class89.field585, class124.field814, class212.field1393);
																						var10 = 0;
																						if (var7 > 3 && var8 > 3 && var7 < 100 && var8 < 100) {
																							for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																								for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
																									var13 = class212.field1393;
																									if (var13 < 3 && (class129.field835[1][var11][var12] & 2) == 2) {
																										++var13;
																									}

																									int var14 = var9 - class129.field844[var13][var11][var12];
																									if (var14 > var10) {
																										var10 = var14;
																									}
																								}
																							}
																						}

																						var11 = var10 * 192;
																						if (var11 > 98048) {
																							var11 = 98048;
																						}

																						if (var11 < 32768) {
																							var11 = 32768;
																						}

																						if (var11 > field1934) {
																							field1934 += (var11 - field1934) / 24;
																						} else if (var11 < field1934) {
																							field1934 += (var11 - field1934) / 80;
																						}

																						class159.field1145 = method1347(class114.field720.field368, class114.field720.field329, class212.field1393) - field1924;
																					} else if (field1923 == 1) {
																						if (field1931 && null != class114.field720) {
																							var5 = class114.field720.field399[0];
																							var6 = class114.field720.field400[0];
																							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
																								class89.field585 = class114.field720.field368;
																								var7 = method1347(class114.field720.field368, class114.field720.field329, class212.field1393) - field1924;
																								if (var7 < class159.field1145) {
																									class159.field1145 = var7;
																								}

																								class124.field814 = class114.field720.field329;
																								field1931 = false;
																							}
																						}

																						short var50 = -1;
																						if (field2067.method1798(33)) {
																							var50 = 0;
																						} else if (field2067.method1798(49)) {
																							var50 = 1024;
																						}

																						if (field2067.method1798(48)) {
																							if (var50 == 0) {
																								var50 = 1792;
																							} else if (var50 == 1024) {
																								var50 = 1280;
																							} else {
																								var50 = 1536;
																							}
																						} else if (field2067.method1798(50)) {
																							if (var50 == 0) {
																								var50 = 256;
																							} else if (var50 == 1024) {
																								var50 = 768;
																							} else {
																								var50 = 512;
																							}
																						}

																						byte var51 = 0;
																						if (field2067.method1798(35)) {
																							var51 = -1;
																						} else if (field2067.method1798(51)) {
																							var51 = 1;
																						}

																						var7 = 0;
																						if (var50 >= 0 || var51 != 0) {
																							var7 = field2067.method1798(81) ? field1929 : field2121;
																							var7 *= 16;
																							field1926 = var50;
																							field1927 = var51;
																						}

																						if (field1925 < var7) {
																							field1925 += var7 / 8;
																							if (field1925 > var7) {
																								field1925 = var7;
																							}
																						} else if (field1925 > var7) {
																							field1925 = field1925 * 9 / 10;
																						}

																						if (field1925 > 0) {
																							var8 = field1925 / 16;
																							if (field1926 >= 0) {
																								var5 = field1926 - class76.field537 & 2047;
																								var9 = class105.field670[var5];
																								var10 = class105.field671[var5];
																								class89.field585 += var8 * var9 / 65536;
																								class124.field814 += var10 * var8 / 65536;
																							}

																							if (field1927 != 0) {
																								class159.field1145 += field1927 * var8;
																								if (class159.field1145 > 0) {
																									class159.field1145 = 0;
																								}
																							}
																						} else {
																							field1926 = -1;
																							field1927 = -1;
																						}

																						if (field2067.method1798(13)) {
																							method1449();
																						}
																					}

																					if (class316.field2308 == 4 && class108.field685) {
																						var5 = class316.field2315 - field1922;
																						field1995 = var5 * 2;
																						field1922 = var5 != -1 && var5 != 1 ? (class316.field2315 + field1922) / 2 : class316.field2315;
																						var6 = field1921 - class316.field2309;
																						field1991 = var6 * 2;
																						field1921 = var6 != -1 && var6 != 1 ? (field1921 + class316.field2309) / 2 : class316.field2309;
																					} else {
																						if (field2067.method1798(96)) {
																							field1991 += (-24 - field1991) / 2;
																						} else if (field2067.method1798(97)) {
																							field1991 += (24 - field1991) / 2;
																						} else {
																							field1991 /= 2;
																						}

																						if (field2067.method1798(98)) {
																							field1995 += (12 - field1995) / 2;
																						} else if (field2067.method1798(99)) {
																							field1995 += (-12 - field1995) / 2;
																						} else {
																							field1995 /= 2;
																						}

																						field1922 = class316.field2315;
																						field1921 = class316.field2309;
																					}

																					field1962 = field1962 + field1991 / 2 & 2047;
																					field1917 += field1995 / 2;
																					if (field1917 < 128) {
																						field1917 = 128;
																					}

																					if (field1917 > 383) {
																						field1917 = 383;
																					}

																					if (field2038) {
																						method1422(class147.field1026, class188.field1283, class258.field1756);
																						method1337(class434.field2905, class77.field542);
																						if (class147.field1026 == field2135 && class122.field794 == class188.field1283 && class258.field1756 == class353.field2437 && class434.field2905 == class130.field849 && class76.field537 == class77.field542) {
																							field2038 = false;
																							field2080 = false;
																							field2091 = false;
																							field2092 = false;
																							class14.field78 = 0;
																							class149.field1030 = 0;
																							class551.field4305 = 0;
																							class447.field2982 = 0;
																							class64.field327 = 0;
																							class16.field86 = 0;
																							class250.field1718 = 0;
																							class393.field2672 = 0;
																							class316.field2301 = 0;
																							class323.field2339 = 0;
																							field2094 = null;
																							field2096 = null;
																							field2095 = null;
																						}
																					} else if (field2080) {
																						class67.method316();
																					}

																					for (var5 = 0; var5 < 5; ++var5) {
																						int var10002 = field2020[var5]++;
																					}

																					class208.field1384.method1917();
																					var5 = ++class316.field2305 - 1;
																					var7 = class535.method2593();
																					if (var5 > 15000 && var7 > 15000) {
																						field1897 = 250;
																						class316.method1574(14500);
																						var43 = class341.createClientPacket(ClientPacket.field3138, field1891.field4219);
																						field1891.method2612(var43);
																					}

																					class35.field176.method372();

																					for (var8 = 0; var8 < field2127.size(); ++var8) {
																						var10 = (Integer)field2127.get(var8);
																						class19 var53 = (class19)class116.field728.method1678((long)var10);
																						class19 var55;
																						if (var53 != null) {
																							var55 = var53;
																						} else {
																							class5 var52 = class116.field723;
																							class5 var15 = class116.field725;
																							boolean var16 = true;
																							byte[] var17 = var52.method37(var10 >> 16 & 65535, var10 & 65535);
																							class19 var54;
																							if (var17 == null) {
																								var16 = false;
																								var54 = null;
																							} else {
																								int var18 = (var17[1] & 255) << 8 | var17[2] & 255;
																								byte[] var19 = var15.method37(var18, 0);
																								if (var19 == null) {
																									var16 = false;
																								}

																								if (!var16) {
																									var54 = null;
																								} else {
																									if (null == class209.field1389) {
																										class217.field1414 = Runtime.getRuntime().availableProcessors();
																										class209.field1389 = new ThreadPoolExecutor(0, class217.field1414, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + class217.field1414 * 100), new class429(this));
																									}

																									try {
																										var54 = new class19(var52, var15, var10, false);
																									} catch (Exception var22) {
																										var54 = null;
																									}
																								}
																							}

																							if (var54 != null) {
																								class116.field728.method1680(var54, (long)var10);
																							}

																							var55 = var54;
																						}

																						if (var55 == null) {
																							var9 = 2;
																						} else {
																							var9 = var55.method79() ? 0 : 1;
																						}

																						if (var9 != 2) {
																							field2127.remove(var8);
																							--var8;
																						}
																					}

																					++field1891.field4225;
																					if (field1891.field4225 > 50) {
																						var43 = class341.createClientPacket(ClientPacket.field3092, field1891.field4219);
																						field1891.method2612(var43);
																					}

																					try {
																						field1891.method2608();
																					} catch (IOException var21) {
																						method1352();
																					}

																					return;
																				}
																			} while(null == var45);
																		} while(null == var45.field2747);

																		if (var45.field2747.field3603 < 0) {
																			break;
																		}

																		var42 = class208.interfaceConfigs.method345(var45.field2747.field3544);
																	} while(var42 == null || var42.field3659 == null || var42.field3659.length == 0 || var45.field2747.field3603 >= var42.field3659.length || var42.field3659[var45.field2747.field3603] != var45.field2747);

																	if (var45.field2747.field3527 == 11 && var45.field2749 == 0) {
																		if (var45.field2747.method2336(var45.field2750, var45.field2748, 0, 0)) {
																			switch(var45.field2747.method2330()) {
																			case 0:
																				class467.method2170(var45.field2747.method2319(), true, false);
																				break;
																			case 1:
																				var7 = method1335(var45.field2747);
																				boolean var48 = (var7 >> 22 & 1) != 0;
																				if (var48) {
																					int[] var44 = var45.field2747.method2320();
																					if (var44 != null) {
																						class341 var49 = class341.createClientPacket(ClientPacket.field3050, field1891.field4219);
																						var49.buffer.writeShortLE(var45.field2747.field3603);
																						var49.buffer.writeInt(var45.field2747.method2337());
																						var49.buffer.writeIntLE(var45.field2747.interfaceId);
																						var49.buffer.writeIntIME(var44[1]);
																						var49.buffer.writeIntME(var44[0]);
																						var49.buffer.writeIntME(var44[2]);
																						field1891.method2612(var49);
																					}
																				}
																			}
																		}
																	} else if (var45.field2747.field3527 == 12) {
																		class135 var47 = var45.field2747.method2323((byte)5);
																		if (null != var47 && var47.method660()) {
																			switch(var45.field2749) {
																			case 0:
																				field2068.method1732(var45.field2747);
																				var47.method622(true);
																				var47.method653(var45.field2750, var45.field2748, field2067.method1798(82), field2067.method1798(81));
																				break;
																			case 1:
																				var47.method696(var45.field2750, var45.field2748);
																			}
																		}
																	}
																}
															}
														}

														var42 = var41.field2595;
														if (var42.field3603 < 0) {
															break;
														}

														var46 = class208.interfaceConfigs.method345(var42.field3544);
													} while(null == var46 || var46.field3659 == null || var42.field3603 >= var46.field3659.length || var46.field3659[var42.field3603] != var42);

													class440.method2027(var41);
												}
											}

											var42 = var41.field2595;
											if (var42.field3603 < 0) {
												break;
											}

											var46 = class208.interfaceConfigs.method345(var42.field3544);
										} while(var46 == null || null == var46.field3659 || var42.field3603 >= var46.field3659.length || var46.field3659[var42.field3603] != var42);

										class440.method2027(var41);
									}
								}

								var42 = var41.field2595;
								if (var42.field3603 < 0) {
									break;
								}

								var46 = class208.interfaceConfigs.method345(var42.field3544);
							} while(null == var46 || var46.field3659 == null || var42.field3603 >= var46.field3659.length || var46.field3659[var42.field3603] != var42);

							class440.method2027(var41);
						}
					}

					var25 = class341.createClientPacket(ClientPacket.field3051, field1891.field4219);
					var25.buffer.writeByte(0);
					var4 = var25.buffer.offset;
					class9.method44(var25.buffer);
					var25.buffer.writeLengthBytes(var25.buffer.offset - var4);
					field1891.method2612(var25);
				}
			}
		}
	}

	@Override
	public void method1925(int var1, int var2) {
		if (field1891 != null && field1891.field4219 != null) {
			if (var1 > -1 && class109.field693.method446() > 0 && !field2083) {
				class341 var4 = class341.createClientPacket(ClientPacket.field3063, field1891.field4219);
				var4.buffer.writeInt(var1);
				field1891.method2612(var4);
			}

		}
	}

	@Override
	protected final void method2563() {
		field2013 = class38.method108() + 500L;
		this.method1284();
		if (rootInterface != -1) {
			this.method1292(true);
		}

	}

	void method1284() {
		int var2 = class164.field1170;
		int var3 = class92.field595;
		if (super.field4176 < var2) {
			var2 = super.field4176;
		}

		if (super.field4168 < var3) {
			var3 = super.field4168;
		}

		if (null != class109.field693) {
			try {
				Client var4 = class190.field1287;
				Object[] var5 = new Object[]{method1368()};
				JSObject.getWindow(var4).call("resize", var5);
			} catch (Throwable var6) {
			}
		}

	}

	final void method1285() {
		if (rootInterface != -1) {
			method1369(rootInterface);
		}

		int var2;
		for (var2 = 0; var2 < field1874; ++var2) {
			if (field2051[var2]) {
				field2047[var2] = true;
			}

			field1990[var2] = field2051[var2];
			field2051[var2] = false;
		}

		field2050 = field1846;
		field1935 = -1;
		field1992 = -1;
		if (rootInterface != -1) {
			field1874 = 0;
			method1445(rootInterface, 0, 0, class164.field1170, class92.field595, 0, 0, -1);
		}

		class433.method1976();
		if (field1954) {
			if (field1953 == 1) {
				class500.field3691[field2073 / 100].method159(field1849 - 8, field1951 - 8);
			}

			if (field1953 == 2) {
				class500.field3691[4 + field2073 / 100].method159(field1849 - 8, field1951 - 8);
			}
		}

		int var3;
		int var4;
		int var5;
		int var7;
		int var8;
		int var9;
		if (!field1978) {
			if (field1935 != -1) {
				class315.method1571(field1935, field1992);
			}
		} else {
			var2 = class263.field1759;
			var3 = class24.field125;
			var4 = class382.field2640;
			var5 = class66.field407;
			int var6 = 6116423;
			class433.method1977(var2, var3, var4, var5, 6116423);
			class433.method1977(var2 + 1, var3 + 1, var4 - 2, 16, 0);
			class433.method1978(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
			class209.field1388.method1037(class513.field3916, var2 + 3, var3 + 14, 6116423, -1);
			var7 = class316.field2309;
			var8 = class316.field2315;

			int var10;
			int var11;
			for (var9 = 0; var9 < field1979; ++var9) {
				var10 = var3 + 31 + (field1979 - 1 - var9) * 15;
				var11 = 16777215;
				if (var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
					var11 = 16776960;
				}

				class209.field1388.method1037(method1381(var9), var2 + 3, var10, var11, 0);
			}

			var9 = class263.field1759;
			var10 = class24.field125;
			var11 = class382.field2640;
			int var12 = class66.field407;

			for (int var13 = 0; var13 < field1874; ++var13) {
				if (field1834[var13] + field2054[var13] > var9 && field2054[var13] < var11 + var9 && field2085[var13] + field2055[var13] > var10 && field2055[var13] < var10 + var12) {
					field2047[var13] = true;
				}
			}
		}

		if (field2031 == 3) {
			for (var2 = 0; var2 < field1874; ++var2) {
				if (field1990[var2]) {
					class433.method1965(field2054[var2], field2055[var2], field1834[var2], field2085[var2], 16711935, 128);
				} else if (field2047[var2]) {
					class433.method1965(field2054[var2], field2055[var2], field1834[var2], field2085[var2], 16711680, 128);
				}
			}
		}

		var2 = class212.field1393;
		var3 = class114.field720.field368;
		var4 = class114.field720.field329;
		var5 = field2022;

		for (class218 var14 = (class218)class218.field1421.method327(); var14 != null; var14 = (class218)class218.field1421.method331()) {
			if (var14.field1429 != -1 || null != var14.field1427) {
				var7 = 0;
				if (var3 > var14.field1420) {
					var7 = 0 + (var3 - var14.field1420);
				} else if (var3 < var14.field1418) {
					var7 = 0 + (var14.field1418 - var3);
				}

				if (var4 > var14.field1423) {
					var7 += var4 - var14.field1423;
				} else if (var4 < var14.field1419) {
					var7 += var14.field1419 - var4;
				}

				if (var7 - 64 <= var14.field1417 && class109.field693.method464() != 0 && var14.field1416 == var2) {
					var7 -= 64;
					if (var7 < 0) {
						var7 = 0;
					}

					var8 = (var14.field1417 - var7) * class109.field693.method464() / var14.field1417;
					class357 var10000;
					if (var14.field1422 == null) {
						if (var14.field1429 >= 0) {
							var10000 = (class357)null;
							class357 var15 = class357.method1715(class174.field1221, var14.field1429, 0);
							if (var15 != null) {
								class7 var16 = var15.method1712().method41(class276.field1830);
								class335 var18 = class335.method1633(var16, 100, var8);
								var18.method1623(-1);
								class244.field1632.method1140(var18);
								var14.field1422 = var18;
							}
						}
					} else {
						var14.field1422.method1607(var8);
					}

					if (var14.field1425 == null) {
						if (var14.field1427 != null && (var14.field1428 -= var5) <= 0) {
							var9 = (int)(Math.random() * (double)var14.field1427.length);
							var10000 = (class357)null;
							class357 var17 = class357.method1715(class174.field1221, var14.field1427[var9], 0);
							if (null != var17) {
								class7 var20 = var17.method1712().method41(class276.field1830);
								class335 var19 = class335.method1633(var20, 100, var8);
								var19.method1623(0);
								class244.field1632.method1140(var19);
								var14.field1425 = var19;
								var14.field1428 = var14.field1424 + (int)(Math.random() * (double)(var14.field1426 - var14.field1424));
							}
						}
					} else {
						var14.field1425.method1607(var8);
						if (!var14.field1425.method1720()) {
							var14.field1425 = null;
						}
					}
				} else {
					if (null != var14.field1422) {
						class244.field1632.method1131(var14.field1422);
						var14.field1422 = null;
					}

					if (var14.field1425 != null) {
						class244.field1632.method1131(var14.field1425);
						var14.field1425 = null;
					}
				}
			}
		}

		field2022 = 0;
	}

	boolean method1298(class540 var1, int var2) {
		if (var1.field4222 == 0) {
			class257.field1749 = null;
		} else {
			if (class257.field1749 == null) {
				class257.field1749 = new class539(class474.field3325, class190.field1287);
			}

			class257.field1749.method2606(var1.field4220, var2);
		}

		method1339();
		var1.serverPacket = null;
		return true;
	}

	boolean method1302(class540 var1) {
		if (null != class257.field1749) {
			class257.field1749.method2600(var1.field4220);
		}

		method1339();
		var1.serverPacket = null;
		return true;
	}

	final boolean method1287(class540 var1) {
		class86 var3 = var1.method2611();
		PacketBuffer var4 = var1.field4220;
		if (null == var3) {
			return false;
		} else {
			String var6;
			int var7;
			try {
				int fromComponent;
				if (null == var1.serverPacket) {
					if (var1.field4227) {
						if (!var3.method404(1)) {
							return false;
						}

						var3.method407(var1.field4220.data, 0, 1);
						var1.field4224 = 0;
						var1.field4227 = false;
					}

					var4.offset = 0;
					if (var4.method1500()) {
						if (!var3.method404(1)) {
							return false;
						}

						var3.method407(var1.field4220.data, 1, 1);
						var1.field4224 = 0;
					}

					var1.field4227 = true;
					ServerPacket[] var5 = ServerPacket.values();
					fromComponent = var4.method1498();
					if (fromComponent < 0 || fromComponent >= var5.length) {
						throw new IOException(fromComponent + " " + var4.offset);
					}

					var1.serverPacket = var5[fromComponent];
					var1.field4222 = var1.serverPacket.length;
				}

				if (var1.field4222 == -1) {
					if (!var3.method404(1)) {
						return false;
					}

					var1.method2611().method407(var4.data, 0, 1);
					var1.field4222 = var4.data[0] & 255;
				}

				if (var1.field4222 == -2) {
					if (!var3.method404(2)) {
						return false;
					}

					var1.method2611().method407(var4.data, 0, 2);
					var4.offset = 0;
					var1.field4222 = var4.readUnsignedShort();
				}

				if (!var3.method404(var1.field4222)) {
					return false;
				}

				var4.offset = 0;
				var3.method407(var4.data, 0, var1.field4222);
				var1.field4224 = 0;
				field1899.method1741();
				var1.field4228 = var1.field4215;
				var1.field4215 = var1.field4226;
				var1.field4226 = var1.serverPacket;
				if (ServerPacket.field3171 == var1.serverPacket) {
					return this.method1298(var1, 1);
				}

				byte var26;
				if (var1.serverPacket == ServerPacket.field3192) {
					method1371();
					var26 = var4.readByte();
					class14 var93 = new class14(var4);
					class511 var89;
					if (var26 >= 0) {
						var89 = field1919[var26];
					} else {
						var89 = class465.field3294;
					}

					if (null == var89) {
						this.method1290(var26);
						var1.serverPacket = null;
						return true;
					}

					if (var93.field76 > var89.field3723) {
						this.method1290(var26);
						var1.serverPacket = null;
						return true;
					}

					if (var93.field76 < var89.field3723) {
						var1.serverPacket = null;
						return true;
					}

					var93.method62(var89);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3256) {
					method1371();
					var26 = var4.readByte();
					if (var1.field4222 == 1) {
						if (var26 >= 0) {
							field1919[var26] = null;
						} else {
							class465.field3294 = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var26 >= 0) {
						field1919[var26] = new class511(var4);
					} else {
						class465.field3294 = new class511(var4);
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3253) {
					method1346(class310.field2250);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3276) {
					method1432(true, var4);
					var1.serverPacket = null;
					return true;
				}

				int var8;
				int toComponent;
				int var32;
				if (var1.serverPacket == ServerPacket.field3283) {
					var7 = var4.readUnsignedShortADD();
					var8 = var4.readUnsignedShortLE();
					var32 = var4.readUnsignedShortADD();
					fromComponent = var4.readUnsignedShort();
					toComponent = var4.readUnsignedShortADD();
					if (toComponent == 65535) {
						toComponent = -1;
					}

					ArrayList var79 = new ArrayList();
					var79.add(toComponent);
					method1393(var79, fromComponent, var7, var8, var32);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3166) {
					field2080 = true;
					field2038 = false;
					field2092 = true;
					toComponent = method1325(var4.readShort() & 2027);
					fromComponent = method1358(var4.readShort() & 2027);
					var7 = var4.readUnsignedShort();
					var8 = var4.readUnsignedByte();
					field2096 = new class84(class130.field849, fromComponent, var7, var8);
					field2095 = new class84(class76.field537, toComponent, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3170 == var1.serverPacket) {
					method1346(class310.field2247);
					var1.serverPacket = null;
					return true;
				}

				class496 var31;
				if (var1.serverPacket == ServerPacket.field3236) {
					toComponent = var4.readInt();
					var6 = var4.readStringOrNull();
					var31 = class208.interfaceConfigs.method345(toComponent);
					if (!var6.equals(var31.field3586)) {
						var31.field3586 = var6;
						method1363(var31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3204) {
					var7 = var4.readUnsignedByteNEG();
					fromComponent = var4.readUnsignedShortLE();
					toComponent = var4.readUnsignedShortADD();
					if (fromComponent == 65535) {
						fromComponent = -1;
					}

					class378 var83 = field2017[toComponent];
					if (var83 != null) {
						if (var83.field373 == fromComponent && fromComponent != -1) {
							var32 = class116.method539(fromComponent).field747;
							if (var32 == 1) {
								var83.field334 = 0;
								var83.field395 = 0;
								var83.field376 = var7;
								var83.field377 = 0;
							} else if (var32 == 2) {
								var83.field377 = 0;
							}
						} else if (fromComponent == -1 || var83.field373 == -1 || class116.method539(fromComponent).field741 >= class116.method539(var83.field373).field741) {
							var83.field373 = fromComponent;
							var83.field334 = 0;
							var83.field395 = 0;
							var83.field376 = var7;
							var83.field377 = 0;
							var83.field403 = var83.field360;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3162 == var1.serverPacket) {
					toComponent = var4.readUnsignedShortLE();
					class482.method2215(toComponent);
					field1989[++field1915 - 1 & 31] = toComponent & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3244) {
					for (toComponent = 0; toComponent < class319.field2324; ++toComponent) {
						class319 var91 = class319.method1579(toComponent);
						if (null != var91) {
							class119.field785[toComponent] = 0;
							class119.field786[toComponent] = 0;
						}
					}

					method1426();
					field1944 += 32;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3286) {
					method1346(class310.field2252);
					var1.serverPacket = null;
					return true;
				}

				String var47;
				if (var1.serverPacket == ServerPacket.field3224) {
					byte[] var92 = new byte[var1.field4222];
					var4.method1496(var92, 0, var92.length);
					Buffer var90 = new Buffer(var92);
					var47 = var90.readStringOrNull();
					class467.method2170(var47, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3165 == var1.serverPacket) {
					toComponent = var4.readUnsignedByteSUB();
					fromComponent = var4.readUnsignedShortLEADD();
					if (fromComponent == 65535) {
						fromComponent = -1;
					}

					class102.method468(class114.field720, fromComponent, toComponent);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3270) {
					toComponent = var4.readUnsignedIntIME();
					fromComponent = var4.readUnsignedShortLE();
					var31 = class208.interfaceConfigs.method345(toComponent);
					if (var31.field3568 != 1 || fromComponent != var31.field3521) {
						var31.field3568 = 1;
						var31.field3521 = fromComponent;
						method1363(var31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3220 == var1.serverPacket) {
					toComponent = var4.readUnsignedByte();
					fromComponent = var4.readUnsignedByte();
					var7 = var4.readUnsignedByte();
					var8 = var4.readUnsignedByte();
					field2098[toComponent] = true;
					field2099[toComponent] = fromComponent;
					field1993[toComponent] = var7;
					field2101[toComponent] = var8;
					field2020[toComponent] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3269) {
					field2038 = false;
					field2080 = false;
					field2091 = false;
					field2092 = false;
					class14.field78 = 0;
					class149.field1030 = 0;
					class551.field4305 = 0;
					field2093 = false;
					class447.field2982 = 0;
					class64.field327 = 0;
					class16.field86 = 0;
					class250.field1718 = 0;
					class393.field2672 = 0;
					class316.field2301 = 0;
					class323.field2339 = 0;
					field2094 = null;
					field2096 = null;
					field2095 = null;

					for (toComponent = 0; toComponent < 5; ++toComponent) {
						field2098[toComponent] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3223 == var1.serverPacket) {
					if (rootInterface != -1) {
						runInterfaceListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3251) {
					method1426();
					field2008 = var4.readUnsignedShort();
					field2041 = field1977;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3275) {
					toComponent = var4.readUnsignedIntLE();
					fromComponent = var4.readUnsignedByteADD();
					var31 = class208.interfaceConfigs.method345(toComponent);
					class496.method2340(var31, class114.field720.field2989.field1201, fromComponent);
					method1363(var31);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3167) {
					toComponent = var4.readInt();
					fromComponent = var4.readInt();
					var7 = class535.method2592();
					class341 var81 = class341.createClientPacket(ClientPacket.field3056, field1891.field4219);
					var81.buffer.writeIntME(toComponent);
					var81.buffer.writeIntIME(fromComponent);
					var81.buffer.writeByte(var7);
					var81.buffer.writeByteNEG(class535.field4167);
					field1891.method2612(var81);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3188 == var1.serverPacket) {
					method1346(class310.field2242);
					var1.serverPacket = null;
					return true;
				}

				int var10;
				int var11;
				if (var1.serverPacket == ServerPacket.field3279) {
					field2080 = true;
					field2038 = false;
					field2092 = false;
					class14.field78 = var4.readUnsignedByte();
					class149.field1030 = var4.readUnsignedByte();
					class551.field4305 = var4.readUnsignedShort();
					class447.field2982 = var4.readUnsignedByte();
					class64.field327 = var4.readUnsignedByte();
					if (class64.field327 >= 100) {
						toComponent = 64 + class14.field78 * 128;
						fromComponent = 64 + class149.field1030 * 128;
						var7 = method1347(toComponent, fromComponent, class212.field1393) - class551.field4305;
						var8 = toComponent - field2135;
						var32 = var7 - class122.field794;
						var10 = fromComponent - class353.field2437;
						var11 = (int)Math.sqrt((double)(var10 * var10 + var8 * var8));
						class130.field849 = (int)(Math.atan2((double)var32, (double)var11) * 325.9490051269531D) & 2047;
						class76.field537 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531D) & 2047;
						if (class130.field849 < 128) {
							class130.field849 = 128;
						}

						if (class130.field849 > 383) {
							class130.field849 = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3261 == var1.serverPacket) {
					toComponent = var4.readUnsignedShortADD();
					fromComponent = var4.readUnsignedIntME();
					var31 = class208.interfaceConfigs.method345(fromComponent);
					if (var31.field3568 != 6 || toComponent != var31.field3521) {
						var31.field3568 = 6;
						var31.field3521 = toComponent;
						method1363(var31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3216 == var1.serverPacket) {
					toComponent = var4.readUnsignedByte();
					if (var4.readUnsignedByte() == 0) {
						field2026[toComponent] = new class480();
						var4.offset += 18;
					} else {
						--var4.offset;
						field2026[toComponent] = new class480(var4, false);
					}

					field2039 = field1977;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3247) {
					method1426();
					field2009 = var4.readShort();
					field2041 = field1977;
					var1.serverPacket = null;
					return true;
				}

				class496 var88;
				if (ServerPacket.field3241 == var1.serverPacket) {
					toComponent = var4.readUnsignedIntLE();
					var88 = class208.interfaceConfigs.method345(toComponent);
					var88.field3568 = 3;
					var88.field3521 = class114.field720.field2989.method907();
					method1363(var88);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3284 == var1.serverPacket) {
					field2120 = var4.readUnsignedByte();
					field2040 = var4.readUnsignedByteNEG();
					var1.serverPacket = null;
					return true;
				}

				boolean var12;
				long var29;
				long var30;
				long var37;
				int var58;
				String var63;
				int var65;
				if (var1.serverPacket == ServerPacket.field3246) {
					var26 = var4.readByte();
					var29 = (long)var4.readUnsignedShort();
					var30 = (long)var4.readUnsignedMedium();
					var37 = var30 + (var29 << 32);
					var12 = false;
					class398 var72 = var26 >= 0 ? field2074[var26] : class455.field3020;
					if (var72 == null) {
						var12 = true;
					} else {
						for (var58 = 0; var58 < 100; ++var58) {
							if (field2065[var58] == var37) {
								var12 = true;
								break;
							}
						}
					}

					if (!var12) {
						field2065[field2066] = var37;
						field2066 = (1 + field2066) % 100;
						var63 = class380.method1792(var4);
						var65 = var26 >= 0 ? 43 : 46;
						class346.method1668(var65, "", var63, var72.field2741);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3229 == var1.serverPacket) {
					var1.serverPacket = null;
					return true;
				}

				int var16;
				int var17;
				int var18;
				int var19;
				class404 var20;
				byte var39;
				int var42;
				byte var46;
				int var49;
				if (ServerPacket.field3182 == var1.serverPacket) {
					var18 = var4.readUnsignedByte();
					var42 = var4.method2505();
					var46 = var4.readByte();
					var65 = var4.readUnsignedByteADD() * 4;
					var19 = var4.readUnsignedByte();
					var58 = var4.readUnsignedByteNEG() * 4;
					var49 = var4.readUnsignedShortLEADD();
					var7 = var4.method2504();
					toComponent = var7 >> 16;
					fromComponent = var7 >> 8 & 255;
					var8 = toComponent + (var7 >> 4 & 7);
					var32 = (var7 & 7) + fromComponent;
					var17 = var4.readUnsignedShortLE();
					var16 = var4.readUnsignedShortLEADD();
					var39 = var4.readByte();
					var10 = var39 + var8;
					var11 = var46 + var32;
					if (var8 >= 0 && var32 >= 0 && var8 < 104 && var32 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var49 != 65535) {
						var8 = var8 * 128 + 64;
						var32 = var32 * 128 + 64;
						var10 = var10 * 128 + 64;
						var11 = 64 + var11 * 128;
						var20 = new class404(var49, class212.field1393, var8, var32, method1347(var8, var32, class212.field1393) - var58, var16 + field1846, field1846 + var17, var18, var19, var42, var65);
						var20.method1864(var10, var11, method1347(var10, var11, class212.field1393) - var65, field1846 + var16);
						field1972.method323(var20);
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3177) {
					rebuildRegionNormal(true, var1.field4220);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3250 == var1.serverPacket) {
					class35.field176.field544.method368(var4, var1.field4222);
					method1460();
					field2035 = field1977;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3194 == var1.serverPacket) {
					method1346(class310.field2254);
					var1.serverPacket = null;
					return true;
				}

				class496 var38;
				if (var1.serverPacket == ServerPacket.field3163) {
					toComponent = var4.readInt();
					fromComponent = var4.readUnsignedShortLE();
					if (fromComponent == 65535) {
						fromComponent = -1;
					}

					var7 = var4.readUnsignedIntME();
					var38 = class208.interfaceConfigs.method345(var7);
					class158 var75;
					if (!var38.field3523) {
						if (fromComponent == -1) {
							var38.field3568 = 0;
							var1.serverPacket = null;
							return true;
						}

						var75 = class158.method857(fromComponent).method841(toComponent);
						var38.field3568 = 4;
						var38.field3521 = fromComponent;
						var38.field3575 = var75.field1117;
						var38.field3522 = var75.field1088;
						var38.field3570 = var75.field1113 * 100 / toComponent;
						method1363(var38);
					} else {
						var38.field3602 = fromComponent;
						var38.field3656 = toComponent;
						var75 = class158.method857(fromComponent).method841(toComponent);
						var38.field3575 = var75.field1117;
						var38.field3522 = var75.field1088;
						var38.field3611 = var75.field1102;
						var38.field3577 = var75.field1103;
						var38.field3574 = var75.field1125;
						var38.field3570 = var75.field1113;
						if (var75.field1105 == 1) {
							var38.field3584 = 1;
						} else {
							var38.field3584 = 2;
						}

						if (var38.field3579 > 0) {
							var38.field3570 = var38.field3570 * 32 / var38.field3579;
						} else if (var38.field3536 > 0) {
							var38.field3570 = var38.field3570 * 32 / var38.field3536;
						}

						method1363(var38);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3273 == var1.serverPacket) {
					method1346(class310.field2244);
					var1.serverPacket = null;
					return true;
				}

				class496 var9;
				InterfaceComponent fromInterfComp;
				if (var1.serverPacket == ServerPacket.IF_MOVESUB) {
					toComponent = var4.readInt();
					fromComponent = var4.readUnsignedIntME();
					InterfaceComponent toInterfComp = (InterfaceComponent) interfaceComponents.get((long) toComponent);
					fromInterfComp = (InterfaceComponent) interfaceComponents.get((long)fromComponent);
					if (null != fromInterfComp) {
						closeInterface(fromInterfComp, null == toInterfComp || toInterfComp.group != fromInterfComp.group);
					}

					if (null != toInterfComp) {
						toInterfComp.method1719();
						interfaceComponents.put(toInterfComp, (long)fromComponent);
					}

					var9 = class208.interfaceConfigs.method345(toComponent);
					if (null != var9) {
						method1363(var9);
					}

					var9 = class208.interfaceConfigs.method345(fromComponent);
					if (var9 != null) {
						method1363(var9);
						class145.method788(class208.interfaceConfigs.components[var9.interfaceId >>> 16], var9, true);
					}

					if (rootInterface != -1) {
						runInterfaceListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3280 == var1.serverPacket) {
					field1831 = field1977;
					var26 = var4.readByte();
					if (var1.field4222 == 1) {
						if (var26 >= 0) {
							field2074[var26] = null;
						} else {
							class455.field3020 = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var26 >= 0) {
						field2074[var26] = new class398(var4);
					} else {
						class455.field3020 = new class398(var4);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENSUB == var1.serverPacket) {
					toComponent = var4.readUnsignedShortADD();
					fromComponent = var4.readUnsignedByteNEG();
					var7 = var4.readUnsignedIntLE();
					fromInterfComp = (InterfaceComponent) interfaceComponents.get((long)var7);
					if (fromInterfComp != null) {
						closeInterface(fromInterfComp, toComponent != fromInterfComp.group);
					}

					class398.method1857(var7, toComponent, fromComponent);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3234 == var1.serverPacket) {
					field2082 = var4.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3181) {
					class116.field724 = new class174(class214.field1401);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3197 == var1.serverPacket) {
					toComponent = var4.readUnsignedIntME();
					var88 = class208.interfaceConfigs.method345(toComponent);

					for (var7 = 0; var7 < var88.field3633.length; ++var7) {
						var88.field3633[var7] = -1;
						var88.field3633[var7] = 0;
					}

					method1363(var88);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3237) {
					field2080 = true;
					field2038 = false;
					field2092 = true;
					class14.field78 = var4.readUnsignedByte();
					class149.field1030 = var4.readUnsignedByte();
					class551.field4305 = var4.readUnsignedShort();
					toComponent = var4.readUnsignedShort();
					fromComponent = var4.readUnsignedByte();
					var7 = 64 + class14.field78 * 128;
					var8 = class149.field1030 * 128 + 64;
					var32 = method1347(var7, var8, class212.field1393) - class551.field4305;
					var10 = var7 - field2135;
					var11 = var32 - class122.field794;
					var42 = var8 - class353.field2437;
					double var66 = Math.sqrt((double)(var42 * var42 + var10 * var10));
					var65 = method1358((int)(Math.atan2((double)var11, var66) * 325.9490051269531D) & 2047);
					var16 = method1325((int)(Math.atan2((double)var10, (double)var42) * -325.9490051269531D) & 2047);
					field2096 = new class84(class130.field849, var65, toComponent, fromComponent);
					field2095 = new class84(class76.field537, var16, toComponent, fromComponent);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3199 == var1.serverPacket) {
					fromComponent = var4.readUnsignedShortLEADD();
					toComponent = var4.readUnsignedShortLE();
					class483.method2223(toComponent, fromComponent);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3206) {
					method1432(false, var4);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3205) {
					var10 = var4.readUnsignedShortLEADD();
					var11 = var4.readUnsignedByteNEG();
					var7 = var4.method2504();
					toComponent = var7 >> 16;
					fromComponent = var7 >> 8 & 255;
					var8 = (var7 >> 4 & 7) + toComponent;
					var32 = (var7 & 7) + fromComponent;
					var42 = var4.readUnsignedShortADD();
					if (var8 >= 0 && var32 >= 0 && var8 < 104 && var32 < 104) {
						var8 = var8 * 128 + 64;
						var32 = 64 + var32 * 128;
						class473 var64 = new class473(var10, class212.field1393, var8, var32, method1347(var8, var32, class212.field1393) - var11, var42, field1846);
						field1973.method323(var64);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3178 == var1.serverPacket) {
					toComponent = var4.readUnsignedByte();
					class176.method923(toComponent);
					var1.serverPacket = null;
					return true;
				}

				String var24;
				if (ServerPacket.field3184 == var1.serverPacket) {
					var24 = var4.readStringOrNull();
					Object[] var87 = new Object[var24.length() + 1];

					for (var7 = var24.length() - 1; var7 >= 0; --var7) {
						if (var24.charAt(var7) == 's') {
							var87[var7 + 1] = var4.readStringOrNull();
						} else {
							var87[var7 + 1] = new Integer(var4.readInt());
						}
					}

					var87[0] = new Integer(var4.readInt());
					class376 var82 = new class376();
					var82.field2594 = var87;
					class440.method2027(var82);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3227 == var1.serverPacket) {
					field1831 = field1977;
					var26 = var4.readByte();
					class328 var86 = new class328(var4);
					class398 var80;
					if (var26 >= 0) {
						var80 = field2074[var26];
					} else {
						var80 = class455.field3020;
					}

					if (null == var80) {
						this.method1295(var26);
						var1.serverPacket = null;
						return true;
					}

					if (var86.field2345 > var80.field2742) {
						this.method1295(var26);
						var1.serverPacket = null;
						return true;
					}

					if (var86.field2345 < var80.field2742) {
						var1.serverPacket = null;
						return true;
					}

					var86.method1592(var80);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENTOP == var1.serverPacket) {
					toComponent = var4.readUnsignedShortADD();
					if (toComponent == 65535) {
						toComponent = -1;
					}

					rootInterface = toComponent;
					this.method1292(false);
					method1434(toComponent);
					class440.method2063(rootInterface);

					for (fromComponent = 0; fromComponent < 100; ++fromComponent) {
						field2051[fromComponent] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var13;
				if (var1.serverPacket == ServerPacket.field3191) {
					var24 = var4.readStringOrNull();
					var29 = (long)var4.readUnsignedShort();
					var30 = (long)var4.readUnsignedMedium();
					class435 var74 = (class435)class26.method87(class435.method1985(), var4.readUnsignedByte());
					long var71 = var30 + (var29 << 32);
					var13 = false;

					for (var58 = 0; var58 < 100; ++var58) {
						if (var71 == field2065[var58]) {
							var13 = true;
							break;
						}
					}

					if (class35.field176.method375(new class509(var24, class474.field3325))) {
						var13 = true;
					}

					if (!var13 && field2102 == 0) {
						field2065[field2066] = var71;
						field2066 = (1 + field2066) % 100;
						var63 = class229.method1036(class385.method1810(class380.method1792(var4)));
						byte var78;
						if (var74.field2929) {
							var78 = 7;
						} else {
							var78 = 3;
						}

						if (var74.field2928 != -1) {
							class346.method1672(var78, class274.method1267(var74.field2928) + var24, var63);
						} else {
							class346.method1672(var78, var24, var63);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3209 == var1.serverPacket) {
					toComponent = var4.readShort();
					fromComponent = var4.readUnsignedIntLE();
					var7 = var4.method2514();
					var38 = class208.interfaceConfigs.method345(fromComponent);
					if (toComponent != var38.field3534 || var38.field3535 != var7 || var38.field3647 != 0 || var38.field3531 != 0) {
						var38.field3534 = toComponent;
						var38.field3535 = var7;
						var38.field3647 = 0;
						var38.field3531 = 0;
						method1363(var38);
						this.method1288(var38);
						if (var38.field3527 == 0) {
							class145.method788(class208.interfaceConfigs.components[fromComponent >> 16], var38, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3287) {
					toComponent = var4.readInt();
					fromComponent = var4.readUnsignedByteSUB();
					var7 = var4.readUnsignedByte();
					var38 = class208.interfaceConfigs.method345(toComponent);
					class496.method2341(var38, var7, fromComponent);
					method1363(var38);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3210 == var1.serverPacket) {
					toComponent = var4.readUnsignedShortADD();
					fromComponent = var4.readInt();
					var7 = toComponent >> 10 & 31;
					var8 = toComponent >> 5 & 31;
					var32 = toComponent & 31;
					var10 = (var7 << 19) + (var8 << 11) + (var32 << 3);
					class496 var69 = class208.interfaceConfigs.method345(fromComponent);
					if (var69.field3550 != var10) {
						var69.field3550 = var10;
						method1363(var69);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3213 == var1.serverPacket) {
					toComponent = var4.readUnsignedShortLE();
					byte var84 = var4.readByte();
					class119.field785[toComponent] = var84;
					if (var84 != class119.field786[toComponent]) {
						class119.field786[toComponent] = var84;
					}

					method1329(toComponent);
					field2028[++field1944 - 1 & 31] = toComponent;
					var1.serverPacket = null;
					return true;
				}

				boolean var56;
				if (ServerPacket.field3201 == var1.serverPacket) {
					toComponent = var4.readUnsignedIntME();
					var56 = var4.readUnsignedByte() == 1;
					var31 = class208.interfaceConfigs.method345(toComponent);
					class496.method2345(var31, class114.field720.field2989, var56);
					method1363(var31);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3254 == var1.serverPacket) {
					toComponent = var4.readUnsignedShortADD();
					if (toComponent == 65535) {
						toComponent = -1;
					}

					var10 = var4.readUnsignedShort();
					var8 = var4.readUnsignedShortADD();
					var32 = var4.readUnsignedShortLEADD();
					var7 = var4.readUnsignedShortADD();
					fromComponent = var4.readUnsignedShortLEADD();
					if (fromComponent == 65535) {
						fromComponent = -1;
					}

					ArrayList var67 = new ArrayList();
					var67.add(toComponent);
					var67.add(fromComponent);
					method1393(var67, var7, var8, var32, var10);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3263) {
					return this.method1302(var1);
				}

				if (ServerPacket.field3281 == var1.serverPacket) {
					method1346(class310.field2251);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3195) {
					method1346(class310.field2248);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3232) {
					class116.field724 = null;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3272) {
					method1346(class310.field2246);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3259 == var1.serverPacket) {
					toComponent = var4.readUnsignedShort();
					fromComponent = var4.readUnsignedByte();
					var7 = var4.readUnsignedShort();
					method1456(toComponent, fromComponent, var7);
					var1.serverPacket = null;
					return true;
				}

				long var53;
				if (var1.serverPacket == ServerPacket.field3288) {
					toComponent = var4.offset + var1.field4222;
					fromComponent = var4.readUnsignedShort();
					if (fromComponent == 65535) {
						fromComponent = -1;
					}

					var7 = var4.readUnsignedShort();
					if (fromComponent != rootInterface) {
						rootInterface = fromComponent;
						this.method1292(false);
						method1434(rootInterface);
						class440.method2063(rootInterface);

						for (var8 = 0; var8 < 100; ++var8) {
							field2051[var8] = true;
						}
					}

					InterfaceComponent var57;
					for (; var7-- > 0; var57.field2205 = true) {
						var8 = var4.readInt();
						var32 = var4.readUnsignedShort();
						var10 = var4.readUnsignedByte();
						var57 = (InterfaceComponent) interfaceComponents.get((long)var8);
						if (var57 != null && var32 != var57.group) {
							closeInterface(var57, true);
							var57 = null;
						}

						if (null == var57) {
							var57 = class398.method1857(var8, var32, var10);
						}
					}

					for (fromInterfComp = (InterfaceComponent) interfaceComponents.method1753(); fromInterfComp != null; fromInterfComp = (InterfaceComponent) interfaceComponents.method1754()) {
						if (fromInterfComp.field2205) {
							fromInterfComp.field2205 = false;
						} else {
							closeInterface(fromInterfComp, true);
						}
					}

					field2048 = new class375(512);

					while (var4.offset < toComponent) {
						var8 = var4.readInt();
						var32 = var4.readUnsignedShort();
						var10 = var4.readUnsignedShort();
						var11 = var4.readInt();

						for (var42 = var32; var42 <= var10; ++var42) {
							var53 = ((long)var8 << 32) + (long)var42;
							field2048.put(new class252(var11), var53);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					class264.readPlayerUpdates(var4, var1.field4222);
					method1338();
					var1.serverPacket = null;
					return true;
				}

				boolean var27;
				if (var1.serverPacket == ServerPacket.field3219) {
					var27 = var4.readUnsignedByte() == 1;
					if (var27) {
						class101.field660 = class38.method108() - var4.readLong();
						class119.field787 = new class183(var4, true);
					} else {
						class119.field787 = null;
					}

					field2056 = field1977;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3173) {
					class458.field3045 = var4.readUnsignedByte();
					class391.field2669 = var4.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3186) {
					toComponent = var4.readInt();
					fromComponent = var4.readInt();
					var31 = class208.interfaceConfigs.method345(fromComponent);
					class496.method2344(var31, toComponent);
					method1363(var31);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3185 == var1.serverPacket) {
					var10 = var4.readUnsignedByteNEG();
					var11 = var10 >> 2;
					var42 = var10 & 3;
					var49 = field1909[var11];
					var7 = var4.method2503();
					toComponent = var7 >> 16;
					fromComponent = var7 >> 8 & 255;
					var8 = toComponent + (var7 >> 4 & 7);
					var32 = (var7 & 7) + fromComponent;
					var58 = var4.readUnsignedShortLEADD();
					if (var8 >= 0 && var32 >= 0 && var8 < 103 && var32 < 103) {
						if (var49 == 0) {
							class493 var76 = class141.field937.method747(class212.field1393, var8, var32);
							if (null != var76) {
								var16 = class503.method2376(var76.field3513);
								if (var11 == 2) {
									var76.field3510 = new class525(var16, 2, var42 + 4, class212.field1393, var8, var32, var58, false, var76.field3510);
									var76.field3511 = new class525(var16, 2, var42 + 1 & 3, class212.field1393, var8, var32, var58, false, var76.field3511);
								} else {
									var76.field3510 = new class525(var16, var11, var42, class212.field1393, var8, var32, var58, false, var76.field3510);
								}
							}
						} else if (var49 == 1) {
							class76 var73 = class141.field937.method748(class212.field1393, var8, var32);
							if (null != var73) {
								var16 = class503.method2376(var73.field536);
								if (var11 != 4 && var11 != 5) {
									if (var11 == 6) {
										var73.field539 = new class525(var16, 4, var42 + 4, class212.field1393, var8, var32, var58, false, var73.field539);
									} else if (var11 == 7) {
										var73.field539 = new class525(var16, 4, 4 + (var42 + 2 & 3), class212.field1393, var8, var32, var58, false, var73.field539);
									} else if (var11 == 8) {
										var73.field539 = new class525(var16, 4, var42 + 4, class212.field1393, var8, var32, var58, false, var73.field539);
										var73.field527 = new class525(var16, 4, 4 + (var42 + 2 & 3), class212.field1393, var8, var32, var58, false, var73.field527);
									}
								} else {
									var73.field539 = new class525(var16, 4, var42, class212.field1393, var8, var32, var58, false, var73.field539);
								}
							}
						} else if (var49 == 2) {
							class486 var68 = class141.field937.method782(class212.field1393, var8, var32);
							if (var11 == 11) {
								var11 = 10;
							}

							if (null != var68) {
								var68.field3411 = new class525(class503.method2376(var68.field3418), var11, var42, class212.field1393, var8, var32, var58, false, var68.field3411);
							}
						} else if (var49 == 3) {
							class553 var70 = class141.field937.method783(class212.field1393, var8, var32);
							if (null != var70) {
								var70.field4312 = new class525(class503.method2376(var70.field4310), 22, var42, class212.field1393, var8, var32, var58, false, var70.field4312);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3239 == var1.serverPacket) {
					fromComponent = var4.readUnsignedShortLE();
					var8 = var4.readUnsignedByteNEG();
					toComponent = var4.readUnsignedShortADD();
					Player var51;
					if (toComponent == field1958) {
						var51 = class114.field720;
					} else {
						var51 = field2037[toComponent];
					}

					var7 = var4.readInt();
					if (var51 != null) {
						var51.method292(var8, fromComponent, var7 >> 16, var7 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3245) {
					toComponent = var4.readInt();
					var56 = var4.readUnsignedByte() == 1;
					var31 = class208.interfaceConfigs.method345(toComponent);
					if (var56 != var31.field3545) {
						var31.field3545 = var56;
						method1363(var31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3208) {
					toComponent = var4.readUnsignedShortADD();
					fromComponent = var4.readUnsignedShort();
					var7 = var4.readUnsignedShortLEADD();
					var8 = var4.readUnsignedShortADD();
					class483.method2222(toComponent, fromComponent, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3257) {
					field1952 = var4.readUnsignedShortLE() * 30;
					field2041 = field1977;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3248) {
					toComponent = var4.readUnsignedIntLE();
					fromComponent = var4.readUnsignedShortLEADD();
					var31 = class208.interfaceConfigs.method345(toComponent);
					if (var31 != null && var31.field3527 == 0) {
						if (fromComponent > var31.field3622 - var31.field3541) {
							fromComponent = var31.field3622 - var31.field3541;
						}

						if (fromComponent < 0) {
							fromComponent = 0;
						}

						if (var31.field3547 != fromComponent) {
							var31.field3547 = fromComponent;
							method1363(var31);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3187) {
					toComponent = var4.readUnsignedIntLE();
					fromComponent = var4.readUnsignedShortLEADD();
					if (fromComponent == 65535) {
						fromComponent = -1;
					}

					var7 = var4.readUnsignedShort();
					if (var7 == 65535) {
						var7 = -1;
					}

					var8 = var4.readUnsignedIntME();

					for (var32 = var7; var32 <= fromComponent; ++var32) {
						var37 = ((long)var8 << 32) + (long)var32;
						class359 var52 = field2048.get(var37);
						if (var52 != null) {
							var52.method1719();
						}

						field2048.put(new class252(toComponent), var37);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3168 == var1.serverPacket) {
					toComponent = var4.readUnsignedShortLE();
					if (toComponent == 65535) {
						toComponent = -1;
					}

					class27.method90(toComponent);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3179 == var1.serverPacket) {
					toComponent = var4.readUnsignedShortADD();
					if (toComponent == 65535) {
						toComponent = -1;
					}

					fromComponent = var4.method2503();
					method1450(toComponent, fromComponent);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3231 == var1.serverPacket) {
					class426 var77 = new class426();
					var77.field2865 = var4.readStringOrNull();
					var77.field2870 = var4.readUnsignedShort();
					fromComponent = var4.readInt();
					var77.field2869 = fromComponent;
					if (var77.method1929()) {
						var77.field2871 = "beta";
					}

					class432.method1954(45);
					var3.method406();
					var3 = null;
					class410.method1894(var77);
					var1.serverPacket = null;
					return false;
				}

				class378 var43;
				if (var1.serverPacket == ServerPacket.field3174) {
					toComponent = var4.readUnsignedShortADD();
					short var60 = (short)var4.method2501();
					var7 = var4.readUnsignedIntLE();
					var8 = var4.readUnsignedByteNEG();
					var43 = field2017[toComponent];
					if (var43 != null) {
						var43.method1776(var8, var7, var60);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3226 == var1.serverPacket) {
					var24 = var4.readStringOrNull();
					fromComponent = var4.readUnsignedByte();
					var7 = var4.readUnsignedByteNEG();
					if (fromComponent >= 1 && fromComponent <= 8) {
						if (var24.equalsIgnoreCase(class513.field3757)) {
							var24 = null;
						}

						field2090[fromComponent - 1] = var24;
						field1967[fromComponent - 1] = var7 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3203) {
					fromComponent = var4.readUnsignedIntLE();
					var7 = var4.readUnsignedShortLE();
					var8 = var4.readUnsignedByte();
					toComponent = var4.readUnsignedShort();
					var43 = field2017[toComponent];
					if (null != var43) {
						var43.method292(var8, var7, fromComponent >> 16, fromComponent & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3198 == var1.serverPacket) {
					for (toComponent = 0; toComponent < field2037.length; ++toComponent) {
						if (field2037[toComponent] != null) {
							field2037[toComponent].field373 = -1;
						}
					}

					for (toComponent = 0; toComponent < field2017.length; ++toComponent) {
						if (field2017[toComponent] != null) {
							field2017[toComponent].field373 = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3176) {
					field1840 = var4.readUnsignedByte();
					if (field1840 == 255) {
						field1840 = 0;
					}

					field2081 = var4.readUnsignedByte();
					if (field2081 == 255) {
						field2081 = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3277 == var1.serverPacket) {
					if (null == class116.field724) {
						class116.field724 = new class174(class214.field1401);
					}

					class55 var55 = class214.field1401.method2194(var4);
					class116.field724.field1222.method817(var55.field252, var55.field251);
					field2032[++field2033 - 1 & 31] = var55.field252;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3222) {
					toComponent = var4.method2522();
					var56 = var4.readUnsignedByte() == 1;
					var47 = "";
					boolean var44 = false;
					if (var56) {
						var47 = var4.readStringOrNull();
						if (class35.field176.method375(new class509(var47, class474.field3325))) {
							var44 = true;
						}
					}

					String var40 = var4.readStringOrNull();
					if (!var44) {
						class346.method1672(toComponent, var47, var40);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3200 == var1.serverPacket) {
					class458.field3045 = var4.readUnsignedByte();
					class391.field2669 = var4.readUnsignedByteSUB();

					while (var4.offset < var1.field4222) {
						toComponent = var4.readUnsignedByte();
						class310 var54 = class310.method1568()[toComponent];
						method1346(var54);
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3268) {
					toComponent = var4.readInt();
					fromComponent = var4.readUnsignedShort();
					if (toComponent < -70000) {
						fromComponent += 32768;
					}

					if (toComponent >= 0) {
						var31 = class208.interfaceConfigs.method345(toComponent);
					} else {
						var31 = null;
					}

					for (; var4.offset < var1.field4222; class482.method2210(fromComponent, var8, var32 - 1, var10)) {
						var8 = var4.method2522();
						var32 = var4.readUnsignedShort();
						var10 = 0;
						if (var32 != 0) {
							var10 = var4.readUnsignedByte();
							if (var10 == 255) {
								var10 = var4.readInt();
							}
						}

						if (null != var31 && var8 >= 0 && var8 < var31.field3633.length) {
							var31.field3633[var8] = var32;
							var31.field3654[var8] = var10;
						}
					}

					if (var31 != null) {
						method1363(var31);
					}

					method1426();
					field1989[++field1915 - 1 & 31] = fromComponent & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3225) {
					class35.field176.method371();
					field2035 = field1977;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3249) {
					method1346(class310.field2253);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3164 == var1.serverPacket) {
					var4.offset += 28;
					if (var4.checkCrc()) {
						method1326(var4, var4.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3221 == var1.serverPacket) {
					toComponent = var4.readInt();
					fromComponent = var4.readUnsignedShortADD();
					var31 = class208.interfaceConfigs.method345(toComponent);
					if (var31.field3568 != 2 || var31.field3521 != fromComponent) {
						var31.field3568 = 2;
						var31.field3521 = fromComponent;
						method1363(var31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3202) {
					toComponent = var4.readUnsignedIntIME();
					fromComponent = var4.readUnsignedShortLE();
					var7 = var4.readUnsignedShort();
					var38 = class208.interfaceConfigs.method345(toComponent);
					var38.field3580 = fromComponent + (var7 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3278) {
					toComponent = var4.readInt();
					if (toComponent != field1861) {
						field1861 = toComponent;
						method1374();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3242 == var1.serverPacket) {
					class9.method45(var4, var1.field4222);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3212 == var1.serverPacket) {
					toComponent = var4.readInt();
					InterfaceComponent var41 = (InterfaceComponent) interfaceComponents.get((long) toComponent);
					if (var41 != null) {
						closeInterface(var41, true);
					}

					if (field1936 != null) {
						method1363(field1936);
						field1936 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3217 == var1.serverPacket) {
					toComponent = var4.readInt();
					fromComponent = var4.readUnsignedShort();
					if (toComponent < -70000) {
						fromComponent += 32768;
					}

					if (toComponent >= 0) {
						var31 = class208.interfaceConfigs.method345(toComponent);
					} else {
						var31 = null;
					}

					if (null != var31) {
						for (var8 = 0; var8 < var31.field3633.length; ++var8) {
							var31.field3633[var8] = 0;
							var31.field3654[var8] = 0;
						}
					}

					class482.method2211(fromComponent);
					var8 = var4.readUnsignedShort();

					for (var32 = 0; var32 < var8; ++var32) {
						var10 = var4.readUnsignedByte();
						if (var10 == 255) {
							var10 = var4.readUnsignedIntME();
						}

						var11 = var4.readUnsignedShort();
						if (var31 != null && var32 < var31.field3633.length) {
							var31.field3633[var32] = var11;
							var31.field3654[var32] = var10;
						}

						class482.method2210(fromComponent, var32, var11 - 1, var10);
					}

					if (var31 != null) {
						method1363(var31);
					}

					method1426();
					field1989[++field1915 - 1 & 31] = fromComponent & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3190 == var1.serverPacket) {
					method1426();
					toComponent = var4.readUnsignedByte();
					fromComponent = var4.readUnsignedByteSUB();
					var7 = var4.readUnsignedIntME();
					field1976[toComponent] = var7;
					field1877[toComponent] = fromComponent;
					field1970[toComponent] = 1;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var7 >= class538.field4206[var8]) {
							field1970[toComponent] = var8 + 2;
						}
					}

					field2030[++field1918 - 1 & 31] = toComponent;
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3215) {
					return this.method1298(var1, 2);
				}

				if (ServerPacket.field3235 == var1.serverPacket) {
					method1346(class310.field2245);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3175) {
					field1853 = var4.readUnsignedByte();
					if (field1853 == 1) {
						field1854 = var4.readUnsignedShort();
					}

					if (field1853 >= 2 && field1853 <= 6) {
						if (field1853 == 2) {
							field1942 = 64;
							field2109 = 64;
						}

						if (field1853 == 3) {
							field1942 = 0;
							field2109 = 64;
						}

						if (field1853 == 4) {
							field1942 = 128;
							field2109 = 64;
						}

						if (field1853 == 5) {
							field1942 = 64;
							field2109 = 0;
						}

						if (field1853 == 6) {
							field1942 = 64;
							field2109 = 128;
						}

						field1853 = 2;
						field1896 = var4.readUnsignedShort();
						field1857 = var4.readUnsignedShort();
						field1858 = var4.readUnsignedByte();
					}

					if (field1853 == 10) {
						field1855 = var4.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3207) {
					class35.field176.method383(var4, var1.field4222);
					field2035 = field1977;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3264 == var1.serverPacket) {
					toComponent = var4.readUnsignedIntME();
					fromComponent = var4.readUnsignedShortLE();
					class119.field785[fromComponent] = toComponent;
					if (class119.field786[fromComponent] != toComponent) {
						class119.field786[fromComponent] = toComponent;
					}

					method1329(fromComponent);
					field2028[++field1944 - 1 & 31] = fromComponent;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION_NORMAL == var1.serverPacket) {
					rebuildRegionNormal(false, var1.field4220);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3266) {
					class458.field3045 = var4.readUnsignedByte();
					class391.field2669 = var4.readUnsignedByteNEG();

					for (toComponent = class458.field3045; toComponent < class458.field3045 + 8; ++toComponent) {
						for (fromComponent = class391.field2669; fromComponent < class391.field2669 + 8; ++fromComponent) {
							if (field2000[class212.field1393][toComponent][fromComponent] != null) {
								field2000[class212.field1393][toComponent][fromComponent] = null;
								method1314(toComponent, fromComponent);
							}
						}
					}

					for (class145 var35 = (class145)field1971.method327(); var35 != null; var35 = (class145)field1971.method331()) {
						if (var35.field1007 >= class458.field3045 && var35.field1007 < class458.field3045 + 8 && var35.field1004 >= class391.field2669 && var35.field1004 < 8 + class391.field2669 && class212.field1393 == var35.field1006) {
							var35.field1015 = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3228 == var1.serverPacket) {
					field2080 = true;
					field2038 = false;
					field2092 = true;
					toComponent = var4.readShort();
					fromComponent = var4.readShort();
					var7 = method1358(class130.field849 + fromComponent & 2027);
					var8 = class76.field537 + toComponent;
					var32 = var4.readUnsignedShort();
					var10 = var4.readUnsignedByte();
					field2096 = new class84(class130.field849, var7, var32, var10);
					field2095 = new class84(class76.field537, var8, var32, var10);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3214 == var1.serverPacket) {
					class41.field203 = class192.method945(var4.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3285) {
					var49 = var4.readUnsignedShortADD();
					var7 = var4.method2503();
					toComponent = var7 >> 16;
					fromComponent = var7 >> 8 & 255;
					var8 = (var7 >> 4 & 7) + toComponent;
					var32 = fromComponent + (var7 & 7);
					var19 = var4.readUnsignedShortLEADD();
					var58 = var4.readUnsignedByteNEG() * 4;
					var39 = var4.readByteNEG();
					var46 = var4.readByteADD();
					var17 = var4.readUnsignedShortADD();
					var16 = var4.readUnsignedShortLEADD();
					var42 = var4.readMedium();
					var18 = var4.readUnsignedByteSUB();
					var65 = var4.readUnsignedByteADD() * 4;
					var10 = var39 + var8;
					var11 = var46 + var32;
					if (var8 >= 0 && var32 >= 0 && var8 < 104 && var32 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var49 != 65535) {
						var8 = 64 + var8 * 128;
						var32 = 64 + var32 * 128;
						var10 = 64 + var10 * 128;
						var11 = 64 + var11 * 128;
						var20 = new class404(var49, class212.field1393, var8, var32, method1347(var8, var32, class212.field1393) - var58, var16 + field1846, field1846 + var17, var18, var19, var42, var65);
						var20.method1864(var10, var11, method1347(var10, var11, class212.field1393) - var65, field1846 + var16);
						field1972.method323(var20);
					}

					var1.serverPacket = null;
					return true;
				}

				String var62;
				if (ServerPacket.field3172 == var1.serverPacket) {
					var24 = var4.readStringOrNull();
					var29 = var4.readLong();
					var30 = (long)var4.readUnsignedShort();
					var37 = (long)var4.readUnsignedMedium();
					class435 var50 = (class435)class26.method87(class435.method1985(), var4.readUnsignedByte());
					var53 = (var30 << 32) + var37;
					boolean var59 = false;

					for (var16 = 0; var16 < 100; ++var16) {
						if (var53 == field2065[var16]) {
							var59 = true;
							break;
						}
					}

					if (var50.field2916 && class35.field176.method375(new class509(var24, class474.field3325))) {
						var59 = true;
					}

					if (!var59 && field2102 == 0) {
						field2065[field2066] = var53;
						field2066 = (field2066 + 1) % 100;
						var62 = class229.method1036(class385.method1810(class380.method1792(var4)));
						if (var50.field2928 != -1) {
							class346.method1668(9, class274.method1267(var50.field2928) + var24, var62, class132.method612(var29));
						} else {
							class346.method1668(9, var24, var62, class132.method612(var29));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3243 == var1.serverPacket && field2080) {
					field2038 = true;
					field2092 = false;
					field2091 = false;

					for (toComponent = 0; toComponent < 5; ++toComponent) {
						field2098[toComponent] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3196) {
					toComponent = var4.method2527();
					fromComponent = var4.readUnsignedIntME();
					var31 = class208.interfaceConfigs.method345(fromComponent);
					if (var31.field3610 != toComponent || toComponent == -1) {
						var31.field3610 = toComponent;
						var31.field3657 = 0;
						var31.field3658 = 0;
						method1363(var31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3183 == var1.serverPacket) {
					var27 = var4.readBoolean();
					if (var27) {
						if (class76.field535 == null) {
							class76.field535 = new class286();
						}
					} else {
						class76.field535 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3238 == var1.serverPacket) {
					var26 = var4.readByte();
					var6 = var4.readStringOrNull();
					long var28 = (long)var4.readUnsignedShort();
					long var33 = (long)var4.readUnsignedMedium();
					class435 var45 = (class435)class26.method87(class435.method1985(), var4.readUnsignedByte());
					long var48 = (var28 << 32) + var33;
					boolean var14 = false;
					class398 var15 = null;
					var15 = var26 >= 0 ? field2074[var26] : class455.field3020;
					if (null == var15) {
						var14 = true;
					} else {
						var16 = 0;

						while (true) {
							if (var16 >= 100) {
								if (var45.field2916 && class35.field176.method375(new class509(var6, class474.field3325))) {
									var14 = true;
								}
								break;
							}

							if (field2065[var16] == var48) {
								var14 = true;
								break;
							}

							++var16;
						}
					}

					if (!var14) {
						field2065[field2066] = var48;
						field2066 = (1 + field2066) % 100;
						var62 = class229.method1036(class380.method1792(var4));
						var17 = var26 >= 0 ? 41 : 44;
						if (var45.field2928 != -1) {
							class346.method1668(var17, class274.method1267(var45.field2928) + var6, var62, var15.field2741);
						} else {
							class346.method1668(var17, var6, var62, var15.field2741);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3267) {
					field2080 = true;
					field2038 = false;
					field2091 = true;
					class393.field2672 = var4.readUnsignedByte();
					class316.field2301 = var4.readUnsignedByte();
					toComponent = var4.readUnsignedShort();
					fromComponent = var4.readUnsignedShort();
					field2093 = var4.readBoolean();
					var7 = var4.readUnsignedByte();
					var8 = class393.field2672 * 128 + 64;
					var32 = class316.field2301 * 128 + 64;
					boolean var34 = false;
					boolean var36 = false;
					if (field2093) {
						var10 = class122.field794;
						var11 = method1347(var8, var32, class212.field1393) - toComponent;
					} else {
						var10 = method1347(field2135, class353.field2437, class212.field1393) - class122.field794;
						var11 = toComponent;
					}

					field2094 = new class309(field2135, class353.field2437, var10, var8, var32, var11, fromComponent, var7);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3258) {
					for (toComponent = 0; toComponent < class119.field786.length; ++toComponent) {
						if (class119.field785[toComponent] != class119.field786[toComponent]) {
							class119.field786[toComponent] = class119.field785[toComponent];
							method1329(toComponent);
							field2028[++field1944 - 1 & 31] = toComponent;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3193) {
					toComponent = var4.readUnsignedByte();
					method1303(toComponent);
					var1.serverPacket = null;
					return false;
				}

				if (var1.serverPacket == ServerPacket.field3252) {
					field2080 = true;
					field2038 = false;
					field2091 = true;
					class393.field2672 = var4.readUnsignedByte();
					class316.field2301 = var4.readUnsignedByte();
					toComponent = var4.readUnsignedShort();
					fromComponent = var4.readUnsignedByte() * 128 + 64;
					var7 = var4.readUnsignedByte() * 128 + 64;
					var8 = var4.readUnsignedShort();
					field2093 = var4.readBoolean();
					var32 = var4.readUnsignedByte();
					var10 = 64 + class393.field2672 * 128;
					var11 = class316.field2301 * 128 + 64;
					var12 = false;
					var13 = false;
					if (field2093) {
						var42 = class122.field794;
						var49 = method1347(var10, var11, class212.field1393) - toComponent;
					} else {
						var42 = method1347(field2135, class353.field2437, class212.field1393) - class122.field794;
						var49 = toComponent;
					}

					field2094 = new class92(field2135, class353.field2437, var42, var10, var11, var49, fromComponent, var7, var8, var32);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3233) {
					method1395();
					var1.serverPacket = null;
					return false;
				}

				if (var1.serverPacket == ServerPacket.field3274) {
					field2080 = true;
					field2038 = false;
					field2091 = false;
					class393.field2672 = var4.readUnsignedByte();
					class316.field2301 = var4.readUnsignedByte();
					class323.field2339 = var4.readUnsignedShort();
					class250.field1718 = var4.readUnsignedByte();
					class16.field86 = var4.readUnsignedByte();
					if (class16.field86 >= 100) {
						field2135 = 64 + class393.field2672 * 128;
						class353.field2437 = 64 + class316.field2301 * 128;
						class122.field794 = method1347(field2135, class353.field2437, class212.field1393) - class323.field2339;
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3189) {
					var24 = var4.readStringOrNull();
					var6 = class229.method1036(class385.method1810(class380.method1792(var4)));
					class346.method1672(6, var24, var6);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3260) {
					method1323(var4.readStringOrNull());
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3271) {
					toComponent = var4.readUnsignedShort();
					fromComponent = var4.readUnsignedIntLE();
					var7 = var4.readUnsignedShort();
					var8 = var4.readUnsignedShortLEADD();
					var9 = class208.interfaceConfigs.method345(fromComponent);
					if (var9.field3575 != toComponent || var9.field3522 != var8 || var7 != var9.field3570) {
						var9.field3575 = toComponent;
						var9.field3522 = var8;
						var9.field3570 = var7;
						method1363(var9);
					}

					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3240) {
					method1346(class310.field2249);
					var1.serverPacket = null;
					return true;
				}

				if (var1.serverPacket == ServerPacket.field3265) {
					method1346(class310.field2243);
					var1.serverPacket = null;
					return true;
				}

				class2.method1("" + (var1.serverPacket != null ? var1.serverPacket.opcode : -1) + class274.field1825 + (null != var1.field4215 ? 1495788863 * var1.field4215.opcode * -800816449 : -1) + class274.field1825 + (var1.field4228 != null ? var1.field4228.opcode : -1) + class274.field1825 + var1.field4222, (Throwable)null);
				method1395();
			} catch (IOException var21) {
				method1352();
			} catch (Exception var22) {
				var6 = "" + (null != var1.serverPacket ? var1.serverPacket.opcode : -1) + class274.field1825 + (null != var1.field4215 ? 1495788863 * var1.field4215.opcode * -800816449 : -1) + class274.field1825 + (var1.field4228 != null ? var1.field4228.opcode : -1) + class274.field1825 + var1.field4222 + class274.field1825 + (class80.selectedTileX + class114.field720.field399[0]) + class274.field1825 + (class425.selectedTileXYIdk + class114.field720.field400[0]) + class274.field1825;

				for (var7 = 0; var7 < var1.field4222 && var7 < 50; ++var7) {
					var6 = var6 + var4.data[var7] + class274.field1825;
				}

				class2.method1(var6, var22);
				method1395();
			}

			return true;
		}
	}

	final void method1297(byte var1) {
		boolean var2 = false;

		int var3;
		int var6;
		while (!var2) {
			var2 = true;

			for (var3 = 0; var3 < field1979 - 1; ++var3) {
				if (field1982[var3] < 1000 && field1982[var3 + 1] > 1000) {
					String var4 = field1986[var3];
					field1986[var3] = field1986[var3 + 1];
					field1986[var3 + 1] = var4;
					String var5 = field1985[var3];
					field1985[var3] = field1985[var3 + 1];
					field1985[var3 + 1] = var5;
					var6 = field1982[var3];
					field1982[var3] = field1982[var3 + 1];
					field1982[var3 + 1] = var6;
					var6 = field2070[var3];
					field2070[var3] = field2070[var3 + 1];
					field2070[var3 + 1] = var6;
					var6 = field1981[var3];
					field1981[var3] = field1981[var3 + 1];
					field1981[var3 + 1] = var6;
					var6 = field1983[var3];
					field1983[var3] = field1983[var3 + 1];
					field1983[var3 + 1] = var6;
					var6 = field1984[var3];
					field1984[var3] = field1984[var3 + 1];
					field1984[var3 + 1] = var6;
					boolean var7 = field1987[var3];
					field1987[var3] = field1987[var3 + 1];
					field1987[var3 + 1] = var7;
					var2 = false;
				}
			}
		}

		if (field2014 == null) {
			int var11 = class316.field2316;
			if (field1978) {
				int var12;
				if (var11 != 1 && (class108.field685 || var11 != 4)) {
					var3 = class316.field2309;
					var12 = class316.field2315;
					if (var3 < class263.field1759 - 10 || var3 > class382.field2640 + class263.field1759 + 10 || var12 < class24.field125 - 10 || var12 > class24.field125 + class66.field407 + 10) {
						field1978 = false;
						method1305(class263.field1759, class24.field125, class382.field2640, class66.field407);
					}
				}

				if (var11 == 1 || !class108.field685 && var11 == 4) {
					var3 = class263.field1759;
					var12 = class24.field125;
					int var13 = class382.field2640;
					var6 = class316.field2318;
					int var14 = class316.field2320;
					int var8 = -1;

					for (int var9 = 0; var9 < field1979; ++var9) {
						int var10 = var12 + 31 + 15 * (field1979 - 1 - var9);
						if (var6 > var3 && var6 < var3 + var13 && var14 > var10 - 13 && var14 < var10 + 3) {
							var8 = var9;
						}
					}

					if (var8 != -1) {
						method1447(var8);
					}

					field1978 = false;
					method1305(class263.field1759, class24.field125, class382.field2640, class66.field407);
				}
			} else {
				var3 = method1345();
				if ((var11 == 1 || !class108.field685 && var11 == 4) && this.method1294()) {
					var11 = 2;
				}

				if ((var11 == 1 || !class108.field685 && var11 == 4) && field1979 > 0) {
					method1447(var3);
				}

				if (var11 == 2 && field1979 > 0) {
					this.method1286(class316.field2318, class316.field2320);
				}
			}

		}
	}

	final boolean method1294() {
		int var2 = method1345();
		return (field2057 && field1979 > 2 || method1418(var2)) && !field1987[var2];
	}

	final void method1286(int var1, int var2) {
		method1459(var1, var2);
		var1 -= field2111;
		var2 -= field2112;
		class141.field937.method759(class212.field1393, var1, var2, false);
		field1978 = true;
	}

	final void method1292(boolean var1) {
		int var3 = rootInterface;
		int var4 = class164.field1170;
		int var5 = class92.field595;
		if (class208.interfaceConfigs.method347(var3)) {
			method1436(class208.interfaceConfigs.components[var3], -1, var4, var5, var1);
		}

	}

	void method1288(class496 var1) {
		class496 var3 = var1.field3544 == -1 ? null : class208.interfaceConfigs.method345(var1.field3544);
		int var4;
		int var5;
		if (null == var3) {
			var4 = class164.field1170;
			var5 = class92.field595;
		} else {
			var4 = var3.field3540;
			var5 = var3.field3541;
		}

		method1366(var1, var4, var5, false);
		method1469(var1, var4, var5);
	}

	final void method1289() {
		method1363(field2014);
		++class539.field4214;
		if (field1998 && field1960) {
			int var2 = class316.field2309;
			int var3 = class316.field2315;
			var2 -= field2016;
			var3 -= field1837;
			if (var2 < field2062) {
				var2 = field2062;
			}

			if (field2014.field3540 + var2 > field2015.field3540 + field2062) {
				var2 = field2015.field3540 + field2062 - field2014.field3540;
			}

			if (var3 < field2060) {
				var3 = field2060;
			}

			if (field2014.field3541 + var3 > field2015.field3541 + field2060) {
				var3 = field2060 + field2015.field3541 - field2014.field3541;
			}

			int var4 = var2 - field1867;
			int var5 = var3 - field2024;
			int var6 = field2014.field3606;
			if (class539.field4214 > field2014.field3559 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
				field2025 = true;
			}

			int var7 = var2 - field2062 + field2015.field3560;
			int var8 = field2015.field3547 + (var3 - field2060);
			class376 var9;
			if (field2014.field3620 != null && field2025) {
				var9 = new class376();
				var9.field2595 = field2014;
				var9.field2588 = var7;
				var9.field2593 = var8;
				var9.field2594 = field2014.field3620;
				class440.method2027(var9);
			}

			if (class316.field2308 == 0) {
				if (field2025) {
					if (null != field2014.field3558) {
						var9 = new class376();
						var9.field2595 = field2014;
						var9.field2588 = var7;
						var9.field2593 = var8;
						var9.field2590 = field2018;
						var9.field2594 = field2014.field3558;
						class440.method2027(var9);
					}

					if (field2018 != null && method1401(field2014) != null) {
						class341 var10 = class341.createClientPacket(ClientPacket.field3132, field1891.field4219);
						var10.buffer.writeIntLE(field2014.interfaceId);
						var10.buffer.writeShort(field2018.field3603);
						var10.buffer.writeShort(field2014.field3603);
						var10.buffer.writeInt(field2018.interfaceId);
						var10.buffer.writeShortADD(field2014.field3602);
						var10.buffer.writeShort(field2018.field3602);
						field1891.method2612(var10);
					}
				} else if (this.method1294()) {
					this.method1286(field1867 + field2016, field2024 + field1837);
				} else if (field1979 > 0) {
					method1404(field2016 + field1867, field1837 + field2024);
				}

				field2014 = null;
			}

		} else {
			if (class539.field4214 > 1) {
				if (!field2025 && field1979 > 0) {
					method1404(field1867 + field2016, field2024 + field1837);
				}

				field2014 = null;
			}

		}
	}

	@Override
	public class509 method199() {
		return null != class114.field720 ? class114.field720.field3005 : null;
	}

	void method1295(int var1) {
		if (field1841 >= 216) {
			class341 var3 = class341.createClientPacket(ClientPacket.field3049, field1891.field4219);
			var3.buffer.writeByte(var1);
			field1891.method2612(var3);
		}

	}

	void method1290(int var1) {
		if (field1841 >= 216) {
			class341 var3 = class341.createClientPacket(ClientPacket.field3088, field1891.field4219);
			var3.buffer.writeByte(var1);
			field1891.method2612(var3);
		}

	}

	static class248 method1357() {
		return class520.field4103;
	}

	static final void method1446() {
		class142.field942 = false;
		field2059 = false;
	}

	static void method1397() {
		class177.field1228 = System.getenv("JX_ACCESS_TOKEN");
		class393.field2670 = System.getenv("JX_REFRESH_TOKEN");
		class71.field456 = System.getenv("JX_SESSION_ID");
		class207.field1379 = System.getenv("JX_CHARACTER_ID");
		String var1 = System.getenv("JX_DISPLAY_NAME");
		String var2;
		if (null != var1 && !var1.isEmpty() && var1.charAt(0) != '#') {
			var2 = var1;
		} else {
			var2 = "";
		}

		class410.field2811 = var2;
	}

	public static class381 method1420() {
		return field2067;
	}

	static void method1365() {
		if (class208.field1384.method1915()) {
			class208.field1384.method1913();
		}

		initGpi();
		if (class127.field831 != null) {
			class127.field831.field2360 = false;
		}

		class127.field831 = null;
		field1891.method2610();
		if (class535.field4187 != null) {
			try {
				class535.field4187.method1953();
			} catch (Exception var3) {
			}
		}

		class535.field4187 = null;
		method1400();
		class475.method2191();
		class141.field937.method729();

		for (int var1 = 0; var1 < 4; ++var1) {
			field1906[var1].method801();
		}

		class520.field4103 = null;
		class483.method2223(0, 0);
		class483.method2229();
		field2083 = false;
		class218.method1005();
		if (class197.field1332 != null) {
			class197.field1332.method307();
		}

		class28.field143.method722();
		class106.method500();
		if (class283.field2153 != null) {
			class283.field2153.method712();
		}

		class258.method1225();
		class258.field1753 = null;
		class258.field1754 = null;
		class108.field684 = null;
		class533.method2550();
		class523.field4109 = null;
		field2129.clear();
		field2131 = 0;
		class28.field143 = new class140();
		class283.field2153 = new class389(class190.field1287.field1878, 217);

		try {
			class258.method1228("oldschool", class233.field1535, class323.field2341.field998, 0, 23);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		class523.field4109 = new class471(255, class258.field1753, class258.field1754, 500000);
		class535.field4187 = new class430();
		class190.field1287.method2588();
		field1890 = class344.field2415;
		class432.method1954(0);
	}

	static void method1430(class198 var0, String var1) {
		class542 var3 = new class542(var0, var1);
		field2129.add(var3);
		field2131 += var3.field4232;
	}

	static boolean method1319() {
		if (null != field2129 && field2130 < field2129.size()) {
			while (field2130 < field2129.size()) {
				class542 var1 = (class542)field2129.get(field2130);
				if (!var1.method2619()) {
					return false;
				}

				++field2130;
			}

			return true;
		} else {
			return true;
		}
	}

	static int method1354() {
		if (field2129 != null && field2130 < field2129.size()) {
			int var1 = 0;

			for (int var2 = 0; var2 <= field2130; ++var2) {
				var1 += ((class542)field2129.get(var2)).field4230;
			}

			return var1 * 10000 / field2131;
		} else {
			return 10000;
		}
	}

	static void method1429() {
		int var16;
		if (field1890 == class344.field2415) {
			class141.field937 = new class142(4, 104, 104, class129.field844);

			for (var16 = 0; var16 < 4; ++var16) {
				field1906[var16] = new class151(104, 104);
			}

			class313.field2271 = new class42(512, 512);
			class410.field2818 = class513.field3763;
			class410.field2817 = 5;
			field1890 = class344.field2403;
		} else if (class344.field2403 == field1890) {
			class410.field2818 = class513.field3764;
			class410.field2817 = 10;
			field1890 = class344.field2410;
		} else {
			class198 var33;
			if (class344.field2410 == field1890) {
				class358.field2470 = method1392(0, false, true, true, false);
				class514.field4063 = method1392(1, false, true, true, false);
				class323.field2337 = method1392(2, true, false, true, false);
				class494.field3514 = method1392(3, false, true, true, false);
				class174.field1221 = method1392(4, false, true, true, false);
				class522.field4107 = method1392(5, true, true, true, false);
				class151.field1049 = method1392(6, true, true, true, false);
				class77.field541 = method1392(7, false, true, true, false);
				class514.field4064 = method1392(8, false, true, true, false);
				class97.field630 = method1392(9, false, true, true, false);
				class179.field1232 = method1392(10, false, true, true, false);
				class66.field417 = method1392(11, false, true, true, false);
				class4.field13 = method1392(12, false, true, true, false);
				class408.field2805 = method1392(13, true, false, true, false);
				class87.field581 = method1392(14, false, true, true, false);
				class254.field1725 = method1392(15, false, true, true, false);
				class478.field3364 = method1392(17, true, true, true, false);
				class257.field1750 = method1392(18, false, true, true, false);
				class365.field2533 = method1392(19, false, true, true, false);
				class516.field4073 = method1392(20, false, true, true, false);
				class253.field1722 = method1392(21, false, true, true, false);
				class471 var41 = null;
				if (class258.field1753 != null) {
					var41 = new class471(22, class258.field1753, class108.field684[22], 1000000);
				}

				var33 = new class198(var41, class523.field4109, class28.field143, 22, false, true, true, true, true);
				class483.field3397 = var33;
				class410.field2818 = class513.field3765;
				class410.field2817 = 20;
				field1890 = class344.field2405;
			} else if (class344.field2405 == field1890) {
				boolean var42 = false;
				var16 = 0 + class358.field2470.method957() * 4 / 100;
				var16 += class514.field4063.method957() * 4 / 100;
				var16 += class323.field2337.method957() * 2 / 100;
				var16 += class494.field3514.method957() * 2 / 100;
				var16 += class174.field1221.method957() * 6 / 100;
				var16 += class522.field4107.method957() * 4 / 100;
				var16 += class151.field1049.method957() * 2 / 100;
				var16 += class77.field541.method957() * 54 / 100;
				var16 += class514.field4064.method957() * 2 / 100;
				var16 += class97.field630.method957() * 2 / 100;
				var16 += class179.field1232.method957() * 2 / 100;
				var16 += class66.field417.method957() * 2 / 100;
				var16 += class4.field13.method957() * 2 / 100;
				var16 += class408.field2805.method957() * 2 / 100;
				var16 += class87.field581.method957() * 2 / 100;
				var16 += class254.field1725.method957() * 2 / 100;
				var16 += class365.field2533.method957() / 100;
				var16 += class257.field1750.method957() / 100;
				var16 += class516.field4073.method957() / 100;
				var16 += class253.field1722.method957() / 100;
				var16 += class483.field3397.method957() / 100;
				var16 += class478.field3364.method956() && class478.field3364.method38() ? 1 : 0;
				if (var16 != 100) {
					if (var16 != 0) {
						class410.field2818 = class513.field3766 + var16 + "%";
					}

					class410.field2817 = 30;
				} else {
					method1430(class358.field2470, "Animations");
					method1430(class514.field4063, "Skeletons");
					method1430(class174.field1221, "Sound FX");
					method1430(class522.field4107, "Maps");
					method1430(class151.field1049, "Music Tracks");
					method1430(class77.field541, "Models");
					method1430(class514.field4064, "Sprites");
					method1430(class66.field417, "Music Jingles");
					method1430(class87.field581, "Music Samples");
					method1430(class254.field1725, "Music Patches");
					method1430(class365.field2533, "World Map");
					method1430(class257.field1750, "World Map Geography");
					method1430(class516.field4073, "World Map Ground");
					class97.field632 = new class545();
					class97.field632.method2625(class478.field3364);
					class410.field2818 = class513.field3879;
					class410.field2817 = 30;
					field1890 = class344.field2406;
				}
			} else {
				int var28;
				if (class344.field2406 == field1890) {
					class67.method319(22050, !field2059, 2);
					ArrayList var40 = new ArrayList(3);
					class430 var24 = class535.field4187;
					boolean var29 = true;
					if (class67.field437 == 0) {
						throw new IllegalStateException();
					} else {
						class67 var35;
						try {
							class67 var21 = class93.field596.method2639();
							var21.field426 = new int[(class107.field681 ? 2 : 1) * 256];
							var21.field420 = 2048;
							var21.method312();
							var21.field422 = 3072;
							if (var21.field422 > 16384) {
								var21.field422 = 16384;
							}

							var21.method308(var21.field422);
							if (class399.field2751 > 0 && class472.field3312 == null) {
								class472.field3312 = new class323();
								class504.field3702 = Executors.newScheduledThreadPool(1);
								class504.field3702.scheduleAtFixedRate(class472.field3312, 0L, 10L, TimeUnit.MILLISECONDS);
							}

							if (null != class472.field3312) {
								if (null != class472.field3312.field2338[0]) {
									throw new IllegalArgumentException();
								}

								class472.field3312.field2338[0] = var21;
							}

							var35 = var21;
						} catch (Throwable var14) {
							var35 = new class67();
						}

						class197.field1332 = var35;
						class244.field1632 = new class247();
						class247 var23 = new class247();
						var23.method1140(class244.field1632);

						for (var28 = 0; var28 < 3; ++var28) {
							class118 var38 = new class118();
							var38.method549(9, 128);
							var23.method1140(var38);
							var40.add(var38);
						}

						class197.field1332.method314(var23);
						class483.method2216(class254.field1725, class87.field581, class174.field1221, var40);
						class276.field1830 = new class388(22050, class67.field437);
						class410.field2818 = class513.field3756;
						class410.field2817 = 35;
						field1890 = class344.field2412;
						class504.field3703 = new class199(class514.field4064, class408.field2805);
					}
				} else {
					int var30;
					if (class344.field2412 == field1890) {
						class43[] var37 = new class43[]{class43.field211, class43.field216, class43.field215, class43.field212, class43.field217, class43.field213};
						var30 = var37.length;
						class199 var22 = class504.field3703;
						class43[] var27 = new class43[]{class43.field211, class43.field216, class43.field215, class43.field212, class43.field217, class43.field213};
						field1949 = var22.method966(var27);
						if (field1949.size() < var30) {
							class410.field2818 = class513.field3769 + field1949.size() * 100 / var30 + "%";
							class410.field2817 = 40;
						} else {
							class434.field2908 = (class282)field1949.get(class43.field217);
							class331.field2352 = (class282)field1949.get(class43.field211);
							class209.field1388 = (class282)field1949.get(class43.field212);
							class307.field2233 = field2049.method101();
							class410.field2818 = class513.field3770;
							class410.field2817 = 40;
							field1890 = class344.field2408;
						}
					} else {
						class198 var3;
						int var4;
						if (field1890 == class344.field2408) {
							var16 = class410.method1896(class179.field1232, class514.field4064);
							var3 = class514.field4064;
							var4 = class410.field2821.length + class410.field2844.length;
							String[] var20 = class410.field2843;

							for (var28 = 0; var28 < var20.length; ++var28) {
								String var36 = var20[var28];
								if (var3.method28(var36) != -1) {
									++var4;
								}
							}

							if (var16 < var4) {
								class410.field2818 = class513.field3771 + var16 * 100 / var4 + "%";
								class410.field2817 = 50;
							} else {
								class410.field2818 = class513.field3772;
								class410.field2817 = 50;
								class432.method1954(5);
								field1890 = class344.field2409;
							}
						} else if (class344.field2409 == field1890) {
							if (!class323.field2337.method38()) {
								class410.field2818 = class513.field3975 + class323.field2337.method964() + "%";
								class410.field2817 = 60;
							} else if (!class253.field1722.method38()) {
								class410.field2818 = class513.field3975 + (80 + class4.field13.method964() / 6) + "%";
								class410.field2817 = 60;
							} else {
								class536.method2598(class323.field2337);
								var33 = class323.field2337;
								class479.field3366 = var33;
								class11.method57(class323.field2337, class77.field541);
								class397.method1850(class323.field2337, class77.field541, field2059);
								class198 var31 = class323.field2337;
								var3 = class77.field541;
								class73.field479 = var31;
								class73.field519 = var3;
								class202.method971(class323.field2337);
								class158.method855(class323.field2337, class77.field541, field1835, class434.field2908);
								class116.method540(class323.field2337, class358.field2470, class514.field4063);
								class198 var25 = class323.field2337;
								class198 var18 = class77.field541;
								class137.field887 = var25;
								class137.field886 = var18;
								class198 var26 = class323.field2337;
								class320.field2332 = var26;
								class198 var34 = class323.field2337;
								class319.field2326 = var34;
								class319.field2324 = class319.field2326.method23(16);
								class208.interfaceConfigs = new class72(class494.field3514, class77.field541, class514.field4064, class408.field2805, class483.field3397);
								class388.method1825(class323.field2337);
								class500.method2366(class323.field2337);
								class241.method1120(class323.field2337);
								class330.method1595(class323.field2337);
								class47.method198(class323.field2337);
								class293.method1521(class323.field2337);
								class196.method952(class323.field2337);
								class161.field1159 = new class507(class138.field900, 54, class13.field75, class323.field2337);
								class214.field1401 = new class507(class138.field900, 47, class13.field75, class323.field2337);
								class208.field1384 = new class417();
								class156.method829(class323.field2337, class514.field4064, class408.field2805);
								class198 var32 = class323.field2337;
								class198 var39 = class514.field4064;
								class161.field1153 = var32;
								class161.field1151 = var39;
								class198 var43 = class323.field2337;
								class198 var44 = class514.field4064;
								class63.field318 = var44;
								if (var43.method38()) {
									class340.field2387 = var43.method23(35);
									class63.field300 = new class63[class340.field2387];

									for (int var12 = 0; var12 < class340.field2387; ++var12) {
										byte[] var13 = var43.method39(35, var12);
										class63.field300[var12] = new class63(var12);
										if (null != var13) {
											class63.field300[var12].method262(new Buffer(var13));
											class63.field300[var12].method266();
										}
									}
								}

								class410.field2818 = class513.field3774;
								class410.field2817 = 60;
								field1890 = class344.field2413;
							}
						} else if (class344.field2413 == field1890) {
							var16 = 0;
							if (class153.field1057 == null) {
								class153.field1057 = class168.method884(class514.field4064, class97.field632.field4251, 0);
							} else {
								++var16;
							}

							if (class47.field233 == null) {
								class47.field233 = class168.method884(class514.field4064, class97.field632.field4243, 0);
							} else {
								++var16;
							}

							class230[] var2;
							if (class11.field63 == null) {
								var3 = class514.field4064;
								var4 = class97.field632.field4245;
								if (!class168.method887(var3, var4, 0)) {
									var2 = null;
								} else {
									var2 = class168.method891();
								}

								class11.field63 = var2;
							} else {
								++var16;
							}

							class42[] var6;
							int var7;
							class42 var8;
							int var9;
							byte[] var10;
							int var11;
							class42[] var17;
							if (null == class472.field3311) {
								var3 = class514.field4064;
								var4 = class97.field632.field4242;
								if (!class168.method887(var3, var4, 0)) {
									var17 = null;
								} else {
									var6 = new class42[class168.field1185];
									var7 = 0;

									while (true) {
										if (var7 >= class168.field1185) {
											class345.method1664();
											var17 = var6;
											break;
										}

										var8 = var6[var7] = new class42();
										var8.field204 = class190.field1289;
										var8.field210 = class203.field1364;
										var8.field206 = class498.field3673[var7];
										var8.field208 = class442.field2971[var7];
										var8.field207 = class28.field136[var7];
										var8.field209 = class168.field1184[var7];
										var9 = var8.field207 * var8.field209;
										var10 = class299.field2203[var7];
										var8.field205 = new int[var9];

										for (var11 = 0; var11 < var9; ++var11) {
											var8.field205[var11] = class205.field1376[var10[var11] & 255];
										}

										++var7;
									}
								}

								class472.field3311 = var17;
							} else {
								++var16;
							}

							if (null == class49.field236) {
								var3 = class514.field4064;
								var4 = class97.field632.field4246;
								if (!class168.method887(var3, var4, 0)) {
									var17 = null;
								} else {
									var6 = new class42[class168.field1185];
									var7 = 0;

									while (true) {
										if (var7 >= class168.field1185) {
											class345.method1664();
											var17 = var6;
											break;
										}

										var8 = var6[var7] = new class42();
										var8.field204 = class190.field1289;
										var8.field210 = class203.field1364;
										var8.field206 = class498.field3673[var7];
										var8.field208 = class442.field2971[var7];
										var8.field207 = class28.field136[var7];
										var8.field209 = class168.field1184[var7];
										var9 = var8.field209 * var8.field207;
										var10 = class299.field2203[var7];
										var8.field205 = new int[var9];

										for (var11 = 0; var11 < var9; ++var11) {
											var8.field205[var11] = class205.field1376[var10[var11] & 255];
										}

										++var7;
									}
								}

								class49.field236 = var17;
							} else {
								++var16;
							}

							if (null == class108.field683) {
								var3 = class514.field4064;
								var4 = class97.field632.field4247;
								if (!class168.method887(var3, var4, 0)) {
									var17 = null;
								} else {
									var6 = new class42[class168.field1185];
									var7 = 0;

									while (true) {
										if (var7 >= class168.field1185) {
											class345.method1664();
											var17 = var6;
											break;
										}

										var8 = var6[var7] = new class42();
										var8.field204 = class190.field1289;
										var8.field210 = class203.field1364;
										var8.field206 = class498.field3673[var7];
										var8.field208 = class442.field2971[var7];
										var8.field207 = class28.field136[var7];
										var8.field209 = class168.field1184[var7];
										var9 = var8.field209 * var8.field207;
										var10 = class299.field2203[var7];
										var8.field205 = new int[var9];

										for (var11 = 0; var11 < var9; ++var11) {
											var8.field205[var11] = class205.field1376[var10[var11] & 255];
										}

										++var7;
									}
								}

								class108.field683 = var17;
							} else {
								++var16;
							}

							if (null == class312.field2266) {
								class312.field2266 = class168.method885(class514.field4064, class97.field632.field4248, 0);
							} else {
								++var16;
							}

							if (class500.field3691 == null) {
								var3 = class514.field4064;
								var4 = class97.field632.field4249;
								if (!class168.method887(var3, var4, 0)) {
									var17 = null;
								} else {
									var6 = new class42[class168.field1185];
									var7 = 0;

									while (true) {
										if (var7 >= class168.field1185) {
											class345.method1664();
											var17 = var6;
											break;
										}

										var8 = var6[var7] = new class42();
										var8.field204 = class190.field1289;
										var8.field210 = class203.field1364;
										var8.field206 = class498.field3673[var7];
										var8.field208 = class442.field2971[var7];
										var8.field207 = class28.field136[var7];
										var8.field209 = class168.field1184[var7];
										var9 = var8.field207 * var8.field209;
										var10 = class299.field2203[var7];
										var8.field205 = new int[var9];

										for (var11 = 0; var11 < var9; ++var11) {
											var8.field205[var11] = class205.field1376[var10[var11] & 255];
										}

										++var7;
									}
								}

								class500.field3691 = var17;
							} else {
								++var16;
							}

							if (null == class274.field1826) {
								class274.field1826 = class168.method885(class514.field4064, class97.field632.field4250, 0);
							} else {
								++var16;
							}

							if (null == class9.field41) {
								var3 = class514.field4064;
								var4 = class97.field632.field4244;
								if (!class168.method887(var3, var4, 0)) {
									var2 = null;
								} else {
									var2 = class168.method891();
								}

								class9.field41 = var2;
							} else {
								++var16;
							}

							if (null == class94.field602) {
								var3 = class514.field4064;
								var4 = class97.field632.field4252;
								if (!class168.method887(var3, var4, 0)) {
									var2 = null;
								} else {
									var2 = class168.method891();
								}

								class94.field602 = var2;
							} else {
								++var16;
							}

							if (var16 < 11) {
								class410.field2818 = class513.field3775 + var16 * 100 / 12 + "%";
								class410.field2817 = 70;
							} else {
								class229.field1486 = class94.field602;
								class47.field233.method183();
								var30 = (int)(Math.random() * 21.0D) - 10;
								int var19 = (int)(Math.random() * 21.0D) - 10;
								var4 = (int)(Math.random() * 21.0D) - 10;
								int var5 = (int)(Math.random() * 41.0D) - 20;
								class11.field63[0].method1067(var5 + var30, var19 + var5, var5 + var4);
								class410.field2818 = class513.field4044;
								class410.field2817 = 70;
								field1890 = class344.field2411;
							}
						} else if (class344.field2411 == field1890) {
							if (!class97.field630.method38()) {
								class410.field2818 = class513.field3777 + "0%";
								class410.field2817 = 90;
							} else {
								class484.field3400 = new class114(class97.field630, class514.field4064, 20, class109.field693.method444(), field2059 ? 64 : 128);
								class105.method474(class484.field3400);
								class105.method472(class109.field693.method444());
								field1890 = class344.field2418;
							}
						} else if (class344.field2418 == field1890) {
							var16 = class484.field3400.method517();
							if (var16 < 100) {
								class410.field2818 = class513.field3777 + var16 + "%";
								class410.field2817 = 90;
							} else {
								class410.field2818 = class513.field3778;
								class410.field2817 = 90;
								field1890 = class344.field2414;
							}
						} else if (class344.field2414 == field1890) {
							class127.field831 = new class332();
							class535.field4187.method1950(class127.field831, 10);
							class410.field2818 = class513.field3779;
							class410.field2817 = 92;
							field1890 = class344.field2402;
						} else if (field1890 == class344.field2402) {
							if (!class179.field1232.method30("huffman", "")) {
								class410.field2818 = class513.field3780 + 0 + "%";
								class410.field2817 = 94;
							} else {
								class59 var15 = new class59(class179.field1232.method29("huffman", ""));
								class380.field2622 = var15;
								class410.field2818 = class513.field4055;
								class410.field2817 = 94;
								field1890 = class344.field2407;
							}
						} else if (class344.field2407 == field1890) {
							if (!class494.field3514.method38()) {
								class410.field2818 = class513.field4018 + class494.field3514.method964() * 4 / 5 + "%";
								class410.field2817 = 96;
							} else if (!class483.field3397.method38()) {
								class410.field2818 = class513.field4018 + class483.field3397.method964() * 4 / 5 + "%";
								class410.field2817 = 96;
							} else if (!class4.field13.method38()) {
								class410.field2818 = class513.field4018 + (80 + class4.field13.method964() / 6) + "%";
								class410.field2817 = 96;
							} else if (!class408.field2805.method38()) {
								class410.field2818 = class513.field4018 + (96 + class408.field2805.method964() / 50) + "%";
								class410.field2817 = 96;
							} else {
								class410.field2818 = class513.field3783;
								class410.field2817 = 98;
								if (class4.field13.method33("version.dat", "")) {
									Buffer var1 = new Buffer(class4.field13.method29("version.dat", ""));
									var1.readUnsignedShort();
								}

								field1890 = class344.field2416;
							}
						} else if (class344.field2416 == field1890) {
							class410.field2817 = 100;
							if (class365.field2533.method24() > 0 && !class365.field2533.method31(class31.field156.field153)) {
								class410.field2818 = class513.field3784 + class365.field2533.method36(class31.field156.field153) / 10 + "%";
							} else {
								if (null == class520.field4103) {
									class520.field4103 = new class248();
									class520.field4103.method1142(class365.field2533, class257.field1750, class516.field4073, class209.field1388, field1949, class11.field63);
								}

								class410.field2818 = class513.field3785;
								field1890 = class344.field2417;
							}
						} else {
							if (class344.field2417 == field1890) {
								class432.method1954(10);
							}

						}
					}
				}
			}
		}
	}

	static class198 method1392(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		class471 var6 = null;
		if (null != class258.field1753) {
			var6 = new class471(var0, class258.field1753, class108.field684[var0], 1000000);
		}

		return new class198(var6, class523.field4109, class28.field143, var0, var1, var2, true, false, false);
	}

	static void initGpi() {
		field1882 = -1L;
		class127.field831.field2358 = 0;
		class249.field1717 = true;
		field1851 = true;
		field2072 = -1L;
		class9.field40 = new class444();
		field1891.method2613();
		field1891.field4220.offset = 0;
		field1891.serverPacket = null;
		field1891.field4226 = null;
		field1891.field4215 = null;
		field1891.field4228 = null;
		field1891.field4222 = 0;
		field1891.field4224 = 0;
		field1952 = 0;
		field1897 = 0;
		field1853 = 0;
		method1333();
		class316.method1574(0);
		class346.field2425.clear();
		class346.field2427.method1535();
		class346.field2424.method2545();
		class346.field2426 = 0;
		field1892 = 0;
		field1997 = false;
		field1957 = 0;
		field1962 = 0;
		field1923 = 0;
		class76.field535 = null;
		field2082 = 0;
		field2075 = -1;
		field1840 = 0;
		field2081 = 0;
		field2007 = class491.field3495;
		field2115 = class491.field3495;
		field1980 = 0;
		class264.method1235();

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			field2037[var1] = null;
		}

		for (var1 = 0; var1 < 65536; ++var1) {
			field2017[var1] = null;
		}

		field1969 = -1;
		field1972.method329();
		field1973.method329();

		for (var1 = 0; var1 < 4; ++var1) {
			for (int var2 = 0; var2 < 104; ++var2) {
				for (int var3 = 0; var3 < 104; ++var3) {
					field2000[var1][var2][var3] = null;
				}
			}
		}

		field1971 = new class69();
		class35.field176.method382();
		if (class319.field2324 > 5000) {
		}

		for (var1 = 0; var1 < class319.field2324; ++var1) {
			class319 var4 = class319.method1579(var1);
			if (var4 != null) {
				class119.field785[var1] = 0;
				class119.field786[var1] = 0;
			}
		}

		class208.field1384.method1916();
		field2011 = -1;
		if (rootInterface != -1) {
			class208.interfaceConfigs.method348(rootInterface);
		}

		for (InterfaceComponent var5 = (InterfaceComponent) interfaceComponents.method1753(); null != var5; var5 = (InterfaceComponent) interfaceComponents.method1754()) {
			closeInterface(var5, true);
		}

		rootInterface = -1;
		interfaceComponents = new class375(8);
		field1936 = null;
		method1333();
		field2116.method899((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var1 = 0; var1 < 8; ++var1) {
			field2090[var1] = null;
			field1967[var1] = false;
		}

		class482.method2213();
		field1845 = true;

		for (var1 = 0; var1 < 100; ++var1) {
			field2051[var1] = true;
		}

		method1467();
		class257.field1749 = null;
		class465.field3294 = null;
		Arrays.fill(field1919, (Object)null);
		class455.field3020 = null;
		Arrays.fill(field2074, (Object)null);

		for (var1 = 0; var1 < 8; ++var1) {
			field2026[var1] = new class480();
		}

		class119.field787 = null;
		field1928 = false;
	}

	static void method1318() {
		field1891.method2613();
		field1891.field4220.offset = 0;
		field1891.serverPacket = null;
		field1891.field4226 = null;
		field1891.field4215 = null;
		field1891.field4228 = null;
		field1891.field4222 = 0;
		field1891.field4224 = 0;
		field1952 = 0;
		method1333();
		field2082 = 0;
		field1840 = 0;

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			field2037[var1] = null;
		}

		class114.field720 = null;

		for (var1 = 0; var1 < field2017.length; ++var1) {
			class378 var2 = field2017[var1];
			if (var2 != null) {
				var2.field363 = -1;
				var2.field364 = false;
			}
		}

		class482.method2213();
		class432.method1954(30);

		for (var1 = 0; var1 < 100; ++var1) {
			field2051[var1] = true;
		}

		method1467();
	}

	static void method1382(int var0) {
		int var2 = class410.field2825;
		if (var0 == -3) {
			class410.method1891(class513.field4037, class513.field3796, class513.field3977);
		} else if (var0 == -2) {
			class410.method1891(class513.field3865, class513.field3799, class513.field3857);
		} else if (var0 == -1) {
			class410.method1891(class513.field3801, class513.field3820, class513.field3803);
		} else if (var0 == 3) {
			class410.method1883(3);
			class410.field2820 = 1;
		} else if (var0 == 4) {
			class410.method1884(0);
		} else if (var0 == 5) {
			class410.field2820 = 2;
			class410.method1891(class513.field3875, class513.field3808, class513.field3849);
		} else if (var0 == 68) {
			if (!field1928) {
				field1928 = true;
				method1365();
				return;
			}

			class410.method1891(class513.field3917, class513.field3811, class513.field3965);
		} else if (!field2086 && var0 == 6) {
			class410.method1891(class513.field3917, class513.field3811, class513.field3965);
		} else if (var0 == 7) {
			class410.method1891(class513.field3929, class513.field3814, class513.field3815);
		} else if (var0 == 8) {
			class410.method1891(class513.field3816, class513.field3817, class513.field3791);
		} else if (var0 == 9) {
			class410.method1891(class513.field3819, class513.field3920, class513.field3821);
		} else if (var0 == 10) {
			class410.method1891(class513.field3822, class513.field3773, class513.field3807);
		} else if (var0 == 11) {
			class410.method1891(class513.field3825, class513.field3893, class513.field3813);
		} else if (var0 == 12) {
			class410.method1891(class513.field3828, class513.field3829, class513.field3805);
		} else if (var0 == 13) {
			class410.method1891(class513.field3831, class513.field3832, class513.field3833);
		} else if (var0 == 14) {
			class410.method1891(class513.field3834, class513.field3835, class513.field3895);
		} else if (var0 == 16) {
			class410.method1891(class513.field3837, class513.field3960, class513.field3839);
			class410.method1883(33);
		} else if (var0 == 17) {
			class410.method1891(class513.field3810, class513.field3841, class513.field4010);
		} else if (var0 == 18) {
			class410.method1884(1);
		} else if (var0 == 19) {
			class410.method1891(class513.field3846, class513.field3847, class513.field3848);
		} else if (var0 == 20) {
			class410.method1891(class513.field3888, class513.field3850, class513.field3851);
		} else if (var0 == 22) {
			class410.method1891(class513.field3852, class513.field3853, class513.field3854);
		} else if (var0 == 23) {
			class410.method1891(class513.field3855, class513.field3856, class513.field3956);
		} else if (var0 == 24) {
			class410.method1891(class513.field3858, class513.field3859, class513.field3860);
		} else if (var0 == 25) {
			class410.method1891(class513.field3978, class513.field3862, class513.field3986);
		} else if (var0 == 26) {
			class410.method1891(class513.field3864, class513.field3901, class513.field3866);
		} else if (var0 == 27) {
			class410.method1891(class513.field3867, class513.field3868, class513.field3869);
		} else if (var0 == 31) {
			class410.method1891(class513.field3876, class513.field3915, class513.field3878);
		} else if (var0 == 32) {
			class410.method1884(2);
		} else if (var0 == 37) {
			class410.method1891(class513.field3994, class513.field3795, class513.field3884);
		} else if (var0 == 38) {
			class410.method1891(class513.field3937, class513.field3886, class513.field3887);
		} else if (var0 == 55) {
			class410.method1883(8);
		} else {
			if (var0 == 56) {
				class410.method1891(class513.field3861, class513.field4006, class513.field3894);
				class432.method1954(11);
				return;
			}

			if (var0 == 57) {
				class410.method1891(class513.field3946, class513.field3896, class513.field3897);
				class432.method1954(11);
				return;
			}

			if (var0 == 61) {
				class410.method1891("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class410.method1883(7);
			} else {
				if (var0 == 62) {
					class432.method1954(10);
					class410.method1883(9);
					class410.method1891(class513.field3898, class513.field3899, class513.field3900);
					return;
				}

				if (var0 == 63) {
					class432.method1954(10);
					class410.method1883(9);
					class410.method1891(class513.field3881, class513.field3902, class513.field3903);
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class432.method1954(10);
					class410.method1883(9);
					class410.method1891(class513.field3838, class513.field3905, class513.field3906);
					return;
				}

				if (var0 == 71) {
					class432.method1954(10);
					class410.method1883(7);
					class410.method1891("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class432.method1954(10);
					class410.method1883(6);
					class410.method1891(class513.field4035, class513.field4036, class513.field3890);
				} else if (var0 == 72) {
					class432.method1954(10);
					class410.method1883(32);
				} else {
					class410.method1891(class513.field3907, class513.field3969, class513.field4022);
				}
			}
		}

		class432.method1954(10);
		int var5 = class410.field2825;
		boolean var6 = var5 != var2;
		if (!var6 && field1872.method2624()) {
			class410.method1883(9);
		}

	}

	static final void method1395() {
		field1891.method2610();
		method1400();
		class141.field937.method729();

		for (int var1 = 0; var1 < 4; ++var1) {
			field1906[var1].method801();
		}

		field2068.method1735();
		System.gc();
		class483.method2223(0, 0);
		class483.method2229();
		field2083 = false;
		class218.method1005();
		class432.method1954(10);
	}

	static final void method1303(int var0) {
		method1395();
		switch(var0) {
		case 1:
			class410.method1883(24);
			class410.method1891(class513.field3883, class513.field3983, class513.field3984);
			break;
		case 2:
			class410.method1893();
		}

	}

	static long method1425() {
		return field1852;
	}

	static final void method1400() {
		class514.method2428();
		class413.method1903();
		class179.method927();
		class196.method951();
		class293.method1523();
		class500.field3682.method1679();
		class536.field4196.method1679();
		class479.field3365.method1679();
		class161.field1152.method1679();
		class161.field1161.method1679();
		class156.field1062.method1679();
		class156.field1063.method1679();
		class156.field1075.method1679();
		class371.method1739();
		class11.field57.method1679();
		class35.method106();
		class397.method1849();
		class63.method268();
		class136.method701();
		class73.method365();
		class158.method858();
		class47.method196();
		class116.field726.method1679();
		class116.field740.method1679();
		class116.field728.method1679();
		class137.method706();
		class492.method2297();
		class320.method1583();
		class161.field1159.method2389();
		class214.field1401.method2389();
		class182.field1272.method1679();
		class121.field793.method1679();
		class241.method1121();
		class351.field2431.method1679();
		class349.field2430.method1679();
		class66.method301();
		class302.method1538();
		class319.method1578();
		class330.method1596();
		field2123.method1679();
		field2002.method1679();
		class171.field1212.method1679();
		class171.field1215.method834();
		class171.field1214 = 0;
		class208.interfaceConfigs.method349();
		((class114)class105.field668.field1730).method522();
		class83.field557.method1679();
		field2122.method834();
		class358.field2470.method26();
		class514.field4063.method26();
		class179.field1232.method26();
		class4.field13.method26();
		class323.field2337.method26();
		class253.field1722.method26();
		class478.field3364.method26();
		class408.field2805.method26();
		class494.field3514.method26();
		class483.field3397.method26();
		class174.field1221.method26();
		class66.field417.method26();
		class522.field4107.method26();
		class151.field1049.method26();
		class77.field541.method26();
		class254.field1725.method26();
		class514.field4064.method26();
		class97.field630.method26();
		class87.field581.method26();
		class516.field4073.method26();
		class257.field1750.method26();
		class365.field2533.method26();
	}

	static final void method1352() {
		if (field1897 > 0) {
			method1395();
		} else {
			field1899.method1745();
			class432.method1954(40);
			class228.field1475 = field1891.method2611();
			field1891.method2607();
		}
	}

	static final void method1350(boolean var0) {
		if (var0) {
			field1871 = class410.field2833 ? class110.field697 : class110.field698;
		} else {
			field1871 = class109.field693.method455(class410.field2842) ? class110.field702 : class110.field699;
		}

	}

	static void method1464(class116 var0, int var1, int var2, int var3) {
		if (field1957 < 50 && class109.field693.method464() != 0) {
			if (null != var0.field736 && var1 < var0.field736.length) {
				method1332(var0.field736[var1], var2, var3);
			}
		}
	}

	static void method1442(class116 var0, int var1, int var2, int var3) {
		if (field1957 < 50 && class109.field693.method464() != 0) {
			if (var0.field730 != null && var0.field730.containsKey(var1)) {
				method1332((Integer)var0.field730.get(var1), var2, var3);
			}
		}
	}

	static void method1332(int var0, int var1, int var2) {
		if (var0 != 0) {
			int var4 = var0 >> 8;
			int var5 = var0 >> 4 & 7;
			int var6 = var0 & 15;
			field2124[field1957] = var4;
			field1887[field1957] = var5;
			field1913[field1957] = 0;
			field2089[field1957] = null;
			int var7 = (var1 - 64) / 128;
			int var8 = (var2 - 64) / 128;
			field2088[field1957] = (var7 << 16) + (var8 << 8) + var6;
			++field1957;
		}
	}

	static void method1456(int var0, int var1, int var2) {
		if (class109.field693.method448() != 0 && var1 != 0 && field1957 < 50) {
			field2124[field1957] = var0;
			field1887[field1957] = var1;
			field1913[field1957] = var2;
			field2089[field1957] = null;
			field2088[field1957] = 0;
			++field1957;
		}

	}

	static void method1393(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var6 = (Integer)var0.get(0);
			if (var6 == -1 && !field2083) {
				class483.method2223(0, 0);
			} else if (var6 != -1) {
				boolean var7;
				if (class483.field3396.isEmpty()) {
					var7 = false;
				} else {
					class407 var8 = (class407)class483.field3396.get(0);
					var7 = var8 != null && var8.field2790 == var6;
				}

				if (!var7 && class109.field693.method446() != 0) {
					ArrayList var10 = new ArrayList();

					for (int var9 = 0; var9 < var0.size(); ++var9) {
						var10.add(new class407(class151.field1049, (Integer)var0.get(var9), 0, class109.field693.method446(), false));
					}

					if (field2083) {
						class483.method2225(var10, var1, var2, var3, var4);
					} else {
						class14.method61(var10, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}

	static void method1450(int var0, int var1) {
		if (class109.field693.method446() != 0 && var0 != -1) {
			ArrayList var3 = new ArrayList();
			var3.add(new class407(class66.field417, var0, 0, class109.field693.method446(), false));
			class14.method61(var3, 0, 0, 0, 0, true);
			field2083 = true;
		}

	}

	static final void method1361() {
		if (class227.field1473) {
			if (null != class257.field1749) {
				class257.field1749.method2238();
			}

			for (int var1 = 0; var1 < class264.field1764; ++var1) {
				Player var2 = field2037[class264.field1765[var1]];
				var2.method2124();
			}

			class227.field1473 = false;
		}

	}

	static final void method1444(class496 var0, int var1, int var2) {
		if (field2082 == 0 || field2082 == 3) {
			if (!field1978 && (class316.field2316 == 1 || !class108.field685 && class316.field2316 == 4)) {
				class313 var4 = var0.method2310(class208.interfaceConfigs, true);
				if (var4 == null) {
					return;
				}

				int var5 = class316.field2318 - var1;
				int var6 = class316.field2320 - var2;
				if (var4.method1570(var5, var6)) {
					var5 -= var4.field2274 / 2;
					var6 -= var4.field2270 / 2;
					int var7 = field1962 & 2047;
					int var8 = class105.field670[var7];
					int var9 = class105.field671[var7];
					int var10 = var8 * var6 + var5 * var9 >> 11;
					int var11 = var9 * var6 - var5 * var8 >> 11;
					int var12 = class114.field720.field368 + var10 >> 7;
					int var13 = class114.field720.field329 - var11 >> 7;
					class341 var14 = class341.createClientPacket(ClientPacket.field3109, field1891.field4219);
					var14.buffer.writeByte(18);
					var14.buffer.writeShortLEADD(class425.selectedTileXYIdk + var13);
					var14.buffer.writeByte(field2067.method1798(82) ? (field2067.method1798(81) ? 2 : 1) : 0);
					var14.buffer.writeShortLEADD(class80.selectedTileX + var12);
					var14.buffer.writeByte(var5);
					var14.buffer.writeByte(var6);
					var14.buffer.writeShort(field1962);
					var14.buffer.writeByte(57);
					var14.buffer.writeByte(0);
					var14.buffer.writeByte(0);
					var14.buffer.writeByte(89);
					var14.buffer.writeShort(class114.field720.field368);
					var14.buffer.writeShort(class114.field720.field329);
					var14.buffer.writeByte(63);
					field1891.method2612(var14);
					field1840 = var12;
					field2081 = var13;
				}
			}

		}
	}

	static final void method1370(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class109.field693.method458(!class109.field693.method437());
			if (class109.field693.method437()) {
				class346.method1672(99, "", "Roofs are now all hidden");
			} else {
				class346.method1672(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var2 = class385.method1807(var0.substring(5).trim()) == 1;
			class190.field1287.method2567(var2);
			class105.method473(var2);
		}

		if (var0.equalsIgnoreCase("z")) {
			field1862 = !field1862;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class109.field693.method442();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			field1961 = !field1961;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			field2027 = !field2027;
		}

		if (field2087 >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class520.field4103.field1706 = !class520.field4103.field1706;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class109.field693.method461(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class109.field693.method461(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				method1352();
			}
		}

		class341 var3 = class341.createClientPacket(ClientPacket.field3099, field1891.field4219);
		var3.buffer.writeByte(var0.length() + 1);
		var3.buffer.writeString(var0);
		field1891.method2612(var3);
	}

	static final int method1358(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}

	static final int method1325(int var0) {
		return Math.abs(var0 - class76.field537) > 1024 ? 2048 * (var0 < class76.field537 ? 1 : -1) + var0 : var0;
	}

	static final void method1422(int var0, int var1, int var2) {
		if (field2135 < var0) {
			field2135 += class250.field1718 + (var0 - field2135) * class16.field86 / 1000;
			if (field2135 > var0) {
				field2135 = var0;
			}
		}

		if (field2135 > var0) {
			field2135 -= class16.field86 * (field2135 - var0) / 1000 + class250.field1718;
			if (field2135 < var0) {
				field2135 = var0;
			}
		}

		if (class122.field794 < var1) {
			class122.field794 += (var1 - class122.field794) * class16.field86 / 1000 + class250.field1718;
			if (class122.field794 > var1) {
				class122.field794 = var1;
			}
		}

		if (class122.field794 > var1) {
			class122.field794 -= (class122.field794 - var1) * class16.field86 / 1000 + class250.field1718;
			if (class122.field794 < var1) {
				class122.field794 = var1;
			}
		}

		if (class353.field2437 < var2) {
			class353.field2437 += class250.field1718 + (var2 - class353.field2437) * class16.field86 / 1000;
			if (class353.field2437 > var2) {
				class353.field2437 = var2;
			}
		}

		if (class353.field2437 > var2) {
			class353.field2437 -= class250.field1718 + (class353.field2437 - var2) * class16.field86 / 1000;
			if (class353.field2437 < var2) {
				class353.field2437 = var2;
			}
		}

	}

	static final void method1337(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class130.field849 < var0) {
			class130.field849 += (var0 - class130.field849) * class64.field327 / 1000 + class447.field2982;
			if (class130.field849 > var0) {
				class130.field849 = var0;
			}
		} else if (class130.field849 > var0) {
			class130.field849 -= class64.field327 * (class130.field849 - var0) / 1000 + class447.field2982;
			if (class130.field849 < var0) {
				class130.field849 = var0;
			}
		}

		var1 &= 2047;
		int var3 = var1 - class76.field537;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 > 0) {
			class76.field537 += class447.field2982 + var3 * class64.field327 / 1000;
			class76.field537 &= 2047;
		} else if (var3 < 0) {
			class76.field537 -= -var3 * class64.field327 / 1000 + class447.field2982;
			class76.field537 &= 2047;
		}

		int var4 = var1 - class76.field537;
		if (var4 > 1024) {
			var4 -= 2048;
		} else if (var4 < -1024) {
			var4 += 2048;
		}

		if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
			class76.field537 = var1;
		}

	}

	static final void method1355() {
		int var1 = class264.field1764;
		int[] var2 = class264.field1765;

		for (int var3 = 0; var3 < var1; ++var3) {
			Player var4 = field2037[var2[var3]];
			if (null != var4) {
				method1307(var4, 1);
			}
		}

	}

	static final void method1307(class65 var0, int var1) {
		int var3;
		int var4;
		int var5;
		int var6;
		int var8;
		class116 var12;
		if (var0.field384 >= field1846) {
			var3 = Math.max(1, var0.field384 - field1846);
			var4 = var0.field332 * 64 + var0.field380 * 128;
			var5 = var0.field332 * 64 + var0.field328 * 128;
			var0.field368 += (var4 - var0.field368) / var3;
			var0.field329 += (var5 - var0.field329) / var3;
			var0.field375 = 0;
			var0.field351 = var0.field396;
		} else if (var0.field385 >= field1846) {
			method1376(var0);
		} else {
			var0.field369 = var0.field383;
			if (var0.field360 == 0) {
				var0.field375 = 0;
			} else {
				label553: {
					if (var0.field373 != -1 && var0.field376 == 0) {
						var12 = class116.method539(var0.field373);
						if (var0.field403 > 0 && var12.field735 == 0) {
							++var0.field375;
							break label553;
						}

						if (var0.field403 <= 0 && var12.field746 == 0) {
							++var0.field375;
							break label553;
						}
					}

					var3 = var0.field368;
					var4 = var0.field329;
					var5 = var0.field332 * 64 + 128 * var0.field399[var0.field360 - 1];
					var6 = var0.field400[var0.field360 - 1] * 128 + var0.field332 * 64;
					if (var3 < var5) {
						if (var4 < var6) {
							var0.field351 = 1280;
						} else if (var4 > var6) {
							var0.field351 = 1792;
						} else {
							var0.field351 = 1536;
						}
					} else if (var3 > var5) {
						if (var4 < var6) {
							var0.field351 = 768;
						} else if (var4 > var6) {
							var0.field351 = 256;
						} else {
							var0.field351 = 512;
						}
					} else if (var4 < var6) {
						var0.field351 = 1024;
					} else if (var4 > var6) {
						var0.field351 = 0;
					}

					MovementType var7 = var0.field342[var0.field360 - 1];
					if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
						var8 = var0.field351 - var0.field330 & 2047;
						if (var8 > 1024) {
							var8 -= 2048;
						}

						int var9 = var0.field338;
						if (var8 >= -256 && var8 <= 256) {
							var9 = var0.field331;
						} else if (var8 >= 256 && var8 < 768) {
							var9 = var0.field340;
						} else if (var8 >= -768 && var8 <= -256) {
							var9 = var0.field341;
						}

						if (var9 == -1) {
							var9 = var0.field331;
						}

						var0.field369 = var9;
						int var10 = 4;
						boolean var11 = true;
						if (var0 instanceof class378) {
							var11 = ((class378)var0).field2605.field518;
						}

						if (var11) {
							if (var0.field330 != var0.field351 && var0.field363 == -1 && var0.field358 != 0) {
								var10 = 2;
							}

							if (var0.field360 > 2) {
								var10 = 6;
							}

							if (var0.field360 > 3) {
								var10 = 8;
							}

							if (var0.field375 > 0 && var0.field360 > 1) {
								var10 = 8;
								--var0.field375;
							}
						} else {
							if (var0.field360 > 1) {
								var10 = 6;
							}

							if (var0.field360 > 2) {
								var10 = 8;
							}

							if (var0.field375 > 0 && var0.field360 > 1) {
								var10 = 8;
								--var0.field375;
							}
						}

						if (var7 == MovementType.run) {
							var10 <<= 1;
						} else if (var7 == MovementType.CRAWL) {
							var10 >>= 1;
						}

						if (var10 >= 8) {
							if (var0.field331 == var0.field369 && var0.field401 != -1) {
								var0.field369 = var0.field401;
							} else if (var0.field338 == var0.field369 && var0.field359 != -1) {
								var0.field369 = var0.field359;
							} else if (var0.field341 == var0.field369 && var0.field345 != -1) {
								var0.field369 = var0.field345;
							} else if (var0.field369 == var0.field340 && var0.field344 != -1) {
								var0.field369 = var0.field344;
							}
						} else if (var10 <= 2) {
							if (var0.field331 == var0.field369 && var0.field339 != -1) {
								var0.field369 = var0.field339;
							} else if (var0.field369 == var0.field338 && var0.field346 != -1) {
								var0.field369 = var0.field346;
							} else if (var0.field341 == var0.field369 && var0.field361 != -1) {
								var0.field369 = var0.field361;
							} else if (var0.field369 == var0.field340 && var0.field348 != -1) {
								var0.field369 = var0.field348;
							}
						}

						if (var5 != var3 || var4 != var6) {
							if (var3 < var5) {
								var0.field368 += var10;
								if (var0.field368 > var5) {
									var0.field368 = var5;
								}
							} else if (var3 > var5) {
								var0.field368 -= var10;
								if (var0.field368 < var5) {
									var0.field368 = var5;
								}
							}

							if (var4 < var6) {
								var0.field329 += var10;
								if (var0.field329 > var6) {
									var0.field329 = var6;
								}
							} else if (var4 > var6) {
								var0.field329 -= var10;
								if (var0.field329 < var6) {
									var0.field329 = var6;
								}
							}
						}

						if (var5 == var0.field368 && var6 == var0.field329) {
							--var0.field360;
							if (var0.field403 > 0) {
								--var0.field403;
							}
						}
					} else {
						var0.field368 = var5;
						var0.field329 = var6;
						--var0.field360;
						if (var0.field403 > 0) {
							--var0.field403;
						}
					}
				}
			}
		}

		if (var0.field368 < 128 || var0.field329 < 128 || var0.field368 >= 13184 || var0.field329 >= 13184) {
			var0.field373 = -1;
			var0.field384 = 0;
			var0.field385 = 0;
			var0.method295();
			var0.field368 = var0.field399[0] * 128 + var0.field332 * 64;
			var0.field329 = var0.field332 * 64 + 128 * var0.field400[0];
			var0.method288();
		}

		if (var0 == class114.field720 && (var0.field368 < 1536 || var0.field329 < 1536 || var0.field368 >= 11776 || var0.field329 >= 11776)) {
			var0.field373 = -1;
			var0.field384 = 0;
			var0.field385 = 0;
			var0.method295();
			var0.field368 = var0.field332 * 64 + var0.field399[0] * 128;
			var0.field329 = var0.field332 * 64 + 128 * var0.field400[0];
			var0.method288();
		}

		if (var0.field363 != -1) {
			var12 = null;
			var4 = 65536;
			Object var13;
			if (var0.field363 < 65536) {
				var13 = field2017[var0.field363];
			} else {
				var13 = field2037[var0.field363 - 65536];
			}

			if (null != var13) {
				var5 = var0.field368 - ((class65)var13).field368;
				var6 = var0.field329 - ((class65)var13).field329;
				if (var5 != 0 || var6 != 0) {
					var8 = (int)(Math.atan2((double)var5, (double)var6) * 325.94932345220167D) & 2047;
					var0.field351 = var8;
				}
			} else if (var0.field364) {
				var0.field363 = -1;
				var0.field364 = false;
			}
		}

		int var18;
		if (var0.field360 == 0 || var0.field375 > 0) {
			var3 = -1;
			if (var0.field366 != -1 && var0.field367 != -1) {
				var4 = 64 + (var0.field366 * 128 - class80.selectedTileX * 128);
				var5 = 64 + (var0.field367 * 128 - class425.selectedTileXYIdk * 128);
				var6 = var0.field368 - var4;
				var18 = var0.field329 - var5;
				if (var6 != 0 || var18 != 0) {
					var8 = (int)(Math.atan2((double)var6, (double)var18) * 325.94932345220167D) & 2047;
					var3 = var8;
				}
			} else if (var0.field365 != -1) {
				var3 = var0.field365;
			}

			if (var3 != -1) {
				var0.field351 = var3;
				if (var0.field382) {
					var0.field330 = var0.field351;
				}
			}

			var0.method294();
		}

		var3 = var0.field351 - var0.field330 & 2047;
		if (var3 != 0) {
			boolean var14 = true;
			boolean var16 = true;
			++var0.field355;
			var6 = var3 > 1024 ? -1 : 1;
			var0.field330 += var0.field358 * var6;
			boolean var21 = true;
			if (var3 < var0.field358 || var3 > 2048 - var0.field358) {
				var0.field330 = var0.field351;
				var21 = false;
			}

			if (var0.field358 > 0 && var0.field369 == var0.field383 && (var0.field355 > 25 || var21)) {
				if (var6 == -1 && var0.field335 != -1) {
					var0.field369 = var0.field335;
				} else if (var6 == 1 && var0.field336 != -1) {
					var0.field369 = var0.field336;
				} else {
					var0.field369 = var0.field331;
				}
			}

			var0.field330 &= 2047;
		} else {
			if (var0.field364) {
				var0.field363 = -1;
				var0.field364 = false;
			}

			var0.field355 = 0;
		}

		var0.field349 = false;
		if (var0.field369 != -1) {
			var12 = class116.method539(var0.field369);
			if (null != var12) {
				if (!var12.method533() && var12.field733 != null) {
					++var0.field371;
					if (var0.field370 < var12.field733.length && var0.field371 > var12.field722[var0.field370]) {
						var0.field371 = 1;
						++var0.field370;
						method1464(var12, var0.field370, var0.field368, var0.field329);
					}

					if (var0.field370 >= var12.field733.length) {
						if (var12.field737 > 0) {
							var0.field370 -= var12.field737;
							if (var12.field727) {
								++var0.field372;
							}

							if (var0.field370 < 0 || var0.field370 >= var12.field733.length || var12.field727 && var0.field372 >= var12.field748) {
								var0.field371 = 0;
								var0.field370 = 0;
								var0.field372 = 0;
							}
						} else {
							var0.field371 = 0;
							var0.field370 = 0;
						}

						method1464(var12, var0.field370, var0.field368, var0.field329);
					}
				} else if (var12.method533()) {
					++var0.field370;
					var4 = var12.method535();
					if (var0.field370 < var4) {
						method1442(var12, var0.field370, var0.field368, var0.field329);
					} else {
						if (var12.field737 > 0) {
							var0.field370 -= var12.field737;
							if (var12.field727) {
								++var0.field372;
							}

							if (var0.field370 < 0 || var0.field370 >= var4 || var12.field727 && var0.field372 >= var12.field748) {
								var0.field370 = 0;
								var0.field371 = 0;
								var0.field372 = 0;
							}
						} else {
							var0.field371 = 0;
							var0.field370 = 0;
						}

						method1442(var12, var0.field370, var0.field368, var0.field329);
					}
				} else {
					var0.field369 = -1;
				}
			} else {
				var0.field369 = -1;
			}
		}

		class287 var19 = new class287(var0.method291());

		for (class546 var15 = (class546)var19.method1513(); null != var15; var15 = (class546)var19.next()) {
			if (var15.field4255 != -1 && field1846 >= var15.field4256) {
				var5 = class137.method707(var15.field4255).field896;
				if (var5 == -1) {
					var15.method1719();
					--var0.field379;
				} else {
					var15.field4254 = Math.max(var15.field4254, 0);
					class116 var20 = class116.method539(var5);
					if (var20.field733 != null && !var20.method533()) {
						++var15.field4253;
						if (var15.field4254 < var20.field733.length && var15.field4253 > var20.field722[var15.field4254]) {
							var15.field4253 = 1;
							++var15.field4254;
							method1464(var20, var15.field4254, var0.field368, var0.field329);
						}

						if (var15.field4254 >= var20.field733.length) {
							var15.method1719();
							--var0.field379;
						}
					} else if (var20.method533()) {
						++var15.field4254;
						var18 = var20.method535();
						if (var15.field4254 < var18) {
							method1442(var20, var15.field4254, var0.field368, var0.field329);
						} else {
							var15.method1719();
							--var0.field379;
						}
					} else {
						var15.method1719();
						--var0.field379;
					}
				}
			}
		}

		class116 var17;
		if (var0.field373 != -1 && var0.field376 <= 1) {
			var17 = class116.method539(var0.field373);
			if (var17.field735 == 1 && var0.field403 > 0 && var0.field384 <= field1846 && var0.field385 < field1846) {
				var0.field376 = 1;
				return;
			}
		}

		if (var0.field373 != -1 && var0.field376 == 0) {
			var17 = class116.method539(var0.field373);
			if (null == var17) {
				var0.field373 = -1;
			} else if (!var17.method533() && var17.field733 != null) {
				++var0.field395;
				if (var0.field334 < var17.field733.length && var0.field395 > var17.field722[var0.field334]) {
					var0.field395 = 1;
					++var0.field334;
					method1464(var17, var0.field334, var0.field368, var0.field329);
				}

				if (var0.field334 >= var17.field733.length) {
					var0.field334 -= var17.field737;
					++var0.field377;
					if (var0.field377 >= var17.field748) {
						var0.field373 = -1;
					} else if (var0.field334 >= 0 && var0.field334 < var17.field733.length) {
						method1464(var17, var0.field334, var0.field368, var0.field329);
					} else {
						var0.field373 = -1;
					}
				}

				var0.field349 = var17.field745;
			} else if (var17.method533()) {
				++var0.field334;
				var5 = var17.method535();
				if (var0.field334 < var5) {
					method1442(var17, var0.field334, var0.field368, var0.field329);
				} else {
					var0.field334 -= var17.field737;
					++var0.field377;
					if (var0.field377 >= var17.field748) {
						var0.field373 = -1;
					} else if (var0.field334 >= 0 && var0.field334 < var5) {
						method1442(var17, var0.field334, var0.field368, var0.field329);
					} else {
						var0.field373 = -1;
					}
				}
			} else {
				var0.field373 = -1;
			}
		}

		if (var0.field376 > 0) {
			--var0.field376;
		}

	}

	static final void method1376(class65 var0) {
		boolean var2 = var0.field385 == field1846 || var0.field373 == -1 || var0.field376 != 0;
		if (!var2) {
			class116 var3 = class116.method539(var0.field373);
			if (var3 != null && !var3.method533()) {
				var2 = var0.field395 + 1 > var3.field722[var0.field334];
			} else {
				var2 = true;
			}
		}

		if (var2) {
			int var9 = var0.field385 - var0.field384;
			int var4 = field1846 - var0.field384;
			int var5 = var0.field380 * 128 + var0.field332 * 64;
			int var6 = var0.field332 * 64 + var0.field328 * 128;
			int var7 = var0.field381 * 128 + var0.field332 * 64;
			int var8 = var0.field332 * 64 + var0.field347 * 128;
			var0.field368 = (var5 * (var9 - var4) + var4 * var7) / var9;
			var0.field329 = (var6 * (var9 - var4) + var4 * var8) / var9;
		}

		var0.field375 = 0;
		var0.field351 = var0.field396;
		var0.field330 = var0.field351;
	}

	static void method1313() {
		if (null != class520.field4103) {
			class520.field4103.method1153(class212.field1393, class80.selectedTileX + (class114.field720.field368 >> 7), (class114.field720.field329 >> 7) + class425.selectedTileXYIdk, false);
			class520.field4103.method1165();
		}

	}

	static int method1368() {
		return field1996 ? 2 : 1;
	}

	static void method1391(int var0) {
		field2013 = 0L;
		if (var0 >= 2) {
			field1996 = true;
		} else {
			field1996 = false;
		}

		if (method1368() == 1) {
			class190.field1287.method2556(765, 503);
		} else {
			class190.field1287.method2556(7680, 2160);
		}

		if (field1843 >= 25) {
			method1467();
		}

	}

	static void method1467() {
		class341 var1 = class341.createClientPacket(ClientPacket.field3093, field1891.field4219);
		var1.buffer.writeByte(method1368());
		var1.buffer.writeShort(class164.field1170);
		var1.buffer.writeShort(class92.field595);
		field1891.method2612(var1);
	}

	static final void method1452(String var0, boolean var1) {
		if (field2125) {
			boolean var3 = true;
			boolean var4 = true;
			boolean var5 = true;
			int var6 = class331.field2352.method1035(var0, 250);
			int var7 = class331.field2352.method1059(var0, 250) * 13;
			class433.method1977(6, 6, var6 + 4 + 4, 4 + 4 + var7, 0);
			class433.method1978(6, 6, var6 + 4 + 4, 4 + var7 + 4, 16777215);
			class331.field2352.method1040(var0, 10, 10, var6, var7, 16777215, -1, 1, 1, 0);
			method1305(6, 6, 4 + 4 + var6, 4 + var7 + 4);
			if (var1) {
				class246.field1638.method2638(0, 0);
			} else {
				boolean var8 = true;
				boolean var9 = true;
				int var10 = var6;
				int var11 = var7;

				for (int var12 = 0; var12 < field1874; ++var12) {
					if (field1834[var12] + field2054[var12] > 10 && field2054[var12] < 10 + var10 && field2055[var12] + field2085[var12] > 10 && field2055[var12] < var11 + 10) {
						field2047[var12] = true;
					}
				}
			}

		}
	}

	static final void method1322(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var6 = var3 - 334;
		int var7;
		if (var6 < 0) {
			var7 = field2103;
		} else if (var6 >= 100) {
			var7 = field2104;
		} else {
			var7 = field2103 + var6 * (field2104 - field2103) / 100;
		}

		int var8 = 512 * var7 * var3 / (var2 * 334);
		int var9;
		int var10;
		short var18;
		if (var8 < field1907) {
			var18 = field1907;
			var7 = var2 * var18 * 334 / (var3 * 512);
			if (var7 > field1975) {
				var7 = field1975;
				var9 = var7 * var3 * 512 / (var18 * 334);
				var10 = (var2 - var9) / 2;
				if (var4) {
					class433.method1976();
					class433.method1977(var0, var1, var10, var3, -16777216);
					class433.method1977(var2 + var0 - var10, var1, var10, var3, -16777216);
				}

				var0 += var10;
				var2 -= var10 * 2;
			}
		} else if (var8 > field2110) {
			var18 = field2110;
			var7 = var18 * var2 * 334 / (var3 * 512);
			if (var7 < field2107) {
				var7 = field2107;
				var9 = var2 * var18 * 334 / (var7 * 512);
				var10 = (var3 - var9) / 2;
				if (var4) {
					class433.method1976();
					class433.method1977(var0, var1, var2, var10, -16777216);
					class433.method1977(var0, var3 + var1 - var10, var2, var10, -16777216);
				}

				var1 += var10;
				var3 -= var10 * 2;
			}
		}

		field1905 = var3 * var7 / 334;
		if (var2 != field1836 || field2114 != var3) {
			int[] var19 = new int[9];

			for (var10 = 0; var10 < var19.length; ++var10) {
				int var11 = var10 * 32 + 128 + 15;
				int var12 = var11 * 3 + 600;
				int var14 = class105.field670[var11];
				int var16 = var3 - 334;
				if (var16 < 0) {
					var16 = 0;
				} else if (var16 > 100) {
					var16 = 100;
				}

				int var17 = var16 * (field2106 - field2105) / 100 + field2105;
				int var15 = var17 * var12 / 256;
				var19[var10] = var14 * var15 >> 16;
			}

			class142.method757(var19, 500, 800, var2 * 334 / var3, 334);
		}

		field2111 = var0;
		field2112 = var1;
		field1836 = var2;
		field2114 = var3;
	}

	static void method1463() {
		int var1 = class264.field1764;
		int[] var2 = class264.field1765;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (var2[var3] != field1969 && var2[var3] != field1958) {
				method1390(field2037[var2[var3]], true);
			}
		}

	}

	static void method1390(Player var0, boolean var1) {
		if (var0 != null && var0.method289() && !var0.field3008) {
			var0.field3006 = false;
			if ((field2059 && class264.field1764 > 50 || class264.field1764 > 200) && var1 && var0.field369 == var0.field383) {
				var0.field3006 = true;
			}

			int var3 = var0.field368 >> 7;
			int var4 = var0.field329 >> 7;
			if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
				long var5 = class503.method2386(0, 0, 0, false, var0.field3001);
				if (var0.field2991 != null && field1846 >= var0.field2996 && field1846 < var0.field3011) {
					var0.field3006 = false;
					var0.field2995 = method1347(var0.field368, var0.field329, class212.field1393);
					var0.field333 = field1846;
					class141.field937.method740(class212.field1393, var0.field368, var0.field329, var0.field2995, 60, var0, var0.field330, var5, var0.field3015, var0.field3003, var0.field3004, var0.field3014);
				} else {
					if ((var0.field368 & 127) == 64 && (var0.field329 & 127) == 64) {
						if (field1946[var3][var4] == field1947) {
							return;
						}

						field1946[var3][var4] = field1947;
					}

					var0.field2995 = method1347(var0.field368, var0.field329, class212.field1393);
					var0.field333 = field1846;
					class141.field937.method780(class212.field1393, var0.field368, var0.field329, var0.field2995, 60, var0, var0.field330, var5, var0.field349);
				}
			}
		}

	}

	static final void method1344(boolean var0) {
		for (int var2 = 0; var2 < field1980; ++var2) {
			class378 var3 = field2017[field1893[var2]];
			if (null != var3 && var3.method289() && var0 == var3.field2605.field510 && var3.field2605.method356()) {
				int var4 = var3.field368 >> 7;
				int var5 = var3.field329 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var3.field332 == 1 && (var3.field368 & 127) == 64 && (var3.field329 & 127) == 64) {
						if (field1947 == field1946[var4][var5]) {
							continue;
						}

						field1946[var4][var5] = field1947;
					}

					long var6 = class503.method2386(0, 0, 1, !var3.field2605.field492, field1893[var2]);
					var3.field333 = field1846;
					class141.field937.method780(class212.field1393, var3.field368, var3.field329, method1347(var3.field332 * 64 - 64 + var3.field368, var3.field332 * 64 - 64 + var3.field329, class212.field1393), var3.field332 * 64 - 64 + 60, var3, var3.field330, var6, var3.field349);
				}
			}
		}

	}

	static final void method1462() {
		for (class404 var1 = (class404)field1972.method327(); var1 != null; var1 = (class404)field1972.method331()) {
			if (var1.field2760 == class212.field1393 && field1846 <= var1.field2769) {
				if (field1846 >= var1.field2763) {
					class378 var2;
					int var3;
					Player var4;
					if (!var1.field2785 && var1.field2767 != 0) {
						if (var1.field2767 > 0) {
							var2 = field2017[var1.field2767 - 1];
							if (null != var2 && var2.field368 >= 0 && var2.field368 < 13312 && var2.field329 >= 0 && var2.field329 < 13312) {
								var1.field2761 = var2.field368;
								var1.field2762 = var2.field329;
								var1.method1864(var1.field2765, var1.field2766, var1.field2780, field1846);
							}
						} else {
							var3 = -var1.field2767 - 1;
							if (field1958 == var3) {
								var4 = class114.field720;
							} else {
								var4 = field2037[var3];
							}

							if (var4 != null && var4.field368 >= 0 && var4.field368 < 13312 && var4.field329 >= 0 && var4.field329 < 13312) {
								var1.field2761 = var4.field368;
								var1.field2762 = var4.field329;
								var1.method1864(var1.field2765, var1.field2766, var1.field2780, field1846);
							}
						}
					}

					if (var1.field2759 > 0) {
						var2 = field2017[var1.field2759 - 1];
						if (null != var2 && var2.field368 >= 0 && var2.field368 < 13312 && var2.field329 >= 0 && var2.field329 < 13312) {
							var1.method1864(var2.field368, var2.field329, method1347(var2.field368, var2.field329, var1.field2760) - var1.field2783, field1846);
						}
					}

					if (var1.field2759 < 0) {
						var3 = -var1.field2759 - 1;
						if (field1958 == var3) {
							var4 = class114.field720;
						} else {
							var4 = field2037[var3];
						}

						if (var4 != null && var4.field368 >= 0 && var4.field368 < 13312 && var4.field329 >= 0 && var4.field329 < 13312) {
							var1.method1864(var4.field368, var4.field329, method1347(var4.field368, var4.field329, var1.field2760) - var1.field2783, field1846);
						}
					}

					var1.method1863(field2022);
					class141.field937.method780(class212.field1393, (int)var1.field2768, (int)var1.field2776, (int)var1.field2777, 60, var1, var1.field2775, -1L, false);
				}
			} else {
				var1.method1719();
			}
		}

	}

	static final int method1356() {
		if (class109.field693.method437()) {
			return class212.field1393;
		} else {
			int var1 = 3;
			if (class130.field849 < 310) {
				label138: {
					int var2;
					int var3;
					if (field1923 == 1) {
						var2 = class89.field585 >> 7;
						var3 = class124.field814 >> 7;
					} else {
						var2 = class114.field720.field368 >> 7;
						var3 = class114.field720.field329 >> 7;
					}

					int var4 = field2135 >> 7;
					int var5 = class353.field2437 >> 7;
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
							if ((class129.field835[class212.field1393][var4][var5] & 4) != 0) {
								var1 = class212.field1393;
							}

							int var6;
							if (var2 > var4) {
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2;
							}

							int var7;
							if (var3 > var5) {
								var7 = var3 - var5;
							} else {
								var7 = var5 - var3;
							}

							int var8;
							int var9;
							if (var6 > var7) {
								var8 = var7 * 65536 / var6;
								var9 = 32768;

								while (true) {
									if (var2 == var4) {
										break label138;
									}

									if (var4 < var2) {
										++var4;
									} else if (var4 > var2) {
										--var4;
									}

									if ((class129.field835[class212.field1393][var4][var5] & 4) != 0) {
										var1 = class212.field1393;
									}

									var9 += var8;
									if (var9 >= 65536) {
										var9 -= 65536;
										if (var5 < var3) {
											++var5;
										} else if (var5 > var3) {
											--var5;
										}

										if ((class129.field835[class212.field1393][var4][var5] & 4) != 0) {
											var1 = class212.field1393;
										}
									}
								}
							} else {
								if (var7 > 0) {
									var8 = var6 * 65536 / var7;
									var9 = 32768;

									while (var5 != var3) {
										if (var5 < var3) {
											++var5;
										} else if (var5 > var3) {
											--var5;
										}

										if ((class129.field835[class212.field1393][var4][var5] & 4) != 0) {
											var1 = class212.field1393;
										}

										var9 += var8;
										if (var9 >= 65536) {
											var9 -= 65536;
											if (var4 < var2) {
												++var4;
											} else if (var4 > var2) {
												--var4;
											}

											if ((class129.field835[class212.field1393][var4][var5] & 4) != 0) {
												var1 = class212.field1393;
											}
										}
									}
								}
								break label138;
							}
						}

						return class212.field1393;
					}

					return class212.field1393;
				}
			}

			if (class114.field720.field368 >= 0 && class114.field720.field329 >= 0 && class114.field720.field368 < 13312 && class114.field720.field329 < 13312) {
				if ((class129.field835[class212.field1393][class114.field720.field368 >> 7][class114.field720.field329 >> 7] & 4) != 0) {
					var1 = class212.field1393;
				}

				return var1;
			} else {
				return class212.field1393;
			}
		}
	}

	public static class69 method1304() {
		return field2019;
	}

	static void method1389() {
		for (class399 var1 = (class399)field1848.method327(); var1 != null; var1 = (class399)field1848.method331()) {
			var1.method1719();
		}

	}

	static boolean method1406() {
		return (field2134 & 4) != 0;
	}

	static boolean method1443() {
		return (field2134 & 1) != 0;
	}

	static boolean method1315() {
		return (field2134 & 2) != 0;
	}

	static boolean method1413() {
		return (field2134 & 8) != 0;
	}

	static final void method1394(class65 var0, int var1, int var2, int var3, int var4, int var5) {
		if (null != var0 && var0.method289()) {
			if (var0 instanceof class378) {
				class73 var7 = ((class378)var0).field2605;
				if (var7.field477 != null) {
					var7 = var7.method363();
				}

				if (null == var7) {
					return;
				}
			}

			int var76 = class264.field1764;
			int[] var8 = class264.field1765;
			boolean var9 = var1 < var76;
			int var10 = -2;
			if (var0.field356 != null && (!var9 || !var0.field388 && (field2040 == 4 || !var0.field350 && (field2040 == 0 || field2040 == 3 || field2040 == 1 && ((Player)var0).method2115())))) {
				method1440(var0, var0.field353);
				if (field1948 > -1 && field1930 < field2119) {
					field1940[field1930] = class209.field1388.method1033(var0.field356) / 2;
					field1939[field1930] = class209.field1388.field1483;
					field1937[field1930] = field1948;
					field1938[field1930] = field1966 - -2;
					field1941[field1930] = var0.field397;
					field2136[field1930] = var0.field354;
					field2045[field1930] = var0.field352;
					field1943[field1930] = var0.field337;
					field1945[field1930] = var0.field356;
					++field1930;
					var10 += 12;
				}
			}

			int var16;
			int var20;
			int var23;
			int var24;
			if (!var0.field362.method2090()) {
				method1440(var0, 15 + var0.field353);

				for (class15 var11 = (class15)var0.field362.method2088(); null != var11; var11 = (class15)var0.field362.method2097()) {
					class12 var12 = var11.method67(field1846);
					if (var12 == null) {
						if (var11.method66()) {
							var11.method1719();
						}
					} else {
						class161 var13 = var11.field80;
						class42 var14 = var13.method872();
						class42 var15 = var13.method871();
						int var17 = 0;
						if (var14 != null && null != var15) {
							if (var13.field1163 * 2 < var15.field207) {
								var17 = var13.field1163;
							}

							var16 = var15.field207 - var17 * 2;
						} else {
							var16 = var13.field1162;
						}

						int var18 = 255;
						boolean var19 = true;
						var20 = field1846 - var12.field66;
						int var21 = var12.field65 * var16 / var13.field1162;
						int var22;
						int var94;
						if (var12.field67 > var20) {
							var22 = var13.field1158 == 0 ? 0 : var13.field1158 * (var20 / var13.field1158);
							var23 = var16 * var12.field64 / var13.field1162;
							var94 = var22 * (var21 - var23) / var12.field67 + var23;
						} else {
							var94 = var21;
							var22 = var13.field1155 + var12.field67 - var20;
							if (var13.field1157 >= 0) {
								var18 = (var22 << 8) / (var13.field1155 - var13.field1157);
							}
						}

						if (var12.field65 > 0 && var94 < 1) {
							var94 = 1;
						}

						if (null != var14 && var15 != null) {
							if (var16 == var94) {
								var94 += var17 * 2;
							} else {
								var94 += var17;
							}

							var22 = var14.field209;
							var10 += var22;
							var23 = field1948 + var2 - (var16 >> 1);
							var24 = var3 + field1966 - var10;
							var23 -= var17;
							if (var18 >= 0 && var18 < 255) {
								var14.method178(var23, var24, var18);
								class433.method1959(var23, var24, var94 + var23, var22 + var24);
								var15.method178(var23, var24, var18);
							} else {
								var14.method159(var23, var24);
								class433.method1959(var23, var24, var23 + var94, var24 + var22);
								var15.method159(var23, var24);
							}

							class433.method1958(var2, var3, var4 + var2, var5 + var3);
							var10 += 2;
						} else {
							var10 += 5;
							if (field1948 > -1) {
								var22 = var2 + field1948 - (var16 >> 1);
								var23 = var3 + field1966 - var10;
								class433.method1977(var22, var23, var94, 5, 65280);
								class433.method1977(var22 + var94, var23, var16 - var94, 5, 16711680);
							}

							var10 += 2;
						}
					}
				}
			}

			if (var10 == -2) {
				var10 += 7;
			}

			if (var9 && var0.field333 == field1846) {
				Player var78 = (Player)var0;
				boolean var77;
				if (field2134 == 0) {
					var77 = false;
				} else if (var78 == class114.field720) {
					var77 = method1413();
				} else {
					var77 = method1406() || method1443() && var78.method2115() || method1315() && var78.method2117();
				}

				if (var77) {
					Player var83 = (Player)var0;
					if (var9) {
						method1440(var0, var0.field353 + 15);
						class229 var87 = (class229)field1949.get(class43.field211);
						var10 += 4;
						var87.method1045(var83.field3005.method2398(), var2 + field1948, field1966 + var3 - var10, 16777215, 0);
						var10 += 18;
					}
				}
			}

			int var25;
			int var27;
			class198 var99;
			class42[] var100;
			if (var9) {
				Player var80 = (Player)var0;
				if (var80.field3008) {
					return;
				}

				if (var80.field3000 != -1 || var80.field2988 != -1) {
					method1440(var0, var0.field353 + 15);
					if (field1948 > -1) {
						if (var80.field3000 != -1) {
							var10 += 25;
							class472.field3311[var80.field3000].method159(var2 + field1948 - 12, field1966 + var3 - var10);
						}

						if (var80.field2988 != -1) {
							var10 += 25;
							class49.field236[var80.field2988].method159(var2 + field1948 - 12, field1966 + var3 - var10);
						}
					}
				}

				if (var1 >= 0 && field1853 == 10 && field1855 == var8[var1]) {
					method1440(var0, 15 + var0.field353);
					if (field1948 > -1) {
						var10 += class108.field683[1].field209;
						class108.field683[1].method159(var2 + field1948 - 12, var3 + field1966 - var10);
					}
				}
			} else {
				class378 var82 = (class378)var0;
				int[] var79 = var82.method1767();
				short[] var84 = var82.method1770();
				if (null != var84 && var79 != null) {
					for (int var88 = 0; var88 < var84.length; ++var88) {
						if (var84[var88] >= 0 && var79[var88] >= 0) {
							long var89 = (long)var79[var88] << 8 | (long)var84[var88];
							Object var92 = (class42)field2122.method835(var89);
							if (null == var92) {
								var99 = class514.field4064;
								var20 = var79[var88];
								class42[] var93;
								if (!class168.method887(var99, var20, 0)) {
									var93 = null;
								} else {
									var100 = new class42[class168.field1185];
									var23 = 0;

									while (true) {
										if (var23 >= class168.field1185) {
											class345.method1664();
											var93 = var100;
											break;
										}

										class42 var103 = var100[var23] = new class42();
										var103.field204 = class190.field1289;
										var103.field210 = class203.field1364;
										var103.field206 = class498.field3673[var23];
										var103.field208 = class442.field2971[var23];
										var103.field207 = class28.field136[var23];
										var103.field209 = class168.field1184[var23];
										var25 = var103.field207 * var103.field209;
										byte[] var26 = class299.field2203[var23];
										var103.field205 = new int[var25];

										for (var27 = 0; var27 < var25; ++var27) {
											var103.field205[var27] = class205.field1376[var26[var27] & 255];
										}

										++var23;
									}
								}

								if (var93 != null && var84[var88] < var93.length) {
									var92 = var93[var84[var88]];
									field2122.method832(var89, var92);
								}
							}

							if (null != var92) {
								method1440(var0, var0.field353 + 15);
								if (field1948 > -1) {
									((class42)var92).method159(var2 + field1948 - (((class42)var92).field207 >> 1), var3 - ((class42)var92).field209 + field1966 - 4);
								}
							}
						}
					}
				}

				if (field1853 == 1 && field1893[var1 - var76] == field1854 && field1846 % 20 < 10) {
					method1440(var0, var0.field353 + 15);
					if (field1948 > -1) {
						class108.field683[0].method159(field1948 + var2 - 12, field1966 + var3 - 28);
					}
				}
			}

			for (int var85 = 0; var85 < 4; ++var85) {
				int var81 = var0.field398[var85];
				int var86 = var0.field357[var85];
				class156 var90 = null;
				int var91 = 0;
				if (var86 >= 0) {
					if (var81 <= field1846) {
						continue;
					}

					var90 = class156.method830(var0.field357[var85]);
					var91 = var90.field1067;
					if (null != var90 && var90.field1078 != null) {
						var90 = var90.method821();
						if (null == var90) {
							var0.field398[var85] = -1;
							continue;
						}
					}
				} else if (var81 < 0) {
					continue;
				}

				var16 = var0.field402[var85];
				class156 var95 = null;
				if (var16 >= 0) {
					var95 = class156.method830(var16);
					if (var95 != null && null != var95.field1078) {
						var95 = var95.method821();
					}
				}

				if (var81 - var91 <= field1846) {
					if (var90 == null) {
						var0.field398[var85] = -1;
					} else {
						method1440(var0, var0.field353 / 2);
						if (field1948 > -1) {
							boolean var96 = true;
							if (var85 == 1) {
								field1966 -= 20;
							}

							if (var85 == 2) {
								field1948 -= 15;
								field1966 -= 10;
							}

							if (var85 == 3) {
								field1948 += 15;
								field1966 -= 10;
							}

							var99 = null;
							class42 var97 = null;
							class42 var98 = null;
							var100 = null;
							var23 = 0;
							var24 = 0;
							var25 = 0;
							int var104 = 0;
							var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							class42 var31 = null;
							class42 var32 = null;
							class42 var33 = null;
							class42 var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							class42 var101 = var90.method822();
							int var44;
							if (var101 != null) {
								var23 = var101.field207;
								var44 = var101.field209;
								if (var44 > 0) {
									var43 = var44;
								}

								var27 = var101.field206;
							}

							var97 = var90.method823();
							if (null != var97) {
								var24 = var97.field207;
								var44 = var97.field209;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var97.field206;
							}

							var98 = var90.method824();
							if (var98 != null) {
								var25 = var98.field207;
								var44 = var98.field209;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var98.field206;
							}

							class42 var102 = var90.method825();
							if (null != var102) {
								var104 = var102.field207;
								var44 = var102.field209;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var102.field206;
							}

							if (var95 != null) {
								var31 = var95.method822();
								if (null != var31) {
									var35 = var31.field207;
									var44 = var31.field209;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.field206;
								}

								var32 = var95.method823();
								if (null != var32) {
									var36 = var32.field207;
									var44 = var32.field209;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.field206;
								}

								var33 = var95.method824();
								if (null != var33) {
									var37 = var33.field207;
									var44 = var33.field209;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.field206;
								}

								var34 = var95.method825();
								if (var34 != null) {
									var38 = var34.field207;
									var44 = var34.field209;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.field206;
								}
							}

							class282 var105 = var90.method828();
							if (var105 == null) {
								var105 = class434.field2908;
							}

							class282 var45;
							if (var95 != null) {
								var45 = var95.method828();
								if (var45 == null) {
									var45 = class434.field2908;
								}
							} else {
								var45 = class434.field2908;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var90.method827(var0.field386[var85]);
							int var106 = var105.method1033(var46);
							if (null != var95) {
								var47 = var95.method827(var0.field374[var85]);
								var49 = var45.method1033(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (null == var98 && var102 == null) {
									var50 = 1;
								} else {
									var50 = 1 + var106 / var24;
								}
							}

							if (var95 != null && var36 > 0) {
								if (var33 == null && var34 == null) {
									var51 = 1;
								} else {
									var51 = 1 + var49 / var36;
								}
							}

							int var52 = 0;
							boolean var53 = false;
							if (var23 > 0) {
								var52 = 0 + var23;
							}

							var52 += 2;
							int var54 = var52;
							if (var25 > 0) {
								var52 += var25;
							}

							int var55 = var52;
							int var56 = var52;
							int var57;
							if (var24 > 0) {
								var57 = var24 * var50;
								var52 += var57;
								var56 += (var57 - var106) / 2;
							} else {
								var52 += var106;
							}

							var57 = var52;
							if (var104 > 0) {
								var52 += var104;
							}

							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62 = 0;
							int var63;
							if (var95 != null) {
								var52 += 2;
								var58 = var52;
								if (var35 > 0) {
									var52 += var35;
								}

								var52 += 2;
								var59 = var52;
								if (var37 > 0) {
									var52 += var37;
								}

								var60 = var52;
								var62 = var52;
								if (var36 > 0) {
									var63 = var36 * var51;
									var52 += var63;
									var62 += (var63 - var49) / 2;
								} else {
									var52 += var49;
								}

								var61 = var52;
								if (var38 > 0) {
									var52 += var38;
								}
							}

							var63 = var0.field398[var85] - field1846;
							int var64 = var90.field1072 - var90.field1072 * var63 / var90.field1067;
							int var65 = var63 * var90.field1064 / var90.field1067 + -var90.field1064;
							int var66 = var2 + field1948 - (var52 >> 1) + var64;
							int var67 = var3 + field1966 - 12 + var65;
							int var68 = var67;
							int var69 = var43 + var67;
							int var70 = var90.field1065 + var67 + 15;
							int var71 = var70 - var105.field1484;
							int var72 = var105.field1490 + var70;
							if (var71 < var67) {
								var68 = var71;
							}

							if (var72 > var69) {
								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (null != var95) {
								var73 = var67 + 15 + var95.field1065;
								var74 = var73 - var45.field1484;
								var75 = var45.field1490 + var73;
								if (var74 < var68) {
									;
								}

								if (var75 > var69) {
									;
								}
							}

							var74 = 255;
							if (var90.field1074 >= 0) {
								var74 = (var63 << 8) / (var90.field1067 - var90.field1074);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var101 != null) {
									var101.method178(0 + var66 - var27, var67, var74);
								}

								if (var98 != null) {
									var98.method178(var66 + var54 - var29, var67, var74);
								}

								if (var97 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var97.method178(var55 + var66 - var28 + var75 * var24, var67, var74);
									}
								}

								if (null != var102) {
									var102.method178(var57 + var66 - var30, var67, var74);
								}

								var105.method1038(var46, var66 + var56, var70, var90.field1066, 0, var74);
								if (var95 != null) {
									if (null != var31) {
										var31.method178(var66 + var58 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.method178(var66 + var59 - var41, var67, var74);
									}

									if (null != var32) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.method178(var75 * var36 + (var66 + var60 - var40), var67, var74);
										}
									}

									if (var34 != null) {
										var34.method178(var66 + var61 - var42, var67, var74);
									}

									var45.method1038(var47, var62 + var66, var73, var95.field1066, 0, var74);
								}
							} else {
								if (null != var101) {
									var101.method159(var66 + 0 - var27, var67);
								}

								if (null != var98) {
									var98.method159(var66 + var54 - var29, var67);
								}

								if (var97 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var97.method159(var66 + var55 - var28 + var75 * var24, var67);
									}
								}

								if (null != var102) {
									var102.method159(var66 + var57 - var30, var67);
								}

								var105.method1037(var46, var56 + var66, var70, var90.field1066 | -16777216, 0);
								if (null != var95) {
									if (var31 != null) {
										var31.method159(var58 + var66 - var39, var67);
									}

									if (var33 != null) {
										var33.method159(var66 + var59 - var41, var67);
									}

									if (null != var32) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.method159(var66 + var60 - var40 + var75 * var36, var67);
										}
									}

									if (null != var34) {
										var34.method159(var66 + var61 - var42, var67);
									}

									var45.method1037(var47, var66 + var62, var73, var95.field1066 | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}

	static final void method1453() {
		field2102 = 0;
		int var1 = class80.selectedTileX + (class114.field720.field368 >> 7);
		int var2 = class425.selectedTileXYIdk + (class114.field720.field329 >> 7);
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field2102 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field2102 = 1;
		}

		if (field2102 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field2102 = 0;
		}

	}

	static final void method1440(class65 var0, int var1) {
		method1351(var0.field368, var0.field329, var1);
	}

	static final void method1351(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var4 = method1347(var0, var1, class212.field1393) - var2;
			var0 -= field2135;
			var4 -= class122.field794;
			var1 -= class353.field2437;
			int var5 = class105.field670[class130.field849];
			int var6 = class105.field671[class130.field849];
			int var7 = class105.field670[class76.field537];
			int var8 = class105.field671[class76.field537];
			int var9 = var0 * var8 + var1 * var7 >> 16;
			var1 = var8 * var1 - var7 * var0 >> 16;
			var0 = var9;
			var9 = var6 * var4 - var5 * var1 >> 16;
			var1 = var4 * var5 + var6 * var1 >> 16;
			if (var1 >= 50) {
				field1948 = field1836 / 2 + field1905 * var0 / var1;
				field1966 = var9 * field1905 / var1 + field2114 / 2;
			} else {
				field1948 = -1;
				field1966 = -1;
			}

		} else {
			field1948 = -1;
			field1966 = -1;
		}
	}

	static final int method1347(int var0, int var1, int var2) {
		int var4 = var0 >> 7;
		int var5 = var1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = var2;
			if (var2 < 3 && (class129.field835[1][var4][var5] & 2) == 2) {
				var6 = var2 + 1;
			}

			int var7 = var0 & 127;
			int var8 = var1 & 127;
			int var9 = (128 - var7) * class129.field844[var6][var4][var5] + var7 * class129.field844[var6][var4 + 1][var5] >> 7;
			int var10 = (128 - var7) * class129.field844[var6][var4][var5 + 1] + var7 * class129.field844[var6][var4 + 1][var5 + 1] >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		} else {
			return 0;
		}
	}

	static final void rebuildRegionNormal(boolean var0, PacketBuffer buf) {
		isInstance = var0;
		int chunkY;
		int regionCount;
		int regionX;
		int regionY;
		int regionId;
		if (!isInstance) {
			chunkY = buf.readUnsignedShort();
			int chunkX = buf.readUnsignedShortADD();
			regionCount = buf.readUnsignedShort();
			class94.regionXteaKeys = new int[regionCount][4];

			for (regionX = 0; regionX < regionCount; ++regionX) {
				for (regionY = 0; regionY < 4; ++regionY) {
					class94.regionXteaKeys[regionX][regionY] = buf.readInt();
				}
			}

			class529.field4140 = new int[regionCount];
			class516.field4078 = new int[regionCount];
			class512.field3748 = new int[regionCount];
			class445.field2975 = new byte[regionCount][];
			class413.field2848 = new byte[regionCount][];
			regionCount = 0;

			for (regionX = (chunkX - 6) / 8; regionX <= (chunkX + 6) / 8; ++regionX) {
				for (regionY = (chunkY - 6) / 8; regionY <= (chunkY + 6) / 8; ++regionY) {
					regionId = regionY + (regionX << 8);
					class529.field4140[regionCount] = regionId;
					class516.field4078[regionCount] = class522.field4107.method28("m" + regionX + "_" + regionY);
					class512.field3748[regionCount] = class522.field4107.method28("l" + regionX + "_" + regionY);
					++regionCount;
				}
			}

			method1334(chunkX, chunkY, true);
		} else {
			chunkY = buf.readUnsignedShortLEADD();
			boolean var16 = buf.readUnsignedByteNEG() == 1;
			regionCount = buf.readUnsignedShortLE();
			regionX = buf.readUnsignedShort();
			buf.method1497();

			int var9;
			int var10;
			for (regionY = 0; regionY < 4; ++regionY) {
				for (regionId = 0; regionId < 13; ++regionId) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = buf.method1501(1);
						if (var10 == 1) {
							field1908[regionY][regionId][var9] = buf.method1501(26);
						} else {
							field1908[regionY][regionId][var9] = -1;
						}
					}
				}
			}

			buf.method1504();
			class94.regionXteaKeys = new int[regionX][4];

			for (regionY = 0; regionY < regionX; ++regionY) {
				for (regionId = 0; regionId < 4; ++regionId) {
					class94.regionXteaKeys[regionY][regionId] = buf.readInt();
				}
			}

			class529.field4140 = new int[regionX];
			class516.field4078 = new int[regionX];
			class512.field3748 = new int[regionX];
			class445.field2975 = new byte[regionX][];
			class413.field2848 = new byte[regionX][];
			regionX = 0;

			for (regionY = 0; regionY < 4; ++regionY) {
				for (regionId = 0; regionId < 13; ++regionId) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = field1908[regionY][regionId][var9];
						if (var10 != -1) {
							int var11 = var10 >> 14 & 1023;
							int var12 = var10 >> 3 & 2047;
							int var13 = (var11 / 8 << 8) + var12 / 8;

							int var14;
							for (var14 = 0; var14 < regionX; ++var14) {
								if (class529.field4140[var14] == var13) {
									var13 = -1;
									break;
								}
							}

							if (var13 != -1) {
								class529.field4140[regionX] = var13;
								var14 = var13 >> 8 & 255;
								int var15 = var13 & 255;
								class516.field4078[regionX] = class522.field4107.method28("m" + var14 + "_" + var15);
								class512.field3748[regionX] = class522.field4107.method28("l" + var14 + "_" + var15);
								++regionX;
							}
						}
					}
				}
			}

			method1334(regionCount, chunkY, !var16);
		}

	}

	static final void method1334(int var0, int var1, boolean var2) {
		if (!var2 || class344.field2404 != var0 || var1 != class130.field848) {
			class344.field2404 = var0;
			class130.field848 = var1;
			class432.method1954(25);
			method1452(class513.field3797, true);
			int var4 = class80.selectedTileX;
			int var5 = class425.selectedTileXYIdk;
			class80.selectedTileX = (var0 - 6) * 8;
			class425.selectedTileXYIdk = (var1 - 6) * 8;
			int var6 = class80.selectedTileX - var4;
			int var7 = class425.selectedTileXYIdk - var5;
			var4 = class80.selectedTileX;
			var5 = class425.selectedTileXYIdk;

			int var8;
			int var10;
			int[] var10000;
			for (var8 = 0; var8 < 65536; ++var8) {
				class378 var9 = field2017[var8];
				if (var9 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var9.field399;
						var10000[var10] -= var6;
						var10000 = var9.field400;
						var10000[var10] -= var7;
					}

					var9.field368 -= var6 * 128;
					var9.field329 -= var7 * 128;
				}
			}

			for (var8 = 0; var8 < 2048; ++var8) {
				Player var20 = field2037[var8];
				if (null != var20) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var20.field399;
						var10000[var10] -= var6;
						var10000 = var20.field400;
						var10000[var10] -= var7;
					}

					var20.field368 -= var6 * 128;
					var20.field329 -= var7 * 128;
				}
			}

			byte var19 = 0;
			byte var21 = 104;
			byte var22 = 1;
			if (var6 < 0) {
				var19 = 103;
				var21 = -1;
				var22 = -1;
			}

			byte var11 = 0;
			byte var12 = 104;
			byte var13 = 1;
			if (var7 < 0) {
				var11 = 103;
				var12 = -1;
				var13 = -1;
			}

			int var15;
			for (int var14 = var19; var21 != var14; var14 += var22) {
				for (var15 = var11; var15 != var12; var15 += var13) {
					int var16 = var6 + var14;
					int var17 = var7 + var15;

					for (int var18 = 0; var18 < 4; ++var18) {
						if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
							field2000[var18][var14][var15] = field2000[var18][var16][var17];
						} else {
							field2000[var18][var14][var15] = null;
						}
					}
				}
			}

			for (class145 var23 = (class145)field1971.method327(); var23 != null; var23 = (class145)field1971.method331()) {
				var23.field1007 -= var6;
				var23.field1004 -= var7;
				if (var23.field1007 < 0 || var23.field1004 < 0 || var23.field1007 >= 104 || var23.field1004 >= 104) {
					var23.method1719();
				}
			}

			if (field1840 != 0) {
				field1840 -= var6;
				field2081 -= var7;
			}

			field1957 = 0;
			field2080 = false;
			field2135 -= var6 << 7;
			class353.field2437 -= var7 << 7;
			class89.field585 -= var6 << 7;
			class124.field814 -= var7 << 7;
			field2075 = -1;
			field1973.method329();
			field1972.method329();

			for (var15 = 0; var15 < 4; ++var15) {
				field1906[var15].method801();
			}

		}
	}

	static final void method1386(boolean var0) {
		class253.method1209();
		++field1891.field4225;
		if (field1891.field4225 >= 50 || var0) {
			field1891.field4225 = 0;
			if (!field2036 && field1891.method2611() != null) {
				class341 var2 = class341.createClientPacket(ClientPacket.field3092, field1891.field4219);
				field1891.method2612(var2);

				try {
					field1891.method2608();
				} catch (IOException var4) {
					field2036 = true;
				}
			}

		}
	}

	static final void method1328(int var0) {
		int[] var2 = class313.field2271.field205;
		int var3 = var2.length;

		int var4;
		for (var4 = 0; var4 < var3; ++var4) {
			var2[var4] = 0;
		}

		int var5;
		int var6;
		for (var4 = 1; var4 < 103; ++var4) {
			var5 = (103 - var4) * 2048 + 24628;

			for (var6 = 1; var6 < 103; ++var6) {
				if ((class129.field835[var0][var6][var4] & 24) == 0) {
					class141.field937.method756(var2, var5, 512, var0, var6, var4);
				}

				if (var0 < 3 && (class129.field835[var0 + 1][var6][var4] & 8) != 0) {
					class141.field937.method756(var2, var5, 512, var0 + 1, var6, var4);
				}

				var5 += 4;
			}
		}

		var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		class313.field2271.method179();

		int var7;
		for (var6 = 1; var6 < 103; ++var6) {
			for (var7 = 1; var7 < 103; ++var7) {
				if ((class129.field835[var0][var7][var6] & 24) == 0) {
					method1308(var0, var7, var6, var4, var5);
				}

				if (var0 < 3 && (class129.field835[var0 + 1][var7][var6] & 8) != 0) {
					method1308(var0 + 1, var7, var6, var4, var5);
				}
			}
		}

		field1912 = 0;

		for (var6 = 0; var6 < 104; ++var6) {
			for (var7 = 0; var7 < 104; ++var7) {
				long var8 = class141.field937.method773(class212.field1393, var6, var7);
				if (0L != var8) {
					int var10 = class503.method2376(var8);
					int var11 = class109.method504(var10).field2714;
					if (var11 >= 0 && class63.method269(var11).field308) {
						field2079[field1912] = class63.method269(var11).method264(false);
						field2077[field1912] = var6;
						field2078[field1912] = var7;
						++field1912;
					}
				}
			}
		}

		class246.field1638.method2635();
	}

	static final void method1308(int var0, int var1, int var2, int var3, int var4) {
		long var6 = class141.field937.method758(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var13;
		int var14;
		if (var6 != 0L) {
			var8 = class141.field937.method762(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			if (class503.method2385(var6)) {
				var11 = var4;
			}

			int[] var12 = class313.field2271.field205;
			var13 = 2048 * (103 - var2) + 24624 + var1 * 4;
			var14 = class503.method2376(var6);
			class397 var15 = class109.method504(var14);
			if (var15.field2737 != -1) {
				class230 var16 = class11.field63[var15.field2737];
				if (null != var16) {
					int var17 = (var15.field2701 * 4 - var16.field1503) / 2;
					int var18 = (var15.field2702 * 4 - var16.field1501) / 2;
					var16.method1065(var17 + var1 * 4 + 48, (104 - var2 - var15.field2702) * 4 + 48 + var18);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 1) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3] = var11;
						var12[var13 + 3 + 512] = var11;
						var12[var13 + 3 + 1024] = var11;
						var12[var13 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[3 + var13 + 1536] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var12[var13] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
						var12[var13 + 3 + 512] = var11;
						var12[1024 + var13 + 3] = var11;
						var12[var13 + 3 + 1536] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536] = var11;
						var12[1 + var13 + 1536] = var11;
						var12[2 + var13 + 1536] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = class141.field937.method750(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class141.field937.method762(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class503.method2376(var6);
			class397 var21 = class109.method504(var11);
			int var25;
			if (var21.field2737 != -1) {
				class230 var23 = class11.field63[var21.field2737];
				if (null != var23) {
					var14 = (var21.field2701 * 4 - var23.field1503) / 2;
					var25 = (var21.field2702 * 4 - var23.field1501) / 2;
					var23.method1065(var1 * 4 + 48 + var14, (104 - var2 - var21.field2702) * 4 + 48 + var25);
				}
			} else if (var10 == 9) {
				var13 = 15658734;
				if (class503.method2385(var6)) {
					var13 = 15597568;
				}

				int[] var24 = class313.field2271.field205;
				var25 = (103 - var2) * 2048 + var1 * 4 + 24624;
				if (var9 != 0 && var9 != 2) {
					var24[var25] = var13;
					var24[1 + var25 + 512] = var13;
					var24[var25 + 1024 + 2] = var13;
					var24[3 + var25 + 1536] = var13;
				} else {
					var24[var25 + 1536] = var13;
					var24[var25 + 1024 + 1] = var13;
					var24[var25 + 512 + 2] = var13;
					var24[var25 + 3] = var13;
				}
			}
		}

		var6 = class141.field937.method773(var0, var1, var2);
		if (0L != var6) {
			var8 = class503.method2376(var6);
			class397 var19 = class109.method504(var8);
			if (var19.field2737 != -1) {
				class230 var20 = class11.field63[var19.field2737];
				if (null != var20) {
					var11 = (var19.field2701 * 4 - var20.field1503) / 2;
					int var22 = (var19.field2702 * 4 - var20.field1501) / 2;
					var20.method1065(var11 + 48 + var1 * 4, 48 + 4 * (104 - var2 - var19.field2702) + var22);
				}
			}
		}

	}

	static final void method1346(class310 var0) {
		PacketBuffer var2 = field1891.field4220;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		if (class310.field2253 == var0) {
			var3 = var2.readUnsignedByte();
			var4 = class458.field3045 + (var3 >> 4 & 7);
			var5 = (var3 & 7) + class391.field2669;
			var6 = var2.readUnsignedByteSUB();
			var7 = var6 >> 2;
			var8 = var6 & 3;
			var9 = field1909[var7];
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				class425.method1926(class212.field1393, var4, var5, var9, -1, var7, var8, 31, 0, -1);
			}

		} else {
			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			byte var32;
			int var45;
			int var47;
			class404 var48;
			if (var0 == class310.field2251) {
				var3 = var2.readUnsignedByteADD() * 4;
				var4 = var2.readUnsignedByteADD();
				byte var33 = var2.readByteADD();
				var6 = var2.readUnsignedShortLE();
				var32 = var2.readByteNEG();
				var8 = var2.readUnsignedByteNEG();
				var9 = class458.field3045 + (var8 >> 4 & 7);
				var10 = (var8 & 7) + class391.field2669;
				var11 = var2.method2505();
				var12 = var2.readUnsignedShort();
				var13 = var2.method2506();
				var14 = var2.readUnsignedByteNEG();
				var45 = var2.readUnsignedShortLE();
				var47 = var2.readUnsignedByteSUB() * 4;
				var7 = var32 + var9;
				var5 = var33 + var10;
				if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var7 >= 0 && var5 >= 0 && var7 < 104 && var5 < 104 && var12 != 65535) {
					var9 = var9 * 128 + 64;
					var10 = var10 * 128 + 64;
					var7 = 64 + var7 * 128;
					var5 = 64 + var5 * 128;
					var48 = new class404(var12, class212.field1393, var9, var10, method1347(var9, var10, class212.field1393) - var47, var6 + field1846, var45 + field1846, var4, var14, var13, var11, var3);
					var48.method1864(var7, var5, method1347(var7, var5, class212.field1393) - var3, var6 + field1846);
					field1972.method323(var48);
				}

			} else if (var0 == class310.field2252) {
				var3 = var2.readUnsignedShortLEADD();
				var4 = var2.readUnsignedByteSUB();
				var5 = class458.field3045 + (var4 >> 4 & 7);
				var6 = class391.field2669 + (var4 & 7);
				var7 = var2.readUnsignedIntLE();
				var8 = var2.readUnsignedIntME();
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
					class69 var41 = field2000[class212.field1393][var5][var6];
					if (var41 != null) {
						for (class441 var37 = (class441)var41.method327(); var37 != null; var37 = (class441)var41.method331()) {
							if (var37.field2967 == (var3 & 32767) && var8 == var37.field2969) {
								var37.field2969 = var7;
								break;
							}
						}

						method1314(var5, var6);
					}
				}

			} else {
				byte var15;
				if (class310.field2244 == var0) {
					var3 = var2.readUnsignedByte() * 4;
					var4 = var2.readUnsignedShortLE();
					var5 = var2.method2505();
					var6 = var2.readUnsignedByte() * 4;
					var7 = var2.readUnsignedShortLEADD();
					var8 = var2.method2505();
					var9 = var2.readUnsignedShortLE();
					var10 = var2.readUnsignedShortADD();
					var11 = var2.readUnsignedByteSUB();
					var12 = (var11 >> 4 & 7) + class458.field3045;
					var13 = (var11 & 7) + class391.field2669;
					byte var44 = var2.readByteADD();
					var15 = var2.readByte();
					var47 = var2.readUnsignedByteSUB();
					var14 = var44 + var12;
					var45 = var15 + var13;
					if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && var14 >= 0 && var45 >= 0 && var14 < 104 && var45 < 104 && var9 != 65535) {
						var12 = var12 * 128 + 64;
						var13 = var13 * 128 + 64;
						var14 = 64 + var14 * 128;
						var45 = var45 * 128 + 64;
						var48 = new class404(var9, class212.field1393, var12, var13, method1347(var12, var13, class212.field1393) - var6, var7 + field1846, var4 + field1846, var47, var10, var5, var8, var3);
						var48.method1864(var14, var45, method1347(var14, var45, class212.field1393) - var3, field1846 + var7);
						field1972.method323(var48);
					}

				} else if (var0 == class310.field2254) {
					var3 = var2.readUnsignedByteNEG();
					var4 = var2.readUnsignedShortLE();
					var5 = var2.readUnsignedByteSUB();
					var6 = (var5 >> 4 & 7) + class458.field3045;
					var7 = (var5 & 7) + class391.field2669;
					var8 = var2.readUnsignedByte() * 4;
					var9 = var2.readUnsignedShortLE();
					var10 = var2.readMedium();
					var11 = var2.readUnsignedByteNEG() * 4;
					var12 = var2.readUnsignedShortADD();
					byte var43 = var2.readByte();
					var14 = var2.readUnsignedByteNEG();
					var15 = var2.readByteSUB();
					var13 = var43 + var6;
					var45 = var15 + var7;
					if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var13 >= 0 && var45 >= 0 && var13 < 104 && var45 < 104 && var4 != 65535) {
						var6 = var6 * 128 + 64;
						var7 = var7 * 128 + 64;
						var13 = 64 + var13 * 128;
						var45 = 64 + var45 * 128;
						class404 var46 = new class404(var4, class212.field1393, var6, var7, method1347(var6, var7, class212.field1393) - var8, field1846 + var12, field1846 + var9, var3, var14, var10, var11);
						var46.method1864(var13, var45, method1347(var13, var45, class212.field1393) - var11, var12 + field1846);
						field1972.method323(var46);
					}

				} else if (class310.field2247 == var0) {
					var3 = var2.readUnsignedShortLEADD();
					var4 = var2.readUnsignedByteSUB();
					var5 = class458.field3045 + (var4 >> 4 & 7);
					var6 = (var4 & 7) + class391.field2669;
					var7 = var2.readUnsignedByteADD();
					var8 = var7 >> 2;
					var9 = var7 & 3;
					var10 = field1909[var8];
					if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
						if (var10 == 0) {
							class493 var38 = class141.field937.method747(class212.field1393, var5, var6);
							if (var38 != null) {
								var12 = class503.method2376(var38.field3513);
								if (var8 == 2) {
									var38.field3510 = new class525(var12, 2, var9 + 4, class212.field1393, var5, var6, var3, false, var38.field3510);
									var38.field3511 = new class525(var12, 2, var9 + 1 & 3, class212.field1393, var5, var6, var3, false, var38.field3511);
								} else {
									var38.field3510 = new class525(var12, var8, var9, class212.field1393, var5, var6, var3, false, var38.field3510);
								}

								return;
							}
						}

						if (var10 == 1) {
							class76 var39 = class141.field937.method748(class212.field1393, var5, var6);
							if (null != var39) {
								var12 = class503.method2376(var39.field536);
								if (var8 != 4 && var8 != 5) {
									if (var8 == 6) {
										var39.field539 = new class525(var12, 4, var9 + 4, class212.field1393, var5, var6, var3, false, var39.field539);
									} else if (var8 == 7) {
										var39.field539 = new class525(var12, 4, 4 + (var9 + 2 & 3), class212.field1393, var5, var6, var3, false, var39.field539);
									} else if (var8 == 8) {
										var39.field539 = new class525(var12, 4, var9 + 4, class212.field1393, var5, var6, var3, false, var39.field539);
										var39.field527 = new class525(var12, 4, 4 + (var9 + 2 & 3), class212.field1393, var5, var6, var3, false, var39.field527);
									}
								} else {
									var39.field539 = new class525(var12, 4, var9, class212.field1393, var5, var6, var3, false, var39.field539);
								}

								return;
							}
						}

						if (var10 == 2) {
							class486 var40 = class141.field937.method782(class212.field1393, var5, var6);
							if (var8 == 11) {
								var8 = 10;
							}

							if (null != var40) {
								var40.field3411 = new class525(class503.method2376(var40.field3418), var8, var9, class212.field1393, var5, var6, var3, false, var40.field3411);
								return;
							}
						}

						if (var10 == 3) {
							class553 var42 = class141.field937.method783(class212.field1393, var5, var6);
							if (null != var42) {
								var42.field4312 = new class525(class503.method2376(var42.field4310), 22, var9, class212.field1393, var5, var6, var3, false, var42.field4312);
								return;
							}
						}

						method1415(class212.field1393, var5, var6, var10, var3);
					}

				} else {
					if (var0 == class310.field2243) {
						var3 = var2.readUnsignedByteADD();
						var4 = var2.readUnsignedShortLE();
						var5 = var2.readUnsignedByteSUB();
						var6 = var5 >> 4 & 15;
						var7 = var5 & 7;
						var8 = var2.readUnsignedByteADD();
						var9 = (var8 >> 4 & 7) + class458.field3045;
						var10 = (var8 & 7) + class391.field2669;
						if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
							var11 = var6 + 1;
							if (class114.field720.field399[0] >= var9 - var11 && class114.field720.field399[0] <= var11 + var9 && class114.field720.field400[0] >= var10 - var11 && class114.field720.field400[0] <= var11 + var10 && class109.field693.method464() != 0 && var7 > 0 && field1957 < 50) {
								field2124[field1957] = var4;
								field1887[field1957] = var7;
								field1913[field1957] = var3;
								field2089[field1957] = null;
								field2088[field1957] = (var9 << 16) + (var10 << 8) + var6;
								++field1957;
							}
						}
					}

					if (var0 == class310.field2242) {
						var3 = var2.readUnsignedShortLEADD();
						var4 = var2.readUnsignedByte();
						var5 = class458.field3045 + (var4 >> 4 & 7);
						var6 = class391.field2669 + (var4 & 7);
						var32 = var2.readByteSUB();
						var8 = var2.readUnsignedShortLE();
						var9 = var2.readUnsignedShort();
						var10 = var2.readUnsignedShortADD();
						var11 = var2.readUnsignedByteNEG();
						var12 = var11 >> 2;
						var13 = var11 & 3;
						var14 = field1909[var12];
						var15 = var2.readByteNEG();
						byte var16 = var2.readByteSUB();
						byte var17 = var2.readByteADD();
						Player var18;
						if (var8 == field1958) {
							var18 = class114.field720;
						} else {
							var18 = field2037[var8];
						}

						if (null != var18) {
							class397 var19 = class109.method504(var9);
							int var20;
							int var21;
							if (var13 != 1 && var13 != 3) {
								var20 = var19.field2701;
								var21 = var19.field2702;
							} else {
								var20 = var19.field2702;
								var21 = var19.field2701;
							}

							int var22 = var5 + (var20 >> 1);
							int var23 = var5 + (var20 + 1 >> 1);
							int var24 = var6 + (var21 >> 1);
							int var25 = (var21 + 1 >> 1) + var6;
							int[][] var26 = class129.field844[class212.field1393];
							int var27 = var26[var22][var24] + var26[var23][var24] + var26[var22][var25] + var26[var23][var25] >> 2;
							int var28 = (var20 << 6) + (var5 << 7);
							int var29 = (var21 << 6) + (var6 << 7);
							class490 var30 = var19.method1842(var12, var13, var26, var28, var27, var29);
							if (var30 != null) {
								class425.method1926(class212.field1393, var5, var6, var14, -1, 0, 0, 31, var3 + 1, var10 + 1);
								var18.field2996 = field1846 + var3;
								var18.field3011 = field1846 + var10;
								var18.field2991 = var30;
								var18.field2998 = var20 * 64 + var5 * 128;
								var18.field2990 = var21 * 64 + var6 * 128;
								var18.field2997 = var27;
								byte var31;
								if (var17 > var32) {
									var31 = var17;
									var17 = var32;
									var32 = var31;
								}

								if (var15 > var16) {
									var31 = var15;
									var15 = var16;
									var16 = var31;
								}

								var18.field3015 = var17 + var5;
								var18.field3004 = var32 + var5;
								var18.field3003 = var15 + var6;
								var18.field3014 = var16 + var6;
							}
						}
					}

					class441 var35;
					if (class310.field2246 == var0) {
						var3 = var2.readUnsignedByteADD();
						var4 = var2.readUnsignedIntIME();
						var5 = var2.readUnsignedByteADD();
						var6 = class458.field3045 + (var5 >> 4 & 7);
						var7 = (var5 & 7) + class391.field2669;
						var2.readUnsignedByteADD();
						var2.readUnsignedShortLEADD();
						var2.readUnsignedByteSUB();
						var8 = var2.readUnsignedShort();
						var2.readUnsignedShort();
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
							var35 = new class441();
							var35.field2967 = var8;
							var35.field2969 = var4;
							var35.method2081(var3);
							if (field2000[class212.field1393][var6][var7] == null) {
								field2000[class212.field1393][var6][var7] = new class69();
							}

							field2000[class212.field1393][var6][var7].method323(var35);
							method1314(var6, var7);
						}

					} else {
						class69 var34;
						if (class310.field2245 == var0) {
							var3 = var2.readUnsignedByteADD();
							var4 = (var3 >> 4 & 7) + class458.field3045;
							var5 = (var3 & 7) + class391.field2669;
							var6 = var2.readUnsignedShort();
							var7 = var2.readUnsignedByteSUB();
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
								var34 = field2000[class212.field1393][var4][var5];
								if (null != var34) {
									for (var35 = (class441)var34.method327(); null != var35; var35 = (class441)var34.method331()) {
										if (var35.field2967 == (var6 & 32767)) {
											var35.method2081(var7);
											break;
										}
									}
								}
							}

						} else if (var0 != class310.field2248) {
							if (var0 == class310.field2249) {
								var3 = var2.readUnsignedShort();
								var4 = var2.readUnsignedShort();
								var5 = var2.readUnsignedByte();
								var6 = class458.field3045 + (var5 >> 4 & 7);
								var7 = (var5 & 7) + class391.field2669;
								var8 = var2.readUnsignedByteNEG();
								if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
									var6 = var6 * 128 + 64;
									var7 = var7 * 128 + 64;
									class473 var36 = new class473(var4, class212.field1393, var6, var7, method1347(var6, var7, class212.field1393) - var8, var3, field1846);
									field1973.method323(var36);
								}

							} else if (class310.field2250 == var0) {
								var3 = var2.readUnsignedByte();
								var4 = var2.readUnsignedByteADD();
								var5 = var4 >> 2;
								var6 = var4 & 3;
								var7 = field1909[var5];
								var8 = var2.readUnsignedByteADD();
								var9 = class458.field3045 + (var8 >> 4 & 7);
								var10 = class391.field2669 + (var8 & 7);
								var11 = var2.readUnsignedShortADD();
								if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
									class425.method1926(class212.field1393, var9, var10, var7, var11, var5, var6, var3, 0, -1);
								}

							}
						} else {
							var3 = var2.readUnsignedIntLE();
							var4 = var2.readUnsignedByteADD();
							var5 = (var4 >> 4 & 7) + class458.field3045;
							var6 = (var4 & 7) + class391.field2669;
							var7 = var2.readUnsignedShortLEADD();
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
								var34 = field2000[class212.field1393][var5][var6];
								if (var34 != null) {
									for (var35 = (class441)var34.method327(); var35 != null; var35 = (class441)var34.method331()) {
										if (var35.field2967 == (var7 & 32767) && var35.field2969 == var3) {
											var35.method1719();
											break;
										}
									}

									if (var34.method327() == null) {
										field2000[class212.field1393][var5][var6] = null;
									}

									method1314(var5, var6);
								}
							}

						}
					}
				}
			}
		}
	}

	static final boolean method1415(int var0, int var1, int var2, int var3, int var4) {
		class145 var6 = null;

		for (class145 var7 = (class145)field1971.method327(); null != var7; var7 = (class145)field1971.method331()) {
			if (var0 == var7.field1006 && var7.field1007 == var1 && var7.field1004 == var2 && var3 == var7.field1003) {
				var6 = var7;
				break;
			}
		}

		if (var6 != null) {
			var6.field1012 = var4;
			return true;
		} else {
			return false;
		}
	}

	static final void method1419() {
		for (class145 var1 = (class145)field1971.method327(); var1 != null; var1 = (class145)field1971.method331()) {
			if (var1.field1015 == -1) {
				var1.field1014 = 0;
				method1320(var1);
			} else {
				var1.method1719();
			}
		}

	}

	static final void method1320(class145 var0) {
		long var2 = 0L;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (var0.field1003 == 0) {
			var2 = class141.field937.method758(var0.field1006, var0.field1007, var0.field1004);
		}

		if (var0.field1003 == 1) {
			var2 = class141.field937.method749(var0.field1006, var0.field1007, var0.field1004);
		}

		if (var0.field1003 == 2) {
			var2 = class141.field937.method750(var0.field1006, var0.field1007, var0.field1004);
		}

		if (var0.field1003 == 3) {
			var2 = class141.field937.method773(var0.field1006, var0.field1007, var0.field1004);
		}

		if (var2 != 0L) {
			int var7 = class141.field937.method762(var0.field1006, var0.field1007, var0.field1004, var2);
			var4 = class503.method2376(var2);
			var5 = var7 & 31;
			var6 = var7 >> 6 & 3;
		}

		var0.field1011 = var4;
		var0.field1008 = var5;
		var0.field1010 = var6;
	}

	static final void method1349() {
		for (class145 var1 = (class145)field1971.method327(); var1 != null; var1 = (class145)field1971.method331()) {
			if (var1.field1015 > 0) {
				--var1.field1015;
			}

			boolean var2;
			int var3;
			int var4;
			class397 var5;
			if (var1.field1015 == 0) {
				if (var1.field1011 >= 0) {
					var3 = var1.field1011;
					var4 = var1.field1008;
					var5 = class109.method504(var3);
					if (var4 == 11) {
						var4 = 10;
					}

					if (var4 >= 5 && var4 <= 8) {
						var4 = 4;
					}

					var2 = var5.method1839(var4);
					if (!var2) {
						continue;
					}
				}

				method1348(var1.field1006, var1.field1003, var1.field1007, var1.field1004, var1.field1011, var1.field1010, var1.field1008, var1.field1012);
				var1.method1719();
			} else {
				if (var1.field1014 > 0) {
					--var1.field1014;
				}

				if (var1.field1014 == 0 && var1.field1007 >= 1 && var1.field1004 >= 1 && var1.field1007 <= 102 && var1.field1004 <= 102) {
					if (var1.field1009 >= 0) {
						var3 = var1.field1009;
						var4 = var1.field1005;
						var5 = class109.method504(var3);
						if (var4 == 11) {
							var4 = 10;
						}

						if (var4 >= 5 && var4 <= 8) {
							var4 = 4;
						}

						var2 = var5.method1839(var4);
						if (!var2) {
							continue;
						}
					}

					method1348(var1.field1006, var1.field1003, var1.field1007, var1.field1004, var1.field1009, var1.field1002, var1.field1005, var1.field1012);
					var1.field1014 = -1;
					if (var1.field1011 == var1.field1009 && var1.field1011 == -1) {
						var1.method1719();
					} else if (var1.field1011 == var1.field1009 && var1.field1002 == var1.field1010 && var1.field1005 == var1.field1008) {
						var1.method1719();
					}
				}
			}
		}

	}

	static final void method1348(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (field2059 && class212.field1393 != var0) {
				return;
			}

			long var9 = 0L;
			boolean var11 = true;
			boolean var12 = false;
			boolean var13 = false;
			if (var1 == 0) {
				var9 = class141.field937.method758(var0, var2, var3);
			}

			if (var1 == 1) {
				var9 = class141.field937.method749(var0, var2, var3);
			}

			if (var1 == 2) {
				var9 = class141.field937.method750(var0, var2, var3);
			}

			if (var1 == 3) {
				var9 = class141.field937.method773(var0, var2, var3);
			}

			int var14;
			if (var9 != 0L) {
				var14 = class141.field937.method762(var0, var2, var3, var9);
				int var16 = class503.method2376(var9);
				int var17 = var14 & 31;
				int var18 = var14 >> 6 & 3;
				class397 var15;
				if (var1 == 0) {
					class141.field937.method743(var0, var2, var3);
					var15 = class109.method504(var16);
					if (var15.field2703 != 0) {
						field1906[var0].method811(var2, var3, var17, var18, var15.field2729);
					}
				}

				if (var1 == 1) {
					class141.field937.method744(var0, var2, var3);
				}

				if (var1 == 2) {
					class141.field937.method745(var0, var2, var3);
					var15 = class109.method504(var16);
					if (var15.field2701 + var2 > 103 || var3 + var15.field2701 > 103 || var15.field2702 + var2 > 103 || var3 + var15.field2702 > 103) {
						return;
					}

					if (var15.field2703 != 0) {
						field1906[var0].method806(var2, var3, var15.field2701, var15.field2702, var18, var15.field2729);
					}
				}

				if (var1 == 3) {
					class141.field937.method746(var0, var2, var3);
					var15 = class109.method504(var16);
					if (var15.field2703 == 1) {
						field1906[var0].method808(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var14 = var0;
				if (var0 < 3 && (class129.field835[1][var2][var3] & 2) == 2) {
					var14 = var0 + 1;
				}

				class332.method1598(var0, var14, var2, var3, var4, var5, var6, var7, class141.field937, field1906[var0]);
			}
		}

	}

	static final void method1314(int var0, int var1) {
		class69 var3 = field2000[class212.field1393][var0][var1];
		if (null == var3) {
			class141.field937.method778(class212.field1393, var0, var1);
		} else {
			long var4 = -99999999L;
			class441 var6 = null;

			class441 var7;
			for (var7 = (class441)var3.method327(); var7 != null; var7 = (class441)var3.method331()) {
				class158 var8 = class158.method857(var7.field2967);
				long var9 = (long)var8.field1101;
				if (var8.field1105 == 1) {
					var9 *= var7.field2969 < Integer.MAX_VALUE ? (long)(var7.field2969 + 1) : (long)var7.field2969;
				}

				if (var9 > var4) {
					var4 = var9;
					var6 = var7;
				}
			}

			if (null == var6) {
				class141.field937.method778(class212.field1393, var0, var1);
			} else {
				var3.method330(var6);
				class441 var12 = null;
				class441 var13 = null;

				for (var7 = (class441)var3.method327(); null != var7; var7 = (class441)var3.method331()) {
					if (var6.field2967 != var7.field2967) {
						if (var12 == null) {
							var12 = var7;
						}

						if (var7.field2967 != var12.field2967 && null == var13) {
							var13 = var7;
						}
					}
				}

				long var10 = class503.method2386(var0, var1, 3, false, 0);
				class141.field937.method736(class212.field1393, var0, var1, method1347(64 + var0 * 128, var1 * 128 + 64, class212.field1393), var6, var10, var12, var13);
			}
		}
	}

	static final void method1432(boolean var0, PacketBuffer var1) {
		field1963 = 0;
		field1894 = 0;
		var1.method1497();
		int var3 = var1.method1501(8);
		int var4;
		if (var3 < field1980) {
			for (var4 = var3; var4 < field1980; ++var4) {
				field1964[++field1963 - 1] = field1893[var4];
			}
		}

		if (var3 > field1980) {
			throw new RuntimeException("");
		} else {
			field1980 = 0;

			int var7;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = field1893[var4];
				class378 var6 = field2017[var5];
				var7 = var1.method1501(1);
				if (var7 == 0) {
					field1893[++field1980 - 1] = var5;
					var6.field387 = field1846;
				} else {
					var8 = var1.method1501(2);
					if (var8 == 0) {
						field1893[++field1980 - 1] = var5;
						var6.field387 = field1846;
						field1847[++field1894 - 1] = var5;
					} else if (var8 == 1) {
						field1893[++field1980 - 1] = var5;
						var6.field387 = field1846;
						var9 = var1.method1501(3);
						var6.method1765(var9, MovementType.WALK, (byte)-1);
						var10 = var1.method1501(1);
						if (var10 == 1) {
							field1847[++field1894 - 1] = var5;
						}
					} else if (var8 == 2) {
						field1893[++field1980 - 1] = var5;
						var6.field387 = field1846;
						if (var1.method1501(1) == 1) {
							var9 = var1.method1501(3);
							var6.method1765(var9, MovementType.run, (byte)-1);
							var10 = var1.method1501(3);
							var6.method1765(var10, MovementType.run, (byte)-1);
						} else {
							var9 = var1.method1501(3);
							var6.method1765(var9, MovementType.CRAWL, (byte)-1);
						}

						var9 = var1.method1501(1);
						if (var9 == 1) {
							field1847[++field1894 - 1] = var5;
						}
					} else if (var8 == 3) {
						field1964[++field1963 - 1] = var5;
					}
				}
			}

			method1311(var0, var1);

			for (var3 = 0; var3 < field1894; ++var3) {
				var4 = field1847[var3];
				class378 var15 = field2017[var4];
				int var16 = var1.readUnsignedByte();
				if ((var16 & 64) != 0) {
					var7 = var1.readUnsignedByte();
					var16 += var7 << 8;
				}

				if ((var16 & 2048) != 0) {
					var7 = var1.readUnsignedByte();
					var16 += var7 << 16;
				}

				if ((var16 & 128) != 0) {
					var7 = var1.readUnsignedShortADD();
					if (var7 == 65535) {
						var7 = -1;
					}

					var8 = var1.readUnsignedByte();
					if (var7 == var15.field373 && var7 != -1) {
						var9 = class116.method539(var7).field747;
						if (var9 == 1) {
							var15.field334 = 0;
							var15.field395 = 0;
							var15.field376 = var8;
							var15.field377 = 0;
						}

						if (var9 == 2) {
							var15.field377 = 0;
						}
					} else if (var7 == -1 || var15.field373 == -1 || class116.method539(var7).field741 >= class116.method539(var15.field373).field741) {
						var15.field373 = var7;
						var15.field334 = 0;
						var15.field395 = 0;
						var15.field376 = var8;
						var15.field377 = 0;
						var15.field403 = var15.field360;
					}
				}

				if ((var16 & 2) != 0) {
					var15.field2605 = class73.method366(var1.readUnsignedShortLE());
					method1414(var15);
					var15.method1768();
				}

				if ((var16 & 32768) != 0) {
					var15.field380 = var1.readByteADD();
					var15.field328 = var1.readByte();
					var15.field381 = var1.readByte();
					var15.field347 = var1.readByteSUB();
					var15.field384 = var1.readUnsignedShortLE() + field1846;
					var15.field385 = var1.readUnsignedShort() + field1846;
					var15.field396 = var1.readUnsignedShortADD();
					var15.field360 = 1;
					var15.field403 = 0;
					var15.field380 += var15.field399[0];
					var15.field328 += var15.field400[0];
					var15.field381 += var15.field399[0];
					var15.field347 += var15.field400[0];
				}

				if ((var16 & 8) != 0) {
					var1.readUnsignedShort();
					var1.readInt();
				}

				int var11;
				int var12;
				int[] var17;
				short[] var18;
				short[] var19;
				long var20;
				boolean var21;
				if ((var16 & 16384) != 0) {
					var7 = var1.readUnsignedByte();
					if ((var7 & 1) == 1) {
						var15.method1772();
					} else {
						var17 = null;
						if ((var7 & 2) == 2) {
							var9 = var1.readUnsignedByteADD();
							var17 = new int[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var11 = var1.readUnsignedShortADD();
								var11 = var11 == 65535 ? -1 : var11;
								var17[var10] = var11;
							}
						}

						var18 = null;
						if ((var7 & 4) == 4) {
							var10 = 0;
							if (null != var15.field2605.field502) {
								var10 = var15.field2605.field502.length;
							}

							var18 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var18[var11] = (short)var1.readUnsignedShortADD();
							}
						}

						var19 = null;
						if ((var7 & 8) == 8) {
							var11 = 0;
							if (var15.field2605.field511 != null) {
								var11 = var15.field2605.field511.length;
							}

							var19 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var19[var12] = (short)var1.readUnsignedShort();
							}
						}

						var21 = false;
						if ((var7 & 16) != 0) {
							var21 = var1.readUnsignedByteNEG() == 1;
						}

						var20 = (long)(++class378.field2604 - 1);
						var15.method1769(new class120(var20, var17, var18, var19, var21));
					}
				}

				if ((var16 & 512) != 0) {
					var15.method1762(var1.readStringOrNull());
				}

				if ((var16 & 4096) != 0) {
					var7 = var1.readUnsignedByteADD();
					if ((var7 & 1) == 1) {
						var15.method1773();
					} else {
						var17 = null;
						if ((var7 & 2) == 2) {
							var9 = var1.readUnsignedByte();
							var17 = new int[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var11 = var1.readUnsignedShortLE();
								var11 = var11 == 65535 ? -1 : var11;
								var17[var10] = var11;
							}
						}

						var18 = null;
						if ((var7 & 4) == 4) {
							var10 = 0;
							if (var15.field2605.field502 != null) {
								var10 = var15.field2605.field502.length;
							}

							var18 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var18[var11] = (short)var1.readUnsignedShortLE();
							}
						}

						var19 = null;
						if ((var7 & 8) == 8) {
							var11 = 0;
							if (var15.field2605.field511 != null) {
								var11 = var15.field2605.field511.length;
							}

							var19 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var19[var12] = (short)var1.readUnsignedShortADD();
							}
						}

						var21 = false;
						if ((var7 & 16) != 0) {
							var21 = var1.readUnsignedByte() == 1;
						}

						var20 = (long)(++class378.field2602 - 1);
						var15.method1771(new class120(var20, var17, var18, var19, var21));
					}
				}

				if ((var16 & 262144) != 0) {
					var7 = var1.readInt();
					var15.field335 = (var7 & 1) != 0 ? var1.readUnsignedShortLEADD() : var15.field2605.field482;
					var15.field336 = (var7 & 2) != 0 ? var1.readUnsignedShortLEADD() : 53136165 * var15.field2605.field488 * -650094419;
					var15.field331 = (var7 & 4) != 0 ? var1.readUnsignedShortADD() : 1652208225 * var15.field2605.field478 * 12153249;
					var15.field338 = (var7 & 8) != 0 ? var1.readUnsignedShortLEADD() : var15.field2605.field490;
					var15.field341 = (var7 & 16) != 0 ? var1.readUnsignedShort() : 407029447 * var15.field2605.field491 * 193862391;
					var15.field340 = (var7 & 32) != 0 ? var1.readUnsignedShortLE() : -1457167705 * var15.field2605.field504 * 1557013783;
					var15.field401 = (var7 & 64) != 0 ? var1.readUnsignedShortLEADD() : -1220844931 * var15.field2605.field493 * -1279088939;
					var15.field359 = (var7 & 128) != 0 ? var1.readUnsignedShortADD() : var15.field2605.field494;
					var15.field345 = (var7 & 256) != 0 ? var1.readUnsignedShortLE() : -1555933215 * var15.field2605.field495 * 1482173473;
					var15.field344 = (var7 & 512) != 0 ? var1.readUnsignedShort() : var15.field2605.field522;
					var15.field339 = (var7 & 1024) != 0 ? var1.readUnsignedShort() : 578435175 * var15.field2605.field497 * 700539735;
					var15.field346 = (var7 & 2048) != 0 ? var1.readUnsignedShort() : 279963805 * var15.field2605.field498 * -2084184651;
					var15.field361 = (var7 & 4096) != 0 ? var1.readUnsignedShortLE() : var15.field2605.field499;
					var15.field348 = (var7 & 8192) != 0 ? var1.readUnsignedShortADD() : var15.field2605.field508;
					var15.field383 = (var7 & 16384) != 0 ? var1.readUnsignedShortLEADD() : var15.field2605.field486;
				}

				if ((var16 & 131072) != 0) {
					var7 = var1.readUnsignedByteADD();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var1.readUnsignedByteSUB();
						var10 = var1.readUnsignedShortLEADD();
						var11 = var1.readUnsignedIntIME();
						var15.method292(var9, var10, var11 >> 16, var11 & 65535);
					}
				}

				if ((var16 & 8192) != 0) {
					var15.method1763(var1.readUnsignedByteSUB());
				}

				if ((var16 & 32) != 0) {
					var15.field356 = var1.readStringOrNull();
					var15.field352 = 100;
				}

				if ((var16 & 16) != 0) {
					var7 = var1.readUnsignedShort();
					var8 = var1.readUnsignedShortLE();
					var15.field382 = var1.readUnsignedByteADD() == 1;
					if (field1841 >= 212) {
						var15.field366 = var7;
						var15.field367 = var8;
					} else {
						var9 = var15.field368 - 64 * (var7 - class80.selectedTileX - class80.selectedTileX);
						var10 = var15.field329 - (var8 - class425.selectedTileXYIdk - class425.selectedTileXYIdk) * 64;
						if (var9 != 0 || var10 != 0) {
							var12 = (int)(Math.atan2((double)var9, (double)var10) * 325.94932345220167D) & 2047;
							var15.field365 = var12;
						}
					}
				}

				if ((var16 & 256) != 0) {
					var15.field404 = var1.readUnsignedIntLE();
				}

				if ((var16 & 4) != 0) {
					var15.field363 = var1.readUnsignedShortLE();
					var15.field363 += var1.readUnsignedByte() << 16;
					var7 = 16777215;
					if (16777215 == var15.field363) {
						var15.field363 = -1;
					}
				}

				if ((var16 & 1) != 0) {
					var7 = var1.readUnsignedByte();
					int var13;
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; ++var8) {
							var10 = -1;
							var11 = -1;
							var12 = -1;
							var9 = var1.method2522();
							if (var9 == 32767) {
								var9 = var1.method2522();
								var11 = var1.method2522();
								var10 = var1.method2522();
								var12 = var1.method2522();
							} else if (var9 != 32766) {
								var11 = var1.method2522();
							} else {
								var9 = -1;
							}

							var13 = var1.method2522();
							var15.method297(var9, var11, var10, var12, field1846, var13);
						}
					}

					var8 = var1.readUnsignedByteADD();
					if (var8 > 0) {
						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var1.method2522();
							var11 = var1.method2522();
							if (var11 != 32767) {
								var12 = var1.method2522();
								var13 = var1.readUnsignedByte();
								int var14 = var11 > 0 ? var1.readUnsignedByteNEG() : var13;
								var15.method290(var10, field1846, var11, var12, var13, var14);
							} else {
								var15.method293(var10);
							}
						}
					}
				}

				if ((var16 & 1024) != 0) {
					var15.field389 = field1846 + var1.readUnsignedShort();
					var15.field390 = field1846 + var1.readUnsignedShortLEADD();
					var15.field391 = var1.readByteSUB();
					var15.field392 = var1.readByte();
					var15.field393 = var1.readByteNEG();
					var15.field394 = (byte)var1.readUnsignedByte();
				}

				if ((var16 & 65536) != 0) {
					var7 = var1.readUnsignedByteNEG();
					var17 = new int[8];
					var18 = new short[8];

					for (var10 = 0; var10 < 8; ++var10) {
						if ((var7 & 1 << var10) != 0) {
							var17[var10] = var1.method2482();
							var18[var10] = (short)var1.method2480();
						} else {
							var17[var10] = -1;
							var18[var10] = -1;
						}
					}

					var15.method1775(var17, var18);
				}
			}

			for (var3 = 0; var3 < field1963; ++var3) {
				var4 = field1964[var3];
				if (field1846 != field2017[var4].field387) {
					field2017[var4].field2605 = null;
					field2017[var4] = null;
				}
			}

			if (var1.offset != field1891.field4222) {
				throw new RuntimeException(var1.offset + class274.field1825 + field1891.field4222);
			} else {
				for (var3 = 0; var3 < field1980; ++var3) {
					if (null == field2017[field1893[var3]]) {
						throw new RuntimeException(var3 + class274.field1825 + field1980);
					}
				}

			}
		}
	}

	static final void method1311(boolean var0, PacketBuffer var1) {
		while (true) {
			boolean var3 = true;
			int var4 = 65536;
			if (var1.method1499(field1891.field4222) >= 28) {
				int var5 = var1.method1501(16);
				if (65535 != var5) {
					boolean var6 = false;
					if (field2017[var5] == null) {
						field2017[var5] = new class378();
						var6 = true;
					}

					class378 var7 = field2017[var5];
					field1893[++field1980 - 1] = var5;
					var7.field387 = field1846;
					int var11 = var1.method1501(1);
					if (var11 == 1) {
						field1847[++field1894 - 1] = var5;
					}

					int var8 = var1.method1501(1);
					var7.field2605 = class73.method366(var1.method1501(14));
					int var12 = field1968[var1.method1501(3)];
					if (var6) {
						var7.field351 = var7.field330 = var12;
					}

					int var9;
					if (var0) {
						var9 = var1.method1501(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.method1501(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					int var10;
					if (var0) {
						var10 = var1.method1501(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var1.method1501(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					boolean var13 = var1.method1501(1) == 1;
					if (var13) {
						var1.method1501(32);
					}

					method1414(var7);
					if (var7.field358 == 0) {
						var7.field330 = 0;
					}

					var7.method1778(class114.field720.field399[0] + var9, var10 + class114.field720.field400[0], var8 == 1);
					continue;
				}
			}

			var1.method1504();
			return;
		}
	}

	static void method1414(class378 var0) {
		var0.field332 = var0.field2605.field484;
		var0.field358 = var0.field2605.field513;
		var0.field331 = var0.field2605.field478;
		var0.field338 = var0.field2605.field490;
		var0.field341 = var0.field2605.field491;
		var0.field340 = var0.field2605.field504;
		var0.field383 = var0.field2605.field486;
		var0.field335 = var0.field2605.field482;
		var0.field336 = var0.field2605.field488;
		var0.field401 = var0.field2605.field493;
		var0.field359 = var0.field2605.field494;
		var0.field345 = var0.field2605.field495;
		var0.field344 = var0.field2605.field522;
		var0.field339 = var0.field2605.field497;
		var0.field346 = var0.field2605.field498;
		var0.field361 = var0.field2605.field499;
		var0.field348 = var0.field2605.field508;
	}

	static final void method1375(Player var0, int var1, int var2, MovementType var3) {
		int var5 = var0.field399[0];
		int var6 = var0.field400[0];
		int var7 = var0.method2120();
		if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7) {
			if (var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
				class447 var8 = field2128;
				int var11 = var0.method2120();
				field1956.field2225 = var1;
				field1956.field2224 = var2;
				field1956.field2222 = 1;
				field1956.field2223 = 1;
				class266 var12 = field1956;
				int var13 = var8.method2101(var5, var6, var11, var12, field1906[var0.field3009], true, field2133, field1950);
				if (var13 >= 1) {
					for (int var14 = 0; var14 < var13 - 1; ++var14) {
						var0.method2123(field2133[var14], field1950[var14], var3);
					}

				}
			}
		}
	}

	static void method1333() {
		field1979 = 0;
		field1978 = false;
	}

	static void method1435() {
		method1333();
		field1985[0] = class513.field3992;
		field1986[0] = "";
		field1982[0] = 1006;
		field1987[0] = false;
		field1979 = 1;
	}

	static final boolean method1384() {
		return field1978;
	}

	static final void method1305(int var0, int var1, int var2, int var3) {
		for (int var5 = 0; var5 < field1874; ++var5) {
			if (field2054[var5] + field1834[var5] > var0 && field2054[var5] < var2 + var0 && field2055[var5] + field2085[var5] > var1 && field2055[var5] < var3 + var1) {
				field2051[var5] = true;
			}
		}

	}

	static void method1459(int var0, int var1) {
		int var3 = class209.field1388.method1033(class513.field3916);

		int var4;
		int var5;
		for (var4 = 0; var4 < field1979; ++var4) {
			var5 = class209.field1388.method1033(method1381(var4));
			if (var5 > var3) {
				var3 = var5;
			}
		}

		var3 += 8;
		var4 = 22 + field1979 * 15;
		var5 = var0 - var3 / 2;
		if (var3 + var5 > class164.field1170) {
			var5 = class164.field1170 - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var6 = var1;
		if (var4 + var1 > class92.field595) {
			var6 = class92.field595 - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		class263.field1759 = var5;
		class24.field125 = var6;
		class382.field2640 = var3;
		class66.field407 = 22 + field1979 * 15;
	}

	static final boolean method1418(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var2 = field1982[var0];
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			return var2 == 1007;
		}
	}

	static final void method1447(int var0) {
		if (var0 >= 0) {
			int var2 = field2070[var0];
			int var3 = field1981[var0];
			int var4 = field1982[var0];
			int var5 = field1983[var0];
			int var6 = field1984[var0];
			String var7 = field1985[var0];
			String var8 = field1986[var0];
			class208.method978(var2, var3, var4, var5, var6, var7, var8, class316.field2318, class316.field2320);
		}
	}

	static final void method1306(class32 var0, int var1, int var2) {
		if (var0 != null) {
			class208.method978(var0.field161, var0.field162, var0.field159, var0.field160, var0.field163, var0.field157, var0.field158, var1, var2);
		}

	}

	static void method1439(int var0, String var1) {
		int var3 = class264.field1764;
		int[] var4 = class264.field1765;
		boolean var5 = false;
		class509 var6 = new class509(var1, class474.field3325);

		for (int var7 = 0; var7 < var3; ++var7) {
			Player var8 = field2037[var4[var7]];
			if (null != var8 && class114.field720 != var8 && null != var8.field3005 && var8.field3005.equals(var6)) {
				class341 var9;
				if (var0 == 1) {
					var9 = class341.createClientPacket(ClientPacket.field3055, field1891.field4219);
					var9.buffer.writeByteADD(0);
					var9.buffer.writeShortADD(var4[var7]);
					field1891.method2612(var9);
				} else if (var0 == 4) {
					var9 = class341.createClientPacket(ClientPacket.field3111, field1891.field4219);
					var9.buffer.writeShortADD(var4[var7]);
					var9.buffer.writeByteNEG(0);
					field1891.method2612(var9);
				} else if (var0 == 6) {
					var9 = class341.createClientPacket(ClientPacket.field3094, field1891.field4219);
					var9.buffer.writeByteNEG(0);
					var9.buffer.writeShortLE(var4[var7]);
					field1891.method2612(var9);
				} else if (var0 == 7) {
					var9 = class341.createClientPacket(ClientPacket.field3122, field1891.field4219);
					var9.buffer.writeByte(0);
					var9.buffer.writeShort(var4[var7]);
					field1891.method2612(var9);
				}

				var5 = true;
				break;
			}
		}

		if (!var5) {
			class346.method1672(4, "", class513.field3921 + var1);
		}

	}

	static void method1461(int var0, int var1, int var2, int var3) {
		class496 var5 = class208.interfaceConfigs.method346(var0, var1);
		if (null != var5 && var5.field3589 != null) {
			class376 var6 = new class376();
			var6.field2595 = var5;
			var6.field2594 = var5.field3589;
			class440.method2027(var6);
		}

		field1999 = var3;
		field1997 = true;
		class258.field1755 = var0;
		field1898 = var1;
		class467.field3301 = var2;
		method1363(var5);
	}

	static void method1423() {
		if (field1997) {
			class496 var1 = class208.interfaceConfigs.method346(class258.field1755, field1898);
			if (var1 != null && null != var1.field3623) {
				class376 var2 = new class376();
				var2.field2595 = var1;
				var2.field2594 = var1.field3623;
				class440.method2027(var2);
			}

			field1999 = -1;
			field1997 = false;
			method1363(var1);
		}
	}

	static void method1372(int var0, int var1) {
		class341 var3 = class341.createClientPacket(ClientPacket.field3119, field1891.field4219);
		var3.buffer.writeShort(var1);
		var3.buffer.writeIntME(var0);
		field1891.method2612(var3);
	}

	static void method1411(int var0, int var1, int var2, int var3, String var4) {
		class496 var6 = class208.interfaceConfigs.method346(var1, var2);
		if (null != var6) {
			if (null != var6.field3631) {
				class376 var7 = new class376();
				var7.field2595 = var6;
				var7.field2589 = var0;
				var7.field2584 = var4;
				var7.field2594 = var6.field3631;
				class440.method2027(var7);
			}

			boolean var12 = true;
			if (var6.field3529 > 0) {
				var12 = method1388(var6);
			}

			if (var12) {
				int var9 = method1335(var6);
				int var10 = var0 - 1;
				boolean var8 = (var9 >> var10 + 1 & 1) != 0;
				if (var8) {
					class341 var11;
					if (var0 == 1) {
						var11 = class341.createClientPacket(ClientPacket.field3095, field1891.field4219);
						var11.buffer.writeInt(var1);
						var11.buffer.writeShort(var2);
						var11.buffer.writeShort(var3);
						field1891.method2612(var11);
					}

					if (var0 == 2) {
						var11 = class341.createClientPacket(ClientPacket.field3129, field1891.field4219);
						var11.buffer.writeInt(var1);
						var11.buffer.writeShort(var2);
						var11.buffer.writeShort(var3);
						field1891.method2612(var11);
					}

					if (var0 == 3) {
						var11 = class341.createClientPacket(ClientPacket.field3074, field1891.field4219);
						var11.buffer.writeInt(var1);
						var11.buffer.writeShort(var2);
						var11.buffer.writeShort(var3);
						field1891.method2612(var11);
					}

					if (var0 == 4) {
						var11 = class341.createClientPacket(ClientPacket.field3120, field1891.field4219);
						var11.buffer.writeInt(var1);
						var11.buffer.writeShort(var2);
						var11.buffer.writeShort(var3);
						field1891.method2612(var11);
					}

					if (var0 == 5) {
						var11 = class341.createClientPacket(ClientPacket.field3078, field1891.field4219);
						var11.buffer.writeInt(var1);
						var11.buffer.writeShort(var2);
						var11.buffer.writeShort(var3);
						field1891.method2612(var11);
					}

					if (var0 == 6) {
						var11 = class341.createClientPacket(ClientPacket.field3071, field1891.field4219);
						var11.buffer.writeInt(var1);
						var11.buffer.writeShort(var2);
						var11.buffer.writeShort(var3);
						field1891.method2612(var11);
					}

					if (var0 == 7) {
						var11 = class341.createClientPacket(ClientPacket.field3105, field1891.field4219);
						var11.buffer.writeInt(var1);
						var11.buffer.writeShort(var2);
						var11.buffer.writeShort(var3);
						field1891.method2612(var11);
					}

					if (var0 == 8) {
						var11 = class341.createClientPacket(ClientPacket.field3131, field1891.field4219);
						var11.buffer.writeInt(var1);
						var11.buffer.writeShort(var2);
						var11.buffer.writeShort(var3);
						field1891.method2612(var11);
					}

					if (var0 == 9) {
						var11 = class341.createClientPacket(ClientPacket.field3085, field1891.field4219);
						var11.buffer.writeInt(var1);
						var11.buffer.writeShort(var2);
						var11.buffer.writeShort(var3);
						field1891.method2612(var11);
					}

					if (var0 == 10) {
						var11 = class341.createClientPacket(ClientPacket.field3110, field1891.field4219);
						var11.buffer.writeInt(var1);
						var11.buffer.writeShort(var2);
						var11.buffer.writeShort(var3);
						field1891.method2612(var11);
					}

				}
			}
		}
	}

	public static final void method1359(String var0, String var1, int var2, int var3, int var4, int var5) {
		method1407(var0, var1, var2, var3, var4, var5, -1, false);
	}

	static final void method1407(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!field1978) {
			if (field1979 < 500) {
				field1985[field1979] = var0;
				field1986[field1979] = var1;
				field1982[field1979] = var2;
				field1983[field1979] = var3;
				field2070[field1979] = var4;
				field1981[field1979] = var5;
				field1984[field1979] = var6;
				field1987[field1979] = var7;
				++field1979;
			}

		}
	}

	static final int method1345() {
		return field1979 - 1;
	}

	static String method1381(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return field1986[var0].length() > 0 ? field1985[var0] + class513.field3914 + field1986[var0] : field1985[var0];
		}
	}

	static final void method1342(int var0, int var1, int var2, int var3) {
		if (field1892 == 0 && !field1997) {
			method1359(class513.field3918, "", 23, 0, var0 - var2, var1 - var3);
		}

		long var5 = -1L;
		long var7 = -1L;
		int var9 = 0;

		while (true) {
			int var11 = class503.field3699;
			if (var9 >= var11) {
				if (var5 != -1L) {
					var9 = (int)(var5 >>> 0 & 127L);
					var11 = (int)(var5 >>> 7 & 127L);
					Player var13 = field2037[field1969];
					method1433(var13, field1969, var9, var11);
				}

				return;
			}

			long var12 = class503.field3700[var9];
			if (var7 != var12) {
				label308: {
					var7 = var12;
					int var16 = class503.method2375(var9);
					int var17 = class503.method2379(var9);
					long var20 = class503.field3700[var9];
					int var19 = (int)(var20 >>> 14 & 3L);
					int var27 = class503.method2374(var9);
					int var24;
					if (var19 == 2 && class141.field937.method762(class212.field1393, var16, var17, var12) >= 0) {
						class397 var21 = class109.method504(var27);
						if (null != var21.field2727) {
							var21 = var21.method1845();
						}

						if (null == var21) {
							break label308;
						}

						class145 var22 = null;

						for (class145 var23 = (class145)field1971.method327(); var23 != null; var23 = (class145)field1971.method331()) {
							if (var23.field1006 == class212.field1393 && var23.field1007 == var16 && var23.field1004 == var17 && var27 == var23.field1009) {
								var22 = var23;
								break;
							}
						}

						if (field1892 == 1) {
							method1359(class513.field3913, field2084 + " " + class274.field1823 + " " + class274.method1266(65535) + var21.field2696, 1, var27, var16, var17);
						} else if (field1997) {
							if ((class467.field3301 & 4) == 4) {
								method1359(field2063, field2001 + " " + class274.field1823 + " " + class274.method1266(65535) + var21.field2696, 2, var27, var16, var17);
							}
						} else {
							String[] var32 = var21.field2713;
							if (null != var32) {
								for (var24 = 4; var24 >= 0; --var24) {
									if ((var22 == null || var22.method789(var24)) && null != var32[var24]) {
										short var25 = 0;
										if (var24 == 0) {
											var25 = 3;
										}

										if (var24 == 1) {
											var25 = 4;
										}

										if (var24 == 2) {
											var25 = 5;
										}

										if (var24 == 3) {
											var25 = 6;
										}

										if (var24 == 4) {
											var25 = 1001;
										}

										method1359(var32[var24], class274.method1266(65535) + var21.field2696, var25, var27, var16, var17);
									}
								}
							}

							method1359(class513.field3997, class274.method1266(65535) + var21.field2696, 1002, var21.field2693, var16, var17);
						}
					}

					int var31;
					class378 var33;
					int[] var34;
					Player var38;
					if (var19 == 1) {
						class378 var28 = field2017[var27];
						if (null == var28) {
							break label308;
						}

						if (var28.field2605.field484 == 1 && (var28.field368 & 127) == 64 && (var28.field329 & 127) == 64) {
							for (var31 = 0; var31 < field1980; ++var31) {
								var33 = field2017[field1893[var31]];
								if (var33 != null && var28 != var33 && var33.field2605.field484 == 1 && var33.field368 == var28.field368 && var33.field329 == var28.field329) {
									class93.method422(var33, field1893[var31], var16, var17);
								}
							}

							var31 = class264.field1764;
							var34 = class264.field1765;

							for (var24 = 0; var24 < var31; ++var24) {
								var38 = field2037[var34[var24]];
								if (null != var38 && var38.field368 == var28.field368 && var28.field329 == var38.field329) {
									method1433(var38, var34[var24], var16, var17);
								}
							}
						}

						class93.method422(var28, var27, var16, var17);
					}

					if (var19 == 0) {
						Player var29 = field2037[var27];
						if (null == var29) {
							break label308;
						}

						if ((var29.field368 & 127) == 64 && (var29.field329 & 127) == 64) {
							for (var31 = 0; var31 < field1980; ++var31) {
								var33 = field2017[field1893[var31]];
								if (null != var33 && var33.field2605.field484 == 1 && var33.field368 == var29.field368 && var29.field329 == var33.field329) {
									class93.method422(var33, field1893[var31], var16, var17);
								}
							}

							var31 = class264.field1764;
							var34 = class264.field1765;

							for (var24 = 0; var24 < var31; ++var24) {
								var38 = field2037[var34[var24]];
								if (var38 != null && var38 != var29 && var38.field368 == var29.field368 && var29.field329 == var38.field329) {
									method1433(var38, var34[var24], var16, var17);
								}
							}
						}

						if (field1969 != var27) {
							method1433(var29, var27, var16, var17);
						} else {
							var5 = var12;
						}
					}

					if (var19 == 3) {
						class69 var30 = field2000[class212.field1393][var16][var17];
						if (null != var30) {
							for (class441 var35 = (class441)var30.method324(); var35 != null; var35 = (class441)var30.method325()) {
								class158 var36 = class158.method857(var35.field2967);
								if (field1892 == 1) {
									method1359(class513.field3913, field2084 + " " + class274.field1823 + " " + class274.method1266(16748608) + var36.field1095, 16, var35.field2967, var16, var17);
								} else if (field1997) {
									if ((class467.field3301 & 1) == 1) {
										method1359(field2063, field2001 + " " + class274.field1823 + " " + class274.method1266(16748608) + var36.field1095, 17, var35.field2967, var16, var17);
									}
								} else {
									String[] var37 = var36.field1111;

									for (int var39 = 4; var39 >= 0; --var39) {
										if (var35.method2083(var39)) {
											if (null != var37 && var37[var39] != null) {
												byte var26 = 0;
												if (var39 == 0) {
													var26 = 18;
												}

												if (var39 == 1) {
													var26 = 19;
												}

												if (var39 == 2) {
													var26 = 20;
												}

												if (var39 == 3) {
													var26 = 21;
												}

												if (var39 == 4) {
													var26 = 22;
												}

												method1359(var37[var39], class274.method1266(16748608) + var36.field1095, var26, var35.field2967, var16, var17);
											} else if (var39 == 2) {
												method1359(class513.field3750, class274.method1266(16748608) + var36.field1095, 20, var35.field2967, var16, var17);
											}
										}
									}

									method1359(class513.field3997, class274.method1266(16748608) + var36.field1095, 1004, var35.field2967, var16, var17);
								}
							}
						}
					}
				}
			}

			++var9;
		}
	}

	static final void method1433(Player var0, int var1, int var2, int var3) {
		if (var0 != class114.field720) {
			if (field1979 < 400) {
				String var5;
				if (var0.field2999 == 0) {
					var5 = var0.field2992[0] + var0.field3005 + var0.field2992[1] + method1437(var0.field2993, class114.field720.field2993) + " " + class274.field1821 + class513.field3919 + var0.field2993 + class274.field1822 + var0.field2992[2];
				} else {
					var5 = var0.field2992[0] + var0.field3005 + var0.field2992[1] + " " + class274.field1821 + class513.field4049 + var0.field2999 + class274.field1822 + var0.field2992[2];
				}

				int var6;
				if (field1892 == 1) {
					method1359(class513.field3913, field2084 + " " + class274.field1823 + " " + class274.method1266(16777215) + var5, 14, var1, var2, var3);
				} else if (field1997) {
					if ((class467.field3301 & 8) == 8) {
						method1359(field2063, field2001 + " " + class274.field1823 + " " + class274.method1266(16777215) + var5, 15, var1, var2, var3);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (null != field2090[var6]) {
							short var7 = 0;
							if (field2090[var6].equalsIgnoreCase(class513.field3930)) {
								if (field2007 == class491.field3495) {
									continue;
								}

								if (class491.field3496 == field2007 || class491.field3499 == field2007 && var0.field2993 > class114.field720.field2993) {
									var7 = 2000;
								}

								if (class114.field720.field3007 != 0 && var0.field3007 != 0) {
									if (class114.field720.field3007 == var0.field3007) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (field2007 == class491.field3498 && var0.method2126()) {
									var7 = 2000;
								}
							} else if (field1967[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = field2058[var6] + var7;
							method1359(field2090[var6], class274.method1266(16777215) + var5, var9, var1, var2, var3);
						}
					}
				}

				for (var6 = 0; var6 < field1979; ++var6) {
					if (field1982[var6] == 23) {
						field1986[var6] = class274.method1266(16777215) + var5;
						break;
					}
				}

			}
		}
	}

	static final String method1437(int var0, int var1) {
		int var3 = var1 - var0;
		if (var3 < -9) {
			return class274.method1266(16711680);
		} else if (var3 < -6) {
			return class274.method1266(16723968);
		} else if (var3 < -3) {
			return class274.method1266(16740352);
		} else if (var3 < 0) {
			return class274.method1266(16756736);
		} else if (var3 > 9) {
			return class274.method1266(65280);
		} else if (var3 > 6) {
			return class274.method1266(4259584);
		} else if (var3 > 3) {
			return class274.method1266(8453888);
		} else {
			return var3 > 0 ? class274.method1266(12648192) : class274.method1266(16776960);
		}
	}

	static final void method1445(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class208.interfaceConfigs.method347(var0)) {
			class548.field4262 = null;
			method1409(class208.interfaceConfigs.components[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (null != class548.field4262) {
				method1409(class548.field4262, -1412584499, var1, var2, var3, var4, class70.field441, class141.field933, var7);
				class548.field4262 = null;
			}

		} else {
			if (var7 != -1) {
				field2051[var7] = true;
			} else {
				for (int var9 = 0; var9 < 100; ++var9) {
					field2051[var9] = true;
				}
			}

		}
	}

	static final void method1409(class496[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		class433.method1958(var2, var3, var4, var5);
		class105.method488();

		for (int var10 = 0; var10 < var0.length; ++var10) {
			class496 var11 = var0[var10];
			if (var11 != null && (var1 == var11.field3544 || var1 == -1412584499 && field2014 == var11)) {
				int var12;
				if (var8 == -1) {
					field2054[field1874] = var6 + var11.field3520;
					field2055[field1874] = var11.field3539 + var7;
					field1834[field1874] = var11.field3540;
					field2085[field1874] = var11.field3541;
					var12 = ++field1874 - 1;
				} else {
					var12 = var8;
				}

				var11.field3666 = var12;
				var11.field3667 = field1846;
				if (!var11.field3523 || !method1396(var11)) {
					if (var11.field3529 > 0) {
						method1309(var11);
					}

					int var13 = var6 + var11.field3520;
					int var14 = var7 + var11.field3539;
					int var15 = var11.field3556;
					int var16;
					int var17;
					if (var11 == field2014) {
						if (var1 != -1412584499 && !var11.field3609) {
							class548.field4262 = var0;
							class70.field441 = var6;
							class141.field933 = var7;
							continue;
						}

						if (field2025 && field1960) {
							var16 = class316.field2309;
							var17 = class316.field2315;
							var16 -= field2016;
							var17 -= field1837;
							if (var16 < field2062) {
								var16 = field2062;
							}

							if (var11.field3540 + var16 > field2062 + field2015.field3540) {
								var16 = field2062 + field2015.field3540 - var11.field3540;
							}

							if (var17 < field2060) {
								var17 = field2060;
							}

							if (var17 + var11.field3541 > field2060 + field2015.field3541) {
								var17 = field2060 + field2015.field3541 - var11.field3541;
							}

							var13 = var16;
							var14 = var17;
						}

						if (!var11.field3609) {
							var15 = 128;
						}
					}

					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					int var23;
					if (var11.field3527 == 9) {
						var20 = var13;
						var21 = var14;
						var22 = var13 + var11.field3540;
						var23 = var11.field3541 + var14;
						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						if (var23 < var14) {
							var21 = var23;
							var23 = var14;
						}

						++var22;
						++var23;
						var16 = var20 > var2 ? var20 : var2;
						var17 = var21 > var3 ? var21 : var3;
						var18 = var22 < var4 ? var22 : var4;
						var19 = var23 < var5 ? var23 : var5;
					} else {
						var20 = var11.field3540 + var13;
						var21 = var11.field3541 + var14;
						var16 = var13 > var2 ? var13 : var2;
						var17 = var14 > var3 ? var14 : var3;
						var18 = var20 < var4 ? var20 : var4;
						var19 = var21 < var5 ? var21 : var5;
					}

					if (!var11.field3523 || var16 < var18 && var17 < var19) {
						if (var11.field3529 != 0) {
							if (var11.field3529 == 1336) {
								if (class109.field693.method452()) {
									var14 += 15;
									class331.field2352.method1060("Fps:" + class535.field4167, var13 + var11.field3540, var14, 16776960, -1);
									var14 += 15;
									Runtime var45 = Runtime.getRuntime();
									var21 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
									var22 = 16776960;
									if (var21 > 327680 && !field2059) {
										var22 = 16711680;
									}

									class331.field2352.method1060("Mem:" + var21 + "k", var11.field3540 + var13, var14, var22, -1);
									var14 += 15;
								}
								continue;
							}

							if (var11.field3529 == 1337) {
								field1935 = var13;
								field1992 = var14;
								class502.method2369(var13, var14, var11.field3540, var11.field3541);
								field2051[var11.field3666] = true;
								class433.method1958(var2, var3, var4, var5);
								continue;
							}

							if (var11.field3529 == 1338) {
								method1451(var11, var13, var14, var12);
								class433.method1958(var2, var3, var4, var5);
								continue;
							}

							if (var11.field3529 == 1339) {
								method1341(var11, var13, var14, var12);
								class433.method1958(var2, var3, var4, var5);
								continue;
							}

							if (var11.field3529 == 1400) {
								class520.field4103.method1159(var13, var14, var11.field3540, var11.field3541, field1846);
							}

							if (var11.field3529 == 1401) {
								class520.field4103.method1161(var13, var14, var11.field3540, var11.field3541);
							}

							if (var11.field3529 == 1402) {
								class168.field1183.method344(var13, field1846);
							}
						}

						if (var11.field3527 == 0) {
							if (!var11.field3523 && method1396(var11) && class429.field2880 != var11) {
								continue;
							}

							if (!var11.field3523) {
								if (var11.field3547 > var11.field3622 - var11.field3541) {
									var11.field3547 = var11.field3622 - var11.field3541;
								}

								if (var11.field3547 < 0) {
									var11.field3547 = 0;
								}
							}

							method1409(var0, var11.interfaceId, var16, var17, var18, var19, var13 - var11.field3560, var14 - var11.field3547, var12);
							if (null != var11.field3659) {
								method1409(var11.field3659, var11.interfaceId, var16, var17, var18, var19, var13 - var11.field3560, var14 - var11.field3547, var12);
							}

							InterfaceComponent var29 = (InterfaceComponent) interfaceComponents.get((long)var11.interfaceId);
							if (null != var29) {
								method1445(var29.group, var16, var17, var18, var19, var13, var14, var12);
							}

							class433.method1958(var2, var3, var4, var5);
							class105.method488();
						} else if (var11.field3527 == 11) {
							if (method1396(var11) && class429.field2880 != var11) {
								continue;
							}

							if (null != var11.field3659) {
								method1409(var11.field3659, var11.interfaceId, var16, var17, var18, var19, var13 - var11.field3560, var14 - var11.field3547, var12);
							}

							class433.method1958(var2, var3, var4, var5);
							class105.method488();
						}

						if (field1996 || field1990[var12] || field2031 > 1) {
							if (var11.field3527 == 0 && !var11.field3523 && var11.field3622 > var11.field3541) {
								method1398(var11.field3540 + var13, var14, var11.field3547, var11.field3541, var11.field3622);
							}

							if (var11.field3527 != 1) {
								if (var11.field3527 == 3) {
									if (method1340(var11)) {
										var20 = var11.field3551;
										if (var11 == class429.field2880 && var11.field3553 != 0) {
											var20 = var11.field3553;
										}
									} else {
										var20 = var11.field3550;
										if (var11 == class429.field2880 && var11.field3650 != 0) {
											var20 = var11.field3650;
										}
									}

									if (var11.field3554) {
										switch(var11.field3555.field2189) {
										case 1:
											class433.method1979(var13, var14, var11.field3540, var11.field3541, var11.field3550, var11.field3551);
											break;
										case 2:
											class433.method1966(var13, var14, var11.field3540, var11.field3541, var11.field3550, var11.field3551, 255 - (var11.field3556 & 255), 255 - (var11.field3595 & 255));
											break;
										default:
											if (var15 == 0) {
												class433.method1977(var13, var14, var11.field3540, var11.field3541, var20);
											} else {
												class433.method1965(var13, var14, var11.field3540, var11.field3541, var20, 256 - (var15 & 255));
											}
										}
									} else if (var15 == 0) {
										class433.method1978(var13, var14, var11.field3540, var11.field3541, var20);
									} else {
										class433.method1956(var13, var14, var11.field3540, var11.field3541, var20, 256 - (var15 & 255));
									}
								} else if (var11.field3527 == 4) {
									class282 var37 = var11.method2309(class208.interfaceConfigs);
									if (var37 == null) {
										if (class496.field3518) {
											method1363(var11);
										}
									} else {
										String var44 = var11.field3586;
										if (method1340(var11)) {
											var21 = var11.field3551;
											if (class429.field2880 == var11 && var11.field3553 != 0) {
												var21 = var11.field3553;
											}

											if (var11.field3655.length() > 0) {
												var44 = var11.field3655;
											}
										} else {
											var21 = var11.field3550;
											if (class429.field2880 == var11 && var11.field3650 != 0) {
												var21 = var11.field3650;
											}
										}

										if (var11.field3523 && var11.field3602 != -1) {
											class158 var46 = class158.method857(var11.field3602);
											var44 = var46.field1095;
											if (null == var44) {
												var44 = class513.field3757;
											}

											if ((var46.field1105 == 1 || var11.field3656 != 1) && var11.field3656 != -1) {
												var44 = class274.method1266(16748608) + var44 + class274.field1818 + " " + 'x' + class193.method946(var11.field3656);
											}
										}

										if (field1936 == var11) {
											var44 = class513.field3972;
											var21 = var11.field3550;
										}

										if (!var11.field3523) {
											var44 = method1455(var44, var11);
										}

										var37.method1041(var44, var13, var14, var11.field3540, var11.field3541, var21, var11.field3591 ? 0 : -1, class549.method2631(var11.field3556), var11.field3601, var11.field3533, var11.field3588);
									}
								} else {
									int var25;
									int var26;
									int var41;
									if (var11.field3527 == 5) {
										class42 var35;
										if (!var11.field3523) {
											var35 = var11.method2306(class208.interfaceConfigs, method1340(var11), class283.field2153);
											if (var35 != null) {
												var35.method159(var13, var14);
											} else if (class496.field3518) {
												method1363(var11);
											}
										} else {
											if (var11.field3602 != -1) {
												var35 = class158.method856(var11.field3602, var11.field3656, var11.field3608, var11.field3607, var11.field3584, false);
											} else {
												var35 = var11.method2306(class208.interfaceConfigs, false, class283.field2153);
											}

											if (null == var35) {
												if (class496.field3518) {
													method1363(var11);
												}
											} else {
												var21 = var35.field204;
												var22 = var35.field210;
												if (!var11.field3663) {
													var23 = var11.field3540 * 4096 / var21;
													if (var11.field3562 != 0) {
														var35.method174(var13 + var11.field3540 / 2, var14 + var11.field3541 / 2, var11.field3562, var23);
													} else if (var15 != 0) {
														var35.method165(var13, var14, var11.field3540, var11.field3541, 256 - (var15 & 255));
													} else if (var11.field3540 == var21 && var11.field3541 == var22) {
														var35.method159(var13, var14);
													} else {
														var35.method161(var13, var14, var11.field3540, var11.field3541);
													}
												} else {
													class433.method1959(var13, var14, var13 + var11.field3540, var11.field3541 + var14);
													var23 = (var21 - 1 + var11.field3540) / var21;
													var41 = (var11.field3541 + (var22 - 1)) / var22;

													for (var25 = 0; var25 < var23; ++var25) {
														for (var26 = 0; var26 < var41; ++var26) {
															if (var11.field3562 != 0) {
																var35.method174(var21 * var25 + var13 + var21 / 2, var22 / 2 + var22 * var26 + var14, var11.field3562, 4096);
															} else if (var15 != 0) {
																var35.method178(var25 * var21 + var13, var22 * var26 + var14, 256 - (var15 & 255));
															} else {
																var35.method159(var13 + var21 * var25, var26 * var22 + var14);
															}
														}
													}

													class433.method1958(var2, var3, var4, var5);
												}
											}
										}
									} else {
										int var27;
										if (var11.field3527 == 6) {
											boolean var33 = method1340(var11);
											if (var33) {
												var21 = var11.field3573;
											} else {
												var21 = var11.field3610;
											}

											class490 var36 = null;
											var23 = 0;
											if (var11.field3602 != -1) {
												class158 var38 = class158.method857(var11.field3602);
												if (null != var38) {
													var38 = var38.method841(var11.field3656);
													var36 = var38.method849(1);
													if (null != var36) {
														var36.method2261();
														var23 = var36.field3161 / 2;
													} else {
														method1363(var11);
													}
												}
											} else if (var11.field3568 == 5) {
												if (var11.field3521 == 0) {
													var36 = field2116.method906((class116)null, -1, (class116)null, -1);
												} else {
													var36 = class114.field720.method2152();
												}
											} else if (var11.field3568 == 7) {
												var36 = var11.field3581.method906((class116)null, -1, class116.method539(class114.field720.field383), class114.field720.field370);
											} else {
												class73 var39 = null;
												class120 var40 = null;
												if (var11.field3568 == 6) {
													var26 = var11.field3521;
													if (var26 >= 0 && var26 < field2017.length) {
														class378 var43 = field2017[var26];
														if (null != var43) {
															var39 = var43.field2605;
															var40 = var43.method1774();
														}
													}
												}

												class116 var42 = null;
												var27 = -1;
												if (var21 != -1) {
													var42 = class116.method539(var21);
													var27 = var11.field3657;
												}

												var36 = var11.method2329(class208.interfaceConfigs, var42, var27, var33, class114.field720.field2989, var39, var40);
												if (var36 == null && class496.field3518) {
													method1363(var11);
												}
											}

											class105.method487(var11.field3540 / 2 + var13, var11.field3541 / 2 + var14);
											var41 = var11.field3570 * class105.field670[var11.field3575] >> 16;
											var25 = var11.field3570 * class105.field671[var11.field3575] >> 16;
											if (null != var36) {
												if (!var11.field3523) {
													var36.method2278(0, var11.field3522, 0, var11.field3575, 0, var41, var25);
												} else {
													var36.method2261();
													if (var11.field3582) {
														var36.method2274(0, var11.field3522, var11.field3611, var11.field3575, var11.field3577, var41 + var23 + var11.field3574, var11.field3574 + var25, var11.field3570);
													} else {
														var36.method2278(0, var11.field3522, var11.field3611, var11.field3575, var11.field3577, var11.field3574 + var41 + var23, var11.field3574 + var25);
													}
												}
											}

											class105.method486();
										} else {
											class282 var31;
											if (var11.field3527 == 8 && class428.field2878 == var11 && field1844 == field2100) {
												var20 = 0;
												var21 = 0;
												var31 = class331.field2352;
												String var34 = var11.field3586;

												String var24;
												for (var34 = method1455(var34, var11); var34.length() > 0; var21 += var31.field1483 + 1) {
													var25 = var34.indexOf(class274.field1824);
													if (var25 != -1) {
														var24 = var34.substring(0, var25);
														var34 = var34.substring(var25 + 4);
													} else {
														var24 = var34;
														var34 = "";
													}

													var26 = var31.method1033(var24);
													if (var26 > var20) {
														var20 = var26;
													}
												}

												var20 += 6;
												var21 += 7;
												var25 = var11.field3540 + var13 - 5 - var20;
												var26 = var14 + var11.field3541 + 5;
												if (var25 < var13 + 5) {
													var25 = var13 + 5;
												}

												if (var25 + var20 > var4) {
													var25 = var4 - var20;
												}

												if (var26 + var21 > var5) {
													var26 = var5 - var21;
												}

												class433.method1977(var25, var26, var20, var21, 16777120);
												class433.method1978(var25, var26, var20, var21, 0);
												var34 = var11.field3586;
												var27 = var31.field1483 + var26 + 2;

												for (var34 = method1455(var34, var11); var34.length() > 0; var27 += var31.field1483 + 1) {
													int var28 = var34.indexOf(class274.field1824);
													if (var28 != -1) {
														var24 = var34.substring(0, var28);
														var34 = var34.substring(var28 + 4);
													} else {
														var24 = var34;
														var34 = "";
													}

													var31.method1037(var24, var25 + 3, var27, 0, -1);
												}
											}

											if (var11.field3527 == 9) {
												if (var11.field3549) {
													var20 = var13;
													var21 = var11.field3541 + var14;
													var22 = var13 + var11.field3540;
													var23 = var14;
												} else {
													var20 = var13;
													var21 = var14;
													var22 = var13 + var11.field3540;
													var23 = var14 + var11.field3541;
												}

												if (var11.field3563 == 1) {
													class433.method1972(var20, var21, var22, var23, var11.field3550);
												} else {
													method1377(var20, var21, var22, var23, var11.field3550, var11.field3563);
												}
											} else if (var11.field3527 == 12) {
												class135 var30 = var11.method2323((byte)98);
												class74 var32 = var11.method2324();
												if (null != var30 && null != var32 && var30.method664()) {
													var31 = var11.method2309(class208.interfaceConfigs);
													if (null != var31) {
														field2097.method892(var13, var14, var11.field3540, var11.field3541, var30.method665(), var30.method666(), var30.method662(), var30.method663(), var30.method661());
														var23 = var11.field3591 ? var11.field3607 : -1;
														if (!var30.method659() && var30.method693().method121()) {
															field2097.method894(var32.field525, var23, var32.field523, var32.field524);
															field2097.method893(var30.method657(), var31);
														} else {
															field2097.method894(var11.field3550, var23, var32.field523, var32.field524);
															field2097.method893(var30.method693(), var31);
														}

														class433.method1958(var2, var3, var4, var5);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	static final void method1377(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var7 = var2 - var0;
		int var8 = var3 - var1;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8 >= 0 ? var8 : -var8;
		int var11 = var9;
		if (var9 < var10) {
			var11 = var10;
		}

		if (var11 != 0) {
			int var12 = (var7 << 16) / var11;
			int var13 = (var8 << 16) / var11;
			if (var13 <= var12) {
				var12 = -var12;
			} else {
				var13 = -var13;
			}

			int var14 = var13 * var5 >> 17;
			int var15 = 1 + var5 * var13 >> 17;
			int var16 = var12 * var5 >> 17;
			int var17 = var12 * var5 + 1 >> 17;
			var0 -= class433.field2900;
			var1 -= class433.field2899;
			int var18 = var14 + var0;
			int var19 = var0 - var15;
			int var20 = var0 + var7 - var15;
			int var21 = var0 + var7 + var14;
			int var22 = var1 + var16;
			int var23 = var1 - var17;
			int var24 = var1 + var8 - var17;
			int var25 = var8 + var1 + var16;
			class105.method492(var18, var19, var20);
			class105.method493(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
			class105.method492(var18, var20, var21);
			class105.method493(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
		}
	}

	static String method1455(String var0, class496 var1) {
		if (var0.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; ++var3) {
				while (true) {
					int var4 = var0.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					var0 = var0.substring(0, var4) + method1468(method1385(var1, var3 - 1)) + var0.substring(var4 + 2);
				}
			}
		}

		return var0;
	}

	static void method1436(class496[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var6 = 0; var6 < var0.length; ++var6) {
			class496 var7 = var0[var6];
			if (null != var7 && var7.field3544 == var1) {
				method1366(var7, var2, var3, var4);
				method1469(var7, var2, var3);
				if (var7.field3560 > var7.field3590 - var7.field3540) {
					var7.field3560 = var7.field3590 - var7.field3540;
				}

				if (var7.field3560 < 0) {
					var7.field3560 = 0;
				}

				if (var7.field3547 > var7.field3622 - var7.field3541) {
					var7.field3547 = var7.field3622 - var7.field3541;
				}

				if (var7.field3547 < 0) {
					var7.field3547 = 0;
				}

				if (var7.field3527 == 0) {
					class145.method788(var0, var7, var4);
				}
			}
		}

	}

	static void method1366(class496 var0, int var1, int var2, boolean var3) {
		int var5 = var0.field3540;
		int var6 = var0.field3541;
		if (var0.field3532 == 0) {
			var0.field3540 = var0.field3536;
		} else if (var0.field3532 == 1) {
			var0.field3540 = var1 - var0.field3536;
		} else if (var0.field3532 == 2) {
			var0.field3540 = var1 * var0.field3536 >> 14;
		}

		if (var0.field3621 == 0) {
			var0.field3541 = var0.field3537;
		} else if (var0.field3621 == 1) {
			var0.field3541 = var2 - var0.field3537;
		} else if (var0.field3621 == 2) {
			var0.field3541 = var0.field3537 * var2 >> 14;
		}

		if (var0.field3532 == 4) {
			var0.field3540 = var0.field3541 * var0.field3542 / var0.field3543;
		}

		if (var0.field3621 == 4) {
			var0.field3541 = var0.field3543 * var0.field3540 / var0.field3542;
		}

		if (var0.field3529 == 1337) {
			field1860 = var0;
		}

		if (var0.field3527 == 12) {
			var0.method2323((byte)98).method690(var0.field3540, var0.field3541);
		}

		if (var3 && null != var0.field3643 && (var0.field3540 != var5 || var6 != var0.field3541)) {
			class376 var7 = new class376();
			var7.field2595 = var0;
			var7.field2594 = var0.field3643;
			field2019.method323(var7);
		}

	}

	static void method1469(class496 var0, int var1, int var2) {
		if (var0.field3647 == 0) {
			var0.field3520 = var0.field3534;
		} else if (var0.field3647 == 1) {
			var0.field3520 = (var1 - var0.field3540) / 2 + var0.field3534;
		} else if (var0.field3647 == 2) {
			var0.field3520 = var1 - var0.field3540 - var0.field3534;
		} else if (var0.field3647 == 3) {
			var0.field3520 = var1 * var0.field3534 >> 14;
		} else if (var0.field3647 == 4) {
			var0.field3520 = (var1 - var0.field3540) / 2 + (var0.field3534 * var1 >> 14);
		} else {
			var0.field3520 = var1 - var0.field3540 - (var1 * var0.field3534 >> 14);
		}

		if (var0.field3531 == 0) {
			var0.field3539 = var0.field3535;
		} else if (var0.field3531 == 1) {
			var0.field3539 = (var2 - var0.field3541) / 2 + var0.field3535;
		} else if (var0.field3531 == 2) {
			var0.field3539 = var2 - var0.field3541 - var0.field3535;
		} else if (var0.field3531 == 3) {
			var0.field3539 = var0.field3535 * var2 >> 14;
		} else if (var0.field3531 == 4) {
			var0.field3539 = (var2 * var0.field3535 >> 14) + (var2 - var0.field3541) / 2;
		} else {
			var0.field3539 = var2 - var0.field3541 - (var2 * var0.field3535 >> 14);
		}

	}

	static final void method1427(class496 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (field1895) {
			field1916 = 32;
		} else {
			field1916 = 0;
		}

		field1895 = false;
		int var8;
		if (class316.field2308 == 1 || !class108.field685 && class316.field2308 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.field3547 -= 4;
				method1363(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 + var3 - 16 && var6 < var3 + var2) {
				var0.field3547 += 4;
				method1363(var0);
			} else if (var5 >= var1 - field1916 && var5 < field1916 + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var8 = var3 * (var3 - 32) / var4;
				if (var8 < 8) {
					var8 = 8;
				}

				int var9 = var6 - var2 - 16 - var8 / 2;
				int var10 = var3 - 32 - var8;
				var0.field3547 = (var4 - var3) * var9 / var10;
				method1363(var0);
				field1895 = true;
			}
		}

		if (field2042 != 0) {
			var8 = var0.field3540;
			if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var2 + var3) {
				var0.field3547 += field2042 * 45;
				method1363(var0);
			}
		}

	}

	static final void method1398(int var0, int var1, int var2, int var3, int var4) {
		class9.field41[0].method1065(var0, var1);
		class9.field41[1].method1065(var0, var3 + var1 - 16);
		class433.method1977(var0, var1 + 16, 16, var3 - 32, field1911);
		int var6 = (var3 - 32) * var3 / var4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
		class433.method1977(var0, var7 + var1 + 16, 16, var6, field2113);
		class433.method1970(var0, var1 + 16 + var7, var6, field1914);
		class433.method1970(var0 + 1, var7 + var1 + 16, var6, field1914);
		class433.method1968(var0, var1 + 16 + var7, 16, field1914);
		class433.method1968(var0, var7 + var1 + 17, 16, field1914);
		class433.method1970(var0 + 15, var1 + 16 + var7, var6, field1869);
		class433.method1970(var0 + 14, var7 + var1 + 17, var6 - 1, field1869);
		class433.method1968(var0, var6 + var7 + var1 + 15, 16, field1869);
		class433.method1968(var0 + 1, var6 + var7 + var1 + 14, 15, field1869);
	}

	static final String method1468(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}

	static final boolean method1340(class496 var0) {
		if (var0.field3648 == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < var0.field3648.length; ++var2) {
				int var3 = method1385(var0, var2);
				int var4 = var0.field3649[var2];
				if (var0.field3648[var2] == 2) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var0.field3648[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (var0.field3648[var2] == 4) {
					if (var3 == var4) {
						return false;
					}
				} else if (var4 != var3) {
					return false;
				}
			}

			return true;
		}
	}

	static final int method1385(class496 var0, int var1) {
		if (var0.field3576 != null && var1 < var0.field3576.length) {
			try {
				int[] var3 = var0.field3576[var1];
				int var4 = 0;
				int var5 = 0;
				byte var6 = 0;

				while (true) {
					int var7 = var3[var5++];
					int var8 = 0;
					byte var9 = 0;
					if (var7 == 0) {
						return var4;
					}

					if (var7 == 1) {
						var8 = field1877[var3[var5++]];
					}

					if (var7 == 2) {
						var8 = field1970[var3[var5++]];
					}

					if (var7 == 3) {
						var8 = field1976[var3[var5++]];
					}

					int var10;
					class496 var11;
					int var12;
					int var13;
					if (var7 == 4) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class208.interfaceConfigs.method345(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class158.method857(var12).field1110 || field1835)) {
							for (var13 = 0; var13 < var11.field3633.length; ++var13) {
								if (var11.field3633[var13] == var12 + 1) {
									var8 += var11.field3654[var13];
								}
							}
						}
					}

					if (var7 == 5) {
						var8 = class119.field786[var3[var5++]];
					}

					if (var7 == 6) {
						var8 = class538.field4206[field1970[var3[var5++]] - 1];
					}

					if (var7 == 7) {
						var8 = class119.field786[var3[var5++]] * 100 / 46875;
					}

					if (var7 == 8) {
						var8 = class114.field720.field2993;
					}

					if (var7 == 9) {
						for (var10 = 0; var10 < 25; ++var10) {
							if (class538.field4205[var10]) {
								var8 += field1970[var10];
							}
						}
					}

					if (var7 == 10) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class208.interfaceConfigs.method345(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class158.method857(var12).field1110 || field1835)) {
							for (var13 = 0; var13 < var11.field3633.length; ++var13) {
								if (var11.field3633[var13] == var12 + 1) {
									var8 = 999999999;
									break;
								}
							}
						}
					}

					if (var7 == 11) {
						var8 = field2008;
					}

					if (var7 == 12) {
						var8 = field2009;
					}

					if (var7 == 13) {
						var10 = class119.field786[var3[var5++]];
						int var15 = var3[var5++];
						var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
					}

					if (var7 == 14) {
						var10 = var3[var5++];
						var8 = class119.method580(var10);
					}

					if (var7 == 15) {
						var9 = 1;
					}

					if (var7 == 16) {
						var9 = 2;
					}

					if (var7 == 17) {
						var9 = 3;
					}

					if (var7 == 18) {
						var8 = (class114.field720.field368 >> 7) + class80.selectedTileX;
					}

					if (var7 == 19) {
						var8 = (class114.field720.field329 >> 7) + class425.selectedTileXYIdk;
					}

					if (var7 == 20) {
						var8 = var3[var5++];
					}

					if (var9 == 0) {
						if (var6 == 0) {
							var4 += var8;
						}

						if (var6 == 1) {
							var4 -= var8;
						}

						if (var6 == 2 && var8 != 0) {
							var4 /= var8;
						}

						if (var6 == 3) {
							var4 *= var8;
						}

						var6 = 0;
					} else {
						var6 = var9;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	static final void method1408(class496 var0) {
		String var2;
		int var3;
		int var4;
		if (var0.field3528 == 1) {
			var2 = var0.field3652;
			var3 = var0.interfaceId;
			var4 = var0.field3602;
			method1407(var2, "", 24, 0, 0, var3, var4, false);
		}

		int var5;
		String var11;
		if (var0.field3528 == 2 && !field1997) {
			var2 = method1364(var0);
			if (null != var2) {
				var11 = class274.method1266(65280) + var0.field3651;
				var4 = var0.interfaceId;
				var5 = var0.field3602;
				method1407(var2, var11, 25, 0, -1, var4, var5, false);
			}
		}

		if (var0.field3528 == 3) {
			method1359(class513.field3751, "", 26, 0, 0, var0.interfaceId);
		}

		if (var0.field3528 == 4) {
			method1359(var0.field3652, "", 28, 0, 0, var0.interfaceId);
		}

		if (var0.field3528 == 5) {
			method1359(var0.field3652, "", 29, 0, 0, var0.interfaceId);
		}

		if (var0.field3528 == 6 && null == field1936) {
			method1359(var0.field3652, "", 30, 0, -1, var0.interfaceId);
		}

		if (var0.field3523) {
			int var6;
			int var7;
			int var8;
			String var12;
			if (field1997) {
				var3 = method1335(var0);
				boolean var9 = (var3 >> 21 & 1) != 0;
				if (var9 && (class467.field3301 & 32) == 32) {
					var12 = field2063;
					String var13 = field2001 + " " + class274.field1823 + " " + var0.field3564;
					var6 = var0.field3603;
					var7 = var0.interfaceId;
					var8 = var0.field3602;
					method1407(var12, var13, 58, 0, var6, var7, var8, false);
				}
			} else {
				for (int var10 = 9; var10 >= 5; --var10) {
					var11 = method1403(var0, var10);
					if (null != var11) {
						var12 = var0.field3564;
						var5 = var10 + 1;
						var6 = var0.field3603;
						var7 = var0.interfaceId;
						var8 = var0.field3602;
						method1407(var11, var12, 1007, var5, var6, var7, var8, false);
					}
				}

				var2 = method1364(var0);
				if (null != var2) {
					var11 = var0.field3564;
					var4 = var0.field3603;
					var5 = var0.interfaceId;
					var6 = var0.field3602;
					method1407(var2, var11, 25, 0, var4, var5, var6, false);
				}

				for (var3 = 4; var3 >= 0; --var3) {
					var12 = method1403(var0, var3);
					if (null != var12) {
						method1407(var12, var0.field3564, 57, var3 + 1, var0.field3603, var0.interfaceId, var0.field3602, var0.field3670);
					}
				}

				if (class427.method1946(method1335(var0))) {
					method1359(class513.field3755, "", 30, 0, var0.field3603, var0.interfaceId);
				}
			}
		}

	}

	static void method1362(boolean var0) {
		field1933 = var0;
	}

	static boolean method1316() {
		return field1933;
	}

	static final void method1466(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class208.interfaceConfigs.method347(var0)) {
			method1343(class208.interfaceConfigs.components[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	static final void method1343(class496[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var9 = 0; var9 < var0.length; ++var9) {
			class496 var10 = var0[var9];
			if (var10 != null && var1 == var10.field3544 && (var10.method2312() || method1335(var10) != 0 || field2015 == var10)) {
				if (var10.field3523) {
					if (method1396(var10)) {
						continue;
					}
				} else if (var10.field3527 == 0 && var10 != class429.field2880 && method1396(var10)) {
					continue;
				}

				if (var10.field3527 == 11) {
					if (var10.method2321(class208.interfaceConfigs, class283.field2153)) {
						if (var10.method2317()) {
							method1363(var10);
							class145.method788(var10.field3659, var10, true);
						}

						if (var10.field3646 != null) {
							class376 var11 = new class376();
							var11.field2595 = var10;
							var11.field2594 = var10.field3646;
							field2019.method323(var11);
						}
					}
				} else if (var10.field3527 == 12 && var10.method2327(class208.interfaceConfigs)) {
					method1363(var10);
				}

				int var27 = var10.field3520 + var6;
				int var12 = var10.field3539 + var7;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (var10.field3527 == 9) {
					var17 = var27;
					var18 = var12;
					var19 = var10.field3540 + var27;
					int var20 = var12 + var10.field3541;
					if (var19 < var27) {
						var17 = var19;
						var19 = var27;
					}

					if (var20 < var12) {
						var18 = var20;
						var20 = var12;
					}

					++var19;
					++var20;
					var13 = var17 > var2 ? var17 : var2;
					var14 = var18 > var3 ? var18 : var3;
					var15 = var19 < var4 ? var19 : var4;
					var16 = var20 < var5 ? var20 : var5;
				} else {
					var17 = var27 + var10.field3540;
					var18 = var12 + var10.field3541;
					var13 = var27 > var2 ? var27 : var2;
					var14 = var12 > var3 ? var12 : var3;
					var15 = var17 < var4 ? var17 : var4;
					var16 = var18 < var5 ? var18 : var5;
				}

				if (var10 == field2014) {
					field1998 = true;
					field1867 = var27;
					field2024 = var12;
				}

				boolean var28 = false;
				if (var10.field3598) {
					switch(field2004) {
					case 0:
						var28 = true;
					case 1:
					default:
						break;
					case 2:
						if (field2005 == var10.interfaceId >>> 16) {
							var28 = true;
						}
						break;
					case 3:
						if (field2005 == var10.interfaceId) {
							var28 = true;
						}
					}
				}

				if (var28 || !var10.field3523 || var13 < var15 && var14 < var16) {
					if (var10.field3523) {
						class376 var29;
						if (var10.field3668) {
							if (class316.field2309 >= var13 && class316.field2315 >= var14 && class316.field2309 < var15 && class316.field2315 < var16) {
								for (var29 = (class376)field2019.method327(); null != var29; var29 = (class376)field2019.method331()) {
									if (var29.field2585) {
										var29.method1719();
										var29.field2595.field3660 = false;
									}
								}

								method1389();
								if (class539.field4214 == 0) {
									field2014 = null;
									field2015 = null;
								}

								if (!field1978) {
									method1435();
								}
							}
						} else if (var10.field3552 && class316.field2309 >= var13 && class316.field2315 >= var14 && class316.field2309 < var15 && class316.field2315 < var16) {
							for (var29 = (class376)field2019.method327(); null != var29; var29 = (class376)field2019.method331()) {
								if (var29.field2585 && var29.field2594 == var29.field2595.field3548) {
									var29.method1719();
								}
							}
						}
					}

					var18 = class316.field2309;
					var19 = class316.field2315;
					if (class316.field2316 != 0) {
						var18 = class316.field2318;
						var19 = class316.field2320;
					}

					boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
					if (var10.field3529 == 1337) {
						if (!field1845 && !field1978 && var30) {
							method1342(var18, var19, var13, var14);
						}
					} else if (var10.field3529 == 1338) {
						method1444(var10, var27, var12);
					} else {
						if (var10.field3529 == 1400) {
							class520.field4103.method1144(class316.field2309, class316.field2315, var30, var27, var12, var10.field3540, var10.field3541);
						}

						if (!field1978 && var30) {
							if (var10.field3529 == 1400) {
								class520.field4103.method1151(var27, var12, var10.field3540, var10.field3541, var18, var19);
							} else {
								method1408(var10);
							}
						}

						boolean var22;
						int var24;
						if (var28) {
							for (int var21 = 0; var21 < var10.field3599.length; ++var21) {
								var22 = false;
								boolean var23 = false;
								if (null != var10.field3599[var21]) {
									for (var24 = 0; var24 < var10.field3599[var21].length; ++var24) {
										boolean var25 = false;
										if (var10.field3538 != null) {
											var25 = field2067.method1798(var10.field3599[var21][var24]);
										}

										if (method1353(var10.field3599[var21][var24]) || var25) {
											var22 = true;
											if (null != var10.field3538 && var10.field3538[var21] > field1846) {
												break;
											}

											byte var26 = var10.field3626[var21][var24];
											if (var26 == 0 || ((var26 & 8) == 0 || !field2067.method1798(86) && !field2067.method1798(82) && !field2067.method1798(81)) && ((var26 & 2) == 0 || field2067.method1798(86)) && ((var26 & 1) == 0 || field2067.method1798(82)) && ((var26 & 4) == 0 || field2067.method1798(81))) {
												var23 = true;
												break;
											}
										}
									}
								}

								if (var23) {
									if (var21 < 10) {
										method1411(var21 + 1, var10.interfaceId, var10.field3603, var10.field3602, "");
									} else if (var21 == 10) {
										method1423();
										method1461(var10.interfaceId, var10.field3603, class134.method618(method1335(var10)), var10.field3602);
										field2063 = method1364(var10);
										if (field2063 == null) {
											field2063 = class513.field3757;
										}

										field2001 = var10.field3564 + class274.method1266(16777215);
									}

									var24 = var10.field3617[var21];
									if (null == var10.field3538) {
										var10.field3538 = new int[var10.field3599.length];
									}

									if (var10.field3645 == null) {
										var10.field3645 = new int[var10.field3599.length];
									}

									if (var24 != 0) {
										if (var10.field3538[var21] == 0) {
											var10.field3538[var21] = var10.field3645[var21] + var24 + field1846;
										} else {
											var10.field3538[var21] = var24 + field1846;
										}
									} else {
										var10.field3538[var21] = Integer.MAX_VALUE;
									}
								}

								if (!var22 && var10.field3538 != null) {
									var10.field3538[var21] = 0;
								}
							}
						}

						if (var10.field3523) {
							if (class316.field2309 >= var13 && class316.field2315 >= var14 && class316.field2309 < var15 && class316.field2315 < var16) {
								var30 = true;
							} else {
								var30 = false;
							}

							boolean var31 = false;
							if ((class316.field2308 == 1 || !class108.field685 && class316.field2308 == 4) && var30) {
								var31 = true;
							}

							var22 = false;
							if ((class316.field2316 == 1 || !class108.field685 && class316.field2316 == 4) && class316.field2318 >= var13 && class316.field2320 >= var14 && class316.field2318 < var15 && class316.field2320 < var16) {
								var22 = true;
							}

							if (var22) {
								method1380(var10, class316.field2318 - var27, class316.field2320 - var12);
							}

							if (var10.method2313()) {
								if (var22) {
									field1848.method323(new class399(0, class316.field2309 - var27, class316.field2315 - var12, var10));
								}

								if (var31) {
									field1848.method323(new class399(1, class316.field2309 - var27, class316.field2315 - var12, var10));
								}
							}

							if (var10.field3529 == 1400) {
								class520.field4103.method1145(var18, var19, var30 & var31, var30 & var22);
							}

							if (field2014 != null && field2014 != var10 && var30 && class427.method1948(method1335(var10))) {
								field2018 = var10;
							}

							if (var10 == field2015) {
								field1960 = true;
								field2062 = var27;
								field2060 = var12;
							}

							if (var10.field3587) {
								class376 var32;
								if (var30 && field2042 != 0 && null != var10.field3548) {
									var32 = new class376();
									var32.field2585 = true;
									var32.field2595 = var10;
									var32.field2593 = field2042;
									var32.field2594 = var10.field3548;
									field2019.method323(var32);
								}

								if (null != field2014 || field1978) {
									var22 = false;
									var31 = false;
									var30 = false;
								}

								if (!var10.field3661 && var22) {
									var10.field3661 = true;
									if (null != var10.field3628) {
										var32 = new class376();
										var32.field2585 = true;
										var32.field2595 = var10;
										var32.field2588 = class316.field2318 - var27;
										var32.field2593 = class316.field2320 - var12;
										var32.field2594 = var10.field3628;
										field2019.method323(var32);
									}
								}

								if (var10.field3661 && var31 && var10.field3614 != null) {
									var32 = new class376();
									var32.field2585 = true;
									var32.field2595 = var10;
									var32.field2588 = class316.field2309 - var27;
									var32.field2593 = class316.field2315 - var12;
									var32.field2594 = var10.field3614;
									field2019.method323(var32);
								}

								if (var10.field3661 && !var31) {
									var10.field3661 = false;
									if (null != var10.field3615) {
										var32 = new class376();
										var32.field2585 = true;
										var32.field2595 = var10;
										var32.field2588 = class316.field2309 - var27;
										var32.field2593 = class316.field2315 - var12;
										var32.field2594 = var10.field3615;
										field2046.method323(var32);
									}
								}

								if (var31 && null != var10.field3616) {
									var32 = new class376();
									var32.field2585 = true;
									var32.field2595 = var10;
									var32.field2588 = class316.field2309 - var27;
									var32.field2593 = class316.field2315 - var12;
									var32.field2594 = var10.field3616;
									field2019.method323(var32);
								}

								if (!var10.field3660 && var30) {
									var10.field3660 = true;
									if (var10.field3572 != null) {
										var32 = new class376();
										var32.field2585 = true;
										var32.field2595 = var10;
										var32.field2588 = class316.field2309 - var27;
										var32.field2593 = class316.field2315 - var12;
										var32.field2594 = var10.field3572;
										field2019.method323(var32);
									}
								}

								if (var10.field3660 && var30 && null != var10.field3613) {
									var32 = new class376();
									var32.field2585 = true;
									var32.field2595 = var10;
									var32.field2588 = class316.field2309 - var27;
									var32.field2593 = class316.field2315 - var12;
									var32.field2594 = var10.field3613;
									field2019.method323(var32);
								}

								if (var10.field3660 && !var30) {
									var10.field3660 = false;
									if (var10.field3619 != null) {
										var32 = new class376();
										var32.field2585 = true;
										var32.field2595 = var10;
										var32.field2588 = class316.field2309 - var27;
										var32.field2593 = class316.field2315 - var12;
										var32.field2594 = var10.field3619;
										field2046.method323(var32);
									}
								}

								if (null != var10.field3630) {
									var32 = new class376();
									var32.field2595 = var10;
									var32.field2594 = var10.field3630;
									field1856.method323(var32);
								}

								int var35;
								class376 var37;
								int var38;
								if (var10.field3624 != null && field1944 > var10.field3519) {
									if (null != var10.field3625 && field1944 - var10.field3519 <= 32) {
										label644:
										for (var38 = var10.field3519; var38 < field1944; ++var38) {
											var24 = field2028[var38 & 31];

											for (var35 = 0; var35 < var10.field3625.length; ++var35) {
												if (var24 == var10.field3625[var35]) {
													var37 = new class376();
													var37.field2595 = var10;
													var37.field2594 = var10.field3624;
													field2019.method323(var37);
													break label644;
												}
											}
										}
									} else {
										var32 = new class376();
										var32.field2595 = var10;
										var32.field2594 = var10.field3624;
										field2019.method323(var32);
									}

									var10.field3519 = field1944;
								}

								if (var10.field3569 != null && field1915 > var10.field3664) {
									if (var10.field3627 != null && field1915 - var10.field3664 <= 32) {
										label620:
										for (var38 = var10.field3664; var38 < field1915; ++var38) {
											var24 = field1989[var38 & 31];

											for (var35 = 0; var35 < var10.field3627.length; ++var35) {
												if (var24 == var10.field3627[var35]) {
													var37 = new class376();
													var37.field2595 = var10;
													var37.field2594 = var10.field3569;
													field2019.method323(var37);
													break label620;
												}
											}
										}
									} else {
										var32 = new class376();
										var32.field2595 = var10;
										var32.field2594 = var10.field3569;
										field2019.method323(var32);
									}

									var10.field3664 = field1915;
								}

								if (var10.field3600 != null && field1918 > var10.field3665) {
									if (var10.field3629 != null && field1918 - var10.field3665 <= 32) {
										label596:
										for (var38 = var10.field3665; var38 < field1918; ++var38) {
											var24 = field2030[var38 & 31];

											for (var35 = 0; var35 < var10.field3629.length; ++var35) {
												if (var24 == var10.field3629[var35]) {
													var37 = new class376();
													var37.field2595 = var10;
													var37.field2594 = var10.field3600;
													field2019.method323(var37);
													break label596;
												}
											}
										}
									} else {
										var32 = new class376();
										var32.field2595 = var10;
										var32.field2594 = var10.field3600;
										field2019.method323(var32);
									}

									var10.field3665 = field1918;
								}

								if (field2034 > var10.field3662 && var10.field3634 != null) {
									var32 = new class376();
									var32.field2595 = var10;
									var32.field2594 = var10.field3634;
									field2019.method323(var32);
								}

								if (field2035 > var10.field3662 && null != var10.field3669) {
									var32 = new class376();
									var32.field2595 = var10;
									var32.field2594 = var10.field3669;
									field2019.method323(var32);
								}

								if (field2023 > var10.field3662 && null != var10.field3638) {
									var32 = new class376();
									var32.field2595 = var10;
									var32.field2594 = var10.field3638;
									field2019.method323(var32);
								}

								if (field1955 > var10.field3662 && var10.field3639 != null) {
									var32 = new class376();
									var32.field2595 = var10;
									var32.field2594 = var10.field3639;
									field2019.method323(var32);
								}

								if (field1831 > var10.field3662 && var10.field3640 != null) {
									var32 = new class376();
									var32.field2595 = var10;
									var32.field2594 = var10.field3640;
									field2019.method323(var32);
								}

								if (field2039 > var10.field3662 && null != var10.field3644) {
									var32 = new class376();
									var32.field2595 = var10;
									var32.field2594 = var10.field3644;
									field2019.method323(var32);
								}

								if (field2056 > var10.field3662 && null != var10.field3557) {
									var32 = new class376();
									var32.field2595 = var10;
									var32.field2594 = var10.field3557;
									field2019.method323(var32);
								}

								if (field2041 > var10.field3662 && var10.field3641 != null) {
									var32 = new class376();
									var32.field2595 = var10;
									var32.field2594 = var10.field3641;
									field2019.method323(var32);
								}

								var10.field3662 = field1977;
								if (null != var10.field3635) {
									for (var38 = 0; var38 < field2069; ++var38) {
										class376 var36 = new class376();
										var36.field2595 = var10;
										var36.field2587 = field2071[var38];
										var36.field2592 = field1974[var38];
										var36.field2594 = var10.field3635;
										field2019.method323(var36);
									}
								}

								class376 var39;
								int[] var40;
								if (var10.field3636 != null) {
									var40 = field2067.method1800();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new class376();
										var39.field2595 = var10;
										var39.field2587 = var40[var24];
										var39.field2594 = var10.field3636;
										field2019.method323(var39);
									}
								}

								if (var10.field3637 != null) {
									var40 = field2067.method1799();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new class376();
										var39.field2595 = var10;
										var39.field2587 = var40[var24];
										var39.field2594 = var10.field3637;
										field2019.method323(var39);
									}
								}
							}
						}

						if (!var10.field3523) {
							if (field2014 != null || field1978) {
								continue;
							}

							if ((var10.field3546 >= 0 || var10.field3650 != 0) && class316.field2309 >= var13 && class316.field2315 >= var14 && class316.field2309 < var15 && class316.field2315 < var16) {
								if (var10.field3546 >= 0) {
									class429.field2880 = var0[var10.field3546];
								} else {
									class429.field2880 = var10;
								}
							}

							if (var10.field3527 == 8 && class316.field2309 >= var13 && class316.field2315 >= var14 && class316.field2309 < var15 && class316.field2315 < var16) {
								class428.field2878 = var10;
							}

							if (var10.field3622 > var10.field3541) {
								method1427(var10, var27 + var10.field3540, var12, var10.field3541, var10.field3622, class316.field2309, class316.field2315);
							}
						}

						if (var10.field3527 == 0) {
							method1343(var0, var10.interfaceId, var13, var14, var15, var16, var27 - var10.field3560, var12 - var10.field3547);
							if (null != var10.field3659) {
								method1343(var10.field3659, var10.interfaceId, var13, var14, var15, var16, var27 - var10.field3560, var12 - var10.field3547);
							}

							InterfaceComponent var33 = (InterfaceComponent) interfaceComponents.get((long)var10.interfaceId);
							if (var33 != null) {
								if (var33.field2204 == 0 && class316.field2309 >= var13 && class316.field2315 >= var14 && class316.field2309 < var15 && class316.field2315 < var16 && !field1978) {
									for (class376 var34 = (class376)field2019.method327(); null != var34; var34 = (class376)field2019.method331()) {
										if (var34.field2585) {
											var34.method1719();
											var34.field2595.field3660 = false;
										}
									}

									if (class539.field4214 == 0) {
										field2014 = null;
										field2015 = null;
									}

									if (!field1978) {
										method1435();
									}
								}

								method1466(var33.group, var13, var14, var15, var16, var27, var12);
							}
						}
					}
				}
			}
		}

	}

	static boolean method1353(int var0) {
		for (int var2 = 0; var2 < field2069; ++var2) {
			if (field2071[var2] == var0) {
				return true;
			}
		}

		return false;
	}

	static final void runInterfaceListeners(int var0, int var1) {
		if (class208.interfaceConfigs.method347(var0)) {
			method1424(class208.interfaceConfigs.components[var0], var1);
		}
	}

	static final void method1424(class496[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class496 var4 = var0[var3];
			if (var4 != null) {
				if (var4.field3527 == 0) {
					if (var4.field3659 != null) {
						method1424(var4.field3659, var1);
					}

					InterfaceComponent var5 = (InterfaceComponent) interfaceComponents.get((long)var4.interfaceId);
					if (null != var5) {
						runInterfaceListeners(var5.group, var1);
					}
				}

				class376 var6;
				if (var1 == 0 && var4.field3642 != null) {
					var6 = new class376();
					var6.field2595 = var4;
					var6.field2594 = var4.field3642;
					class440.method2027(var6);
				}

				if (var1 == 1 && var4.field3565 != null) {
					if (var4.field3603 >= 0) {
						class496 var7 = class208.interfaceConfigs.method345(var4.interfaceId);
						if (var7 == null || var7.field3659 == null || var4.field3603 >= var7.field3659.length || var4 != var7.field3659[var4.field3603]) {
							continue;
						}
					}

					var6 = new class376();
					var6.field2595 = var4;
					var6.field2594 = var4.field3565;
					class440.method2027(var6);
				}
			}
		}

	}

	static final void method1380(class496 var0, int var1, int var2) {
		if (field2014 == null && !field1978) {
			if (null != var0 && method1417(var0) != null) {
				field2014 = var0;
				field2015 = method1417(var0);
				field2016 = var1;
				field1837 = var2;
				class539.field4214 = 0;
				field2025 = false;
				int var4 = method1345();
				if (var4 != -1) {
					class10.field49 = new class32();
					class10.field49.field161 = field2070[var4];
					class10.field49.field162 = field1981[var4];
					class10.field49.field159 = field1982[var4];
					class10.field49.field160 = field1983[var4];
					class10.field49.field163 = field1984[var4];
					class10.field49.field157 = field1985[var4];
					class10.field49.field158 = field1986[var4];
				}

			}
		}
	}

	static void method1404(int var0, int var1) {
		method1306(class10.field49, var0, var1);
		class10.field49 = null;
	}

	public static void method1363(class496 var0) {
		if (var0 != null && var0.field3667 == field2050) {
			field2051[var0.field3666] = true;
		}

	}

	static void method1426() {
		for (InterfaceComponent var1 = (InterfaceComponent) interfaceComponents.method1753(); null != var1; var1 = (InterfaceComponent) interfaceComponents.method1754()) {
			int var2 = var1.group;
			if (class208.interfaceConfigs.method347(var2)) {
				boolean var3 = true;
				class496[] var4 = class208.interfaceConfigs.components[var2];

				int var5;
				for (var5 = 0; var5 < var4.length; ++var5) {
					if (var4[var5] != null) {
						var3 = var4[var5].field3523;
						break;
					}
				}

				if (!var3) {
					var5 = (int)var1.field2472;
					class496 var6 = class208.interfaceConfigs.method345(var5);
					if (var6 != null) {
						method1363(var6);
					}
				}
			}
		}

	}

	static class496 method1417(class496 var0) {
		class496 var2 = method1401(var0);
		if (var2 == null) {
			var2 = var0.field3566;
		}

		return var2;
	}

	static final void method1434(int var0) {
		if (class208.interfaceConfigs.method347(var0)) {
			class496[] var2 = class208.interfaceConfigs.components[var0];

			for (int var3 = 0; var3 < var2.length; ++var3) {
				class496 var4 = var2[var3];
				if (null != var4) {
					var4.field3657 = 0;
					var4.field3658 = 0;
				}
			}

		}
	}

	static final void method1369(int var0) {
		if (class208.interfaceConfigs.method347(var0)) {
			method1373(class208.interfaceConfigs.components[var0], -1);
		}
	}

	static final void method1373(class496[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class496 var4 = var0[var3];
			if (var4 != null && var4.field3544 == var1 && (!var4.field3523 || !method1396(var4))) {
				if (var4.field3527 == 0) {
					if (!var4.field3523 && method1396(var4) && var4 != class429.field2880) {
						continue;
					}

					method1373(var0, var4.interfaceId);
					if (null != var4.field3659) {
						method1373(var4.field3659, var4.interfaceId);
					}

					InterfaceComponent var5 = (InterfaceComponent) interfaceComponents.get((long)var4.interfaceId);
					if (null != var5) {
						method1369(var5.group);
					}
				}

				if (var4.field3527 == 6) {
					int var6;
					if (var4.field3610 != -1 || var4.field3573 != -1) {
						boolean var9 = method1340(var4);
						if (var9) {
							var6 = var4.field3573;
						} else {
							var6 = var4.field3610;
						}

						if (var6 != -1) {
							class116 var7 = class116.method539(var6);
							if (!var7.method533()) {
								for (var4.field3658 += field2022; var4.field3658 > var7.field722[var4.field3657]; method1363(var4)) {
									var4.field3658 -= var7.field722[var4.field3657];
									++var4.field3657;
									if (var4.field3657 >= var7.field733.length) {
										var4.field3657 -= var7.field737;
										if (var4.field3657 < 0 || var4.field3657 >= var7.field733.length) {
											var4.field3657 = 0;
										}
									}
								}
							} else {
								var4.field3657 += field2022;
								int var8 = var7.method535();
								if (var4.field3657 >= var8) {
									var4.field3657 -= var7.field737;
									if (var4.field3657 < 0 || var4.field3657 >= var8) {
										var4.field3657 = 0;
									}
								}

								method1363(var4);
							}
						}
					}

					if (var4.field3580 != 0 && !var4.field3523) {
						int var10 = var4.field3580 >> 16;
						var6 = var4.field3580 << 16 >> 16;
						var10 *= field2022;
						var6 *= field2022;
						var4.field3575 = var4.field3575 + var10 & 2047;
						var4.field3522 = var4.field3522 + var6 & 2047;
						method1363(var4);
					}
				}
			}
		}

	}

	static final void method1465(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var2 = 0.5F + (float)var0 / 200.0F;
		method1378((double)var2);
	}

	static final int method1412() {
		float var1 = 200.0F * ((float)class109.field693.method444() - 0.5F);
		return 100 - Math.round(var1);
	}

	static final void method1378(double var0) {
		class105.method472(var0);
		((class114)class105.field668.field1730).method523(var0);
		class158.field1114.method1679();
		class109.field693.method441(var0);
	}

	static final void method1379(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class109.field693.method446()) {
			if (class109.field693.method446() == 0 && class483.method2218()) {
				class483.method2221(class151.field1049, var0);
				field2083 = false;
			} else if (var0 == 0) {
				class483.method2223(0, 0);
				field2083 = false;
			} else if (!class483.field3389.isEmpty()) {
				Iterator var2 = class483.field3389.iterator();

				while (var2.hasNext()) {
					class407 var3 = (class407)var2.next();
					if (null != var3) {
						var3.field2792 = var0;
					}
				}

				class407 var4 = (class407)class483.field3389.get(0);
				if (null != var4 && null != var4.field2789 && var4.field2789.method547() && !var4.field2797) {
					var4.field2789.method542(var0);
					var4.field2793 = (float)var0;
				}
			}

			class109.field693.method445(var0);
		}

	}

	static final void method1402(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class109.field693.method465(var0);
	}

	static final void method1383(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class109.field693.method449(var0);
	}

	static final void method1329(int var0) {
		method1426();
		class218.method1007();
		int var2 = class319.method1579(var0).field2325;
		if (var2 != 0) {
			int var3 = class119.field786[var0];
			if (var2 == 1) {
				if (var3 == 1) {
					method1378(0.9D);
				}

				if (var3 == 2) {
					method1378(0.8D);
				}

				if (var3 == 3) {
					method1378(0.7D);
				}

				if (var3 == 4) {
					method1378(0.6D);
				}
			}

			if (var2 == 3) {
				if (var3 == 0) {
					method1379(255);
				}

				if (var3 == 1) {
					method1379(192);
				}

				if (var3 == 2) {
					method1379(128);
				}

				if (var3 == 3) {
					method1379(64);
				}

				if (var3 == 4) {
					method1379(0);
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					method1402(127);
				}

				if (var3 == 1) {
					method1402(96);
				}

				if (var3 == 2) {
					method1402(64);
				}

				if (var3 == 3) {
					method1402(32);
				}

				if (var3 == 4) {
					method1402(0);
				}
			}

			if (var2 == 5) {
				field2057 = var3 == 1;
			}

			if (var2 == 6) {
				field2006 = var3;
			}

			if (var2 == 9) {
			}

			if (var2 == 10) {
				if (var3 == 0) {
					method1383(127);
				}

				if (var3 == 1) {
					method1383(96);
				}

				if (var3 == 2) {
					method1383(64);
				}

				if (var3 == 3) {
					method1383(32);
				}

				if (var3 == 4) {
					method1383(0);
				}
			}

			if (var2 == 17) {
				field2011 = var3 & 65535;
			}

			if (var2 == 18) {
				field2007 = (class491)class26.method87(class491.method2291(), var3);
				if (field2007 == null) {
					field2007 = class491.field3499;
				}
			}

			if (var2 == 19) {
				if (var3 == -1) {
					field1969 = -1;
				} else {
					field1969 = var3 & 2047;
				}
			}

			if (var2 == 22) {
				field2115 = (class491)class26.method87(class491.method2291(), var3);
				if (null == field2115) {
					field2115 = class491.field3499;
				}
			}

		}
	}

	static final void method1309(class496 var0) {
		int var2 = var0.field3529;
		if (var2 == 324) {
			if (field2117 == -1) {
				field2117 = var0.field3653;
				field2118 = var0.field3571;
			}

			if (field2116.field1201 == 1) {
				var0.field3653 = field2117;
			} else {
				var0.field3653 = field2118;
			}

		} else if (var2 == 325) {
			if (field2117 == -1) {
				field2117 = var0.field3653;
				field2118 = var0.field3571;
			}

			if (field2116.field1201 == 1) {
				var0.field3653 = field2118;
			} else {
				var0.field3653 = field2117;
			}

		} else if (var2 == 327) {
			var0.field3575 = 150;
			var0.field3522 = (int)(Math.sin((double)field1846 / 40.0D) * 256.0D) & 2047;
			var0.field3568 = 5;
			var0.field3521 = 0;
		} else if (var2 == 328) {
			var0.field3575 = 150;
			var0.field3522 = (int)(Math.sin((double)field1846 / 40.0D) * 256.0D) & 2047;
			var0.field3568 = 5;
			var0.field3521 = 1;
		}
	}

	static final void method1321() {
		class341 var1 = class341.createClientPacket(ClientPacket.field3081, field1891.field4219);
		field1891.method2612(var1);
		class440.field2963 = true;

		for (InterfaceComponent var2 = (InterfaceComponent) interfaceComponents.method1753(); var2 != null; var2 = (InterfaceComponent) interfaceComponents.method1754()) {
			if (var2.field2204 == 0 || var2.field2204 == 3) {
				closeInterface(var2, true);
			}
		}

		if (null != field1936) {
			method1363(field1936);
			field1936 = null;
		}

		class440.field2963 = false;
	}

	static final void closeInterface(InterfaceComponent var0, boolean var1) {
		int var3 = var0.group;
		int var4 = (int)var0.field2472;
		var0.method1719();
		if (var1) {
			class208.interfaceConfigs.method348(var3);
		}

		method1441(var3);
		class496 var5 = class208.interfaceConfigs.method345(var4);
		if (var5 != null) {
			method1363(var5);
		}

		if (rootInterface != -1) {
			runInterfaceListeners(rootInterface, 1);
		}

	}

	static final boolean method1388(class496 var0) {
		int var2 = var0.field3529;
		if (var2 == 205) {
			field1897 = 250;
			return true;
		} else {
			int var3;
			int var4;
			if (var2 >= 300 && var2 <= 313) {
				var3 = (var2 - 300) / 2;
				var4 = var2 & 1;
				field2116.method901(var3, var4 == 1);
			}

			if (var2 >= 314 && var2 <= 323) {
				var3 = (var2 - 314) / 2;
				var4 = var2 & 1;
				field2116.method902(var3, var4 == 1);
			}

			if (var2 == 324) {
				field2116.method897(0);
			}

			if (var2 == 325) {
				field2116.method897(1);
			}

			if (var2 == 326) {
				class341 var5 = class341.createClientPacket(ClientPacket.field3053, field1891.field4219);
				field2116.method903(var5.buffer);
				field1891.method2612(var5);
				return true;
			} else {
				return false;
			}
		}
	}

	static final void method1451(class496 var0, int var1, int var2, int var3) {
		class253.method1209();
		class313 var5 = var0.method2310(class208.interfaceConfigs, false);
		if (null != var5) {
			class433.method1958(var1, var2, var5.field2274 + var1, var5.field2270 + var2);
			if (field2082 != 2 && field2082 != 5) {
				int var6 = field1962 & 2047;
				int var7 = class114.field720.field368 / 32 + 48;
				int var8 = 464 - class114.field720.field329 / 32;
				class313.field2271.method173(var1, var2, var5.field2274, var5.field2270, var7, var8, var6, 256, var5.field2273, var5.field2272);

				int var9;
				int var10;
				int var11;
				for (var9 = 0; var9 < field1912; ++var9) {
					var10 = field2077[var9] * 4 + 2 - class114.field720.field368 / 32;
					var11 = 2 + field2078[var9] * 4 - class114.field720.field329 / 32;
					method1331(var1, var2, var10, var11, field2079[var9], var5);
				}

				int var12;
				int var13;
				for (var9 = 0; var9 < 104; ++var9) {
					for (var10 = 0; var10 < 104; ++var10) {
						class69 var17 = field2000[class212.field1393][var9][var10];
						if (var17 != null) {
							var12 = var9 * 4 + 2 - class114.field720.field368 / 32;
							var13 = var10 * 4 + 2 - class114.field720.field329 / 32;
							method1331(var1, var2, var12, var13, class274.field1826[0], var5);
						}
					}
				}

				for (var9 = 0; var9 < field1980; ++var9) {
					class378 var15 = field2017[field1893[var9]];
					if (var15 != null && var15.method289()) {
						class73 var18 = var15.field2605;
						if (var18 != null && var18.field477 != null) {
							var18 = var18.method363();
						}

						if (null != var18 && var18.field506 && var18.field492) {
							var12 = var15.field368 / 32 - class114.field720.field368 / 32;
							var13 = var15.field329 / 32 - class114.field720.field329 / 32;
							method1331(var1, var2, var12, var13, class274.field1826[1], var5);
						}
					}
				}

				var9 = class264.field1764;
				int[] var16 = class264.field1765;

				for (var11 = 0; var11 < var9; ++var11) {
					Player var19 = field2037[var16[var11]];
					if (null != var19 && var19.method289() && !var19.field3008 && class114.field720 != var19) {
						var13 = var19.field368 / 32 - class114.field720.field368 / 32;
						int var14 = var19.field329 / 32 - class114.field720.field329 / 32;
						if (var19.method2115()) {
							method1331(var1, var2, var13, var14, class274.field1826[3], var5);
						} else if (class114.field720.field3007 != 0 && var19.field3007 != 0 && class114.field720.field3007 == var19.field3007) {
							method1331(var1, var2, var13, var14, class274.field1826[4], var5);
						} else if (var19.method2117()) {
							method1331(var1, var2, var13, var14, class274.field1826[5], var5);
						} else if (var19.method2126()) {
							method1331(var1, var2, var13, var14, class274.field1826[6], var5);
						} else {
							method1331(var1, var2, var13, var14, class274.field1826[2], var5);
						}
					}
				}

				if (field1853 != 0 && field1846 % 20 < 10) {
					if (field1853 == 1 && field1854 >= 0 && field1854 < field2017.length) {
						class378 var20 = field2017[field1854];
						if (var20 != null) {
							var12 = var20.field368 / 32 - class114.field720.field368 / 32;
							var13 = var20.field329 / 32 - class114.field720.field329 / 32;
							method1438(var1, var2, var12, var13, class312.field2266[1], var5);
						}
					}

					if (field1853 == 2) {
						var11 = 2 + (field1896 * 4 - class80.selectedTileX * 4) - class114.field720.field368 / 32;
						var12 = field1857 * 4 - class425.selectedTileXYIdk * 4 + 2 - class114.field720.field329 / 32;
						method1438(var1, var2, var11, var12, class312.field2266[1], var5);
					}

					if (field1853 == 10 && field1855 >= 0 && field1855 < field2037.length) {
						Player var21 = field2037[field1855];
						if (var21 != null) {
							var12 = var21.field368 / 32 - class114.field720.field368 / 32;
							var13 = var21.field329 / 32 - class114.field720.field329 / 32;
							method1438(var1, var2, var12, var13, class312.field2266[1], var5);
						}
					}
				}

				if (field1840 != 0) {
					var11 = field1840 * 4 + 2 - class114.field720.field368 / 32;
					var12 = field2081 * 4 + 2 - class114.field720.field329 / 32;
					method1331(var1, var2, var11, var12, class312.field2266[0], var5);
				}

				if (!class114.field720.field3008) {
					class433.method1977(var5.field2274 / 2 + var1 - 1, var5.field2270 / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				class433.method1974(var1, var2, 0, var5.field2273, var5.field2272);
			}

			field2047[var3] = true;
		}
	}

	static final void method1341(class496 var0, int var1, int var2, int var3) {
		class313 var5 = var0.method2310(class208.interfaceConfigs, false);
		if (null != var5) {
			if (field2082 < 3) {
				class153.field1057.method173(var1, var2, var5.field2274, var5.field2270, 25, 25, field1962, 256, var5.field2273, var5.field2272);
			} else {
				class433.method1974(var1, var2, 0, var5.field2273, var5.field2272);
			}

		}
	}

	static final void method1438(int var0, int var1, int var2, int var3, class42 var4, class313 var5) {
		int var7 = var3 * var3 + var2 * var2;
		if (var7 > 4225 && var7 < 90000) {
			int var8 = field1962 & 2047;
			int var9 = class105.field670[var8];
			int var10 = class105.field671[var8];
			int var11 = var2 * var10 + var9 * var3 >> 16;
			int var12 = var10 * var3 - var2 * var9 >> 16;
			double var13 = Math.atan2((double)var11, (double)var12);
			int var15 = var5.field2274 / 2 - 25;
			int var16 = (int)(Math.sin(var13) * (double)var15);
			int var17 = (int)(Math.cos(var13) * (double)var15);
			boolean var18 = true;
			class47.field233.method164(var0 + var5.field2274 / 2 - 10 + var16, var5.field2270 / 2 + var1 - 10 - var17 - 10, 20, 20, 15, 15, var13, 256);
		} else {
			method1331(var0, var1, var2, var3, var4, var5);
		}

	}

	static final void method1331(int var0, int var1, int var2, int var3, class42 var4, class313 var5) {
		if (null != var4) {
			int var7 = field1962 & 2047;
			int var8 = var3 * var3 + var2 * var2;
			if (var8 <= 6400) {
				int var9 = class105.field670[var7];
				int var10 = class105.field671[var7];
				int var11 = var9 * var3 + var10 * var2 >> 16;
				int var12 = var3 * var10 - var9 * var2 >> 16;
				if (var8 > 2500) {
					var4.method172(var11 + var5.field2274 / 2 - var4.field204 / 2, var5.field2270 / 2 - var12 - var4.field210 / 2, var0, var1, var5.field2274, var5.field2270, var5.field2273, var5.field2272);
				} else {
					var4.method159(var11 + var5.field2274 / 2 + var0 - var4.field204 / 2, var1 + var5.field2270 / 2 - var12 - var4.field210 / 2);
				}

			}
		}
	}

	static final void method1387() {
		for (int var1 = 0; var1 < class264.field1764; ++var1) {
			Player var2 = field2037[class264.field1765[var1]];
			var2.method2116();
		}

		Iterator var3 = class346.field2427.iterator();

		while (var3.hasNext()) {
			class56 var4 = (class56)var3.next();
			var4.method226();
		}

		if (class257.field1749 != null) {
			class257.field1749.method2603();
		}

	}

	static final void method1460() {
		Iterator var1 = class346.field2427.iterator();

		while (var1.hasNext()) {
			class56 var2 = (class56)var1.next();
			var2.method230();
		}

		if (class257.field1749 != null) {
			class257.field1749.method2604();
		}

	}

	static final void method1339() {
		field2023 = field1977;
		class227.field1473 = true;
	}

	static final void method1371() {
		field1955 = field1977;
		class67.field438 = true;
	}

	static final void method1310(String var0) {
		if (class257.field1749 != null) {
			class341 var2 = class341.createClientPacket(ClientPacket.field3108, field1891.field4219);
			var2.buffer.writeByte(Buffer.method2535(var0));
			var2.buffer.writeString(var0);
			field1891.method2612(var2);
		}
	}

	static final void method1405(String var0) {
		if (!var0.equals("")) {
			class341 var2 = class341.createClientPacket(ClientPacket.field3145, field1891.field4219);
			var2.buffer.writeByte(Buffer.method2535(var0));
			var2.buffer.writeString(var0);
			field1891.method2612(var2);
		}
	}

	static final void method1421() {
		class341 var1 = class341.createClientPacket(ClientPacket.field3145, field1891.field4219);
		var1.buffer.writeByte(0);
		field1891.method2612(var1);
	}

	static final void method1458(int var0, int var1) {
		class398 var3 = var0 >= 0 ? field2074[var0] : class455.field3020;
		if (null != var3 && var1 >= 0 && var1 < var3.method1854()) {
			class455 var4 = (class455)var3.field2738.get(var1);
			if (var4.field3018 == -1) {
				String var5 = var4.field3021.method2398();
				class341 var6 = class341.createClientPacket(ClientPacket.field3103, field1891.field4219);
				var6.buffer.writeByte(3 + Buffer.method2535(var5));
				var6.buffer.writeByte(var0);
				var6.buffer.writeShort(var1);
				var6.buffer.writeString(var5);
				field1891.method2612(var6);
			}
		}
	}

	static final void method1336(int var0, int var1, boolean var2) {
		if (field2074[var0] != null) {
			if (var1 >= 0 && var1 < field2074[var0].method1854()) {
				class455 var4 = (class455)field2074[var0].field2738.get(var1);
				class341 var5 = class341.createClientPacket(ClientPacket.field3054, field1891.field4219);
				var5.buffer.writeByte(4 + Buffer.method2535(var4.field3021.method2398()));
				var5.buffer.writeByte(var0);
				var5.buffer.writeShort(var1);
				var5.buffer.writeBoolean(var2);
				var5.buffer.writeString(var4.field3021.method2398());
				field1891.method2612(var5);
			}
		}
	}

	static void method1441(int var0) {
		for (class252 var2 = (class252)field2048.method1753(); null != var2; var2 = (class252)field2048.method1754()) {
			if ((long)var0 == (var2.field2472 >> 48 & 65535L)) {
				var2.method1719();
			}
		}

	}

	static int method1335(class496 var0) {
		class252 var2 = (class252)field2048.get((long)var0.field3603 + ((long)var0.interfaceId << 32));
		return null != var2 ? var2.field1721 : var0.field3597;
	}

	static class496 method1401(class496 var0) {
		int var3 = method1335(var0);
		int var2 = var3 >> 17 & 7;
		int var4 = var2;
		if (var2 == 0) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4; ++var5) {
				var0 = class208.interfaceConfigs.method345(var0.field3544);
				if (null == var0) {
					return null;
				}
			}

			return var0;
		}
	}

	static boolean method1396(class496 var0) {
		return var0.field3545;
	}

	static String method1403(class496 var0, int var1) {
		int var4 = method1335(var0);
		boolean var3 = (var4 >> var1 + 1 & 1) != 0;
		if (!var3 && var0.field3631 == null) {
			return null;
		} else {
			return null != var0.field3605 && var0.field3605.length > var1 && null != var0.field3605[var1] && var0.field3605[var1].trim().length() != 0 ? var0.field3605[var1] : null;
		}
	}

	static String method1364(class496 var0) {
		if (class134.method618(method1335(var0)) == 0) {
			return null;
		} else {
			return var0.field3618 != null && var0.field3618.trim().length() != 0 ? var0.field3618 : null;
		}
	}

	static String method1330(String var0, boolean var1) {
		String var3 = var1 ? "https://" : "http://";
		if (field1842 == 1) {
			var0 = var0 + "-wtrc";
		} else if (field1842 == 2) {
			var0 = var0 + "-wtqa";
		} else if (field1842 == 3) {
			var0 = var0 + "-wtwip";
		} else if (field1842 == 5) {
			var0 = var0 + "-wti";
		} else if (field1842 == 4) {
			var0 = "local";
		}

		String var4 = "";
		if (null != class161.field1165) {
			var4 = "/p=" + class161.field1165;
		}

		String var5 = "runescape.com";
		return var3 + var0 + "." + var5 + "/l=" + class13.field75 + "/a=" + class366.field2540 + var4 + "/";
	}

	static void method1323(String var0) {
		class161.field1165 = var0;

		try {
			String var2 = class190.field1287.getParameter(Integer.toString(18));
			String var3 = class190.field1287.getParameter(Integer.toString(13));
			String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
			String var6;
			if (var0.length() == 0) {
				var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var5 = var4 + "; Expires=";
				long var7 = class38.method108() + 94608000000L;
				class131.field850.setTime(new Date(var7));
				int var9 = class131.field850.get(7);
				int var10 = class131.field850.get(5);
				int var11 = class131.field850.get(2);
				int var12 = class131.field850.get(1);
				int var13 = class131.field850.get(11);
				int var14 = class131.field850.get(12);
				int var15 = class131.field850.get(13);
				var6 = class131.field852[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + class131.field851[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
				var4 = var5 + var6 + "; Max-Age=" + 94608000L;
			}

			Client var17 = class190.field1287;
			var6 = "document.cookie=\"" + var4 + "\"";
			JSObject.getWindow(var17).eval(var6);
		} catch (Throwable var16) {
		}

	}

	static void method1367(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var3 = new short[16];
		int var4 = 0;

		for (int var5 = 0; var5 < class216.field1411; ++var5) {
			class158 var6 = class158.method857(var5);
			if ((!var1 || var6.field1137) && var6.field1133 == -1 && var6.field1095.toLowerCase().indexOf(var0) != -1) {
				if (var4 >= 250) {
					class323.field2340 = -1;
					class524.field4110 = null;
					return;
				}

				if (var4 >= var3.length) {
					short[] var7 = new short[var3.length * 2];

					for (int var8 = 0; var8 < var4; ++var8) {
						var7[var8] = var3[var8];
					}

					var3 = var7;
				}

				var3[var4++] = (short)var5;
			}
		}

		class524.field4110 = var3;
		class254.field1723 = 0;
		class323.field2340 = var4;
		String[] var9 = new String[class323.field2340];

		for (int var10 = 0; var10 < class323.field2340; ++var10) {
			var9[var10] = class158.method857(var3[var10]).field1095;
		}

		class556.method2643(var9, class524.field4110);
	}

	static void method1416(byte[] var0, int var1) {
		if (field2132 == null) {
			field2132 = new byte[24];
		}

		class96.method426(var0, var1, field2132, 0, 24);
	}

	static void method1326(Buffer var0, int var1) {
		method1416(var0.data, var1);
		class258.method1224(var0, var1);
	}

	static void method1449() {
		field1891.method2612(class341.createClientPacket(ClientPacket.field3128, field1891.field4219));
		field1923 = 0;
	}

	static void method1374() {
		if (field1923 == 1) {
			field1931 = true;
		}

	}

	static String method1327(String var0) {
		class435[] var2 = class435.method1985();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class435 var4 = var2[var3];
			if (var4.field2928 != -1 && var0.startsWith(class274.method1267(var4.field2928))) {
				var0 = var0.substring(6 + Integer.toString(var4.field2928).length());
				break;
			}
		}

		return var0;
	}

	static void method1338() {
		if (class76.field535 != null) {
			field2126 = field1846;
			class76.field535.method1508();

			for (int var1 = 0; var1 < field2037.length; ++var1) {
				if (field2037[var1] != null) {
					class76.field535.method1507((field2037[var1].field368 >> 7) + class80.selectedTileX, class425.selectedTileXYIdk + (field2037[var1].field329 >> 7));
				}
			}
		}

	}

	static void method1410() {
		class109.field693.method451(field2029);
	}

	static void method1448(int var0) {
		if (loginState != var0) {
			loginState = var0;
		}
	}

	static void method1428(boolean var0) {
		field2057 = var0;
	}

	static class308 method1317(int var0) {
		class308 var2 = (class308)field2123.method1678((long)var0);
		if (null == var2) {
			var2 = new class308(class253.field1722, class427.method1947(var0), class451.method2112(var0));
			field2123.method1680(var2, (long)var0);
		}

		return var2;
	}

	static class308 method1399(int var0) {
		class308 var2 = (class308)field2002.method1678((long)var0);
		if (var2 == null) {
			var2 = new class308(class253.field1722, var0);
		}

		return var2;
	}

	static void method1454(int var0) {
		class116 var2 = class116.method539(var0);
		if (var2.method533()) {
			int var4 = var2.field729;
			class19 var6 = (class19)class116.field728.method1678((long)var4);
			class19 var5;
			if (var6 != null) {
				var5 = var6;
			} else {
				class5 var8 = class116.field723;
				class5 var9 = class116.field725;
				boolean var10 = true;
				byte[] var11 = var8.method37(var4 >> 16 & 65535, var4 & 65535);
				class19 var7;
				if (var11 == null) {
					var10 = false;
					var7 = null;
				} else {
					int var12 = (var11[1] & 255) << 8 | var11[2] & 255;
					byte[] var13 = var9.method37(var12, 0);
					if (var13 == null) {
						var10 = false;
					}

					if (!var10) {
						var7 = null;
					} else {
						if (class209.field1389 == null) {
							class217.field1414 = Runtime.getRuntime().availableProcessors();
							class209.field1389 = new ThreadPoolExecutor(0, class217.field1414, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + class217.field1414 * 100), new class489());
						}

						try {
							var7 = new class19(var8, var9, var4, false);
						} catch (Exception var15) {
							var7 = null;
						}
					}
				}

				if (var7 != null) {
					class116.field728.method1680(var7, (long)var4);
				}

				var5 = var7;
			}

			int var3;
			if (null == var5) {
				var3 = 2;
			} else {
				var3 = var5.method79() ? 0 : 1;
			}

			if (var3 == 2) {
				field2127.add(var2.field729);
			}

		}
	}

	static class140 method1312() {
		return class28.field143;
	}
}
