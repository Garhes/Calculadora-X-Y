import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraPotenciaGUI {
    public static void main(String[] args) {
        // Crear el marco de la aplicación
        JFrame frame = new JFrame("Calculadora de Potencia");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // Crear etiquetas y campos de entrada
        JLabel labelBase = new JLabel("Ingrese la base (x):");
        labelBase.setBounds(20, 20, 150, 25);
        frame.add(labelBase);
        
        JTextField fieldBase = new JTextField();
        fieldBase.setBounds(180, 20, 150, 25);
        frame.add(fieldBase);
        
        JLabel labelExponente = new JLabel("Ingrese el exponente (y):");
        labelExponente.setBounds(20, 60, 150, 25);
        frame.add(labelExponente);
        
        JTextField fieldExponente = new JTextField();
        fieldExponente.setBounds(180, 60, 150, 25);
        frame.add(fieldExponente);
        
        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(150, 100, 100, 30);
        frame.add(calcularButton);
        
        JLabel resultadoLabel = new JLabel("Resultado:");
        resultadoLabel.setBounds(20, 140, 350, 25);
        frame.add(resultadoLabel);
        
        // Acción del botón
        calcularButton.addActionListener((ActionEvent e) -> {
            try {
                double base = Double.parseDouble(fieldBase.getText());
                int exponente = Integer.parseInt(fieldExponente.getText());
                double resultado = Math.pow(base, exponente);
                resultadoLabel.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Error: Entrada inválida. Ingrese números válidos.");
            }
        });
        
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
