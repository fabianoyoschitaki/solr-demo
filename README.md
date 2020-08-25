
# Solr Demo
Solr Demo using Spring Boot with Spring Data Solr

## Solr setup
Download and start Apache Solr:\
`./solr start -p <tcp port> (default 8983)`
    
Creating a core:\
`./solr create -c <name of core>`

---
## Consuming REST API:

### Creating new Document
```
POST /api/v1/documents
{
    "documentTitle": "Document Fabiano",
    "documentCategory": "Action",
    "documentContent": "This is a long string representing Fabiano document's content with category action"
}
```

### Paginated Document search by content
```
GET /api/v1/documents/:content/:page
```
