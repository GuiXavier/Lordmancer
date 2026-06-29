package mobak.b.a;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.b.b.a.q;
import mobak.b.b.j;
import mobak.b.b.m;
import mobak.b.b.p;

/* loaded from: LordmancerL.jar:mobak/b/a/e.class */
public final class e extends a {
    private boolean c;

    /* renamed from: d, reason: collision with other field name */
    private String f105d;
    private String e;

    /* renamed from: d, reason: collision with other field name */
    private byte f107d;

    /* renamed from: e, reason: collision with other field name */
    private byte f108e;

    /* renamed from: a, reason: collision with other field name */
    public d[] f109a;
    private static boolean b = true;
    private static short a = -1;

    /* renamed from: b, reason: collision with other field name */
    private static short f102b = -1;

    /* renamed from: c, reason: collision with other field name */
    private static short f103c = -1;

    /* renamed from: b, reason: collision with other field name */
    private byte f104b = -2;
    private short d = -1;

    /* renamed from: c, reason: collision with other field name */
    private byte f106c = -1;
    private int f = -1;

    public static void a() {
        b = false;
    }

    public static void b() {
        b = true;
    }

    public static Image a(int i) {
        if (i <= 14) {
            if (a == -1) {
                a = mobak.c.a("item-1.png");
            }
            return mobak.c.a(a);
        }
        if (f102b == -1) {
            f102b = mobak.c.a("item-2.png");
        }
        return mobak.c.a(f102b);
    }

    public e(boolean z) {
        this.c = z;
    }

    @Override // mobak.b.a.a
    /* renamed from: a, reason: collision with other method in class */
    public final void mo81a(int i) {
        try {
            ((a) this).c = i;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("set_imageCode").append(e.toString()).toString());
        }
    }

    @Override // mobak.b.a.a
    public final byte e() {
        return this.f104b;
    }

    @Override // mobak.b.a.a
    /* renamed from: b, reason: collision with other method in class */
    public final short mo82b() {
        return this.d;
    }

    @Override // mobak.b.a.a
    /* renamed from: d */
    public final byte mo54d() {
        return this.f106c;
    }

    @Override // mobak.b.a.a
    public final boolean a(a aVar) {
        try {
            if (aVar.mo51b() != 2) {
                return false;
            }
            e eVar = (e) aVar;
            if (this.f == eVar.f) {
                return this.d == eVar.d;
            }
            return false;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("equal").append(e.toString()).toString());
            return false;
        }
    }

    private static void a(Graphics graphics, e eVar, short s, short s2, short s3) {
        Image a2;
        short s4 = (short) (s + 2 + 1);
        short s5 = (short) (s2 + 2);
        if ((s3 & 1) == 1) {
            q.a(graphics, (int) s, (int) s2, (s3 & 1024) == 1024 ? 2 : 1);
        } else {
            q.a(graphics, (int) s, (int) s2, 0);
        }
        if (((byte) (eVar.f104b & 1)) == 1) {
            if (f103c == -1) {
                f103c = mobak.c.a("magic.png");
            }
            a2 = mobak.c.a(f103c);
        } else {
            a2 = a(((a) eVar).c);
        }
        if (((a) eVar).c <= 14) {
            m.a(graphics, a2, ((a) eVar).c * 25, 0, 25, 23, 0, s4, s5, 0);
        } else {
            m.a(graphics, a2, (((a) eVar).c - 15) * 25, 0, 25, 23, 0, s4, s5, 0);
        }
        if ((s3 & 4) == 4) {
            a.a(graphics, s, s2, ((a) eVar).f60a);
        }
        if ((s3 & 8) == 8) {
            a.c(graphics, s, s2, eVar.f105d);
        }
        j.a.a(((a) eVar).f63b);
        int i = j.a.f370a;
        if ((s3 & 2) == 2) {
            a.a(graphics, s, s2, ((a) eVar).f63b);
        }
        if ((s3 & 16) != 0 && ((a) eVar).f61a > 0) {
            a.b(graphics, s, s2, ((a) eVar).f62a);
        }
        if ((s3 & 768) != 0) {
            a.a(graphics, s, s2, eVar.m50a((byte) (((s3 & 768) >> 8) - 1)), eVar.c);
        }
    }

    @Override // mobak.b.a.a
    /* renamed from: b */
    public final byte mo51b() {
        return (byte) 2;
    }

    @Override // mobak.b.a.a
    /* renamed from: c */
    public final byte mo53c() {
        return this.f107d;
    }

    public final void b(byte b2) {
        this.f106c = b2;
    }

    @Override // mobak.b.a.a
    public final void a(p pVar, String str, short s) {
        if (pVar == null || this.e == null || this.e.equals("")) {
            return;
        }
        try {
            if (pVar.m208a()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(((a) this).f66c).append("\n");
                pVar.a(stringBuffer.toString(), j.f259b, false, -1);
                stringBuffer.delete(0, stringBuffer.length());
                stringBuffer.append(mobak.c.d.a(18)).append(": ").append(mobak.c.d.a(m48a())).append("\n");
                pVar.a(stringBuffer.toString(), j.f259b, false, -1);
                stringBuffer.delete(0, stringBuffer.length());
                pVar.f352a += j.f259b.f370a / 2;
                if (str != null && !str.equals("")) {
                    stringBuffer.append(str).append("\n");
                    pVar.a(stringBuffer.toString(), j.f259b, false, -1);
                    stringBuffer.delete(0, stringBuffer.length());
                }
                pVar.f352a += j.f259b.f370a / 2;
                if (!m55a().equals("") && ((short) (s & 4096)) == 4096) {
                    stringBuffer.append(mobak.c.d.a(174)).append(": ").append(m55a());
                    pVar.a(stringBuffer.toString(), j.f259b, false, -1);
                    stringBuffer.delete(0, stringBuffer.length());
                }
                if (this.f109a != null && this.f109a.length > 0) {
                    stringBuffer.append(mobak.c.d.a(55)).append(":\n");
                    pVar.a(stringBuffer.toString(), j.f259b, false, -1);
                    stringBuffer.delete(0, stringBuffer.length());
                    for (byte b2 = 0; b2 < this.f109a.length; b2 = (byte) (b2 + 1)) {
                        stringBuffer.append(this.f109a[b2].f101a).append(": ");
                        if (this.f109a[b2].b > 0) {
                            stringBuffer.append("+");
                        } else {
                            stringBuffer.append("-");
                        }
                        stringBuffer.append(Math.abs(this.f109a[b2].b)).append("\n");
                        pVar.a(stringBuffer.toString(), j.f259b, false, -1);
                        stringBuffer.delete(0, stringBuffer.length());
                    }
                }
                stringBuffer.append(this.e).append("\n");
                pVar.a(stringBuffer.toString(), j.f259b, false, -1);
                stringBuffer.delete(0, stringBuffer.length());
            }
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("getDescription").append(e.toString()).toString());
        }
    }

    @Override // mobak.b.a.a
    public final void a(Graphics graphics, short s, short s2, short s3) {
        if (graphics == null) {
            return;
        }
        if ((s3 & 32) != 32) {
            a(graphics, this, s, s2, s3);
            return;
        }
        a(graphics, this, s, s2, s3);
        if ((s3 & 64) == 64) {
            if (b) {
                q.a(graphics, s, s2, !((a) this).f59a, this.f106c > 0);
            } else {
                q.a(graphics, s, s2, !((a) this).f59a, ((a) this).f59a);
            }
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("id[_id").append("\n");
        stringBuffer.append("race[_raceId").append("\n");
        stringBuffer.append("level[_level").append("\n");
        stringBuffer.append("quantity[_quantity").append("\n");
        return stringBuffer.toString();
    }

    public final void f(int i) {
        ((a) this).e = i;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void a(short s) {
        this.d = s;
        this.f105d = String.valueOf((int) s);
    }

    public final void c(byte b2) {
        this.f107d = b2;
    }

    public final void g(int i) {
        this.f = i;
    }

    public final void d(byte b2) {
        this.f104b = b2;
    }

    public final void e(byte b2) {
        this.f108e = b2;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final boolean m83b(byte b2) {
        return ((byte) (this.f108e & b2)) == b2;
    }

    @Override // mobak.b.a.a
    /* renamed from: a */
    public final boolean mo56a(byte b2) {
        return (this.f104b & b2) > 0;
    }
}
