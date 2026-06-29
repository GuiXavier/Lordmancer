package mobak.b.b;

import java.util.Date;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.Main2;
import mobak.b.b.a.r;
import mobak.b.b.a.s;

/* loaded from: LordmancerL.jar:mobak/b/b/a.class */
public final class a extends j {
    private static final byte[] a = {2, 58, 53, 54};
    private static int e = 0;
    private short b;
    private short c;

    /* renamed from: a, reason: collision with other field name */
    private Image f131a;

    /* renamed from: a, reason: collision with other field name */
    public mobak.b.a.e f137a;

    /* renamed from: b, reason: collision with other field name */
    private byte[][] f138b;

    /* renamed from: a, reason: collision with other field name */
    private long f139a;
    private byte k;
    private byte l;
    private byte m;

    /* renamed from: f, reason: collision with other field name */
    private int f146f;

    /* renamed from: a, reason: collision with other field name */
    private s f147a;

    /* renamed from: a, reason: collision with other field name */
    private byte[][] f132a = new byte[5][6];

    /* renamed from: c, reason: collision with other field name */
    private byte f133c = 0;
    private byte d = 0;

    /* renamed from: a, reason: collision with other field name */
    public boolean f134a = false;

    /* renamed from: d, reason: collision with other field name */
    private short f135d = 0;

    /* renamed from: e, reason: collision with other field name */
    private byte f136e = -1;

    /* renamed from: d, reason: collision with other field name */
    private boolean f140d = false;
    private byte f = 0;
    private byte g = 0;

    /* renamed from: e, reason: collision with other field name */
    private boolean f141e = false;

    /* renamed from: f, reason: collision with other field name */
    private boolean f142f = false;

    /* renamed from: a, reason: collision with other field name */
    private c[] f143a = new c[10];
    private byte h = 0;
    private byte i = 0;

    /* renamed from: a, reason: collision with other field name */
    private mobak.b.a.f[] f144a = null;

    /* renamed from: b, reason: collision with other field name */
    private mobak.b.a.f[] f145b = null;
    private byte j = 0;

    /* renamed from: a, reason: collision with other field name */
    private mobak.a.a.l f148a = null;

    /* renamed from: a, reason: collision with other field name */
    public mobak.b.a.b f149a = null;

    public a() {
        this.b = (short) -1;
        this.c = (short) -1;
        this.f131a = null;
        this.k = (byte) -1;
        int i = 1;
        try {
            mobak.c.d();
            i = 1 + 1;
            this.k = (byte) 0;
            this.f131a = mobak.c.m231a("/mobak/res/mana_timer.png");
            this.b = mobak.c.a("grassL-1.png");
            this.c = mobak.c.a("leg_cursors.png");
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("BS r.l.e, step ").append(String.valueOf(i)).append(": ").append(e2.toString()).toString());
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                break;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < 6) {
                    this.f132a[b2][b4] = 0;
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
        this.f146f = mobak.b.a.b.a.a(mobak.b.a.b.a.f83b, (byte) 10, 0);
        ((j) this).f271a = new r(new byte[]{51, 56, 4, 1, 5}, new byte[]{51, 2, 58, 53, 54, 59, 63}, null);
        ((j) this).f271a.a(true, false);
        ((j) this).f271a.a((short) 190, (byte) 58);
        this.f147a = new s((byte) 30);
        this.f147a.a((short) 264);
        this.f147a.a(mobak.c.d.a(265, new String[]{String.valueOf(mobak.c.f366c)}));
        this.f147a.f203a = mobak.a.a.b.f33a[87];
        this.f147a.a(true);
        ((j) this).f271a.a(false, this.f147a);
        m93b();
        c();
        this.f139a = 0L;
        ((j) this).f278a = (short) -101;
        m.a.a(true);
        if (mobak.b.a.b.a != null) {
            c(mobak.b.a.b.a.m77e());
        }
    }

    public final void a(byte b) {
        this.f140d = true;
        this.f = b;
    }

    @Override // mobak.b.b.j
    public final void a(Graphics graphics) {
        int i = 1;
        try {
            if (!mobak.b.a.b.a.f71a || mobak.b.a.b.a.m59a((byte) 1) == null) {
                ((j) this).f271a.b((byte) 54);
            } else {
                ((j) this).f271a.c((byte) 54);
            }
            mo90a();
            int i2 = 1 + 1 + 1;
            if (graphics != null) {
                m.a(graphics, 9160767);
                graphics.fillRect(0, 0, m.a.getWidth(), m.a.getHeight());
                for (byte b = 0; b < 5; b = (byte) (b + 1)) {
                    for (byte b2 = 0; b2 < 6; b2 = (byte) (b2 + 1)) {
                        short m89a = m89a(b);
                        short b3 = (short) (b(b2) - 24);
                        m.b(graphics, m89a, b3, 27, 24);
                        if ((b + b2) % 2 == 0) {
                            m.a(graphics, this.b, 0, 0, 27, 24, 0, m89a, b3, 20);
                        } else {
                            m.a(graphics, this.b, 27, 0, 27, 24, 0, m89a, b3, 20);
                        }
                    }
                }
                m.b(graphics, 0, 0, m.a.getWidth(), m.a.getHeight());
            }
            i = i2 + 1;
            if (graphics != null && this.f132a != null) {
                for (byte b4 = 0; b4 < 5; b4 = (byte) (b4 + 1)) {
                    for (byte b5 = 0; b5 < 6; b5 = (byte) (b5 + 1)) {
                        if (this.f132a[b4][b5] != 0) {
                            short m89a2 = m89a(b4);
                            short b6 = (short) (b(b5) - 24);
                            if (this.f132a[b4][b5] == -1) {
                                m.b(graphics, m89a2, b6, 27, 24);
                                if ((b4 + b5) % 2 == 0) {
                                    m.a(graphics, this.b, 54, 0, 27, 24, 0, m89a2, b6, 20);
                                } else {
                                    m.a(graphics, this.b, 81, 0, 27, 24, 0, m89a2, b6, 20);
                                }
                                m.b(graphics, 0, 0, m.a.getWidth(), m.a.getHeight());
                            } else {
                                if (!this.f141e && this.i == this.h && this.f132a[b4][b5] == Byte.MIN_VALUE) {
                                    m.a(graphics, this.c, 18 * this.k, 0, 18, 17, 0, ((short) (m89a2 + 4)) + 1, (short) (b6 + 3), 0);
                                }
                                byte b7 = (byte) (this.f132a[b4][b5] & Byte.MAX_VALUE);
                                if (m97a(b7)) {
                                    mobak.b.a.f fVar = null;
                                    try {
                                        fVar = m98a(b7);
                                    } catch (Exception e2) {
                                        mobak.a.a.a(new StringBuffer("unitDraw [").append((int) b7).append("]").append(e2).toString(), true);
                                    }
                                    if (fVar != null) {
                                        synchronized (fVar) {
                                            fVar.a(graphics, m89a2, b6, (short) -126);
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
            int i3 = i + 1;
            if (this.f134a) {
                if (this.f141e || this.i != this.h) {
                    a(graphics, (short) (m89a(this.f133c) + 5), (short) ((b(this.d) - 24) + 4), 0);
                } else {
                    a(graphics, (short) ((m89a(this.f133c) - 1) + 5), (short) ((b(this.d) - 8) - 12), 0);
                }
            }
            int i4 = i3 + 1;
            if (this.f139a != 0) {
                int a2 = this.f146f != 0 ? (mobak.b.a.b.a.a(mobak.b.a.b.a.f83b, (byte) 10, 0) * 100) / this.f146f : 100;
                String obj = new Date(e - (System.currentTimeMillis() - this.f139a)).toString();
                String substring = obj.substring(obj.indexOf(":") + 1);
                String substring2 = substring.substring(0, substring.indexOf(" "));
                if (e - (System.currentTimeMillis() - this.f139a) < 0) {
                    if (this.f134a) {
                        ((j) this).f271a.a(a, true, true, true);
                        this.f134a = false;
                    }
                    a(graphics, 0, "00:00", a2);
                } else {
                    a(graphics, e != 0 ? (int) ((100 * (e - (System.currentTimeMillis() - this.f139a))) / e) : 0, substring2, a2);
                }
            }
            ((j) this).f271a.a(graphics);
            i = i4 + 1 + 1;
            if (this.f143a[this.i] != null && this.i != this.h) {
                if (this.f143a[this.i].a()) {
                    this.f143a[this.i].mo149a();
                    this.f143a[this.i] = null;
                    this.i = (byte) (this.i + 1);
                    if (this.i >= this.f143a.length) {
                        this.i = (byte) 0;
                    }
                } else {
                    try {
                        this.f143a[this.i].a(graphics);
                    } catch (Exception e3) {
                        mobak.a.a.a(new StringBuffer("m_draw ").append(e3.toString()).toString(), false);
                    }
                }
            }
            int i5 = i + 1;
            if (this.f140d) {
                if (this.f138b != null) {
                    o();
                }
                if (this.g <= 20) {
                    if (this.i == this.h) {
                        this.g = (byte) (this.g + 1);
                    }
                } else {
                    m.a.k();
                    m.a.a(this.f);
                    m.a.f297a = null;
                    mobak.a.a.f15a.a(new mobak.a.a.l(mobak.a.a.b.f33a[73]));
                }
            }
        } catch (Exception e4) {
            mobak.a.a.a(new StringBuffer("BS d.s.e, step ").append(String.valueOf(i)).append(": ").append(e4.getMessage()).toString());
        }
    }

    private void a(Graphics graphics, int i, String str, int i2) {
        int width = (m.a.getWidth() / 2) - 10;
        int width2 = (m.a.getWidth() - 10) - width;
        m.a(graphics, width2, 0, width, i, this.f131a, this.f131a, 0, 0, m.b(this.f131a), 6, 1, 13, 0, m.b(this.f131a), 4, 1);
        j.f259b.a(graphics, str, width2 + (width / 2), m.b(this.f131a) / 2, 3);
        int width3 = (m.a.getWidth() / 2) - 10;
        m.a(graphics, 0, 0, width3, i2, this.f131a, this.f131a, 0, 0, m.b(this.f131a), 6, 1, 22, 0, m.b(this.f131a), 4, 1);
        j.f259b.a(graphics, String.valueOf(mobak.b.a.b.a.a(mobak.b.a.b.a.f83b, (byte) 10, 0)), 0 + (width3 / 2), 0 + (m.b(this.f131a) / 2), 3);
    }

    /* renamed from: a, reason: collision with other method in class */
    private short m89a(byte b) {
        return (short) (a() + (b * 25));
    }

    private static short a() {
        return (short) (((m.a.getWidth() - 135) + 8) / 2);
    }

    private short b(byte b) {
        return (short) (b() + ((24 * (b + 1)) - b));
    }

    private short b() {
        int b = m.b(this.f131a);
        return (short) (b + ((((m.a.getHeight() - b) - r.a()) - 144) / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    @Override // mobak.b.b.j
    public final boolean a(s sVar) {
        mobak.b.a.e[] m59a;
        if (sVar == null) {
            return false;
        }
        ?? r0 = (byte) sVar.a;
        switch (r0) {
            case 1:
                try {
                    if (this.h != this.i || this.f141e) {
                        return true;
                    }
                    this.f141e = true;
                    d((byte) -1);
                    m94a(this.f133c, this.d);
                    mobak.a.a.f15a.a(this.f148a);
                    this.f148a = null;
                    this.f138b = null;
                    m96a().c(false);
                    o();
                    this.f136e = (byte) -1;
                    return true;
                } catch (Exception e2) {
                    mobak.a.a.a(new StringBuffer("GO ").append(e2).toString());
                    return true;
                }
            case 2:
            case 58:
                if (this.h != this.i || this.f141e) {
                    return true;
                }
                if (this.f148a != null) {
                    mobak.a.a.f15a.a(this.f148a);
                    this.f148a = null;
                }
                return a(((byte) sVar.a) == 58);
            case 4:
                if (this.h != this.i || this.f141e) {
                    return true;
                }
                this.l = this.f133c;
                this.m = this.d;
                mobak.b.a.b.a.f71a = false;
                this.f141e = true;
                d((byte) -1);
                try {
                    mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[46], (short) 6, (short) 0);
                    lVar.a(this.f137a.e());
                    lVar.a(this.f133c);
                    lVar.a(this.d);
                    mobak.a.a.f15a.a(lVar);
                    this.j = (byte) 1;
                    this.f137a.c(this.f137a.c() - 1);
                    mobak.b.a.b.a.f71a = false;
                    mobak.b.a.b bVar = mobak.b.a.b.a;
                    mobak.b.a.d a2 = mobak.b.a.b.a(mobak.b.a.b.a.f83b, mobak.b.a.d.a);
                    if (a2 != null) {
                        a2.b -= this.f137a.mo82b();
                    }
                    if (this.f137a.c() <= 0) {
                        mobak.b.a.b.a.a(this.f137a.e());
                    }
                } catch (Exception e3) {
                    mobak.a.a.a(new StringBuffer("magic").append(e3.toString()).toString());
                }
                this.f137a = null;
                return true;
            case 5:
                if (this.h != this.i || this.f141e) {
                    return true;
                }
                this.f141e = true;
                d((byte) -1);
                try {
                    p();
                    return true;
                } catch (Exception e4) {
                    mobak.a.a.a(new StringBuffer("CS_ATTACK").append(e4.toString()).toString());
                    return true;
                }
            case 53:
                m.a.a((mobak.b.b.a.q) mobak.b.b.a.q.a((short) -4), true);
                return true;
            case 54:
                if (this.h != this.i || (m59a = mobak.b.a.b.a.m59a((byte) 1)) == null || m59a.length <= 0) {
                    return true;
                }
                m.a.a((mobak.b.b.a.q) mobak.b.b.a.q.a((short) -1), true);
                return true;
            case 56:
                if (this.h != this.i) {
                    return true;
                }
                this.f137a = null;
                return true;
            case 59:
                Main2.a.f11a = this.f149a.f73a;
                Main2.a.c((byte) 6);
                return true;
            case 63:
                b bVar2 = new b(this);
                if (this.f135d >= 3) {
                    m.a(mobak.c.d.a(39), mobak.c.d.a(209), new StringBuffer().append(mobak.c.d.a(41)).append("?").toString(), bVar2);
                    return false;
                }
                m.a(mobak.c.d.a(39), mobak.c.d.a(40), new StringBuffer().append(mobak.c.d.a(41)).append("?").toString(), bVar2);
                return false;
            default:
                try {
                    r0 = super.a(sVar);
                    return r0;
                } catch (Exception e5) {
                    mobak.a.a.a(r0.getMessage());
                    return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v16, types: [mobak.a.a.l] */
    private boolean a(boolean z) {
        try {
            this.f148a = null;
            if (m96a() == null) {
                return false;
            }
            m96a().c(false);
            this.f136e = (byte) -1;
            o();
            this.f138b = null;
            mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[36], (short) 0, (short) 0);
            ?? r0 = z;
            if (r0 != 0) {
                try {
                    r0 = lVar;
                    r0.a((byte) 1);
                } catch (Exception e2) {
                    mobak.a.a.a(r0.getMessage());
                }
            }
            mobak.a.a.f15a.a(lVar);
            return true;
        } catch (Exception e3) {
            mobak.a.a.a(new StringBuffer("sendPass ").append(e3).toString());
            return false;
        }
    }

    @Override // mobak.b.b.j
    /* renamed from: a, reason: collision with other method in class */
    public final void mo90a() {
        try {
            mobak.b.a.e[] m59a = mobak.b.a.b.a.m59a((byte) 1);
            if (m59a == null || m59a.length <= 0 || !mobak.b.a.b.a.f71a) {
                ((j) this).f271a.b((byte) 54);
            } else {
                ((j) this).f271a.c((byte) 54);
            }
            if (this.i == this.h && !this.f141e) {
                d((byte) 0);
                if (((j) this).f271a.m124a()) {
                    return;
                }
                byte b = this.f132a[this.f133c][this.d];
                ((j) this).f271a.a(true, false);
                if (this.f134a) {
                    if (b == -1 && this.f137a == null) {
                        d((byte) 10);
                    } else if (this.f137a != null && mobak.b.a.b.a.f71a) {
                        d((byte) 3);
                        byte b2 = this.f132a[this.f133c][this.d];
                        byte b3 = b2;
                        if (b2 != -1) {
                            b3 = (byte) (this.f132a[this.f133c][this.d] & Byte.MAX_VALUE);
                        }
                        boolean z = false;
                        if (b3 == 0) {
                            z = this.f137a.m83b((byte) 16);
                        } else if (b3 > 0 && b3 <= 5) {
                            z = this.f137a.m83b((byte) 2);
                        } else if (b3 >= 51 && b3 <= 100) {
                            z = this.f137a.m83b((byte) 1);
                        } else if (b3 == -1) {
                            z = this.f137a.m83b((byte) 32);
                        }
                        if (!z) {
                            ((j) this).f271a.a((byte) 56, false);
                            d((byte) 3);
                            return;
                        } else {
                            ((j) this).f271a.a((byte) 56, false);
                            ((j) this).f271a.a((byte) 4, false);
                            d((byte) 4);
                            return;
                        }
                    }
                    if (this.f136e > 0) {
                        mobak.b.a.f m96a = m96a();
                        if (m96a == null) {
                            return;
                        }
                        boolean m85c = m96a.m85c();
                        byte e2 = m96a().e();
                        byte f = m96a().f();
                        if (m85c && e2 - 1 >= 0 && this.f132a[e2 - 1][f] != -1 && ((byte) (this.f132a[e2 - 1][f] & Byte.MAX_VALUE)) > 50) {
                            m85c = false;
                        }
                        if (m85c && e2 + 1 < 5 && this.f132a[e2 + 1][f] != -1 && ((byte) (this.f132a[e2 + 1][f] & Byte.MAX_VALUE)) > 50) {
                            m85c = false;
                        }
                        if (m85c && f - 1 >= 0 && this.f132a[e2][f - 1] != -1 && ((byte) (this.f132a[e2][f - 1] & Byte.MAX_VALUE)) > 50) {
                            m85c = false;
                        }
                        if (m85c && f + 1 < 6 && this.f132a[e2][f + 1] != -1 && ((byte) (this.f132a[e2][f + 1] & Byte.MAX_VALUE)) > 50) {
                            m85c = false;
                        }
                        if (b == 0) {
                            if (m96a() == null || m96a().g() != -1) {
                                d((byte) 10);
                            } else {
                                d((byte) 7);
                            }
                        } else if (((byte) (b & 128)) == Byte.MIN_VALUE && b != -1) {
                            d((byte) 1);
                        }
                        if (b != -1) {
                            byte b4 = (byte) (b & Byte.MAX_VALUE);
                            if (b4 > 0 && b4 <= 50) {
                                d((byte) 9);
                            } else if (b4 >= 51 && b4 <= 100) {
                                if (m85c && m96a.m85c()) {
                                    d((byte) 5);
                                } else {
                                    byte a2 = a(this.f133c, this.d, true);
                                    if ((m96a.g() == -1 || m96a.g() >= a2) && a2 >= 0) {
                                        d((byte) 5);
                                    } else {
                                        d((byte) 10);
                                    }
                                }
                            }
                        }
                    }
                    if (((j) this).f272a == 5) {
                        ((j) this).f271a.a((byte) 5, false);
                    } else if (((j) this).f272a == 1 || ((j) this).f272a == 7) {
                        ((j) this).f271a.a((byte) 1, false);
                    }
                    this.f147a.a(true);
                }
            }
        } catch (Exception e3) {
            mobak.a.a.a(new StringBuffer("defineMenu ").append(e3).toString());
        }
    }

    @Override // mobak.b.b.j
    protected final void c(int i) {
        switch (m.a.getGameAction(i)) {
            case 1:
                if (this.d > 0) {
                    this.d = (byte) (this.d - 1);
                    return;
                }
                return;
            case 2:
                if (this.f133c > 0) {
                    this.f133c = (byte) (this.f133c - 1);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                return;
            case 5:
                if (this.f133c < 4) {
                    this.f133c = (byte) (this.f133c + 1);
                    return;
                }
                return;
            case 6:
                if (this.d < 5) {
                    this.d = (byte) (this.d + 1);
                    return;
                }
                return;
        }
    }

    public final void a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                break;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < 6) {
                    if (this.f132a[b2][b4] == -1) {
                        this.f132a[b2][b4] = 0;
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
        byte b5 = 0;
        while (true) {
            byte b6 = b5;
            if (b6 >= bArr.length) {
                return;
            }
            byte b7 = (byte) ((bArr[b6] & (-16)) >> 4);
            byte b8 = (byte) (bArr[b6] & 15);
            if (b7 >= 0 && b7 < 5 && b8 >= 0 && b8 < 6) {
                this.f132a[b7][b8] = -1;
            }
            b5 = (byte) (b6 + 1);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static final byte m91a(byte b) {
        return (byte) ((b & (-16)) >> 4);
    }

    /* renamed from: b, reason: collision with other method in class */
    public static final byte m92b(byte b) {
        return (byte) (b & 15);
    }

    public final void b(byte[] bArr) {
        mobak.b.a.f m96a;
        byte g;
        try {
            this.f138b = null;
            if (bArr == null || bArr.length == 0 || (g = (m96a = m96a()).g()) == -1) {
                return;
            }
            this.f138b = new byte[(g << 1) + 1][(g << 1) + 1];
            for (short s = 0; s < bArr.length; s = (short) (s + 1)) {
                this.f138b[s % ((g << 1) + 1)][s / ((g << 1) + 1)] = bArr[s];
            }
            byte e2 = m96a.e();
            byte f = m96a.f();
            for (byte b = 0; b < 5; b = (byte) (b + 1)) {
                for (byte b2 = 0; b2 < 6; b2 = (byte) (b2 + 1)) {
                    byte b3 = (byte) ((b - e2) + g);
                    byte b4 = (byte) ((b2 - f) + g);
                    if (b3 >= 0 && b4 >= 0 && b3 < (2 * g) + 1 && b4 < (2 * g) + 1 && this.f138b[b3][b4] <= g) {
                        this.f132a[b][b2] = (byte) (this.f132a[b][b2] | Byte.MIN_VALUE);
                    }
                }
            }
        } catch (Exception e3) {
            mobak.a.a.a(new StringBuffer("set unit environs: ").append(e3.getMessage()).toString());
        }
    }

    public final void a(byte b, byte b2, byte b3) {
        try {
            mobak.b.a.f m98a = m98a(b);
            if (m98a != null) {
                m98a.d(b2);
                m98a.c(b3);
                for (byte b4 = 0; b4 < 5; b4 = (byte) (b4 + 1)) {
                    for (byte b5 = 0; b5 < 6; b5 = (byte) (b5 + 1)) {
                        if (this.f132a[b4][b5] != -1) {
                            if (((byte) (this.f132a[b4][b5] & Byte.MAX_VALUE)) == b && !(b4 == b2 && b5 == b3)) {
                                this.f132a[b4][b5] = 0;
                                mobak.a.a.a(new StringBuffer("BattleScreen: misplaced unit №").append(String.valueOf((int) b)).append(" found in (").append(String.valueOf((int) b4)).append(", ").append(String.valueOf((int) b5)).append(") but must be in (").append(String.valueOf((int) b2)).append(", ").append(String.valueOf((int) b3)).append(")").toString());
                            } else if (((byte) (this.f132a[b4][b5] & Byte.MAX_VALUE)) != b && b4 == b2 && b5 == b3) {
                                this.f132a[b4][b5] = b;
                                mobak.a.a.a(new StringBuffer("BattleScreen: unit №").append(String.valueOf((int) b)).append(" must be in (").append(String.valueOf((int) b4)).append(", ").append(String.valueOf((int) b5)).append(") but it wasn't there").toString());
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("BattleScreen.reassureActiveUnitPosition (").append(String.valueOf((int) b)).append(", ").append(String.valueOf((int) b2)).append(", ").append(String.valueOf((int) b3)).append(") error: ").append(e2.toString()).toString());
        }
    }

    private void o() {
        this.f138b = null;
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                return;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < 6) {
                    if (this.f132a[b2][b4] != -1 && ((byte) (this.f132a[b2][b4] & Byte.MIN_VALUE)) == Byte.MIN_VALUE) {
                        this.f132a[b2][b4] = (byte) (this.f132a[b2][b4] & Byte.MAX_VALUE);
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    public final void c(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        byte b = (byte) ((bArr[0] & 240) >> 4);
        a(new f(this, bArr, this.f132a[b][(byte) (bArr[0] & 15)]));
    }

    public final void a(byte b, int i) {
        try {
            this.f141e = false;
            o();
            if (b > 0 && b <= 50) {
                this.f148a = null;
                if (!this.f134a) {
                    this.f135d = (short) (this.f135d + 1);
                    mobak.b.a.b.a.f71a = mobak.b.a.b.a.m59a((byte) 1) != null;
                    if (i > 0) {
                        e = i;
                    }
                    this.f139a = System.currentTimeMillis();
                    this.f142f = false;
                    ((j) this).f271a.a(a, false, true, true);
                }
                this.f134a = true;
            }
            if (b >= 51 && b <= 100) {
                if (this.f134a || this.f139a == 0) {
                    this.f135d = (short) (this.f135d + 1);
                    ((j) this).f271a.a(a, true, true, true);
                    e = i;
                    this.f139a = System.currentTimeMillis();
                }
                this.f134a = false;
            }
            mobak.b.a.f m96a = m96a();
            if (m96a != null) {
                m96a.c(false);
            }
            this.f136e = b;
            mobak.b.a.f m98a = m98a(b);
            if (m98a != null) {
                m98a.c(true);
                if (this.f134a) {
                    this.f133c = m98a.e();
                    this.d = m98a.f();
                }
            }
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("setActiveUnit: ").append(e2.getMessage()).toString());
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public final void m93b() {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                break;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < 6) {
                    byte b5 = (byte) (this.f132a[b2][b4] & Byte.MAX_VALUE);
                    if (b5 > 0 && b5 <= 50) {
                        this.f132a[b2][b4] = 0;
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
        mobak.b.a.f[] a2 = mobak.b.a.b.a.a();
        if (a2 == null || a2.length <= 0) {
            return;
        }
        byte b6 = 0;
        while (true) {
            byte b7 = b6;
            if (b7 >= a2.length) {
                return;
            }
            if (a2[b7] != null) {
                this.f132a[a2[b7].c()][5] = (byte) (b7 + 1);
                a2[b7].d(b7);
                a2[b7].c((byte) 5);
            }
            b6 = (byte) (b7 + 1);
        }
    }

    public final void c() {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                break;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < 6) {
                    byte b5 = (byte) (this.f132a[b2][b4] & Byte.MAX_VALUE);
                    if (b5 >= 51 && b5 <= 100) {
                        this.f132a[b2][b4] = 0;
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
        if (this.f149a == null) {
            return;
        }
        mobak.b.a.f[] a2 = this.f149a.a();
        byte b6 = 0;
        while (true) {
            byte b7 = b6;
            if (b7 >= a2.length) {
                return;
            }
            if (a2[b7] != null) {
                this.f132a[(5 - a2[b7].c()) - 1][0] = (byte) (b7 + 51);
                a2[b7].d((byte) ((5 - a2[b7].c()) - 1));
                a2[b7].c((byte) 0);
            }
            b6 = (byte) (b7 + 1);
        }
    }

    private byte[] a(byte b, byte b2) {
        byte[] bArr;
        try {
            mobak.b.a.f m96a = m96a();
            if (m96a == null || b < 0 || b >= 5 || b2 < 0 || b2 >= 6) {
                return null;
            }
            m96a.d(false);
            if (this.f138b == null || this.f138b.length <= 1) {
                byte abs = (byte) Math.abs(b - m96a.e());
                byte abs2 = (byte) Math.abs(b2 - m96a.f());
                byte[] bArr2 = new byte[abs + abs2 + 1];
                bArr = bArr2;
                bArr2[bArr.length - 1] = m95a(b, b2);
                byte b3 = b;
                byte b4 = b2;
                if (abs == 0) {
                    for (byte b5 = 1; b5 < bArr.length; b5 = (byte) (b5 + 1)) {
                        b4 = b2 - m96a.f() > 0 ? (byte) (b4 - 1) : (byte) (b4 + 1);
                        bArr[(bArr.length - 1) - b5] = m95a(b, b4);
                    }
                } else if (abs2 == 0) {
                    for (byte b6 = 1; b6 < bArr.length; b6 = (byte) (b6 + 1)) {
                        b3 = b - m96a.e() > 0 ? (byte) (b3 - 1) : (byte) (b3 + 1);
                        bArr[(bArr.length - b6) - 1] = m95a(b3, b2);
                    }
                } else {
                    boolean z = false;
                    for (byte b7 = 1; b7 < bArr.length; b7 = (byte) (b7 + 1)) {
                        if ((z || b4 == m96a.f()) && b3 != m96a.e()) {
                            b3 = b - m96a.e() > 0 ? (byte) (b3 - 1) : (byte) (b3 + 1);
                        } else {
                            b4 = b2 - m96a.f() > 0 ? (byte) (b4 - 1) : (byte) (b4 + 1);
                        }
                        z = !z;
                        bArr[(bArr.length - 1) - b7] = m95a(b3, b4);
                    }
                }
            } else {
                byte e2 = (byte) ((b - m96a.e()) + m96a.g());
                byte f = (byte) ((b2 - m96a.f()) + m96a.g());
                bArr = new byte[this.f138b[e2][f] + 1];
                m96a.e();
                m96a.g();
                m96a.f();
                m96a.g();
                bArr[bArr.length - 1] = m95a(b, b2);
                boolean z2 = false;
                byte b8 = 2;
                while (!z2) {
                    z2 = true;
                    byte b9 = e2;
                    byte b10 = f;
                    if (e2 > 0 && this.f138b[e2 - 1][f] < this.f138b[b9][b10]) {
                        b9 = (byte) (e2 - 1);
                    }
                    if (e2 < (m96a.g() << 1) && this.f138b[e2 + 1][f] < this.f138b[b9][b10]) {
                        b9 = (byte) (e2 + 1);
                    }
                    if (f > 0 && this.f138b[e2][f - 1] < this.f138b[b9][b10]) {
                        b10 = (byte) (f - 1);
                    }
                    if (f < (m96a.g() << 1) && this.f138b[e2][f + 1] < this.f138b[b9][b10]) {
                        b10 = (byte) (f + 1);
                    }
                    if (b9 != e2 || b10 != f) {
                        if (b8 <= bArr.length) {
                            e2 = b9;
                            f = b10;
                            bArr[bArr.length - b8] = m95a((byte) ((m96a.e() + e2) - m96a.g()), (byte) ((m96a.f() + f) - m96a.g()));
                            b8 = (byte) (b8 + 1);
                            z2 = false;
                        }
                    }
                }
            }
            bArr[0] = m95a(m96a.e(), m96a.f());
            return bArr;
        } catch (Exception e3) {
            mobak.a.a.a(new StringBuffer("getStep ").append(e3).toString());
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m94a(byte b, byte b2) {
        byte[] a2 = a(b, b2);
        if (a2 != null) {
            this.f148a = new mobak.a.a.l(mobak.a.a.b.f33a[35], (short) (1 + a2.length), (short) 0);
            try {
                this.f148a.a((byte) a2.length);
                this.f148a.a(a2);
            } catch (Exception unused) {
            }
            a(new f(this, a2, this.f136e));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static byte m95a(byte b, byte b2) {
        return (byte) (((byte) ((b << 4) & (-16))) | ((byte) (b2 & 15)));
    }

    public final void a(boolean z, mobak.b.a.f fVar, int i) {
        mobak.b.a.f[] fVarArr = z ? this.f144a : this.f145b;
        byte b = -1;
        if (fVarArr == null) {
            fVarArr = new mobak.b.a.f[1];
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= fVarArr.length) {
                break;
            }
            if (fVarArr[b3] == null) {
                b = b3;
                break;
            }
            b2 = (byte) (b3 + 1);
        }
        if (b < 0) {
            b = (byte) fVarArr.length;
            mobak.b.a.f[] fVarArr2 = new mobak.b.a.f[fVarArr.length + 1];
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            fVarArr = fVarArr2;
        }
        fVarArr[b] = fVar;
        e += i;
        if (z) {
            this.f144a = fVarArr;
            this.f132a[fVar.e()][fVar.f()] = (byte) (fVar.c() + 1);
        } else {
            this.f145b = fVarArr;
            this.f132a[fVar.e()][fVar.f()] = (byte) (fVar.c() + 51);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private mobak.b.a.f m96a() {
        if (this.f136e <= 0) {
            return null;
        }
        try {
            return m98a(this.f136e);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("cannot get active group: ").append(e2).toString());
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m97a(byte b) {
        try {
            return m98a(b) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final mobak.b.a.f m98a(byte b) {
        if (b > 0 && b <= 5) {
            return mobak.b.a.b.a.a((byte) (b - 1));
        }
        if (b > 5 && b <= 50) {
            if (this.f144a == null) {
                throw new Exception(new StringBuffer("1 bad unit index ").append((int) b).toString());
            }
            if (this.f144a.length <= b - 6) {
                throw new Exception(new StringBuffer("2 bad unit index ").append((int) b).toString());
            }
            return this.f144a[b - 6];
        }
        if (b >= 51 && b <= 55) {
            return this.f149a.a((byte) (b - 51));
        }
        if (b <= 55 || b > 100) {
            throw new Exception(new StringBuffer("5 bad unit index ").append((int) b).toString());
        }
        if (this.f145b == null) {
            throw new Exception(new StringBuffer("3 bad unit index ").append((int) b).toString());
        }
        if (this.f145b.length <= b - 56) {
            throw new Exception(new StringBuffer("4 bad unit index ").append((int) b).toString());
        }
        return this.f145b[b - 56];
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (r0[0] < 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        if (r0 < 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0158, code lost:
    
        if (r0 < 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte a(byte r8, byte r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mobak.b.b.a.a(byte, byte, boolean):byte");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0182, code lost:
    
        if (r0[0] < 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0199, code lost:
    
        if (r0 < 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b0, code lost:
    
        if (r0 < 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p() {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mobak.b.b.a.p():void");
    }

    private void a(c cVar) {
        if (cVar == null) {
            return;
        }
        this.f143a[this.h] = cVar;
        this.h = (byte) (this.h + 1);
        if (this.h >= this.f143a.length) {
            this.h = (byte) 0;
        }
        d((byte) -1);
    }

    public final void b(byte b, int i) {
        a(new e(this, b, i));
    }

    /* renamed from: b, reason: collision with other method in class */
    public final void m99b(byte b) {
        if (1 == this.j) {
            this.j = (byte) 0;
            this.f141e = false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m100a(boolean z) {
        Image a2 = z ? mobak.c.a(mobak.c.a("magic_success.png")) : mobak.c.a(mobak.c.a("magic_failure.png"));
        a(new d(this, a2, (short) m.b(a2), m89a(this.l), (short) (b(this.m) - 24)));
    }

    public final void a(byte b, byte b2, byte b3, byte b4) {
        byte b5 = (byte) (this.f132a[b][b2] & Byte.MAX_VALUE);
        this.f132a[b][b2] = (byte) (this.f132a[b][b2] & Byte.MIN_VALUE);
        this.f132a[b3][b4] = (byte) (this.f132a[b3][b4] | b5);
    }

    private boolean d(int i, int i2) {
        if (i < a() || i2 < b() || i > a() + 125 || i2 > b() + 168) {
            return false;
        }
        byte a2 = (byte) ((i - a()) / 25);
        byte b = (byte) ((i2 - b()) / 24);
        if (a2 < 0) {
            a2 = 0;
        }
        if (a2 >= 5) {
            a2 = 4;
        }
        if (b < 0) {
            b = 0;
        }
        if (b >= 6) {
            b = 5;
        }
        this.f133c = a2;
        this.d = b;
        return true;
    }

    @Override // mobak.b.b.j
    protected final boolean a(int i, int i2, int i3) {
        return false;
    }

    @Override // mobak.b.b.j
    protected final boolean a(int i, int i2) {
        d(i, i2);
        mo90a();
        return true;
    }

    @Override // mobak.b.b.j
    protected final boolean b(int i, int i2, int i3) {
        d(i, i2);
        mo90a();
        if (r.a(i, i2) || r.b(i, i2) || ((j) this).f271a.b() || ((j) this).f271a.c()) {
            return true;
        }
        m167a();
        return true;
    }

    @Override // mobak.b.b.j
    /* renamed from: b */
    protected final boolean mo108b(int i, int i2) {
        return a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(a aVar, byte b) {
        return (byte) (b & Byte.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static boolean m101a(a aVar, byte b) {
        return aVar.m97a(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[][] a(a aVar) {
        return aVar.f132a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static short m102a(a aVar, byte b) {
        return aVar.m89a(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short b(a aVar, byte b) {
        return aVar.b(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(a aVar, byte b, mobak.b.a.f fVar) {
        if (b > 0 && b <= 5) {
            mobak.b.a.b.a.a((byte) (b - 1), (mobak.b.a.f) null);
            return;
        }
        if (b > 5 && b <= 50) {
            if (aVar.f144a == null || aVar.f144a.length <= b - 6) {
                return;
            }
            aVar.f144a[b - 6] = null;
            return;
        }
        if (b >= 51 && b <= 55) {
            aVar.f149a.a((byte) (b - 51), (mobak.b.a.f) null);
        } else {
            if (b <= 55 || b > 100 || aVar.f145b == null || aVar.f145b.length <= b - 56) {
                return;
            }
            aVar.f145b[b - 56] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static void m103a(a aVar, byte b) {
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= 5) {
                return;
            }
            byte b4 = 0;
            while (true) {
                byte b5 = b4;
                if (b5 < 6) {
                    if (((byte) (aVar.f132a[b3][b5] & Byte.MAX_VALUE)) == b) {
                        aVar.f132a[b3][b5] = (byte) (aVar.f132a[b3][b5] & Byte.MIN_VALUE);
                        return;
                    }
                    b4 = (byte) (b5 + 1);
                }
            }
            b2 = (byte) (b3 + 1);
        }
    }
}
