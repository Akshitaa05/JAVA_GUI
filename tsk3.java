import java.awt.*;
import java.awt.event.*;
class tsk3 implements AdjustmentListener{
    int a;
    Frame f;
    Label l1;
    Scrollbar s1;
    Font font;


    tsk3(){
        Color C=new Color(143,108,131);
        f=new Frame("Text Zoom example- ");
        f.setBackground(C);
        f.setLayout(null);

        l1=new Label("Emulation",Label.CENTER);
        l1.setBounds(100,100,600,400);
        l1.setBackground(Color.LIGHT_GRAY);
        f.add(l1);
        s1=new Scrollbar(Scrollbar.HORIZONTAL,10,5,0,100);
        s1.setBackground(Color.LIGHT_GRAY);
        s1.setBounds(120,600,550,50);
        f.add(s1);
        s1.addAdjustmentListener(this);

        f.setResizable(false);
        f.setBounds(100,100,800,700);
        f.setVisible(true);
    }
    public void adjustmentValueChanged(AdjustmentEvent ab){
        a=s1.getValue();
        font=new Font("NewTimesRoman",Font.PLAIN,a);
        l1.setFont(font);
    }
    public static void main(String[] args) {
        tsk3 A=new tsk3();
    }
}