package COMbjg.pc;

public class Grabadoradvd {
    /**
     * propiedades del procesador
     */

    private static Integer id;
    private static String marca;
    private static String fabricante;

    /**
     * modificar eliminar añadir
     */

    public static Integer getIt() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public static String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public static String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
