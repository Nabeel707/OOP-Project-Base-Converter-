import java.util.Scanner;

public class ConversionType{
    private static Scanner x = new Scanner(System.in);
    protected static int userSelection;
    //printing the conversion types menu
    public static void conversionTypes() {
        System.out.println("1- Binary To Octal");
        System.out.println("2- Binary To Decimal");
        System.out.println("3- Binary To Hexdecimal");
        System.out.println("4- Octal To Binary");
        System.out.println("5- Octal To Decimal");
        System.out.println("6- Octal To Hexdecimal");
        System.out.println("7- Decimal To Binary");
        System.out.println("8- Decimal To Octal");
        System.out.println("9- Decimal To Hexdecimal");
        System.out.println("10- Hexdecimal To Binary");
        System.out.println("11- Hexdecimal To Octal");
        System.out.println("12- Hexdecimal To Decimal \n");
    }
    
    //user selecting from the menu
    public void userSelectionValue(){
        userSelection = x.nextInt();
    }
    
    public void userSelection(){
        boolean condition = false;
        int count = 0;
        out:
        while (condition == false && count < 3) {
        System.out.print("Select an Option: ");
        userSelectionValue();
        switch (userSelection){
        case 1:
        case 2:
        case 3:
            UserInputValidation.binaryValidation();
            condition = true;
            break out;
        case 4:
        case 5:
        case 6:
            UserInputValidation.octalValidation();
            condition = true;
            break out;
        case 7:
        case 8:
        case 9:
            UserInputValidation.decimalValidation();
            condition = true;
            break out;
        case 10:
        case 11:
        case 12:
            UserInputValidation.hexDecimalValidation();
            condition = true;
            break out;
        default:
            condition = false;
            System.out.println("Invalid Input, Try Numbers (0-12)");
            count++;
            System.out.println("");

        }
    }
    if (condition == false){
        System.out.println("You Have Used All 3 Attempts. Run The Program & Try Again");
    }
        x.close();
    }
}

