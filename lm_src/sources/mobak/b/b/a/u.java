package mobak.b.b.a;

import javax.microedition.lcdui.Graphics;
import mobak.Main2;

/* loaded from: LordmancerL.jar:mobak/b/b/a/u.class */
public final class u extends q {
    private short j;
    private byte c;
    private String[] a;

    /* renamed from: a, reason: collision with other field name */
    private int[] f210a;

    /* renamed from: j, reason: collision with other field name */
    private mobak.c.a f211j;

    /* renamed from: a, reason: collision with other field name */
    private long f212a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f213a;

    public u(String str, String str2, String str3) {
        this.j = (short) 0;
        this.j = (short) -108;
        mobak.b.b.j.f265a = str;
        ((q) this).f190b = str2;
        ((mobak.b.b.j) this).f279a = new mobak.b.b.p((short) 2, (short) (mo90a() + 8), (short) (mobak.b.b.m.a.getWidth() - 4), (short) (((mobak.b.b.m.a.getHeight() - mo90a()) - 22) - r.a()), false, false, true);
        this.f211j = mobak.b.b.j.f259b;
        ((mobak.b.b.j) this).f279a.a(str3, this.f211j, false, -1);
        ((mobak.b.b.j) this).f271a = new r();
    }

    public u(String str, String str2, String[] strArr, int[] iArr) {
        this.j = (short) 0;
        this.j = (short) -109;
        mobak.b.b.j.f265a = str;
        ((q) this).f190b = str2;
        boolean z = false;
        for (int i = 0; i < iArr.length; i++) {
            z = z || iArr[i] == 280 || iArr[i] == 286;
        }
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                i2++;
            }
            this.a = new String[i2];
            this.f210a = new int[i2];
            int i4 = 0;
            for (int i5 = 0; i5 < iArr.length; i5++) {
                this.a[i4] = strArr[i5];
                this.f210a[i4] = iArr[i5];
                i4++;
            }
            mobak.b.b.a.a.a[] a = mobak.b.b.a.a.b.a();
            if (a != null) {
                int length = this.a.length;
                this.a = Main2.a(this.a, length + a.length);
                this.f210a = Main2.a(this.f210a, length + a.length);
                for (int i6 = 0; i6 < a.length; i6++) {
                    mobak.b.b.a.a.a aVar = a[i6];
                    this.a[length + i6] = aVar.m104a();
                    this.f210a[length + i6] = aVar.a();
                }
            }
        } else {
            this.a = strArr;
            this.f210a = iArr;
        }
        this.c = (byte) 0;
        ((mobak.b.b.j) this).f271a = new r();
        this.f211j = mobak.b.b.j.f;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    public final void a(Graphics graphics) {
        synchronized (this) {
            super.a(graphics);
            switch (this.j) {
                case -109:
                    a(graphics, b(), this.a, this.c, this.f211j);
                    break;
                case -108:
                    ((mobak.b.b.j) this).f279a.a(graphics, (byte) 0);
                    break;
            }
            ((mobak.b.b.j) this).f271a.a(graphics);
        }
    }

    @Override // mobak.b.b.j
    /* renamed from: a */
    public final void mo90a() {
        if (this.j == -109) {
            ((mobak.b.b.j) this).f271a.a(true, false);
            if (mo109a() >= 0) {
                ((mobak.b.b.j) this).f271a.a(true, true);
            }
        }
    }

    private short b() {
        return (short) (mo90a() + 10);
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean a(int i, int i2, int i3) {
        if (System.currentTimeMillis() - this.f212a <= 200 || !mobak.b.b.j.f264c || this.f213a) {
            return false;
        }
        this.f213a = true;
        byte a = a(this.f211j, this.a.length, b(), i2);
        if (a < 0 || a >= this.a.length) {
            return false;
        }
        this.c = a;
        return false;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    /* renamed from: b */
    protected final boolean mo108b(int i, int i2) {
        int i3;
        if (Math.abs(mobak.b.b.j.f262c - mobak.b.b.j.f260a) > 10 || Math.abs(mobak.b.b.j.f263d - mobak.b.b.j.f261b) > 10) {
            mobak.b.b.j.f264c = false;
        }
        if (this.f213a) {
            byte a = a(this.f211j, this.a.length, b(), i2);
            if (a < 0 || a >= this.a.length) {
                return true;
            }
            this.c = a;
            return true;
        }
        int length = this.a.length;
        if (length > 0 && (i3 = (mobak.b.b.j.f263d - i2) / (this.f211j.f370a + 3)) != 0) {
            int height = ((mobak.b.b.m.a.getHeight() - b()) - r.a()) / (this.f211j.f370a + 3);
            if (height < length) {
                ((q) this).f191f += i3;
            }
            if (((q) this).f191f < 0) {
                ((q) this).f191f = 0;
            }
            if (height < length && ((q) this).f191f + height > length) {
                ((q) this).f191f = length - height;
            }
            mobak.b.b.j.f263d = i2;
        }
        mobak.b.b.j.f262c = i;
        return true;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean a(int i, int i2) {
        mobak.b.b.j.f264c = true;
        mobak.b.b.j.f260a = i;
        mobak.b.b.j.f261b = i2;
        mobak.b.b.j.f262c = i;
        mobak.b.b.j.f263d = i2;
        this.f212a = System.currentTimeMillis();
        this.f213a = false;
        if (this.j == -109 || this.j != -108) {
            return false;
        }
        ((mobak.b.b.j) this).f279a.c(i2);
        return true;
    }

    @Override // mobak.b.b.a.q, mobak.b.b.j
    protected final boolean b(int i, int i2, int i3) {
        if (!mobak.b.b.j.f264c || this.j != -109) {
            return false;
        }
        byte a = a(this.f211j, this.a.length, b(), i2);
        if (a >= 0 && a < this.a.length) {
            this.c = a;
        }
        if (((mobak.b.b.j) this).f271a == null) {
            return true;
        }
        mo90a();
        try {
            b(((mobak.b.b.j) this).f271a.a(false, false, true));
            return true;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("TextMenuScreen.pointReleased: ").append(e.toString()).toString());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.b.b.j
    /* renamed from: a */
    public final int mo109a() {
        switch (this.j) {
            case -109:
                return (this.f210a == null || this.c < 0 || this.c >= this.f210a.length) ? super.mo109a() : this.f210a[this.c];
            case -108:
                return ((mobak.b.b.j) this).f279a.m206a();
            default:
                return 0;
        }
    }

    @Override // mobak.b.b.j
    protected final void c(int i) {
        switch (this.j) {
            case -109:
                break;
            case -108:
                if (i != 6 && 6 != mobak.b.b.m.a.getGameAction(i)) {
                    if (i == 1 || 1 == mobak.b.b.m.a.getGameAction(i)) {
                        ((mobak.b.b.j) this).f279a.a();
                        break;
                    }
                } else {
                    ((mobak.b.b.j) this).f279a.b();
                    break;
                }
                break;
            default:
                return;
        }
        if (i == 6 || 6 == mobak.b.b.m.a.getGameAction(i)) {
            if (this.c < this.a.length - 1) {
                this.c = (byte) (this.c + 1);
            } else {
                this.c = (byte) 0;
            }
        } else if (i == 1 || 1 == mobak.b.b.m.a.getGameAction(i)) {
            if (this.c > 0) {
                this.c = (byte) (this.c - 1);
            } else {
                this.c = (byte) (this.a.length - 1);
            }
        }
        int length = this.a.length;
        int height = (((mobak.b.b.m.a.getHeight() - b()) - r.a()) - (this.f211j.f370a + 3)) / (this.f211j.f370a + 3);
        if (this.c < ((q) this).f191f) {
            ((q) this).f191f = this.c;
        }
        if (this.c > ((q) this).f191f + height) {
            ((q) this).f191f = this.c - height;
        }
        if (((q) this).f191f < 0) {
            ((q) this).f191f = 0;
        }
        if (height >= length || ((q) this).f191f + height <= length) {
            return;
        }
        ((q) this).f191f = length - height;
    }

    @Override // mobak.b.b.a.q
    public final void a(String str) {
        synchronized (this) {
            ((mobak.b.b.j) this).f279a.m207c();
            ((mobak.b.b.j) this).f279a.a(str, mobak.b.b.j.f259b, false, -1);
        }
    }

    @Override // mobak.b.b.j
    public final boolean b(s sVar) {
        if (this.f210a != null && this.c >= 0 && this.c < this.f210a.length) {
            if (mobak.b.b.a.a.b.a(this.f210a[this.c]) == null) {
                return super.b(sVar);
            }
            if (sVar.m132a() != 55) {
                return true;
            }
        }
        return super.b(sVar);
    }
}
