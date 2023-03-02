package Generics;

public class Newspaper extends Media{
    private String editor;

    public Newspaper(String title, String editor) {
        super(title);
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString(){
        return "Newspaper title: " + getTitle() + " ,name of the editor: " + editor + ".";
    }
}
