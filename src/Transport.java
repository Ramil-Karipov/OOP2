public abstract class Transport implements Service {
    public String modelName;
    public static int wheelsCount;

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

    @Override
    public void check() {
        System.out.println("Обслуживаем " + wheelsCount);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;


    }
}




