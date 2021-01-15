public class CheeseDecorator extends MexiFoodDecorator{
    public CheeseDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "cheese decorator, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.2;
    }
}
