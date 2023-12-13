public abstract class Transport {
    public String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public abstract void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public abstract void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public abstract void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
