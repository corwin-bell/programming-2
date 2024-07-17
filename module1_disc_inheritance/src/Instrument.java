// define Instrument as abstract since there are child instrument 
// categories but not generic instruments
public abstract class Instrument {
    protected String name;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
    }
}
