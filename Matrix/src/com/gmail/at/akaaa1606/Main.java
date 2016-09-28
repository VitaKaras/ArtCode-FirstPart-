package com.gmail.at.akaaa1606;

import java.io.*;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws IOException {
		int[][] matrix = createMatrix(4, 5);
		printMatrix(matrix);
		System.out.println();
		System.out.println("Task_3_1:");
		printMatrix(matrix);
		matrix = task_3_1(matrix);
		System.out.println();
		System.out.println("Нова матриця: ");
		printMatrix(matrix);
		System.out.println();
		System.out.println("Task_3_2:");
		boolean [][]matrixB=task_3_2(3, 4);
		printMatrix(matrixB);
		System.out.println();
		System.out.println("Task_3_3:");
		int[][] matrix2 = { { 2, 3, 4, 5, 0, -3, 7 }, { -2, 0, 6, 7, 4, 5, 5 }, { 6, -10, 3, 1, 3, -10, 6 },
				{ 2, 3, 4, 4, 5, 6, 7 } };
		printMatrix(matrix2);
		boolean flag = task_3_3(matrix2, 3);
		System.out.println("Рядок 3 є поліндромом " + flag);
		System.out.println();
		System.out.println("Task_3_4:");
		int[] array = task_3_4(matrix);
		printMatrix(matrix);
		System.out.println();
		System.out.print("Array: ");
		printArray(array);
		System.out.println();
		System.out.println("Task_3_5:");
		printMatrix(matrix);
		System.out.println("Нова матриця: ");
		task_3_5(matrix);
		printMatrix(matrix);
		System.out.println();
		System.out.println("Task_3_5_2:");
		printMatrix(matrix);
		System.out.println("Нова матриця: ");
		task_3_5_2(matrix);
		printMatrix(matrix);
		System.out.println();
		System.out.println("Task_3_6:");
		int array1[] = { 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1 };
		task_3_6(array1);
		System.out.println();
		System.out.println("Task_3_7:");
		String string = "Найти самое длинное слово в строке";
		task_3_7(string);
		System.out.println();
		System.out.println("Task_3_8:");
		task_3_8();
		System.out.println();
		System.out.println("Task_3_9:");
		int[][] matrix3 = createMatrix(3, 4);
		System.out.println("Перша матриця:");
		printMatrix(matrix3);
		int[][] matrix4 = createMatrix(4, 3);
		System.out.println("Друга матриця:");
		printMatrix(matrix4);
		int[][] matrix5 = task_3_9(matrix3, matrix4);
		System.out.println("Добуток матриць: ");
		printMatrix(matrix5);
		System.out.println();
		System.out.println("Task_3_10:");
		String string1 = "Напишите программу ввести, которая Напишите позволяет пользователю ввести в консоли строку программу";
		System.out.println(string1);
		task_3_10(string1);
		System.out.println();
		System.out.println("Task_3_11:");
		printMatrix(matrix4);
		matrix5 = task_3_11(matrix4);
		System.out.println("Нова матриця: ");
		printMatrix(matrix5);
		System.out.println();
		System.out.println("Task_3_12:");
		task_3_12();
		System.out.println();
		System.out.println("Task_3_13:");
		task_3_13();
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%5d", matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(boolean matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%6b", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] createMatrix(int row, int column) {
		int matrix[][] = new int[row][column];
		Random rand = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = rand.nextInt(100) - 50;
			}
		}
		return matrix;
	}

	public static int[][] task_3_1(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] % 5 == 0)
					matrix[i][j] = 8;
			}
		}
		return matrix;
	}

	public static boolean[][] task_3_2(int row, int column) {
		boolean matrix[][] = new boolean[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == j)
					matrix[i][j] = true;
				else
					matrix[i][j] = false;
			}
		}
		return matrix;//TODO: check
	}

	public static boolean task_3_3(int matrix[][], int num_row) {
		int last_element = matrix[num_row - 1].length - 1;
		boolean flag = false;
		for (int j = 0; j < matrix[num_row - 1].length / 2; j++) {
			if (matrix[num_row - 1][j] == matrix[num_row - 1][last_element]) {
				flag = true;
				last_element--;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static int[] task_3_4(int matrix[][]) {
		int array_length = 0;
		if (matrix.length > matrix[0].length)
			array_length = matrix[0].length;
		else
			array_length = matrix.length;

		int array[] = new int[array_length];
		for (int i = 0; i < array.length; i++) {
			array[i] = matrix[i][i];
		}
		return array;
	}

	public static void task_3_5(int matrix[][]) {
		int max_row = 0, min_row = 0, sum = 0;
		int index_max = 0, index_min = 0;
		for (int i = 0; i < matrix[0].length; i++) {
			sum += matrix[0][i];
		}
		max_row = Integer.MIN_VALUE;
		min_row = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
			if (sum > max_row) {
				max_row = sum;
				index_max = i;
			} else if (sum < min_row) {
				min_row = sum;
				index_min = i;
			}
			
		}
		int[] array = matrix[index_min];
		matrix[index_min] = matrix[index_max];
		matrix[index_max] = array;
	}
	
	public static void task_3_5_2(int matrix[][]){
		int max_column=0, min_column=0, sum=0;
		int index_max = 0, index_min = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][0];
		}
		max_column= Integer.MIN_VALUE;
		min_column = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			sum = 0;
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[j][i];
			}
			if (sum > max_column) {
				max_column = sum;
				index_max = i;
			} else if (sum < min_column) {
				min_column = sum;
				index_min = i;
			}
			
		}
		int [] arrayMax=new int[matrix.length];
		int [] arrayMin=new int[matrix.length];
		for(int j=0; j<matrix.length; j++){
			arrayMax[j]=matrix[j][index_max];
			arrayMin[j]=matrix[j][index_min];
		}
		for(int j=0; j<matrix.length; j++){
			matrix[j][index_max]=arrayMin[j];
			matrix[j][index_min]=arrayMax[j];
		}
	}

	public static void task_3_6(int[] array) {
		int count1 = 0, count0 = 0;
		int max1 = 0, max0 = 0;
		boolean flag = false;
		int start1 = 0, end1 = 0, start0 = 0, end0 = 0;
		int startMax0 = 0, startMax1 = 0, endMax0 = 0, endMax1 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				count1++;
				if (flag == false) {
					start1 = i + 1;
					flag = true;
					if (count0 != 0) {
						end0 = i;
						if (max0 < count0) {
							max0 = count0;
							startMax0 = start0;
							endMax0 = end0;
						}
						count0 = 0;
					}
				}
			} else if (array[i] == 0) {
				count0++;
				if (flag) {
					end1 = i;
					start0 = i + 1;
					flag = false;
					if (max1 < count1) {
						max1 = count1;
						startMax1 = start1;
						endMax1 = end1;
					}
					count1 = 0;
				}

			} else if (array[i] == array.length - 1) {
				if (flag)
					end1 = i + 1;
				else
					end0 = i + 1;
			}

		}
		System.out.println("0: (" + startMax0 + ";" + endMax0 + "); 1:(" + startMax1 + ";" + endMax1 + ")");
	}

	public static void task_3_7(String string) {
		String word = "", longWord = "";
		int maxLength = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				word = word.concat(Character.toString(string.charAt(i)));
			} else {
				if (maxLength < word.length()) {
					maxLength = word.length();
					longWord = word;
				}
				word = "";
			}
		}
		System.out.println("Найбільше слово: " + longWord);
	}

	public static void task_3_8() throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String string = buf.readLine();
		char bigLetter;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i))) {
				if (i == 0 || string.charAt(i - 1) == ' ') {
					bigLetter = Character.toUpperCase(string.charAt(i));
					System.out.print(bigLetter);
					continue;
				}
			}
			System.out.print(string.charAt(i));
		}
	}

	public static int[][] task_3_9(int[][] matrix1, int[][] matrix2) {
		int[][] matrix3 = new int[matrix1.length][matrix2[0].length];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix3[i][j] = 0;
			}
		}

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				for (int k = 0; k < matrix1[i].length; k++) {
					matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return matrix3;
	}

	public static void task_3(String string) {
		String[] array = new String[30];
		String word = "";
		int j = 0;
		array[j] = "";
		boolean flag = false;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i))) {
				word = word.concat(Character.toString(string.charAt(i)));
				flag = true;
				if (i == string.length() - 1) {
					int k = 0;
					while (array[k] != null) {
						if (array[k].equals(word)) {
							System.out.println(word);
							flag = false;
							word = "";
						}
						k++;
					}
				}
			} else {
				int k = 0;
				while (array[k] != null) {
					if (array[k].equals(word)) {
						System.out.println(word);
						flag = false;
						word = "";
					}
					k++;
				}
				if (flag) {
					array[j] = word;
					j++;
					flag = false;
					array[j] = "";
					word = "";
				}
			}
		}
	}

	public static void task_3_(String string) {
		String[] array = string.split("[,;:.!?\\s]+");
		boolean left = false, right = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					right = true;
				}
			}
			for (int k = i - 1; k >= 0; k--) {
				if (array[i].equals(array[k])) {
					left = true;
				}
			}
			if (left && right == false) {
				System.out.println(array[i]);
			}
			left = false;
			right = false;
		}
	}

	public static void task_3_10(String string) {
		String[] array = string.split("[,;:.!?\\s]+");
		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					flag = false;
					continue;
				}
			}
			if (flag) {
				System.out.print(array[i] + " ");
			}
			flag = true;
		}
	}

	public static int[][] task_3_11(int[][] matrix) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int grad = Integer.parseInt(buf.readLine());
		int[][] matrix2 = new int[matrix.length][matrix[0].length];
		if (grad % 360 == 90 || grad % 360 == 270) {
			matrix2 = new int[matrix[0].length][matrix.length];
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (grad % 360 == 90) {
					matrix2[j][matrix.length - i - 1] = matrix[i][j];
				} else if (grad % 360 == 180) {
					matrix2[matrix.length - i - 1][matrix[0].length - j - 1] = matrix[i][j];
				} else if (grad % 360 == 270) {
					matrix2[j][i] = matrix[i][j];
				} else if (grad % 360 == 0) {
					matrix2[i][j] = matrix[i][j];
				}
			}
		}
		return matrix2;
	}

	public static void task_3_12() throws IOException {
		boolean correct = false, upperCase = false, lowerCase = false, isNumber = false;
		String password = "";
		while (correct == false) {
			System.out.println("Введіть пароль (від 8 до 20 символів, який містить малі, великі літери та цифри");
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			password = buf.readLine();
			if (password.length() >= 8 && password.length() <= 20) {
				for (int i = 0; i < password.length(); i++) {
					if (Character.isUpperCase(password.charAt(i)))
						upperCase = true;
					if (Character.isLowerCase(password.charAt(i)))
						lowerCase = true;
					if (Character.isDigit(password.charAt(i)))
						isNumber = true;
				}
				if (upperCase == true && lowerCase == true && isNumber == true) {
					if (password.indexOf("password") == -1 && password.indexOf("pass") == -1
							&& password.indexOf("gfhjkm") == -1) {
						correct = true;
					}
				} else
					System.out.println("Спробуйте ще раз");
			} else
				System.out.println("Спробуйте ще раз");
		}
		System.out.println("Введіть ще раз пароль: ");
		BufferedReader buf2 = new BufferedReader(new InputStreamReader(System.in));
		String repeatPass = buf2.readLine();
		if (repeatPass.equals(password)) {
			System.out.println("Вірно");
		} else
			System.out.println("Не вірно");
	}

	public static void task_3_13() throws IOException {
		System.out.println("МОРСЬКИЙ БІЙ");
		System.out.println("Введіть розмір поля:");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String line = buf.readLine();
		int[] array = new int[2];
		String[] parsing = line.split(" ");
		array[0] = Integer.parseInt(parsing[0]);
		array[1] = Integer.parseInt(parsing[1]);

		Random rand = new Random();
		int xShip = rand.nextInt(array[0]);
		int yShip = rand.nextInt(array[1]);
		System.out.println("(" + xShip + ";" + yShip + ")");

		boolean flag = false;

		while (flag == false) {
			System.out.println("Введіть координати поля(x y):");
			BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
			String line1 = buf1.readLine();
			String[] parsing1 = line1.split(" ");
			array[0] = Integer.parseInt(parsing1[0]);
			array[1] = Integer.parseInt(parsing1[1]);

			if (array[0] == xShip && array[1] == yShip) {
				flag = true;
				System.out.println("Корабель знищено");
			} else {
				System.out.println("Ви не влучили в ціль");
				System.out.println("Бажаєте продовжити?(Y/N)");
				BufferedReader buf2 = new BufferedReader(new InputStreamReader(System.in));
				String line2 = buf2.readLine();
				if (line2 == "N") {
					flag = true;
					System.out.println("Ви програли");
				}
			}
		}

	}

}
