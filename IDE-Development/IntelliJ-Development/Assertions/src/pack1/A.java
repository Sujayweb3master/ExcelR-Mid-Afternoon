package pack1;

import pack2.B;

public class A
{
        public static void main(String[] args)
        {
                System.out.println("pack1.A one");
                assert false;
                System.out.println("pack1.A two");
                B.main(args);
                System.out.println("app1. three");
        }
}
