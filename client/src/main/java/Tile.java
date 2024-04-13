import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Tile extends Linkable {

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
	public int anInt1698;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "Lclient!nd;")
	public Tile aClass2_Sub11_1;

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "Lclient!nc;")
	public TileOverlay aClass39_1;

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "Z")
	public boolean aBoolean134;

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "Lclient!rb;")
	public ObjStack aClass51_1;

	@OriginalMember(owner = "client!nd", name = "O", descriptor = "Z")
	public boolean aBoolean135;

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
	public int anInt1701;

	@OriginalMember(owner = "client!nd", name = "R", descriptor = "Lclient!a;")
	public WallDecoration aClass1_1;

	@OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
	public int anInt1702;

	@OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
	public int anInt1704;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "Lclient!ra;")
	public TileUnderlay aClass50_1;

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
	public int anInt1706;

	@OriginalMember(owner = "client!nd", name = "Z", descriptor = "Lclient!uc;")
	public Wall aClass60_1;

	@OriginalMember(owner = "client!nd", name = "bb", descriptor = "Lclient!ac;")
	public GroundDecoration aClass4_1;

	@OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
	public int anInt1708;

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
	public int anInt1699 = 0;

	@OriginalMember(owner = "client!nd", name = "T", descriptor = "[I")
	public final int[] anIntArray356 = new int[5];

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "[Lclient!n;")
	public final Loc[] aClass37Array1 = new Loc[5];

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
	public int anInt1705;

	@OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
	public final int anInt1703;

	@OriginalMember(owner = "client!nd", name = "cb", descriptor = "I")
	public final int anInt1707;

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
	public final int anInt1700;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V", line = 429)
	public Tile(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1703 = this.anInt1705 = arg0;
		this.anInt1707 = arg2;
		this.anInt1700 = arg1;
	}
}
