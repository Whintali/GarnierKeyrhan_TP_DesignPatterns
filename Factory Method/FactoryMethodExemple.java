public class FactoryMethodExemple {

    interface BuildingInterface {
    } 
    public static class GarageBuilding implements BuildingInterface{ }
    public static class OfficeBuilding implements BuildingInterface{}
    public static class SchoolBuilding implements BuildingInterface{}
    public static class ResidentialBuilding implements BuildingInterface{}
    
    public static class BuildingFactory {
        static BuildingInterface Create(String type) {
            BuildingInterface result = null;
            try {
                String typeWithMajFirst = type.substring(0, 1).toUpperCase() + type.substring(1) + "Building";
                Class<?> class1 = Class.forName("FactoryMethodExemple$" + typeWithMajFirst);
                result = (BuildingInterface) class1.getDeclaredConstructor().newInstance() ;
            }
            catch (Exception exception) {
                System.out.println("Erreur : "+ exception);
            }
            return result;
        }
    }
    public static void main(String[] args) {
        GarageBuilding garage1 = (GarageBuilding) BuildingFactory.Create("garage");
        OfficeBuilding office1 = (OfficeBuilding) BuildingFactory.Create("office");
        SchoolBuilding school1 = (SchoolBuilding) BuildingFactory.Create("school");
        ResidentialBuilding resident1 = (ResidentialBuilding) BuildingFactory.Create("residential");
        System.out.println(garage1.getClass());
        System.out.println(office1.getClass());
        System.out.println(school1.getClass());
        System.out.println(resident1.getClass());
    }
}
