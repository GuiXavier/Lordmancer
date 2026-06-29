package mobak.b.a;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.b.b.a.q;
import mobak.b.b.i;
import mobak.b.b.j;
import mobak.b.b.m;
import mobak.b.b.p;

/* loaded from: LordmancerL.jar:mobak/b/a/c.class */
public final class c extends a {
    private String d;
    private byte b;
    private byte c;

    /* renamed from: d, reason: collision with other field name */
    private byte f99d;
    private byte[] a;

    public c(short s, byte b, byte b2, byte b3, String str, int i) {
        byte b4;
        ((a) this).d = i;
        ((a) this).c = s;
        this.b = b;
        this.c = b2;
        byte b5 = b3;
        this.f99d = b5;
        byte b6 = 0;
        this.a = null;
        while (b5 != 0) {
            if (((byte) (b5 & 1)) == 1) {
                b6 = (byte) (b6 + 1);
            }
            b5 = (byte) (b5 >> 1);
        }
        if (b6 > 0) {
            if (b6 > 1) {
                this.a = new byte[b6 + 1];
                b4 = 1;
                this.a[0] = 51;
            } else {
                this.a = new byte[b6];
                b4 = 0;
            }
            if (((byte) (this.f99d & 1)) == 1) {
                byte b7 = b4;
                b4 = (byte) (b4 + 1);
                this.a[b7] = 81;
            }
            if (((byte) (this.f99d & 2)) == 2) {
                byte b8 = b4;
                b4 = (byte) (b4 + 1);
                this.a[b8] = 59;
            }
            if (((byte) (this.f99d & 4)) == 4) {
                this.a[b4] = 89;
            }
        }
        this.d = str;
    }

    @Override // mobak.b.a.a
    public final byte e() {
        return this.b;
    }

    public final byte f() {
        return this.c;
    }

    public final byte[] a() {
        return this.a;
    }

    @Override // mobak.b.a.a
    public final void a(Graphics graphics, short s, short s2, short s3) {
        if (graphics == null) {
            return;
        }
        Image a = i.a();
        short a2 = (short) (m.a(a) / i.a((byte) 1));
        short b = (short) m.b(a);
        if (a == null) {
            return;
        }
        short m193b = (short) m.m193b(graphics);
        short c = (short) m.c(graphics);
        short d = (short) m.d(graphics);
        short e = (short) m.e(graphics);
        m.b(graphics, s, s2, 30, 29);
        q.a(graphics, (int) s, (int) s2, (s3 & 1) == 1 ? 1 : 0);
        m.a(graphics, a, ((a) this).c * a2, 0, a2, b, 0, s + 7, s2 + 4, 0);
        m.b(graphics, m193b, c, d, e);
    }

    @Override // mobak.b.a.a
    public final void a(p pVar, String str, short s) {
        if (pVar == null) {
            return;
        }
        pVar.m207c();
        if (str != null && !str.equals("")) {
            pVar.a(str, j.f259b, false, -1);
        }
        pVar.a(this.d, j.f259b, false, -1);
    }

    @Override // mobak.b.a.a
    public final boolean a(a aVar) {
        return false;
    }

    @Override // mobak.b.a.a
    /* renamed from: b */
    public final byte mo51b() {
        return (byte) 0;
    }
}
