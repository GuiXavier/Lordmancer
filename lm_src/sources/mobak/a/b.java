package mobak.a;

import java.io.IOException;
import java.io.InputStream;
import mobak.Main2;
import mobak.a.a.l;
import mobak.b.b.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: LordmancerL.jar:mobak/a/b.class */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with other field name */
    private InputStream f41a;
    private short b;

    /* renamed from: a, reason: collision with other field name */
    private long f42a;

    /* renamed from: a, reason: collision with other field name */
    private byte f43a;

    /* renamed from: a, reason: collision with other field name */
    private Thread f46a;

    /* renamed from: a, reason: collision with other field name */
    private final a f49a;
    public short a = 0;

    /* renamed from: a, reason: collision with other field name */
    public boolean f40a = false;

    /* renamed from: a, reason: collision with other field name */
    public int f44a = 0;

    /* renamed from: b, reason: collision with other field name */
    private boolean f45b = true;

    /* renamed from: b, reason: collision with other field name */
    private byte f47b = 0;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f48a = new byte[a.m16b() + 10];

    public b(a aVar, InputStream inputStream) {
        this.f49a = aVar;
    }

    public final void a(InputStream inputStream) {
        this.f41a = inputStream;
        if (this.f46a == null) {
            this.f46a = new Thread(this);
            this.f46a.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [short] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    private short a(int i, int i2) {
        this.f49a.m10a();
        ?? a = a.a(this.f49a);
        if (a == 0) {
            return (short) 0;
        }
        try {
            if (this.f41a.available() <= 0) {
                return (short) 0;
            }
            a = (short) this.f41a.read(this.f48a, i, i2);
            return a;
        } catch (IOException e) {
            a.a(new StringBuffer("readData: ").append(e.getMessage()).toString(), false);
            return (short) 0;
        } catch (Error e2) {
            a.a(a.getMessage());
            return (short) 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? c;
        short a;
        boolean z = false;
        short s = 0;
        short s2 = a.a;
        while (!Main2.f0a && a.b(this.f49a) && (c = a.c(this.f49a)) == 0) {
            try {
                Thread.sleep(200L);
                c = this.f49a.f30a;
                if (c != 0) {
                    this.f49a.a();
                    if (this.f49a.m10a()) {
                        l lVar = new l(mobak.a.a.b.f33a[55]);
                        lVar.a(mobak.b.a.b.a.f73a);
                        lVar.b(this.b);
                        this.f49a.a(lVar);
                    } else {
                        a.m18a(this.f49a);
                    }
                    if (a.m19b(this.f49a) > a.f13b) {
                        m.a(mobak.c.d.a(29), mobak.c.d.a(31), new c(this));
                        this.f49a.f30a = false;
                    } else {
                        Thread.sleep(5000L);
                    }
                }
                if (a.a(this.f49a) && !this.f49a.f30a && !this.f45b && System.currentTimeMillis() - this.f42a > (this.f43a + 1) * a.f12a * 1000 && mobak.b.a.b.a != null) {
                    if (this.f43a > a.f13b) {
                        a.m17a(this.f49a);
                    } else {
                        this.f43a = (byte) (this.f43a + 1);
                        this.f49a.a(new l(mobak.a.a.b.f33a[54], (short) 0, (short) 0));
                    }
                }
                while (this.f41a != null && (a = a(s, s2)) > 0 && a.a(this.f49a)) {
                    this.f42a = System.currentTimeMillis();
                    this.f45b = false;
                    this.f43a = (byte) 0;
                    s = (short) (s + a);
                    this.f44a += a;
                    this.f40a = true;
                    if (z) {
                        short s3 = (short) (s2 - a);
                        s2 = s3;
                        if (s3 == 0) {
                            a();
                            s = 0;
                            s2 = a.a;
                            z = false;
                        }
                    } else {
                        if (a != a.a) {
                            s2 = (short) (s2 - a);
                        }
                        if (s == a.a) {
                            this.a = (short) (((Byte.MAX_VALUE & this.f48a[0]) << 8) | (255 & this.f48a[1]));
                            s2 = (short) (((Byte.MAX_VALUE & this.f48a[4]) << 8) | (255 & this.f48a[5]));
                            z = true;
                        }
                    }
                    Thread.sleep(100L);
                }
                this.f40a = false;
            } catch (Error e) {
                a.a(c.getMessage());
            } catch (Exception e2) {
                a.a(new StringBuffer("inputRun ").append(e2.toString()).toString());
            }
        }
        this.f46a = null;
    }

    private synchronized void a() {
        try {
            byte m9a = a.m9a(this.f48a);
            if (this.f47b == 0) {
                this.f47b = m9a;
            }
            mobak.a.a.a.a(this.f48a);
            this.f47b = (byte) (this.f47b - 1);
            if (mobak.a.a.a.m22a() == a.f15a.f25c && a.f15a.f26a > 0) {
                a.f15a.f26a = System.currentTimeMillis();
                m.a((short) (((m9a - this.f47b) * 100) / m9a));
            }
            if (this.f47b == 0) {
                try {
                    boolean m184c = m.a.m184c();
                    short m22a = mobak.a.a.a.m22a();
                    short m23b = mobak.a.a.a.m23b();
                    mobak.a.a.b.a();
                    if (this.f49a.a(m22a)) {
                        this.f49a.c();
                    }
                    if (m23b != 0) {
                        this.f49a.a(m23b, m184c);
                    }
                } catch (Exception e) {
                    a.a(new StringBuffer("compileGameCommand: ").append(e.getMessage()).toString());
                }
                this.b = this.a;
                this.a = (short) 0;
            }
        } catch (Exception e2) {
            a.a(new StringBuffer("putPkg ").append(e2.getMessage()).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(b bVar) {
        if (bVar.f48a != null) {
            for (int i = 0; i < bVar.f48a.length; i++) {
                bVar.f48a[i] = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(b bVar) {
    }
}
