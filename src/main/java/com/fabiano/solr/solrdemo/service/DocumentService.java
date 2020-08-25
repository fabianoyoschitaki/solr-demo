package com.fabiano.solr.solrdemo.service;

import java.util.List;

import com.fabiano.solr.solrdemo.pojo.Document;

public interface DocumentService {
    public List<Document> searchDocumentByContent(String content, int page);
    
    public Document saveDocument(Document document);
}
