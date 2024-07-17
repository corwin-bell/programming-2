// again define StringInstrument as abstract since we need 
// to declare specific types of stringed instruments
public abstract class StringInstrument extends Instrument {
    protected int numStrings;

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
    public int getNumStrings() {
        return numStrings;
    }

    // use override to include specific string instrument fields
    @Override
    public void printInfo() {
        System.out.println("Name: " + name + ", Number of Strings: " + numStrings);
    }
}
