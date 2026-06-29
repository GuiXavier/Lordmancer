package mobak.b.b.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: LordmancerL.jar:mobak/b/b/a/h.class */
public final class h extends mobak.c.h {
    private final f a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(f fVar) {
        this.a = fVar;
    }

    @Override // mobak.c.h
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [mobak.a.a.l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [mobak.a.a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [mobak.a.a.l] */
    @Override // mobak.c.h
    public final void b() {
        ?? lVar = new mobak.a.a.l(mobak.a.a.b.f33a[30], (short) 4, mobak.a.a.b.f33a[10]);
        try {
            lVar = lVar;
            lVar.a(this.a.e + 1);
        } catch (Exception e) {
            mobak.a.a.a(lVar.getMessage());
        }
        mobak.a.a.f15a.a(lVar);
        mobak.c.b();
    }
}
