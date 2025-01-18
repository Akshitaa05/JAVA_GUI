import javax.swing.*;
import java.awt.*;
class tsk11{
    Frame f;
    List li1 , li2;
    Label l1,l2,l3,l4;
    TextField t1,t2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    tsk11(){
        f=new Frame("Calculations");
        f.setBackground(Color.lightGray);
        f.setLayout(null);

        l1 = new Label("List I");
        l1.setBounds(180,100,60,20);
        f.add(l1);
        li1 = new List();
        li1.add("Akshita");
        li1.add("Khushi");
        li1.add("Aahana");
        li1.add("Bhavya");
        li1.add("Jiya");
        li1.add("Palak");
        li1.setBounds(160,150,80,120);
        f.add(li1);

        l2 = new Label("List II");
        l2.setBounds(540,100,60,20);
        f.add(l2);
        li2 = new List();
        li2.add("Arush");
        li2.add("Ansh");
        li2.add("Harshil");
        li2.add("Ritvik");
        li2.add("Arshul");
        li2.add("Aman");
        li2.setBounds(520,150,80,120);
        f.add(li2);

        l3=new Label("Enter Data:- ");
        l3.setBounds(100,310,70,20);
        f.add(l3);
        t1=new TextField("");
        t1.setBounds(170,310,50,20);
        f.add(t1);
        l4=new Label("Enter Data:- ");
        l4.setBounds(520,310,70,20);
        f.add(l4);
        t2=new TextField("");
        t2.setBounds(590,310,50,20);
        f.add(t2);


        b1 = new Button("A to Z");
        b1.setBounds(80,180,50,30);
        f.add(b1);
        b2 = new Button("Z to A");
        b2.setBounds(80,230,50,30);
        f.add(b2);
        b3 = new Button(">");
        b3.setBounds(360,165,30,30);
        f.add(b3);
        b4 = new Button("<");
        b4.setBounds(360,200,30,30);
        f.add(b4);
        b5 = new Button(">>");
        b5.setBounds(360,235,30,30);
        f.add(b5);
        b6 = new Button("<<");
        b6.setBounds(360,270,30,30);
        f.add(b6);
        b7 = new Button("A to Z");
        b7.setBounds(630,180,50,30);
        f.add(b7);
        b8 = new Button("Z to A");
        b8.setBounds(630,230,50,30);
        f.add(b8);
        b9=new Button("Add");
        b9.setBounds(130,350,50,20);
        f.add(b9);
        b10=new Button("Add");
        b10.setBounds(550,350,50,20);
        f.add(b10);


        f.setResizable(false);
        f.setBounds(400,100,800,500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        tsk11 A=new tsk11();
    }
}
