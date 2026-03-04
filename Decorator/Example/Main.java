package Decorator.Example;

public class Main {
    public static void main(String[] args) {
        ICommercialBuilding monCommerce = new CommercialBuildingClass("Mon Commerce");
        monCommerce = new BakeryConcreteDecorator(monCommerce);
        monCommerce = new BarConcreteDecorator(monCommerce);
        monCommerce = new KebabConcreteDecorator(monCommerce);
        System.out.println("Pour les achats : ");
        monCommerce.achat();

        System.out.println("Voici pour les ventes : ");
        monCommerce.vendre();
    }
}
