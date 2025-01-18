import java.awt.*;
import java.awt.event.*;
class tsk4 implements ActionListener,AdjustmentListener{
    int a,b;
    Label l;
    Frame f;
    Scrollbar s1,s2;

    tsk4(){
        f=new Frame("Image move Example- ");
        f.setBackground(Color.LIGHT_GRAY);
        f.setLayout(null);
        l=new Label("Akshita");
        l.setBounds(20,30,50,30);
        f.add(l);
        s1=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,613);
        s1.setBackground(Color.GRAY);
        s1.setBounds(0,530,680,30);
        f.add(s1);
        s2=new Scrollbar(Scrollbar.VERTICAL,0,1,0,475);
        s2.setBackground(Color.GRAY);
        s2.setBounds(681,20,30,520);
        f.add(s2);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        f.setResizable(false);
        f.setBounds(100,100,725,574);
        f.setVisible(true);
    }
    public void adjustmentValueChanged(AdjustmentEvent e) {
        a=s1.getValue();
        b=s2.getValue();
        l.setBounds(a+20,b+25,50,30);
    }
    public void actionPerformed(ActionEvent e) {
    }
    public static void main(String[] args)
    {
        tsk4 A=new tsk4();
    }
}
