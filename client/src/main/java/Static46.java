import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_10;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "I")
	public static int anInt1163;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_11;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "[[Lclient!mc;")
	public static ComType[][] aClass2_Sub2_Sub13ArrayArray1;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!k", name = "B", descriptor = "I")
	public static int anInt1167;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILclient!fb;ILclient!sd;BIII)V", line = 6)
	public static void method845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) CollisionMap arg3, @OriginalArg(4) int arg4, @OriginalArg(5) World3D arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static1.anIntArrayArrayArray8[arg0][arg8][arg1];
		@Pc(23) int local23 = Static1.anIntArrayArrayArray8[arg0][arg8 + 1][arg1];
		@Pc(35) int local35 = Static1.anIntArrayArrayArray8[arg0][arg8 + 1][arg1 + 1];
		@Pc(45) int local45 = Static1.anIntArrayArrayArray8[arg0][arg8][arg1 + 1];
		@Pc(55) int local55 = local45 + local35 + local13 + local23 >> 2;
		@Pc(59) LocType local59 = Static83.method1470(arg4);
		@Pc(65) int local65 = (arg6 << 6) + arg2;
		@Pc(77) int local77 = (arg1 << 7) + arg8 + (arg4 << 14) + 0x40000000;
		if (local59.anInt1054 == 0) {
			local77 += Integer.MIN_VALUE;
		}
		if (local59.anInt1030 == 1) {
			local65 += 256;
		}
		@Pc(118) Entity local118;
		if (arg2 == 22) {
			if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
				local118 = local59.method765(arg6, local23, local45, local13, 22, local35);
			} else {
				local118 = new LocEntity(arg4, 22, arg6, local13, local23, local35, local45, local59.anInt1048, true);
			}
			arg5.method1416(arg7, arg8, arg1, local55, local118, local77, local65);
			if (local59.aBoolean77 && local59.anInt1054 == 1) {
				arg3.method536(arg1, arg8);
			}
			return;
		}
		@Pc(213) int local213;
		if (arg2 == 10 || arg2 == 11) {
			if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
				local118 = local59.method765(arg6, local23, local45, local13, 10, local35);
			} else {
				local118 = new LocEntity(arg4, 10, arg6, local13, local23, local35, local45, local59.anInt1048, true);
			}
			if (local118 != null) {
				@Pc(198) int local198 = 0;
				if (arg2 == 11) {
					local198 += 256;
				}
				@Pc(216) int local216;
				if (arg6 == 1 || arg6 == 3) {
					local213 = local59.anInt1040;
					local216 = local59.anInt1036;
				} else {
					local213 = local59.anInt1036;
					local216 = local59.anInt1040;
				}
				arg5.method1410(arg7, arg8, arg1, local55, local213, local216, local118, local198, local77, local65);
			}
			if (local59.aBoolean77) {
				arg3.method531(local59.anInt1040, local59.aBoolean79, arg8, arg6, arg1, local59.anInt1036);
			}
		} else if (arg2 >= 12) {
			if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
				local118 = local59.method765(arg6, local23, local45, local13, arg2, local35);
			} else {
				local118 = new LocEntity(arg4, arg2, arg6, local13, local23, local35, local45, local59.anInt1048, true);
			}
			arg5.method1410(arg7, arg8, arg1, local55, 1, 1, local118, 0, local77, local65);
			if (local59.aBoolean77) {
				arg3.method531(local59.anInt1040, local59.aBoolean79, arg8, arg6, arg1, local59.anInt1036);
			}
		} else if (arg2 == 0) {
			if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
				local118 = local59.method765(arg6, local23, local45, local13, 0, local35);
			} else {
				local118 = new LocEntity(arg4, 0, arg6, local13, local23, local35, local45, local59.anInt1048, true);
			}
			arg5.method1440(arg7, arg8, arg1, local55, local118, null, Static1.anIntArray37[arg6], 0, local77, local65);
			if (local59.aBoolean77) {
				arg3.method528(local59.aBoolean79, arg6, arg1, arg8, arg2);
			}
		} else if (arg2 == 1) {
			if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
				local118 = local59.method765(arg6, local23, local45, local13, 1, local35);
			} else {
				local118 = new LocEntity(arg4, 1, arg6, local13, local23, local35, local45, local59.anInt1048, true);
			}
			arg5.method1440(arg7, arg8, arg1, local55, local118, null, Static1.anIntArray13[arg6], 0, local77, local65);
			if (local59.aBoolean77) {
				arg3.method528(local59.aBoolean79, arg6, arg1, arg8, arg2);
			}
		} else {
			@Pc(468) int local468;
			@Pc(500) Entity local500;
			if (arg2 == 2) {
				local468 = arg6 + 1 & 0x3;
				@Pc(490) Entity local490;
				if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
					local490 = local59.method765(arg6 + 4, local23, local45, local13, 2, local35);
					local500 = local59.method765(local468, local23, local45, local13, 2, local35);
				} else {
					local490 = new LocEntity(arg4, 2, arg6 + 4, local13, local23, local35, local45, local59.anInt1048, true);
					local500 = new LocEntity(arg4, 2, local468, local13, local23, local35, local45, local59.anInt1048, true);
				}
				arg5.method1440(arg7, arg8, arg1, local55, local490, local500, Static1.anIntArray37[arg6], Static1.anIntArray37[local468], local77, local65);
				if (local59.aBoolean77) {
					arg3.method528(local59.aBoolean79, arg6, arg1, arg8, arg2);
				}
			} else if (arg2 == 3) {
				if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
					local118 = local59.method765(arg6, local23, local45, local13, 3, local35);
				} else {
					local118 = new LocEntity(arg4, 3, arg6, local13, local23, local35, local45, local59.anInt1048, true);
				}
				arg5.method1440(arg7, arg8, arg1, local55, local118, null, Static1.anIntArray13[arg6], 0, local77, local65);
				if (local59.aBoolean77) {
					arg3.method528(local59.aBoolean79, arg6, arg1, arg8, arg2);
				}
			} else if (arg2 == 9) {
				if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
					local118 = local59.method765(arg6, local23, local45, local13, arg2, local35);
				} else {
					local118 = new LocEntity(arg4, arg2, arg6, local13, local23, local35, local45, local59.anInt1048, true);
				}
				arg5.method1410(arg7, arg8, arg1, local55, 1, 1, local118, 0, local77, local65);
				if (local59.aBoolean77) {
					arg3.method531(local59.anInt1040, local59.aBoolean79, arg8, arg6, arg1, local59.anInt1036);
				}
			} else {
				if (local59.aBoolean84) {
					if (arg6 == 1) {
						local468 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local13;
						local13 = local468;
					} else if (arg6 == 2) {
						local468 = local45;
						local45 = local23;
						local23 = local468;
						local468 = local35;
						local35 = local13;
						local13 = local468;
					} else if (arg6 == 3) {
						local468 = local45;
						local45 = local13;
						local13 = local23;
						local23 = local35;
						local35 = local468;
					}
				}
				if (arg2 == 4) {
					if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
						local118 = local59.method765(0, local23, local45, local13, 4, local35);
					} else {
						local118 = new LocEntity(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
					}
					arg5.method1446(arg7, arg8, arg1, local55, local118, Static1.anIntArray37[arg6], arg6 * 512, 0, 0, local77, local65);
				} else if (arg2 == 5) {
					local213 = arg5.method1459(arg7, arg8, arg1);
					local468 = 16;
					if (local213 > 0) {
						local468 = Static83.method1470(local213 >> 14 & 0x7FFF).anInt1050;
					}
					if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
						local500 = local59.method765(0, local23, local45, local13, 4, local35);
					} else {
						local500 = new LocEntity(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
					}
					arg5.method1446(arg7, arg8, arg1, local55, local500, Static1.anIntArray37[arg6], arg6 * 512, Static1.anIntArray429[arg6] * local468, local468 * Static1.anIntArray298[arg6], local77, local65);
				} else if (arg2 == 6) {
					if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
						local118 = local59.method765(0, local23, local45, local13, 4, local35);
					} else {
						local118 = new LocEntity(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
					}
					arg5.method1446(arg7, arg8, arg1, local55, local118, 256, arg6, 0, 0, local77, local65);
				} else if (arg2 == 7) {
					if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
						local118 = local59.method765(0, local23, local45, local13, 4, local35);
					} else {
						local118 = new LocEntity(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
					}
					arg5.method1446(arg7, arg8, arg1, local55, local118, 512, arg6, 0, 0, local77, local65);
				} else if (arg2 == 8) {
					if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
						local118 = local59.method765(0, local23, local45, local13, 4, local35);
					} else {
						local118 = new LocEntity(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
					}
					arg5.method1446(arg7, arg8, arg1, local55, local118, 768, arg6, 0, 0, local77, local65);
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!kc;II)V", line = 337)
	public static void method846(@OriginalArg(0) int arg0, @OriginalArg(1) PlayerEntity arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x80) != 0) {
			arg1.anInt2324 = Static1.in.g2_alt1();
			if (arg1.anInt2324 == 65535) {
				arg1.anInt2324 = -1;
			}
		}
		@Pc(27) int local27;
		if ((arg2 & 0x40) != 0) {
			local27 = Static1.in.g1_alt3();
			@Pc(30) byte[] local30 = new byte[local27];
			@Pc(35) Packet local35 = new Packet(local30);
			Static1.in.gdata_alt1(local30, local27);
			Static1.aClass2_Sub3Array1[arg0] = local35;
			arg1.method918(local35);
		}
		if ((arg2 & 0x10) != 0) {
			arg1.aClass40_660 = Static1.in.gjstr();
			if (arg1.aClass40_660.method1174(0) == 126) {
				arg1.aClass40_660 = arg1.aClass40_660.method1185(1);
				Static53.method989(2, arg1.aClass40_395, arg1.aClass40_660);
			} else if (arg1 == Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1) {
				Static53.method989(2, arg1.aClass40_395, arg1.aClass40_660);
			}
			arg1.anInt2301 = 0;
			arg1.anInt2294 = 150;
			arg1.anInt2271 = 0;
		}
		@Pc(124) int local124;
		@Pc(141) int local141;
		if ((arg2 & 0x8) != 0) {
			local27 = Static1.in.g2_alt1();
			local124 = Static1.in.g1_alt3();
			if (local27 == 65535) {
				local27 = -1;
			}
			if (local27 == arg1.anInt2307 && local27 != -1) {
				local141 = Static57.method1042(local27).anInt662;
				if (local141 == 1) {
					arg1.anInt2300 = 0;
					arg1.anInt2267 = 0;
					arg1.anInt2316 = 0;
					arg1.anInt2313 = local124;
				}
				if (local141 == 2) {
					arg1.anInt2300 = 0;
				}
			} else if (local27 == -1 || arg1.anInt2307 == -1 || Static57.method1042(local27).anInt658 >= Static57.method1042(arg1.anInt2307).anInt658) {
				arg1.anInt2267 = 0;
				arg1.anInt2307 = local27;
				arg1.anInt2316 = 0;
				arg1.anInt2313 = local124;
				arg1.anInt2281 = arg1.anInt2309;
				arg1.anInt2300 = 0;
			}
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt2317 = Static1.in.g1_alt3();
			arg1.anInt2321 = Static1.in.g1_alt1();
			arg1.anInt2311 = Static1.in.g1_alt3();
			arg1.anInt2286 = Static1.in.g1_alt3();
			arg1.anInt2277 = Static1.in.g2_alt1() + Static1.anInt2511;
			arg1.anInt2297 = Static1.in.g2_alt2() + Static1.anInt2511;
			arg1.anInt2314 = Static1.in.g1_alt1();
			arg1.method1543();
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt2302 = Static1.in.g2_alt2();
			local27 = Static1.in.g4s();
			arg1.anInt2291 = 0;
			if (arg1.anInt2302 == 65535) {
				arg1.anInt2302 = -1;
			}
			arg1.anInt2320 = Static1.anInt2511 + (local27 & 0xFFFF);
			if (arg1.anInt2320 > Static1.anInt2511) {
				arg1.anInt2291 = -1;
			}
			arg1.anInt2289 = local27 >> 16;
			arg1.anInt2268 = 0;
		}
		if ((arg2 & 0x1) != 0) {
			local27 = Static1.in.g2_alt1();
			local124 = Static1.in.g1_alt3();
			local141 = Static1.in.g1_alt3();
			@Pc(332) int local332 = Static1.in.pos;
			if (arg1.aClass40_395 != null && arg1.aClass33_2 != null) {
				@Pc(340) boolean local340 = false;
				@Pc(345) long local345 = arg1.aClass40_395.method1179();
				if (local124 <= 1) {
					for (@Pc(350) int local350 = 0; local350 < Static1.anInt121; local350++) {
						if (Static1.aLongArray4[local350] == local345) {
							local340 = true;
							break;
						}
					}
				}
				if (!local340 && Static1.anInt440 == 0) {
					Static1.aClass2_Sub3_4.pos = 0;
					Static1.in.gdata_alt1(Static1.aClass2_Sub3_4.data, local141);
					Static1.aClass2_Sub3_4.pos = 0;
					@Pc(392) JagString local392 = Static7.method192(Static1.aClass2_Sub3_4).method1166();
					arg1.aClass40_660 = local392.method1178();
					arg1.anInt2294 = 150;
					arg1.anInt2301 = local27 >> 8;
					arg1.anInt2271 = local27 & 0xFF;
					if (local124 == 2 || local124 == 3) {
						Static53.method989(1, Static72.method1334(new JagString[] { JagString.aClass40_622, arg1.aClass40_395 }), local392);
					} else if (local124 == 1) {
						Static53.method989(1, Static72.method1334(new JagString[] { JagString.aClass40_323, arg1.aClass40_395 }), local392);
					} else {
						Static53.method989(2, arg1.aClass40_395, local392);
					}
				}
			}
			Static1.in.pos = local332 + local141;
		}
		if ((arg2 & 0x200) != 0) {
			local27 = Static1.in.g1();
			local124 = Static1.in.g1();
			arg1.method1540(local27, Static1.anInt2511, local124);
			arg1.anInt2315 = Static1.anInt2511 + 300;
			arg1.anInt2298 = Static1.in.g1_alt1();
			arg1.anInt2279 = Static1.in.g1_alt3();
		}
		if ((arg2 & 0x20) != 0) {
			local27 = Static1.in.g1_alt2();
			local124 = Static1.in.g1();
			arg1.method1540(local27, Static1.anInt2511, local124);
			arg1.anInt2315 = Static1.anInt2511 + 300;
			arg1.anInt2298 = Static1.in.g1_alt1();
			arg1.anInt2279 = Static1.in.g1_alt1();
		}
		if ((arg2 & 0x2) != 0) {
			arg1.anInt2280 = Static1.in.g2_alt1();
			arg1.anInt2292 = Static1.in.g2_alt2();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 602)
	public static void method847() {
		JagString.aClass40_356 = null;
		aClass2_Sub2_Sub2_Sub3_10 = null;
		aClass2_Sub2_Sub2_Sub3_11 = null;
		Static1.aClass40Array23 = null;
		anIntArray256 = null;
		Static1.aBigInteger2 = null;
		aClass2_Sub2_Sub13ArrayArray1 = null;
		JagString.aClass40_355 = null;
		JagString.aClass40_357 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IBLclient!ad;Lclient!cb;)V", line = 621)
	public static void method848(@OriginalArg(0) int arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Cache arg2) {
		@Pc(7) Js5CacheRequest local7 = new Js5CacheRequest();
		local7.type = 1;
		local7.js5 = arg1;
		local7.cache = arg2;
		local7.aLong152 = arg0;
		@Pc(22) LinkList local22 = Static1.aClass44_2;
		synchronized (Static1.aClass44_2) {
			Static1.aClass44_2.addTail(local7);
		}
		Static53.method992();
	}
}
