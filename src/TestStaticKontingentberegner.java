public class TestStaticKontingentberegner {

    private static int sum;
    private int kontingent;
    private int alder;
    private boolean isActive;

    TestStaticKontingentberegner(int alder, boolean isActive){
        this.alder = alder;
        this.isActive = isActive;
        calcSum();
     }

    public void bestemKontingent() {
        if (isActive) {
            if (alder < 18) {
                kontingent = 1000;
            } else if (alder > 60) {
                kontingent = 1500 / 2;
            } else {
                kontingent = 1500;
            }
        } else {
            kontingent = 500;
        }
    }

    public void calcSum(){
        bestemKontingent();
        sum += kontingent;
    }

    public void resetSum(){
        sum = 0;
        kontingent = 0;
        calcSum();
    }

    public static int getSum(){
        return sum;
    }

    public void setAlder(int alder){
        this.alder = alder;
    }

    public void isActive(boolean isActive){
        this.isActive = isActive;
    }


}
