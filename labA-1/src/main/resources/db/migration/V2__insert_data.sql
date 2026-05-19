insert into countries (name, continent) values
        ('Macedonia', 'Europe'),
        ('USA', 'North America'),
        ('UK', 'Europe');

insert into authors (created_at, updated_at, name, surname, country_id) values
        (NOW(), NOW(), 'Tome', 'Arsovski', 1),
        (NOW(), NOW(), 'Stephen', 'King', 2),
        (NOW(), NOW(), 'George', 'Orwell', 3);

insert into books (created_at, updated_at, name, category, author_id, state, available_copies) values
        (NOW(), NOW(), 'Beli Mugri', 'NOVEL', 1, 'GOOD', 5),
        (NOW(), NOW(), 'The Shining', 'DRAMA', 2, 'GOOD', 3),
        (NOW(), NOW(), '1984', 'CLASSICS', 3, 'GOOD', 7),
        (NOW(), NOW(), 'Animal Farm', 'CLASSICS', 3, 'BAD', 1);