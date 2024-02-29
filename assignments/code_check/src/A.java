class H 
{
        static int i = test();
        static {
                System.out.println("from SIB ");
        }
        static int j;

        static int test()
        {
                System.out.println("from test");
                return j;
        }

        public static void main(String[] args) 
        {
                System.out.println("done");
        }
}
