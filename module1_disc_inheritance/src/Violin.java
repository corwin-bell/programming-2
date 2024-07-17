// define as concrete class since Violin is an actual instrument we can declare
public class Violin extends StringInstrument{
    private String maker;

    public Violin() {
        name = "Violin";
        numStrings = 4;
        maker = "unknown";

    }

    public Violin (String name, int numStrings, String maker) {
        this.name = name;
        this.numStrings = numStrings;
        this.maker = maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
    public String getMaker() {
        return maker;
    }

    // user override again to include violin-specific fields
    @Override
    public void printInfo() {
        System.out.println("Name: " + name + ", Number of Strings: " + numStrings + ", Maker: " + maker);
    }
}
