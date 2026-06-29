package mobak.b.b.a;

import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/a/k.class */
public final class k extends mobak.b.b.q {
    private short c;

    public k(short s, short s2, short s3) {
        this.c = s;
        ((mobak.b.b.q) this).a = s2;
        ((mobak.b.b.q) this).b = s3;
    }

    @Override // mobak.b.b.q
    public final void a(Graphics graphics, short s, short s2, byte b) {
        short d = (short) mobak.b.b.m.d(graphics);
        short m193b = (short) mobak.b.b.m.m193b(graphics);
        mobak.b.b.m.b(graphics, (short) (((mobak.b.b.q) this).a - s), mobak.b.b.m.c(graphics), 30, mobak.b.b.m.e(graphics));
        if (((mobak.b.b.q) this).f357a == 1) {
            z.c(graphics, (short) (((mobak.b.b.q) this).a - s), (short) (((mobak.b.b.q) this).b - s2));
        } else {
            z.b(graphics, (short) (((mobak.b.b.q) this).a - s), (short) (((mobak.b.b.q) this).b - s2));
        }
        mobak.b.a.a.a(this.c, graphics, (short) (((mobak.b.b.q) this).a - s), (short) (((mobak.b.b.q) this).b - s2));
        mobak.b.b.m.b(graphics, m193b, mobak.b.b.m.c(graphics), d, mobak.b.b.m.e(graphics));
    }

    @Override // mobak.b.b.q
    /* renamed from: a */
    public final short mo204a() {
        return (short) 35;
    }

    @Override // mobak.b.b.q
    /* renamed from: b */
    public final short mo205b() {
        return (short) 30;
    }
}
