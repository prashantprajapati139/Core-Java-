import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");


        request.setAttribute("fname", fname);
        request.setAttribute("lname", lname);
        request.setAttribute("email", email);
        request.setAttribute("mobile", mobile);
        request.setAttribute("gender", gender);
        request.setAttribute("password", password);

        
        request.getRequestDispatcher("/displayStudent.jsp").forward(request, response);
    }
}
      
<!DOCTYPE html>
<html>
<head>
    <title>Student Information</title>
</head>
<body>
    <h2>Student Information</h2>
    <p>
        First Name: ${fname}<br>
        Last Name: ${lname}<br>
        Email: ${email}<br>
        Mobile: ${mobile}<br>
        Gender: ${gender}<br>
        Password: ${password}
    </p>
</body>
</html>