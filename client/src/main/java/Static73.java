import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public static int anInt1935;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "[Lclient!qb;")
	public static Pix8[] aClass2_Sub2_Sub2_Sub3Array10;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!ad;")
	public static Js5 binaryJs5;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z", line = 14)
	public static boolean method1335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(20) LocType local20 = LocType.get(arg0);
		return local20.method769(arg1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!hc;BZ)V", line = 36)
	public static void method1336(@OriginalArg(0) ClientStream arg0, @OriginalArg(2) boolean arg1) {
		if (Static29.aClass25_48 != null) {
			try {
				Static29.aClass25_48.method730();
			} catch (@Pc(19) Exception local19) {
			}
			Static29.aClass25_48 = null;
		}
		Static29.aClass25_48 = arg0;
		Static41.method787(arg1);
		Static82.aClass2_Sub2_Sub9_1 = null;
		Static1.anInt274 = 0;
		Static1.aClass2_Sub3_5.pos = 0;
		Static27.aClass2_Sub3_2 = null;
		while (true) {
			@Pc(40) Js5NetRequest local40 = (Js5NetRequest) Static1.aClass6_5.head();
			if (local40 == null) {
				while (true) {
					local40 = (Js5NetRequest) Static1.aClass6_2.head();
					if (local40 == null) {
						if (Static1.aByte1 != 0) {
							try {
								@Pc(92) Packet local92 = new Packet(4);
								local92.p1(4);
								local92.p1(Static1.aByte1);
								local92.p2(0);
								Static29.aClass25_48.write(local92.data, 4);
							} catch (@Pc(115) IOException local115) {
								try {
									Static29.aClass25_48.method730();
								} catch (@Pc(120) Exception local120) {
								}
								Static1.anInt2401++;
								Static29.aClass25_48 = null;
							}
						}
						Static1.anInt1510 = 0;
						Static29.aLong151 = System.currentTimeMillis();
						return;
					}
					Static1.aClass41_1.addTail(local40);
					Static1.aClass6_7.put(local40, local40.key);
					Static1.anInt2182--;
					Static1.anInt1077++;
				}
			}
			Static1.aClass6_6.put(local40, local40.key);
			Static1.anInt34++;
			Static1.anInt2333--;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 110)
	public static void method1337() {
		if (Static1.anInt2030 != 1) {
			return;
		}
		if (Static1.anInt2500 >= 539 && Static1.anInt2500 <= 573 && Static1.anInt2133 >= 169 && Static1.anInt2133 < 205 && Static1.anIntArray2[0] != -1) {
			Static1.anInt1551 = 0;
			Static1.aBoolean59 = true;
			Static1.aBoolean184 = true;
		}
		if (Static1.anInt2500 >= 569 && Static1.anInt2500 <= 599 && Static1.anInt2133 >= 168 && Static1.anInt2133 < 205 && Static1.anIntArray2[1] != -1) {
			Static1.aBoolean59 = true;
			Static1.aBoolean184 = true;
			Static1.anInt1551 = 1;
		}
		if (Static1.anInt2500 >= 597 && Static1.anInt2500 <= 627 && Static1.anInt2133 >= 168 && Static1.anInt2133 < 205 && Static1.anIntArray2[2] != -1) {
			Static1.aBoolean59 = true;
			Static1.aBoolean184 = true;
			Static1.anInt1551 = 2;
		}
		if (Static1.anInt2500 >= 625 && Static1.anInt2500 <= 669 && Static1.anInt2133 >= 168 && Static1.anInt2133 < 203 && Static1.anIntArray2[3] != -1) {
			Static1.aBoolean59 = true;
			Static1.aBoolean184 = true;
			Static1.anInt1551 = 3;
		}
		if (Static1.anInt2500 >= 666 && Static1.anInt2500 <= 696 && Static1.anInt2133 >= 168 && Static1.anInt2133 < 205 && Static1.anIntArray2[4] != -1) {
			Static1.aBoolean59 = true;
			Static1.anInt1551 = 4;
			Static1.aBoolean184 = true;
		}
		if (Static1.anInt2500 >= 694 && Static1.anInt2500 <= 724 && Static1.anInt2133 >= 168 && Static1.anInt2133 < 205 && Static1.anIntArray2[5] != -1) {
			Static1.aBoolean184 = true;
			Static1.anInt1551 = 5;
			Static1.aBoolean59 = true;
		}
		if (Static1.anInt2500 >= 722 && Static1.anInt2500 <= 756 && Static1.anInt2133 >= 169 && Static1.anInt2133 < 205 && Static1.anIntArray2[6] != -1) {
			Static1.aBoolean59 = true;
			Static1.aBoolean184 = true;
			Static1.anInt1551 = 6;
		}
		if (Static1.anInt2500 >= 540 && Static1.anInt2500 <= 574 && Static1.anInt2133 >= 466 && Static1.anInt2133 < 502 && Static1.anIntArray2[7] != -1) {
			Static1.aBoolean184 = true;
			Static1.anInt1551 = 7;
			Static1.aBoolean59 = true;
		}
		if (Static1.anInt2500 >= 572 && Static1.anInt2500 <= 602 && Static1.anInt2133 >= 466 && Static1.anInt2133 < 503 && Static1.anIntArray2[8] != -1) {
			Static1.aBoolean184 = true;
			Static1.aBoolean59 = true;
			Static1.anInt1551 = 8;
		}
		if (Static1.anInt2500 >= 599 && Static1.anInt2500 <= 629 && Static1.anInt2133 >= 466 && Static1.anInt2133 < 503 && Static1.anIntArray2[9] != -1) {
			Static1.anInt1551 = 9;
			Static1.aBoolean59 = true;
			Static1.aBoolean184 = true;
		}
		if (Static1.anInt2500 >= 627 && Static1.anInt2500 <= 671 && Static1.anInt2133 >= 467 && Static1.anInt2133 < 502 && Static1.anIntArray2[10] != -1) {
			Static1.aBoolean59 = true;
			Static1.aBoolean184 = true;
			Static1.anInt1551 = 10;
		}
		if (Static1.anInt2500 >= 669 && Static1.anInt2500 <= 699 && Static1.anInt2133 >= 466 && Static1.anInt2133 < 503 && Static1.anIntArray2[11] != -1) {
			Static1.aBoolean184 = true;
			Static1.aBoolean59 = true;
			Static1.anInt1551 = 11;
		}
		if (Static1.anInt2500 >= 696 && Static1.anInt2500 <= 726 && Static1.anInt2133 >= 466 && Static1.anInt2133 < 503 && Static1.anIntArray2[12] != -1) {
			Static1.aBoolean59 = true;
			Static1.anInt1551 = 12;
			Static1.aBoolean184 = true;
		}
		if (Static1.anInt2500 >= 724 && Static1.anInt2500 <= 758 && Static1.anInt2133 >= 466 && Static1.anInt2133 < 502 && Static1.anIntArray2[13] != -1) {
			Static1.anInt1551 = 13;
			Static1.aBoolean59 = true;
			Static1.aBoolean184 = true;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 258)
	public static void method1339() {
		JagString.aClass40_561 = null;
		JagString.aClass40_560 = null;
		Static1.aClass62_1 = null;
		aClass2_Sub2_Sub2_Sub3Array10 = null;
		Static1.aClass47_16 = null;
		binaryJs5 = null;
		Static1.aCRC32_1 = null;
		JagString.aClass40_558 = null;
		JagString.aClass40_559 = null;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Lclient!mc;", line = 275)
	public static ComType method1340(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static46.aClass2_Sub2_Sub13ArrayArray1[local3] == null || Static46.aClass2_Sub2_Sub13ArrayArray1[local3][local11] == null) {
			@Pc(30) boolean local30 = Static99.method1665(local3);
			if (!local30) {
				return null;
			}
		}
		return Static46.aClass2_Sub2_Sub13ArrayArray1[local3][local11];
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 313)
	public static void method1341() {
		while (true) {
			@Pc(13) LinkList local13 = Static1.aClass44_2;
			@Pc(20) Js5CacheRequest local20;
			synchronized (Static1.aClass44_2) {
				local20 = (Js5CacheRequest) Static1.aClass44_1.method1220();
			}
			if (local20 == null) {
				return;
			}
			local20.js5.method95(local20.cache, (int) local20.key, local20.data, false);
		}
	}
}
