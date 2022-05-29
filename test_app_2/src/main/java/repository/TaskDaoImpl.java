package repository;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class TaskDaoImpl implements TaskDao {
    private final String repository;

    public TaskDaoImpl(String repository) {
        this.repository = repository;
    }
}
