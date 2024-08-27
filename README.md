# Employee Management System

This is a simple Employee Management System built using JSP, Servlets, and JDBC with MVC architecture. The application allows the admin to manage employees, including adding, viewing, updating, and removing employees.

## Features

- **Admin Operations:**
  - Add Employee
  - View Employee
  - View All Employees
  - Update Employee
  - Remove Employee
  - Logout

- **Employee Details:**
  - View specific employee details with options to update or remove.
  - List all employees with options to update or remove each.

## Technologies Used

- Java
- JSP (JavaServer Pages)
- Servlets
- JDBC (Java Database Connectivity)
- MVC Architecture
- HTML/CSS

## Setup and Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/YourUsername/EmployeeManagementSystem.git
   ```
2. Import the project into your preferred IDE (e.g., Eclipse or IntelliJ IDEA).
3. Configure your database connection in the EmployeeDao.java file.
4. Deploy the project on a local server (e.g., Apache Tomcat).
5. Access the application by navigating to http://localhost:8080/EmployeeManagementSystem.

## Screenshots

### Home Page
![Home Page](screenshots/homepage.png)

*This is the homepage of the Employee Management System, where users can navigate to either the admin or employee login sections.*

### Admin Login
![Admin Login](screenshots/admin_login.png)

*Admin login page where administrators can enter their credentials to access admin-specific operations.*

### Admin Operations
![Admin Operations](screenshots/admin_operations.png)

*Admin operations menu that includes options to add, view, update, and remove employees, as well as log out.*

### Employee Operations
![Employee Operations](screenshots/emp_operations.png)

*Employee operations page that allows employees to view and update their own details.*

### Employee Added Confirmation
![Employee Added Confirmation](screenshots/employee_added.png)

*Confirmation screen that appears after successfully adding a new employee.*

### Employee Login
![Employee Login](screenshots/employee_login.png)

*Login page for employees to enter their credentials and access their personal dashboard.*

### Employee Login Failed
![Employee Login Failed](screenshots/employee_login_failed.png)

*Screen that displays when an employee's login attempt fails due to incorrect credentials.*

### Update Employee
![Update Employee](screenshots/update_employee.png)

*Form used by admins to update the details of an existing employee.*

### View Employee
![View Employee](screenshots/view_employee.png)

*Detailed view of a single employee's data, including options to update or remove the employee.*

### View All Employees
![View All Employees](screenshots/view_all_emp.png)

*List view showing all employees in the system, with options to update or remove any employee.*

### View Self Details
![View Self Details](screenshots/view_self_details.png)

*Page where employees can view and update their own details.*

