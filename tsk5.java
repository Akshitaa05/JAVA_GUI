import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class tsk5 implements ItemListener{
    Frame f;
    List l1;
    Choice c1;
    Font fo;
    String a;
    Color co;
    tsk5(){
        Color co=new Color(44,130,150);
        f=new Frame("List/Choicebox Example- ");
        f.setBackground(co);
        f.setLayout(null);
        fo=new Font("TimesNewRoman",Font.BOLD,15);

        l1=new List();
        l1.add("India");
        l1.add("USA");
        l1.add("Uk");
        l1.add("Australia");
        l1.setFont(fo);
        l1.setBounds(150,300,120,100);
        f.add(l1);
        l1.addItemListener(this);

        c1=new Choice();
        c1.add("Select");
        c1.add("India");
        c1.add("USA");
        c1.add("Uk");
        c1.add("Australia");
        c1.setFont(fo);
        c1.setBounds(400,300,100,100);
        f.add(c1);
        c1.addItemListener(this);

        f.setResizable(false);
        f.setBounds(100,100,700,500);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie){
        Object ob=ie.getSource();
        if(ob==l1){
            a=l1.getSelectedItem();
            if(a=="India"){
                JOptionPane.showMessageDialog(null,"INDIA","I Love",1);
            }
            if(a=="USA"){
                JOptionPane.showMessageDialog(null,"USA","I Love",1);
            }
            if(a=="UK"){
                JOptionPane.showMessageDialog(null,"UK","I Love",1);
            }
            if(a=="Australia"){
                JOptionPane.showMessageDialog(null,"Australia","I Love",1);
            }
        }
        else{
            if(a=="India"){
                JOptionPane.showMessageDialog(null,"INDIA","I Love",1);
            }
            if(a=="USA"){
                JOptionPane.showMessageDialog(null,"USA","I Love",1);
            }
            if(a=="UK"){
                JOptionPane.showMessageDialog(null,"UK","I Love",1);
            }
            if(a=="Australia"){
                JOptionPane.showMessageDialog(null,"Australia","I Love",1);
            }
        }
    }
    public static void main(String[] args)
    {
        tsk5 A=new tsk5();
    }
}