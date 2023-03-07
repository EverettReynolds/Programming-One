# -*- coding: utf-8 -*-
"""
Created on Thu Sep  5 09:27:51 2019

@author: Everett Reynolds
"""
#1-1 # This code stores a message then prints it
cowboy = 'Yeehaw!'
print(cowboy)
#1-2 # This code stores a message then prints it, reassigns the same variable with a different message, then prints again
cowboy = 'Yeehaw!'
print(cowboy)
cowboy="It's High Noon"
print(cowboy)
#1-3 # This code adds,subtracts,multiplies, and divides various numbers to get the same result of 8
print(7+1)
print(444-436)
print(4*2)
print(int(64/8))
#1-4 # This code assigns my favorite number to a variable and prints it out with a clever message
favNum = 24
print('What is my favorite number?' +' Well, how many hours are in a day? ' + str(favNum) + '. That is my favorite number.')
#1-5 # This code assigns numbers to seconds and minutes given, then calculates the total amount of seconds using operations and prints
secs= 42
minsGiven= 42
mins=minsGiven
secsGiven= mins*60 + secs
print( 'The amount of seconds in ' +str(minsGiven)+' minutes and ' + str(secs) + ' seconds is ' + str(secsGiven))
#1-6 # This code has a set number of kilometers given, then calculates miles using the kilometers, and prints out the result, rounding to two decimal places
kmGiven=10
miles=kmGiven/1.61
print('There are ' + str(round(miles,2)) + ' miles in ' + str(kmGiven) + ' kilometers.')
#1-7 This code defines the initial KM , seconds and minutes given and determines one's pace using these numbers and an algorithm
kmGiven=10
secsGiven= 42
minsGiven= 42
mins=minsGiven
secs= minsGiven*60 + secsGiven
miles=kmGiven/1.61
pace= round(secs/miles,1) 
averageMin = int(pace / 60)
averageSec = pace % 60
# This code finds the speed of a person in MPH using conversions of total miles and seconds into miles per hour
mySpeed=round((miles/secs)*3600,2)
print(mySpeed)
print("My Average Pace per mile was " + str(averageMin) + " minutes and " + str(averageSec) + " seconds.")
print("If I can run 10 km in 42 minutes and 42 seconds, My average speed " + str(mySpeed) + " miles per hour")
# 3600 seconds 1 hour
# 60 minutes 1 hour
#1.61 KM in 1 Mile