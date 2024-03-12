CREATE TABLE IF NOT EXISTS shohin (
  shohin_id character(4) COLLATE pg_catalog."default" NOT NULL,
  shohin_mei character varying(100) COLLATE pg_catalog."default" NOT NULL,
  shohin_bunrui character varying(32) COLLATE pg_catalog."default" NOT NULL,
  hanbai_tanka integer,
  shiire_tanka integer,
  torokubi date,
  CONSTRAINT shohin_pkey PRIMARY KEY (shohin_id)
);

INSERT INTO shohin(shohin_id, shohin_mei, shohin_bunrui, hanbai_tanka, shiire_tanka, torokubi)
VALUES ('0001', 'Tシャツ', '衣類', 1000, 500, '2009-09-20');

INSERT INTO shohin(shohin_id, shohin_mei, shohin_bunrui, hanbai_tanka, shiire_tanka, torokubi)
VALUES ('0002','穴あけパンチ','事務用品',500,320,'2009-09-11');

INSERT INTO shohin(shohin_id, shohin_mei, shohin_bunrui, hanbai_tanka, shiire_tanka, torokubi)
VALUES ('0003','カッターシャツ','衣類',4000,2800,null);

INSERT INTO shohin(shohin_id, shohin_mei, shohin_bunrui, hanbai_tanka, shiire_tanka, torokubi)
VALUES ('0004','包丁','キッチン用品',3000,2800,'2009-09-20');

INSERT INTO shohin(shohin_id, shohin_mei, shohin_bunrui, hanbai_tanka, shiire_tanka, torokubi)
VALUES ('0005','圧力鍋','キッチン用品',6800,5000,'2009-01-15');

INSERT INTO shohin(shohin_id, shohin_mei, shohin_bunrui, hanbai_tanka, shiire_tanka, torokubi)
VALUES ('0006','フォーク','キッチン用品',500,null,'2009-09-20');

INSERT INTO shohin(shohin_id, shohin_mei, shohin_bunrui, hanbai_tanka, shiire_tanka, torokubi)
VALUES ('0007','おろしがね','キッチン用品',880,790,'2009-04-28');

INSERT INTO shohin(shohin_id, shohin_mei, shohin_bunrui, hanbai_tanka, shiire_tanka, torokubi)
VALUES ('0008','ボールペン','事務用品',100,null,'2009-11-11');
