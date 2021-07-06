subject1= float(input("Enter the Marks of the Subject1 out of 20: "))
subject2= float(input("Enter the Marks of the Subject2 out of 20: "))
subject3= float(input("Enter the Marks of the Subject3 out of 20: "))

total=subject1+ subject2 + subject3
percentageOfTheMarks= (total/60)*100

P_Subject1= (subject1/20)*100
P_Subject2= (subject2/20)*100
P_Subject3= (subject3/20)*100
print("Total Percentage is : ", percentageOfTheMarks)
print("Subject 1 Percentage is : ", P_Subject1)
print("Subject 2 Percentage is : ", P_Subject2)
print("Subject 3 Percentage is : ", P_Subject3)

if(percentageOfTheMarks>=40 and P_Subject1>=33 and P_Subject2>=33 and P_Subject3>=33):
    print("The Student is Pass ")
else:
    print("The Student is fail")