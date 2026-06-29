package mobak.a.a;

import mobak.Main2;
import mobak.b.b.m;

/* loaded from: LordmancerL.jar:mobak/a/a/j.class */
final class j implements mobak.c.b {
    @Override // mobak.c.b
    public final void b(int i) {
    }

    @Override // mobak.c.b
    /* renamed from: d */
    public final void mo6d() {
    }

    @Override // mobak.c.b
    public final void a(int i) {
        if (i == 0) {
            try {
                String m150a = b.m41a().m150a(0);
                String m150a2 = b.m41a().m150a(1);
                String m150a3 = b.m41a().m150a(2);
                if (m150a2.trim().length() == 0) {
                    m150a2 = Main2.a.f5a.m238a((byte) 17, (String) null);
                }
                if (m150a == null || m150a.trim().equals("") || m150a3 == null || m150a3.trim().equals("") || m150a == null || m150a.trim().equals("")) {
                    b.m41a().a(mobak.c.d.a(29), mobak.c.d.a(290), 4);
                    return;
                }
                String m3a = Main2.m3a(m150a2);
                if (m3a == null) {
                    b.m41a().a(mobak.c.d.a(29), mobak.c.d.a(30), 4);
                    return;
                }
                Main2 main2 = Main2.a;
                if (Main2.b(m3a)) {
                    b.m41a().a(mobak.c.d.a(29), mobak.c.d.a(292), 4);
                    return;
                }
                if (!Main2.m4a(m150a3)) {
                    b.m41a().a(mobak.c.d.a(29), mobak.c.d.a(293), 4);
                    return;
                }
                b.a(new mobak.i(m150a, m3a, m150a3, m150a, (byte) 5));
                l lVar = new l(b.f33a[114], (short) 16, b.f33a[114], false);
                lVar.a(b.m42a().b);
                lVar.a(b.m42a().a);
                lVar.a(b.m42a().d);
                lVar.a(b.m42a().c);
                mobak.a.a.f15a.a(lVar);
            } catch (Exception e) {
                mobak.a.a.a(new StringBuffer("onButtonClick REGISTRATION_SCREEN: ").append(e.toString()).toString());
            }
        }
        m.a.m();
    }
}
