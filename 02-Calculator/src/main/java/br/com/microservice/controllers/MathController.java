package br.com.microservice.controllers;

import br.com.microservice.controllers.imp.SimpleMath;
import br.com.microservice.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MathController {

    private static final String template = "Hello, %s";

    SimpleMath math = new SimpleMath();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            try {
                throw new UnsupportedOperationException("Please, use a numeric value.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Double sum = math.sum(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
        return sum;
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            try {
                throw new UnsupportedOperationException("Please, use a numeric value.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Double sub = math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
        return sub;
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            try {
                throw new UnsupportedOperationException("Please, use a numeric value.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Double div = math.division(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
        return div;
    }

    @RequestMapping(value = "/prod/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            try {
                throw new UnsupportedOperationException("Please, use a numeric value.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Double prod = math.multiplication(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
        return prod;
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            try {
                throw new UnsupportedOperationException("Please, use a numeric value.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Double mean = math.mean(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
        return mean;
    }

    @RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
    public Double root(@PathVariable("numberOne") String numberOne) {
        if(!NumberConverter.isNumeric(numberOne)){
            try {
                throw new UnsupportedOperationException("Please, use a numeric value.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Double root = math.square(NumberConverter.convertToDouble(numberOne));
        return root;
    }

}
