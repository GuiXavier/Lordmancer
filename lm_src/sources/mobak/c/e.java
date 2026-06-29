package mobak.c;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

/* loaded from: LordmancerL.jar:mobak/c/e.class */
public final class e {
    public RecordStore a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f377a = new byte[1];

    public e() {
        try {
            this.a = RecordStore.openRecordStore("LM", true);
        } catch (RecordStoreException e) {
            mobak.a.a.a(new StringBuffer("RMSManager").append(e.toString()).toString());
        }
    }

    public final boolean a(byte b, int i) {
        return a(b, new byte[]{(byte) (i >>> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i});
    }

    public final boolean a(byte b, byte b2) {
        return a(b, new byte[]{b2});
    }

    public final boolean a(byte b, String str) {
        if (str == null || str.trim().equals("")) {
            return false;
        }
        try {
            return a(b, (mobak.a.a.f14a == null || mobak.a.a.f14a.equals("")) ? str.getBytes() : str.getBytes(mobak.a.a.f14a));
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("setString").append(e.toString()).toString());
            return false;
        }
    }

    public final boolean a(byte b, byte[] bArr) {
        try {
            if (this.a == null) {
                return false;
            }
            if (bArr != null) {
                try {
                    try {
                        if (bArr.length != 0) {
                            RecordEnumeration enumerateRecords = this.a.enumerateRecords(new f(this, new byte[]{b}), (RecordComparator) null, false);
                            byte[] bArr2 = new byte[1 + bArr.length];
                            this.f377a[0] = b;
                            System.arraycopy(this.f377a, 0, bArr2, 0, 1);
                            System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
                            if (enumerateRecords.numRecords() <= 0) {
                                if (this.a.getSizeAvailable() < bArr2.length) {
                                    throw new Exception("no available space");
                                }
                                this.a.addRecord(bArr2, 0, bArr2.length);
                                return true;
                            }
                            int nextRecordId = enumerateRecords.nextRecordId();
                            if (this.a.getSizeAvailable() + this.a.getRecordSize(nextRecordId) < bArr2.length) {
                                throw new Exception("no available space");
                            }
                            this.a.setRecord(nextRecordId, bArr2, 0, bArr2.length);
                            return true;
                        }
                    } catch (RecordStoreException e) {
                        mobak.a.a.a(new StringBuffer("RecordStoreException").append(e.toString()).toString());
                        return false;
                    }
                } catch (InvalidRecordIDException e2) {
                    mobak.a.a.a(new StringBuffer("InvalidRecordIDException").append(e2.toString()).toString());
                    return false;
                } catch (RecordStoreNotOpenException e3) {
                    mobak.a.a.a(new StringBuffer("RecordStoreNotOpenException").append(e3.toString()).toString());
                    return false;
                }
            }
            return m240a(b);
        } catch (Exception e4) {
            mobak.a.a.a(new StringBuffer("cannot write data to RMS").append(e4.toString()).toString());
            return false;
        }
    }

    public final long a(byte b, long j) {
        try {
            byte[] a = a((byte) 13);
            if (a == null || a.length != 8) {
                return -1L;
            }
            long j2 = 0;
            for (byte b2 = 0; b2 < 8; b2 = (byte) (b2 + 1)) {
                j2 |= a[b2] & Byte.MAX_VALUE;
                if (a[b2] < 0) {
                    j2 |= 128;
                }
                if (b2 < 7) {
                    j2 <<= 8;
                }
            }
            return j2;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("getLong").append(e.toString()).toString());
            return -1L;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int m236a(byte b, int i) {
        try {
            byte[] a = a(b);
            if (a == null || a.length != 4) {
                return i;
            }
            int i2 = 0;
            for (byte b2 = 0; b2 < 4; b2 = (byte) (b2 + 1)) {
                i2 |= a[b2] & Byte.MAX_VALUE;
                if (a[b2] < 0) {
                    i2 |= 128;
                }
                if (b2 < 3) {
                    i2 <<= 8;
                }
            }
            return i2;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("getInt").append(e.toString()).toString());
            return i;
        }
    }

    public final short a(byte b, short s) {
        try {
            byte[] a = a((byte) 7);
            if (a == null || a.length != 2) {
                return (short) 1024;
            }
            short s2 = 0;
            for (byte b2 = 0; b2 < 2; b2 = (byte) (b2 + 1)) {
                s2 = (short) (s2 | (a[b2] & Byte.MAX_VALUE));
                if (a[b2] < 0) {
                    s2 = (short) (s2 | 128);
                }
                if (b2 <= 0) {
                    s2 = (short) (s2 << 8);
                }
            }
            return s2;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("getShort").append(e.toString()).toString());
            return (short) 1024;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final byte m237a(byte b, byte b2) {
        try {
            byte[] a = a(b);
            return (a == null || a.length != 1) ? b2 : a[0];
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("getByte").append(e.toString()).toString());
            return b2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.lang.Throwable] */
    /* renamed from: a, reason: collision with other method in class */
    public final String m238a(byte b, String str) {
        ?? a = a(b);
        if (a == 0) {
            return str;
        }
        try {
            return (mobak.a.a.f14a == null || mobak.a.a.f14a.equals("")) ? new String((byte[]) a) : new String((byte[]) a, mobak.a.a.f14a);
        } catch (Exception e) {
            mobak.a.a.a(a.getMessage());
            return str;
        }
    }

    public final byte[] a(byte b) {
        if (this.a == null) {
            return null;
        }
        try {
            this.f377a[0] = b;
            RecordEnumeration enumerateRecords = this.a.enumerateRecords(new f(this, this.f377a), (RecordComparator) null, false);
            if (enumerateRecords.numRecords() <= 0) {
                return null;
            }
            byte[] nextRecord = enumerateRecords.nextRecord();
            byte[] bArr = new byte[nextRecord.length - 1];
            System.arraycopy(nextRecord, 1, bArr, 0, bArr.length);
            return bArr;
        } catch (RecordStoreException e) {
            mobak.a.a.a(new StringBuffer("RecordStoreException").append(e.toString()).toString());
            return null;
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("RMS Exception").append(e2.toString()).toString());
            return null;
        } catch (InvalidRecordIDException e3) {
            mobak.a.a.a(new StringBuffer("InvalidRecordIDException").append(e3.toString()).toString());
            return null;
        } catch (RecordStoreNotOpenException e4) {
            mobak.a.a.a(new StringBuffer("RecordStoreNotOpenException").append(e4.toString()).toString());
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final short[] m239a(byte b) {
        if (this.a == null) {
            return null;
        }
        try {
            this.f377a[0] = b;
            RecordEnumeration enumerateRecords = this.a.enumerateRecords(new f(this, this.f377a), (RecordComparator) null, false);
            if (enumerateRecords.numRecords() <= 0) {
                return null;
            }
            byte[] nextRecord = enumerateRecords.nextRecord();
            byte[] bArr = new byte[nextRecord.length - 1];
            short[] sArr = new short[bArr.length / 2];
            System.arraycopy(nextRecord, 1, bArr, 0, bArr.length);
            short s = 0;
            for (short s2 = 0; s2 < bArr.length; s2 = (short) (s2 + 2)) {
                sArr[s] = (short) (((short) ((bArr[s2] << 8) & 65280)) | ((short) (bArr[s2 + 1] & 255)));
                s = (short) (s + 1);
            }
            return sArr;
        } catch (RecordStoreException e) {
            mobak.a.a.a(new StringBuffer("RecordStoreException").append(e.toString()).toString());
            return null;
        } catch (RecordStoreNotOpenException e2) {
            mobak.a.a.a(new StringBuffer("RecordStoreNotOpenException").append(e2.toString()).toString());
            return null;
        } catch (Exception e3) {
            mobak.a.a.a(new StringBuffer("RMS Exception").append(e3.toString()).toString());
            return null;
        } catch (InvalidRecordIDException e4) {
            mobak.a.a.a(new StringBuffer("InvalidRecordIDException").append(e4.toString()).toString());
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m240a(byte b) {
        try {
            this.f377a[0] = b;
            RecordEnumeration enumerateRecords = this.a.enumerateRecords(new f(this, this.f377a), (RecordComparator) null, false);
            if (enumerateRecords.numRecords() <= 0) {
                return true;
            }
            this.a.deleteRecord(enumerateRecords.nextRecordId());
            return true;
        } catch (Exception e) {
            mobak.a.a.a(new StringBuffer("delete").append(e.toString()).toString());
            return false;
        }
    }

    public final boolean a() {
        try {
            RecordEnumeration enumerateRecords = this.a.enumerateRecords(new f(this, null), (RecordComparator) null, false);
            int numRecords = enumerateRecords.numRecords();
            for (int i = 0; i < numRecords; i++) {
                try {
                    this.a.deleteRecord(enumerateRecords.nextRecordId());
                } catch (Exception e) {
                    mobak.a.a.a(new StringBuffer("deleteOne").append(e.toString()).toString());
                }
            }
            return true;
        } catch (Exception e2) {
            mobak.a.a.a(new StringBuffer("deleteAll").append(e2.toString()).toString());
            return false;
        }
    }

    public static short a(byte[] bArr, int i, short s) {
        return (bArr == null || bArr.length - i < 2) ? s : (short) (((short) ((255 & bArr[i]) << 8)) | (255 & bArr[i + 1]));
    }

    public static String a(byte[] bArr, int i, int i2, String str) {
        if (bArr != null) {
            try {
                if (bArr.length - i >= i2) {
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(bArr, i, bArr2, 0, i2);
                    return (mobak.a.a.f14a == null || mobak.a.a.f14a.equals("")) ? new String(bArr2) : new String(bArr2, mobak.a.a.f14a);
                }
            } catch (Exception e) {
                mobak.a.a.a(new StringBuffer("getString").append(e.toString()).toString());
                return str;
            }
        }
        return str;
    }

    public static final short a(int i) {
        if (i > 32767) {
            return Short.MAX_VALUE;
        }
        if (i < -32768) {
            return Short.MIN_VALUE;
        }
        return (short) i;
    }
}
