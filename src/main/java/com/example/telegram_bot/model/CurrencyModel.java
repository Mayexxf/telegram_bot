package com.example.telegram_bot.model;

import lombok.Data;

@Data
public class CurrencyModel {
    Integer cur_ID;
    Data data;
    String cur_Addreviation;
    Integer cur_Scale;
    String cur_Name;
    Double cur_OfficialRate;
}
