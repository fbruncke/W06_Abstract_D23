import java.io.Serializable;

public class Keyboard implements Product {
    @Override
    public String getDescription() {
        return "Keyboard";
    }

    @Override
    public int getWeight() {
        return 300;
    }


}
