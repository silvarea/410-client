package jagex2;

import jagex2.graphics.Entity;
import jagex2.graphics.Model;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class2_Sub2_Sub12_Sub3 extends Entity {

	@OriginalMember(owner = "client!la", name = "kb", descriptor = "I")
	public int anInt1490;

	@OriginalMember(owner = "client!la", name = "ub", descriptor = "I")
	public int count;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)Lclient!ne;")
	@Override
	protected Model getRotatedModel() {
		return Static105.get(this.anInt1490).method713(this.count, true);
	}
}
