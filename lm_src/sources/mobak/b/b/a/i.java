package mobak.b.b.a;

/* loaded from: LordmancerL.jar:mobak/b/b/a/i.class */
public final class i {
    private int a;
    private int b;
    private int c = 29;
    private int d = 27;

    /* renamed from: a, reason: collision with other field name */
    public byte f173a;

    /* renamed from: a, reason: collision with other field name */
    public short f174a;

    public i(int i, int i2, int i3, int i4, byte b, short s) {
        this.a = i;
        this.b = i2;
        this.f173a = b;
        this.f174a = s;
    }

    public final boolean a(int i, int i2) {
        return i >= this.a && i <= this.a + this.c && i2 >= this.b && i2 <= this.b + this.d;
    }
}
