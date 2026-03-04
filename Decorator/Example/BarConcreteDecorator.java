package Decorator.Example;

public class BarConcreteDecorator extends CommercialBuildingBaseDecorator {
    
    public BarConcreteDecorator(ICommercialBuilding commercialBuilding) {
        super(commercialBuilding);
    }

    @Override
    public void vendre() {
        System.out.println("Je vends des bières aussi !");
        this.GetCommercialBuilding().vendre();
    }

    @Override
    public void achat() {
        this.GetCommercialBuilding().achat();
        System.out.println("J'achète des fûts aussi !");
    }
}
