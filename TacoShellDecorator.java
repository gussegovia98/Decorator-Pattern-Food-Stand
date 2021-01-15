public class TacoShellDecorator extends MexiFoodDecorator{
    public TacoShellDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "taco shells, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 1.0;
    }
}
