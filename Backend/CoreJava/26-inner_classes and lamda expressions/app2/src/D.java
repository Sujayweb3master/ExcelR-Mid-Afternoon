interface D
{
	void test1();
	void test2();

	default void test3() {
		System.out.println("from interface D");
	}
}