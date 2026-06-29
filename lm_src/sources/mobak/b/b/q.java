package mobak.b.b;

import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/q.class */
public abstract class q {
    public short a;
    public short b;

    /* renamed from: b, reason: collision with other field name */
    public int f356b;
    public int c;

    /* renamed from: a, reason: collision with other field name */
    public byte f357a;

    /* renamed from: b */
    public abstract short mo205b();

    /* renamed from: a */
    public abstract short mo204a();

    public abstract void a(Graphics graphics, short s, short s2, byte b);

    public final short d() {
        return this.a;
    }

    public final short e() {
        return this.b;
    }

    public final void a(short s) {
        this.a = s;
    }

    public final void b(int i, int i2) {
        this.f356b = i;
        this.c = 2;
    }

    /* renamed from: e, reason: collision with other method in class */
    public final void m214e() {
        this.f356b = -16777216;
        this.c = 0;
    }

    public boolean a(mobak.c.a aVar) {
        return false;
    }

    /* renamed from: a */
    public String mo134a() {
        return null;
    }

    /* renamed from: b */
    public int mo135b() {
        return 0;
    }
}
