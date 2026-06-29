package mobak.b.b;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: LordmancerL.jar:mobak/b/b/i.class */
public class i {
    private static short a = -1;
    private static short b = -1;
    private static short c = -1;
    private static short d = -1;
    private static short e = -1;

    /* renamed from: d, reason: collision with other field name */
    private byte f251d;

    /* renamed from: a, reason: collision with other field name */
    private int f252a;

    /* renamed from: e, reason: collision with other field name */
    private byte f255e;

    /* renamed from: a, reason: collision with other field name */
    private int[] f256a;

    /* renamed from: a, reason: collision with other field name */
    private String f257a;

    /* renamed from: c, reason: collision with other field name */
    byte f258c;

    /* renamed from: b, reason: collision with other field name */
    byte f254b = -1;

    /* renamed from: a, reason: collision with other field name */
    byte f253a = -1;

    public static Image a() {
        if (a == -1) {
            a = mobak.c.a("herouse.png");
        }
        return mobak.c.a(a);
    }

    public static final byte a(byte b2) {
        switch (b2) {
            case 1:
                return (byte) 22;
            case 2:
                return (byte) 5;
            case 3:
                return (byte) 4;
            case 4:
                return (byte) 5;
            case 5:
                return (byte) 1;
            default:
                return (byte) 1;
        }
    }

    public final void a(int i) {
        this.f252a = i;
    }

    public final void a(int[] iArr) {
        this.f256a = iArr;
    }

    public final void a(String str) {
        this.f257a = str;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m154a(byte b2) {
        this.f251d = b2;
    }

    public void a(byte b2, byte b3, boolean z) {
        b(b2, b3, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(byte b2, byte b3, boolean z) {
        if (b2 == this.f253a && this.f254b == b3) {
            return;
        }
        if (this.f253a >= 0 && this.f254b >= 0) {
            mobak.c.m226a(this);
        }
        this.f253a = b2;
        this.f254b = b3;
        if (m156a()) {
            mobak.c.a(this, z);
            if (m165c()) {
                return;
            }
            mobak.c.m227b(this);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int[] m155a() {
        return this.f256a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m156a() {
        return ((byte) (this.f258c & Byte.MIN_VALUE)) != Byte.MIN_VALUE;
    }

    public void a(Graphics graphics, int i, int i2) {
        Image image;
        if (graphics != null && m156a()) {
            short s = (short) ((this.f253a * 25) - i);
            short s2 = (short) ((this.f254b * 25) - i2);
            if (s < 0 || s2 < 0 || s > m.a.getWidth() || s2 > m.a.getHeight()) {
                return;
            }
            switch (this.f251d) {
                case 1:
                    image = a();
                    break;
                case 2:
                    if (b == -1) {
                        b = mobak.c.a("city-2x2.png");
                    }
                    image = mobak.c.a(b);
                    break;
                case 3:
                    if (c == -1) {
                        c = mobak.c.a("boxes.png");
                    }
                    image = mobak.c.a(c);
                    break;
                case 4:
                    if (d == -1) {
                        d = mobak.c.a("generators.png");
                    }
                    image = mobak.c.a(d);
                    break;
                case 5:
                    if (e == -1) {
                        e = mobak.c.a("teleport.png");
                    }
                    image = mobak.c.a(e);
                    break;
                default:
                    image = null;
                    break;
            }
            Image image2 = image;
            if (image != null) {
                short a2 = (short) (m.a(image2) / a(this.f251d));
                short b2 = (short) m.b(image2);
                m.a(graphics, image2, a2 * this.f255e, 0, a2, b2, 0, s, (s2 + 25) - b2, 0);
                if (this.f251d == 1 && this.f258c == 7) {
                    j.a(graphics, (byte) 14, (short) (s + 5), (short) (((s2 + 5) + 25) - b2), 0);
                }
            }
            if (this.f257a == null || this.f257a.length() <= 0) {
                return;
            }
            m.a(graphics, 0);
            short s3 = (short) ((this.f253a * 25) - i);
            short s4 = (short) ((((this.f254b + 1) * 25) - i2) + 1);
            graphics.fillRect(s3 - 1, s4 - 1, (byte) (j.a.a(this.f257a) + 2), j.a.f370a);
            j.a.a(graphics, this.f257a, s3, s4 - 1, 0);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int m157a() {
        return this.f252a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final byte m158a() {
        return this.f253a;
    }

    public final byte b() {
        return this.f254b;
    }

    public final byte c() {
        return this.f251d;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final String m159a() {
        return this.f257a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("map object\n");
        stringBuffer.append("name: [").append(this.f257a).append("]\n");
        stringBuffer.append("type: [").append((int) this.f251d).append("]\n");
        if (this.f256a != null && this.f256a.length > 0) {
            stringBuffer.append("actions: ");
            byte b2 = 0;
            while (true) {
                byte b3 = b2;
                if (b3 >= this.f256a.length) {
                    break;
                }
                stringBuffer.append(this.f256a[b3]).append(" ");
                b2 = (byte) (b3 + 1);
            }
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m160a() {
    }

    public final void b(byte b2) {
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m161b() {
    }

    public final void c(byte b2) {
        this.f255e = b2;
        mobak.c.m226a(this);
        if (m165c()) {
            return;
        }
        mobak.c.m227b(this);
    }

    public final void d(byte b2) {
    }

    public final byte d() {
        return this.f258c;
    }

    public final void e(byte b2) {
        boolean m156a = m156a();
        this.f258c = b2;
        if (m156a && !m156a()) {
            mobak.c.m226a(this);
        } else {
            if (m156a || !m156a()) {
                return;
            }
            mobak.c.a(this, false);
            mobak.c.m227b(this);
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    public final void m162c() {
        this.f258c = (byte) (this.f258c & Byte.MIN_VALUE);
    }

    /* renamed from: d, reason: collision with other method in class */
    public final void m163d() {
        this.f258c = (byte) (this.f258c & Byte.MAX_VALUE);
    }

    /* renamed from: b, reason: collision with other method in class */
    public final boolean m164b() {
        return this.f251d == 2 || this.f251d == 4 || this.f251d == 5 || this.f251d == 3;
    }

    public final void e() {
        String str = null;
        String str2 = null;
        switch (this.f251d) {
            case 2:
                str = new StringBuffer().append(mobak.c.d.a(194)).append(mobak.c.d.c(this.f255e + 1)).toString();
                str2 = mobak.c.d.a(195);
                break;
            case 3:
                if (this.f255e <= 1) {
                    System.out.println("MapObject.getInformation()");
                    str = mobak.c.d.a(97);
                    str2 = mobak.c.d.a(198);
                    break;
                } else {
                    str = mobak.c.d.a(96);
                    str2 = mobak.c.d.a(199);
                    break;
                }
            case 4:
                str = new StringBuffer().append(mobak.c.d.a(196)).append(mobak.c.d.c(this.f255e + 1)).toString();
                str2 = mobak.c.d.a(197);
                break;
            case 5:
                str = mobak.c.d.a(200);
                str2 = mobak.c.d.a(201);
                break;
        }
        m.a(str, str2);
    }

    /* renamed from: c, reason: collision with other method in class */
    private boolean m165c() {
        mobak.d m232a = mobak.c.m232a(this.f251d);
        if (m232a.f380a == null) {
            return false;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= m232a.f380a.length) {
                return false;
            }
            if (m232a.f380a[b3] == this.f255e) {
                return true;
            }
            b2 = (byte) (b3 + 1);
        }
    }
}
