import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String input;
        double temperature;
        input = JOptionPane.showInputDialog("What is the current temperature?");
        temperature=Double.parseDouble(input);

        while (temperature>102.5)
        {
            JOptionPane.showMessageDialog(null, "Turn down the vat"+
                                                " thermostat wait for 5 minutes and"+
                                                    " check the temperature again.");
            input=JOptionPane.showInputDialog("What is the temperature?");
            
        }

    }
}