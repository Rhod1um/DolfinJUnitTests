public class Test {
    public static void main(String[] args) {
        TestStaticKontingentberegner t1 = new TestStaticKontingentberegner(21, true);
        System.out.println(TestStaticKontingentberegner.getSum());

        TestStaticKontingentberegner t2 = new TestStaticKontingentberegner(22, true);
        System.out.println(TestStaticKontingentberegner.getSum());

        TestStaticKontingentberegner t3 = new TestStaticKontingentberegner(17, true);
        System.out.println(TestStaticKontingentberegner.getSum());
        System.out.println();

        t3.setAlder(18);
        t3.resetSum();
        System.out.println(TestStaticKontingentberegner.getSum());
        System.out.println();

        t1.isActive(false);
        t1.resetSum(); //alle instancer skal clears individuelt da resetSum ikke er static
        //nej for sum (statiskvariabel) resettes i resetSum() så den sletter sum for alle
        //men sletter kun kontigentet og kalder calcSum på den enkelte instans da de ikke er static
        //så reset sum skal stadig kaldes på alle
        System.out.println(TestStaticKontingentberegner.getSum());
    }
}
