package app1;

import app2.B;

class A
{
    public static void main(String[] args)
    {
    	System.out.println("app1.A begin");
        assert false: "This is printed";
        System.out.println("-------------");
        B.main(args);
        System.out.println("app1.A end");
    }
}