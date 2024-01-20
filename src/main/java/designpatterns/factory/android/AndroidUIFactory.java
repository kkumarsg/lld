package designpatterns.factory.android;

import designpatterns.factory.Button;
import designpatterns.factory.Menu;
import designpatterns.factory.UIFactory;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
