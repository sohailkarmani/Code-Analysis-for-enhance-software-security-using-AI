# Read data from a JSON file and handle errors gracefully.
import json

def read_json(file_path):
    try:
        with open(file_path, "r") as file:
            data = json.load(file)
        return data
    except FileNotFoundError:
        print(f"File {file_path} not found.")
    except json.JSONDecodeError:
        print("Error decoding JSON.")
    return {}

if __name__ == "__main__":
    data = read_json("data.json")
    print(data)
