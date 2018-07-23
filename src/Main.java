import org.xhtmlrenderer.pdf.ITextRenderer;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            TransformerFactory tFactory = new net.sf.saxon.TransformerFactoryImpl();
            Transformer transformer = tFactory.newTransformer(new StreamSource("helloworld.xslt"));
            transformer.setOutputProperty("method", "xhtml");

            StreamResult result = new StreamResult(new FileOutputStream("sample.html"));
            transformer.transform(new StreamSource("hello.xml"), result);

            String File_To_Convert = "sample.html";
            String url = new File(File_To_Convert).toURI().toURL().toString();
            System.out.println("" + url);

            String HTML_TO_PDF = "ConvertedFile.pdf";
            OutputStream os = new FileOutputStream(HTML_TO_PDF);
            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocument(url);
            renderer.layout();
            renderer.createPDF(os);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}