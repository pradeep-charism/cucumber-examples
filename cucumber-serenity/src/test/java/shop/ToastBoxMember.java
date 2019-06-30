package shop;

public class ToastBoxMember {
    private String name;
    private StampCard schema;
    private int points;

    public ToastBoxMember(String name, StampCard schema) {
        this.name = name;
        this.schema = schema;
    }

    public void orders(Integer amount, String drink) {
        points += schema.getPointsFor(drink) * amount;
    }

    public int getPoints() {
        return points;
    }
}
