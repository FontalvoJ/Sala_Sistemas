public class cls_inventario {

    private String str_serial;
    private String str_nombre;
    private String str_caracteristicas;
    private String str_conf_red;
    private String str_programas;
    private int int_numero;
    private String str_ubicacion;

    public cls_inventario(String ser,
            String nomb, String carac, String red, String prog, int num, String ub) {
        this.str_serial = ser;
        this.str_nombre = nomb;
        this.str_caracteristicas = carac;
        this.str_conf_red = red;
        this.str_programas = prog;
        this.int_numero = num;
        this.str_ubicacion = ub;

    }

    //SETTERS
    public void setNombre(String nombre) {this.str_nombre = nombre;}
    public void setCaracteristicas(String caracteristicas ){this.str_caracteristicas = caracteristicas;}
    public void setConfRed(String red) {this.str_conf_red= red;}
    public void setProgramas(String programas) {this.str_programas= programas;} 
    public void setNumero(int numero) {this.int_numero = numero;}  
    
    //GETTERS
    public String getNombre() {return this.str_nombre;}
    public String getCaracteristicas() {return this.str_caracteristicas;}
    public String getRed() {return this.str_conf_red;}
    public String getSerial() {return this.str_serial;}
    public String getProgramas() {return this.str_programas;}
    public int getNumero() {return this.int_numero;}
    public String getUbicacion() {return this.str_ubicacion;}
}