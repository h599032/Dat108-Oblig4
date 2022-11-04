DROP SCHEMA IF EXISTS application CASCADE;
CREATE SCHEMA application;
SET search_path TO application;
    
-- 

CREATE TABLE application
(
   id navn VARCHAR(30) NOT NULL
);
