package FizzBuzzTranslate;

public class FizzBuzzTranslate {
    int number;
    String numToString = "";


    public FizzBuzzTranslate(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void displayFizzBuzz() {
        String string = String.valueOf(this.number);
        for (int i = 0; i < string.length(); i++) {
            if (Integer.parseInt(String.valueOf(string.charAt(i))) == 3) {
                System.out.print("Fizz");
            }
            if (Integer.parseInt(Character.toString(string.charAt(i))) == 5) {
                System.out.print("Buzz");
            }
        }

    }

    public void getUnit() {
        String string = String.valueOf(this.number);
        int unit;
        if (string.length() == 1) {
            unit = this.number;
            if (number == 0) numToString = "không";
        } else unit = Integer.parseInt(String.valueOf(string.charAt(1)));
        switch (unit) {
            case 1:
                numToString += "một";
                break;
            case 2:
                numToString += "hai";
                break;
            case 3:
                numToString += "ba";
                break;
            case 4:
                numToString += "bốn";
                break;
            case 5:
                numToString += "năm";
                break;
            case 6:
                numToString += "sáu";
                break;
            case 7:
                numToString += "bảy";
                break;
            case 8:
                numToString += "tám";
                break;
            case 9:
                numToString += "chín";


        }
    }

    public void dozens() {
        String string = String.valueOf(this.number);
        switch (Integer.parseInt(String.valueOf(string.charAt(0)))) {
            case 1:
                numToString += "mười";
                break;
            case 2:
                numToString += "hai mưoi";
                break;
            case 3:
                numToString += "ba mươi";
                break;
            case 4:
                numToString += "bốn mươi";
                break;
            case 5:
                numToString += "năm mươi";
                break;
            case 6:
                numToString += "sáu mươi";
                break;
            case 7:
                numToString += "bảy mươi";
                break;
            case 8:
                numToString += "tám mươi";
                break;
            case 9:
                numToString += "chín mươi";
        }
        numToString += " ";
        this.getUnit();
    }

    public void Translate() {
        String string = String.valueOf(this.number);
        if (string.length() == 1) {
            this.getUnit();

        } else {
            if (this.number == 11) {
                numToString = " mười một";
            } else
                this.dozens();
        }
        System.out.println(numToString);
    }
}
