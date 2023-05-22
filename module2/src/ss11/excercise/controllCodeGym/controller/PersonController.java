package ss11.excercise.controllCodeGym.controller;

import ss11.excercise.controllCodeGym.service.IPersonService;
import ss11.excercise.controllCodeGym.service.StudentPersonService;

import java.util.Scanner;

public class PersonController {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonService personService = new StudentPersonService();
   
}
