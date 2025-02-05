package KlausurWiSe2023;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reiserechner extends JFrame {
    private JPanel reiseRechnerPanel;
    private JButton berechneButton;
    private JComboBox anzahlpersonenComboBox;
    private JTextField ticketPreisTextField;
    private JTextField entfernungTextField;
    private JTextField gesamtPreisTextField;
    private JLabel anzahlPLabel;
    private JLabel ticketPLabel;
    private JLabel entfernungLabel;
    private JLabel gesantPreisLabel;

;


    public Reiserechner(){
        setTitle("Reiserechner");
        setSize(300,250);
        setContentPane(reiseRechnerPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        berechneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               gesamtPreisTextField.setText(berechneGesamtpreis() + "€");

            }
        });


    }


    public String berechneGesamtpreis(){

        double personen = Double.parseDouble( String.valueOf(anzahlpersonenComboBox.getSelectedItem()));
        double preis =  Double.parseDouble(ticketPreisTextField.getText());
        double km = Double.parseDouble(entfernungTextField.getText());

        double gesamtPreis = personen * (preis +(km *0.1));
        return String.valueOf( gesamtPreis);
    }

    public static void main(String[] args) {
        new Reiserechner();
    }
}
