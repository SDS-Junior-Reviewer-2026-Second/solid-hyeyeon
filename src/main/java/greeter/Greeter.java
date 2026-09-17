package greeter;

public class Greeter {
    BasicMode mode;

    Greeter(){
        mode = new BasicMode();
    }

    public String greet() {
        return mode.greet();
    }

    public void setFormality(BasicMode mode) {
        this.mode = mode;
    }
}