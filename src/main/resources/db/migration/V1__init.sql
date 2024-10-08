USE bookdb;

DROP TABLE IF EXISTS books CASCADE;

CREATE TABLE books (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    isbn VARCHAR(20) NOT NULL UNIQUE,
    publication_date DATE NOT NULL
);

INSERT INTO books (title, author, isbn, publication_date) VALUES
    ('To Kill a Mockingbird', 'Harper Lee', '978-0446310789', '1960-07-11'),
    ('1984', 'George Orwell', '978-0451524935', '1949-06-08'),
    ('The Great Gatsby', 'F. Scott Fitzgerald', '978-0743273565', '1925-04-10');
