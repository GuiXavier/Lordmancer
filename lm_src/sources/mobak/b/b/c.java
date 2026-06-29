package mobak.b.b;

import javax.microedition.lcdui.Graphics;

/* loaded from: LordmancerL.jar:mobak/b/b/c.class */
public abstract class c {
    private byte a = 0;

    public c(a aVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Graphics graphics);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.a > 0) {
            return true;
        }
        this.a = (byte) (this.a + 1);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public abstract void mo149a();
}
