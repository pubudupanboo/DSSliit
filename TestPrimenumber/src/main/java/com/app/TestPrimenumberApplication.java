package com.app;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestPrimenumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestPrimenumberApplication.class, args);
		
		Scanner sc = new Scanner(System.in);
		int primeNumber;
		int start_Number = 0;
		int end_Number = 0;
		System.out.println("Enter Start Number");
		start_Number = sc.nextInt();
		System.out.println("Enter end_Number");
		end_Number = sc.nextInt();
		
		System.out.println(findPrimes(start_Number,end_Number));

	}
	
	public static ArrayList<Integer> findPrimes(int start,int end){
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int n = start;n < end;n++) {
			boolean prime = true;
			int i = 2;
			while(i <= n/2) {
				System.out.println("Checking if " + i + " is a multiple" );
				if(n % i == 0) {
					System.out.println("YES WE FOUND A MULTIPLE : " + i);
					prime = false;
					break;
					}
				i++;
			 }
			if(prime) {
				primes.add(n);
		     }
	         }
		return primes;
	
	}

}
