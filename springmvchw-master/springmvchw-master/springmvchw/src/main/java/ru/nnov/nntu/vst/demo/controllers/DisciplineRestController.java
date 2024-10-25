package ru.nnov.nntu.vst.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nnov.nntu.vst.demo.models.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DisciplineRestController {
    @GetMapping("/discipliner")
    public Discipline getDiscipline() {
        Control control = new Control(TypeOfControl.EXAM);

        KSS java = new KSS("Java", TypeOfSkill.SKILL);
        KSS C = new KSS("C++", TypeOfSkill.SKILL);
        KSS OOP = new KSS("ООП", TypeOfSkill.ABILITY);

        List<KSS> inputList = new ArrayList<>();
        inputList.add(java);
        inputList.add(OOP);

        List<KSS> output = new ArrayList<>(inputList);
        output.add(C);

        Map<TypeOfWork, Integer> typeOfWorkIntegerMap = new HashMap<>();
        typeOfWorkIntegerMap.put(TypeOfWork.LECTURE, 40);
        typeOfWorkIntegerMap.put(TypeOfWork.COURSE_WORK, 10);
        typeOfWorkIntegerMap.put(TypeOfWork.LAB_WORK, 0);
        typeOfWorkIntegerMap.put(TypeOfWork.PRACTICE_WORK, 1);

        Discipline discipliner = new Discipline(
                "SA",
                188,
                inputList,
                output,
                typeOfWorkIntegerMap,
                control
        );

        return discipliner;
    }
}
