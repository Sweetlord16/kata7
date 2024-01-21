package kata7.eric;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new JFrame() {
            {
                setTitle("Kata 7");
                setLocationRelativeTo(null);
                setSize(400, 300);
                setDefaultCloseOperation(EXIT_ON_CLOSE);

                // Layout manager
                setLayout(new BorderLayout());

                // Etiqueta en la parte superior
                JLabel label = new JLabel("Esta es la kata 7", SwingConstants.CENTER);
                add(label, BorderLayout.NORTH);

                // Botón en el centro
                JButton button = new JButton("Cerrar");
                add(button, BorderLayout.CENTER);

                // Manejador de eventos para el botón
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
            }
        }.setVisible(true);
    }
}