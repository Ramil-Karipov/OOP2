public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Велосипед", 2);
        Bicycle bicycle2 = new Bicycle("Велосипед1", 2);
        Car car = new Car("Автомобить", 4);
        Car car2 = new Car("Автомобиль1", 4);
        Truck truck = new Truck("Грузовик", 6);
        Truck truck2 = new Truck("Грузовик1", 6);

        Service station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}

