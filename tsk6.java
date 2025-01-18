import java.awt.*;
import java.awt.event.*;
class tsk6 implements ItemListener{
    Frame f;
    Checkbox cb1,cb2,cb3,cb4;
    Label l1;
    Font f0,f1,f2,f3,f4;
    Color co;
    tsk6(){
        Color co=new Color(98,102,136);
        f=new Frame("Checkbox Example- ");
        f.setBackground(co);
        f.setLayout(null);
        f1=new Font("TimesNewRoman",Font.BOLD,20);
        f2=new Font("TimesNewRoman",Font.ITALIC,20);
        f3=new Font("TimesNewRoman",Font.BOLD+Font.ITALIC,20);
        f4=new Font("TimesNewRoman",Font.PLAIN,20);
        f0=new Font("Arial",Font.PLAIN,20);

        cb1=new Checkbox(" Bold");
        cb1.setFont(f1);
        cb1.setBounds(100,70,70,70);
        f.add(cb1);
        cb1.addItemListener(this);
        cb2=new Checkbox(" Italic");
        cb2.setFont(f2);
        cb2.setBounds(100,120,60,70);
        f.add(cb2);
        cb2.addItemListener(this);
        cb3=new Checkbox(" Bold + Italic");
        cb3.setFont(f3);
        cb3.setBounds(100,170,160,70);
        f.add(cb3);
        cb3.addItemListener(this);
        cb4=new Checkbox(" Plain");
        cb4.setFont(f4);
        cb4.setBounds(100,220,70,70);
        f.add(cb4);
        cb4.addItemListener(this);

        l1=new Label(" Select to see the designs. ");
        l1.setFont(f0);
        l1.setBounds(160,260,470,200);
        f.add(l1);

        f.setResizable(false);
        f.setBounds(470,180,550,450);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie){
        Object ob=ie.getSource();
        if(ob==cb1){
            l1.setFont(f1);
            cb2.setState(false);
            cb3.setState(false);
            cb4.setState(false);
        }
        if(ob==cb2){
            l1.setFont(f2);
            cb1.setState(false);
            cb3.setState(false);
            cb4.setState(false);
        }
        if(ob==cb3){
            l1.setFont(f3);
            cb1.setState(false);
            cb2.setState(false);
            cb4.setState(false);
        }
        if(ob==cb4){
            l1.setFont(f4);
            cb1.setState(false);
            cb3.setState(false);
            cb2.setState(false);
        }
    }
    public static void main(String[] args)
    {
        tsk6 A=new tsk6();
    }
}