-- SQL SBA

-- 2
SELECT d.name AS `Department Name`, COUNT(c.id) AS `Number of Courses`
FROM department AS d
JOIN course AS c ON d.id=c.deptId
GROUP BY `Department Name`
ORDER BY `Number of Courses` ASC, `Department Name`;

-- 3
SELECT c.name AS `Course Name`, COUNT(sc.studentId) AS `Number of Students`
FROM course AS c
JOIN studentCourse AS sc ON c.id=sc.courseId
GROUP BY `Course Name`
ORDER BY `Number of Students` DESC, `Course Name` ASC;

-- 4
SELECT c.name
FROM course AS c
LEFT JOIN facultyCourse AS fc ON c.id=fc.courseId
WHERE fc.courseId IS NULL
ORDER BY c.name ASC;

-- 5
SELECT c.name AS `Course Names`, COUNT(sc.studentId) AS `Number of Students`
FROM course AS c
LEFT JOIN facultyCourse AS fc ON c.id=fc.courseId
JOIN studentCourse AS sc ON c.id=sc.courseId
WHERE fc.courseId IS NULL
GROUP BY `Course Names`
ORDER BY `Number of Students` DESC, c.name ASC;

-- 6
SELECT COUNT(DISTINCT s.id) AS `Students`, YEAR(sc.startDate) AS `Year`
FROM studentCourse AS sc
LEFT JOIN student AS s ON sc.studentId=s.id
GROUP BY `Year`
ORDER BY `Year` ASC, `Students` DESC;

-- 7
SELECT sc.startDate AS `Start Date`, COUNT(DISTINCT s.id) AS `Total Number of Students`
FROM studentCourse AS sc
JOIN student AS s ON sc.studentId=s.id
WHERE MONTH(sc.startDate) = 8
GROUP BY `Start Date`
ORDER BY `Start Date` ASC, `Total Number of Students` ASC;

-- 8
SELECT s.firstname, s.lastname, COUNT(sc.courseId) AS `Number of Courses`
FROM studentCourse AS sc
JOIN student AS s ON sc.studentId=s.id
JOIN course AS c ON sc.courseId=c.id
WHERE s.majorId=c.deptId
GROUP BY s.id
ORDER BY `Number of Courses` DESC, s.firstname ASC, s.lastname ASC;

-- 9
SELECT s.firstname, s.lastname, ROUND(AVG(DISTINCT sc.progress), 1) AS `Average Progress`
FROM studentCourse AS sc
JOIN student AS s ON sc.studentId=s.id
GROUP BY s.id
HAVING AVG(sc.progress) < 50
ORDER BY `Average Progress` DESC, s.firstname ASC, s.lastname ASC;

-- 10
SELECT c.name, ROUND(AVG(sc.progress), 1) AS `Average Progress`
FROM course AS c
JOIN studentCourse AS sc ON c.id=sc.courseId
GROUP BY c.id
ORDER BY `Average Progress` DESC, c.name ASC;

-- 11
SELECT c.name, ROUND(AVG(sc.progress), 1) AS `Average Progress`
FROM course AS c
JOIN studentCourse AS sc ON c.id=sc.courseId
GROUP BY c.id
ORDER BY `Average Progress` DESC, c.name ASC
LIMIT 1;

-- 12
SELECT f.firstname, f.lastname, ROUND(AVG(sc.progress), 1) AS `Average Progress`
FROM facultyCourse AS fc
JOIN faculty AS f ON fc.facultyId=f.id
JOIN course AS c ON fc.courseId=c.id
JOIN studentCourse AS sc ON c.id=sc.courseId
GROUP BY f.id
ORDER BY `Average Progress` DESC, f.firstname ASC, f.lastname ASC;

-- 13
SELECT f.firstname, f.lastname, ROUND(AVG(sc.progress), 1) AS `Average Progress`
FROM facultyCourse AS fc
JOIN faculty AS f ON fc.facultyId=f.id
JOIN course AS c ON fc.courseId=c.id
JOIN studentCourse AS sc ON c.id=sc.courseId
GROUP BY f.id
HAVING AVG(sc.progress) > (0.9 * (SELECT AVG(sc.progress)
                                  FROM studentCourse AS sc
                                  GROUP BY sc.courseId
                                  ORDER BY AVG(sc.progress) DESC
                                  LIMIT 1))
ORDER BY `Average Progress` DESC, f.firstname ASC, f.lastname ASC;

-- 14
SELECT s.firstname, s.lastname,
CASE
	WHEN MIN(sc.progress) < 40 THEN "F"
    WHEN MIN(sc.progress) < 50 THEN "D"
    WHEN MIN(sc.progress) < 60 THEN "C"
    WHEN MIN(sc.progress) < 70 THEN "B"
    WHEN MIN(sc.progress) >= 70 THEN "A"
END AS `Minimum Grade`,
CASE
	WHEN MAX(sc.progress) < 40 THEN "F"
    WHEN MAX(sc.progress) < 50 THEN "D"
    WHEN MAX(sc.progress) < 60 THEN "C"
    WHEN MAX(sc.progress) < 70 THEN "B"
    WHEN MAX(sc.progress) >= 70 THEN "A"
END AS `Maximum Grade`
FROM student AS s
JOIN studentCourse AS sc ON s.id=sc.studentId
GROUP BY s.id
ORDER BY `Minimum Grade` DESC, `Maximum Grade` DESC, s.firstname ASC, s.lastname ASC;