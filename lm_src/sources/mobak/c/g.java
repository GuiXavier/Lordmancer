package mobak.c;

/* loaded from: LordmancerL.jar:mobak/c/g.class */
public final class g {
    String[] a = new String[5];

    /* renamed from: a, reason: collision with other field name */
    int[] f378a = new int[5];

    public final void a(int i, String str) {
        int i2;
        int m241a = m241a(i);
        int i3 = m241a;
        if (m241a < 0) {
            if (this.a != null && this.f378a != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= this.f378a.length) {
                        i2 = -1;
                        break;
                    } else {
                        if (this.a[i4] == null) {
                            i2 = i4;
                            break;
                        }
                        i4++;
                    }
                }
            } else {
                i2 = -1;
            }
            i3 = i2;
        }
        if (i3 < 0) {
            i3 = this.f378a.length;
            int[] iArr = new int[this.f378a.length + 5];
            System.arraycopy(this.f378a, 0, iArr, 0, this.f378a.length);
            this.f378a = iArr;
            String[] strArr = new String[this.a.length + 5];
            System.arraycopy(this.a, 0, strArr, 0, this.a.length);
            this.a = strArr;
        }
        this.f378a[i3] = i;
        this.a[i3] = str;
    }

    public final String a(int i) {
        int m241a = m241a(i);
        if (m241a >= 0) {
            return this.a[m241a];
        }
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    private int m241a(int i) {
        if (this.a == null || this.f378a == null) {
            return -1;
        }
        for (int i2 = 0; i2 < this.f378a.length; i2++) {
            if (this.f378a[i2] == i) {
                return i2;
            }
        }
        return -1;
    }
}
