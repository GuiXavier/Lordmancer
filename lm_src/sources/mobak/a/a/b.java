package mobak.a.a;

import java.util.Vector;
import mobak.Main2;
import mobak.b.b.a.q;
import mobak.b.b.a.r;
import mobak.b.b.a.s;
import mobak.b.b.a.u;
import mobak.b.b.a.v;
import mobak.b.b.a.y;
import mobak.b.b.a.z;
import mobak.b.b.m;
import mobak.b.b.o;

/* loaded from: LordmancerL.jar:mobak/a/a/b.class */
public final class b {
    private static String[] a = new String[0];

    /* renamed from: a, reason: collision with other field name */
    public static final short[] f33a = {12, 10002, 10001, 3002, 10000, 18, 24, 74, 72, 63, 1012, 16, 26, 64, 21, 73, 25, 20, 61, 27, 65, 60, 22, 1, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 153, 169, 170, 171, 173, 174, 175, 192, 193, 206, 208, 209, 199, 201, 213, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 10003, 10005, 10004, 10006, 10007, 10008, 10011, 10012, 10013, 10009, 10010, 10015, 10016, 10017};

    /* renamed from: a, reason: collision with other field name */
    private static mobak.b.b.g f34a = null;

    /* renamed from: a, reason: collision with other field name */
    private static mobak.i f35a = null;

    /* renamed from: a, reason: collision with other field name */
    private static mobak.c.b f36a = new j();

    /* renamed from: a, reason: collision with other field name */
    private static Vector f37a = new Vector();

    private static short a(short s) {
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 >= f33a.length) {
                return (short) -1;
            }
            if (f33a[s3] == s) {
                return s3;
            }
            s2 = (short) (s3 + 1);
        }
    }

    public static final boolean a() {
        short s = -1;
        boolean z = false;
        try {
            try {
                a.b();
                short a2 = a(a.m22a());
                s = a2;
                z = m31a(a2);
                a.a();
            } catch (Exception e) {
                StringBuffer stringBuffer = new StringBuffer("Executing error: ");
                if (s < 0 || s >= a.length) {
                    stringBuffer.append("index: ").append((int) s).append(" ");
                } else {
                    stringBuffer.append("message: ").append(a[s]).append(" ");
                }
                stringBuffer.append(e.toString());
                mobak.a.a.a(stringBuffer.toString());
                a.a();
            }
            return z;
        } catch (Throwable th) {
            a.a();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.String[], java.lang.String[][]] */
    /* renamed from: a, reason: collision with other method in class */
    private static boolean m31a(short s) {
        boolean z;
        boolean z2;
        mobak.b.b.i a2;
        boolean z3;
        switch (s) {
            case 0:
                Main2.a.a();
                w();
                a.m29a();
                m.a.f295a.m113b();
                byte m26a = a.m26a();
                byte m26a2 = a.m26a();
                if (m26a != 0 && m26a2 != 0) {
                    mobak.b.a.b.a.a(m26a, m26a2);
                    if (m.a.f296a != null) {
                        m.a.f296a.a(m26a, m26a2, true);
                    }
                }
                z = true;
                break;
            case 1:
                z = true;
                break;
            case 2:
                z = true;
                break;
            case 3:
            case 4:
            case 9:
            case 12:
            case 25:
            case 28:
            case 29:
            case 30:
            case 36:
            case 37:
            case 39:
            case 40:
            case 42:
            case 43:
            case 44:
            case 45:
            case 51:
            case 58:
            case 59:
            case 60:
            case 66:
            case 67:
            case 68:
            case 71:
            case 72:
            case 73:
            case 74:
            case 77:
            case 78:
            case 82:
            case 83:
            case 84:
            case 85:
            case 87:
            case 88:
            case 89:
            case 90:
            case 92:
            case 93:
            case 95:
            case 96:
            default:
                throw new Exception("unknown packet");
            case 5:
                m.a.b(false);
                String m29a = a.m29a();
                String m29a2 = a.m29a();
                int m27b = a.m27b();
                int m27b2 = a.m27b();
                m.a(m29a, m29a2, m27b);
                if (m27b2 > 0) {
                    l lVar = new l(f33a[5]);
                    lVar.a(m27b2);
                    mobak.a.a.f15a.a(lVar);
                }
                z = true;
                break;
            case 6:
                if (m.a.f297a == null) {
                    m.a.f297a = new mobak.b.b.a();
                    m.a.a(true);
                }
                if (mobak.b.a.b.a.f90b) {
                    mobak.b.b.a.d.m107b();
                }
                byte[] bArr = null;
                a.m26a();
                if (a.m24a() > 1) {
                    byte[] bArr2 = new byte[a.m24a() - 1];
                    bArr = bArr2;
                    a.b(bArr2);
                }
                m.a.f297a.a(bArr);
                z = true;
                break;
            case 7:
                m.f287a = null;
                switch (a.m26a()) {
                    case 0:
                        m.f287a = a(true);
                        if (m.a.m179a() != null) {
                            m.a.m179a().mo90a();
                        }
                        mobak.b.b.a.j.a = true;
                        z3 = true;
                        break;
                    case 1:
                        m.f287a = m36a(false);
                        if (m.a.m179a() != null) {
                            m.a.m179a().mo90a();
                        }
                        mobak.b.b.a.j.a = true;
                        z3 = true;
                        break;
                    default:
                        z3 = false;
                        break;
                }
                z = z3;
                break;
            case 8:
                if (a.m26a() == 1 && a.c() == 128) {
                    m.a.a((q) b(), true);
                }
                z = true;
                break;
            case 10:
                z = m37a(true);
                break;
            case 11:
                if (mobak.b.a.b.a.f90b) {
                    mobak.b.b.a.d.m107b();
                }
                m.a(a.m29a(), a.m29a(), a.m29a(), new e());
                mobak.a.a.b = a.c();
                m.a.b(false);
                z = true;
                break;
            case 13:
                z = true;
                break;
            case 14:
                z = m38b();
                break;
            case 15:
                z = c();
                break;
            case 16:
                z = e();
                break;
            case 17:
                z = d();
                break;
            case 18:
                z = f();
                break;
            case 19:
                z = g();
                break;
            case 20:
                z = h();
                break;
            case 21:
                z = i();
                break;
            case 22:
                z = j();
                break;
            case 23:
                z = k();
                break;
            case 24:
                z = l();
                break;
            case 26:
                z = m();
                break;
            case 27:
                z = n();
                break;
            case 31:
                z = o();
                break;
            case 32:
                mobak.a.a.f15a.c();
                mobak.a.a.f15a.a(false);
                m.a.a((byte) 1);
                m.a.f295a = q.a();
                String m29a3 = a.m29a();
                String m29a4 = a.m29a();
                m.a.f295a.a((String[][]) new String[]{mobak.b.b.a.f.a(), new String[0]});
                m.a(mobak.c.d.a(29), m29a3, m29a4, new g());
                z = true;
                break;
            case 33:
                m mVar = m.a;
                m.a();
                if (mobak.b.a.b.a.f90b) {
                    mobak.b.b.a.d.m107b();
                }
                byte m26a3 = a.m26a();
                mobak.a.a.f15a.a(f33a[34], false);
                if (m26a3 == 0) {
                    mobak.a.a.f15a.c();
                    m.a(a.m29a(), a.m29a());
                    mobak.b.b.j.f();
                    m.a.m174a().d((byte) 0);
                    z2 = true;
                } else if (m26a3 == 3) {
                    a.m27b();
                    m.a(mobak.c.d.a(135), a.m29a(), mobak.c.d.a(184), new c());
                    m.a.b(false);
                    z2 = true;
                } else {
                    if (m.a.f297a == null) {
                        m.a.f297a = new mobak.b.b.a();
                    }
                    mobak.b.a.b.a.f78b = 0;
                    m.a.f297a.f149a = new mobak.b.a.b(false);
                    String m29a5 = a.m29a();
                    String m29a6 = a.m29a();
                    int m27b3 = a.m27b();
                    if (m29a5.equals("") || m29a6.equals("")) {
                        m.a.a((byte) 3);
                        m.a.m();
                    } else {
                        m.a.b(false);
                        m.a(m29a5, m29a6, new d(), 15000);
                    }
                    m.a.f297a.f149a.f73a = m27b3;
                    m.a.f297a.f149a.f69a = a.m29a();
                    int a3 = mobak.c.a(m27b3, (byte) 1);
                    if (a3 >= 0 && (a2 = mobak.c.a(a3)) != null) {
                        a2.m162c();
                        mobak.d m232a = mobak.c.m232a(a2.c());
                        byte b = 0;
                        while (true) {
                            byte b2 = b;
                            if (b2 < m232a.e) {
                                mobak.c.m225a((byte) (a2.m158a() + m232a.f379a[b2][0]), (byte) (a2.b() + m232a.f379a[b2][1]));
                                b = (byte) (b2 + 1);
                            }
                        }
                    }
                    mobak.a.a.f15a.a(new l(f33a[9]));
                    z2 = true;
                }
                z = z2;
                break;
            case 34:
                z = q();
                break;
            case 35:
                z = r();
                break;
            case 38:
                z = s();
                break;
            case 41:
                z = t();
                break;
            case 46:
                z = J();
                break;
            case 47:
                z = u();
                break;
            case 48:
                z = M();
                break;
            case 49:
                z = v();
                break;
            case 50:
                z = w();
                break;
            case 52:
                z = x();
                break;
            case 53:
                z = y();
                break;
            case 54:
                z = true;
                break;
            case 55:
                z = K();
                break;
            case 56:
                z = z();
                break;
            case 57:
                z = E();
                break;
            case 61:
                z = A();
                break;
            case 62:
                z = B();
                break;
            case 63:
                z = C();
                break;
            case 64:
                z = D();
                break;
            case 65:
                mobak.b.a.b.a.a(a.m28a());
                z = true;
                break;
            case 69:
                z = F();
                break;
            case 70:
                z = I();
                break;
            case 75:
                z = L();
                break;
            case 76:
                z = N();
                break;
            case 79:
                z = O();
                break;
            case 80:
                z = P();
                break;
            case 81:
                z = Q();
                break;
            case 86:
                z = R();
                break;
            case 91:
                m.a.g();
                z = true;
                break;
            case 94:
                z = T();
                break;
            case 97:
                z = S();
                break;
            case 98:
                z = U();
                break;
            case 99:
                z = V();
                break;
            case 100:
                z = W();
                break;
            case 101:
                z = X();
                break;
            case 102:
                z = Y();
                break;
            case 103:
                z = Z();
                break;
            case 104:
                z = aa();
                break;
            case 105:
                z = ab();
                break;
            case 106:
                z = p();
                break;
            case 107:
                mobak.a.a.f15a.c();
                mobak.a.a.f15a.a(false);
                m.a.a((byte) 1);
                m.a.f295a = q.a();
                String m29a7 = a.m29a();
                m.a.f295a.a((String[][]) new String[]{mobak.b.b.a.f.a(), new String[0]});
                m.a(mobak.c.d.a(29), m29a7, new h());
                z = true;
                break;
            case 108:
                Main2.m5c();
                z = true;
                break;
            case 109:
                z = ac();
                break;
            case 110:
                z = ad();
                break;
            case 111:
                z = G();
                break;
            case 112:
                z = H();
                break;
            case 113:
                z = ae();
                break;
            case 114:
                z = af();
                break;
            case 115:
                z = ag();
                break;
            case 116:
                z = ah();
                break;
            case 117:
                z = ai();
                break;
            case 118:
                z = true;
                break;
        }
        return z;
    }

    private static final mobak.b.a.f[] a(boolean z) {
        try {
            if (a.m25b()) {
                return null;
            }
            int m26a = a.m26a();
            mobak.b.a.f[] fVarArr = new mobak.b.a.f[m26a];
            for (int i = 0; i < m26a; i++) {
                fVarArr[i] = null;
            }
            for (int i2 = 0; !a.m21a() && i2 < m26a; i2++) {
                fVarArr[i2] = m32a();
                if (z) {
                    fVarArr[i2].e(false);
                }
            }
            return fVarArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static final mobak.b.a.f m32a() {
        try {
            int m27b = a.m27b();
            boolean z = a.m26a() > 0;
            byte m26a = a.m26a();
            byte b = (byte) (m26a & 15);
            byte b2 = (byte) ((m26a >> 4) & 15);
            mobak.b.a.f fVar = new mobak.b.a.f();
            fVar.e((byte) 0);
            fVar.f((byte) 0);
            fVar.e(m27b);
            fVar.a(z);
            fVar.m86b(m26a);
            fVar.d(a.c());
            fVar.c(a.c());
            fVar.i(a.c());
            fVar.b(a.c());
            fVar.a(a.c());
            fVar.j(fVar.mo82b());
            fVar.e(a.c());
            fVar.f(a.c());
            fVar.g(a.c());
            fVar.h(a.c());
            fVar.g(a.m26a());
            fVar.a((byte) 0, a.m26a());
            fVar.h(fVar.h());
            fVar.i(a.m26a());
            fVar.c(a.m27b());
            fVar.a(a.m29a());
            fVar.a((byte) (b + 1));
            fVar.mo81a((int) b2);
            byte m26a2 = a.m26a();
            fVar.d((byte) ((m26a2 >> 4) & 15));
            fVar.c((byte) (m26a2 & 15));
            fVar.a(new int[]{a.m27b(), a.m27b()});
            fVar.b(a.m29a());
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static final mobak.b.b.a.f m33a() {
        try {
            mobak.b.b.a.f fVar = new mobak.b.b.a.f((short) -104);
            int c = a.c();
            String[][] strArr = new String[1][c + 1];
            short[] sArr = new short[c];
            for (short s = 0; s < c; s = (short) (s + 1)) {
                sArr[s] = a.c();
                strArr[0][s] = a.m29a();
            }
            fVar.c(a.m29a());
            fVar.b(a.m29a());
            strArr[0][c] = mobak.c.d.a(125);
            byte m26a = a.m26a();
            ((mobak.b.b.j) fVar).f271a = new r(null, new byte[]{52, 64, 97, 95, 103, 104}, null);
            ((mobak.b.b.j) fVar).f271a.a(true, (byte) 85, (short) 93);
            ((mobak.b.b.j) fVar).f271a.a(true, (byte) 106, (short) 299);
            ((mobak.b.b.j) fVar).f271a.a(true, (byte) 88, (short) 52);
            ((mobak.b.b.j) fVar).f271a.a(true, (byte) 87, (short) 95);
            ((mobak.b.b.j) fVar).f271a.a(true, (byte) 102, (short) 181);
            fVar.a((byte) 0);
            fVar.b((byte) 0);
            fVar.e((byte) 2);
            fVar.a(strArr);
            fVar.a(sArr);
            fVar.c(mobak.b.a.b.m78a(m26a));
            int m26a2 = a.m26a();
            for (int i = 0; i < m26a2; i++) {
                boolean z = a.m26a() != 0;
                String m29a = a.m29a();
                short c2 = a.c();
                mobak.c.d.a(c2, m29a);
                ((mobak.b.b.j) fVar).f271a.a(z, r.a(c2), c2);
            }
            mobak.b.b.j.e();
            return fVar;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("City Entry ").append(e.getMessage()).toString());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String[], java.lang.String[][]] */
    private static final mobak.b.b.a.f b() {
        try {
            mobak.b.b.a.f fVar = new mobak.b.b.a.f((short) -102);
            fVar.b(mobak.c.d.a(200));
            int c = a.c();
            if (c > 0) {
                String[][] strArr = new String[2][c + 1];
                String[] strArr2 = new String[2];
                strArr2[0] = mobak.c.d.a(33);
                strArr2[1] = mobak.c.d.a(32);
                strArr[0] = strArr2;
                short[] sArr = new short[c];
                long[] jArr = new long[c];
                for (byte b = 0; b < c && !a.m21a(); b = (byte) (b + 1)) {
                    sArr[b] = a.c();
                    strArr[1][b] = a.m29a();
                    jArr[b] = a.m28a();
                }
                strArr[1][c] = mobak.c.d.a(34);
                fVar.a(sArr);
                fVar.a(strArr);
                fVar.a(jArr);
            } else {
                fVar.a((String[][]) new String[]{new String[]{mobak.c.d.a(32)}});
            }
            fVar.e((byte) 3);
            fVar.a((byte) 0);
            fVar.b((byte) 0);
            fVar.c(false);
            ((mobak.b.b.j) fVar).f271a = new r(null, new byte[]{55}, null);
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Throwable, int] */
    /* renamed from: a, reason: collision with other method in class */
    private static final mobak.b.b.i m34a() {
        mobak.b.b.i a2;
        ?? b;
        try {
            boolean z = false;
            int m27b = a.m27b();
            byte m26a = a.m26a();
            int b2 = mobak.c.b(m27b, m26a);
            if (b2 == -1) {
                a2 = m26a == 1 ? new mobak.b.b.h(a.m26a()) : new mobak.b.b.i();
                z = true;
                a2.a(m27b);
                a2.m154a(m26a);
            } else {
                a2 = mobak.c.a(b2);
                if (m26a == 1) {
                    a.m26a();
                }
            }
            mobak.d m232a = mobak.c.m232a(a2.c());
            byte m26a2 = a.m26a();
            if (((byte) (m26a2 & 1)) == 1) {
                a2.e(a.m26a());
            }
            if (((byte) (m26a2 & 2)) == 2) {
                a2.c(a.m26a());
                a2.d((byte) 0);
            }
            if (((byte) (m26a2 & 4)) == 4) {
                a2.a(a.m29a());
            }
            if (((byte) (m26a2 & 8)) == 8) {
                int m26a3 = a.m26a();
                if (m26a3 == 0) {
                    a2.a((int[]) null);
                } else {
                    int[] iArr = new int[m26a3];
                    for (byte b3 = 0; !a.m21a() && b3 < m26a3; b3 = (byte) (b3 + 1)) {
                        iArr[b3] = a.m27b();
                    }
                    a2.a(iArr);
                }
            }
            if (z && m232a != null) {
                byte b4 = m232a.c;
                mobak.b.b.i.m160a();
                byte b5 = m232a.b;
                mobak.b.b.i.m161b();
                a2.b(m232a.d);
            }
            if (((byte) (m26a2 & 16)) == 16) {
                a2.a(a.m26a(), a.m26a(), false);
            }
            if (z) {
                b = mobak.c.b(a2);
            }
            return a2;
        } catch (Exception e) {
            mobak.a.a.a(b.getMessage());
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static final mobak.b.a.e m35a(boolean z) {
        try {
            mobak.b.a.e eVar = new mobak.b.a.e(z);
            eVar.g(a.m27b());
            eVar.a(a.m26a() > 0);
            eVar.d(a.m26a());
            eVar.mo81a(a.m27b());
            eVar.a(a.m26a());
            eVar.a(a.m29a());
            eVar.c(a.m29a());
            eVar.e(a.m27b());
            eVar.a(a.c());
            eVar.c(a.m27b());
            eVar.f(a.m26a());
            eVar.b(a.m26a());
            eVar.c(a.m26a());
            eVar.e(a.m26a());
            eVar.f109a = new mobak.b.a.d[a.m26a()];
            if (eVar.f109a.length > 0) {
                for (byte b = 0; b < eVar.f109a.length && !a.m21a(); b = (byte) (b + 1)) {
                    eVar.f109a[b] = new mobak.b.a.d();
                    eVar.f109a[b].f100a = a.m27b();
                    eVar.f109a[b].f101a = mobak.c.d.b.a(eVar.f109a[b].f100a);
                    eVar.f109a[b].b = (int) a.a(a.m26a());
                }
            }
            eVar.a(new int[]{a.m27b(), a.m27b(), a.m27b()});
            eVar.b(a.m29a());
            return eVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static final mobak.b.a.e[] m36a(boolean z) {
        try {
            int m26a = a.m26a();
            if (m26a == 0) {
                return null;
            }
            mobak.b.a.e[] eVarArr = new mobak.b.a.e[m26a];
            for (byte b = 0; b < m26a; b = (byte) (b + 1)) {
                if (a.m21a()) {
                    break;
                }
                eVarArr[b] = m35a(z);
            }
            return eVarArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static final boolean m37a(boolean z) {
        switch (a.m26a()) {
            case 0:
                m.a.a(m33a(), z);
                return true;
            case 1:
                mobak.a.a.f15a.c();
                m.a(mobak.c.d.a(119), mobak.c.d.a(120));
                return true;
            default:
                return true;
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    private static final boolean m38b() {
        if (m.a.f297a == null) {
            m.a.f297a = new mobak.b.b.a();
        }
        if (m.a.f297a.f149a == null) {
            m.a.f297a.f149a = new mobak.b.a.b(false);
        }
        mobak.b.a.f[] a2 = a(false);
        if (a2 == null) {
            return true;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= a2.length) {
                break;
            }
            a2[b2].e(true);
            if (a2[b2] != null && a2[b2].c() >= 0 && a2[b2].c() < 5) {
                m.a.f297a.f149a.a((byte) a2[b2].c(), a2[b2]);
            }
            b = (byte) (b2 + 1);
        }
        if (m.a.f297a == null) {
            return true;
        }
        m.a.f297a.c();
        return true;
    }

    private static final boolean c() {
        if (a.m26a() != 2) {
            return true;
        }
        m.a.g();
        m.a("Ошибка!", "Произошла ошибка, попробуйте еще раз.");
        if (!mobak.b.b.j.b()) {
            return true;
        }
        mobak.a.a.f15a.c();
        return true;
    }

    private static final boolean d() {
        mobak.b.a.b.a.d(a.m27b());
        mobak.b.a.f[] a2 = a(true);
        if (a2 == null) {
            return false;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                break;
            }
            mobak.b.a.b.a.a(b2, (mobak.b.a.f) null);
            b = (byte) (b2 + 1);
        }
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= a2.length) {
                break;
            }
            if (a2[b4] != null && a2[b4].c() >= 0 && a2[b4].c() < 5) {
                mobak.b.a.b.a.a((byte) a2[b4].c(), a2[b4]);
            }
            b3 = (byte) (b4 + 1);
        }
        m.a.m174a().mo144g();
        if (m.a.f297a != null) {
            m.a.f297a.m93b();
        }
        mobak.b.b.a.j.a = true;
        return true;
    }

    private static final boolean e() {
        mobak.b.a.b.a.f(a.m27b());
        mobak.b.a.e[] m36a = m36a(false);
        if (m36a == null || m36a.length == 0) {
            mobak.b.a.b.a.a((mobak.b.a.e[]) null);
        } else {
            mobak.b.a.e[] eVarArr = new mobak.b.a.e[30];
            for (int i = 0; i < m36a.length; i++) {
                if (m36a[i] != null) {
                    eVarArr[m36a[i].d()] = m36a[i];
                }
            }
            if (mobak.b.a.b.a == null) {
                mobak.b.a.b.a = new mobak.b.a.b(true);
            }
            mobak.b.a.b.a.a(eVarArr);
            m.a.m174a().mo144g();
        }
        mobak.b.a.b.a.b(m36a(false));
        mobak.b.b.a.j.a = true;
        return true;
    }

    private static final boolean f() {
        if (mobak.b.a.b.a == null) {
            mobak.b.a.b.a = new mobak.b.a.b(true);
        }
        mobak.b.a.b.a.a(a.m26a(), a.m26a());
        if (m.a.f296a == null) {
            return true;
        }
        m.a.f296a.a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b(), true);
        try {
            m.a.f296a.m199b();
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    private static final boolean g() {
        if (m.a.f296a == null) {
            return true;
        }
        m.a.b(a.m29a(), a.m29a());
        return true;
    }

    private static final boolean h() {
        if (m.a.f296a == null) {
            m.a.f296a = new o();
        }
        synchronized (mobak.a.a.f15a) {
            try {
                if (a.m26a() == 1) {
                    mobak.c.m219a();
                }
                int c = a.c();
                for (int i = 0; i < c; i++) {
                    m34a();
                }
                int c2 = a.c();
                if (c2 > 0) {
                    for (int i2 = 0; !a.m21a() && i2 < c2; i2++) {
                        mobak.c.m218a(a.m27b(), a.m26a());
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (m.a.f296a != null && mobak.b.a.b.a != null) {
            m.a.f296a.m199b();
        }
        m.a.f296a.m199b();
        return true;
    }

    private static final boolean i() {
        if (m.a == null) {
            m.a = new m();
        }
        if (m.a.f296a != null) {
            m.a.f296a.b(false);
        }
        byte m26a = a.m26a();
        byte m26a2 = a.m26a();
        if (m26a != 0 && m26a2 != 0 && mobak.b.a.b.a != null) {
            mobak.b.a.b.a.a(m26a, m26a2);
            if (m.a.f296a != null) {
                m.a.f296a.a(m26a, m26a2, true);
            }
        }
        String m29a = a.m29a();
        int m27b = a.m27b();
        if ((a.m24a() + l.a) - a.f32a < 2500) {
            throw new Exception("Map not full");
        }
        byte[] bArr = new byte[mobak.c.m222b()];
        a.b(bArr);
        mobak.c.a(bArr);
        mobak.b.b.j.f265a = m29a;
        if (m.a.f296a != null && mobak.b.a.b.a != null) {
            m.a.f296a.m199b();
        }
        if (m27b > 0) {
            if (Main2.a.f5a.a((byte) 8, a.a(2))) {
                Main2.a.f5a.a((byte) 9, m27b);
            }
        }
        mobak.c.m219a();
        if (m.a.f296a == null) {
            return true;
        }
        m.a.f296a.b(true);
        return true;
    }

    private static final boolean j() {
        byte m26a = (byte) (a.m26a() - 1);
        byte b = m26a;
        byte b2 = (byte) (m26a + 1);
        mobak.b.a.b bVar = mobak.b.a.b.a;
        if (b >= 50) {
            b = (byte) (b - 50);
            if (m.a.f297a != null) {
                bVar = m.a.f297a.f149a;
            }
        }
        if (bVar == null) {
            return false;
        }
        mobak.b.a.f a2 = bVar.a(b);
        if (b >= 5) {
            a2 = bVar == mobak.b.a.b.a ? m.a.f297a.m98a((byte) (b + 1)) : m.a.f297a.m98a((byte) (b + 51));
        }
        if (a2 == null) {
            return false;
        }
        synchronized (a2) {
            mobak.b.a.f fVar = a2;
            if (fVar != null) {
                try {
                    int c = fVar.c();
                    boolean z = false;
                    for (short c2 = a.c(); c2 != Short.MIN_VALUE && !a.m21a(); c2 = a.c()) {
                        if (c2 == 1) {
                            fVar.a(a.m26a(), a.m26a());
                        } else if (c2 == 2) {
                            fVar.g(a.c());
                        } else if (c2 == 4) {
                            c = a.m27b();
                            z = true;
                        } else if (c2 == 16) {
                            fVar.i(a.c());
                        } else if (c2 == 8) {
                            z = true;
                        } else if (c2 == 32) {
                            byte m26a2 = a.m26a();
                            byte b3 = (byte) ((m26a2 >> 4) & 15);
                            byte b4 = (byte) (m26a2 & 15);
                            if (m.a.f297a != null) {
                                m.a.f297a.a(fVar.e(), fVar.f(), b3, b4);
                            }
                            fVar.d(b3);
                            fVar.c(b4);
                        } else if (c2 == 64) {
                            fVar.f(a.m26a());
                            fVar.f(a.c());
                            fVar.e(a.c());
                        } else if (c2 == 128) {
                            fVar.e(a.m26a());
                            fVar.a(a.c());
                            fVar.b(a.c());
                            fVar.c(a.c());
                            fVar.d(a.c());
                        } else if (c2 == 256) {
                            fVar.k(a.m26a());
                            fVar.a();
                            short c3 = a.c();
                            for (short s = 0; s < c3; s = (short) (s + 1)) {
                                fVar.c(a.m29a());
                            }
                        }
                    }
                    if (z) {
                        if (m.a.f297a != null) {
                            m.a.f297a.b(b2, c);
                        } else {
                            fVar.c(c);
                        }
                    }
                } catch (Exception e) {
                    mobak.a.a.a(new StringBuffer("unitSetChange: ").append(e.getMessage()).toString());
                }
            }
        }
        byte m26a3 = a.m26a();
        if (m26a3 == 1) {
            j();
            return true;
        }
        if (m26a3 != 2) {
            return true;
        }
        q();
        return true;
    }

    private static final boolean k() {
        mobak.a.a.f15a.a(new l(f33a[23], (short) 0, (short) 0));
        return true;
    }

    private static final boolean l() {
        f fVar = new f();
        String m29a = a.m29a();
        String str = m29a;
        if (m29a.trim().equals("")) {
            str = mobak.c.d.a(31);
        }
        m.a(mobak.c.d.a(1), str, fVar);
        return true;
    }

    private static final boolean m() {
        if (!mobak.a.a.f15a.m11b()) {
            return true;
        }
        mobak.a.a.f15a.c();
        return true;
    }

    private static final boolean n() {
        if (mobak.a.a.f15a.m11b()) {
            mobak.a.a.f15a.c();
        }
        m.a(mobak.c.d.a(29), mobak.c.d.a(35));
        return true;
    }

    private static final boolean o() {
        if (m.a == null && m.a.f296a == null) {
            return false;
        }
        m.a.b(a.m29a(), a.m29a());
        return true;
    }

    private static final boolean p() {
        m.a.a(true);
        mobak.b.b.j m174a = m.a.m174a();
        if (m174a == null) {
            return true;
        }
        long m28a = a.m28a();
        String str = null;
        if (a.m26a() != 0) {
            str = a.m29a();
        }
        m174a.a(m28a, str);
        return true;
    }

    private static final boolean q() {
        try {
            if (m.a.f297a == null) {
                return false;
            }
            byte m26a = a.m26a();
            m.a.f297a.a(m26a, a.m27b());
            if (m.a.f297a.f134a) {
                int m26a2 = a.m26a();
                byte[] bArr = null;
                if (m26a2 != 0) {
                    byte[] bArr2 = new byte[m26a2];
                    bArr = bArr2;
                    a.b(bArr2);
                }
                byte m26a3 = a.m26a();
                m.a.f297a.a(m26a, mobak.b.b.a.m91a(m26a3), mobak.b.b.a.m92b(m26a3));
                m.a.f297a.b(bArr);
            }
            return true;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("activateUnit ").append(e.toString()).toString());
            return true;
        }
    }

    private static final boolean r() {
        if (m.a.f297a == null) {
            return false;
        }
        byte[] bArr = new byte[a.m26a()];
        a.b(bArr);
        m.a.f297a.c(bArr);
        switch (a.m26a()) {
            case 1:
                j();
                return true;
            case 2:
                q();
                return true;
            default:
                return true;
        }
    }

    private static final boolean s() {
        if (!m.a.m188d()) {
            m mVar = m.a;
            m.d();
            m.a.j();
        }
        byte m26a = a.m26a();
        mobak.a.a.f15a.c();
        if ((m26a & 1) == 1) {
            if ((m26a & 2) == 2) {
                y();
            }
            if ((m26a & 4) == 4) {
                m37a(false);
            }
        } else {
            if (((short) (m26a & 4)) == 4) {
                mobak.c.b();
            }
            a.m26a();
            m.a.a((q) m33a(), false);
            byte m26a2 = a.m26a();
            byte m26a3 = a.m26a();
            if (m26a2 != 0 && m26a3 != 0) {
                mobak.b.a.b.a.a(m26a2, m26a3);
            }
        }
        byte b = 0;
        if (((byte) (m26a & 1)) == 1) {
            b = 2;
        }
        if ((m26a & 6) != 0 || (m26a & 1) == 0) {
            b = (byte) (((byte) (b << 4)) | 4);
        }
        if (m.a.m173a() != 3) {
            m.a.a((byte) 3);
        }
        m.a.f297a.a(b);
        m.a.f296a.m199b();
        return true;
    }

    private static final boolean t() {
        byte m26a = a.m26a();
        if (m26a != 1 && m26a != 2) {
            return true;
        }
        q m179a = m.a.m179a();
        m.a.b(false);
        if (m26a == 1) {
            m.a(mobak.c.d.a(29), mobak.c.d.a(44));
        } else {
            m.a(mobak.c.d.a(83), mobak.c.d.a(45));
        }
        if (m179a == null) {
            return true;
        }
        m.a.a((byte) 2);
        return true;
    }

    private static final boolean u() {
        byte m26a = a.m26a();
        mobak.b.a.f m32a = m32a();
        if (m26a != 1) {
            m32a.e(true);
        } else {
            m32a.e(false);
        }
        int m27b = a.m27b();
        if (m.a.f297a == null) {
            return true;
        }
        m.a.f297a.a(m26a == 1, m32a, m27b);
        return true;
    }

    private static final boolean v() {
        m.a.a((q) q.m118a(a.m29a()), true);
        return true;
    }

    private static final boolean w() {
        if (mobak.b.a.b.a == null) {
            mobak.b.a.b.a = new mobak.b.a.b(true);
        }
        mobak.b.a.b.a.f73a = a.m27b();
        mobak.b.a.b.a.a(a.m29a());
        mobak.b.a.b.a.b(a.c());
        mobak.b.a.b.a.c(a.m27b());
        mobak.b.a.b.a.a(a.m28a());
        mobak.b.a.b.a.b(a.m27b());
        mobak.c.f364a = a.m27b();
        mobak.b.a.b.a.f86a = a.m26a();
        mobak.b.a.b.a.a(a.c());
        int c = a.c();
        if (c > 0) {
            mobak.b.a.d[] dVarArr = new mobak.b.a.d[c];
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= c) {
                    break;
                }
                dVarArr[s2] = new mobak.b.a.d();
                dVarArr[s2].f100a = a.m27b();
                dVarArr[s2].f101a = mobak.c.d.b.a(dVarArr[s2].f100a);
                dVarArr[s2].b = (int) a.a(a.m26a());
                s = (short) (s2 + 1);
            }
            mobak.b.a.b.a.f81a = dVarArr;
        }
        int c2 = a.c();
        if (c2 > 0) {
            mobak.b.a.d[] dVarArr2 = new mobak.b.a.d[c2];
            short s3 = 0;
            while (true) {
                short s4 = s3;
                if (s4 >= c2) {
                    break;
                }
                dVarArr2[s4] = new mobak.b.a.d();
                dVarArr2[s4].f100a = a.m27b();
                dVarArr2[s4].f101a = mobak.c.d.b.a(dVarArr2[s4].f100a);
                dVarArr2[s4].b = (int) a.a(a.m26a());
                s3 = (short) (s4 + 1);
            }
            mobak.b.a.b.a.f83b = dVarArr2;
        }
        String[] strArr = new String[a.m26a()];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= strArr.length) {
                break;
            }
            strArr[b2] = a.m29a();
            b = (byte) (b2 + 1);
        }
        mobak.b.a.b.a.a(strArr);
        s[] sVarArr = new s[a.m26a()];
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= sVarArr.length) {
                break;
            }
            sVarArr[b4] = m40a();
            b3 = (byte) (b4 + 1);
        }
        mobak.b.a.b.a.a(sVarArr);
        int m27b = a.m27b();
        mobak.c.f366c = m27b;
        if (m27b <= 0) {
            mobak.c.f366c = 1;
        }
        m.a.m178e();
        return true;
    }

    private static final boolean x() {
        try {
            if (mobak.a.a.f15a.f25c != a.c()) {
                return true;
            }
            mobak.a.a.f15a.d();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final boolean y() {
        try {
            m39a(false);
            return true;
        } catch (Exception e) {
            mobak.a.a.a((Exception) 1);
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m39a(boolean z) {
        int m27b = a.m27b();
        int m27b2 = a.m27b();
        mobak.b.b.a.l lVar = !z ? new mobak.b.b.a.l(m27b) : new mobak.b.b.a.l(0, m27b);
        m.a.a(lVar, m27b2 == 1);
        byte m26a = a.m26a();
        lVar.a(m26a);
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= m26a || a.m21a()) {
                return;
            }
            byte m26a2 = a.m26a();
            int[][] iArr = new int[a.m26a()][2];
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < iArr.length && !a.m21a()) {
                    iArr[b4][0] = a.m27b();
                    iArr[b4][1] = a.m27b();
                    b3 = (byte) (b4 + 1);
                }
            }
            lVar.a(b2, m26a2, iArr);
            b = (byte) (b2 + 1);
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00f3: INVOKE (r0 I:java.lang.String) = (r0 I:java.lang.Throwable) VIRTUAL call: java.lang.Throwable.getMessage():java.lang.String A[MD:():java.lang.String (c)], block:B:47:0x00f2 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
    private static final boolean z() {
        ?? message;
        try {
            byte m26a = a.m26a();
            boolean z = (m26a & 4) == 4;
            boolean z2 = ((byte) (m26a & 2)) == 2;
            boolean z3 = ((byte) (m26a & 1)) == 1;
            boolean z4 = ((byte) (m26a & 16)) == 16;
            boolean z5 = ((byte) (m26a & 8)) == 8;
            int c = a.c();
            String[] strArr = new String[c];
            String[] strArr2 = new String[c];
            int[] iArr = new int[c];
            int[] iArr2 = new int[c];
            for (short s = 0; !a.m21a() && s < c; s = (short) (s + 1)) {
                iArr[(c - 1) - s] = a.m27b();
                strArr[s] = a.m29a();
                strArr2[s] = a.m29a();
                iArr2[s] = a.m27b();
            }
            if (!z && !z5) {
                mobak.b.b.a.d.a().a(strArr, strArr2, iArr, iArr2);
                return true;
            }
            if (z) {
                mobak.b.b.a.d.a().a(strArr, strArr2, iArr, iArr2, z2, z3, z4);
                return true;
            }
            if (!z5) {
                return true;
            }
            mobak.b.b.a.d.a().b(strArr, strArr2, iArr, iArr2);
            return true;
        } catch (Exception e) {
            mobak.a.a.a(message.getMessage());
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00b7: INVOKE (r0 I:java.lang.String) = (r0 I:java.lang.Throwable) VIRTUAL call: java.lang.Throwable.getMessage():java.lang.String A[MD:():java.lang.String (c)], block:B:37:0x00b6 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
    private static final boolean A() {
        ?? message;
        try {
            byte m26a = a.m26a();
            int c = a.c();
            if (m26a == 1) {
                String[] strArr = new String[c];
                int[] iArr = new int[c];
                for (int i = 0; i < c && !a.m21a(); i++) {
                    iArr[i] = a.m27b();
                    strArr[i] = a.m29a();
                }
                mobak.b.b.a.d.a().a(strArr, iArr);
                return true;
            }
            if (m26a != 2) {
                return true;
            }
            String[] strArr2 = new String[c];
            String[] strArr3 = new String[c];
            int[] iArr2 = new int[c];
            int[] iArr3 = new int[c];
            for (int i2 = 0; i2 < c && !a.m21a(); i2++) {
                strArr2[i2] = a.m29a();
                strArr3[i2] = a.m29a();
                iArr2[i2] = a.m27b();
                iArr3[i2] = a.m27b();
            }
            mobak.b.b.a.d.a().a(strArr2, strArr3, iArr2, iArr3, a.m26a() == 1, a.m26a() == 1);
            return true;
        } catch (Exception e) {
            mobak.a.a.a(message.getMessage());
            return false;
        }
    }

    private static final boolean B() {
        try {
            int c = a.c();
            mobak.b.a.c[] cVarArr = new mobak.b.a.c[c];
            for (short s = 0; s < c && !a.m21a(); s = (short) (s + 1)) {
                cVarArr[s] = new mobak.b.a.c(a.c(), a.m26a(), a.m26a(), a.m26a(), a.m29a(), a.m27b());
            }
            m.a.a((q) new mobak.b.b.a.o(cVarArr), true);
            return true;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("invitation ").append(e.getMessage()).toString());
            return true;
        }
    }

    private static final boolean C() {
        mobak.a.a.f15a.c();
        try {
            String m29a = a.m29a();
            String m29a2 = a.m29a();
            if (m29a2 != null && !m29a2.equals("")) {
                m.a(m29a, m29a2);
            }
            short c = a.c();
            if (c == 0) {
                m.a.b(false);
                return true;
            }
            mobak.a.a.f15a.a(c, false);
            return true;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("cancel: ").append(e.getMessage()).toString());
            return true;
        }
    }

    private static final boolean D() {
        i iVar = new i();
        mobak.a.a.f15a.a(false);
        m.a(mobak.c.d.a(135), mobak.c.d.a(168), iVar);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, mobak.b.b.a.d] */
    private static final boolean E() {
        ?? a2;
        try {
            a.m27b();
            int m27b = a.m27b();
            int m27b2 = a.m27b();
            a2 = mobak.b.b.a.d.a();
            a2.b(m27b, m27b2);
            return true;
        } catch (Exception e) {
            mobak.a.a.a(a2.getMessage());
            return true;
        }
    }

    private static final boolean F() {
        String m29a = a.m29a();
        mobak.c.f365b = a.m27b();
        int m27b = a.m27b();
        int i = m27b;
        if (m27b == 0) {
            i = Integer.MAX_VALUE;
        }
        m.a.a((q) new y(m29a, i), true);
        return true;
    }

    private static final boolean G() {
        u uVar = new u(mobak.c.d.a(299), mobak.c.d.a(300), a.m29a());
        ((mobak.b.b.j) uVar).f271a = new r(null, new byte[]{55, 103}, null);
        m.a.a((q) uVar, true);
        return true;
    }

    private static final boolean H() {
        String m29a = a.m29a();
        String m29a2 = a.m29a();
        Main2.a.f5a.a((byte) 17, m29a);
        Main2.a.f5a.a((byte) 2, m29a2);
        return true;
    }

    private static final boolean I() {
        byte m26a = a.m26a();
        m37a(true);
        if (m26a != 1) {
            return true;
        }
        mobak.c.b();
        return true;
    }

    private static final boolean J() {
        if (m.a.f297a == null) {
            return true;
        }
        m.a.f297a.m99b((byte) 1);
        byte m26a = a.m26a();
        if (m26a == 2) {
            return true;
        }
        m.a.f297a.m100a(m26a == 1);
        return true;
    }

    private static final boolean K() {
        switch (a.m26a()) {
            case 1:
                m.a.b(true);
                return true;
            case 2:
                m.a.b(false);
                return true;
            case 3:
                l();
                return true;
            default:
                return true;
        }
    }

    private static final boolean L() {
        short c = a.c();
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= c) {
                return true;
            }
            short c2 = a.c();
            int m27b = a.m27b();
            int i = a.f32a;
            m31a(a(c2));
            if (a.f32a != i + m27b) {
                mobak.a.a.a("WARNING: bad multiple part length");
                a.f32a = i + m27b;
            }
            if (mobak.a.a.f15a.a(c2)) {
                mobak.a.a.f15a.c();
            }
            s = (short) (s2 + 1);
        }
    }

    private static final boolean M() {
        mobak.b.a.b.a.c(m35a(false));
        return true;
    }

    private static final void a(q qVar) {
        short c = a.c();
        if (c > 0) {
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= c) {
                    break;
                }
                ((mobak.b.b.j) qVar).f271a.a(true, m40a());
                s = (short) (s2 + 1);
            }
        }
        short c2 = a.c();
        if (c2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            short s4 = s3;
            if (s4 >= c2) {
                return;
            }
            ((mobak.b.b.j) qVar).f271a.a(false, m40a());
            s3 = (short) (s4 + 1);
        }
    }

    private static final boolean N() {
        short c = a.c();
        switch (c) {
            case -109:
                String m29a = a.m29a();
                String m29a2 = a.m29a();
                short c2 = a.c();
                int c3 = a.c();
                String[] strArr = new String[c3];
                int[] iArr = new int[c3];
                for (int i = 0; i < c3; i++) {
                    strArr[i] = a.m29a();
                }
                for (int i2 = 0; i2 < c3; i2++) {
                    iArr[i2] = a.m27b();
                }
                u uVar = new u(m29a, m29a2, strArr, iArr);
                uVar.a(c2);
                if (c2 != 0) {
                    ((mobak.b.b.j) uVar).f271a.a(false, (byte) 95, (short) 298);
                }
                a(uVar);
                m.a.a((q) uVar, true);
                return true;
            case -108:
                byte m26a = a.m26a();
                if (m26a == 1 || m26a == 3) {
                    q m179a = m.a.m179a();
                    m179a.a(a.m29a());
                    if (m26a != 3) {
                        return true;
                    }
                    ((mobak.b.b.j) m179a).f271a.m126a();
                    a(m179a);
                    return true;
                }
                String m29a3 = a.m29a();
                String m29a4 = a.m29a();
                short c4 = a.c();
                u uVar2 = new u(m29a3, m29a4, a.m29a());
                uVar2.a(c4);
                a(uVar2);
                m.a.a((q) uVar2, true);
                if (c4 == 0) {
                    return true;
                }
                ((mobak.b.b.j) uVar2).f271a.a(false, (byte) 95, (short) 298);
                return true;
            case -100:
                m.a.a((byte) 2);
                return true;
            default:
                switch (c) {
                    case -13:
                        m.a.a((q) new mobak.b.b.a.o(), true);
                        return true;
                    case -12:
                    case -2:
                    case -1:
                        m.a.a((q) new mobak.b.b.a.c(c), true);
                        return true;
                    case -11:
                    case -10:
                    case -9:
                    case -8:
                    case -7:
                    case -6:
                    default:
                        return true;
                    case -5:
                        m.a.a((q) new z(c), true);
                        return true;
                    case -4:
                    case -3:
                        m.a.a((q) new mobak.b.b.a.a(c), true);
                        return true;
                }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static s m40a() {
        s sVar = new s(a.m27b());
        sVar.f203a = a.c();
        if (((sVar.a >> 24) & 32) == 32) {
            sVar.b = a.c();
        }
        if (sVar.c()) {
            sVar.a(a.m29a());
        }
        if (sVar.d()) {
            int m26a = a.m26a();
            String[] strArr = new String[m26a];
            short[] sArr = new short[m26a];
            int[] iArr = new int[m26a];
            byte b = 0;
            while (true) {
                byte b2 = b;
                if (b2 >= m26a) {
                    break;
                }
                strArr[b2] = a.m29a();
                sArr[b2] = a.c();
                iArr[b2] = a.m27b();
                b = (byte) (b2 + 1);
            }
            sVar.f205a = strArr;
            sVar.f206a = sArr;
            sVar.f207a = iArr;
        }
        return sVar;
    }

    private static boolean O() {
        short c = a.c();
        String m29a = a.m29a();
        short c2 = a.c();
        int m26a = a.m26a();
        mobak.c.c[] cVarArr = new mobak.c.c[m26a];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= m26a) {
                new mobak.b.b.g(cVarArr, m29a, c, c2);
                return true;
            }
            cVarArr[b2] = new mobak.c.c(a.m26a(), a.m26a(), a.m29a());
            if (cVarArr[b2].b == 2) {
                int m26a2 = a.m26a();
                String[] strArr = new String[m26a2];
                boolean[] zArr = new boolean[m26a2];
                byte b3 = 0;
                while (true) {
                    byte b4 = b3;
                    if (b4 >= m26a2) {
                        break;
                    }
                    strArr[b4] = a.m29a();
                    zArr[b4] = a.m26a() == 1;
                    b3 = (byte) (b4 + 1);
                }
                cVarArr[b2].f372a = strArr;
                cVarArr[b2].f373a = zArr;
            }
            if (cVarArr[b2].b == 1) {
                mobak.c.c cVar = cVarArr[b2];
                int m27b = a.m27b();
                int m27b2 = a.m27b();
                cVar.f374a = m27b;
                cVar.f375b = m27b2;
            }
            if (cVarArr[b2].b == 3) {
                cVarArr[b2].f376b = a.m29a();
            }
            b = (byte) (b2 + 1);
        }
    }

    private static boolean P() {
        switch (a.m26a()) {
            case 2:
                o oVar = m.a.f296a;
            case 3:
                o oVar2 = m.a.f296a;
            case 4:
                m.a.m179a();
                break;
        }
        mobak.b.b.j m174a = m.a.m174a();
        if (m174a == null) {
            return false;
        }
        short c = a.c();
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 < c) {
                m174a.f271a.a(false, m40a());
                s = (short) (s2 + 1);
            } else {
                short c2 = a.c();
                short s3 = 0;
                while (true) {
                    short s4 = s3;
                    if (s4 >= c2) {
                        return true;
                    }
                    m174a.f271a.a(true, m40a());
                    s3 = (short) (s4 + 1);
                }
            }
        }
    }

    private static boolean Q() {
        v vVar = new v(a.m27b(), a.c());
        vVar.a(a.c());
        vVar.b(a.m29a());
        String[] strArr = new String[v.a(vVar.m137b())];
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= strArr.length) {
                break;
            }
            strArr[s2] = a.m29a();
            s = (short) (s2 + 1);
        }
        vVar.a(strArr, 0);
        String[] strArr2 = new String[v.a(vVar.c())];
        short s3 = 0;
        while (true) {
            short s4 = s3;
            if (s4 >= strArr2.length) {
                break;
            }
            strArr2[s4] = a.m29a();
            s3 = (short) (s4 + 1);
        }
        vVar.a(strArr2, 1);
        vVar.a(0, a.m26a(), a.m26a());
        vVar.a(1, a.m26a(), a.m26a());
        vVar.a(0, a.c());
        vVar.a(1, a.c());
        vVar.a(0, a.m26a());
        vVar.a(1, a.m26a());
        byte m26a = a.m26a();
        vVar.a(0, (m26a & 8) > 0, (m26a & 4) > 0);
        vVar.a(1, (m26a & 2) > 0, (m26a & 1) > 0);
        boolean z = a.m26a() != 0;
        boolean z2 = z;
        if (z) {
            vVar.b();
        }
        if (!vVar.f()) {
            vVar.b(0, a.c());
            mobak.b.a.a[] aVarArr = null;
            switch (vVar.mo6d()) {
                case 1:
                    aVarArr = a(true);
                    break;
                case 2:
                    aVarArr = m36a(false);
                    break;
            }
            vVar.a((byte) 0, aVarArr);
        }
        vVar.b(1, a.c());
        mobak.b.a.a[] aVarArr2 = null;
        switch (vVar.mo6d()) {
            case 1:
                aVarArr2 = a(true);
                break;
            case 2:
                aVarArr2 = m36a(z2);
                break;
        }
        vVar.a((byte) 1, aVarArr2);
        if (vVar.e()) {
            m.a.g();
        }
        vVar.c(z2);
        m.a.a((q) vVar, true);
        return true;
    }

    private static boolean R() {
        try {
            m39a(true);
            return true;
        } catch (Exception e) {
            mobak.a.a.a((Exception) 1);
            return true;
        }
    }

    private static final boolean S() {
        try {
            int m27b = a.m27b();
            int m27b2 = a.m27b();
            mobak.b.a.e m35a = m35a(false);
            mobak.b.a.b.a.a(m27b, m27b2);
            mobak.b.a.b.a.a(m35a);
            m.a.m174a().mo144g();
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    private static final boolean T() {
        try {
            int m27b = a.m27b();
            mobak.b.a.e m35a = m35a(false);
            mobak.b.a.b.a.h(m27b);
            mobak.b.a.b.a.m72b(m35a);
            m.a.m174a().mo144g();
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    private static final boolean U() {
        a(mobak.c.d.b);
        return true;
    }

    private static final boolean V() {
        a(mobak.c.d.c);
        return true;
    }

    private static final boolean W() {
        a(mobak.c.d.a);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    private static final void a(mobak.c.g gVar) {
        try {
            short c = a.c();
            for (short s = 0; s < c; s++) {
                gVar.a(a.m27b(), a.m29a());
            }
        } catch (Exception unused) {
        }
    }

    private static final boolean X() {
        mobak.b.a.b.a.b(a.m27b());
        return true;
    }

    private static final boolean Y() {
        m.a.m174a();
        mobak.b.b.j.l();
        return true;
    }

    private static final boolean Z() {
        m.a.m174a().m();
        return true;
    }

    private static final boolean aa() {
        s sVar = new s((byte) 30);
        sVar.f203a = f33a[86];
        sVar.a((short) 261);
        sVar.f205a = new String[]{mobak.c.d.a(262, new String[]{String.valueOf(mobak.c.f365b)})};
        sVar.f206a = new short[]{3};
        sVar.f207a = new int[]{2};
        sVar.a(mobak.c.d.a(263));
        sVar.b = f33a[86];
        m.a.m174a().a(sVar);
        return true;
    }

    private static final boolean ab() {
        m.a.m174a();
        mobak.b.b.j.b(a.c());
        return true;
    }

    private static final boolean ac() {
        String m29a = a.m29a();
        Main2 main2 = Main2.a;
        Main2.a(m29a);
        return true;
    }

    private static final boolean ad() {
        mobak.b.a.d[] dVarArr = null;
        int c = a.c();
        if (c > 0) {
            dVarArr = new mobak.b.a.d[c];
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= c) {
                    break;
                }
                dVarArr[s2] = new mobak.b.a.d();
                dVarArr[s2].f100a = a.m27b();
                dVarArr[s2].f101a = mobak.c.d.b.a(dVarArr[s2].f100a);
                dVarArr[s2].b = (int) a.a(a.m26a());
                s = (short) (s2 + 1);
            }
        }
        mobak.b.a.d[] dVarArr2 = null;
        int c2 = a.c();
        if (c2 > 0) {
            dVarArr2 = new mobak.b.a.d[c2];
            short s3 = 0;
            while (true) {
                short s4 = s3;
                if (s4 >= c2) {
                    break;
                }
                dVarArr2[s4] = new mobak.b.a.d();
                dVarArr2[s4].f100a = a.m27b();
                dVarArr2[s4].f101a = mobak.c.d.b.a(dVarArr2[s4].f100a);
                dVarArr2[s4].b = (int) a.a(a.m26a());
                s3 = (short) (s4 + 1);
            }
        }
        mobak.b.a.b.a.a(dVarArr, dVarArr2);
        return true;
    }

    private static final boolean ae() {
        mobak.b.b.g gVar = new mobak.b.b.g(mobak.c.d.b(9), f36a);
        f34a = gVar;
        gVar.a(mobak.c.d.a(280), f35a != null ? f35a.d : "", 32, 0);
        f34a.a(mobak.c.d.a(289), f35a != null ? f35a.b : "", 32, 0);
        f34a.a(mobak.c.d.a(291), f35a != null ? f35a.c : "", 16, 0);
        f34a.a(mobak.c.d.b(8), 0);
        f34a.a(mobak.c.d.b(34), 1);
        f34a.m152a();
        return true;
    }

    private static final boolean af() {
        mobak.a.a.f15a.c();
        boolean z = a.m26a() != 0;
        m.a("", a.m29a(), new k(z));
        if (!z || f35a == null) {
            return true;
        }
        Main2.a.f5a.a((byte) 17, f35a.b);
        Main2.a.f5a.a((byte) 2, f35a.c);
        return true;
    }

    private static boolean ag() {
        a.m28a();
        return true;
    }

    private static boolean ah() {
        a.m26a();
        return true;
    }

    private static boolean ai() {
        int m27b = a.m27b();
        for (int i = 0; i < m27b; i++) {
            String m29a = a.m29a();
            String m29a2 = a.m29a();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(m29a).append(':').append(m29a2);
            f37a.addElement(stringBuffer.toString());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static mobak.b.b.g m41a() {
        return f34a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mobak.i a(mobak.i iVar) {
        f35a = iVar;
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static mobak.i m42a() {
        return f35a;
    }
}
