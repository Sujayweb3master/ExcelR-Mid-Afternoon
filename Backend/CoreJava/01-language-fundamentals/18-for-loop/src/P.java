class P
{
	public static void main(String[] args)
	{
		int i, j;
		for(i = 0, j = 10; j > 2; j--, i++)
		{
			System.out.println(i + ":" + j);
		}
		System.out.println(i + ":" + j);
	}
}
//i = 0, 1, 2, 3, 4, 5, 6, 7, 8
//j = 10, 9, 8, 7, 6, 5, 4, 3, 2
/*
0:10
1:9
2:8
3:7
4:6
5:5
6:4
7:3
8:2
*/