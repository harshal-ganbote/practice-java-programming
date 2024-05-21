SELECT a.*,
  b.book_title
FROM Books b
  RIGHT JOIN Authors a USING (author_id)
WHERE b.book_id IS NULL
ORDER BY a.author_name;