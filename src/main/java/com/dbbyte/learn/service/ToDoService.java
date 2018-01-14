package com.dbbyte.learn.service;

import java.util.List;

import com.dbbyte.learn.entity.ToDo;

public interface ToDoService {
	public List<ToDo> getAllToDo();
	public ToDo getToDoById(long id);
	public ToDo saveToDo(ToDo todo);
	public void removeToDo(ToDo todo);
}