package one.digitalinnovation.enums;

public class Program {

    public static void main(String[] args) {
        //final vehicleType vehicleType = new vehicleType();

        System.out.println(vehicleType.TERRESTRE);
        System.out.println(vehicleType.AQUATICO);


        //System.out.println(vehicleType.valueOf("aero"));
        System.out.println(vehicleType.valueOf("AEREO"));


        for (vehicleType tipo : vehicleType.values()) {
            System.out.println("Type: "+tipo);
        }

        System.out.println("Código do Status CLOSE :"+Status.CLOSE.getCod());
        System.out.println("Texto do Status OPEN :"+Status.OPEN.getTexto());
    }

}
