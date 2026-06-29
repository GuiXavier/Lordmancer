package mobak.b.b.a;

import java.util.Vector;

/* loaded from: LordmancerL.jar:mobak/b/b/a/x.class */
final class x extends mobak.c.h {
    private final v a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(v vVar) {
        this.a = vVar;
    }

    @Override // mobak.c.h
    public final void a() {
    }

    @Override // mobak.c.h
    public final void b() {
        if (v.a(this.a) == null) {
            v.a(this.a, new Vector());
        }
        mobak.b.a.a a = v.a(this.a, v.m145a(this.a), v.m146a(this.a));
        v.a(this.a).addElement(a);
        a.b(false);
        if (v.a(this.a, v.m145a(this.a), false) != 0) {
            this.a.a(v.m146a(this.a) == v.m147a(this.a)[v.m145a(this.a)]);
            return;
        }
        byte m145a = v.m145a(this.a);
        v.a(this.a, true);
        v.m147a(this.a)[m145a] = -1;
    }
}
