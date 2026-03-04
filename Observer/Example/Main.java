package Observer.Example;
public class Main {
    public static void main(String[] args){
       GaragePublisher garagePublisher = new GaragePublisher("salut");
       TaxSubscriber taxSubscriber = new TaxSubscriber("URSSAF");
       garagePublisher.Subscribe(taxSubscriber);
       System.out.println("Premier Passage");
       taxSubscriber.ShowTerminal();
       garagePublisher.setValue((float) 5822222.415);
       System.out.println("Deuxième Passage");
       taxSubscriber.ShowTerminal();
    }
}