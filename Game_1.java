import java.awt.*;
import java.awt.event.*;
import java.lang.*;
class Game_1 implements ActionListener{
    Frame f,f2,f3,f4;
    int i,j,x,sc=0;
    int a = (int)Math.floor(Math.random() * (100 - 1 + 1) + 1);
    Button b[][]=new Button[11][11];
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    Font fo1,fo2,fo3,fo4,fo5;
    Button b1,b2,b3,b4;
    TextField t1;
    String p;
    Game_1() {
        System.out.println(a);
        f = new Frame("Game_1:- ");
        f.setLayout(null);
        f.setBackground(Color.lightGray);
        f2 = new Frame("Game_1:- ");
        f2.setLayout(null);
        f2.setBackground(Color.lightGray);
        f3 = new Frame("Game_1:- ");
        f3.setLayout(null);
        f3.setBackground(Color.lightGray);
        f3.setBounds(400,200,800,400);
        f3.setVisible(false);
        f4 = new Frame("Game_1:- ");
        f4.setLayout(null);
        f4.setBackground(Color.lightGray);
        f4.setBounds(400,200,700,400);
        fo1=new Font("Courier",Font.BOLD+Font.ITALIC,30);
        fo2=new Font("TimesNewRoman",Font.BOLD+Font.ITALIC,20);
        fo3=new Font("TimesNewRoman",Font.PLAIN,15);
        fo4=new Font("TimesNewRoman",Font.BOLD,20);
        fo5=new Font("TimesNewRoma",Font.PLAIN,30);
        l13=new Label("Good Job!");
        l13.setFont(fo1);
        l13.setBounds(280,100,300,30);
        f4.add(l13);
        b3=new Button("Play Again ");
        b3.setFont(fo4);
        b3.setBounds(200,270,150,40);
        f4.add(b3);
        b3.addActionListener(this);
        b4=new Button("Exit ");
        b4.setFont(fo4);
        b4.setBounds(400,270,150,40);
        f4.add(b4);
        b4.addActionListener(this);
        l1=new Label("* Guess The Number *");
        l1.setFont(fo1);
        l1.setBounds(370,60,800,50);
        f2.add(l1);
        l9=new Label("Please Enter Your Name:- ");
        l9.setFont(fo5);
        l9.setBounds(270,180,400,30);
        f2.add(l9);
        t1=new TextField();
        t1.setFont(fo5);
        t1.setBounds(700,180,200,40);
        f2.add(t1);
        l2=new Label("Instructions for the game:- ");
        l2.setFont(fo2);
        l2.setBounds(100,280,1000,20);
        f2.add(l2);
        l3=new Label("1. As you click on start button,a random number from 1-100 will be selected by the system.\n");
        l3.setFont(fo3);
        l3.setBounds(130,330,700,20);
        f2.add(l3);
        l4=new Label("2. If you press a button and it turns \"Red\" ,means that the selected number is lesser than the one you need to guess.");
        l4.setFont(fo3);
        l4.setBounds(130,380,900,20);
        f2.add(l4);
        l5=new Label("3. If you press the button and it turns \"Yellow\",means that the button you pressed is larger than the number you need to guess.");
        l5.setFont(fo3);
        l5.setBounds(130,420,900,20);
        f2.add(l5);
        l6=new Label("4. And Finally, if the button you pressed turns \"Green\", means that you have fond the correct number.");
        l6.setFont(fo3);
        l6.setBounds(130,460,900,20);
        f2.add(l6);
        l7=new Label("The number of guess you make to find the number,will be your final score.");
        l7.setFont(fo3);
        l7.setBounds(130,530,900,20);
        f2.add(l7);
        l8=new Label("Let's Get Started ! ");
        l8.setFont(fo3);
        l8.setBounds(450,600,900,20);
        f2.add(l8);
        l10=new Label(" Thank You, Have a nice day !");
        l10.setFont(fo1);
        l10.setBounds(200,100,500,200);
        f3.add(l10);
        b1=new Button("START");
        b1.setFont(fo4);
        b1.setBounds(400,680,100,50);
        f2.add(b1);
        b2=new Button("EXIT");
        fo4=new Font("TimesNewRoman",Font.BOLD,20);
        b2.setFont(fo4);
        b2.setBounds(570,680,100,50);
        f2.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        for(i=0;i<11;i++){
            for(j=0;j<11;j++){
                b[i][j]=new Button("");
                b[i][j].addActionListener(this);
            }
        }
        for (i = 1; i < 11; i++) {
            for (j = 1; j < 11; j++) {
                b[1][j].setLabel("" + (j));
                b[1][j].setBounds(90 * j, 170, 90, 50);
                f.add(b[1][j]);
                b[2][j].setLabel("" + (j + 10));
                b[2][j].setBounds(90 * j, 220, 90, 50);
                f.add(b[2][j]);
                b[3][j].setLabel("" + (j + 20));
                b[3][j].setBounds(90 * j, 270, 90, 50);
                f.add(b[3][j]);
                b[4][j].setLabel("" + (j + 30));
                b[4][j].setBounds(90 * j, 320, 90, 50);
                f.add(b[4][j]);
                b[5][j].setLabel("" + (j + 40));
                b[5][j].setBounds(90 * j, 370, 90, 50);
                f.add(b[5][j]);
                b[6][j].setLabel("" + (j + 50));
                b[6][j].setBounds(90 * j, 420, 90, 50);
                f.add(b[6][j]);
                b[7][j].setLabel("" + (j + 60));
                b[7][j].setBounds(90 * j, 470, 90, 50);
                f.add(b[7][j]);
                b[8][j].setLabel("" + (j + 70));
                b[8][j].setBounds(90 * j, 520, 90, 50);
                f.add(b[8][j]);
                b[9][j].setLabel("" + (j + 80));
                b[9][j].setBounds(90 * j, 570, 90, 50);
                f.add(b[9][j]);
                b[10][j].setLabel("" + (j + 90));
                b[10][j].setBounds(90 * j, 620, 90, 50);
                f.add(b[10][j]);
            }
        }
        f.setBounds(250, 10, 1100, 800);
        f.setVisible(false);
        f2.setBounds(250, 10, 1100, 800);
        f2.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        sc++;
        p=t1.getText();
        l11=new Label("Welcome to the game "+p+"!");
        l11.setFont(fo1);
        l11.setBounds(350,60,1300,40);
        f.add(l11);
        l12=new Label("Click to begin:- ");
        l12.setFont(fo2);
        l12.setBounds(100,110,200,30);
        f.add(l12);
        Object ob = e.getSource();
        if(ob==b1){
            f.setVisible(true);
            f2.setVisible(false);
            f3.setVisible(false);
        }
        if(ob==b2){
            f3.setVisible(true);
            f.setVisible(false);
            f2.setVisible(false);
        }
        if(ob==b3){
            Game_1 A=new Game_1();
        }
        if(ob==b4){
            f3.setVisible(true);
            f.setVisible(false);
            f2.setVisible(false);
            f4.setVisible(false);
        }

        for (j = 1; j < 11; j++) {
            if (ob == b[1][j]) {
                x = Integer.parseInt(b[1][j].getLabel());
                if (x < a)
                    b[1][j].setBackground(Color.red.darker());
                if (x > a)
                    b[1][j].setBackground(Color.yellow);
                if (x == a) {
                    b[1][j].setBackground(Color.green);
                    f4.setVisible(true);
                    f.setVisible(false);
                }
            }
            if (ob == b[2][j]) {
                x = Integer.parseInt(b[2][j].getLabel());
                if (x < a)
                    b[2][j].setBackground(Color.red.darker());
                if (x > a)
                    b[2][j].setBackground(Color.yellow);
                if (x == a) {
                    b[2][j].setBackground(Color.green);
                    f4.setVisible(true);
                    f.setVisible(false);
                }
            }
            if (ob == b[3][j]) {
                x = Integer.parseInt(b[3][j].getLabel());
                if (x < a)
                    b[3][j].setBackground(Color.red.darker());
                if (x > a)
                    b[3][j].setBackground(Color.yellow);
                if (x == a) {
                    b[3][j].setBackground(Color.green);
                    f4.setVisible(true);
                    f.setVisible(false);
                }
            }
            if (ob == b[4][j]) {
                x = Integer.parseInt(b[4][j].getLabel());
                if (x < a)
                    b[4][j].setBackground(Color.red.darker());
                if (x > a)
                    b[4][j].setBackground(Color.yellow);
                if (x == a) {
                    b[4][j].setBackground(Color.green);
                    f4.setVisible(true);
                    f.setVisible(false);
                }
            }
            if (ob == b[5][j]) {
                x = Integer.parseInt(b[5][j].getLabel());
                if (x < a)
                    b[5][j].setBackground(Color.red.darker());
                if (x > a)
                    b[5][j].setBackground(Color.yellow);
                if (x == a) {
                    b[5][j].setBackground(Color.green);
                    f4.setVisible(true);
                    f.setVisible(false);
                }
            }
            if (ob == b[6][j]) {
                x = Integer.parseInt(b[6][j].getLabel());
                if (x < a)
                    b[6][j].setBackground(Color.red.darker());
                if (x > a)
                    b[6][j].setBackground(Color.yellow);
                if (x == a) {
                    b[6][j].setBackground(Color.green);
                    f4.setVisible(true);
                    f.setVisible(false);
                }
            }
            if (ob == b[7][j]) {
                x = Integer.parseInt(b[7][j].getLabel());
                if (x < a)
                    b[7][j].setBackground(Color.red.darker());
                if (x > a)
                    b[7][j].setBackground(Color.yellow);
                if (x == a) {
                    b[7][j].setBackground(Color.green);
                    f4.setVisible(true);
                    f.setVisible(false);
                }
            }
            if (ob == b[8][j]) {
                x = Integer.parseInt(b[8][j].getLabel());
                if (x < a)
                    b[8][j].setBackground(Color.red.darker());
                if (x > a)
                    b[8][j].setBackground(Color.yellow);
                if (x == a) {
                    b[8][j].setBackground(Color.green);
                    f4.setVisible(true);
                    f.setVisible(false);
                }
            }
            if (ob == b[9][j]) {
                x = Integer.parseInt(b[9][j].getLabel());
                if (x < a)
                    b[9][j].setBackground(Color.red.darker());
                if (x > a)
                    b[9][j].setBackground(Color.yellow);
                if (x == a) {
                    b[9][j].setBackground(Color.green);
                    f4.setVisible(true);
                    f.setVisible(false);
                }
            }
            if (ob == b[10][j]) {
                x = Integer.parseInt(b[10][j].getLabel());
                if (x < a)
                    b[10][j].setBackground(Color.red.darker());
                if (x > a)
                    b[10][j].setBackground(Color.yellow);
                if (x == a) {
                    b[10][j].setBackground(Color.green);
                    f4.setVisible(true);
                    f.setVisible(false);
                }
            }
        }
        if(x==a){
            l14=new Label("Your took  "+(sc-1)+" moves to guess the number.");
            l14.setFont(fo1);
            l14.setBounds(70,180,900,30);
            f4.add(l14);
        }
    }
    public static void main(String[] args) {
        Game_1 A=new Game_1();
    }
}