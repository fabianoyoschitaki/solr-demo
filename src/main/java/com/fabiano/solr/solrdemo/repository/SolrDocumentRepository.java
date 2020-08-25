package com.fabiano.solr.solrdemo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import com.fabiano.solr.solrdemo.pojo.Document;

@Repository
public interface SolrDocumentRepository extends SolrCrudRepository<Document, Long>{
    @Query("document_content:*?0*")
    Page<Document> findByDocumentContent(String searchTerm, Pageable pageable);
    
    @Query("document_content:*?0* OR document_category:*?0* OR document_title:*?0*")
    Page<Document> findByCustomerQuery(String searchTerm, Pageable pageable);
}
