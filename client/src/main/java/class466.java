public class class466 extends class53 {
	class466(class255 var1) {
		super(var1);
	}

	@Override
	void method214(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		int var13 = var5 - var4;
		int var14 = var2 - var1;
		int var15 = var6 - var4;
		int var16 = var3 - var1;
		int var17 = var11 - var10;
		int var18 = var12 - var10;
		float var19 = var8 - var7;
		float var20 = var9 - var7;
		int var21;
		if (var3 != var2) {
			var21 = (var6 - var5 << 14) / (var3 - var2);
		} else {
			var21 = 0;
		}

		int var22;
		if (var2 != var1) {
			var22 = (var13 << 14) / var14;
		} else {
			var22 = 0;
		}

		int var23;
		if (var3 != var1) {
			var23 = (var15 << 14) / var16;
		} else {
			var23 = 0;
		}

		int var24 = var13 * var16 - var15 * var14;
		if (var24 != 0) {
			int var25 = (var17 * var16 - var18 * var14 << 8) / var24;
			int var26 = (var18 * var13 - var17 * var15 << 8) / var24;
			float var27 = (var19 * (float)var16 - var20 * (float)var14) / (float)var24;
			float var28 = (var20 * (float)var13 - var19 * (float)var15) / (float)var24;
			int[] var29 = super.field249.field1737;
			int var30 = super.field249.field1735;
			if (var1 <= var2 && var1 <= var3) {
				if (var1 < var30) {
					if (var2 > var30) {
						var2 = var30;
					}

					if (var3 > var30) {
						var3 = var30;
					}

					var10 = (var10 << 8) - var25 * var4 + var25;
					var7 = var7 - var27 * (float)var4 + var27;
					if (var2 < var3) {
						var6 = var4 <<= 14;
						if (var1 < 0) {
							var6 -= var23 * var1;
							var4 -= var22 * var1;
							var10 -= var26 * var1;
							var7 -= var28 * (float)var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var21 * var2;
							var2 = 0;
						}

						if ((var1 == var2 || var23 >= var22) && (var1 != var2 || var23 <= var21)) {
							var3 -= var2;
							var2 -= var1;
							var1 = var29[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method2160(class433.field2898, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var25, var7, var27);
										var6 += var23;
										var5 += var21;
										var10 += var26;
										var1 += class433.field2894;
										var7 += var28;
									}
								}

								this.method2160(class433.field2898, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
								var6 += var23;
								var4 += var22;
								var10 += var26;
								var1 += class433.field2894;
								var7 += var28;
							}
						} else {
							var3 -= var2;
							var2 -= var1;
							var1 = var29[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method2160(class433.field2898, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var25, var7, var27);
										var6 += var23;
										var5 += var21;
										var10 += var26;
										var1 += class433.field2894;
										var7 += var28;
									}
								}

								this.method2160(class433.field2898, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
								var6 += var23;
								var4 += var22;
								var10 += var26;
								var1 += class433.field2894;
								var7 += var28;
							}
						}
					} else {
						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var23 * var1;
							var4 -= var22 * var1;
							var10 -= var26 * var1;
							var7 -= var28 * (float)var1;
							var1 = 0;
						}

						var6 <<= 14;
						if (var3 < 0) {
							var6 -= var21 * var3;
							var3 = 0;
						}

						if (var1 != var3 && var23 < var22 || var1 == var3 && var21 > var22) {
							var2 -= var3;
							var3 -= var1;
							var1 = var29[var1];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method2160(class433.field2898, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
										var6 += var21;
										var4 += var22;
										var10 += var26;
										var1 += class433.field2894;
										var7 += var28;
									}
								}

								this.method2160(class433.field2898, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var25, var7, var27);
								var5 += var23;
								var4 += var22;
								var10 += var26;
								var1 += class433.field2894;
								var7 += var28;
							}
						} else {
							var2 -= var3;
							var3 -= var1;
							var1 = var29[var1];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method2160(class433.field2898, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
										var6 += var21;
										var4 += var22;
										var10 += var26;
										var1 += class433.field2894;
										var7 += var28;
									}
								}

								this.method2160(class433.field2898, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var25, var7, var27);
								var5 += var23;
								var4 += var22;
								var10 += var26;
								var1 += class433.field2894;
								var7 += var28;
							}
						}
					}
				}
			} else if (var2 <= var3) {
				if (var2 < var30) {
					if (var3 > var30) {
						var3 = var30;
					}

					if (var1 > var30) {
						var1 = var30;
					}

					var11 = (var11 << 8) - var25 * var5 + var25;
					var8 = var8 - var27 * (float)var5 + var27;
					if (var3 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var22 * var2;
							var5 -= var21 * var2;
							var11 -= var26 * var2;
							var8 -= var28 * (float)var2;
							var2 = 0;
						}

						var6 <<= 14;
						if (var3 < 0) {
							var6 -= var23 * var3;
							var3 = 0;
						}

						if ((var2 == var3 || var22 >= var21) && (var2 != var3 || var22 <= var23)) {
							var1 -= var3;
							var3 -= var2;
							var2 = var29[var2];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method2160(class433.field2898, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var25, var8, var27);
										var4 += var22;
										var6 += var23;
										var11 += var26;
										var2 += class433.field2894;
										var8 += var28;
									}
								}

								this.method2160(class433.field2898, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
								var4 += var22;
								var5 += var21;
								var11 += var26;
								var2 += class433.field2894;
								var8 += var28;
							}
						} else {
							var1 -= var3;
							var3 -= var2;
							var2 = var29[var2];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method2160(class433.field2898, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var25, var8, var27);
										var4 += var22;
										var6 += var23;
										var11 += var26;
										var2 += class433.field2894;
										var8 += var28;
									}
								}

								this.method2160(class433.field2898, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
								var4 += var22;
								var5 += var21;
								var11 += var26;
								var2 += class433.field2894;
								var8 += var28;
							}
						}
					} else {
						var6 = var5 <<= 14;
						if (var2 < 0) {
							var6 -= var22 * var2;
							var5 -= var21 * var2;
							var11 -= var26 * var2;
							var8 -= var28 * (float)var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var23 * var1;
							var1 = 0;
						}

						if (var22 < var21) {
							var3 -= var1;
							var1 -= var2;
							var2 = var29[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method2160(class433.field2898, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
										var4 += var23;
										var5 += var21;
										var11 += var26;
										var2 += class433.field2894;
										var8 += var28;
									}
								}

								this.method2160(class433.field2898, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var25, var8, var27);
								var6 += var22;
								var5 += var21;
								var11 += var26;
								var2 += class433.field2894;
								var8 += var28;
							}
						} else {
							var3 -= var1;
							var1 -= var2;
							var2 = var29[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method2160(class433.field2898, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
										var4 += var23;
										var5 += var21;
										var11 += var26;
										var2 += class433.field2894;
										var8 += var28;
									}
								}

								this.method2160(class433.field2898, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var25, var8, var27);
								var6 += var22;
								var5 += var21;
								var11 += var26;
								var2 += class433.field2894;
								var8 += var28;
							}
						}
					}
				}
			} else if (var3 < var30) {
				if (var1 > var30) {
					var1 = var30;
				}

				if (var2 > var30) {
					var2 = var30;
				}

				var12 = (var12 << 8) - var25 * var6 + var25;
				var9 = var9 - var27 * (float)var6 + var27;
				if (var1 < var2) {
					var5 = var6 <<= 14;
					if (var3 < 0) {
						var5 -= var21 * var3;
						var6 -= var23 * var3;
						var12 -= var26 * var3;
						var9 -= var28 * (float)var3;
						var3 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var22 * var1;
						var1 = 0;
					}

					if (var21 < var23) {
						var2 -= var1;
						var1 -= var3;
						var3 = var29[var3];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									this.method2160(class433.field2898, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var25, var9, var27);
									var5 += var21;
									var4 += var22;
									var12 += var26;
									var3 += class433.field2894;
									var9 += var28;
								}
							}

							this.method2160(class433.field2898, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
							var5 += var21;
							var6 += var23;
							var12 += var26;
							var3 += class433.field2894;
							var9 += var28;
						}
					} else {
						var2 -= var1;
						var1 -= var3;
						var3 = var29[var3];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									this.method2160(class433.field2898, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var25, var9, var27);
									var5 += var21;
									var4 += var22;
									var12 += var26;
									var3 += class433.field2894;
									var9 += var28;
								}
							}

							this.method2160(class433.field2898, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
							var5 += var21;
							var6 += var23;
							var12 += var26;
							var3 += class433.field2894;
							var9 += var28;
						}
					}
				} else {
					var4 = var6 <<= 14;
					if (var3 < 0) {
						var4 -= var21 * var3;
						var6 -= var23 * var3;
						var12 -= var26 * var3;
						var9 -= var28 * (float)var3;
						var3 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var22 * var2;
						var2 = 0;
					}

					if (var21 < var23) {
						var1 -= var2;
						var2 -= var3;
						var3 = var29[var3];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									this.method2160(class433.field2898, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
									var5 += var22;
									var6 += var23;
									var12 += var26;
									var3 += class433.field2894;
									var9 += var28;
								}
							}

							this.method2160(class433.field2898, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var25, var9, var27);
							var4 += var21;
							var6 += var23;
							var12 += var26;
							var3 += class433.field2894;
							var9 += var28;
						}
					} else {
						var1 -= var2;
						var2 -= var3;
						var3 = var29[var3];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									this.method2160(class433.field2898, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
									var5 += var22;
									var6 += var23;
									var12 += var26;
									var3 += class433.field2894;
									var9 += var28;
								}
							}

							this.method2160(class433.field2898, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var25, var9, var27);
							var4 += var21;
							var6 += var23;
							var12 += var26;
							var3 += class433.field2894;
							var9 += var28;
						}
					}
				}
			}
		}
	}

	final void method2157(int[] var1, float[] var2, int var3, int var4, float var5) {
		int var6 = method2161(var2[var3], var5) ? 1 : 0;
		int var7 = 1 - var6;
		var1[var3] = var6 * var4 + var7 * var1[var3];
		var2[var3] = (float)var6 * var5 + (float)var7 * var2[var3];
	}

	final void method2158(int[] var1, float[] var2, int var3, int var4, float var5) {
		if (method2161(var2[var3], var5)) {
			int var6 = (var4 & (var4 >> 31 & 1) - 1) >> 8;
			var1[var3] = super.field248[var6];
			var2[var3] = var5;
		}

	}

	final void method2156(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
		if (method2161(var2[var3], var6)) {
			int var7 = var1[var3];
			var1[var3] = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & 65280) * var5 >> 8 & 65280);
		}

	}

	final void method2168(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
		if (method2161(var2[var3], var7)) {
			boolean var8 = false;
			int var9 = super.field248[0];
			var9 = ((var9 & 16711935) * var6 >> 8 & 16711935) + ((var9 & 65280) * var6 >> 8 & 65280);
			int var10 = var1[var3];
			var1[var3] = var9 + ((var10 & 16711935) * var5 >> 8 & 16711935) + ((var10 & 65280) * var5 >> 8 & 65280);
		}

	}

	final void method2160(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10) {
		if (super.field249.field1731) {
			if (var6 > super.field249.field1732) {
				var6 = super.field249.field1732;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var7 += var8 * var5;
			var9 += var10 * (float)var5;
			int var11;
			int var12;
			if (super.field249.field1728) {
				var4 = var6 - var5 >> 2;
				var8 <<= 2;
				if (super.field249.field1729 == 0) {
					if (var4 > 0) {
						do {
							var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
							var3 = super.field248[var11];
							var7 += var8;
							this.method2157(var1, class433.field2897, var2, var3, var9);
							var9 += var10;
							++var2;
							this.method2157(var1, class433.field2897, var2, var3, var9);
							var9 += var10;
							++var2;
							this.method2157(var1, class433.field2897, var2, var3, var9);
							var9 += var10;
							++var2;
							this.method2157(var1, class433.field2897, var2, var3, var9);
							var9 += var10;
							++var2;
							--var4;
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
						var3 = super.field248[var11];

						do {
							this.method2157(var1, class433.field2897, var2, var3, var9);
							var9 += var10;
							++var2;
							--var4;
						} while(var4 > 0);
					}
				} else {
					var11 = super.field249.field1729;
					var12 = 256 - super.field249.field1729;
					int var13;
					if (var4 > 0) {
						do {
							var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
							var3 = super.field248[var13];
							var7 += var8;
							var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & 65280) * var12 >> 8 & 65280);
							this.method2156(var1, class433.field2897, var2, var3, var11, var9);
							++var2;
							var9 += var10;
							this.method2156(var1, class433.field2897, var2, var3, var11, var9);
							++var2;
							var9 += var10;
							this.method2156(var1, class433.field2897, var2, var3, var11, var9);
							++var2;
							var9 += var10;
							this.method2156(var1, class433.field2897, var2, var3, var11, var9);
							++var2;
							var9 += var10;
							--var4;
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
						var3 = super.field248[var13];
						var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & 65280) * var12 >> 8 & 65280);

						do {
							this.method2156(var1, class433.field2897, var2, var3, var11, var9);
							++var2;
							var9 += var10;
							--var4;
						} while(var4 > 0);
					}
				}

			} else {
				var4 = var6 - var5;
				if (super.field249.field1729 == 0) {
					do {
						this.method2158(var1, class433.field2897, var2, var7, var9);
						var9 += var10;
						++var2;
						var7 += var8;
						--var4;
					} while(var4 > 0);
				} else {
					var11 = super.field249.field1729;
					var12 = 256 - super.field249.field1729;

					do {
						this.method2168(var1, class433.field2897, var2, 0, var11, var12, var9);
						var9 += var10;
						++var2;
						var7 += var8;
						--var4;
					} while(var4 > 0);
				}

			}
		}
	}

	@Override
	void method217(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
		int var11 = var5 - var4;
		int var12 = var2 - var1;
		int var13 = var6 - var4;
		int var14 = var3 - var1;
		float var15 = var8 - var7;
		float var16 = var9 - var7;
		int var17;
		if (var3 != var2) {
			var17 = (var6 - var5 << 14) / (var3 - var2);
		} else {
			var17 = 0;
		}

		int var18;
		if (var2 != var1) {
			var18 = (var11 << 14) / var12;
		} else {
			var18 = 0;
		}

		int var19;
		if (var3 != var1) {
			var19 = (var13 << 14) / var14;
		} else {
			var19 = 0;
		}

		int var20 = var11 * var14 - var13 * var12;
		if (var20 != 0) {
			float var21 = (var15 * (float)var14 - var16 * (float)var12) / (float)var20;
			float var22 = (var16 * (float)var11 - var15 * (float)var13) / (float)var20;
			int[] var23 = super.field249.field1737;
			int var24 = super.field249.field1735;
			if (var1 <= var2 && var1 <= var3) {
				if (var1 < var24) {
					if (var2 > var24) {
						var2 = var24;
					}

					if (var3 > var24) {
						var3 = var24;
					}

					var7 = var7 - var21 * (float)var4 + var21;
					if (var2 < var3) {
						var6 = var4 <<= 14;
						if (var1 < 0) {
							var6 -= var19 * var1;
							var4 -= var18 * var1;
							var7 -= var22 * (float)var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var17 * var2;
							var2 = 0;
						}

						if ((var1 == var2 || var19 >= var18) && (var1 != var2 || var19 <= var17)) {
							var3 -= var2;
							var2 -= var1;
							var1 = var23[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method2166(class433.field2898, var1, var10, 0, var5 >> 14, var6 >> 14, var7, var21);
										var6 += var19;
										var5 += var17;
										var1 += class433.field2894;
										var7 += var22;
									}
								}

								this.method2166(class433.field2898, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
								var6 += var19;
								var4 += var18;
								var1 += class433.field2894;
								var7 += var22;
							}
						} else {
							var3 -= var2;
							var2 -= var1;
							var1 = var23[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method2166(class433.field2898, var1, var10, 0, var6 >> 14, var5 >> 14, var7, var21);
										var6 += var19;
										var5 += var17;
										var1 += class433.field2894;
										var7 += var22;
									}
								}

								this.method2166(class433.field2898, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
								var6 += var19;
								var4 += var18;
								var1 += class433.field2894;
								var7 += var22;
							}
						}
					} else {
						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var19 * var1;
							var4 -= var18 * var1;
							var7 -= var22 * (float)var1;
							var1 = 0;
						}

						var6 <<= 14;
						if (var3 < 0) {
							var6 -= var17 * var3;
							var3 = 0;
						}

						if (var1 != var3 && var19 < var18 || var1 == var3 && var17 > var18) {
							var2 -= var3;
							var3 -= var1;
							var1 = var23[var1];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method2166(class433.field2898, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
										var6 += var17;
										var4 += var18;
										var1 += class433.field2894;
										var7 += var22;
									}
								}

								this.method2166(class433.field2898, var1, var10, 0, var5 >> 14, var4 >> 14, var7, var21);
								var5 += var19;
								var4 += var18;
								var1 += class433.field2894;
								var7 += var22;
							}
						} else {
							var2 -= var3;
							var3 -= var1;
							var1 = var23[var1];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method2166(class433.field2898, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
										var6 += var17;
										var4 += var18;
										var1 += class433.field2894;
										var7 += var22;
									}
								}

								this.method2166(class433.field2898, var1, var10, 0, var4 >> 14, var5 >> 14, var7, var21);
								var5 += var19;
								var4 += var18;
								var1 += class433.field2894;
								var7 += var22;
							}
						}
					}
				}
			} else if (var2 <= var3) {
				if (var2 < var24) {
					if (var3 > var24) {
						var3 = var24;
					}

					if (var1 > var24) {
						var1 = var24;
					}

					var8 = var8 - var21 * (float)var5 + var21;
					if (var3 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var18 * var2;
							var5 -= var17 * var2;
							var8 -= var22 * (float)var2;
							var2 = 0;
						}

						var6 <<= 14;
						if (var3 < 0) {
							var6 -= var19 * var3;
							var3 = 0;
						}

						if ((var2 == var3 || var18 >= var17) && (var2 != var3 || var18 <= var19)) {
							var1 -= var3;
							var3 -= var2;
							var2 = var23[var2];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method2166(class433.field2898, var2, var10, 0, var6 >> 14, var4 >> 14, var8, var21);
										var4 += var18;
										var6 += var19;
										var2 += class433.field2894;
										var8 += var22;
									}
								}

								this.method2166(class433.field2898, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
								var4 += var18;
								var5 += var17;
								var2 += class433.field2894;
								var8 += var22;
							}
						} else {
							var1 -= var3;
							var3 -= var2;
							var2 = var23[var2];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method2166(class433.field2898, var2, var10, 0, var4 >> 14, var6 >> 14, var8, var21);
										var4 += var18;
										var6 += var19;
										var2 += class433.field2894;
										var8 += var22;
									}
								}

								this.method2166(class433.field2898, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
								var4 += var18;
								var5 += var17;
								var2 += class433.field2894;
								var8 += var22;
							}
						}
					} else {
						var6 = var5 <<= 14;
						if (var2 < 0) {
							var6 -= var18 * var2;
							var5 -= var17 * var2;
							var8 -= var22 * (float)var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var19 * var1;
							var1 = 0;
						}

						if (var18 < var17) {
							var3 -= var1;
							var1 -= var2;
							var2 = var23[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method2166(class433.field2898, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
										var4 += var19;
										var5 += var17;
										var2 += class433.field2894;
										var8 += var22;
									}
								}

								this.method2166(class433.field2898, var2, var10, 0, var6 >> 14, var5 >> 14, var8, var21);
								var6 += var18;
								var5 += var17;
								var2 += class433.field2894;
								var8 += var22;
							}
						} else {
							var3 -= var1;
							var1 -= var2;
							var2 = var23[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method2166(class433.field2898, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
										var4 += var19;
										var5 += var17;
										var2 += class433.field2894;
										var8 += var22;
									}
								}

								this.method2166(class433.field2898, var2, var10, 0, var5 >> 14, var6 >> 14, var8, var21);
								var6 += var18;
								var5 += var17;
								var2 += class433.field2894;
								var8 += var22;
							}
						}
					}
				}
			} else if (var3 < var24) {
				if (var1 > var24) {
					var1 = var24;
				}

				if (var2 > var24) {
					var2 = var24;
				}

				var9 = var9 - var21 * (float)var6 + var21;
				if (var1 < var2) {
					var5 = var6 <<= 14;
					if (var3 < 0) {
						var5 -= var17 * var3;
						var6 -= var19 * var3;
						var9 -= var22 * (float)var3;
						var3 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var18 * var1;
						var1 = 0;
					}

					if (var17 < var19) {
						var2 -= var1;
						var1 -= var3;
						var3 = var23[var3];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									this.method2166(class433.field2898, var3, var10, 0, var5 >> 14, var4 >> 14, var9, var21);
									var5 += var17;
									var4 += var18;
									var3 += class433.field2894;
									var9 += var22;
								}
							}

							this.method2166(class433.field2898, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
							var5 += var17;
							var6 += var19;
							var3 += class433.field2894;
							var9 += var22;
						}
					} else {
						var2 -= var1;
						var1 -= var3;
						var3 = var23[var3];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									this.method2166(class433.field2898, var3, var10, 0, var4 >> 14, var5 >> 14, var9, var21);
									var5 += var17;
									var4 += var18;
									var3 += class433.field2894;
									var9 += var22;
								}
							}

							this.method2166(class433.field2898, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
							var5 += var17;
							var6 += var19;
							var3 += class433.field2894;
							var9 += var22;
						}
					}
				} else {
					var4 = var6 <<= 14;
					if (var3 < 0) {
						var4 -= var17 * var3;
						var6 -= var19 * var3;
						var9 -= var22 * (float)var3;
						var3 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var18 * var2;
						var2 = 0;
					}

					if (var17 < var19) {
						var1 -= var2;
						var2 -= var3;
						var3 = var23[var3];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									this.method2166(class433.field2898, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
									var5 += var18;
									var6 += var19;
									var3 += class433.field2894;
									var9 += var22;
								}
							}

							this.method2166(class433.field2898, var3, var10, 0, var4 >> 14, var6 >> 14, var9, var21);
							var4 += var17;
							var6 += var19;
							var3 += class433.field2894;
							var9 += var22;
						}
					} else {
						var1 -= var2;
						var2 -= var3;
						var3 = var23[var3];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									this.method2166(class433.field2898, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
									var5 += var18;
									var6 += var19;
									var3 += class433.field2894;
									var9 += var22;
								}
							}

							this.method2166(class433.field2898, var3, var10, 0, var6 >> 14, var4 >> 14, var9, var21);
							var4 += var17;
							var6 += var19;
							var3 += class433.field2894;
							var9 += var22;
						}
					}
				}
			}
		}
	}

	final void method2166(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
		if (super.field249.field1731) {
			if (var6 > super.field249.field1732) {
				var6 = super.field249.field1732;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var4 = var6 - var5 >> 2;
			var7 += var8 * (float)var5;
			if (super.field249.field1729 != 0) {
				if (super.field249.field1729 == 254) {
					while (true) {
						--var4;
						if (var4 < 0) {
							var4 = var6 - var5 & 3;

							while (true) {
								--var4;
								if (var4 < 0) {
									return;
								}

								var1[var2++] = var1[var2];
							}
						}

						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
					}
				} else {
					int var9 = super.field249.field1729;
					int var10 = 256 - super.field249.field1729;
					var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 65280) * var10 >> 8 & 65280);

					while (true) {
						--var4;
						if (var4 < 0) {
							var4 = var6 - var5 & 3;

							while (true) {
								--var4;
								if (var4 < 0) {
									return;
								}

								this.method2156(var1, class433.field2897, var2, var3, var9, var7);
								++var2;
								var7 += var8;
							}
						}

						this.method2156(var1, class433.field2897, var2, var3, var9, var7);
						++var2;
						var7 += var8;
						this.method2156(var1, class433.field2897, var2, var3, var9, var7);
						++var2;
						var7 += var8;
						this.method2156(var1, class433.field2897, var2, var3, var9, var7);
						++var2;
						var7 += var8;
						this.method2156(var1, class433.field2897, var2, var3, var9, var7);
						++var2;
						var7 += var8;
					}
				}
			} else {
				while (true) {
					--var4;
					if (var4 < 0) {
						var4 = var6 - var5 & 3;

						while (true) {
							--var4;
							if (var4 < 0) {
								return;
							}

							this.method2157(var1, class433.field2897, var2, var3, var7);
							var7 += var8;
							++var2;
						}
					}

					this.method2157(var1, class433.field2897, var2, var3, var7);
					var7 += var8;
					++var2;
					this.method2157(var1, class433.field2897, var2, var3, var7);
					var7 += var8;
					++var2;
					this.method2157(var1, class433.field2897, var2, var3, var7);
					var7 += var8;
					++var2;
					this.method2157(var1, class433.field2897, var2, var3, var7);
					var7 += var8;
					++var2;
				}
			}
		}
	}

	@Override
	void method218(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
		int[] var23 = super.field249.field1730.method2623(var22);
		int var24;
		if (var23 == null) {
			var24 = super.field249.field1730.method2620(var22);
			this.method214(var1, var2, var3, var4, var5, var6, var7, var8, var9, method213(var24, var10), method213(var24, var11), method213(var24, var12));
		} else {
			super.field247 = super.field249.field1730.method2622(var22);
			super.field246 = super.field249.field1730.method2621(var22);
			var24 = var5 - var4;
			int var25 = var2 - var1;
			int var26 = var6 - var4;
			int var27 = var3 - var1;
			int var28 = var11 - var10;
			int var29 = var12 - var10;
			int var30 = 0;
			if (var2 != var1) {
				var30 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var31 = 0;
			if (var3 != var2) {
				var31 = (var6 - var5 << 14) / (var3 - var2);
			}

			int var32 = 0;
			if (var3 != var1) {
				var32 = (var4 - var6 << 14) / (var1 - var3);
			}

			int var33 = var24 * var27 - var26 * var25;
			if (var33 != 0) {
				int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
				int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
				float var36 = var8 - var7;
				float var37 = var9 - var7;
				float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
				float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
				int var40 = super.field249.field1727;
				var14 = var13 - var14;
				var17 = var16 - var17;
				var20 = var19 - var20;
				var15 -= var13;
				var18 -= var16;
				var21 -= var19;
				int var41 = var15 * var16 - var18 * var13 << 14;
				int var42 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var40);
				int var43 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var40);
				int var44 = var14 * var16 - var17 * var13 << 14;
				int var45 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var40);
				int var46 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var40);
				int var47 = var17 * var15 - var14 * var18 << 14;
				int var48 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var40);
				int var49 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var40);
				int[] var50 = super.field249.field1737;
				int var51 = super.field249.field1735;
				int var52;
				if (var1 <= var2 && var1 <= var3) {
					if (var1 < var51) {
						if (var2 > var51) {
							var2 = var51;
						}

						if (var3 > var51) {
							var3 = var51;
						}

						var10 = (var10 << 9) - var34 * var4 + var34;
						var7 = var7 - var38 * (float)var4 + var38;
						if (var2 < var3) {
							var6 = var4 <<= 14;
							if (var1 < 0) {
								var6 -= var32 * var1;
								var4 -= var30 * var1;
								var10 -= var35 * var1;
								var7 -= var39 * (float)var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var31 * var2;
								var2 = 0;
							}

							var52 = var1 - super.field249.field1733;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
								var3 -= var2;
								var2 -= var1;
								var1 = var50[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method2167(class433.field2898, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var32;
											var5 += var31;
											var10 += var35;
											var1 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method2167(class433.field2898, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var6 += var32;
									var4 += var30;
									var10 += var35;
									var1 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							} else {
								var3 -= var2;
								var2 -= var1;
								var1 = var50[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method2167(class433.field2898, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var32;
											var5 += var31;
											var10 += var35;
											var1 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method2167(class433.field2898, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var6 += var32;
									var4 += var30;
									var10 += var35;
									var1 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var32 * var1;
								var4 -= var30 * var1;
								var10 -= var35 * var1;
								var7 -= var39 * (float)var1;
								var1 = 0;
							}

							var6 <<= 14;
							if (var3 < 0) {
								var6 -= var31 * var3;
								var3 = 0;
							}

							var52 = var1 - super.field249.field1733;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
								var2 -= var3;
								var3 -= var1;
								var1 = var50[var1];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											this.method2167(class433.field2898, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var31;
											var4 += var30;
											var10 += var35;
											var1 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method2167(class433.field2898, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var5 += var32;
									var4 += var30;
									var10 += var35;
									var1 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							} else {
								var2 -= var3;
								var3 -= var1;
								var1 = var50[var1];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											this.method2167(class433.field2898, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var31;
											var4 += var30;
											var10 += var35;
											var1 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method2167(class433.field2898, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var5 += var32;
									var4 += var30;
									var10 += var35;
									var1 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							}
						}
					}
				} else if (var2 <= var3) {
					if (var2 < var51) {
						if (var3 > var51) {
							var3 = var51;
						}

						if (var1 > var51) {
							var1 = var51;
						}

						var11 = (var11 << 9) - var34 * var5 + var34;
						var8 = var8 - var38 * (float)var5 + var38;
						if (var3 < var1) {
							var4 = var5 <<= 14;
							if (var2 < 0) {
								var4 -= var30 * var2;
								var5 -= var31 * var2;
								var11 -= var35 * var2;
								var8 -= var39 * (float)var2;
								var2 = 0;
							}

							var6 <<= 14;
							if (var3 < 0) {
								var6 -= var32 * var3;
								var3 = 0;
							}

							var52 = var2 - super.field249.field1733;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
								var1 -= var3;
								var3 -= var2;
								var2 = var50[var2];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											this.method2167(class433.field2898, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var30;
											var6 += var32;
											var11 += var35;
											var2 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method2167(class433.field2898, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var4 += var30;
									var5 += var31;
									var11 += var35;
									var2 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							} else {
								var1 -= var3;
								var3 -= var2;
								var2 = var50[var2];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											this.method2167(class433.field2898, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var30;
											var6 += var32;
											var11 += var35;
											var2 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method2167(class433.field2898, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var4 += var30;
									var5 += var31;
									var11 += var35;
									var2 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							}
						} else {
							var6 = var5 <<= 14;
							if (var2 < 0) {
								var6 -= var30 * var2;
								var5 -= var31 * var2;
								var11 -= var35 * var2;
								var8 -= var39 * (float)var2;
								var2 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var32 * var1;
								var1 = 0;
							}

							var52 = var2 - super.field249.field1733;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var30 < var31) {
								var3 -= var1;
								var1 -= var2;
								var2 = var50[var2];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method2167(class433.field2898, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var32;
											var5 += var31;
											var11 += var35;
											var2 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method2167(class433.field2898, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var6 += var30;
									var5 += var31;
									var11 += var35;
									var2 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							} else {
								var3 -= var1;
								var1 -= var2;
								var2 = var50[var2];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method2167(class433.field2898, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var32;
											var5 += var31;
											var11 += var35;
											var2 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method2167(class433.field2898, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var6 += var30;
									var5 += var31;
									var11 += var35;
									var2 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							}
						}
					}
				} else if (var3 < var51) {
					if (var1 > var51) {
						var1 = var51;
					}

					if (var2 > var51) {
						var2 = var51;
					}

					var12 = (var12 << 9) - var34 * var6 + var34;
					var9 = var9 - var38 * (float)var6 + var38;
					if (var1 < var2) {
						var5 = var6 <<= 14;
						if (var3 < 0) {
							var5 -= var31 * var3;
							var6 -= var32 * var3;
							var12 -= var35 * var3;
							var9 -= var39 * (float)var3;
							var3 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var30 * var1;
							var1 = 0;
						}

						var52 = var3 - super.field249.field1733;
						var41 += var43 * var52;
						var44 += var46 * var52;
						var47 += var49 * var52;
						if (var31 < var32) {
							var2 -= var1;
							var1 -= var3;
							var3 = var50[var3];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method2167(class433.field2898, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var31;
										var4 += var30;
										var12 += var35;
										var3 += class433.field2894;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method2167(class433.field2898, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var5 += var31;
								var6 += var32;
								var12 += var35;
								var3 += class433.field2894;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						} else {
							var2 -= var1;
							var1 -= var3;
							var3 = var50[var3];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method2167(class433.field2898, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var31;
										var4 += var30;
										var12 += var35;
										var3 += class433.field2894;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method2167(class433.field2898, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var5 += var31;
								var6 += var32;
								var12 += var35;
								var3 += class433.field2894;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						}
					} else {
						var4 = var6 <<= 14;
						if (var3 < 0) {
							var4 -= var31 * var3;
							var6 -= var32 * var3;
							var12 -= var35 * var3;
							var9 -= var39 * (float)var3;
							var3 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var30 * var2;
							var2 = 0;
						}

						var52 = var3 - super.field249.field1733;
						var41 += var43 * var52;
						var44 += var46 * var52;
						var47 += var49 * var52;
						if (var31 < var32) {
							var1 -= var2;
							var2 -= var3;
							var3 = var50[var3];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method2167(class433.field2898, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var30;
										var6 += var32;
										var12 += var35;
										var3 += class433.field2894;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method2167(class433.field2898, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var4 += var31;
								var6 += var32;
								var12 += var35;
								var3 += class433.field2894;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						} else {
							var1 -= var2;
							var2 -= var3;
							var3 = var50[var3];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method2167(class433.field2898, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var30;
										var6 += var32;
										var12 += var35;
										var3 += class433.field2894;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method2167(class433.field2898, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var4 += var31;
								var6 += var32;
								var12 += var35;
								var3 += class433.field2894;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						}
					}
				}
			}
		}
	}

	final void method2167(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
		if (super.field249.field1731) {
			if (var7 > super.field249.field1732) {
				var7 = super.field249.field1732;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			var10 += var11 * (float)var6;
			int var20 = var7 - var6;
			int var10000;
			int var18;
			int var19;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			int var26;
			if (super.field247) {
				var26 = var6 - super.field249.field1738;
				var12 += (var15 >> 3) * var26;
				var13 += (var16 >> 3) * var26;
				var14 += (var17 >> 3) * var26;
				var25 = var14 >> 12;
				if (var25 != 0) {
					var21 = var12 / var25;
					var22 = var13 / var25;
					if (var21 < 0) {
						var21 = 0;
					} else if (var21 > 4032) {
						var21 = 4032;
					}
				} else {
					var21 = 0;
					var22 = 0;
				}

				var12 += var15;
				var13 += var16;
				var14 += var17;
				var25 = var14 >> 12;
				if (var25 != 0) {
					var23 = var12 / var25;
					var24 = var13 / var25;
					if (var23 < 0) {
						var23 = 0;
					} else if (var23 > 4032) {
						var23 = 4032;
					}
				} else {
					var23 = 0;
					var24 = 0;
				}

				var3 = (var21 << 20) + var22;
				var19 = (var23 - var21 >> 3 << 20) + (var24 - var22 >> 3);
				var20 >>= 3;
				var9 <<= 3;
				var18 = var8 >> 8;
				if (super.field246) {
					if (var20 > 0) {
						do {
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var10000 = var3 + var19;
							var10 += var11;
							var21 = var23;
							var22 = var24;
							var12 += var15;
							var13 += var16;
							var14 += var17;
							var25 = var14 >> 12;
							if (var25 != 0) {
								var23 = var12 / var25;
								var24 = var13 / var25;
								if (var23 < 0) {
									var23 = 0;
								} else if (var23 > 4032) {
									var23 = 4032;
								}
							} else {
								var23 = 0;
								var24 = 0;
							}

							var3 = (var21 << 20) + var22;
							var19 = (var23 - var21 >> 3 << 20) + (var24 - var22 >> 3);
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) {
						do {
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var10000 = var3 + var19;
							var10 += var11;
							var21 = var23;
							var22 = var24;
							var12 += var15;
							var13 += var16;
							var14 += var17;
							var25 = var14 >> 12;
							if (var25 != 0) {
								var23 = var12 / var25;
								var24 = var13 / var25;
								if (var23 < 0) {
									var23 = 0;
								} else if (var23 > 4032) {
									var23 = 4032;
								}
							} else {
								var23 = 0;
								var24 = 0;
							}

							var3 = (var21 << 20) + var22;
							var19 = (var23 - var21 >> 3 << 20) + (var24 - var22 >> 3);
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				}
			} else {
				var26 = var6 - super.field249.field1738;
				var12 += (var15 >> 3) * var26;
				var13 += (var16 >> 3) * var26;
				var14 += (var17 >> 3) * var26;
				var25 = var14 >> 14;
				if (var25 != 0) {
					var21 = var12 / var25;
					var22 = var13 / var25;
					if (var21 < 0) {
						var21 = 0;
					} else if (var21 > 16256) {
						var21 = 16256;
					}
				} else {
					var21 = 0;
					var22 = 0;
				}

				var12 += var15;
				var13 += var16;
				var14 += var17;
				var25 = var14 >> 14;
				if (var25 != 0) {
					var23 = var12 / var25;
					var24 = var13 / var25;
					if (var23 < 0) {
						var23 = 0;
					} else if (var23 > 16256) {
						var23 = 16256;
					}
				} else {
					var23 = 0;
					var24 = 0;
				}

				var3 = (var21 << 18) + var22;
				var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
				var20 >>= 3;
				var9 <<= 3;
				var18 = var8 >> 8;
				if (super.field246) {
					if (var20 > 0) {
						do {
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var10000 = var3 + var19;
							var10 += var11;
							var21 = var23;
							var22 = var24;
							var12 += var15;
							var13 += var16;
							var14 += var17;
							var25 = var14 >> 14;
							if (var25 != 0) {
								var23 = var12 / var25;
								var24 = var13 / var25;
								if (var23 < 0) {
									var23 = 0;
								} else if (var23 > 16256) {
									var23 = 16256;
								}
							} else {
								var23 = 0;
								var24 = 0;
							}

							var3 = (var21 << 18) + var22;
							var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) {
						do {
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var10000 = var3 + var19;
							var10 += var11;
							var21 = var23;
							var22 = var24;
							var12 += var15;
							var13 += var16;
							var14 += var17;
							var25 = var14 >> 14;
							if (var25 != 0) {
								var23 = var12 / var25;
								var24 = var13 / var25;
								if (var23 < 0) {
									var23 = 0;
								} else if (var23 > 16256) {
									var23 = 16256;
								}
							} else {
								var23 = 0;
								var24 = 0;
							}

							var3 = (var21 << 18) + var22;
							var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				}
			}

		}
	}

	@Override
	void method219(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
		int[] var23 = super.field249.field1730.method2623(var22);
		int var24;
		if (var23 == null) {
			var24 = super.field249.field1730.method2620(var22);
			this.method214(var1, var2, var3, var4, var5, var6, var7, var8, var9, method213(var24, var10), method213(var24, var11), method213(var24, var12));
		} else {
			super.field247 = super.field249.field1730.method2622(var22);
			super.field246 = super.field249.field1730.method2621(var22);
			var24 = var5 - var4;
			int var25 = var2 - var1;
			int var26 = var6 - var4;
			int var27 = var3 - var1;
			int var28 = var11 - var10;
			int var29 = var12 - var10;
			int var30 = 0;
			if (var2 != var1) {
				var30 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var31 = 0;
			if (var3 != var2) {
				var31 = (var6 - var5 << 14) / (var3 - var2);
			}

			int var32 = 0;
			if (var3 != var1) {
				var32 = (var4 - var6 << 14) / (var1 - var3);
			}

			int var33 = var24 * var27 - var26 * var25;
			if (var33 != 0) {
				int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
				int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
				float var36 = var8 - var7;
				float var37 = var9 - var7;
				float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
				float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
				int var40 = super.field249.field1727;
				var14 = var13 - var14;
				var17 = var16 - var17;
				var20 = var19 - var20;
				var15 -= var13;
				var18 -= var16;
				var21 -= var19;
				int var41 = var15 * var16 - var18 * var13 << 14;
				int var42 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var40);
				int var43 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var40);
				int var44 = var14 * var16 - var17 * var13 << 14;
				int var45 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var40);
				int var46 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var40);
				int var47 = var17 * var15 - var14 * var18 << 14;
				int var48 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var40);
				int var49 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var40);
				int[] var50 = super.field249.field1737;
				int var51 = super.field249.field1735;
				int var52;
				if (var1 <= var2 && var1 <= var3) {
					if (var1 < var51) {
						if (var2 > var51) {
							var2 = var51;
						}

						if (var3 > var51) {
							var3 = var51;
						}

						var10 = (var10 << 9) - var34 * var4 + var34;
						var7 = var7 - var38 * (float)var4 + var38;
						if (var2 < var3) {
							var6 = var4 <<= 14;
							if (var1 < 0) {
								var6 -= var32 * var1;
								var4 -= var30 * var1;
								var7 -= var39 * (float)var1;
								var10 -= var35 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var31 * var2;
								var2 = 0;
							}

							var52 = var1 - super.field249.field1733;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
								var3 -= var2;
								var2 -= var1;
								var1 = var50[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method2165(class433.field2898, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var32;
											var5 += var31;
											var10 += var35;
											var1 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method2165(class433.field2898, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var6 += var32;
									var4 += var30;
									var10 += var35;
									var1 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							} else {
								var3 -= var2;
								var2 -= var1;
								var1 = var50[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method2165(class433.field2898, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var32;
											var5 += var31;
											var10 += var35;
											var1 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method2165(class433.field2898, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var6 += var32;
									var4 += var30;
									var10 += var35;
									var1 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var32 * var1;
								var4 -= var30 * var1;
								var7 -= var39 * (float)var1;
								var10 -= var35 * var1;
								var1 = 0;
							}

							var6 <<= 14;
							if (var3 < 0) {
								var6 -= var31 * var3;
								var3 = 0;
							}

							var52 = var1 - super.field249.field1733;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
								var2 -= var3;
								var3 -= var1;
								var1 = var50[var1];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											this.method2165(class433.field2898, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var31;
											var4 += var30;
											var10 += var35;
											var1 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method2165(class433.field2898, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var5 += var32;
									var4 += var30;
									var10 += var35;
									var1 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							} else {
								var2 -= var3;
								var3 -= var1;
								var1 = var50[var1];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											this.method2165(class433.field2898, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var31;
											var4 += var30;
											var10 += var35;
											var1 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method2165(class433.field2898, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var5 += var32;
									var4 += var30;
									var10 += var35;
									var1 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							}
						}
					}
				} else if (var2 <= var3) {
					if (var2 < var51) {
						if (var3 > var51) {
							var3 = var51;
						}

						if (var1 > var51) {
							var1 = var51;
						}

						var11 = (var11 << 9) - var34 * var5 + var34;
						var8 = var8 - var38 * (float)var5 + var38;
						if (var3 < var1) {
							var4 = var5 <<= 14;
							if (var2 < 0) {
								var4 -= var30 * var2;
								var5 -= var31 * var2;
								var8 -= var39 * (float)var2;
								var11 -= var35 * var2;
								var2 = 0;
							}

							var6 <<= 14;
							if (var3 < 0) {
								var6 -= var32 * var3;
								var3 = 0;
							}

							var52 = var2 - super.field249.field1733;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
								var1 -= var3;
								var3 -= var2;
								var2 = var50[var2];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											this.method2165(class433.field2898, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var30;
											var6 += var32;
											var11 += var35;
											var2 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method2165(class433.field2898, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var4 += var30;
									var5 += var31;
									var11 += var35;
									var2 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							} else {
								var1 -= var3;
								var3 -= var2;
								var2 = var50[var2];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											this.method2165(class433.field2898, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var30;
											var6 += var32;
											var11 += var35;
											var2 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method2165(class433.field2898, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var4 += var30;
									var5 += var31;
									var11 += var35;
									var2 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							}
						} else {
							var6 = var5 <<= 14;
							if (var2 < 0) {
								var6 -= var30 * var2;
								var5 -= var31 * var2;
								var8 -= var39 * (float)var2;
								var11 -= var35 * var2;
								var2 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var32 * var1;
								var1 = 0;
							}

							var52 = var2 - super.field249.field1733;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var30 < var31) {
								var3 -= var1;
								var1 -= var2;
								var2 = var50[var2];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method2165(class433.field2898, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var32;
											var5 += var31;
											var11 += var35;
											var2 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method2165(class433.field2898, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var6 += var30;
									var5 += var31;
									var11 += var35;
									var2 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							} else {
								var3 -= var1;
								var1 -= var2;
								var2 = var50[var2];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method2165(class433.field2898, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var32;
											var5 += var31;
											var11 += var35;
											var2 += class433.field2894;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method2165(class433.field2898, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var6 += var30;
									var5 += var31;
									var11 += var35;
									var2 += class433.field2894;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							}
						}
					}
				} else if (var3 < var51) {
					if (var1 > var51) {
						var1 = var51;
					}

					if (var2 > var51) {
						var2 = var51;
					}

					var12 = (var12 << 9) - var34 * var6 + var34;
					var9 = var9 - var38 * (float)var6 + var38;
					if (var1 < var2) {
						var5 = var6 <<= 14;
						if (var3 < 0) {
							var5 -= var31 * var3;
							var6 -= var32 * var3;
							var9 -= var39 * (float)var3;
							var12 -= var35 * var3;
							var3 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var30 * var1;
							var1 = 0;
						}

						var52 = var3 - super.field249.field1733;
						var41 += var43 * var52;
						var44 += var46 * var52;
						var47 += var49 * var52;
						if (var31 < var32) {
							var2 -= var1;
							var1 -= var3;
							var3 = var50[var3];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method2165(class433.field2898, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var31;
										var4 += var30;
										var12 += var35;
										var3 += class433.field2894;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method2165(class433.field2898, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var5 += var31;
								var6 += var32;
								var12 += var35;
								var3 += class433.field2894;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						} else {
							var2 -= var1;
							var1 -= var3;
							var3 = var50[var3];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method2165(class433.field2898, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var31;
										var4 += var30;
										var12 += var35;
										var3 += class433.field2894;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method2165(class433.field2898, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var5 += var31;
								var6 += var32;
								var12 += var35;
								var3 += class433.field2894;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						}
					} else {
						var4 = var6 <<= 14;
						if (var3 < 0) {
							var4 -= var31 * var3;
							var6 -= var32 * var3;
							var9 -= var39 * (float)var3;
							var12 -= var35 * var3;
							var3 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var30 * var2;
							var2 = 0;
						}

						var52 = var3 - super.field249.field1733;
						var41 += var43 * var52;
						var44 += var46 * var52;
						var47 += var49 * var52;
						if (var31 < var32) {
							var1 -= var2;
							var2 -= var3;
							var3 = var50[var3];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method2165(class433.field2898, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var30;
										var6 += var32;
										var12 += var35;
										var3 += class433.field2894;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method2165(class433.field2898, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var4 += var31;
								var6 += var32;
								var12 += var35;
								var3 += class433.field2894;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						} else {
							var1 -= var2;
							var2 -= var3;
							var3 = var50[var3];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method2165(class433.field2898, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var30;
										var6 += var32;
										var12 += var35;
										var3 += class433.field2894;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method2165(class433.field2898, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var4 += var31;
								var6 += var32;
								var12 += var35;
								var3 += class433.field2894;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						}
					}
				}
			}
		}
	}

	final void method2165(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
		if (super.field249.field1731) {
			if (var7 > super.field249.field1732) {
				var7 = super.field249.field1732;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			var10 += var11 * (float)var6;
			int var20 = var7 - var6;
			int var18;
			int var19;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			int var26;
			if (super.field247) {
				var26 = var6 - super.field249.field1738;
				var12 += var15 * var26;
				var13 += var16 * var26;
				var14 += var17 * var26;
				var25 = var14 >> 12;
				if (var25 != 0) {
					var21 = var12 / var25;
					var22 = var13 / var25;
				} else {
					var21 = 0;
					var22 = 0;
				}

				var12 += var15 * var20;
				var13 += var16 * var20;
				var14 += var17 * var20;
				var25 = var14 >> 12;
				if (var25 != 0) {
					var23 = var12 / var25;
					var24 = var13 / var25;
				} else {
					var23 = 0;
					var24 = 0;
				}

				var3 = (var21 << 20) + var22;
				var19 = ((var23 - var21) / var20 << 20) + (var24 - var22) / var20;
				var20 >>= 3;
				var9 <<= 3;
				var18 = var8 >> 8;
				if (super.field246) {
					if (var20 > 0) {
						do {
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							method2162(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) {
						do {
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							method2163(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				}
			} else {
				var26 = var6 - super.field249.field1738;
				var12 += var15 * var26;
				var13 += var16 * var26;
				var14 += var17 * var26;
				var25 = var14 >> 14;
				if (var25 != 0) {
					var21 = var12 / var25;
					var22 = var13 / var25;
				} else {
					var21 = 0;
					var22 = 0;
				}

				var12 += var15 * var20;
				var13 += var16 * var20;
				var14 += var17 * var20;
				var25 = var14 >> 14;
				if (var25 != 0) {
					var23 = var12 / var25;
					var24 = var13 / var25;
				} else {
					var23 = 0;
					var24 = 0;
				}

				var3 = (var21 << 18) + var22;
				var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
				var20 >>= 3;
				var9 <<= 3;
				var18 = var8 >> 8;
				if (super.field246) {
					if (var20 > 0) {
						do {
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							method2164(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) {
						do {
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							method2159(var1, class433.field2897, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				}
			}

		}
	}

	static final boolean method2161(float var0, float var1) {
		return var1 > var0;
	}

	static final void method2162(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		if (method2161(var1[var3], var6)) {
			int var7 = var2[(var5 & 4032) + (var5 >>> 26)];
			var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & 65280) * var4 & 16711680) >> 8;
			var1[var3] = var6;
		}

	}

	static final void method2163(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		int var7 = var2[(var5 & 4032) + (var5 >>> 26)];
		if (var7 != 0) {
			if (method2161(var1[var3], var6)) {
				var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & 65280) * var4 & 16711680) >> 8;
				var1[var3] = var6;
			}

		}
	}

	static final void method2164(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		if (method2161(var1[var3], var6)) {
			int var7 = var2[(var5 & 16256) + (var5 >>> 25)];
			var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & 65280) * var4 & 16711680) >> 8;
			var1[var3] = var6;
		}

	}

	static final void method2159(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		int var7 = var2[(var5 & 16256) + (var5 >>> 25)];
		if (var7 != 0) {
			if (method2161(var1[var3], var6)) {
				var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & 65280) * var4 & 16711680) >> 8;
				var1[var3] = var6;
			}

		}
	}
}
