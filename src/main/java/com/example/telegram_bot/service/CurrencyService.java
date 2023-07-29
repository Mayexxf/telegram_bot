package com.example.telegram_bot.service;

import com.example.telegram_bot.model.CurrencyModel;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class CurrencyService {

    public static String getCurrencyRate(String message, CurrencyModel model) throws IOException{
        URL url = new URL("https://www.nbrb.by/api/exrates/rates/" + message + "?parammode=2");
        Scanner scanner = new Scanner((InputStream) url.getContent());
        StringBuilder result = new StringBuilder();
        while (scanner.hasNext()) {
            result.append(scanner.nextLine());
        }
        JSONObject object = new JSONObject(result);

    }
}
