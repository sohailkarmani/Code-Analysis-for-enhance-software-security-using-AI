# Stack Overflow
#Stack overflow happens when the program exhausts the stack memory, often caused by deep or infinite recursion.
def recursive_function(counter):
    #  Recursive function call
    print(f"Recursion depth: {counter}")
    if counter > 0:
        recursive_function(counter - 1)
    else:
        print("Recursion base case reached")

#   This will cause a stack overflow if the recursion goes too deep
recursive_function(10000)  # Set a high number to cause stack overflow
