package autonomous.controllers;

import autonomous.entities.Task;
import autonomous.repositories.ITaskRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    private final ITaskRepository taskRepository;

    public TaskController(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/Tasks")
    Iterable<Task> GetAll(){
        return taskRepository.findAll();
    }

    @PostMapping("/Tasks")
    Task SaveTask(Task task){
        return taskRepository.save(task);
    }
}
