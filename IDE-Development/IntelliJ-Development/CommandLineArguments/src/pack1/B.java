package pack1;

class B
{
    public static void main(String[] args)
    {
        for(String str : args)
        {
            System.out.println(str);
        }
        B b1 = new B();
        System.out.println(b1);
        System.out.println("Total number of arguments that you have passed " + args.length);
        System.out.println(args[1]);
    }
}
