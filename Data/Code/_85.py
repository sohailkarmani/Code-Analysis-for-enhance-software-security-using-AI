# Perform list operations such as finding and removing duplicates.
def find_duplicates(data_list):
    return [item for item in data_list if data_list.count(item) > 1]

def remove_duplicates(data_list):
    return list(set(data_list))

if __name__ == "__main__":
    data = [1, 2, 3, 4, 4, 5, 6, 6, 7]
    print("Duplicates:", find_duplicates(data))
    print("Unique List:", remove_duplicates(data))
