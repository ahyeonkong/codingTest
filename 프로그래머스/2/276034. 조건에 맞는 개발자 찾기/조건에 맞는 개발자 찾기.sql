SELECT DISTINCT d.ID, d.EMAIL, d.FIRST_NAME, d.LAST_NAME
FROM DEVELOPERS d
JOIN SKILLCODES s ON (s.CODE & d.SKILL_CODE) > 0
WHERE NAME = 'Python' OR NAME = 'C#'
ORDER BY ID ASC;