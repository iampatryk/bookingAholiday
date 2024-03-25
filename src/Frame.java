import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {

    public void frame() {
        JFrame okno = new JFrame("Moja Aplikacja");

        // Ustawienie operacji zamknięcia
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Dodanie etykiety z tekstem
        JLabel etykieta = new JLabel("Witaj, Świecie!", JLabel.CENTER);
        okno.getContentPane().add(etykieta, BorderLayout.CENTER);

        // Ustawienie rozmiaru okna
        okno.setSize(1200, 1000);

        // Wyświetlenie okna
        okno.setVisible(true);


    }

}
