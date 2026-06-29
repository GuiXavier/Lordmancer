package mobak;

import mobak.a.a.l;
import mobak.b.b.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: LordmancerL.jar:mobak/g.class */
public final class g implements Runnable {
    private byte a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f381a;

    /* renamed from: a, reason: collision with other field name */
    private i f382a;

    /* renamed from: a, reason: collision with other field name */
    private final Main2 f383a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Main2 main2, byte b) {
        this.f383a = main2;
        this.a = (byte) 0;
        this.a = b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Main2 main2, i iVar) {
        this.f383a = main2;
        this.a = (byte) 0;
        this.a = (byte) 3;
        this.f382a = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v36 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? stringBuffer;
        l lVar;
        l lVar2;
        this.f381a = true;
        loop0: while (!Main2.f0a && this.f381a) {
            try {
                Thread.sleep(300L);
            } catch (Exception e) {
                mobak.a.a.a(new StringBuffer("runCon").append(e.toString()).toString());
            }
            if (this.a != 0) {
                if (this.a == 1 || this.a == 3) {
                    m.a.a(true, true);
                }
                byte b = 0;
                while (true) {
                    byte b2 = b;
                    if (b2 < mobak.a.a.f13b) {
                        try {
                            mobak.a.a.f15a.a();
                        } catch (Exception e2) {
                            stringBuffer = new StringBuffer("connection").append(e2.toString()).toString();
                            mobak.a.a.a((String) stringBuffer);
                            try {
                                stringBuffer = 5000;
                                Thread.sleep(5000L);
                            } catch (InterruptedException e3) {
                                stringBuffer.printStackTrace();
                            }
                        }
                        if (mobak.a.a.f15a.m15d()) {
                            this.f381a = false;
                            m.a.a(true);
                            return;
                        }
                        ?? r0 = mobak.a.a.f15a.f30a;
                        if (r0 == 0) {
                            mobak.a.a.f15a.b();
                            if (m.a == null) {
                                m mVar = new m();
                                m.a = mVar;
                                mVar.b();
                            }
                            if (this.a != 1) {
                                if (this.a != 3) {
                                    break loop0;
                                }
                                i iVar = this.f382a;
                                Main2.a(this.f383a, true);
                                lVar = new l(mobak.a.a.b.f33a[0], (short) 16, mobak.a.a.b.f33a[21], true);
                                Main2 main2 = this.f383a;
                                lVar.a(Main2.d());
                                lVar.a(iVar.b);
                                lVar.a(iVar.c);
                                lVar.a(-1);
                                lVar.a((byte) 3);
                                Main2 main22 = this.f383a;
                                lVar.a(Main2.d());
                                lVar.a((byte) 0);
                                lVar.a(iVar.a);
                                lVar.a(iVar.d);
                                lVar.a(iVar.f384a);
                                lVar.a(Main2.b(this.f383a));
                                try {
                                    lVar.a(Long.parseLong(this.f383a.a("refID", "0")));
                                    break loop0;
                                } catch (NumberFormatException unused) {
                                    lVar.a(0L);
                                }
                            } else {
                                Main2.a(this.f383a, false);
                                int m236a = this.f383a.f5a.m236a((byte) 9, -1);
                                boolean z = false;
                                if (m236a > 0) {
                                    try {
                                        byte[] a = this.f383a.f5a.a((byte) 8);
                                        short a2 = mobak.c.e.a(a, 0, (short) -1);
                                        if (a2 > 0) {
                                            mobak.b.b.j.f265a = mobak.c.e.a(a, 2, a2, "");
                                            z = true;
                                        }
                                    } catch (Exception e4) {
                                        mobak.a.a.a(new StringBuffer("dialup ").append(e4.toString()).toString());
                                    }
                                }
                                short s = mobak.a.a.b.f33a[20];
                                if (!z) {
                                    s = mobak.a.a.b.f33a[21];
                                }
                                lVar2 = new l(mobak.a.a.b.f33a[0], (short) 16, s, true);
                                Main2 main23 = this.f383a;
                                lVar2.a(Main2.d());
                                lVar2.a(mobak.b.a.b.a.b);
                                lVar2.a(Main2.a(this.f383a));
                                if (z) {
                                    lVar2.a(m236a);
                                } else {
                                    lVar2.a(-1);
                                }
                                lVar2.a((byte) 3);
                                Main2 main24 = this.f383a;
                                lVar2.a(Main2.d());
                                String m238a = Main2.a.f5a.m238a((byte) 17, (String) null);
                                String m238a2 = Main2.a.f5a.m238a((byte) 2, (String) null);
                                if ((m238a != null && !m238a.equals("")) || (m238a2 != null && !m238a2.equals(""))) {
                                    break loop0;
                                }
                                lVar2.a(Main2.b(this.f383a));
                                try {
                                    lVar2.a(Long.parseLong(this.f383a.a("refID", "0")));
                                    break loop0;
                                } catch (NumberFormatException unused2) {
                                    lVar2.a(0L);
                                }
                            }
                        } else {
                            try {
                                r0 = 5000;
                                Thread.sleep(5000L);
                            } catch (InterruptedException e5) {
                                r0.printStackTrace();
                            }
                            b = (byte) (b2 + 1);
                        }
                        stringBuffer = new StringBuffer("connection").append(e2.toString()).toString();
                        mobak.a.a.a((String) stringBuffer);
                        stringBuffer = 5000;
                        Thread.sleep(5000L);
                        b = (byte) (b2 + 1);
                    } else {
                        m.a.a(true);
                        m.a(mobak.c.d.a(29), mobak.c.d.a(31), new h(this));
                        if (mobak.a.a.f15a != null) {
                            mobak.a.a.f15a.e();
                        }
                        this.a = (byte) 0;
                    }
                }
            }
        }
        return;
        mobak.a.a.f15a.a(lVar);
        Main2.a(this.f383a, (g) null);
        this.a = (byte) 0;
        mobak.a.a.f15a.a(lVar2);
        Main2.a(this.f383a, (g) null);
        this.a = (byte) 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(g gVar) {
        return gVar.f381a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(g gVar, byte b) {
        gVar.a = (byte) 1;
        return (byte) 1;
    }
}
