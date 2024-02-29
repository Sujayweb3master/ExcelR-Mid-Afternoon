class M28
{
        // static void test(int... args)
        // {
        //         for(int value : args)
        //         {
        //                 System.out.println(value);
        //         }
        //         System.out.println("------------");
        // }

        static void test(String[] str) {
                for(String s1 : str) {
                        System.out.println(s1);
                }
        }

        
        public static void main(String[] args) 
        {
                // test();
                // test(1);
                // test(2, 4);
                // test(40, 10, 5);
                // test(40, 10, 5, 45, 100);
                // test("wef","werw","ewe");
                System.out.println("done");
                for(String s2 : args) {
                        System.out.println(s2);
                }
        }
}
