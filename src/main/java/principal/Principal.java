package principal;
import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {
    public static void main(String[] args) {
        
    Triangulo tri = new Triangulo();

    //Entrada
    tri.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo")));
    tri.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a algura do triângulo")));
    //Saída
    JOptionPane.showMessageDialog(null,"A área do triângulo é " + tri.getArea());
    }
}