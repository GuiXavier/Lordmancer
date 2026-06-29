package mobak.b.b.a;

import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/a/y.class */
public final class y extends j {
    y() {
        super((short) -10);
        ((q) this).f190b = mobak.c.d.a(181);
    }

    public y(String str, int i) {
        super((short) -10);
        a((short) 2, (short) (mo90a() + 8), (short) (mobak.b.b.m.a.getWidth() - 4), (short) (((mobak.b.b.m.a.getHeight() - mo90a()) - r.a()) - 40), true);
        ((q) this).f190b = mobak.c.d.a(181);
        mo144g();
        ((mobak.b.b.j) this).f279a.a(str, mobak.b.b.j.f259b, false, -1);
        ((mobak.b.b.j) this).f271a = new r(null, new byte[]{51, 55}, null);
        if ((i & 1) == 1) {
            ((mobak.b.b.j) this).f271a.a(false, (byte) 101, (short) 179);
        }
        if ((i & 2) == 2) {
            ((mobak.b.b.j) this).f271a.a(false, (byte) 71, (short) 83);
        }
        if ((i & 8) == 8) {
            ((mobak.b.b.j) this).f271a.a(false, (byte) 96, (short) 259);
        }
        if ((i & 16) == 16) {
            s sVar = new s((byte) 30);
            sVar.f203a = mobak.a.a.b.f33a[86];
            sVar.a((short) 261);
            sVar.f205a = new String[]{mobak.c.d.a(262, new String[]{String.valueOf(mobak.c.f365b)})};
            sVar.f206a = new short[]{3};
            sVar.f207a = new int[]{2};
            sVar.a(mobak.c.d.a(263));
            sVar.b = mobak.a.a.b.f33a[86];
            ((mobak.b.b.j) this).f271a.a(false, sVar);
        }
    }

    @Override // mobak.b.b.a.j
    protected final boolean e() {
        mobak.b.b.m.a.g();
        return true;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final void a(Graphics graphics) {
        super.a(graphics);
        ((mobak.b.b.j) this).f279a.a(graphics, (byte) 0);
        ((mobak.b.b.j) this).f271a.a(graphics);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j, mobak.b.b.a.q, mobak.b.b.j
    public final boolean a(int i, int i2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j, mobak.b.b.a.q, mobak.b.b.j
    public final boolean b(int i, int i2, int i3) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Exception] */
    @Override // mobak.b.b.j, mobak.c.b
    public final void a(int i) {
        ?? a;
        while (i != 1) {
            if (i != 0 || (a = ((mobak.b.b.j) this).f266a.a()) != 3) {
                super.a(i);
                return;
            }
            try {
                mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[78]);
                lVar.a(((mobak.b.b.j) this).f266a.m151a(0));
                a = mobak.a.a.f15a.a(lVar);
            } catch (Exception e) {
                mobak.a.a.a((Exception) a);
            }
            i = 1;
            this = this;
        }
        mobak.b.b.m.a.m();
        ((mobak.b.b.j) this).f266a = null;
    }

    @Override // mobak.b.b.a.j, mobak.b.b.a.q, mobak.b.b.j
    public final boolean a(s sVar) {
        switch (sVar.m132a()) {
            case 96:
                mobak.b.b.m.a.a((q) new o(), true);
                return true;
            default:
                return super.a(sVar);
        }
    }
}
