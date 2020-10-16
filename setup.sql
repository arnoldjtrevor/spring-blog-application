# CREATE DATABASE IF NOT EXISTS blog_db;
#
# CREATE USER blog_user@localhost IDENTIFIED BY 'p@$$w0rd';
# GRANT ALL ON blog_db.* TO blog_user@localhost;

# USE blog_db;

# INSERT INTO posts (title, body)
# VALUES ('Ad #1 Title', 'Ad #1 body description'),
#        ('Ad #2 Title', 'Ad #2 body description'),
#        ('Ad #3 Title', 'Ad #3 body description');

DROP DATABASE IF EXISTS blog_db;

CREATE DATABASE IF NOT EXISTS blog_db;


USE blog_db;
INSERT INTO users (username, email, password)
VALUES ('username1', 'username1@email.com', '$2a$10$JkQBv4/Bt0mQkrBh3gfpSONxHtRXMU4DhKNiRKCBQaEy3u982JnpC'),
       ('username2', 'username2@email.com', '$2a$10$8OXKhr2ZfO2.4KX0xGb2Q.68kLAu9HGlCjm1XFg6HQvVdrqfhvi2e'),
       ('username3', 'username3@email.com', '$2a$10$.mthnNCMnLsXihWl0zzsQ.x3i5pAnLCvBTWiY9cSf/EaiZK7UvobK');