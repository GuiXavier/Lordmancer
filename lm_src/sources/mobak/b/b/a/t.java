package mobak.b.b.a;

import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/a/t.class */
public final class t extends mobak.b.b.q {
    String a;

    /* renamed from: a, reason: collision with other field name */
    private mobak.c.a f208a;

    /* renamed from: a, reason: collision with other field name */
    public int f209a = -1;
    private int d;

    @Override // mobak.b.b.q
    public final void a(Graphics graphics, short s, short s2, byte b) {
        if (graphics == null || this.a == null || this.f208a == null) {
            return;
        }
        if (this.f209a >= 0) {
            mobak.b.b.m.a(graphics, this.f209a);
            graphics.fillRect(((mobak.b.b.q) this).a - s, ((mobak.b.b.q) this).b - s2, mo205b(), mo204a());
        }
        if (this.a.equals("")) {
            return;
        }
        if (b == 0) {
            this.f208a.a(graphics, this.a, ((mobak.b.b.q) this).a - s, ((mobak.b.b.q) this).b - s2, ((mobak.b.b.q) this).f357a);
        } else {
            this.f208a.a(graphics, this.a, ((mobak.b.b.q) this).a - s, ((mobak.b.b.q) this).b - s2, b);
        }
        if (((mobak.b.b.q) this).f356b == -16777216) {
            return;
        }
        int m192a = mobak.b.b.m.m192a(graphics);
        mobak.b.b.m.a(graphics, ((mobak.b.b.q) this).f356b);
        byte b2 = 1;
        while (true) {
            byte b3 = b2;
            if (b3 > this.c) {
                mobak.b.b.m.a(graphics, m192a);
                return;
            } else {
                graphics.drawRect((((mobak.b.b.q) this).a - s) - b3, (((mobak.b.b.q) this).b - s2) - b3, this.f208a.a(this.a.trim()) + (2 * b3), this.f208a.f370a + (2 * b3));
                b2 = (byte) (b3 + 1);
            }
        }
    }

    @Override // mobak.b.b.q
    /* renamed from: b */
    public final short mo205b() {
        if (this.f208a == null || this.a == null) {
            return (short) 0;
        }
        return (short) this.f208a.a(this.a);
    }

    @Override // mobak.b.b.q
    /* renamed from: a */
    public final short mo204a() {
        if (this.f208a == null || this.a == null) {
            return (short) 0;
        }
        return (short) this.f208a.f370a;
    }

    public t(String str, short s, short s2, mobak.c.a aVar, int i) {
        if (str.equals("��")) {
            this.a = "";
        } else {
            this.a = str;
        }
        ((mobak.b.b.q) this).a = s;
        ((mobak.b.b.q) this).b = s2;
        this.f208a = aVar;
        ((mobak.b.b.q) this).f356b = -16777216;
        this.c = 0;
        this.d = i;
    }

    @Override // mobak.b.b.q
    public final boolean a(mobak.c.a aVar) {
        return aVar == this.f208a;
    }

    @Override // mobak.b.b.q
    /* renamed from: a, reason: collision with other method in class */
    public final String mo134a() {
        return this.a;
    }

    @Override // mobak.b.b.q
    /* renamed from: b, reason: collision with other method in class */
    public final int mo135b() {
        return this.d;
    }
}
