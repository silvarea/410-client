import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
	public static int anInt96;

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "[Lclient!vb;")
	public static Pix24[] aClass2_Sub2_Sub2_Sub4Array2;

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
	public static int anInt120;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V", line = 42)
	public static void method58(@OriginalArg(0) boolean arg0) {
		Static1.aBoolean87 = arg0;
		@Pc(19) int local19;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(72) int local72;
		@Pc(132) int local132;
		@Pc(140) int local140;
		@Pc(148) int local148;
		if (!Static1.aBoolean87) {
			local19 = client.in.g2_alt1();
			local26 = (client.packetSize - client.in.pos) / 16;
			Static78.anIntArrayArray20 = new int[local26][4];
			for (local32 = 0; local32 < local26; local32++) {
				for (local36 = 0; local36 < 4; local36++) {
					Static78.anIntArrayArray20[local32][local36] = client.in.g4s();
				}
			}
			local36 = client.in.g2_alt1();
			local62 = client.in.g2_alt1();
			local66 = client.in.g1_alt3();
			local72 = client.in.g2();
			Static97.aByteArrayArray12 = new byte[local26][];
			Static53.anIntArray311 = new int[local26];
			@Pc(80) boolean local80 = false;
			if ((local72 / 8 == 48 || local72 / 8 == 49) && local36 / 8 == 48) {
				local80 = true;
			}
			if (local72 / 8 == 48 && local36 / 8 == 148) {
				local80 = true;
			}
			Static23.aByteArrayArray6 = new byte[local26][];
			Static46.anIntArray256 = new int[local26];
			Static50.anIntArray299 = new int[local26];
			local26 = 0;
			for (local132 = (local72 - 6) / 8; local132 <= (local72 + 6) / 8; local132++) {
				for (local140 = (local36 - 6) / 8; local140 <= (local36 + 6) / 8; local140++) {
					local148 = local140 + (local132 << 8);
					if (!local80 || local140 != 49 && local140 != 149 && local140 != 147 && local132 != 50 && (local132 != 49 || local140 != 47)) {
						Static53.anIntArray311[local26] = local148;
						Static50.anIntArray299[local26] = Static34.mapsJs5.method80(Static72.method1334(new JagString[] { JagString.aClass40_723, Static48.method859(local132), JagString.aClass40_612, Static48.method859(local140) }));
						Static46.anIntArray256[local26] = Static34.mapsJs5.method80(Static72.method1334(new JagString[] { JagString.aClass40_356, Static48.method859(local132), JagString.aClass40_612, Static48.method859(local140) }));
						local26++;
					}
				}
			}
			Static74.method1343(local72, local66, local19, local62, local36);
			return;
		}
		local19 = client.in.g2_alt2();
		client.in.bits();
		for (local26 = 0; local26 < 4; local26++) {
			for (local32 = 0; local32 < 13; local32++) {
				for (local36 = 0; local36 < 13; local36++) {
					local62 = client.in.gBit(1);
					if (local62 == 1) {
						Static1.anIntArrayArrayArray2[local26][local32][local36] = client.in.gBit(26);
					} else {
						Static1.anIntArrayArrayArray2[local26][local32][local36] = -1;
					}
				}
			}
		}
		client.in.bytes();
		local32 = (client.packetSize - client.in.pos) / 16;
		Static78.anIntArrayArray20 = new int[local32][4];
		for (local36 = 0; local36 < local32; local36++) {
			for (local62 = 0; local62 < 4; local62++) {
				Static78.anIntArrayArray20[local36][local62] = client.in.g4s_alt2();
			}
		}
		local62 = client.in.g1_alt3();
		local66 = client.in.g2_alt3();
		local72 = client.in.g2_alt2();
		@Pc(394) int local394 = client.in.g2_alt3();
		Static50.anIntArray299 = new int[local32];
		Static46.anIntArray256 = new int[local32];
		Static97.aByteArrayArray12 = new byte[local32][];
		Static53.anIntArray311 = new int[local32];
		Static23.aByteArrayArray6 = new byte[local32][];
		local32 = 0;
		for (local132 = 0; local132 < 4; local132++) {
			for (local140 = 0; local140 < 13; local140++) {
				for (local148 = 0; local148 < 13; local148++) {
					@Pc(431) int local431 = Static1.anIntArrayArrayArray2[local132][local140][local148];
					if (local431 != -1) {
						@Pc(440) int local440 = local431 >> 14 & 0x3FF;
						@Pc(446) int local446 = local431 >> 3 & 0x7FF;
						@Pc(456) int local456 = (local440 / 8 << 8) + local446 / 8;
						for (@Pc(458) int local458 = 0; local458 < local32; local458++) {
							if (local456 == Static53.anIntArray311[local458]) {
								local456 = -1;
								break;
							}
						}
						if (local456 != -1) {
							Static53.anIntArray311[local32] = local456;
							@Pc(490) int local490 = local456 >> 8 & 0xFF;
							@Pc(494) int local494 = local456 & 0xFF;
							Static50.anIntArray299[local32] = Static34.mapsJs5.method80(Static72.method1334(new JagString[] { JagString.aClass40_723, Static48.method859(local490), JagString.aClass40_612, Static48.method859(local494) }));
							Static46.anIntArray256[local32] = Static34.mapsJs5.method80(Static72.method1334(new JagString[] { JagString.aClass40_356, Static48.method859(local490), JagString.aClass40_612, Static48.method859(local494) }));
							local32++;
						}
					}
				}
			}
		}
		Static74.method1343(local72, local62, local19, local66, local394);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 652)
	public static void method70() {
		JagString.aClass40_27 = null;
		JagString.aClass40_25 = null;
		JagString.aClass40_26 = null;
		Static1.anObject2 = null;
		World.ROTATION_WALL_CORNER_TYPE = null;
		JagString.aClass40_24 = null;
		GameShell.signlink = null;
		Static1.anIntArrayArrayArray2 = null;
		JagString.aClass40_28 = null;
		aClass2_Sub2_Sub2_Sub4Array2 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ud;)V", line = 861)
	public static void method75(@OriginalArg(1) Js5Index arg0) {
		FloorOverlayType.config = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ud;ZLclient!o;Lclient!o;)Lclient!qb;", line = 890)
	public static Pix8 method77(@OriginalArg(0) Js5Index arg0, @OriginalArg(2) JagString arg1, @OriginalArg(3) JagString arg2) {
		@Pc(13) int local13 = arg0.method80(arg2);
		@Pc(19) int local19 = arg0.method72(arg1, local13);
		return Static80.method1407(local13, arg0, local19);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ud;III)[Lclient!vb;", line = 939)
	public static Pix24[] method79(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static84.method1484(arg1, arg0, arg2) ? Static35.method715() : null;
	}
}
