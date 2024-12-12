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


# 03>  Average of first n natural number 

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



#  09> sort Tuples

# def sort_tuples(tuples):
#     sorted_tuples = sorted(tuples, key=lambda x: (x[0], int(x[1]), int(x[2])))
#     return sorted_tuples

# def main():
#     num_entries = int(input("Enter number of entries: "))
#     tuples = []
    
#     for _ in range(num_entries):
#         entry = input("Enter name, age, height separated by commas: ").split(',')
#         tuples.append(tuple(entry))
    
#     sorted_tuples = sort_tuples(tuples)
#     print("Sorted tuples:", sorted_tuples)

# if __name__ == "__main__":
#     main()


#  10> Generate Squares

# def generate_squares():
#     # Generating a list of squares of numbers from 1 to 20
#     squares = [x**2 for x in range(1, 21)]
#     # Printing all elements except the first 5
#     print(squares[2:])

# generate_squares()


#  11> Count upper and lower case

# def count_letters(sentence):
#     upper_case_count = 0
#     lower_case_count = 0

#     for char in sentence:
#         if char.isupper():
#             upper_case_count += 1
#         elif char.islower():
#             lower_case_count += 1

#     print("UPPER CASE", upper_case_count)
#     print("LOWER CASE", lower_case_count)

# # Input sentence
# sentence = input("Enter a sentence: ")
# count_letters(sentence)


#  12> Square root of [(2 * C * D)/H]

# import math

# def calculate_Q(D_values):
#     C = 50
#     H = 30
#     Q_values = []
    
#     for D in D_values:
#         Q = math.sqrt((2 * C * int(D)) / H)
#         Q_values.append(int(Q))  # appending the integer value of Q
    
#     return Q_values

# def main():
#     # Input the values of D as a comma-separated sequence
#     D_input = input("Enter comma-separated values for D: ")
#     D_values = D_input.split(',')
    
#     # Calculate and print the Q values
#     Q_values = calculate_Q(D_values)
#     print("Output values:", ",".join(map(str, Q_values)))

# if __name__ == "__main__":
#     main()


#  13> Creating a class in python

# import math

# class Shape:
#     def area(self):
#         pass
    
#     def perimeter(self):
#         pass

# class Circle(Shape):
#     def __init__(self, radius):
#         self.radius = radius
        
#     def area(self):
#         return math.pi * self.radius ** 2
    
#     def perimeter(self):
#         return 2 * math.pi * self.radius

# class Square(Shape):
#     def __init__(self, side_length):
#         self.side_length = side_length
    
#     def area(self):
#         return self.side_length ** 2
    
#     def perimeter(self):
#         return 4 * self.side_length

# class Triangle(Shape):
#     def __init__(self, side1, side2, side3):
#         self.side1 = side1
#         self.side2 = side2
#         self.side3 = side3
    
#     def area(self):
#         s = (self.side1 + self.side2 + self.side3) / 2
#         return math.sqrt(s * (s - self.side1) * (s - self.side2) * (s - self.side3))
    
#     def perimeter(self):
#         return self.side1 + self.side2 + self.side3

# # Example usage:
# circle = Circle(5)
# print("Circle area:", circle.area())
# print("Circle perimeter:", circle.perimeter())

# square = Square(4)
# print("Square area:", square.area())
# print("Square perimeter:", square.perimeter())

# triangle = Triangle(3, 4, 5)
# print("Triangle area:", triangle.area())
# print("Triangle perimeter:", triangle.perimeter())



#  14> Creating square dictionary


# def generate_square_dict(n):
#     # Create a dictionary with (i, i*i) pairs
#     square_dict = {i: i*i for i in range(1, n+1)}
#     return square_dict

# def main():
#     # Input the integral number 'n'
#     n = int(input("Enter an integral number: "))
    
#     # Generate the dictionary
#     result = generate_square_dict(n)
    
#     # Print the dictionary
#     print(result)

# if __name__ == "__main__":
#     main()


# import math
# a = float(input("Enter the value of a: "))
# if a!=0:
#     b = float(input("Enter the value of b: "))
#     c = float(input("Enter the value of c: "))
#     d = (b**2)-(4*a*c)
#     if d>0:
#         print("Roots are real and distict")
#         root1 = (-b+math.sqrt(d))/(2*a)
#         root2 = (-b-math.sqrt(d))/(2*a)
#         print(f"Root 1 = {root1}")
#         print(f"Root 2 = {root2}")
#     elif d==0:
#         print("Roots are real and equal")
#         root = -b/(2*a)
#         print(f"Root 1 = Root 2 = {root}")
#     else :
#         print("Roots are complex(Imaginary)")    
#         real_part = -b/(2*a)
#         imaginary_part = math.sqrt(-d)/(2*a)
#         print(f"Root1 = {real_part} + {imaginary_part}i")
#         print(f"Root2 = {real_part} - {imaginary_part}i")

# else :
#     print("The enetred Coefficients cannot form quadratic equation")       


# def factorial(n):
#     if n<0:
#         return "Factorial of negative number does'nt Exist"

#     result = 1
#     for i in range(1,n+1):
#         result = result*i
#     return result

# num = int(input("Enter a number: "))
# print(f"Factorial of {num} is {factorial(num)}: ")

# n = int(input("Enter a number: "))
# sum=0
# average=0
# if n<0:
#     print("Enter a positive number")
# else:
#     for i in range(1,n+1):
#         sum+=i
#     average=sum/n
#     print(f"The sum of first {n} natural number is {sum}: ")
#     print(f"The Average of first {n} natural number is {average}: ")

# def sum_even_odd(start,end):
#     even_list=[]
#     odd_list=[]
#     for i in range(start,end+1):
#         if i%2==0:
#             even_list.append(i)
#         else:
#             odd_list.append(i)
#     even_sum=sum(even_list)
#     odd_sum=sum(odd_list)
#     return even_sum,odd_sum,even_list,odd_list

# start = int(input("Enter start of range: "))
# end = int(input("Enter end of range: "))
# even_sum,odd_sum,even_list,odd_list = sum_even_odd(start,end)

# print(f"Even Numbers:{even_list}\nSum:{even_sum}")
# print(f"Odd Numbers:{odd_list}\nSum:{odd_sum}")


# students = []
# student_num = int(input("Enter the number of students: "))

# for i in range(student_num):
#     name = input(f"Enter the name of Student {i+1}: ")
#     age = input(f"Enter the age of Student {i+1}: ")
#     avg_score = float(input(f"Enter the Average score of Student {i+1}: "))
#     students.append((name,age,avg_score))

# print("Student details: ")
# for student in students:
#     print(student)


# sentence = input("Enter a sentence: ")
# words = sentence.split()

# frequency={}

# for word in words:
#     if word in frequency:
#         frequency[word]+=1
#     else:
#         frequency[word]=1

# print("Words frequency: ")

# for word,count in frequency.items():
#     print(f"{word} ----> {count}")

# def swap_case(s):
#     return s.swapcase()

# String = input("Enter the string: ")
# print(f"The uppercase is: {String.upper()}")
# print(f"The uppercase is: {String.lower()}")
# print(f"The uppercase is: {swap_case(String)}")


# def count_words(file_path):
#     with open(file_path,'r') as file:
#         content=file.read()
#     words = content.split()
#     return len(words)

# file_path = input("Enter the file path: ")
# word_count = count_words(file_path)
# print(f"Number words are: {word_count}")



# def sort_tuples(tuples):
#     sorted_tuples=sorted(tuples,key=lambda x:(x[0],int(x[1]),int(x[2])))
#     return sorted_tuples

# def main():
#     num_entries=int(input("Enter the number of entries: "))
#     tuples=[]

#     for _ in range(num_entries):
#         entry = input("Enter the name,age,height seprated by commas: ").split(',')
#         tuples.append(tuple(entry))
    
#     sorted_tuples=sort_tuples(tuples)
#     print("Sorted Tuples: ")
#     print(sorted_tuples)

# if __name__=="__main__":
#     main()


def generate_squares():
    squares=[]
    for x in range(1,21):
        x**=2
        squares.append(x)
    print(squares[5:])

generate_squares()


# def count_letters(sentence):
#     upper_case_count=0
#     lower_case_count=0

#     for char in sentence:
#         if char.isupper():
#             upper_case_count+=1
#         if char.islower():
#             lower_case_count+=1
    
#     print("UPPER CASE: ",upper_case_count)
#     print("LOWER CASE: ",lower_case_count)

# sentence = input("Enter a sentence: ")
# count_letters(sentence)

#  12> Square root of [(2 * C * D)/H]

# import math

# def calculate_Q(D_values):
#     C = 50
#     H = 30
#     Q_values = []
    
#     for D in D_values:
#         Q = math.sqrt((2 * C * int(D)) / H)
#         Q_values.append(int(Q))  # appending the integer value of Q
    
#     return Q_values

# def main():
#     # Input the values of D as a comma-separated sequence
#     D_input = input("Enter comma-separated values for D: ")
#     D_values = D_input.split(',')
    
#     # Calculate and print the Q values
#     Q_values = calculate_Q(D_values)
#     print("Output values:", ",".join(map(str, Q_values)))

# if __name__ == "__main__":
#     main()

#  13> Creating a class in python

# import math

# class Shape:
#     def area(self):
#         pass
    
#     def perimeter(self):
#         pass

# class Circle(Shape):
#     def __init__(self, radius):
#         self.radius = radius
        
#     def area(self):
#         return math.pi * self.radius ** 2
    
#     def perimeter(self):
#         return 2 * math.pi * self.radius

# class Square(Shape):
#     def __init__(self, side_length):
#         self.side_length = side_length
    
#     def area(self):
#         return self.side_length ** 2
    
#     def perimeter(self):
#         return 4 * self.side_length

# class Triangle(Shape):
#     def __init__(self, side1, side2, side3):
#         self.side1 = side1
#         self.side2 = side2
#         self.side3 = side3
    
#     def area(self):
#         s = (self.side1 + self.side2 + self.side3) / 2
#         return math.sqrt(s * (s - self.side1) * (s - self.side2) * (s - self.side3))
    
#     def perimeter(self):
#         return self.side1 + self.side2 + self.side3

# # Example usage:
# circle = Circle(5)
# print("Circle area:", circle.area())
# print("Circle perimeter:", circle.perimeter())

# square = Square(4)
# print("Square area:", square.area())
# print("Square perimeter:", square.perimeter())

# triangle = Triangle(3, 4, 5)
# print("Triangle area:", triangle.area())
# print("Triangle perimeter:", triangle.perimeter())


# def generate_square_dict(n):
#     # Create a dictionary with (i, i*i) pairs
#     square_dict = {}
#     for i in range(1, n + 1):
#         square_dict[i] = i * i
#     return square_dict

# def main():
#     # Input the integral number 'n'
#     n = int(input("Enter an integral number: "))

#     # Generate the dictionary
#     result = generate_square_dict(n)

#     # Print the dictionary
#     print(result)

# if __name__ == "__main__":
#     main()
        