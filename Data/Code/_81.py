# Basic calculator implementation with addition, subtraction, multiplication, and division.
def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    try:
        return a / b
    except ZeroDivisionError:
        return "Cannot divide by zero."

if __name__ == "__main__":
    a, b = 10, 5
    print(f"Sum: {add(a, b)}")
    print(f"Difference: {subtract(a, b)}")
    print(f"Product: {multiply(a, b)}")
    print(f"Quotient: {divide(a, b)}")
