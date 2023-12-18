public class ServiceStation {
    public void check(Transport[] transport1) {
        for (Transport transport : transport1) {
            System.out.println(transport.getModelName());
            transport.check();
            System.out.println();
        }

    }
}








