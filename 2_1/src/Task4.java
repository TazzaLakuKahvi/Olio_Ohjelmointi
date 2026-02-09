public class Task4 {

    public static class CarDriver {
        public static void main(String[] args) {
            Task2.Car myCar;

            myCar = new Task2.Car("Toyota Corolla", 50, 180, 30, 180);
            myCar.fillTank();

            myCar.cruiseControlOnOff();
            myCar.cruiseControl(100);
            myCar.getTargetSpeed();
            myCar.cruiseControlOnOff();

            myCar.cruiseControlOnOff();
            myCar.cruiseControl(23);
        }
    }
}
