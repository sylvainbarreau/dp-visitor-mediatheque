package mediatheque;

public class PrintCatalogVisitor implements Visitor {
    
    public void visit(Book item) {
        System.out.println("Livre : " + item.getTitle() + " de " + item.getAuthor());
    }
    public void visit(CD item) {
        System.out.println("CD : " + item.getTitle() + " (" + item.getNumberOfTracks() + " pistes)");
    }

}
