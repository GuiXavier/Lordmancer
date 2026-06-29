package mobak.b.b.a;

import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import mobak.Main2;

/* loaded from: LordmancerL.jar:mobak/b/b/a/r.class */
public final class r {

    /* renamed from: a, reason: collision with other field name */
    private static short f195a;

    /* renamed from: b, reason: collision with other field name */
    private static short f196b;
    private static short c;

    /* renamed from: a, reason: collision with other field name */
    private Vector f197a;

    /* renamed from: b, reason: collision with other field name */
    private Vector f198b;

    /* renamed from: a, reason: collision with other field name */
    private Vector[] f199a;

    /* renamed from: a, reason: collision with other field name */
    private byte f200a;

    /* renamed from: b, reason: collision with other field name */
    private byte f201b;
    private static int a = -6;
    private static int b = -7;

    /* renamed from: a, reason: collision with other field name */
    private static final int[] f193a = {-6, 21, -202, 57345};

    /* renamed from: b, reason: collision with other field name */
    private static final int[] f194b = {-7, 22, -203, 57346};

    /* renamed from: a, reason: collision with other field name */
    private static final Hashtable f202a = new Hashtable();

    public static short a(byte b2) {
        switch (b2) {
            case -2:
                return (short) 62;
            case -1:
            case 0:
            case 3:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 80:
            case 82:
            case 91:
            case 92:
            case 105:
            default:
                Short sh = (Short) f202a.get(new Byte(b2));
                if (sh != null) {
                    return sh.shortValue();
                }
                return (short) 0;
            case 1:
                return (short) 69;
            case 2:
                return (short) 70;
            case 4:
                return (short) 71;
            case 5:
                return (short) 47;
            case 8:
                return (short) 94;
            case 47:
                return (short) 203;
            case 48:
                return (short) 175;
            case 49:
                return (short) 207;
            case 50:
                return (short) 1;
            case 51:
                return (short) 72;
            case 52:
                return (short) 73;
            case 53:
                return (short) 74;
            case 54:
                return (short) 76;
            case 55:
                return (short) 1;
            case 56:
                return (short) 106;
            case 57:
                return (short) 77;
            case 58:
                return (short) 63;
            case 59:
                return (short) 79;
            case 60:
                return (short) 81;
            case 61:
                return (short) 82;
            case 62:
                return (short) 83;
            case 63:
                return (short) 39;
            case 64:
                return (short) 85;
            case 65:
                return (short) 86;
            case 66:
                return (short) 71;
            case 67:
                return (short) 54;
            case 68:
                return (short) 87;
            case 69:
                return (short) 88;
            case 70:
                return (short) 64;
            case 71:
                return (short) 84;
            case 72:
                return (short) 65;
            case 73:
                return (short) 89;
            case 74:
                return (short) 90;
            case 75:
                return (short) 74;
            case 76:
                return (short) 100;
            case 77:
                return (short) 130;
            case 78:
                return (short) 131;
            case 79:
                return (short) 68;
            case 81:
                return (short) 7;
            case 83:
                return (short) 92;
            case 84:
                return (short) 8;
            case 85:
                return (short) 93;
            case 86:
                return (short) 91;
            case 87:
                return (short) 95;
            case 88:
                return (short) 52;
            case 89:
                return (short) 98;
            case 90:
                return (short) 53;
            case 93:
                return (short) 68;
            case 94:
                return (short) 38;
            case 95:
                return (short) 298;
            case 96:
                return (short) 106;
            case 97:
                return (short) 81;
            case 98:
                return (short) 77;
            case 99:
                return (short) 74;
            case 100:
                return (short) 172;
            case 101:
                return (short) 179;
            case 102:
                return (short) 181;
            case 103:
                return (short) 275;
            case 104:
                return (short) 274;
            case 106:
                return (short) 299;
        }
    }

    private r(byte b2) {
        this.f200a = (byte) 0;
        this.f201b = (byte) -1;
    }

    public r() {
        this.f200a = (byte) 0;
        this.f201b = (byte) -1;
        this.f197a = new Vector();
        this.f198b = new Vector();
    }

    public r(byte[] bArr, byte[] bArr2, byte[][] bArr3) {
        this.f200a = (byte) 0;
        this.f201b = (byte) -1;
        if (bArr != null) {
            this.f197a = new Vector(bArr.length);
            for (int i = 0; i < bArr.length; i++) {
                a(true, bArr[i], a(bArr[i]));
            }
        } else {
            this.f197a = new Vector();
        }
        if (bArr2 != null) {
            this.f198b = new Vector(bArr2.length);
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                a(false, bArr2[i2], a(bArr2[i2]));
            }
        } else {
            this.f198b = new Vector();
        }
        if (bArr3 != null) {
            this.f199a = new Vector[bArr3.length];
            for (int i3 = 0; i3 < bArr3.length; i3++) {
                this.f199a[i3] = new Vector();
                for (int i4 = 0; i4 < bArr3[i3].length; i4++) {
                    a(this.f199a[i3], bArr3[i3][i4], a(bArr3[i3][i4]));
                }
            }
        }
        this.f201b = (byte) -1;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m121a(byte b2) {
    }

    public static int a() {
        return mobak.b.b.m.b(f195a);
    }

    private void a(Graphics graphics, mobak.c.a aVar, String str, String str2) {
        int width = mobak.b.b.m.a.getWidth();
        int m190a = (width - mobak.b.b.m.m190a(f195a)) / 2;
        int height = mobak.b.b.m.a.getHeight();
        mobak.b.b.m.a(graphics, f195a, m190a, height - mobak.b.b.m.b(f195a), 0);
        if (str != null && !str.equals("")) {
            aVar.a(graphics, str, m190a + (mobak.b.b.m.m190a(f195a) / 4), height - (mobak.b.b.m.b(f195a) / 2), 3);
        }
        if (str2 == null || str2.equals("")) {
            return;
        }
        aVar.a(graphics, str2, (width - m190a) - (mobak.b.b.m.m190a(f195a) / 4), height - (mobak.b.b.m.b(f195a) / 2), 3);
    }

    private static void a(Graphics graphics, int i, int i2) {
        mobak.b.b.m.a(graphics, f196b, i, i2, 0);
    }

    private static void b(Graphics graphics, int i, int i2) {
        mobak.b.b.m.a(graphics, f196b, i, i2, 0);
        mobak.b.b.m.a(graphics, c, i + ((mobak.b.b.m.m190a(f196b) - mobak.b.b.m.m190a(c)) / 2), i2 + ((mobak.b.b.m.b(f196b) - mobak.b.b.m.b(c)) / 2), 0);
    }

    public static final void a(Graphics graphics, byte b2) {
        if (graphics == null) {
            return;
        }
        new r(b2).a(graphics, mobak.b.b.j.f259b, mobak.c.d.a(42), mobak.c.d.a(43));
    }

    public static final void b(Graphics graphics, byte b2) {
        if (graphics == null) {
            return;
        }
        new r(b2).a(graphics, mobak.b.b.j.f259b, mobak.c.d.a(146), (String) null);
    }

    private static void a(Vector vector, byte b2, short s) {
        if (b2 == 52 || b2 == 51 || vector == null) {
            return;
        }
        vector.addElement(new s(b2, s));
    }

    public final void a(byte b2, s sVar) {
        if (this.f199a == null) {
            this.f199a = new Vector[1];
            this.f199a[0] = new Vector();
        }
        if (this.f199a[0] == null) {
            this.f199a[0] = new Vector();
        }
        this.f199a[0].addElement(sVar);
    }

    public final void a(boolean z, s sVar) {
        if (z) {
            if (this.f197a.contains(sVar)) {
                return;
            }
            this.f197a.addElement(sVar);
        } else {
            if (this.f198b.contains(sVar)) {
                return;
            }
            this.f198b.addElement(sVar);
        }
    }

    public final void a(boolean z, byte b2, short s) {
        if (z) {
            a(this.f197a, b2, s);
        } else {
            a(this.f198b, b2, s);
        }
    }

    private static void b(Vector vector, byte b2, short s) {
        if (vector == null) {
            return;
        }
        for (int i = 0; i < vector.size(); i++) {
            s sVar = (s) vector.elementAt(i);
            if (((byte) sVar.a) == b2) {
                sVar.a(s);
            }
        }
    }

    public final void a(short s, byte b2) {
        b(this.f197a, b2, s);
        b(this.f198b, b2, s);
    }

    private void a(Vector vector, int i, boolean z, boolean z2, boolean z3) {
        if (vector == null) {
            return;
        }
        boolean z4 = false;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            s sVar = (s) vector.elementAt(i2);
            if (((byte) sVar.a) == ((byte) i)) {
                if (s.a(sVar.a) != s.a(i) && z3) {
                    sVar.a(s.a(i));
                }
                z4 = true;
                sVar.a(!z);
            }
        }
        if (z4 || !z2) {
            return;
        }
        if (((byte) i) != 52 && ((byte) i) != 51 && vector != null) {
            vector.addElement(new s(i));
        }
        if (z) {
            ((s) vector.elementAt(vector.size() - 1)).a(false);
        }
    }

    public final void a(byte b2, boolean z, boolean z2) {
        a(this.f198b, s.a(a((byte) 100), (byte) 100), z, false, false);
    }

    public final void a(byte b2, boolean z) {
        int a2 = s.a(a(b2), b2);
        a(this.f197a, a2, z, true, false);
        a(this.f198b, a2, z, false, false);
    }

    private static int a(Vector vector) {
        if (vector == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (((s) vector.elementAt(i2)).a()) {
                i++;
            }
        }
        return i;
    }

    private static int a(int i, Vector vector, int i2) {
        if (vector == null || vector.size() <= i) {
            return -1;
        }
        int i3 = 0;
        for (int i4 = i; i4 < vector.size(); i4++) {
            if (((s) vector.elementAt(i4)).a()) {
                if (i3 == i2) {
                    return i4;
                }
                i3++;
            }
        }
        return -1;
    }

    private static int b(int i, Vector vector, int i2) {
        if (vector == null || vector.size() <= 0) {
            return -1;
        }
        for (int i3 = 0; i3 < vector.size(); i3++) {
            s sVar = (s) vector.elementAt(i3);
            if (sVar.a() && sVar.b()) {
                return i3;
            }
        }
        return -1;
    }

    public final void a(Graphics graphics) {
        byte m122a;
        Vector vector;
        if (graphics == null) {
            return;
        }
        try {
            mobak.b.b.m.a.a(graphics);
            int a2 = a(this.f197a);
            String a3 = a2 > 0 ? a2 > 1 ? b() ? mobak.c.d.a(146) : mobak.c.d.a(72) : ((s) this.f197a.elementAt(a(0, this.f197a, 0))).m133a() : null;
            int a4 = a(this.f198b);
            a(graphics, mobak.b.b.j.f259b, a3, a4 > 0 ? a4 > 1 ? c() ? mobak.c.d.a(146) : mobak.c.d.a(73) : ((s) this.f198b.elementAt(a(0, this.f198b, 0))).m133a() : null);
            if (this.f200a != 0) {
                boolean z = this.f200a < 0;
                if (graphics != null) {
                    int m190a = mobak.b.b.m.m190a(f196b);
                    int width = mobak.b.b.m.a.getWidth() / 2;
                    Vector vector2 = this.f198b;
                    if (z) {
                        width = (mobak.b.b.m.a.getWidth() / 2) - mobak.b.b.m.m190a(f196b);
                        vector2 = this.f197a;
                        if (width < 0) {
                            width = 0;
                        }
                    } else if (width + mobak.b.b.m.m190a(f196b) > mobak.b.b.m.a.getWidth()) {
                        width = mobak.b.b.m.a.getWidth() - mobak.b.b.m.m190a(f196b);
                    }
                    if (vector2 == null) {
                        this.f200a = (byte) 0;
                        return;
                    }
                    int height = (mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(f195a)) - mobak.b.b.m.b(f196b);
                    for (int a5 = a(0, vector2, 0); a5 >= 0; a5 = a(a5 + 1, vector2, 0)) {
                        s sVar = (s) vector2.elementAt(a5);
                        if (Math.abs((int) this.f200a) - 1 == a5) {
                            b(graphics, width, height);
                        } else {
                            a(graphics, width, height);
                        }
                        (a(sVar) ? mobak.b.b.j.f259b : mobak.b.b.j.g).a(graphics, sVar.m133a(), width + (m190a / 2), height + (mobak.b.b.m.b(f196b) / 2), 3);
                        height -= mobak.b.b.m.b(f196b);
                    }
                    s sVar2 = Math.abs((int) this.f200a) > 0 ? (s) vector2.elementAt(Math.abs((int) this.f200a) - 1) : null;
                    if (sVar2 == null || ((byte) sVar2.a) != 49) {
                        return;
                    }
                    if ((z || this.f199a != null) && (m122a = m122a((byte) Math.abs((int) this.f200a))) >= 0 && (vector = this.f199a[m122a]) != null && vector.size() > 0) {
                        int i = z ? width + m190a : width - m190a;
                        int height2 = (mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(f195a)) - mobak.b.b.m.b(f196b);
                        for (byte b2 = 0; b2 < vector.size(); b2 = (byte) (b2 + 1)) {
                            if (b2 == this.f201b) {
                                b(graphics, i, height2);
                            } else {
                                a(graphics, i, height2);
                            }
                            s sVar3 = (s) vector.elementAt(b2);
                            (a(sVar3) ? mobak.b.b.j.f259b : mobak.b.b.j.g).a(graphics, sVar3.m133a(), i + (m190a / 2), height2 + (mobak.b.b.m.b(f196b) / 2), 3);
                            height2 -= mobak.b.b.m.b(f196b);
                        }
                    }
                }
            }
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("PopupMenu ").append(e.getMessage()).toString());
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private byte m122a(byte b2) {
        if (b2 < 0 || this.f198b == null) {
            return (byte) -1;
        }
        byte b3 = -1;
        byte b4 = 0;
        while (true) {
            byte b5 = b4;
            if (b5 >= b2) {
                return b3;
            }
            if (((byte) ((s) this.f198b.elementAt(b5)).a) == 49) {
                b3 = (byte) (b3 + 1);
            }
            b4 = (byte) (b5 + 1);
        }
    }

    private static boolean a(s sVar) {
        return sVar.b();
    }

    public final void a(int i) {
        byte b2;
        Vector vector;
        byte b3;
        byte b4;
        if (i == 1 && m124a() && this.f200a != 0) {
            Vector vector2 = this.f200a < 0 ? this.f197a : this.f198b;
            if (this.f201b < 0) {
                byte b5 = this.f200a;
                if (this.f200a < 0) {
                    b5 = (byte) Math.abs((int) this.f200a);
                }
                byte b6 = (byte) (b5 - 1);
                boolean z = false;
                byte b7 = 1;
                while (true) {
                    b4 = b7;
                    if (b6 + b4 >= vector2.size()) {
                        break;
                    }
                    s sVar = (s) vector2.elementAt(b6 + b4);
                    if (a(sVar) && sVar.a()) {
                        z = true;
                        break;
                    }
                    b7 = (byte) (b4 + 1);
                }
                if (z) {
                    if (this.f200a < 0) {
                        this.f200a = (byte) (this.f200a - b4);
                    } else {
                        this.f200a = (byte) (this.f200a + b4);
                    }
                }
            } else {
                byte b8 = this.f200a;
                byte b9 = (byte) (this.f201b + 1);
                byte b10 = this.f200a;
                byte a2 = a(b9, m122a((byte) Math.abs((int) this.f200a)));
                if (a2 != -1) {
                    this.f201b = a2;
                }
            }
        }
        if (i == 6 && m124a() && this.f200a != 0) {
            Vector vector3 = this.f200a < 0 ? this.f197a : this.f198b;
            if (this.f201b < 0) {
                byte b11 = this.f200a;
                if (this.f200a < 0) {
                    b11 = (byte) Math.abs((int) this.f200a);
                }
                byte b12 = (byte) (b11 - 1);
                boolean z2 = false;
                byte b13 = 1;
                while (true) {
                    b3 = b13;
                    if (b12 - b3 < 0) {
                        break;
                    }
                    s sVar2 = (s) vector3.elementAt(b12 - b3);
                    if (a(sVar2) && sVar2.a()) {
                        z2 = true;
                        break;
                    }
                    b13 = (byte) (b3 + 1);
                }
                if (z2) {
                    if (this.f200a < 0) {
                        this.f200a = (byte) (this.f200a + b3);
                    } else {
                        this.f200a = (byte) (this.f200a - b3);
                    }
                }
            } else {
                byte b14 = this.f200a;
                byte b15 = (byte) (this.f201b - 1);
                byte b16 = this.f200a;
                byte m122a = m122a((byte) Math.abs((int) this.f200a));
                if (this.f199a != null && (vector = this.f199a[m122a]) != null) {
                    byte b17 = b15;
                    while (true) {
                        byte b18 = b17;
                        if (b18 < 0) {
                            break;
                        }
                        if (a(a(vector, (int) b18))) {
                            b2 = b18;
                            break;
                        }
                        b17 = (byte) (b18 - 1);
                    }
                }
                b2 = -1;
                byte b19 = b2;
                if (b2 != -1) {
                    this.f201b = b19;
                }
                byte b20 = this.f200a;
                if (m122a((byte) Math.abs((int) this.f200a)) < 0) {
                }
            }
        }
        if ((i == 5 || i == 2) && m124a()) {
            if (this.f201b >= 0) {
                this.f201b = (byte) -1;
                return;
            }
            if ((this.f200a <= 0 || i != 2) && (this.f200a >= 0 || i != 5)) {
                return;
            }
            byte b21 = this.f200a;
            byte b22 = this.f200a;
            this.f201b = a((byte) 0, m122a((byte) Math.abs((int) this.f200a)));
        }
    }

    private static s a(Vector vector, int i) {
        return (s) vector.elementAt(i);
    }

    /* renamed from: a, reason: collision with other method in class */
    public final s m123a() {
        if (b()) {
            return a(false, true, false);
        }
        if (c()) {
            return a(true, false, false);
        }
        return null;
    }

    public final s a(boolean z, boolean z2, boolean z3) {
        if (z && a(this.f198b) == 1 && this.f200a == 0) {
            return a(this.f198b, a(0, this.f198b, 0));
        }
        if (z) {
            this.f201b = (byte) -1;
            if (this.f200a > 0) {
                this.f200a = (byte) 0;
                return null;
            }
            this.f200a = (byte) (b(0, this.f198b, 0) + 1);
            return null;
        }
        if ((z2 || z3) && a(this.f197a) == 1 && this.f200a == 0) {
            return a(this.f197a, a(0, this.f197a, 0));
        }
        if (z2 || (z3 && !m124a())) {
            this.f201b = (byte) -1;
            if (this.f200a < 0) {
                this.f200a = (byte) 0;
                return null;
            }
            this.f200a = (byte) ((-b(0, this.f197a, 0)) - 1);
            return null;
        }
        if (this.f201b < 0 && this.f200a != 0 && z3) {
            s a2 = this.f200a < 0 ? a(this.f197a, Math.abs((int) this.f200a) - 1) : a(this.f198b, Math.abs((int) this.f200a) - 1);
            if (((byte) a2.a) != 49) {
                this.f200a = (byte) 0;
            }
            return a2;
        }
        if (this.f201b < 0 || this.f200a == 0 || !z3) {
            return null;
        }
        byte b2 = this.f200a;
        byte m122a = m122a((byte) Math.abs((int) this.f200a));
        byte b3 = this.f201b;
        this.f201b = (byte) -1;
        this.f200a = (byte) 0;
        return a(this.f199a[m122a], (int) b3);
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m124a() {
        return this.f200a != 0;
    }

    public final boolean b() {
        return this.f200a < 0;
    }

    public final boolean c() {
        return this.f200a > 0;
    }

    private void a(Vector vector, byte b2, boolean z) {
        if (vector == null) {
            return;
        }
        for (int i = 0; i < vector.size(); i++) {
            s a2 = a(vector, i);
            if (((byte) a2.a) == b2) {
                a2.b(z);
            }
        }
    }

    public final void b(byte b2) {
        a(this.f197a, b2, false);
        a(this.f198b, b2, false);
    }

    public final void c(byte b2) {
        a(this.f197a, b2, true);
        a(this.f198b, b2, true);
    }

    public final void a(boolean z, boolean z2) {
        if (this.f197a == null) {
            return;
        }
        for (int i = 0; i < this.f197a.size(); i++) {
            a(this.f197a, i).a(z2);
        }
    }

    private void a(Vector vector, byte b2) {
        if (vector == null) {
            return;
        }
        for (int i = 0; i < vector.size(); i++) {
            s a2 = a(vector, i);
            if (((byte) a2.a) == b2) {
                a2.a(a(b2));
            }
        }
    }

    public final void d(byte b2) {
        a(this.f197a, (byte) 81);
        a(this.f198b, (byte) 81);
    }

    public final void a(byte[] bArr, boolean z) {
        a(bArr, false, true, false);
    }

    public final void a(byte[] bArr, boolean z, boolean z2, boolean z3) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bArr.length) {
                return;
            }
            a(this.f197a, s.a(a(bArr[b3]), bArr[b3]), z, true, false);
            if (z3) {
                a(this.f198b, s.a(a(bArr[b3]), bArr[b3]), z, true, false);
            }
            b2 = (byte) (b3 + 1);
        }
    }

    public final void a(int[] iArr, boolean z) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= iArr.length) {
                return;
            }
            a(this.f197a, iArr[b3], false, true, true);
            b2 = (byte) (b3 + 1);
        }
    }

    private byte a(byte b2, byte b3) {
        Vector vector;
        if (this.f199a == null || (vector = this.f199a[b3]) == null) {
            return (byte) -1;
        }
        byte b4 = b2;
        while (true) {
            byte b5 = b4;
            if (b5 >= vector.size()) {
                return (byte) -1;
            }
            if (a(a(vector, (int) b5))) {
                return b5;
            }
            b4 = (byte) (b5 + 1);
        }
    }

    public static final boolean a(int i, int i2) {
        return i2 >= mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(f195a) && i >= (mobak.b.b.m.a.getWidth() - mobak.b.b.m.m190a(f195a)) / 2 && i <= mobak.b.b.m.a.getWidth() / 2;
    }

    public static final boolean b(int i, int i2) {
        return i2 >= mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(f195a) && i >= mobak.b.b.m.a.getWidth() / 2 && i < (mobak.b.b.m.a.getWidth() + mobak.b.b.m.m190a(f195a)) / 2;
    }

    public final boolean c(int i, int i2) {
        byte a2;
        s m125a;
        boolean b2 = (i >= (mobak.b.b.m.a.getWidth() - mobak.b.b.m.m190a(f195a)) / 2 && i <= mobak.b.b.m.a.getWidth() / 2) & (i2 <= mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(f195a) && i2 >= (mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(f195a)) - (a(this.f197a) * mobak.b.b.m.b(f196b))) & b();
        boolean c2 = (i >= mobak.b.b.m.a.getWidth() / 2 && i <= (mobak.b.b.m.a.getWidth() + mobak.b.b.m.m190a(f195a)) / 2) & (i2 <= mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(f195a) && i2 >= (mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(f195a)) - (a(this.f198b) * mobak.b.b.m.b(f196b))) & c();
        int height = ((mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(f195a)) - i2) / mobak.b.b.m.b(f196b);
        boolean z = false;
        s sVar = null;
        if (c() && this.f198b != null && this.f198b.size() >= this.f200a && this.f198b.elementAt(this.f200a - 1) != null) {
            sVar = (s) this.f198b.elementAt(this.f200a - 1);
        }
        if (sVar != null && ((byte) sVar.a) == 49) {
            z = true;
        }
        Vector vector = null;
        if (z) {
            vector = this.f199a[0];
            z = z & (i <= mobak.b.b.m.a.getWidth() / 2) & (i >= (mobak.b.b.m.a.getWidth() - mobak.b.b.m.m190a(f195a)) / 2) & (i2 <= mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(f195a)) & (i2 >= (mobak.b.b.m.a.getHeight() - mobak.b.b.m.b(f195a)) - (mobak.b.b.m.b(f196b) * vector.size()));
        }
        if (!b2 && !c2 && !z) {
            return false;
        }
        if (z) {
            if (vector == null || height < 0 || height >= vector.size()) {
                return true;
            }
            this.f201b = (byte) height;
            return true;
        }
        if (!b()) {
            if (!c() || (m125a = m125a((int) (a2 = (byte) (a(0, this.f198b, height) + 1)))) == null || !m125a.b()) {
                return false;
            }
            this.f200a = a2;
            return true;
        }
        byte b3 = (byte) ((-a(0, this.f197a, height)) - 1);
        s m125a2 = m125a((int) b3);
        if (m125a2 == null || !m125a2.b()) {
            return false;
        }
        this.f200a = b3;
        return true;
    }

    /* renamed from: a, reason: collision with other method in class */
    private s m125a(int i) {
        if (i < 0) {
            return (s) this.f197a.elementAt(Math.abs(i) - 1);
        }
        if (i > 0) {
            return (s) this.f198b.elementAt(Math.abs(i) - 1);
        }
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m126a() {
        if (this.f197a != null) {
            this.f197a.removeAllElements();
        }
        if (this.f198b != null) {
            this.f198b.removeAllElements();
        }
        this.f200a = (byte) 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m127a(int i) {
        if (i == a) {
            return true;
        }
        if (a == f193a[0]) {
            for (int i2 = 1; i2 < f193a.length; i2++) {
                if (i == f193a[i2]) {
                    return true;
                }
            }
        }
        return i == 42;
    }

    public static final boolean b(int i) {
        if (i == b) {
            return true;
        }
        if (b == f194b[0]) {
            for (int i2 = 0; i2 < f194b.length; i2++) {
                if (i == f194b[i2]) {
                    return true;
                }
            }
        }
        return i == 35;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m128b(int i) {
        a = i;
    }

    public static void c(int i) {
        b = i;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m129b() {
        Main2.a.f5a.a((byte) 11, a);
        Main2.a.f5a.a((byte) 12, b);
    }

    /* renamed from: c, reason: collision with other method in class */
    public static void m130c() {
        a = Main2.a.f5a.m236a((byte) 11, a);
        b = Main2.a.f5a.m236a((byte) 12, b);
    }

    public static byte a(short s) {
        byte size = (byte) (127 - f202a.size());
        f202a.put(new Byte(size), new Short(s));
        return size;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static short m131b(byte b2) {
        Short sh = (Short) f202a.get(new Byte(b2));
        if (sh != null) {
            return sh.shortValue();
        }
        return (short) -1;
    }

    static {
        f195a = (short) -1;
        f196b = (short) -1;
        c = (short) -1;
        f195a = mobak.c.a("menu.png");
        f196b = mobak.c.a("popupMenuItem.png");
        c = mobak.c.a("popupMenuItemSelect.png");
    }
}
