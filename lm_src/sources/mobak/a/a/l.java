package mobak.a.a;

/* loaded from: LordmancerL.jar:mobak/a/a/l.class */
public final class l {
    public static short a = 6;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f38a;
    private short b;

    /* renamed from: a, reason: collision with other field name */
    private boolean f39a;

    public l(short s) {
        this.b = (short) 0;
        this.f39a = false;
        this.f38a = new byte[6];
        this.f38a[0] = (byte) (s >> 8);
        this.f38a[1] = (byte) s;
    }

    public l(short s, short s2, short s3, boolean z) {
        this.b = (short) 0;
        this.f39a = false;
        this.f38a = new byte[s2 + 6];
        this.f38a[0] = (byte) (s >> 8);
        this.f38a[1] = (byte) s;
        this.f38a[4] = (byte) (s3 >> 8);
        this.f38a[5] = (byte) s3;
        this.f39a = z;
    }

    public l(short s, short s2, short s3) {
        this.b = (short) 0;
        this.f39a = false;
        this.f38a = new byte[s2 + 6];
        this.f38a[0] = (byte) (s >> 8);
        this.f38a[1] = (byte) s;
        this.f38a[4] = (byte) (s3 >> 8);
        this.f38a[5] = (byte) s3;
    }

    public final short a() {
        if (this.f38a == null || this.f38a.length < 2) {
            throw new Exception("command data isn't defined");
        }
        return (short) (((255 & this.f38a[4]) << 8) | (255 & this.f38a[5]));
    }

    /* renamed from: a, reason: collision with other method in class */
    public final byte[] m44a() {
        this.f38a[2] = (byte) (this.b >> 8);
        this.f38a[3] = (byte) this.b;
        return this.f38a;
    }

    public final void a(short s) {
        if (this.f38a == null || this.f38a.length < 4) {
            this.f38a = new byte[6];
        }
        this.f38a[4] = (byte) (s >> 8);
        this.f38a[5] = (byte) s;
    }

    public final int a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return 0;
        }
        if ((this.f38a.length - 6) - this.b < bArr.length) {
            byte[] bArr2 = new byte[6 + this.b + bArr.length];
            System.arraycopy(this.f38a, 0, bArr2, 0, this.f38a.length);
            this.f38a = bArr2;
        }
        System.arraycopy(bArr, 0, this.f38a, this.b + 6, bArr.length);
        this.b = (short) (this.b + bArr.length);
        this.f38a[2] = (byte) (this.b >> 8);
        this.f38a[3] = (byte) this.b;
        return bArr.length;
    }

    public final void a(int i) {
        if ((this.f38a.length - 6) - this.b < 4) {
            byte[] bArr = new byte[6 + this.b + 4];
            System.arraycopy(this.f38a, 0, bArr, 0, this.f38a.length);
            this.f38a = bArr;
        }
        this.f38a[6 + this.b] = (byte) (i >>> 24);
        this.b = (short) (this.b + 1);
        this.f38a[6 + this.b] = (byte) (i >> 16);
        this.b = (short) (this.b + 1);
        this.f38a[6 + this.b] = (byte) (i >> 8);
        this.b = (short) (this.b + 1);
        this.f38a[6 + this.b] = (byte) i;
        this.b = (short) (this.b + 1);
    }

    public final void b(short s) {
        if ((this.f38a.length - 6) - this.b < 2) {
            byte[] bArr = new byte[6 + this.b + 2];
            System.arraycopy(this.f38a, 0, bArr, 0, this.f38a.length);
            this.f38a = bArr;
        }
        this.f38a[6 + this.b] = (byte) (s >> 8);
        this.b = (short) (this.b + 1);
        this.f38a[6 + this.b] = (byte) s;
        this.b = (short) (this.b + 1);
    }

    public final void a(byte b) {
        if ((this.f38a.length - 6) - this.b <= 0) {
            byte[] bArr = new byte[6 + this.b + 1];
            System.arraycopy(this.f38a, 0, bArr, 0, this.f38a.length);
            this.f38a = bArr;
        }
        this.f38a[6 + this.b] = b;
        this.b = (short) (this.b + 1);
    }

    public final void a(long j) {
        if ((this.f38a.length - 6) - this.b < 8) {
            byte[] bArr = new byte[6 + this.b + 8];
            System.arraycopy(this.f38a, 0, bArr, 0, this.f38a.length);
            this.f38a = bArr;
        }
        this.f38a[6 + this.b] = (byte) ((j >> 56) & 255);
        this.b = (short) (this.b + 1);
        this.f38a[6 + this.b] = (byte) ((j >> 48) & 255);
        this.b = (short) (this.b + 1);
        this.f38a[6 + this.b] = (byte) ((j >> 40) & 255);
        this.b = (short) (this.b + 1);
        this.f38a[6 + this.b] = (byte) ((j >> 32) & 255);
        this.b = (short) (this.b + 1);
        this.f38a[6 + this.b] = (byte) ((j >> 24) & 255);
        this.b = (short) (this.b + 1);
        this.f38a[6 + this.b] = (byte) ((j >> 16) & 255);
        this.b = (short) (this.b + 1);
        this.f38a[6 + this.b] = (byte) ((j >> 8) & 255);
        this.b = (short) (this.b + 1);
        this.f38a[6 + this.b] = (byte) (j & 255);
        this.b = (short) (this.b + 1);
    }

    public static final short b() {
        return (short) 8;
    }

    public final void a(String str) {
        if (str == null || str.equals("")) {
            b((short) 0);
            return;
        }
        byte[] bArr = null;
        if (mobak.a.a.f14a.equals("")) {
            bArr = str.getBytes();
        } else {
            try {
                bArr = str.getBytes(mobak.a.a.f14a);
            } catch (Exception e) {
                mobak.a.a.a(new StringBuffer("addToBody").append(e.toString()).toString());
            }
        }
        if (bArr == null) {
            b((short) 0);
        } else {
            b((short) bArr.length);
            a(bArr);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m45a() {
        return this.f39a;
    }
}
