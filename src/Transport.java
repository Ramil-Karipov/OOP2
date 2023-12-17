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
    public abstract void check() {
        (Transport != null) {
            System.out.println("Обслуживаем " + Transport.wheelsCount());
            for (int i = 0; i < Transport.wheelsCount(); i++) {
                WheeledTransport.updateTyre();
            }
        }
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;


    }
}




