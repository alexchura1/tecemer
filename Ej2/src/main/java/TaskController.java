import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TaskController")
public class TaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TaskController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<Task> tasks = (ArrayList<Task>) session.getAttribute("tasks");
		if (tasks == null) {
			tasks = new ArrayList<Task>();
			session.setAttribute("tasks", tasks);
		}
		
		String action = request.getParameter("action");
		if (action != null && action.equals("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Task taskToRemove = null;
			for (Task task : tasks) {
				if (task.getId() == id) {
					taskToRemove = task;
					break;
				}
			}
			tasks.remove(taskToRemove);
		}
		
		request.setAttribute("tasks", tasks);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<Task> tasks = (ArrayList<Task>) session.getAttribute("tasks");
		if (tasks == null) {
			tasks = new ArrayList<Task>();
			session.setAttribute("tasks", tasks);
		}
		
		String action = request.getParameter("action");
		if (action != null && action.equals("add")) {
			String taskName = request.getParameter("taskName");
			Task newTask = new Task(taskName);
			tasks.add(newTask);
		}
		
		request.setAttribute("tasks", tasks);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
