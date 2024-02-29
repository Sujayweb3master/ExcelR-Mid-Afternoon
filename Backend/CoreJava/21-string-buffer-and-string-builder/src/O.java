class O 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("hellotoall");
		StringBuffer sb1 = new StringBuffer("people");
		System.out.println(sb);          // 0123456789
		sb.delete(0, 0);
		System.out.println(sb);
	}
}
