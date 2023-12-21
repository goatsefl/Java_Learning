public class Refrigerator extends SmartKitchen{
    private boolean hasWorkToDo;

    public Refrigerator(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox,boolean hasWorkToDo) {
        super(brewMaster,dishWasher,iceBox);
        if (pourMilk()) {
            this.hasWorkToDo = true;
        }
    }

    orderFood()
}