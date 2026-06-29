package mobak.b.b.a;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: LordmancerL.jar:mobak/b/b/a/v.class */
public final class v extends q {
    private int e;
    private String[][] a;

    /* renamed from: a, reason: collision with other field name */
    private byte[][] f214a;

    /* renamed from: a, reason: collision with other field name */
    private short[] f215a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f216a;
    private short[] b;

    /* renamed from: a, reason: collision with other field name */
    private boolean[][] f217a;

    /* renamed from: a, reason: collision with other field name */
    private mobak.b.a.a[][] f218a;
    private byte d;

    /* renamed from: c, reason: collision with other field name */
    private short[] f220c;

    /* renamed from: e, reason: collision with other field name */
    private byte f221e;
    private short k;
    private byte f;

    /* renamed from: b, reason: collision with other field name */
    private Vector f225b;

    /* renamed from: a, reason: collision with other field name */
    private s f226a;

    /* renamed from: b, reason: collision with other field name */
    private s f227b;

    /* renamed from: c, reason: collision with other field name */
    private s f228c;

    /* renamed from: d, reason: collision with other field name */
    private s f229d;

    /* renamed from: e, reason: collision with other field name */
    private s f230e;

    /* renamed from: f, reason: collision with other field name */
    private s f231f;

    /* renamed from: g, reason: collision with other field name */
    private s f232g;
    private s h;
    private s i;

    /* renamed from: j, reason: collision with other field name */
    private s f233j;

    /* renamed from: k, reason: collision with other field name */
    private s f234k;
    private s l;
    private s m;
    private s n;
    private byte c = -1;
    private short j = 0;

    /* renamed from: a, reason: collision with other field name */
    private boolean f222a = false;

    /* renamed from: d, reason: collision with other field name */
    private boolean f223d = false;

    /* renamed from: f, reason: collision with other field name */
    private boolean f224f = false;
    private boolean g = false;

    /* renamed from: a, reason: collision with other field name */
    private Vector f219a = new Vector();

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r1v22, types: [boolean[], boolean[][]] */
    /* JADX WARN: Type inference failed for: r1v24, types: [mobak.b.a.a[], mobak.b.a.a[][]] */
    public v(int i, short s) {
        if (((mobak.b.b.j) this).f279a == null) {
            short mo90a = (short) (mo90a() + 74 + 20);
            ((mobak.b.b.j) this).f279a = new mobak.b.b.p((short) 2, mo90a, (short) (mobak.b.b.m.a.getWidth() - 4), (short) (((mobak.b.b.m.a.getHeight() - mo90a) - r.a()) - 21), true, false);
        } else {
            ((mobak.b.b.j) this).f279a.m207c();
        }
        this.e = i;
        this.a = new String[]{0, 0};
        this.f214a = new byte[]{new byte[]{1, -1}, new byte[]{10, -10}};
        this.f215a = new short[]{0, 0};
        this.f216a = new byte[]{1, 1};
        this.b = new short[]{0, 0};
        this.f220c = new short[]{-1, -1};
        this.f217a = new boolean[]{new boolean[]{true, true}, new boolean[]{true, true}};
        this.f218a = new mobak.b.a.a[]{0, 0};
        this.f221e = (byte) -1;
        this.k = (short) -1;
        this.d = (byte) -1;
        ((mobak.b.b.j) this).f271a = new r();
        ((mobak.b.b.j) this).f271a.a(false, (byte) 55, r.a((byte) 55));
        this.f228c = new s((byte) 83, s);
        ((mobak.b.b.j) this).f271a.a(false, this.f228c);
        if (m136a((byte) 1)) {
            this.f230e = new s((byte) 78);
            this.f230e.a((short) 191);
            this.f230e.b(true);
            ((mobak.b.b.j) this).f271a.a(false, this.f230e);
        }
        if (m136a((byte) 2)) {
            this.f231f = new s((byte) 77);
            ((mobak.b.b.j) this).f271a.a(false, this.f231f);
        }
        if (m136a((byte) 4)) {
            ((mobak.b.b.j) this).f271a.a(false, new s((byte) 49));
            this.f232g = new s((byte) 70);
            ((mobak.b.b.j) this).f271a.a((byte) 0, this.f232g);
            this.h = new s((byte) 66);
            ((mobak.b.b.j) this).f271a.a((byte) 0, this.h);
            this.i = new s((byte) 68);
            ((mobak.b.b.j) this).f271a.a((byte) 0, this.i);
            this.f233j = new s((byte) 67);
            ((mobak.b.b.j) this).f271a.a((byte) 0, this.f233j);
            this.f234k = new s((byte) 90);
            ((mobak.b.b.j) this).f271a.a((byte) 0, this.f234k);
            this.l = new s((byte) 69);
            ((mobak.b.b.j) this).f271a.a((byte) 0, this.l);
        }
        if (m136a((byte) 8)) {
            this.m = new s((byte) 98);
            this.m.a((short) 238);
            ((mobak.b.b.j) this).f271a.a(false, this.m);
        }
        if (m136a((byte) 32)) {
            this.n = new s((byte) 48);
            this.n.a((short) (175 + (mo6d() - 1)));
            ((mobak.b.b.j) this).f271a.a(false, this.n);
        }
        this.f227b = new s((byte) 95);
        ((mobak.b.b.j) this).f271a.a(false, this.f227b);
        this.f226a = new s((byte) 102);
        ((mobak.b.b.j) this).f271a.a(false, this.f226a);
        this.f229d = new s((byte) 81, r.a((byte) 81));
        this.f229d.a((short) 7);
        this.f229d.a(false);
        ((mobak.b.b.j) this).f271a.a(true, this.f229d);
        if (mo6d() == 2) {
            mobak.b.a.e.a();
        }
        ((q) this).f192e = false;
    }

    public final void b() {
        ((mobak.b.b.j) this).f271a.a(false, (byte) 101, (short) 179);
    }

    public final void a(byte b, mobak.b.a.a[] aVarArr) {
        this.f218a[b] = aVarArr;
    }

    public static byte a(byte b) {
        byte b2 = 0;
        short s = 1;
        while (true) {
            short s2 = s;
            if (s2 >= 129) {
                return b2;
            }
            if ((b & s2) != 0) {
                b2 = (byte) (b2 + 1);
            }
            s = (short) (s2 << 1);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m136a(byte b) {
        return (this.e & b) > 0;
    }

    private boolean a(byte b, byte b2) {
        return ((b2 == 0 ? m137b() : c()) & b) == b;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final byte m137b() {
        return (byte) (255 & (this.e >> 16));
    }

    public final byte c() {
        return (byte) (255 & (this.e >> 8));
    }

    @Override // mobak.b.b.j, mobak.c.b
    /* renamed from: d */
    public final byte mo6d() {
        return (byte) (3 & (this.e >> 30));
    }

    public final void a(String[] strArr, int i) {
        this.a[i] = strArr;
    }

    public final void a(int i, byte b, byte b2) {
        this.f214a[i][0] = b;
        this.f214a[i][1] = b2;
    }

    public final void a(int i, boolean z, boolean z2) {
        this.f217a[i][0] = z;
        this.f217a[i][0] = z2;
    }

    public final void a(int i, short s) {
        this.f215a[i] = s;
    }

    public final void a(int i, byte b) {
        this.f216a[i] = b;
    }

    public final void b(int i, short s) {
        this.b[i] = s;
    }

    public final boolean e() {
        return (this.e & 67108864) > 0;
    }

    public final boolean f() {
        return (this.e & 134217728) > 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    private short m138a(byte b) {
        if (b == 0 && f()) {
            switch (mo6d()) {
                case 1:
                    return (short) 5;
                case 2:
                    return (short) 30;
            }
        }
        if (this.b == null || b < 0 || b >= this.b.length) {
            return (short) 0;
        }
        return this.b[b];
    }

    private boolean b(byte b) {
        return b == 0 ? (this.e & 268435456) > 0 : b == 1 && (this.e & 536870912) > 0;
    }

    private short a(byte b, boolean z) {
        short s = 0;
        if (b == 0 && f()) {
            switch (mo6d()) {
                case 1:
                    s = 5;
                    break;
                case 2:
                    s = 30;
                    break;
            }
        } else {
            if (this.f218a == null || b < 0 || b >= this.f218a.length || this.f218a[b] == null) {
                return (short) 0;
            }
            s = (short) this.f218a[b].length;
        }
        if (z) {
            return s;
        }
        short s2 = 0;
        short s3 = 0;
        while (true) {
            short s4 = s3;
            if (s4 >= s) {
                return s2;
            }
            if (a(a(b, s4))) {
                s2 = (short) (s2 + 1);
            }
            s3 = (short) (s4 + 1);
        }
    }

    private boolean a(mobak.b.a.a aVar) {
        if (aVar != null && aVar.mo56a(this.d) && aVar.m57b()) {
            return !this.f224f || aVar.a();
        }
        return false;
    }

    private mobak.b.a.a a(byte b, short s) {
        if (s < 0 || s >= a(b, true)) {
            return null;
        }
        if (b == 0 && f()) {
            switch (mo6d()) {
                case 1:
                    return mobak.b.a.b.a.a()[s];
                case 2:
                    return mobak.b.a.b.a.m59a((byte) -1)[s];
            }
        }
        if ((this.f218a == null || b < 0 || b >= this.f218a.length) && s >= this.f218a[b].length) {
            return null;
        }
        return this.f218a[b][s];
    }

    /* renamed from: a, reason: collision with other method in class */
    private short m139a(byte b, short s) {
        short a = a(b, true);
        if (a >= 0 && s + 1 >= a) {
            return (short) -1;
        }
        do {
            short s2 = (short) (s + 1);
            s = s2;
            if (s2 >= a) {
                break;
            }
        } while (!a(a(b, s)));
        if (s >= a) {
            return (short) -1;
        }
        return s;
    }

    private short b(byte b, short s) {
        do {
            short s2 = (short) (s - 1);
            s = s2;
            if (s2 < 0) {
                break;
            }
        } while (!a(a(b, s)));
        return s;
    }

    @Override // mobak.b.b.j
    /* renamed from: a */
    public final void mo90a() {
        this.f229d.a(false);
        if (this.n != null) {
            this.n.a(this.f221e == 1);
        }
        boolean b = b(this.f221e);
        mobak.b.a.a a = a(this.f221e, this.k);
        if (this.f231f != null) {
            boolean z = b && a(a);
            if (a((byte) 8, this.f221e)) {
                z &= m143a(this.f221e, this.k);
            }
            this.f231f.b(z);
        }
        if (this.f230e != null) {
            this.f230e.b(a((byte) 1, true) > 0);
        }
        this.f228c.b(g());
        if (b && a != null) {
            if (a.a() || !a((byte) 8, this.f221e)) {
                this.f229d.a(true);
                if (this.f231f != null) {
                    this.f231f.b(b(this.f221e));
                }
            }
        }
    }

    @Override // mobak.b.b.j
    protected final synchronized void c(int i) {
        int gameAction = mobak.b.b.m.a.getGameAction(i);
        if (this.f222a) {
            switch (gameAction) {
                case 1:
                    a((int) this.f214a[0][0], true, this.k);
                    return;
                case 2:
                    a((int) this.f214a[1][1], true, this.k);
                    return;
                case 3:
                case 4:
                default:
                    return;
                case 5:
                    a((int) this.f214a[1][0], true, this.k);
                    return;
                case 6:
                    a((int) this.f214a[0][1], true, this.k);
                    return;
            }
        }
        switch (gameAction) {
            case 1:
                d(true);
                break;
            case 2:
                a(false);
                break;
            case 5:
                a(true);
                break;
            case 6:
                d(false);
                break;
        }
        this.f223d = false;
    }

    private void d(boolean z) {
        byte b = this.f221e;
        byte b2 = z ? (byte) (b - 1) : (byte) (b + 1);
        if (a(b2, false) <= 0) {
            return;
        }
        this.f221e = b2;
        short s = this.f220c[this.f221e];
        short a = a(this.f221e, true);
        byte b3 = 0;
        short s2 = this.f220c[this.f221e];
        while (true) {
            short s3 = s2;
            if (s3 >= a || s3 < 0) {
                break;
            }
            if (a(a(this.f221e, s3))) {
                s = s3;
                if (b3 == this.f) {
                    break;
                } else {
                    b3 = (byte) (b3 + 1);
                }
            }
            s2 = m139a(this.f221e, s3);
        }
        this.k = s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(boolean z) {
        short m139a = z ? m139a(this.f221e, this.k) : b(this.f221e, this.k);
        if (m139a < 0) {
            return;
        }
        this.k = m139a;
        short a = a(this.f221e, false);
        byte a2 = a(false);
        int i = 0;
        for (int m139a2 = m139a(this.f221e, (short) -1); m139a2 < this.k; m139a2++) {
            if (a(this.f221e, (short) m139a2) == null) {
                i++;
            }
        }
        short s = (short) ((this.k - (a2 / 2)) - i);
        if (s <= 0) {
            this.f220c[this.f221e] = 0;
        } else if (s + a2 < a) {
            this.f220c[this.f221e] = s;
        } else {
            this.f220c[this.f221e] = (short) (a - a2);
        }
        if (this.f220c[this.f221e] < 0) {
            this.f220c[this.f221e] = 0;
        }
        if (this.f220c[this.f221e] + a2 > a) {
            this.f220c[this.f221e] = (short) (a - a2);
        }
    }

    private void a(int i, boolean z, short s) {
        a(i, z, this.f221e, s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0346  */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r7, boolean r8, byte r9, short r10) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mobak.b.b.a.v.a(int, boolean, byte, short):void");
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m140a(byte b) {
        if (b == -1 || this.d == -1) {
            this.d = b;
        } else if ((this.d & b) > 0) {
            this.d = (byte) (this.d & (b ^ (-1)));
        } else {
            this.d = (byte) (this.d | b);
        }
        q();
    }

    private boolean a(mobak.a.a.l lVar, byte b) {
        short a;
        if (lVar == null || (a = a(b, true)) < 0) {
            return false;
        }
        boolean z = false;
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= a) {
                return z;
            }
            mobak.b.a.a a2 = a(b, s2);
            if (a2 != null && a2.mo82b() > 0) {
                try {
                    lVar.a(a2.e());
                    lVar.a(a2.mo82b());
                    z = true;
                } catch (Exception e) {
                    mobak.a.a.a(new StringBuffer("addToOrderRequest").append(e.toString()).toString());
                }
            }
            s = (short) (s2 + 1);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    private void m141b(byte b) {
        short a = a(b, true);
        if (a < 0) {
            return;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= a) {
                return;
            }
            mobak.b.a.a a2 = a(b, s2);
            if (a2 != null && a2.mo82b() > 0) {
                a2.b(0);
            }
            s = (short) (s2 + 1);
        }
    }

    private void o() {
        if (this.f225b != null && this.f225b.size() > 0) {
            try {
                mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[83], (short) 200, (short) 0);
                for (short s = 0; s < this.f225b.size(); s = (short) (s + 1)) {
                    lVar.a(((mobak.b.a.a) this.f225b.elementAt(s)).e());
                }
                mobak.a.a.f15a.a(lVar);
            } catch (Exception unused) {
            }
        }
        this.f225b = null;
    }

    private void p() {
        if (this.f222a) {
            this.f229d.a((short) 7);
        } else {
            this.f229d.a((short) 106);
        }
        this.f222a = !this.f222a;
    }

    private boolean g() {
        short a = a((byte) 0, true);
        if (a > 0) {
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= a) {
                    break;
                }
                mobak.b.a.a a2 = a((byte) 0, s2);
                if (a2 != null && a2.mo82b() > 0) {
                    return true;
                }
                s = (short) (s2 + 1);
            }
        }
        short a3 = a((byte) 1, true);
        if (a3 <= 0) {
            return false;
        }
        short s3 = 0;
        while (true) {
            short s4 = s3;
            if (s4 >= a3) {
                return false;
            }
            mobak.b.a.a a4 = a((byte) 1, s4);
            if (a4 != null && a4.mo82b() > 0) {
                return true;
            }
            s3 = (short) (s4 + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c, reason: collision with other method in class */
    public final void m142c() {
        o();
        m141b((byte) 0);
        m141b((byte) 1);
        mobak.a.a.f15a.a(new mobak.a.a.l(mobak.a.a.b.f33a[15]));
        mobak.b.b.m.a.g();
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final boolean a(s sVar) {
        switch (sVar.m132a()) {
            case 48:
                mobak.b.b.m.a(mobak.c.d.b(135), mobak.c.d.b((short) ((246 + mo6d()) - 1)), "", new x(this));
                return true;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 79:
            case 80:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            default:
                return super.a(sVar);
            case 55:
                if (g()) {
                    mobak.b.b.m.a(mobak.c.d.a(135), mobak.c.d.a(192), "", new w(this));
                    return true;
                }
                m142c();
                return true;
            case 66:
                m140a((byte) 1);
                return true;
            case 67:
                m140a((byte) 4);
                return true;
            case 68:
                m140a((byte) 2);
                return true;
            case 69:
                m140a((byte) 16);
                return true;
            case 70:
                m140a((byte) -1);
                return true;
            case 77:
                if (a(this.f221e, this.k) == null) {
                    return true;
                }
                a(Integer.MAX_VALUE, false, this.k);
                return true;
            case 78:
                short a = a((byte) 1, true);
                if (a <= 0) {
                    return true;
                }
                short s = 0;
                while (true) {
                    short s2 = s;
                    if (s2 >= a || s2 < 0 || a((byte) 1, s2) == null) {
                        return true;
                    }
                    a(Integer.MAX_VALUE, false, (byte) 1, s2);
                    s = m139a((byte) 1, s2);
                }
                break;
            case 81:
                p();
                return true;
            case 83:
                mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[25], (short) 200, (short) 0);
                switch (mo6d()) {
                    case 1:
                        lVar.a(mobak.a.a.b.f33a[17]);
                        break;
                    case 2:
                        lVar.a(mobak.a.a.b.f33a[16]);
                        break;
                }
                boolean a2 = a(lVar, (byte) 0);
                boolean a3 = a(lVar, (byte) 1);
                o();
                if (a2 || a3) {
                    mobak.a.a.f15a.a(lVar);
                }
                m142c();
                return true;
            case 90:
                m140a((byte) 8);
                return true;
            case 98:
                if (this.f224f) {
                    this.m.a((short) 238);
                } else {
                    this.m.a((short) 239);
                }
                this.f224f = !this.f224f;
                q();
                return true;
        }
    }

    private void q() {
        this.f220c[0] = m139a((byte) 0, (short) -1);
        this.f220c[1] = m139a((byte) 1, (short) -1);
        this.k = this.f220c[this.f221e];
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final synchronized void a(Graphics graphics) {
        super.a(graphics);
        mo90a();
        short mo90a = (short) (mo90a() + 5);
        this.f219a.removeAllElements();
        a(graphics, (short) (mo90a - 2), (byte) 0);
        a(graphics, (short) (mo90a + 37), (byte) 1);
        ((mobak.b.b.j) this).f271a.a(graphics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [int] */
    /* JADX WARN: Type inference failed for: r0v58, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4, types: [int] */
    /* JADX WARN: Type inference failed for: r21v7, types: [int] */
    private void a(Graphics graphics, short s, byte b) {
        byte a = a(false);
        short width = (short) ((mobak.b.b.m.a.getWidth() - (a * 29)) / 2);
        if (this.f220c[b] < 0) {
            this.f220c[b] = 0;
        }
        short a2 = a(b, false);
        if (b(b, this.f220c[b]) >= 0) {
            Image a3 = mobak.c.a(q.e);
            int a4 = mobak.b.b.m.a(a3);
            mobak.b.b.m.a(graphics, a3, 0, 0, a4, mobak.b.b.m.b(a3), 0, width - a4, s + 13, 3);
        }
        short m139a = m139a(b, (short) -1);
        short s2 = m139a;
        short s3 = m139a;
        mobak.b.a.a aVar = null;
        mobak.b.b.m.a(graphics, (int) width, (int) s, (a(false) * 29) + 1, 38);
        short s4 = 0;
        while (true) {
            short s5 = s4;
            if (s5 >= a2 || s2 < 0) {
                break;
            }
            mobak.b.b.m.a(graphics, 5316104);
            if (this.c == b) {
                graphics.drawRect(width + this.j, s, 29, 27);
            } else {
                graphics.drawRect(width, s, 29, 27);
            }
            mobak.b.a.a a5 = a(b, s2);
            if (a5 != null) {
                if (this.f221e < 0) {
                    this.f221e = b;
                }
                if (this.k < 0) {
                    this.k = s2;
                }
                this.f219a.addElement(new i(width - (this.f220c[b] * 29), s, 29, 27, b, s2));
                if (this.f221e == b && this.k == s2) {
                    this.f = (byte) s2;
                    short s6 = this.f222a ? (short) 1025 : (short) 1;
                    if (this.c == b) {
                        a5.a(graphics, (short) ((width - (this.f220c[b] * 29)) + this.j), s, (short) (this.f215a[b] | s6));
                    } else {
                        a5.a(graphics, (short) (width - (this.f220c[b] * 29)), s, (short) (this.f215a[b] | s6));
                    }
                    if (!this.f223d) {
                        aVar = a5;
                    }
                } else if (this.c == b) {
                    a5.a(graphics, (short) ((width - (this.f220c[b] * 29)) + this.j), s, this.f215a[b]);
                } else {
                    a5.a(graphics, (short) (width - (this.f220c[b] * 29)), s, this.f215a[b]);
                }
            } else {
                byte b2 = (byte) (8 - b);
                if (this.c == b) {
                    mobak.b.b.m.a(graphics, q.g, 9, 1, b2, 0, (short) ((width - (this.f220c[b] * 29)) + this.j), s);
                } else {
                    mobak.b.b.m.a(graphics, q.g, 9, 1, b2, 0, (short) (width - (this.f220c[b] * 29)), s);
                }
            }
            if (s2 >= 0) {
                s3 = s2;
                short m139a2 = m139a(b, s2);
                s2 = m139a2;
                if (m139a2 >= 0) {
                    width = (short) (width + 29);
                }
            }
            s4 = (short) (s5 + 1);
        }
        if (a2 < a) {
            if (a2 > 0) {
                width = (short) (width + 29);
                for (byte b3 = a2 + 1; b3 <= a; b3++) {
                    mobak.b.b.m.a(graphics, 5316104);
                    if (this.c == b) {
                        graphics.drawRect(width + this.j, s, 29, 27);
                    } else {
                        graphics.drawRect(width, s, 29, 27);
                    }
                    byte b4 = (byte) (8 - b);
                    if (this.c == b) {
                        mobak.b.b.m.a(graphics, q.g, 9, 1, b4, 0, (short) ((width - (this.f220c[b] * 29)) + this.j), s);
                    } else {
                        mobak.b.b.m.a(graphics, q.g, 9, 1, b4, 0, (short) (width - (this.f220c[b] * 29)), s);
                    }
                    width = (short) (width + 29);
                }
            } else {
                for (byte b5 = a2 + 1; b5 <= a; b5++) {
                    byte b6 = (byte) (8 - b);
                    if (this.c == b) {
                        mobak.b.b.m.a(graphics, q.g, 9, 1, b6, 0, (short) (width + this.j), s);
                    } else {
                        mobak.b.b.m.a(graphics, q.g, 9, 1, b6, 0, width, s);
                    }
                    width = (short) (width + 29);
                }
            }
        }
        mobak.b.b.m.a(graphics, 0, 0, mobak.b.b.m.a.getWidth(), mobak.b.b.m.a.getHeight());
        if (aVar != null) {
            ((mobak.b.b.j) this).f279a.m207c();
            aVar.a(((mobak.b.b.j) this).f279a, (String) null, this.f215a[b]);
            this.f223d = true;
        }
        if (((mobak.b.b.j) this).f279a != null) {
            ((mobak.b.b.j) this).f279a.a(graphics, (byte) 0);
        }
        if (m139a(b, s3) > 0) {
            Image a6 = mobak.c.a(q.f);
            int a7 = mobak.b.b.m.a(a6);
            mobak.b.b.m.a(graphics, a6, 0, 0, a7, mobak.b.b.m.b(a6), 0, width + a7, s + 13, 3);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m143a(byte b, short s) {
        mobak.b.a.a a = a(b, s);
        if (a == null) {
            return false;
        }
        return a.a();
    }

    @Override // mobak.b.b.j
    /* renamed from: g, reason: collision with other method in class */
    public final void mo144g() {
        super.mo144g();
        mo90a();
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean a(int i, int i2) {
        ((mobak.b.b.j) this).f279a.a(i, i2);
        mobak.b.b.j.f260a = i;
        mobak.b.b.j.f261b = i2;
        mobak.b.b.j.f262c = i;
        mobak.b.b.j.f263d = i2;
        mobak.b.b.j.f264c = true;
        this.g = false;
        byte m119a = q.m119a(i, i2);
        if (m119a == 1 || m119a == 2) {
            return true;
        }
        i iVar = null;
        for (int i3 = 0; i3 < this.f219a.size() && iVar == null; i3++) {
            i iVar2 = (i) this.f219a.elementAt(i3);
            if (iVar2.a(i, i2)) {
                iVar = iVar2;
            }
        }
        if (iVar == null) {
            return false;
        }
        this.c = iVar.f173a;
        this.f221e = iVar.f173a;
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x01e2: INVOKE (r0 I:java.lang.Throwable) VIRTUAL call: java.lang.Throwable.printStackTrace():void A[MD:():void (c)], block:B:76:0x01e0 */
    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean b(int i, int i2, int i3) {
        Throwable printStackTrace;
        try {
            ((mobak.b.b.j) this).f279a.d();
            if (this.c >= 0) {
                if (this.j > 0) {
                    this.j = (short) (this.j + 14);
                } else {
                    this.j = (short) (this.j - 14);
                }
                short[] sArr = this.f220c;
                byte b = this.c;
                sArr[b] = (short) (sArr[b] - (this.j / 29));
            }
            this.j = (short) 0;
            this.c = (byte) -1;
            i iVar = null;
            for (int i4 = 0; i4 < this.f219a.size() && iVar == null; i4++) {
                i iVar2 = (i) this.f219a.elementAt(i4);
                if (iVar2.a(i, i2)) {
                    iVar = iVar2;
                }
            }
            if (mobak.b.b.j.f264c && this.f222a) {
                byte m119a = q.m119a(i, i2);
                if (b(this.f221e)) {
                    if (m119a == 1) {
                        if (!this.g || i3 >= 300) {
                            a(this.f214a[0][0] * q.m116a(i3, 300), true, this.k);
                        }
                    } else if (m119a == 2 && (!this.g || i3 >= 300)) {
                        a(this.f214a[0][1] * q.m116a(i3, 300), true, this.k);
                    }
                }
            }
            short a = a(this.f221e, false);
            byte a2 = a(false);
            if (iVar == null && this.j == 0) {
                if (this.f220c[this.f221e] < 0) {
                    this.f220c[this.f221e] = 0;
                }
                if (this.f220c[this.f221e] + a2 > a) {
                    this.f220c[this.f221e] = (short) (a - a2);
                }
                mobak.b.b.j.f264c = true;
                mobak.b.b.j.f264c = true;
                return false;
            }
            if (mobak.b.b.j.f264c) {
                if (this.f221e == iVar.f173a && this.k == iVar.f174a) {
                    p();
                } else {
                    if (this.f222a) {
                        p();
                    }
                    this.f221e = iVar.f173a;
                    this.k = iVar.f174a;
                }
                this.f223d = false;
            }
            if (this.f220c[this.f221e] < 0) {
                this.f220c[this.f221e] = 0;
            }
            if (this.f220c[this.f221e] + a2 > a) {
                this.f220c[this.f221e] = (short) (a - a2);
            }
            mobak.b.b.j.f264c = true;
            return true;
        } catch (Exception e) {
            printStackTrace.printStackTrace();
            return true;
        }
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean a(int i, int i2, int i3) {
        i iVar = null;
        for (int i4 = 0; i4 < this.f219a.size() && iVar == null; i4++) {
            i iVar2 = (i) this.f219a.elementAt(i4);
            if (iVar2.a(i, i2)) {
                iVar = iVar2;
            }
        }
        if (!mobak.b.b.j.f264c) {
            if (iVar == null || this.f221e != iVar.f173a || this.k != iVar.f174a || this.f222a || !mobak.b.b.j.f264c) {
                return false;
            }
            p();
            return false;
        }
        byte m119a = q.m119a(i, i2);
        if (!b(this.f221e)) {
            return true;
        }
        if (m119a == 1) {
            if (i3 > 300) {
                a(this.f214a[0][0] * q.m116a(i3, 300), true, this.k);
            } else if (!this.g) {
                a(1, true, this.k);
            }
            this.g = true;
            return true;
        }
        if (m119a != 2) {
            return true;
        }
        if (i3 > 300) {
            a(this.f214a[0][1] * q.m116a(i3, 300), true, this.k);
        } else if (!this.g) {
            a(-1, true, this.k);
        }
        this.g = true;
        return true;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    /* renamed from: b */
    protected final boolean mo108b(int i, int i2) {
        if (Math.abs(mobak.b.b.j.f262c - mobak.b.b.j.f260a) > 10 || Math.abs(mobak.b.b.j.f263d - mobak.b.b.j.f261b) > 10) {
            mobak.b.b.j.f264c = false;
        }
        int i3 = i - mobak.b.b.j.f262c;
        int i4 = i2 - mobak.b.b.j.f263d;
        this.j = (short) (this.j + i3);
        if (((mobak.b.b.j) this).f279a.m213b()) {
            ((mobak.b.b.j) this).f279a.a(false);
            ((mobak.b.b.j) this).f279a.m212a(((mobak.b.b.j) this).f279a.m211c() - i4);
            mobak.b.b.j.f263d = i2;
        }
        mobak.b.b.j.f262c = i;
        if (this.c >= 0) {
            return true;
        }
        int i5 = mobak.b.b.j.f261b;
        Math.abs((mobak.b.b.j.f260a - i) / 14);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Vector a(v vVar) {
        return vVar.f225b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Vector a(v vVar, Vector vector) {
        vVar.f225b = vector;
        return vector;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static byte m145a(v vVar) {
        return vVar.f221e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static short m146a(v vVar) {
        return vVar.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mobak.b.a.a a(v vVar, byte b, short s) {
        return vVar.a(b, s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short a(v vVar, byte b, boolean z) {
        return vVar.a(b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(v vVar, boolean z) {
        vVar.d(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static short[] m147a(v vVar) {
        return vVar.f220c;
    }
}
