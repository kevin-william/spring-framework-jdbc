package autonomous.repositories;

import autonomous.entities.Task;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ITaskRepository extends CrudRepository<Task, Long> {

//    List<Task> findByName(String NOME);

    @Modifying
    @Query("UPDATE TASK SET NOME = :NOME WHERE id = :id")
    boolean updateByName(@Param("id") Long id, @Param("NOME") String NOME);
}
