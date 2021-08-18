package ZakariaTalhami.github.observer.components;

import ZakariaTalhami.github.observer.IButton;
import ZakariaTalhami.github.observer.publishers.IClickPublisher;
import ZakariaTalhami.github.observer.publishers.IHoverPublisher;
import ZakariaTalhami.github.observer.subscribers.IClickSubscriber;
import ZakariaTalhami.github.observer.subscribers.IHoverSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Button implements IClickPublisher, IButton, IHoverPublisher {
    List<IClickSubscriber> clickSubscribersList = new ArrayList<>();
    List<IHoverSubscriber> hoverSubscribersList = new ArrayList<>();

    @Override
    public void click() {
        System.out.println("Button Clicked.");
        publishClickEvent();
    }

    @Override
    public void hover(int x, int y) {
        System.out.println(String.format("Button hovered at (%d, %d).", x, y));
        publishHoverEvent(x, y);
    }

    @Override
    public void endHover() {
        System.out.println("Button hover ended.");
        publishHoverEndEvent();
    }

    @Override
    public void publishClickEvent() {
        for (IClickSubscriber subscriber :
                clickSubscribersList) {
            subscriber.handleClickEvent();
        }
    }

    @Override
    public void addClickListener(IClickSubscriber subscribers) {
        clickSubscribersList.add(subscribers);
    }

    @Override
    public void removeClickListener(IClickSubscriber subscribers) {
        clickSubscribersList.remove(subscribers);
    }

    @Override
    public void publishHoverEvent(int x, int y) {
        for (IHoverSubscriber subscriber :
                hoverSubscribersList) {
            subscriber.handleHoverEvent(x, y);
        }
    }

    @Override
    public void publishHoverEndEvent() {
        for (IHoverSubscriber subscriber :
                hoverSubscribersList) {
            subscriber.handleHoverEndEvent();
        }
    }

    @Override
    public void addHoverListener(IHoverSubscriber subscribers) {
        hoverSubscribersList.add(subscribers);
    }

    @Override
    public void removeHoverListener(IHoverSubscriber subscribers) {
        hoverSubscribersList.remove(subscribers);
    }
}
