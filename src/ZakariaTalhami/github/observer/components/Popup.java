package ZakariaTalhami.github.observer.components;

import ZakariaTalhami.github.observer.publishers.IClickPublisher;
import ZakariaTalhami.github.observer.subscribers.IClickSubscriber;

public class Popup implements IClickSubscriber {
    IClickPublisher popupInvoker;
    Boolean isOpenState = false;
    String content;

    public Popup(String content) {
        this.content = content;
    }

    public Popup(IClickPublisher popupInvoker, String content) {
        this.content = content;
        this.setPopupInvoker(popupInvoker);
    }

    public void setPopupInvoker(IClickPublisher popupInvoker) {
        // Remove previous listener
        if (this.popupInvoker != null) {
            this.popupInvoker.removeClickListener(this);
        }
        // Add new listener
        this.popupInvoker = popupInvoker;
        this.popupInvoker.addClickListener(this);
    }

    public Boolean getOpenState() {
        return isOpenState;
    }

    @Override
    public void handleClickEvent() {
        this.isOpenState = !this.isOpenState;
        if (this.isOpenState) {
            System.out.println(String.format("\tClick Event: Popup %s has been opened.", this.content));
        } else {
            System.out.println(String.format("\tClick Event: Popup %s has been closed.", this.content));
        }
    }
}
