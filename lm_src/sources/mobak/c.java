package mobak;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

/* loaded from: LordmancerL.jar:mobak/c.class */
public final class c {
    private static Image[] a;

    /* renamed from: a, reason: collision with other field name */
    private static String[] f358a;

    /* renamed from: a, reason: collision with other field name */
    private static d[] f359a;

    /* renamed from: b, reason: collision with other field name */
    private static byte[] f363b;

    /* renamed from: a, reason: collision with other field name */
    private static mobak.b.b.i[] f360a = null;

    /* renamed from: a, reason: collision with other field name */
    private static byte[] f361a = null;

    /* renamed from: a, reason: collision with other field name */
    private static byte f362a = 7;
    private static byte b = 120;
    private static byte c = Byte.MIN_VALUE;
    private static byte d = Byte.MAX_VALUE;

    /* renamed from: a, reason: collision with other field name */
    public static int f364a = 10000;

    /* renamed from: b, reason: collision with other field name */
    public static int f365b = 2;

    /* renamed from: c, reason: collision with other field name */
    public static int f366c = 1;

    public static int a() {
        if (f360a == null) {
            return 0;
        }
        return f360a.length;
    }

    public static mobak.b.b.i a(int i) {
        if (i >= 0 && f360a != null && f360a.length > i) {
            return f360a[i];
        }
        return null;
    }

    public static mobak.b.b.i a(byte b2, byte b3) {
        int m216a = m216a(b2, b3);
        if (m216a >= 0) {
            return f360a[m216a];
        }
        return null;
    }

    public static mobak.b.b.i a(byte b2, byte b3, boolean z) {
        int i;
        if (f360a != null) {
            for (int i2 = 0; i2 < f360a.length; i2++) {
                if (f360a[i2] != null && f360a[i2].m158a() == b2 && f360a[i2].b() == b3 && f360a[i2].m156a()) {
                    i = i2;
                    break;
                }
            }
        }
        i = -1;
        int i3 = i;
        if (i < 0) {
            return null;
        }
        return f360a[i3];
    }

    public static int a(mobak.b.b.i iVar) {
        if (iVar == null) {
            return -1;
        }
        return a(iVar.m157a(), iVar.c());
    }

    public static int a(int i, byte b2) {
        if (f360a == null) {
            return -1;
        }
        for (int i2 = 0; i2 < f360a.length; i2++) {
            if (f360a[i2] != null && f360a[i2].m157a() == i && f360a[i2].c() == b2 && f360a[i2].m156a()) {
                return i2;
            }
        }
        return -1;
    }

    public static int b(int i, byte b2) {
        if (f360a == null) {
            return -1;
        }
        for (int i2 = 0; i2 < f360a.length; i2++) {
            if (f360a[i2] != null && f360a[i2].m157a() == i && f360a[i2].c() == b2) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static int m216a(byte b2, byte b3) {
        if (f360a == null || f360a.length == 0) {
            return -1;
        }
        for (int i = 0; i < f360a.length; i++) {
            mobak.b.b.i iVar = f360a[i];
            if (iVar != null && iVar.m158a() == b2 && iVar.b() == b3 && iVar.m156a()) {
                return i;
            }
        }
        return -1;
    }

    public static int b(mobak.b.b.i iVar) {
        if (iVar == null) {
            return -1;
        }
        if (f360a == null) {
            f360a = new mobak.b.b.i[10];
        }
        int i = -1;
        for (int i2 = 0; i2 < f360a.length; i2++) {
            if (f360a[i2] != null && f360a[i2].m157a() == iVar.m157a() && f360a[i2].c() == iVar.c()) {
                return i2;
            }
            if (f360a[i2] == null && i < 0) {
                i = i2;
            }
        }
        if (i < 0) {
            mobak.b.b.i[] iVarArr = new mobak.b.b.i[f360a.length + 10];
            System.arraycopy(f360a, 0, iVarArr, 0, f360a.length);
            i = f360a.length;
            f360a = iVarArr;
        }
        f360a[i] = iVar;
        return i;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m217a(int i) {
        if (f360a == null || f360a.length == 0 || i < 0 || i >= f360a.length || f360a[i] == null) {
            return;
        }
        m226a(f360a[i]);
        f360a[i] = null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m218a(int i, byte b2) {
        if (f360a == null) {
            return;
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 < f360a.length) {
                if (f360a[i3] != null && f360a[i3].m157a() == i && f360a[i3].c() == b2) {
                    i2 = i3;
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        m217a(i2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static final void m219a() {
        if (f360a == null || f360a.length == 0) {
            return;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= f360a.length) {
                return;
            }
            mobak.b.b.i iVar = f360a[s2];
            if (f360a != null && iVar != null) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= f360a.length) {
                        break;
                    }
                    if (f360a[i2] == iVar) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                m217a(i);
            }
            s = (short) (s2 + 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static mobak.b.b.i a(mobak.b.b.i r5, byte r6, byte r7) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mobak.c.a(mobak.b.b.i, byte, byte):mobak.b.b.i");
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m220a(mobak.b.b.i iVar, byte b2, byte b3) {
        if (iVar == null) {
            return false;
        }
        if (!m221a()) {
            return true;
        }
        d m232a = m232a(iVar.c());
        byte b4 = 0;
        while (true) {
            byte b5 = b4;
            if (b5 >= m232a.e) {
                return false;
            }
            byte m223a = m223a((short) ((byte) (b2 + m232a.f379a[b5][0])), (short) ((byte) (b3 + m232a.f379a[b5][1])));
            if (b(m223a) > 0 || m228a(m223a)) {
                return true;
            }
            b4 = (byte) (b5 + 1);
        }
    }

    private static boolean b(mobak.b.b.i iVar, byte b2, byte b3) {
        if (iVar == null || mobak.b.a.b.a == null || iVar.m164b()) {
            return false;
        }
        d m232a = m232a(iVar.c());
        byte b4 = 0;
        while (true) {
            byte b5 = b4;
            if (b5 >= m232a.e) {
                return false;
            }
            if (b2 + m232a.f379a[b5][0] == mobak.b.a.b.a.m60a() && b3 + m232a.f379a[b5][1] == mobak.b.a.b.a.b()) {
                return true;
            }
            b4 = (byte) (b5 + 1);
        }
    }

    public static synchronized boolean a(byte[] bArr) {
        if (bArr == null || bArr.length != 2500) {
            return false;
        }
        f361a = bArr;
        return true;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m221a() {
        return f361a != null;
    }

    public static synchronized void b() {
        f361a = null;
        f360a = null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static int m222b() {
        return 2500;
    }

    public static boolean a(short s, short s2) {
        return s >= 0 && s < 50 && s2 >= 0 && s2 < 50;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static byte m223a(short s, short s2) {
        if (m221a() && a(s, s2)) {
            return f361a[(s2 * 50) + s];
        }
        return (byte) 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static byte m224a(int i) {
        if (f361a == null || i < 0 || i >= f361a.length) {
            return (byte) 0;
        }
        return f361a[i];
    }

    private static void a(byte b2, byte b3, byte b4) {
        if (m221a() && a(b2, b3)) {
            f361a[(b3 * 50) + b2] = b4;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m225a(byte b2, byte b3) {
        if (m221a() && a(b2, b3)) {
            a(b2, b3, (byte) (m223a(b2, b3) & d));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m226a(mobak.b.b.i iVar) {
        d m232a;
        if (iVar == null || (m232a = m232a(iVar.c())) == null || m232a.e <= 0) {
            return;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= m232a.e) {
                return;
            }
            m225a((byte) (iVar.m158a() + m232a.f379a[b3][0]), (byte) (iVar.b() + m232a.f379a[b3][1]));
            b2 = (byte) (b3 + 1);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m227b(mobak.b.b.i iVar) {
        d m232a;
        if (iVar == null || (m232a = m232a(iVar.c())) == null || m232a.e <= 0) {
            return;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= m232a.e) {
                return;
            }
            byte m158a = (byte) (iVar.m158a() + m232a.f379a[b3][0]);
            byte b4 = (byte) (iVar.b() + m232a.f379a[b3][1]);
            if (m221a() && a(m158a, b4)) {
                a(m158a, b4, (byte) (m223a(m158a, b4) | c));
            }
            b2 = (byte) (b3 + 1);
        }
    }

    public static byte a(byte b2) {
        return (byte) (b2 & f362a);
    }

    public static byte b(byte b2) {
        return (byte) ((b2 & b) >> 3);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m228a(byte b2) {
        return ((byte) (b2 & f362a)) == 0;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m229b(byte b2) {
        return (b(b2) != 0 || (b2 & c) == c || ((byte) (b2 & f362a)) == 0) ? false : true;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m230a(byte b2, byte b3) {
        if (m221a() && a(b2, b3)) {
            return m229b(m223a(b2, b3));
        }
        return false;
    }

    public static short a(String str) {
        if (str == null) {
            return (short) -1;
        }
        if (a == null) {
            a = new Image[5];
            f358a = new String[5];
        }
        synchronized (Main2.a) {
            short s = 0;
            while (s < f358a.length && f358a[s] != null) {
                if (f358a[s].equals(str)) {
                    return s;
                }
                s = (short) (s + 1);
            }
            if (s >= f358a.length) {
                s = (short) a.length;
                Image[] imageArr = new Image[a.length + 5];
                System.arraycopy(a, 0, imageArr, 0, a.length);
                a = imageArr;
                String[] strArr = new String[f358a.length + 5];
                System.arraycopy(f358a, 0, strArr, 0, f358a.length);
                f358a = strArr;
            }
            a[s] = m231a(new StringBuffer("/mobak/res/").append(str).toString());
            if (a[s] == null) {
                return (short) -1;
            }
            f358a[s] = str;
            return s;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Image m231a(String str) {
        try {
            return Image.createImage(str);
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("loadImage (").append(str).append("): ").append(e.toString()).toString());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v23, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static void c() {
        ?? resourceAsStream = Main2.a.getClass().getResourceAsStream("/mobak/res/image_size.bin");
        if (resourceAsStream == 0) {
            return;
        }
        try {
            ?? a2 = Main2.a((InputStream) resourceAsStream);
            resourceAsStream.close();
            if (a2 == 0 || a2.length == 0) {
                return;
            }
            int i = a2[0];
            f359a = new d[i];
            int i2 = 1;
            for (byte b2 = 0; b2 < i; b2 = (byte) (b2 + 1)) {
                d dVar = new d();
                int i3 = i2;
                int i4 = i2 + 1;
                dVar.a = a2[i3] == true ? (byte) 1 : (byte) 0;
                int i5 = i4 + 1;
                dVar.b = a2[i4] == true ? (byte) 1 : (byte) 0;
                int i6 = i5 + 1;
                dVar.c = a2[i5] == true ? (byte) 1 : (byte) 0;
                int i7 = i6 + 1;
                dVar.d = a2[i6] == true ? (byte) 1 : (byte) 0;
                int i8 = i7 + 1;
                dVar.e = a2[i7] == true ? (byte) 1 : (byte) 0;
                resourceAsStream = dVar.e;
                if (resourceAsStream > 0) {
                    dVar.f379a = new byte[dVar.e][2];
                    byte b3 = 0;
                    for (byte b4 = 0; b4 < dVar.e; b4 = (byte) (b4 + 1)) {
                        int i9 = i8;
                        int i10 = i8 + 1;
                        dVar.f379a[b3][0] = a2[i9] == true ? 1 : 0;
                        i8 = i10 + 1;
                        dVar.f379a[b3][1] = a2[i10] == true ? 1 : 0;
                        b3 = (byte) (b3 + 1);
                    }
                }
                int i11 = i8;
                i2 = i8 + 1;
                int i12 = a2[i11];
                if (i12 > 0) {
                    dVar.f380a = new byte[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        int i14 = i2;
                        i2++;
                        dVar.f380a[i13] = a2[i14] == true ? 1 : 0;
                    }
                }
                f359a[b2] = dVar;
            }
        } catch (Exception e) {
            mobak.a.a.a(resourceAsStream.getMessage());
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static d m232a(byte b2) {
        if (f359a == null || f359a.length == 0) {
            return null;
        }
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= f359a.length) {
                return null;
            }
            if (f359a[b4] != null && f359a[b4].a == b2) {
                return f359a[b4];
            }
            b3 = (byte) (b4 + 1);
        }
    }

    public static void d() {
        if (a != null) {
            for (int i = 0; i < a.length; i++) {
                a[i] = null;
            }
        }
    }

    public static Image a(short s) {
        try {
            if (a == null || s < 0 || s >= a.length) {
                return null;
            }
            if (a[s] == null) {
                a[s] = m231a(new StringBuffer("/mobak/res/").append(f358a[s]).toString());
            }
            return a[s];
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("getImage (").append((int) s).append(") ").append(e).toString());
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m233a() {
        return new StringBuffer("length: ").append(String.valueOf(a.length)).toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [byte[], java.lang.Exception] */
    public static final byte a(byte b2, int i) {
        ?? r0 = f363b;
        if (r0 == 0) {
            try {
                InputStream resourceAsStream = Main2.a.getClass().getResourceAsStream("/mobak/res/units_margin.bin");
                if (resourceAsStream == null) {
                    f363b = new byte[0];
                    return (byte) 14;
                }
                f363b = Main2.a(resourceAsStream);
                resourceAsStream.close();
            } catch (IOException e) {
                mobak.a.a.a((Exception) r0);
            }
        }
        int i2 = ((b2 - 1) * 5) + i;
        if (i2 >= f363b.length) {
            return (byte) 14;
        }
        return f363b[i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b4, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
    
        r0 = (byte) (r9 + 1);
        r9 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(mobak.b.b.i r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mobak.c.a(mobak.b.b.i, boolean):void");
    }
}
