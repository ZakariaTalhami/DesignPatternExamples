package ZakariaTalhami.github.observer.components;

import ZakariaTalhami.github.observer.publishers.IHoverPublisher;
import ZakariaTalhami.github.observer.subscribers.IHoverSubscriber;

public class Tooltip implements IHoverSubscriber {
    String content;
    IHoverPublisher visibilityInvoker;
    Boolean isVisible;

    public Tooltip(String content) {
        this.content = content;
    }

    public Tooltip(String content, IHoverPublisher visibilityInvoker) {
        this.content = content;
        this.setVisibilityInvoker(visibilityInvoker);
    }

    public void setVisibilityInvoker(IHoverPublisher visibilityInvoker) {
        if (this.visibilityInvoker != null ) {
            this.visibilityInvoker.removeHoverListener(this);
        }
        this.visibilityInvoker = visibilityInvoker;

        this.visibilityInvoker.addHoverListener(this);
    }

    public String getContent() {
        return content;
    }

    public Boolean getVisible() {
        return isVisible;
    }

    @Override
    public void handleHoverEvent(int x, int y) {
        this.isVisible = true;
        System.out.println(String.format("\tHover Event: Showing tooltip %s at (%d, %d).", this.content, x, y));
    }

    @Override
    public void handleHoverEndEvent() {
        this.isVisible = false;
        System.out.println(String.format("\tHover Event: Hiding tooltip %s.", this.content));
    }
}
