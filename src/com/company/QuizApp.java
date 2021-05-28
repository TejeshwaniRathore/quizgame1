package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

class topic{



    public int topics(){
        System.out.println("Select the topic for the quiz-1)Java 2)C");
        Scanner sc=new Scanner(System.in);
        int topic=sc.nextInt();
        if(topic==1){
            System.out.println("Topic=java");
        }
        else if(topic==2){
            System.out.println("Topic==c");
        }
        return topic;
    }


}
class java extends topic {


    public void questionmodel() {

        ArrayList<String> que = new ArrayList<>();
        que.add("1)What is java");
        que.add("2) Which of the following is not a Java features?");
        que.add("3) _____ is used to find and fix bugs in the Java programs.");
        que.add("4) Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?");
        //Collections.shuffle(que);

        ArrayList<String> opt = new ArrayList<>();
        opt.add("1)PL,2)SL,3)Both,4)None");
        opt.add("1)Dynamic,2)Architecture Neutral,3)Use of pointers,4)Object-oriented");
        opt.add("1)JVM,2)JRE,3)JDK,4)JDB");
        opt.add("1)javap tool,2)javaw command,3)Javadoc tool,4)javah command");
        ArrayList<Integer> correct
                = new ArrayList<>();
        correct.add(1);
        correct.add(3);
        correct.add(1);
        correct.add(1);

        Scanner sc = new Scanner(System.in);
        int c1 ;
        int count = 0;
        for (int i = 0; i < que.size(); i++) {
            String q = que.get(i);
            System.out.println(q);
            String o = opt.get(i);
            {
                String[] s1 = o.split(",");
                for (String s : s1) {
                    System.out.println(s);
                }
            }
            int c = correct.get(i);
            {
                c1 = c;
            }
            System.out.println("Your option: ");
            int yr = sc.nextInt();
            if (yr==c1) {
                count++;
            }
        }
        System.out.println("Marks:" + count);

    }
}


class c extends topic {

        public void questionmodel2() {
            //long seed = System.nanoTime();


            ArrayList<String> que = new ArrayList<>();
            que.add("1)What is required in each C program?");
            que.add("2) What is a lint?");
            que.add("3) Why is a macro used in place of a function?");
            que.add("4)In the C language, the constant is defined _______.");
           // Collections.shuffle(que, new Random(seed));


            ArrayList<String> opt = new ArrayList<>();
            opt.add("1)The program must have at least one function,2)The program does not require any function,3)Input data,4)Output data");
            opt.add("1)C compile,2)Interactive debugger,3)Analyzing tool,4)C interpreter");
            opt.add("1)It reduces execution time,2)It reduces code size,3)It increases execution time,4)It increases code size.");
            opt.add("1)Before main,2)after main,3)Anywhere, but starting on a new line,4)None of the these.");

            ArrayList<Integer> correct
                    = new ArrayList<>();
            correct.add(1);
            correct.add(3);
            correct.add(4);
            correct.add(3);
            //Collections.shuffle(opt, new Random(seed));



            //Collections.shuffle(correct, new Random(seed));

            Scanner sc = new Scanner(System.in);
            int c1 ;
            int count = 0;

            for (int i = 0; i < que.size(); i++) {
                String q = que.get(i);
                System.out.println(q);
                String o = opt.get(i);
                {
                    String[] s1 = o.split(",");
                    for (String s : s1) {
                        System.out.println(s);
                    }
                }
                int c = correct.get(i);
                {
                    c1 = c;
                }
                System.out.println("Your option: ");
                int yr = sc.nextInt();
                if (yr==c1) {
                    count++;
                }
            }
            System.out.println("Marks:" + count);
        }
    }


    public class QuizApp{


        public static void main(String[] args) {
            topic tp = new topic();

            boolean chose = false;
            while (!chose) {

                int a = tp.topics();


                if (a == 1) {
                    java jv = new java();
                    jv.questionmodel();
                } else if (a == 2) {
                    c cp = new c();
                    cp.questionmodel2();
                }


            }
        }
    }





	// write your code here

