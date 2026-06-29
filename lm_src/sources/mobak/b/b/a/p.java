package mobak.b.b.a;

/* loaded from: LordmancerL.jar:mobak/b/b/a/p.class */
final class p extends mobak.c.h {
    private final o a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(o oVar) {
        this.a = oVar;
    }

    @Override // mobak.c.h
    public final void a() {
        mobak.b.b.m.a.g();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [mobak.b.b.m, java.lang.Exception] */
    @Override // mobak.c.h
    public final void b() {
        ?? r0;
        try {
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[85]);
            lVar.a(((j) this.a).d);
            mobak.a.a.f15a.a(lVar);
            r0 = mobak.b.b.m.a;
            r0.g();
        } catch (Exception e) {
            mobak.a.a.a((Exception) r0);
        }
    }
}
