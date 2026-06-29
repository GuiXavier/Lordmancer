package mobak.b.a;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.a.a.l;
import mobak.b.b.a.s;
import mobak.b.b.i;
import mobak.b.b.j;
import mobak.b.b.m;

/* loaded from: LordmancerL.jar:mobak/b/a/b.class */
public final class b {
    public static b a;

    /* renamed from: a, reason: collision with other field name */
    public String f69a;
    private int c;

    /* renamed from: a, reason: collision with other field name */
    private e[] f72a;

    /* renamed from: a, reason: collision with other field name */
    public int f73a;
    public String b;

    /* renamed from: b, reason: collision with other field name */
    private byte f74b;

    /* renamed from: c, reason: collision with other field name */
    private byte f75c;

    /* renamed from: d, reason: collision with other field name */
    private byte f76d;
    private int e;

    /* renamed from: c, reason: collision with other field name */
    private String f80c;

    /* renamed from: a, reason: collision with other field name */
    public d[] f81a;

    /* renamed from: c, reason: collision with other field name */
    private d[] f82c;

    /* renamed from: b, reason: collision with other field name */
    public d[] f83b;

    /* renamed from: d, reason: collision with other field name */
    private d[] f84d;

    /* renamed from: a, reason: collision with other field name */
    private static short[][] f85a;

    /* renamed from: a, reason: collision with other field name */
    public byte f86a;

    /* renamed from: d, reason: collision with other field name */
    private String f88d;

    /* renamed from: e, reason: collision with other field name */
    private String f89e;

    /* renamed from: a, reason: collision with other field name */
    private e[][] f96a;

    /* renamed from: a, reason: collision with other field name */
    private String[] f97a;

    /* renamed from: a, reason: collision with other field name */
    private s[] f98a;

    /* renamed from: a, reason: collision with other field name */
    private f[] f70a = new f[5];

    /* renamed from: a, reason: collision with other field name */
    public boolean f71a = false;
    private int d = 0;

    /* renamed from: c, reason: collision with other field name */
    private boolean f77c = false;

    /* renamed from: b, reason: collision with other field name */
    public int f78b = 0;

    /* renamed from: a, reason: collision with other field name */
    private short f79a = 1;

    /* renamed from: a, reason: collision with other field name */
    private long f87a = 0;
    private int f = 0;

    /* renamed from: b, reason: collision with other field name */
    public boolean f90b = false;

    /* renamed from: a, reason: collision with other field name */
    private Vector f91a = null;

    /* renamed from: b, reason: collision with other field name */
    private Vector f92b = null;

    /* renamed from: c, reason: collision with other field name */
    private Vector f93c = null;

    /* renamed from: d, reason: collision with other field name */
    private Vector f94d = null;

    /* renamed from: e, reason: collision with other field name */
    private Vector f95e = null;

    public final void a(e[] eVarArr) {
        this.f91a = new Vector();
        this.f92b = new Vector();
        this.f93c = new Vector();
        this.f94d = new Vector();
        this.f95e = new Vector();
        if (eVarArr != null) {
            this.f72a = eVarArr;
        } else {
            this.f72a = new e[30];
        }
        if (eVarArr == null) {
            return;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= eVarArr.length) {
                a(this.f91a, (byte) 1);
                a(this.f92b, (byte) 4);
                a(this.f93c, (byte) 2);
                a(this.f94d, (byte) 8);
                a(this.f95e, (byte) 16);
                return;
            }
            if (eVarArr[s2] != null) {
                eVarArr[s2].mo53c();
                eVarArr[s2].mo53c();
                eVarArr[s2].mo53c();
                eVarArr[s2].mo53c();
                eVarArr[s2].mo53c();
                eVarArr[s2].mo53c();
                eVarArr[s2].mo53c();
            }
            s = (short) (s2 + 1);
        }
    }

    private void a(Vector vector, byte b) {
        if (vector == null) {
            return;
        }
        for (int i = 0; i < this.f72a.length; i++) {
            if (this.f72a[i] != null && (this.f72a[i].e() & b) != 0) {
                vector.addElement(this.f72a[i]);
            }
        }
    }

    public b(boolean z) {
        this.f96a = null;
        if (z) {
            a = this;
            this.f75c = (byte) 1;
            this.f76d = (byte) 1;
            this.f96a = new e[6][0];
            this.f96a[0] = new e[2];
            this.f96a[1] = new e[1];
            this.f96a[2] = new e[1];
            this.f96a[3] = new e[1];
            this.f96a[4] = new e[1];
            this.f96a[5] = new e[4];
            this.f72a = new e[30];
            new Vector();
        }
    }

    public final void a(short s) {
        this.f74b = (byte) s;
    }

    public final synchronized f a(byte b) {
        if (b < 0 || b > 4) {
            return null;
        }
        return this.f70a[b];
    }

    public final synchronized void a(byte b, f fVar) {
        if (b < 0 || b > 4) {
            return;
        }
        this.f70a[b] = fVar;
    }

    public final f[] a() {
        return this.f70a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m58a() {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                return false;
            }
            if (this.f70a[b2] != null) {
                return true;
            }
            b = (byte) (b2 + 1);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final e[] m59a(byte b) {
        Vector vector;
        switch (b) {
            case -1:
                return this.f72a;
            default:
                switch (b) {
                    case 1:
                        vector = this.f91a;
                        break;
                    case 2:
                        vector = this.f93c;
                        break;
                    case 4:
                        vector = this.f92b;
                        break;
                    case 8:
                        vector = this.f94d;
                        break;
                    case 16:
                        vector = this.f95e;
                        break;
                    default:
                        vector = null;
                        break;
                }
                Vector vector2 = vector;
                if (vector == null) {
                    return null;
                }
                e[] eVarArr = new e[vector2.size()];
                short s = 0;
                while (true) {
                    short s2 = s;
                    if (s2 >= eVarArr.length) {
                        return eVarArr;
                    }
                    eVarArr[s2] = (e) vector2.elementAt(s2);
                    s = (short) (s2 + 1);
                }
        }
    }

    public final boolean a(Graphics graphics, int i, int i2) {
        Image a2 = i.a();
        short a3 = (short) (m.a(a2) / i.a((byte) 1));
        short b = (short) m.b(a2);
        m.a(graphics, a2, a3 * this.f74b, 0, a3, b, 0, (this.f75c * 25) - i, (((this.f76d + 1) * 25) - b) - i2, 0);
        if (this.f69a == null || this.f69a.equals("")) {
            return false;
        }
        m.a(graphics, 0);
        short s = (short) ((this.f75c * 25) - i);
        short s2 = (short) ((((this.f76d + 1) * 25) - i2) + 1);
        graphics.fillRect(s - 1, s2 - 1, (short) (j.a.a(this.f69a) + 2), j.a.f370a);
        j.a.a(graphics, this.f69a, s, s2 - 1, 0);
        return false;
    }

    public final void a(byte b, byte b2) {
        this.f75c = b;
        this.f76d = b2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final byte m60a() {
        return this.f75c;
    }

    public final byte b() {
        return this.f76d;
    }

    public final void a(boolean z) {
        this.f77c = z;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final boolean m61b() {
        return this.f77c;
    }

    public final e[] b(byte b) {
        int i = 0;
        for (int i2 = 0; i2 < this.f72a.length; i2++) {
            if (this.f72a[i2] != null && this.f72a[i2].mo53c() == b) {
                i++;
            }
        }
        e[] eVarArr = new e[i];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f72a.length; i4++) {
            if (this.f72a[i4] != null && this.f72a[i4].mo53c() == b) {
                int i5 = i3;
                i3++;
                eVarArr[i5] = this.f72a[i4];
            }
        }
        return eVarArr;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("name: ").append(this.f69a).append("\n");
        stringBuffer.append("level ").append((int) this.f79a).append("\n");
        stringBuffer.append("expr ").append(this.e).append("\n");
        return stringBuffer.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public final String m62a() {
        return this.f69a;
    }

    public final void a(String str) {
        this.f69a = str;
    }

    public final void a(d[] dVarArr, d[] dVarArr2) {
        this.f82c = dVarArr;
        this.f84d = dVarArr2;
    }

    public final int a(d[] dVarArr, byte b, int i) {
        if (dVarArr == null) {
            return 0;
        }
        if (dVarArr == this.f81a) {
            if (this.f82c != null) {
                byte b2 = 0;
                while (true) {
                    byte b3 = b2;
                    if (b3 >= this.f82c.length) {
                        break;
                    }
                    if (this.f82c[b3] != null && this.f82c[b3].f100a == b) {
                        return this.f82c[b3].b;
                    }
                    b2 = (byte) (b3 + 1);
                }
            }
        } else if (dVarArr == this.f83b && this.f84d != null) {
            byte b4 = 0;
            while (true) {
                byte b5 = b4;
                if (b5 >= this.f84d.length) {
                    break;
                }
                if (this.f84d[b5] != null && this.f84d[b5].f100a == b) {
                    return this.f84d[b5].b;
                }
                b4 = (byte) (b5 + 1);
            }
        }
        byte b6 = 0;
        while (true) {
            byte b7 = b6;
            if (b7 >= dVarArr.length) {
                return 0;
            }
            if (dVarArr[b7] != null && dVarArr[b7].f100a == b) {
                return dVarArr[b7].b + m70a(b);
            }
            b6 = (byte) (b7 + 1);
        }
    }

    public static d a(d[] dVarArr, byte b) {
        if (dVarArr == null) {
            return null;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= dVarArr.length) {
                return null;
            }
            if (dVarArr[b3] != null && dVarArr[b3].f100a == b) {
                return dVarArr[b3];
            }
            b2 = (byte) (b3 + 1);
        }
    }

    public final void a(int i) {
        if (this.f72a == null || this.f72a.length == 0) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f72a.length) {
                return;
            }
            if (this.f72a[b2] != null && ((a) this.f72a[b2]).d == i) {
                this.f72a[b2] = null;
                return;
            }
            b = (byte) (b2 + 1);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final long m63a(boolean z) {
        return !z ? this.f87a : this.f;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int m64a() {
        return this.f;
    }

    public final void a(long j) {
        this.f87a = j;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(j));
        int length = stringBuffer.length() / 3;
        if (stringBuffer.length() % 3 == 0) {
            length--;
        }
        for (int i = 0; i < length; i++) {
            stringBuffer.insert((stringBuffer.length() - ((i + 1) * 3)) - i, '\'');
        }
        this.f88d = stringBuffer.toString();
    }

    public final void b(int i) {
        this.f = i;
        this.f89e = String.valueOf(i);
    }

    /* renamed from: b, reason: collision with other method in class */
    public final String m65b() {
        return this.f88d;
    }

    public final String c() {
        return this.f89e;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final int m66b() {
        return this.e;
    }

    public final void c(int i) {
        this.e = i;
    }

    public final void b(short s) {
        this.f79a = s;
        this.f80c = String.valueOf((int) s);
    }

    public final String d() {
        return this.f80c;
    }

    /* renamed from: c, reason: collision with other method in class */
    public final int m67c() {
        return this.f79a;
    }

    public final void d(int i) {
        this.c = i;
    }

    public final void e(int i) {
        this.c--;
    }

    /* renamed from: d, reason: collision with other method in class */
    public final int m68d() {
        return this.c;
    }

    public final void f(int i) {
        this.d = i;
    }

    public final void g(int i) {
        this.d--;
    }

    public final int e() {
        return this.d;
    }

    public final void a(byte b, e eVar) {
        if (b < 0 || b >= this.f72a.length) {
            return;
        }
        this.f72a[b] = null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public final byte m69c() {
        byte b = 0;
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= this.f70a.length) {
                return b;
            }
            if (this.f70a[b3] != null) {
                b = (byte) (b + 1);
            }
            b2 = (byte) (b3 + 1);
        }
    }

    private static void a(d[] dVarArr, boolean z) {
        if (dVarArr == null) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= dVarArr.length) {
                return;
            }
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= f85a.length) {
                    break;
                }
                if (f85a[s2][0] != dVarArr[b2].f100a) {
                    s = (short) (s2 + 1);
                } else if (z) {
                    short[] sArr = f85a[s2];
                    sArr[1] = (short) (sArr[1] + dVarArr[b2].b);
                } else {
                    short[] sArr2 = f85a[s2];
                    sArr2[1] = (short) (sArr2[1] - dVarArr[b2].b);
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    public final void b(e[] eVarArr) {
        this.f96a = new e[6][0];
        this.f96a[0] = new e[2];
        this.f96a[1] = new e[1];
        this.f96a[2] = new e[1];
        this.f96a[3] = new e[1];
        this.f96a[4] = new e[1];
        this.f96a[5] = new e[4];
        f85a = new short[this.f81a.length + this.f83b.length][2];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f81a.length) {
                break;
            }
            f85a[b2][0] = (short) this.f81a[b2].f100a;
            f85a[b2][1] = 0;
            b = (byte) (b2 + 1);
        }
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= this.f83b.length) {
                break;
            }
            f85a[this.f81a.length + b4][0] = (short) this.f83b[b4].f100a;
            f85a[this.f81a.length + b4][1] = 0;
            b3 = (byte) (b4 + 1);
        }
        if (eVarArr == null) {
            return;
        }
        for (int i = 0; i < eVarArr.length; i++) {
            if (eVarArr[i] != null) {
                e[] eVarArr2 = this.f96a[eVarArr[i].mo53c() - 1];
                int i2 = 0;
                while (true) {
                    if (i2 >= eVarArr2.length) {
                        break;
                    }
                    if (eVarArr2[i2] == null) {
                        eVarArr2[i2] = eVarArr[i];
                        a(eVarArr2[i2].f109a, true);
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        r6[r11] = r5.f96a[r9][r10];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(mobak.b.a.e[] r6) {
        /*
            r5 = this;
            r0 = r6
            if (r0 == 0) goto L9
            r0 = r6
            int r0 = r0.length
            if (r0 >= 0) goto La
        L9:
            return
        La:
            r0 = 0
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
        L11:
            r0 = r9
            r1 = r5
            mobak.b.a.e[][] r1 = r1.f96a
            int r1 = r1.length
            if (r0 >= r1) goto Lbe
            r0 = 0
            r10 = r0
        L1e:
            r0 = r10
            r1 = r5
            mobak.b.a.e[][] r1 = r1.f96a
            r2 = r9
            r1 = r1[r2]
            int r1 = r1.length
            if (r0 >= r1) goto Lb8
            r0 = r5
            mobak.b.a.e[][] r0 = r0.f96a
            r1 = r9
            r0 = r0[r1]
            r1 = r10
            r0 = r0[r1]
            if (r0 == 0) goto Lb2
            r0 = 0
            r11 = r0
            r0 = r5
            mobak.b.a.e[][] r0 = r0.f96a
            r1 = r9
            r0 = r0[r1]
            r1 = r10
            r0 = r0[r1]
            byte r0 = r0.mo53c()
            switch(r0) {
                case 1: goto L84;
                case 2: goto L99;
                case 3: goto L70;
                case 4: goto L92;
                case 5: goto La0;
                case 6: goto L76;
                default: goto La4;
            }
        L70:
            r0 = 0
            r11 = r0
            goto La4
        L76:
            r0 = 1
            r1 = r8
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            byte r2 = (byte) r2
            r8 = r2
            int r0 = r0 + r1
            byte r0 = (byte) r0
            r11 = r0
            goto La4
        L84:
            r0 = 5
            r1 = r7
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            byte r2 = (byte) r2
            r7 = r2
            int r0 = r0 + r1
            byte r0 = (byte) r0
            r11 = r0
            goto La4
        L92:
            r0 = 7
            r11 = r0
            goto La4
        L99:
            r0 = 8
            r11 = r0
            goto La4
        La0:
            r0 = 9
            r11 = r0
        La4:
            r0 = r6
            r1 = r11
            r2 = r5
            mobak.b.a.e[][] r2 = r2.f96a
            r3 = r9
            r2 = r2[r3]
            r3 = r10
            r2 = r2[r3]
            r0[r1] = r2
        Lb2:
            int r10 = r10 + 1
            goto L1e
        Lb8:
            int r9 = r9 + 1
            goto L11
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mobak.b.a.b.c(mobak.b.a.e[]):void");
    }

    /* renamed from: a, reason: collision with other method in class */
    public static int m70a(short s) {
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 >= f85a.length) {
                return 0;
            }
            if (f85a[s3][0] == s) {
                return f85a[s3][1];
            }
            s2 = (short) (s3 + 1);
        }
    }

    public final void a(e eVar) {
        a(eVar.f109a, true);
        e[] eVarArr = this.f96a[eVar.mo53c() - 1];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= eVarArr.length) {
                return;
            }
            if (eVarArr[b2] == null) {
                eVarArr[b2] = eVar;
                return;
            }
            b = (byte) (b2 + 1);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m71a(e eVar) {
        l lVar = new l(mobak.a.a.b.f33a[97], (short) 4, mobak.a.a.b.f33a[97]);
        lVar.a(eVar.e());
        mobak.a.a.f15a.a(lVar);
        return true;
    }

    public static boolean b(e eVar) {
        l lVar = new l(mobak.a.a.b.f33a[94], (short) 4, mobak.a.a.b.f33a[94]);
        lVar.a(eVar.e());
        mobak.a.a.f15a.a(lVar);
        return true;
    }

    public final void h(int i) {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f96a.length) {
                return;
            }
            e[] eVarArr = this.f96a[b2];
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < eVarArr.length) {
                    if (eVarArr[b4] != null && eVarArr[b4].e() == i) {
                        a(eVarArr[b4].f109a, false);
                        eVarArr[b4] = null;
                        return;
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    public final void a(int i, int i2) {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f72a.length) {
                return;
            }
            if (this.f72a[b2] != null && this.f72a[b2].e() == i) {
                if (i2 == 1) {
                    this.f72a[b2] = null;
                } else {
                    this.f72a[b2].c(this.f72a[b2].c() - 1);
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public final void m72b(e eVar) {
        if (eVar == null || eVar.d() < 0 || eVar.d() >= this.f72a.length) {
            return;
        }
        this.f72a[eVar.d()] = eVar;
    }

    public final void c(e eVar) {
        e[] eVarArr = this.f96a[eVar.mo53c() - 1];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= eVarArr.length) {
                return;
            }
            if (eVarArr[b2] != null && eVarArr[b2].e() == 0) {
                eVarArr[b2].e(eVar.e());
                return;
            }
            b = (byte) (b2 + 1);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m73a() {
        mobak.a.a.f15a.a(new l(mobak.a.a.b.f33a[69], (short) 0, mobak.a.a.b.f33a[69]));
    }

    public final void a(String[] strArr) {
        this.f97a = strArr;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final String[] m74a() {
        return this.f97a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final s[] m75a() {
        return this.f98a;
    }

    public final void a(s[] sVarArr) {
        this.f98a = sVarArr;
    }

    /* renamed from: d, reason: collision with other method in class */
    public final byte m76d() {
        return this.f86a;
    }

    /* renamed from: e, reason: collision with other method in class */
    public final byte m77e() {
        return (byte) ((this.f86a - 1) % 5);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static final byte m78a(byte b) {
        return (byte) ((b - 1) % 5);
    }
}
