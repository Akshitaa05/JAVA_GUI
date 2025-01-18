import java.awt.*;
import java.awt.event.*;
class tsk7 implements ItemListener{
    Frame f;
    Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
    CheckboxGroup cbg;
    Label l1;
    Font f1,f2,f3;
    Color co;
    tsk7(){
        Color co=new Color(98,102,136);
        f=new Frame("Radiobox Example- ");
        f.setBackground(co);
        f.setLayout(null);
        f1=new Font("TimesNewRoman",Font.BOLD,15);
        f3=new Font("TimesNewRoman",Font.BOLD,20);
        cbg=new CheckboxGroup();

        cb1=new Checkbox(" 10 ",false,cbg);
        cb1.setFont(f1);
        cb1.setBounds(150,150,40,70);
        f.add(cb1);
        cb2=new Checkbox(" 20 ",false,cbg);
        cb2.setFont(f1);
        cb2.setBounds(250,150,40,70);
        f.add(cb2);
        cb3=new Checkbox(" 30 ",false,cbg);
        cb3.setFont(f1);
        cb3.setBounds(350,150,40,70);
        f.add(cb3);
        cb4=new Checkbox(" 40 ",false,cbg);
        cb4.setFont(f1);
        cb4.setBounds(450,150,40,70);
        f.add(cb4);
        cb5=new Checkbox(" 50 ",false,cbg);
        cb5.setFont(f1);
        cb5.setBounds(200,200,40,70);
        f.add(cb5);
        cb6=new Checkbox(" 60 ",false,cbg);
        cb6.setFont(f1);
        cb6.setBounds(300,200,40,70);
        f.add(cb6);
        cb7=new Checkbox(" 70 ",false,cbg);
        cb7.setFont(f1);
        cb7.setBounds(400,200,40,70);
        f.add(cb7);
        cb8=new Checkbox(" 80 ",false,cbg);
        cb8.setFont(f1);
        cb8.setBounds(250,250,40,70);
        f.add(cb8);
        cb9=new Checkbox(" 90 ",false,cbg);
        cb9.setFont(f1);
        cb9.setBounds(350,250,40,70);
        f.add(cb9);
        cb10=new Checkbox(" 100  ",false,cbg);
        cb10.setFont(f1);
        cb10.setBounds(300,300,60,70);
        f.add(cb10);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        cb5.addItemListener(this);
        cb6.addItemListener(this);
        cb7.addItemListener(this);
        cb8.addItemListener(this);
        cb9.addItemListener(this);
        cb10.addItemListener(this);

        l1=new Label(" Akshita ");
        l1.setFont(f3);
        l1.setBounds(290,350,470,200);
        f.add(l1);

        f.setResizable(false);
        f.setBounds(350,100,650,600);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie) {
        Object ob = ie.getSource();
        if(ob==cb1){
            f2=new Font("TimesNewRoman",Font.PLAIN,10);
            l1.setBounds(310,350,470,200);
            l1.setFont(f2);
        }
        if(ob==cb2){
            f2=new Font("TimesNewRoman",Font.PLAIN,20);
            l1.setBounds(290,350,470,200);
            l1.setFont(f2);
        }
        if(ob==cb3){
            f2=new Font("TimesNewRoman",Font.PLAIN,30);
            l1.setBounds(270,350,470,200);
            l1.setFont(f2);
        }
        if(ob==cb4){
            f2=new Font("TimesNewRoman",Font.PLAIN,40);
            l1.setBounds(250,350,470,200);
            l1.setFont(f2);
        }
        if(ob==cb5){
            f2=new Font("TimesNewRoman",Font.PLAIN,50);
            l1.setBounds(240,350,470,200);
            l1.setFont(f2);
        }
        if(ob==cb6){
            f2=new Font("TimesNewRoman",Font.PLAIN,60);
            l1.setBounds(220,350,470,200);
            l1.setFont(f2);
        }
        if(ob==cb7){
            f2=new Font("TimesNewRoman",Font.PLAIN,70);
            l1.setBounds(200,350,470,200);
            l1.setFont(f2);
        }
        if(ob==cb8){
            f2=new Font("TimesNewRoman",Font.PLAIN,80);
            l1.setBounds(180,350,470,200);
            l1.setFont(f2);
        }
        if(ob==cb9){
            f2=new Font("TimesNewRoman",Font.PLAIN,90);
            l1.setBounds(160,350,470,200);
            l1.setFont(f2);
        }
        if(ob==cb10){
            f2=new Font("TimesNewRoman",Font.PLAIN,100);
            l1.setBounds(140,350,470,200);
            l1.setFont(f2);
        }
    }

    public static void main(String[] args)
    {
        tsk7 A=new tsk7();
    }
}