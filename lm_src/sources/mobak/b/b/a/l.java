package mobak.b.b.a;

import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/a/l.class */
public final class l extends q {
    private mobak.b.b.p b;
    private mobak.b.b.p c;
    private mobak.b.b.p d;
    private n[] a;

    /* renamed from: a, reason: collision with other field name */
    private short[][] f180a;

    /* renamed from: a, reason: collision with other field name */
    private String[][] f181a;
    private int e;
    private int g;

    /* renamed from: c, reason: collision with other field name */
    private String f182c;

    /* renamed from: d, reason: collision with other field name */
    private String f183d;

    /* renamed from: b, reason: collision with other field name */
    private short[][] f184b;

    /* renamed from: b, reason: collision with other field name */
    private String[][] f185b;

    /* renamed from: a, reason: collision with other field name */
    private boolean f186a;

    /* renamed from: c, reason: collision with other field name */
    private byte f187c;

    /* renamed from: d, reason: collision with other field name */
    private boolean f188d;
    private int h;
    private short j;

    public l(int i, int i2) {
        this.a = null;
        this.f186a = false;
        this.f187c = (byte) 0;
        this.h = 16773632;
        this.g = i2;
        this.e = 0;
        this.f186a = true;
        b();
    }

    public l(int i) {
        this.a = null;
        this.f186a = false;
        this.f187c = (byte) 0;
        this.h = 16773632;
        this.e = i;
        this.g = i;
        b();
    }

    private void b() {
        this.j = mobak.c.a("plus_minus.png");
        this.f182c = String.valueOf(this.e);
        this.f183d = String.valueOf(this.g);
        this.b = new mobak.b.b.p((short) 2, mo90a(), (short) (mobak.b.b.m.a.getWidth() - 4), (short) ((mobak.b.b.m.a.getHeight() - mo90a()) - r.a()), false, false);
        this.b.f352a = 10;
        this.b.a(new StringBuffer().append(mobak.c.d.a(134)).append(":    \f4").append(this.f182c).append(" / ").append(this.f183d).toString(), mobak.b.b.j.f259b, false, -1);
        this.c = new mobak.b.b.p((short) 2, (short) this.b.f352a, (short) (mobak.b.b.m.a.getWidth() - 4), (short) 55, false, false);
        this.b.a(this.c);
        this.c.f352a = 2;
        this.f184b = new short[mobak.b.a.b.a.f81a.length][2];
        this.f185b = new String[mobak.b.a.b.a.f81a.length][2];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= mobak.b.a.b.a.f81a.length) {
                break;
            }
            this.c.a(new StringBuffer().append(mobak.b.a.b.a.f81a[b2].f101a).append("\f4").append(String.valueOf(mobak.b.a.b.a.f81a[b2].b)).append("\f7��").toString(), mobak.b.b.j.f259b, (byte) 2, false, -1);
            this.f184b[b2][0] = (short) mobak.b.a.b.a.f81a[b2].f100a;
            this.f185b[b2][0] = String.valueOf((int) this.f184b[b2][0]);
            b = (byte) (b2 + 1);
        }
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= mobak.b.a.b.a.f81a.length * 3) {
                break;
            }
            if (b4 % 3 != 0 && this.c.a((int) b4) != null) {
                if (b4 % 3 == 1) {
                    this.c.a((int) b4).a((short) (((mobak.b.b.m.a.getWidth() - 32) * 60) / 100));
                } else if (b4 % 3 == 2) {
                    this.c.a((int) b4).a((short) (((mobak.b.b.m.a.getWidth() - 32) * 80) / 100));
                }
            }
            b3 = (byte) (b4 + 1);
        }
        this.b.f352a += this.c.f352a + 2;
        this.f180a = new short[mobak.b.a.b.a.f83b.length][2];
        this.f181a = new String[mobak.b.a.b.a.f83b.length][2];
        this.d = new mobak.b.b.p((short) 2, (short) this.b.f352a, (short) (mobak.b.b.m.a.getWidth() - 4), (short) (mobak.b.b.m.a.getHeight() - this.b.f352a), false, false);
        this.d.f352a = 2;
        this.b.a(this.d);
        byte b5 = 0;
        while (true) {
            byte b6 = b5;
            if (b6 >= mobak.b.a.b.a.f83b.length) {
                break;
            }
            this.d.a(new StringBuffer().append(mobak.b.a.b.a.f83b[b6].f101a).append("\f4").append(String.valueOf(mobak.b.a.b.a.f83b[b6].b)).append("\f7��").toString(), mobak.b.b.j.f259b, (byte) 2, false, -1);
            this.f180a[b6][0] = (short) mobak.b.a.b.a.f83b[b6].f100a;
            this.f181a[b6][0] = String.valueOf((int) this.f180a[b6][0]);
            b5 = (byte) (b6 + 1);
        }
        byte b7 = 0;
        while (true) {
            byte b8 = b7;
            if (b8 >= mobak.b.a.b.a.f83b.length * 3) {
                this.f188d = false;
                this.c.a(0).b(this.h, 2);
                ((mobak.b.b.j) this).f271a = new r(new byte[]{81}, new byte[]{55}, null);
                ((q) this).f190b = mobak.c.d.a(144);
                ((mobak.b.b.j) this).f271a.a((short) 148, (byte) 55);
                return;
            }
            if (b8 % 3 != 0 && this.d.a((int) b8) != null) {
                if (b8 % 3 == 1) {
                    this.d.a((int) b8).a((short) (((mobak.b.b.m.a.getWidth() - 32) * 60) / 100));
                } else if (b8 % 3 == 2) {
                    this.d.a((int) b8).a((short) (((mobak.b.b.m.a.getWidth() - 32) * 80) / 100));
                }
            }
            b7 = (byte) (b8 + 1);
        }
    }

    public final void a(byte b) {
        if (b <= 0) {
            return;
        }
        this.a = new n[b];
    }

    public final void a(byte b, byte b2, int[][] iArr) {
        if (b < 0 || this.a == null || b >= this.a.length) {
            return;
        }
        if (this.a[b] == null) {
            this.a[b] = new n(this);
        }
        n[] nVarArr = this.a;
        this.a[b].a = iArr;
    }

    @Override // mobak.b.b.j
    /* renamed from: a */
    public final void mo90a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v167, types: [int[][]] */
    /* JADX WARN: Type inference failed for: r0v86, types: [int[][]] */
    @Override // mobak.b.b.j
    protected final void c(int i) {
        if (!this.f188d) {
            if (mobak.b.b.m.a.getGameAction(i) == 6) {
                if (this.f187c < (this.f184b.length << 1)) {
                    b((byte) (this.f187c + 3));
                    return;
                } else {
                    b((byte) 0);
                    return;
                }
            }
            if (mobak.b.b.m.a.getGameAction(i) == 1) {
                if (this.f187c > 0) {
                    b((byte) (this.f187c - 3));
                    return;
                } else {
                    b((byte) ((this.f184b.length - 1) * 3));
                    return;
                }
            }
            return;
        }
        if (mobak.b.b.m.a.getGameAction(i) == 1) {
            if (this.e <= 0) {
                mobak.b.b.m.a(mobak.c.d.a(135), mobak.c.d.a(136));
                return;
            }
            this.e--;
            this.f182c = String.valueOf(this.e);
            short[] sArr = this.f184b[this.f187c / 3];
            sArr[1] = (short) (sArr[1] + 1);
            this.f185b[this.f187c / 3][1] = String.valueOf((int) this.f184b[this.f187c / 3][1]);
            ((t) this.b.a(1)).a = new StringBuffer().append(this.f182c).append(" / ").append(this.f183d).toString();
            t tVar = (t) this.c.a((int) ((byte) (2 + this.f187c)));
            if (this.f184b[this.f187c / 3][1] == 0) {
                tVar.a = " ";
            } else if (this.f184b[this.f187c / 3][1] > 0) {
                tVar.a = new StringBuffer("+").append(this.f185b[this.f187c / 3][1]).toString();
            } else {
                tVar.a = this.f185b[this.f187c / 3][1];
            }
            if (this.a == null) {
                return;
            }
            short[][] sArr2 = null;
            if (this.f187c / 3 >= 0 && this.f187c / 3 < this.a.length) {
                sArr2 = this.a[this.f187c / 3].a;
            }
            if (sArr2 == null) {
                return;
            }
            byte b = 0;
            while (true) {
                byte b2 = b;
                if (b2 >= sArr2.length) {
                    return;
                }
                byte b3 = 0;
                while (true) {
                    byte b4 = b3;
                    if (b4 >= this.f180a.length) {
                        break;
                    }
                    if (this.f180a[b4][0] == sArr2[b2][0]) {
                        short[] sArr3 = this.f180a[b4];
                        sArr3[1] = (short) (sArr3[1] + sArr2[b2][1]);
                        this.f181a[b4][1] = String.valueOf((int) this.f180a[b4][1]);
                        t tVar2 = (t) this.d.a((int) ((byte) (2 + (3 * b4))));
                        if (this.f180a[b4][1] > 0) {
                            tVar2.a = new StringBuffer("+").append(this.f181a[b4][1]).toString();
                        } else {
                            tVar2.a = this.f181a[b4][1];
                        }
                    } else {
                        b3 = (byte) (b4 + 1);
                    }
                }
                b = (byte) (b2 + 1);
            }
        } else {
            if (mobak.b.b.m.a.getGameAction(i) != 6) {
                return;
            }
            if (this.e + 1 > this.g) {
                mobak.b.b.m.a(mobak.c.d.a(135), mobak.c.d.a(137));
                return;
            }
            if (this.f184b[this.f187c / 3][1] == 0 && !this.f186a) {
                return;
            }
            if (this.f186a && !e()) {
                return;
            }
            this.e++;
            this.f182c = String.valueOf(this.e);
            short[] sArr4 = this.f184b[this.f187c / 3];
            sArr4[1] = (short) (sArr4[1] - 1);
            this.f185b[this.f187c / 3][1] = String.valueOf((int) this.f184b[this.f187c / 3][1]);
            ((t) this.b.a(1)).a = new StringBuffer().append(this.f182c).append(" / ").append(this.f183d).toString();
            t tVar3 = (t) this.c.a((int) ((byte) (2 + this.f187c)));
            if (this.f184b[this.f187c / 3][1] == 0) {
                tVar3.a = " ";
            } else if (this.f184b[this.f187c / 3][1] > 0) {
                tVar3.a = new StringBuffer("+").append(this.f185b[this.f187c / 3][1]).toString();
            } else {
                tVar3.a = this.f185b[this.f187c / 3][1];
            }
            if (this.a == null) {
                return;
            }
            short[][] sArr5 = null;
            if (this.f187c / 3 >= 0 && this.f187c / 3 < this.a.length) {
                sArr5 = this.a[this.f187c / 3].a;
            }
            if (sArr5 == null) {
                return;
            }
            byte b5 = 0;
            while (true) {
                byte b6 = b5;
                if (b6 >= sArr5.length) {
                    return;
                }
                byte b7 = 0;
                while (true) {
                    byte b8 = b7;
                    if (b8 >= this.f180a.length) {
                        break;
                    }
                    if (this.f180a[b8][0] == sArr5[b6][0]) {
                        short[] sArr6 = this.f180a[b8];
                        sArr6[1] = (short) (sArr6[1] - sArr5[b6][1]);
                        this.f181a[b8][1] = String.valueOf((int) this.f180a[b8][1]);
                        t tVar4 = (t) this.d.a((int) ((byte) (2 + (3 * b8))));
                        if (this.f180a[b8][1] == 0) {
                            tVar4.a = "";
                        } else if (this.f180a[b8][1] > 0) {
                            tVar4.a = new StringBuffer("+").append(this.f181a[b8][1]).toString();
                        } else {
                            tVar4.a = this.f181a[b8][1];
                        }
                    } else {
                        b7 = (byte) (b8 + 1);
                    }
                }
                b5 = (byte) (b6 + 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [int[][]] */
    /* JADX WARN: Type inference failed for: r0v65, types: [int] */
    private boolean e() {
        short s = 0;
        for (int i = 0; i < this.f184b.length; i++) {
            if (this.f184b[i][1] < 0) {
                s += this.f184b[i][1];
            }
        }
        if (this.g + s <= 0 && this.f184b[this.f187c / 3][1] <= 0) {
            return false;
        }
        mobak.b.a.b bVar = mobak.b.a.b.a;
        if ((mobak.b.a.b.a(mobak.b.a.b.a.f81a, (byte) this.f184b[this.f187c / 3][0]).b + this.f184b[this.f187c / 3][1]) - 1 < 0) {
            return false;
        }
        if (this.a == null) {
            return true;
        }
        short[][] sArr = null;
        if (this.f187c / 3 >= 0 && this.f187c / 3 < this.a.length) {
            sArr = this.a[this.f187c / 3].a;
        }
        if (sArr == null) {
            return true;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= sArr.length) {
                return true;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 >= this.f180a.length) {
                    break;
                }
                if (this.f180a[b4][0] == sArr[b2][0]) {
                    mobak.b.a.b bVar2 = mobak.b.a.b.a;
                    if ((mobak.b.a.b.a(mobak.b.a.b.a.f83b, (byte) this.f180a[this.f187c / 3][0]).b + this.f180a[this.f187c / 3][1]) - sArr[b2][1] < 0) {
                        return false;
                    }
                } else {
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    private void b(byte b) {
        if (this.c.a(b)) {
            this.c.a((int) this.f187c).m214e();
            this.f187c = b;
            this.c.a((int) this.f187c).b(this.h, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r0 == false) goto L27;
     */
    @Override // mobak.b.b.a.q, mobak.b.b.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(mobak.b.b.a.s r6) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mobak.b.b.a.l.a(mobak.b.b.a.s):boolean");
    }

    @Override // mobak.b.b.j
    /* renamed from: g */
    public final void mo144g() {
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final void a(Graphics graphics) {
        try {
            super.a(graphics);
            this.b.a(graphics, (byte) 0);
            mobak.b.b.m.a(graphics, 5316104);
            graphics.drawLine(0, 30, mobak.b.b.m.a.getWidth(), 30);
            graphics.drawLine(0, 85, mobak.b.b.m.a.getWidth(), 85);
            if (this.f188d) {
                int b = mobak.b.b.m.b(this.j);
                int m190a = mobak.b.b.m.m190a(this.j) / 2;
                mobak.b.b.q a = this.c.a(this.f187c + 1);
                int e = a.e() + ((a.mo204a() - b) / 2);
                int d = a.d() - (m190a << 1);
                int d2 = a.d() + a.mo205b() + m190a;
                mobak.b.b.m.a(graphics, this.j, 2, 1, 1, 0, d, e);
                mobak.b.b.m.a(graphics, this.j, 2, 1, 0, 0, d2, e);
            }
            ((mobak.b.b.j) this).f271a.a(graphics);
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("HeroIncrease ").append(e2.getMessage()).toString());
        }
    }

    private void c() {
        mobak.a.a.l lVar = new mobak.a.a.l(mobak.a.a.b.f33a[53], (short) (4 * this.f184b.length), (short) 0);
        try {
            lVar.a((byte) this.f184b.length);
            for (byte b = 0; b < this.f184b.length; b = (byte) (b + 1)) {
                lVar.b(this.f184b[b][0]);
                lVar.b(this.f184b[b][1]);
            }
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("sendSelection").append(e.toString()).toString());
        }
        mobak.a.a.f15a.a(lVar);
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    /* renamed from: b */
    protected final boolean mo108b(int i, int i2) {
        return a(i, i2);
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean a(int i, int i2) {
        if (!this.f188d) {
            byte c = (byte) this.c.c(i2);
            this.c.a((int) c).m214e();
            b((byte) (c - (c % 3)));
            return true;
        }
        mobak.b.b.q a = this.c.a(this.f187c + 1);
        int b = mobak.b.b.m.b(this.j);
        int m190a = mobak.b.b.m.m190a(this.j) / 2;
        int e = a.e() + ((a.mo204a() - b) / 2);
        int d = a.d() - (m190a << 1);
        int d2 = a.d() + a.mo205b() + m190a;
        if (i2 < e - b || i2 > e + (b << 1)) {
            return true;
        }
        if (i >= d - m190a && i <= d + (m190a << 1)) {
            mobak.b.b.m.a.a(6);
            return true;
        }
        if (i < d2 - m190a || i > d2 + (m190a << 1)) {
            return true;
        }
        mobak.b.b.m.a.a(1);
        return true;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean b(int i, int i2, int i3) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(l lVar) {
        lVar.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(l lVar, int i) {
        lVar.h = 16773632;
        return 16773632;
    }
}
