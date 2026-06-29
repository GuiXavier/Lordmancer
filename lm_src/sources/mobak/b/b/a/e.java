package mobak.b.b.a;

/* loaded from: LordmancerL.jar:mobak/b/b/a/e.class */
final class e extends mobak.c.h {
    private final d a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(d dVar) {
        this.a = dVar;
    }

    @Override // mobak.c.h
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v7, types: [mobak.a.a.l] */
    /* JADX WARN: Type inference failed for: r0v8, types: [mobak.a.a] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // mobak.c.h
    public final void b() {
        ?? abs = Math.abs(d.m110a(this.a).a(d.a(this.a) + 1).mo135b());
        if (abs != 0) {
            try {
                ?? lVar = new mobak.a.a.l(mobak.a.a.b.f33a[82], (short) 4, (short) 0);
                lVar.a(abs);
                abs = mobak.a.a.f15a.a(lVar);
            } catch (Exception e) {
                mobak.a.a.a((Exception) abs);
            }
        }
    }
}
