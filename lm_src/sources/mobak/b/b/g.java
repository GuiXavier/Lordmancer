package mobak.b.b;

import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import mobak.Main2;

/* loaded from: LordmancerL.jar:mobak/b/b/g.class */
public final class g implements CommandListener, ItemStateListener {
    private Form a;

    /* renamed from: a, reason: collision with other field name */
    private mobak.c.c[] f240a;

    /* renamed from: a, reason: collision with other field name */
    private Command f241a;
    private Command b;

    /* renamed from: a, reason: collision with other field name */
    private short f242a;

    /* renamed from: b, reason: collision with other field name */
    private short f243b;

    /* renamed from: a, reason: collision with other field name */
    private Vector f244a;

    /* renamed from: b, reason: collision with other field name */
    private Vector f245b;
    private Vector c;
    private Vector d;

    /* renamed from: a, reason: collision with other field name */
    private mobak.c.b f246a;

    /* renamed from: a, reason: collision with other field name */
    private Alert f247a;

    /* renamed from: a, reason: collision with other field name */
    private int f248a;

    public g(String str, mobak.c.b bVar) {
        this.f248a = 0;
        this.a = new Form(str);
        this.a.setCommandListener(this);
        this.a.setItemStateListener(this);
        this.f244a = new Vector();
        this.f245b = new Vector();
        this.d = new Vector();
        this.c = new Vector();
        this.f246a = bVar;
    }

    public g(mobak.c.c[] cVarArr, String str, short s, short s2) {
        this.f248a = 0;
        this.f240a = cVarArr;
        this.a = new Form(str);
        this.f241a = new Command(mobak.c.d.b(34), 4, 0);
        this.b = new Command("ok", 4, 0);
        this.a.addCommand(this.f241a);
        this.a.addCommand(this.b);
        this.a.setCommandListener(this);
        for (int i = 0; i < this.f240a.length; i++) {
            a(this.f240a[i]);
        }
        Display.getDisplay(Main2.a).setCurrent(this.a);
        this.f242a = s;
        this.f243b = s2;
    }

    public final int a() {
        return this.f248a;
    }

    public final void a(int i) {
        this.f248a = i;
    }

    public final void a(String str, String str2, int i, int i2) {
        TextField textField = new TextField(str, str2, i, i2);
        this.f244a.addElement(textField);
        this.a.append(textField);
        this.a.setCommandListener(this);
    }

    public final int b() {
        return this.f244a.size();
    }

    /* renamed from: a, reason: collision with other method in class */
    public final String m150a(int i) {
        return ((TextField) this.f244a.elementAt(i)).getString();
    }

    public final void a(String str, int i, String[] strArr, boolean[] zArr) {
        ChoiceGroup choiceGroup = new ChoiceGroup(str, i);
        for (String str2 : strArr) {
            choiceGroup.append(str2, (Image) null);
        }
        if (zArr != null) {
            choiceGroup.setSelectedFlags(zArr);
        }
        this.f245b.addElement(choiceGroup);
        this.a.append(choiceGroup);
    }

    public final boolean a(int i, int i2) {
        return ((ChoiceGroup) this.f245b.elementAt(0)).isSelected(i2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int m151a(int i) {
        return ((ChoiceGroup) this.f245b.elementAt(i)).getSelectedIndex();
    }

    public final int c() {
        return this.f245b.size();
    }

    public final void b(int i) {
        if (this.f245b == null || this.f245b.size() <= 1) {
            return;
        }
        Item item = (ChoiceGroup) this.f245b.elementAt(1);
        this.f245b.removeElementAt(1);
        for (int i2 = 0; i2 <= this.a.size(); i2++) {
            if (this.a.get(i2) == item) {
                this.a.delete(i2);
                return;
            }
        }
    }

    public final void c(int i) {
        if (this.d.size() <= 1) {
            return;
        }
        Item item = (StringItem) this.d.elementAt(1);
        this.d.removeElementAt(1);
        for (int i2 = 0; i2 <= this.a.size(); i2++) {
            if (this.a.get(i2) == item) {
                this.a.delete(i2);
                return;
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m152a() {
        Display.getDisplay(Main2.a).setCurrent(this.a);
    }

    public final void a(String str) {
        Command command = new Command(str, 4, 0);
        this.c.addElement(command);
        this.a.addCommand(command);
    }

    public final void a(String str, int i) {
        Command command = new Command(str, i == 1 ? 2 : 4, 0);
        if (this.c.size() < i) {
            int size = i - this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.c.addElement(null);
            }
        }
        if (this.c.size() == i) {
            this.c.insertElementAt(command, i);
        } else {
            this.c.setElementAt(command, i);
        }
        this.a.addCommand(command);
    }

    public final void d(int i) {
        this.a.removeCommand((Command) this.c.elementAt(0));
        this.c.setElementAt(null, 0);
    }

    public final void a(String str, String str2) {
        StringItem stringItem = new StringItem(str, str2);
        this.d.addElement(stringItem);
        this.a.append(stringItem);
    }

    public final void a(int i, String str) {
        try {
            ((StringItem) this.d.elementAt(0)).setText(str);
        } catch (ArrayIndexOutOfBoundsException e) {
            mobak.a.a.a(new StringBuffer("There's no label with index ").append(String.valueOf(0)).append(", ").append(e.toString()).toString());
        }
    }

    public final void a(String str, String str2, int i) {
        AlertType alertType;
        switch (4) {
            case 1:
                alertType = AlertType.ALARM;
                break;
            case 2:
            default:
                alertType = AlertType.CONFIRMATION;
                break;
            case 3:
                alertType = AlertType.INFO;
                break;
            case 4:
                alertType = AlertType.WARNING;
                break;
        }
        this.f247a = new Alert(str, str2, (Image) null, alertType);
        this.f241a = new Command(mobak.c.d.b(34), 2, 0);
        this.f247a.addCommand(this.f241a);
        this.f247a.setCommandListener(this);
        this.f247a.setTimeout(-2);
        Display.getDisplay(Main2.a).setCurrent(this.f247a);
    }

    public final void a(String str, String str2, AlertType alertType, String str3) {
        this.f247a = new Alert(str, str2, (Image) null, alertType);
        this.f241a = new Command(mobak.c.d.b(34), 2, 0);
        this.f247a.addCommand(this.f241a);
        this.f247a.addCommand(new Command(str3, 4, 0));
        this.f247a.setCommandListener(this);
        this.f247a.setTimeout(-2);
        Display.getDisplay(Main2.a).setCurrent(this.f247a);
    }

    private void a(mobak.c.c cVar) {
        switch (cVar.b) {
            case 1:
                this.a.append(cVar.f371a);
                this.a.append(new TextField(mobak.c.d.b(235), String.valueOf(cVar.f374a), 10, 5));
                this.a.append(new TextField(mobak.c.d.b(236), String.valueOf(cVar.f375b), 10, 5));
                return;
            case 2:
                String[] strArr = cVar.f372a;
                boolean[] zArr = cVar.f373a;
                ChoiceGroup choiceGroup = new ChoiceGroup(cVar.f371a, 2);
                for (String str : strArr) {
                    choiceGroup.append(str, (Image) null);
                }
                choiceGroup.setSelectedFlags(zArr);
                this.a.append(choiceGroup);
                return;
            case 3:
                this.a.append(new TextField(cVar.f371a, cVar.f376b, 10, 0));
                return;
            default:
                return;
        }
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (displayable == this.f247a) {
            m152a();
            if (command != this.f241a) {
                this.f246a.mo6d();
            }
            this.f247a = null;
        }
        if (command == this.f241a) {
            Display.getDisplay(Main2.a).setCurrent(m.a);
            m.a.a(true);
        }
        Command command2 = command;
        if (command2 == this.b) {
            try {
                int i = 0;
                mobak.a.a.l lVar = new mobak.a.a.l(this.f242a);
                lVar.a(this.f243b);
                for (int i2 = 0; i2 < this.f240a.length; i2++) {
                    switch (this.f240a[i2].b) {
                        case 1:
                            int i3 = i + 1;
                            int i4 = i3 + 1;
                            String string = this.a.get(i3).getString();
                            i = i4 + 1;
                            String string2 = this.a.get(i4).getString();
                            if (string2.length() > 0 && string.length() > 0) {
                                int parseInt = Integer.parseInt(string);
                                int parseInt2 = Integer.parseInt(string2);
                                if (parseInt < parseInt2) {
                                    lVar.a(this.f240a[i2].a);
                                    lVar.a(parseInt);
                                    lVar.a(parseInt2);
                                }
                                break;
                            }
                            break;
                        case 2:
                            int i5 = i;
                            i++;
                            ChoiceGroup choiceGroup = this.a.get(i5);
                            int length = this.f240a[i2].f372a.length;
                            boolean[] zArr = new boolean[length];
                            int selectedFlags = choiceGroup.getSelectedFlags(zArr);
                            if (selectedFlags > 0) {
                                lVar.a(this.f240a[i2].a);
                                lVar.a((byte) selectedFlags);
                                for (byte b = 0; b < length; b = (byte) (b + 1)) {
                                    if (zArr[b]) {
                                        lVar.a(b);
                                    }
                                }
                                break;
                            } else {
                                lVar.a(this.f240a[i2].a);
                                lVar.a((byte) 0);
                                break;
                            }
                        case 3:
                            int i6 = i;
                            i++;
                            TextField textField = this.a.get(i6);
                            if (textField.getString().trim().length() > 0) {
                                lVar.a(this.f240a[i2].a);
                                lVar.a(textField.getString().trim());
                                break;
                            } else {
                                break;
                            }
                    }
                }
                mobak.a.a.f15a.a(lVar);
                command2 = Display.getDisplay(Main2.a);
                command2.setCurrent(m.a);
                return;
            } catch (Exception e) {
                mobak.a.a.a((Exception) command2);
            }
        }
        for (int i7 = 0; this.c != null && i7 < this.c.size(); i7++) {
            if (command == this.c.elementAt(i7)) {
                this.f246a.a(i7);
                return;
            }
        }
    }

    public final void itemStateChanged(Item item) {
        for (int i = 0; i < this.f245b.size(); i++) {
            if (this.f245b.elementAt(i) == item) {
                this.f246a.b(i);
                return;
            }
        }
    }
}
