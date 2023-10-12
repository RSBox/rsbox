import java.math.BigInteger;

public class Buffer extends class359 {
	static int[] field4122;
	static long[] field4123;
	public byte[] data;
	public int offset;

	static {
		field4122 = new int[256];

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var0 = var1;

			for (var2 = 0; var2 < 8; ++var2) {
				if ((var0 & 1) == 1) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}

			field4122[var1] = var0;
		}

		field4123 = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var4 & 1L) == 1L) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			field4123[var2] = var4;
		}

	}

	public Buffer(int size) {
		this.data = class150.alloc(size);
		this.offset = 0;
	}

	public Buffer(int var1, boolean var2) {
		this.data = class150.method798(var1, var2);
	}

	public Buffer(byte[] var1) {
		this.data = var1;
		this.offset = 0;
	}

	public void method2457() {
		if (this.data != null) {
			class150.method799(this.data);
		}

		this.data = null;
	}

	public void writeByte(int var1) {
		this.data[++this.offset - 1] = (byte)var1;
	}

	public void writeShort(int var1) {
		this.data[++this.offset - 1] = (byte)(var1 >> 8);
		this.data[++this.offset - 1] = (byte)var1;
	}

	public void writeMedium(int var1) {
		this.data[++this.offset - 1] = (byte)(var1 >> 16);
		this.data[++this.offset - 1] = (byte)(var1 >> 8);
		this.data[++this.offset - 1] = (byte)var1;
	}

	public void writeInt(int var1) {
		this.data[++this.offset - 1] = (byte)(var1 >> 24);
		this.data[++this.offset - 1] = (byte)(var1 >> 16);
		this.data[++this.offset - 1] = (byte)(var1 >> 8);
		this.data[++this.offset - 1] = (byte)var1;
	}

	public void write48BitLong(long var1) {
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.data[++this.offset - 1] = (byte)((int)var1);
	}

	public void writeLong(long var1) {
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 56));
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 48));
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.data[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.data[++this.offset - 1] = (byte)((int)var1);
	}

	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	public void writeString(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += class88.method410(var1, 0, var1.length(), this.data, this.offset);
			this.data[++this.offset - 1] = 0;
		}
	}

	public void writeJagexString(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.data[++this.offset - 1] = 0;
			this.offset += class88.method410(var1, 0, var1.length(), this.data, this.offset);
			this.data[++this.offset - 1] = 0;
		}
	}

	public void writeStringCESU8(CharSequence var1) {
		int var4 = var1.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var1.charAt(var6);
			if (var7 <= 127) {
				++var5;
			} else if (var7 <= 2047) {
				var5 += 2;
			} else {
				var5 += 3;
			}
		}

		this.data[++this.offset - 1] = 0;
		this.method2471(var5);
		this.offset += class206.method974(this.data, this.offset, var1);
	}

	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < 0 + var3; ++var5) {
			this.data[++this.offset - 1] = var1[var5];
		}

	}

	public void writeBuffer(Buffer var1) {
		this.writeBytes(var1.data, 0, var1.offset);
	}

	public void writeLengthInt(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.data[this.offset - var1 - 4] = (byte)(var1 >> 24);
			this.data[this.offset - var1 - 3] = (byte)(var1 >> 16);
			this.data[this.offset - var1 - 2] = (byte)(var1 >> 8);
			this.data[this.offset - var1 - 1] = (byte)var1;
		}
	}

	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.data[this.offset - var1 - 2] = (byte)(var1 >> 8);
			this.data[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void writeLengthBytes(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.data[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.writeByte(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.writeShort(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method2471(int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128);
				}

				this.writeByte(var1 >>> 14 | 128);
			}

			this.writeByte(var1 >>> 7 | 128);
		}

		this.writeByte(var1 & 127);
	}

	public int readUnsignedByte() {
		return this.data[++this.offset - 1] & 255;
	}

	public byte readByte() {
		return this.data[++this.offset - 1];
	}

	public int readUnsignedShort() {
		this.offset += 2;
		return ((this.data[this.offset - 2] & 255) << 8) + (this.data[this.offset - 1] & 255);
	}

	public int readShort() {
		this.offset += 2;
		int var2 = ((this.data[this.offset - 2] & 255) << 8) + (this.data[this.offset - 1] & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int readUnsignedMedium() {
		this.offset += 3;
		return (this.data[this.offset - 1] & 255) + ((this.data[this.offset - 2] & 255) << 8) + ((this.data[this.offset - 3] & 255) << 16);
	}

	public int readMedium() {
		this.offset += 3;
		int var2 = (this.data[this.offset - 1] & 255) + ((this.data[this.offset - 2] & 255) << 8) + ((this.data[this.offset - 3] & 255) << 16);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public int readInt() {
		this.offset += 4;
		return (this.data[this.offset - 1] & 255) + ((this.data[this.offset - 3] & 255) << 16) + ((this.data[this.offset - 4] & 255) << 24) + ((this.data[this.offset - 2] & 255) << 8);
	}

	public long readLong() {
		long var2 = (long)this.readInt() & 4294967295L;
		long var4 = (long)this.readInt() & 4294967295L;
		return (var2 << 32) + var4;
	}

	public float method2474() {
		return Float.intBitsToFloat(this.readInt());
	}

	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	public String readString() {
		if (this.data[this.offset] == 0) {
			++this.offset;
			return null;
		} else {
			return this.readStringOrNull();
		}
	}

	public String readStringOrNull() {
		int var2 = this.offset;

		while (this.data[++this.offset - 1] != 0) {
		}

		int var3 = this.offset - var2 - 1;
		return var3 == 0 ? "" : class88.method411(this.data, var2, var3);
	}

	public String readJagexString() {
		byte var2 = this.data[++this.offset - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.offset;

			while (this.data[++this.offset - 1] != 0) {
			}

			int var4 = this.offset - var3 - 1;
			return var4 == 0 ? "" : class88.method411(this.data, var3, var4);
		}
	}

	public String method2478() {
		byte var2 = this.data[++this.offset - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.method2521();
			if (var3 + this.offset > this.data.length) {
				throw new IllegalStateException("");
			} else {
				String var4 = class206.method973(this.data, this.offset, var3);
				this.offset += var3;
				return var4;
			}
		}
	}

	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < 0 + var3; ++var5) {
			var1[var5] = this.data[++this.offset - 1];
		}

	}

	public int method2517() {
		int var2 = this.data[this.offset] & 255;
		return var2 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	public int method2522() {
		int var2 = this.data[this.offset] & 255;
		return var2 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	public int method2480() {
		int var2 = this.data[this.offset] & 255;
		return var2 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769;
	}

	public int method2516() {
		int var2 = 0;

		int var3;
		for (var3 = this.method2522(); var3 == 32767; var3 = this.method2522()) {
			var2 += 32767;
		}

		var2 += var3;
		return var2;
	}

	public int method2481() {
		return this.data[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	public int method2482() {
		if (this.data[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var2 = this.readUnsignedShort();
			return var2 == 32767 ? -1 : var2;
		}
	}

	public int method2521() {
		byte var2 = this.data[++this.offset - 1];

		int var3;
		for (var3 = 0; var2 < 0; var2 = this.data[++this.offset - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}

		return var3 | var2;
	}

	public int method2483(byte var1) {
		int var3 = 0;
		int var4 = 0;

		int var2;
		do {
			var2 = this.readUnsignedByte();
			var3 |= (var2 & 127) << var4;
			var4 += 7;
		} while(var2 > 127);

		return var3;
	}

	public void encryptXteaAll(int[] var1) {
		int var3 = this.offset / 8;
		this.offset = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.readInt();
			int var6 = this.readInt();
			int var7 = 0;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
				var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var1[var7 & 3] + var7;
				var7 += -1640531527;
			}

			this.offset -= 8;
			this.writeInt(var5);
			this.writeInt(var6);
		}

	}

	public void decryptXteaAll(int[] var1) {
		int var3 = this.offset / 8;
		this.offset = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.readInt();
			int var6 = this.readInt();
			int var7 = -957401312;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3]) {
				var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3];
				var7 -= -1640531527;
			}

			this.offset -= 8;
			this.writeInt(var5);
			this.writeInt(var6);
		}

	}

	public void encryptXtea(int[] var1, int var2, int var3) {
		int var5 = this.offset;
		this.offset = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.readInt();
			int var9 = this.readInt();
			int var10 = 0;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10) {
				var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3];
				var10 += -1640531527;
			}

			this.offset -= 8;
			this.writeInt(var8);
			this.writeInt(var9);
		}

		this.offset = var5;
	}

	public void decryptXtea(int[] var1, int var2, int var3) {
		int var5 = this.offset;
		this.offset = 5;
		int var6 = (var3 - 5) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.readInt();
			int var9 = this.readInt();
			int var10 = -957401312;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
				var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + var1[var10 >>> 11 & 3];
				var10 -= -1640531527;
			}

			this.offset -= 8;
			this.writeInt(var8);
			this.writeInt(var9);
		}

		this.offset = var5;
	}

	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var4 = this.offset;
		this.offset = 0;
		byte[] var5 = new byte[var4];
		this.readBytes(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		this.offset = 0;
		this.writeShort(var8.length);
		this.writeBytes(var8, 0, var8.length);
	}

	public int writeCrc(int var1) {
		int var3 = method2534(this.data, var1, this.offset);
		this.writeInt(var3);
		return var3;
	}

	public boolean checkCrc() {
		this.offset -= 4;
		int var2 = method2534(this.data, 0, this.offset);
		int var3 = this.readInt();
		return var2 == var3;
	}

	public void writeByteADD(int var1) {
		this.data[++this.offset - 1] = (byte)(var1 + 128);
	}

	public void writeByteNEG(int var1) {
		this.data[++this.offset - 1] = (byte)(0 - var1);
	}

	public void writeByteSUB(int var1) {
		this.data[++this.offset - 1] = (byte)(128 - var1);
	}

	public int readUnsignedByteADD() {
		return this.data[++this.offset - 1] - 128 & 255;
	}

	public int readUnsignedByteNEG() {
		return 0 - this.data[++this.offset - 1] & 255;
	}

	public int readUnsignedByteSUB() {
		return 128 - this.data[++this.offset - 1] & 255;
	}

	public byte readByteADD() {
		return (byte)(this.data[++this.offset - 1] - 128);
	}

	public byte readByteNEG() {
		return (byte)(0 - this.data[++this.offset - 1]);
	}

	public byte readByteSUB() {
		return (byte)(128 - this.data[++this.offset - 1]);
	}

	public void writeShortLE(int var1) {
		this.data[++this.offset - 1] = (byte)var1;
		this.data[++this.offset - 1] = (byte)(var1 >> 8);
	}

	public void writeShortADD(int var1) {
		this.data[++this.offset - 1] = (byte)(var1 >> 8);
		this.data[++this.offset - 1] = (byte)(var1 + 128);
	}

	public void writeShortLEADD(int var1) {
		this.data[++this.offset - 1] = (byte)(var1 + 128);
		this.data[++this.offset - 1] = (byte)(var1 >> 8);
	}

	public int readUnsignedShortLE() {
		this.offset += 2;
		return (this.data[this.offset - 2] & 255) + ((this.data[this.offset - 1] & 255) << 8);
	}

	public int readUnsignedShortADD() {
		this.offset += 2;
		return ((this.data[this.offset - 2] & 255) << 8) + (this.data[this.offset - 1] - 128 & 255);
	}

	public int readUnsignedShortLEADD() {
		this.offset += 2;
		return (this.data[this.offset - 2] - 128 & 255) + ((this.data[this.offset - 1] & 255) << 8);
	}

	public int method2527() {
		this.offset += 2;
		int var2 = ((this.data[this.offset - 1] & 255) << 8) + (this.data[this.offset - 2] & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method2501() {
		this.offset += 2;
		int var2 = ((this.data[this.offset - 2] & 255) << 8) + (this.data[this.offset - 1] - 128 & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method2514() {
		this.offset += 2;
		int var2 = ((this.data[this.offset - 1] & 255) << 8) + (this.data[this.offset - 2] - 128 & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public void method2525(int var1) {
		this.data[++this.offset - 1] = (byte)(var1 >> 16);
		this.data[++this.offset - 1] = (byte)var1;
		this.data[++this.offset - 1] = (byte)(var1 >> 8);
	}

	public int method2503() {
		this.offset += 3;
		return (this.data[this.offset - 3] & 255) + ((this.data[this.offset - 2] & 255) << 8) + ((this.data[this.offset - 1] & 255) << 16);
	}

	public int method2504() {
		this.offset += 3;
		return ((this.data[this.offset - 3] & 255) << 8) + ((this.data[this.offset - 2] & 255) << 16) + (this.data[this.offset - 1] & 255);
	}

	public int method2505() {
		this.offset += 3;
		int var2 = ((this.data[this.offset - 3] & 255) << 16) + ((this.data[this.offset - 1] & 255) << 8) + (this.data[this.offset - 2] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public int method2506() {
		this.offset += 3;
		int var2 = ((this.data[this.offset - 2] & 255) << 16) + ((this.data[this.offset - 3] & 255) << 8) + (this.data[this.offset - 1] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public void writeIntLE(int var1) {
		this.data[++this.offset - 1] = (byte)var1;
		this.data[++this.offset - 1] = (byte)(var1 >> 8);
		this.data[++this.offset - 1] = (byte)(var1 >> 16);
		this.data[++this.offset - 1] = (byte)(var1 >> 24);
	}

	public void writeIntME(int var1) {
		this.data[++this.offset - 1] = (byte)(var1 >> 8);
		this.data[++this.offset - 1] = (byte)var1;
		this.data[++this.offset - 1] = (byte)(var1 >> 24);
		this.data[++this.offset - 1] = (byte)(var1 >> 16);
	}

	public void writeIntIME(int var1) {
		this.data[++this.offset - 1] = (byte)(var1 >> 16);
		this.data[++this.offset - 1] = (byte)(var1 >> 24);
		this.data[++this.offset - 1] = (byte)var1;
		this.data[++this.offset - 1] = (byte)(var1 >> 8);
	}

	// 4321
	public int readUnsignedIntLE() {
		this.offset += 4;
		return ((this.data[this.offset - 1] & 255) << 24) + ((this.data[this.offset - 2] & 255) << 16) + ((this.data[this.offset - 3] & 255) << 8) + (this.data[this.offset - 4] & 255);
	}

	// 3412
	public int readUnsignedIntME() {
		this.offset += 4;
		return (this.data[this.offset - 3] & 255) + ((this.data[this.offset - 2] & 255) << 24) + ((this.data[this.offset - 1] & 255) << 16) + ((this.data[this.offset - 4] & 255) << 8);
	}

	// 2143
	public int readUnsignedIntIME() {
		this.offset += 4;
		return (this.data[this.offset - 2] & 255) + ((this.data[this.offset - 1] & 255) << 8) + ((this.data[this.offset - 3] & 255) << 24) + ((this.data[this.offset - 4] & 255) << 16);
	}

	public void readBytesReversed(byte[] var1, int var2, int var3) {
		for (int var5 = 0 + var3 - 1; var5 >= 0; --var5) {
			var1[var5] = this.data[++this.offset - 1];
		}

	}

	public void readBytesADD(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < var3 + 0; ++var5) {
			var1[var5] = (byte)(this.data[++this.offset - 1] - 128);
		}

	}

	public static int method2534(byte[] var0, int var1, int var2) {
		int var4 = -1;

		for (int var5 = var1; var5 < var2; ++var5) {
			var4 = var4 >>> 8 ^ field4122[(var4 ^ var0[var5]) & 255];
		}

		var4 = ~var4;
		return var4;
	}

	public static int method2535(String var0) {
		return var0.length() + 1;
	}
}
