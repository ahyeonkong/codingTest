SELECT YEAR(a.DIFFERENTIATION_DATE) as YEAR
    , (b.MAX_SIZE - a.SIZE_OF_COLONY) as YEAR_DEV
    , a.ID
FROM ECOLI_DATA a
LEFT
JOIN(
    SELECT YEAR(DIFFERENTIATION_DATE) as YEAR
        , MAX(SIZE_OF_COLONY) as MAX_SIZE
    FROM ECOLI_DATA
    GROUP BY YEAR(DIFFERENTIATION_DATE)
    ) as b
ON YEAR(a.DIFFERENTIATION_DATE) = b.YEAR
ORDER BY YEAR ASC, YEAR_DEV ASC;