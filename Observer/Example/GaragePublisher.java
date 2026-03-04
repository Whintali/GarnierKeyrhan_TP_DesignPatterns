package Observer.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GaragePublisher implements IPublisher {
    private String name;
    private String id;
    private Float value;
    private List<ISubscriber> subcribers;

    public GaragePublisher(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.subcribers = new ArrayList<ISubscriber>();
    }
    private GaragePublisher(){}

    @Override
    public String GetId() {
        return id;
    }
    @Override
    public void Subscribe(ISubscriber subscriber) {
        this.subcribers.add(subscriber);
    }

    @Override
    public void Unsubscribe(ISubscriber subscriber) {
        if(this.subcribers.contains(subscriber)) {
            this.subcribers.remove(subscriber);
        }
        else {
            System.out.println("Erreur ce Subcriber "+ subscriber.GetName() +" n'est pas abonné au Publisher "+ this.id );
        }
    }

    @Override
    public void Notify() {
        for(ISubscriber subscriber : subcribers) {
            subscriber.Update(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        Notify();
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
        Notify();
    }
}
