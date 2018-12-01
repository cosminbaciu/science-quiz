package com.example.cosminbaciu.kahoot.network;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ItemParser {
    //parser
    public static Item fromJson(String Json) throws JSONException {
        if (Json == null) {
            return null;
        }
        JSONObject object = new JSONObject(Json);
        List<Test> teste = getItemListFromJsonArray(object.getJSONArray("teste"));
        return new Item(teste);
    }


    public static Test getTestListFromJsonObject(JSONObject object) throws JSONException {
        if (object == null) {
            return null;
        }
        String numeTest = object.getString("numeTest");
        Integer punctajMaxim = object.getInt("punctajMaxim");
        Integer nrIntrebari = object.getInt("nrIntrebari");
        List<GrupeStudenti> listaGrupe = new ArrayList<>();
        JSONArray array = object.getJSONArray("grupeStudenti");
        if (array != null) {
            for (int i = 0; i < array.length(); i++) {
                JSONObject grupObject = array.getJSONObject(i);
                if (grupObject != null) {
                    Integer numeGrupa = grupObject.getInt("numeGrupa");
                    Integer nrPromovati = grupObject.getInt("nrPromovati");
                    Integer an = grupObject.getInt("an");
                    String specializare = grupObject.getString("specializare");
                    List<Student> studentList = new ArrayList<>();
                    JSONArray array2 = grupObject.getJSONArray("studenti");
                    if (array2 != null) {
                        for (int j = 0; j < array2.length(); j++) {
                            JSONObject studObject = array.getJSONObject(j);
                            if (studObject != null) {
                                String numeStudent = studObject.getString("numeStudent");
                                Double notaTest = studObject.getDouble("notaTest");
                                String feedback = studObject.getString("feedback");
                                studentList.add(new Student(numeStudent, notaTest, feedback));
                            }
                        }

                    }
                    listaGrupe.add(new GrupeStudenti(studentList, nrPromovati, an, specializare, numeGrupa));
                }


            }
        }
        return new Test(numeTest, punctajMaxim, listaGrupe, nrIntrebari);

    }

    public static List<Test> getItemListFromJsonArray(JSONArray array) throws JSONException {
        if (array == null) {
            return null;
        }
        List<Test> results = new ArrayList<>();

        for (int i = 0; i < array.length(); i++) {
            Test test = getTestListFromJsonObject(array.getJSONObject(i));
            if (test != null) {
                results.add(test);
            }
        }
        return results;
    }


}
