package ch.heigvd.res.lab00;

public class Flute implements IInstrument {
    public String play() {
        return "Tut";
    }
    
    public int getSoundVolume() {
        return 5;
    }
    
    public String getColor() {
        return "brown";
    }
}