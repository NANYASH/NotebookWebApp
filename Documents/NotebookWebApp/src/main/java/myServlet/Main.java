package myServlet;

import myServlet.Controller.Controller;
import myServlet.Model.Model;
import myServlet.View.View;

/**
 * Created by nanya on 7/28/17.
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
        model.getNotebook().addNote(controller.createNote());
        System.out.println(model.getNotebook().getNoteList().get(0));
    }

}
