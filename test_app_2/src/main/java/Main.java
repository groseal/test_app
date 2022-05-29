import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.TaskDaoImpl;
import service.TaskService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        TaskService service = context.getBean(TaskService.class);
        TaskDaoImpl taskDao = context.getBean(TaskDaoImpl.class);

        service.displayListQuestionsAndAnswers(taskDao.getRepository());
        context.close();
    }
}
