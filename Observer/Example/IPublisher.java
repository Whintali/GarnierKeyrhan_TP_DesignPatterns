package Observer.Example;
public interface IPublisher {
    public String GetId();
    public void Subscribe(ISubscriber subscriber);
    public void Unsubscribe(ISubscriber subscriber);
    public void Notify();
}
