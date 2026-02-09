public class Task3 {

    static class CoffeeMaker {
        private boolean isOn;
        private String coffeeType;
        private int coffeeAmount;

        public CoffeeMaker() {
            isOn = false;
            coffeeType = "normal";
            coffeeAmount = 10;
        }

        boolean isOn() {
            return isOn;
        }

        void pressOnOff() {
            if (this.isOn)  {
                isOn = false;
            }
            else if (!this.isOn) {
                isOn = true;
            }
        }

        String getCoffeeType() {
            return coffeeType;
        }

        void setCoffeeType() {
            if (this.coffeeType.equals("normal")) {
                coffeeType = "espresso";
            }
            else if (this.coffeeType.equals("espresso")) {
                coffeeType = "normal";
            }
        }

        int getCoffeeAmount() {
            return coffeeAmount;
        }

        void setCoffeeAmount(int coffeeAmount) {
            if (coffeeAmount > 10 && coffeeAmount < 80) {
                this.coffeeAmount = coffeeAmount;
            }
            else if (coffeeAmount > 80) {
                this.coffeeAmount = 80;
            }
            else if (coffeeAmount < 10) {
                this.coffeeAmount = 10;
            }
        }
    }

    static class CoffeeMakerDriver {

        void runCoffeeMaker() {
            int evenOdd = (int) (Math.random() * 2 + 1);
            int coffeeAmount = (int) (Math.random() * 10);
            CoffeeMaker coffeeMaker = new CoffeeMaker();

            coffeeMaker.pressOnOff();
            System.out.println("Coffee maker is on");

            for (int i = 1; i <= evenOdd; i++) {
                coffeeMaker.setCoffeeType();
            }
            System.out.println("Coffee type is " + coffeeMaker.getCoffeeType());

            coffeeMaker.setCoffeeAmount(coffeeAmount * 10);
            System.out.printf("Coffee amount is %1$d ml\n", coffeeMaker.getCoffeeAmount());
            System.out.print("Coffee maker is off");
        }
    }

    public static void main(String[] args) {
        CoffeeMakerDriver coffeemakerDriver= new CoffeeMakerDriver();
        coffeemakerDriver.runCoffeeMaker();
    }
}
