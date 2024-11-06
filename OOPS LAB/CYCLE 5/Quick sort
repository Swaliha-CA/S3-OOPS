//program to implement quick sort

//Swaliha_59

Import java.util.*;

Class Sort

{

Int partition(int arr[], int low, int high) 

{

Int pivot = arr[high];

Int I = low – 1;

For (int j = low; j < high; j++) 

{

If (arr[j] < pivot) {

I++;

Int temp = arr[i];

arr[i] = arr[j];

arr[j] = temp;

}

}

Int temp = arr[I + 1];

Arr[I + 1] = arr[high];

Arr[high] = temp;

Return I + 1;

}

Void quicksort(int arr[], int low, int high) {

If (low < high) {

Int pi = partition(arr, low, high);

Quicksort(arr, low, pi – 1);

Quicksort(arr, pi + 1, high);

}

}

}

Class sort

{

Public static void main(String[] args) 

{

Scanner s = new Scanner(System.in);

Sort obj = new Sort();

Int arr[] = new int[100];

System.out.println(“Enter the length of the array:”);

Int len = s.nextInt();

System.out.println(“Enter an array:”);

For (int I = 0; I < len; i++) 

{

Arr[i] = s.nextInt();

}

Obj.quicksort(arr, 0, len – 1);

System.out.println(“The sorted array is:”);

For (int I = 0; I < len; i++) 

{

System.out.print(arr[i] + “ “);

}

System.out.println();

s.close() ;

}

}

OUTPUT

Enter the length of the array:

4

Enter an array:

6

3

7

8

The sorted array is:

3 6 7 8



[Program finished]



