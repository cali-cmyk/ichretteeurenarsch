package WeitereUebungen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaumarktHelfer extends JFrame {
    private JPanel baumarktHelferPanel;
    private JButton berechneButton;
    private JComboBox comboBox1;
    private JTextField anzahlRegaleTextField;
    private JTextField anzahlMeterTextfield;
    private JLabel anzahlRegaleLabel;
    private JLabel anzahlMeterLabel;
    private JLabel brettLaengerLabel;

    public BaumarktHelfer() {
        setTitle("Baumarkt-Helfer");
        setSize(300, 400);
        setContentPane(baumarktHelferPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        berechneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                berechne();
            }
        });
    }





    public void berechne() {
        String text = String.valueOf(comboBox1.getSelectedItem());
        double anzahlRegale = Double.parseDouble(anzahlRegaleTextField.getText());
        switch (text) {
            case "kurz":
                double y = anzahlRegale * 0.2;
                anzahlMeterTextfield.setText(String.valueOf(y));
                break;
            case "mittel":
                double x = anzahlRegale *0.4;
                anzahlMeterTextfield.setText(String.valueOf(x));
                break;
            case "lang":
                double z = anzahlRegale *0.8;
                anzahlMeterTextfield.setText(String.valueOf(z));
                break;

        }

    }

    public static void main(String[] args) {
        new BaumarktHelfer();
    }
}