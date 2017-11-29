dorp table if exists app_user;
CREATE TABLE app_user (
user_id INT PRIMARY KEY,
user_name varchar(100),
password varchar(200),
user_type varchar(3)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
