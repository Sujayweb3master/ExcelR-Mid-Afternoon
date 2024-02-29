class V
{
	public static void main(String[] args)
	{
		String s1 = "abc" + null;
		int[] arr = new int[2];
		arr = null;
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(s1.length());
		// System.out.println(s1[2]);
	}
}
/* we dont ge 4 as the length
 * considering s1 content as null.
 * we are not adding null to the s1
 * when we call any property or method from the null reference we get NullPointerException
**/