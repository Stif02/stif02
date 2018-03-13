package ru.ivmiit.servlets;

        import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.ArrayList;

public class HomeServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Andrei");
        al.add("Vasya");
        al.add("Kostya");

        PrintWriter writer = response.getWriter();
        for (int i=0;i<al.size();i++){
            writer.write(al.get(i));
        }

    }
}

