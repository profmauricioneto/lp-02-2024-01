package org.example.lista02questao17;

/**
 * Crie uma classe em Java chamada Data que inclui trˆes informa¸c˜oes como vari´aveis de instˆancia – mˆes
 * (int), dia (int) e ano (int). A classe deve ter m´etodos get e set para cada vari´avel e um construtor que inicializa as
 * vari´aveis e assume que os valores fornecidos s˜ao corretos. Forne¸ca um m´etodo displayData que exibe o dia, o mˆes
 * e o ano separados por barras normais ( / ). Escreva um aplicativo de teste chamado DataTeste que demonstra as
 * capacidades da classe Data.
 * */

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String displayData() {
        StringBuilder st = new StringBuilder();
        st.append(dia).append("/").append(mes).append("/").append(ano);
        return st.toString();
    }

}
