package Observer.Example;


import java.util.HashMap;
import java.util.Map;

public class TaxSubscriber implements ISubscriber{
    private String name;
    private HashMap<String,Float> payments;
    private final Float taxRate = (float) 52.5; 

    public TaxSubscriber(String name) {
        this.name = name;
        this.payments = new HashMap<>();
    }

    private void AddPayement(String id, Float price) {
        if(this.payments.containsKey(id)) this.payments.remove(id);
        Float finalPrice = price * (1*taxRate / 100);
        this.payments.put(id, finalPrice);
    }

    public void ShowTerminal() {
        if(this.payments.isEmpty()){
            System.out.println(this.name + " n'a encore taxé personne");
        }
        else {
            System.out.println(this.name + " a calculé les taxes de ");
            for( Map.Entry<String,Float> payment : this.payments.entrySet()){
                System.out.println(payment.getKey() + " Valeur : "+ payment.getValue() +" euros");
            }
        }
    }

    @Override
    public String GetName() {
        return name;
    }
    @Override
    public void SetName(String name) {
        this.name = name;
    }

    @Override
    public void Update(IPublisher publisher) {
        if(publisher instanceof GaragePublisher garagePublisher){
            AddPayement(publisher.GetId(), garagePublisher.getValue());
        }
    }
}
