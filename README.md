# Буянов Сергей 6132
# Jakarta Tutor Management Application

## Database Setup (`schema.sql`)
```sql
CREATE TABLE tutors (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    subject VARCHAR(100) NOT NULL
);

CREATE TABLE students (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    grade INT NOT NULL,
    tutor_id BIGINT REFERENCES tutors(id) ON DELETE SET NULL
);
