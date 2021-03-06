package com.example.cosminbaciu.kahoot.network;

import android.os.AsyncTask;
import android.view.View;

import com.example.cosminbaciu.kahoot.profesorActivity.ProfMenuActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void, Void, String> {
    String data = "";
    @Override
    protected String doInBackground(Void... voids) {

        try{
            URL url = new URL("https://api.myjson.com/bins/1f11d6");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while(line != null)
            {
                line = bufferedReader.readLine();
                data = data + line;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        ProfMenuActivity.data.setText(this.data);
        ProfMenuActivity.data.setVisibility(View.INVISIBLE);
    }

}
