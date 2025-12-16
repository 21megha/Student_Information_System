Technical Details-->

Data Structures:
ArrayList<Student> students

Stores all student objects in memory dynamically.

Allows easy addition, removal, and iteration.

Student Class Attributes:

String name – Student’s name

int age – Student’s age

int grade – Student’s grade

int studentId – Unique identifier for each student

String contact – Contact information

Algorithms-->

Add Student:

Create a new Student object with input data.

Append it to the ArrayList<Student>.

Complexity: O(1)

View All Students:

Iterate over ArrayList<Student> and display each student.

Complexity: O(n), where n = number of students

Search Student:

Linear search through the list by studentId.

Returns the first matching student object.

Complexity: O(n)

Update Student:

Linear search to find the student by ID.

Update selected attributes through menu options.

Complexity: O(n) search + O(1) updates

Delete Student:

Linear search to find the student by ID.

Remove the student from the list if found.

Complexity: O(n) search + O(n) removal (shifts elements)

Architecture-->

Object-Oriented Design:

Student.java – Model class representing student entities.

Student_Information_System.java – Controller class managing application logic and menu interface.

Menu-Driven Console Application:

The main loop displays menu options.

User inputs trigger corresponding methods for add, view, search, update, delete, or exit.

Error Handling:

setAge(int age) throws an exception for an invalid age.

Input validation is minimal and can be extended.

Display Formatting:

System.out.println() is used to display student records in a neat tabular format.
