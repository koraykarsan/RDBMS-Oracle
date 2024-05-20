# RDBMS-Oracle

This project demonstrates setting up Oracle Database 19c Express Edition using Docker. It includes instructions for building and running the Docker container, connecting to the database with SQL Developer, creating a `BOOK` table, and populating it with a Java application. Also, it provides an overview of SQL vs NoSQL databases.

## Differences between SQL and NoSQL Database Systems

**SQL Databases:**

1. **Structure**:
   - **Schema-Based**: SQL databases use a predefined schema to define the structure of the data. This ensures data integrity and enforces rules on the data stored.
   - **Table-Based**: Data is stored in tables, which consist of rows and columns.
   - **Relational**: These databases use relations (tables) to store and manage data.

2. **Query Language**:
   - **SQL**: Structured Query Language (SQL) is used for defining and manipulating data. It includes operations like SELECT, INSERT, UPDATE, DELETE, etc.

3. **ACID Transactions**:
   - **Atomicity, Consistency, Isolation, Durability (ACID)**: SQL databases provide strong transactional support ensuring data integrity.

4. **Use Cases**:
   - **Complex Queries**: Suitable for applications requiring complex queries and transactions, such as banking systems, e-commerce platforms, and ERP systems.

5. **Examples**:
   - MySQL, PostgreSQL, Oracle Database, Microsoft SQL Server.

**NoSQL Databases:**

1. **Structure**:
   - **Schema-Less**: NoSQL databases can store data without a predefined schema, offering flexibility in data storage.
   - **Various Data Models**: Includes document-based, key-value pairs, wide-column stores, and graph databases.
   
2. **Query Language**:
   - **No Standard Query Language**: Different NoSQL databases have their own query languages or APIs. For example, MongoDB uses a JSON-like query language, while Cassandra uses CQL (Cassandra Query Language).

3. **BASE Transactions**:
   - **Basically Available, Soft state, Eventually consistent (BASE)**: NoSQL databases often sacrifice ACID properties for scalability and performance, providing eventual consistency rather than immediate consistency.

4. **Use Cases**:
   - **Large Scale Data**: Suitable for applications requiring high scalability, flexibility, and handling of large volumes of unstructured or semi-structured data, such as social media platforms, big data applications, and real-time web apps.

5. **Examples**:
   - MongoDB, Cassandra, Redis, CouchDB, Neo4j.


