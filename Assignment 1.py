# -*- coding: utf-8 -*-
"""
Everett's Assignment 1 
This assignment is a game between you and an AI. It asks you to guess a random number
between 1 and 10. You have three attempts. If you don't get the correct number in
three attempts, you perish. If you guess correctly with three attempts, you win!
"""
import random
value = random.randint(1,10)
counter=0
print ("Welcome to The Python Guessing Game! You will guess a Number between 1 and 10. Enter Your Guess Now or Perish!")
#print(value) # This print statement is so you can see the random number for grading purposes. Please take out if you're seriously playing the game
while counter < 3:
    guess = int(input("Guess: "))
    counter+=1
    if guess == value:
        counter=3
    if guess < value:
        print("Your Guess is too low! You have made " + str(counter) + " attempt(s)! Try Again Human!")
    if guess > value:
        print("Your Guess is too high! You have made " + str(counter) + " attempt(s)! Try Again Human!")
if guess != value:
    print("You have failed the game human! PERISH BY THE HAND OF AI!! ")
if guess==value:
    print("You Win Human! I knew you could do it!!")
    
    

 
    
    
    
