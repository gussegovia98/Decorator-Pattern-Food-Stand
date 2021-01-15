public class ChickenDecorator extends MexiFoodDecorator{
    public ChickenDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "chicken, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.2;
    }
}
