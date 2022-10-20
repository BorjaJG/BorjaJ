package COMbjg.pc;

public class Memoriaram {
    /**
     * propiedades del procesador
     */

    private Integer id;
    private String marca;
    private String fabricante;

    /**
     * modificar eliminar añadir
     */

    public Integer getIt() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
