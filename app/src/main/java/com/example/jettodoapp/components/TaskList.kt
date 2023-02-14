package com.example.jettodoapp.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.room.Delete
import com.example.jettodoapp.Task

@Composable
fun TaskList(
    tasks: List<Task>,
    onClickRow: (Task) -> Unit,
    onCLickDelete: (Task) -> Unit
) {
    LazyColumn {
        items(tasks) { task ->
            TaskRow(
                task = task,
                onClickRow = { onClickRow(task) },
                onClickDelete = { onCLickDelete(task) }
            )
        }
    }
}