package designpatterns.factory;

public class Flutter {

    UIFactory uiFactory;

    public Flutter(UIFactory uiFactory) {
        this.uiFactory = uiFactory;
    }

    public void setTheme(){
        System.out.println("Setting theme ");
    }

    public void refreshRate(){
        System.out.println("refresh rate changed ");
    }

    public void pageLayout(){
        Button button = uiFactory.createButton();
        System.out.println("button = " + button.getClass());

        Menu menu = uiFactory.createMenu();
        System.out.println("menu = " + menu.getClass());
    }
}
