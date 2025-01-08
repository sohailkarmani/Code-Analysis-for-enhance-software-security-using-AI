#  Use-After-Free
# Use-After-Free occurs when a program continues to use a memory location after it has been freed, leading to undefined behavior.
import ctypes

def use_after_free():
    #Allocate memory for a string buffer
    buffer = ctypes.create_string_buffer(b"Hello, World!")

    # Free the memory
    ctypes.memset(buffer, 0, len(buffer))
    print("Buffer after free:", buffer.value)

    #Accessing memory after it is freed (use-after-free vulnerability)
    print("Accessing freed memory:", buffer.value)  # Undefined behavior

use_after_free()
