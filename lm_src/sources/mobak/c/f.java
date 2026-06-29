package mobak.c;

import javax.microedition.rms.RecordFilter;

/* loaded from: LordmancerL.jar:mobak/c/f.class */
final class f implements RecordFilter {
    private byte[] a;

    public f(e eVar, byte[] bArr) {
        this.a = null;
        this.a = bArr;
    }

    public final boolean matches(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        if (this.a == null || this.a.length == 0) {
            return true;
        }
        if (bArr.length < this.a.length) {
            return false;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= this.a.length) {
                return true;
            }
            if (this.a[s2] != bArr[s2]) {
                return false;
            }
            s = (short) (s2 + 1);
        }
    }
}
