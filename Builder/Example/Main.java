package Builder.Example;

public class Main {
    public static void main(String[] args) {
        CafeClass cafe = new CafeBuilder()
        .setNom("dada")
        .setPrix(250)
        .setQuantiteStock(90)
        .build();
        System.out.println("Café "+cafe.getNom()+" au prix de "+ cafe.getPrix() + " stock " + cafe.getQuantiteStock() );
    }
}
