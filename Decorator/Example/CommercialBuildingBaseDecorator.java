package Decorator.Example;


public abstract class CommercialBuildingBaseDecorator implements  ICommercialBuilding {
    public ICommercialBuilding commercialBuilding;

    public ICommercialBuilding GetCommercialBuilding() {
        return commercialBuilding;
    };
    public CommercialBuildingBaseDecorator(ICommercialBuilding commercialBuilding) {
        this.commercialBuilding = commercialBuilding;
    }
    public void SetCommercialBuilding(ICommercialBuilding commercialBuilding) {
        this.commercialBuilding = commercialBuilding;
    }; 

}