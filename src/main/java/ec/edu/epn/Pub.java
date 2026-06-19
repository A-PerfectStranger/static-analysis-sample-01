package ec.edu.epn;

public class Pub {
    public static final String ONE_BEER = "hansa";
    public static final String ONE_CIDER = "grans";
    public static final String A_PROPER_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";

    private static final int UNIT_OF_RUM = 65;
    private static final int UNIT_OF_GRENADINE = 10;
    private static final int UNIT_OF_LIME = 10;
    private static final int UNIT_OF_GREEN_STUFF = 10;
    private static final int UNIT_OF_TONIC_WATER = 20;
    private static final int UNIT_OF_GIN = 85;

    public int computeCost(String drink, boolean student, int amount) {

        if (amount > 2 && (drink == GT || drink == BACARDI_SPECIAL)) {
            throw new IllegalArgumentException("Too many drinks, max 2.");
        }
        int price;
        if (drink.equals(ONE_BEER)) {
            price = 74;
        }
        else if (drink.equals(ONE_CIDER)) {
            price = 103;
        }
        else if (drink.equals(A_PROPER_CIDER)) price = 110;
        else if (drink.equals(GT)) {
            price = UNIT_OF_GIN + UNIT_OF_TONIC_WATER + UNIT_OF_GREEN_STUFF;
        }
        else if (drink.equals(BACARDI_SPECIAL)) {
            price = UNIT_OF_GIN/2 + UNIT_OF_RUM + UNIT_OF_GRENADINE + UNIT_OF_LIME;
        }
        else {
            throw new IllegalArgumentException("No such drink exists");
        }
        if (student && (ONE_CIDER.equals(drink) || ONE_BEER.equals(drink) || A_PROPER_CIDER.equals(drink))) {
            price = price - price/10;
        }
        return price*amount;
    }
}
