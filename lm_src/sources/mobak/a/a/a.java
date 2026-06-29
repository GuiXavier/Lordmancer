package mobak.a.a;

/* loaded from: LordmancerL.jar:mobak/a/a/a.class */
public final class a {
    private static byte[] a = new byte[10240];

    /* renamed from: a, reason: collision with other field name */
    protected static int f32a = 0;

    public static void a(byte[] bArr) {
        short a2 = mobak.a.a.a(bArr);
        if (f32a + a2 > a.length) {
            int length = ((f32a + a2) - a.length) / 4096;
            if (((f32a + a2) - a.length) % 4096 > 0) {
                length++;
            }
            byte[] bArr2 = new byte[a.length + (length << 12)];
            System.arraycopy(a, 0, bArr2, 0, a.length);
            a = bArr2;
        }
        System.arraycopy(bArr, mobak.a.a.a, a, f32a, a2);
        f32a += a2;
    }

    public static void a() {
        int m24a = m24a();
        for (int i = 0; i < m24a + l.a; i++) {
            a[i] = 0;
        }
        f32a = 0;
    }

    public static void b() {
        f32a = l.a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m21a() {
        if (a == null) {
            return true;
        }
        try {
            return f32a >= m24a() + l.a;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("define EOF ").append(e).toString());
            return true;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static short m22a() {
        if (a == null || a.length < 2) {
            throw new Exception("command data isn't defined");
        }
        return (short) (((255 & a[0]) << 8) | (255 & a[1]));
    }

    /* renamed from: b, reason: collision with other method in class */
    public static short m23b() {
        if (a == null || a.length < 6) {
            throw new Exception("command data isn't defined");
        }
        return (short) (((255 & a[4]) << 8) | (255 & a[5]));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static int m24a() {
        if (a == null || a.length < 6) {
            throw new Exception("command data isn't defined");
        }
        return ((255 & a[2]) << 8) | (255 & a[3]);
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m25b() {
        if (a == null || a.length < 6) {
            throw new Exception("command data isn't defined");
        }
        return a.length < 6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: collision with other method in class */
    public static byte m26a() {
        if (m21a() || f32a >= m24a() + l.a) {
            return (byte) 0;
        }
        f32a++;
        return a[f32a - 1];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static short c() {
        if (m21a()) {
            return (short) 0;
        }
        if ((m24a() + l.a) - f32a < 2) {
            f32a = m24a() + l.a + 1;
            return (short) 0;
        }
        short a2 = mobak.c.e.a(a, f32a, (short) 0);
        f32a += 2;
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: collision with other method in class */
    public static int m27b() {
        if (m21a()) {
            return 0;
        }
        if ((m24a() + l.a) - f32a < 4) {
            f32a = m24a() + l.a + 1;
            return 0;
        }
        byte[] bArr = a;
        int i = f32a;
        int i2 = (bArr == null || bArr.length - i < 4) ? 0 : ((-16777216) & (bArr[i] << 24)) | (16711680 & (bArr[i + 1] << 16)) | (65280 & (bArr[i + 2] << 8)) | (255 & bArr[i + 3]);
        f32a += 4;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: collision with other method in class */
    public static long m28a() {
        if (m21a()) {
            return 0L;
        }
        if ((m24a() + l.a) - f32a < 8) {
            f32a = m24a() + l.a + 1;
            return 0L;
        }
        byte[] bArr = a;
        long j = (bArr == null || bArr.length - f32a < 8) ? 0L : ((-72057594037927936L) & (bArr[r1] << 56)) | (71776119061217280L & (bArr[r1 + 1] << 48)) | (280375465082880L & (bArr[r1 + 2] << 40)) | (1095216660480L & (bArr[r1 + 3] << 32)) | (4278190080L & (bArr[r1 + 4] << 24)) | (16711680 & (bArr[r1 + 5] << 16)) | (65280 & (bArr[r1 + 6] << 8)) | (255 & bArr[r1 + 7]);
        f32a += 8;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long a(byte b) {
        switch (b) {
            case 1:
                return m26a();
            case 2:
                return c();
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                return 0L;
            case 4:
                return m27b();
            case 8:
                return m28a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: collision with other method in class */
    public static String m29a() {
        if (m21a()) {
            return "";
        }
        short c = c();
        if (c >= Short.MIN_VALUE && c < -31744) {
            return mobak.c.d.a((short) (c & Short.MAX_VALUE));
        }
        if (c == 0) {
            return "";
        }
        int i = c >= 0 ? c : Short.MAX_VALUE - c;
        String a2 = mobak.c.e.a(a, f32a, i, "");
        f32a += i;
        return a2;
    }

    public static void b(byte[] bArr) {
        System.arraycopy(a, f32a, bArr, 0, bArr.length);
        f32a += bArr.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.lang.Object, java.lang.Exception] */
    public static byte[] a(int i) {
        ?? r0;
        try {
            r0 = new byte[m24a() - 2];
            System.arraycopy(a, l.a + 2, r0, 0, r0.length);
            return r0;
        } catch (Exception e) {
            mobak.a.a.a((Exception) r0);
            return null;
        }
    }
}
