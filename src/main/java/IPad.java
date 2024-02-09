public class IPad implements Tablet{
    @Override
    public String getDescription() {
        return "Apple";
    }

    @Override
    public int getWeight() {
        return 1000;
    }

    @Override
    public boolean isTouchable() {
        return true;
    }
}
