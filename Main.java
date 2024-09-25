public class Main
{
    public static void main(String[] args)
    {
        //Feeder f = new Feeder();
        // System.out.println(f);
        // System.out.println(f.currentFood);
        // System.out.println(f.getCurrentFood());
        // g = new Feeder(500);
        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        // System.out.println(h.getCurrentFood());

        //int random = (int)(Math.random() * 50 + 1);
        // System.out.println(random);

        Feeder i = new Feeder(500);
        i.simulateOneDay(12);
        System.out.println(i);

        Feeder k = new Feeder(1000);
        k.simulateOneDay(22);
        System.out.println(k);

        Feeder m = new Feeder(100);
        m.simulateOneDay(5);
        System.out.println(m);

        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10, 4));

        Feeder n = new Feeder(250);
        System.out.println(n.simulateManyDays(10, 5));

        Feeder p = new Feeder(0);
        System.out.println(p.simulateManyDays(5, 10));

    }
}
