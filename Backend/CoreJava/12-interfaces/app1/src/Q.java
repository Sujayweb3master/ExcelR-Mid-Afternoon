interface O
{
    void test1();
    void test2(int i);
    boolean test3(boolean b);
}
abstract class P implements O
{
    public void test1()
    {
        System.out.println("from test1()");
    }

    public void test2(int i)
    {
        System.out.println("from test2(int)");
    }
}
class Q extends P
{
    public boolean test3(boolean b)
    {
        return b;
    }

    void test4()
    {
        System.out.println("from test4()");
    }

    public static void main(String[] args)
    {
        Q q1 = new Q();
        q1.test1();
        q1.test2(10);
        System.out.println(q1.test3(true));
        q1.test4();
    }
}
