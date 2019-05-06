package by.it.udalyou.at07;


import by.it.udalyou.Calk.CalkException;

interface Operation {
        Var add(Var other) throws CalkException;

        Var sub(Var other) throws CalkException ;

        Var mul(Var other) throws CalkException;

        Var div(Var other) throws CalkException;
    }

