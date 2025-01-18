import java.awt.*;
import java.awt.event.*;
class tsk8 implements ItemListener{
    Frame f;
    Font f0,f1;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    List li1,li2,li3;
    Checkbox cb1,cb2;
    Choice c1,c2;
    Button b1,b2;
    String a,b,d,e;
    int c;

    tsk8(){
        f=new Frame("Font");
        f.setBackground(Color.lightGray);
        f.setLayout(null);

        f0=new Font("TimesNewRoman",Font.PLAIN,19);

        l1=new Label("Font: ");
        l1.setFont(f0);
        l1.setBounds(20,50,160,20);
        f.add(l1);
        l2=new Label("Font Style: ");
        l2.setFont(f0);
        l2.setBounds(220,50,150,20);
        f.add(l2);
        l3=new Label("Size: ");
        l3.setFont(f0);
        l3.setBounds(400,50,130,20);
        f.add(l3);
        l4=new Label("Effects");
        l4.setFont(f0);
        l4.setBounds(20,180,60,20);
        f.add(l4);
        l5=new Label("Sample");
        l5.setFont(f0);
        l5.setBounds(270,180,80,20);
        f.add(l5);
        l6=new Label(" AaBbYyZz ");
        l6.setBounds(340,230,140,30);
        f.add(l6);
        l7=new Label(" Color:  ");
        l7.setFont(f0);
        l7.setBounds(20,290,100,20);
        f.add(l7);
        l8=new Label(" Script:  ");
        l8.setFont(f0);
        l8.setBounds(270,290,100,20);
        f.add(l8);
        l9=new Label(" This is an open type font.This same font will be used on both your printer and screen.  ");
        l9.setBounds(30,380,510,20);
        f.add(l9);
        l10=new Label(" Show more fonts.  ");
        l10.setForeground(Color.BLUE);
        l10.setBounds(30,410,510,20);
        f.add(l10);
        b1=new Button("OK");
        b1.setBounds(330,440,80,20);
        f.add(b1);
        b2=new Button("Cancel");
        b2.setBounds(450,440,80,20);
        f.add(b2);

        li2=new List();
        li2.add(" ");
        li2.add("REGULAR");
        li2.add("ITALIC");
        li2.add("BOLD");
        li2.add("BOLD+ITALIC");
        li2.setBounds(220,70,160,86);
        f.add(li2);
        li1=new List();
        li1.add(" ");
        li1.add("ARIAL");
        li1.add("CALIBRI");
        li1.add("Cambria");
        li1.add("Cambria Math");
        li1.add("Candara");
        li1.add("Comic Sans MS");
        li1.add("NewTimesRoman");
        li1.setBounds(20,70,190,86);
        f.add(li1);
        li3=new List();
        li3.add(" ");
        li3.add("10");
        li3.add("12");
        li3.add("14");
        li3.add("16");
        li3.add("18");
        li3.add("20");
        li3.add("22");
        li3.setBounds(400,70,130,86);
        f.add(li3);
        li1.addItemListener(this);
        li2.addItemListener(this);
        li3.addItemListener(this);

        cb1=new Checkbox(" Strikeout ");
        cb1.setBounds(30,220,100,20);
        f.add(cb1);
        cb2=new Checkbox(" Underline ");
        cb2.setBounds(30,250,100,20);
        f.add(cb2);

        c1=new Choice();
        c1.add("Select");
        c1.add("Black");
        c1.add("Yellow");
        c1.add("Green");
        c1.add("Red");
        c1.setBounds(30,320,150,30);
        f.add(c1);
        c2=new Choice();
        c2.add("Select");
        c2.add("Western");
        c2.add("Indian");
        c2.add("Italian");
        c2.add("French");
        c2.setBounds(270,320,250,30);
        f.add(c2);

        f.setResizable(false);
        f.setBounds(300,100,550,500);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie) {
        Object ob = ie.getSource();
        if(ob==li1)
            a=li1.getSelectedItem();
        if(ob==li2)
            b=li2.getSelectedItem();
        if(ob==li3)
            c=Integer.parseInt(li3.getSelectedItem());
        if(ob==c2)
            e=c2.getSelectedItem();
        if(ob==b1){
            if(b=="REGULAR"){
                f1=new Font("TimesNewRoman",Font.PLAIN,c);
                l6.setFont(f1);
            }
            if(b=="ITALIC"){
                f1=new Font("TimesNewRoman",Font.ITALIC,c);
                l6.setFont(f1);
            }
            if(b=="BOLD"){
                f1=new Font("TimesNewRoman",Font.BOLD,c);
                l6.setFont(f1);
            }
            if(b=="BOLD+ITALIC"){
                f1=new Font("TimesNewRoman",Font.BOLD+Font.ITALIC,c);
                l6.setFont(f1);
            }
        }
    }
    public static void main(String[] args)
    {
        tsk8 A=new tsk8();
    }
}