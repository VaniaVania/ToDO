package com.example.ivan

interface TaskItemClickListener
{
    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
    //інтерфейс слухача кліків, реалізація в інших класах
}