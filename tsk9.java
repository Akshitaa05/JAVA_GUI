// ROOT,+/-,MORE THAN TWO DIGIT,INPUT FROM KEYBOARD.
 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class tsk9 implements ActionListener{
    Frame f;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
    JTextField t1;
    Font fo;
    float a,w,r;
    int z;
    String v;
    tsk9(){
        f=new Frame("Calculator");
        f.setBackground(Color.lightGray);
        f.setLayout(null);
        fo=new Font("NewTimesRoman",Font.PLAIN,30);
        t1=new JTextField("");
        t1.setHorizontalAlignment(SwingConstants.RIGHT);
        t1.setFont(fo);
        t1.setBounds(10,50,380,60);
        t1.setBackground(Color.white);
        f.add(t1);
        b1=new Button("%");
        b1.setBounds(12,122,95,53);
        f.add(b1);
        b2=new Button("CE");
        b2.setBounds(105,122,100,53);
        f.add(b2);
        b3=new Button("C");
        b3.setBounds(205,122,100,53);
        f.add(b3);
        b4=new Button("DEL");
        b4.setBounds(305,122,85,53);
        f.add(b4);
        b5=new Button("1/x");
        b5.setBounds(12,172,95,53);
        f.add(b5);
        b6=new Button("x²");
        b6.setBounds(105,172,100,53);
        f.add(b6);
        b7=new Button("√x");
        b7.setBounds(205,172,100,53);
        f.add(b7);
        b8=new Button("÷");
        b8.setBounds(305,172,85,53);
        f.add(b8);
        b9=new Button("7");
        b9.setBounds(12,226,95,53);
        f.add(b9);
        b10=new Button("8");
        b10.setBounds(105,226,100,53);
        f.add(b10);
        b11=new Button("9");
        b11.setBounds(205,226,100,53);
        f.add(b11);
        b12=new Button("*");
        b12.setBounds(305,226,85,53);
        f.add(b12);
        b13=new Button("4");
        b13.setBounds(12,276,95,53);
        f.add(b13);
        b14=new Button("5");
        b14.setBounds(105,276,100,53);
        f.add(b14);
        b15=new Button("6");
        b15.setBounds(205,276 ,100,53);
        f.add(b15);
        b16=new Button("-");
        b16.setBounds(305,276,85,53);
        f.add(b16);
        b17=new Button("1");
        b17.setBounds(12,329,95,53);
        f.add(b17);
        b18=new Button("2");
        b18.setBounds(105,329,100,53);
        f.add(b18);
        b19=new Button("3");
        b19.setBounds(205,329,100,53);
        f.add(b19);
        b20=new Button("+");
        b20.setBounds(305,329,85,53);
        f.add(b20);
        b21=new Button("+/-");
        b21.setBounds(12,380,95,55);
        f.add(b21);
        b22=new Button("0");
        b22.setBounds(105,380,100,55);
        f.add(b22);
        b23=new Button(".");
        b23.setBounds(205,380,100,55);
        f.add(b23);
        b24=new Button("=");
        b24.setBounds(305,380,85, 55);
        f.add(b24);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);

        f.setResizable(false);
        f.setBounds(500,105,400,445);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        Object ob = ae.getSource();
        if(t1.getText().length()==0){
            if(ob==b9)
                t1.setText("7");
            if(ob==b10)
                t1.setText("8");
            if(ob==b11)
                t1.setText("9");
            if(ob==b13)
                t1.setText("4");
            if(ob==b14)
                t1.setText("5");
            if(ob==b15)
                t1.setText("6");
            if(ob==b17)
                t1.setText("1");
            if(ob==b18)
                t1.setText("2");
            if(ob==b19)
                t1.setText("3");
            if(ob==b22)
                t1.setText("0");
            if(ob==b23)
                t1.setText(".");
            if(ob==b16)
                t1.setText("-");
        }
        else{
            if(ob==b1) {
                a = Float.parseFloat(t1.getText());
                w = a;
                t1.setText("");
                z = 5;
            }
            if(ob==b2){
                t1.setText("");
            }
            if(ob==b3){
                w=0;
                t1.setText("");
            }
            if(ob==b4) {
                v = t1.getText();
                v = v.substring(0, v.length() - 1);
                t1.setText("" + v);
            }
            if(ob==b5){
                a=Float.parseFloat(t1.getText());
                r=1/a;
                t1.setText(""+r);
            }
            if(ob==b6){
                a=Float.parseFloat(t1.getText());
                r=a*a;
                t1.setText(""+r);
            }
            if(ob==b7){
                a=Float.parseFloat(t1.getText());
                r=a*a;
                t1.setText(""+r);
            }
            if(ob==b8){
                a=Float.parseFloat(t1.getText());
                w=a;
                t1.setText("");
                z=1;
            }
            if(ob==b9){
                t1.setText(t1.getText()+"7");
                a=Float.parseFloat(t1.getText());
            }
            if(ob==b10){
                t1.setText(t1.getText()+"8");
                a=Float.parseFloat(t1.getText());
            }
            if(ob==b11){
                t1.setText(t1.getText()+"9");
                a=Float.parseFloat(t1.getText());
            }
            if(ob==b12){
                a=Float.parseFloat(t1.getText());
                w=a;
                t1.setText("");
                z=2;
            }
            if(ob==b13){
                t1.setText(t1.getText()+"4");
                a=Float.parseFloat(t1.getText());
            }
            if(ob==b14){
                t1.setText(t1.getText()+"5");
                a=Float.parseFloat(t1.getText());
            }
            if(ob==b15){
                t1.setText(t1.getText()+"6");
                a=Float.parseFloat(t1.getText());
            }
            if(ob==b16){
                a=Float.parseFloat(t1.getText());
                w=a;
                t1.setText("");
            }
            if(ob==b17){
                t1.setText(t1.getText()+"1");
                a=Float.parseFloat(t1.getText());
            }
            if(ob==b18){
                t1.setText(t1.getText()+"2");
                a=Float.parseFloat(t1.getText());
            }
            if(ob==b19){
                t1.setText(t1.getText()+"3");
                a=Float.parseFloat(t1.getText());
            }
            if(ob==b20){
                a=Float.parseFloat(t1.getText());
                w=a;
                t1.setText("");
                z=4;
            }
            /* if(ob==b21){
                v = t1.getText();
                r=Float.parseFloat(t1.getText());
                String y = v.substring(0,1);
                if(y==" - "){
                    t1.setText(""+y);
                }
                else{
                    t1.setText("-"+v);
                }
            } */
            if(ob==b22){
                t1.setText(t1.getText()+"0");
                a=Float.parseFloat(t1.getText());
            }
            if(ob==b23){
                t1.setText(t1.getText()+".");
                a=Float.parseFloat(t1.getText());
            }
            if(ob==b24){
                a=Float.parseFloat(t1.getText());
                if(z==1){
                    r=w/a;
                    t1.setText(""+r);
                }
                if(z==2){
                    r=a*w;
                    t1.setText(""+r);
                }
                if(z==3){
                    r=w-a;
                    t1.setText(""+r);
                }
                if(z==4){
                    r=a+w;
                    t1.setText(""+r);
                }
                if(z==5){
                    r=((w/a)*100);
                    t1.setText(""+r+" %");
                }
            }
        }
    }
public static void main(String[] args) {
        tsk9 A=new tsk9();
    }
}
