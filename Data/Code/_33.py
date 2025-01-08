# Heap Overflow
# Heap overflow happens when data is written beyond the bounds of a heap-allocated buffer, potentially leading to memory corruption.
def heap_overflow():
     
    buffer = [0] * 10

    print("Buffer before overflow:", buffer)
    
    #Overflow by writing more data than the buffer can hold
    for i in range(20):  # Writing beyond buffer's capacity (heap overflow)
        buffer[i] = i

    print("Buffer after overflow:", buffer)

heap_overflow()
