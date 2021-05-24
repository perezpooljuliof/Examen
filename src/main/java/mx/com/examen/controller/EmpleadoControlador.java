package mx.com.examen.controller;

import mx.com.examen.dto.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/empleado")
public class EmpleadoControlador {

    @RequestMapping(value = "/showEmpleado", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("Empleado", "empleado", new Empleado());
    }

    @RequestMapping(value = "/agregaEmpleado", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("empleado") Empleado empleado, BindingResult result, ModelMap model) {
        System.out.println("/agregaEmpleado");
        if(result.hasErrors()) {
            return "error";
        }

        model.addAttribute("nombre", empleado.getNombre());
        model.addAttribute("edad", empleado.getEdad());
        model.addAttribute("numeroTelefono", empleado.getNumeroTelefono());
        return "InformacionEmpleado";
    }
}
