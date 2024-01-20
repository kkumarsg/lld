package designpatterns.factory.ios;

import designpatterns.factory.Button;
import designpatterns.factory.Menu;
import designpatterns.factory.UIFactory;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
