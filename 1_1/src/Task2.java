public class Task2 {

    public static void main(String[] args) {
        int printAmount = 4;                    //the amount of lines that will be printed
        int paddingAmount = printAmount + 1;    //the amount of space required in order to keep the text aligned
        String starSymbol = "*";                //pretty self-explanatory, but this is the symbol that will be printed

        for (int i = 0; i < printAmount; i++) {

            //prints the text while adding spaces to the left
            System.out.printf("%" + paddingAmount + "s%n", starSymbol);

            //increases the amount of symbols printed by 2
            //the line below that increases spaces by 1, to keep the next line aligned correctly
            starSymbol = starSymbol + "**";
            paddingAmount++;
        }
    }
}
