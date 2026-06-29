package mobak.b.b;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import mobak.b.b.a.t;

/* loaded from: LordmancerL.jar:mobak/b/b/p.class */
public final class p extends q {
    private short c;
    private short d;

    /* renamed from: a, reason: collision with other field name */
    private boolean f343a;

    /* renamed from: b, reason: collision with other field name */
    private boolean f344b;
    private short e;
    private short f;
    private short g;

    /* renamed from: b, reason: collision with other field name */
    private byte f347b;

    /* renamed from: a, reason: collision with other field name */
    private Vector f348a;

    /* renamed from: e, reason: collision with other field name */
    private int f349e;

    /* renamed from: f, reason: collision with other field name */
    private int f350f;

    /* renamed from: c, reason: collision with other field name */
    private byte f351c;

    /* renamed from: a, reason: collision with other field name */
    public int f352a;

    /* renamed from: c, reason: collision with other field name */
    private boolean f353c;

    /* renamed from: g, reason: collision with other field name */
    private int f354g;

    /* renamed from: d, reason: collision with other field name */
    private boolean f355d;
    private static mobak.c.a a = j.h;
    private static mobak.c.a b = j.i;

    /* renamed from: a, reason: collision with other field name */
    private static mobak.c.a[] f345a = {j.a, j.f259b, j.c, j.d, j.e, j.f, j.g, j.h};

    /* renamed from: d, reason: collision with other field name */
    private static final int f346d = Math.max(1, j.f259b.f370a / 6);

    public p(short s, short s2, short s3, short s4, boolean z, boolean z2, boolean z3) {
        this.g = (short) 0;
        this.f347b = (byte) 2;
        this.f351c = (byte) 20;
        this.f353c = false;
        this.f354g = -1;
        ((q) this).a = (short) 2;
        ((q) this).b = s2;
        this.c = s3;
        this.d = s4;
        this.f343a = false;
        this.e = (short) 0;
        this.f = (short) 0;
        this.f344b = false;
        this.f353c = true;
        this.f348a = new Vector();
        if (this.f353c) {
            return;
        }
        this.f343a = true;
    }

    public p(short s, short s2, short s3, short s4, boolean z, boolean z2) {
        this.g = (short) 0;
        this.f347b = (byte) 2;
        this.f351c = (byte) 20;
        this.f353c = false;
        this.f354g = -1;
        ((q) this).a = s;
        ((q) this).b = s2;
        this.c = s3;
        this.d = s4;
        this.f343a = z;
        this.e = (short) 0;
        this.f = (short) 0;
        this.f344b = false;
        this.f348a = new Vector();
    }

    public final void a(Graphics graphics, byte b2) {
        if (graphics == null || this.f348a == null) {
            return;
        }
        short m193b = (short) m.m193b(graphics);
        short c = (short) m.c(graphics);
        short d = (short) m.d(graphics);
        short e = (short) m.e(graphics);
        m.b(graphics, ((q) this).a - 5, ((q) this).b, this.c + 10, this.d);
        for (int i = 0; i < this.f348a.size(); i++) {
            q qVar = (q) this.f348a.elementAt(i);
            if (qVar.a - this.e <= ((q) this).a + this.c + 5 && (qVar.a - this.e) + qVar.mo205b() >= ((q) this).a - 5 && qVar.b - this.f <= ((q) this).b + this.d + 5 && (qVar.b - this.f) + qVar.mo204a() >= ((q) this).b - 5) {
                qVar.a(graphics, this.e, this.f, b2);
            }
        }
        if (this.f343a) {
            if (c()) {
                if (this.g < 20) {
                    this.g = (short) (this.g + 1);
                } else {
                    this.f = (short) 0;
                    this.g = (short) 0;
                    this.f351c = (byte) 20;
                }
            } else if (this.f != 0 || this.f351c <= 0) {
                b();
            } else {
                this.f351c = (byte) (this.f351c - 1);
            }
        } else if (this.f344b) {
            if (this.g == 0) {
                this.e = (short) (this.e + 1);
                if (this.e + this.c + 10 >= this.f349e) {
                    if (this.g < 10) {
                        this.g = (short) (this.g + 1);
                    } else {
                        this.e = (short) 0;
                        this.g = (short) 0;
                    }
                }
            } else {
                this.g = (short) (this.g + 1);
                if (this.g > 1) {
                    this.g = (short) 0;
                }
            }
        }
        m.b(graphics, m193b, c, d, e);
    }

    public final void a() {
        int a2 = a(this.f354g, false);
        if (a2 < 0) {
            if (m210a(0)) {
                return;
            }
            this.f = (short) (this.f - f346d);
        } else {
            if (!m210a(a2)) {
                this.f = (short) (this.f - f346d);
                return;
            }
            ((q) this.f348a.elementAt(this.f354g)).m214e();
            ((q) this.f348a.elementAt(a2)).b(16773632, 2);
            this.f354g = a2;
        }
    }

    private int a(int i, boolean z) {
        if (this.f348a == null) {
            return -1;
        }
        if (i >= this.f348a.size() - 1 && z) {
            return -1;
        }
        if (i <= 0 && !z) {
            return -1;
        }
        int i2 = z ? 1 : -1;
        if (i < 0) {
            i = 0;
        }
        int i3 = i;
        while (true) {
            int i4 = i3;
            if ((i4 >= this.f348a.size() || !z) && (i4 < 0 || z)) {
                return -1;
            }
            q qVar = (q) this.f348a.elementAt(i4);
            if ((this.f353c || qVar.a(a) || qVar.a(b)) && qVar.mo135b() > 0 && i4 != i) {
                return i4;
            }
            i3 = i4 + i2;
        }
    }

    public final void b() {
        int a2 = a(this.f354g, true);
        if (a2 < 0) {
            if (c()) {
                return;
            }
            this.f = (short) (this.f + f346d);
        } else {
            if (!m210a(a2)) {
                this.f = (short) (this.f + f346d);
                return;
            }
            if (this.f354g >= 0 && this.f354g < this.f348a.size()) {
                ((q) this.f348a.elementAt(this.f354g)).m214e();
            }
            ((q) this.f348a.elementAt(a2)).b(16773632, 2);
            this.f354g = a2;
        }
    }

    @Override // mobak.b.b.q
    public final void a(Graphics graphics, short s, short s2, byte b2) {
        short s3 = ((q) this).a;
        short s4 = ((q) this).b;
        ((q) this).b = (short) (((q) this).b - s2);
        try {
            if (b2 == 0) {
                a(graphics, ((q) this).f357a);
            } else {
                a(graphics, b2);
            }
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("drawTS").append(e.toString()).toString());
        }
        ((q) this).a = s3;
        ((q) this).b = s4;
    }

    private boolean c() {
        return this.f352a - this.f <= this.d;
    }

    @Override // mobak.b.b.q
    /* renamed from: a, reason: collision with other method in class */
    public final short mo204a() {
        return this.d;
    }

    @Override // mobak.b.b.q
    /* renamed from: b, reason: collision with other method in class */
    public final short mo205b() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
    private static Vector a(String str, mobak.c.a aVar, short s, short s2, byte b2) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        String str2 = "";
        while (str.length() > 0) {
            if (str.startsWith("\n")) {
                str2 = "\n";
            } else if (str.startsWith("\f")) {
                str2 = "\f";
            } else if (str.startsWith("\\id")) {
                str2 = "\\id";
            }
            if (str2.length() > 0) {
                String str3 = str2;
                str = str.substring((str3.equals("\f") || str3.equals("\n")) ? 1 : str3.equals("\\id") ? 3 : 0);
            }
            int indexOf = str.indexOf("\n");
            int i = indexOf;
            if (indexOf < 0 || (str.indexOf("\f") < i && str.indexOf("\f") >= 0)) {
                i = str.indexOf("\f");
            }
            if (i < 0 || (str.indexOf("\\id") < i && str.indexOf("\\id") >= 0)) {
                i = str.indexOf("\\id");
            }
            if (i < 0) {
                vector.addElement(new StringBuffer().append(str2).append(str).toString());
                str = "";
            } else {
                vector.addElement(new StringBuffer().append(str2).append(str.substring(0, i)).toString());
                str = str.substring(i);
            }
        }
        int i2 = 0;
        short s3 = s;
        short s4 = 0;
        for (int i3 = 0; i3 < vector.size(); i3++) {
            boolean z = false;
            String obj = vector.elementAt(i3).toString();
            String str4 = obj;
            if (obj.startsWith("\n")) {
                str4 = str4.substring(1);
                z = true;
                s3 = s;
            } else if (str4.startsWith("\f")) {
                aVar = f345a[Integer.parseInt(str4.substring(1, 2))];
                str4 = str4.substring(2);
            } else {
                ?? startsWith = str4.startsWith("\\id");
                if (startsWith != 0) {
                    try {
                        i2 = Integer.parseInt(str4.substring(3, str4.indexOf(" ")));
                        startsWith = str4.substring(str4.indexOf(" ") + 1);
                        str4 = startsWith;
                    } catch (Exception e) {
                        mobak.a.a.a(startsWith.getMessage());
                    }
                }
            }
            if (s3 + aVar.a(str4) >= s2 - 4) {
                int i4 = 0;
                String trim = str4.trim();
                String str5 = "";
                boolean z2 = false;
                if (s3 + aVar.a(trim.substring(0, trim.indexOf(" ") + 1)) >= s2 - 4 || trim.indexOf(" ") < 0) {
                    boolean z3 = false;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= trim.length()) {
                            break;
                        }
                        if (s3 + aVar.a(trim.substring(0, i5)) >= s2 - 4) {
                            str5 = trim.substring(0, i5);
                            trim = trim.substring(i5);
                            z3 = true;
                            break;
                        }
                        i5++;
                    }
                    if (!z3) {
                        str5 = trim;
                        trim = "";
                    }
                } else {
                    while (!z2 && trim.indexOf(" ") >= 0) {
                        String substring = trim.substring(0, trim.indexOf(" ") + 1);
                        if (s3 + i4 + aVar.a(substring) > s2 - 4) {
                            z2 = true;
                        } else {
                            str5 = new StringBuffer().append(str5).append(substring).toString();
                            trim = trim.substring(trim.indexOf(" ") + 1);
                            i4 = aVar.a(str5);
                        }
                    }
                }
                vector.insertElementAt("\n", i3 + 1);
                if (trim.length() > 0) {
                    vector.insertElementAt(trim, i3 + 2);
                }
                str4 = str5;
            }
            if (z) {
                s4 = (short) (s4 + aVar.f370a + b2);
            }
            if (str4.length() > 0) {
                vector2.addElement(new t(str4, s3, s4, aVar, i2));
                s3 = (short) (s3 + aVar.a(str4));
            }
        }
        return vector2;
    }

    public final short a(String str, mobak.c.a aVar, byte b2, boolean z, int i) {
        short s = b2;
        short s2 = this.c;
        if (str == null || str.equals("") || aVar == null) {
            return (short) 0;
        }
        short s3 = 0;
        Vector a2 = a(str, aVar, s, s2, this.f347b);
        short s4 = 0;
        for (int i2 = 0; i2 < a2.size(); i2++) {
            t tVar = (t) a2.elementAt(i2);
            tVar.f209a = i;
            boolean z2 = true;
            if (i2 == 0) {
                s4 = tVar.e();
            } else {
                z2 = s4 != tVar.e();
            }
            if (z2) {
                s3 = (short) (s3 + tVar.mo204a());
            }
            if (z) {
                ((q) tVar).b = (short) (((q) tVar).b + 5);
                int i3 = i2;
                boolean z3 = z2;
                if (tVar != null) {
                    if (this.f348a == null) {
                        this.f348a = new Vector();
                    }
                    ((q) tVar).a = (short) (((q) tVar).a + ((q) this).a);
                    ((q) tVar).b = (short) (((q) tVar).b + ((q) this).b);
                    this.f348a.insertElementAt(tVar, i3);
                    if (tVar.a(a) || tVar.a(b)) {
                        this.f353c = false;
                    }
                    if (z3) {
                        for (int i4 = i3 + 1; i4 < this.f348a.size(); i4++) {
                            q qVar = (q) this.f348a.elementAt(i4);
                            qVar.b = (short) (qVar.b + tVar.mo204a() + this.f347b);
                            if (this.f350f < (qVar.b + qVar.mo204a()) - ((q) this).b) {
                                this.f350f = (qVar.b + qVar.mo204a()) - ((q) this).b;
                            }
                        }
                    }
                    if (this.f349e < (((q) tVar).a + tVar.mo205b()) - ((q) this).a) {
                        this.f349e = (((q) tVar).a + tVar.mo205b()) - ((q) this).a;
                    }
                    if (z3) {
                        this.f352a += tVar.mo204a() + this.f347b;
                    }
                }
            } else {
                if (this.f352a == 0 || this.f348a.size() == 0) {
                    this.f352a = 5;
                }
                ((q) tVar).b = (short) (((q) tVar).b + this.f352a);
                a(tVar);
            }
        }
        t tVar2 = (t) a2.lastElement();
        if (!z) {
            this.f352a = ((tVar2.e() + tVar2.mo204a()) - e()) + this.f347b;
        }
        return s3;
    }

    public final short a(String str, mobak.c.a aVar, boolean z, int i) {
        return a(str, aVar, (byte) 0, z, i);
    }

    public final void a(q qVar) {
        if (qVar == null) {
            return;
        }
        if (this.f348a == null) {
            this.f348a = new Vector();
        }
        qVar.a = (short) (qVar.a + ((q) this).a);
        qVar.b = (short) (qVar.b + ((q) this).b);
        this.f348a.addElement(qVar);
        if (qVar.a(a) || qVar.a(b)) {
            this.f353c = false;
        }
        if ((this.f353c || qVar.a(a) || qVar.a(b)) && this.f354g < 0 && qVar.mo135b() > 0) {
            this.f354g = this.f348a.size() - 1;
            qVar.b(16773632, 2);
        }
        if (this.f350f < (qVar.b + qVar.mo204a()) - ((q) this).b) {
            this.f350f = (qVar.b + qVar.mo204a()) - ((q) this).b;
        }
        if (this.f349e < (qVar.a + qVar.mo205b()) - ((q) this).a) {
            this.f349e = (qVar.a + qVar.mo205b()) - ((q) this).a;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int m206a() {
        q a2 = a(this.f354g);
        if (a2 != null) {
            return a2.mo135b();
        }
        return -1;
    }

    public final q a(int i) {
        if (this.f348a != null && i >= 0 && i < this.f348a.size()) {
            return (q) this.f348a.elementAt(i);
        }
        return null;
    }

    public final boolean a(byte b2) {
        return this.f348a != null && b2 >= 0 && b2 < this.f348a.size() && this.f348a.elementAt(b2) != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public final void m207c() {
        this.f351c = (byte) 20;
        this.g = (short) 0;
        if (this.f348a != null) {
            this.f348a.removeAllElements();
        }
        this.f349e = 0;
        this.f350f = 0;
        this.f352a = 0;
        this.f354g = -1;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m208a() {
        return this.f348a == null || this.f348a.isEmpty();
    }

    public final void a(short s, short s2, short s3, boolean z) {
        mobak.b.b.a.k kVar = new mobak.b.b.a.k(s, (short) 1, s3);
        if (z) {
            ((q) kVar).f357a = (byte) 1;
        }
        a(kVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int m209a(int i) {
        if (this.f348a == null) {
            return -1;
        }
        for (int i2 = i; i2 < this.f348a.size(); i2++) {
            q a2 = a(i2);
            if (a2 != null && (a2.a(a) || a2.a(b))) {
                return i2;
            }
        }
        return -1;
    }

    public final int b(int i) {
        if (this.f348a == null) {
            return -1;
        }
        for (int i2 = i; i2 >= 0; i2--) {
            q a2 = a(i2);
            if (a2 != null && (a2.a(a) || a2.a(b))) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m210a(int i) {
        q a2 = a(i);
        return a2 != null && a2.a - this.e <= (((q) this).a + this.c) + 5 && (a2.a - this.e) + a2.mo205b() >= ((q) this).a - 5 && (a2.b - this.f) - 2 >= ((q) this).b && (a2.b - this.f) + a2.mo204a() <= ((q) this).b + this.d;
    }

    public final int c(int i) {
        if (this.f348a != null) {
            for (int i2 = 0; i2 < this.f348a.size(); i2++) {
                q qVar = (q) this.f348a.elementAt(i2);
                if ((this.f353c || qVar.a(a) || qVar.a(b)) && m210a(i2) && i >= qVar.b - this.f && i <= (qVar.b - this.f) + qVar.mo204a()) {
                    if (this.f354g >= 0 && this.f354g < this.f348a.size()) {
                        ((q) this.f348a.elementAt(this.f354g)).m214e();
                    }
                    qVar.b(16773632, 2);
                    this.f354g = i2;
                    return this.f354g;
                }
            }
        }
        return this.f354g;
    }

    /* renamed from: c, reason: collision with other method in class */
    public final short m211c() {
        return this.f;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m212a(int i) {
        this.f = (short) i;
    }

    public final void a(boolean z) {
        this.f343a = false;
    }

    public final void a(int i, int i2) {
        if (!(i >= d() && i <= d() + this.c && i2 >= e() && i2 <= e() + this.d)) {
            this.f355d = false;
        } else {
            this.f355d = true;
            this.f343a = false;
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public final boolean m213b() {
        return this.f355d;
    }

    public final void d() {
        if (this.f <= 0 || this.f + this.d >= this.f352a) {
            if (this.f < 0 || this.f352a < this.d) {
                this.f = (short) 0;
            } else {
                if (this.f352a <= this.d || this.f + this.d <= this.f352a) {
                    return;
                }
                this.f = (short) (this.f352a - this.d);
            }
        }
    }
}
