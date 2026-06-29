package mobak.a;

import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;
import mobak.a.a.l;
import mobak.b.b.j;
import mobak.b.b.m;
import mobak.b.b.p;

/* loaded from: LordmancerL.jar:mobak/a/a.class */
public final class a {
    public static short b;
    public static int c;

    /* renamed from: a, reason: collision with other field name */
    private SocketConnection f19a;

    /* renamed from: c, reason: collision with other field name */
    private boolean f21c;

    /* renamed from: d, reason: collision with other field name */
    private boolean f22d;

    /* renamed from: a, reason: collision with other field name */
    private b f23a;

    /* renamed from: a, reason: collision with other field name */
    private d f24a;

    /* renamed from: c, reason: collision with other field name */
    public short f25c;

    /* renamed from: a, reason: collision with other field name */
    public long f26a;

    /* renamed from: c, reason: collision with other field name */
    private String f27c;

    /* renamed from: d, reason: collision with other field name */
    private String f28d;

    /* renamed from: a, reason: collision with other field name */
    private StringBuffer f31a;
    public static short a = 6;

    /* renamed from: a, reason: collision with other field name */
    public static int f12a = 45;

    /* renamed from: b, reason: collision with other field name */
    public static int f13b = 2;
    private static short d = 1024;

    /* renamed from: a, reason: collision with other field name */
    public static String f14a = "";

    /* renamed from: a, reason: collision with other field name */
    public static a f15a = null;

    /* renamed from: a, reason: collision with other field name */
    private static String[] f16a = new String[5];

    /* renamed from: a, reason: collision with other field name */
    private static byte f17a = 0;

    /* renamed from: b, reason: collision with other field name */
    private static String f18b = null;

    /* renamed from: b, reason: collision with other field name */
    private boolean f20b = false;

    /* renamed from: b, reason: collision with other field name */
    private byte f29b = 0;

    /* renamed from: a, reason: collision with other field name */
    public boolean f30a = false;
    private boolean e = false;

    public static short a(byte[] bArr) {
        if (bArr == null) {
            return (short) 0;
        }
        return (short) (((Byte.MAX_VALUE & bArr[4]) << 8) | (255 & bArr[5]));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static byte m9a(byte[] bArr) {
        if (bArr == null) {
            return (byte) 0;
        }
        return bArr[2];
    }

    public final boolean a(short s) {
        return this.f25c == s;
    }

    public static void a(String str, boolean z) {
        if (str != null && !str.equals(f18b) && z) {
            m.a(mobak.c.d.a(135), str);
            f18b = str;
            m.a.l();
        }
        f16a[f17a] = str;
        byte b2 = (byte) (f17a + 1);
        f17a = b2;
        if (b2 >= f16a.length) {
            f17a = (byte) 0;
        }
    }

    public static void a(Exception exc) {
        exc.printStackTrace();
        a(exc.getMessage(), false);
    }

    public static void a(String str) {
        a(str, false);
    }

    public a() {
        this.f21c = false;
        f15a = this;
        this.f21c = false;
        this.f22d = false;
    }

    public final void a(String str, String str2) {
        this.f27c = str2;
        this.f28d = str;
        this.f23a = new b(this, null);
        this.f24a = new d(this, null);
        f15a = this;
        this.f21c = false;
        this.f22d = false;
    }

    public final void a() {
        try {
            this.f30a = true;
            this.f19a = Connector.open(new StringBuffer("socket://").append(this.f27c).append(":").append(this.f28d).toString());
            this.e = false;
            this.f30a = false;
            this.f22d = true;
            this.f23a.a(this.f19a.openDataInputStream());
            this.f24a.a(this.f19a.openDataOutputStream());
        } catch (SecurityException e) {
            this.e = true;
            this.f19a = null;
            a(new StringBuffer("SocketListenerMe ").append(e.toString()).toString(), false);
        } catch (Exception e2) {
            this.f19a = null;
            a(new StringBuffer("SocketListenerMe ").append(e2.toString()).toString(), false);
        }
    }

    public final boolean a(l lVar) {
        if (lVar != null) {
            try {
                if (lVar.a() != 0) {
                    a(lVar.a(), lVar.m45a());
                }
            } catch (Exception e) {
                a(new StringBuffer("sendCommand ").append(e.toString()).toString(), false);
                return false;
            }
        }
        this.f24a.a(lVar);
        return true;
    }

    public final void a(short s, boolean z) {
        if (s == 0) {
            return;
        }
        this.f25c = s;
        this.f26a = System.currentTimeMillis();
        m.a.a(z, true);
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m10a() {
        this.f20b = this.f19a != null;
        if (!this.f20b) {
            return false;
        }
        try {
            this.f20b = true;
            this.f19a.getLocalPort();
        } catch (IOException unused) {
            this.f20b = false;
            f();
        }
        return this.f20b;
    }

    private void f() {
        if (this.f30a) {
            return;
        }
        a(mobak.c.d.a(147), false);
        if (m.a.m182b()) {
            m.a.b(false);
        }
        b.a(this.f23a);
        this.f30a = true;
        this.f29b = (byte) 0;
    }

    public final void b() {
        try {
            l lVar = new l(mobak.a.a.b.f33a[3], (short) 30, (short) 0);
            lVar.a(f12a);
            lVar.a(f13b);
            lVar.b(d);
            lVar.a(f14a);
            lVar.a("EN");
            a(lVar);
        } catch (Exception e) {
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public final boolean m11b() {
        return this.f25c != -1;
    }

    public final void c() {
        this.f25c = (short) -1;
        m.a.a(true);
    }

    public final void d() {
        this.f26a = System.currentTimeMillis();
    }

    public final void a(p pVar) {
        if (pVar == null) {
            return;
        }
        if (this.f31a == null) {
            this.f31a = new StringBuffer();
        } else {
            this.f31a.delete(0, this.f31a.length());
        }
        if (this.f23a != null) {
            if (this.f23a.f40a) {
                pVar.a("Receiving", j.f259b, false, 0);
            } else {
                pVar.a("Waiting", j.f259b, false, 0);
            }
            this.f31a.append("last read: ").append((int) this.f23a.a);
            pVar.a(this.f31a.toString(), j.f259b, false, 0);
            this.f31a.delete(0, this.f31a.length());
            this.f31a.append("bytes read: ").append(this.f23a.f44a);
            pVar.a(this.f31a.toString(), j.f259b, false, 0);
            this.f31a.delete(0, this.f31a.length());
        }
        if (this.f24a != null) {
            this.f31a.append("last sent: ").append((int) d.a(this.f24a));
            pVar.a(this.f31a.toString(), j.f259b, false, 0);
            this.f31a.delete(0, this.f31a.length());
            this.f31a.append("pkg sent: ").append(this.f24a.f57b);
            pVar.a(this.f31a.toString(), j.f259b, false, 0);
            this.f31a.delete(0, this.f31a.length());
            this.f31a.append("bytes sent: ").append(this.f24a.f56a);
            pVar.a(this.f31a.toString(), j.f259b, false, 0);
            this.f31a.delete(0, this.f31a.length());
        }
        this.f31a.append("cur. sceen mode: ").append(m.a.m185a());
        pVar.a(this.f31a.toString(), j.f259b, false, 0);
        this.f31a.delete(0, this.f31a.length());
        this.f31a.append("prev. sceen mode: ").append(m.a.m186b());
        pVar.a(this.f31a.toString(), j.f259b, false, 0);
        this.f31a.delete(0, this.f31a.length());
        this.f31a.append("freeMemory: ").append(Runtime.getRuntime().freeMemory());
        pVar.a(this.f31a.toString(), j.f259b, false, 0);
        this.f31a.delete(0, this.f31a.length());
        this.f31a.append("images container: ").append(mobak.c.m233a());
        pVar.a(this.f31a.toString(), j.f259b, false, 0);
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= f16a.length) {
                return;
            }
            if (f16a[b3] != null) {
                pVar.a(f16a[b3], j.f259b, false, 0);
            }
            b2 = (byte) (b3 + 1);
        }
    }

    public final void a(boolean z) {
        this.f21c = true;
        if (z) {
            a(new l(mobak.a.a.b.f33a[24], (short) 0, (short) 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [mobak.a.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [mobak.a.a] */
    public final void e() {
        ?? r0 = this;
        r0.f22d = false;
        try {
            if (this.f19a != null) {
                this.f19a.close();
            }
            r0 = this;
            r0.f19a = null;
        } catch (IOException e) {
            a(r0.getMessage(), false);
        }
        f15a = null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public final boolean m12c() {
        return this.f22d;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static short m13a() {
        return d;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m14a(short s) {
        d = s;
        if (f15a != null) {
            a aVar = f15a;
            if (aVar.f23a != null) {
                b.b(aVar.f23a);
            }
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    public final boolean m15d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: collision with other method in class */
    public static short m16b() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(a aVar) {
        return aVar.f20b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static void m17a(a aVar) {
        aVar.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(a aVar) {
        return aVar.f22d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(a aVar) {
        return aVar.f21c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static byte m18a(a aVar) {
        byte b2 = aVar.f29b;
        aVar.f29b = (byte) (b2 + 1);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: collision with other method in class */
    public static byte m19b(a aVar) {
        return aVar.f29b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(byte[] bArr, short s, byte b2, byte b3, short s2) {
        byte b4 = 0;
        while (true) {
            byte b5 = b4;
            if (b5 >= a) {
                bArr[0] = (byte) (s >> 8);
                bArr[1] = (byte) s;
                bArr[2] = b2;
                bArr[3] = b3;
                bArr[4] = (byte) (s2 >> 8);
                bArr[5] = (byte) s2;
                return bArr;
            }
            bArr[b5] = 0;
            b4 = (byte) (b5 + 1);
        }
    }
}
