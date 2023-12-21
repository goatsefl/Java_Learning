public class CoffeeMaker extends SmartKitchen{
    private boolean hasWorkToDo = true;

    public CoffeeMaker(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox, boolean hasWorkToDo) {
        super(brewMaster, dishWasher, iceBox);
        this.hasWorkToDo = hasWorkToDo;
        }
    }

    public boolean brewCoffee(){

    }
}