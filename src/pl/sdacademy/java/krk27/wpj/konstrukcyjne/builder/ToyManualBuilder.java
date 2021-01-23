package pl.sdacademy.java.krk27.wpj.konstrukcyjne.builder;

public class ToyManualBuilder extends BaseToyBuilder<ToyManualBuilder, String> {

    @Override
    public String build() {
        /*return "ToyManualBuilder{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", madeOf='" + madeOf + '\'' +
                ", minAge=" + minAge +
                ", color=" + color +
                '}';*/
        return "ToyManualBuilder{" +
                "name='" + object.getName() + '\'' +
                ", type='" + object.getType() + '\'' +
                ", madeOf='" + object.getMadeOf() + '\'' +
                ", minAge=" + object.getMinAge() +
                ", color=" + object.getColor() +
                '}';
    }
}
