package house;

public class PenthouseSuite extends Apartment {
    public PenthouseSuite() {
        this.numberOfBedrooms = 4;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

    public void upgrade() {
        this.squareFootage += 40;
        this.numberOfBedrooms += 1;
    }

}