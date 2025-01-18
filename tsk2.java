import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class tsk2 implements AdjustmentListener,ActionListener {
    int a,b,c;
    Frame f;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1;
    Scrollbar s1,s2,s3;
    Font fo,f1,f2;

    tsk2(){
        f=new Frame("Scroll Bar Example- ");
        f.setBackground(Color.lightGray);
        f.setLayout(null);
        fo=new Font("TimesNewRoman",Font.BOLD,20);
        f1=new Font("TimesNewRoman",Font.BOLD,15);
        f2=new Font("TimesNewRoman",Font.BOLD+Font.ITALIC,40);

        l1=new Label("Red");
        l1.setFont(fo);
        l1.setBounds(45,100,40,30);
        f.add(l1);
        s1=new Scrollbar(Scrollbar.VERTICAL,50,1,0,256);
        s1.setBackground(Color.red.darker());
        s1.setBounds(50,150,30,256);
        f.add(s1);
        t1=new TextField("");
        t1.setFont(f1);
        t1.setBounds(40,430,50,20);
        f.add(t1);
        l2=new Label("Green");
        l2.setFont(fo);
        l2.setBounds(180,100,60,30);
        f.add(l2);
        s2=new Scrollbar(Scrollbar.VERTICAL,50,1,0,256);
        s2.setBackground(Color.green.darker());
        s2.setBounds(190,150,30,256);
        f.add(s2);
        t2=new TextField("");
        t2.setFont(f1);
        t2.setBounds(180,430,50,20);
        f.add(t2);
        l3=new Label("Blue");
        l3.setFont(fo);
        l3.setBounds(350,100,60,30);
        f.add(l3);
        s3=new Scrollbar(Scrollbar.VERTICAL,50,1,0,256);
        s3.setBackground(Color.blue.darker());
        s3.setBounds(355,150,30,256);
        f.add(s3);
        t3=new TextField("");
        t3.setFont(f1);
        t3.setBounds(345,430,50,20);
        f.add(t3);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        b1=new Button("Apply");
        b1.setFont(f2);
        b1.setBounds(500,250,200,100);
        f.add(b1);
        b1.addActionListener(this);
        f.setResizable(false);
        f.setBounds(100,100,800,600);
        f.setVisible(true);
    }
     public void adjustmentValueChanged(AdjustmentEvent ae){
        Object ob=ae.getSource();
        if(ob==s1)
            a=s1.getValue();
        else if(ob==s2)
            b=s2.getValue();
        else
            c=s3.getValue();
        Color Co=new Color(s1.getValue(),s2.getValue(),s3.getValue());
        f.setBackground(Co);
        t1.setText("" + a);
        t2.setText("" + b);
        t3.setText("" + c);
    }
    public void actionPerformed(ActionEvent ab){
    }

     /*  public void adjustmentValueChanged(AdjustmentEvent ae) {
        Object ob = ae.getSource();
        if(ob==s1)
            a=s1.getValue();
        else if(ob==s2)
            b=s2.getValue();
        else
            c=s3.getValue();
    }
    public void actionPerformed(ActionEvent ab){
        t1.setText(""+a);
        t2.setText(""+b);
        t3.setText(""+c);
        Color C=new Color(a,b,c);
        f.setBackground(C);
       }
*/
    public static void main(String[] args) {
        tsk2 A=new tsk2();
    }
}
