public class QuesoDecorator extends MexiFoodDecorator {
    public QuesoDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "queso ,";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.1;
    }
}
