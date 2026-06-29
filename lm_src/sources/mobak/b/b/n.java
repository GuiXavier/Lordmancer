package mobak.b.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: LordmancerL.jar:mobak/b/b/n.class */
public final class n {

    /* renamed from: a, reason: collision with other field name */
    public byte f321a;

    /* renamed from: a, reason: collision with other field name */
    public String f322a;

    /* renamed from: a, reason: collision with other field name */
    public p f323a;

    /* renamed from: a, reason: collision with other field name */
    public mobak.c.h f324a;
    public int e;

    /* renamed from: a, reason: collision with other field name */
    mobak.c.a f325a = j.f259b;
    int a = m.m194a();
    int b = m.m195b();
    int c = m.m196c();
    int d = m.m197d();

    public n(byte b, String str, String str2, mobak.c.h hVar, int i) {
        this.f321a = b;
        this.f322a = str;
        short s = (short) (this.b + ((this.f322a == null || this.f322a.equals("")) ? 10 : 25));
        this.f323a = new p((short) (this.a + 10), (short) (s + 5), (short) (this.c - 15), (short) (((this.d - 10) - (s - this.b)) - 10), true, false);
        this.f323a.a(str2, this.f325a, false, -1);
        this.f324a = hVar;
        this.e = i;
    }
}
