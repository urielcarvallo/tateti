package tateti;

import javax.swing.JOptionPane;

public class TaTeTi {

    public static void main(String[] args) {
        String nombre1, nombre2;
        
        nombre1 = JOptionPane.showInputDialog("Ingrese jugador uno");
        nombre2 = JOptionPane.showInputDialog("Ingrese jugador dos");
        
        Ventana vn = new Ventana();
        vn.setNombreJ1(nombre1);
        vn.setNombreJ2(nombre2);
        vn.setLocationRelativeTo(null);
        vn.setVisible(true);
        
    }
    
}
