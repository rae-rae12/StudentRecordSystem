import javax.swing.*;
import java.awt.*;
public class CalculatorGUI {
    //sample code
    public static void main (String[] args){
        JFrame frame = new JFrame("Addition Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        frame.setVisible(true);


        frame.add(num1);
        frame.add(num2);
        frame.add(tnum1);
        frame.add(tnum2);
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
}
