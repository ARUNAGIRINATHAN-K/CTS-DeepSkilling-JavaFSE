package com.example.factorymethod;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class FactoryMethodPatternTest {

    @Test
    void testWordDocumentFactoryCreatesWordDocument() {
        DocumentFactory factory = new WordDocumentFactory();
        Document doc = factory.createDocument();
        assertNotNull(doc, "Document should not be null");
        assertInstanceOf(WordDocument.class, doc, "Document should be an instance of WordDocument");
    }

    @Test
    void testPdfDocumentFactoryCreatesPdfDocument() {
        DocumentFactory factory = new PdfDocumentFactory();
        Document doc = factory.createDocument();
        assertNotNull(doc, "Document should not be null");
        assertInstanceOf(PdfDocument.class, doc, "Document should be an instance of PdfDocument");
    }

    @Test
    void testExcelDocumentFactoryCreatesExcelDocument() {
        DocumentFactory factory = new ExcelDocumentFactory();
        Document doc = factory.createDocument();
        assertNotNull(doc, "Document should not be null");
        assertInstanceOf(ExcelDocument.class, doc, "Document should be an instance of ExcelDocument");
    }
}
