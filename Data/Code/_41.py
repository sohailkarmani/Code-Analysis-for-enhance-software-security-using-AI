# race_condition
import threading
import time

balance = 100  # Shared resource

def withdraw(amount):
    global balance
    # Start of critical section
    if balance >= amount:  # Check balance
        time.sleep(0.1)    # Simulate delay (vulnerability occurs here)
        balance -= amount  # Deduct amount
        print(f"Withdrew {amount}. Remaining balance: {balance}")
    else:
        print(f"Insufficient balance for withdrawal of {amount}")
    # End of critical section

# Two threads withdrawing simultaneously
thread1 = threading.Thread(target=withdraw, args=(50,))
thread2 = threading.Thread(target=withdraw, args=(70,))

thread1.start()
thread2.start()

thread1.join()
thread2.join()

# Vulnerability: Race Condition occurs at line 9 (time.sleep(0.1)) because two threads can access
# the balance at the same time, leading to inconsistent behavior.
