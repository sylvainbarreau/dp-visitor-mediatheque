package mediatheque;

public class VisitorItemPrinter implements ItemVisitor {
    
    public void visit(Book item) {
        System.out.println("Livre : " + item.getTitle() + " de " + item.getAuthor());
    }
    public void visit(CD item) {
        System.out.println("CD : " + item.getTitle() + " (" + item.getNumberOfTracks() + " pistes)");
    }
}
