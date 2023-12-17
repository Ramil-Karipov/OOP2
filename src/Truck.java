public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
    }

    public static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
