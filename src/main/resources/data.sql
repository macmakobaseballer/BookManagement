--本のリスト初期データ
--idカラムはオートインクリメントなので不要
INSERT INTO booktable
(book_name, volume_num ,author_name)
VALUES
( 'SQL〜ゼロから始めるデータベース操作〜','第２版','ミック'),
( 'スッキリわかるJava入門 実践編','第３版','中山清喬／国本大悟'),
( 'SEとプロマネを極める 仕事が早くなる文書作法','増補改訂版','福田修・豊田倫子')
;

INSERT INTO reading_status
(reading_page)
VALUES
(45),
(0),
(0)
;
