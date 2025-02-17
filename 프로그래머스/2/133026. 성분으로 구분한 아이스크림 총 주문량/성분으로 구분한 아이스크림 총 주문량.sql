SELECT INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF fh
    INNER JOIN ICECREAM_INFO ii
    ON ii.FLAVOR = fh.FLAVOR
GROUP BY ii.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER ASC;