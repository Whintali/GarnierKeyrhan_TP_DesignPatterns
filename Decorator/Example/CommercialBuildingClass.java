package Decorator.Example;

public class CommercialBuildingClass implements ICommercialBuilding {
    private String name;

    public CommercialBuildingClass(String name){
        this.name = name;
    }

    @Override
    public void vendre() {
        System.out.println("Je vends un service !");
    }

    @Override
    public void achat() {
        System.out.println("J'achète des matières premières !");
    } 
}
