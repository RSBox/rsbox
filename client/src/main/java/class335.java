public class class335 extends class362 {
	boolean field2379;
	int field2369;
	int field2370;
	int field2371;
	int field2372;
	int field2373;
	int field2374;
	int field2375;
	int field2376;
	int field2377;
	int field2378;
	int field2380;
	int field2381;
	int field2382;
	int field2383;

	class335(class7 var1, int var2, int var3) {
		super.field2483 = var1;
		this.field2377 = var1.field33;
		this.field2371 = var1.field32;
		this.field2379 = var1.field36;
		this.field2370 = var2;
		this.field2380 = var3;
		this.field2372 = 8192;
		this.field2369 = 0;
		this.method1606();
	}

	class335(class7 var1, int var2, int var3, int var4) {
		super.field2483 = var1;
		this.field2377 = var1.field33;
		this.field2371 = var1.field32;
		this.field2379 = var1.field36;
		this.field2370 = var2;
		this.field2380 = var3;
		this.field2372 = var4;
		this.field2369 = 0;
		this.method1606();
	}

	@Override
	int method1722() {
		int var1 = this.field2373 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.field2376 == 0) {
			var1 -= var1 * this.field2369 / (((class7)super.field2483).field35.length << 8);
		} else if (this.field2376 >= 0) {
			var1 -= var1 * this.field2377 / ((class7)super.field2483).field35.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	void method1606() {
		this.field2373 = this.field2380;
		this.field2374 = method1645(this.field2380, this.field2372);
		this.field2375 = method1647(this.field2380, this.field2372);
	}

	public synchronized void method1623(int var1) {
		this.field2376 = var1;
	}

	public synchronized void method1607(int var1) {
		this.method1646(var1 << 6, this.method1634());
	}

	synchronized void method1608(int var1) {
		this.method1646(0, this.method1634());
	}

	synchronized void method1646(int var1, int var2) {
		this.field2380 = var1;
		this.field2372 = var2;
		this.field2378 = 0;
		this.method1606();
	}

	public synchronized int method1610() {
		return this.field2380 == Integer.MIN_VALUE ? 0 : this.field2380;
	}

	public synchronized int method1634() {
		return this.field2372 < 0 ? -1 : this.field2372;
	}

	public synchronized void method1611(int var1) {
		int var2 = ((class7)super.field2483).field35.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field2369 = var1;
	}

	public synchronized void method1612(boolean var1) {
		this.field2370 = (this.field2370 ^ this.field2370 >> 31) + (this.field2370 >>> 31);
		this.field2370 = -this.field2370;
	}

	void method1624() {
		if (this.field2378 != 0) {
			if (this.field2380 == Integer.MIN_VALUE) {
				this.field2380 = 0;
			}

			this.field2378 = 0;
			this.method1606();
		}

	}

	public synchronized void method1613(int var1, int var2) {
		this.method1614(var1, var2, this.method1634());
	}

	public synchronized void method1614(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method1646(var2, var3);
		} else {
			int var4 = method1645(var2, var3);
			int var5 = method1647(var2, var3);
			if (this.field2374 == var4 && this.field2375 == var5) {
				this.field2378 = 0;
			} else {
				int var6 = var2 - this.field2373;
				if (this.field2373 - var2 > var6) {
					var6 = this.field2373 - var2;
				}

				if (var4 - this.field2374 > var6) {
					var6 = var4 - this.field2374;
				}

				if (this.field2374 - var4 > var6) {
					var6 = this.field2374 - var4;
				}

				if (var5 - this.field2375 > var6) {
					var6 = var5 - this.field2375;
				}

				if (this.field2375 - var5 > var6) {
					var6 = this.field2375 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field2378 = var1;
				this.field2380 = var2;
				this.field2372 = var3;
				this.field2381 = (var2 - this.field2373) / var1;
				this.field2382 = (var4 - this.field2374) / var1;
				this.field2383 = (var5 - this.field2375) / var1;
			}
		}
	}

	public synchronized void method1615(int var1) {
		if (var1 == 0) {
			this.method1608(0);
			this.method1719();
		} else if (this.field2374 == 0 && this.field2375 == 0) {
			this.field2378 = 0;
			this.field2380 = 0;
			this.field2373 = 0;
			this.method1719();
		} else {
			int var2 = -this.field2373;
			if (this.field2373 > var2) {
				var2 = this.field2373;
			}

			if (-this.field2374 > var2) {
				var2 = -this.field2374;
			}

			if (this.field2374 > var2) {
				var2 = this.field2374;
			}

			if (-this.field2375 > var2) {
				var2 = -this.field2375;
			}

			if (this.field2375 > var2) {
				var2 = this.field2375;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field2378 = var1;
			this.field2380 = Integer.MIN_VALUE;
			this.field2381 = -this.field2373 / var1;
			this.field2382 = -this.field2374 / var1;
			this.field2383 = -this.field2375 / var1;
		}
	}

	public synchronized void method1616(int var1) {
		if (this.field2370 < 0) {
			this.field2370 = -var1;
		} else {
			this.field2370 = var1;
		}

	}

	public synchronized int method1617() {
		return this.field2370 < 0 ? -this.field2370 : this.field2370;
	}

	public boolean method1618() {
		return this.field2369 < 0 || this.field2369 >= ((class7)super.field2483).field35.length << 8;
	}

	public boolean method1626() {
		return this.field2378 != 0;
	}

	@Override
	protected class362 method1727() {
		return null;
	}

	@Override
	protected class362 method1728() {
		return null;
	}

	@Override
	protected int method1723() {
		return this.field2380 == 0 && this.field2378 == 0 ? 0 : 1;
	}

	@Override
	public synchronized void method1725(int[] var1, int var2, int var3) {
		if (this.field2380 == 0 && this.field2378 == 0) {
			this.method1726(var3);
		} else {
			class7 var4 = (class7)super.field2483;
			int var5 = this.field2377 << 8;
			int var6 = this.field2371 << 8;
			int var7 = var4.field35.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.field2376 = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field2369 < 0) {
				if (this.field2370 <= 0) {
					this.method1624();
					this.method1719();
					return;
				}

				this.field2369 = 0;
			}

			if (this.field2369 >= var7) {
				if (this.field2370 >= 0) {
					this.method1624();
					this.method1719();
					return;
				}

				this.field2369 = var7 - 1;
			}

			if (this.field2376 < 0) {
				if (this.field2379) {
					if (this.field2370 < 0) {
						var9 = this.method1648(var1, var2, var5, var3, var4.field35[this.field2377]);
						if (this.field2369 >= var5) {
							return;
						}

						this.field2369 = var5 + var5 - 1 - this.field2369;
						this.field2370 = -this.field2370;
					}

					while (true) {
						var9 = this.method1641(var1, var9, var6, var3, var4.field35[this.field2371 - 1]);
						if (this.field2369 < var6) {
							return;
						}

						this.field2369 = var6 + var6 - 1 - this.field2369;
						this.field2370 = -this.field2370;
						var9 = this.method1648(var1, var9, var5, var3, var4.field35[this.field2377]);
						if (this.field2369 >= var5) {
							return;
						}

						this.field2369 = var5 + var5 - 1 - this.field2369;
						this.field2370 = -this.field2370;
					}
				} else if (this.field2370 < 0) {
					while (true) {
						var9 = this.method1648(var1, var9, var5, var3, var4.field35[this.field2371 - 1]);
						if (this.field2369 >= var5) {
							return;
						}

						this.field2369 = var6 - 1 - (var6 - 1 - this.field2369) % var8;
					}
				} else {
					while (true) {
						var9 = this.method1641(var1, var9, var6, var3, var4.field35[this.field2377]);
						if (this.field2369 < var6) {
							return;
						}

						this.field2369 = var5 + (this.field2369 - var5) % var8;
					}
				}
			} else {
				if (this.field2376 > 0) {
					if (this.field2379) {
						label130: {
							if (this.field2370 < 0) {
								var9 = this.method1648(var1, var2, var5, var3, var4.field35[this.field2377]);
								if (this.field2369 >= var5) {
									return;
								}

								this.field2369 = var5 + var5 - 1 - this.field2369;
								this.field2370 = -this.field2370;
								if (--this.field2376 == 0) {
									break label130;
								}
							}

							do {
								var9 = this.method1641(var1, var9, var6, var3, var4.field35[this.field2371 - 1]);
								if (this.field2369 < var6) {
									return;
								}

								this.field2369 = var6 + var6 - 1 - this.field2369;
								this.field2370 = -this.field2370;
								if (--this.field2376 == 0) {
									break;
								}

								var9 = this.method1648(var1, var9, var5, var3, var4.field35[this.field2377]);
								if (this.field2369 >= var5) {
									return;
								}

								this.field2369 = var5 + var5 - 1 - this.field2369;
								this.field2370 = -this.field2370;
							} while(--this.field2376 != 0);
						}
					} else {
						int var10;
						if (this.field2370 < 0) {
							while (true) {
								var9 = this.method1648(var1, var9, var5, var3, var4.field35[this.field2371 - 1]);
								if (this.field2369 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field2369) / var8;
								if (var10 >= this.field2376) {
									this.field2369 += var8 * this.field2376;
									this.field2376 = 0;
									break;
								}

								this.field2369 += var8 * var10;
								this.field2376 -= var10;
							}
						} else {
							while (true) {
								var9 = this.method1641(var1, var9, var6, var3, var4.field35[this.field2377]);
								if (this.field2369 < var6) {
									return;
								}

								var10 = (this.field2369 - var5) / var8;
								if (var10 >= this.field2376) {
									this.field2369 -= var8 * this.field2376;
									this.field2376 = 0;
									break;
								}

								this.field2369 -= var8 * var10;
								this.field2376 -= var10;
							}
						}
					}
				}

				if (this.field2370 < 0) {
					this.method1648(var1, var9, 0, var3, 0);
					if (this.field2369 < 0) {
						this.field2369 = -1;
						this.method1624();
						this.method1719();
					}
				} else {
					this.method1641(var1, var9, var7, var3, 0);
					if (this.field2369 >= var7) {
						this.field2369 = var7;
						this.method1624();
						this.method1719();
					}
				}

			}
		}
	}

	@Override
	public synchronized void method1726(int var1) {
		if (this.field2378 > 0) {
			if (var1 >= this.field2378) {
				if (this.field2380 == Integer.MIN_VALUE) {
					this.field2380 = 0;
					this.field2375 = 0;
					this.field2374 = 0;
					this.field2373 = 0;
					this.method1719();
					var1 = this.field2378;
				}

				this.field2378 = 0;
				this.method1606();
			} else {
				this.field2373 += this.field2381 * var1;
				this.field2374 += this.field2382 * var1;
				this.field2375 += this.field2383 * var1;
				this.field2378 -= var1;
			}
		}

		class7 var2 = (class7)super.field2483;
		int var3 = this.field2377 << 8;
		int var4 = this.field2371 << 8;
		int var5 = var2.field35.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field2376 = 0;
		}

		if (this.field2369 < 0) {
			if (this.field2370 <= 0) {
				this.method1624();
				this.method1719();
				return;
			}

			this.field2369 = 0;
		}

		if (this.field2369 >= var5) {
			if (this.field2370 >= 0) {
				this.method1624();
				this.method1719();
				return;
			}

			this.field2369 = var5 - 1;
		}

		this.field2369 += this.field2370 * var1;
		if (this.field2376 < 0) {
			if (!this.field2379) {
				if (this.field2370 < 0) {
					if (this.field2369 >= var3) {
						return;
					}

					this.field2369 = var4 - 1 - (var4 - 1 - this.field2369) % var6;
				} else {
					if (this.field2369 < var4) {
						return;
					}

					this.field2369 = var3 + (this.field2369 - var3) % var6;
				}

			} else {
				if (this.field2370 < 0) {
					if (this.field2369 >= var3) {
						return;
					}

					this.field2369 = var3 + var3 - 1 - this.field2369;
					this.field2370 = -this.field2370;
				}

				while (this.field2369 >= var4) {
					this.field2369 = var4 + var4 - 1 - this.field2369;
					this.field2370 = -this.field2370;
					if (this.field2369 >= var3) {
						return;
					}

					this.field2369 = var3 + var3 - 1 - this.field2369;
					this.field2370 = -this.field2370;
				}

			}
		} else {
			if (this.field2376 > 0) {
				if (this.field2379) {
					label121: {
						if (this.field2370 < 0) {
							if (this.field2369 >= var3) {
								return;
							}

							this.field2369 = var3 + var3 - 1 - this.field2369;
							this.field2370 = -this.field2370;
							if (--this.field2376 == 0) {
								break label121;
							}
						}

						do {
							if (this.field2369 < var4) {
								return;
							}

							this.field2369 = var4 + var4 - 1 - this.field2369;
							this.field2370 = -this.field2370;
							if (--this.field2376 == 0) {
								break;
							}

							if (this.field2369 >= var3) {
								return;
							}

							this.field2369 = var3 + var3 - 1 - this.field2369;
							this.field2370 = -this.field2370;
						} while(--this.field2376 != 0);
					}
				} else {
					label153: {
						int var7;
						if (this.field2370 < 0) {
							if (this.field2369 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field2369) / var6;
							if (var7 >= this.field2376) {
								this.field2369 += var6 * this.field2376;
								this.field2376 = 0;
								break label153;
							}

							this.field2369 += var6 * var7;
							this.field2376 -= var7;
						} else {
							if (this.field2369 < var4) {
								return;
							}

							var7 = (this.field2369 - var3) / var6;
							if (var7 >= this.field2376) {
								this.field2369 -= var6 * this.field2376;
								this.field2376 = 0;
								break label153;
							}

							this.field2369 -= var6 * var7;
							this.field2376 -= var7;
						}

						return;
					}
				}
			}

			if (this.field2370 < 0) {
				if (this.field2369 < 0) {
					this.field2369 = -1;
					this.method1624();
					this.method1719();
				}
			} else if (this.field2369 >= var5) {
				this.field2369 = var5;
				this.method1624();
				this.method1719();
			}

		}
	}

	int method1641(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field2378 > 0) {
				int var6 = var2 + this.field2378;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field2378 += var2;
				if (this.field2370 == 256 && (this.field2369 & 255) == 0) {
					if (class107.field681) {
						var2 = method1631(0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2374, this.field2375, this.field2382, this.field2383, 0, var6, var3, this);
					} else {
						var2 = method1637(((class7)super.field2483).field35, var1, this.field2369, var2, this.field2373, this.field2381, 0, var6, var3, this);
					}
				} else if (class107.field681) {
					var2 = method1644(0, 0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2374, this.field2375, this.field2382, this.field2383, 0, var6, var3, this, this.field2370, var5);
				} else {
					var2 = method1636(0, 0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2373, this.field2381, 0, var6, var3, this, this.field2370, var5);
				}

				this.field2378 -= var2;
				if (this.field2378 != 0) {
					return var2;
				}

				if (!this.method1609()) {
					continue;
				}

				return var4;
			}

			if (this.field2370 == 256 && (this.field2369 & 255) == 0) {
				if (class107.field681) {
					return method1649(0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2374, this.field2375, 0, var4, var3, this);
				}

				return method1625(((class7)super.field2483).field35, var1, this.field2369, var2, this.field2373, 0, var4, var3, this);
			}

			if (class107.field681) {
				return method1639(0, 0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2374, this.field2375, 0, var4, var3, this, this.field2370, var5);
			}

			return method1628(0, 0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2373, 0, var4, var3, this, this.field2370, var5);
		}
	}

	int method1648(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field2378 > 0) {
				int var6 = var2 + this.field2378;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field2378 += var2;
				if (this.field2370 == -256 && (this.field2369 & 255) == 0) {
					if (class107.field681) {
						var2 = method1632(0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2374, this.field2375, this.field2382, this.field2383, 0, var6, var3, this);
					} else {
						var2 = method1635(((class7)super.field2483).field35, var1, this.field2369, var2, this.field2373, this.field2381, 0, var6, var3, this);
					}
				} else if (class107.field681) {
					var2 = method1604(0, 0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2374, this.field2375, this.field2382, this.field2383, 0, var6, var3, this, this.field2370, var5);
				} else {
					var2 = method1642(0, 0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2373, this.field2381, 0, var6, var3, this, this.field2370, var5);
				}

				this.field2378 -= var2;
				if (this.field2378 != 0) {
					return var2;
				}

				if (!this.method1609()) {
					continue;
				}

				return var4;
			}

			if (this.field2370 == -256 && (this.field2369 & 255) == 0) {
				if (class107.field681) {
					return method1640(0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2374, this.field2375, 0, var4, var3, this);
				}

				return method1627(((class7)super.field2483).field35, var1, this.field2369, var2, this.field2373, 0, var4, var3, this);
			}

			if (class107.field681) {
				return method1630(0, 0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2374, this.field2375, 0, var4, var3, this, this.field2370, var5);
			}

			return method1629(0, 0, ((class7)super.field2483).field35, var1, this.field2369, var2, this.field2373, 0, var4, var3, this, this.field2370, var5);
		}
	}

	boolean method1609() {
		int var1 = this.field2380;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method1645(var1, this.field2372);
			var3 = method1647(var1, this.field2372);
		}

		if (this.field2373 == var1 && this.field2374 == var2 && this.field2375 == var3) {
			if (this.field2380 == Integer.MIN_VALUE) {
				this.field2380 = 0;
				this.field2375 = 0;
				this.field2374 = 0;
				this.field2373 = 0;
				this.method1719();
				return true;
			} else {
				this.method1606();
				return false;
			}
		} else {
			if (this.field2373 < var1) {
				this.field2381 = 1;
				this.field2378 = var1 - this.field2373;
			} else if (this.field2373 > var1) {
				this.field2381 = -1;
				this.field2378 = this.field2373 - var1;
			} else {
				this.field2381 = 0;
			}

			if (this.field2374 < var2) {
				this.field2382 = 1;
				if (this.field2378 == 0 || this.field2378 > var2 - this.field2374) {
					this.field2378 = var2 - this.field2374;
				}
			} else if (this.field2374 > var2) {
				this.field2382 = -1;
				if (this.field2378 == 0 || this.field2378 > this.field2374 - var2) {
					this.field2378 = this.field2374 - var2;
				}
			} else {
				this.field2382 = 0;
			}

			if (this.field2375 < var3) {
				this.field2383 = 1;
				if (this.field2378 == 0 || this.field2378 > var3 - this.field2375) {
					this.field2378 = var3 - this.field2375;
				}
			} else if (this.field2375 > var3) {
				this.field2383 = -1;
				if (this.field2378 == 0 || this.field2378 > this.field2375 - var3) {
					this.field2378 = this.field2375 - var3;
				}
			} else {
				this.field2383 = 0;
			}

			return false;
		}
	}

	static int method1645(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	static int method1647(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	public static class335 method1633(class7 var0, int var1, int var2) {
		return var0.field35 != null && var0.field35.length != 0 ? new class335(var0, (int)((long)var0.field34 * 256L * (long)100 / (long)(class67.field437 * 100)), var2 << 6) : null;
	}

	public static class335 method1638(class7 var0, int var1, int var2, int var3) {
		return var0.field35 != null && var0.field35.length != 0 ? new class335(var0, var1, var2, var3) : null;
	}

	static int method1625(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class335 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field2369 = var2 << 8;
		return var3;
	}

	static int method1649(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class335 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field2369 = var3 << 8;
		return var4 >> 1;
	}

	static int method1627(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class335 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field2369 = var2 << 8;
		return var3;
	}

	static int method1640(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class335 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field2369 = var3 << 8;
		return var4 >> 1;
	}

	static int method1628(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class335 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field2369 = var4;
		return var5;
	}

	static int method1639(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class335 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field2369 = var4;
		return var5 >> 1;
	}

	static int method1629(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class335 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field2369 = var4;
		return var5;
	}

	static int method1630(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class335 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field2369 = var4;
		return var5 >> 1;
	}

	static int method1637(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class335 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field2374 += var9.field2382 * (var6 - var3);
		var9.field2375 += var9.field2383 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field2373 = var4 >> 2;
		var9.field2369 = var2 << 8;
		return var3;
	}

	static int method1631(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class335 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.field2373 += var12.field2381 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field2374 = var5 >> 2;
		var12.field2375 = var6 >> 2;
		var12.field2369 = var3 << 8;
		return var4 >> 1;
	}

	static int method1635(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class335 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field2374 += var9.field2382 * (var6 - var3);
		var9.field2375 += var9.field2383 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field2373 = var4 >> 2;
		var9.field2369 = var2 << 8;
		return var3;
	}

	static int method1632(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class335 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field2373 += var12.field2381 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field2374 = var5 >> 2;
		var12.field2375 = var6 >> 2;
		var12.field2369 = var3 << 8;
		return var4 >> 1;
	}

	static int method1636(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class335 var11, int var12, int var13) {
		var11.field2374 -= var11.field2382 * var5;
		var11.field2375 -= var11.field2383 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field2374 += var11.field2382 * var5;
		var11.field2375 += var11.field2383 * var5;
		var11.field2373 = var6;
		var11.field2369 = var4;
		return var5;
	}

	static int method1644(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class335 var13, int var14, int var15) {
		var13.field2373 -= var13.field2381 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field2373 += var13.field2381 * var5;
		var13.field2374 = var6;
		var13.field2375 = var7;
		var13.field2369 = var4;
		return var5;
	}

	static int method1642(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class335 var11, int var12, int var13) {
		var11.field2374 -= var11.field2382 * var5;
		var11.field2375 -= var11.field2383 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field2374 += var11.field2382 * var5;
		var11.field2375 += var11.field2383 * var5;
		var11.field2373 = var6;
		var11.field2369 = var4;
		return var5;
	}

	static int method1604(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class335 var13, int var14, int var15) {
		var13.field2373 -= var13.field2381 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field2373 += var13.field2381 * var5;
		var13.field2374 = var6;
		var13.field2375 = var7;
		var13.field2369 = var4;
		return var5;
	}
}
