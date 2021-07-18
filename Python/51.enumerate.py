list1=["manan",False,True,"Naman",40,6.2]
# index=0 this is the manual method in the python.
# for item in list1:
#     print(item , index)
#     index+=1

# to write the above code in the two lines :
for index , item in enumerate(list1):
    # print(item)
    print(index , item)