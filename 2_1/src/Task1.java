public class Task1 {

     static class Television {
        private int channel;
        private boolean isOn;

        public Television() {
            this.channel = 1;
            this.isOn = false;
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

        int getChannel() {
            return channel;
        }

        void setChannel(int channel) {
            if (this.channel != 9)
                this.channel = channel % 10;
            else
                this.channel = 10;
        }
    }

    public static void main(String[] args) {
        Television myTV = new Television();
        myTV.setChannel(1);

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            boolean tired = false;

            if (!myTV.isOn())
                myTV.pressOnOff();

            while (!tired) {
                System.out.println("Watching channel " + myTV.getChannel());
                myTV.setChannel(myTV.getChannel() + 1);
                if (myTV.getChannel() % 4 == 0)
                    tired = true;
            }

            myTV.pressOnOff();

            System.out.println("Falling asleep");
        }
    }
}
