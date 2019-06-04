public class Stadium {

    private int viewers;
    private String name;
    private int lightning;
    private String city;
    private int diameter;
    static private int area;
    protected int seats;
    protected int VIPlounge;

    public String getCitycity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Stadium() {
    }

    public Stadium(int viewers, String name, int lightning, String city) {
        this.viewers = viewers;
        this.name = name;
        this.lightning = lightning;
        this.city = city;
    }

    public Stadium(int viewers, String name, int lightning, String city, int diameter, int area, int seats, int VIPlounge) {
        this(viewers, name, lightning, city);
        this.diameter = diameter;
        this.area = area;
        this.seats = seats;
        this.VIPlounge = VIPlounge;
    }

    public String toString() {
        return viewers + " " + name + " " + lightning + " " + city + " " + diameter + " " + area + " " + seats + " " + VIPlounge;
    }

    public void printArea() {
        System.out.println(area);
    }

    public void printStaticArea() {
        System.out.println(area);
    }

    public void resetValues(int viewers, String name, int lightning, String city, int diameter, int area, int seats, int VIP_lounge) {
        this.viewers = viewers;
        this.name = name;
        this.lightning = lightning;
        this.city = city;
        this.diameter = diameter;
        this.area = area;
        this.seats = seats;
        this.VIPlounge = VIPlounge;

    }
}

