package test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
	
	static String path = "D:\\input.txt";
	static Scanner sc;
	static List<Integer> numbers;
	
	public static void main(String[] args) throws IOException {
		File file = new File(path);
		numbers = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while((line = br.readLine()) != null) {
			numbers.add(Integer.parseInt(line));
		}
		sc = new Scanner(System.in);
		System.out.println("What you want to calculate? [Mean, Median, Mode]");
		String input = sc.nextLine();
		input = input.toLowerCase();
		checkMode(input);
		sc.close();
	}
	
	private static void checkMode(String input) {
		if(input.equals("mean")) {
			calculateMean(numbers);
		} else if(input.equals("median")){
			calculateMedian(numbers);
		} else if(input.equals("mode")){
			calculateMode(numbers);
		} else {
			System.out.println("Please enter valid option!!");
			input = sc.nextLine();
			input = input.toLowerCase();
			checkMode(input);
		}
	}
	
	private static void calculateMean(List<Integer> numbers) {
		int sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		System.out.println("Mean of the numbers is: " + (sum / numbers.size()));
	}
	
	private static void calculateMedian(List<Integer> numbers) {
		Collections.sort(numbers);
		double median;
		if(numbers.size() % 2 == 0) {
			median = (numbers.get(numbers.size()/2) + numbers.get(numbers.size()/2 - 1))/2; 
		} else {
			median = numbers.get(numbers.size()/2);
		}
		System.out.println("Median of the numbers is: " + median);
	}
	
	private static void calculateMode(List<Integer> numbers) {
		int modeCount = 0, mode = 0, currentCount = 0;
		for(int i : numbers) {
			for(int j : numbers) {
				if(i == j) {
					currentCount++;
				}
			}
			if(currentCount > modeCount) {
				modeCount = currentCount;
				mode = i;
			}
		}
		System.out.println("Mode of the numbers is: " + mode);
	}
}
