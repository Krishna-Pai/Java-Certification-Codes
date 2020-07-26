import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class kp46text extends Applet implements ActionListener
{
TextField text1, text2, output;
Label label1, label2, label3;
Button button1, button2, button3, button4;

public void init()
{
setLayout(null);
label1= new Label("Enter Number 1:");
label1.setBounds(20,20,100,20);
add(label1);

text1 = new TextField(5);
text1.setBounds(150,20,100,20);
add(text1);

label2= new Label("Enter Number 2:");
label2.setBounds(20,50,100,20);
add(label2);

text2 = new TextField(5);
text2.setBounds(150,50,100,20);
add(text2);

label3= new Label("Result of 2 no's:");
label3.setBounds(20,80,100,20);
add(label3);

output = new TextField(5);
output.setBounds(150,80,100,20);
add(output);

button1 = new Button("Addition");
button1.setBounds(150,110,100,20);
add(button1);

button2 = new Button("Subtraction");
button2.setBounds(150,140,100,20);
add(button2);

button3 = new Button("Multiplication");
button3.setBounds(150,170,100,20);
add(button3);

button4 = new Button("Division");
button4.setBounds(150,200,100,20);
add(button4);

button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
float num1= Integer.parseInt(text1.getText());
float num2= Integer.parseInt(text2.getText());
float num3;

if (e.getSource() == button1)
{ num3 = num1+num2;}
else if (e.getSource() == button2)
{ num3 = num1-num2;}
else if (e.getSource() == button3)
{ num3 = num1*num2;}
else
{ num3 = num1/num2;}

output.setText(Float.toString(num3));
}
}