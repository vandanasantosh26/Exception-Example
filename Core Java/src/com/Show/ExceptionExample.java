package com.Show;
import java.lang.*;

public class ExceptionExample {

	static void validateToVote(int age) throws ArithmeticException
	{
		if(age<18)
			throw new ArithmeticException("No right to vote");
		else
			System.out.println("Vote here");
		
	}
	static void display()
	{
		System.out.println("Welcome to USA Voting");
	}
	public static void main(String[] args) {
		try
		{
			validateToVote(15);
		}
		catch(Exception e)
		{
			System.out.println("This is the exception");
		}
		
		display();
		
	}
}
