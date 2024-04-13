import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class PlayerAppearance {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "[I")
	private int[] identikit;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "I")
	private int anInt1520;

	@OriginalMember(owner = "client!le", name = "z", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)Lclient!ne;", line = 59)
	public Model method999() {
		if (this.anInt1520 != -1) {
			return Static34.method640(this.anInt1520).method615();
		}
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			@Pc(27) int local27 = this.identikit[local20];
			if (local27 >= 256 && local27 < 512 && !Static83.method1469(local27 - 256).method1585()) {
				local18 = true;
			}
			if (local27 >= 512 && !Static97.method1669(local27 - 512).method710(this.aBoolean117)) {
				local18 = true;
			}
		}
		if (local18) {
			return null;
		}
		@Pc(74) int local74 = 0;
		@Pc(77) Model[] local77 = new Model[12];
		for (@Pc(79) int local79 = 0; local79 < 12; local79++) {
			@Pc(86) int local86 = this.identikit[local79];
			@Pc(106) Model local106;
			if (local86 >= 256 && local86 < 512) {
				local106 = Static83.method1469(local86 - 256).method1586();
				if (local106 != null) {
					local77[local74++] = local106;
				}
			}
			if (local86 >= 512) {
				local106 = Static97.method1669(local86 - 512).method714(this.aBoolean117);
				if (local106 != null) {
					local77[local74++] = local106;
				}
			}
		}
		@Pc(147) Model local147 = new Model(local77, local74);
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			if (this.anIntArray313[local149] != 0) {
				local147.method1140(Static1.anIntArrayArray6[local149][0], Static1.anIntArrayArray6[local149][this.anIntArray313[local149]]);
				if (local149 == 1) {
					local147.method1140(Static1.anIntArray501[0], Static1.anIntArray501[this.anIntArray313[local149]]);
				}
			}
		}
		return local147;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z[II[IB)V", line = 397)
	public void method1001(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static95.anInt2493; local16++) {
					@Pc(22) IdkType local22 = Static83.method1469(local16);
					if (local22 != null && !local22.aBoolean178 && local22.anInt2386 == local12 + (arg0 ? 7 : 0)) {
						arg3[Static1.anIntArray160[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean117 = arg0;
		this.anIntArray313 = arg1;
		this.anInt1520 = arg2;
		this.identikit = arg3;
		this.method1008();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZZ)V", line = 443)
	public void method1002(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean117 != arg0) {
			this.method1001(arg0, this.anIntArray313, -1, null);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZII)V", line = 477)
	public void method1004(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 && this.aBoolean117) {
			return;
		}
		@Pc(19) int local19 = this.identikit[Static1.anIntArray160[arg1]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(47) IdkType local47;
		do {
			if (arg0) {
				local19++;
				if (Static95.anInt2493 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static95.anInt2493 - 1;
				}
			}
			local47 = Static83.method1469(local19);
		} while (local47 == null || local47.aBoolean178 || (this.aBoolean117 ? 7 : 0) + arg1 != local47.anInt2386);
		this.identikit[Static1.anIntArray160[arg1]] = local19 + 256;
		this.method1008();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIBLclient!f;Lclient!f;)Lclient!ne;", line = 528)
	public Model method1005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) SeqType arg2, @OriginalArg(4) SeqType arg3) {
		if (this.anInt1520 != -1) {
			return Static34.method640(this.anInt1520).method605(arg2, arg3, arg0, arg1);
		}
		@Pc(27) int[] local27 = this.identikit;
		@Pc(35) long local35 = this.aLong101;
		if (arg2 != null && (arg2.anInt668 >= 0 || arg2.anInt664 >= 0)) {
			local27 = new int[12];
			for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
				local27[local54] = this.identikit[local54];
			}
			if (arg2.anInt668 >= 0) {
				local35 += arg2.anInt668 - this.identikit[5] << 8;
				local27[5] = arg2.anInt668;
			}
			if (arg2.anInt664 >= 0) {
				local35 += arg2.anInt664 - this.identikit[3] << 16;
				local27[3] = arg2.anInt664;
			}
		}
		@Pc(125) Model local125 = (Model) Static1.aClass47_17.method1325(local35);
		if (local125 == null) {
			@Pc(129) boolean local129 = false;
			for (@Pc(131) int local131 = 0; local131 < 12; local131++) {
				@Pc(137) int local137 = local27[local131];
				if (local137 >= 256 && local137 < 512 && !Static83.method1469(local137 - 256).method1582()) {
					local129 = true;
				}
				if (local137 >= 512 && !Static97.method1669(local137 - 512).method709(this.aBoolean117)) {
					local129 = true;
				}
			}
			if (local129) {
				if (this.aLong100 != -1L) {
					local125 = (Model) Static1.aClass47_17.method1325(this.aLong100);
				}
				if (local125 == null) {
					return null;
				}
			}
			if (local125 == null) {
				@Pc(197) Model[] local197 = new Model[12];
				@Pc(199) int local199 = 0;
				@Pc(207) int local207;
				for (@Pc(201) int local201 = 0; local201 < 12; local201++) {
					local207 = local27[local201];
					@Pc(225) Model local225;
					if (local207 >= 256 && local207 < 512) {
						local225 = Static83.method1469(local207 - 256).method1579();
						if (local225 != null) {
							local197[local199++] = local225;
						}
					}
					if (local207 >= 512) {
						local225 = Static97.method1669(local207 - 512).method718(this.aBoolean117);
						if (local225 != null) {
							local197[local199++] = local225;
						}
					}
				}
				local125 = new Model(local197, local199);
				for (local207 = 0; local207 < 5; local207++) {
					if (this.anIntArray313[local207] != 0) {
						local125.method1140(Static1.anIntArrayArray6[local207][0], Static1.anIntArrayArray6[local207][this.anIntArray313[local207]]);
						if (local207 == 1) {
							local125.method1140(Static1.anIntArray501[0], Static1.anIntArray501[this.anIntArray313[local207]]);
						}
					}
				}
				local125.method1160();
				local125.method1153(64, 850, -30, -50, -30, true);
				Static1.aClass47_17.method1332(local35, local125);
				this.aLong100 = local35;
			}
		}
		if (arg2 == null && arg3 == null) {
			return local125;
		}
		@Pc(340) Model local340;
		if (arg2 != null && arg3 != null) {
			local340 = arg2.method519(arg3, arg1, local125, arg0);
		} else if (arg2 == null) {
			local340 = arg3.method526(local125, arg1);
		} else {
			local340 = arg2.method526(local125, arg0);
		}
		return local340;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I", line = 706)
	public int method1006() {
		return this.anInt1520 == -1 ? (this.identikit[11] << 5) + (this.identikit[8] << 10) + (this.anIntArray313[4] << 20) + (this.anIntArray313[0] << 25) + (this.identikit[0] << 15) + this.identikit[1] : 305419896 - -Static34.method640(this.anInt1520).anInt762;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!eb;I)V", line = 732)
	public void method1007(@OriginalArg(0) Packet arg0) {
		arg0.p1(this.aBoolean117 ? 1 : 0);
		@Pc(31) int local31;
		for (@Pc(22) int local22 = 0; local22 < 7; local22++) {
			local31 = this.identikit[Static1.anIntArray160[local22]];
			if (local31 == 0) {
				arg0.p1(-1);
			} else {
				arg0.p1(local31 - 256);
			}
		}
		for (local31 = 0; local31 < 5; local31++) {
			arg0.p1(this.anIntArray313[local31]);
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 797)
	private void method1008() {
		@Pc(8) long local8 = this.aLong101;
		@Pc(13) int local13 = this.identikit[5];
		@Pc(18) int local18 = this.identikit[9];
		this.identikit[5] = local18;
		this.identikit[9] = local13;
		this.aLong101 = 0L;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong101 <<= 0x4;
			if (this.identikit[local33] >= 256) {
				this.aLong101 += this.identikit[local33] - 256;
			}
		}
		if (this.identikit[0] >= 256) {
			this.aLong101 += this.identikit[0] - 256 >> 4;
		}
		if (this.identikit[1] >= 256) {
			this.aLong101 += this.identikit[1] - 256 >> 8;
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			this.aLong101 <<= 0x3;
			this.aLong101 += this.anIntArray313[local109];
		}
		this.aLong101 <<= 0x1;
		this.aLong101 += this.aBoolean117 ? 1 : 0;
		this.identikit[5] = local13;
		this.identikit[9] = local18;
		if (local8 != 0L && local8 != this.aLong101) {
			Static1.aClass47_17.method1327(local8);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZ)V", line = 854)
	public void method1009(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = this.anIntArray313[arg0];
		if (arg1) {
			local11++;
			if (local11 >= Static1.anIntArrayArray6[arg0].length) {
				local11 = 0;
			}
		} else {
			local11--;
			if (local11 < 0) {
				local11 = Static1.anIntArrayArray6[arg0].length - 1;
			}
		}
		this.anIntArray313[arg0] = local11;
		this.method1008();
	}
}