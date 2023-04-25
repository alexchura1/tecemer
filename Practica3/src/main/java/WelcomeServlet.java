import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean visited = false;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("visited")) {
                    visited = true;
                    break;
                }
            }
        }

        if (visited) {
            request.setAttribute("message", "Gracias por visitarnos nuevamente.");
        } else {
            Cookie cookie = new Cookie("visited", "true");
            cookie.setMaxAge(60 * 60 * 24 * 365); // 1 year
            response.addCookie(cookie);
            request.setAttribute("message", "Bienvenido a nuestro sitio Web.");
        }

        request.getRequestDispatcher("welcome.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
