package com.nhnacademy.student.servlet;

import com.nhnacademy.student.model.Student;
import com.nhnacademy.student.repository.StudentRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "studentListServlet", urlPatterns = "/student/list")
public class StudentListServlet extends HttpServlet {
    private StudentRepository studentRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = studentRepository.getStudents();
        req.setAttribute("studentList",studentList);

//        req.getRequestDispatcher("/student/list.jsp").forward(req,resp);
        req.setAttribute("view","/student/list.jsp");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        studentRepository = (StudentRepository) config.getServletContext().getAttribute("studentRepository");
    }
}
