package jagex2;

import jagex2.graphics.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class55 {

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "[Lclient!n;")
	private final Class37[] aClass37Array2 = new Class37[5000];

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
	private int anInt2107 = 0;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
	private int anInt2105 = 0;

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "[[I")
	private final int[][] anIntArrayArray21 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "[[I")
	private final int[][] anIntArrayArray22 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "[I")
	private final int[] anIntArray460 = new int[10000];

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
	private int anInt2118 = 0;

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "[I")
	private final int[] anIntArray461 = new int[10000];

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
	private final int maxLevel;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
	private final int anInt2103;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	private final int anInt2098;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "[[[Lclient!nd;")
	private final Class2_Sub11[][][] levelTiles;

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "[[[I")
	private final int[][][] levelTileOcclusionCycles;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "[[[I")
	private final int[][][] levelHeightMaps;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(III[[[I)V")
	public Class55(@OriginalArg(0) int maxLevel, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.maxLevel = maxLevel;
		this.anInt2103 = arg1;
		this.anInt2098 = arg2;
		this.levelTiles = new Class2_Sub11[maxLevel][arg1][arg2];
		this.levelTileOcclusionCycles = new int[maxLevel][arg1 + 1][arg2 + 1];
		this.levelHeightMaps = arg3;
		this.method1414();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ne;III)V")
	private void method1408(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub11 local14;
		@Pc(29) Model local29;
		if (arg2 < this.anInt2103) {
			local14 = this.levelTiles[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass4_1 != null && local14.aClass4_1.aClass2_Sub2_Sub12_2 instanceof Model) {
				local29 = (Model) local14.aClass4_1.aClass2_Sub2_Sub12_2;
				if (local29.vertexNormal != null) {
					this.method1456(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt2103) {
			local14 = this.levelTiles[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass4_1 != null && local14.aClass4_1.aClass2_Sub2_Sub12_2 instanceof Model) {
				local29 = (Model) local14.aClass4_1.aClass2_Sub2_Sub12_2;
				if (local29.vertexNormal != null) {
					this.method1456(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt2103 && arg3 < this.anInt2098) {
			local14 = this.levelTiles[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass4_1 != null && local14.aClass4_1.aClass2_Sub2_Sub12_2 instanceof Model) {
				local29 = (Model) local14.aClass4_1.aClass2_Sub2_Sub12_2;
				if (local29.vertexNormal != null) {
					this.method1456(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt2103 || arg3 <= 0) {
			return;
		}
		local14 = this.levelTiles[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass4_1 != null && local14.aClass4_1.aClass2_Sub2_Sub12_2 instanceof Model) {
			local29 = (Model) local14.aClass4_1.aClass2_Sub2_Sub12_2;
			if (local29.vertexNormal != null) {
				this.method1456(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!n;)V")
	private void method1409(@OriginalArg(0) Class37 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1656; local2 <= arg0.anInt1647; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1662; local6 <= arg0.anInt1665; local6++) {
				@Pc(17) Class2_Sub11 local17 = this.levelTiles[arg0.anInt1652][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1702; local21++) {
						if (local17.aClass37Array1[local21] == arg0) {
							local17.anInt1702--;
							for (local36 = local21; local36 < local17.anInt1702; local36++) {
								local17.aClass37Array1[local36] = local17.aClass37Array1[local36 + 1];
								local17.anIntArray356[local36] = local17.anIntArray356[local36 + 1];
							}
							local17.aClass37Array1[local17.anInt1702] = null;
							break;
						}
					}
					local17.anInt1699 = 0;
					for (local36 = 0; local36 < local17.anInt1702; local36++) {
						local17.anInt1699 |= local17.anIntArray356[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIILclient!jd;III)Z")
	public boolean method1410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub2_Sub12 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1443(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V")
	public void method1411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class1 local14 = local8.aClass1_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt6 = local23 + (local14.anInt6 - local23) * arg3 / 16;
			local14.anInt9 = local29 + (local14.anInt9 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Lclient!uc;")
	public Class60 method1412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass60_1;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
	public void method1413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass4_1 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
	public void method1414() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.maxLevel; local1++) {
			for (local4 = 0; local4 < this.anInt2103; local4++) {
				for (local7 = 0; local7 < this.anInt2098; local7++) {
					this.levelTiles[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static89.anInt2112; local4++) {
			for (local7 = 0; local7 < Static89.levelOccluderCount[local4]; local7++) {
				Static89.levelOccluders[local4][local7] = null;
			}
			Static89.levelOccluderCount[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2107; local7++) {
			this.aClass37Array2[local7] = null;
		}
		this.anInt2107 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static89.aClass37Array3.length; local76++) {
			Static89.aClass37Array3[local76] = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)V")
	public void method1415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass1_1 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!jd;II)V")
	public void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class4 local6 = new Class4();
		local6.aClass2_Sub2_Sub12_2 = arg4;
		local6.anInt47 = arg1 * 128 + 64;
		local6.anInt44 = arg2 * 128 + 64;
		local6.anInt40 = arg3;
		local6.anInt48 = arg5;
		local6.anInt42 = arg6;
		if (this.levelTiles[arg0][arg1][arg2] == null) {
			this.levelTiles[arg0][arg1][arg2] = new Class2_Sub11(arg0, arg1, arg2);
		}
		this.levelTiles[arg0][arg1][arg2].aClass4_1 = local6;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.levelTileOcclusionCycles[arg0][local17][local21] == -Static89.anInt2094) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.levelHeightMaps[arg0][arg1][arg3] - arg5;
			if (!this.method1435(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1435(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1435(local21, local167, local195)) {
				return false;
			} else if (this.method1435(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1426(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1435(local17 + 1, this.levelHeightMaps[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1435(local17 + 128 - 1, this.levelHeightMaps[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1435(local17 + 128 - 1, this.levelHeightMaps[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1435(local17 + 1, this.levelHeightMaps[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIII)V")
	public void method1418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 != null) {
			this.levelTiles[arg0][arg1][arg2].anInt1708 = arg3;
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(III)I")
	public int method1419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		return local8 == null || local8.aClass1_1 == null ? 0 : local8.aClass1_1.anInt17;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public void method1421(@OriginalArg(0) int arg0) {
		this.anInt2105 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2103; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2098; local7++) {
				if (this.levelTiles[arg0][local4][local7] == null) {
					this.levelTiles[arg0][local4][local7] = new Class2_Sub11(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(III)V")
	public void method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1702; local13++) {
			@Pc(19) Class37 local19 = local8.aClass37Array1[local13];
			if ((local19.anInt1644 >> 29 & 0x3) == 2 && local19.anInt1656 == arg1 && local19.anInt1662 == arg2) {
				this.method1409(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIILclient!jd;IIZ)Z")
	public boolean method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub2_Sub12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return this.method1443(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(III)Z")
	private boolean method1426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.levelTileOcclusionCycles[arg0][arg1][arg2];
		if (local8 == -Static89.anInt2094) {
			return false;
		} else if (local8 == Static89.anInt2094) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1435(local23 + 1, this.levelHeightMaps[arg0][arg1][arg2], local27 + 1) && this.method1435(local23 + 128 - 1, this.levelHeightMaps[arg0][arg1 + 1][arg2], local27 + 1) && this.method1435(local23 + 128 - 1, this.levelHeightMaps[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1435(local23 + 1, this.levelHeightMaps[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.levelTileOcclusionCycles[arg0][arg1][arg2] = Static89.anInt2094;
				return true;
			} else {
				this.levelTileOcclusionCycles[arg0][arg1][arg2] = -Static89.anInt2094;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!jd;ILclient!jd;Lclient!jd;)V")
	public void method1427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub2_Sub12 arg6, @OriginalArg(7) Class2_Sub2_Sub12 arg7) {
		@Pc(3) Class51 local3 = new Class51();
		local3.aClass2_Sub2_Sub12_6 = arg4;
		local3.anInt1969 = arg1 * 128 + 64;
		local3.anInt1954 = arg2 * 128 + 64;
		local3.anInt1951 = arg3;
		local3.anInt1964 = arg5;
		local3.aClass2_Sub2_Sub12_4 = arg6;
		local3.aClass2_Sub2_Sub12_5 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class2_Sub11 local43 = this.levelTiles[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1702; local47++) {
				if ((local43.aClass37Array1[local47].anInt1655 & 0x100) == 256 && local43.aClass37Array1[local47].aClass2_Sub2_Sub12_3 instanceof Model) {
					@Pc(71) Model local71 = (Model) local43.aClass37Array1[local47].aClass2_Sub2_Sub12_3;
					local71.method1135();
					if (local71.maxY > local34) {
						local34 = local71.maxY;
					}
				}
			}
		}
		local3.anInt1959 = local34;
		if (this.levelTiles[arg0][arg1][arg2] == null) {
			this.levelTiles[arg0][arg1][arg2] = new Class2_Sub11(arg0, arg1, arg2);
		}
		this.levelTiles[arg0][arg1][arg2].aClass51_1 = local3;
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(III)Lclient!a;")
	public Class1 method1428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass1_1;
	}

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "(III)I")
	public int method1429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1702; local14++) {
			@Pc(20) Class37 local20 = local8.aClass37Array1[local14];
			if ((local20.anInt1644 >> 29 & 0x3) == 2 && local20.anInt1656 == arg1 && local20.anInt1662 == arg2) {
				return local20.anInt1644;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIII)V")
	public void method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2103 * 128) {
			arg0 = this.anInt2103 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2098 * 128) {
			arg2 = this.anInt2098 * 128 - 1;
		}
		Static89.anInt2094++;
		Static89.anInt2114 = Static71.sin[arg3];
		Static89.anInt2104 = Static71.cos[arg3];
		Static89.anInt2099 = Static71.sin[arg4];
		Static89.anInt2101 = Static71.cos[arg4];
		Static89.aBooleanArrayArray1 = Static89.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static89.anInt2091 = arg0;
		Static89.anInt2113 = arg1;
		Static89.anInt2110 = arg2;
		Static89.anInt2102 = arg0 / 128;
		Static89.anInt2093 = arg2 / 128;
		Static89.anInt2095 = arg5;
		Static89.anInt2115 = Static89.anInt2102 - 25;
		if (Static89.anInt2115 < 0) {
			Static89.anInt2115 = 0;
		}
		Static89.anInt2109 = Static89.anInt2093 - 25;
		if (Static89.anInt2109 < 0) {
			Static89.anInt2109 = 0;
		}
		Static89.anInt2108 = Static89.anInt2102 + 25;
		if (Static89.anInt2108 > this.anInt2103) {
			Static89.anInt2108 = this.anInt2103;
		}
		Static89.anInt2117 = Static89.anInt2093 + 25;
		if (Static89.anInt2117 > this.anInt2098) {
			Static89.anInt2117 = this.anInt2098;
		}
		this.method1455();
		Static89.anInt2097 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2105; local128 < this.maxLevel; local128++) {
			@Pc(134) Class2_Sub11[][] local134 = this.levelTiles[local128];
			for (local136 = Static89.anInt2115; local136 < Static89.anInt2108; local136++) {
				for (local139 = Static89.anInt2109; local139 < Static89.anInt2117; local139++) {
					@Pc(146) Class2_Sub11 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1708 <= arg5 && (Static89.aBooleanArrayArray1[local136 + 25 - Static89.anInt2102][local139 + 25 - Static89.anInt2093] || this.levelHeightMaps[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean135 = true;
							local146.aBoolean136 = true;
							if (local146.anInt1702 > 0) {
								local146.aBoolean134 = true;
							} else {
								local146.aBoolean134 = false;
							}
							Static89.anInt2097++;
						} else {
							local146.aBoolean135 = false;
							local146.aBoolean136 = false;
							local146.anInt1698 = 0;
						}
					}
				}
			}
		}
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(254) int local254;
		@Pc(258) int local258;
		@Pc(237) int local237;
		for (@Pc(224) int local224 = this.anInt2105; local224 < this.maxLevel; local224++) {
			@Pc(230) Class2_Sub11[][] local230 = this.levelTiles[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static89.anInt2102 + local139;
				local241 = Static89.anInt2102 - local139;
				if (local237 >= Static89.anInt2115 || local241 < Static89.anInt2108) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static89.anInt2093 + local249;
						local258 = Static89.anInt2093 - local249;
						@Pc(270) Class2_Sub11 local270;
						if (local237 >= Static89.anInt2115) {
							if (local254 >= Static89.anInt2109) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean135) {
									this.method1451(local270, true);
								}
							}
							if (local258 < Static89.anInt2117) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean135) {
									this.method1451(local270, true);
								}
							}
						}
						if (local241 < Static89.anInt2108) {
							if (local254 >= Static89.anInt2109) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean135) {
									this.method1451(local270, true);
								}
							}
							if (local258 < Static89.anInt2117) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean135) {
									this.method1451(local270, true);
								}
							}
						}
						if (Static89.anInt2097 == 0) {
							Static89.aBoolean162 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2105; local136 < this.maxLevel; local136++) {
			@Pc(361) Class2_Sub11[][] local361 = this.levelTiles[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static89.anInt2102 + local237;
				local249 = Static89.anInt2102 - local237;
				if (local241 >= Static89.anInt2115 || local249 < Static89.anInt2108) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static89.anInt2093 + local254;
						@Pc(389) int local389 = Static89.anInt2093 - local254;
						@Pc(401) Class2_Sub11 local401;
						if (local241 >= Static89.anInt2115) {
							if (local258 >= Static89.anInt2109) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean135) {
									this.method1451(local401, false);
								}
							}
							if (local389 < Static89.anInt2117) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean135) {
									this.method1451(local401, false);
								}
							}
						}
						if (local249 < Static89.anInt2108) {
							if (local258 >= Static89.anInt2109) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean135) {
									this.method1451(local401, false);
								}
							}
							if (local389 < Static89.anInt2117) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean135) {
									this.method1451(local401, false);
								}
							}
						}
						if (Static89.anInt2097 == 0) {
							Static89.aBoolean162 = false;
							return;
						}
					}
				}
			}
		}
		Static89.aBoolean162 = false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([IIIIII)V")
	public void method1432(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class50 local14 = local8.aClass50_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1941;
			if (local19 != 0) {
				for (local24 = 0; local24 < 4; local24++) {
					arg0[arg1] = local19;
					arg0[arg1 + 1] = local19;
					arg0[arg1 + 2] = local19;
					arg0[arg1 + 3] = local19;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(59) Class39 local59 = local8.aClass39_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1680;
		@Pc(68) int local68 = local59.anInt1678;
		@Pc(71) int local71 = local59.anInt1679;
		@Pc(74) int local74 = local59.anInt1677;
		@Pc(79) int[] local79 = this.anIntArrayArray21[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray22[local68];
		@Pc(86) int local86 = 0;
		@Pc(90) int local90;
		if (local71 != 0) {
			for (local90 = 0; local90 < 4; local90++) {
				arg0[arg1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 2] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 3] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg1 += 512;
			}
			return;
		}
		for (local90 = 0; local90 < 4; local90++) {
			if (local79[local84[local86++]] != 0) {
				arg0[arg1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 2] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 3] = local74;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "(III)V")
	public void method1434() {
		for (@Pc(1) int local1 = 0; local1 < this.maxLevel; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2103; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2098; local7++) {
					@Pc(17) Class2_Sub11 local17 = this.levelTiles[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class60 local22 = local17.aClass60_1;
						if (local22 != null && local22.aClass2_Sub2_Sub12_7 instanceof Model) {
							@Pc(32) Model local32 = (Model) local22.aClass2_Sub2_Sub12_7;
							if (local32.vertexNormal != null) {
								this.method1442(local32, local1, local4, local7, 1, 1);
								if (local22.aClass2_Sub2_Sub12_8 instanceof Model) {
									@Pc(51) Model local51 = (Model) local22.aClass2_Sub2_Sub12_8;
									if (local51.vertexNormal != null) {
										this.method1442(local51, local1, local4, local7, 1, 1);
										this.method1456(local32, local51, 0, 0, 0, false);
										local51.method1158();
									}
								}
								local32.method1158();
							}
						}
						@Pc(98) Model local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt1702; local82++) {
							@Pc(88) Class37 local88 = local17.aClass37Array1[local82];
							if (local88 != null && local88.aClass2_Sub2_Sub12_3 instanceof Model) {
								local98 = (Model) local88.aClass2_Sub2_Sub12_3;
								if (local98.vertexNormal != null) {
									this.method1442(local98, local1, local4, local7, local88.anInt1647 + 1 - local88.anInt1656, local88.anInt1665 - local88.anInt1662 + 1);
									local98.method1158();
								}
							}
						}
						@Pc(134) Class4 local134 = local17.aClass4_1;
						if (local134 != null && local134.aClass2_Sub2_Sub12_2 instanceof Model) {
							local98 = (Model) local134.aClass2_Sub2_Sub12_2;
							if (local98.vertexNormal != null) {
								this.method1408(local98, local1, local4, local7);
								local98.method1158();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "(III)Z")
	private boolean method1435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static89.anInt2116; local1++) {
			@Pc(6) Occluder local6 = Static89.aClass54Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2075 == 1) {
				local15 = local6.anInt2074 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2076 + (local6.anInt2068 * local15 >> 8);
					local37 = local6.anInt2088 + (local6.anInt2081 * local15 >> 8);
					local47 = local6.anInt2090 + (local6.anInt2080 * local15 >> 8);
					local57 = local6.anInt2086 + (local6.anInt2079 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2075 == 2) {
				local15 = arg0 - local6.anInt2074;
				if (local15 > 0) {
					local27 = local6.anInt2076 + (local6.anInt2068 * local15 >> 8);
					local37 = local6.anInt2088 + (local6.anInt2081 * local15 >> 8);
					local47 = local6.anInt2090 + (local6.anInt2080 * local15 >> 8);
					local57 = local6.anInt2086 + (local6.anInt2079 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2075 == 3) {
				local15 = local6.anInt2076 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2074 + (local6.anInt2085 * local15 >> 8);
					local37 = local6.anInt2084 + (local6.anInt2087 * local15 >> 8);
					local47 = local6.anInt2090 + (local6.anInt2080 * local15 >> 8);
					local57 = local6.anInt2086 + (local6.anInt2079 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2075 == 4) {
				local15 = arg2 - local6.anInt2076;
				if (local15 > 0) {
					local27 = local6.anInt2074 + (local6.anInt2085 * local15 >> 8);
					local37 = local6.anInt2084 + (local6.anInt2087 * local15 >> 8);
					local47 = local6.anInt2090 + (local6.anInt2080 * local15 >> 8);
					local57 = local6.anInt2086 + (local6.anInt2079 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2075 == 5) {
				local15 = arg1 - local6.anInt2090;
				if (local15 > 0) {
					local27 = local6.anInt2074 + (local6.anInt2085 * local15 >> 8);
					local37 = local6.anInt2084 + (local6.anInt2087 * local15 >> 8);
					local47 = local6.anInt2076 + (local6.anInt2068 * local15 >> 8);
					local57 = local6.anInt2088 + (local6.anInt2081 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "(III)Lclient!n;")
	public Class37 method1436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1702; local14++) {
			@Pc(20) Class37 local20 = local8.aClass37Array1[local14];
			if ((local20.anInt1644 >> 29 & 0x3) == 2 && local20.anInt1656 == arg1 && local20.anInt1662 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "(III)V")
	public void method1437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass51_1 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class50 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class50(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.levelTiles[local14][arg1][arg2] == null) {
					this.levelTiles[local14][arg1][arg2] = new Class2_Sub11(local14, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].aClass50_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class50(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.levelTiles[local14][arg1][arg2] == null) {
					this.levelTiles[local14][arg1][arg2] = new Class2_Sub11(local14, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].aClass50_1 = local12;
		} else {
			@Pc(140) Class39 local140 = new Class39(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.levelTiles[local14][arg1][arg2] == null) {
					this.levelTiles[local14][arg1][arg2] = new Class2_Sub11(local14, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].aClass39_1 = local140;
		}
	}

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "(III)V")
	public void method1439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass60_1 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!jd;Lclient!jd;IIII)V")
	public void method1440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub12 arg4, @OriginalArg(5) Class2_Sub2_Sub12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class60 local8 = new Class60();
		local8.anInt2369 = arg8;
		local8.anInt2365 = arg9;
		local8.anInt2362 = arg1 * 128 + 64;
		local8.anInt2363 = arg2 * 128 + 64;
		local8.anInt2361 = arg3;
		local8.aClass2_Sub2_Sub12_7 = arg4;
		local8.aClass2_Sub2_Sub12_8 = arg5;
		local8.anInt2360 = arg6;
		local8.anInt2364 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.levelTiles[local45][arg1][arg2] == null) {
				this.levelTiles[local45][arg1][arg2] = new Class2_Sub11(local45, arg1, arg2);
			}
		}
		this.levelTiles[arg0][arg1][arg2].aClass60_1 = local8;
	}

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "(III)Lclient!ac;")
	public Class4 method1441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		return local8 == null || local8.aClass4_1 == null ? null : local8.aClass4_1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ne;IIIII)V")
	private void method1442(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.maxLevel) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2103) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2098 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub11 local66 = this.levelTiles[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.levelHeightMaps[local17][local24][local34] + this.levelHeightMaps[local17][local24 + 1][local34] + this.levelHeightMaps[local17][local24][local34 + 1] + this.levelHeightMaps[local17][local24 + 1][local34 + 1]) / 4 - (this.levelHeightMaps[arg1][arg2][arg3] + this.levelHeightMaps[arg1][arg2 + 1][arg3] + this.levelHeightMaps[arg1][arg2][arg3 + 1] + this.levelHeightMaps[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class60 local163 = local66.aClass60_1;
									if (local163 != null) {
										@Pc(173) Model local173;
										if (local163.aClass2_Sub2_Sub12_7 instanceof Model) {
											local173 = (Model) local163.aClass2_Sub2_Sub12_7;
											if (local173.vertexNormal != null) {
												this.method1456(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass2_Sub2_Sub12_8 instanceof Model) {
											local173 = (Model) local163.aClass2_Sub2_Sub12_8;
											if (local173.vertexNormal != null) {
												this.method1456(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt1702; local245++) {
										@Pc(251) Class37 local251 = local66.aClass37Array1[local245];
										if (local251 != null && local251.aClass2_Sub2_Sub12_3 instanceof Model) {
											@Pc(261) Model local261 = (Model) local251.aClass2_Sub2_Sub12_3;
											if (local261.vertexNormal != null) {
												@Pc(272) int local272 = local251.anInt1647 + 1 - local251.anInt1656;
												@Pc(280) int local280 = local251.anInt1665 + 1 - local251.anInt1662;
												this.method1456(arg0, local261, (local251.anInt1656 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt1662 - arg3) * 128 + (local280 - arg5) * 64, local1);
											}
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIILclient!jd;IZII)Z")
	private boolean method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub2_Sub12 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2103 || local4 >= this.anInt2098) {
					return false;
				}
				@Pc(28) Class2_Sub11 local28 = this.levelTiles[arg0][local1][local4];
				if (local28 != null && local28.anInt1702 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class37 local52 = new Class37();
		local52.anInt1644 = arg11;
		local52.anInt1655 = arg12;
		local52.anInt1652 = arg0;
		local52.anInt1650 = arg5;
		local52.anInt1658 = arg6;
		local52.anInt1657 = arg7;
		local52.aClass2_Sub2_Sub12_3 = arg8;
		local52.anInt1666 = arg9;
		local52.anInt1656 = arg1;
		local52.anInt1662 = arg2;
		local52.anInt1647 = arg1 + arg3 - 1;
		local52.anInt1665 = arg2 + arg4 - 1;
		for (@Pc(98) int local98 = arg1; local98 < arg1 + arg3; local98++) {
			for (@Pc(101) int local101 = arg2; local101 < arg2 + arg4; local101++) {
				@Pc(104) int local104 = 0;
				if (local98 > arg1) {
					local104++;
				}
				if (local98 < arg1 + arg3 - 1) {
					local104 += 4;
				}
				if (local101 > arg2) {
					local104 += 8;
				}
				if (local101 < arg2 + arg4 - 1) {
					local104 += 2;
				}
				for (@Pc(130) int local130 = arg0; local130 >= 0; local130--) {
					if (this.levelTiles[local130][local98][local101] == null) {
						this.levelTiles[local130][local98][local101] = new Class2_Sub11(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub11 local166 = this.levelTiles[arg0][local98][local101];
				local166.aClass37Array1[local166.anInt1702] = local52;
				local166.anIntArray356[local166.anInt1702] = local104;
				local166.anInt1699 |= local104;
				local166.anInt1702++;
			}
		}
		if (arg10) {
			this.aClass37Array2[this.anInt2107++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIII)Z")
	private boolean method1445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1426(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.levelHeightMaps[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static89.anInt2091) {
					if (!this.method1435(local11, local26, local15)) {
						return false;
					}
					if (!this.method1435(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1435(local11, local30, local15)) {
						return false;
					}
					if (!this.method1435(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1435(local11, local34, local15)) {
					return false;
				}
				if (!this.method1435(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static89.anInt2110) {
					if (!this.method1435(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1435(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1435(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1435(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1435(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1435(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static89.anInt2091) {
					if (!this.method1435(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1435(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1435(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1435(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1435(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1435(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static89.anInt2110) {
					if (!this.method1435(local11, local26, local15)) {
						return false;
					}
					if (!this.method1435(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1435(local11, local30, local15)) {
						return false;
					}
					if (!this.method1435(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1435(local11, local34, local15)) {
					return false;
				}
				if (!this.method1435(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1435(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1435(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1435(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1435(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1435(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!jd;IIIIII)V")
	public void method1446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class1 local6 = new Class1();
		local6.anInt17 = arg9;
		local6.anInt2 = arg10;
		local6.anInt6 = arg1 * 128 + arg7 + 64;
		local6.anInt9 = arg2 * 128 + arg8 + 64;
		local6.anInt3 = arg3;
		local6.aClass2_Sub2_Sub12_1 = arg4;
		local6.anInt4 = arg5;
		local6.anInt1 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.levelTiles[local44][arg1][arg2] == null) {
				this.levelTiles[local44][arg1][arg2] = new Class2_Sub11(local44, arg1, arg2);
			}
		}
		this.levelTiles[arg0][arg1][arg2].aClass1_1 = local6;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(IIII)Z")
	private boolean method1447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1426(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1435(local11 + 1, this.levelHeightMaps[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1435(local11 + 128 - 1, this.levelHeightMaps[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1435(local11 + 128 - 1, this.levelHeightMaps[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1435(local11 + 1, this.levelHeightMaps[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nc;IIIIII)V")
	private void method1448(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray342.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray342[local5] - Static89.anInt2091;
			local20 = arg0.anIntArray352[local5] - Static89.anInt2113;
			local27 = arg0.anIntArray347[local5] - Static89.anInt2110;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray346 != null) {
				Static69.anIntArray354[local5] = local37;
				Static69.anIntArray351[local5] = local59;
				Static69.anIntArray348[local5] = local69;
			}
			Static69.anIntArray340[local5] = Static6.centerX + (local37 << 9) / local69;
			Static69.anIntArray345[local5] = Static6.centerY + (local59 << 9) / local69;
		}
		Static6.alpha = 0;
		local3 = arg0.anIntArray343.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray343[local13];
			local27 = arg0.anIntArray344[local13];
			local37 = arg0.anIntArray349[local13];
			@Pc(142) int local142 = Static69.anIntArray340[local20];
			@Pc(146) int local146 = Static69.anIntArray340[local27];
			@Pc(150) int local150 = Static69.anIntArray340[local37];
			@Pc(154) int local154 = Static69.anIntArray345[local20];
			@Pc(158) int local158 = Static69.anIntArray345[local27];
			@Pc(162) int local162 = Static69.anIntArray345[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static6.clipX = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static6.anInt222 || local146 > Static6.anInt222 || local150 > Static6.anInt222) {
					Static6.clipX = true;
				}
				if (Static89.aBoolean162 && this.method1444(Static89.anInt2092, Static89.anInt2111, local154, local158, local162, local142, local146, local150)) {
					Static89.anInt2100 = arg5;
					Static89.anInt2096 = arg6;
				}
				if (arg0.anIntArray346 == null || arg0.anIntArray346[local13] == -1) {
					if (arg0.anIntArray341[local13] != 12345678) {
						Static6.fillGouraudTriangle(local154, local158, local162, local142, local146, local150, arg0.anIntArray341[local13], arg0.anIntArray353[local13], arg0.anIntArray350[local13]);
					}
				} else if (Static89.aBoolean163) {
					@Pc(364) int local364 = Static6.anInterface4_1.method396(arg0.anIntArray346[local13]);
					Static6.fillGouraudTriangle(local154, local158, local162, local142, local146, local150, Static89.method1420(local364, arg0.anIntArray341[local13]), Static89.method1420(local364, arg0.anIntArray353[local13]), Static89.method1420(local364, arg0.anIntArray350[local13]));
				} else if (arg0.aBoolean133) {
					Static6.fillTexturedTriangle(local154, local158, local162, local142, local146, local150, arg0.anIntArray341[local13], arg0.anIntArray353[local13], arg0.anIntArray350[local13], Static69.anIntArray354[0], Static69.anIntArray354[1], Static69.anIntArray354[3], Static69.anIntArray351[0], Static69.anIntArray351[1], Static69.anIntArray351[3], Static69.anIntArray348[0], Static69.anIntArray348[1], Static69.anIntArray348[3], arg0.anIntArray346[local13]);
				} else {
					Static6.fillTexturedTriangle(local154, local158, local162, local142, local146, local150, arg0.anIntArray341[local13], arg0.anIntArray353[local13], arg0.anIntArray350[local13], Static69.anIntArray354[local20], Static69.anIntArray354[local27], Static69.anIntArray354[local37], Static69.anIntArray351[local20], Static69.anIntArray351[local27], Static69.anIntArray351[local37], Static69.anIntArray348[local20], Static69.anIntArray348[local27], Static69.anIntArray348[local37], arg0.anIntArray346[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(IIII)I")
	public int method1449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass60_1 != null && local8.aClass60_1.anInt2369 == arg3) {
			return local8.aClass60_1.anInt2365 & 0xFF;
		} else if (local8.aClass1_1 != null && local8.aClass1_1.anInt17 == arg3) {
			return local8.aClass1_1.anInt2 & 0xFF;
		} else if (local8.aClass4_1 != null && local8.aClass4_1.anInt48 == arg3) {
			return local8.aClass4_1.anInt42 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1702; local56++) {
				if (local8.aClass37Array1[local56].anInt1644 == arg3) {
					return local8.aClass37Array1[local56].anInt1655 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V")
	public void method1450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static89.aBoolean162 = true;
		Static89.anInt2092 = arg0;
		Static89.anInt2111 = arg1;
		Static89.anInt2100 = -1;
		Static89.anInt2096 = -1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nd;Z)V")
	private void method1451(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) boolean arg1) {
		Static89.aClass44_6.method1221(arg0);
		while (true) {
			@Pc(8) Class2_Sub11 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub11[][] local31;
			@Pc(49) Class2_Sub11 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class60 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class37 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class2_Sub11 var35;
										while (true) {
											do {
												local8 = (Class2_Sub11) Static89.aClass44_6.method1220();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean136);
											local17 = local8.anInt1700;
											local20 = local8.anInt1707;
											local23 = local8.anInt1705;
											local26 = local8.anInt1703;
											local31 = this.levelTiles[local23];
											if (!local8.aBoolean135) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.levelTiles[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean136) {
														continue;
													}
												}
												if (local17 <= Static89.anInt2102 && local17 > Static89.anInt2115) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean136 && (local49.aBoolean135 || (local8.anInt1699 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static89.anInt2102 && local17 < Static89.anInt2108 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean136 && (local49.aBoolean135 || (local8.anInt1699 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static89.anInt2093 && local20 > Static89.anInt2109) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean136 && (local49.aBoolean135 || (local8.anInt1699 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static89.anInt2093 && local20 < Static89.anInt2117 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean136 && (local49.aBoolean135 || (local8.anInt1699 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean135 = false;
											if (local8.aClass2_Sub11_1 != null) {
												local49 = local8.aClass2_Sub11_1;
												if (local49.aClass50_1 == null) {
													if (local49.aClass39_1 != null && !this.method1426(0, local17, local20)) {
														this.method1448(local49.aClass39_1, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local17, local20);
													}
												} else if (!this.method1426(0, local17, local20)) {
													this.method1452(local49.aClass50_1, 0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local17, local20);
												}
												@Pc(225) Class60 local225 = local49.aClass60_1;
												if (local225 != null) {
													local225.aClass2_Sub2_Sub12_7.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local225.anInt2362 - Static89.anInt2091, local225.anInt2361 - Static89.anInt2113, local225.anInt2363 - Static89.anInt2110, local225.anInt2369);
												}
												for (local251 = 0; local251 < local49.anInt1702; local251++) {
													var12 = local49.aClass37Array1[local251];
													if (var12 != null) {
														var12.aClass2_Sub2_Sub12_3.method1536(var12.anInt1666, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, var12.anInt1650 - Static89.anInt2091, var12.anInt1657 - Static89.anInt2113, var12.anInt1658 - Static89.anInt2110, var12.anInt1644);
													}
												}
											}
											var24 = false;
											if (local8.aClass50_1 == null) {
												if (local8.aClass39_1 != null && !this.method1426(local26, local17, local20)) {
													var24 = true;
													this.method1448(local8.aClass39_1, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local17, local20);
												}
											} else if (!this.method1426(local26, local17, local20)) {
												var24 = true;
												this.method1452(local8.aClass50_1, local26, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class60 local340 = local8.aClass60_1;
											@Pc(343) Class1 local343 = local8.aClass1_1;
											if (local340 != null || local343 != null) {
												if (Static89.anInt2102 == local17) {
													var23++;
												} else if (Static89.anInt2102 < local17) {
													var23 += 2;
												}
												if (Static89.anInt2093 == local20) {
													var23 += 3;
												} else if (Static89.anInt2093 > local20) {
													var23 += 6;
												}
												local251 = Static89.anIntArray468[var23];
												local8.anInt1706 = Static89.anIntArray464[var23];
											}
											if (local340 != null) {
												if ((local340.anInt2360 & Static89.anIntArray463[var23]) == 0) {
													local8.anInt1698 = 0;
												} else if (local340.anInt2360 == 16) {
													local8.anInt1698 = 3;
													local8.anInt1704 = Static89.anIntArray466[var23];
													local8.anInt1701 = 3 - local8.anInt1704;
												} else if (local340.anInt2360 == 32) {
													local8.anInt1698 = 6;
													local8.anInt1704 = Static89.anIntArray462[var23];
													local8.anInt1701 = 6 - local8.anInt1704;
												} else if (local340.anInt2360 == 64) {
													local8.anInt1698 = 12;
													local8.anInt1704 = Static89.anIntArray467[var23];
													local8.anInt1701 = 12 - local8.anInt1704;
												} else {
													local8.anInt1698 = 9;
													local8.anInt1704 = Static89.anIntArray465[var23];
													local8.anInt1701 = 9 - local8.anInt1704;
												}
												if ((local340.anInt2360 & local251) != 0 && !this.method1445(local26, local17, local20, local340.anInt2360)) {
													local340.aClass2_Sub2_Sub12_7.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local340.anInt2362 - Static89.anInt2091, local340.anInt2361 - Static89.anInt2113, local340.anInt2363 - Static89.anInt2110, local340.anInt2369);
												}
												if ((local340.anInt2364 & local251) != 0 && !this.method1445(local26, local17, local20, local340.anInt2364)) {
													local340.aClass2_Sub2_Sub12_8.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local340.anInt2362 - Static89.anInt2091, local340.anInt2361 - Static89.anInt2113, local340.anInt2363 - Static89.anInt2110, local340.anInt2369);
												}
											}
											if (local343 != null && !this.method1447(local26, local17, local20, local343.aClass2_Sub2_Sub12_1.maxY)) {
												if ((local343.anInt4 & local251) != 0) {
													local343.aClass2_Sub2_Sub12_1.method1536(local343.anInt1, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local343.anInt6 - Static89.anInt2091, local343.anInt3 - Static89.anInt2113, local343.anInt9 - Static89.anInt2110, local343.anInt17);
												} else if ((local343.anInt4 & 0x300) != 0) {
													local578 = local343.anInt6 - Static89.anInt2091;
													local583 = local343.anInt3 - Static89.anInt2113;
													local588 = local343.anInt9 - Static89.anInt2110;
													local591 = local343.anInt1;
													if (local591 == 1 || local591 == 2) {
														local600 = -local578;
													} else {
														local600 = local578;
													}
													if (local591 == 2 || local591 == 3) {
														var19 = -local588;
													} else {
														var19 = local588;
													}
													@Pc(629) int local629;
													@Pc(635) int local635;
													if ((local343.anInt4 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static89.anIntArray455[local591];
														local635 = local588 + Static89.anIntArray457[local591];
														local343.aClass2_Sub2_Sub12_1.method1536(local591 * 512 + 256, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local629, local583, local635, local343.anInt17);
													}
													if ((local343.anInt4 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static89.anIntArray456[local591];
														local635 = local588 + Static89.anIntArray459[local591];
														local343.aClass2_Sub2_Sub12_1.method1536(local591 * 512 + 1280 & 0x7FF, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local629, local583, local635, local343.anInt17);
													}
												}
											}
											if (var24) {
												@Pc(696) Class4 local696 = local8.aClass4_1;
												if (local696 != null) {
													local696.aClass2_Sub2_Sub12_2.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local696.anInt47 - Static89.anInt2091, local696.anInt40 - Static89.anInt2113, local696.anInt44 - Static89.anInt2110, local696.anInt48);
												}
												@Pc(723) Class51 local723 = local8.aClass51_1;
												if (local723 != null && local723.anInt1959 == 0) {
													if (local723.aClass2_Sub2_Sub12_4 != null) {
														local723.aClass2_Sub2_Sub12_4.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local723.anInt1969 - Static89.anInt2091, local723.anInt1951 - Static89.anInt2113, local723.anInt1954 - Static89.anInt2110, local723.anInt1964);
													}
													if (local723.aClass2_Sub2_Sub12_5 != null) {
														local723.aClass2_Sub2_Sub12_5.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local723.anInt1969 - Static89.anInt2091, local723.anInt1951 - Static89.anInt2113, local723.anInt1954 - Static89.anInt2110, local723.anInt1964);
													}
													if (local723.aClass2_Sub2_Sub12_6 != null) {
														local723.aClass2_Sub2_Sub12_6.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local723.anInt1969 - Static89.anInt2091, local723.anInt1951 - Static89.anInt2113, local723.anInt1954 - Static89.anInt2110, local723.anInt1964);
													}
												}
											}
											local578 = local8.anInt1699;
											if (local578 != 0) {
												if (local17 < Static89.anInt2102 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean136) {
														Static89.aClass44_6.method1221(var35);
													}
												}
												if (local20 < Static89.anInt2093 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean136) {
														Static89.aClass44_6.method1221(var35);
													}
												}
												if (local17 > Static89.anInt2102 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean136) {
														Static89.aClass44_6.method1221(var35);
													}
												}
												if (local20 > Static89.anInt2093 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean136) {
														Static89.aClass44_6.method1221(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt1698 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt1702; var23++) {
												if (local8.aClass37Array1[var23].anInt1648 != Static89.anInt2094 && (local8.anIntArray356[var23] & local8.anInt1698) == local8.anInt1704) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass60_1;
												if (!this.method1445(local26, local17, local20, local942.anInt2360)) {
													local942.aClass2_Sub2_Sub12_7.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local942.anInt2362 - Static89.anInt2091, local942.anInt2361 - Static89.anInt2113, local942.anInt2363 - Static89.anInt2110, local942.anInt2369);
												}
												local8.anInt1698 = 0;
											}
										}
										if (!local8.aBoolean134) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt1702;
											local8.aBoolean134 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass37Array1[local251];
												if (var12.anInt1648 != Static89.anInt2094) {
													for (local1001 = var12.anInt1656; local1001 <= var12.anInt1647; local1001++) {
														for (local578 = var12.anInt1662; local578 <= var12.anInt1665; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean135) {
																local8.aBoolean134 = true;
																continue label559;
															}
															if (var35.anInt1698 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt1656) {
																	local588++;
																}
																if (local1001 < var12.anInt1647) {
																	local588 += 4;
																}
																if (local578 > var12.anInt1662) {
																	local588 += 8;
																}
																if (local578 < var12.anInt1665) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt1698) == local8.anInt1701) {
																	local8.aBoolean134 = true;
																	continue label559;
																}
															}
														}
													}
													Static89.aClass37Array3[var23++] = var12;
													local578 = Static89.anInt2102 - var12.anInt1656;
													local583 = var12.anInt1647 - Static89.anInt2102;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static89.anInt2093 - var12.anInt1662;
													local591 = var12.anInt1665 - Static89.anInt2093;
													if (local591 > local588) {
														var12.anInt1646 = local578 + local591;
													} else {
														var12.anInt1646 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class37 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static89.aClass37Array3[local578];
													if (local1125.anInt1648 != Static89.anInt2094) {
														if (local1125.anInt1646 > local1116) {
															local1116 = local1125.anInt1646;
															local1001 = local578;
														} else if (local1125.anInt1646 == local1116) {
															local588 = local1125.anInt1650 - Static89.anInt2091;
															local591 = local1125.anInt1658 - Static89.anInt2110;
															local600 = Static89.aClass37Array3[local1001].anInt1650 - Static89.anInt2091;
															var19 = Static89.aClass37Array3[local1001].anInt1658 - Static89.anInt2110;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static89.aClass37Array3[local1001];
												local1125.anInt1648 = Static89.anInt2094;
												if (!this.method1417(local26, local1125.anInt1656, local1125.anInt1647, local1125.anInt1662, local1125.anInt1665, local1125.aClass2_Sub2_Sub12_3.maxY)) {
													local1125.aClass2_Sub2_Sub12_3.method1536(local1125.anInt1666, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local1125.anInt1650 - Static89.anInt2091, local1125.anInt1657 - Static89.anInt2113, local1125.anInt1658 - Static89.anInt2110, local1125.anInt1644);
												}
												for (local588 = local1125.anInt1656; local588 <= local1125.anInt1647; local588++) {
													for (local591 = local1125.anInt1662; local591 <= local1125.anInt1665; local591++) {
														@Pc(1250) Class2_Sub11 local1250 = local31[local588][local591];
														if (local1250.anInt1698 != 0) {
															Static89.aClass44_6.method1221(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean136) {
															Static89.aClass44_6.method1221(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean134) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean134 = false;
											break;
										}
									}
								} while (!local8.aBoolean136);
							} while (local8.anInt1698 != 0);
							if (local17 > Static89.anInt2102 || local17 <= Static89.anInt2115) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean136);
						if (local17 < Static89.anInt2102 || local17 >= Static89.anInt2108 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean136);
					if (local20 > Static89.anInt2093 || local20 <= Static89.anInt2109) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean136);
				if (local20 < Static89.anInt2093 || local20 >= Static89.anInt2117 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean136);
			local8.aBoolean136 = false;
			Static89.anInt2097--;
			@Pc(1392) Class51 local1392 = local8.aClass51_1;
			if (local1392 != null && local1392.anInt1959 != 0) {
				if (local1392.aClass2_Sub2_Sub12_4 != null) {
					local1392.aClass2_Sub2_Sub12_4.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local1392.anInt1969 - Static89.anInt2091, local1392.anInt1951 - Static89.anInt2113 - local1392.anInt1959, local1392.anInt1954 - Static89.anInt2110, local1392.anInt1964);
				}
				if (local1392.aClass2_Sub2_Sub12_5 != null) {
					local1392.aClass2_Sub2_Sub12_5.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local1392.anInt1969 - Static89.anInt2091, local1392.anInt1951 - Static89.anInt2113 - local1392.anInt1959, local1392.anInt1954 - Static89.anInt2110, local1392.anInt1964);
				}
				if (local1392.aClass2_Sub2_Sub12_6 != null) {
					local1392.aClass2_Sub2_Sub12_6.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local1392.anInt1969 - Static89.anInt2091, local1392.anInt1951 - Static89.anInt2113 - local1392.anInt1959, local1392.anInt1954 - Static89.anInt2110, local1392.anInt1964);
				}
			}
			if (local8.anInt1706 != 0) {
				@Pc(1487) Class1 local1487 = local8.aClass1_1;
				if (local1487 != null && !this.method1447(local26, local17, local20, local1487.aClass2_Sub2_Sub12_1.maxY)) {
					if ((local1487.anInt4 & local8.anInt1706) != 0) {
						local1487.aClass2_Sub2_Sub12_1.method1536(local1487.anInt1, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local1487.anInt6 - Static89.anInt2091, local1487.anInt3 - Static89.anInt2113, local1487.anInt9 - Static89.anInt2110, local1487.anInt17);
					} else if ((local1487.anInt4 & 0x300) != 0) {
						local251 = local1487.anInt6 - Static89.anInt2091;
						local1116 = local1487.anInt3 - Static89.anInt2113;
						local1001 = local1487.anInt9 - Static89.anInt2110;
						local578 = local1487.anInt1;
						if (local578 == 1 || local578 == 2) {
							local583 = -local251;
						} else {
							local583 = local251;
						}
						if (local578 == 2 || local578 == 3) {
							local588 = -local1001;
						} else {
							local588 = local1001;
						}
						if ((local1487.anInt4 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static89.anIntArray455[local578];
							local600 = local1001 + Static89.anIntArray457[local578];
							local1487.aClass2_Sub2_Sub12_1.method1536(local578 * 512 + 256, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local591, local1116, local600, local1487.anInt17);
						}
						if ((local1487.anInt4 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static89.anIntArray456[local578];
							local600 = local1001 + Static89.anIntArray459[local578];
							local1487.aClass2_Sub2_Sub12_1.method1536(local578 * 512 + 1280 & 0x7FF, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local591, local1116, local600, local1487.anInt17);
						}
					}
				}
				local942 = local8.aClass60_1;
				if (local942 != null) {
					if ((local942.anInt2364 & local8.anInt1706) != 0 && !this.method1445(local26, local17, local20, local942.anInt2364)) {
						local942.aClass2_Sub2_Sub12_8.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local942.anInt2362 - Static89.anInt2091, local942.anInt2361 - Static89.anInt2113, local942.anInt2363 - Static89.anInt2110, local942.anInt2369);
					}
					if ((local942.anInt2360 & local8.anInt1706) != 0 && !this.method1445(local26, local17, local20, local942.anInt2360)) {
						local942.aClass2_Sub2_Sub12_7.method1536(0, Static89.anInt2114, Static89.anInt2104, Static89.anInt2099, Static89.anInt2101, local942.anInt2362 - Static89.anInt2091, local942.anInt2361 - Static89.anInt2113, local942.anInt2363 - Static89.anInt2110, local942.anInt2369);
					}
				}
			}
			@Pc(1745) Class2_Sub11 local1745;
			if (local23 < this.maxLevel - 1) {
				local1745 = this.levelTiles[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean136) {
					Static89.aClass44_6.method1221(local1745);
				}
			}
			if (local17 < Static89.anInt2102) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean136) {
					Static89.aClass44_6.method1221(local1745);
				}
			}
			if (local20 < Static89.anInt2093) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean136) {
					Static89.aClass44_6.method1221(local1745);
				}
			}
			if (local17 > Static89.anInt2102) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean136) {
					Static89.aClass44_6.method1221(local1745);
				}
			}
			if (local20 > Static89.anInt2093) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean136) {
					Static89.aClass44_6.method1221(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ra;IIIIIII)V")
	private void method1452(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static89.anInt2091;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static89.anInt2110;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.levelHeightMaps[arg1][arg6][arg7] - Static89.anInt2113;
		@Pc(51) int local51 = this.levelHeightMaps[arg1][arg6 + 1][arg7] - Static89.anInt2113;
		@Pc(66) int local66 = this.levelHeightMaps[arg1][arg6 + 1][arg7 + 1] - Static89.anInt2113;
		@Pc(79) int local79 = this.levelHeightMaps[arg1][arg6][arg7 + 1] - Static89.anInt2113;
		@Pc(89) int local89 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(99) int local99 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(101) int local101 = local89;
		@Pc(111) int local111 = local38 * arg3 - local99 * arg2 >> 16;
		@Pc(121) int local121 = local38 * arg2 + local99 * arg3 >> 16;
		@Pc(123) int local123 = local111;
		if (local121 < 50) {
			return;
		}
		local89 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(147) int local147 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local89;
		local89 = local51 * arg3 - local147 * arg2 >> 16;
		@Pc(169) int local169 = local51 * arg2 + local147 * arg3 >> 16;
		local51 = local89;
		if (local169 < 50) {
			return;
		}
		local89 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(197) int local197 = local89;
		local89 = local66 * arg3 - local27 * arg2 >> 16;
		local27 = local66 * arg2 + local27 * arg3 >> 16;
		local66 = local89;
		if (local27 < 50) {
			return;
		}
		local89 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(243) int local243 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(245) int local245 = local89;
		local89 = local79 * arg3 - local243 * arg2 >> 16;
		@Pc(265) int local265 = local79 * arg2 + local243 * arg3 >> 16;
		if (local265 < 50) {
			return;
		}
		@Pc(279) int local279 = Static6.centerX + (local101 << 9) / local121;
		@Pc(287) int local287 = Static6.centerY + (local123 << 9) / local121;
		@Pc(295) int local295 = Static6.centerX + (local21 << 9) / local169;
		@Pc(303) int local303 = Static6.centerY + (local51 << 9) / local169;
		@Pc(311) int local311 = Static6.centerX + (local197 << 9) / local27;
		@Pc(319) int local319 = Static6.centerY + (local66 << 9) / local27;
		@Pc(327) int local327 = Static6.centerX + (local245 << 9) / local265;
		@Pc(335) int local335 = Static6.centerY + (local89 << 9) / local265;
		Static6.alpha = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static6.clipX = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static6.anInt222 || local327 > Static6.anInt222 || local295 > Static6.anInt222) {
				Static6.clipX = true;
			}
			if (Static89.aBoolean162 && this.method1444(Static89.anInt2092, Static89.anInt2111, local319, local335, local303, local311, local327, local295)) {
				Static89.anInt2100 = arg6;
				Static89.anInt2096 = arg7;
			}
			if (arg0.anInt1945 == -1) {
				if (arg0.anInt1937 != 12345678) {
					Static6.fillGouraudTriangle(local319, local335, local303, local311, local327, local295, arg0.anInt1937, arg0.anInt1938, arg0.anInt1943);
				}
			} else if (Static89.aBoolean163) {
				local472 = Static6.anInterface4_1.method396(arg0.anInt1945);
				Static6.fillGouraudTriangle(local319, local335, local303, local311, local327, local295, Static89.method1420(local472, arg0.anInt1937), Static89.method1420(local472, arg0.anInt1938), Static89.method1420(local472, arg0.anInt1943));
			} else if (arg0.aBoolean156) {
				Static6.fillTexturedTriangle(local319, local335, local303, local311, local327, local295, arg0.anInt1937, arg0.anInt1938, arg0.anInt1943, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1945);
			} else {
				Static6.fillTexturedTriangle(local319, local335, local303, local311, local327, local295, arg0.anInt1937, arg0.anInt1938, arg0.anInt1943, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1945);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static6.clipX = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static6.anInt222 || local295 > Static6.anInt222 || local327 > Static6.anInt222) {
			Static6.clipX = true;
		}
		if (Static89.aBoolean162 && this.method1444(Static89.anInt2092, Static89.anInt2111, local287, local303, local335, local279, local295, local327)) {
			Static89.anInt2100 = arg6;
			Static89.anInt2096 = arg7;
		}
		if (arg0.anInt1945 != -1) {
			if (!Static89.aBoolean163) {
				Static6.fillTexturedTriangle(local287, local303, local335, local279, local295, local327, arg0.anInt1950, arg0.anInt1943, arg0.anInt1938, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1945);
				return;
			}
			local472 = Static6.anInterface4_1.method396(arg0.anInt1945);
			Static6.fillGouraudTriangle(local287, local303, local335, local279, local295, local327, Static89.method1420(local472, arg0.anInt1950), Static89.method1420(local472, arg0.anInt1943), Static89.method1420(local472, arg0.anInt1938));
		} else if (arg0.anInt1950 != 12345678) {
			Static6.fillGouraudTriangle(local287, local303, local335, local279, local295, local327, arg0.anInt1950, arg0.anInt1943, arg0.anInt1938);
			return;
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)V")
	public void method1453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub11 local31 = this.levelTiles[local10][arg0][arg1] = this.levelTiles[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1705--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1702; local41++) {
					@Pc(47) Class37 local47 = local31.aClass37Array1[local41];
					if ((local47.anInt1644 >> 29 & 0x3) == 2 && local47.anInt1656 == arg0 && local47.anInt1662 == arg1) {
						local47.anInt1652--;
					}
				}
			}
		}
		if (this.levelTiles[0][arg0][arg1] == null) {
			this.levelTiles[0][arg0][arg1] = new Class2_Sub11(0, arg0, arg1);
		}
		this.levelTiles[0][arg0][arg1].aClass2_Sub11_1 = local8;
		this.levelTiles[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()V")
	public void method1454() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2107; local1++) {
			@Pc(7) Class37 local7 = this.aClass37Array2[local1];
			this.method1409(local7);
			this.aClass37Array2[local1] = null;
		}
		this.anInt2107 = 0;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "()V")
	private void method1455() {
		@Pc(3) int local3 = Static89.levelOccluderCount[Static89.anInt2095];
		@Pc(7) Occluder[] local7 = Static89.levelOccluders[Static89.anInt2095];
		Static89.anInt2116 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Occluder local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2089 == 1) {
				local27 = local16.anInt2070 + 25 - Static89.anInt2102;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2069 + 25 - Static89.anInt2093;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2071 + 25 - Static89.anInt2093;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static89.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static89.anInt2091 - local16.anInt2074;
						if (local79 > 32) {
							local16.anInt2075 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2075 = 2;
							local79 = -local79;
						}
						local16.anInt2068 = (local16.anInt2076 - Static89.anInt2110 << 8) / local79;
						local16.anInt2081 = (local16.anInt2088 - Static89.anInt2110 << 8) / local79;
						local16.anInt2080 = (local16.anInt2090 - Static89.anInt2113 << 8) / local79;
						local16.anInt2079 = (local16.anInt2086 - Static89.anInt2113 << 8) / local79;
						Static89.aClass54Array1[Static89.anInt2116++] = local16;
					}
				}
			} else if (local16.anInt2089 == 2) {
				local27 = local16.anInt2069 + 25 - Static89.anInt2093;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2070 + 25 - Static89.anInt2102;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2072 + 25 - Static89.anInt2102;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static89.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static89.anInt2110 - local16.anInt2076;
						if (local79 > 32) {
							local16.anInt2075 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2075 = 4;
							local79 = -local79;
						}
						local16.anInt2085 = (local16.anInt2074 - Static89.anInt2091 << 8) / local79;
						local16.anInt2087 = (local16.anInt2084 - Static89.anInt2091 << 8) / local79;
						local16.anInt2080 = (local16.anInt2090 - Static89.anInt2113 << 8) / local79;
						local16.anInt2079 = (local16.anInt2086 - Static89.anInt2113 << 8) / local79;
						Static89.aClass54Array1[Static89.anInt2116++] = local16;
					}
				}
			} else if (local16.anInt2089 == 4) {
				local27 = local16.anInt2090 - Static89.anInt2113;
				if (local27 > 128) {
					local40 = local16.anInt2069 + 25 - Static89.anInt2093;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2071 + 25 - Static89.anInt2093;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2070 + 25 - Static89.anInt2102;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2072 + 25 - Static89.anInt2102;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static89.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2075 = 5;
							local16.anInt2085 = (local16.anInt2074 - Static89.anInt2091 << 8) / local27;
							local16.anInt2087 = (local16.anInt2084 - Static89.anInt2091 << 8) / local27;
							local16.anInt2068 = (local16.anInt2076 - Static89.anInt2110 << 8) / local27;
							local16.anInt2081 = (local16.anInt2088 - Static89.anInt2110 << 8) / local27;
							Static89.aClass54Array1[Static89.anInt2116++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ne;Lclient!ne;IIIZ)V")
	private void method1456(@OriginalArg(0) Model arg0, @OriginalArg(1) Model arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method1154();
		this.anInt2118++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.vertexX;
		@Pc(15) int local15 = arg1.vertexCount;
		for (@Pc(17) int local17 = 0; local17 < arg0.vertexCount; local17++) {
			@Pc(23) VertexNormal local23 = arg0.vertexNormal[local17];
			@Pc(28) VertexNormal local28 = arg0.vertexNormalOriginal[local17];
			if (local28.w != 0) {
				@Pc(38) int local38 = arg0.vertexY[local17] - arg3;
				if (local38 <= arg1.minY) {
					@Pc(49) int local49 = arg0.vertexX[local17] - arg2;
					if (local49 >= arg1.minX && local49 <= arg1.maxX) {
						@Pc(65) int local65 = arg0.vertexZ[local17] - arg4;
						if (local65 >= arg1.minZ && local65 <= arg1.maxZ) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) VertexNormal local82 = arg1.vertexNormal[local76];
								@Pc(87) VertexNormal local87 = arg1.vertexNormalOriginal[local76];
								if (local49 == local12[local76] && local65 == arg1.vertexZ[local76] && local38 == arg1.vertexY[local76] && local87.w != 0) {
									local23.x += local87.x;
									local23.y += local87.y;
									local23.z += local87.z;
									local23.w += local87.w;
									local82.x += local28.x;
									local82.y += local28.y;
									local82.z += local28.z;
									local82.w += local28.w;
									local9++;
									this.anIntArray461[local17] = this.anInt2118;
									this.anIntArray460[local76] = this.anInt2118;
								}
							}
						}
					}
				}
			}
		}
		if (local9 < 3 || !arg5) {
			return;
		}
		for (@Pc(193) int local193 = 0; local193 < arg0.faceCount; local193++) {
			if (this.anIntArray461[arg0.faceVertexA[local193]] == this.anInt2118 && this.anIntArray461[arg0.faceVertexB[local193]] == this.anInt2118 && this.anIntArray461[arg0.faceVertexC[local193]] == this.anInt2118) {
				arg0.faceInfo[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.faceCount; local236++) {
			if (this.anIntArray460[arg1.faceVertexA[local236]] == this.anInt2118 && this.anIntArray460[arg1.faceVertexB[local236]] == this.anInt2118 && this.anIntArray460[arg1.faceVertexC[local236]] == this.anInt2118) {
				arg1.faceInfo[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIILclient!jd;IIIIII)Z")
	public boolean method1457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub2_Sub12 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1443(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "(III)I")
	public int method1458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		return local8 == null || local8.aClass4_1 == null ? 0 : local8.aClass4_1.anInt48;
	}

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "(III)I")
	public int method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub11 local8 = this.levelTiles[arg0][arg1][arg2];
		return local8 == null || local8.aClass60_1 == null ? 0 : local8.aClass60_1.anInt2369;
	}
}
