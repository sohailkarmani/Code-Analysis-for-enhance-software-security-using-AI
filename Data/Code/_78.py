# Write data to a JSON file with proper formatting.
import json

def write_json(data, file_path):
    try:
        with open(file_path, 'w') as file:
            json.dump(data, file, indent=4)
        print("Data written to JSON file successfully.")
    except Exception as e:
        print("Error writing to JSON file:", e)

if __name__ == "__main__":
    data = {"name": "Alice", "age": 25}
    write_json(data, "data.json")
