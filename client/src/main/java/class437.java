public class class437 {
	boolean field2940;
	class5 field2938;
	int field2937;
	String field2939;

	class437(class5 var1) {
		this.field2937 = 0;
		this.field2940 = false;
		this.field2938 = var1;
	}

	void method1989(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			if (var1 != this.field2939) {
				this.field2939 = var1;
				this.field2937 = 0;
				this.field2940 = false;
				this.method1986();
			}
		}
	}

	int method1986() {
		if (null == this.field2939) {
			this.field2937 = 100;
			this.field2940 = true;
		} else {
			if (this.field2937 < 33) {
				if (!this.field2938.method30(class31.field152.field153, this.field2939)) {
					return this.field2937;
				}

				this.field2937 = 33;
			}

			if (this.field2937 == 33) {
				if (this.field2938.method33(class31.field151.field153, this.field2939) && !this.field2938.method30(class31.field151.field153, this.field2939)) {
					return this.field2937;
				}

				this.field2937 = 66;
			}

			if (this.field2937 == 66) {
				if (!this.field2938.method30(this.field2939, class31.field155.field153)) {
					return this.field2937;
				}

				this.field2937 = 100;
				this.field2940 = true;
			}
		}

		return this.field2937;
	}

	boolean method1988() {
		return this.field2940;
	}

	int method1987() {
		return this.field2937;
	}
}
