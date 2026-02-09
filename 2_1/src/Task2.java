import org.w3c.dom.ls.LSOutput;

public class Task2 {

    static class Car {
        private double speed;
        private double maxSpeed;
        private double gasolineLevel;
        private double gasolineCapacity;
        private double cruiseControlMin;
        private double cruiseControlMax;
        private boolean isOn;
        private double targetSpeed;
        private String typeName;

        public Car(String typeName, double gasolineCapacity, double maxSpeed,
                   double cruiseControlMin, double cruiseControlMax) {
            speed = 0;
            gasolineLevel = 0;
            this.typeName = typeName;
            this.isOn = false;
            this.gasolineCapacity = gasolineCapacity;
            this.maxSpeed = maxSpeed;
            this.cruiseControlMin = cruiseControlMin;
            this.cruiseControlMax = cruiseControlMax;
        }

        void accelerate() {
            if (gasolineLevel > 0 && speed <= maxSpeed - 10)
                speed += 10;
            else if (gasolineLevel > 0)
                speed = maxSpeed;
            else
                speed = 0;
        }

        void decelerate(double amount) {
            if (gasolineLevel > 0) {
                if (amount > 0)
                    speed = Math.max(0, speed - amount);
            } else
                speed = 0;
        }

        double getSpeed() {
            return speed;
        }

        String getTypeName() {
            return typeName;
        }

        void fillTank() {
            gasolineLevel = gasolineCapacity;
        }

        double getGasolineLevel() {
            return gasolineLevel;
        }

        void cruiseControlOnOff() {
            if (!isOn) {
                isOn = true;
                System.out.println("Cruise control is on.");
            }
            else if (isOn) {
                isOn = false;
                System.out.println("Cruise control is off.");
            }
        }

        boolean cruiseControlCheck(double value) {
            if (value >= cruiseControlMin && value <= cruiseControlMax) {
                return true;
            } else return false;
        }

        double TargetSpeed() {
            return targetSpeed;
        }

        void getTargetSpeed() {
            System.out.println("Target speed is: " + targetSpeed + " km/h");
        }

        void cruiseControl(double newCcSpeed) {
            targetSpeed = newCcSpeed;
            if (isOn) {
                if (cruiseControlCheck(newCcSpeed)) {
                    while (Math.abs(getSpeed() - newCcSpeed) >= 10) {
                        if (getSpeed() < newCcSpeed) {
                            accelerate();
                            System.out.println("Target speed is: " + TargetSpeed() + " km/h\n" +
                                    getTypeName() + ": speed is " + getSpeed() + " km/h");
                        }
                        if (getSpeed() > newCcSpeed) {
                            decelerate(newCcSpeed);
                            System.out.println("Target speed is: " + TargetSpeed() + " km/h\n" +
                                    getTypeName() + ": speed is " + getSpeed() + " km/h");
                        }
                    }
                    if (Math.abs(getSpeed() - newCcSpeed) <= 10 && getSpeed() != newCcSpeed) {
                        speed = newCcSpeed;
                        System.out.println("Target speed is: " + TargetSpeed() + " km/h\n" +
                                getTypeName() + ": speed is " + getSpeed() + " km/h");
                    }
                } else if (!cruiseControlCheck(newCcSpeed)) {
                    isOn = false;
                    System.out.println("Target speed " + TargetSpeed() + " is not possible.\nCruise Control has been turned off.");
                }
            } else {
                System.out.println("Cruise control is off.\nPlease, turn on cruise control before adjusting target speed.");
            }
        }
    }
}
