public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Велосипед", 2);
        Bicycle bicycle2 = new Bicycle("Велосипед1", 2);
        Car car = new Car("Автомобиль", 4);
        Car car2 = new Car("Автомобиль1", 4);
        Truck truck = new Truck("Грузовик", 6);
        Truck truck2 = new Truck("Грузовик1", 6);


        Transport[] transport1 = new Transport[]{bicycle, bicycle2, car, car2, truck, truck2};
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(transport1);

    }

}


