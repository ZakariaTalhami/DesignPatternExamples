package ZakariaTalhami.github.observer.publishers;


import ZakariaTalhami.github.observer.subscribers.IHoverSubscriber;

public interface IHoverPublisher {
    void publishHoverEvent(int x, int y);
    void publishHoverEndEvent();
    void addHoverListener(IHoverSubscriber subscribers);
    void removeHoverListener(IHoverSubscriber subscribers);
}
