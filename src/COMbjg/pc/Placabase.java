package COMbjg.pc;

public class Placabase {
    private Integer id;
    private Integer marca;
    private String fabricante;

    /**
     * modificar eliminar añadir
     */

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMarca(){
        return marca;
    }

    public void setMarca(Integer marca) {
        this.marca = marca;
    }

    private void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
