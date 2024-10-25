package ru.nnov.nntu.vst.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.nnov.nntu.vst.demo.models.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DisController {

    @GetMapping("/dis")
    public String dis(
            @RequestParam(name="name", required=false, defaultValue = "World") String name,
            @RequestParam(name="hours", required=false, defaultValue = "0") int hours,
            Model model
    ) {
        Control control = new Control(TypeOfControl.EXAM);

        KSS java = new KSS("Java", TypeOfSkill.SKILL);
        KSS C = new KSS("C++", TypeOfSkill.SKILL);
        KSS OOP = new KSS("ООП", TypeOfSkill.ABILITY);

        List<KSS> kssInputList = new ArrayList<>();
        kssInputList.add(java);
        kssInputList.add(OOP);

        List<KSS> kssOutputList = new ArrayList<>(kssInputList);
        kssOutputList.add(C);

        Map<TypeOfWork,Integer> amountOfWork = new HashMap<>();
        amountOfWork.put(TypeOfWork.LECTURE, 0);
        amountOfWork.put(TypeOfWork.COURSE_WORK, 0);
        amountOfWork.put(TypeOfWork.LAB_WORK, 0);
        amountOfWork.put(TypeOfWork.PRACTICE_WORK, 0);

        Discipline discipline = new Discipline(
                name,
                hours,
                kssInputList,
                kssOutputList,
                amountOfWork,
                control
        );
        model.addAttribute("discipline",discipline);

        System.out.println(model);
        return "dis";
    }
    @GetMapping("/disC")
    public String disC(
            @RequestParam(name="name") String name, //обязательный параметр
            @RequestParam(name="hours") int hours,  //обязательный параметр
            @RequestParam(name="kssInputList", required=false) List<KSS> kssInputList, // если required = false - значит параметр необязателен
            @RequestParam(name="kssOutputList", required=false) List<KSS> kssOutputList,
            @RequestParam(name="amountOfWork", required=false) Map<TypeOfWork, Integer> amountOfWork,
            @RequestParam(name="control", required=false) Control control,
            Model model
    ) {
        Discipline discipline = new Discipline(
                name,
                hours,
                kssInputList,
                kssOutputList,
                amountOfWork,
                control
        );
        model.addAttribute("discipline",discipline);
        System.out.println(model);   //http://localhost:8080/disC?name=Java&hours=6
        return "dis";
    }

}
