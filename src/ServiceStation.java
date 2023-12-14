public class ServiceStation implements Service {
    @Override
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                WheeledTransport.updateTyre();
                MotorTransport.checkEngine();
            }
        } else if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                WheeledTransport.updateTyre();
            }
            MotorTransport.checkEngine();
            Truck.checkTrailer();
        } else if (transport != null) {
            System.out.println("Обслуживаем " + transport.getWheelsCount());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                WheeledTransport.updateTyre();
            }
        }
    }
}



