SELECT rr.REST_ID, ri.REST_NAME, ri.FOOD_TYPE, ri.FAVORITES, ri.ADDRESS, ROUND(AVG(rr.REVIEW_SCORE),2) AS SCORE
FROM REST_REVIEW rr
JOIN REST_INFO ri ON rr.REST_ID = ri.REST_ID
GROUP BY rr.REST_ID
HAVING ri.ADDRESS LIKE '서울%'
ORDER BY SCORE DESC, ri.FAVORITES DESC