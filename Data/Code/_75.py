# secure_config_loader.py
import json

def load_config(file_path):
    try:
        with open(file_path, "r") as file:
            config = json.load(file)
            print("Configuration loaded successfully.")
            return config
    except json.JSONDecodeError:
        print("Error: Invalid JSON format.")
    except FileNotFoundError:
        print("Configuration file not found.")
    return {}

if __name__ == "__main__":
    config = load_config("config.json")
    print(config)
 