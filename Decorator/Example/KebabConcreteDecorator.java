package Decorator.Example;

public class KebabConcreteDecorator extends CommercialBuildingBaseDecorator {

    public KebabConcreteDecorator(ICommercialBuilding commercialBuilding) {
        super(commercialBuilding);
    }

    @Override
    public void vendre() {
        System.out.println("Je vends des kebabs aussi !");
        this.GetCommercialBuilding().vendre();
    }

    @Override
    public void achat() {
        this.GetCommercialBuilding().achat();
        System.out.println("J'achète des ingrédients aussi !");
    }
    
}
