package catatanharian;

import javax.swing.JFrame;
import catatanharian.ui.CatatanFrame;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        // Jalankan UI di Event Dispatch Thread (Best Practice Swing)
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Catatan Harian");
            frame.setContentPane(new CatatanFrame());

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}