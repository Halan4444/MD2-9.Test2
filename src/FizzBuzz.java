public class FizzBuzz {
    public static String inputNumber (int number) {
        if (number>0) {
            if (number%3==0) {
                if (number%5 == 0) {
                    return "FizzBuzz";
                }
                return "Fizz";
            } else if (number%5==0) {
                return "Buzz";
            } else {
                return number + " ";
            }
        } return number + " ";
    }

    public static String hangDonVi (int number){
        switch (number) {
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            case 5:
                return "Năm";
            case 6:
                return "Sáu";
            case 7:
                return "Bảy";
            case 8:
                return "Tám";
            case 9:
                return "Chín";
            default:
                return "";
        }

    } public static String hangChuc (int number){
        switch (number) {
            case 1:
                return "Mười";
            case 2:
                return "Hai Mươi";

            case 3:
                return "Ba Mươi";
            case 4:
                return "Bốn Mươi";

            case 5:
                return "Năm Mươi";

            case 6:
                return "Sáu Mươi";

            case 7:
                return "Bảy Mươi";

            case 8:
                return "Tám Mươi";
            case 9:
                return "Chín Mươi";
            default:
                return "";
        }

    }

    public static String translate(int number) {
        int firstNumber, secondNumber;
        if (number <10 ) {
            if (number==0) {
                return "Số Không";
            } else {
                return hangDonVi(number);
            }
        } else if (number<100) {
            firstNumber = number/10;
            secondNumber = number%10;
            return hangChuc(firstNumber) + hangDonVi(secondNumber);
        } else {
            return "Does not exceed 100";
        }
    }

    public static String divideNumber (int number) {
        int firstNumber, secondNumber;
        firstNumber = number/10;
        secondNumber = number%10;
        if (firstNumber == 3) {
            return "Fizz";
        } else if (firstNumber == 5) {
            return "Buzz";
        } else if (secondNumber == 3) {
            return "Fizz";
        } else if (secondNumber == 5) {
            return "Buzz";
        } else {
            return number + " ";
        }


    }



}
