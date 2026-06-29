package mobak.b.b.a;

import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/a/q.class */
public abstract class q extends mobak.b.b.j implements mobak.c.b {
    public static short b = -1;
    protected static short c = -1;
    protected static short d = -1;
    protected static short e = -1;
    protected static short f = -1;
    private static short j = -1;
    private static short k = -1;
    protected static short g = -1;
    protected static short h = -1;
    private static short l = -1;
    private static short m = -1;
    private static short n = -1;
    private static short o = -1;
    private static short p = -1;
    private static short q = -1;
    protected static short i = -1;

    /* renamed from: b, reason: collision with other field name */
    protected String f190b;

    /* renamed from: f, reason: collision with other field name */
    protected int f191f;
    private Short a;

    /* renamed from: e, reason: collision with other field name */
    protected boolean f192e;

    public final void c(boolean z) {
        this.f192e = z;
    }

    @Override // mobak.b.b.j
    public boolean a(s sVar) {
        switch ((byte) sVar.a) {
            case 55:
                if (mobak.b.b.m.a.m182b() && !mobak.a.a.f15a.m11b()) {
                    mobak.b.b.m.a.b(false);
                }
                mobak.b.b.m.a.g();
                mobak.b.b.m.a.m174a().mo144g();
                return true;
            default:
                return super.a(sVar);
        }
    }

    @Override // mobak.b.b.j
    protected boolean a(int i2, int i3) {
        return false;
    }

    @Override // mobak.b.b.j
    protected boolean b(int i2, int i3, int i4) {
        return false;
    }

    @Override // mobak.b.b.j
    protected boolean a(int i2, int i3, int i4) {
        return false;
    }

    @Override // mobak.b.b.j
    /* renamed from: b */
    protected boolean mo108b(int i2, int i3) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: collision with other method in class */
    public static int m116a(int i2, int i3) {
        int i4 = ((i2 - 300) / 1000) + 1;
        int i5 = i4;
        if (i4 < 0) {
            i5 = 0;
        }
        return i5;
    }

    public void a(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q() {
        String str = mobak.b.b.j.f265a;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String[], java.lang.String[][]] */
    public static f a() {
        try {
            if (b == -1) {
                b = mobak.c.a("icons-of-races.png");
            }
            if (c == -1) {
                c = mobak.c.a("arrow_top.png");
            }
            if (d == -1) {
                d = mobak.c.a("arrow_bottom.png");
            }
            if (e == -1) {
                e = mobak.c.a("arrow_left.png");
            }
            if (f == -1) {
                f = mobak.c.a("arrow_right.png");
            }
            if (j == -1) {
                j = mobak.c.a("red_indicator.png");
            }
            if (k == -1) {
                k = mobak.c.a("green_indicator.png");
            }
            if (g == -1) {
                g = mobak.c.a("equipment.png");
            }
            if (h == -1) {
                h = mobak.c.a("background.png");
            }
            l = mobak.c.a("select.png");
            m = mobak.c.a("top-1.png");
            n = mobak.c.a("top-2.png");
            o = mobak.c.a("top-3.png");
            p = mobak.c.a("money.png");
            q = mobak.c.a("crystal.png");
            i = mobak.c.a("mainmenu.png");
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("initMainMenu").append(e2.toString()).toString());
        }
        f fVar = new f((short) -103);
        ((q) fVar).f190b = null;
        fVar.f166a = new String[]{f.a()};
        fVar.f167a = null;
        fVar.d = (byte) 0;
        fVar.e = (byte) 0;
        fVar.f164c = (byte) 1;
        return fVar;
    }

    public static final void a(Graphics graphics, int i2, int i3, int i4) {
        int i5 = 5316104;
        if (i4 == 1) {
            i5 = 16773632;
        } else if (i4 == 2) {
            i5 = 255;
        }
        mobak.b.b.m.a(graphics, i5);
        graphics.drawRect(i2, i3, 29, 27);
        if (i4 != 0) {
            graphics.drawRect(i2 + 1, i3 + 1, 27, 25);
        }
    }

    public static final f b() {
        f fVar = new f((short) -105);
        ((q) fVar).f190b = mobak.c.d.a(38);
        ((mobak.b.b.j) fVar).f271a = new r(null, new byte[]{55}, null);
        fVar.f164c = (byte) 5;
        return fVar;
    }

    public static j a(short s) {
        j jVar = null;
        switch (s) {
            case -12:
            case -2:
            case -1:
                jVar = new c(s);
                break;
            case -4:
            case -3:
                jVar = new a(s);
                break;
        }
        return jVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static j m117a() {
        z zVar = new z((short) -5);
        ((j) zVar).d = (byte) 0;
        return zVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static j m118a(String str) {
        z zVar = new z((short) -7);
        zVar.d(str);
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.j
    /* renamed from: a */
    public final short mo90a() {
        if (this.a == null) {
            this.a = new Short((short) (mobak.b.b.m.b(n) + 3));
        }
        return this.a.shortValue();
    }

    @Override // mobak.b.b.j
    public void a(Graphics graphics) {
        try {
            mobak.b.b.m.b(graphics, 0, 0, (short) mobak.b.b.m.a.getWidth(), (short) mobak.b.b.m.a.getHeight());
            mobak.b.b.m.a(graphics, 10449478);
            graphics.fillRect(0, 0, mobak.b.b.m.a.getWidth(), mobak.b.b.m.a.getHeight());
            mobak.b.b.m.a(graphics, m, 0, 0, 0);
            mobak.b.b.m.a(graphics, n, 1, 0, mobak.b.b.m.m190a(m), 0, mobak.b.b.m.a.getWidth() - mobak.b.b.m.m190a(o), true, 0);
            mobak.b.b.m.a(graphics, o, mobak.b.b.m.a.getWidth(), 0, 24);
            mobak.b.b.m.a(graphics, q, 5, 2, 0);
            short m190a = (short) (((short) mobak.b.b.m.m190a(q)) + 10);
            mobak.b.b.j.f259b.a(graphics, mobak.b.a.b.a.c(), m190a, 1, 0);
            short a = (short) (((short) (m190a + mobak.b.b.j.f259b.a(mobak.b.a.b.a.c()))) + 10);
            mobak.b.b.m.a(graphics, p, (int) a, 2, 0);
            mobak.b.b.j.f259b.a(graphics, mobak.b.a.b.a.m65b(), (short) (a + mobak.b.b.m.m190a(p) + 2), 1, 0);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("MenuScreen.drawScreen, step ").append(String.valueOf(1)).append(": ").append(e2.toString()).toString());
        }
    }

    public static void a(Graphics graphics, short s, short s2, boolean z, boolean z2) {
        if (z2) {
            mobak.b.b.m.a(graphics, mobak.c.a(k), 0, 0, mobak.b.b.m.a(mobak.c.a(k)), mobak.b.b.m.b(mobak.c.a(k)), 0, s + 21, s2 + 2 + (mobak.b.b.m.b(mobak.c.a(k)) / 2), 3);
        } else if (z) {
            mobak.b.b.m.a(graphics, mobak.c.a(j), 0, 0, mobak.b.b.m.a(mobak.c.a(j)), mobak.b.b.m.b(mobak.c.a(j)), 0, s + 21, s2 + 2 + (mobak.b.b.m.b(mobak.c.a(k)) / 2), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Graphics graphics, short s, String[] strArr, byte b2, mobak.c.a aVar) {
        if (b2 >= this.f191f) {
            int length = strArr.length;
            int height = (((mobak.b.b.m.a.getHeight() - s) - r.a()) - (aVar.f370a + 3)) / (aVar.f370a + 3);
            if (height < length && this.f191f + height > length) {
                this.f191f = length - height;
            }
        } else if (this.f191f < 0) {
            this.f191f = 0;
        }
        if (graphics == null || strArr == null || strArr.length == 0 || aVar == null) {
            return;
        }
        int width = mobak.b.b.m.a.getWidth();
        int i2 = this.f191f;
        while (true) {
            byte b3 = (byte) i2;
            if (b3 >= strArr.length) {
                return;
            }
            int a = aVar.a(strArr[b3]);
            if (b3 == b2) {
                int b4 = mobak.b.b.m.b(l);
                int i3 = b4 / 2;
                int m190a = mobak.b.b.m.m190a(l);
                if (a <= m190a - (i3 << 1)) {
                    mobak.b.b.m.a(graphics, l, (width - m190a) / 2, (int) s, 0);
                } else {
                    int i4 = a + (i3 << 1);
                    int i5 = i4;
                    if (i4 > width) {
                        i5 = width;
                    }
                    int i6 = (width - i5) / 2;
                    mobak.b.b.m.a(graphics, l, i3, 0, m190a - (i3 << 1), b4, 0, (width - (m190a - (i3 << 1))) / 2, s, 0);
                    mobak.b.b.m.a(graphics, l, 0, 0, m190a / 2, b4, 0, i6, s, 0);
                    mobak.b.b.m.a(graphics, l, m190a / 2, 0, m190a / 2, b4, 0, (width - i6) - (m190a / 2), s, 0);
                }
            }
            aVar.a(graphics, strArr[b3], (mobak.b.b.m.a.getWidth() - a) / 2, s, 0);
            s = (short) (s + aVar.f370a + 3);
            i2 = b3 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte a(mobak.c.a aVar, int i2, int i3, int i4) {
        if (i2 > 0 && i4 <= i4 + ((i2 - this.f191f) * (aVar.f370a + 3))) {
            return (byte) (this.f191f + ((i4 - i3) / (aVar.f370a + 3)));
        }
        return (byte) -1;
    }

    public static mobak.b.a.a[] a(mobak.b.a.a[] aVarArr) {
        if (aVarArr == null || aVarArr.length == 0) {
            return null;
        }
        short s = 0;
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 >= aVarArr.length) {
                break;
            }
            if (aVarArr[s3] != null && aVarArr[s3].c() != 0) {
                s = (short) (s + 1);
            }
            s2 = (short) (s3 + 1);
        }
        if (s == 0) {
            return null;
        }
        if (s == aVarArr.length) {
            return aVarArr;
        }
        mobak.b.a.a[] aVarArr2 = new mobak.b.a.a[s];
        short s4 = 0;
        short s5 = 0;
        while (true) {
            short s6 = s5;
            if (s6 >= aVarArr.length) {
                return aVarArr2;
            }
            if (aVarArr[s6] != null && aVarArr[s6].c() != 0) {
                aVarArr2[s4] = aVarArr[s6];
                s4 = (short) (s4 + 1);
            }
            s5 = (short) (s6 + 1);
        }
    }

    public final void b(String str) {
        this.f190b = str;
    }

    public final void c(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte a(boolean z) {
        return z ? (byte) ((((((mobak.b.b.m.a.getHeight() - mo90a()) - 10) - mobak.b.b.m.b(mobak.c.a(c))) - mobak.b.b.m.b(mobak.c.a(d))) - r.a()) / 29) : (byte) ((mobak.b.b.m.a.getWidth() - 16) / 29);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: collision with other method in class */
    public static byte m119a(int i2, int i3) {
        byte b2 = -1;
        int width = mobak.b.b.m.a.getWidth() - 29;
        int height = mobak.b.b.m.a.getHeight() / 2;
        if (i2 >= width && i2 <= width + 29 && i3 >= height && i3 <= height + 54) {
            b2 = i3 <= height + 27 ? (byte) 1 : (byte) 2;
        }
        return b2;
    }
}
