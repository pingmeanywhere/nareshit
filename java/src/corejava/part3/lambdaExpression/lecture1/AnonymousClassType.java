package corejava.part3.lambdaExpression.lecture1;

public class AnonymousClassType {

    // Anonymous Class
    static Student linus = new Student() {

        public void writeNotes() {
            System.out.println("Linus is writing notes");
        }

        public void study() {
            System.out.println("Linus is studying");
        }
    };

    static void main(String[] args) {

        linus.writeNotes();
        linus.study();

    }
}

interface Student {
    void writeNotes();

    void study();
}
