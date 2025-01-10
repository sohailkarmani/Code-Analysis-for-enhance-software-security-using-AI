# backup_files.py

import os
import shutil
from datetime import datetime

def create_backup(source_folder, backup_folder):
    try:
        timestamp = datetime.now().strftime("%Y%m%d%H%M%S")
        backup_path = os.path.join(backup_folder, f"backup_{timestamp}")
        shutil.copytree(source_folder, backup_path)
        print(f"Backup created at {backup_path}")
    except Exception as e:
        print("Error creating backup:", e)

if __name__ == "__main__":
    create_backup("data", "backups")
