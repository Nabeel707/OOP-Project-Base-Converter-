public class ConvertingEquations extends UserInputValidation {

    public static int binToDecResult = 0;
    public static int octToDecResult = 0;
    public static int hexToDecResult = 0;

    // Binary to octal Conversion Equation
    public static void binaryToOctal() {
        int power = 0;
        for (int i = binaryinput.length() - 1; i >= 0; i--) {
            if (binaryinput.charAt(i) == '1') {
                binToDecResult += Math.pow(2, power);
            }
            power++;
        }
        String octalResult = "";
        while (binToDecResult != 0) {
            int remainder = binToDecResult % 8;
            octalResult = remainder + octalResult;
            binToDecResult /= 8;
        }
        System.out.println(binaryinput + " In Octal is: " + octalResult);
    }

    // Binary to Decimal Conversion Equation
    public static void binaryToDecimal() {
        int power = 0;
        for (int i = binaryinput.length() - 1; i >= 0; i--) {
            if (binaryinput.charAt(i) == '1') {
                binToDecResult += Math.pow(2, power);
            }
            power++;
        }
        System.out.println(binaryinput + " In Decimal is: " + binToDecResult);
    }

    // Binary to HexDecimal Conversion Equation
    public static void binaryToHexDecimal() {
        int power = 0;
        for (int i = binaryinput.length() - 1; i >= 0; i--) {
            if (binaryinput.charAt(i) == '1') {
                binToDecResult += Math.pow(2, power);
            }
            power++;
        }
        String hexDecimalResult = "";
        while (binToDecResult != 0) {
            int remainder = binToDecResult % 16;
            char c;
            if (remainder < 10) {
                c = (char) (remainder + '0');
            } else {
                c = (char) (remainder - 10 + 'A');
            }
            hexDecimalResult = c + hexDecimalResult;
            binToDecResult /= 16;
        }
        System.out.println(binaryinput + " In HexDecimal is: " + hexDecimalResult);
    }

    // Octal To Binary Conversion Equation
    public static void octalToBinary() {
        int power = 0;
        for (int i = octalinput.length() - 1; i >= 0; i--) {
            char c = octalinput.charAt(i);
            int digit = c - '0';
            octToDecResult += (digit * (int) Math.pow(8, power));
            power++;
        }

        String binaryResult = "";
        while (octToDecResult > 0) {
            int remainder = octToDecResult % 2;
            binaryResult = remainder + binaryResult;
            octToDecResult /= 2;
        }
        System.out.println(octalinput + " In Binary is: " + binaryResult);
    }

    // Octal To Decimal Conversion Equation
    public static void octalToDecimal() {
        int power = 0;
        for (int i = octalinput.length() - 1; i >= 0; i--) {
            char c = octalinput.charAt(i);
            int digit = c - '0';
            octToDecResult += (digit * (int) Math.pow(8, power));
            power++;
        }

        System.out.println(octalinput + " In Decimal is: " + octToDecResult);

    }

    // Octal To HexDecimal Conversion Equation
    public static void octalToHexDecimal() {
        int power = 0;
        for (int i = octalinput.length() - 1; i >= 0; i--) {
            char c = octalinput.charAt(i);
            int digit = c - '0';
            octToDecResult += (digit * (int) Math.pow(8, power));
            power++;
        }

        String hexDecimalResult = "";
        while (octToDecResult != 0) {
            int remainder = octToDecResult % 16;
            char c;
            if (remainder < 10) {
                c = (char) (remainder + '0');
            } else {
                c = (char) (remainder - 10 + 'A');
            }
            hexDecimalResult = c + hexDecimalResult;
            octToDecResult /= 16;
        }
        System.out.println(octalinput + " In HexDecimal is: " + hexDecimalResult);
    }

    // Decimal To Binary Conversion Equation
    public static void decimalToBinary() {
        int decimalInputInteger = 0;
        int length = decimalinput.length();
        for (int i = 0; i < length; i++) {
            char c = decimalinput.charAt(i);
            int digit = c - '0';
            decimalInputInteger = decimalInputInteger * 10 + digit;
        }

        String binaryResult = "";
        while (decimalInputInteger > 0) {
            int remainder = decimalInputInteger % 2;
            binaryResult = remainder + binaryResult;
            decimalInputInteger /= 2;
        }
        System.out.println(decimalinput + " In Binary is: " + binaryResult);

    }

    // Decimal To Octal Conversion Equation
    public static void decimalToOctal() {
        int decimalInputInteger = 0;
        int length = decimalinput.length();
        for (int i = 0; i < length; i++) {
            char c = decimalinput.charAt(i);
            int digit = c - '0';
            decimalInputInteger = decimalInputInteger * 10 + digit;
        }
        String octalResult = "";
        while (decimalInputInteger > 0) {
            int remainder = decimalInputInteger % 8;
            octalResult = remainder + octalResult;
            decimalInputInteger /= 8;
        }
        System.out.println(decimalinput + " In Octal is: " + octalResult);

    }

    // Decimal To HexDecimal Conversion Equation
    public static void decimalToHex() {
        int decimalInputInteger = 0;
        int length = decimalinput.length();
        for (int i = 0; i < length; i++) {
            char c = decimalinput.charAt(i);
            int digit = c - '0';
            decimalInputInteger = decimalInputInteger * 10 + digit;
        }

        String hexDecimalResult = "";
        while (decimalInputInteger != 0) {
            int remainder = decimalInputInteger % 16;
            char c;
            if (remainder < 10) {
                c = (char) (remainder + '0');
            } else {
                c = (char) (remainder - 10 + 'A');
            }
            hexDecimalResult = c + hexDecimalResult;
            decimalInputInteger /= 16;
        }
        System.out.println(decimalinput + " In HexDecimal is: " + hexDecimalResult);
    }

    // HexDecimal To Binary Conversion Equation
    public static void hexToBinary() {
        int value = 0;
        int length = hexinput.length();
        for (int i = 0; i < length; i++) {
            char c = hexinput.charAt(i);
            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                value = c - 'A' + 10;
            }
            hexToDecResult = hexToDecResult * 16 + value;
        }

        String binaryResult = "";
        while (hexToDecResult > 0) {
            int remainder = hexToDecResult % 2;
            binaryResult = remainder + binaryResult;
            hexToDecResult /= 2;
        }
        System.out.println(hexinput + " In Binary is: " + binaryResult);
    }

    // HexDecimal To Octal Conversion Equation
    public static void hexToOctal() {
        int value = 0;
        int length = hexinput.length();
        for (int i = 0; i < length; i++) {
            char c = hexinput.charAt(i);
            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                value = c - 'A' + 10;
            }
            hexToDecResult = hexToDecResult * 16 + value;
        }

        String octalResult = "";
        while (hexToDecResult > 0) {
            int remainder = hexToDecResult % 8;
            octalResult = remainder + octalResult;
            hexToDecResult /= 8;
        }
        System.out.println(hexinput + " In Octal is: " + octalResult);

    }

    // HexDecimal To Decimal Conversion Equation
    public static void hexToDecimal() {
        int value = 0;
        int length = hexinput.length();
        for (int i = 0; i < length; i++) {
            char c = hexinput.charAt(i);
            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                value = c - 'A' + 10;
            }
            hexToDecResult = hexToDecResult * 16 + value;
        }
        System.out.println(hexinput + " In Decimal is: " + hexToDecResult);

    }
}
