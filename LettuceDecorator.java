public class LettuceDecorator extends MexiFoodDecorator{
    public LettuceDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "lettuce, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.1;
    }
}
