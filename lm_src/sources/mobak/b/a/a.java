package mobak.b.a;

import javax.microedition.lcdui.Graphics;
import mobak.b.b.a.q;
import mobak.b.b.j;
import mobak.b.b.m;
import mobak.b.b.p;

/* loaded from: LordmancerL.jar:mobak/b/a/a.class */
public abstract class a {
    private static short a = 0;

    /* renamed from: a, reason: collision with other field name */
    protected boolean f59a;

    /* renamed from: a, reason: collision with other field name */
    protected byte f60a;

    /* renamed from: a, reason: collision with other field name */
    protected int f61a;

    /* renamed from: a, reason: collision with other field name */
    protected String f62a;
    protected int b;

    /* renamed from: b, reason: collision with other field name */
    protected String f63b;
    protected int c;
    protected int d;

    /* renamed from: a, reason: collision with other field name */
    private int[] f64a;

    /* renamed from: a, reason: collision with other field name */
    private String[] f65a;

    /* renamed from: c, reason: collision with other field name */
    protected String f66c;

    /* renamed from: d, reason: collision with other field name */
    private String f67d;
    protected int e = -1;

    /* renamed from: b, reason: collision with other field name */
    private boolean f68b = true;

    public final boolean a() {
        return this.f59a;
    }

    public final void a(boolean z) {
        this.f59a = z;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int m47a() {
        return this.c;
    }

    /* renamed from: a */
    public void mo81a(int i) {
        this.c = i;
    }

    /* renamed from: b */
    public final int mo82b() {
        return this.f61a;
    }

    public final void b(int i) {
        this.f61a = mobak.c.e.a(i);
        this.f62a = String.valueOf(i);
    }

    public final int c() {
        return this.b;
    }

    public final void a(int i, boolean z) {
        this.b = i;
        if (this.b < 0) {
            this.b = 0;
        }
        this.f63b = String.valueOf(this.b);
    }

    public final void c(int i) {
        a(i, true);
    }

    public final void d(int i) {
        a(i, true, true);
    }

    public final void a(int i, boolean z, boolean z2) {
        int i2 = (i <= 0 || Integer.MAX_VALUE - i >= this.f61a) ? this.f61a + i : 2147483646;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = i2;
        if (z && i3 > this.b) {
            i3 = this.b;
        }
        if (z2 && i3 < 0) {
            i3 = 0;
        }
        b(i3);
    }

    /* renamed from: a, reason: collision with other method in class */
    public final byte m48a() {
        return this.f60a;
    }

    public final void a(byte b) {
        this.f60a = b;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.d;
    }

    public final void e(int i) {
        this.d = i;
    }

    public final void a(int[] iArr) {
        this.f64a = iArr;
        if (iArr == null || iArr.length <= 0) {
            this.f65a = null;
            return;
        }
        this.f65a = new String[iArr.length];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= iArr.length) {
                return;
            }
            this.f65a[b2] = String.valueOf(this.f64a[b2]);
            b = (byte) (b2 + 1);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int m49a(byte b) {
        if (this.f64a != null && b >= 0 && b < this.f64a.length) {
            return this.f64a[b];
        }
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final String m50a(byte b) {
        return (this.f65a != null && b >= 0 && b < this.f65a.length) ? this.f65a[b] : "";
    }

    /* renamed from: b, reason: collision with other method in class */
    public abstract byte mo51b();

    public abstract boolean a(a aVar);

    /* renamed from: a, reason: collision with other method in class */
    public short mo52a() {
        return (short) 0;
    }

    public final void a(String str) {
        this.f66c = str;
    }

    public abstract void a(Graphics graphics, short s, short s2, short s3);

    public abstract void a(p pVar, String str, short s);

    /* renamed from: c, reason: collision with other method in class */
    public byte mo53c() {
        return (byte) 0;
    }

    /* renamed from: d, reason: collision with other method in class */
    public byte mo54d() {
        return (byte) 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final String m55a() {
        return this.f67d;
    }

    public final void b(String str) {
        this.f67d = str;
    }

    public static final void a(Graphics graphics, short s, short s2, String str) {
        a(graphics, (s + 29) - 3, (s2 + 27) - 1, j.a, str, 40);
    }

    public static final void b(Graphics graphics, short s, short s2, String str) {
        a(graphics, s + 14, s2 + 13, j.e, str, 3);
    }

    private static final void a(Graphics graphics, int i, int i2, mobak.c.a aVar, String str, int i3) {
        int a2 = aVar.a(str);
        int i4 = aVar.f370a;
        if ((i3 & 8) == 8) {
            i -= a2;
        } else if ((i3 & 1) == 1) {
            i -= a2 / 2;
        }
        if ((i3 & 32) == 32) {
            i2 -= i4;
        } else if ((i3 & 2) == 2) {
            i2 -= i4 / 2;
        }
        m.a(graphics, 0);
        graphics.fillRect(i, i2, a2 + 2, i4);
        aVar.a(graphics, str, i, i2, 0);
        m.a(graphics, 12496896);
        graphics.drawLine(i, i2 - 1, i + a2 + 1, i2 - 1);
        graphics.drawLine(i, (i2 + i4) - 1, i + a2 + 1, (i2 + i4) - 1);
        graphics.drawLine(i - 1, i2, i - 1, (i2 + i4) - 2);
        graphics.drawLine(i + a2 + 2, i2, i + a2 + 2, (i2 + i4) - 2);
    }

    public static final void a(Graphics graphics, short s, short s2, byte b) {
        if (b <= 0 || b > 5) {
            return;
        }
        m.a(graphics, mobak.c.a(q.b), 13 * (b - 1), 0, 13, 13, 0, (short) (s + 1), (short) ((s2 + 27) - 13), 0);
    }

    public static final void a(Graphics graphics, short s, short s2, String str, boolean z) {
        mobak.c.a aVar = j.h;
        short s3 = (short) (s + 14);
        short s4 = (short) (s2 + 27 + (aVar.f370a / 2) + 2);
        if (z) {
            if (a == 0) {
                a = mobak.c.a("crystal.png");
            }
            m.a(graphics, mobak.c.a(a), (s3 - m.m190a(a)) - (aVar.a(str) / 2), (s4 - (m.b(a) / 2)) + 1, 0);
        }
        aVar.a(graphics, str, s3, s4, 3);
    }

    public static final void c(Graphics graphics, short s, short s2, String str) {
        mobak.c.a aVar = j.g;
        short s3 = (short) (s + 2);
        m.a(graphics, 14268500);
        graphics.fillRect(s3, s2 + 1, aVar.a(str) + 2, aVar.f370a - 1);
        aVar.a(graphics, str, s3 + 1, s2, 0);
    }

    public static final void a(int i, Graphics graphics, short s, short s2) {
        switch (i) {
            case 1:
                a(graphics, s, s2, "7");
                return;
            case 2:
                b(graphics, s, s2, "12");
                return;
            case 3:
                a(graphics, s, s2, (byte) 2);
                return;
            case 4:
                a(graphics, s, s2, "142", false);
                return;
            case 5:
                c(graphics, s, s2, "3");
                return;
            case 6:
                q.a(graphics, s, s2, false, true);
                return;
            case 7:
                q.a(graphics, s, s2, true, false);
                return;
            default:
                return;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean mo56a(byte b) {
        return true;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final boolean m57b() {
        return this.f68b;
    }

    public final void b(boolean z) {
        this.f68b = false;
    }
}
