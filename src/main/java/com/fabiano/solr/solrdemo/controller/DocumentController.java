package com.fabiano.solr.solrdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabiano.solr.solrdemo.pojo.Document;
import com.fabiano.solr.solrdemo.service.DocumentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class DocumentController {

    @Autowired
    private DocumentService documentService;
    
    @GetMapping("/documents/{content}/{page}")
    public List<Document> getDocument(@PathVariable String content, @PathVariable Integer page) {
        log.info("Getting document by content {} and page {}", content, page);
        return documentService.searchDocumentByContent(content, page);
    }
    
    @PostMapping("/documents")
    public Document createOrder(@RequestBody Document document) {
        return documentService.saveDocument(document);
    }
}
