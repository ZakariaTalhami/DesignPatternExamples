package ZakariaTalhami.github.observer.publishers;

import ZakariaTalhami.github.observer.subscribers.IClickSubscriber;

public interface IClickPublisher {
    void publishClickEvent();
    void addClickListener(IClickSubscriber subscribers);
    void removeClickListener(IClickSubscriber subscribers);
}
