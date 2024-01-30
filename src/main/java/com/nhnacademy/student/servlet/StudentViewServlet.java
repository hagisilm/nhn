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
import java.util.Objects;

@WebServlet(name = "studentViewServlet", urlPatterns = "/student/view")
public class StudentViewServlet extends HttpServlet {
    private StudentRepository studentRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        if (Objects.isNull(id)) {
            throw new RuntimeException("Parameter [id] is null");
        }

        Student student = studentRepository.getStudentById(id);


        req.setAttribute("student", student);
//        req.getRequestDispatcher("/student/view.jsp").forward(req,resp);
        req.setAttribute("view","/student/view.jsp");


    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        studentRepository = (StudentRepository) config.getServletContext().getAttribute("studentRepository");
    }
}
