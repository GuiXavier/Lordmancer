package mobak;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.midlet.MIDlet;
import mobak.a.a.l;
import mobak.b.b.a.r;
import mobak.b.b.m;

/* loaded from: LordmancerL.jar:mobak/Main2.class */
public class Main2 extends MIDlet implements mobak.c.b {
    public static Main2 a;

    /* renamed from: a, reason: collision with other field name */
    public static boolean f0a;

    /* renamed from: a, reason: collision with other field name */
    private byte f1a;
    private boolean b;

    /* renamed from: a, reason: collision with other field name */
    private String f2a;

    /* renamed from: b, reason: collision with other field name */
    private String f3b;

    /* renamed from: a, reason: collision with other field name */
    private i f4a;

    /* renamed from: a, reason: collision with other field name */
    public mobak.c.e f5a;

    /* renamed from: a, reason: collision with other field name */
    private g f6a;

    /* renamed from: a, reason: collision with other field name */
    private mobak.b.b.g f7a;

    /* renamed from: c, reason: collision with other field name */
    private String f9c;

    /* renamed from: b, reason: collision with other field name */
    private int f10b;
    private boolean c = true;
    private boolean d = true;

    /* renamed from: a, reason: collision with other field name */
    public Runnable f8a = null;

    /* renamed from: a, reason: collision with other field name */
    public int f11a = -1;

    public final void a() {
        if (this.b) {
            this.f5a.a((byte) 17, this.f2a);
            this.f5a.a((byte) 2, this.f3b);
            this.b = false;
        }
    }

    public final void a(byte b) {
        this.f6a = new g(this, b);
        new Thread(this.f6a).start();
    }

    public final void b(byte b) {
        if (mobak.a.a.f15a == null) {
            new mobak.a.a();
        }
        mobak.a.a.f15a.a(String.valueOf(this.f10b), this.f9c);
        if (m3a(mobak.b.a.b.a.b) == null) {
            m.a(mobak.c.d.a(29), mobak.c.d.a(170), "", new e(this));
        } else if (this.f6a == null || !g.a(this.f6a)) {
            a((byte) 1);
        } else {
            g.a(this.f6a, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v15, types: [mobak.b.b.g] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    public final void c(byte b) {
        this.f1a = b;
        ?? r0 = b;
        switch (r0) {
            case 1:
            case 2:
                if (m.a != null) {
                    m.a.m();
                    this.f7a = null;
                    return;
                }
                return;
            case 3:
                try {
                    this.f7a = new mobak.b.b.g(mobak.c.d.b(9), this);
                    String m3a = m3a(mobak.b.a.b.a.b);
                    if (m3a != null) {
                        this.f7a.a(mobak.c.d.a(11), m3a, 100, 0);
                    } else {
                        this.f7a.a(mobak.c.d.a(11), "", 100, 0);
                    }
                    this.f7a.a(mobak.c.d.a(10), this.f3b, 16, 0);
                    a(this.f7a);
                    r0 = this.f7a;
                    r0.m152a();
                    return;
                } catch (Exception e) {
                    mobak.a.a.a(r0.getMessage(), true);
                    return;
                }
            case 4:
                this.f7a = new mobak.b.b.g(mobak.c.d.b(9), this);
                this.f7a.a(mobak.c.d.a(16), this.f9c, 40, 0);
                this.f7a.a(mobak.c.d.a(17), String.valueOf(this.f10b), 10, 5);
                this.f7a.a(mobak.c.d.a(14), String.valueOf(mobak.a.a.f13b), 10, 5);
                this.f7a.a(mobak.c.d.a(13), String.valueOf(mobak.a.a.f12a), 10, 5);
                this.f7a.a(mobak.c.d.a(12), String.valueOf((int) mobak.a.a.m13a()), 10, 5);
                a(this.f7a);
                this.f7a.m152a();
                return;
            case 5:
            default:
                return;
            case 6:
                if (this.f11a != -1) {
                    this.f7a = new mobak.b.b.g(mobak.c.d.b(9), this);
                    this.f7a.a(mobak.c.d.a(79), "", 100, 0);
                    a(this.f7a);
                    this.f7a.m152a();
                    return;
                }
                return;
            case 7:
                this.f7a = new mobak.b.b.g(mobak.c.d.b(9), this);
                this.f7a.a(mobak.c.d.a(279), this.f4a != null ? this.f4a.a : "", 32, 0);
                this.f7a.a(mobak.c.d.a(289), this.f4a != null ? this.f4a.b : "", 32, 0);
                this.f7a.a(mobak.c.d.a(291), this.f4a != null ? this.f4a.c : "", 16, 0);
                this.f7a.a(mobak.c.d.a(280), this.f4a != null ? this.f4a.d : "", 32, 0);
                boolean[] zArr = new boolean[5];
                zArr[0] = false;
                zArr[1] = false;
                zArr[2] = false;
                zArr[3] = false;
                zArr[4] = false;
                if (this.f4a != null) {
                    zArr[this.f4a.f384a - 1] = true;
                } else {
                    zArr[0] = true;
                }
                this.f7a.a(mobak.c.d.b(281), 4, new String[]{mobak.c.d.b(19), mobak.c.d.b(20), mobak.c.d.b(21), mobak.c.d.b(22), mobak.c.d.b(23)}, zArr);
                this.f7a.a("", "");
                this.f7a.a(mobak.c.d.b(287), 0);
                this.f7a.a(mobak.c.d.b(34), 1);
                b(0);
                this.f7a.m152a();
                return;
            case 8:
                this.f7a = new mobak.b.b.g(mobak.c.d.b(9), this);
                this.f7a.a(mobak.c.d.b(118), 2, new String[]{mobak.c.d.b(249), mobak.c.d.b(297)}, new boolean[]{this.c, this.d});
                a(this.f7a);
                this.f7a.m152a();
                return;
        }
    }

    private void f() {
        switch (this.f1a) {
            case 2:
            case 7:
                break;
            case 3:
            case 4:
            case 8:
                c((byte) 2);
                return;
            case 5:
            default:
                return;
            case 6:
                this.f11a = -1;
                break;
        }
        c((byte) 1);
    }

    public final void b() {
        try {
            destroyApp(false);
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("exit () ").append(e.toString()).toString());
        }
    }

    public static void a(String str) {
        try {
            a.platformRequest(str);
        } catch (ConnectionNotFoundException unused) {
        }
    }

    private static String e() {
        String b = mobak.c.d.b(4);
        String str = b;
        if (b == null || str.trim().length() == 0) {
            str = "lordmancer.com";
        }
        return new StringBuffer("http://").append(str).toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public final String m0a() {
        String str;
        StringBuffer append = new StringBuffer().append(e()).append("?p=27").append("&");
        String m3a = m3a(mobak.b.a.b.a.b);
        if (this.f3b == null || this.f3b.equals("") || m3a == null) {
            str = "";
        } else {
            str = new StringBuffer("log=").append(m3a.startsWith("+") ? m3a.substring(1) : m3a).append("&pas=").append(this.f3b).toString();
        }
        return append.append(str).toString();
    }

    /* renamed from: b, reason: collision with other method in class */
    public final String m1b() {
        return new StringBuffer().append(e()).append("?ma=auction-type-lot&p=27").toString();
    }

    public final String c() {
        return new StringBuffer().append(e()).append("?p=28").toString();
    }

    public static String d() {
        return "1.27.0";
    }

    public final boolean a(short s) {
        short[] sArr;
        if (!this.c) {
            return false;
        }
        short[] m239a = this.f5a.m239a((byte) 14);
        short[] sArr2 = m239a == null ? null : m239a;
        boolean z = true;
        if (sArr2 != null) {
            short s2 = 0;
            while (true) {
                short s3 = s2;
                if (s3 >= sArr2.length) {
                    break;
                }
                if (sArr2[s3] == s) {
                    z = false;
                    break;
                }
                s2 = (short) (s3 + 1);
            }
        }
        if (z) {
            if (sArr2 == null) {
                sArr = new short[1];
            } else {
                short[] sArr3 = new short[sArr2.length + 1];
                System.arraycopy(sArr2, 0, sArr3, 0, sArr2.length);
                sArr = sArr3;
            }
            sArr[sArr.length - 1] = s;
            mobak.c.e eVar = this.f5a;
            short[] sArr4 = sArr;
            byte[] bArr = new byte[sArr4.length << 1];
            short s4 = 0;
            short s5 = 0;
            while (true) {
                short s6 = s5;
                if (s6 >= sArr4.length) {
                    break;
                }
                bArr[s4] = (byte) (sArr4[s6] >> 8);
                short s7 = (short) (s4 + 1);
                bArr[s7] = (byte) sArr4[s6];
                s4 = (short) (s7 + 1);
                s5 = (short) (s6 + 1);
            }
            eVar.a((byte) 14, bArr);
        }
        return z;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m2a() {
        return this.d;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m3a(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        String trim = str.trim();
        return (trim.indexOf(64) <= 0 || trim.lastIndexOf(46) <= trim.indexOf(64) || trim.length() <= 6) ? "" : trim;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m4a(String str) {
        return str != null && str.length() >= 4;
    }

    public static boolean b(String str) {
        return (!str.startsWith("+") || str.startsWith("+79") || str.startsWith("+375")) ? false : true;
    }

    @Override // mobak.c.b
    public final void a(int i) {
        String m150a;
        String m150a2;
        String m150a3;
        String m150a4;
        if (i == 1) {
            f();
            return;
        }
        switch (this.f1a) {
            case 3:
                if (this.f1a == 3) {
                    String m3a = m3a(this.f7a.m150a(0));
                    if (m3a == null) {
                        this.f7a.a(mobak.c.d.a(29), mobak.c.d.a(30), 4);
                        return;
                    }
                    mobak.b.a.b.a.b = m3a;
                    this.f5a.a((byte) 17, mobak.b.a.b.a.b);
                    this.f3b = this.f7a.m150a(1);
                    this.f5a.a((byte) 2, this.f3b);
                    f();
                    if (this.f8a != null) {
                        this.f8a.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (this.f1a == 4) {
                    this.f9c = this.f7a.m150a(0);
                    this.f10b = Integer.parseInt(this.f7a.m150a(1));
                    this.f5a.a((byte) 15, this.f10b);
                    this.f5a.a((byte) 16, this.f9c);
                    int parseInt = Integer.parseInt(this.f7a.m150a(2));
                    int i2 = parseInt;
                    if (parseInt <= 0) {
                        i2 = 1;
                    }
                    if (i2 > 7) {
                        i2 = 7;
                    }
                    mobak.a.a.f13b = i2;
                    int parseInt2 = Integer.parseInt(this.f7a.m150a(3));
                    int i3 = parseInt2;
                    if (parseInt2 < 10) {
                        i3 = 10;
                    }
                    if (i3 > 100) {
                        i3 = 100;
                    }
                    mobak.a.a.f12a = i3;
                    this.f5a.a((byte) 6, mobak.a.a.f13b);
                    this.f5a.a((byte) 5, mobak.a.a.f12a);
                    int parseInt3 = Integer.parseInt(this.f7a.m150a(4));
                    int i4 = parseInt3;
                    if (parseInt3 < 128) {
                        i4 = 128;
                    }
                    if (i4 > 2048) {
                        i4 = 2048;
                    }
                    mobak.a.a.m14a((short) i4);
                    mobak.c.e eVar = this.f5a;
                    short m13a = mobak.a.a.m13a();
                    eVar.a((byte) 7, new byte[]{(byte) (m13a >> 8), (byte) m13a});
                    f();
                    return;
                }
                return;
            case 5:
            default:
                return;
            case 6:
                String m150a5 = this.f7a.m150a(0);
                if (m150a5.equals("")) {
                    return;
                }
                l lVar = new l(mobak.a.a.b.f33a[31], (short) 50, (short) 0);
                try {
                    lVar.a(this.f11a);
                    lVar.a(m150a5);
                    mobak.a.a.f15a.a(lVar);
                } catch (Exception e) {
                    mobak.a.a.a(new StringBuffer("onButtonClick SEND_MESSAGE: ").append(e.toString()).toString());
                }
                f();
                return;
            case 7:
                try {
                    m150a = this.f7a.m150a(0);
                    m150a2 = this.f7a.m150a(1);
                    m150a3 = this.f7a.m150a(2);
                    m150a4 = this.f7a.m150a(3);
                } catch (Exception e2) {
                    mobak.a.a.a(new StringBuffer("onButtonClick REGISTRATION_SCREEN: ").append(e2.toString()).toString());
                }
                if (m150a == null || m150a.trim().equals("") || m150a3 == null || m150a3.trim().equals("") || m150a4 == null || m150a4.trim().equals("")) {
                    this.f7a.a(mobak.c.d.a(29), mobak.c.d.a(290), 4);
                    return;
                }
                String m3a2 = m3a(m150a2);
                if (m3a2 == null) {
                    this.f7a.a(mobak.c.d.a(29), mobak.c.d.a(30), 4);
                    return;
                }
                if (!m4a(m150a3)) {
                    this.f7a.a(mobak.c.d.a(29), mobak.c.d.a(293), 4);
                    return;
                }
                if (b(m3a2)) {
                    this.f7a.a(mobak.c.d.a(29), mobak.c.d.a(292), 4);
                    return;
                }
                this.f4a = new i(m150a, m3a2, m150a3, m150a4, (byte) (this.f7a.m151a(0) + 1));
                i iVar = this.f4a;
                if (mobak.a.a.f15a == null) {
                    new mobak.a.a();
                }
                mobak.a.a.f15a.a(String.valueOf(this.f10b), this.f9c);
                if (this.f6a == null || !g.a(this.f6a)) {
                    this.f6a = new g(this, iVar);
                    new Thread(this.f6a).start();
                }
                f();
                return;
            case 8:
                if (this.f1a == 8) {
                    this.c = this.f7a.a(0, 0);
                    if (this.c) {
                        this.f5a.a((byte) 18, (byte) 1);
                    } else {
                        this.f5a.a((byte) 18, (byte) 0);
                    }
                    this.d = this.f7a.a(0, 1);
                    if (this.d) {
                        this.f5a.a((byte) 22, (byte) 1);
                    } else {
                        this.f5a.a((byte) 22, (byte) 0);
                    }
                    f();
                    return;
                }
                return;
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    public static void m5c() {
        m.a(mobak.c.d.b(135), mobak.c.d.b(229), mobak.c.d.b(276), new f());
    }

    @Override // mobak.c.b
    /* renamed from: d, reason: collision with other method in class */
    public final void mo6d() {
    }

    @Override // mobak.c.b
    public final void b(int i) {
        if (this.f7a == null || this.f1a != 7) {
            return;
        }
        short[] sArr = {282, 283, 284, 285, 286};
        int m151a = this.f7a.m151a(0);
        if (m151a >= 0) {
            this.f7a.a(0, mobak.c.d.b(sArr[m151a]));
        }
    }

    private static final void a(mobak.b.b.g gVar) {
        gVar.a(mobak.c.d.b(8), 0);
        gVar.a(mobak.c.d.b(34), 1);
    }

    protected void destroyApp(boolean z) {
        if (m.a == null) {
            return;
        }
        m.a.b(false);
        if (m.a != null) {
            m.a.i();
        }
        if (mobak.a.a.f15a != null) {
            mobak.a.a.f15a.a(true);
            long currentTimeMillis = System.currentTimeMillis();
            while (mobak.a.a.f15a != null && mobak.a.a.f15a.m12c() && System.currentTimeMillis() - currentTimeMillis < 10000) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
            if (mobak.a.a.f15a != null && mobak.a.a.f15a.m12c()) {
                mobak.a.a.f15a.e();
            }
        }
        try {
            if (this.f5a != null) {
                mobak.c.e eVar = this.f5a;
                if (eVar.a != null) {
                    eVar.a.closeRecordStore();
                }
            }
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("destroyApp (boolean) ").append(e.toString()).toString());
        }
        notifyDestroyed();
        f0a = true;
    }

    protected void pauseApp() {
        if (m.a != null) {
            m.a.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v73, types: [int] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v80, types: [mobak.CanvasDrawerStoppedListener] */
    protected void startApp() {
        ?? length;
        try {
            f0a = false;
            a = this;
            if (m.a == null) {
                if (this.f5a == null) {
                    this.f5a = new mobak.c.e();
                }
                this.f10b = this.f5a.m236a((byte) 15, 20010);
                this.f9c = this.f5a.m238a((byte) 16, "lordmancer.com");
                this.c = this.f5a.m237a((byte) 18, (byte) 0) > 0;
                this.d = this.f5a.m237a((byte) 22, (byte) 1) > 0;
                mobak.a.a.f13b = this.f5a.m236a((byte) 6, 3);
                mobak.a.a.f12a = this.f5a.m236a((byte) 5, 30);
                mobak.a.a.m14a(this.f5a.a((byte) 7, (short) 1024));
                mobak.a.a.c = this.f5a.m236a((byte) 10, 60000);
                r.m130c();
                m.f308a = this.f5a.m236a((byte) 19, 49);
                String[] strArr = {"utf-8", "utf-16", "ISO8859_5", "ISO8859-5", "ISO-8859-5", "ISO_8859-5", "ISO_8859-5:1988", "ISO-IR-144", "8859_5", "Cyrillic", "CSISOLatinCyrillic", "IBM915", "IBM-915", "Cp915", "915", "Cp1251", "Windows-1251", "win1251", "Cp866", "IBM866", "IBM-866", "866", "CP866", "CSIBM866", "KOI8_R", "KOI8-R", "KOI8", "CSKOI8R", System.getProperty("microedition.encoding")};
                byte b = 0;
                while (true) {
                    if (b >= strArr.length) {
                        break;
                    }
                    try {
                        if (new String("абвгде".getBytes(strArr[b]), strArr[b]).equals("??????")) {
                            throw new UnsupportedEncodingException("");
                        }
                        mobak.a.a.f14a = strArr[b];
                    } catch (UnsupportedEncodingException unused) {
                        b = (byte) (b + 1);
                    }
                }
                if (mobak.b.a.b.a == null) {
                    mobak.b.a.b.a = new mobak.b.a.b(true);
                }
                mobak.b.a.b.a.f73a = this.f5a.m236a((byte) 1, -1);
                long a2 = this.f5a.a((byte) 13, -1L);
                mobak.b.a.b.a.b = this.f5a.m238a((byte) 17, "");
                if (mobak.b.a.b.a.b.equals("")) {
                    mobak.b.a.b.a.b = getAppProperty("login");
                    this.f5a.a((byte) 17, mobak.b.a.b.a.b);
                }
                if ((mobak.b.a.b.a.b == null || mobak.b.a.b.a.b.equals("")) && a2 > 0) {
                    mobak.b.a.b.a.b = String.valueOf(a2);
                }
                mobak.b.a.b.a.b = m3a(mobak.b.a.b.a.b);
                this.f3b = this.f5a.m238a((byte) 2, "");
                if (this.f3b == null || this.f3b.equals("")) {
                    this.f3b = getAppProperty("password");
                    this.f5a.a((byte) 2, this.f3b);
                }
                try {
                    if (mobak.b.b.j.a == null) {
                        mobak.b.b.j.a = new mobak.c.a((byte) 0, 9);
                    }
                    if (mobak.b.b.j.f259b == null) {
                        mobak.b.b.j.f259b = new mobak.c.a((byte) 0, 10);
                    }
                    if (mobak.b.b.j.c == null) {
                        mobak.b.b.j.c = new mobak.c.a((byte) 1, 10);
                    }
                    if (mobak.b.b.j.d == null) {
                        mobak.b.b.j.d = new mobak.c.a((byte) 1, 11);
                    }
                    if (mobak.b.b.j.e == null) {
                        mobak.b.b.j.e = new mobak.c.a((byte) 2, 10);
                    }
                    if (mobak.b.b.j.f == null) {
                        mobak.b.b.j.f = new mobak.c.a((byte) 0, 13);
                    }
                    if (mobak.b.b.j.g == null) {
                        mobak.b.b.j.g = new mobak.c.a((byte) 4, 10);
                    }
                    if (mobak.b.b.j.h == null) {
                        mobak.b.b.j.h = new mobak.c.a((byte) 3, 10);
                    }
                    if (mobak.b.b.j.i == null) {
                        mobak.b.b.j.i = new mobak.c.a((byte) 3, 10, true);
                    }
                } catch (Exception e) {
                    mobak.a.a.a(new StringBuffer("loadProp ").append(e.toString()).toString());
                }
                mobak.c.d.a(1);
                c.c();
                mobak.a.a.f15a = new mobak.a.a();
                try {
                    String property = System.getProperty("canvas_drawer_stopped_listener_class");
                    if (property != null && (length = property.trim().length()) > 0) {
                        try {
                            length = (CanvasDrawerStoppedListener) Class.forName(property).newInstance();
                            a.a = length;
                        } catch (ClassNotFoundException e2) {
                            length.printStackTrace();
                        } catch (IllegalAccessException e3) {
                            length.printStackTrace();
                        } catch (InstantiationException e4) {
                            length.printStackTrace();
                        }
                    }
                    m mVar = new m();
                    m.a = mVar;
                    mVar.a((byte) 1);
                } catch (Exception e5) {
                    mobak.a.a.a(new StringBuffer("Main2: ").append(e5.toString()).toString());
                }
            }
            m.a.b();
            mobak.b.b.j.f();
        } catch (Error unused2) {
            try {
                destroyApp(false);
            } catch (Exception e6) {
                mobak.a.a.a(new StringBuffer("exit des ").append(e6.toString()).toString());
            }
            notifyDestroyed();
        }
    }

    public final String a(String str, String str2) {
        try {
            String appProperty = getAppProperty(str);
            if (appProperty != null) {
                if (appProperty.length() != 0) {
                    return appProperty;
                }
            }
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    public static final byte[] a(InputStream inputStream) {
        int read;
        int available = inputStream.available();
        int i = available;
        if (available == 1) {
            i = 256;
        }
        byte[] bArr = new byte[i];
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int i2 = 0;
        while (true) {
            try {
                int available2 = inputStream.available();
                if (available2 <= 0 || (read = dataInputStream.read(bArr, i2, Math.min(available2, bArr.length - i2))) <= 0) {
                    break;
                }
                int i3 = i2 + read;
                i2 = i3;
                if (i3 >= bArr.length && inputStream.available() > 0) {
                    bArr = a(bArr, bArr.length << 1);
                }
            } catch (IOException e) {
                mobak.a.a.a(new StringBuffer("readBinaryStreamContent () ").append(e.toString()).toString());
                bArr = null;
            }
        }
        if (i2 < bArr.length) {
            bArr = a(bArr, i2);
        }
        return bArr;
    }

    private static final byte[] a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        return bArr2;
    }

    public static String[] a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
        return strArr2;
    }

    public static int[] a(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, Math.min(iArr.length, i));
        return iArr2;
    }

    /* renamed from: e, reason: collision with other method in class */
    public final void m7e() {
        mobak.b.a.b.a.b = "";
        this.f2a = "";
        this.f3b = "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Main2 main2, boolean z) {
        main2.b = z;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Main2 main2) {
        return main2.f3b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Main2 main2) {
        return e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g a(Main2 main2, g gVar) {
        main2.f6a = null;
        return null;
    }
}
