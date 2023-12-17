public abstract class MotorTransport extends Transport {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}


