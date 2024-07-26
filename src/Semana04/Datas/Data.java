package Semana04.Datas;

public class Data {
    final int[] MESES_31DIAS = {1, 3, 5, 7, 8, 10, 12};

    final String[] MESES_TEXTO = { "",
        "Janeiro",
        "Fevereiro",
        "Março",
        "Abril",
        "Maio",
        "Junho",
        "Julho",
        "Agosto",
        "Setembro",
        "Outubro",
        "Novembro",
        "Dezembro"};

    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano) {
        if (ano < 1 || ano > 2999) {
            throw new IllegalArgumentException("Ano inválido");
        }

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido");
        }

        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido");
        }

        if (dia == 31) {
            boolean x = false;
            for (var i : MESES_31DIAS) {
                if (i == mes) {
                    x = true;
                }
            }
            if (x == false) {
                throw new IllegalArgumentException(String.format("Mês %d não tem 31 dias", mes));
            }
        }

        if (dia == 30 && mes == 2) {
            throw new IllegalArgumentException("Mês 2 não tem 30 dias");
        }

        if (dia == 29 && mes == 2) {
            if (ano%4 != 0) {
                throw new IllegalArgumentException("Ano não bissexto");   
            }
            else if (ano%100 == 0 && ano%400 != 0) {
                throw new IllegalArgumentException("Ano não bissexto");
            }
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    boolean anoBissexto(int ano) {
        if (ano%4 != 0) {
            return false;
        }

        else if (ano%100 == 0 && ano%400 != 0) {
            return false;
        }

        return true;
    }

    boolean anterior(Data data) {
        if (this.ano < data.ano) {
            return true;
        }

        if (this.ano == data.ano && this.mes < data.mes) {
            return true;
        }

        return this.ano == data.ano && this.mes == data.mes && this.dia < data.dia;
    }

    boolean posterior(Data data) {
        if (this.ano > data.ano) {
            return true;
        }

        if (this.ano == data.ano && this.mes > data.mes) {
            return true;
        }
        
        return this.ano == data.ano && this.mes == data.mes && this.dia > data.dia;
    }

    String converteParaTexto() {
        return String.format("%d de %s de %d", this.dia, MESES_TEXTO[this.mes], this.ano);
    }
}
