-- 결과는 댓글 작성일(REPLY)
-- 작성일이 같다면 게시글 기준으로 오름차순(Board)
-- 날짜 포맷 설정 DATE_FORMAT(USED_GOODS_BOARD.CREATED_DATE,'%Y-%m-%d'
SELECT USED_GOODS_BOARD.TITLE,	USED_GOODS_BOARD.BOARD_ID,	USED_GOODS_REPLY.REPLY_ID,	USED_GOODS_REPLY.WRITER_ID,	USED_GOODS_REPLY.CONTENTS,	
DATE_FORMAT(USED_GOODS_REPLY.CREATED_DATE,'%Y-%m-%d') as CREATED_DATE
FROM USED_GOODS_BOARD
INNER JOIN USED_GOODS_REPLY  ON USED_GOODS_REPLY.BOARD_ID = USED_GOODS_BOARD.BOARD_ID
WHERE DATE_FORMAT(USED_GOODS_BOARD.CREATED_DATE, '%Y-%m') = '2022-10'
ORDER BY USED_GOODS_REPLY.CREATED_DATE ASC, USED_GOODS_BOARD.TITLE ASC ;