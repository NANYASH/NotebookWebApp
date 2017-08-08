package myServlet;

import myServlet.Controller.Controller;
import myServlet.Model.Model;
import myServlet.View.View;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/NotebookServlet")
public class NotebookServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private Model model;
    private View view;
    private Controller controller;


    public NotebookServlet() {
        model = new Model();
        view = new View();
        controller = new Controller(model, view);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String[]reqArray={
                req.getParameter("secondName"),
                req.getParameter("firstName"),
                req.getParameter("patronymic"),
                req.getParameter("nickname"),
                req.getParameter("comment"),
                req.getParameter("groop"),
                req.getParameter("email"),
                req.getParameter("mobPhone"),
                req.getParameter("skype"),
                req.getParameter("index"),
                req.getParameter("city"),
                req.getParameter("street"),
                req.getParameter("buildingNumber"),
                req.getParameter("apartmentNumber"),
                req.getParameter("createDate"),
                req.getParameter("editDate")};
        controller.setUserArray(reqArray);
        controller.setFields();
        model.getNotebook().addNote(controller.createNote());
        PrintWriter printWriter = resp.getWriter();
        printWriter.println(model.getNotebook().getNoteList().get(0).toString());



    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


}
