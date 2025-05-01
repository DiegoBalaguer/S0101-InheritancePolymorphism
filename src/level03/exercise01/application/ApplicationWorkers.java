package level03.exercise01.application;

import level03.exercise01.exceptions.UnknownEditorException;
import level03.exercise01.model.Editor;
import level03.exercise01.utils.ConsoleUtils;
import level03.exercise01.utils.ProgramUtils;
import level03.exercise01.utils.StringUtils;

import java.util.ArrayList;

/**
 * PROGRAM: ApplicationWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class ApplicationWorkers {

    private ArrayList<Editor> editors;
    private NewsMenuController newsMenuController;

    public ApplicationWorkers(ArrayList<Editor> editors) {
        this.editors = editors;
    }

    public void createEditor() {
        System.out.println(System.lineSeparator() + "CREATE EDITOR.................." + System.lineSeparator());

        String name = enterEditorName();
        String dni = enterEditorDni();
        addEditor(name, dni);
    }

    private void addEditor(String name, String dni) {
        editors.add(new Editor(name, dni));
        System.out.println("New editor registered into the system.");
    }

    public void removeEditorByName() {
        System.out.println(System.lineSeparator() + "DELETE EDITOR.................." + System.lineSeparator());
        try {
            Editor editor = searchEditorByName(enterEditorName());
            removeEditor(editor);
        } catch (UnknownEditorException e) {
            System.err.println("Error: " + e);
        }
    }

    private void removeEditor(Editor editor) {
        editors.remove(editor);
        System.out.println(
                "The editor is deleted from the system: " + System.lineSeparator() + editor);
    }

    public void modifySalaryEditors() {
        System.out.println(System.lineSeparator() + "EDITOR INTRO SALARY.................." + System.lineSeparator());
        double salary = enterEditorSalary();
        setSalaryEditors(salary);
    }

    private void setSalaryEditors(double salary) {
        Editor.setSalary(salary);
        System.out.println("The new editors' salary is: " + salary + "€.");
    }

    private Editor searchEditorByName(String editorSearch) throws UnknownEditorException {
        for (Editor editor : editors) {
            if (editor.getName().equalsIgnoreCase(editorSearch)) {
                return editor;
            }
        }
        throw new UnknownEditorException();
    }

    public void showListEditors() {
        System.out.println(System.lineSeparator() + "EDITORS LIST..................");

        System.out.println("  \t" + makeHeadLineEditors());

        for (Editor editor : editors) {
            System.out.println("**\t" + makeLineEditors(editor.listEditor()));
        }
    }

    public void showListEditorsWithId() {
        System.out.println(System.lineSeparator() + "EDITORS LIST WITH ID..................");

        System.out.println("Index \t" + makeHeadLineEditors());
        for (int i = 0; i < editors.size(); i++) {
            System.out.println((i + 1) + ".- " + editors.get(i).getName());
        }
    }

    private int enterEditorId() {
        do {
            try {
                showListEditorsWithId();
                int idEditor = ConsoleUtils.readRequiredInt("Type editor's id: ") - 1;
                ProgramUtils.validateIndex(idEditor, editors.size());
                return idEditor;
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    public void newsEditorManagerByEditorId() {
        System.out.println(System.lineSeparator() + "MANAGEMENT NEWS.................." + System.lineSeparator());

        int idEditor = enterEditorId();
        newsMenuController = new NewsMenuController(editors.get(idEditor));
    }

    private String enterEditorName() {
        return ConsoleUtils.readRequiredString("Type editor's name: ");
    }

    private String enterEditorDni() {
        return ConsoleUtils.readRequiredString("Type editor's dni: ");
    }

    private double enterEditorSalary() {
        return ConsoleUtils.readRequiredDouble("Type editor's salary: ");
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

        return StringUtils.formatToChars(dataLine.get(i++), 16) + " \t " +
                StringUtils.formatToChars(dataLine.get(i++), 15) + " \t " +
                StringUtils.formatToChars(dataLine.get(i++), 10) + " \t " +
                StringUtils.formatToChars(dataLine.get(i++), 10) + " \t " +
                StringUtils.formatToChars(dataLine.get(i), 10);
    }
}
