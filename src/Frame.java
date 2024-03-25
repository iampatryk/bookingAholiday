import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {

    public static void main(String[] args) {
        // Tworzenie nowego okna
        JFrame okno = new JFrame("Moja Aplikacja");

        // Ustawienie operacji zamknięcia
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Dodanie etykiety z tekstem
        JLabel etykieta = new JLabel("Witaj, Świecie!", JLabel.CENTER);
        okno.getContentPane().add(etykieta, BorderLayout.CENTER);

        // Ustawienie rozmiaru okna
        okno.setSize(300, 200);

        // Wyświetlenie okna
        okno.setVisible(true);

        // Dodanie przycisku do okna
        JButton przycisk = stworzPrzycisk();
        okno.getContentPane().add(przycisk, BorderLayout.SOUTH);
    }



    // Metoda do tworzenia przycisku
    private static JButton stworzPrzycisk() {
        // Tworzenie przycisku
        JButton przycisk = new JButton("Book a holiday");

        // Dodanie akcji do przycisku
        przycisk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Kod do wykonania po naciśnięciu przycisku
                System.out.println("Przycisk 'Book a holiday' został naciśnięty!");
            }
        });

        return przycisk;
    }

}
