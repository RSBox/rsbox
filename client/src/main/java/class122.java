import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

class class122 implements SSLSession {
	static int field794;
	// $FF: synthetic field
	final class81 this$1;

	class122(class81 var1) {
		this.this$1 = var1;
	}

	@Override
	public int getApplicationBufferSize() {
		return 0;
	}

	@Override
	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	@Override
	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	@Override
	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	@Override
	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	@Override
	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	@Override
	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field551;
	}

	@Override
	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getPeerPort() {
		return 0;
	}

	@Override
	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	@Override
	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	@Override
	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}
}
