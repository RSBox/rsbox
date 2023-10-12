import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class152 {
	ExecutorService field1056;
	Future field1054;
	final class295 field1053;
	final Buffer field1055;

	public class152(Buffer var1, class295 var2) {
		this.field1056 = Executors.newSingleThreadExecutor();
		this.field1055 = var1;
		this.field1053 = var2;
		this.method815();
	}

	public boolean method812() {
		return this.field1054.isDone();
	}

	public void method813() {
		this.field1056.shutdown();
		this.field1056 = null;
	}

	public Buffer method814() {
		try {
			return (Buffer)this.field1054.get();
		} catch (Exception var3) {
			return null;
		}
	}

	void method815() {
		this.field1054 = this.field1056.submit(new class20(this, this.field1055, this.field1053));
	}
}
