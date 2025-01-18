import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TicTacToe implements ActionListener{
    Frame f;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    Font f1;
    Label l1,l2,l3,l4,l5;
    int c=1 ,x=1;
    TicTacToe(){
        f = new Frame("Tic Tac Toe");
        f.setLayout(null);
        f.setBackground(Color.LIGHT_GRAY);
        l1 = new Label (JOptionPane.showInputDialog(null,"enter first name :","Player 1:",0));
        f1 = new Font("Times New Roman",Font.BOLD,20);
        l1.setFont(f1);
        l1.setBounds(120,75,80,30);
        f.add(l1);
        l2 = new Label (JOptionPane.showInputDialog(null,"enter second name :","Player 2:",0));
        l2.setFont(f1);
        l2.setBounds(120,145,80,30);
        f.add(l2);
        l3 = new Label("X");
        l3.setBounds(210,80,20,20);
        l3.setFont(f1);
        f.add(l3);
        l4 = new Label("O");
        l4.setBounds(210,150,20,20);
        l4.setFont(f1);
        f.add(l4);
        b1 = new Button("Start");
        b1.setBounds(600,100,60,30);
        f.add(b1);
        b2 = new Button("Stop");
        b2.setBounds(600,160,60,30);
        f.add(b2);
        b3 = new Button();
        b3.setBounds(220,300,80,60);
        f.add(b3);
        b4 = new Button();
        b4.setBounds(300,300,80,60);
        f.add(b4);
        b5 = new Button();
        b5.setBounds(380,300,80,60);
        f.add(b5);
        b6 = new Button();
        b6.setBounds(220,360,80,60);
        f.add(b6);
        b7 = new Button();
        b7.setBounds(300,360,80,60);
        f.add(b7);
        b8 = new Button();
        b8.setBounds(380,360,80,60);
        f.add(b8);
        b9 = new Button();
        b9.setBounds(220,410,80,60);
        f.add(b9);
        b10 = new Button();
        b10.setBounds(300,410,80,60);
        f.add(b10);
        b11 = new Button();
        b11.setBounds(380,410,80,60);
        f.add(b11);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);
        b11.setEnabled(false);
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
        f.setBounds(300,100,800,600);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent a){
        Object o = a.getSource();
        if(o == b1){
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b10.setEnabled(true);
            b11.setEnabled(true);
            l3.setBackground(Color.green);
            l4.setBackground(Color.red);
        }
        if(o == b2){
            x=0;
            System.exit(0);
        }
        if(o == b3){
            if(c%2 != 0){
                b3.setLabel("X");
                b3.setFont(f1);
                b3.setBackground(Color.black);
                b3.setEnabled(false);
            }
            else{
                b3.setLabel("O");
                b3.setFont(f1);
                b3.setBackground(Color.black);
                b3.setEnabled(false);
            }
            c++;
            if(c%2 != 0){
                l3.setBackground(Color.green);
                l4.setBackground(Color.cyan);
            }
            else{
                l4.setBackground(Color.green);
                l3.setBackground(Color.cyan);
            }
        }
        if(o == b4){
            if(c%2 != 0){
                b4.setLabel("X");
                b4.setFont(f1);
                b4.setBackground(Color.black);
                b4.setEnabled(false);

            }
            else{
                b4.setLabel("O");
                b4.setFont(f1);
                b4.setBackground(Color.black);
                b4.setEnabled(false);
            }
            c++;
            if(c%2 != 0){
                l3.setBackground(Color.green);
                l4.setBackground(Color.cyan);
            }
            else{
                l4.setBackground(Color.green);
                l3.setBackground(Color.cyan);
            }
        }
        if(o == b5){
            if(c%2 != 0){
                b5.setLabel("X");
                b5.setFont(f1);
                b5.setBackground(Color.black);
                b5.setEnabled(false);

            }
            else{
                b5.setLabel("O");
                b5.setFont(f1);
                b5.setBackground(Color.black);
                b5.setEnabled(false);
            }
            c++;
            if(c%2 != 0){
                l3.setBackground(Color.green);
                l4.setBackground(Color.cyan);
            }
            else{
                l4.setBackground(Color.green);
                l3.setBackground(Color.cyan);
            }

        }
        if(o == b6){
            if(c%2 != 0){
                b6.setLabel("X");
                b6.setFont(f1);
                b6.setBackground(Color.black);
                b6.setEnabled(false);
            }
            else{
                b6.setLabel("O");
                b6.setFont(f1);
                b6.setBackground(Color.black);
                b6.setEnabled(false);
            }
            c++;
            if(c%2 != 0){
                l3.setBackground(Color.green);
                l4.setBackground(Color.cyan);
            }
            else{
                l4.setBackground(Color.green);
                l3.setBackground(Color.cyan);
            }
        }
        if(o == b7){
            if(c%2 != 0){
                b7.setLabel("X");
                b7.setFont(f1);
                b7.setBackground(Color.black);
                b7.setEnabled(false);
            }
            else{
                b7.setLabel("O");
                b7.setFont(f1);
                b7.setBackground(Color.black);
                b7.setEnabled(false);
            }
            c++;
            if(c%2 != 0){
                l3.setBackground(Color.green);
                l4.setBackground(Color.cyan);
            }
            else{
                l4.setBackground(Color.green);
                l3.setBackground(Color.cyan);
            }
        }
        if(o == b8){
            if(c%2 != 0){
                b8.setLabel("X");
                b8.setFont(f1);
                b8.setBackground(Color.black);
                b8.setEnabled(false);
            }
            else{
                b8.setLabel("O");
                b8.setFont(f1);
                b8.setBackground(Color.black);
                b8.setEnabled(false);
            }
            c++;
            if(c%2 != 0){
                l3.setBackground(Color.green);
                l4.setBackground(Color.cyan);
            }
            else{
                l4.setBackground(Color.green);
                l3.setBackground(Color.cyan);
            }
        }
        if(o == b9){
            if(c%2 != 0){
                b9.setLabel("X");
                b9.setFont(f1);
                b9.setBackground(Color.black);
                b9.setEnabled(false);
            }
            else{
                b9.setLabel("O");
                b9.setFont(f1);
                b9.setBackground(Color.black);
                b9.setEnabled(false);
            }
            c++;
            if(c%2 != 0){
                l3.setBackground(Color.green);
                l4.setBackground(Color.cyan);
            }
            else{
                l4.setBackground(Color.green);
                l3.setBackground(Color.cyan);
            }
        }
        if(o == b10){
            if(c%2 != 0){
                b10.setLabel("X");
                b10.setFont(f1);
                b10.setBackground(Color.black);
                b10.setEnabled(false);
            }
            else{
                b10.setLabel("O");
                b10.setFont(f1);
                b10.setBackground(Color.black);
                b10.setEnabled(false);
            }
            c++;
            if(c%2 != 0){
                l3.setBackground(Color.green);
                l4.setBackground(Color.cyan);
            }
            else{
                l4.setBackground(Color.green);
                l3.setBackground(Color.cyan);
            }
        }
        if(o == b11){
            if(c%2 != 0){
                b11.setLabel("X");
                b11.setFont(f1);
                b11.setBackground(Color.black);
                b11.setEnabled(false);
            }
            else{
                b11.setLabel("O");
                b11.setFont(f1);
                b11.setBackground(Color.black);
                b11.setEnabled(false);
            }
            c++;
            if(c%2 != 0){
                l3.setBackground(Color.green);
                l4.setBackground(Color.cyan);
            }
            else{
                l4.setBackground(Color.green);
                l3.setBackground(Color.cyan);
            }
        }
        if(c>4){
            if( b3.getLabel().equals("X") &&  b4.getLabel().equals("X") &&  b5.getLabel().equals("X")){
                l5 = new Label("Winner is "+l1.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b3.setBackground(Color.orange);
                b4.setBackground(Color.orange);
                b5.setBackground(Color.orange);
                x=0;
            }
            if( b3.getLabel().equals("O") &&  b4.getLabel().equals("O") &&  b5.getLabel().equals("O")){
                l5 = new Label("Winner is "+l2.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b3.setBackground(Color.orange);
                b4.setBackground(Color.orange);
                b5.setBackground(Color.orange);
                x=0;
            }
            if( b6.getLabel().equals("X") &&  b7.getLabel().equals("X") &&  b8.getLabel().equals("X")){
                l5 = new Label("Winner is "+l1.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b6.setBackground(Color.orange);
                b7.setBackground(Color.orange);
                b8.setBackground(Color.orange);
                x=0;
            }
            if( b6.getLabel().equals("O") &&  b7.getLabel().equals("O") &&  b8.getLabel().equals("O")){
                l5 = new Label("Winner is "+l2.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b6.setBackground(Color.orange);
                b7.setBackground(Color.orange);
                b8.setBackground(Color.orange);
                x=0;
            }
            if( b9.getLabel().equals("X") &&  b10.getLabel().equals("X") &&  b11.getLabel().equals("X")){
                l5 = new Label("Winner is "+l1.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b9.setBackground(Color.orange);
                b10.setBackground(Color.orange);
                b11.setBackground(Color.orange);
                x=0;
            }
            if( b9.getLabel().equals("O") &&  b10.getLabel().equals("O") &&  b11.getLabel().equals("O")) {
                l5 = new Label("Winner is " + l2.getText() + " !");
                l5.setFont(new Font("Times New Roman", Font.BOLD, 30));
                l5.setBounds(500, 350, 290, 50);
                b9.setBackground(Color.orange);
                b10.setBackground(Color.orange);
                b11.setBackground(Color.orange);
                f.add(l5);
                x = 0;
            }
            if( b3.getLabel().equals("X") &&  b6.getLabel().equals("X") &&  b9.getLabel().equals("X")){
                l5 = new Label("Winner is "+l1.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b3.setBackground(Color.orange);
                b6.setBackground(Color.orange);
                b9.setBackground(Color.orange);
                x=0;
            }
            if( b3.getLabel().equals("O") &&  b6.getLabel().equals("O") &&  b9.getLabel().equals("O")){
                l5 = new Label("Winner is "+l2.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b3.setBackground(Color.orange);
                b6.setBackground(Color.orange);
                b9.setBackground(Color.orange);
                x=0;
            }
            if( b4.getLabel().equals("X") &&  b7.getLabel().equals("X") &&  b10.getLabel().equals("X")){
                l5 = new Label("Winner is "+l1.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b7.setBackground(Color.orange);
                b4.setBackground(Color.orange);
                b10.setBackground(Color.orange);
                x=0;
            }
            if( b4.getLabel().equals("O") &&  b7.getLabel().equals("O") &&  b10.getLabel().equals("O")){
                l5 = new Label("Winner is "+l2.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b7.setBackground(Color.orange);
                b4.setBackground(Color.orange);
                b10.setBackground(Color.orange);
                x=0;
            }
            if( b5.getLabel().equals("X") &&  b8.getLabel().equals("X") &&  b11.getLabel().equals("X")){
                l5 = new Label("Winner is "+l1.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b8.setBackground(Color.orange);
                b11.setBackground(Color.orange);
                b5.setBackground(Color.orange);
                x=0;
            }
            if( b5.getLabel().equals("O") &&  b8.getLabel().equals("O") &&  b11.getLabel().equals("O")){
                l5 = new Label("Winner is "+l2.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b8.setBackground(Color.orange);
                b11.setBackground(Color.orange);
                b5.setBackground(Color.orange);
                x=0;
            }
            if( b3.getLabel().equals("X") &&  b7.getLabel().equals("X") &&  b11.getLabel().equals("X")){
                l5 = new Label("Winner is "+l1.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b3.setBackground(Color.orange);
                b7.setBackground(Color.orange);
                b11.setBackground(Color.orange);
                x=0;

            }
            if( b3.getLabel().equals("O") &&  b7.getLabel().equals("O") &&  b11.getLabel().equals("O")){
                l5 = new Label("Winner is "+l2.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b3.setBackground(Color.orange);
                b7.setBackground(Color.orange);
                b11.setBackground(Color.orange);
                x=0;
            }
            if( b5.getLabel().equals("X") &&  b7.getLabel().equals("X") &&  b9.getLabel().equals("X")){
                l5 = new Label("Winner is "+l1.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b7.setBackground(Color.orange);
                b9.setBackground(Color.orange);
                b5.setBackground(Color.orange);
                x=0;
            }
            if( b5.getLabel().equals("O") &&  b7.getLabel().equals("O") &&  b9.getLabel().equals("O")){
                l5 = new Label("Winner is "+l2.getText()+" !");
                l5.setFont(new Font("Times New Roman",Font.BOLD,30));
                l5.setBounds(500,350,290,50);
                f.add(l5);
                b7.setBackground(Color.orange);
                b9.setBackground(Color.orange);
                b5.setBackground(Color.orange);
                x=0;
            }
            if (x == 0) {
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b10.setEnabled(false);
                b11.setEnabled(false);
            }
        }
    }
    public static void main(String []z){
        TicTacToe t = new TicTacToe();
    }
}
