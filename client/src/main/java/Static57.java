import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!f;", line = 65)
	public static SeqType method1042(@OriginalArg(0) int arg0) {
		@Pc(10) SeqType local10 = (SeqType) Static1.aClass47_13.method1325((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static68.aClass5_24.fetchFile(arg0, 12);
		local10 = new SeqType();
		if (local20 != null) {
			local10.method523(new Packet(local20));
		}
		local10.method522();
		Static1.aClass47_13.method1332((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 118)
	public static void method1043() {
		Static1.aClass2_Sub2_Sub13_1 = null;
		Static1.anIntArray316 = null;
		Static1.aClass2_Sub3_Sub1_3 = null;
		JagString.aClass40_454 = null;
		JagString.aClass40_455 = null;
	}
}
