package mobak.b.a;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.b.b.a.q;
import mobak.b.b.j;
import mobak.b.b.m;
import mobak.b.b.p;

/* loaded from: LordmancerL.jar:mobak/b/a/f.class */
public final class f extends a {
    private static short a = -1;
    private static short b = -1;
    private static short c = -1;
    private static short d = -1;

    /* renamed from: b, reason: collision with other field name */
    private static byte f110b = 0;
    private static short e = -1;

    /* renamed from: c, reason: collision with other field name */
    private static byte f111c;

    /* renamed from: d, reason: collision with other field name */
    private static byte f112d;

    /* renamed from: e, reason: collision with other field name */
    private static byte f113e;
    private byte f;

    /* renamed from: f, reason: collision with other field name */
    private short f114f;
    private byte g;
    private byte h;
    private byte i;
    private byte j;
    private short n;

    /* renamed from: b, reason: collision with other field name */
    private boolean f119b;
    private short o;

    /* renamed from: l, reason: collision with other field name */
    private byte f122l;

    /* renamed from: m, reason: collision with other field name */
    private byte f124m;

    /* renamed from: n, reason: collision with other field name */
    private byte f125n;

    /* renamed from: o, reason: collision with other field name */
    private byte f126o;

    /* renamed from: a, reason: collision with other field name */
    private Vector f127a;
    private byte p;

    /* renamed from: p, reason: collision with other field name */
    private short f128p;
    private short q;

    /* renamed from: g, reason: collision with other field name */
    private int f130g;

    /* renamed from: g, reason: collision with other field name */
    private short f115g = 0;

    /* renamed from: h, reason: collision with other field name */
    private short f116h = 0;

    /* renamed from: i, reason: collision with other field name */
    private short f117i = 0;

    /* renamed from: j, reason: collision with other field name */
    private short f118j = 0;
    private short k = 0;
    private short l = 0;
    private short m = 0;

    /* renamed from: k, reason: collision with other field name */
    private byte f120k = -1;

    /* renamed from: d, reason: collision with other field name */
    private String f121d = "0";

    /* renamed from: c, reason: collision with other field name */
    private boolean f123c = false;

    /* renamed from: f, reason: collision with other field name */
    private int f129f = 0;

    private static String b(byte b2) {
        return b2 == 1 ? "\f7" : b2 == 2 ? "\f2" : "\f1";
    }

    public static Image a(byte b2) {
        if (b2 <= 3) {
            if (a == -1) {
                a = mobak.c.a("unites1.png");
            }
            return mobak.c.a(a);
        }
        if (b == -1) {
            b = mobak.c.a("unites2.png");
        }
        return mobak.c.a(b);
    }

    @Override // mobak.b.a.a
    public final byte e() {
        return this.i;
    }

    public final byte f() {
        return this.j;
    }

    public final byte g() {
        return this.h;
    }

    public final byte h() {
        return this.g;
    }

    @Override // mobak.b.a.a
    /* renamed from: b */
    public final short mo82b() {
        return this.k;
    }

    @Override // mobak.b.a.a
    public final short c() {
        return (byte) this.e;
    }

    /* renamed from: c, reason: collision with other method in class */
    public final boolean m85c() {
        return !(this.f117i == 0 && this.f118j == 0) && this.k > 0;
    }

    public final void c(boolean z) {
        this.f119b = z;
    }

    public final void a(byte b2, byte b3) {
        this.f126o = b2;
        this.g = b3;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final void m86b(byte b2) {
        this.f = b2;
    }

    public final void d(boolean z) {
    }

    public final void c(byte b2) {
        this.j = b2;
    }

    public final void d(byte b2) {
        this.i = b2;
    }

    public final void e(byte b2) {
        this.f124m = b2;
    }

    public final void a(short s) {
        this.f115g = s;
    }

    public final void b(short s) {
        this.f116h = s;
    }

    public final void c(short s) {
        this.f117i = s;
    }

    public final void d(short s) {
        this.f118j = s;
    }

    public final void f(byte b2) {
        this.f125n = b2;
    }

    public final void e(short s) {
        this.l = s;
    }

    public final void f(short s) {
        this.m = s;
    }

    public final void g(short s) {
        this.f114f = s;
    }

    public final void h(short s) {
        this.n = s;
    }

    public final void g(byte b2) {
        this.h = b2;
    }

    public final void h(byte b2) {
    }

    public final void i(byte b2) {
        this.e = b2;
    }

    public final void e(boolean z) {
        this.f123c = z;
    }

    public final void i(short s) {
        this.k = s;
    }

    public final void j(short s) {
    }

    public final void f(int i) {
        this.o = mobak.c.e.a(c() - i);
        this.f121d = String.valueOf((int) this.o);
    }

    public final void j(byte b2) {
        this.f120k = b2;
    }

    public final byte i() {
        return this.f120k;
    }

    @Override // mobak.b.a.a
    public final void a(p pVar, String str, short s) {
        if (pVar == null) {
            return;
        }
        pVar.m207c();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(((a) this).f66c);
        pVar.a(stringBuffer.toString(), j.f259b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        stringBuffer.append(mobak.c.d.a(18)).append(": ").append(mobak.c.d.a(m48a()));
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
        if (((short) (s & 2048)) == 2048) {
            stringBuffer.append(mobak.c.d.a(108)).append(": ").append((int) this.f114f).append(" ").append(mobak.c.d.a(110)).append(" ").append((int) this.n);
        } else {
            stringBuffer.append(mobak.c.d.a(108)).append(": ").append((int) this.f114f);
        }
        pVar.a(stringBuffer.toString(), j.f259b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        stringBuffer.append(mobak.c.d.a(109)).append(": ");
        if (this.f126o != 0) {
            stringBuffer.append(b(this.f126o));
        }
        stringBuffer.append((int) this.g);
        pVar.a(stringBuffer.toString(), j.f259b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        stringBuffer.append(mobak.c.d.a(111)).append(": ");
        pVar.a(stringBuffer.toString(), j.f259b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        if (this.h > 0 && this.h <= 3) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append((int) this.h);
            stringBuffer.append("  ").append(mobak.c.d.a(112, new String[]{stringBuffer2.toString()}));
        }
        if (this.h == -1) {
            stringBuffer.append("  ").append(mobak.c.d.a(114));
        }
        pVar.a(stringBuffer.toString(), j.f259b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        stringBuffer.append(mobak.c.d.a(47)).append(": ");
        pVar.a(stringBuffer.toString(), j.f259b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        String b2 = b(this.f124m);
        if (this.f117i != 0 || this.f118j != 0) {
            stringBuffer.append("  - ").append(mobak.c.d.a(115)).append(": ").append(b2).append((int) this.f117i).append(" - ").append((int) this.f118j);
            pVar.a(stringBuffer.toString(), j.f259b, false, -1);
            stringBuffer.delete(0, stringBuffer.length());
            stringBuffer.append("     ").append(mobak.c.d.a(163)).append(": ");
            stringBuffer.append((int) this.k);
            pVar.a(stringBuffer.toString(), j.f259b, false, -1);
            stringBuffer.delete(0, stringBuffer.length());
        }
        stringBuffer.append("  - ").append(mobak.c.d.a(116)).append(": ").append(b2).append((int) this.f115g).append(" - ").append((int) this.f116h);
        pVar.a(stringBuffer.toString(), j.f259b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        stringBuffer.append(mobak.c.d.a(117)).append(": ");
        if (this.f125n != 0) {
            stringBuffer.append(b(this.f125n));
        }
        stringBuffer.append((int) this.m).append(" - ").append((int) this.l);
        pVar.a(stringBuffer.toString(), j.f259b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        if (this.f127a == null || this.f127a.size() <= 0) {
            return;
        }
        stringBuffer.append(mobak.c.d.a(71)).append(": ");
        pVar.a(stringBuffer.toString(), j.f259b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 >= this.f127a.size()) {
                return;
            }
            if (this.f127a.elementAt(s3) != null) {
                String obj = this.f127a.elementAt(s3).toString();
                if (!obj.equals("")) {
                    stringBuffer.append("   ").append(obj);
                    pVar.a(stringBuffer.toString(), j.f259b, false, -1);
                    stringBuffer.delete(0, stringBuffer.length());
                }
            }
            s2 = (short) (s3 + 1);
        }
    }

    public final void c(String str) {
        if (this.f127a == null) {
            this.f127a = new Vector();
        }
        this.f127a.addElement(str);
    }

    @Override // mobak.b.a.a
    public final boolean a(a aVar) {
        return aVar != null && (aVar instanceof f) && ((f) aVar).f == this.f;
    }

    @Override // mobak.b.a.a
    /* renamed from: b */
    public final byte mo51b() {
        return (byte) 1;
    }

    public final void g(int i) {
        this.f130g = 3;
    }

    @Override // mobak.b.a.a
    public final void a(Graphics graphics, short s, short s2, short s3) {
        if (graphics == null) {
            return;
        }
        if (this.f130g > 0) {
            this.f128p = (short) (this.f128p + ((s - this.f128p) / this.f130g));
            this.q = (short) (this.q + ((s2 - this.q) / this.f130g));
        } else {
            this.f128p = s;
            this.q = s2;
        }
        if ((s3 & 32) == 32) {
            a(graphics, this, s, s2, s3);
            if ((s3 & 64) == 64) {
                q.a(graphics, s, s2, !((a) this).f59a, ((a) this).f59a);
            }
        } else {
            a(graphics, this, this.f128p, this.q, s3);
        }
        this.f130g--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v154, types: [int] */
    /* JADX WARN: Type inference failed for: r0v156, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    private static void a(Graphics graphics, f fVar, short s, short s2, short s3) {
        short a2;
        short s4;
        short s5;
        short s6;
        Image a3;
        Image image;
        boolean z = (s3 & 128) == 128;
        int a4 = j.a.a(((a) fVar).f63b);
        short m193b = (short) m.m193b(graphics);
        short c2 = (short) m.c(graphics);
        short d2 = (short) m.d(graphics);
        short e2 = (short) m.e(graphics);
        if (z) {
            s4 = 0;
            a2 = 0;
            s5 = 25 - a4;
            s6 = 23 - j.a.f370a;
        } else {
            if ((s3 & 1) == 1) {
                q.a(graphics, (int) s, (int) s2, 1);
            } else if ((s3 & 1024) == 1024) {
                q.a(graphics, (int) s, (int) s2, 2);
            } else {
                q.a(graphics, (int) s, (int) s2, 0);
            }
            a2 = 14 - mobak.c.a(fVar.m48a(), fVar.m47a());
            s4 = 3;
            s5 = 29 - a4;
            s6 = 27 - j.a.f370a;
            m.b(graphics, s + 1, s2, 26, 27 + j.h.f370a);
        }
        if (fVar.f123c || !((a) fVar).f59a) {
            if (fVar.m48a() <= 3) {
                if (c == -1) {
                    c = mobak.c.a("enemy1.png");
                }
                a3 = mobak.c.a(c);
            } else {
                if (d == -1) {
                    d = mobak.c.a("enemy2.png");
                }
                a3 = mobak.c.a(d);
            }
            image = a3;
        } else {
            image = a(fVar.m48a());
        }
        byte m48a = fVar.m48a();
        m.a(graphics, image, 37 * fVar.m47a(), (m48a > 3 ? (byte) (m48a - 4) : (byte) (m48a - 1)) * 23, 37, 23, 0, s + a2, s2 + s4, 0);
        if ((s3 & 4) == 4) {
            a.a(graphics, s, s2, fVar.m48a());
        }
        if ((s3 & 2) == 2) {
            if (z) {
                m.a(graphics, 0);
                graphics.fillRect((s + s5) - 2, s2 + s6, a4 + 2, j.a.f370a);
                j.a.a(graphics, ((a) fVar).f63b, (s + s5) - 2, s2 + s6, 0);
                m.a(graphics, 12496896);
                graphics.drawLine((s + s5) - 2, (s2 + s6) - 1, ((s + s5) + a4) - 1, (s2 + s6) - 1);
                graphics.drawLine((s + s5) - 2, ((s2 + s6) + j.a.f370a) - 1, ((s + s5) + a4) - 1, ((s2 + s6) + j.a.f370a) - 1);
                graphics.drawLine((s + s5) - 3, s2 + s6, (s + s5) - 3, ((s2 + s6) + j.a.f370a) - 2);
                graphics.drawLine(s + s5 + a4, s2 + s6, s + s5 + a4, ((s2 + s6) + j.a.f370a) - 2);
            } else {
                a.a(graphics, s, s2, ((a) fVar).f63b);
            }
        }
        if ((s3 & 16) == 16 && ((a) fVar).f61a > 0) {
            a.b(graphics, s, s2, ((a) fVar).f62a);
        }
        if ((s3 & 768) != 0 && !z) {
            a.a(graphics, s, s2, fVar.m50a((byte) (((s3 & 768) >> 8) - 1)), false);
        }
        if (z) {
            if (fVar.f119b) {
                j.a(graphics, (byte) 6, (short) (s + 4), (short) ((s2 - 1) + f110b), 0);
                byte b2 = (byte) (f110b + 1);
                f110b = b2;
                if (b2 > 7) {
                    f110b = (byte) 0;
                }
            }
            if (fVar.f120k >= 0) {
                if (e == -1) {
                    short a5 = mobak.c.a("fight-slides_a.png");
                    e = a5;
                    f112d = (byte) m.b(a5);
                    f113e = (byte) m.b(e);
                    f111c = (byte) (m.m190a(e) / f113e);
                }
                if (fVar.f120k < f111c && fVar.f120k >= 0) {
                    m.a(graphics, e, f113e * fVar.f120k, 0, f113e, f112d, 0, s, s2, 0);
                }
                byte a6 = (byte) (25 - j.a.a(fVar.f121d));
                byte b3 = (byte) (23 - j.a.f370a);
                if (fVar.o > 0) {
                    m.a(graphics, 16711680);
                } else if (fVar.o < 0) {
                    m.a(graphics, 65280);
                } else {
                    m.a(graphics, 12171520);
                }
                graphics.fillRect((s + a6) - 1, (s2 + b3) - fVar.f122l, j.a.a(fVar.f121d) + 2, j.a.f370a);
                j.a.a(graphics, fVar.f121d, s + a6, (s2 + b3) - fVar.f122l, 0);
                fVar.f122l = (byte) (fVar.f122l + 1);
            }
        }
        if (!z) {
            m.b(graphics, m193b, c2, d2, e2);
            return;
        }
        if ((fVar.p & 1) == 1) {
            j.a(graphics, (byte) 2, (short) (s + a2), (short) (s2 + s4 + 10), 0);
        }
        if ((fVar.p & 2) == 2) {
            j.a(graphics, (byte) 9, (short) (s + a2 + 5), (short) (s2 + s4 + 10), 0);
        }
    }

    public final void h(int i) {
        a(i, true);
        this.o = (short) 0;
        this.f121d = "0";
        this.f122l = (byte) 0;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unitGroup[").append((int) this.f).append("\n");
        stringBuffer.append("quantity[").append(((a) this).b).append("\n");
        stringBuffer.append("raceId").append((int) ((a) this).f60a).append("\n");
        return stringBuffer.toString();
    }

    public final void k(byte b2) {
        this.p = b2;
    }

    public final void a() {
        if (this.f127a != null) {
            this.f127a.removeAllElements();
        }
    }

    @Override // mobak.b.a.a
    /* renamed from: a */
    public final short mo52a() {
        return this.n;
    }

    /* renamed from: f, reason: collision with other method in class */
    public final int m87f() {
        return this.f129f;
    }

    public final void i(int i) {
        this.f129f = i;
    }
}
