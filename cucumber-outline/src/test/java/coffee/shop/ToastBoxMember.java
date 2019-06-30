package coffee.shop;

public class ToastBoxMember {
    private String name;
    private StampCard stampCard;
    private int points;

    public ToastBoxMember(String name, StampCard stampCard) {
        this.name = name;
        this.stampCard = stampCard;
    }

    public void orders(Integer amount, String drink) {
        points += stampCard.getPointsFor(drink) * amount;
    }

    public int getPoints() {
        return points;
    }
}
