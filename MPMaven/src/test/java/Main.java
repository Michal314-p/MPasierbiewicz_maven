

public class Main
{

    public static void main(String[] args)
    {
        Infant mix = new Infant();

        System.out.println("Przed zmianami: Grzegoż lubi mięso i grzyby");
        System.out.println("Po zmianach: ");
        System.out.println(mix.put_changes("Grzegoż lubi mięso i grzyby"));
    }
}
