import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!ad;")
	public static Js5 spritesJs5;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_26;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 49)
	public static void method1342() {
		ObjType.aClass47_7.clear();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBIII)V", line = 60)
	public static void method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (!client.lowMemory) {
			arg1 = 0;
		}
		if (arg0 == Static51.anInt2327 && arg4 == Static45.anInt2262 && Static1.anInt786 == arg1) {
			return;
		}
		Static1.anInt786 = arg1;
		Static45.anInt2262 = arg4;
		Static51.anInt2327 = arg0;
		client.method187(25);
		Static61.method1095(false, null, JagString.aClass40_674);
		@Pc(43) int local43 = client.sceneBaseTileZ;
		client.sceneBaseTileZ = (arg4 - 6) * 8;
		@Pc(54) int local54 = client.sceneBaseTileZ - local43;
		@Pc(58) int local58 = client.sceneBaseTileX;
		client.sceneBaseTileX = arg0 * 8 - 48;
		@Pc(69) int local69 = client.sceneBaseTileX - local58;
		for (@Pc(73) int local73 = 0; local73 < 16384; local73++) {
			@Pc(79) NpcEntity local79 = client.npcs[local73];
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < 10; local83++) {
					local79.pathTileX[local83] -= local69;
					local79.pathTileZ[local83] -= local54;
				}
				local79.x -= local69 * 128;
				local79.z -= local54 * 128;
			}
		}
		for (@Pc(131) int local131 = 0; local131 < 2048; local131++) {
			@Pc(137) PlayerEntity local137 = client.players[local131];
			if (local137 != null) {
				for (@Pc(141) int local141 = 0; local141 < 10; local141++) {
					local137.pathTileX[local141] -= local69;
					local137.pathTileZ[local141] -= local54;
				}
				local137.x -= local69 * 128;
				local137.z -= local54 * 128;
			}
		}
		@Pc(187) byte local187 = 0;
		client.currentLevel = arg1;
		client.localPlayer.method1545(false, arg2, arg3);
		@Pc(197) byte local197 = 104;
		@Pc(199) byte local199 = 1;
		@Pc(201) byte local201 = 0;
		if (local69 < 0) {
			local199 = -1;
			local187 = 103;
			local197 = -1;
		}
		@Pc(211) byte local211 = 1;
		@Pc(213) byte local213 = 104;
		if (local54 < 0) {
			local211 = -1;
			local201 = 103;
			local213 = -1;
		}
		for (@Pc(226) int local226 = local187; local226 != local197; local226 += local199) {
			for (@Pc(230) int local230 = local201; local230 != local213; local230 += local211) {
				@Pc(236) int local236 = local69 + local226;
				@Pc(240) int local240 = local54 + local230;
				for (@Pc(242) int local242 = 0; local242 < 4; local242++) {
					if (local236 >= 0 && local240 >= 0 && local236 < 104 && local240 < 104) {
						client.levelObjStacks[local242][local226][local230] = client.levelObjStacks[local242][local236][local240];
					} else {
						client.levelObjStacks[local242][local226][local230] = null;
					}
				}
			}
		}
		for (@Pc(307) LocTemporary local307 = (LocTemporary) Static1.spawnedLocations.head(); local307 != null; local307 = (LocTemporary) Static1.spawnedLocations.next()) {
			local307.z -= local54;
			local307.x -= local69;
			if (local307.x < 0 || local307.z < 0 || local307.x >= 104 || local307.z >= 104) {
				local307.unlink();
			}
		}
		client.cutscene = false;
		if (client.flagSceneTileX != 0) {
			client.flagSceneTileX -= local69;
			client.flagSceneTileZ -= local54;
		}
		Static1.anInt2590 = -1;
		Static1.aClass44_8.method1222();
		Static1.aClass44_4.method1222();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V", line = 246)
	public static void method1344() {
		LocType.aClass47_11.clear();
		LocType.modelCacheStatic.clear();
		LocType.aClass47_10.clear();
		LocType.aClass47_1.clear();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BJ)V", line = 267)
	public static void method1345(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < client.ignoreCount; local17++) {
			if (arg0 == client.ignoreName37[local17]) {
				client.ignoreCount--;
				client.redrawSidebar = true;
				for (@Pc(37) int local37 = local17; local37 < client.ignoreCount; local37++) {
					client.ignoreName37[local37] = client.ignoreName37[local37 + 1];
				}
				client.out.pIsaac1(168);
				client.out.p8(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 305)
	public static void method1346() {
		JagString.aClass40_566 = null;
		JagString.aClass40_563 = null;
		JagString.aClass40_565 = null;
		aClass5_26 = null;
		spritesJs5 = null;
		JagString.aClass40_564 = null;
		JagString.aClass40_562 = null;
	}
}
