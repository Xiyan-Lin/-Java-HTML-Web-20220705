package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/employee")
public class EmployeeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// UTF-8 編碼
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		// 接收 request 資訊 (瀏覽器傳來的表單資料)
		String empName = req.getParameter("empName");
		String empAge = req.getParameter("empAge");
		String empSex = req.getParameter("empSex");
		String empPos = req.getParameter("empPos");
		String empBirth = req.getParameter("empBirth");
		String[] empLang = req.getParameterValues("empLang");
		String empMemo = req.getParameter("empMemo");
		
		// 回傳 response 給前端
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>員工資料表單回應</title><link rel=\"stylesheet\" href=\"https://unpkg.com/purecss@2.1.0/build/pure-min.css\"></head>");
		out.println("<body style=\"padding: 15px\">");
		out.println("<form class=\"pure-form\">");
		out.println("<fieldset>");
		out.println("<legend>員工資料表單回應</legend>");
		out.println("姓名: " + empName);
		out.println("年齡: " + empAge);
		out.println("性別: " + empSex);
		out.println("階級: " + empPos);
		out.println("生日: " + empBirth);
		out.println("程式: " + Arrays.toString(empLang));
		out.println("備註: " + empMemo);
		out.println("</fieldset>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
	
}
