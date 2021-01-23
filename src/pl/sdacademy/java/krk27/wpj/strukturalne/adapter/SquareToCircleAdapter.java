package pl.sdacademy.java.krk27.wpj.strukturalne.adapter;

public class SquareToCircleAdapter implements ICircle {

    private Square square;

    public SquareToCircleAdapter(Square square) {
        this.square = square;
    }

    @Override
    public float getRadius() {
        return square.getA() * (float)Math.sqrt(2) / 2f;
    }
}
