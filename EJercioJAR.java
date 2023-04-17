package ExamenEntornosA;

import javax.swing.JOptionPane;

public class EJercioJAR {

	public static void main(String[] args) {
		int Opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea salir?");
		
		if (Opcion == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Hasta pronto");
		} else if (Opcion == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Gracias por continuar");
		} else {
			JOptionPane.showMessageDialog(null, "Cancelando...");
		}
	}
}