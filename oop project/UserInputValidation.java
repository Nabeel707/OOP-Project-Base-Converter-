import java.util.Scanner;

public class UserInputValidation extends ConversionType {
    private static Scanner x = new Scanner(System.in);
    protected static String binaryinput;
    protected static String octalinput;
    protected static String decimalinput;
    protected static String hexinput;
    static boolean condition;

    // Asking for a binary number from the user & checking if its correct. if its not correct the user has 3 chances to enter a number
    public static void binaryValidation() {
        int count = 0;
        while (condition == false && count < 3) {
            System.out.println("Enter a Binary Number: ");
            binaryinput = x.nextLine();
            for (int i = binaryinput.length() - 1; i >= 0; i--) {
                char c = binaryinput.charAt(i);
                int digit = c - '0';
                if (digit == 0 || digit == 1) {
                    condition = true;
                } else {
                    condition = false;
                    System.out.println("");
                    System.out.println("Invalid Entry, Only Enter Numbers 0 & 1");
                    count++;
                    System.out.println("");
                    break;
                }
            }
        }
        if (condition == true) {
            switch (userSelection) {
                case 1:
                    ConvertingEquations.binaryToOctal();
                    break;
                case 2:
                    ConvertingEquations.binaryToDecimal();
                    break;
                case 3:
                    ConvertingEquations.binaryToHexDecimal();
                    break;
            }
        } else {
            System.out.println("You Have Used All 3 Attempts. Run The Program & Try Again");
        }
    }

    //Asking the user for a octal number and checking if its correct if its not correct the user has 3 chances to enter a number
    public static void octalValidation() {
        int count = 0;
        while (condition == false && count < 3) {
            System.out.println("Enter a Octal Number: ");
            octalinput = x.nextLine();
            for (int i = octalinput.length() - 1; i >= 0; i--) {
                char c = octalinput.charAt(i);
                int digit = c - '0';
                if (digit >= 0 && digit <= 7) {
                    condition = true;
                } else {
                    condition = false;
                    System.out.println("");
                    System.out.println("Invalid Octal Number, Only Use The Numbers 0 - 7");
                    count++;
                    System.out.println("");
                    break;
                }
            }
        }
        if (condition == true) {
            switch (userSelection) {
                case 4:
                    ConvertingEquations.octalToBinary();
                    break;

                case 5:
                    ConvertingEquations.octalToDecimal();
                    break;

                case 6:
                    ConvertingEquations.octalToHexDecimal();
                    break;
            }
        } else {
            System.out.println("You Have Used All 3 Attempts. Run The Program & Try Again");
        }
    }

    
    //Asking the user for a decimal number and checking if its correct if its not correct the user has 3 chances to enter a number
    public static void decimalValidation() {
        int count = 0;
        while (condition == false && count < 3) {
            System.out.println("Enter a Decimal Number: ");
            decimalinput = x.nextLine();
            for (int i = decimalinput.length() - 1; i >= 0; i--) {
                char c = decimalinput.charAt(i);
                int digit = c - '0';
                if (digit >= 0 && digit <= 9) {
                    condition = true;

                } else {
                    condition = false;
                    System.out.println("");
                    System.out.println("Invalid Decimal Number, Only Use The Numbers 0 - 9");
                    count++;
                    System.out.println("");
                    break;
                }
            }
        }
        if (condition == true) {
            switch (userSelection) {
                case 7:
                    ConvertingEquations.decimalToBinary();
                    break;

                case 8:
                    ConvertingEquations.decimalToOctal();
                    break;

                case 9:
                    ConvertingEquations.decimalToHex();
                    break;
            }
        } else {
            System.out.println("You Have Used All 3 Attempts. Run The Program & Try Again");
        }
    }

    
    //Asking the user for a hexdecimal number and checking if its correct if its not correct the user has 3 chances to enter a number
    public static void hexDecimalValidation() {
        int count = 0;
        while (condition == false && count < 3) {
            System.out.println("Enter a HexDecimal Number: ");
            hexinput = x.nextLine();
            hexinput = hexinput.toUpperCase();
            for (int i = hexinput.length() - 1; i >= 0; i--) {
                char c = hexinput.charAt(i);
                if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F')) {
                    condition = true;
                } else {
                    condition = false;
                    System.out.println("");
                    System.out.println("Invalid Hexdecimal Number, Only Use The Numbers 0 - 9 & Letters A - F");
                    count++;
                    System.out.println("");
                    break;
                }
            }
        }
        if (condition == true) {
            switch (userSelection) {
                case 10:
                    ConvertingEquations.hexToBinary();
                    break;

                case 11:
                    ConvertingEquations.hexToOctal();
                    break;

                case 12:
                    ConvertingEquations.hexToDecimal();
                    break;

            }
        } else {
            System.out.println("You Have Used All 3 Attempts. Run The Program & Try Again");
        }
        x.close();
    }

}
