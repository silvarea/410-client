import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!p;")
	public static PixMap aClass45_22;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!qd;")
	public static ObjectRequest aClass48_6;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lclient!p;")
	public static PixMap aClass45_23;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Lclient!p;")
	public static PixMap aClass45_24;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 62)
	public static void method1039() {
		if (client.stream != null) {
			client.stream.method730();
		}
		client.stream = null;
		Static44.method820();
		Static85.scene.method1414();
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			Static1.aClass20Array3[local22].method534();
		}
		System.gc();
		Static86.method1490();
		Static1.anInt470 = 0;
		Static1.anInt1977 = -1;
		Static7.method187(10);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ke;)V", line = 91)
	public static void method1040(@OriginalArg(1) PathingEntity arg0) {
		if (arg0.anInt2285 == 0) {
			return;
		}
		@Pc(39) int local39;
		@Pc(32) int local32;
		if (arg0.anInt2324 != -1 && arg0.anInt2324 < 32768) {
			@Pc(23) NpcEntity local23 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[arg0.anInt2324];
			if (local23 != null) {
				local32 = arg0.anInt2284 - local23.anInt2284;
				local39 = arg0.anInt2275 - local23.anInt2275;
				if (local39 != 0 || local32 != 0) {
					arg0.anInt2283 = (int) (Math.atan2((double) local39, (double) local32) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(67) int local67;
		if (arg0.anInt2324 >= 32768) {
			local67 = arg0.anInt2324 - 32768;
			if (local67 == Static1.anInt1955) {
				local67 = 2047;
			}
			@Pc(76) PlayerEntity local76 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local67];
			if (local76 != null) {
				local32 = arg0.anInt2275 - local76.anInt2275;
				@Pc(91) int local91 = arg0.anInt2284 - local76.anInt2284;
				if (local32 != 0 || local91 != 0) {
					arg0.anInt2283 = (int) (Math.atan2((double) local32, (double) local91) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2280 != 0 || arg0.anInt2292 != 0) && (arg0.anInt2309 == 0 || arg0.anInt2282 > 0)) {
			local39 = arg0.anInt2284 - (arg0.anInt2292 - Static28.anInt725 - Static28.anInt725) * 64;
			local67 = arg0.anInt2275 - (arg0.anInt2280 - Static79.anInt2058 - Static79.anInt2058) * 64;
			if (local67 != 0 || local39 != 0) {
				arg0.anInt2283 = (int) (Math.atan2((double) local67, (double) local39) * 325.949D) & 0x7FF;
			}
			arg0.anInt2280 = 0;
			arg0.anInt2292 = 0;
		}
		local67 = arg0.anInt2283 - arg0.anInt2305 & 0x7FF;
		if (local67 == 0) {
			return;
		}
		if (local67 < arg0.anInt2285 || local67 > 2048 - arg0.anInt2285) {
			arg0.anInt2305 = arg0.anInt2283;
		} else if (local67 > 1024) {
			arg0.anInt2305 -= arg0.anInt2285;
		} else {
			arg0.anInt2305 += arg0.anInt2285;
		}
		arg0.anInt2305 &= 0x7FF;
		if (arg0.anInt2318 != arg0.anInt2290 || arg0.anInt2305 == arg0.anInt2283) {
			return;
		}
		if (arg0.anInt2276 == -1) {
			arg0.anInt2318 = arg0.anInt2269;
			return;
		}
		arg0.anInt2318 = arg0.anInt2276;
		return;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 188)
	public static void method1041() {
		aClass45_22 = null;
		JagString.aClass40_449 = null;
		JagString.aClass40_444 = null;
		JagString.aClass40_446 = null;
		JagString.aClass40_452 = null;
		JagString.aClass40_451 = null;
		JagString.aClass40_445 = null;
		Static1.aByteArrayArrayArray7 = null;
		JagString.aClass40_447 = null;
		JagString.aClass40_448 = null;
		Static1.aClass47_14 = null;
		JagString.aClass40_450 = null;
		aClass45_23 = null;
		aClass48_6 = null;
		aClass45_24 = null;
		JagString.aClass40_453 = null;
	}
}
