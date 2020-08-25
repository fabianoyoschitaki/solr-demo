package com.fabiano.solr.solrdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.fabiano.solr.solrdemo.pojo.Document;
import com.fabiano.solr.solrdemo.repository.SolrDocumentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SolrDocumentService implements DocumentService {

    private static final int PAGE_ELEMENTS = 10;
    @Autowired
    private SolrDocumentRepository solrDocumentRepository;
    
    @Override
    public List<Document> searchDocumentByContent(String content, int page) {
        log.info("searchDocumentByContent: {}", content);
        return solrDocumentRepository.findByDocumentContent(content, PageRequest.of(page, PAGE_ELEMENTS)).getContent();
    }

    @Override
    public Document saveDocument(Document document) {
        log.info("save: {}", document);
        return solrDocumentRepository.save(document);
    }
}
