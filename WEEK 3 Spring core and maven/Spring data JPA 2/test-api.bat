@echo off
echo Testing Employee Management API
echo ================================

echo.
echo 1. Getting all employees (should be empty initially):
curl -X GET http://localhost:8080/api/employees

echo.
echo 2. Creating a new employee:
curl -X POST http://localhost:8080/api/employees ^
  -H "Content-Type: application/json" ^
  -d "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"email\":\"john.doe@example.com\",\"phone\":\"123-456-7890\",\"hireDate\":\"2024-01-15\",\"salary\":50000.0,\"department\":\"IT\"}"

echo.
echo 3. Getting all employees (should show the new employee):
curl -X GET http://localhost:8080/api/employees

echo.
echo 4. Getting employee by ID (replace 1 with actual ID):
curl -X GET http://localhost:8080/api/employees/1

echo.
echo 5. Getting employees by department:
curl -X GET http://localhost:8080/api/employees/department/IT

echo.
echo API Test Complete!
pause 