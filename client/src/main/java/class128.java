import java.math.BigInteger;

public class class128 {
	static final BigInteger field832;
	static final BigInteger field833;

	static {
		field832 = new BigInteger("10001", 16);
		field833 = new BigInteger(ClientLauncher.INSTANCE.getRSA_MODULUS(), 16);
	}
}
