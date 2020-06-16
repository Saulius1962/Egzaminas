SELECT   gmetai as gimimo_metai, count(*) as darbuotoju_skaicius
FROM darbuotojai   
GROUP BY gmetai
ORDER BY COUNT(*) desc limit 1
;