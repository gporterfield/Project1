package com.company.Porterfield;

import java.util.Scanner;
import java.util.*;

    public class Main {

        static void menu() {
            System.out.println("Pick an option");
            System.out.println("1) Add a  task");
            System.out.println("2) Remove a task");
            System.out.println("3) Update a task");
            System.out.println("4) List tasks");
            System.out.println("0) Exit");
        }

        static void exitProgram() {
            System.exit(0);
        }

        static ArrayList<String> addATask(ArrayList<String> g) {
            Scanner input = new Scanner(System.in);
            System.out.println("What would you like to add to your task list?");
            String userInput = input.nextLine();
            g.add(userInput);
            return g;
        }

        static void displayAllTasks(ArrayList<String> taskList) {
            int i = 0;
            for (String g:taskList) {
                System.out.println(i + ": " + g);
                i++;
            }
        }

        static ArrayList<String> removeTask(ArrayList<String> g) {

            int a;
            Scanner input = new Scanner(System.in);

            System.out.println("What would you like to remove from you task list?");
            a = input.nextInt();
            g.remove(a);
            return g;
        }

        static ArrayList<String> updateTask(ArrayList<String> x) {
            int g;
            String editTask;
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a value for the task? ");
            g = input.nextInt();
            System.out.println("What is this task?");
            editTask = input.next();
            x.set(g, editTask);
            return x;
        }

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            int task = -1;
            ArrayList<String> taskList = new ArrayList<>();

            while(task != 0) {
                menu();
                task = input.nextInt();

                switch (task) {
                    case 1:
                        addATask(taskList);
                        break;
                    case 2:
                        removeTask(taskList);
                        break;
                    case 3:
                        updateTask(taskList);
                        break;
                    case 4:
                        displayAllTasks(taskList);
                        break;
                    case 0:
                        exitProgram();
                        break;
                    default:
                        System.out.println("Wrong");
                        break;
                }
            }
        }
    }
