import javax.swing.JOptionPane;

public class app_inventariosala {

    static cls_inventario [] equipos = new cls_inventario[100];
    static int int_posiciones = 0;
    static boolean blm_sw;
    static int pos;

    public static void main(String[] args){
        fnt_menu(true);
    }


    private static void fnt_equipos_m1(){;
        String codigo = JOptionPane.showInputDialog("Serial");
        String nombre = JOptionPane.showInputDialog("Nombre");
        String caracteristicas = JOptionPane.showInputDialog("Caracteristicas");
        String red = JOptionPane.showInputDialog("Red");
        String programas = JOptionPane.showInputDialog("Programas");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
        String ubicacion = JOptionPane.showInputDialog("Ubicacion");
        equipos[int_posiciones] = new cls_inventario(codigo, nombre,caracteristicas, red, programas, numero, ubicacion);
        int_posiciones += 1;
    
        JOptionPane.showMessageDialog(null,"Equipo registrado","Registrar", JOptionPane.INFORMATION_MESSAGE);

    }

    private static void fnt_menu_equipos(boolean m_equipos) {
        while (m_equipos == true){
            
            int eq =Integer.parseInt(JOptionPane.showInputDialog(null, "<<< MENU >>\n 1. Agregar\n 2.Consultar\n 3.Actualizar\n 4.Salir"));
            if (eq == 4){
                m_equipos = false;
            }
            if (eq == 1){
                fnt_equipos_m1();
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