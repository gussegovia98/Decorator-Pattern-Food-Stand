public class TofuDecorator extends MexiFoodDecorator {
    public TofuDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "tofu, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.3;
    }
}
