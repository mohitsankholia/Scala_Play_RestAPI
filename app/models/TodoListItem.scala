package models

/**
 * @author Mohit Sankholia 
 *         on 22/01/23
 */

case class TodoListItem(id: Long, description: String, isItDone: Boolean)

case class NewTodoListItem(description: String,  isItDone: Boolean)