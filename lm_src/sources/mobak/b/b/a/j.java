package mobak.b.b.a;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: LordmancerL.jar:mobak/b/b/a/j.class */
public abstract class j extends q {
    public static boolean a = false;
    protected byte c;

    /* renamed from: a, reason: collision with other field name */
    byte[] f175a = {0, 0};

    /* renamed from: a, reason: collision with other field name */
    protected short[] f176a = {0, 0};
    protected byte d = -1;
    protected byte e = -1;

    /* renamed from: d, reason: collision with other field name */
    protected boolean f177d = false;
    private short j = 0;
    private short k = 0;
    private boolean f = false;

    /* renamed from: a, reason: collision with other field name */
    private Vector f178a = new Vector();

    /* renamed from: e, reason: collision with other field name */
    protected int f179e;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(short s) {
        ((mobak.b.b.j) this).f278a = s;
        if (s == -7 || s == -11) {
            return;
        }
        mobak.b.b.m.f287a = null;
    }

    private void a(Graphics graphics, mobak.b.a.a[] aVarArr, short s, byte b, short s2, short s3, short s4) {
        int i;
        if (graphics == null) {
            return;
        }
        this.f178a.removeAllElements();
        short s5 = (short) (s3 - (b * 29));
        this.j = s2;
        this.k = s3;
        int i2 = 0;
        if (aVarArr == null) {
            for (int i3 = 0; i3 < a(true); i3++) {
                q.a(graphics, s2, s5 + this.f179e, 0);
                s5 = (short) (s5 + 29);
            }
            ((mobak.b.b.j) this).f279a.m207c();
            return;
        }
        mobak.b.b.m.a(graphics, (int) s2, (int) s3, 30, a(true) * 29);
        if (aVarArr != null && aVarArr.length != 0) {
            byte b2 = 0;
            while (true) {
                byte b3 = b2;
                if (b3 < aVarArr.length) {
                    if (((mobak.b.b.j) this).f278a == -5) {
                        switch (i2) {
                            case 0:
                                i = 5;
                                break;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                i = 4;
                                break;
                            case 5:
                                i = 2;
                                break;
                            case 6:
                                i = 3;
                                break;
                            case 7:
                                i = 1;
                                break;
                            case 8:
                                i = 0;
                                break;
                            case 9:
                                i = 6;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        int i4 = i;
                        if (i >= 0 && i4 <= 6 && (aVarArr == null || aVarArr.length <= i2 || aVarArr[i2] == null)) {
                            q.a(graphics, (int) s2, (int) s5, s4 == b3 ? 1 : 0);
                            mobak.b.b.m.a(graphics, q.g, 9, 1, i4, 0, s2, s5 + this.f179e);
                        }
                        if (aVarArr != null && aVarArr.length > b && i2 < aVarArr.length && aVarArr[i2] != null) {
                            short s6 = s;
                            if (s4 == i2) {
                                s6 = (short) (s | (this.f177d ? (short) 1024 : (short) 1));
                            }
                            aVarArr[i2].a(graphics, s2, (short) (s5 + this.f179e), s6);
                        }
                        this.f178a.addElement(new i(s2, s5 + this.f179e, 29, 27, (byte) 0, (short) i2));
                    } else if (aVarArr == null || aVarArr.length <= b || i2 >= aVarArr.length) {
                        q.a(graphics, s2, s5 + this.f179e, 0);
                    } else if (aVarArr[i2] != null) {
                        short s7 = s;
                        if (s4 == i2) {
                            s7 = (short) (s | (this.f177d ? (short) 1024 : (short) 1));
                        }
                        aVarArr[i2].a(graphics, s2, (short) (s5 + this.f179e), s7);
                        this.f178a.addElement(new i(s2, s5 + this.f179e, 29, 27, (byte) 0, (short) i2));
                    }
                    i2 = (byte) (i2 + 1);
                    s5 = (short) (s5 + 29);
                    b2 = (byte) (b3 + 1);
                }
            }
        }
        if (aVarArr.length < a(true)) {
            for (int i5 = i2; i5 < a(true); i5++) {
                q.a(graphics, s2, s5 + this.f179e, 0);
                s5 = (short) (s5 + 29);
            }
        }
        mobak.b.b.m.a(graphics, 0, 0, mobak.b.b.m.a.getWidth(), mobak.b.b.m.a.getHeight());
        if (aVarArr != null) {
            if (b > 0) {
                Image a2 = mobak.c.a(q.c);
                int a3 = mobak.b.b.m.a(a2);
                int b4 = mobak.b.b.m.b(a2);
                mobak.b.b.m.a(graphics, a2, 0, 0, a3, b4, 0, s2 + 14, s3 - b4, 33);
            }
            if (b + this.c < aVarArr.length && ((mobak.b.b.j) this).f278a != -5) {
                Image a4 = mobak.c.a(q.d);
                int a5 = mobak.b.b.m.a(a4);
                int b5 = mobak.b.b.m.b(a4);
                mobak.b.b.m.a(graphics, a4, 0, 0, a5, b5, 0, s2 + 14, s3 + (29 * this.c) + b5, 17);
            }
            if (((mobak.b.b.j) this).f278a == -5 && b + this.c < 10) {
                Image a6 = mobak.c.a(q.d);
                int a7 = mobak.b.b.m.a(a6);
                int b6 = mobak.b.b.m.b(a6);
                mobak.b.b.m.a(graphics, a6, 0, 0, a7, b6, 0, s2 + 14, s3 + (29 * this.c) + b6, 17);
            }
            if (((mobak.b.b.j) this).f278a != -5) {
                this.f178a.addElement(new i(s2, s3, 29, 27, (byte) 0, (short) 0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.j
    public void c(int i) {
        mobak.b.a.a a2 = a();
        int gameAction = mobak.b.b.m.a.getGameAction(i);
        if (!this.f177d) {
            if (((mobak.b.b.j) this).f278a <= 0) {
                switch (gameAction) {
                    case 1:
                        a(false);
                        break;
                    case 6:
                        a(true);
                        break;
                }
            } else {
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
            }
        } else {
            switch (gameAction) {
                case 1:
                    b((short) 1);
                    break;
                case 2:
                    b((short) -10);
                    break;
                case 5:
                    b((short) 10);
                    break;
                case 6:
                    b((short) -1);
                    break;
            }
        }
        mobak.b.a.a a3 = a();
        if (((mobak.b.b.j) this).f278a != -5) {
            if (a2 != a3) {
                i();
            }
            if ((a2 != a3 || ((mobak.b.b.j) this).f279a.m208a()) && a3 != null) {
                a(a3, this.f176a[this.e]);
            }
        }
        mo90a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(mobak.b.a.a aVar, short s) {
        aVar.a(((mobak.b.b.j) this).f279a, (String) null, s);
    }

    private void d(boolean z) {
        short s = this.f175a[this.e];
        byte b = this.e;
        byte b2 = z ? (byte) (b - 1) : (byte) (b + 1);
        mobak.b.a.a[] mo148a = mo148a(b2);
        if (mo148a == null || mo148a.length == 0) {
            return;
        }
        this.e = b2;
        this.d = (byte) (this.f175a[this.e] + (this.d - s));
        if (mo148a == null || mo148a.length > this.d) {
            return;
        }
        this.d = (byte) (mo148a.length - 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        mobak.b.a.a[] mo148a = mo148a(this.e);
        if (mo148a != null || ((mobak.b.b.j) this).f278a == -5) {
            byte b = z ? (byte) (this.d + 1) : (byte) (this.d - 1);
            byte b2 = b;
            if (b < 0 || b2 >= mo148a.length) {
                return;
            }
            this.d = b2;
            if (this.f175a[this.e] > this.d) {
                b((int) this.e, (int) this.d);
            }
            if (this.d - this.f175a[this.e] >= this.c) {
                b((int) this.e, (int) ((byte) ((this.d - this.c) + 1)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public mobak.b.a.a[] mo148a(byte b) {
        if (b >= 0 && b == 1) {
            return mobak.b.b.m.f287a;
        }
        return null;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public boolean a(s sVar) {
        switch ((byte) sVar.a) {
            case 55:
                return e();
            case 78:
                mobak.b.a.a[] mo148a = mo148a((byte) 0);
                if (mo148a == null || mo148a.length == 0) {
                    return false;
                }
                byte b = 0;
                while (true) {
                    byte b2 = b;
                    if (b2 >= mo148a.length) {
                        return true;
                    }
                    if (mo148a[b2] != null) {
                        mo148a[b2].b(mo148a[b2].c());
                    }
                    b = (byte) (b2 + 1);
                }
                break;
            case 81:
                return f();
            case 84:
                return g();
            case 95:
                h();
                return true;
            default:
                return super.a(sVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean a(mobak.a.a.l lVar, mobak.b.a.a[] aVarArr) {
        if (lVar == null || aVarArr == null || aVarArr.length == 0) {
            return false;
        }
        boolean z = false;
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= aVarArr.length) {
                return z;
            }
            if (aVarArr[s2] != null && aVarArr[s2].mo82b() > 0) {
                try {
                    lVar.a(aVarArr[s2].e());
                    lVar.a(aVarArr[s2].mo82b());
                    z = true;
                } catch (Exception e) {
                    mobak.a.a.a(new StringBuffer("addToOrderRequest").append(e.toString()).toString());
                }
            }
            s = (short) (s2 + 1);
        }
    }

    private boolean g() {
        try {
            a(mo148a((byte) 0));
            a(mo148a((byte) 1));
            ((mobak.b.b.j) this).f271a.b((byte) 84);
            if (this.f177d) {
                f();
            }
            if (((mobak.b.b.j) this).f278a == 16384) {
                return true;
            }
            e();
            return true;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("sendSaveRequest ").append(e.toString()).toString());
            return false;
        }
    }

    private static void a(mobak.b.a.a[] aVarArr) {
        if (aVarArr == null || aVarArr.length == 0) {
            return;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            if (aVarArr[i] != null && aVarArr[i].mo82b() > 0) {
                aVarArr[i].b(0);
            }
        }
    }

    @Override // mobak.b.b.j
    /* renamed from: a */
    public void mo90a() {
        ((mobak.b.b.j) this).f271a.a(true, false);
        if (this.d < 0 || this.e < 0 || a() == null) {
            return;
        }
        ((mobak.b.b.j) this).f271a.a((byte) 81, false);
    }

    protected abstract boolean e();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(short s) {
        if (this.f177d && ((mobak.b.b.j) this).f278a != -1) {
            f();
        }
        System.gc();
        if (mobak.b.b.m.a.m182b() && !mobak.a.a.f15a.m11b()) {
            mobak.b.b.m.a.b(false);
        }
        a((mobak.b.a.a[]) mobak.b.a.b.a.a());
        mobak.b.b.o oVar = mobak.b.b.m.a.f296a;
        mobak.b.b.o.m202c();
        a((mobak.b.a.a[]) mobak.b.a.b.a.m59a((byte) -1));
        mobak.b.b.m.a.g();
        mobak.b.b.m.a.m174a().mo144g();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public mobak.b.a.a a() {
        mobak.b.a.a[] mo148a;
        if (this.e >= 0 && (mo148a = mo148a(this.e)) != null && mo148a.length != 0 && mo148a.length > this.d) {
            return mo148a[this.d];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean f() {
        if (this.f177d) {
            ((mobak.b.b.j) this).f271a.a((short) 7, (byte) 81);
        } else {
            ((mobak.b.b.j) this).f271a.a((short) 106, (byte) 81);
        }
        this.f177d = !this.f177d;
        return true;
    }

    private boolean b(short s) {
        mobak.b.a.a a2;
        if (!this.f177d || (a2 = a()) == null) {
            return false;
        }
        if (((mobak.b.b.j) this).f278a == 1 || (((mobak.b.b.j) this).f278a == 4 && this.e == 1)) {
            a2.a((int) s, false, true);
        } else {
            a2.d(s);
        }
        ((mobak.b.b.j) this).f271a.c((byte) 84);
        return true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("screen type[").append((int) ((mobak.b.b.j) this).f278a).append("]\n");
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(Graphics graphics) {
        mobak.b.a.a a2;
        if (graphics == null) {
            return;
        }
        super.a(graphics);
        if (this.d < 0) {
            boolean z = false;
            mobak.b.a.a[] mo148a = mo148a((byte) 0);
            if (mo148a != null && mo148a.length > 0) {
                this.e = (byte) 0;
                this.d = (byte) 0;
                z = true;
            }
            if (z) {
                mo90a();
            }
        }
        a(graphics, mo148a((byte) 0), this.f176a[0], this.f175a[0], (short) 16, (short) (mo90a() + 10), this.d);
        if (((mobak.b.b.j) this).f279a.m208a() && (a2 = a()) != null) {
            a(a2, this.f176a[this.e]);
        }
        if (((mobak.b.b.j) this).f279a != null) {
            ((mobak.b.b.j) this).f279a.a(graphics, (byte) 0);
        }
        ((mobak.b.b.j) this).f271a.a(graphics);
    }

    public final void b(int i, int i2) {
        this.f175a[i] = (byte) i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(Graphics graphics) {
        if (graphics == null) {
            return;
        }
        super.a(graphics);
        if (this.d < 0) {
            boolean z = false;
            mobak.b.a.a[] mo148a = mo148a((byte) 0);
            if (mo148a != null && mo148a.length > 0) {
                this.e = (byte) 0;
                this.d = (byte) 0;
                z = true;
            }
            if (z) {
                mo90a();
            }
        }
        a(graphics, mo148a((byte) 0), this.f176a[0], this.f175a[0], (short) ((mobak.b.b.m.a.getWidth() - 16) - 29), (short) (mo90a() + 10), this.d);
        if (((mobak.b.b.j) this).f279a != null) {
            ((mobak.b.b.j) this).f279a.a(graphics, (byte) 0);
        }
        ((mobak.b.b.j) this).f271a.a(graphics);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.q, mobak.b.b.j
    public boolean a(int i, int i2) {
        ((mobak.b.b.j) this).f279a.a(i, i2);
        mobak.b.b.j.f260a = i;
        mobak.b.b.j.f261b = i2;
        mobak.b.b.j.f262c = i;
        mobak.b.b.j.f263d = i2;
        mobak.b.b.j.f264c = true;
        if (i < this.j || i > this.j + 29 || i2 < this.k || i2 > this.k + (a(true) * 29)) {
            this.g = false;
        } else {
            this.g = true;
        }
        this.f = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.a.q, mobak.b.b.j
    /* renamed from: b */
    public boolean mo108b(int i, int i2) {
        int i3 = i2 - mobak.b.b.j.f263d;
        if (((mobak.b.b.j) this).f279a.m213b()) {
            ((mobak.b.b.j) this).f279a.m212a(((mobak.b.b.j) this).f279a.m211c() - i3);
            mobak.b.b.j.f263d = i2;
        }
        if (Math.abs(mobak.b.b.j.f262c - mobak.b.b.j.f260a) > 10 || Math.abs(mobak.b.b.j.f263d - mobak.b.b.j.f261b) > 10) {
            mobak.b.b.j.f264c = false;
        }
        if (this.g) {
            this.f179e += i3;
        }
        mobak.b.b.j.f263d = i2;
        return false;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean a(int i, int i2, int i3) {
        if (!mobak.b.b.j.f264c) {
            return false;
        }
        i iVar = null;
        for (int i4 = 0; i4 < this.f178a.size() && iVar == null; i4++) {
            i iVar2 = (i) this.f178a.elementAt(i4);
            if (iVar2.a(i, i2)) {
                iVar = iVar2;
            }
        }
        if (!this.f177d) {
            if (iVar == null || this.e != iVar.f173a || this.d != iVar.f174a || this.f177d) {
                return false;
            }
            m167a();
            return true;
        }
        byte m119a = q.m119a(i, i2);
        if (m119a == 1) {
            if (i3 > 300) {
                b((short) ((byte) q.m116a(i3, 300)));
            } else if (!this.f) {
                b((short) 1);
            }
            this.f = true;
            return true;
        }
        if (m119a != 2) {
            return true;
        }
        if (i3 > 300) {
            b((short) ((byte) ((-1) * q.m116a(i3, 300))));
        } else if (!this.f) {
            b((short) -1);
        }
        this.f = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v97, types: [int] */
    @Override // mobak.b.b.a.q, mobak.b.b.j
    public boolean b(int i, int i2, int i3) {
        ((mobak.b.b.j) this).f279a.d();
        if (this.f179e > 0) {
            this.f179e += 14;
        } else {
            this.f179e -= 14;
        }
        byte[] bArr = this.f175a;
        bArr[0] = (byte) (bArr[0] - (this.f179e / 29));
        if (this.f175a[0] < 0) {
            this.f175a[0] = 0;
        }
        byte a2 = a(true);
        mobak.b.a.a[] mo148a = mo148a((byte) 0);
        byte length = mo148a != null ? mo148a.length : (byte) 0;
        if (this.f175a[0] + a2 > length) {
            this.f175a[0] = (byte) (length - a2);
        }
        if (a2 >= length || length == 0) {
            this.f175a[0] = 0;
        }
        this.f179e = 0;
        if (!mobak.b.b.j.f264c || this.f178a == null || this.f178a.size() == 0) {
            return false;
        }
        i iVar = null;
        for (int i4 = 0; i4 < this.f178a.size() && iVar == null; i4++) {
            i iVar2 = (i) this.f178a.elementAt(i4);
            if (iVar2.a(i, i2)) {
                iVar = iVar2;
            }
        }
        if (iVar == null) {
            if (!this.f177d) {
                return false;
            }
            byte m119a = q.m119a(i, i2);
            if (m119a == 1) {
                if (this.f && i3 < 300) {
                    return true;
                }
                b((short) 1);
                return true;
            }
            if (m119a != 2) {
                return true;
            }
            if (this.f && i3 < 300) {
                return true;
            }
            b((short) -1);
            return true;
        }
        if (this.e == iVar.f173a && this.d == iVar.f174a) {
            if (this.f177d) {
                return false;
            }
            m167a();
            return true;
        }
        mobak.b.a.a a3 = a();
        this.d = (byte) iVar.f174a;
        mobak.b.a.a a4 = a();
        if (((mobak.b.b.j) this).f278a != -5) {
            if (a4 != null && a3 != a4) {
                i();
            }
            if (a4 != null && (a3 != a4 || ((mobak.b.b.j) this).f279a.m208a())) {
                a(a4, this.f176a[this.e]);
            }
        }
        mo90a();
        return true;
    }
}
