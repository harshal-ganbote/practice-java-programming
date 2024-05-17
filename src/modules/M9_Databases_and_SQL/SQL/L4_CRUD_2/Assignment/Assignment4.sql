SELECT patient_id
FROM patients
WHERE conditions LIKE "DIAB1%"
  OR conditions LIKE "% DIAB1%"
ORDER BY patient_id;