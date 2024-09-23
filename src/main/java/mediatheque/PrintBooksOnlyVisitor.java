package mediatheque;

public class PrintBooksOnlyVisitor implements Visitor {
    
    public void visit(Book item) {
        System.out.println("Livre : " + item.getTitle() + " de " + item.getAuthor());
    }
    public void visit(CD item) {
        // on ne fait rien
    }
}
