public class SourCreamDecorator extends MexiFoodDecorator {
    public SourCreamDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "sour cream, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.1;
    }
}
