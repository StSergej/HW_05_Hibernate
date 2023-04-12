
drop database if exists library;

create database library;

use library;

drop table if exists library.authors;
drop table if exists library.books;

select * from library.authors;
select * from library.books;

describe library.authors;
describe library.books;

select last_name, books.name from library.authors 
join library.books
on authors.id = books.author_id
where authors.id = 4;