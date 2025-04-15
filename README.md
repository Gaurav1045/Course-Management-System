
# 🎓 Course Management System

A full-stack Course Management System built with **React** (Frontend) and **Spring Boot** (Backend) that allows users to perform **CRUD operations** on courses.

---

## ✨ Features

- 🔍 View all courses
- ➕ Add a new course
- 📝 Update existing course details
- ❌ Delete a course
- 💡 RESTful APIs with Spring Boot
- ⚛️ Interactive UI with React

---

## 🛠️ Technologies Used

### Frontend
- React
- Axios
- Bootstrap

### Backend
- Java + Spring Boot
- Spring MVC + REST
- Maven
- MySQL Database

---

## 📁 Project Structure

```
Course-Management-System/
├── backend/
│   └── coursemanagementsystem-backend/
│       ├── src/
│       └── pom.xml
├── frontend/
│   └── coursemanagmentsystem-frontend/
│       ├── src/
│       └── package.json
```

---

## 🚀 Getting Started

### Backend (Spring Boot)

1. Navigate to the backend directory:
```bash
cd backend/coursemanagementsystem-backend
```

2. Run the application:
```bash
./mvnw spring-boot:run
```

> The backend will run at: `http://localhost:8080`

3. Default endpoints:
```
GET    /courses         → Get all courses  
POST   /courses         → Add a new course  
PUT    /courses/{id}    → Update course by ID  
DELETE /courses/{id}    → Delete course by ID  
```

---

### Frontend (React)

1. Navigate to the frontend directory:
```bash
cd frontend/coursemanagmentsystem-frontend
```

2. Install dependencies:
```bash
npm install
```

3. Start the React app:
```bash
npm start
```

> The frontend will run at: `http://localhost:3000`

---

## 📸 Screenshots

**Home Page**
![image](https://github.com/user-attachments/assets/db712f92-7b6d-44ee-9632-353c8317936a)

**Add Course**
![image](https://github.com/user-attachments/assets/d20c0fa4-67e0-429f-a1ff-0494159764d1)

 **Update Course**
 ![image](https://github.com/user-attachments/assets/e0f21ddd-37b6-42df-a169-b74840153362)

 **View Course**
 ![image](https://github.com/user-attachments/assets/00d5a9b0-31e9-42f3-b4c7-5f9a02e637f7)

 **Delete Course**
 ![image](https://github.com/user-attachments/assets/c0628e19-ed39-4618-80b0-be31dfe0f32f)

---

## 📦 API Example (JSON)

```json
{
  "id": 1,
  "title": "Spring Boot Basics",
  "description": "Learn how to build REST APIs using Spring Boot"
}
```


## 🧑‍💻 Author

**Gaurav Dhakate**  
GitHub: [Gaurav@1045](https://github.com/Gaurav@1045)
