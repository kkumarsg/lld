package designpatterns.factory;

import designpatterns.factory.android.AndroidUIFactory;
import designpatterns.factory.ios.IosUIFactory;

public class App {

    public static void main(String[] args) {

        System.out.println("Page layout for android ");
        Flutter flutter = new Flutter(new AndroidUIFactory());
        flutter.pageLayout();

        System.out.println("Page layout for ios ");
        Flutter flutter1 = new Flutter(new IosUIFactory());
        flutter1.pageLayout();
    }
}
