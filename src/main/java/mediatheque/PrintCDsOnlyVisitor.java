package mediatheque;

public class PrintCDsOnlyVisitor implements Visitor {
    
    public void visit(Book item) {
        // on ne fait rien
    }
    public void visit(CD item) {
        System.out.println("CD : " + item.getTitle() + " (" + item.getNumberOfTracks() + " pistes)");
    }
}
