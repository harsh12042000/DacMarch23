using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using StudentLibrary;
using System;

namespace StudentLibrary
{
    public enum Grade
    {
        A = 75,
        B = 60,
        C = 35,
        FAIL = 0
    }

    public class StudentValidationException : Exception
    {
        public StudentValidationException(string message) : base(message)
        {
        }
    }

    public class Student
    {
        private int studentId;
        private string studentName;
        private Grade studentGrade;

        public int StudentId
        {
            get => studentId;
            set
            {
                if (value <= 0)
                    throw new StudentValidationException("StudentId must be greater than 0.");
                studentId = value;
            }
        }

        public string StudentName
        {
            get => studentName;
            set
            {
                if (string.IsNullOrEmpty(value))
                    throw new StudentValidationException("StudentName cannot be null or empty.");
                studentName = value;
            }
        }

        public string Address { get; set; }

        public Grade StudentGrade
        {
            get => studentGrade;
            set => studentGrade = value;
        }

        // Static list to store student data (simulating a database)
        private static List<Student> students = new List<Student>();

        // Create operation
        public static void CreateStudent(int studentId, string studentName, string address, Grade studentGrade)
        {
            // Validate inputs
            if (studentId <= 0)
                throw new StudentValidationException("StudentId must be greater than 0.");

            if (string.IsNullOrEmpty(studentName))
                throw new StudentValidationException("StudentName cannot be null or empty.");

            // Check if student with the same ID already exists
            if (students.Exists(s => s.StudentId == studentId))
                throw new StudentValidationException("Student with the same ID already exists.");

            // Create new student instance and add to the list
            Student newStudent = new Student
            {
                StudentId = studentId,
                StudentName = studentName,
                Address = address,
                StudentGrade = studentGrade
            };

            students.Add(newStudent);
        }

        // Get all students
        public static List<Student> GetAllStudents()
        {
            return students;
        }

        public static Student GetStudentById(int studentId)
        {
            return students.Find(s => s.StudentId == studentId);
        }

        // Update 
        public static void UpdateStudent(int studentId, string studentName, string address, Grade studentGrade)
        {
            // Find the student in the list
            Student studentToUpdate = students.Find(s => s.StudentId == studentId);

            if (studentToUpdate == null)
                throw new StudentValidationException("Student with the given ID not found.");

            // Update the student's properties
            studentToUpdate.StudentName = studentName;
            studentToUpdate.Address = address;
            studentToUpdate.StudentGrade = studentGrade;
        }

        // Delete 
        public static void DeleteStudent(int studentId)
        {
            // Find the student in the list
            Student studentToDelete = students.Find(s => s.StudentId == studentId);

            if (studentToDelete == null)
                throw new StudentValidationException("Student with the given ID not found.");

            // Remove the student from the list
            students.Remove(studentToDelete);
        }
    }
}

class Program
{
    static void Main()
    {
        while (true)
        {
            Console.WriteLine("\nMenu:");
            Console.WriteLine("1. Add Student");
            Console.WriteLine("2. View All Students");
            Console.WriteLine("3. View Student by ID");
            Console.WriteLine("4. Update Student");
            Console.WriteLine("5. Delete Student");
            Console.WriteLine("6. Exit");
            Console.Write("Enter your choice (1-6): ");

            string input = Console.ReadLine();
            int choice;
            if (int.TryParse(input, out choice))
            {
                switch (choice)
                {
                    case 1:
                        AddStudent();
                        break;
                    case 2:
                        ViewAllStudents();
                        break;
                    case 3:
                        ViewStudentById();
                        break;
                    case 4:
                        UpdateStudent();
                        break;
                    case 5:
                        DeleteStudent();
                        break;
                    case 6:
                        Console.WriteLine("Exiting the program.");
                        return;
                    default:
                        Console.WriteLine("Invalid choice. Please enter a number from 1 to 6.");
                        break;
                }
            }
            else
            {
                Console.WriteLine("Invalid input. Please enter a number from 1 to 6.");
            }
        }
    }

    static void AddStudent()
    {
        Console.WriteLine("Enter Student ID:");
        int studentId = int.Parse(Console.ReadLine());

        Console.WriteLine("Enter Student Name:");
        string studentName = Console.ReadLine();

        Console.WriteLine("Enter Student Address:");
        string address = Console.ReadLine();

        Console.WriteLine("Enter Student Grade (A, B, C, FAIL):");
        string gradeInput = Console.ReadLine();

        if (Enum.TryParse(gradeInput, out Grade studentGrade))
        {
            try
            {
                Student.CreateStudent(studentId, studentName, address, studentGrade);
                Console.WriteLine("Student added successfully.");
            }
            catch (StudentValidationException ex)
            {
                Console.WriteLine("Error: " + ex.Message);
            }
        }
        else
        {
            Console.WriteLine("Invalid grade input.");
        }
    }

    static void ViewAllStudents()
    {
        var allStudents = Student.GetAllStudents();
        if (allStudents.Count == 0)
        {
            Console.WriteLine("No students found.");
        }
        else
        {
            Console.WriteLine("All Students:");
            foreach (var student in allStudents)
            {
                Console.WriteLine($"ID: {student.StudentId}, Name: {student.StudentName}, Address: {student.Address}, Grade: {student.StudentGrade}");
            }
        }
    }

    static void ViewStudentById()
    {
        Console.WriteLine("Enter Student ID:");
        int studentId = int.Parse(Console.ReadLine());

        var student = Student.GetStudentById(studentId);
        if (student != null)
        {
            Console.WriteLine($"Student - ID: {student.StudentId}, Name: {student.StudentName}, Address: {student.Address}, Grade: {student.StudentGrade}");
        }
        else
        {
            Console.WriteLine("Student with ID not found." + studentId);
        }
    }

    static void UpdateStudent()
    {
        Console.WriteLine("Enter Student ID:");
        int studentId = int.Parse(Console.ReadLine());

        var student = Student.GetStudentById(studentId);
        if (student != null)
        {
            Console.WriteLine("Enter updated Student Name:");
            string studentName = Console.ReadLine();

            Console.WriteLine("Enter updated Student Address:");
            string address = Console.ReadLine();

            Console.WriteLine("Enter updated Student Grade (A, B, C, FAIL):");
            string gradeInput = Console.ReadLine();

            if (Enum.TryParse(gradeInput, out Grade studentGrade))
            {
                try
                {
                    Student.UpdateStudent(studentId, studentName, address, studentGrade);
                    Console.WriteLine("Student updated successfully.");
                }
                catch (StudentValidationException ex)
                {
                    Console.WriteLine("Error: " + ex.Message);
                }
            }
            else
            {
                Console.WriteLine("Invalid grade input.");
            }
        }
        else
        {
            Console.WriteLine("Student with ID not found." + studentId);
        }
    }

    static void DeleteStudent()
    {
        Console.WriteLine("Enter Student ID:");
        int studentId = int.Parse(Console.ReadLine());

        try
        {
            Student.DeleteStudent(studentId);
            Console.WriteLine("Student with ID has been deleted." + studentId);
        }
        catch (StudentValidationException ex)
        {
            Console.WriteLine("Error: " + ex.Message);
        }
    }
}
