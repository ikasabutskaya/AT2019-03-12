package by.it.udalyou.at08;


import by.it.udalyou.Calk.CalkException;

public interface Operation {
    Var add(Var other) throws CalkException;

    Var sub(Var other) throws CalkException;

    Var mul(Var other) throws CalkException;

    Var div(Var other) throws CalkException;
}

