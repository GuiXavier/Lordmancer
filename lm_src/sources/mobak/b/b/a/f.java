package mobak.b.b.a;

import java.util.Random;
import javax.microedition.lcdui.Graphics;
import mobak.Main2;

/* loaded from: LordmancerL.jar:mobak/b/b/a/f.class */
public final class f extends q {
    private static final String[] a = {mobak.c.d.a(304), mobak.c.d.a(303)};
    private static final String[] b = {mobak.c.d.a(2), mobak.c.d.a(3), mobak.c.d.a(204)};

    /* renamed from: a, reason: collision with other field name */
    private static final int[] f163a = {3552822, 15193403, 367891, 4549088, 6571791, 15924219, 12960724, 3916878};
    private static String c = "locationAncer";

    /* renamed from: c, reason: collision with other field name */
    protected byte f164c;

    /* renamed from: a, reason: collision with other field name */
    String[][] f166a;

    /* renamed from: a, reason: collision with other field name */
    short[] f167a;
    private mobak.c.a j;

    /* renamed from: a, reason: collision with other field name */
    private long[] f168a;
    private boolean i;

    /* renamed from: a, reason: collision with other field name */
    private long f172a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f165a = false;
    protected byte d = -1;
    protected byte e = -1;
    private byte f = 0;
    private byte g = 0;

    /* renamed from: d, reason: collision with other field name */
    private boolean f169d = false;

    /* renamed from: f, reason: collision with other field name */
    private boolean f170f = false;

    /* renamed from: g, reason: collision with other field name */
    private boolean f171g = false;
    private boolean h = false;

    public f(short s) {
        String str = mobak.b.b.j.f265a;
        ((mobak.b.b.j) this).f278a = s;
        this.j = mobak.b.b.j.f;
        ((mobak.b.b.j) this).f281b = (byte) (Math.abs(new Random().nextInt()) % 5);
    }

    @Override // mobak.b.b.j
    protected final void c(int i) {
        int gameAction = mobak.b.b.m.a.getGameAction(i);
        if (this.f164c == 5) {
            synchronized (c) {
                if (gameAction == 6) {
                    if (this.h) {
                        this.g = (byte) (this.g + 1);
                    }
                    return;
                }
                if (gameAction == 1) {
                    if (this.f171g) {
                        this.g = (byte) (this.g - 1);
                    }
                    return;
                } else if (gameAction == 2) {
                    if (this.f169d) {
                        this.f = (byte) (this.f - 1);
                    }
                    return;
                } else {
                    if (gameAction == 5) {
                        if (this.f170f) {
                            this.f = (byte) (this.f + 1);
                        }
                        return;
                    }
                    return;
                }
            }
        }
        if (gameAction == 6) {
            if (this.e < this.f166a[this.d].length - 1) {
                this.e = (byte) (this.e + 1);
            } else {
                this.e = (byte) 0;
            }
        } else if (gameAction == 1) {
            if (this.e > 0) {
                this.e = (byte) (this.e - 1);
            } else {
                this.e = (byte) (this.f166a[this.d].length - 1);
            }
        }
        int m112b = m112b();
        int height = (((mobak.b.b.m.a.getHeight() - b()) - r.a()) - (this.j.f370a + 3)) / (this.j.f370a + 3);
        if (this.e < ((q) this).f191f) {
            ((q) this).f191f = this.e;
        }
        if (this.e > ((q) this).f191f + height) {
            ((q) this).f191f = this.e - height;
        }
        if (((q) this).f191f < 0) {
            ((q) this).f191f = 0;
        }
        if (height < m112b && ((q) this).f191f + height > m112b) {
            ((q) this).f191f = m112b - height;
        }
        if (gameAction == 8) {
            try {
                n();
            } catch (Exception e) {
                mobak.a.a.a(new StringBuffer().append(e).toString());
            }
        }
    }

    private short b() {
        switch (this.f164c) {
            case 1:
            case 4:
                return (short) (((mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(mobak.c.a(q.i))) / 2) + 42);
            default:
                return mo90a();
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    private int m112b() {
        String[] strArr = this.f166a != null ? this.f166a[this.d] : null;
        String[] strArr2 = strArr;
        if (strArr != null) {
            return strArr2.length;
        }
        return 0;
    }

    public static String[] a() {
        String m238a = Main2.a.f5a.m238a((byte) 17, (String) null);
        String m238a2 = Main2.a.f5a.m238a((byte) 2, (String) null);
        return ((m238a == null || m238a.equals("")) && (m238a2 == null || m238a2.equals(""))) ? a : b;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x00eb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0506 A[Catch: Exception -> 0x059d, TryCatch #0 {Exception -> 0x059d, blocks: (B:2:0x0000, B:4:0x0036, B:6:0x003e, B:7:0x00e7, B:8:0x00eb, B:9:0x010c, B:11:0x0113, B:13:0x011a, B:15:0x0121, B:17:0x012d, B:18:0x04ff, B:20:0x0506, B:21:0x050e, B:23:0x0516, B:25:0x0591, B:32:0x0152, B:33:0x01c5, B:35:0x01c6, B:38:0x01cf, B:40:0x01d7, B:42:0x0202, B:43:0x0207, B:45:0x0217, B:46:0x021c, B:48:0x0225, B:49:0x022a, B:51:0x023a, B:52:0x023f, B:56:0x0271, B:58:0x02ab, B:62:0x02b5, B:64:0x02bb, B:65:0x0300, B:68:0x0309, B:70:0x0311, B:72:0x031c, B:74:0x0324, B:76:0x032d, B:79:0x0374, B:81:0x037d, B:83:0x038f, B:85:0x0398, B:86:0x03a7, B:88:0x03a1, B:89:0x0386, B:78:0x03e1, B:93:0x03eb, B:95:0x03fe, B:96:0x041d, B:98:0x0424, B:99:0x0444, B:101:0x044b, B:102:0x0479, B:104:0x0480, B:106:0x04b7, B:111:0x04be, B:113:0x04c0, B:115:0x04c4, B:117:0x04cb, B:119:0x04d2, B:121:0x04d9, B:123:0x04e5, B:124:0x0046, B:130:0x0090, B:132:0x00b5, B:134:0x00bf), top: B:1:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0516 A[Catch: Exception -> 0x059d, TryCatch #0 {Exception -> 0x059d, blocks: (B:2:0x0000, B:4:0x0036, B:6:0x003e, B:7:0x00e7, B:8:0x00eb, B:9:0x010c, B:11:0x0113, B:13:0x011a, B:15:0x0121, B:17:0x012d, B:18:0x04ff, B:20:0x0506, B:21:0x050e, B:23:0x0516, B:25:0x0591, B:32:0x0152, B:33:0x01c5, B:35:0x01c6, B:38:0x01cf, B:40:0x01d7, B:42:0x0202, B:43:0x0207, B:45:0x0217, B:46:0x021c, B:48:0x0225, B:49:0x022a, B:51:0x023a, B:52:0x023f, B:56:0x0271, B:58:0x02ab, B:62:0x02b5, B:64:0x02bb, B:65:0x0300, B:68:0x0309, B:70:0x0311, B:72:0x031c, B:74:0x0324, B:76:0x032d, B:79:0x0374, B:81:0x037d, B:83:0x038f, B:85:0x0398, B:86:0x03a7, B:88:0x03a1, B:89:0x0386, B:78:0x03e1, B:93:0x03eb, B:95:0x03fe, B:96:0x041d, B:98:0x0424, B:99:0x0444, B:101:0x044b, B:102:0x0479, B:104:0x0480, B:106:0x04b7, B:111:0x04be, B:113:0x04c0, B:115:0x04c4, B:117:0x04cb, B:119:0x04d2, B:121:0x04d9, B:123:0x04e5, B:124:0x0046, B:130:0x0090, B:132:0x00b5, B:134:0x00bf), top: B:1:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // mobak.b.b.a.q, mobak.b.b.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(javax.microedition.lcdui.Graphics r12) {
        /*
            Method dump skipped, instructions count: 1461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mobak.b.b.a.f.a(javax.microedition.lcdui.Graphics):void");
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final boolean a(s sVar) {
        switch ((byte) sVar.a) {
            case 55:
                switch (this.f164c) {
                    case 2:
                        if (!mobak.b.a.b.a.m58a()) {
                            mobak.b.b.m.a(new StringBuffer().append(mobak.c.d.a(164)).append("!").toString(), mobak.c.d.a(165));
                            return true;
                        }
                        if (!mobak.c.m221a()) {
                            mobak.b.b.m.a(mobak.c.d.a(36), mobak.c.d.a(37));
                            return true;
                        }
                        try {
                            mobak.a.a.f15a.a(new mobak.a.a.l(mobak.a.a.b.f33a[28], (short) 0, (short) 0));
                            return true;
                        } catch (Exception e) {
                            mobak.a.a.a(new StringBuffer("executePopupMenuAction").append(e.toString()).toString());
                            return true;
                        }
                    case 3:
                        mobak.a.a.f15a.a(new mobak.a.a.l(mobak.a.a.b.f33a[15], (short) 0, (short) 0));
                        mobak.b.b.m.a.a((byte) 2);
                        mobak.b.b.m.a.f296a.a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b(), true);
                        mobak.b.b.m.a.f296a.m199b();
                        return true;
                    default:
                        mobak.b.b.m.a.a((byte) 2);
                        mobak.b.b.m.a.f296a.a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b(), true);
                        return true;
                }
            default:
                return super.a(sVar);
        }
    }

    @Override // mobak.b.b.j
    protected final boolean d() {
        return !((mobak.b.b.j) this).f271a.m124a();
    }

    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.String[], java.lang.String[][]] */
    @Override // mobak.b.b.j
    public final void n() {
        switch (this.f164c) {
            case 1:
                if (this.f165a) {
                    switch (this.e) {
                        case 0:
                            mobak.b.b.m.a.m180f();
                            return;
                        case 1:
                            mobak.a.a.f15a.a(new mobak.a.a.l(mobak.a.a.b.f33a[24], (short) 0, (short) 0));
                            Main2.a.b();
                            return;
                        default:
                            return;
                    }
                }
                byte b2 = this.e;
                boolean z = this.f166a[0] == b;
                switch (b2) {
                    case 0:
                        Main2.a.b((byte) 1);
                        this.f164c = (byte) 1;
                        this.e = (byte) 0;
                        return;
                    case 1:
                        if (z) {
                            String[][] strArr = new String[1][6];
                            strArr[0][0] = mobak.c.d.a(6);
                            strArr[0][1] = mobak.c.d.a(5);
                            strArr[0][4] = mobak.c.d.a(121);
                            strArr[0][3] = mobak.c.d.a(138);
                            strArr[0][2] = mobak.c.d.a(296);
                            strArr[0][5] = mobak.c.d.a(34);
                            this.f166a = strArr;
                            this.f164c = (byte) 4;
                        } else {
                            Main2.a.f8a = new g(this);
                            Main2.a.c((byte) 3);
                        }
                        this.e = (byte) 0;
                        return;
                    case 2:
                        if (z) {
                            Main2 main2 = Main2.a;
                            Main2.a(Main2.a.m0a());
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 2:
                if (this.e < this.f166a[0].length - 1) {
                    mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[8], (short) 8, mobak.a.a.b.f33a[7]);
                    lVar.a((int) this.f167a[this.e]);
                    lVar.a(mobak.b.a.b.a.f73a);
                    mobak.a.a.f15a.a(lVar);
                    return;
                }
                if (!mobak.b.a.b.a.m58a()) {
                    mobak.b.b.m.a(new StringBuffer().append(mobak.c.d.a(164)).append("!").toString(), mobak.c.d.a(165));
                    return;
                }
                if (!mobak.c.m221a()) {
                    mobak.b.b.m.a(mobak.c.d.a(36), mobak.c.d.a(37));
                    return;
                }
                try {
                    mobak.b.b.i iVar = new mobak.b.b.i();
                    iVar.m163d();
                    iVar.m154a((byte) 4);
                    iVar.a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b(), true);
                    mobak.c.m225a(iVar.m158a(), iVar.b());
                    mobak.b.a.b.a.a(iVar.m158a(), iVar.b());
                    mobak.a.a.f15a.a(new mobak.a.a.l(mobak.a.a.b.f33a[28], (short) 0, (short) 0));
                } catch (Exception e) {
                    mobak.a.a.a(new StringBuffer("cityentry ").append(e.toString()).toString());
                }
                mobak.b.b.m.a.a((byte) 2);
                mobak.b.b.m.a.f296a.a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b(), true);
                mobak.b.b.m.a.f296a.m199b();
                return;
            case 3:
                if (this.d == 0) {
                    if (this.e == this.f166a[0].length - 1) {
                        mobak.a.a.f15a.a(new mobak.a.a.l(mobak.a.a.b.f33a[30], (short) 0, mobak.a.a.b.f33a[10]));
                        return;
                    } else {
                        this.d = (byte) 1;
                        return;
                    }
                }
                if (this.e == this.f166a[1].length - 1) {
                    this.d = (byte) 0;
                    return;
                }
                if (mobak.b.a.b.a.m63a(((q) this).f192e) >= this.f168a[this.e]) {
                    mobak.b.b.m.a(mobak.c.d.a(135), mobak.c.d.a(206, new String[]{this.f166a[1][this.e], String.valueOf(this.f168a[this.e])}), new StringBuffer().append(mobak.c.d.a(41)).append("?").toString(), new h(this));
                    return;
                } else if (((q) this).f192e) {
                    Main2.m5c();
                    return;
                } else {
                    mobak.b.b.m.a(mobak.c.d.a(135), mobak.c.d.a(205));
                    return;
                }
            case 4:
                switch (this.e) {
                    case 0:
                        Main2.a.c((byte) 3);
                        return;
                    case 1:
                        Main2.a.c((byte) 4);
                        return;
                    case 2:
                        Main2.a.c((byte) 8);
                        return;
                    case 3:
                        mobak.b.b.m.a.h();
                        mobak.b.b.m.a(mobak.c.d.a(139), new StringBuffer().append(mobak.c.d.a(140)).append(mobak.c.d.a(141)).toString());
                        return;
                    case 4:
                        Main2.a.f5a.a();
                        Main2.a.m7e();
                        mobak.b.b.m.a("", mobak.c.d.a(305));
                        return;
                    case 5:
                        this.f166a = new String[]{a()};
                        this.f164c = (byte) 1;
                        this.e = (byte) 0;
                        return;
                    default:
                        return;
                }
            default:
                return;
        }
    }

    @Override // mobak.b.b.j
    /* renamed from: a */
    public final void mo90a() {
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.f164c) {
            case 1:
                stringBuffer.append("screen: MainMenu\n");
                break;
            case 2:
                stringBuffer.append("screen: City\n");
                stringBuffer.append("name: ").append(((q) this).f190b).append("\n");
                break;
            case 3:
                stringBuffer.append("screen: Teleport\n");
                break;
            case 5:
                stringBuffer.append("screen: LocationMap\n");
                break;
        }
        if (mobak.b.b.m.a.m174a() == this) {
            stringBuffer.append("state: active");
        } else {
            stringBuffer.append("status: passive");
        }
        return stringBuffer.toString();
    }

    private static void a(String str, Graphics graphics, short s, short s2) {
        if (graphics == null || str == null || str.equals("")) {
            return;
        }
        mobak.b.b.m.a(graphics, 0);
        short a2 = (short) (mobak.b.b.j.a.a(str) + 2);
        if (mobak.b.b.m.m193b(graphics) + mobak.b.b.m.d(graphics) < s + a2) {
            s = (short) (((mobak.b.b.m.m193b(graphics) + mobak.b.b.m.d(graphics)) - a2) - 3);
        }
        graphics.fillRect(s, s2, a2, mobak.b.b.j.a.f370a);
        mobak.b.b.j.a.a(graphics, str, s + 1, s2, 0);
    }

    private short a(short s) {
        return (short) (((s - this.f) * 3) + ((mobak.b.b.m.a.getWidth() - 150) / 2));
    }

    private short b(short s) {
        return (short) (((s - this.g) * 3) + mo90a() + 16 + (((((mobak.b.b.m.a.getHeight() - mo90a()) - 32) - r.a()) - 150) / 2));
    }

    public final void a(short[] sArr) {
        this.f167a = sArr;
    }

    public final void a(byte b2) {
        this.d = (byte) 0;
    }

    public final void a(String[][] strArr) {
        this.f166a = strArr;
    }

    public final void a(long[] jArr) {
        this.f168a = jArr;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String[], java.lang.String[][]] */
    /* renamed from: b, reason: collision with other method in class */
    public final void m113b() {
        this.f166a = new String[]{new String[]{mobak.c.d.a(34), mobak.c.d.a(1)}, new String[0]};
        this.f165a = true;
    }

    public final void b(byte b2) {
        this.e = (byte) 0;
    }

    public final void e(byte b2) {
        this.f164c = b2;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean a(int i, int i2) {
        mobak.b.b.j.f264c = true;
        mobak.b.b.j.f260a = i;
        mobak.b.b.j.f261b = i2;
        mobak.b.b.j.f262c = i;
        mobak.b.b.j.f263d = i2;
        this.f172a = System.currentTimeMillis();
        this.i = false;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [mobak.b.b.a.f] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v15 */
    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean b(int i, int i2, int i3) {
        int m112b;
        byte a2;
        if (!mobak.b.b.j.f264c || (m112b = m112b()) <= 0 || (a2 = a(this.j, m112b(), b(), i2)) < 0 || a2 >= m112b) {
            return false;
        }
        ?? r0 = this;
        r0.e = a2;
        try {
            n();
            r0 = 1;
            return true;
        } catch (Exception e) {
            mobak.a.a.a(r0.getMessage());
            return false;
        }
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean a(int i, int i2, int i3) {
        if (System.currentTimeMillis() - this.f172a <= 200 || !mobak.b.b.j.f264c || this.i) {
            return false;
        }
        this.i = true;
        byte a2 = a(this.j, m112b(), b(), i2);
        if (a2 < 0 || a2 >= m112b()) {
            return false;
        }
        this.e = a2;
        return false;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    /* renamed from: b */
    protected final boolean mo108b(int i, int i2) {
        int i3;
        if (Math.abs(mobak.b.b.j.f262c - mobak.b.b.j.f260a) > 10 || Math.abs(mobak.b.b.j.f263d - mobak.b.b.j.f261b) > 10) {
            mobak.b.b.j.f264c = false;
        }
        if (this.i) {
            byte a2 = a(this.j, m112b(), b(), i2);
            if (a2 >= 0 && a2 < m112b()) {
                this.e = a2;
            }
        } else if (m112b() > 0 && (i3 = (mobak.b.b.j.f263d - i2) / (this.j.f370a + 3)) != 0) {
            int height = ((mobak.b.b.m.a.getHeight() - b()) - r.a()) / (this.j.f370a + 3);
            if (height < m112b()) {
                ((q) this).f191f += i3;
            }
            if (((q) this).f191f < 0) {
                ((q) this).f191f = 0;
            }
            if (height < m112b() && ((q) this).f191f + height > m112b()) {
                ((q) this).f191f = m112b() - height;
            }
            mobak.b.b.j.f263d = i2;
        }
        mobak.b.b.j.f262c = i;
        return false;
    }
}
