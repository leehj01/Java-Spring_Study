package ch10;

public class BirthDay {
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month){ // 기본적으로 fasle 가 디폴트 값이다.
        if (month < 1 || month > 12){
            isValid = false;
        }
        else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void showDate(){
        if ( isValid) {
            System.out.println( year + "년 " + month + "월 " + day + "일 입니다.");
        }
        else {
            System.out.println("유효하지 않는 날짜 입니다.");
            System.out.println( year + "년 " + month + "월 " + day + "일 입니다.");
            System.out.println(isValid);
        }
    }

    public boolean getIsValid(){
        return isValid ;
        // get은 되지만 set은 안된다. 그 이유는 isvalid를 결정하는 것은 내부의 로직으로 결정되는 사항이기 때문이다. 이것을 read-only라고 함
    }
}
