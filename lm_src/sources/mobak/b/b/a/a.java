package mobak.b.b.a;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: LordmancerL.jar:mobak/b/b/a/a.class */
public final class a extends j {
    private mobak.b.a.a[] a;
    private boolean f;

    public a(short s) {
        super(s);
        this.a = null;
        this.f = true;
        a((short) 49, (short) (mo90a() + 8), (short) ((mobak.b.b.m.a.getWidth() - 32) - 29), (short) (((mobak.b.b.m.a.getHeight() - mo90a()) - r.a()) - 40), true);
        ((j) this).f176a = new short[]{46};
        ((j) this).c = a(true);
        switch (s) {
            case -4:
                ((q) this).f190b = mobak.c.d.a(52);
                ((mobak.b.b.j) this).f271a = new r(null, new byte[]{52, 55, 73, 72, 95}, null);
                ((mobak.b.b.j) this).f271a.b((byte) 73);
                short[] sArr = ((j) this).f176a;
                sArr[0] = (short) (sArr[0] | 2048);
                mobak.b.b.m.f287a = mobak.b.b.m.a.f297a.f149a.a();
                return;
            case -3:
                ((q) this).f190b = mobak.c.d.a(52);
                ((mobak.b.b.j) this).f271a = new r(new byte[]{79}, new byte[]{51, 55, 100, 48, 98, 95}, null);
                short[] sArr2 = ((j) this).f176a;
                sArr2[0] = (short) (sArr2[0] | 4096);
                short[] sArr3 = ((j) this).f176a;
                sArr3[0] = (short) (sArr3[0] | 16);
                ((mobak.b.b.j) this).f271a.a((short) 186, (byte) 79);
                ((mobak.b.b.j) this).f271a.a((short) 187, (byte) 98);
                return;
            default:
                return;
        }
    }

    @Override // mobak.b.b.a.j
    protected final boolean e() {
        return a((short) 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j
    /* renamed from: a */
    public final mobak.b.a.a[] mo148a(byte b) {
        boolean z;
        mobak.b.a.a[] aVarArr;
        mobak.b.a.a[] aVarArr2 = this.a;
        if (!j.a) {
            if (aVarArr2 != null) {
                short s = 0;
                while (true) {
                    short s2 = s;
                    if (s2 >= aVarArr2.length) {
                        z = false;
                        break;
                    }
                    if (aVarArr2[s2] == null) {
                        z = true;
                        break;
                    }
                    if (aVarArr2[s2].c() == 0) {
                        z = true;
                        break;
                    }
                    s = (short) (s2 + 1);
                }
            } else {
                z = true;
            }
        } else {
            j.a = false;
            z = true;
        }
        if (z) {
            if (b == 0) {
                switch (((mobak.b.b.j) this).f278a) {
                    case -4:
                    case -3:
                        if (!this.f) {
                            aVarArr = q.a(mobak.b.b.m.f287a);
                            break;
                        } else {
                            aVarArr = q.a(mobak.b.a.b.a.a());
                            break;
                        }
                    case -1:
                        aVarArr = q.a(mobak.b.a.b.a.m59a((byte) 1));
                        break;
                }
                this.a = aVarArr;
            }
            aVarArr = null;
            this.a = aVarArr;
        }
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    @Override // mobak.b.b.a.j, mobak.b.b.a.q, mobak.b.b.j
    public final boolean a(s sVar) {
        switch ((byte) sVar.a) {
            case 48:
                mobak.b.b.m.a(mobak.c.d.b(135), mobak.c.d.b(246), "", new b(this));
                return true;
            case 72:
                this.f = false;
                this.a = null;
                ((j) this).d = (byte) 0;
                b((int) ((j) this).e, 0);
                i();
                ((mobak.b.b.j) this).f271a.c((byte) 73);
                ((mobak.b.b.j) this).f271a.b((byte) 72);
                b(mobak.b.b.m.a.f297a.f149a.m62a());
                return true;
            case 73:
                this.f = true;
                this.a = null;
                ((j) this).d = (byte) 0;
                i();
                ((mobak.b.b.j) this).f271a.b((byte) 73);
                ((mobak.b.b.j) this).f271a.c((byte) 72);
                b(mobak.c.d.a(52));
                return true;
            case 79:
                if (((j) this).f177d) {
                    try {
                        mobak.b.a.a a = a();
                        if (a.mo82b() > 0) {
                            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[71], (short) 8, mobak.a.a.b.f33a[17]);
                            lVar.a(a.e());
                            lVar.a(a.mo82b());
                            a.b(0);
                            mobak.a.a.f15a.a(lVar);
                        }
                    } catch (Exception e) {
                        mobak.a.a.a(new StringBuffer().append(e).toString());
                    }
                }
                f();
                return true;
            case 98:
                try {
                    mobak.b.a.a a2 = a();
                    mobak.a.a.l lVar2 = new mobak.a.a.l(mobak.a.a.b.f33a[72], (short) 8, mobak.a.a.b.f33a[17]);
                    lVar2.a(a2.e());
                    mobak.a.a.f15a.a(lVar2);
                    return true;
                } catch (Exception e2) {
                    mobak.a.a.a(new StringBuffer().append(e2).toString());
                    return true;
                }
            case 100:
                ?? r0 = this.f;
                if (r0 != 0) {
                    try {
                        ((mobak.b.b.j) this).f271a.a((short) 52, (byte) 100);
                        mobak.a.a.l lVar3 = new mobak.a.a.l(mobak.a.a.b.f33a[67], (short) 0, mobak.a.a.b.f33a[7]);
                        lVar3.a((byte) 1);
                        r0 = mobak.a.a.f15a.a(lVar3);
                    } catch (Exception e3) {
                        mobak.a.a.a(r0.getMessage());
                    }
                } else {
                    ((mobak.b.b.j) this).f271a.a((short) 172, (byte) 100);
                }
                this.f = !this.f;
                this.a = null;
                i();
                b((int) ((j) this).e, 0);
                ((j) this).d = (byte) 0;
                return true;
            default:
                return super.a(sVar);
        }
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final void a(Graphics graphics) {
        try {
            if (((mobak.b.b.j) this).f278a == -3 && this.f) {
                if (mobak.b.a.b.a.m68d() <= 0) {
                    ((mobak.b.b.j) this).f271a.a((byte) 100, true, false);
                } else {
                    ((mobak.b.b.j) this).f271a.a((byte) 100, false, false);
                }
            }
            super.c(graphics);
            if (((j) this).f177d) {
                int height = mobak.b.b.m.a.getHeight() / 2;
                Image a = mobak.c.a(mobak.c.a("plus_minus.png"));
                int width = mobak.b.b.m.a.getWidth() - 29;
                mobak.b.b.m.a(graphics, a, 0, 0, 29, 27, 0, width, height, 0);
                mobak.b.b.m.a(graphics, a, 29, 0, 29, 27, 0, width, height + 27, 0);
            }
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("ArmyView ").append(e.getMessage()).toString());
        }
    }

    @Override // mobak.b.b.a.j, mobak.b.b.j
    /* renamed from: a */
    public final void mo90a() {
        boolean z;
        if (((mobak.b.b.j) this).f278a == -4) {
            return;
        }
        ((mobak.b.b.j) this).f271a.a(true, false);
        if (((mobak.b.b.j) this).f278a == -3) {
            if (mobak.b.a.b.a.m69c() == 5 || !this.f) {
                ((mobak.b.b.j) this).f271a.b((byte) 79);
            } else {
                ((mobak.b.b.j) this).f271a.c((byte) 79);
                ((mobak.b.b.j) this).f271a.a((byte) 79, false);
            }
            mobak.b.a.a a = a();
            mobak.b.a.f[] a2 = mobak.b.a.b.a.a();
            short s = 0;
            while (true) {
                short s2 = s;
                if (a2 != null && s2 < a2.length) {
                    if (a2[s2] != null && a2[s2] != a && a2[s2].a(a)) {
                        z = true;
                        break;
                    }
                    s = (short) (s2 + 1);
                } else {
                    break;
                }
            }
            z = false;
            if (z) {
                ((mobak.b.b.j) this).f271a.c((byte) 98);
                ((mobak.b.b.j) this).f271a.a((byte) 98, false);
            } else {
                ((mobak.b.b.j) this).f271a.b((byte) 98);
            }
        }
        if (((mobak.b.b.j) this).f278a == -3 && ((j) this).e == 0) {
            return;
        }
        super.mo90a();
    }

    @Override // mobak.b.b.j
    /* renamed from: g */
    public final void mo144g() {
        this.a = null;
        super.mo144g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(a aVar) {
        mobak.b.a.a a = aVar.a();
        if (a != null) {
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[68]);
            if (!aVar.f) {
                lVar.a((byte) 2);
                mobak.b.a.b.a.e(-1);
            } else if (mobak.b.a.b.a.m69c() <= 1) {
                mobak.b.b.m.a(mobak.c.d.a(135), mobak.c.d.a(165));
                return;
            } else {
                lVar.a((byte) 1);
                mobak.b.a.b.a.a((byte) a.d(), (mobak.b.a.f) null);
            }
            if (((j) aVar).d > 0) {
                ((j) aVar).d = (byte) (((j) aVar).d - 1);
            }
            if (((j) aVar).d < ((j) aVar).f175a[((j) aVar).e]) {
                aVar.b((int) ((j) aVar).e, (int) ((j) aVar).d);
            }
            a.c(0);
            aVar.i();
            lVar.a(a.e());
            mobak.a.a.f15a.a(lVar);
        }
    }
}
