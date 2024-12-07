#  01> Quadratic Eqn

# import math

# def find_roots(a, b, c):
#     discriminant = b**2 - 4*a*c
#     if discriminant > 0:
#         root1 = (-b + math.sqrt(discriminant)) / (2 * a)
#         root2 = (-b - math.sqrt(discriminant)) / (2 * a)
#         print("The roots are real and distinct.")
#         print(f"Root1 = {root1}")
#         print(f"Root2 = {root2}")
#     elif discriminant == 0:
#         root = -b / (2 * a)
#         print("The roots are real and equal.")
#         print(f"Root1 = Root2 = {root}")
#     else:
#         real_part = -b / (2 * a)
#         imaginary_part = math.sqrt(-discriminant) / (2 * a)
#         print("The roots are complex.")
#         print(f"Root1 = {real_part} + {imaginary_part}i")
#         print(f"Root2 = {real_part} - {imaginary_part}i")

# a, b, c = map(float, input("Enter coefficients a, b, c: ").split())
# find_roots(a, b, c)


#  02> Factorial of Number 

# def factorial(n):
#     if n < 0:
#         return "Factorial not defined for negative numbers"
#     result = 1
#     for i in range(1, n + 1):
#         result *= i
#     return result

# num = int(input("Enter a number: "))
# print(f"Factorial of {num} is {factorial(num)}")


#03>  Average of first n natural number 

# def average_of_n(n):
#     return sum(range(1, n + 1)) / n

# n = int(input("Enter the value of n: "))
# print(f"Average of first {n} natural numbers is {average_of_n(n)}")


#  04> Sum of odd even list 

# def sum_even_odd(start, end):
#     even_list = [i for i in range(start, end + 1) if i % 2 == 0]
#     odd_list = [i for i in range(start, end + 1) if i % 2 != 0]
#     return sum(even_list), sum(odd_list), even_list, odd_list

# start = int(input("Enter start of range: "))
# end = int(input("Enter end of range: "))
# even_sum, odd_sum, even_list, odd_list = sum_even_odd(start, end)

# print(f"Even numbers: {even_list}, Sum: {even_sum}")
# print(f"Odd numbers: {odd_list}, Sum: {odd_sum}")


#  05> Student tuples

# students = []
# for i in range(3):
#     name = input(f"Enter name of student {i+1}: ")
#     age = int(input(f"Enter age of student {i+1}: "))
#     avg_score = float(input(f"Enter average score of student {i+1}: "))
#     students.append((name, age, avg_score))

# print("Student details:")
# for student in students:
#     print(student)


#  06> Frequency of words

# sentence = input("Enter a sentence: ")
# words = sentence.split()

# # Create an empty dictionary to store word frequencies
# frequency = {}

# # Count occurrences of each word
# for word in words:
#     if word in frequency:
#         frequency[word] += 1
#     else:
#         frequency[word] = 1

# # Print word frequencies
# print("Word frequencies:")
# for word, count in frequency.items():
#     print(f"{word}: {count}")


#  07> String methods

# def swap_case(s):
#     return s.swapcase()

# string = input("Enter a string: ")
# print(f"Uppercase: {string.upper()}")
# print(f"Lowercase: {string.lower()}")
# print(f"Swapped case: {swap_case(string)}")


#  08> Text file

# def count_words(file_path):
#     with open(file_path, 'r') as file:  # Assume the file path is correct
#         content = file.read()          # Read the file content
#     words = content.split()            # Split content into words
#     return len(words)                  # Return the word count

# file_path = input("Enter the file path: ")
# word_count = count_words(file_path)    # Call the function
# print(f"Number of words: {word_count}")  # Print the word count



