package mobak.b.b.a;

import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/a/c.class */
public final class c extends j {
    private byte f;

    /* renamed from: f, reason: collision with other field name */
    private boolean f150f;

    /* JADX WARN: Type inference failed for: r5v12, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r5v28, types: [byte[], byte[][]] */
    public c(short s) {
        super(s);
        this.f = (byte) -1;
        this.f150f = false;
        a((short) 49, (short) (mo90a() + 8), (short) ((mobak.b.b.m.a.getWidth() - 32) - 29), (short) (((mobak.b.b.m.a.getHeight() - mo90a()) - r.a()) - 40), true);
        mobak.b.a.e.b();
        ((j) this).f176a = new short[]{110};
        ((j) this).c = a(true);
        switch (s) {
            case -12:
                ((q) this).f190b = mobak.c.d.a(95);
                short[] sArr = ((j) this).f176a;
                sArr[0] = (short) (sArr[0] | 16);
                ((mobak.b.b.j) this).f271a = new r(new byte[]{81}, new byte[]{52, 55, 71, 95, 49}, new byte[]{new byte[]{70, 68, 67, 90, 69}});
                ((mobak.b.b.j) this).f271a.b((byte) 71);
                break;
            case -6:
                ((q) this).f190b = mobak.c.d.a(95);
                ((mobak.b.b.j) this).f271a = new r(new byte[]{86, 74}, new byte[]{55}, null);
                break;
            case -2:
                ((q) this).f190b = mobak.c.d.a(95);
                ((mobak.b.b.j) this).f271a = new r(new byte[]{51, 86, 74, 79}, new byte[]{52, 55, 100, 48, 95, 49}, new byte[]{new byte[]{70, 68, 67, 90, 69}});
                short[] sArr2 = ((j) this).f176a;
                sArr2[0] = (short) (sArr2[0] | 4096);
                ((mobak.b.b.j) this).f271a.a((short) 173, (byte) 100);
                ((mobak.b.b.j) this).f271a.a((short) 176, (byte) 48);
                ((mobak.b.b.j) this).f271a.a((short) 186, (byte) 79);
                ((mobak.b.b.j) this).f271a.a((byte) 48, true);
                mobak.b.a.e[] m59a = mobak.b.a.b.a.m59a((byte) -1);
                if (m59a == null || m59a.length == 0) {
                    mobak.b.b.m.a(mobak.c.d.a(74), mobak.c.d.a(133));
                    break;
                }
                break;
            case -1:
                mobak.b.a.e.a();
                ((q) this).f190b = mobak.c.d.a(71);
                ((mobak.b.b.j) this).f271a = new r(new byte[]{81}, new byte[]{55}, null);
                mobak.b.a.e[] m59a2 = mobak.b.a.b.a.m59a((byte) 1);
                if (m59a2 == null || m59a2.length == 0) {
                    mobak.b.b.m.a(mobak.c.d.a(74), mobak.c.d.a(132));
                    break;
                }
                break;
        }
        ((j) this).e = (byte) 0;
        ((j) this).d = (byte) 0;
        mo90a();
    }

    @Override // mobak.b.b.a.j
    protected final boolean e() {
        return super.a((short) 0);
    }

    private boolean g() {
        mobak.b.a.a[] mo148a;
        if ((((mobak.b.b.j) this).f278a != -6 && ((mobak.b.b.j) this).f278a != -2 && ((mobak.b.b.j) this).f278a != -5) || (mo148a = mo148a((byte) 0)) == null || mo148a.length <= ((j) this).d || mo148a[((j) this).d] == null) {
            return false;
        }
        mobak.b.a.b bVar = mobak.b.a.b.a;
        mobak.b.a.b.b((mobak.b.a.e) mo148a[((j) this).d]);
        mo90a();
        return true;
    }

    private boolean h() {
        mobak.b.a.a[] mo148a;
        if ((((mobak.b.b.j) this).f278a != -6 && ((mobak.b.b.j) this).f278a != -2) || (mo148a = mo148a((byte) 0)) == null || mo148a.length <= ((j) this).d || mo148a[((j) this).d] == null) {
            return false;
        }
        if (!mo148a[((j) this).d].a()) {
            mobak.b.b.m.a(mobak.c.d.a(105), mobak.c.d.a(57));
            return false;
        }
        mobak.b.a.b bVar = mobak.b.a.b.a;
        mobak.b.a.b.m71a((mobak.b.a.e) mo148a[((j) this).d]);
        if (((mobak.b.b.j) this).f278a == -6) {
            super.a((short) 0);
            return true;
        }
        mo90a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j
    /* renamed from: a */
    public final mobak.b.a.a[] mo148a(byte b) {
        if (b != 0) {
            return null;
        }
        switch (((mobak.b.b.j) this).f278a) {
            case -12:
                return q.a(mobak.b.a.b.a.m59a(this.f));
            case -6:
                return q.a(mobak.b.a.b.a.b(this.f));
            case -2:
                return !this.f150f ? q.a(mobak.b.a.b.a.m59a(this.f)) : q.a(mobak.b.b.m.f287a);
            case -1:
                return q.a(mobak.b.a.b.a.m59a((byte) 1));
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j
    public final boolean f() {
        if (((mobak.b.b.j) this).f278a != -1) {
            return super.f();
        }
        mobak.b.a.a[] mo148a = mo148a(((j) this).e);
        if (mo148a == null || mo148a.length == 0 || mo148a.length <= ((j) this).d || mo148a[((j) this).d] == null) {
            return true;
        }
        if (((mobak.b.a.e) mo148a[((j) this).d]).mo82b() > mobak.b.a.b.a.a(mobak.b.a.b.a.f83b, mobak.b.a.d.a, 0)) {
            mobak.b.b.m.a("", mobak.c.d.a(123));
            return true;
        }
        mobak.b.b.m.a.f297a.f137a = (mobak.b.a.e) mo148a[((j) this).d];
        super.a((short) 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j
    public final void a(mobak.b.a.a aVar, short s) {
        if (((mobak.b.b.j) this).f278a == -1) {
            aVar.a(((mobak.b.b.j) this).f279a, mobak.c.d.a(277, new String[]{String.valueOf((int) ((mobak.b.a.e) aVar).mo82b()), String.valueOf(mobak.b.a.b.a.a(mobak.b.a.b.a.f83b, mobak.b.a.d.a, 0))}), s);
        } else {
            aVar.a(((mobak.b.b.j) this).f279a, (String) null, s);
        }
    }

    @Override // mobak.b.b.a.j, mobak.b.b.j
    /* renamed from: a */
    public final void mo90a() {
        mobak.b.a.a a;
        if (((mobak.b.b.j) this).f278a != -12) {
            ((mobak.b.b.j) this).f271a.a(true, false);
            if (this.f150f || (a = a()) == null || !a.a()) {
                return;
            }
            if (((mobak.b.b.j) this).f278a != -2 && ((mobak.b.b.j) this).f278a != -6) {
                if (((mobak.b.b.j) this).f278a == -1) {
                    ((mobak.b.b.j) this).f271a.a((byte) 81, false);
                    return;
                }
                return;
            } else {
                if (a.mo53c() > 0) {
                    if (a.mo54d() <= 0) {
                        ((mobak.b.b.j) this).f271a.a((byte) 74, false);
                        return;
                    } else {
                        ((mobak.b.b.j) this).f271a.a((byte) 86, false);
                        return;
                    }
                }
                return;
            }
        }
        ((mobak.b.b.j) this).f271a.b((byte) 71);
        mobak.b.a.e[] m59a = mobak.b.a.b.a.m59a((byte) -1);
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= m59a.length) {
                return;
            }
            if (m59a[s2] != null && m59a[s2].mo82b() > 0) {
                ((mobak.b.b.j) this).f271a.c((byte) 71);
                return;
            }
            s = (short) (s2 + 1);
        }
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final void a(Graphics graphics) {
        try {
            if (((mobak.b.b.j) this).f278a == -2 && !this.f150f) {
                if (mobak.b.a.b.a.e() <= 0) {
                    ((mobak.b.b.j) this).f271a.a((byte) 100, true);
                } else {
                    ((mobak.b.b.j) this).f271a.a((byte) 100, false);
                }
            }
            if (a() != null) {
                mo90a();
            }
            c(graphics);
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("BagView ").append(e.getMessage()).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    @Override // mobak.b.b.a.j, mobak.b.b.a.q, mobak.b.b.j
    public final boolean a(s sVar) {
        ?? r0 = (byte) sVar.a;
        switch (r0) {
            case 48:
                return i();
            case 66:
                m106a((byte) 1);
                return true;
            case 67:
                m106a((byte) 4);
                return true;
            case 68:
                m106a((byte) 2);
                return true;
            case 69:
                m106a((byte) 16);
                return true;
            case 70:
                m106a((byte) -1);
                return true;
            case 71:
                try {
                    mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[44]);
                    lVar.a(mobak.b.a.b.a.f78b);
                    mobak.b.a.b.a.f78b = -1;
                    m106a((byte) -1);
                    mobak.b.a.e[] m59a = mobak.b.a.b.a.m59a((byte) -1);
                    j.a(lVar, m59a);
                    for (short s = 0; s < m59a.length; s = (short) (s + 1)) {
                        if (m59a[s] != null && m59a[s].mo82b() > 0) {
                            m59a[s].b(0);
                        }
                    }
                    r0 = mobak.a.a.f15a.a(lVar);
                } catch (Exception e) {
                    mobak.a.a.a(r0.getMessage());
                }
                return super.a((short) 0);
            case 74:
                return h();
            case 86:
                return g();
            case 90:
                m106a((byte) 8);
                return true;
            case 100:
                ?? r02 = this.f150f;
                if (r02 == 0) {
                    try {
                        ((mobak.b.b.j) this).f271a.a((short) 95, (byte) 100);
                        mobak.a.a.l lVar2 = new mobak.a.a.l(mobak.a.a.b.f33a[67], (short) 0, mobak.a.a.b.f33a[7]);
                        lVar2.a((byte) 2);
                        r02 = mobak.a.a.f15a.a(lVar2);
                    } catch (Exception e2) {
                        mobak.a.a.a(r02.getMessage());
                    }
                } else {
                    ((mobak.b.b.j) this).f271a.a((short) 173, (byte) 100);
                }
                this.f150f = !this.f150f;
                if (this.f150f) {
                    ((mobak.b.b.j) this).f271a.a((byte) 48, false);
                } else {
                    ((mobak.b.b.j) this).f271a.a((byte) 48, true);
                }
                i();
                b((int) ((j) this).e, 0);
                ((j) this).d = (byte) 0;
                return true;
            default:
                return super.a(sVar);
        }
    }

    private boolean i() {
        try {
            mobak.b.a.a a = a();
            if (a == null) {
                return true;
            }
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[68]);
            if (this.f150f) {
                lVar.a((byte) 4);
                mobak.b.a.b.a.g(-1);
            } else {
                lVar.a((byte) 3);
                mobak.b.a.b.a.a((byte) a.d(), (mobak.b.a.e) null);
            }
            a.c(0);
            i();
            lVar.a(a.e());
            mobak.a.a.f15a.a(lVar);
            return true;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("thing dismiss: ").append(e.getMessage()).toString());
            return true;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m106a(byte b) {
        ((j) this).d = (byte) 0;
        b((int) ((j) this).e, 0);
        this.f = b;
    }
}
