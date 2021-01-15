public class WhiteRiceDecorator extends MexiFoodDecorator{
    public WhiteRiceDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "white rice, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.1;
    }
}
