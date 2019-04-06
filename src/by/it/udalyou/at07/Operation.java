package by.it.udalyou.at07;


import by.it.tsyhanova.calc.CalcException;
import by.it.udalyou.Calk.CalkException;

interface Operation {
        Var add(Var other) throws CalcException, by.it.akhmelev.calc.CalcException, CalkException;

        Var sub(Var other) throws CalcException, CalkException;

        Var mul(Var other) throws CalkException;

        Var div(Var other) throws CalkException;
    }

