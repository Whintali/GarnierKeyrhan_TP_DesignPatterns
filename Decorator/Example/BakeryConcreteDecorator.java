package Decorator.Example;

public class BakeryConcreteDecorator extends CommercialBuildingBaseDecorator {

    public BakeryConcreteDecorator(ICommercialBuilding commercialBuilding) {
        super(commercialBuilding);
    }

    @Override
    public void vendre() {
        System.out.println("Je vends du pain aussi !");
        this.GetCommercialBuilding().vendre();
    }

    @Override
    public void achat() {
        this.GetCommercialBuilding().achat();
        System.out.println("J'achète de la farine aussi !");
    }
    
}
