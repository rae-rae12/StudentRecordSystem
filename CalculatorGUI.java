import javax.swing.*;
public class CalculatorGUI {
    //sample code
    public static void main (String[] args){
        JFrame frame = new JFrame("Addition Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel num1 = new JLabel ("First Number: ");
        JTextField tnum1 = new JTextField(10);
        JLabel num2 = new JLabel ("Second Number: ");
        JTextField tnum2 = new JTextField(10);

        frame.add(num1);
        frame.add(tnum1);
        frame.add(num2);
        frame.add(tnum2);
        
        
    }
    
    
}
