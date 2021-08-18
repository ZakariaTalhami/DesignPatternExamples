package ZakariaTalhami.github.observer;

import ZakariaTalhami.github.observer.components.Button;
import ZakariaTalhami.github.observer.components.Popup;
import ZakariaTalhami.github.observer.components.Tooltip;

public class Main {
    public static void main(String[] args) {
        Button openFormButton = new Button();
        Popup formPopup = new Popup("formPopup");
        Popup warningPopup = new Popup("warningPopup");
        Tooltip buttonTooltip = new Tooltip("Open Form");


        formPopup.setPopupInvoker(openFormButton);
        warningPopup.setPopupInvoker(openFormButton);
        buttonTooltip.setVisibilityInvoker(openFormButton);

        for (int i = 0; i < 5; i++) {
            openFormButton.hover(i, i);
            openFormButton.click();
            openFormButton.endHover();
        }
    }
}
