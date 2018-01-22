/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // DONE (1) Create a field to store the weather display TextView
    private TextView mWeatherDataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // DONE (2) Use findViewById to get a reference to the weather display TextView
        mWeatherDataTextView = (TextView) findViewById(R.id.tv_weather_data);

        // DONE (3) Create an array of Strings that contain fake weather data
        String[] fakeWeatherData = {"21", "48", "56", "78", "42", "84", "96", "73", "29", "7"};

        // DONE (4) Append each String from the fake weather data array to the TextView
        for (String weather: fakeWeatherData) {
            mWeatherDataTextView.append(weather + "\n\n\n");
        }
    }
}