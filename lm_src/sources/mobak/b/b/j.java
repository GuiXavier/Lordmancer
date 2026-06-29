package mobak.b.b;

import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Graphics;
import mobak.Main2;
import mobak.b.b.a.r;
import mobak.b.b.a.s;
import mobak.b.b.a.z;

/* loaded from: LordmancerL.jar:mobak/b/b/j.class */
public abstract class j implements mobak.c.b {

    /* renamed from: a, reason: collision with other field name */
    public static int f260a;

    /* renamed from: b, reason: collision with other field name */
    public static int f261b;

    /* renamed from: c, reason: collision with other field name */
    public static int f262c;

    /* renamed from: d, reason: collision with other field name */
    public static int f263d;

    /* renamed from: c, reason: collision with other field name */
    public static boolean f264c;

    /* renamed from: a, reason: collision with other field name */
    public g f266a;

    /* renamed from: a, reason: collision with other field name */
    private s f270a;

    /* renamed from: a, reason: collision with other field name */
    public short f278a;

    /* renamed from: a, reason: collision with other field name */
    public p f279a;

    /* renamed from: b, reason: collision with other field name */
    private String f280b;
    static boolean b = false;
    public static mobak.c.a a = null;

    /* renamed from: b, reason: collision with other field name */
    public static mobak.c.a f259b = null;
    public static mobak.c.a c = null;
    public static mobak.c.a d = null;
    public static mobak.c.a e = null;
    public static mobak.c.a f = null;
    public static mobak.c.a g = null;
    public static mobak.c.a h = null;
    public static mobak.c.a i = null;

    /* renamed from: a, reason: collision with other field name */
    public static String f265a = null;

    /* renamed from: b, reason: collision with other field name */
    private static short f275b = -1;

    /* renamed from: a, reason: collision with other field name */
    private boolean f267a = false;

    /* renamed from: d, reason: collision with other field name */
    private boolean f268d = false;

    /* renamed from: e, reason: collision with other field name */
    private boolean f269e = false;

    /* renamed from: a, reason: collision with other field name */
    public r f271a = null;

    /* renamed from: a, reason: collision with other field name */
    public byte f272a = 0;

    /* renamed from: c, reason: collision with other field name */
    private byte f273c = -1;

    /* renamed from: d, reason: collision with other field name */
    private byte f274d = -1;

    /* renamed from: c, reason: collision with other field name */
    private short f276c = -1;

    /* renamed from: f, reason: collision with other field name */
    private boolean f277f = true;

    /* renamed from: b, reason: collision with other field name */
    public byte f281b = 0;

    protected abstract void a(Graphics graphics);

    public final void b(Graphics graphics) {
        a(graphics);
        if (this.f270a == null) {
            return;
        }
        if (this.f268d) {
            this.f268d = false;
            this.f266a = new g(mobak.c.d.b(9), this);
            String[] strArr = this.f270a.f205a;
            short[] sArr = this.f270a.f206a;
            int[] iArr = this.f270a.f207a;
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= strArr.length) {
                    this.f266a.a("OK");
                    this.f266a.a(mobak.c.d.b(34), 1);
                    this.f266a.m152a();
                    return;
                } else {
                    if (sArr[s2] < 0) {
                        this.f266a.a(strArr[s2], "", 100, iArr[s2]);
                    } else {
                        this.f266a.a(strArr[s2], "", sArr[s2], iArr[s2]);
                    }
                    s = (short) (s2 + 1);
                }
            }
        } else {
            if (!this.f267a || this.f269e) {
                return;
            }
            this.f269e = true;
            k kVar = new k(this);
            if (!this.f270a.d()) {
                m.a("", this.f270a.f204a, "", kVar);
                return;
            }
            String[] strArr2 = new String[this.f266a.b()];
            short s3 = 0;
            while (true) {
                short s4 = s3;
                if (s4 >= this.f266a.b()) {
                    m.a("", mobak.c.d.a(this.f270a.f204a, strArr2), "", kVar);
                    return;
                } else {
                    strArr2[s4] = this.f266a.m150a((int) s4);
                    s3 = (short) (s4 + 1);
                }
            }
        }
    }

    public void d(int i2) {
        s sVar = null;
        if (this.f271a != null) {
            if (d() && m.a.m191a(i2) && !this.f271a.b()) {
                n();
                return;
            }
            mo90a();
            s a2 = this.f271a.a(r.b(i2), r.m127a(i2), m.a.m191a(i2));
            sVar = a2;
            if (a2 == null && this.f271a.m124a()) {
                this.f271a.a(m.a.getGameAction(i2));
                return;
            }
        }
        if (sVar == null || !b(sVar)) {
            c(i2);
        }
    }

    public final void c(byte b2) {
        this.f281b = b2;
        if (this.f271a != null) {
            this.f271a.m121a(this.f281b);
        }
    }

    public final void a(j jVar) {
        this.f281b = jVar.f281b;
        if (this.f271a != null) {
            this.f271a.m121a(this.f281b);
        }
    }

    public final byte a() {
        return this.f281b;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m167a() {
        s a2;
        if (this.f271a == null || (a2 = this.f271a.a(false, true, false)) == null) {
            return false;
        }
        try {
            return b(a2);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("(Screen descendant).pushLeftPopupMenuButton () error: ").append(e2.toString()).toString());
            return false;
        }
    }

    public boolean b(s sVar) {
        boolean a2 = a(sVar);
        if (sVar != null && ((byte) sVar.a) != 30 && sVar.f203a != 0) {
            mobak.a.a.f15a.a(new mobak.a.a.l(sVar.f203a));
        }
        return a2;
    }

    public boolean a(s sVar) {
        if (sVar == null) {
            return false;
        }
        switch ((byte) sVar.a) {
            case 30:
                if (sVar == null) {
                    return true;
                }
                k();
                this.f270a = sVar;
                boolean z = false;
                if (this.f270a.f204a != null) {
                    this.f267a = true;
                    z = true;
                }
                if (this.f270a.f205a != null) {
                    this.f268d = true;
                    z = true;
                }
                if (z) {
                    return true;
                }
                m171b();
                return true;
            case 64:
                m.a(mobak.c.d.a(135), mobak.c.d.a(185), "", new l(this));
                return true;
            case 71:
                m();
                return true;
            case 85:
                m.a.a((mobak.b.b.a.q) mobak.b.b.a.q.m117a(), true);
                return true;
            case 87:
                m.a.a((mobak.b.b.a.q) mobak.b.b.a.q.a((short) -2), true);
                return true;
            case 88:
                m.a.a((mobak.b.b.a.q) mobak.b.b.a.q.a((short) -3), true);
                return true;
            case 95:
                b(this.f278a);
                return true;
            case 97:
                mobak.b.b.a.d.a();
                return true;
            case 101:
                l();
                return true;
            case 102:
                mobak.b.a.b.m73a();
                return true;
            case 103:
                Main2 main2 = Main2.a;
                Main2.a(Main2.a.c());
                return true;
            case 104:
                Main2 main22 = Main2.a;
                Main2.a(Main2.a.m1b());
                return true;
            case 106:
                mobak.a.a.f15a.a(new mobak.a.a.l(mobak.a.a.b.f33a[111], (short) 0, mobak.a.a.b.f33a[111]));
                return true;
            default:
                mobak.a.a.f15a.a(new mobak.a.a.l(r.m131b((byte) sVar.a)));
                return false;
        }
    }

    protected void c(int i2) {
    }

    public j() {
        b = false;
    }

    public final void a(short s) {
        this.f278a = s;
    }

    private void a(String str) {
        try {
            this.f276c = mobak.c.a(str);
            this.f273c = (byte) (m.a(mobak.c.a(this.f276c)) / 17);
            this.f274d = (byte) 0;
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("loadAnimCursor").append(e2.toString()).toString());
        }
    }

    public final void d(byte b2) {
        if (b2 != this.f272a) {
            this.f272a = b2;
            try {
                if (f275b == -1) {
                    f275b = mobak.c.a("cursors.png");
                }
                if (this.f272a <= 0) {
                    if (this.f272a >= 0) {
                        this.f274d = (byte) -1;
                        this.f273c = (byte) -1;
                        return;
                    }
                    switch (this.f272a) {
                        case -4:
                            a("hand.png");
                            break;
                        case -3:
                            a("herou-cursor.png");
                            return;
                        case -2:
                            a("entry.png");
                            return;
                        case -1:
                            a("clock.png");
                            return;
                    }
                    return;
                }
                byte b3 = -1;
                switch (this.f272a) {
                    case 1:
                        b3 = 0;
                        break;
                    case 2:
                        b3 = 1;
                        break;
                    case 3:
                        b3 = 3;
                        break;
                    case 4:
                        b3 = 4;
                        break;
                    case 5:
                        b3 = 5;
                        break;
                    case 6:
                        b3 = 7;
                        break;
                    case 7:
                        b3 = 10;
                        break;
                    case 9:
                        b3 = 11;
                        break;
                    case 10:
                        b3 = 12;
                        break;
                }
                if (b3 >= 0) {
                    this.f274d = b3;
                    this.f273c = (byte) -1;
                }
            } catch (Exception e2) {
                mobak.a.a.a(new StringBuffer("loadCursor ").append(e2.toString()).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Graphics graphics, short s, short s2) {
        a(graphics, s, s2, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Graphics graphics, short s, short s2, int i2) {
        try {
            if (this.f272a != 0 && s >= 0 && s2 >= 0 && s <= m.a.getWidth() && s2 <= m.a.getHeight()) {
                if (this.f272a > 0) {
                    m.a(graphics, mobak.c.a(f275b), 17 * this.f274d, 0, 17, 17, 0, s, s2, 0);
                    return;
                }
                m.a(graphics, mobak.c.a(this.f276c), 17 * this.f274d, 0, 17, 17, 0, s, s2, 0);
                this.f274d = (byte) (this.f274d + 1);
                if (this.f274d >= this.f273c) {
                    this.f274d = (byte) 0;
                }
            }
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("drawCursor ").append(e2.toString()).toString());
        }
    }

    public static void a(Graphics graphics, byte b2, short s, short s2, int i2) {
        if (f275b == -1) {
            f275b = mobak.c.a("cursors.png");
        }
        m.a(graphics, mobak.c.a(f275b), b2 * 17, 0, 17, 17, 0, s, s2, 0);
    }

    public static void e() {
        b = false;
    }

    public static void f() {
        b = false;
    }

    public static boolean b() {
        return b;
    }

    /* renamed from: g */
    public void mo144g() {
        z a2;
        try {
            if (!Main2.a.a(this.f278a) || (a2 = z.a(this.f278a)) == null) {
                return;
            }
            m.a.a(a2, m.a.m174a() == this);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("HelpViewInit ").append(e2.getMessage()).toString());
        }
    }

    /* renamed from: a */
    public abstract void mo90a();

    public final boolean c() {
        return this.f277f;
    }

    public final void b(boolean z) {
        this.f277f = z;
    }

    public final void h() {
        b(this.f278a);
    }

    public static void b(short s) {
        try {
            z a2 = z.a(s);
            if (a2 != null) {
                m.a.a((mobak.b.b.a.q) a2, true);
                return;
            }
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[49]);
            lVar.a(mobak.a.a.b.f33a[49]);
            lVar.b(s);
            mobak.a.a.f15a.a(lVar);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("addToOrderRequest ").append(e2.toString()).toString());
        }
    }

    public final void i() {
        if (this.f279a != null) {
            this.f279a.m207c();
        }
    }

    public final void a(short s, short s2, short s3, short s4, boolean z) {
        if (this.f279a != null) {
            this.f279a = null;
        }
        this.f279a = new p(s, s2, s3, s4, true, false);
    }

    protected abstract boolean a(int i2, int i3);

    protected abstract boolean b(int i2, int i3, int i4);

    protected abstract boolean a(int i2, int i3, int i4);

    /* renamed from: b */
    protected abstract boolean mo108b(int i2, int i3);

    public final boolean c(int i2, int i3) {
        try {
            if (this.f271a != null) {
                mo90a();
                if (r.a(i2, i3)) {
                    s a2 = this.f271a.a(false, true, false);
                    if (a2 == null) {
                        return false;
                    }
                    b(a2);
                    return true;
                }
                if (r.b(i2, i3)) {
                    s a3 = this.f271a.a(true, false, false);
                    if (a3 == null) {
                        return false;
                    }
                    b(a3);
                    return true;
                }
                if (this.f271a.m124a() && this.f271a.c(i2, i3)) {
                    return false;
                }
            }
            a(i2, i3);
            return false;
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("Screen.pointerPressed: ").append(e2.toString()).toString());
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m168a(int i2, int i3) {
        try {
            if (this.f271a == null || !((this.f271a.m124a() && this.f271a.c(i2, i3)) || r.a(i2, i3) || r.b(i2, i3))) {
                mo108b(i2, i3);
            }
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("Screen.pointerDragged: ").append(e2.getMessage()).toString());
        }
    }

    public final boolean c(int i2, int i3, int i4) {
        s a2;
        s a3;
        try {
            if (this.f271a != null && (f261b > m.a.getHeight() - r.a() || this.f271a.m124a())) {
                if (r.a(i2, i3)) {
                    if (i4 <= 500 || (a3 = this.f271a.a(false, true, false)) == null) {
                        return true;
                    }
                    b(a3);
                    return true;
                }
                if (r.b(i2, i3)) {
                    if (i4 <= 500 || (a2 = this.f271a.a(true, false, false)) == null) {
                        return true;
                    }
                    b(a2);
                    return true;
                }
                if (this.f271a.m124a()) {
                    if (!this.f271a.c(i2, i3)) {
                        this.f271a.m123a();
                        return true;
                    }
                    s a4 = this.f271a.a(false, false, true);
                    if (a4 == null) {
                        return true;
                    }
                    b(a4);
                    return true;
                }
            }
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("Screen.pointerReleased: ").append(e2.toString()).toString());
        }
        return b(i2, i3, i4);
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m169a(int i2, int i3, int i4) {
        a(i2, i3, i4);
    }

    public final void j() {
    }

    @Override // mobak.c.b
    public void a(int i2) {
        if (i2 == 1) {
            m.a.m();
            k();
            return;
        }
        if (i2 != 0) {
            return;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= this.f266a.b()) {
                m.a.m();
                if (this.f270a == null || !this.f270a.c()) {
                    m171b();
                    return;
                }
                return;
            }
            if (this.f266a.m150a((int) s2).equals("")) {
                return;
            } else {
                s = (short) (s2 + 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k() {
        this.f270a = null;
        this.f269e = false;
        this.f266a = null;
    }

    /* renamed from: a, reason: collision with other method in class */
    private String[] m170a(int i2, int i3) {
        String a2 = a(new StringBuffer().append("num").append(String.valueOf(i2)).append("-").append(String.valueOf(i3)).toString(), (String) null);
        String a3 = a2 == null ? a(new StringBuffer().append("num").append(String.valueOf(i2)).append(String.valueOf(i3)).toString(), "") : a2;
        String a4 = a("moneyName", i2, "");
        String a5 = a("smsprefix", i2, "mancer");
        String[] a6 = mobak.j.a(a3.trim(), ' ');
        String[] strArr = new String[6];
        strArr[0] = a6[0];
        strArr[1] = a6[1];
        strArr[2] = a4;
        strArr[3] = a6[2];
        strArr[4] = a5;
        strArr[5] = a6.length > 3 ? a6[3] : "";
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* renamed from: b, reason: collision with other method in class */
    private void m171b() {
        String a2;
        if (this.f266a != null) {
            if (this.f266a.a() == 10) {
                int m151a = this.f266a.m151a(1);
                int m151a2 = this.f266a.m151a(0);
                if (m151a == 0) {
                    return;
                }
                String[] m170a = m170a(m151a2 + 1, m151a);
                String a3 = a("smscoin", m151a2 + 1, (String) null);
                if (a3 != null) {
                    m170a[4] = a3;
                    a2 = mobak.c.d.a(302, m170a);
                } else if (a("comviva", m151a2 + 1, (String) null) != null) {
                    m170a[4] = "";
                    a2 = mobak.c.d.a(308, m170a);
                } else {
                    a2 = mobak.c.d.a(180, m170a);
                }
                this.f266a.a(mobak.c.d.b(135), a2, AlertType.CONFIRMATION, mobak.c.d.b(215));
                return;
            }
            if (this.f266a.a() == 20) {
                String m150a = this.f266a.m150a(0);
                if (m150a.trim().equals("")) {
                    return;
                }
                try {
                    int parseInt = Integer.parseInt(m150a);
                    ?? m64a = mobak.b.a.b.a.m64a();
                    if (m64a < parseInt) {
                        Main2.m5c();
                        return;
                    }
                    try {
                        mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[77]);
                        lVar.a(parseInt);
                        m64a = mobak.a.a.f15a.a(lVar);
                    } catch (Exception e2) {
                        mobak.a.a.a((Exception) m64a);
                    }
                    a(1);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        if (this.f270a == null) {
            return;
        }
        try {
            short s = this.f270a.f203a;
            short s2 = this.f270a.b;
            mobak.a.a.l lVar2 = new mobak.a.a.l(s);
            lVar2.a(s2);
            if (this.f270a.e()) {
                lVar2.a(mo109a());
            }
            if (this.f266a != null && this.f266a.b() > 0) {
                for (short s3 = 0; s3 < this.f266a.b(); s3 = (short) (s3 + 1)) {
                    lVar2.a(this.f266a.m150a((int) s3));
                }
            }
            mobak.a.a.f15a.a(lVar2);
            k();
        } catch (Exception e3) {
            mobak.a.a.a(new StringBuffer().append(e3).toString());
        }
    }

    /* renamed from: a */
    public int mo109a() {
        return -1;
    }

    @Override // mobak.c.b
    /* renamed from: d */
    public final void mo6d() {
        if (this.f266a.a() == 10) {
            int m151a = this.f266a.m151a(1);
            int m151a2 = this.f266a.m151a(0);
            String[] m170a = m170a(m151a2 + 1, m151a);
            if (m170a != null) {
                String stringBuffer = new StringBuffer().append(m170a[5]).append(m170a[4]).toString();
                String a2 = a("smscoin", m151a2 + 1, (String) null);
                if (a2 != null) {
                    mobak.j.a(new StringBuffer().append(m170a[5]).append(" ").append(a2).append(" id").append(String.valueOf(mobak.b.a.b.a.f73a)).toString(), m170a[0], stringBuffer);
                } else if (a("comviva", m151a2 + 1, (String) null) != null) {
                    mobak.j.a(new StringBuffer().append(m170a[5]).append("id").append(String.valueOf(mobak.b.a.b.a.f73a)).toString(), m170a[0], stringBuffer);
                } else {
                    mobak.j.a(new StringBuffer().append(stringBuffer).append("id").append(String.valueOf(mobak.b.a.b.a.f73a)).toString(), m170a[0], stringBuffer);
                }
            }
        } else {
            this.f266a.a();
        }
        a(1);
    }

    @Override // mobak.c.b
    public void b(int i2) {
        if (this.f266a.a() == 10) {
            if (i2 != 0) {
                if (i2 == 1) {
                    if (this.f266a.m151a(1) < 0) {
                        this.f266a.d(0);
                        return;
                    } else {
                        this.f266a.d(0);
                        this.f266a.a(mobak.c.d.b(129), 0);
                        return;
                    }
                }
                return;
            }
            this.f266a.b(1);
            this.f266a.d(0);
            int m151a = this.f266a.m151a(0);
            short parseShort = Short.parseShort(a("numCount", m151a + 1, "0").trim());
            if (parseShort <= 0) {
                this.f266a.a(mobak.c.d.b(135), mobak.c.d.b(216), 4);
                return;
            }
            String[] strArr = new String[parseShort + 1];
            strArr[0] = "";
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= parseShort) {
                    break;
                }
                String[] m170a = m170a(m151a + 1, s2 + 1);
                strArr[s2 + 1] = new StringBuffer().append(m170a[3]).append(" ").append(mobak.c.d.b(230)).append(" (").append(m170a[1]).append(" ").append(m170a[2]).append(")").toString();
                s = (short) (s2 + 1);
            }
            this.f266a.a(mobak.c.d.b(214), 4, strArr, (boolean[]) null);
            this.f266a.c(1);
            String a2 = a("comment", m151a + 1, (String) null);
            if (a2 != null) {
                this.f266a.a((String) null, a2);
            }
        }
    }

    private String a(String str, String str2) {
        int indexOf;
        String stringBuffer = new StringBuffer().append(str).append(":").toString();
        if (this.f280b != null && (indexOf = this.f280b.indexOf(stringBuffer)) >= 0) {
            int length = indexOf + stringBuffer.length();
            int indexOf2 = this.f280b.indexOf(13, length);
            int i2 = indexOf2;
            if (indexOf2 == -1) {
                i2 = this.f280b.indexOf(10, length);
            }
            return i2 == -1 ? this.f280b.substring(length) : this.f280b.substring(length, i2);
        }
        return str2;
    }

    private String a(String str, int i2, String str2) {
        return a(new StringBuffer().append(str).append(String.valueOf(i2)).toString(), str2);
    }

    public static void l() {
        String m238a = Main2.a.f5a.m238a((byte) 20, "0");
        String m238a2 = Main2.a.f5a.m238a((byte) 21, (String) null);
        if (m238a2 == null || m238a2.equals("")) {
            m238a = "0";
        }
        mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[106], mobak.a.a.l.b(), mobak.a.a.b.f33a[106]);
        lVar.a(Long.parseLong(m238a));
        mobak.a.a.f15a.a(lVar);
    }

    public final void a(long j, String str) {
        String str2;
        mobak.j.m243a();
        this.f266a = new g(mobak.c.d.b(212), this);
        this.f266a.a(10);
        this.f266a.a((String) null, mobak.c.d.b(231));
        String str3 = str;
        if (str3 == null || str3.equals("")) {
            String m238a = Main2.a.f5a.m238a((byte) 21, (String) null);
            if (m238a == null || m238a.equals("")) {
                str2 = null;
                this.f280b = str2;
                if (this.f280b != null || this.f280b.equals("")) {
                    m.a(mobak.c.d.b(135), mobak.c.d.b(278));
                }
                int parseShort = Short.parseShort(a("count", "0").trim());
                String[] strArr = new String[parseShort];
                short s = 0;
                while (true) {
                    short s2 = s;
                    if (s2 >= parseShort) {
                        this.f266a.a(mobak.c.d.b(213), 4, strArr, (boolean[]) null);
                        this.f266a.a(mobak.c.d.b(34), 1);
                        b(0);
                        this.f266a.m152a();
                        return;
                    }
                    strArr[s2] = a("name", s2 + 1, "0");
                    s = (short) (s2 + 1);
                }
            } else {
                str3 = m238a;
            }
        } else {
            Main2.a.f5a.a((byte) 20, String.valueOf(j));
            Main2.a.f5a.a((byte) 21, str3);
        }
        str2 = str3;
        this.f280b = str2;
        if (this.f280b != null) {
        }
        m.a(mobak.c.d.b(135), mobak.c.d.b(278));
    }

    public final void m() {
        this.f266a = new g(mobak.c.d.b(83), this);
        this.f266a.a(20);
        this.f266a.a(mobak.c.d.b(83));
        this.f266a.a(mobak.c.d.b(34), 1);
        this.f266a.a((String) null, mobak.c.d.a(232, new String[]{String.valueOf(mobak.c.f364a)}));
        this.f266a.a(mobak.c.d.a(83), "", 15, 2);
        this.f266a.m152a();
    }

    protected boolean d() {
        return false;
    }

    public void n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(j jVar) {
        jVar.m171b();
    }
}
