n = 3
for row in range(3):
    print(" " * (n-row-1), end="")
    print("*" * ((2*row) + 1), end="") # end function is tell to Whether to print new Line or not like : end=
    print(" " * (n-row-1))
