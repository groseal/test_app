package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import repository.TaskDao;
import repository.TaskDaoImpl;
import service.TaskService;
import service.TaskServiceImpl;

@Configuration
@PropertySource("classpath:/src/main/resources/application.properties")
public class AppConfig {
    @Bean
    TaskDao taskDao(@Value("${tasks.path}") String tasksPath) {
        return new TaskDaoImpl(tasksPath);
    }

    @Bean
    TaskService taskService(TaskDaoImpl taskDao) {
        return new TaskServiceImpl(taskDao);
    }
}
