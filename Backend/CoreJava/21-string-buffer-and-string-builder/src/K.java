class K 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("test kumar");
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.replace(4, 9, " excelr");
		System.out.println(sb);

	}
}
