public class X3pro extends Poco {
    Poco poco = new Poco();

    @Override
    public double getBattery() {
        return 5160;
    }

    @Override
    public int getWeight() {
        return 215 ;
    }

    @Override
    public String getSpeaker() {
        return "dual stereo";
    }

    public static void main(String[] args) {
        Poco poco = new Poco();
        System.out.println(poco.getBattery()+poco.getWeight()+poco.getSpeaker());

    }
}
