package com.nhnacademy.student.controller;

import com.nhnacademy.student.model.Gender;
import com.nhnacademy.student.model.Student;
import com.nhnacademy.student.repository.StudentRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "studentRegisterServlet", urlPatterns = "/student/register")
public class StudentRegisterServlet extends HttpServlet {
    private StudentRepository studentRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/student/register.jsp").forward(req,resp);
        req.setAttribute("view","/student/register.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //todo null check
        //todo save 구현
        //todo redirect /student/view?id=student1


        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String genderStr = req.getParameter("gender");
        Gender gender = Gender.valueOf(genderStr);
        String ageStr =req.getParameter("age");
        int age = Integer.parseInt(ageStr);

        if (id == null || name == null || genderStr == null || ageStr == null) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing student information");
            return;
        }
        Student student = new Student(id, name, gender, age);
        studentRepository.save(student);

//        resp.sendRedirect("/student/view?id=" + id);
        req.setAttribute("view","redirect:/student/view.do?id=" + student.getId());
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        studentRepository = (StudentRepository) config.getServletContext().getAttribute("studentRepository");
    }
}
