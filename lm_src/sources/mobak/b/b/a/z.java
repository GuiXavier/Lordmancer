package mobak.b.b.a;

import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import mobak.Main2;

/* loaded from: LordmancerL.jar:mobak/b/b/a/z.class */
public final class z extends j {
    private mobak.b.a.e[] a;

    public static void b(Graphics graphics, short s, short s2) {
        q.a(graphics, (int) s, (int) s2, 0);
        byte a = (byte) (14 - mobak.c.a((byte) 5, 4));
        mobak.b.b.m.a(graphics, mobak.b.a.f.a((byte) 5), 148, 23, (29 - a) - 2, 23, 0, s + a, s2 + 2 + 1, 0);
    }

    public static void c(Graphics graphics, short s, short s2) {
        q.a(graphics, (int) s, (int) s2, 0);
        mobak.b.b.m.a(graphics, mobak.b.a.e.a(0), 0, 0, 25, 23, 0, s + 1, s2 + 2 + 1, 0);
    }

    private void b() {
        if (this.a != null) {
            byte b = 0;
            while (true) {
                byte b2 = b;
                if (b2 >= this.a.length) {
                    break;
                }
                this.a[b2] = null;
                b = (byte) (b2 + 1);
            }
        } else {
            this.a = new mobak.b.a.e[10];
        }
        mobak.b.a.b.a.c(this.a);
        ((mobak.b.b.j) this).f279a.m207c();
    }

    public static z a(short s) {
        boolean z;
        String str;
        String valueOf = String.valueOf((int) s);
        switch (s) {
            case -5:
            case -2:
            case -1:
            case 4:
            case 8:
            case 32:
            case 64:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        boolean z2 = z;
        InputStream resourceAsStream = Main2.a.getClass().getResourceAsStream(new StringBuffer("/mobak/help/").append(valueOf).toString());
        if (resourceAsStream == null) {
            return null;
        }
        byte[] a = Main2.a(resourceAsStream);
        resourceAsStream.close();
        z zVar = new z((short) -11);
        zVar.mo144g();
        String str2 = new String(a, "UTF-8");
        while (str2 != null && !str2.equals("")) {
            if (str2.indexOf("\n") > 0) {
                str = str2.substring(0, str2.indexOf("\n") - 1);
                str2 = str2.substring(str2.indexOf("\n") + 1);
            } else {
                str = str2;
                str2 = null;
            }
            int i = 0;
            while (i < str.length() && !Character.isDigit(str.charAt(i)) && str.charAt(i) != '#' && str.charAt(i) != '/') {
                i++;
            }
            if (i >= str.length()) {
                str = "";
            } else if (i > 0) {
                str = str.substring(i);
            }
            if (!str.startsWith("#") && !str.startsWith("//")) {
                short parseShort = Short.parseShort(str.substring(0, str.indexOf(" ")));
                String substring = str.substring(str.indexOf(" "));
                if (parseShort > 0) {
                    mobak.b.b.p pVar = ((mobak.b.b.j) zVar).f279a;
                    pVar.f352a += 5;
                    int i2 = pVar.f352a;
                    pVar.a(substring, mobak.b.b.j.f259b, (byte) 34, false, -1);
                    pVar.a(parseShort, (short) 1, (short) i2, z2);
                    if (pVar.f352a < i2 + 8 + 27) {
                        pVar.f352a = i2 + 8 + 27;
                    }
                } else {
                    ((mobak.b.b.j) zVar).f279a.f352a += 5;
                    ((mobak.b.b.j) zVar).f279a.a(substring, mobak.b.b.j.f259b, false, -1);
                }
            }
        }
        return zVar;
    }

    public z(short s) {
        super(s);
        this.a = null;
        try {
            mobak.b.b.m.a.k();
            mobak.b.a.e.b();
            switch (s) {
                case -11:
                case -7:
                    a((short) 2, (short) (mo90a() + 8), (short) (mobak.b.b.m.a.getWidth() - 4), (short) (((mobak.b.b.m.a.getHeight() - mo90a()) - r.a()) - 16), true);
                    ((mobak.b.b.j) this).f271a = new r(null, new byte[]{55}, null);
                    ((q) this).f190b = mobak.c.d.a(298);
                    return;
                case -5:
                    a((short) 2, (short) (mo90a() + 8), (short) (mobak.b.b.m.a.getWidth() - 75), (short) (((mobak.b.b.m.a.getHeight() - mo90a()) - 16) - r.a()), true);
                    try {
                        ((mobak.b.b.j) this).f271a = new r(new byte[]{74, 86}, new byte[]{51, 55, 95}, null);
                        s sVar = new s((byte) 30);
                        sVar.f203a = mobak.a.a.b.f33a[90];
                        sVar.a((short) 269);
                        sVar.b = mobak.a.a.b.f33a[90];
                        ((mobak.b.b.j) this).f271a.a(false, sVar);
                    } catch (Exception e) {
                        mobak.a.a.a("popupMenu create");
                    }
                    ((j) this).c = a(true);
                    ((q) this).f190b = mobak.c.d.a(93);
                    ((j) this).e = (byte) 0;
                    ((j) this).d = (byte) 0;
                    mo90a();
                    return;
                default:
                    return;
            }
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("ViewHelp () ").append(e2).toString());
        }
        mobak.a.a.a(new StringBuffer("ViewHelp () ").append(e2).toString());
    }

    public final void d(String str) {
        ((mobak.b.b.j) this).f279a.a(str, mobak.b.b.j.f259b, false, -1);
    }

    @Override // mobak.b.b.a.j
    protected final boolean e() {
        if (((mobak.b.b.j) this).f278a == -7 || ((mobak.b.b.j) this).f278a == -11) {
            mobak.b.b.m.a.g();
            return true;
        }
        super.a((short) 0);
        return true;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final void a(Graphics graphics) {
        try {
            super.a(graphics);
            if (((mobak.b.b.j) this).f278a == -5) {
                try {
                    d(graphics);
                    if (((mobak.b.b.j) this).f279a.m208a()) {
                        StringBuffer stringBuffer = new StringBuffer();
                        try {
                            stringBuffer.append(mobak.b.a.b.a.m62a());
                            ((mobak.b.b.j) this).f279a.a(stringBuffer.toString(), mobak.b.b.j.f259b, false, -1);
                            StringBuffer delete = stringBuffer.delete(0, stringBuffer.toString().length());
                            delete.append(mobak.c.d.a(18)).append(": ").append(mobak.c.d.a(mobak.b.a.b.a.f86a));
                            ((mobak.b.b.j) this).f279a.a(delete.toString(), mobak.b.b.j.f259b, false, -1);
                            StringBuffer delete2 = delete.delete(0, delete.toString().length());
                            delete2.append(mobak.c.d.a(102)).append(": ").append(mobak.b.a.b.a.d());
                            ((mobak.b.b.j) this).f279a.a(delete2.toString(), mobak.b.b.j.f259b, false, -1);
                            StringBuffer delete3 = delete2.delete(0, delete2.toString().length());
                            delete3.append(mobak.c.d.a(101, new String[]{String.valueOf(mobak.b.a.b.a.m66b()), String.valueOf(mobak.b.a.b.a.m67c() + 1)}));
                            ((mobak.b.b.j) this).f279a.a(delete3.toString(), mobak.b.b.j.f259b, false, -1);
                            stringBuffer = delete3.delete(0, delete3.toString().length());
                            String[] m74a = mobak.b.a.b.a.m74a();
                            for (byte b = 0; b < m74a.length; b = (byte) (b + 1)) {
                                stringBuffer.append(m74a[b]);
                                ((mobak.b.b.j) this).f279a.a(stringBuffer.toString(), mobak.b.b.j.f259b, false, -1);
                                stringBuffer = stringBuffer.delete(0, stringBuffer.toString().length());
                            }
                        } catch (Exception e) {
                            mobak.a.a.a(new StringBuffer("1 ").append(e).toString());
                        }
                        try {
                            if (mobak.b.a.b.a.f81a != null && mobak.b.a.b.a.f81a.length > 0) {
                                stringBuffer.append("\n").append(mobak.c.d.a(103)).append(": ");
                                ((mobak.b.b.j) this).f279a.a(stringBuffer.toString(), mobak.b.b.j.f259b, false, -1);
                                stringBuffer = stringBuffer.delete(0, stringBuffer.toString().length());
                                for (byte b2 = 0; b2 < mobak.b.a.b.a.f81a.length; b2 = (byte) (b2 + 1)) {
                                    stringBuffer.append(mobak.b.a.b.a.f81a[b2].f101a).append(": ").append(mobak.b.a.b.a.f81a[b2].b);
                                    mobak.b.a.b bVar = mobak.b.a.b.a;
                                    int m70a = mobak.b.a.b.m70a((short) mobak.b.a.b.a.f81a[b2].f100a);
                                    if (m70a > 0) {
                                        stringBuffer.append(" \f7").append("+").append(Math.abs(m70a));
                                    } else if (m70a < 0) {
                                        stringBuffer.append(" \f2").append("-").append(Math.abs(m70a));
                                    }
                                    int a = mobak.b.a.b.a.a(mobak.b.a.b.a.f81a, (byte) mobak.b.a.b.a.f81a[b2].f100a, 0) - (mobak.b.a.b.a.f81a[b2].b + m70a);
                                    if (a != 0) {
                                        if (a > 0) {
                                            stringBuffer.append(" \f7").append("+").append(Math.abs(a));
                                        } else if (a < 0) {
                                            stringBuffer.append(" \f2").append("-").append(Math.abs(a));
                                        }
                                    }
                                    stringBuffer.append("\f1\n");
                                    ((mobak.b.b.j) this).f279a.a(stringBuffer.toString(), mobak.b.b.j.f259b, false, -1);
                                    stringBuffer = stringBuffer.delete(0, stringBuffer.toString().length());
                                }
                            }
                        } catch (Exception e2) {
                            mobak.a.a.a(new StringBuffer("2: ").append(e2).toString());
                        }
                        try {
                            if (mobak.b.a.b.a.f83b != null && mobak.b.a.b.a.f83b.length > 0) {
                                stringBuffer.append("\n").append(mobak.c.d.a(104)).append(": ");
                                ((mobak.b.b.j) this).f279a.a(stringBuffer.toString(), mobak.b.b.j.f259b, false, -1);
                                StringBuffer delete4 = stringBuffer.delete(0, stringBuffer.toString().length());
                                for (byte b3 = 0; b3 < mobak.b.a.b.a.f83b.length; b3 = (byte) (b3 + 1)) {
                                    delete4.append(mobak.b.a.b.a.f83b[b3].f101a).append(": ").append(mobak.b.a.b.a.f83b[b3].b);
                                    mobak.b.a.b bVar2 = mobak.b.a.b.a;
                                    int m70a2 = mobak.b.a.b.m70a((short) mobak.b.a.b.a.f83b[b3].f100a);
                                    if (m70a2 > 0) {
                                        delete4.append(" \f7").append("+").append(Math.abs(m70a2));
                                    } else if (m70a2 < 0) {
                                        delete4.append(" \f2").append("-").append(Math.abs(m70a2));
                                    }
                                    int a2 = mobak.b.a.b.a.a(mobak.b.a.b.a.f83b, (byte) mobak.b.a.b.a.f83b[b3].f100a, 0) - (mobak.b.a.b.a.f83b[b3].b + m70a2);
                                    if (a2 != 0) {
                                        if (a2 > 0) {
                                            delete4.append(" \f7").append("+").append(Math.abs(a2));
                                        } else if (a2 < 0) {
                                            delete4.append(" \f2").append("-").append(Math.abs(a2));
                                        }
                                    }
                                    delete4.append("\f1\n");
                                    ((mobak.b.b.j) this).f279a.a(delete4.toString(), mobak.b.b.j.f259b, false, -1);
                                    delete4 = delete4.delete(0, delete4.toString().length());
                                }
                            }
                        } catch (Exception e3) {
                            mobak.a.a.a(new StringBuffer("3: ").append(e3).toString());
                        }
                    }
                } catch (Exception e4) {
                    mobak.a.a.a(new StringBuffer("PopupMenu text ").append(e4.getMessage()).toString());
                }
            } else if (((mobak.b.b.j) this).f279a != null) {
                ((mobak.b.b.j) this).f279a.a(graphics, (byte) 0);
            }
            ((mobak.b.b.j) this).f271a.a(graphics);
        } catch (Exception e5) {
            mobak.a.a.a(new StringBuffer("ViewHelp ").append(e5.getMessage()).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j, mobak.b.b.j
    public final void c(int i) {
        if (((mobak.b.b.j) this).f278a != -7 && ((mobak.b.b.j) this).f278a != -11) {
            super.c(i);
        } else if (mobak.b.b.m.a.getGameAction(i) == 6) {
            ((mobak.b.b.j) this).f279a.b();
        } else if (mobak.b.b.m.a.getGameAction(i) == 1) {
            ((mobak.b.b.j) this).f279a.a();
        }
    }

    private static void a(byte b, int i) {
        mobak.b.a.e[] b2 = mobak.b.a.b.a.b(b);
        mobak.b.a.e[] eVarArr = new mobak.b.a.e[i];
        short s = 0;
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (b2 == null || s3 >= b2.length) {
                break;
            }
            if (b2[s3] != null && b2[s3].a() && b2[s3].mo54d() == 0) {
                if (eVarArr[s] == null) {
                    eVarArr[s] = b2[s3];
                    short s4 = (short) (s + 1);
                    s = s4;
                    if (s4 >= i) {
                        s = 0;
                    }
                } else {
                    short s5 = 0;
                    while (true) {
                        short s6 = s5;
                        if (s6 >= i) {
                            break;
                        }
                        if (eVarArr[s6].m49a((byte) 1) < b2[s3].m49a((byte) 1)) {
                            eVarArr[s6] = b2[s3];
                            break;
                        }
                        s5 = (short) (s6 + 1);
                    }
                }
            }
            s2 = (short) (s3 + 1);
        }
        short s7 = 0;
        while (true) {
            short s8 = s7;
            if (s8 >= i) {
                return;
            }
            mobak.b.a.b bVar = mobak.b.a.b.a;
            mobak.b.a.b.m71a(eVarArr[s8]);
            s7 = (short) (s8 + 1);
        }
    }

    @Override // mobak.b.b.a.j, mobak.b.b.a.q, mobak.b.b.j
    public final boolean a(s sVar) {
        switch (sVar.m132a()) {
            case 48:
                a((byte) 3, 1);
                a((byte) 4, 1);
                a((byte) 2, 1);
                a((byte) 5, 1);
                a((byte) 1, 2);
                a((byte) 6, 4);
                b();
                return true;
            case 74:
                mobak.b.a.e[] b = mobak.b.a.b.a.b(a(((j) this).d));
                boolean z = false;
                if (b != null) {
                    byte b2 = 0;
                    while (true) {
                        byte b3 = b2;
                        if (b3 < b.length) {
                            if (b[b3] == null || b[b3].mo54d() > 0) {
                                b2 = (byte) (b3 + 1);
                            } else {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    mobak.b.b.m.a(mobak.c.d.a(74), mobak.c.d.a(126));
                    return true;
                }
                mobak.b.b.m mVar = mobak.b.b.m.a;
                byte a = a(((j) this).d);
                c cVar = new c((short) -6);
                cVar.m106a(a);
                cVar.mo90a();
                mVar.a((q) cVar, true);
                i();
                return true;
            case 86:
                mobak.b.a.a[] mo148a = mo148a((byte) 0);
                if (mo148a == null || mo148a.length <= ((j) this).d || mo148a[((j) this).d] == null) {
                    return false;
                }
                mobak.b.a.b bVar = mobak.b.a.b.a;
                mobak.b.a.b.b((mobak.b.a.e) mo148a[((j) this).d]);
                b();
                mo90a();
                i();
                return true;
            default:
                return super.a(sVar);
        }
    }

    @Override // mobak.b.b.a.j, mobak.b.b.j
    /* renamed from: a */
    public final void mo90a() {
        ((mobak.b.b.j) this).f271a.a(true, false);
        if (((mobak.b.b.j) this).f278a == -5) {
            if (a() == null) {
                ((mobak.b.b.j) this).f271a.a((byte) 74, false);
            } else {
                ((mobak.b.b.j) this).f271a.a((byte) 86, false);
            }
        }
    }

    private static byte a(byte b) {
        switch (b) {
            case 0:
                return (byte) 3;
            case 1:
            case 2:
            case 3:
            case 4:
                return (byte) 6;
            case 5:
            case 6:
                return (byte) 1;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 2;
            case 9:
                return (byte) 5;
            default:
                return (byte) -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j
    /* renamed from: a, reason: collision with other method in class */
    public final mobak.b.a.a[] mo148a(byte b) {
        switch (((mobak.b.b.j) this).f278a) {
            case -5:
                return this.a;
            default:
                return super.mo148a(b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j
    public final void a(boolean z) {
        if (((mobak.b.b.j) this).f278a == -5) {
            byte b = z ? (byte) (((j) this).d + 1) : (byte) (((j) this).d - 1);
            byte b2 = b;
            if (b < 0 || b2 >= 10) {
                return;
            }
            ((j) this).d = b2;
            if (((j) this).f175a[((j) this).e] > ((j) this).d) {
                b((int) ((j) this).e, (int) ((j) this).d);
            }
            if (((j) this).d - ((j) this).f175a[((j) this).e] >= ((j) this).c) {
                b((int) ((j) this).e, (int) ((byte) ((((j) this).d - ((j) this).c) + 1)));
            }
        }
    }

    @Override // mobak.b.b.j
    /* renamed from: g */
    public final void mo144g() {
        switch (((mobak.b.b.j) this).f278a) {
            case -5:
                b();
                mo90a();
                super.mo144g();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j, mobak.b.b.a.q, mobak.b.b.j
    public final boolean a(int i, int i2) {
        if (((mobak.b.b.j) this).f278a == -5) {
            return super.a(i, i2);
        }
        ((mobak.b.b.j) this).f279a.a(i, i2);
        mobak.b.b.j.f260a = i;
        mobak.b.b.j.f261b = i2;
        mobak.b.b.j.f262c = i;
        mobak.b.b.j.f263d = i2;
        mobak.b.b.j.f264c = true;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j, mobak.b.b.a.q, mobak.b.b.j
    public final boolean b(int i, int i2, int i3) {
        if (((mobak.b.b.j) this).f278a == -5) {
            return super.b(i, i2, i3);
        }
        if (((mobak.b.b.j) this).f278a != -7 && ((mobak.b.b.j) this).f278a != -11) {
            return false;
        }
        ((mobak.b.b.j) this).f279a.d();
        ((j) this).f179e = 0;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.j, mobak.b.b.a.q, mobak.b.b.j
    /* renamed from: b */
    public final boolean mo108b(int i, int i2) {
        if (((mobak.b.b.j) this).f278a == -5) {
            return super.mo108b(i, i2);
        }
        int i3 = i2 - mobak.b.b.j.f263d;
        if (!((mobak.b.b.j) this).f279a.m213b()) {
            return false;
        }
        ((mobak.b.b.j) this).f279a.m212a(((mobak.b.b.j) this).f279a.m211c() - i3);
        mobak.b.b.j.f263d = i2;
        return false;
    }
}
