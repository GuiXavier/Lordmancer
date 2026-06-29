package mobak.b.b;

import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/e.class */
public final class e extends c {
    private byte a;

    /* renamed from: a, reason: collision with other field name */
    private int f236a;

    /* renamed from: a, reason: collision with other field name */
    private final a f237a;

    public e(a aVar, byte b, int i) {
        super(aVar);
        this.f237a = aVar;
        this.a = b;
        this.f236a = i < 0 ? 0 : i;
        if (a.m101a(aVar, this.a)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable, java.lang.Exception] */
    @Override // mobak.b.b.c
    public final void a(Graphics graphics) {
        if (a.m101a(this.f237a, this.a)) {
            mobak.b.a.f m98a = this.f237a.m98a(this.a);
            if (m98a == null) {
                this.a = (byte) -1;
                return;
            }
            if (m98a.i() == 0) {
                try {
                    m98a.f(this.f236a);
                } catch (Exception e) {
                    mobak.a.a.a(new StringBuffer("unitAttackAnimate: ").append(e).toString(), false);
                }
            }
            m98a.j((byte) (m98a.i() + 1));
            if (m98a.i() > 15) {
                m98a.j((byte) -1);
                m98a.h(this.f236a);
                if (m98a.c() <= 0) {
                    a.a(this.f237a, this.a, (mobak.b.a.f) null);
                    a.m103a(this.f237a, this.a);
                }
                this.a = (byte) -1;
                return;
            }
            ?? r0 = this.a;
            if (r0 == -1) {
                try {
                    r0 = new Exception();
                    throw r0;
                } catch (Exception e2) {
                    r0.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mobak.b.b.c
    public final boolean a() {
        if (this.a < 0) {
            return super.a();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mobak.b.b.c
    /* renamed from: a */
    public final void mo149a() {
    }
}
