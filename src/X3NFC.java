public class X3NFC extends Poco {
    Poco poco = new Poco();

    @Override
    public double getBattery() {
        return 5160;
    }

    @Override
    public int getWeight() {
        return 250 ;
    }

    @Override
    public String getSpeaker() {
        return "Stereo";
    }

    public static void main(String[] args) {
        Poco poco = new Poco();
        System.out.println(poco.getBattery()+poco.getWeight()+poco.getSpeaker());

    }
}
