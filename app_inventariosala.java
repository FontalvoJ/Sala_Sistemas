import javax.swing.JOptionPane;

public class app_inventariosala {
    public static void main(String[] args){
        fnt_menu(true);
    }


    private static void fnt_menu_equipos(boolean m_equipos) {
        while (m_equipos == true){
            
            int eq =Integer.parseInt(JOptionPane.showInputDialog(null, "<<< MENU >>\n 1. Agregar\n 2.Consultar\n 3.Actualizar\n 4.Salir"));
            if (eq == 4){
                m_equipos = false;
            }
        }
    
    }

    private static void fnt_menu(boolean menu){
        while (menu == true){
            int m =Integer.parseInt(JOptionPane.showInputDialog(null, "<<< MENU >>\n 1. Registrar Equipo\n 2.Prestamos\n 3.Reportes\n 4.Salir"));
            if (m == 1){
                fnt_menu_equipos(true);
            }
            if (m == 4){
                System.exit(0);
            }
        }
    
    }
}