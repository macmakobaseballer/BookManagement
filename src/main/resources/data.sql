--本のリスト初期データ
--idカラムはオートインクリメントなので不要
INSERT INTO booktable
(book_name, volume_num ,author_name)
VALUES
( 'SQL〜ゼロから始めるデータベース操作〜','第２版','ミック'),
( 'スッキリわかるJava入門','第３版','中山清喬／国本大悟'),
( 'スッキリわかるJava入門 実践編','第３版','中山清喬／国本大悟')
;