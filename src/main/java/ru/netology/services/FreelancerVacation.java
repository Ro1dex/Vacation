package ru.netology.services;


public class FreelancerVacation {

    public int vacation(int income, int expense, int threshold ) {

        int money = 0; // изначально у фрилансера нет денег
        int vacations = 0; // количество месяцев отдыха

        for (int i = 1; i <= 12; i++) { // проходим по каждому месяцу в году
            if (money >= threshold) { // если на счету достаточно денег для отдыха
                vacations++; // добавляем месяц отдыха
                money -= expense; // вычитаем ежемесячные расходы
                money /= 3; // вычитаем расходы на отдых и получаем остаток для следующего месяца
            } else { // иначе работаем
                money += income; // добавляем доход от работы
                money -= expense; // вычитаем ежемесячные расходы
            }
        }
        return vacations;// возвращаем количество месяцев отдыха
    }
}
