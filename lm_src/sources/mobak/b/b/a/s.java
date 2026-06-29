package mobak.b.b.a;

/* loaded from: LordmancerL.jar:mobak/b/b/a/s.class */
public final class s {
    public int a;

    /* renamed from: a, reason: collision with other field name */
    public short f203a;
    public short b;

    /* renamed from: a, reason: collision with other field name */
    public String f204a;

    /* renamed from: a, reason: collision with other field name */
    public String[] f205a;

    /* renamed from: a, reason: collision with other field name */
    public short[] f206a;

    /* renamed from: a, reason: collision with other field name */
    public int[] f207a;

    public static final short a(int i) {
        return (short) (i >> 8);
    }

    private static final int a(int i, short s) {
        return (i & (-16776961)) | (s << 8);
    }

    private static final int a(int i, boolean z, byte b) {
        return z ? i | (b << 24) : i & ((b << 24) ^ (-1));
    }

    public static final int a(short s, byte b) {
        return a((0 & (-256)) | b, s);
    }

    public s(byte b) {
        this.a = (this.a & (-256)) | b;
        this.a = a(this.a, r.a(b));
        this.a = a(this.a, true, Byte.MIN_VALUE);
        this.a = a(this.a, true, (byte) 64);
    }

    public s(byte b, short s) {
        this.a = (this.a & (-256)) | b;
        this.a = a(this.a, s);
        this.a = a(this.a, true, Byte.MIN_VALUE);
        this.a = a(this.a, true, (byte) 64);
    }

    public s(int i) {
        this.a = i;
    }

    public final boolean a() {
        return ((this.a >> 24) & (-128)) == -128;
    }

    public final void a(boolean z) {
        this.a = a(this.a, z, Byte.MIN_VALUE);
    }

    public final boolean b() {
        return ((this.a >> 24) & 64) == 64;
    }

    public final void b(boolean z) {
        this.a = a(this.a, z, (byte) 64);
    }

    public final boolean c() {
        return ((this.a >> 24) & 16) == 16;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final byte m132a() {
        return (byte) this.a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final String m133a() {
        return mobak.c.d.b(a(this.a));
    }

    public final void a(String str) {
        this.f204a = str;
        this.a = a(this.a, true, (byte) 16);
    }

    public final void a(short s) {
        this.a = a(this.a, s);
    }

    public final boolean d() {
        return ((this.a >> 24) & 8) == 8;
    }

    public final boolean e() {
        return ((this.a >> 24) & 4) == 4;
    }

    public final void c(boolean z) {
        this.a = a(this.a, true, (byte) 4);
    }
}
