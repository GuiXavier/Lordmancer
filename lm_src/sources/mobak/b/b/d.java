package mobak.b.b;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: LordmancerL.jar:mobak/b/b/d.class */
public final class d extends c {
    private Image a;

    /* renamed from: a, reason: collision with other field name */
    private short f235a;
    private short b;
    private short c;
    private short d;
    private short e;

    public d(a aVar, Image image, short s, short s2, short s3) {
        super(aVar);
        this.c = (short) 0;
        this.a = image;
        this.f235a = s;
        this.b = (short) (m.a(this.a) / this.f235a);
        this.d = s2;
        this.e = s3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mobak.b.b.c
    public final void a(Graphics graphics) {
        if (this.c < this.b) {
            m.a(graphics, this.a, this.f235a * this.c, 0, this.f235a, m.b(this.a), 0, this.d + ((27 - this.f235a) / 2), this.e, 0);
        }
        this.c = (short) (this.c + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mobak.b.b.c
    public final boolean a() {
        if (this.a == null || this.c >= this.b) {
            return super.a();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mobak.b.b.c
    /* renamed from: a */
    public final void mo149a() {
    }
}
