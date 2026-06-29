package mobak.b.b;

import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/f.class */
public final class f extends c {
    private byte[] a;

    /* renamed from: a, reason: collision with other field name */
    private byte f238a;
    private byte b;

    /* renamed from: a, reason: collision with other field name */
    private final a f239a;

    public f(a aVar, byte[] bArr, byte b) {
        super(aVar);
        this.f239a = aVar;
        this.a = null;
        this.f238a = (byte) 0;
        this.b = (byte) -1;
        this.a = bArr;
        this.b = a.a(aVar, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mobak.b.b.c
    public final void a(Graphics graphics) {
        mobak.b.a.f m98a;
        if (a.m101a(this.f239a, this.b) && (m98a = this.f239a.m98a(this.b)) != null) {
            if (this.f238a == 0) {
                a.a(this.f239a)[m98a.e()][m98a.f()] = (byte) (a.a(this.f239a)[m98a.e()][m98a.f()] & Byte.MIN_VALUE);
            }
            short m102a = a.m102a(this.f239a, m98a.e());
            short b = (short) (a.b(this.f239a, m98a.f()) - 24);
            if (m98a.m87f() >= 2) {
                m98a.d(a.m91a(this.a[this.f238a]));
                m98a.c(a.m92b(this.a[this.f238a]));
                m102a = a.m102a(this.f239a, m98a.e());
                b = (short) (a.b(this.f239a, m98a.f()) - 24);
                m98a.g(3);
                this.f238a = (byte) (this.f238a + 1);
                if (this.f238a > this.a.length - 1) {
                    this.a = null;
                    this.f238a = (byte) 0;
                    a.a(this.f239a)[m98a.e()][m98a.f()] = (byte) ((a.a(this.f239a)[m98a.e()][m98a.f()] & Byte.MIN_VALUE) | this.b);
                    this.b = (byte) -1;
                }
                m98a.i(0);
            } else {
                m98a.i(m98a.m87f() + 1);
            }
            m98a.a(graphics, m102a, b, (short) -126);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mobak.b.b.c
    public final boolean a() {
        if (this.a == null || !a.m101a(this.f239a, this.b) || this.f238a >= this.a.length) {
            return super.a();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mobak.b.b.c
    /* renamed from: a */
    public final void mo149a() {
        this.a = null;
    }
}
