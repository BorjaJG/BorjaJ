package COMbjg.pc;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        System.out.println("Procesador: ");

        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getIt());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());


        System.out.println("Placa base: ");

        Placabase intel = new Placabase();
        intel.setId(1);
        intel.setMarca("Gigabyte");
        intel.setFabricante("Intel");

        System.out.println(intel.getId());
        System.out.println(intel.getMarca());
        System.out.println(intel.getFabricante());


        System.out.println("Raton : ");

        Raton logitech = new Raton();
        logitech.setId(1);
        logitech.setMarca("G502 Hero");
        logitech.setFabricante("logitech");

        System.out.println(logitech.getIt());
        System.out.println(logitech.getMarca());
        System.out.println(logitech.getFabricante());


        System.out.println("Altavoces : ");

        Altavoces hd = new Altavoces();
        hd.setId1(1);
        hd.setMarca1(" Altavoces X1000 Gaming Negros ");
        hd.setFabricante1("HP");

        System.out.println(hd.getIt1());
        System.out.println(hd.getMarca1());
        System.out.println(hd.getFabricante1());


        System.out.println("Caja torre: ");

        Cajatorre Aerocool = new Cajatorre();
        Aerocool.setId2(1);
        Aerocool.setMarca2("Raizen 6400");
        Aerocool.setFabricante2("AMD");

        System.out.println(Aerocool.getIt2());
        System.out.println(Aerocool.getMarca2());
        System.out.println(Aerocool.getFabricante2());


        System.out.println("Disco duro: ");

        Discoduro Toshiba = new Discoduro();
        Toshiba.setId(1);
        Toshiba.setMarca("Canvio Basics");
        Toshiba.setFabricante("Toshiba");

        System.out.println(Toshiba.getId());
        System.out.println(Toshiba.getMarca());
        System.out.println(Toshiba.getFabricante());


        System.out.println("Fuente de alimentacion: ");

        Funetedealimentacion Tempest = new Funetedealimentacion();
        Tempest.setId(1);
        Tempest.setMarca("PSU 750W");
        Tempest.setFabricante("Tempest");

        System.out.println(Tempest.getIt());
        System.out.println(Tempest.getMarca());
        System.out.println(Tempest.getFabricante());








    }
}