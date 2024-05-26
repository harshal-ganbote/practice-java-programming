SELECT DISTINCT user_id
FROM (
    SELECT C.user_id,
      TIMESTAMPDIFF(
        SECOND,
        LAG(C.time_stamp) OVER(
          PARTITION BY user_id
          ORDER BY time_stamp ASC
        ),
        C.time_stamp
      ) AS difference
    FROM confirmations AS C
  ) AS A
WHERE A.difference <= 86400
ORDER BY user_id;