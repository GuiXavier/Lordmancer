package mobak.b.b.a;

import javax.microedition.lcdui.Graphics;
import mobak.Main2;

/* loaded from: LordmancerL.jar:mobak/b/b/a/o.class */
public final class o extends j {
    private mobak.b.a.c[] a;

    /* renamed from: a, reason: collision with other field name */
    private s f189a;
    private boolean f;

    public o(mobak.b.a.c[] cVarArr) {
        super((short) -9);
        this.f = false;
        b();
        this.a = cVarArr;
        ((j) this).c = a(true);
        ((j) this).d = (byte) 0;
        ((j) this).e = (byte) 0;
        ((mobak.b.b.j) this).f271a = new r(new byte[]{51, 81, 59, 89}, new byte[]{55}, null);
        ((mobak.b.b.j) this).f271a.a((short) 248, (byte) 81);
        mo90a();
    }

    public o() {
        super((short) -13);
        this.f = false;
        b();
        ((j) this).c = a(true);
        this.a = new mobak.b.a.c[6];
        this.a[0] = new mobak.b.a.c((short) (mobak.b.a.b.a.m76d() - 1), (byte) 0, (byte) 0, (byte) 0, "", 0);
        this.a[1] = new mobak.b.a.c((short) (mobak.b.a.b.a.m76d() + 4), (byte) 0, (byte) 0, (byte) 0, "", 0);
        this.a[2] = new mobak.b.a.c((short) 10, (byte) 0, (byte) 0, (byte) 0, "", 0);
        this.a[3] = new mobak.b.a.c((short) 11, (byte) 0, (byte) 0, (byte) 0, "", 0);
        this.a[4] = new mobak.b.a.c((short) 12, (byte) 0, (byte) 0, (byte) 0, "", 0);
        this.a[5] = new mobak.b.a.c((short) (12 + mobak.b.a.b.a.m76d()), (byte) 0, (byte) 0, (byte) 0, "", 0);
        ((mobak.b.b.j) this).f271a = new r();
        ((mobak.b.b.j) this).f271a.a(false, new s((byte) 55));
        this.f189a = new s((byte) 58);
        this.f189a.a((short) 7);
        this.f189a.a(mobak.c.d.b(257));
        ((mobak.b.b.j) this).f271a.a(true, this.f189a);
        this.f = true;
        ((mobak.b.b.j) this).f279a.a(mobak.c.d.b(258), mobak.b.b.j.f259b, (byte) 0, false, -1);
    }

    @Override // mobak.b.b.a.j
    protected final boolean e() {
        mobak.b.b.m.a.g();
        return true;
    }

    private void b() {
        a((short) 49, (short) (mo90a() + 8), (short) ((mobak.b.b.m.a.getWidth() - 32) - 29), (short) (((mobak.b.b.m.a.getHeight() - mo90a()) - r.a()) - 40), true);
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final void a(Graphics graphics) {
        if (((mobak.b.b.j) this).f279a.m208a() && !this.f) {
            c();
        }
        super.c(graphics);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j
    /* renamed from: a */
    public final mobak.b.a.a[] mo148a(byte b) {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j
    public final void a(boolean z) {
        short s = ((j) this).d;
        super.a(z);
        if (s != ((j) this).d) {
            c();
        }
    }

    private void c() {
        if (this.f) {
            return;
        }
        i();
        mobak.b.a.a a = a();
        if (a != null) {
            a(a, ((j) this).f176a[((j) this).e]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j
    public final boolean f() {
        mobak.b.a.a a = a();
        if (a == null) {
            return false;
        }
        try {
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[62], (short) 0, (short) 0);
            lVar.a((byte) 4);
            lVar.a(a.e());
            mobak.a.a.f15a.a(lVar);
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("invintation fixObject: ").append(e.getMessage()).toString());
        }
        mobak.b.b.m.a.g();
        return true;
    }

    @Override // mobak.b.b.a.j, mobak.b.b.j
    /* renamed from: a */
    public final void mo90a() {
        if (this.f) {
            return;
        }
        ((mobak.b.b.j) this).f271a.a(true, false);
        if (((j) this).d < 0 || ((j) this).e < 0 || a() == null) {
            return;
        }
        ((mobak.b.b.j) this).f271a.a(((mobak.b.a.c) a()).a(), false);
    }

    @Override // mobak.b.b.a.j, mobak.b.b.a.q, mobak.b.b.j
    public final boolean a(s sVar) {
        switch ((byte) sVar.a) {
            case 58:
                mobak.b.b.m.a("", this.f189a.f204a, "", new p(this));
                return true;
            case 59:
                if (a() == null) {
                    return false;
                }
                mobak.b.a.c cVar = (mobak.b.a.c) a();
                Main2.a.f11a = cVar.e();
                Main2.a.c((byte) 6);
                return true;
            case 89:
                if (a() == null || mobak.b.b.m.a.f296a == null) {
                    return false;
                }
                mobak.b.a.c cVar2 = (mobak.b.a.c) a();
                mobak.b.b.m.a.f296a.a(cVar2.e(), cVar2.f(), true);
                mobak.b.b.m.a.a((byte) 2);
                return true;
            default:
                return super.a(sVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j
    public final mobak.b.a.a a() {
        if (this.f) {
            return null;
        }
        return super.a();
    }
}
