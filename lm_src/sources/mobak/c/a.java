package mobak.c;

import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.Main2;
import mobak.b.b.m;

/* loaded from: LordmancerL.jar:mobak/c/a.class */
public final class a {
    private static final String[] a = {"FFFFFF", "999999", "FFCC00", "00FF00", "000000"};

    /* renamed from: a, reason: collision with other field name */
    private static final int[][] f367a = {new int[]{32, 64}, new int[]{65, 96}, new int[]{97, 127}, new int[]{193, 220}, new int[]{221, 250}, new int[]{251, 280}, new int[]{281, 310}, new int[]{311, 340}, new int[]{341, 370}, new int[]{371, 400}, new int[]{401, 432}};

    /* renamed from: a, reason: collision with other field name */
    private Image[] f368a;

    /* renamed from: a, reason: collision with other field name */
    private short[] f369a;

    /* renamed from: a, reason: collision with other field name */
    public int f370a;

    public a(byte b, int i) {
        this(b, i, false);
    }

    public a(byte b, int i, boolean z) {
        try {
            this.f368a = new Image[f367a.length];
            int i2 = 0;
            for (int i3 = 0; i3 < f367a.length; i3++) {
                i2 += ((f367a[i3][1] - f367a[i3][0]) + 1) << 1;
            }
            this.f369a = new short[i2];
            int i4 = 0;
            for (int i5 = 0; i5 < f367a.length; i5++) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(i);
                if (z) {
                    stringBuffer.append("bold");
                } else {
                    stringBuffer.append("regular");
                }
                stringBuffer.append('_');
                stringBuffer.append(f367a[i5][0]);
                stringBuffer.append('-');
                stringBuffer.append(f367a[i5][1]);
                InputStream resourceAsStream = Main2.a.getClass().getResourceAsStream(new StringBuffer("/mobak/res/").append(new StringBuffer().append(stringBuffer.toString()).append(".pngs").toString()).toString());
                byte[] a2 = Main2.a(resourceAsStream);
                resourceAsStream.close();
                int length = a2.length / 3;
                for (int i6 = 0; i6 < length && i6 < i2 / 2; i6++) {
                    this.f369a[i4] = (short) ((256 * ((short) (a2[i6 * 3] & 255))) + ((short) (a2[(i6 * 3) + 1] & 255)));
                    int i7 = i4 + 1;
                    this.f369a[i7] = (short) (a2[(i6 * 3) + 2] & 255);
                    i4 = i7 + 1;
                }
                stringBuffer.append('_');
                stringBuffer.append(a[b]);
                this.f368a[i5] = mobak.c.m231a(new StringBuffer("/mobak/res/").append(stringBuffer.toString()).append(".png").toString());
            }
            this.f370a = m.b(this.f368a[0]) - 1;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("Font loading error: ").append(e.toString()).toString());
        }
    }

    public final int a(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i += a(str.charAt(i2)) + 1;
        }
        return i - 1;
    }

    public final void a(Graphics graphics, String str, int i, int i2, int i3) {
        if (graphics == null || str == null) {
            return;
        }
        int m193b = m.m193b(graphics);
        int c = m.c(graphics);
        int d = m.d(graphics);
        int e = m.e(graphics);
        if ((i3 & 1) == 1) {
            i -= a(str) / 2;
        } else if ((i3 & 8) == 8) {
            i -= a(str);
        }
        if ((i3 & 2) == 2) {
            i2 -= this.f370a / 2;
        } else if ((i3 & 32) == 32) {
            i2 -= this.f370a;
        }
        for (int i4 = 0; i4 < str.length(); i4++) {
            i += a(graphics, str.charAt(i4), i, i2) + 1;
        }
        m.b(graphics, m193b, c, d, e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    private int a(char c) {
        while (true) {
            char c2 = 0;
            for (int i = 0; i < f367a.length; i++) {
                if (f367a[i][0] <= c && f367a[i][1] >= c) {
                    return this.f369a[(((c2 + c) - f367a[i][0]) << 1) + 1];
                }
                c2 += (f367a[i][1] - f367a[i][0]) + 1;
            }
            if (c == '?') {
                return 0;
            }
            c = '?';
            this = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    private final int a(Graphics graphics, char c, int i, int i2) {
        while (true) {
            char c2 = 0;
            int i3 = 0;
            while (i3 < f367a.length && (f367a[i3][0] > c || f367a[i3][1] < c)) {
                c2 += (f367a[i3][1] - f367a[i3][0]) + 1;
                i3++;
            }
            if (i3 < f367a.length) {
                int i4 = ((c2 + c) - f367a[i3][0]) << 1;
                short s = this.f369a[i4 + 1];
                m.b(graphics, i, i2, s + 1, this.f370a);
                m.a(graphics, this.f368a[i3], i - this.f369a[i4], i2 - 1, 20);
                return s;
            }
            if (c == '?') {
                return 0;
            }
            i = i;
            c = '?';
            graphics = graphics;
            this = this;
        }
    }
}
