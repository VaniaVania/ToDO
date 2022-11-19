package com.example.ivan

import android.content.Context
import androidx.core.content.ContextCompat
import java.time.LocalDate
import java.time.LocalTime
import java.util.*
//Цей клас створено виключно для опису поведінки завдання
class TaskItem(
    var name: String,
    var desc: String,
    var dueTime: LocalTime?,
    var completedDate: LocalDate?,
    var id: UUID = UUID.randomUUID()
)
{
    fun isCompleted() = completedDate != null
    fun imageResource(): Int = if(isCompleted()) R.drawable.checked_24 else R.drawable.unchecked_24
    fun imageColor(context: Context): Int = if(isCompleted()) red(context) else black(context)

    private fun red(context: Context) = ContextCompat.getColor(context,
        android.R.color.holo_red_light
    )
    private fun black(context: Context) = ContextCompat.getColor(context, R.color.black)
}