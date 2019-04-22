package by.it.medvedeva.at13_calc;

interface Operation {
    Var add(Var other);
    Var sub(Var other);
    Var mul(Var other);
    Var div(Var other);
}
 // надо сделать в идеале без инстансоф