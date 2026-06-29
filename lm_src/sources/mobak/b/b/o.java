package mobak.b.b;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.Main2;
import mobak.b.b.a.r;
import mobak.b.b.a.s;

/* loaded from: LordmancerL.jar:mobak/b/b/o.class */
public final class o extends j {
    private Image a;

    /* renamed from: a, reason: collision with other field name */
    private Graphics f326a;

    /* renamed from: e, reason: collision with other field name */
    private int f327e;

    /* renamed from: f, reason: collision with other field name */
    private int f328f;

    /* renamed from: g, reason: collision with other field name */
    private static int f329g;

    /* renamed from: h, reason: collision with other field name */
    private static int f330h;

    /* renamed from: i, reason: collision with other field name */
    private static int f331i;

    /* renamed from: j, reason: collision with other field name */
    private static int f332j;
    private byte l;
    private byte m;
    private static short b;

    /* renamed from: c, reason: collision with other field name */
    private static short f333c;

    /* renamed from: d, reason: collision with other field name */
    private static short f334d;

    /* renamed from: e, reason: collision with other field name */
    private static short f335e;

    /* renamed from: f, reason: collision with other field name */
    private static short f336f;

    /* renamed from: g, reason: collision with other field name */
    private static short f337g;

    /* renamed from: h, reason: collision with other field name */
    private static short f338h;

    /* renamed from: a, reason: collision with other field name */
    private byte[][] f339a;

    /* renamed from: b, reason: collision with other field name */
    private byte[][] f340b;
    private byte n = -1;

    /* renamed from: k, reason: collision with other field name */
    private int f341k = -1;

    /* renamed from: a, reason: collision with other field name */
    private boolean f342a = false;
    private byte o = 0;
    private static byte c = 4;
    private static byte d = 3;
    private static byte e = 3;
    private static byte f = 3;
    private static byte g = 2;
    private static byte h = 15;
    private static byte i = 15;
    private static byte j = 25;
    private static byte k = 5;

    public o() {
        j.b = true;
        f329g = 0;
        f330h = 0;
        j.f262c = 0;
        j.f263d = 0;
        j.f264c = true;
        b = mobak.c.a("landscape.png");
        f334d = mobak.c.a("mountain.png");
        f333c = mobak.c.a("forest_1.png");
        f335e = mobak.c.a("all-space.png");
        f336f = mobak.c.a("snowForest.png");
        f337g = mobak.c.a("palms.png");
        f338h = mobak.c.a("rush.png");
        ((j) this).f271a = new r();
        ((j) this).f271a.a(true, (byte) 8, (short) 94);
        ((j) this).f271a.a(true, (byte) 1, (short) 69);
        ((j) this).f271a.a(true, (byte) 85, (short) 93);
        ((j) this).f271a.a(true, (byte) 88, (short) 52);
        ((j) this).f271a.a(true, (byte) 87, (short) 95);
        ((j) this).f271a.a(true, (byte) 102, (short) 181);
        ((j) this).f271a.a(false, (byte) 64, (short) 1);
        ((j) this).f271a.a(false, (byte) 89, (short) 98);
        ((j) this).f271a.a(false, (byte) 94, (short) 38);
        ((j) this).f271a.a(false, (byte) 95, (short) 298);
        ((j) this).f271a.a(false, (byte) 97, (short) 81);
        ((j) this).f271a.a(false, (byte) 98, (short) 77);
        d((byte) 9);
        ((j) this).f278a = (short) -100;
        if (mobak.b.a.b.a != null) {
            c(mobak.b.a.b.a.m77e());
        }
    }

    @Override // mobak.b.b.j
    public final void a(Graphics graphics) {
        try {
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("StrategicScreen.drawScreen(Graphics) ").append(e2.toString()).toString());
        }
        if (mobak.c.m221a()) {
            if (mobak.b.a.b.a.m61b() && this.f340b != null && this.f340b.length > 0 && this.n >= 0 && this.n < this.f340b.length) {
                mobak.b.a.b.a.a(this.f340b[this.n][0], this.f340b[this.n][1]);
                if (this.n != this.f340b.length - 1) {
                    a(this.f340b[this.n][0], this.f340b[this.n][1], false);
                }
                this.n = (byte) (this.n + 1);
            } else if (this.f340b != null && this.n >= this.f340b.length) {
                try {
                    e();
                    a((byte[][]) null);
                    j.b = false;
                    m199b();
                } catch (Exception e3) {
                    mobak.a.a.a(new StringBuffer("hero moveEnd: ").append(e3.getMessage()).toString());
                }
            }
            byte b2 = (byte) (f329g / 25);
            byte b3 = b2;
            if (b2 < 0) {
                b3 = 0;
            }
            byte b4 = (byte) (f330h / 25);
            byte b5 = b4;
            if (b4 < 0) {
                b5 = 0;
            }
            byte m175b = (byte) (b3 + m.a.m175b());
            byte b6 = m175b;
            if (m175b >= 50) {
                b6 = 49;
            }
            byte m176c = (byte) (b5 + m.a.m176c());
            byte b7 = m176c;
            if (m176c >= 50) {
                b7 = 49;
            }
            if (b7 >= 47) {
                m.a(graphics, 0);
                graphics.fillRect(0, 0, m.a.getWidth(), m.a.getHeight());
            }
            if (this.a != null && (this.f327e >= 0 || this.f328f >= 0)) {
                if (this.f327e != f329g || this.f328f != f330h) {
                    try {
                        b(this.f326a, b3, b5, b6, b7);
                        a(this.f326a, b3, b5, b6, b7);
                        this.f327e = f329g;
                        this.f328f = f330h;
                    } catch (Exception e4) {
                        mobak.a.a.a(new StringBuffer("fillBuffer: ").append(e4.getMessage()).toString(), false);
                    }
                }
                m.a(graphics, this.a, 0, 0, 0);
                c(graphics);
                mobak.b.a.b.a.a(graphics, f329g, f330h);
                d(graphics);
                ((j) this).f271a.a(graphics);
                mo90a();
                a(graphics, (short) ((a() - 8) - f331i), (short) ((b() - 8) - f332j));
                return;
            }
            try {
                if (this.a == null) {
                    this.a = Image.createImage(m.a.getWidth(), m.a.getHeight());
                }
                this.f326a = this.a.getGraphics();
                b(this.f326a, b3, b5, b6, b7);
                a(this.f326a, b3, b5, b6, b7);
                this.f327e = f329g;
                this.f328f = f330h;
            } catch (Exception e5) {
                mobak.a.a.a(new StringBuffer("createbuffer: ").append(e5.getMessage()).toString(), false);
            }
            m.a(graphics, this.a, 0, 0, 0);
            c(graphics);
            mobak.b.a.b.a.a(graphics, f329g, f330h);
            d(graphics);
            ((j) this).f271a.a(graphics);
            mo90a();
            a(graphics, (short) ((a() - 8) - f331i), (short) ((b() - 8) - f332j));
            return;
            mobak.a.a.a(new StringBuffer("StrategicScreen.drawScreen(Graphics) ").append(e2.toString()).toString());
        }
    }

    @Override // mobak.b.b.j
    public final boolean a(s sVar) {
        switch ((byte) sVar.a) {
            case -2:
                a((byte) 1);
                return true;
            case 1:
                a((byte) 0);
                return true;
            case 3:
            case 10:
                return true;
            case 8:
                a((byte) 3);
                return true;
            case 47:
                a((byte) 4);
                return true;
            case 58:
                a((byte) 2);
                return true;
            case 59:
                h();
                return true;
            case 71:
                i a = mobak.c.a(this.f341k);
                if (a == null || a.c() != 1) {
                    return true;
                }
                mobak.b.a.b.a.f78b = a.m157a();
                m.a.a((mobak.b.b.a.q) mobak.b.b.a.q.a((short) -12), true);
                return true;
            case 75:
                i a2 = mobak.c.a(this.l, this.m);
                if (a2 == null) {
                    return true;
                }
                if (a2.c() != 2) {
                    a2.e();
                    return true;
                }
                mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[84]);
                lVar.a(mobak.a.a.b.f33a[5]);
                lVar.a(a2.m157a());
                mobak.a.a.f15a.a(lVar);
                return true;
            case 76:
                try {
                    mobak.a.a.f15a.a(new mobak.a.a.l(mobak.a.a.b.f33a[51], (short) 0, (short) 0));
                    return true;
                } catch (Exception e2) {
                    mobak.a.a.a(new StringBuffer("keyPressedSS2").append(e2.toString()).toString());
                    return true;
                }
            case 89:
                a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b(), true);
                return true;
            case 94:
                m.a.a((mobak.b.b.a.q) mobak.b.b.a.q.b(), true);
                return true;
            case 98:
                try {
                    mobak.a.a.l lVar2 = new mobak.a.a.l(mobak.a.a.b.f33a[62], (short) 0, mobak.a.a.b.f33a[62]);
                    lVar2.a((byte) 3);
                    mobak.a.a.f15a.a(lVar2);
                    return true;
                } catch (Exception e3) {
                    mobak.a.a.a(new StringBuffer("keyPressed: ").append(e3.getMessage()).toString());
                    return true;
                }
            case 99:
                i a3 = mobak.c.a(this.f341k);
                if (a3 == null) {
                    return true;
                }
                mobak.a.a.l lVar3 = new mobak.a.a.l(mobak.a.a.b.f33a[66], (short) 0, mobak.a.a.b.f33a[5]);
                lVar3.a(a3.m157a());
                mobak.a.a.f15a.a(lVar3);
                return true;
            case 102:
                mobak.b.a.b.m73a();
                return true;
            default:
                return super.a(sVar);
        }
    }

    @Override // mobak.b.b.j
    protected final void c(int i2) {
        if (mobak.b.a.b.a.m61b()) {
            return;
        }
        if (m.a.getGameAction(i2) == 1) {
            this.m = (byte) (this.m - 1);
            if (this.m < 0) {
                this.m = (byte) 0;
            }
            if (b() < f330h) {
                int i3 = f330h - 25;
                f330h = i3;
                if (i3 < 0) {
                    f330h = 0;
                }
            }
        } else if (m.a.getGameAction(i2) == 6) {
            this.m = (byte) (this.m + 1);
            if (this.m >= 50) {
                this.m = (byte) 49;
            }
            if (b() > f330h + (m.a.getHeight() - r.a())) {
                int i4 = f330h + 25;
                f330h = i4;
                if ((i4 + m.a.getHeight()) - r.a() > 1250) {
                    f330h = (1250 - m.a.getHeight()) + r.a();
                }
            }
        } else if (m.a.getGameAction(i2) == 2) {
            this.l = (byte) (this.l - 1);
            if (this.l < 0) {
                this.l = (byte) 0;
            }
            if (a() < f329g) {
                int i5 = f329g - 25;
                f329g = i5;
                if (i5 < 0) {
                    f329g = 0;
                }
            }
        } else if (m.a.getGameAction(i2) == 5) {
            this.l = (byte) (this.l + 1);
            if (this.l >= 50) {
                this.l = (byte) 49;
            }
            if (a() > f329g + m.a.getWidth()) {
                int i6 = f329g + 25;
                f329g = i6;
                if (i6 + m.a.getWidth() > 1250) {
                    f329g = 1250 - m.a.getWidth();
                }
            }
        }
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v75, types: [byte[], byte[][]] */
    private void o() {
        a((byte[][]) null);
        m199b();
        if (this.l == mobak.b.a.b.a.m60a() && this.m == mobak.b.a.b.a.b()) {
            return;
        }
        if (mobak.c.m216a(this.l, this.m) < 0) {
            if (mobak.c.m229b(mobak.c.m223a(this.l, this.m))) {
                a(a(this.l, this.m));
                return;
            } else {
                a((byte[][]) null);
                return;
            }
        }
        a((byte[][]) null);
        if ((Math.abs(this.l - mobak.b.a.b.a.m60a()) == 1 && this.m - mobak.b.a.b.a.b() == 0) || (Math.abs(this.m - mobak.b.a.b.a.b()) == 1 && this.l - mobak.b.a.b.a.m60a() == 0)) {
            a((byte[][]) new byte[]{new byte[]{mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b()}});
            return;
        }
        if (this.f339a == null) {
            return;
        }
        short a = a(this.l);
        short b2 = b(this.m);
        if (a < 0 || a >= this.f339a.length || b2 < 0 || b2 >= this.f339a[a].length) {
            return;
        }
        byte[] bArr = {-1, -1, -1, -1};
        if (a - 1 >= 0) {
            bArr[0] = this.f339a[a - 1][b2];
        }
        if (a + 1 < this.f339a.length) {
            bArr[1] = this.f339a[a + 1][b2];
        }
        if (b2 + 1 < this.f339a[a].length) {
            bArr[2] = this.f339a[a][b2 + 1];
        }
        if (b2 - 1 >= 0) {
            bArr[3] = this.f339a[a][b2 - 1];
        }
        byte b3 = 0;
        byte b4 = 0;
        while (true) {
            byte b5 = b4;
            if (b5 >= bArr.length) {
                break;
            }
            if (bArr[b5] < bArr[b3] && bArr[b5] > 0) {
                b3 = b5;
            }
            b4 = (byte) (b5 + 1);
        }
        if (bArr[b3] < 0) {
            return;
        }
        byte[][] bArr2 = null;
        switch (b3) {
            case 0:
                bArr2 = a((byte) (this.l - 1), this.m);
                break;
            case 1:
                bArr2 = a((byte) (this.l + 1), this.m);
                break;
            case 2:
                bArr2 = a(this.l, (byte) (this.m + 1));
                break;
            case 3:
                bArr2 = a(this.l, (byte) (this.m - 1));
                break;
        }
        a(bArr2);
    }

    private void a(byte[][] bArr) {
        synchronized (mobak.b.a.b.a) {
            this.f340b = bArr;
            if (this.f340b != null) {
                this.n = (byte) 0;
            } else {
                this.n = (byte) -1;
            }
        }
    }

    public final void a(byte b2, byte b3, boolean z) {
        if (z) {
            this.l = b2;
            this.m = b3;
            this.f328f = -1;
            this.f327e = -1;
            a(a(this.l, this.m));
        }
        f329g = b2 * 25;
        f330h = b3 * 25;
        byte width = (byte) (m.a.getWidth() / 25);
        byte height = (byte) ((m.a.getHeight() - r.a()) / 25);
        f329g -= (width / 2) * 25;
        f330h -= (height / 2) * 25;
        if (f329g < 0) {
            f329g = 0;
        }
        if (f330h < 0) {
            f330h = 0;
        }
        if (f329g + m.a.getWidth() > 1250) {
            f329g = 1250 - m.a.getWidth();
        }
        if ((f330h + m.a.getHeight()) - r.a() > 1250) {
            f330h = (1250 - m.a.getHeight()) + r.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [mobak.b.b.o] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    private boolean e() {
        try {
            byte b2 = this.f340b[this.f340b.length - 1][0];
            byte b3 = this.f340b[this.f340b.length - 1][1];
            mobak.b.a.b.a.a(b2, b3);
            mobak.b.a.b.a.a(false);
            d((byte) 0);
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[18], (short) 2, (short) 0);
            if (this.o == 1) {
                mobak.b.a.b.a.a(b2, b3);
            }
            lVar.a(mobak.b.a.b.a.m60a());
            lVar.a(mobak.b.a.b.a.b());
            mobak.a.a.f15a.a(lVar);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("heroMotionEnd").append(e2.toString()).toString());
            return false;
        }
        if (this.o == 0) {
            return false;
        }
        byte b4 = this.o;
        this.o = (byte) 0;
        switch (b4) {
            case 1:
                g();
                this.f342a = false;
                return true;
            case 2:
                i();
                this.f342a = false;
                a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b(), true);
                return true;
            case 3:
                ?? r0 = this;
                try {
                    mobak.a.a.l lVar2 = new mobak.a.a.l(mobak.a.a.b.f33a[29], (short) 3, mobak.a.a.b.f33a[21], true);
                    if (r0.l == 0) {
                        lVar2.a((byte) 8);
                    } else if (r0.m == 0) {
                        lVar2.a((byte) 9);
                    } else if (r0.l == 49) {
                        lVar2.a((byte) 10);
                    } else {
                        lVar2.a((byte) 11);
                    }
                    lVar2.a(r0.l);
                    lVar2.a(r0.m);
                    j.b = true;
                    r0 = mobak.a.a.f15a.a(lVar2);
                } catch (Exception e3) {
                    mobak.a.a.a(r0.getMessage());
                }
                this.f342a = false;
                return true;
            case 4:
                f();
                this.f342a = false;
                return true;
            default:
                return false;
        }
        mobak.a.a.a(new StringBuffer("heroMotionEnd").append(e2.toString()).toString());
        return false;
    }

    private static void c(Graphics graphics) {
        try {
            if (mobak.c.a() > 0) {
                for (int i2 = 0; i2 < mobak.c.a(); i2++) {
                    i a = mobak.c.a(i2);
                    if (a != null) {
                        a.a(graphics, f329g, f330h);
                    }
                }
            }
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("drawMapObject: ").append(e2.getMessage()).toString());
        }
    }

    private void d(Graphics graphics) {
        try {
            synchronized (mobak.b.a.b.a) {
                if (this.f340b != null && this.f340b.length > 0 && !mobak.b.a.b.a.m61b() && this.n < this.f340b.length) {
                    for (byte b2 = 0; b2 < this.f340b.length; b2 = (byte) (b2 + 1)) {
                        if (this.f340b[b2][0] != mobak.b.a.b.a.m60a() || this.f340b[b2][1] != mobak.b.a.b.a.b()) {
                            j.a(graphics, (byte) 13, (short) (((this.f340b[b2][0] * 25) + 4) - f329g), (short) (((this.f340b[b2][1] * 25) + 4) - f330h), 0);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("drawHeroWay: ").append(e2.getMessage()).toString());
        }
    }

    private synchronized void a(Graphics graphics, byte b2, byte b3, byte b4, byte b5) {
        short s;
        int i2 = b4;
        while (true) {
            short s2 = (short) i2;
            if (s2 < b2) {
                return;
            }
            if (s2 < 50) {
                int i3 = b3;
                while (true) {
                    short s3 = (short) i3;
                    if (s3 <= b5 && s3 < 50) {
                        try {
                            if (!mobak.c.m228a(mobak.c.m223a((short) ((byte) s2), (short) ((byte) s3))) && mobak.c.b(mobak.c.m223a((short) ((byte) s2), (short) ((byte) s3))) != 0) {
                                short s4 = (short) (s - 1);
                                Image image = null;
                                short s5 = 0;
                                if (s4 >= 0 && s4 <= 3) {
                                    image = mobak.c.a(f333c);
                                    s5 = c;
                                }
                                if (s4 >= 4 && s4 <= 6) {
                                    short s6 = (short) (s4 - 4);
                                    s4 = s6;
                                    if (s6 >= 0 && s4 <= 2) {
                                        image = mobak.c.a(f334d);
                                        s5 = f;
                                    }
                                } else if (s4 >= 7 && s4 <= 9) {
                                    short s7 = (short) (s4 - 7);
                                    s4 = s7;
                                    if (s7 >= 0 && s4 <= 2) {
                                        image = mobak.c.a(f336f);
                                        s5 = d;
                                    }
                                } else if (s4 >= 10 && s4 <= 12) {
                                    short s8 = (short) (s4 - 10);
                                    s4 = s8;
                                    if (s8 >= 0 && s4 <= 2) {
                                        image = mobak.c.a(f337g);
                                        s5 = e;
                                    }
                                } else if (s4 >= 13 && s4 <= 14) {
                                    short s9 = (short) (s4 - 13);
                                    s4 = s9;
                                    if (s9 >= 0 && s4 <= 2) {
                                        image = mobak.c.a(f338h);
                                        s5 = g;
                                    }
                                }
                                if (image != null && s5 > 0) {
                                    short a = (short) (m.a(image) / s5);
                                    short b6 = (short) m.b(image);
                                    m.a(graphics, image, a * s4, 0, a, b6, 0, (s2 * 25) - f329g, ((25 * (s3 + 1)) - f330h) - b6, 0);
                                }
                            }
                        } catch (Exception e2) {
                            mobak.a.a.a(new StringBuffer("drawShadows").append(e2.toString()).toString());
                        }
                        i3 = s3 + 1;
                    }
                }
            }
            i2 = s2 - 1;
        }
    }

    private static synchronized void b(Graphics graphics, byte b2, byte b3, byte b4, byte b5) {
        f331i = f329g;
        f332j = f330h;
        short s = (short) ((b2 * 25) - f329g);
        short s2 = (short) (((b3 * 25) - f330h) - 4);
        int i2 = b4;
        while (true) {
            short s3 = (short) i2;
            if (s3 < b2) {
                return;
            }
            if (s3 < 50) {
                int i3 = b3;
                while (true) {
                    short s4 = (short) i3;
                    if (s4 <= b5 && s4 < 50) {
                        byte a = mobak.c.a(mobak.c.m223a((short) ((byte) s3), (short) ((byte) s4)));
                        if (a > 0) {
                            m.b(graphics, s + (25 * (s3 - b2)), s2 + (25 * (s4 - b3)), 29, 29);
                            m.a(graphics, mobak.c.a(b), (s + (25 * (s3 - b2))) - (((byte) (a - 1)) * 29), s2 + (25 * (s4 - b3)), 0);
                            m.b(graphics, 0, 0, m.a.getWidth(), m.a.getHeight());
                        } else {
                            byte b6 = mobak.c.b(mobak.c.m223a((short) ((byte) s3), (short) ((byte) s4)));
                            if (b6 == 0) {
                                m.a(graphics, 0);
                                graphics.fillRect(s + (25 * (s3 - b2)), s2 + (25 * (s4 - b3)), 29, 29);
                            } else if (b6 > 0 && b6 <= 8) {
                                m.b(graphics, s + (25 * (s3 - b2)), s2 + (25 * (s4 - b3)), 29, 29);
                                m.a(graphics, mobak.c.a(f335e), (s + (25 * (s3 - b2))) - (((byte) (b6 - 1)) * 29), s2 + (25 * (s4 - b3)), 0);
                                m.b(graphics, 0, 0, m.a.getWidth(), m.a.getHeight());
                            }
                        }
                        i3 = s4 + 1;
                    }
                }
            }
            i2 = s3 - 1;
        }
    }

    private synchronized short a() {
        return (short) ((this.l * 25) + 12);
    }

    private synchronized short b() {
        return (short) ((this.m * 25) + 12);
    }

    private static final short a(short s, byte[][] bArr, byte b2) {
        if (bArr == null) {
            return (short) -1;
        }
        return (short) ((s - b2) + ((byte) ((bArr.length - 1) / 2)));
    }

    private static final short b(short s, byte[][] bArr, byte b2) {
        if (bArr == null || bArr[0] == null) {
            return (short) -1;
        }
        return (short) ((s - b2) + ((byte) ((bArr[0].length - 1) / 2)));
    }

    private synchronized short a(short s) {
        return a(s, this.f339a, mobak.b.a.b.a.m60a());
    }

    private synchronized short b(short s) {
        return b(s, this.f339a, mobak.b.a.b.a.b());
    }

    @Override // mobak.b.b.j
    /* renamed from: a */
    public final synchronized void mo90a() {
        if (((j) this).f271a.m124a()) {
            return;
        }
        if (!this.f342a) {
            this.f341k = -1;
        }
        ((j) this).f271a.a(true, false);
        if ((this.f340b == null || (this.f340b != null && this.n > this.f340b.length + 1)) && mobak.b.a.b.a.m61b()) {
            mobak.b.a.b.a.a(false);
        }
        if (mobak.b.a.b.a.m61b()) {
            return;
        }
        if (Math.abs(mobak.b.a.b.a.m60a() - this.l) > m200b()) {
            d((byte) 10);
            return;
        }
        if (Math.abs(mobak.b.a.b.a.b() - this.m) > c()) {
            d((byte) 10);
            return;
        }
        byte b2 = !mobak.c.m229b(mobak.c.m223a((short) this.l, (short) this.m)) ? (byte) 10 : (this.f339a == null || this.f339a[a((short) this.l)][b((short) this.m)] != Byte.MAX_VALUE) ? (byte) 9 : (byte) 10;
        i a = mobak.c.a(this.l, this.m, true);
        if (this.f340b != null && a != null) {
            ((j) this).f271a.a(a.m155a(), false);
            switch (a.c()) {
                case 1:
                    if (a.d() == 2) {
                        b2 = -3;
                        break;
                    } else {
                        b2 = 10;
                        break;
                    }
                case 3:
                    b2 = -4;
                    break;
                default:
                    b2 = -2;
                    break;
            }
            if (!this.f342a) {
                this.f341k = mobak.c.a(a);
            }
        } else if (b2 == 9) {
            if (mobak.b.a.b.a.m60a() == this.l && mobak.b.a.b.a.b() == this.m) {
                ((j) this).f271a.a((byte) 85, false);
                ((j) this).f271a.a((byte) 87, false);
                ((j) this).f271a.a((byte) 88, false);
                ((j) this).f271a.a((byte) 102, false);
                s[] m75a = mobak.b.a.b.a.m75a();
                byte b3 = 0;
                while (true) {
                    byte b4 = b3;
                    if (m75a == null || b4 >= m75a.length) {
                        break;
                    }
                    ((j) this).f271a.a(true, m75a[b4]);
                    m75a[b4].a(true);
                    b3 = (byte) (b4 + 1);
                }
                b2 = -3;
            } else if (mobak.c.a(mobak.c.m223a(this.l, this.m)) == 5) {
                b2 = -2;
                ((j) this).f271a.a((byte) 8, false);
            } else {
                ((j) this).f271a.a((byte) 1, false);
            }
        }
        d(b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v128, types: [short] */
    /* JADX WARN: Type inference failed for: r0v27, types: [short] */
    public static final byte[][] a(byte b2, byte b3, byte b4, byte b5) {
        try {
            if (!mobak.c.m221a()) {
                return null;
            }
            byte[][] bArr = new byte[(h << 1) + 1][(i << 1) + 1];
            byte b6 = (byte) ((i / h) * 127);
            for (short s = 0; s < (2 * h) + 1; s = (short) (s + 1)) {
                for (short s2 = 0; s2 < (2 * i) + 1; s2 = (short) (s2 + 1)) {
                    bArr[s][s2] = b6;
                }
            }
            bArr[h][i] = 0;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                i2++;
                if (i3 >= j) {
                    return bArr;
                }
                for (byte b7 = 0; b7 < (2 * h) + 1; b7 = (short) (b7 + 1)) {
                    for (byte b8 = 0; b8 < (2 * i) + 1; b8 = (short) (b8 + 1)) {
                        if (b7 != h || b8 != i) {
                            short length = bArr == null ? (short) -1 : (short) ((b2 + b7) - ((byte) ((bArr.length - 1) / 2)));
                            short length2 = (bArr == null || bArr[0] == null) ? (short) -1 : (short) ((b3 + b8) - ((byte) ((bArr[0].length - 1) / 2)));
                            if (length >= 0 && length < 50 && length2 >= 0 && length2 < 50 && mobak.c.m229b(mobak.c.m223a((short) ((byte) length), (short) ((byte) length2)))) {
                                byte b9 = (byte) (i2 - 1);
                                byte b10 = bArr[b7][b8];
                                if (length > 0 && b7 > 0 && mobak.c.m229b(mobak.c.m223a((short) ((byte) (length - 1)), (short) ((byte) length2))) && bArr[b7 - 1][b8] == b9) {
                                    b10 = bArr[b7 - 1][b8];
                                }
                                if (length < 49 && b7 < bArr.length - 1 && mobak.c.m229b(mobak.c.m223a((short) ((byte) (length + 1)), (short) ((byte) length2))) && bArr[b7 + 1][b8] == b9) {
                                    b10 = bArr[b7 + 1][b8];
                                }
                                if (length2 > 0 && b8 > 0 && mobak.c.m229b(mobak.c.m223a((short) ((byte) length), (short) ((byte) (length2 - 1)))) && bArr[b7][b8 - 1] == b9) {
                                    b10 = bArr[b7][b8 - 1];
                                }
                                if (length2 < 49 && b8 < bArr[0].length - 1 && mobak.c.m229b(mobak.c.m223a((short) ((byte) length), (short) ((byte) (length2 + 1)))) && bArr[b7][b8 + 1] == b9) {
                                    b10 = bArr[b7][b8 + 1];
                                }
                                if (b10 < Byte.MAX_VALUE && b10 < bArr[b7][b8] - 1) {
                                    bArr[b7][b8] = (byte) (b10 + 1);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("getWaveMatrix: ").append(e2.getMessage()).toString());
            return null;
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public final synchronized void m199b() {
        this.f339a = a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b(), m200b(), c());
    }

    /* renamed from: b, reason: collision with other method in class */
    private static byte m200b() {
        return (byte) Math.min((int) h, (int) m.a.m175b());
    }

    private static byte c() {
        return (byte) Math.min((int) i, (int) m.a.m176c());
    }

    public static final byte[][] a(byte b2, byte b3, byte[][] bArr, byte b4, byte b5) {
        if (!mobak.c.m221a() || b4 < 0 || b5 < 0) {
            return null;
        }
        i a = mobak.c.a(b4, b5);
        if ((a != null && a.m156a()) || b4 >= 50 || b5 >= 50 || bArr == null || mobak.c.m228a(mobak.c.m223a(b4, b5))) {
            return null;
        }
        short a2 = a(b4, bArr, b2);
        short b6 = b(b5, bArr, b3);
        if (a2 < 0 || b6 < 0 || a2 >= bArr.length || b6 >= bArr[0].length || bArr[a2][b6] == Byte.MAX_VALUE) {
            return null;
        }
        byte[][] bArr2 = new byte[bArr[a2][b6] + 1][2];
        if (bArr2.length == 0) {
            return null;
        }
        bArr2[bArr2.length - 1][0] = b4;
        bArr2[bArr2.length - 1][1] = b5;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            short a3 = a(bArr2[length + 1][0], bArr, b2);
            short b7 = b(bArr2[length + 1][1], bArr, b3);
            if (a3 >= 0 && b7 >= 0) {
                if (a3 > 0 && bArr[a3 - 1][b7] < bArr[a3][b7]) {
                    bArr2[length][0] = (byte) (bArr2[length + 1][0] - 1);
                    bArr2[length][1] = bArr2[length + 1][1];
                } else if (a3 + 1 < bArr.length && bArr[a3 + 1][b7] < bArr[a3][b7]) {
                    bArr2[length][0] = (byte) (bArr2[length + 1][0] + 1);
                    bArr2[length][1] = bArr2[length + 1][1];
                } else if (b7 > 0 && bArr[a3][b7 - 1] < bArr[a3][b7]) {
                    bArr2[length][1] = (byte) (bArr2[length + 1][1] - 1);
                    bArr2[length][0] = bArr2[length + 1][0];
                } else if (b7 + 1 < bArr[0].length && bArr[a3][b7 + 1] < bArr[a3][b7]) {
                    bArr2[length][1] = (byte) (bArr2[length + 1][1] + 1);
                    bArr2[length][0] = bArr2[length + 1][0];
                }
            }
        }
        bArr2[0][0] = b2;
        bArr2[0][1] = b3;
        return bArr2;
    }

    private synchronized byte[][] a(byte b2, byte b3) {
        byte[][] a = a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b(), this.f339a, b2, b3);
        if (a == null || a.length <= 1) {
            return null;
        }
        byte[][] bArr = new byte[a.length - 1][2];
        System.arraycopy(a, 1, bArr, 0, bArr.length);
        return bArr;
    }

    private boolean f() {
        try {
            i a = mobak.c.a(this.f341k);
            if (a != null) {
                try {
                    mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[74], (short) 0, mobak.a.a.b.f33a[9]);
                    lVar.a(a.m157a());
                    mobak.a.a.f15a.a(lVar);
                    return true;
                } catch (Exception unused) {
                }
            }
            j.b = false;
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    private boolean g() {
        try {
            i a = mobak.c.a(this.f341k);
            ?? r0 = a;
            if (r0 != 0) {
                try {
                    short s = 0;
                    if (a.c() == 3 || a.c() == 4) {
                        s = mobak.a.a.b.f33a[7];
                    } else if (a.c() == 2) {
                        s = mobak.a.a.b.f33a[10];
                    } else if (a.c() == 5) {
                        s = mobak.a.a.b.f33a[8];
                    }
                    mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[10], (short) 4, s);
                    lVar.a(a.m157a());
                    mobak.a.a.f15a.a(lVar);
                    r0 = 1;
                    return true;
                } catch (Exception e2) {
                    r0.printStackTrace();
                }
            }
            j.b = false;
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [mobak.b.b.i] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [mobak.Main2] */
    private boolean h() {
        ?? a = mobak.c.a(this.f341k);
        if (a == 0) {
            return false;
        }
        try {
            Main2.a.f11a = a.m157a();
            a = Main2.a;
            a.c((byte) 6);
            return true;
        } catch (Exception e2) {
            mobak.a.a.a(a.getMessage());
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, mobak.b.b.i] */
    private boolean i() {
        boolean z;
        ?? a = mobak.c.a(this.f341k);
        if (a == 0) {
            return false;
        }
        try {
            if (mobak.c.a() > 0) {
                for (short s = 0; s < mobak.c.a(); s = (short) (s + 1)) {
                    i a2 = mobak.c.a((int) s);
                    if (a2 != null && a2.c() == 2) {
                        byte abs = (byte) Math.abs(this.l - a2.m158a());
                        byte abs2 = (byte) Math.abs(this.m - a2.b());
                        if (abs >= 0 && abs2 >= 0 && abs <= k && abs2 <= k) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            if (z) {
                m.a(mobak.c.d.a(135), mobak.c.d.a(166));
                return true;
            }
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[33], (short) 4, mobak.a.a.b.f33a[6]);
            mobak.b.a.b.a.f78b = a.m157a();
            lVar.a(a.m157a());
            mobak.a.a.f15a.a(lVar);
            d((byte) -1);
            return true;
        } catch (Exception e2) {
            mobak.a.a.a(a.getMessage());
            return true;
        }
    }

    private boolean a(byte b2) {
        if (b2 != 0) {
            this.f342a = true;
        }
        j.b = true;
        d((byte) -1);
        this.o = b2;
        short s = this.l;
        short s2 = this.m;
        if ((s == mobak.b.a.b.a.m60a() && s2 == mobak.b.a.b.a.b()) || this.f340b == null) {
            return true;
        }
        this.f339a = null;
        mobak.b.a.b.a.a(true);
        return true;
    }

    @Override // mobak.b.b.j
    /* renamed from: g */
    public final void mo144g() {
        super.mo144g();
        try {
            this.f327e = -1;
            this.f328f = -1;
            m199b();
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("reset strategical screen: ").append(e2.getMessage()).toString(), false);
        }
        d((byte) 9);
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m201a(byte b2, byte b3) {
        if (this.f340b == null || !mobak.b.a.b.a.m61b()) {
            return false;
        }
        synchronized (mobak.b.a.b.a) {
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= this.f340b.length) {
                    return false;
                }
                if (this.f340b[s2][0] == b2 && this.f340b[s2][1] == b3) {
                    return true;
                }
                s = (short) (s2 + 1);
            }
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    public static void m202c() {
        if (mobak.c.m229b(mobak.c.m223a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b()))) {
            return;
        }
        byte b2 = 1;
        while (true) {
            byte b3 = b2;
            if (b3 >= 3) {
                return;
            }
            int m60a = mobak.b.a.b.a.m60a() - b3;
            while (true) {
                byte b4 = (byte) m60a;
                if (b4 < mobak.b.a.b.a.m60a() + b3) {
                    int b5 = mobak.b.a.b.a.b() - b3;
                    while (true) {
                        byte b6 = (byte) b5;
                        if (b6 < mobak.b.a.b.a.b() + b3) {
                            if (mobak.c.m229b(mobak.c.m223a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b())) && mobak.c.a(mobak.b.a.b.a.m60a(), mobak.b.a.b.a.b())) {
                                mobak.b.a.b.a.a(b4, b6);
                                return;
                            }
                            b5 = b6 + 1;
                        }
                    }
                }
                m60a = b4 + 1;
            }
            b2 = (byte) (b3 + 1);
        }
    }

    @Override // mobak.b.b.j
    protected final boolean a(int i2, int i3) {
        if (mobak.b.a.b.a == null || mobak.b.a.b.a.m61b()) {
            return false;
        }
        this.l = (byte) ((f329g + i2) / 25);
        this.m = (byte) ((f330h + i3) / 25);
        o();
        mo90a();
        return true;
    }

    @Override // mobak.b.b.j
    /* renamed from: b */
    protected final boolean mo108b(int i2, int i3) {
        return a(i2, i3);
    }

    @Override // mobak.b.b.j
    protected final boolean b(int i2, int i3, int i4) {
        if (mobak.b.a.b.a == null || mobak.b.a.b.a.m61b()) {
            return false;
        }
        mo90a();
        if (r.a(i2, i3) || r.b(i2, i3)) {
            return true;
        }
        m167a();
        return true;
    }

    @Override // mobak.b.b.j
    protected final boolean a(int i2, int i3, int i4) {
        return false;
    }
}
