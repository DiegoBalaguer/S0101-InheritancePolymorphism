package level03.exercice01.aplication;

import level03.exercice01.exceptions.UnknownEditorException;
import level03.exercice01.model.Editor;
import level03.exercice01.model.News;
import level03.exercice01.utils.Utils;

import java.util.ArrayList;

public class EditorManager {

    private ArrayList<Editor> editors;
    private NewsManager newsManager;

    public EditorManager(ArrayList<Editor> editors) {

        this.editors = editors;
    }

    public void addEditor() {

        System.out.println(System.lineSeparator() + "CREATE EDITOR.................." + System.lineSeparator());

        do {
            String name = enterEditorName();
            String dni = enterEditorDni();

            try {
                editors.add(new Editor(name, dni));
                System.out.println("New editor registered into the system.");
                return;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    public void removeEditor() {

        System.out.println(System.lineSeparator() + "DELETE EDITOR.................." + System.lineSeparator());

        try {
            Editor editor = searchEditor(enterEditorName());
            System.out.println(
                    "The editor is deleted from the system: " + System.lineSeparator() + editor);
            editors.remove(editor);
        } catch (UnknownEditorException e) {
            System.out.println("Error: " + e);
        }
    }

    public void setSalaryEditor() {

        System.out.println(System.lineSeparator() + "EDITOR INTRO SALARY.................." + System.lineSeparator());

        double salary = enterEditorSalary();

        try {
            Editor.setSalary(salary);
            System.out.println("The new editors' salary is: " + salary + "€.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
        }
    }

    public Editor searchEditor(String editorSearch) throws UnknownEditorException {

        for (Editor editor : editors) {
            if (editor.getName().equalsIgnoreCase(editorSearch)) {
                return editor;
            }
        }
        throw new UnknownEditorException();
    }

    public void listEditors() {

        System.out.println(System.lineSeparator() + "EDITORS LIST..................");

        System.out.println("  \t" + makeHeadLineEditors());

        for (Editor editor : editors) {
            System.out.println("**\t" + makeLineEditors(editor.listEditor()));
        }
    }

    public void listEditorsWithId() {

        System.out.println(System.lineSeparator() + "EDITORS LIST WITH ID..................");

        System.out.println("Index \t" + makeHeadLineEditors());
        for (int i = 0; i < editors.size(); i++) {
            System.out.println((i + 1) + ".- " + editors.get(i).getName());
        }
    }

    public void newsListAllEditors() {

        System.out.println(System.lineSeparator() + "NEWS LIST..................");

        System.out.println(Utils.formatToChars("Editor", 16) + " \t " + NewsManager.makeHeadLineNews());

        for (Editor editor : editors) {
            if (!editor.getNews().isEmpty()) {
                for (News news : editor.getNews()) {
                    System.out.println(Utils.formatToChars(editor.getName(), 16) + " \t " +
                            NewsManager.makeLineNews(news.listNews()));
                }
            }
        }
    }

    private int introEditorId() {

        do {
            try {
                listEditorsWithId();
                int idEditor = Utils.valueInt("Type editor's id: ") - 1;
                Utils.validateIndex(idEditor, editors.size());
                return idEditor;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    public void newsEditorManager() {

        System.out.println(System.lineSeparator() + "MANAGEMENT NEWS.................." + System.lineSeparator());

        do {
            try {
                int idEditor = introEditorId();
                NewsManager mnewsManager = new NewsManager(editors.get(idEditor));
                return;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: The editor's id is wrong.");
            }
        } while (true);
    }

    private String enterEditorName() {
        return Utils.valueString("Type editor's name: ");
    }

    private String enterEditorDni() {
        return Utils.valueString("Type editor's dni: ");
    }

    private double enterEditorSalary() {
        return Utils.valueDouble("Type editor's salary: ");
    }

    private String makeHeadLineEditors() {

        ArrayList<String> dataLine = new ArrayList<>();

        dataLine.add("Name");
        dataLine.add("DNI");
        dataLine.add("Salary");
        dataLine.add("Points");
        dataLine.add("Prices");

        return makeLineEditors(dataLine);
    }

    private String makeLineEditors(ArrayList<String> dataLine) {

        int i = 0;

        return Utils.formatToChars(dataLine.get(i++), 16) + " \t " +
                Utils.formatToChars(dataLine.get(i++), 15) + " \t " +
                Utils.formatToChars(dataLine.get(i++), 10) + " \t " +
                Utils.formatToChars(dataLine.get(i++), 10) + " \t " +
                Utils.formatToChars(dataLine.get(i), 10);
    }
}
