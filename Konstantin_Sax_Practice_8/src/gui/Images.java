package gui;

import javax.swing.*;
import java.awt.*;

public class Images extends JFrame {

    public Images() {
        super("Программа с картинками"); // Установить заголовок через конструктор
        initializeWindow();
        createImagePanels();
        setVisible(true); // Отображение окна
    }

    private void initializeWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setLayout(new GridLayout(1, 2)); // Сетка на 1 строку и 2 столбца
    }

    private void createImagePanels() {
        add(createImagePanel("src/cat.jpg", "Кот с радостным видом"));
        add(createImagePanel("src/dog.jpg", "Собака выглядит задумчивой"));
    }

    private JPanel createImagePanel(String imagePath, String captionText) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel imageLabel = new JLabel(new ImageIcon(imagePath));
        JLabel caption = new JLabel(captionText, JLabel.CENTER);

        panel.add(imageLabel, BorderLayout.CENTER);
        panel.add(caption, BorderLayout.SOUTH);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Images::new);
    }
}
