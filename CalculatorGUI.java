import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorGUI {
    //sample code
    public static void main (String[] args){
        JFrame frame = new JFrame("GUI Addition Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel num1 = new JLabel ("First Number: ");
        JTextField tnum1 = new JTextField(10);

        JLabel num2 = new JLabel ("Second Number: ");
        JTextField tnum2 = new JTextField(10);

        JButton add = new JButton("Add");
        JButton sub = new JButton("Subtract");
        JButton mul = new JButton("Multiply");
        JButton div = new JButton("Divide");
        JButton clear = new JButton("Clear");

        frame.add(num1);
        frame.add(tnum1);
        frame.add(num2);
        frame.add(tnum2);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(clear);

        add.addActionListener(e -> calculate(tnum1, tnum2, "+"));
        sub.addActionListener(e-> calculate(tnum1, tnum2, "-"));
        mul.addActionListener(e-> calculate(tnum1, tnum2, "*"));
        div.addActionListener(e-> calculate(tnum1, tnum2, "/"));
        clear.addActionListener(e-> {
            tnum1.setText("");
            tnum2.setText("");
        });
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void calculate( JTextField tnum1, JTextField tnum2, String operator){

        try{
            double num1 = Double.parseDouble(tnum1.getText());
            double num2 = Double.parseDouble(tnum2.getText());
            double result = 0;

            switch (operator){
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0){
                        JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    return;
            }
            JOptionPane.showMessageDialog(null, "Result: " + result);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error: Please enter valid numbers.");
        }
    }   
}
