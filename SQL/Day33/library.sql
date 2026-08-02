USE library;

CREATE TABLE Book (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    isbn VARCHAR(20) UNIQUE,
    price DECIMAL(10,2) NOT NULL,
    category VARCHAR(50) DEFAULT 'General'
);

INSERT INTO Book (title, author, isbn, price, category)
VALUES
('Java Programming', 'James Gosling', 'ISBN001', 650.00, 'Programming'),
('Python Basics', 'Guido van Rossum', 'ISBN002', 550.00, 'Programming'),
('Data Structures', 'Mark Allen', 'ISBN003', 720.00, 'Computer Science'),
('SQL Fundamentals', 'John Smith', 'ISBN004', 480.00, 'Database'),
('Operating Systems', 'Abraham Silberschatz', 'ISBN005', 890.00, 'Computer Science');

SELECT * FROM Book
WHERE price > 500;

SELECT * FROM Book
ORDER BY price DESC;

SELECT * FROM Book
LIMIT 2;

CREATE TABLE Student (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL
);

CREATE TABLE Issue_Book (
    issue_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    book_id INT,
    issue_date DATE,
    FOREIGN KEY (student_id) REFERENCES Student(student_id),
    FOREIGN KEY (book_id) REFERENCES Book(book_id)
);

INSERT INTO Student (student_name)
VALUES
('Niranjan'),
('Varad'),
('Aman');

INSERT INTO Issue_Book (student_id, book_id, issue_date)
VALUES
(1, 1, '2026-08-01'),
(2, 3, '2026-08-02'),INSERT INTO Issue_Book (student_id, book_id, issue_date)
VALUES
(1, 1, '2026-08-01'),
(2, 3, '2026-08-02'),
(3, 5, '2026-08-03');
(3, 5, '2026-08-03');

SELECT
    s.student_name,
    b.title,
    i.issue_date
FROM Issue_Book i
JOIN Student s
ON i.student_id = s.student_id
JOIN Book b
ON i.book_id = b.book_id;