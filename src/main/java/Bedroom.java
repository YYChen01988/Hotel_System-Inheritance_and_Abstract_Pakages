import java.util.ArrayList;

public class Bedroom extends Room {
    private int number;
    private BedRoomType type;
    private double pricePerNight;


    public Bedroom(int number, BedRoomType type,int capacity, double pricePerNight) {
        super(capacity);
        this.type = type;
        this.number = number;
        this.pricePerNight = pricePerNight;
    }

    public int getNumber() {
        return this.number;
    }

    public BedRoomType getType() {
        return this.type;
    }

    public double getPricePerNight() {
        return this.pricePerNight;
    }

    //checkout must be delcared in abstract or impelement abstract method
    public void checkOut(){
        getGuests().clear();
    }
}
