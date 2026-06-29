package mobak.b.b.a.a;

import java.util.Vector;

/* loaded from: LordmancerL.jar:mobak/b/b/a/a/b.class */
public final class b {
    private static final Vector a = new Vector();

    private b() {
    }

    public static a a(int i) {
        a aVar = null;
        int i2 = 0;
        while (i2 < a.size() && aVar == null) {
            int i3 = i2;
            i2++;
            a aVar2 = (a) a.elementAt(i3);
            if (aVar2.a() == i) {
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static a[] a() {
        int size = a.size();
        if (size == 0) {
            return null;
        }
        a[] aVarArr = new a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = (a) a.elementAt(i);
        }
        return aVarArr;
    }
}
