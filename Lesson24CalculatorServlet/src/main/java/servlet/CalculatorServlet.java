package servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static calculator.Calculator.*;

@WebServlet(name = "Calculator", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Calculator init!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try {
            Double val1 = getResultCorrection(request, "val1");
            Double val2 = getResultCorrection(request, "val2");
            String calculationName = request.getParameter("calculationName");
            Double result = calculate(val1, val2, calculationName);
            PrintWriter out = response.getWriter();
            out.println(result + "\n" + calculationName);
        } catch (NumberFormatException exception) {
            println(response, "Не верный формат значений");
        } catch (IllegalStateException exception2) {
            println(response, "Не верная операция");
        } catch (Exception exception) {
            println(response, exception.getMessage());
        }
    }

    public void destroy() {
        message = "Calculator destroyed";
    }

    public Double calculate(Double value1, Double value2, String operationName) {
        return switch (operationName) {
            case "sum" -> sum(value1, value2);
            case "multiply" -> multiply(value1, value2);
            case "division" -> division(value1, value2);
            case "subtraction" -> subtraction(value1, value2);
            default -> throw new IllegalArgumentException("Not compatible operation" + operationName);
        };
    }

    public Double getResultCorrection(HttpServletRequest request, String operationValue) {
        String calculationName = request.getParameter(operationValue);
        if (calculationName == null) {
            throw new IllegalArgumentException("exception" + operationValue);
        }
        return Double.valueOf(calculationName);
    }


    public void println(HttpServletResponse response, String message) throws IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println(message);
    }
}