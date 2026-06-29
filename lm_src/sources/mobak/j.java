package mobak;

import java.util.Vector;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;
import mobak.b.b.m;

/* loaded from: LordmancerL.jar:mobak/j.class */
public final class j implements Runnable {
    private Thread a = new Thread(this);

    /* renamed from: a, reason: collision with other field name */
    private static boolean f385a = false;

    /* renamed from: a, reason: collision with other field name */
    private String f386a;
    private String b;
    private String c;

    private j(String str, String str2, String str3) {
        this.f386a = str;
        this.c = str2;
        this.b = str3;
        this.a.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageConnection messageConnection = null;
        try {
            try {
                MessageConnection open = Connector.open(new StringBuffer("sms://").append(this.f386a).toString(), 2);
                messageConnection = open;
                TextMessage newMessage = open.newMessage("text");
                newMessage.setPayloadText(this.c);
                messageConnection.send(newMessage);
                if (!f385a) {
                    m.a("", mobak.c.d.a(188));
                }
                f385a = true;
                if (messageConnection != null) {
                    try {
                        messageConnection.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                if (!f385a) {
                    m.a("", mobak.c.d.a(189, new String[]{String.valueOf(this.f386a), this.b}));
                }
                f385a = true;
                if (messageConnection != null) {
                    try {
                        messageConnection.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Throwable th) {
            if (messageConnection != null) {
                try {
                    messageConnection.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    private static int a() {
        try {
            Class.forName("javax.wireless.messaging.Message");
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final void a(String str, String str2, String str3) {
        if (a() == 0) {
            return;
        }
        new j(str2, str, str3);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static final void m243a() {
        f385a = false;
    }

    public static final String[] a(String str, char c) {
        Vector vector = new Vector();
        int i = -1;
        while (i < str.length() - 1) {
            int i2 = i;
            int indexOf = str.indexOf(32, i2 + 1);
            i = indexOf;
            if (indexOf == -1) {
                i = str.length();
            }
            if ((i - i2) - 1 > 0) {
                vector.addElement(str.substring(i2 + 1, i));
            }
        }
        if (vector.size() <= 0) {
            return new String[0];
        }
        String[] strArr = new String[vector.size()];
        for (int i3 = 0; i3 < vector.size(); i3++) {
            strArr[i3] = (String) vector.elementAt(i3);
        }
        return strArr;
    }
}
