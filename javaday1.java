public class commandlineargument{
    public static void main(String[] args)
    {
        int p,q,s;
        p=Integer.parseInt(args[0]);
        q=Integer.parseInt(args[1]);

        s=p+q;
        system.out.println("Sum of " + p + "and " + q + "is =" + s +);
    }
}