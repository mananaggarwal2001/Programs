def increament(num):
    try:
        return int(num) +1
    except:
        raise ValueError("This is the error - Manan") # this is used for raising the custom error in the python

# a=increament("manan is a good boy") will throw the custom error in the python
a= increament(10)
print(a)