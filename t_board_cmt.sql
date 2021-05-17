SELECT * FROM t_board;

SELECT A.iboard, A.title, A.iuser, A.regdt, B.unm
FROM t_board A
INNER JOIN t_user B
ON A.iuser = B.iuser
ORDER BY iboard DESC;

CREATE TABLE t_board_cmt (
	icmt INT UNSIGNED PRIMARY key AUTO_INCREMENT ,
	iboard INT UNSIGNED,
	iuser INT UNSIGNED,
	cmt VARCHAR(400) NOT NULL,
	regdate DATE DEFAULT NOW(),
	FOREIGN KEY (iboard) REFERENCES t_board(iboard),
	FOREIGN KEY (iuser) REFERENCES t_user(iuser)
);

INSERT INTO t_board_cmt (iboard,iuser,cmt) VALUES(7,2,3324234);

SELECT * FROM t_board_cmt;

SELECT a.icmt, a.iuser, a.cmt, a.regdate , b.unm
FROM t_board_cmt AS a
LEFT JOIN t_user AS b
ON a.iuser = b.iuser
WHERE a.iboard = 7?;