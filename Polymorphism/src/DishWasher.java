public class DishWasher extends SmartKitchen{
    private boolean hasWorkToDo;

    public DishWasher(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox, boolean hasWorkToDo) {
        super(brewMaster, dishWasher, iceBox);
        if(SmartKitchen.addWater()){
            hasWorkToDo = true;
        }else{
        this.hasWorkToDo = hasWorkToDo;}
    }

    doDishes()
}