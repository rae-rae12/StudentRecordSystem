import javax.swing.*;
import java.awt.*;
public class CalculatorGUI {
    //sample code
    public static void main (String[] args){
        JFrame frame = new JFrame("Addition Calculator");
        frame.setLayout(new FlowLayout());

        JLabel num1 = new JLabel ("First Number: ");
        JTextField tnum1 = new JTextField(10);
        JLabel num2 = new JLabel ("Second Name: ");
        JTextField tnum2 = new JTextField(10);

        frame.add(num1);
        frame.add(num2);
        frame.add(tnum1);
        frame.add(tnum2);
    }
    
    
}
