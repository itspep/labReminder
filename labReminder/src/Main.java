import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String input;
        double temperature;
        final double temp=102.5;
        input = JOptionPane.showInputDialog("What is the current temperature?");
        temperature=Double.parseDouble(input);

        while (temperature>temp)
        {
            JOptionPane.showMessageDialog(null, "Turn down the vat"+
                                                " thermostat wait for 5 minutes and"+
                                                    " check the temperature again.");
            input=JOptionPane.showInputDialog("What is the current temperature?");
            temperature=Double.parseDouble(input);
        }
        JOptionPane.showMessageDialog(null, "The temperature is acceptable, "+
                                                    "check again in 15 minutes time");

    }
}