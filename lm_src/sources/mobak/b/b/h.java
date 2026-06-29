package mobak.b.b;

import java.util.Random;
import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/h.class */
public final class h extends i {
    private byte d;

    /* renamed from: a, reason: collision with other field name */
    private byte[][] f249a;
    private byte f;
    private byte g;
    private Random a = null;

    /* renamed from: a, reason: collision with other field name */
    private boolean f250a = true;
    private byte h = 0;
    private byte e = -1;
    private byte[][] b = null;

    private Random a() {
        if (this.a == null) {
            this.a = new Random();
        }
        return this.a;
    }

    public h(byte b) {
        this.d = b;
    }

    @Override // mobak.b.b.i
    public final void a(Graphics graphics, int i, int i2) {
        if (graphics != null && m156a()) {
            short s = (short) ((((i) this).f253a * 25) - i);
            short s2 = (short) ((super.f254b * 25) - i2);
            if (s < 0 || s2 < 0 || s > m.a.getWidth() || s2 > m.a.getHeight()) {
                return;
            }
            super.a(graphics, i, i2);
            if (this.f258c == 2 && !m.a.m181a()) {
                try {
                    if (this.e >= 0 && this.f249a != null) {
                        if ((this.f249a[this.e][0] == mobak.b.a.b.a.m60a() && this.f249a[this.e][1] == mobak.b.a.b.a.b()) || m.a.f296a.m201a(this.f249a[this.e][0], this.f249a[this.e][1])) {
                            return;
                        }
                        if (this.h < 5) {
                            this.h = (byte) (this.h + 1);
                            return;
                        }
                        this.h = (byte) 0;
                        b(this.f249a[this.e][0], this.f249a[this.e][1], false);
                        if (this.f250a) {
                            this.e = (byte) (this.e + 1);
                        } else {
                            this.e = (byte) (this.e - 1);
                        }
                        if (this.e >= this.f249a.length) {
                            this.e = (byte) (this.f249a.length - 1);
                            this.f250a = false;
                        }
                        if (this.e < 0) {
                            this.f250a = true;
                            return;
                        }
                        return;
                    }
                    if (a().nextInt(100) > 98) {
                        mobak.c.m226a((i) this);
                        if (this.b == null) {
                            this.f = ((i) this).f253a;
                            this.g = super.f254b;
                            this.b = o.a(this.f, this.g, this.d, this.d);
                        }
                        if (this.b != null) {
                            this.f249a = null;
                            for (short s3 = 0; this.f249a == null && s3 < 10; s3 = (short) (s3 + 1)) {
                                this.f249a = o.a(this.f, this.g, this.b, (byte) (((i) this).f253a + (-this.d) + (2 * this.d * a().nextDouble())), (byte) (super.f254b + (-this.d) + (2 * this.d * a().nextDouble())));
                            }
                            if (this.f249a != null) {
                                this.e = (byte) 0;
                            }
                        }
                        mobak.c.m227b((i) this);
                    }
                } catch (Exception e) {
                    mobak.a.a.a(new StringBuffer("heroObject move ").append(e).toString());
                }
            }
        }
    }

    @Override // mobak.b.b.i
    public final void a(byte b, byte b2, boolean z) {
        this.b = null;
        this.e = (byte) -1;
        b(b, b2, false);
    }
}
