package corejava.part2.abstractClasses.templateMethod;

public class TemplateMethodPattern {

    static void main(String[] args) {
        Drink tea = new Tea();

        tea.makeDrink();
    }














}


abstract class Drink {

    final void makeDrink() {
        boilWater();
        addMainItem();
        pourIntoCup();
        addExtra();
    }

    public abstract void boilWater();

    public abstract void addMainItem();

    public abstract void pourIntoCup();

    public abstract void addExtra();

}

class  Tea extends  Drink {

    @Override
    public void boilWater() {
        System.out.println("Boiling the water");
    }

    @Override
    public void addMainItem() {
        System.out.println("Adding sugar");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Pouring into cup");
    }

    @Override
    public void addExtra() {
        System.out.println("Adding extra");
    }
}