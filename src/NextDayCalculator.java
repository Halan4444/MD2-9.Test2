public class NextDayCalculator {
    public static boolean leapYear (int year) {
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (isDivisibleBy4) {
            if (isDivisibleBy100) {
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
                else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = false;
            }
        } else {isLeapYear = false;}
    return isLeapYear;
    }

    public static int dayInMonths (int month, int year) {
        int day = 0;
        if (month <1 || month>12 ) {
            System.out.println("Error ! ");
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                {
                    day = 31;
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11:
                {
                    day = 30;
                    break;
                }
                case 2:
                    if (leapYear(year)==true) {
                        day = 29;
                        break;
                    }
                    else {
                        day = 28;
                        break;
                    }


            }
        } return day;
    }
    public static String nextDay (int day, int month, int year) {
        day = dayInMonths(month,year) ;
            if (day < 1|| day > day) {
                System.out.println("Not Available");
            } else {
                if (day<day) {
                    day++;
                }
                else if (month<12) {
                    day++;
                    month++;
                    year = year;

                } else if (day==31 || month==12) {
                    day = 1;
                    month =1;
                    year ++;
                }

            }
        return day + "/" + month + "/" +year;
        }
    }




