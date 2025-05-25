class SwapD
{
public static <T> void swap(T[] array,int i,int j)
{
if(i==0||j==0||i>=array.length||j>=array.length)
{
System.out.println("Error");
}
T item=array[i];
array[i]=array[j];
array[j]=item;
}

public static void main(String[] args)
{ Integer arr[]={1,2,3,4};
for(int s : arr)
{
System.out.println(s);
}
swap(arr,2,3);
for(int t : arr)
{
System.out.println(t);
}
}
}