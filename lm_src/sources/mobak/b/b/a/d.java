package mobak.b.b.a;

import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/a/d.class */
public final class d extends q implements mobak.c.b {
    private byte c;
    private String[] a;

    /* renamed from: a, reason: collision with other field name */
    private int[] f151a;
    private mobak.c.a j;
    private byte d;
    private int e;
    private String[] b;

    /* renamed from: b, reason: collision with other field name */
    private mobak.b.b.p f152b;

    /* renamed from: b, reason: collision with other field name */
    private int[] f153b;

    /* renamed from: e, reason: collision with other field name */
    private byte f154e;
    private int g;

    /* renamed from: c, reason: collision with other field name */
    private String[] f155c;

    /* renamed from: d, reason: collision with other field name */
    private String[] f156d;

    /* renamed from: a, reason: collision with other field name */
    private boolean f157a;

    /* renamed from: d, reason: collision with other field name */
    private boolean f158d = false;

    /* renamed from: a, reason: collision with other field name */
    private s f159a;

    /* renamed from: b, reason: collision with other field name */
    private s f160b;

    /* renamed from: c, reason: collision with other field name */
    private s f161c;
    private int h;

    /* renamed from: a, reason: collision with other field name */
    private static d f162a;

    public static final d a() {
        if (f162a == null) {
            mobak.b.a.b.a.f90b = true;
            f162a = new d();
            mobak.b.b.m.a.a((q) f162a, true);
            mobak.a.a.f15a.a(new mobak.a.a.l(mobak.a.a.b.f33a[60], (short) 0, mobak.a.a.b.f33a[61]));
        }
        return f162a;
    }

    private d() {
        ((mobak.b.b.j) this).f278a = (short) -107;
        mobak.c.d.a(81);
        ((q) this).f190b = mobak.c.d.a(154);
        this.a = null;
        this.f151a = null;
        this.j = mobak.b.b.j.f;
        ((mobak.b.b.j) this).f271a = new r(new byte[]{51, 81, 96, 58, 98, 79}, new byte[]{52, 55, 97}, null);
        ((mobak.b.b.j) this).f271a.a((short) 208, (byte) 98);
        ((mobak.b.b.j) this).f271a.a((short) 169, (byte) 97);
        ((mobak.b.b.j) this).f271a.a((short) 34, (byte) 55);
        ((mobak.b.b.j) this).f271a.a((short) 237, (byte) 79);
        ((mobak.b.b.j) this).f271a.a((byte) 98, true);
        this.f152b = new mobak.b.b.p((short) 2, (short) (mo90a() + 8), (short) (mobak.b.b.m.a.getWidth() - 4), (short) (((mobak.b.b.m.a.getHeight() - mo90a()) - 22) - r.a()), false, false);
        ((mobak.b.b.j) this).f271a.a((short) 152, (byte) 96);
        ((mobak.b.b.j) this).f271a.a((short) 153, (byte) 58);
        ((mobak.b.b.j) this).f271a.a((byte) 51, true);
        ((mobak.b.b.j) this).f271a.a((byte) 96, true);
        ((mobak.b.b.j) this).f271a.a((byte) 58, true);
        ((mobak.b.b.j) this).f271a.a((byte) 79, true);
        this.f159a = new s((byte) 71);
        this.f159a.a(false);
        this.f159a.a((short) 241);
        ((mobak.b.b.j) this).f271a.a(true, this.f159a);
        this.f160b = new s((byte) 30);
        this.f160b.a(false);
        this.f160b.a((short) 267);
        this.f160b.c(true);
        this.f160b.f203a = mobak.a.a.b.f33a[88];
        ((mobak.b.b.j) this).f271a.a(true, this.f160b);
        this.f161c = new s((byte) 30);
        this.f161c.a(false);
        this.f161c.a((short) 252);
        this.f161c.c(true);
        this.f161c.f203a = mobak.a.a.b.f33a[89];
        ((mobak.b.b.j) this).f271a.a(true, this.f161c);
    }

    public final void a(String[] strArr, int[] iArr) {
        o();
        this.a = strArr;
        this.f151a = iArr;
        this.c = (byte) 1;
    }

    public final void b(int i, int i2) {
        if (i < 0 && i2 < 0) {
            this.f158d = true;
            return;
        }
        this.f158d = false;
        o();
        this.c = (byte) 2;
        ((q) this).f190b = this.a[this.f154e];
        if (this.f151a[this.f154e] != -1) {
            this.b = new String[]{new StringBuffer().append(mobak.c.d.a(80)).append("(").append(i).append(")").toString(), new StringBuffer().append(mobak.c.d.a(160)).append("(").append(i2).append(")").toString()};
        } else {
            this.b = new String[]{new StringBuffer().append(mobak.c.d.a(66)).append("(").append(i).append(")").toString(), new StringBuffer().append(mobak.c.d.a(67)).append("(").append(i2).append(")").toString()};
        }
    }

    public final void a(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, boolean z, boolean z2) {
        o();
        this.f153b = iArr;
        this.f152b.m207c();
        a(strArr, strArr2, iArr2);
        if (strArr != null && strArr.length > 0) {
            this.f152b.a(this.e).b(16773632, 2);
        }
        String[] strArr3 = this.a;
        byte b = this.f154e;
        ((q) this).f190b = mobak.c.d.a(160);
        this.c = (byte) 4;
        ((mobak.b.b.j) this).f271a.a((short) 156, (byte) 81);
        if (z) {
            ((mobak.b.b.j) this).f271a.a((byte) 96, false);
        } else {
            ((mobak.b.b.j) this).f271a.a((byte) 96, true);
        }
        if (z2) {
            ((mobak.b.b.j) this).f271a.a((byte) 58, false);
        } else {
            ((mobak.b.b.j) this).f271a.a((byte) 58, true);
        }
        ((mobak.b.b.j) this).f271a.a((byte) 79, false);
        this.f160b.a(true);
        this.f161c.a(true);
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final void a(Graphics graphics) {
        super.a(graphics);
        synchronized (this) {
            switch (this.c) {
                case 1:
                    if (this.a != null) {
                        a(graphics, b(), this.a, this.d, this.j);
                        break;
                    }
                    break;
                case 2:
                    if (this.b != null) {
                        a(graphics, b(), this.b, this.d, this.j);
                        break;
                    }
                    break;
                case 3:
                case 4:
                    this.f152b.a(graphics, (byte) 0);
                    break;
            }
            ((mobak.b.b.j) this).f271a.a(graphics);
            if (this.f155c != null) {
                synchronized (this) {
                    if (this.g == this.f155c.length - 1) {
                        this.f156d = null;
                        this.f155c = null;
                        this.g = 0;
                    } else {
                        for (short s = (short) this.g; s < this.f155c.length; s = (short) (s + 1)) {
                            if (mobak.b.b.m.a.m183d() >= 0) {
                                mobak.b.b.m.a.b(this.f156d[s], this.f155c[s]);
                                this.g++;
                            }
                        }
                    }
                }
            }
        }
    }

    private short b() {
        return (short) (mo90a() + 10);
    }

    @Override // mobak.b.b.j
    /* renamed from: a */
    public final void mo90a() {
        if (this.c == 1) {
            ((mobak.b.b.j) this).f271a.b((byte) 55);
        } else {
            ((mobak.b.b.j) this).f271a.c((byte) 55);
        }
        if (this.c == 4 && this.f152b.m208a()) {
            ((mobak.b.b.j) this).f271a.a((byte) 81, true);
        } else {
            ((mobak.b.b.j) this).f271a.a((byte) 81, false);
        }
        if (this.c == 3) {
            ((mobak.b.b.j) this).f271a.a((byte) 81, true);
            boolean z = false;
            if (this.f151a[this.f154e] != -1) {
                z = true;
                if (this.f152b.m208a()) {
                    ((mobak.b.b.j) this).f271a.a((short) 156, (byte) 81);
                } else {
                    ((mobak.b.b.j) this).f271a.a((short) 157, (byte) 81);
                }
            } else if (!this.f152b.m208a()) {
                if (this.f157a) {
                    ((mobak.b.b.j) this).f271a.a((short) 156, (byte) 81);
                } else {
                    ((mobak.b.b.j) this).f271a.a((short) 157, (byte) 81);
                }
                z = true;
            }
            if (z) {
                ((mobak.b.b.j) this).f271a.a((byte) 81, false);
            }
        }
        if (this.f158d) {
            ((mobak.b.b.j) this).f271a.a((byte) 81, true);
        }
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final boolean a(s sVar) {
        switch ((byte) sVar.a) {
            case 30:
                if (sVar.f203a != mobak.a.a.b.f33a[89] || !sVar.e()) {
                    return super.a(sVar);
                }
                int mo109a = mo109a();
                if (mobak.b.a.b.a.f73a == mo109a) {
                    return false;
                }
                mobak.a.a.l lVar = new mobak.a.a.l(sVar.f203a);
                lVar.a(sVar.b);
                lVar.a(mo109a);
                mobak.a.a.f15a.a(lVar);
                return true;
            case 55:
                c();
                return true;
            case 58:
                if (this.c == 3) {
                    a((byte) 1, (byte) 0);
                    return true;
                }
                a((byte) 1);
                return true;
            case 71:
                if (this.f152b.a(this.e + 1) == null) {
                    return true;
                }
                mobak.b.b.m.a("", mobak.c.d.a(244), "", new e(this));
                return true;
            case 79:
                mobak.a.a.l lVar2 = new mobak.a.a.l(mobak.a.a.b.f33a[79], (short) 0, mobak.a.a.b.f33a[79]);
                lVar2.a((byte) 1);
                mobak.a.a.f15a.a(lVar2);
                return true;
            case 81:
                switch (this.c) {
                    case 1:
                        e();
                        return true;
                    case 2:
                        f();
                        return true;
                    case 3:
                    case 4:
                        this.h = -1;
                        String str = null;
                        if (this.f152b.a(this.e) != null) {
                            str = this.f152b.a(this.e).mo134a();
                            this.h = this.f152b.a(this.e).mo135b();
                        }
                        String str2 = str;
                        boolean z = str != null;
                        ((mobak.b.b.j) this).f266a = new mobak.b.b.g(mobak.c.d.a(79), this);
                        ((mobak.b.b.j) this).f266a.a(mobak.c.d.a(129), 0);
                        ((mobak.b.b.j) this).f266a.a(mobak.c.d.a(34), 1);
                        if (z && this.f151a[this.f154e] != -1) {
                            mobak.b.b.g gVar = ((mobak.b.b.j) this).f266a;
                            String a = mobak.c.d.a(79);
                            String[] strArr = {mobak.c.d.a(155), new StringBuffer().append(mobak.c.d.a(159)).append(" (").append(str2).append(")").toString()};
                            boolean[] zArr = new boolean[2];
                            zArr[0] = !z;
                            zArr[1] = z;
                            gVar.a(a, 1, strArr, zArr);
                        }
                        ((mobak.b.b.j) this).f266a.a(mobak.c.d.a(79), "", 200, 0);
                        ((mobak.b.b.j) this).f266a.m152a();
                        return true;
                    default:
                        return true;
                }
            case 96:
                if (this.c == 3) {
                    a((byte) 2, (byte) 0);
                    return true;
                }
                a((byte) 2);
                return true;
            case 97:
                m107b();
                return true;
            case 98:
                a((byte) 0, (byte) 0);
                return true;
            default:
                return super.a(sVar);
        }
    }

    @Override // mobak.b.b.j
    protected final void c(int i) {
        switch (this.c) {
            case 1:
            case 2:
                int i2 = -1;
                switch (this.c) {
                    case 1:
                        if (this.a != null) {
                            i2 = this.a.length;
                            break;
                        }
                        break;
                    case 2:
                        if (this.b != null) {
                            i2 = this.b.length;
                            break;
                        }
                        break;
                }
                if (i2 == -1) {
                    return;
                }
                if (mobak.b.b.m.a.getGameAction(i) == 6) {
                    if (this.d < i2 - 1) {
                        this.d = (byte) (this.d + 1);
                        return;
                    } else {
                        this.d = (byte) 0;
                        return;
                    }
                }
                if (mobak.b.b.m.a.getGameAction(i) == 1) {
                    if (this.d > 0) {
                        this.d = (byte) (this.d - 1);
                        return;
                    } else {
                        this.d = (byte) (i2 - 1);
                        return;
                    }
                }
                return;
            case 3:
            case 4:
                int i3 = -1;
                if (mobak.b.b.m.a.getGameAction(i) == 6) {
                    int m209a = this.f152b.m209a(this.e + 1);
                    i3 = m209a;
                    if (m209a != -1 && !this.f152b.m210a(i3)) {
                        this.f152b.b();
                        i3 = -1;
                    }
                } else if (mobak.b.b.m.a.getGameAction(i) == 1) {
                    int b = this.f152b.b(this.e - 1);
                    i3 = b;
                    if (b != -1 && !this.f152b.m210a(i3)) {
                        this.f152b.a();
                        i3 = -1;
                    }
                }
                if (i3 != -1) {
                    this.f152b.a(this.e).m214e();
                    this.e = i3;
                    this.f152b.a(this.e).b(16773632, 2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private boolean e() {
        byte b = this.d;
        if (b < 0 || b >= this.f151a.length) {
            return false;
        }
        this.f154e = this.d;
        a(this.f151a[b], true);
        return true;
    }

    private void a(int i, boolean z) {
        try {
            mobak.a.a.l lVar = z ? new mobak.a.a.l(mobak.a.a.b.f33a[57], (short) 4, mobak.a.a.b.f33a[57]) : new mobak.a.a.l(mobak.a.a.b.f33a[57], (short) 4, (short) 0);
            lVar.a(i);
            mobak.a.a.f15a.a(lVar);
            this.f152b.m207c();
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("select room: ").append(e.getMessage()).toString(), false);
        }
    }

    private boolean f() {
        if (this.f151a[this.f154e] == -1) {
            this.f157a = this.d != 0;
            a((byte) 0, (byte) (this.d + 1));
            return true;
        }
        if (this.d == 0) {
            a((byte) 0, (byte) 0);
            return true;
        }
        if (this.d != 1) {
            return true;
        }
        a((byte) 0);
        return true;
    }

    private static void a(byte b, byte b2) {
        try {
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[58], (short) 0, mobak.a.a.b.f33a[56]);
            lVar.a(b);
            if (b2 != 0) {
                lVar.a(b2);
            }
            mobak.a.a.f15a.a(lVar);
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("MSG_LIST: ").append(e.getMessage()).toString());
        }
    }

    private static void a(byte b) {
        try {
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[61], (short) 0, mobak.a.a.b.f33a[61]);
            lVar.a(b);
            mobak.a.a.f15a.a(lVar);
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("MSG_LIST: ").append(e.getMessage()).toString());
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m107b() {
        mobak.b.a.b.a.f90b = false;
        f162a = null;
        try {
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[60]);
            lVar.a((byte) 1);
            mobak.a.a.f15a.a(lVar);
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("closeChat ").append(e.getMessage()).toString());
        }
        mobak.b.b.m.a.g();
    }

    private void c() {
        while (true) {
            if (this.c == 3) {
                o();
            }
            switch (this.c) {
                case 2:
                    this.f158d = false;
                    this.c = (byte) 1;
                    ((q) this).f190b = mobak.c.d.a(154);
                    mobak.c.d.a(81);
                    ((mobak.b.b.j) this).f271a.d((byte) 81);
                    a(-100, false);
                    return;
                case 3:
                case 4:
                    if (!this.f158d) {
                        a(this.f151a[this.f154e], true);
                        mobak.c.d.a(81);
                        ((q) this).f190b = this.a[this.f154e];
                        ((mobak.b.b.j) this).f271a.d((byte) 81);
                        return;
                    }
                    this.c = (byte) 2;
                default:
                    return;
            }
        }
    }

    private void o() {
        this.f159a.a(false);
        this.f160b.a(false);
        this.f161c.a(false);
        ((mobak.b.b.j) this).f271a.a((byte) 51, true);
        ((mobak.b.b.j) this).f271a.a((byte) 96, true);
        ((mobak.b.b.j) this).f271a.a((byte) 58, true);
        ((mobak.b.b.j) this).f271a.a((byte) 79, true);
        ((mobak.b.b.j) this).f271a.a((short) 7, (byte) 81);
        ((mobak.b.b.j) this).f271a.a((byte) 98, true);
        this.d = (byte) 0;
        this.e = 0;
        this.f152b.m207c();
    }

    public final void a(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2) {
        if (!this.f152b.m208a()) {
            this.f152b.a(this.e).m214e();
        }
        if (this.f153b != null && this.f153b.length > 15) {
            p();
        }
        if (this.f153b == null) {
            this.f153b = iArr;
        } else {
            int[] iArr3 = new int[this.f153b.length + iArr.length];
            System.arraycopy(this.f153b, 0, iArr3, iArr.length, this.f153b.length);
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            this.f153b = iArr3;
        }
        a(strArr, strArr2, iArr2);
        if (this.f152b.m208a()) {
            return;
        }
        this.f152b.a(0).b(16773632, 2);
        this.d = (byte) 0;
        this.e = 0;
    }

    private void p() {
        this.f153b = null;
        this.d = (byte) 0;
        this.e = 0;
        this.f152b.m207c();
        ((mobak.b.b.j) this).f271a.a((byte) 98, true);
    }

    public final void a(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, boolean z, boolean z2, boolean z3) {
        o();
        p();
        ((mobak.b.b.j) this).f271a.a((byte) 98, false);
        if (this.c != 3) {
            String[] strArr3 = this.a;
            byte b = this.f154e;
            ((q) this).f190b = mobak.c.d.a(80);
            this.c = (byte) 3;
            this.f152b.m207c();
        }
        a(strArr, strArr2, iArr, iArr2);
        if (z && z2) {
            ((mobak.b.b.j) this).f271a.a((byte) 51, false);
            ((mobak.b.b.j) this).f271a.a((byte) 96, false);
            ((mobak.b.b.j) this).f271a.a((byte) 58, false);
        } else if (z2) {
            ((mobak.b.b.j) this).f271a.a((byte) 51, false);
            ((mobak.b.b.j) this).f271a.a((byte) 58, false);
        } else if (z) {
            ((mobak.b.b.j) this).f271a.a((byte) 51, false);
            ((mobak.b.b.j) this).f271a.a((byte) 96, false);
        }
        this.f160b.a(true);
        this.f161c.a(true);
        this.f159a.a(z3);
    }

    public final synchronized void b(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2) {
        if (this.f151a[this.f154e] == -1) {
            a(strArr, strArr2, iArr, iArr2);
            return;
        }
        if (strArr2.length <= 5) {
            for (int i = 0; i < strArr2.length; i++) {
                mobak.b.b.m.a.b(strArr[i], strArr2[i]);
            }
            return;
        }
        if (this.f156d != null) {
            String[] strArr3 = new String[this.f155c.length + strArr2.length];
            System.arraycopy(this.f155c, 0, strArr3, 0, this.f155c.length);
            System.arraycopy(strArr2, 0, strArr3, this.f155c.length, strArr2.length);
            this.f155c = strArr3;
            System.arraycopy(this.f156d, 0, strArr3, 0, this.f156d.length);
            System.arraycopy(strArr2, 0, strArr3, this.f156d.length, strArr2.length);
            this.f156d = strArr3;
            return;
        }
        this.f156d = new String[strArr2.length];
        this.f155c = new String[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            if (strArr2[i2] != null && !strArr2[i2].trim().equals("")) {
                this.f155c[i2] = new StringBuffer().append(strArr[i2]).append(": ").append(strArr2[i2]).toString();
            }
        }
        this.g = 0;
    }

    private void a(String[] strArr, String[] strArr2, int[] iArr) {
        if (this.f152b.m208a()) {
            this.f152b.f352a += 10;
        }
        for (int i = 0; i < strArr2.length; i++) {
            synchronized (this) {
                this.f152b.a(strArr2[i], mobak.b.b.j.f259b, true, -1);
                if (iArr == null || iArr[i] <= 0 || iArr[i] >= 10) {
                    this.f152b.a(strArr[i], mobak.b.b.j.h, true, -1);
                } else {
                    this.f152b.a(strArr[i], mobak.b.b.j.i, true, -1);
                }
            }
        }
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    /* renamed from: b, reason: collision with other method in class */
    protected final boolean mo108b(int i, int i2) {
        return a(i, i2);
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean a(int i, int i2) {
        switch (this.c) {
            case 1:
            case 2:
                byte a = a(this.j, this.a.length, b(), i2);
                if (a < 0 || a >= this.a.length) {
                    return false;
                }
                this.d = a;
                return true;
            case 3:
            case 4:
                int c = this.f152b.c(i2);
                if (c == -1) {
                    return false;
                }
                this.f152b.a(this.e).m214e();
                this.e = c;
                this.f152b.a(this.e).b(16773632, 2);
                return true;
            default:
                return false;
        }
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean b(int i, int i2, int i3) {
        byte a;
        if ((this.c != 1 && this.c != 2) || (a = a(this.j, this.a.length, b(), i2)) < 0 || a >= this.a.length || this.d != a) {
            return false;
        }
        if (this.c == 1) {
            return e();
        }
        if (this.c == 2) {
            return f();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.j
    public final void d(int i) {
        if (i != 51 || ((mobak.b.b.j) this).f272a != 1) {
            super.d(i);
            return;
        }
        byte b = this.d;
        if (b < 0 || b >= this.f151a.length) {
            return;
        }
        this.f154e = this.d;
        a(this.f151a[b], true);
    }

    @Override // mobak.b.b.j, mobak.c.b
    public final void a(int i) {
        String m150a;
        if (i == 1) {
            mobak.b.b.m.a.m();
            ((mobak.b.b.j) this).f266a = null;
            return;
        }
        if (i != 0 || (m150a = ((mobak.b.b.j) this).f266a.m150a(0)) == null || m150a.trim().equals("")) {
            return;
        }
        try {
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[56]);
            boolean z = false;
            if (((mobak.b.b.j) this).f266a.c() > 0) {
                z = ((mobak.b.b.j) this).f266a.m151a(0) != 0;
            }
            if (z || this.f151a[this.f154e] == -1) {
                lVar.a((byte) 1);
                lVar.a(this.h);
            } else {
                lVar.a((byte) 0);
                lVar.a(0);
            }
            lVar.a(m150a);
            mobak.a.a.f15a.a(lVar);
            a(1);
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("Chat3 sendMsg: ").append(e.getMessage()).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.j
    /* renamed from: a, reason: collision with other method in class */
    public final int mo109a() {
        switch (this.c) {
            case 1:
                return -1;
            case 2:
                return -1;
            case 3:
            case 4:
                if (this.f152b.a(this.e) != null) {
                    return this.f152b.a(this.e).mo135b();
                }
                return -1;
            default:
                return -1;
        }
    }

    @Override // mobak.b.b.j, mobak.c.b
    public final void b(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(d dVar) {
        return dVar.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static mobak.b.b.p m110a(d dVar) {
        return dVar.f152b;
    }
}
