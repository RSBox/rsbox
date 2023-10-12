import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

class class81 extends SSLSocket {
	Certificate[] field551;
	// $FF: synthetic field
	final class30 this$0;
	// $FF: synthetic field
	final String val$host;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;

	class81(class30 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	@Override
	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	@Override
	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	@Override
	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@Override
	public boolean getEnableSessionCreation() {
		return false;
	}

	@Override
	public String[] getEnabledCipherSuites() {
		return null;
	}

	@Override
	public String[] getEnabledProtocols() {
		return null;
	}

	@Override
	public boolean getNeedClientAuth() {
		return false;
	}

	@Override
	public SSLSession getSession() {
		return new class122(this);
	}

	@Override
	public String[] getSupportedProtocols() {
		return null;
	}

	@Override
	public String[] getSupportedCipherSuites() {
		return null;
	}

	@Override
	public boolean getUseClientMode() {
		return false;
	}

	@Override
	public boolean getWantClientAuth() {
		return false;
	}

	@Override
	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@Override
	public void setEnableSessionCreation(boolean var1) {
	}

	@Override
	public void setEnabledCipherSuites(String[] var1) {
	}

	@Override
	public void setEnabledProtocols(String[] var1) {
	}

	@Override
	public void setNeedClientAuth(boolean var1) {
	}

	@Override
	public void setUseClientMode(boolean var1) {
	}

	@Override
	public void setWantClientAuth(boolean var1) {
	}

	@Override
	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class318(this));
	}
}
