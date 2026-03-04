package Observer.Example;

public interface  ISubscriber {
    public String GetName();
    public void SetName(String name);
    public void Update(IPublisher publisher);
}
