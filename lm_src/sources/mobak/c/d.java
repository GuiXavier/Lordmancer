package mobak.c;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import mobak.Main2;

/* loaded from: LordmancerL.jar:mobak/c/d.class */
public final class d {
    public static g a;
    public static g b = new g();
    public static g c = new g();

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x009a: INVOKE (r0 I:java.lang.Throwable) VIRTUAL call: java.lang.Throwable.printStackTrace():void A[MD:():void (c)], block:B:24:0x0099 */
    public static void a(int i, String str) {
        Throwable printStackTrace;
        try {
            if (str.indexOf("<?") < 0) {
                a.a(i, str);
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (str.indexOf("<?") >= 0) {
                stringBuffer.append(str.substring(0, str.indexOf("<?")));
                String substring = str.substring(str.indexOf("<?") + 2);
                String substring2 = substring.substring(0, substring.indexOf("?>"));
                if (substring2.equals("n")) {
                    stringBuffer.append("\n");
                } else {
                    stringBuffer.append(b(Integer.parseInt(substring2)));
                }
                str = substring.substring(substring.indexOf("?>") + 2);
            }
            if (str.length() > 0) {
                stringBuffer.append(str);
            }
            a.a(i, stringBuffer.toString());
        } catch (Exception e) {
            printStackTrace.printStackTrace();
        }
    }

    public static String a(int i) {
        return a(i, (String[]) null);
    }

    public static String a(int i, String[] strArr) {
        return a(b(i), strArr);
    }

    public static String a(String str, String[] strArr) {
        try {
            if (str.indexOf("<%") < 0) {
                return str;
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (str.indexOf("<%") >= 0) {
                stringBuffer.append(str.substring(0, str.indexOf("<%")));
                String substring = str.substring(str.indexOf("<%") + 2);
                String substring2 = substring.substring(0, substring.indexOf("%>"));
                if (substring2.equals("login")) {
                    stringBuffer.append(mobak.b.a.b.a.b);
                } else if (substring2.equals("heroid")) {
                    stringBuffer.append(mobak.b.a.b.a.f73a);
                } else if (substring2.equals("n")) {
                    stringBuffer.append("\n");
                } else {
                    stringBuffer.append(strArr[Integer.parseInt(substring2)]);
                }
                str = substring.substring(substring.indexOf("%>") + 2);
            }
            if (str.length() > 0) {
                stringBuffer.append(str);
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "cannot getMessage";
        }
    }

    private static int a(String str) {
        int i = 0;
        if (str.startsWith("?")) {
            i = 1;
        }
        try {
            return Integer.parseInt(str.substring(i, str.indexOf(" ")));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final String b(int i) {
        try {
            if (a == null) {
                InputStream resourceAsStream = Main2.a.getClass().getResourceAsStream("/mobak/help/Language.txt");
                byte[] a2 = Main2.a(resourceAsStream);
                resourceAsStream.close();
                Vector vector = new Vector();
                String str = new String(a2, "UTF-8");
                int i2 = 0;
                boolean z = true;
                while (i2 < str.length()) {
                    int indexOf = str.indexOf("\r\n", i2);
                    int i3 = indexOf;
                    if (indexOf == -1) {
                        i3 = str.length();
                    }
                    String substring = str.substring(i2, i3);
                    if (z) {
                        z = false;
                    } else {
                        vector.addElement(substring);
                    }
                    a(substring);
                    i2 = i3 + "\r\n".length();
                }
                a = new g();
                for (int i4 = 0; i4 < vector.size(); i4++) {
                    String str2 = (String) vector.elementAt(i4);
                    g gVar = a;
                    int a3 = a(str2);
                    int indexOf2 = str2.indexOf(" ");
                    gVar.a(a3, indexOf2 < 0 ? str2 : str2.substring(indexOf2 + 1));
                }
                for (int i5 = 0; i5 < vector.size(); i5++) {
                    g gVar2 = a;
                    int i6 = i5;
                    int i7 = (gVar2.f378a == null || i6 >= gVar2.f378a.length) ? -1 : gVar2.f378a[i6];
                    g gVar3 = a;
                    int i8 = i5;
                    a(i7, (gVar3.a == null || i8 >= gVar3.a.length) ? null : gVar3.a[i8]);
                }
            }
            String a4 = a.a(i);
            if (a4 != null) {
                return a4;
            }
            String appProperty = Main2.a.getAppProperty(new StringBuffer().append(i).toString());
            return appProperty == null ? "" : appProperty;
        } catch (IOException e) {
            mobak.a.a.a(new StringBuffer("load Language String: ").append(e).toString());
            return "line not found";
        }
    }

    public static String a(byte b2) {
        switch (b2) {
            case 1:
                return a(19, (String[]) null);
            case 2:
                return a(20, (String[]) null);
            case 3:
                return a(21, (String[]) null);
            case 4:
                return a(22, (String[]) null);
            case 5:
                return a(23, (String[]) null);
            default:
                return "";
        }
    }

    public static String c(int i) {
        switch (i) {
            case 1:
                return a(24, (String[]) null);
            case 2:
                return a(25, (String[]) null);
            case 3:
                return a(26, (String[]) null);
            case 4:
                return a(27, (String[]) null);
            case 5:
                return a(28, (String[]) null);
            default:
                return "";
        }
    }
}
