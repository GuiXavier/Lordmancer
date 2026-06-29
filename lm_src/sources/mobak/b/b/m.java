package mobak.b.b;

import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import mobak.Main2;
import mobak.b.b.a.r;

/* loaded from: LordmancerL.jar:mobak/b/b/m.class */
public final class m extends GameCanvas implements Runnable {
    public static m a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f282a;

    /* renamed from: a, reason: collision with other field name */
    private byte f283a;

    /* renamed from: a, reason: collision with other field name */
    private String[] f284a;
    private String[] b;

    /* renamed from: a, reason: collision with other field name */
    private short[] f285a;

    /* renamed from: b, reason: collision with other field name */
    private boolean f286b;

    /* renamed from: a, reason: collision with other field name */
    public static mobak.b.a.a[] f287a;

    /* renamed from: b, reason: collision with other field name */
    private static int f290b;

    /* renamed from: c, reason: collision with other field name */
    private static int f291c;

    /* renamed from: d, reason: collision with other field name */
    private static int f292d;

    /* renamed from: e, reason: collision with other field name */
    private static int f293e;

    /* renamed from: b, reason: collision with other field name */
    private byte f294b;

    /* renamed from: a, reason: collision with other field name */
    public mobak.b.b.a.f f295a;

    /* renamed from: a, reason: collision with other field name */
    public o f296a;

    /* renamed from: a, reason: collision with other field name */
    public a f297a;

    /* renamed from: a, reason: collision with other field name */
    private mobak.b.b.a.q[] f298a;

    /* renamed from: c, reason: collision with other field name */
    private byte f299c;

    /* renamed from: c, reason: collision with other field name */
    private boolean f300c;

    /* renamed from: d, reason: collision with other field name */
    private boolean f301d;

    /* renamed from: e, reason: collision with other field name */
    private boolean f302e;

    /* renamed from: f, reason: collision with other field name */
    private boolean f303f;

    /* renamed from: g, reason: collision with other field name */
    private boolean f304g;

    /* renamed from: a, reason: collision with other field name */
    private p f305a;

    /* renamed from: i, reason: collision with other field name */
    private boolean f309i;

    /* renamed from: j, reason: collision with other field name */
    private boolean f310j;

    /* renamed from: a, reason: collision with other field name */
    private long f311a;

    /* renamed from: f, reason: collision with other field name */
    private int f312f;

    /* renamed from: g, reason: collision with other field name */
    private int f313g;

    /* renamed from: h, reason: collision with other field name */
    private int f314h;
    private boolean k;

    /* renamed from: d, reason: collision with other field name */
    private byte f315d;

    /* renamed from: b, reason: collision with other field name */
    private long f316b;
    private boolean l;

    /* renamed from: a, reason: collision with other field name */
    private String f317a;

    /* renamed from: a, reason: collision with other field name */
    private Thread f318a;

    /* renamed from: a, reason: collision with other field name */
    private Graphics f319a;

    /* renamed from: i, reason: collision with other field name */
    private int f320i;

    /* renamed from: a, reason: collision with other field name */
    private static short f288a = 0;

    /* renamed from: b, reason: collision with other field name */
    private static short f289b = -1;
    private static short c = -1;
    private static short d = -1;
    private static short e = -1;
    private static short f = -1;
    private static short g = -1;
    private static short h = -1;
    private static short i = -1;
    private static short j = -1;

    /* renamed from: a, reason: collision with other field name */
    private static Vector f306a = new Vector(10);

    /* renamed from: h, reason: collision with other field name */
    private static boolean f307h = false;

    /* renamed from: a, reason: collision with other field name */
    public static int f308a = 49;

    public m() {
        super(false);
        this.f282a = false;
        this.f283a = (byte) -1;
        this.f284a = new String[5];
        this.b = new String[5];
        this.f285a = new short[5];
        this.f294b = (byte) 0;
        this.f298a = new mobak.b.b.a.q[10];
        this.f300c = false;
        this.f301d = false;
        this.f302e = false;
        this.f303f = false;
        this.f304g = false;
        this.f310j = false;
        this.f314h = 0;
        this.k = false;
        this.f315d = (byte) 0;
        this.f316b = System.currentTimeMillis();
        this.l = false;
        this.f317a = "";
        this.f319a = null;
        if (f289b == -1) {
            f289b = mobak.c.a("bigclock.png");
        }
        if (c == -1) {
            c = mobak.c.a("bigclockfon.png");
        }
        setFullScreenMode(true);
        a = this;
        this.f295a = mobak.b.b.a.q.a();
        this.f296a = new o();
        this.f314h = 0;
        f290b = 0;
        f291c = 0;
        f292d = getWidth();
        f293e = getHeight();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x00ce. Please report as an issue. */
    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        byte m77e;
        j m174a;
        while (!Main2.f0a && this.f282a) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (Display.getDisplay(Main2.a).getCurrent() == this) {
                    try {
                        if (this.f314h != 0 && ((this.l && currentTimeMillis - this.f316b > 500) || (!this.l && currentTimeMillis - this.f316b > 200))) {
                            this.l = false;
                            keyPressed(this.f314h);
                        }
                    } catch (Exception e2) {
                        mobak.a.a.a(new StringBuffer("key repeat error: ").append(e2.getMessage()).toString());
                    }
                    System.currentTimeMillis();
                    if (this.f319a == null) {
                        this.f319a = getGraphics();
                    }
                    try {
                        this.f286b = false;
                        if (this.f310j && (m174a = m174a()) != null && !m189e()) {
                            int i3 = this.f312f;
                            int i4 = this.f313g;
                            i2 = (int) (System.currentTimeMillis() - this.f311a);
                            m174a.m169a(i3, i4, i2);
                        }
                        byte m173a = m173a();
                        try {
                            switch (m173a) {
                                case 1:
                                    if (this.f295a != null && this.f295a.c()) {
                                        this.f295a.b(this.f319a);
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (this.f296a != null && this.f295a.c()) {
                                        this.f296a.b(this.f319a);
                                        break;
                                    }
                                    break;
                                case 3:
                                    if (this.f297a != null && this.f295a.c()) {
                                        this.f297a.b(this.f319a);
                                        break;
                                    }
                                    break;
                                case 4:
                                    if (this.f283a >= 0 && this.f298a != null && this.f298a.length > this.f283a && this.f298a[this.f283a] != null && this.f298a[this.f283a].c()) {
                                        this.f298a[this.f283a].b(this.f319a);
                                    }
                                    break;
                            }
                        } catch (Exception e3) {
                            mobak.a.a.a(new StringBuffer("drawScreen: ").append(e3.getMessage()).append(" mode: ").append(m187a(m173a())).toString());
                        }
                        if (this.f303f && m177a() == null) {
                            if (!this.f300c) {
                                this.f300c = true;
                            }
                            if (this.f304g) {
                                if (d < 0) {
                                    d = mobak.c.a("logo.png");
                                }
                                this.f319a.setColor(3342336);
                                this.f319a.fillRect(0, 0, getWidth(), getHeight());
                                Graphics graphics = this.f319a;
                                Image a2 = mobak.c.a(d);
                                int width = getWidth() / 2;
                                i2 = getHeight() / 2;
                                a(graphics, a2, width, i2, 3);
                            } else {
                                a(this.f319a, mobak.c.a(c), 0, 0, mobak.c.a(c).getWidth(), mobak.c.a(c).getHeight(), 0, getWidth() / 2, getHeight() / 2, 3);
                                if (this.f294b >= 4) {
                                    this.f294b = (byte) 0;
                                }
                                Image a3 = mobak.c.a(f289b);
                                int width2 = a3.getWidth() / 4;
                                int height = a3.getHeight();
                                i2 = 0;
                                a(this.f319a, a3, width2 * this.f294b, 0, width2, height, 0, (getWidth() - width2) / 2, (getHeight() - height) / 2, 0);
                                this.f294b = (byte) (this.f294b + 1);
                            }
                            b(this.f319a);
                        }
                        if (!this.f301d) {
                            Graphics graphics2 = this.f319a;
                            switch (m173a) {
                                case 1:
                                    if (this.f295a == null) {
                                        if (mobak.b.a.b.a != null) {
                                            m77e = mobak.b.a.b.a.m77e();
                                            break;
                                        } else {
                                            m77e = 0;
                                            break;
                                        }
                                    } else {
                                        m77e = this.f295a.a();
                                        break;
                                    }
                                case 2:
                                    if (this.f296a == null) {
                                        if (mobak.b.a.b.a != null) {
                                            m77e = mobak.b.a.b.a.m77e();
                                            break;
                                        } else {
                                            m77e = 0;
                                            break;
                                        }
                                    } else {
                                        m77e = this.f296a.a();
                                        break;
                                    }
                                case 3:
                                    if (this.f297a == null) {
                                        if (mobak.b.a.b.a != null) {
                                            m77e = mobak.b.a.b.a.m77e();
                                            break;
                                        } else {
                                            m77e = 0;
                                            break;
                                        }
                                    } else {
                                        m77e = this.f297a.a();
                                        break;
                                    }
                                case 4:
                                    if (this.f283a >= 0 && this.f298a != null && this.f298a.length > this.f283a && this.f298a[this.f283a] != null) {
                                        m77e = this.f298a[this.f283a].a();
                                        break;
                                    } else if (mobak.b.a.b.a != null) {
                                        m77e = mobak.b.a.b.a.m77e();
                                        break;
                                    } else {
                                        m77e = 0;
                                        break;
                                    }
                                default:
                                    if (mobak.b.a.b.a != null) {
                                        m77e = mobak.b.a.b.a.m77e();
                                        break;
                                    } else {
                                        m77e = 0;
                                        break;
                                    }
                            }
                            byte b = m77e;
                            n m177a = m177a();
                            if (m177a != null) {
                                if (m177a.f323a == null) {
                                    n();
                                } else if (m177a.e > System.currentTimeMillis()) {
                                    if (m177a.f324a != null) {
                                        m177a.f324a.b();
                                    }
                                    n();
                                } else {
                                    int i5 = m177a.a;
                                    int i6 = m177a.b;
                                    int i7 = m177a.c;
                                    int i8 = m177a.d;
                                    graphics2.setColor(7368816);
                                    i2 = i7;
                                    graphics2.fillRect(i5, i6, i2, i8);
                                    if (m177a.f322a != null && m177a.f322a.length() > 0) {
                                        mobak.c.a aVar = m177a.f325a;
                                        String str = m177a.f322a;
                                        i2 = a.getWidth() / 2;
                                        aVar.a(graphics2, str, i2, 15 + 10, 3);
                                    }
                                    m177a.f323a.a(graphics2, (byte) 0);
                                    if (m177a.f321a == 3) {
                                        r.a(graphics2, b);
                                    } else {
                                        r.b(graphics2, b);
                                    }
                                }
                            }
                        }
                        if (!this.f286b) {
                            a(this.f319a);
                        }
                        if (f() && this.f305a != null) {
                            this.f305a.m207c();
                            mobak.a.a.f15a.a(this.f305a);
                            this.f305a.a(this.f319a, (byte) 0);
                        }
                        if (f307h) {
                            this.f317a = new Date(System.currentTimeMillis()).toString();
                            this.f317a = this.f317a.substring(this.f317a.indexOf(":") - 2);
                            this.f317a = this.f317a.substring(0, this.f317a.indexOf(" "));
                            this.f319a.setColor(0);
                            this.f319a.fillRect(8, (5 + j.f.f370a) - (j.f.f370a / 2), j.f.a(this.f317a) + 3, j.f.f370a);
                            mobak.c.a aVar2 = j.f;
                            Graphics graphics3 = this.f319a;
                            String str2 = this.f317a;
                            i2 = 10 + (j.f.a(this.f317a) / 2);
                            aVar2.a(graphics3, str2, i2, 5 + j.f.f370a, 3);
                        }
                        flushGraphics();
                    } catch (Error e4) {
                        mobak.a.a.a(new StringBuffer("drawScreen error: ").append(e4.toString()).toString());
                    } catch (Exception e5) {
                        mobak.a.a.a(new StringBuffer("drawScreen: ").append(e5.toString()).toString());
                    }
                    System.currentTimeMillis();
                    if (System.currentTimeMillis() - currentTimeMillis > 100) {
                        Thread.yield();
                    } else {
                        Thread.sleep(100L);
                    }
                }
            } catch (Error e6) {
                mobak.a.a.a(new StringBuffer("ScreenDrawer.run error: ").append(e6.getMessage()).toString());
            } catch (Exception e7) {
                mobak.a.a.a(new StringBuffer("ScreenDrawer.run ").append(e7.toString()).toString());
            }
        }
        (mobak.a.a == null ? new mobak.b() : mobak.a.a).onStopped();
        this.f282a = false;
    }

    public static void a() {
        if (Main2.a.m2a()) {
            Display.getDisplay(Main2.a).vibrate(500);
        }
    }

    public final void b() {
        if (this.f282a) {
            return;
        }
        Display.getDisplay(Main2.a).setCurrent(this);
        setFullScreenMode(true);
        this.f282a = true;
        this.f318a = new Thread(this, "ScreenDrawer");
        this.f318a.start();
    }

    public final void c() {
        this.f282a = false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final byte m173a() {
        return (byte) (this.f299c & 7);
    }

    private final byte e() {
        return (byte) (((byte) (this.f299c >> 4)) & 7);
    }

    private boolean f() {
        return ((byte) (this.f299c & 8)) != 0;
    }

    private static boolean a(boolean z, boolean z2, boolean z3) {
        n m177a = m177a();
        if ((m177a == null || !z) && !z2) {
            return false;
        }
        if (m177a.f324a == null) {
            if (!z) {
                return false;
            }
            n();
            return false;
        }
        if (z3 || z) {
            m177a.f324a.b();
        } else if (z3 || z2) {
            m177a.f324a.a();
        }
        n();
        return true;
    }

    protected final synchronized void keyPressed(int i2) {
        try {
            if (this.k) {
                if (this.f315d == 0) {
                    r.m128b(i2);
                    n();
                    a(mobak.c.d.a(139), new StringBuffer().append(mobak.c.d.a(140)).append(mobak.c.d.a(142)).toString());
                    this.f315d = (byte) 1;
                    return;
                }
                if (this.f315d == 1) {
                    r.c(i2);
                    n();
                    a(mobak.c.d.a(139), new StringBuffer().append(mobak.c.d.a(140)).append(mobak.c.d.a(260)).toString());
                    this.f315d = (byte) 2;
                    return;
                }
                if (this.f315d == 2) {
                    f308a = i2;
                    n();
                    a(mobak.c.d.a(139), mobak.c.d.a(143));
                    this.k = false;
                    r.m129b();
                    Main2.a.f5a.a((byte) 19, f308a);
                    return;
                }
            }
            if (!r.m127a(i2) && !r.b(i2) && getGameAction(i2) != 8 && this.f314h != i2) {
                this.f314h = i2;
                this.f316b = System.currentTimeMillis();
                this.l = true;
            }
            j m174a = m174a();
            if (i2 == f308a) {
                f307h = !f307h;
            }
            if (i2 == 48) {
                if (mobak.a.a.f15a == null) {
                    return;
                }
                if (f()) {
                    this.f305a = null;
                    this.f299c = (byte) (this.f299c & (-9));
                    return;
                } else {
                    this.f305a = new p((short) 0, (short) 0, (short) (getWidth() - 5), (short) (getHeight() - 5), true, false);
                    mobak.a.a.f15a.a(this.f305a);
                    this.f299c = (byte) (this.f299c | 8);
                    return;
                }
            }
            if (this.f303f && this.f300c && !this.f302e) {
                return;
            }
            n m177a = m177a();
            if (this.f301d || m177a == null) {
                if (this.f300c || m174a == null) {
                    return;
                }
                try {
                    m174a.d(i2);
                    return;
                } catch (Exception e2) {
                    mobak.a.a.a(new StringBuffer("screen.keyPressed ").append(e2.toString()).toString());
                    return;
                }
            }
            if (a(r.m127a(i2) || a.getGameAction(i2) == 8, r.b(i2), false)) {
                return;
            }
            if (getGameAction(i2) == 6) {
                m177a.f323a.b();
            } else if (getGameAction(i2) == 1) {
                m177a.f323a.a();
            }
        } catch (Exception e3) {
            mobak.a.a.a(new StringBuffer("keyPressedSD ").append(e3.toString()).toString());
        }
    }

    protected final void keyReleased(int i2) {
        this.f314h = 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final synchronized j m174a() {
        switch (m173a()) {
            case 1:
                return this.f295a;
            case 2:
                return this.f296a;
            case 3:
                return this.f297a;
            case 4:
                if (this.f283a >= 0) {
                    return this.f298a[this.f283a];
                }
                break;
        }
        this.f299c = (byte) 1;
        this.f295a = mobak.b.b.a.q.a();
        return this.f295a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final byte m175b() {
        return (byte) (getWidth() / 25);
    }

    /* renamed from: c, reason: collision with other method in class */
    public final byte m176c() {
        return (byte) (getHeight() / 25);
    }

    public static void a(String str, String str2) {
        a((byte) 1, str, str2, (mobak.c.h) null, -1);
    }

    public static void a(String str, String str2, mobak.c.h hVar) {
        a((byte) 1, str, str2, hVar, -1);
    }

    public static void a(String str, String str2, int i2) {
        a((byte) 1, str, str2, (mobak.c.h) null, i2);
    }

    public static void a(String str, String str2, mobak.c.h hVar, int i2) {
        a((byte) 1, str, str2, hVar, 15000);
    }

    public static void a(String str, String str2, String str3, mobak.c.h hVar) {
        if (str3 != null) {
            a((byte) 3, str, new StringBuffer().append(str2).append("\n").append(str3).toString(), hVar, -1);
        } else {
            a((byte) 3, str, str2, hVar, -1);
        }
    }

    private static void a(byte b, String str, String str2, mobak.c.h hVar, int i2) {
        if (str == null && str2 == null) {
            return;
        }
        f306a.addElement(new n(b, str, str2, hVar, i2));
    }

    private static void n() {
        if (!f306a.isEmpty()) {
            f306a.removeElementAt(0);
        }
        if (f306a.isEmpty() && a != null) {
            a.f302e = false;
        }
        a.f296a.a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b(), true);
    }

    public static void d() {
        while (!f306a.isEmpty()) {
            n();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static n m177a() {
        if (f306a.isEmpty()) {
            return null;
        }
        return (n) f306a.elementAt(0);
    }

    public final synchronized void a(mobak.b.b.a.f fVar, boolean z) {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f298a.length) {
                break;
            }
            this.f298a[b2] = null;
            b = (byte) (b2 + 1);
        }
        this.f283a = (byte) -1;
        j m174a = m174a();
        if (m174a != null) {
            m174a.mo144g();
        }
        System.gc();
        a((mobak.b.b.a.q) fVar, z);
    }

    public final synchronized void a(mobak.b.b.a.q qVar, boolean z) {
        if (qVar == null) {
            return;
        }
        this.f283a = (byte) (this.f283a + 1);
        if (this.f283a >= this.f298a.length) {
            mobak.b.b.a.q[] qVarArr = new mobak.b.b.a.q[(this.f298a.length * 3) / 2];
            System.arraycopy(this.f298a, 0, qVarArr, 0, this.f298a.length);
            this.f298a = qVarArr;
        }
        this.f298a[this.f283a] = qVar;
        if (!z || m173a() == 4) {
            if (this.f283a > 0) {
                qVar.a(this.f298a[this.f283a - 1]);
            }
            this.f298a[this.f283a].mo144g();
        } else {
            if (mobak.b.a.b.a != null) {
                qVar.c(mobak.b.a.b.a.m77e());
            }
            b((byte) 4);
        }
    }

    /* renamed from: e, reason: collision with other method in class */
    public final synchronized void m178e() {
        if (mobak.b.a.b.a != null) {
            if (this.f297a != null) {
                this.f297a.c(mobak.b.a.b.a.m77e());
            }
            if (this.f296a != null) {
                this.f296a.c(mobak.b.a.b.a.m77e());
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final mobak.b.b.a.q m179a() {
        if (this.f283a < 0) {
            return null;
        }
        return this.f298a[this.f283a];
    }

    private synchronized void b(byte b) {
        if (m173a() == 4) {
            return;
        }
        this.f299c = (byte) (this.f299c << 4);
        this.f299c = (byte) (this.f299c | 4);
        j m174a = m174a();
        if (m174a != null) {
            m174a.mo144g();
        }
        System.gc();
    }

    public final void a(byte b) {
        this.f299c = b;
        if (m173a() != 4) {
            this.f283a = (byte) -1;
            if (m173a() != 3) {
                byte b2 = 0;
                while (true) {
                    byte b3 = b2;
                    if (b3 >= this.f298a.length) {
                        break;
                    }
                    this.f298a[b3] = null;
                    b2 = (byte) (b3 + 1);
                }
            }
        }
        j m174a = m174a();
        if (m174a != null) {
            m174a.mo144g();
        }
    }

    /* renamed from: f, reason: collision with other method in class */
    public final void m180f() {
        byte m173a = m173a();
        byte e2 = e();
        if (e2 == 3 || e2 == 1 || e2 == 4 || e2 == 2) {
            this.f299c = (byte) (this.f299c >> 4);
            this.f299c = (byte) (this.f299c | ((byte) (m173a << 4)));
            j m174a = m174a();
            if (m174a != null) {
                m174a.mo144g();
            }
        }
    }

    public final synchronized void g() {
        this.f298a[this.f283a] = null;
        this.f283a = (byte) (this.f283a - 1);
        if (this.f283a >= 0 && this.f298a[this.f283a] != null) {
            this.f298a[this.f283a].mo144g();
        }
        if (this.f283a >= 0 || m173a() != 4) {
            return;
        }
        m180f();
    }

    private static void a(Graphics graphics, int i2, int i3, int i4, int i5, Image image, int i6, int i7, int i8, int i9, int i10) {
        short s;
        if (i5 == 0) {
            return;
        }
        a(graphics, image, i6, i7, i9, i8, 0, i2, i3, 0);
        int i11 = i2;
        int i12 = i9;
        while (true) {
            s = (short) (i11 + i12);
            if (s - i2 >= i4 || (i5 >= 0 && s - i2 >= i5 - i9)) {
                break;
            }
            a(graphics, image, i6 + i9, i7, i10, i8, 0, s, i3, 0);
            i11 = s;
            i12 = i10;
        }
        a(graphics, image, i6 + i9 + i10, i7, i9, i8, 0, s, i3, 0);
    }

    public static final void a(Graphics graphics, int i2, int i3, int i4, int i5, Image image, Image image2, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        a(graphics, i2, 0, i4, -1, image, 0, 0, i8, 6, 1);
        a(graphics, i2 + 2, 0, i4, (short) ((i4 * i5) / 100), image2, i11, 0, i13, 4, 1);
    }

    private void b(Graphics graphics) {
        if (f == -1) {
            f = mobak.c.a("progressbar_middle.png");
        }
        if (g == -1) {
            g = mobak.c.a("progressbar_right.png");
        }
        if (e == -1) {
            e = mobak.c.a("progressbar_left.png");
        }
        if (i == -1) {
            i = mobak.c.a("progressbar_position_middle.png");
        }
        if (h == -1) {
            h = mobak.c.a("progressbar_position_left.png");
        }
        if (j == -1) {
            j = mobak.c.a("progressbar_position_right.png");
        }
        a(graphics, mobak.c.a(e), 0, getHeight() - mobak.c.a(e).getHeight(), 0);
        a(graphics, mobak.c.a(g), getWidth() - mobak.c.a(g).getWidth(), getHeight() - mobak.c.a(g).getHeight(), 0);
        int width = mobak.c.a(e).getWidth();
        while (true) {
            short s = (short) width;
            if (s > getWidth() - mobak.c.a(g).getWidth()) {
                break;
            }
            a(graphics, mobak.c.a(f), s, getHeight() - mobak.c.a(f).getHeight(), 0);
            width = s + mobak.c.a(f).getWidth();
        }
        if (f288a <= 0) {
            return;
        }
        short width2 = (short) ((((short) (getWidth() - 40)) * f288a) / 100);
        a(graphics, mobak.c.a(h), 17 + (mobak.c.a(h).getWidth() / 2), (getHeight() - (mobak.c.a(e).getHeight() / 2)) - 1, 3);
        short s2 = 17;
        int width3 = mobak.c.a(h).getWidth();
        while (true) {
            short s3 = (short) (s2 + width3);
            if (s3 - 18 >= width2 - mobak.c.a(j).getWidth()) {
                a(graphics, mobak.c.a(j), s3 + (mobak.c.a(j).getWidth() / 2), (getHeight() - (mobak.c.a(g).getHeight() / 2)) - 1, 3);
                return;
            } else {
                a(graphics, mobak.c.a(i), s3 + (mobak.c.a(i).getWidth() / 2), (getHeight() - (mobak.c.a(f).getHeight() / 2)) - 1, 3);
                s2 = s3;
                width3 = mobak.c.a(i).getWidth();
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m181a() {
        return this.f303f;
    }

    public final void a(boolean z, boolean z2) {
        this.f304g = z;
        this.f300c = true;
        this.f294b = (byte) 0;
        f288a = (short) 0;
        this.f303f = true;
    }

    public static void a(short s) {
        f288a = s;
    }

    public final void a(boolean z) {
        this.f304g = false;
        this.f303f = false;
        this.f294b = (byte) 0;
        this.f300c = false;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final boolean m182b() {
        return this.f300c;
    }

    public final void b(boolean z) {
        this.f300c = z;
    }

    public final void h() {
        this.k = true;
        this.f315d = (byte) 0;
    }

    public final void i() {
        if (this.f318a == null) {
            return;
        }
        this.f282a = false;
        try {
            Thread.sleep(1000L);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("kill () ").append(e2.toString()).toString());
        }
        a = null;
    }

    public final void a(Graphics graphics) {
        if (this.f286b) {
            return;
        }
        this.f286b = true;
        if (f()) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.b.length) {
                return;
            }
            if (this.b[b2] != null) {
                short s = this.f285a[b2];
                int height = (a.getHeight() - r.a()) - (j.e.f370a * (b2 + 1));
                graphics.setColor(4605510);
                graphics.fillRect(0, height, a.getWidth(), j.e.f370a);
                graphics.setColor(8421504);
                graphics.drawLine(0, height, a.getWidth(), height);
                graphics.drawLine(0, height + j.e.f370a, a.getWidth(), height + j.e.f370a);
                if (this.f284a[b2] != null && !this.f284a[b2].trim().equals("")) {
                    j.e.a(graphics, new StringBuffer().append(this.f284a[b2].trim()).append(": ").toString(), s, height, 0);
                    s = (short) (s + j.e.a(new StringBuffer().append(this.f284a[b2].trim()).append(": ").toString()));
                }
                j.f259b.a(graphics, this.b[b2], s, height, 0);
                short a2 = (short) (s + j.f259b.a(this.b[b2]));
                short[] sArr = this.f285a;
                sArr[b2] = (short) (sArr[b2] - 2);
                if (this.f285a[b2] + a2 < 0) {
                    String[] strArr = this.b;
                    this.f284a[b2] = null;
                    strArr[b2] = null;
                    this.f285a[b2] = 0;
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    public final synchronized byte m183d() {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f284a.length) {
                return (byte) -1;
            }
            if (this.b[b2] == null) {
                return b2;
            }
            b = (byte) (b2 + 1);
        }
    }

    public final synchronized void b(String str, String str2) {
        byte m183d;
        if (str2 == null || str2.trim().equals("") || (m183d = m183d()) < 0) {
            return;
        }
        if (str.startsWith("\\id") && str.indexOf(" ") > 0) {
            str = str.substring(str.indexOf(" ") + 1);
        }
        this.f284a[m183d] = str;
        if (str2.startsWith("\\id") && str2.indexOf(" ") > 0) {
            str2 = str2.substring(str2.indexOf(" ") + 1);
        }
        this.b[m183d] = str2;
        this.f285a[m183d] = (short) a.getWidth();
    }

    /* renamed from: c, reason: collision with other method in class */
    public final boolean m184c() {
        return this.f304g;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final String m185a() {
        return m187a(m173a());
    }

    /* renamed from: b, reason: collision with other method in class */
    public final String m186b() {
        return m187a(e());
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m187a(byte b) {
        switch (b) {
            case 1:
                return "MainMenu";
            case 2:
                return "Strategical";
            case 3:
                return "Battle";
            case 4:
                return "MenuStack";
            default:
                return "undef";
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    public final boolean m188d() {
        return this.f301d;
    }

    public final void j() {
        this.f301d = true;
    }

    public final void k() {
        this.f301d = false;
    }

    public final void l() {
        this.f302e = true;
    }

    /* renamed from: e, reason: collision with other method in class */
    public final boolean m189e() {
        return (this.f301d || m177a() == null) ? false : true;
    }

    protected final void pointerDragged(int i2, int i3) {
        j m174a;
        n m177a = m177a();
        if (m177a != null) {
            int i4 = i3 - this.f320i;
            if (m177a.f323a.m213b()) {
                m177a.f323a.m212a(m177a.f323a.m211c() - i4);
                this.f320i = i3;
                return;
            }
            return;
        }
        if (this.f310j) {
            if ((this.f303f && this.f300c && !this.f302e) || (m174a = m174a()) == null) {
                return;
            }
            m174a.m168a(i2, i3);
        }
    }

    protected final void pointerPressed(int i2, int i3) {
        j m174a;
        this.f312f = i2;
        this.f313g = i3;
        this.f320i = i3;
        this.f311a = System.currentTimeMillis();
        this.f310j = true;
        n m177a = m177a();
        if (m177a != null && i3 < getHeight() - r.a()) {
            m177a.f323a.a(i2, i3);
            return;
        }
        this.f309i = false;
        if (this.f303f && this.f300c && !this.f302e) {
            return;
        }
        boolean a2 = r.a(i2, i3);
        boolean b = r.b(i2, i3);
        if (this.f301d || m177a == null) {
            if (this.f300c || (m174a = m174a()) == null) {
                return;
            }
            m174a.j();
            this.f309i = m174a.c(i2, i3);
            return;
        }
        if (a2) {
            m mVar = a;
            a(true, false, false);
            this.f309i = true;
        } else if (b) {
            m mVar2 = a;
            a(false, true, false);
            this.f309i = true;
        }
    }

    protected final void pointerReleased(int i2, int i3) {
        if (m177a() != null) {
            m177a().f323a.d();
            return;
        }
        this.f310j = false;
        if (this.f309i) {
            return;
        }
        if (this.f303f && this.f300c && !this.f302e) {
            return;
        }
        m174a().c(i2, i3, (int) (System.currentTimeMillis() - this.f311a));
    }

    public final void a(int i2) {
        keyPressed(getKeyCode(i2));
        getKeyCode(i2);
        this.f314h = 0;
    }

    public static final void a(Graphics graphics, int i2, int i3, int i4, int i5) {
        f290b = i2;
        f291c = i3;
        f292d = i4;
        f293e = i5;
        graphics.setClip(i2, i3, i4, i5);
    }

    public static final void b(Graphics graphics, int i2, int i3, int i4, int i5) {
        int i6 = i2;
        int i7 = i3;
        if (i2 < f290b) {
            i6 = f290b;
            i4 = (i2 + i4) - f290b;
        }
        if (i3 < f291c) {
            i7 = f291c;
            i5 = (i3 + i5) - f291c;
        }
        if (i6 + i4 > f290b + f292d) {
            i4 = (f290b + f292d) - i6;
        }
        if (i7 + i5 > f290b + f293e) {
            i5 = (f291c + f293e) - i7;
        }
        graphics.setClip(i6, i7, i4, i5);
    }

    public static final void a(Graphics graphics, Image image, int i2, int i3, int i4) {
        try {
            graphics.drawImage(image, i2, i3, i4);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("ScreenDrawer.drawImage(Graphics,Image,int,int) ").append(e2).toString());
        }
    }

    public static final void a(Graphics graphics, short s, int i2, int i3, int i4) {
        a(graphics, mobak.c.a(s), i2, i3, i4);
    }

    public static final void a(Graphics graphics, Image image, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (graphics == null || image == null) {
            return;
        }
        if (i9 == 0) {
            i9 = 20;
        }
        try {
            graphics.drawRegion(image, i2, i3, i4, i5, i6, i7, i8, i9);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("Graphics.drawRegion (Image, ").append(String.valueOf(i2)).append(", ").append(String.valueOf(i3)).append(", ").append(String.valueOf(i4)).append(", ").append(String.valueOf(i5)).append(", ").append(String.valueOf(i6)).append(", ").append(String.valueOf(i7)).append(", ").append(String.valueOf(i8)).append(", ").append(String.valueOf(i9)).append("): ").append(e2.toString()).toString());
        }
    }

    public static final void a(Graphics graphics, short s, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            Image a2 = mobak.c.a(s);
            int width = a2.getWidth() / i2;
            a(graphics, a2, width * i4, 0, width, a2.getHeight(), 0, i6, i7, 0);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("drawImage: ").append(e2.toString()).toString());
        }
    }

    public static final void a(Graphics graphics, short s, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            if ((i9 & 8) != 0) {
                i7 -= i4;
                i9 = (i9 & (-9)) | 4;
            }
            a(graphics, mobak.c.a(s), i2, 0, i4, i5, 0, i7, i8, i9);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("drawImageShort ").append(e2).toString());
        }
    }

    public static final void a(Graphics graphics, short s, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
        int width = mobak.c.a(s).getWidth();
        int height = mobak.c.a(s).getHeight();
        if (i4 > i6) {
            int i8 = i4;
            while (true) {
                int i9 = i8;
                if (i9 < i6) {
                    return;
                }
                a(graphics, s, 0, 0, width, height, 0, i9, 0, 24);
                i8 = i9 - width;
            }
        } else {
            int i10 = i4;
            while (true) {
                int i11 = i10;
                if (i11 > i6 + 2) {
                    return;
                }
                a(graphics, s, 0, 0, width, height, 0, i11, 0, 20);
                i10 = i11 + width;
            }
        }
    }

    public final void m() {
        Display.getDisplay(Main2.a).setCurrent(this);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static final int m190a(short s) {
        return mobak.c.a(s).getWidth();
    }

    public static final int b(short s) {
        return mobak.c.a(s).getHeight();
    }

    public final int getGameAction(int i2) {
        try {
            return super/*javax.microedition.lcdui.Canvas*/.getGameAction(i2);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("getGameAction ").append(e2.toString()).toString());
            return 999;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m191a(int i2) {
        return 8 == getGameAction(i2);
    }

    public final int getWidth() {
        return super/*javax.microedition.lcdui.Canvas*/.getWidth();
    }

    public final int getHeight() {
        return super/*javax.microedition.lcdui.Canvas*/.getHeight();
    }

    public static int a(Image image) {
        return image.getWidth();
    }

    public static int b(Image image) {
        return image.getHeight();
    }

    public static void a(Graphics graphics, int i2) {
        graphics.setColor(i2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static int m192a(Graphics graphics) {
        return graphics.getColor();
    }

    /* renamed from: b, reason: collision with other method in class */
    public static int m193b(Graphics graphics) {
        return graphics.getClipX();
    }

    public static int c(Graphics graphics) {
        return graphics.getClipY();
    }

    public static int d(Graphics graphics) {
        return graphics.getClipWidth();
    }

    public static int e(Graphics graphics) {
        return graphics.getClipHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static short m194a() {
        return (short) 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: collision with other method in class */
    public static short m195b() {
        return (short) 15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c, reason: collision with other method in class */
    public static short m196c() {
        return (short) (a.getWidth() - 20);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d, reason: collision with other method in class */
    public static short m197d() {
        return (short) (((a.getHeight() - r.a()) - 15) - 10);
    }
}
