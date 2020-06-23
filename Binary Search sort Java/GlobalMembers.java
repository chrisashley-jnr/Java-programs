public class GlobalMembers
{
	public static int binarySearch(int[] arr, int length, int searchItem)
	{
		int start = 0;
		int end = length - 1;
		int pivot;

		for (int i = 0; i < length / 2; i++)
		{
			pivot = (start + end) / 2;

			if (searchItem == arr[pivot])
			{
				return pivot;
			}
			else if (searchItem > arr[pivot])
			{
				start = pivot + 1;
			}
			else
			{
				end = pivot - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int length = 9;
		int searchItem = 1;

		System.out.print(searchItem);
		System.out.print(" is at ");
		System.out.print(binarySearch(arr, length, searchItem));
		System.out.print("th index of the array.");
		System.out.print("\n");

	}

}