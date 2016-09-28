package package1;

import java.io.*;
import java.util.Random;

public class Main {
	 public static void main(String[] args)throws Exception{
		 int array[]={2, 0, -3, 7, -89, 5, 0, 8, 11, 678, 45, 3, 4, -20, 56, 34, 5};
		 System.out.println("Task_1:");
		 print(array);
		 task1(array);
		 System.out.println();
		 System.out.println("Task_2:");
		 print(array);
		 task2(array);
		 print(array);
		 System.out.println();
		 System.out.println("Task_3:");
		 int array2[]=new int[array.length];
		 task3(array, array2);
		 System.out.print("array: ");
		 print(array);
		 System.out.print("array_2: ");
		 print(array2);
		 System.out.println();
		 System.out.println("Task_4:");
		 print(array);
		 task4(array);
		 System.out.println();
		 System.out.println("Task_5:");
		 int [] array3=new int[10];
		 task5(array3);
		 print(array3);
		 task5(array3);
		 print(array3);
		 System.out.println();
		 System.out.println("Task_6:");
		 print(array);
		 task6(array);
		 System.out.println();
		 System.out.println("Task_7:");
		 print(array);
		 task7(array);
		 System.out.println();
		 System.out.println("Task_8:");
		 print(array);
		 int [] array4={3, 56, 8, -4, -19, 8, 7, 65, 78, 34, 12, -90, 9, 0, 0, -5, 45};
		 print(array4);
		 task8(array, array4);
		 System.out.println();
		 System.out.println("Task_9:");
		 task9();
		 System.out.println();
		 System.out.println("Task_10:");
		 int array5[]=splitArray(array,2,5);
		 System.out.println("Масив обрізаний з 2 по 5 комірки");
		 print(array);
		 print(array5);
		 System.out.println();
		 System.out.println("Task_2_1:");
		 print(array);
		 task2_1(array);
		 print(array);
		 System.out.println();
		 System.out.println("Task_2_2:");
		 System.out.println("Чи просте число?");
		 boolean flag=task2_2();
		 System.out.println("Відповідь: "+flag);
		 System.out.println();
		 System.out.println("Task_2_3:");
		 String string="Do First nine task from below links !!! You can use IDEA for better ";
		 System.out.println(string);
		 task2_3(string, '!');
		 System.out.println();
		 System.out.println("Task_2_4:");
		 print(array);
		 array=task2_4(array,2);
		 System.out.println("Зсув масиву на 2 елементи");
		 print(array);
		 System.out.println();
		 System.out.println("Task_2_5:");
		 System.out.println(string);
		 task2_5(string);
		 }
	 
	 public static void print(int array[]){
		 for(int i=0; i<array.length;i++)
		 {
			 System.out.print(array[i]+" ");
		 }
		 System.out.println();
	 }
	 
	 public static void task1(int array[]){
		 int min=array[0], max=array[0];
		 for(int i=0; i<array.length; i++){
			 if(array[i]<min)
				 min=array[i];
			 else if(array[i]>max)
				 max=array[i];
		 }
		 System.out.println("max: "+max+", min: "+min);
	 }
	 
	 public static void task2(int array[]){
		 int min=array[0], max=array[0], index_max=0, index_min=0;
		 for(int i=0; i<array.length; i++){
			 if(array[i]<min){
				 min=array[i];
				 index_min=i;
			 }
			 else if(array[i]>max){
				 max=array[i];
				 index_max=i;
			 }
		 }
		 array[index_min]=max;
		 array[index_max]=min;
	 }
	 
	 public static void task3(int array[], int array2[]){
		 for(int i=0;i<array2.length; i++){
			 array2[i]=array[i];
		 }
	 }
	 
	 public static void task4(int array[])throws Exception{
		 System.out.print("Введіть цифру: ");
		 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		 String line=buf.readLine();
		 int number=Integer.parseInt(line);
		 
		 int count=0;
		 for(int i=0; i<array.length; i++){
			 if(array[i]==number)
				 count++;
		 }
		 System.out.println("У масиві міститься "+count+" цифри "+number);		 
	 }
	 
	 public static void task5(int array[]){
		 Random even_number=new Random();
		 Random odd_number=new Random();
		 for(int i=0; i<array.length; i++){
			 if(i%2!=0)
				 array[i]=2*(odd_number.nextInt(100)-52);
			 else array[i]=2*(even_number.nextInt(100)-52)-1;
		 }
	 }
	 
	 public static void task6(int array[]){
		 int sum=0;
		 for(int i=0; i<array.length; i++){
			 sum+=array[i];
		 }
		 System.out.println("Середня арифметичне масиву: "+sum/2);
	 }
	 
	 public static void task7(int array[]){
		 int half=array.length/2;
		 int sum_half_1=0, sum_half_2=0;
		 for(int i=0; i<half;i++){
			 sum_half_1+=array[i];
		 }
		 for(int i=half; i<array.length;i++){
			 sum_half_2+=array[i];
		 }
		 if(sum_half_1/2>sum_half_2/2){
			 for(int i=0; i<half; i++)
				 System.out.print(array[i]+" ");
		 }
		 else for(int i=half; i<array.length; i++)
			 System.out.print(array[i]+" ");
	 }
	 
	 public static void task8(int array[], int array2[]){
		 int [] array3=new int[array.length];
		 for(int i=0; i<array.length; i++){
			 array3[i]=array[i]+array2[i];
			 System.out.print(array[i]+" ");
		 }
	 }
	 
	 public static void task9(){
		 int array[]=new int[10];
		 int array2[]=new int[10];
		 int count_odd_1=0, count_odd_2=0;
		 Random rand=new Random();
		 for(int i=0; i<array.length; i++){
			 array[i]=rand.nextInt(51)+25;
			 if(array[i]%2==0)
				 count_odd_1++;
			 array2[i]=rand.nextInt(51)+25;
			 if(array2[i]%2==0)
				 count_odd_2++;
		 }
		 print(array);
		 print(array2);
		 if(count_odd_1>count_odd_2)
			 System.out.print("Більше парнх елементів має І масив");
		 else if (count_odd_1<count_odd_2)
			 System.out.print("Більше парнх елементів має ІI масив");
		 else 
		 	System.out.print("Масиви мають однакову кількість парних елементів");
	 }
	 
	 public static int[] splitArray(int[] arr, int start, int end){
		 int array[]=new int[end-start+1];
		 for(int i=0; i<array.length;i++){
			 array[i]=arr[start];
			 start++;
		 }
		 return array;
	 }
	 
	 public static void task2_1(int []array){
		 int element=0;
		 int last_element=array.length-1;
		 for(int i=0; i<array.length/2; i++){
			 element=array[i];
			 array[i]=array[last_element];
			 array[last_element]=element;
			 last_element--;
		 }
	 }
	 
	 public static boolean task2_2()throws IOException{
		 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		 int number=Integer.parseInt(buf.readLine());
		
		 boolean flag=true;
		 for(int i=2; i<Math.sqrt(number);i++){
			 if(number%i==0){
				 flag=false;
				 break;
			 }
		 }
		 System.out.println("Число: "+number);
		return flag;
	 }
	 
	 public static void task2_3(String string, char ch){
		 int count=0;
		 for(int i=0; i<string.length(); i++){
			 if(string.charAt(i)==ch)
				 count++;
		 }
		 System.out.println("Строка містить "+count+" символів '"+ch+"'");
	 }
	 
	 public static int[] task2_4(int array[], int col){
		 int array2[]=new int[array.length];
		 int k=0;
		 int last_element=array.length-col;
		 for(int i=0; i<col; i++){
			 array2[i]=array[last_element];
			 last_element++;
		 }
		 for(int i=col; i<array.length; i++){
			 array2[i]=array[k];
			 k++;
		 }
		 return array2;		 
	 }
	 
	 public static void task2_5(String string){
		 for(int i=0; i<string.length(); i++){
			 if(string.charAt(i)=='a')
				 System.out.print('@');
			 System.out.print(string.charAt(i));
		 }
	 }
}


