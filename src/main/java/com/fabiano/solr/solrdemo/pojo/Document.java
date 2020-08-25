package com.fabiano.solr.solrdemo.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import lombok.Data;

@Data
@SolrDocument(collection = "Document")
public class Document {
    @Id
    @Indexed(name = "id", type = "string")
    private String documentId;
    
    @Indexed(name = "document_title", type = "string")
    private String documentTitle;
    
    @Indexed(name = "document_category", type = "string")
    private String documentCategory;
    
    @Indexed(name = "document_content", type = "string")
    private String documentContent;
}
