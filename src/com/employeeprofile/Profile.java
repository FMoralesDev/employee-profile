package com.employeeprofile;

public class Profile {
    String nome, cargo;
    int id, cpf, horaTrabalhada;
    double salario;

    public Profile(String nome, String cargo, int id, int cpf, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.id = id;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("ID: " + this.id);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario);
    }

    public void AddHorasTrabalhadas(int horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public double salario(double salario){
        return salario * horaTrabalhada;
    }
}
