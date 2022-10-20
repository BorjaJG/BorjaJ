package COMbjg.pc;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getIt());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("i9");
        pentium.setFabricante("Intel");




    }
}