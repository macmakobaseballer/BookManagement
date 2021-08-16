--booktableがあれば削除
DROP TABLE IF EXISTS booktable;

--booktableがなければ新しく作成
CREATE TABLE IF NOT EXISTS booktable(
id INT AUTO_INCREMENT,
book_name VARCHAR(100) NOT NULL,
volume_num VARCHAR(50),
author_name VARCHAR(50) NOT NULL,
register_date DATE DEFAULT (CURRENT_DATE),
PRIMARY KEY(id)
);