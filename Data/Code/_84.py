# Simple to-do list manager that adds and lists tasks.
def add_task(tasks, task):
    tasks.append(task)
    print(f"Task added: {task}")

def list_tasks(tasks):
    for index, task in enumerate(tasks, start=1):
        print(f"{index}. {task}")

if __name__ == "__main__":
    tasks = []
    add_task(tasks, "Complete Python project")
    list_tasks(tasks)
