package TDD;

public class DayOfMonth {
    private int dayOfMonth;
    private int month;

    DayOfMonth(int month,int dayOfMonth) {
        this.month = month;
        this.dayOfMonth=dayOfMonth;
    }

    public int getDayOfMonth() {
        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
              return   this.dayOfMonth = 31;

            case 2:
                return  this.dayOfMonth = 28;

            case 4:
            case 6:
            case 9:
            case 11:
            default:
                return this.dayOfMonth = 30;
        }
    }
}
