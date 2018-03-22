package com.madonahsyombua.ml;

import java.util.ArrayList;
import java.util.List;

import net.sf.classifier4J.ClassifierException;
import net.sf.classifier4J.vector.HashMapTermVectorStorage;
import net.sf.classifier4J.vector.TermVectorStorage;
import net.sf.classifier4J.vector.VectorClassifier;

public class SimpleNameSearch {

    public SimpleNameSearch() {
        /**
         * Hell new team members we will start step by step :)
         * Feel free to ask me any question in advance
         */
        List<String> name = new ArrayList<String>();

        name.add("madonah");
        name.add("madona");
        name.add("madonna");
        name.add("maddona");
        name.add("maddoonna");
        name.add("madonahhh");
        name.add("madonayyy");
        name.add("madonnauuu");
        name.add("maddonattt");
        name.add("maddoonnaiii");

        List<String> name1 = new ArrayList<String>();

        name1.add("nida");
        name1.add("nidu");
        name1.add("nidha");
        name1.add("nidaaa");
        name1.add("niiddaa");
        name1.add("needa");
        name1.add("nidz");
        name1.add("nidaa");
        name1.add("nidda");
        name1.add("niday");


        TermVectorStorage storage = new HashMapTermVectorStorage();
        VectorClassifier vc = new VectorClassifier(storage);
        //correct string name when you enter search"
        String correctName = "madonah";

        for (String names : name) {
            try {

                vc.teachMatch("sterm", correctName);

                double results = vc.classify("sterm", names);

                System.out.println(names + " = " + results);


            } catch (ClassifierException e) {

                e.printStackTrace();
            }

        }
        String correctName1 = "nida";

        for (String names1 : name1) {
            try {

                vc.teachMatch("sterm", correctName1);

                double results = vc.classify("sterm", names1);

                System.out.println(names1 + " = " + results);


            } catch (ClassifierException e) {

                e.printStackTrace();
            }
        }
    }

    public static void parametrizedSimpleSearch(List<String> searchList, String wordToSearch) {

        TermVectorStorage storage = new HashMapTermVectorStorage();
        VectorClassifier vc = new VectorClassifier(storage);

        for (String element : searchList) {
            try {

                vc.teachMatch("sterm", wordToSearch);

                double results = vc.classify("sterm", element);

                System.out.println(element + " = " + results);

            } catch (ClassifierException e) {

                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        SimpleNameSearch ns = new SimpleNameSearch();
        System.out.println("******************************************");
        List<String> names = new ArrayList<String>();

        names.add("nida");
        names.add("nidu");
        names.add("nidha");
        names.add("rhizlane");
        names.add("niiddaa");
        names.add("needa");
        names.add("madonnah");
        names.add("nidaa");

        System.out.println("******************************************");
        parametrizedSimpleSearch(names,"nida");

        System.out.println("******************************************");
        parametrizedSimpleSearch(names,"madonnah");

        System.out.println("******************************************");
        parametrizedSimpleSearch(names,"rhizlane");

    }

}
