package mobak.b.b.a;

/* loaded from: LordmancerL.jar:mobak/b/b/a/b.class */
final class b extends mobak.c.h {
    private final a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.a = aVar;
    }

    @Override // mobak.c.h
    public final void a() {
    }

    @Override // mobak.c.h
    public final void b() {
        try {
            a.a(this.a);
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("dismiss: ").append(e.getMessage()).toString());
        }
    }
}
