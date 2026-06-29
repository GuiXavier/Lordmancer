package mobak.a;

import java.io.IOException;
import java.io.OutputStream;
import mobak.Main2;
import mobak.a.a.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: LordmancerL.jar:mobak/a/d.class */
public final class d implements Runnable {
    private byte b;

    /* renamed from: c, reason: collision with other field name */
    private byte f52c;

    /* renamed from: a, reason: collision with other field name */
    private Thread f54a;

    /* renamed from: a, reason: collision with other field name */
    private OutputStream f55a;

    /* renamed from: a, reason: collision with other field name */
    private final a f58a;
    private String a = new String(new byte[]{1});

    /* renamed from: a, reason: collision with other field name */
    private byte[][] f50a = new byte[5][0];

    /* renamed from: a, reason: collision with other field name */
    private byte f51a = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;

    /* renamed from: a, reason: collision with other field name */
    private short f53a = 1;

    /* renamed from: a, reason: collision with other field name */
    public int f56a = 0;

    /* renamed from: b, reason: collision with other field name */
    public int f57b = 0;

    public d(a aVar, OutputStream outputStream) {
        this.f58a = aVar;
    }

    public final void a(OutputStream outputStream) {
        this.f55a = outputStream;
        if (this.f54a == null) {
            this.f54a = new Thread(this);
            this.f54a.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    private boolean a(byte[] bArr, byte[] bArr2, int i, int i2) {
        this.f58a.m10a();
        ?? a = a.a(this.f58a);
        if (a == 0) {
            return false;
        }
        try {
            this.f55a.write(bArr);
            this.f55a.write(bArr2, i, i2);
            this.f55a.flush();
            a = 1;
            return true;
        } catch (IOException e) {
            a.m17a(this.f58a);
            a.a(new StringBuffer("sendData ").append(e.getMessage()).toString(), false);
            return false;
        } catch (Error e2) {
            a.a(a.getMessage());
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            if (Main2.f0a || !a.b(this.f58a)) {
                break;
            }
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                a.a(new StringBuffer("Thread interrup: ").append(e.getMessage()).toString(), false);
            }
            if (a.c(this.f58a)) {
                boolean z = this.b <= 0;
                boolean z2 = z;
                if (z) {
                    byte b = 0;
                    while (true) {
                        byte b2 = b;
                        if (b2 < this.f50a.length) {
                            if (this.f50a[b2] != null && this.f50a[b2].length > 0) {
                                z2 = false;
                                break;
                            }
                            b = (byte) (b2 + 1);
                        } else {
                            break;
                        }
                    }
                }
                if (z2) {
                    this.f58a.e();
                    break;
                }
            }
            if (this.b > 0) {
                short s = 0;
                while (this.b > 0 && a.a(this.f58a) && !this.f58a.f30a) {
                    if (this.f52c >= this.f50a.length) {
                        this.f52c = (byte) -1;
                    }
                    if (this.f52c < 0) {
                        byte b3 = 0;
                        while (true) {
                            byte b4 = b3;
                            if (b4 >= this.f50a.length) {
                                break;
                            }
                            if (this.f50a[b4] != null) {
                                this.f52c = b4;
                                break;
                            }
                            b3 = (byte) (b4 + 1);
                        }
                        this.d = 0;
                        this.c = 0;
                    }
                    if (this.f52c >= 0) {
                        byte[] bArr = this.f50a[this.f52c];
                        if (bArr == null || bArr.length < a.a) {
                            this.f50a[this.f52c] = null;
                            this.f52c = (byte) (this.f52c + 1);
                            this.d = 0;
                            this.c = 0;
                        } else {
                            short s2 = (short) (((short) (((255 & bArr[2]) << 8) | (255 & bArr[3]))) + l.a);
                            byte length = (byte) (bArr.length / a.m16b());
                            if (bArr.length % a.m16b() > 0) {
                                length = (byte) (length + 1);
                            }
                            byte[] bArr2 = new byte[a.a];
                            synchronized (this.a) {
                                while (this.d < length && a.a(this.f58a)) {
                                    short m16b = a.m16b();
                                    if (s2 - this.c < a.m16b()) {
                                        m16b = (short) (s2 - this.c);
                                    }
                                    a.a(bArr2, this.f53a, length, (byte) this.d, m16b);
                                    if (!a(bArr2, bArr, this.c, m16b)) {
                                        break;
                                    }
                                    this.c += m16b;
                                    s = (short) (s + a.a + m16b);
                                    this.d++;
                                }
                                this.e += s;
                                if (this.d == length) {
                                    this.f50a[this.f52c] = null;
                                    this.f52c = (byte) (this.f52c + 1);
                                    this.d = 0;
                                    this.c = 0;
                                    this.b = (byte) (this.b - 1);
                                    this.f53a = (short) (this.f53a + 1);
                                    if (this.f53a < 0) {
                                        this.f53a = (short) 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f54a = null;
    }

    public final void a(l lVar) {
        synchronized (this.a) {
            if (lVar == null) {
                return;
            }
            this.f50a[this.f51a] = lVar.m44a();
            this.f57b++;
            this.f56a += this.f50a[this.f51a].length;
            this.f51a = (byte) (this.f51a + 1);
            if (this.f51a >= this.f50a.length) {
                if (this.f50a[0] == null || this.f50a[0].length == 0) {
                    this.f51a = (byte) 0;
                } else {
                    byte[][] bArr = new byte[this.f50a.length + 5][0];
                    System.arraycopy(this.f50a, 0, bArr, 0, this.f50a.length);
                    this.f50a = bArr;
                }
            }
            this.b = (byte) (this.b + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short a(d dVar) {
        return dVar.f53a;
    }
}
