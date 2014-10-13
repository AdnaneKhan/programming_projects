#!/usr/bin/env python

def sum_digits( to_sum ):
	result = 0
	while (to_sum > 0):
		temp = (to_sum % 10)
		to_sum -= temp
		result += temp
		to_sum /= 10
	return result;

user_in = input('Please enter a positive integer! \n >>>  ')

sum = sum_digits(user_in)

print " The sum is: ", sum


