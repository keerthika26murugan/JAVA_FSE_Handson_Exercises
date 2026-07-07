// FactoryPatternDemo.java
public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Create a Word document using its factory
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.display();

        // Create a PDF document using its factory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.display();

        // Create an Excel document using its factory
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.display();
    }
}